package com.android.teams.presentation

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.teams.domain.model.ApiError
import com.android.teams.domain.model.Team
import com.android.teams.domain.usecase.GetTeamsUseCase
import com.android.teams.domain.usecase.base.UseCaseResponse
import kotlinx.coroutines.cancel


class TeamsViewModel constructor(private val getTeamsUseCase: GetTeamsUseCase) : ViewModel() {

    val teamsData = MutableLiveData<List<Team>>()
    val showProgressbar = MutableLiveData<Boolean>()
    val messageData = MutableLiveData<String>()

    fun getTeams() {
        showProgressbar.value = true
        getTeamsUseCase.invoke(viewModelScope, null, object : UseCaseResponse<List<Team>> {
                override fun onSuccess(result: List<Team>) {
                    Log.i(TAG, "result: $result")
                    teamsData.value = result
                    showProgressbar.value = false
                }

                override fun onError(apiError: ApiError?) {
                    messageData.value = apiError?.getErrorMessage()
                    showProgressbar.value = false
                }
            },
        )
    }

    override fun onCleared() {
        viewModelScope.cancel()
        super.onCleared()
    }

    companion object {
        private val TAG = TeamsViewModel::class.java.name
    }

}