package com.android.githubjobs.data.mapper

import com.android.githubjobs.data.dto.JobsResponse
import com.android.githubjobs.domain.model.Jobs
import com.android.githubjobs.util.checkExistsData

fun JobsResponse.mapToDomain() = Jobs(
    id = this.id.checkExistsData(),
    type = this.type.checkExistsData(),
    url = this.url.checkExistsData(),
    createdAt = this.createdAt.checkExistsData(),
    company = this.company.checkExistsData(),
    companyUrl = this.companyUrl.checkExistsData(),
    location = this.location.checkExistsData(),
    title = this.title.checkExistsData(),
    description = this.description.checkExistsData(),
    howToApply = this.howToApply.checkExistsData(),
    companyLogoUrl = this.companyLogoUrl.checkExistsData()
)