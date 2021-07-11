package com.android.teams.domain.usecase.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0006\b\u0001\u0010\u0003 \u00002\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00018\u00012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u001d\u0010\r\u001a\u00028\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0001H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/android/teams/domain/usecase/base/UseCase;", "Type", "", "Params", "()V", "invoke", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "params", "onResult", "Lcom/android/teams/domain/usecase/base/UseCaseResponse;", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;Lcom/android/teams/domain/usecase/base/UseCaseResponse;)V", "run", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class UseCase<Type extends java.lang.Object, Params extends java.lang.Object> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object run(@org.jetbrains.annotations.Nullable()
    Params params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super Type> p1);
    
    public final void invoke(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.Nullable()
    Params params, @org.jetbrains.annotations.Nullable()
    com.android.teams.domain.usecase.base.UseCaseResponse<Type> onResult) {
    }
    
    public UseCase() {
        super();
    }
}