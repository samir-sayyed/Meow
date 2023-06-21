package com.assignment.meow.ui.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/assignment/meow/ui/adapters/BreedsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/assignment/meow/ui/adapters/BreedsAdapter$BreedViewHolder;", "breedList", "Lcom/assignment/meow/data/cat/response/BreedListResponse;", "onItemClick", "Lkotlin/Function1;", "Lcom/assignment/meow/data/cat/response/BreedListResponse$BreedListResponseItem;", "", "(Lcom/assignment/meow/data/cat/response/BreedListResponse;Lkotlin/jvm/functions/Function1;)V", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BreedViewHolder", "app_debug"})
public final class BreedsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.assignment.meow.ui.adapters.BreedsAdapter.BreedViewHolder> {
    @org.jetbrains.annotations.Nullable
    private final com.assignment.meow.data.cat.response.BreedListResponse breedList = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.assignment.meow.data.cat.response.BreedListResponse.BreedListResponseItem, kotlin.Unit> onItemClick = null;
    
    public BreedsAdapter(@org.jetbrains.annotations.Nullable
    com.assignment.meow.data.cat.response.BreedListResponse breedList, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.assignment.meow.data.cat.response.BreedListResponse.BreedListResponseItem, kotlin.Unit> onItemClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<com.assignment.meow.data.cat.response.BreedListResponse.BreedListResponseItem, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.assignment.meow.ui.adapters.BreedsAdapter.BreedViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.assignment.meow.ui.adapters.BreedsAdapter.BreedViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/assignment/meow/ui/adapters/BreedsAdapter$BreedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/assignment/meow/databinding/BreedItemBinding;", "(Lcom/assignment/meow/databinding/BreedItemBinding;)V", "getView", "()Lcom/assignment/meow/databinding/BreedItemBinding;", "app_debug"})
    public static final class BreedViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.assignment.meow.databinding.BreedItemBinding view = null;
        
        public BreedViewHolder(@org.jetbrains.annotations.NotNull
        com.assignment.meow.databinding.BreedItemBinding view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assignment.meow.databinding.BreedItemBinding getView() {
            return null;
        }
    }
}