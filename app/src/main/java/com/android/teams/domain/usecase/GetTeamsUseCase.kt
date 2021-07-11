package com.android.teams.domain.usecase

import com.android.teams.domain.model.Team
import com.android.teams.domain.repository.TeamsRepository
import com.android.teams.domain.usecase.base.UseCase

class GetTeamsUseCase constructor(
    private val teamsRepository: TeamsRepository
) : UseCase<List<Team>, Any?>() {

    override suspend fun run(params: Any?): List<Team> {
        return teamsRepository.getTeams()
    }

}