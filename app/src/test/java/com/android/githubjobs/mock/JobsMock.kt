package com.android.githubjobs.mock

import com.android.githubjobs.domain.entities.Jobs

class JobsMock {

    companion object {

        fun create() = listOf(
            Jobs(
                id = "32bf67e5-4971-47ce-985c-44b6b3860cdb",
                type = "Full Time",
                url = "https://jobs.github.com/positions/32bf67e5-4971-47ce-985c-44b6b3860cdb",
                createdAt = "Wed May 19 00:49:17 UTC 2021",
                company = "SweetRush",
                companyUrl = "https://www.sweetrush.com/",
                location = "Remote",
                title = "Senior Creative Front End Web Developer",
                description = "SweetRush has an exciting opportunity for an experienced creative front-end developer (full stack is also acceptable)",
                howToApply = "If this describes your interests and experience, please submit your current resume and salary requirements through the following",
                companyLogoUrl = "https://jobs.github.com/rails/active_storage/blobs/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBBaUtqIiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn19--82886ff47e94ff4c0255b95773a9667644768b2b/SR%20Logo.png"
            )
        )
    }
}