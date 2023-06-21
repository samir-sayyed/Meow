package com.assignment.meow.ui;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/assignment/meow/ui/CatFragment;", "Lcom/assignment/meow/ui/bottomsheet/FilterBottomSheetFragment$ShowBreedListInterface;", "Lcom/assignment/meow/base/BaseFragment;", "Lcom/assignment/meow/databinding/FragmentCatBinding;", "Lcom/assignment/meow/ui/CatViewModel;", "()V", "layoutId", "", "getLayoutId", "()I", "mBreedList", "Lcom/assignment/meow/data/cat/response/BreedListResponse;", "mCatAdapter", "Lcom/assignment/meow/ui/adapters/CatPagingAdapter;", "mCatsShimmer", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "mFilterBottomSheetDialogFragment", "Lcom/assignment/meow/ui/bottomsheet/FilterBottomSheetFragment;", "callApi", "", "breed", "", "initApiCalls", "initListeners", "observeData", "onBreedSelected", "onDestroyView", "setUpViews", "viewModelClass", "Ljava/lang/Class;", "Companion", "app_release"})
public final class CatFragment extends com.assignment.meow.base.BaseFragment<com.assignment.meow.databinding.FragmentCatBinding, com.assignment.meow.ui.CatViewModel> implements com.assignment.meow.ui.bottomsheet.FilterBottomSheetFragment.ShowBreedListInterface {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "CatFragment";
    @org.jetbrains.annotations.Nullable
    private com.assignment.meow.ui.bottomsheet.FilterBottomSheetFragment mFilterBottomSheetDialogFragment;
    @org.jetbrains.annotations.Nullable
    private com.assignment.meow.ui.adapters.CatPagingAdapter mCatAdapter;
    @org.jetbrains.annotations.Nullable
    private com.facebook.shimmer.ShimmerFrameLayout mCatsShimmer;
    @org.jetbrains.annotations.Nullable
    private com.assignment.meow.data.cat.response.BreedListResponse mBreedList;
    private final int layoutId = 0;
    @org.jetbrains.annotations.NotNull
    public static final com.assignment.meow.ui.CatFragment.Companion Companion = null;
    
    public CatFragment() {
        super();
    }
    
    @java.lang.Override
    public void setUpViews() {
    }
    
    @java.lang.Override
    public void observeData() {
    }
    
    private final void initListeners() {
    }
    
    @java.lang.Override
    public void initApiCalls() {
    }
    
    @java.lang.Override
    public void onBreedSelected(@org.jetbrains.annotations.NotNull
    java.lang.String breed) {
    }
    
    private final void callApi(java.lang.String breed) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected java.lang.Class<com.assignment.meow.ui.CatViewModel> viewModelClass() {
        return null;
    }
    
    @java.lang.Override
    protected int getLayoutId() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/assignment/meow/ui/CatFragment$Companion;", "", "()V", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}