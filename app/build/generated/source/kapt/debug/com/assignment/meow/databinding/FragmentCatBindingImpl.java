package com.assignment.meow.databinding;
import com.assignment.meow.R;
import com.assignment.meow.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCatBindingImpl extends FragmentCatBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.no_internet, 3);
        sViewsWithIds.put(R.id.cats_container, 8);
        sViewsWithIds.put(R.id.header_container, 9);
        sViewsWithIds.put(R.id.header, 10);
        sViewsWithIds.put(R.id.filter, 11);
        sViewsWithIds.put(R.id.cats_shimmer, 12);
        sViewsWithIds.put(R.id.cat_recyclerview, 13);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @Nullable
    private final com.assignment.meow.databinding.CatShimmerLayoutBinding mboundView21;
    @Nullable
    private final com.assignment.meow.databinding.CatShimmerLayoutBinding mboundView22;
    @Nullable
    private final com.assignment.meow.databinding.CatShimmerLayoutBinding mboundView23;
    @Nullable
    private final com.assignment.meow.databinding.CatShimmerLayoutBinding mboundView24;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentCatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[12]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (bindings[3] != null) ? com.assignment.meow.databinding.NoInternetLayoutBinding.bind((android.view.View) bindings[3]) : null
            );
        this.mainCard.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView21 = (bindings[4] != null) ? com.assignment.meow.databinding.CatShimmerLayoutBinding.bind((android.view.View) bindings[4]) : null;
        this.mboundView22 = (bindings[5] != null) ? com.assignment.meow.databinding.CatShimmerLayoutBinding.bind((android.view.View) bindings[5]) : null;
        this.mboundView23 = (bindings[6] != null) ? com.assignment.meow.databinding.CatShimmerLayoutBinding.bind((android.view.View) bindings[6]) : null;
        this.mboundView24 = (bindings[7] != null) ? com.assignment.meow.databinding.CatShimmerLayoutBinding.bind((android.view.View) bindings[7]) : null;
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}