package com.assignment.meow.base;

/**
 * A generic class that holds a value with its loading response status.
 * @param <T>
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0003\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0003\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/assignment/meow/base/ApiResult;", "T", "", "()V", "toString", "", "Error", "Loading", "Success", "Lcom/assignment/meow/base/ApiResult$Error;", "Lcom/assignment/meow/base/ApiResult$Loading;", "Lcom/assignment/meow/base/ApiResult$Success;", "app_debug"})
public abstract class ApiResult<T extends java.lang.Object> {
    
    private ApiResult() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001d\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\bJ\r\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/assignment/meow/base/ApiResult$Error;", "T", "", "Lcom/assignment/meow/base/ApiResult;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "data", "(Ljava/lang/Exception;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getException", "()Ljava/lang/Exception;", "component1", "component2", "copy", "(Ljava/lang/Exception;Ljava/lang/Object;)Lcom/assignment/meow/base/ApiResult$Error;", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Error<T extends java.lang.Object> extends com.assignment.meow.base.ApiResult<T> {
        @org.jetbrains.annotations.NotNull
        private final java.lang.Exception exception = null;
        @org.jetbrains.annotations.Nullable
        private final T data = null;
        
        public Error(@org.jetbrains.annotations.NotNull
        java.lang.Exception exception, @org.jetbrains.annotations.Nullable
        T data) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.Exception getException() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final T getData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.Exception component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final T component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assignment.meow.base.ApiResult.Error<T> copy(@org.jetbrains.annotations.NotNull
        java.lang.Exception exception, @org.jetbrains.annotations.Nullable
        T data) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/assignment/meow/base/ApiResult$Loading;", "T", "", "Lcom/assignment/meow/base/ApiResult;", "t", "(Ljava/lang/Object;)V", "getT", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/assignment/meow/base/ApiResult$Loading;", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Loading<T extends java.lang.Object> extends com.assignment.meow.base.ApiResult<T> {
        @org.jetbrains.annotations.Nullable
        private final T t = null;
        
        public Loading(@org.jetbrains.annotations.Nullable
        T t) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final T getT() {
            return null;
        }
        
        public Loading() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assignment.meow.base.ApiResult.Loading<T> copy(@org.jetbrains.annotations.Nullable
        T t) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/assignment/meow/base/ApiResult$Success;", "T", "", "Lcom/assignment/meow/base/ApiResult;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/assignment/meow/base/ApiResult$Success;", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.assignment.meow.base.ApiResult<T> {
        @org.jetbrains.annotations.Nullable
        private final T data = null;
        
        public Success(@org.jetbrains.annotations.Nullable
        T data) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final T getData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assignment.meow.base.ApiResult.Success<T> copy(@org.jetbrains.annotations.Nullable
        T data) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}