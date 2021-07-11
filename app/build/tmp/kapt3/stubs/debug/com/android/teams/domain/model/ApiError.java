package com.android.teams.domain.model;

import java.lang.System;

/**
 * Designed to show different types of errors through error status & message
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0019\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J0\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010\u001b\u001a\u00020\u0003J\t\u0010\u001c\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/android/teams/domain/model/ApiError;", "", "message", "", "errorStatus", "Lcom/android/teams/domain/model/ApiError$ErrorStatus;", "(Ljava/lang/String;Lcom/android/teams/domain/model/ApiError$ErrorStatus;)V", "code", "", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/android/teams/domain/model/ApiError$ErrorStatus;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorStatus", "()Lcom/android/teams/domain/model/ApiError$ErrorStatus;", "setErrorStatus", "(Lcom/android/teams/domain/model/ApiError$ErrorStatus;)V", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/android/teams/domain/model/ApiError$ErrorStatus;)Lcom/android/teams/domain/model/ApiError;", "equals", "", "other", "getErrorMessage", "hashCode", "toString", "ErrorStatus", "app_debug"})
public final class ApiError {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer code = null;
    @org.jetbrains.annotations.NotNull()
    private com.android.teams.domain.model.ApiError.ErrorStatus errorStatus;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.teams.domain.model.ApiError.ErrorStatus getErrorStatus() {
        return null;
    }
    
    public final void setErrorStatus(@org.jetbrains.annotations.NotNull()
    com.android.teams.domain.model.ApiError.ErrorStatus p0) {
    }
    
    public ApiError(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer code, @org.jetbrains.annotations.NotNull()
    com.android.teams.domain.model.ApiError.ErrorStatus errorStatus) {
        super();
    }
    
    public ApiError(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.android.teams.domain.model.ApiError.ErrorStatus errorStatus) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.teams.domain.model.ApiError.ErrorStatus component3() {
        return null;
    }
    
    /**
     * Designed to show different types of errors through error status & message
     */
    @org.jetbrains.annotations.NotNull()
    public final com.android.teams.domain.model.ApiError copy(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer code, @org.jetbrains.annotations.NotNull()
    com.android.teams.domain.model.ApiError.ErrorStatus errorStatus) {
        return null;
    }
    
    /**
     * Designed to show different types of errors through error status & message
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Designed to show different types of errors through error status & message
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Designed to show different types of errors through error status & message
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    /**
     * Various error status to know what happened if something goes wrong with a repository call
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/android/teams/domain/model/ApiError$ErrorStatus;", "", "(Ljava/lang/String;I)V", "BAD_REQUEST", "UNAUTHORIZED", "FORBIDDEN", "NOT_FOUND", "METHOD_NOT_ALLOWED", "CONFLICT", "INTERNAL_SERVER_ERROR", "TIMEOUT", "NO_CONNECTION", "UNKNOWN_ERROR", "app_debug"})
    public static enum ErrorStatus {
        /*public static final*/ BAD_REQUEST /* = new BAD_REQUEST() */,
        /*public static final*/ UNAUTHORIZED /* = new UNAUTHORIZED() */,
        /*public static final*/ FORBIDDEN /* = new FORBIDDEN() */,
        /*public static final*/ NOT_FOUND /* = new NOT_FOUND() */,
        /*public static final*/ METHOD_NOT_ALLOWED /* = new METHOD_NOT_ALLOWED() */,
        /*public static final*/ CONFLICT /* = new CONFLICT() */,
        /*public static final*/ INTERNAL_SERVER_ERROR /* = new INTERNAL_SERVER_ERROR() */,
        /*public static final*/ TIMEOUT /* = new TIMEOUT() */,
        /*public static final*/ NO_CONNECTION /* = new NO_CONNECTION() */,
        /*public static final*/ UNKNOWN_ERROR /* = new UNKNOWN_ERROR() */;
        
        ErrorStatus() {
        }
    }
}