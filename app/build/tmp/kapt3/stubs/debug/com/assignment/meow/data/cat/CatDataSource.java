package com.assignment.meow.data.cat;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/assignment/meow/data/cat/CatDataSource;", "", "meowService", "Lcom/assignment/meow/api/MeowService;", "(Lcom/assignment/meow/api/MeowService;)V", "getBreedList", "Lcom/assignment/meow/data/cat/response/BreedListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCatList", "Lcom/assignment/meow/data/cat/response/CatListResponse;", "limit", "", "page", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCatListByBreed", "breedId", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CatDataSource {
    @org.jetbrains.annotations.NotNull
    private final com.assignment.meow.api.MeowService meowService = null;
    
    @javax.inject.Inject
    public CatDataSource(@org.jetbrains.annotations.NotNull
    com.assignment.meow.api.MeowService meowService) {
        super();
    }
    
    /**
     * suspend function to get cat list
     * @param limit
     * @param page
     * @return CatListResponse
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCatList(int limit, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.assignment.meow.data.cat.response.CatListResponse> $completion) {
        return null;
    }
    
    /**
     * suspend function to get cat list by breed
     * @param breedId
     * @param limit
     * @return CatListResponse
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCatListByBreed(@org.jetbrains.annotations.NotNull
    java.lang.String breedId, int limit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.assignment.meow.data.cat.response.CatListResponse> $completion) {
        return null;
    }
    
    /**
     * suspend function to get breed list
     * @return breed list response
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getBreedList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.assignment.meow.data.cat.response.BreedListResponse> $completion) {
        return null;
    }
}