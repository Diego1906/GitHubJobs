package com.android.githubjobs.data.dto

import com.squareup.moshi.Json

data class JobsResponse(
    @Json(name = "id") var id: String? = null,
    @Json(name = "type") var type: String? = null,
    @Json(name = "url") var url: String? = null,
    @Json(name = "created_at") var createdAt: String? = null,
    @Json(name = "company") var company: String? = null,
    @Json(name = "company_url") var companyUrl: String? = null,
    @Json(name = "location") var location: String? = null,
    @Json(name = "title") var title: String? = null,
    @Json(name = "description") var description: String? = null,
    @Json(name = "how_to_apply") var howToApply: String? = null,
    @Json(name = "company_logo") var companyLogo: String? = null
)