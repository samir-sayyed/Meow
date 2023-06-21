package com.assignment.meow;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.assignment.meow.databinding.BreedItemBindingImpl;
import com.assignment.meow.databinding.CatItemBindingImpl;
import com.assignment.meow.databinding.FragmentCatBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_BREEDITEM = 1;

  private static final int LAYOUT_CATITEM = 2;

  private static final int LAYOUT_FRAGMENTCAT = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.assignment.meow.R.layout.breed_item, LAYOUT_BREEDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.assignment.meow.R.layout.cat_item, LAYOUT_CATITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.assignment.meow.R.layout.fragment_cat, LAYOUT_FRAGMENTCAT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_BREEDITEM: {
          if ("layout/breed_item_0".equals(tag)) {
            return new BreedItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for breed_item is invalid. Received: " + tag);
        }
        case  LAYOUT_CATITEM: {
          if ("layout/cat_item_0".equals(tag)) {
            return new CatItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for cat_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCAT: {
          if ("layout/fragment_cat_0".equals(tag)) {
            return new FragmentCatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cat is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/breed_item_0", com.assignment.meow.R.layout.breed_item);
      sKeys.put("layout/cat_item_0", com.assignment.meow.R.layout.cat_item);
      sKeys.put("layout/fragment_cat_0", com.assignment.meow.R.layout.fragment_cat);
    }
  }
}
