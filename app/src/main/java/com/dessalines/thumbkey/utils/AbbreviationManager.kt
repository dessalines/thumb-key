package com.dessalines.thumbkey.utils

import android.content.Context
import android.util.Log
import com.dessalines.thumbkey.db.AbbreviationDao
import com.dessalines.thumbkey.db.AppDB

private const val ABBR_TAG = "AbbreviationManager"

class AbbreviationManager(private val context: Context) {
    init {
        Log.d(ABBR_TAG, "Initializing AbbreviationManager")
    }

    private val abbreviationDao: AbbreviationDao = run {
        Log.d(ABBR_TAG, "Creating AbbreviationDao")
        AppDB.getDatabase(context).abbreviationDao().also {
            Log.d(ABBR_TAG, "AbbreviationDao created successfully")
        }
    }

    @Synchronized
    fun checkAndExpand(text: String): Pair<Boolean, String> {
        Log.d(ABBR_TAG, "checkAndExpand: input text = '$text'")
        if (text.isEmpty()) {
            Log.d(ABBR_TAG, "checkAndExpand: text is empty")
            return Pair(false, text)
        }

        // Get the last word from the text, handling both spaces and newlines
        val words = text.split(Regex("[ \n]"))
        if (words.isEmpty()) {
            Log.d(ABBR_TAG, "checkAndExpand: no words found")
            return Pair(false, text)
        }
        
        val lastWord = words.last()
        Log.d(ABBR_TAG, "checkAndExpand: lastWord = '$lastWord'")
        if (lastWord.isEmpty()) {
            Log.d(ABBR_TAG, "checkAndExpand: lastWord is empty")
            return Pair(false, text)
        }

        // Check if the last word is an abbreviation (case-insensitive)
        val abbreviation = abbreviationDao.getAbbreviation(lastWord.lowercase())
        Log.d(ABBR_TAG, "checkAndExpand: found abbreviation = ${abbreviation?.expansion}")
        if (abbreviation != null) {
            // Return just the expansion
            Log.d(ABBR_TAG, "checkAndExpand: expanding to '${abbreviation.expansion}'")
            return Pair(true, abbreviation.expansion)
        }

        Log.d(ABBR_TAG, "checkAndExpand: no expansion found")
        return Pair(false, text)
    }
}
