package com.android.githubjobs.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Jobs(
    val id: String,
    val type: String,
    val url: String,
    val createdAt: String,
    val company: String,
    val companyUrl: String,
    val location: String,
    val title: String,
    val description: String,
    val howToApply: String,
    val companyLogoUrl: String
) : Parcelable