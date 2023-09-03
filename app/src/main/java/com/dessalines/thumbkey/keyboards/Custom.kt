package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardMode
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.json.Json

fun generateKeyboard(kbd: String): Map<KeyboardMode, KeyboardC> = Json.decodeFromString(MapSerializer(KeyboardMode.serializer(), KeyboardC.serializer()), kbd)
