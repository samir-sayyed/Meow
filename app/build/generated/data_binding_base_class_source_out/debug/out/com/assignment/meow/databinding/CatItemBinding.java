// Generated by data binding compiler. Do not edit!
package com.assignment.meow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.assignment.meow.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CatItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView catBreed;

  @NonNull
  public final ImageView catImage;

  protected CatItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView catBreed, ImageView catImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.catBreed = catBreed;
    this.catImage = catImage;
  }

  @NonNull
  public static CatItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.cat_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CatItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CatItemBinding>inflateInternal(inflater, R.layout.cat_item, root, attachToRoot, component);
  }

  @NonNull
  public static CatItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.cat_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CatItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CatItemBinding>inflateInternal(inflater, R.layout.cat_item, null, false, component);
  }

  public static CatItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static CatItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (CatItemBinding)bind(component, view, R.layout.cat_item);
  }
}
