package com.assignment.meow.ui.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/assignment/meow/ui/adapters/CatPagingAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/assignment/meow/data/cat/response/CatListResponse$CatListResponseItem;", "Lcom/assignment/meow/ui/adapters/CatPagingAdapter$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CatsComparator", "ViewHolder", "app_debug"})
public final class CatPagingAdapter extends androidx.paging.PagingDataAdapter<com.assignment.meow.data.cat.response.CatListResponse.CatListResponseItem, com.assignment.meow.ui.adapters.CatPagingAdapter.ViewHolder> {
    
    public CatPagingAdapter() {
        super(null, null, null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.assignment.meow.ui.adapters.CatPagingAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.assignment.meow.ui.adapters.CatPagingAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/assignment/meow/ui/adapters/CatPagingAdapter$CatsComparator;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/assignment/meow/data/cat/response/CatListResponse$CatListResponseItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class CatsComparator extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.assignment.meow.data.cat.response.CatListResponse.CatListResponseItem> {
        @org.jetbrains.annotations.NotNull
        public static final com.assignment.meow.ui.adapters.CatPagingAdapter.CatsComparator INSTANCE = null;
        
        private CatsComparator() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.assignment.meow.data.cat.response.CatListResponse.CatListResponseItem oldItem, @org.jetbrains.annotations.NotNull
        com.assignment.meow.data.cat.response.CatListResponse.CatListResponseItem newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.assignment.meow.data.cat.response.CatListResponse.CatListResponseItem oldItem, @org.jetbrains.annotations.NotNull
        com.assignment.meow.data.cat.response.CatListResponse.CatListResponseItem newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/assignment/meow/ui/adapters/CatPagingAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/assignment/meow/databinding/CatItemBinding;", "(Lcom/assignment/meow/databinding/CatItemBinding;)V", "getView", "()Lcom/assignment/meow/databinding/CatItemBinding;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.assignment.meow.databinding.CatItemBinding view = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.assignment.meow.databinding.CatItemBinding view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.assignment.meow.databinding.CatItemBinding getView() {
            return null;
        }
    }
}