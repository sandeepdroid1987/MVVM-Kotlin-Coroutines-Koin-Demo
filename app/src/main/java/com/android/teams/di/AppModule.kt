package com.android.teams.di.module

import com.android.teams.presentation.TeamsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val AppModule = module {

    viewModel { TeamsViewModel(get()) }

    single { createGetTeamsUseCase(get()) }

    single { createTeamRepository(get()) }
}