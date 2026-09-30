package com.dessalines.thumbkey;

import android.inputmethodservice.InputMethodService;
import android.view.inputmethod.InputConnection;

/**
 * An input method whose keys can type into a text field of its own, such as the search field
 * of sketch mode, instead of the app's. While a redirect is set, getCurrentInputConnection()
 * returns it, so every key action goes there without knowing.
 *
 * <p>This is Java because the framework's connection can be null: a Kotlin override would have
 * to declare it nullable, or check it and throw.
 */
public abstract class RedirectableInputMethodService extends InputMethodService {
    private InputConnection inputRedirect = null;

    public void setInputRedirect(InputConnection connection) {
        inputRedirect = connection;
    }

    @Override
    public InputConnection getCurrentInputConnection() {
        if (inputRedirect != null) return inputRedirect;
        return super.getCurrentInputConnection();
    }

    /** The app's text field, even while the keys type into the keyboard's own field. */
    public InputConnection getAppInputConnection() {
        return super.getCurrentInputConnection();
    }
}
