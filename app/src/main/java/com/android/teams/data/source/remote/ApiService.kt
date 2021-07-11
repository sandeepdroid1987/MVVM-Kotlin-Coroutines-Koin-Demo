package com.android.teams.data.source.remote

import com.android.teams.domain.model.Team
import retrofit2.http.GET

interface ApiService {

    @GET("/forza-assignment/android/teams.json")
    suspend fun getTeams(): List<Team>
}