package com.android.teams.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/android/teams/domain/usecase/GetTeamsUseCase;", "Lcom/android/teams/domain/usecase/base/UseCase;", "", "Lcom/android/teams/domain/model/Team;", "", "teamsRepository", "Lcom/android/teams/domain/repository/TeamsRepository;", "(Lcom/android/teams/domain/repository/TeamsRepository;)V", "run", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetTeamsUseCase extends com.android.teams.domain.usecase.base.UseCase<java.util.List<? extends com.android.teams.domain.model.Team>, java.lang.Object> {
    private final com.android.teams.domain.repository.TeamsRepository teamsRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object run(@org.jetbrains.annotations.Nullable()
    java.lang.Object params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.android.teams.domain.model.Team>> p1) {
        return null;
    }
    
    public GetTeamsUseCase(@org.jetbrains.annotations.NotNull()
    com.android.teams.domain.repository.TeamsRepository teamsRepository) {
        super();
    }
}