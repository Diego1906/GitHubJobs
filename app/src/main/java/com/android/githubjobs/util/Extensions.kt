package com.android.githubjobs.util

fun String?.checkData(): String {
    return this.takeUnless { it.isNullOrEmpty() } ?: "Data not informed"
}