package com.android.teams.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0012H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/android/teams/presentation/TeamsViewModel;", "Landroidx/lifecycle/ViewModel;", "getTeamsUseCase", "Lcom/android/teams/domain/usecase/GetTeamsUseCase;", "(Lcom/android/teams/domain/usecase/GetTeamsUseCase;)V", "messageData", "Landroidx/lifecycle/MutableLiveData;", "", "getMessageData", "()Landroidx/lifecycle/MutableLiveData;", "showProgressbar", "", "getShowProgressbar", "teamsData", "", "Lcom/android/teams/domain/model/Team;", "getTeamsData", "getTeams", "", "onCleared", "Companion", "app_debug"})
public final class TeamsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.android.teams.domain.model.Team>> teamsData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showProgressbar = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> messageData = null;
    private final com.android.teams.domain.usecase.GetTeamsUseCase getTeamsUseCase = null;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.teams.presentation.TeamsViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.android.teams.domain.model.Team>> getTeamsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowProgressbar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMessageData() {
        return null;
    }
    
    public final void getTeams() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public TeamsViewModel(@org.jetbrains.annotations.NotNull()
    com.android.teams.domain.usecase.GetTeamsUseCase getTeamsUseCase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/android/teams/presentation/TeamsViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}