package com.android.githubjobs.util

fun String?.checkExistsData(): String {
    return this.takeUnless { it.isNullOrEmpty() } ?: "Data not informed"
}