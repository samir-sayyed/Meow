package com.assignment.meow.ui.adapters;

/**
 * Loader adapter used for showing progress bar while loading pagination page
 * we can us this adapter for adding error message or refresh button for reloading page if needed
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\r"}, d2 = {"Lcom/assignment/meow/ui/adapters/LoaderAdapter;", "Landroidx/paging/LoadStateAdapter;", "Lcom/assignment/meow/ui/adapters/LoaderAdapter$LoaderViewHolder;", "()V", "onBindViewHolder", "", "holder", "loadState", "Landroidx/paging/LoadState;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "LoaderViewHolder", "app_debug"})
public final class LoaderAdapter extends androidx.paging.LoadStateAdapter<com.assignment.meow.ui.adapters.LoaderAdapter.LoaderViewHolder> {
    
    public LoaderAdapter() {
        super();
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.assignment.meow.ui.adapters.LoaderAdapter.LoaderViewHolder holder, @org.jetbrains.annotations.NotNull
    androidx.paging.LoadState loadState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.assignment.meow.ui.adapters.LoaderAdapter.LoaderViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull
    androidx.paging.LoadState loadState) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/assignment/meow/ui/adapters/LoaderAdapter$LoaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "pageProgressBar", "Landroid/widget/ProgressBar;", "kotlin.jvm.PlatformType", "bind", "", "loadState", "Landroidx/paging/LoadState;", "app_debug"})
    public static final class LoaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ProgressBar pageProgressBar = null;
        
        public LoaderViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        androidx.paging.LoadState loadState) {
        }
    }
}