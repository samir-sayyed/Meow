// Generated by view binder compiler. Do not edit!
package com.assignment.meow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.assignment.meow.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FilterBottomSheetDialogFragmentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout bottomSheetLayout;

  @NonNull
  public final RecyclerView breedsRecyclerView;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final TextView filterName;

  private FilterBottomSheetDialogFragmentBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout bottomSheetLayout, @NonNull RecyclerView breedsRecyclerView,
      @NonNull ConstraintLayout container, @NonNull TextView filterName) {
    this.rootView = rootView;
    this.bottomSheetLayout = bottomSheetLayout;
    this.breedsRecyclerView = breedsRecyclerView;
    this.container = container;
    this.filterName = filterName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FilterBottomSheetDialogFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FilterBottomSheetDialogFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.filter_bottom_sheet_dialog_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FilterBottomSheetDialogFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout bottomSheetLayout = (LinearLayout) rootView;

      id = R.id.breeds_recycler_view;
      RecyclerView breedsRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (breedsRecyclerView == null) {
        break missingId;
      }

      id = R.id.container;
      ConstraintLayout container = ViewBindings.findChildViewById(rootView, id);
      if (container == null) {
        break missingId;
      }

      id = R.id.filter_name;
      TextView filterName = ViewBindings.findChildViewById(rootView, id);
      if (filterName == null) {
        break missingId;
      }

      return new FilterBottomSheetDialogFragmentBinding((LinearLayout) rootView, bottomSheetLayout,
          breedsRecyclerView, container, filterName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
