package com.assignment.meow.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/assignment/meow/di/NetworkModule;", "", "()V", "provideConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "provideHttpClient", "Lokhttp3/OkHttpClient;", "provideMeowService", "Lcom/assignment/meow/api/MeowService;", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofit", "okHttpClient", "gsonConverterFactory", "Companion", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MEOW = "meow";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String BASE_URL = "https://api.thecatapi.com/";
    @org.jetbrains.annotations.NotNull
    public static final com.assignment.meow.di.NetworkModule.Companion Companion = null;
    
    public NetworkModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideHttpClient() {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final retrofit2.converter.gson.GsonConverterFactory provideConverterFactory() {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @javax.inject.Named(value = "meow")
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull
    retrofit2.converter.gson.GsonConverterFactory gsonConverterFactory) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.assignment.meow.api.MeowService provideMeowService(@javax.inject.Named(value = "meow")
    @org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/assignment/meow/di/NetworkModule$Companion;", "", "()V", "BASE_URL", "", "MEOW", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}