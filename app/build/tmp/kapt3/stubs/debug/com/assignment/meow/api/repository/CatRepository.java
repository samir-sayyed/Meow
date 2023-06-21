package com.assignment.meow.api.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/assignment/meow/api/repository/CatRepository;", "", "catDataSource", "Lcom/assignment/meow/data/cat/CatDataSource;", "(Lcom/assignment/meow/data/cat/CatDataSource;)V", "getBreedList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/assignment/meow/base/ApiResult;", "Lcom/assignment/meow/data/cat/response/BreedListResponse;", "getCatPagedData", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/assignment/meow/data/cat/response/CatListResponse$CatListResponseItem;", "breedId", "", "app_debug"})
public final class CatRepository {
    @org.jetbrains.annotations.NotNull
    private final com.assignment.meow.data.cat.CatDataSource catDataSource = null;
    
    @javax.inject.Inject
    public CatRepository(@org.jetbrains.annotations.NotNull
    com.assignment.meow.data.cat.CatDataSource catDataSource) {
        super();
    }
    
    /**
     * suspend function to get cat list
     * @return live paging data of cats
     */
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.assignment.meow.data.cat.response.CatListResponse.CatListResponseItem>> getCatPagedData(@org.jetbrains.annotations.Nullable
    java.lang.String breedId) {
        return null;
    }
    
    /**
     * suspend function to get breed list
     * @return breed list response
     */
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.assignment.meow.base.ApiResult<com.assignment.meow.data.cat.response.BreedListResponse>> getBreedList() {
        return null;
    }
}