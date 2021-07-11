package com.android.teams.domain.repository

import com.android.teams.domain.model.Team

interface TeamsRepository {

    suspend fun getTeams(): List<Team>
}