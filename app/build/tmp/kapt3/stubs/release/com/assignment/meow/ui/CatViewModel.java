package com.assignment.meow.ui;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/assignment/meow/ui/CatViewModel;", "Lcom/assignment/meow/base/BaseViewModel;", "catRepository", "Lcom/assignment/meow/api/repository/CatRepository;", "(Lcom/assignment/meow/api/repository/CatRepository;)V", "_breedList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/assignment/meow/data/cat/response/BreedListResponse;", "breedList", "Landroidx/lifecycle/LiveData;", "getBreedList", "()Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/Job;", "context", "Landroid/content/Context;", "getCatList", "Landroidx/paging/PagingData;", "Lcom/assignment/meow/data/cat/response/CatListResponse$CatListResponseItem;", "breedId", "", "Companion", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class CatViewModel extends com.assignment.meow.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.assignment.meow.api.repository.CatRepository catRepository = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "CatViewModel";
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.assignment.meow.data.cat.response.BreedListResponse> _breedList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.assignment.meow.data.cat.response.BreedListResponse> breedList = null;
    @org.jetbrains.annotations.NotNull
    public static final com.assignment.meow.ui.CatViewModel.Companion Companion = null;
    
    @javax.inject.Inject
    public CatViewModel(@org.jetbrains.annotations.NotNull
    com.assignment.meow.api.repository.CatRepository catRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.assignment.meow.data.cat.response.BreedListResponse> getBreedList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.assignment.meow.data.cat.response.CatListResponse.CatListResponseItem>> getCatList(@org.jetbrains.annotations.Nullable
    java.lang.String breedId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getBreedList(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/assignment/meow/ui/CatViewModel$Companion;", "", "()V", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}