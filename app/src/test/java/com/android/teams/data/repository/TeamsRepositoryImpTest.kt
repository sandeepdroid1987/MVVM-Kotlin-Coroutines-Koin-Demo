package com.android.teams.data.repository

import com.android.teams.data.source.remote.ApiService
import com.android.teams.domain.model.Team
import com.android.teams.domain.repository.TeamsRepository
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.runBlocking
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Before
import org.junit.Test


class TeamsRepositoryImpTest {

    @MockK
    lateinit var apiService: ApiService
    lateinit var teamsRepository: TeamsRepository

    @Before
    fun setUp() {
        MockKAnnotations.init(this) //for initialization
        teamsRepository = TeamsRepositoryImp(apiService)
    }

    @Test
    fun testTeamsApiSuccess() = runBlocking {
        val mockTeam = mutableListOf<Team>(
            Team(true, "Team1", "Country1"),
            Team(true, "Team2", "Country2"),
            Team(true, "Team3", "Country3"))
        every { runBlocking { apiService.getTeams() } } returns (mockTeam)

        val result = teamsRepository.getTeams()
        MatcherAssert.assertThat(
            "Received result [$result] size & mocked [$mockTeam] size must be match with each other!",
            result.size,
            CoreMatchers.equalTo(mockTeam.size)
        )
    }

}