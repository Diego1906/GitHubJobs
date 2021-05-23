package com.android.githubjobs.util

import android.os.Build
import android.text.Html
import android.text.Spanned

fun String?.checkExistsData(): String {
    return this.takeUnless { it.isNullOrEmpty() } ?: "Data not informed"
}

fun String?.fromHtml(): Spanned {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        Html.fromHtml(this, Html.FROM_HTML_MODE_LEGACY)
    } else {
        Html.fromHtml(this)
    }
}