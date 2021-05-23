package com.android.githubjobs.data.mappers

import android.os.Build
import androidx.annotation.RequiresApi
import com.android.githubjobs.data.models.JobsResponse
import com.android.githubjobs.domain.entities.Jobs
import com.android.githubjobs.util.checkExistsData
import com.android.githubjobs.util.fromHtml

@RequiresApi(Build.VERSION_CODES.N)
fun JobsResponse.mapToDomain() = Jobs(
    id = this.id.checkExistsData(),
    type = this.type.checkExistsData(),
    url = this.url.checkExistsData(),
    createdAt = this.createdAt.checkExistsData(),
    company = this.company.checkExistsData(),
    companyUrl = this.companyUrl.checkExistsData(),
    location = this.location.checkExistsData(),
    title = this.title.checkExistsData(),
    description = this.description.fromHtml(),
    howToApply = this.howToApply.checkExistsData(),
    companyLogoUrl = this.companyLogoUrl.checkExistsData()
)