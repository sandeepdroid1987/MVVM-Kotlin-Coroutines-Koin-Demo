package com.android.teams.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0006\u0010\n\u001a\u00020\u000b\u001a\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r\u001a\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0012\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"NetworkModule", "Lorg/koin/core/module/Module;", "getNetworkModule", "()Lorg/koin/core/module/Module;", "TIME_OUT", "", "createGetTeamsUseCase", "Lcom/android/teams/domain/usecase/GetTeamsUseCase;", "teamsRepository", "Lcom/android/teams/domain/repository/TeamsRepository;", "createOkHttpClient", "Lokhttp3/OkHttpClient;", "createRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "url", "", "createService", "Lcom/android/teams/data/source/remote/ApiService;", "retrofit", "createTeamRepository", "apiService", "app_debug"})
public final class NetworkModuleKt {
    private static final long TIME_OUT = 30L;
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module NetworkModule = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getNetworkModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.OkHttpClient createOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final retrofit2.Retrofit createRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.android.teams.data.source.remote.ApiService createService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.android.teams.domain.repository.TeamsRepository createTeamRepository(@org.jetbrains.annotations.NotNull()
    com.android.teams.data.source.remote.ApiService apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.android.teams.domain.usecase.GetTeamsUseCase createGetTeamsUseCase(@org.jetbrains.annotations.NotNull()
    com.android.teams.domain.repository.TeamsRepository teamsRepository) {
        return null;
    }
}