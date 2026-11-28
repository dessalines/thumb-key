package com.dessalines.thumbkey

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.GradientDrawable
import android.inputmethodservice.ExtractEditText
import android.os.Build
import android.util.TypedValue
import android.view.Gravity
import android.view.inputmethod.ExtractedText
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.toArgb
import com.dessalines.thumbkey.ui.theme.Typography
import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.sqrt

/**
 * The copy of the app's text field that the keyboard shows above itself in fullscreen mode, on a
 * watch. The framework finds the parts by their ids, then fills in the text and keeps it in
 * sync.
 *
 * Nothing here may set the input type, single line mode or transformation of the text: the
 * framework sets the input type from the app's text field, which is what hides passwords.
 */
@SuppressLint("ViewConstructor")
class ExtractTextView(
    context: Context,
) : LinearLayout(context) {
    private val round = resources.configuration.isScreenRound
    private val inset = dp(8)

    private val editText =
        ExtractEditText(context).apply {
            id = android.R.id.inputExtractEditText
            background = null
            setPadding(0, 0, 0, 0)
            // Keep the end of the text next to the keys
            gravity = Gravity.BOTTOM or if (round) Gravity.CENTER_HORIZONTAL else Gravity.START
            setTextSize(TypedValue.COMPLEX_UNIT_SP, Typography.bodyLarge.fontSize.value)
        }

    // The action button, in its frame. A round screen has no width to spare for it, and the
    // keyboard has its own return key. Before Android 13 the framework finds them by internal
    // ids, so the button would stay empty.
    private val accessories =
        if (round || Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) {
            null
        } else {
            val button =
                ImageButton(context).apply {
                    id = android.R.id.inputExtractAction
                    val ripple = TypedValue()
                    if (context.theme.resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, ripple, true)) {
                        setBackgroundResource(ripple.resourceId)
                    } else {
                        background = null
                    }
                    setPadding(inset, inset, inset, inset)
                }
            FrameLayout(context).apply {
                id = android.R.id.inputExtractAccessories
                addView(
                    button,
                    FrameLayout.LayoutParams(
                        FrameLayout.LayoutParams.WRAP_CONTENT,
                        FrameLayout.LayoutParams.WRAP_CONTENT,
                        Gravity.BOTTOM,
                    ),
                )
            }
        }
    private val actionButton = accessories?.getChildAt(0) as ImageButton?

    private val location = IntArray(2)

    init {
        orientation = HORIZONTAL
        addView(editText, LayoutParams(0, LayoutParams.MATCH_PARENT, 1f))
        accessories?.let { addView(it, LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT)) }
        setPadding(inset, 0, inset, inset)
    }

    fun applyTheme(colors: ColorScheme) {
        // The colors of the keys, so the text reads as part of the keyboard
        setBackgroundColor(colors.surface.toArgb())
        editText.setTextColor(colors.onSurface.toArgb())
        editText.setHintTextColor(colors.onSurfaceVariant.toArgb())
        editText.highlightColor = colors.primary.copy(alpha = 0.4f).toArgb()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            editText.textCursorDrawable =
                GradientDrawable().apply {
                    setColor(colors.primary.toArgb())
                    setSize(dp(2), 0)
                }
        }
        actionButton?.imageTintList = ColorStateList.valueOf(colors.onSurface.toArgb())
    }

    // Shows text read from the app's text field. ExtractEditText doesn't send it back to the app.
    fun setExtractedText(text: ExtractedText) = editText.setExtractedText(text)

    override fun onMeasure(
        widthMeasureSpec: Int,
        heightMeasureSpec: Int,
    ) {
        if (round) {
            // Inset the sides to where the screen's edge crosses the middle of the bottom line of
            // text, the one next to the keys. Its top edge, where the screen is narrower, would
            // leave no room at all when the line only just fits above the keys. Lines above it,
            // in a multi-line field, may still reach the edge.
            // A round screen's height can be cut off at the bottom, so its width is the diameter.
            val radius = resources.displayMetrics.widthPixels / 2f
            getLocationOnScreen(location)
            val top = location[1]
            val lineMiddle = top + MeasureSpec.getSize(heightMeasureSpec) - paddingBottom - editText.lineHeight / 2f
            val fromCenter = abs(radius - lineMiddle).coerceAtMost(radius)
            val side = ceil(radius - sqrt(radius * radius - fromCenter * fromCenter)).toInt() + inset
            if (side != paddingLeft) {
                setPadding(side, 0, side, inset)
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    private fun dp(value: Int) = (value * resources.displayMetrics.density).toInt()
}
