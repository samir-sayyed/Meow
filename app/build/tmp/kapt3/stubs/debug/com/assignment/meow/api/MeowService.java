package com.assignment.meow.api;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J9\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0003\u0010\f\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\f\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/assignment/meow/api/MeowService;", "", "getBreedList", "Lcom/assignment/meow/data/cat/response/BreedListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCatList", "Lcom/assignment/meow/data/cat/response/CatListResponse;", "limit", "", "order", "", "page", "apiKey", "(ILjava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCatListByBreed", "breedId", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MeowService {
    
    @retrofit2.http.GET(value = "/v1/images/search")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCatList(@retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "order")
    @org.jetbrains.annotations.NotNull
    java.lang.String order, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "api_key")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.assignment.meow.data.cat.response.CatListResponse> $completion);
    
    @retrofit2.http.GET(value = "/v1/images/search")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCatListByBreed(@retrofit2.http.Query(value = "breed_ids")
    @org.jetbrains.annotations.NotNull
    java.lang.String breedId, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "api_key")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.assignment.meow.data.cat.response.CatListResponse> $completion);
    
    @retrofit2.http.GET(value = "v1/breeds")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getBreedList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.assignment.meow.data.cat.response.BreedListResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}