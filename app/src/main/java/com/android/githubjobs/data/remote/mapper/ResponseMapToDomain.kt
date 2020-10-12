package com.android.githubjobs.data.remote.mapper

import com.android.githubjobs.data.remote.dto.JobsResponse
import com.android.githubjobs.domain.models.Jobs
import com.android.githubjobs.util.checkData

fun JobsResponse.mapToDomain() = Jobs(
    id = this.id.checkData(),
    type = this.type.checkData(),
    url = this.url.checkData(),
    createdAt = this.createdAt.checkData(),
    company = this.company.checkData(),
    companyUrl = this.companyUrl.checkData(),
    location = this.location.checkData(),
    title = this.title.checkData(),
    description = this.description.checkData(),
    howToApply = this.howToApply.checkData(),
    companyLogo = this.companyLogo.checkData()
)