package com.android.teams.domain.model

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class Team(
    var national: Boolean,
    var name: String,
    var country_name: String
)