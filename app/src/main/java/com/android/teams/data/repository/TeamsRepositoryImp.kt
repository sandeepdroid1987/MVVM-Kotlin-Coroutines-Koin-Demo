package com.android.teams.data.repository

import com.android.teams.domain.model.Team
import com.android.teams.data.source.remote.ApiService
import com.android.teams.domain.repository.TeamsRepository

class TeamsRepositoryImp(private val apiService: ApiService) : TeamsRepository {

    override suspend fun getTeams(): List<Team> {
        return apiService.getTeams()
    }
}