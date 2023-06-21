package com.assignment.meow.base;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u0012\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\u001a\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010+\u001a\u00020\u001dH\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010-H$R\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\n8eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006."}, d2 = {"Lcom/assignment/meow/base/BaseFragment;", "ViewBinding", "Landroidx/databinding/ViewDataBinding;", "ViewModel", "Lcom/assignment/meow/base/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "_viewBinding", "Landroidx/databinding/ViewDataBinding;", "layoutId", "", "getLayoutId", "()I", "useSharedViewModel", "", "getUseSharedViewModel", "()Z", "setUseSharedViewModel", "(Z)V", "viewBinding", "getViewBinding", "()Landroidx/databinding/ViewDataBinding;", "viewModel", "getViewModel", "()Lcom/assignment/meow/base/BaseViewModel;", "setViewModel", "(Lcom/assignment/meow/base/BaseViewModel;)V", "Lcom/assignment/meow/base/BaseViewModel;", "initApiCalls", "", "observeData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "setUpViews", "viewModelClass", "Ljava/lang/Class;", "app_release"})
public abstract class BaseFragment<ViewBinding extends androidx.databinding.ViewDataBinding, ViewModel extends com.assignment.meow.base.BaseViewModel> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private ViewBinding _viewBinding;
    protected ViewModel viewModel;
    private boolean useSharedViewModel = false;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    protected final ViewBinding getViewBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final ViewModel getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull
    ViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected abstract java.lang.Class<ViewModel> viewModelClass();
    
    public boolean getUseSharedViewModel() {
        return false;
    }
    
    public void setUseSharedViewModel(boolean p0) {
    }
    
    @androidx.annotation.LayoutRes
    protected abstract int getLayoutId();
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public void setUpViews() {
    }
    
    public void observeData() {
    }
    
    public void initApiCalls() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}