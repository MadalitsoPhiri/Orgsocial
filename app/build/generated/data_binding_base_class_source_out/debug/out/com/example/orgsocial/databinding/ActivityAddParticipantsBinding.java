// Generated by data binding compiler. Do not edit!
package com.example.orgsocial.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.orgsocial.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityAddParticipantsBinding extends ViewDataBinding {
  @NonNull
  public final View RecyclerSeparator;

  @NonNull
  public final ImageButton add;

  @NonNull
  public final RecyclerView participantsAddedRecyclerView;

  @NonNull
  public final ProgressBar participantsProgress;

  @NonNull
  public final RecyclerView participantsRecyclerView;

  @NonNull
  public final Toolbar toolbar;

  protected ActivityAddParticipantsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, View RecyclerSeparator, ImageButton add,
      RecyclerView participantsAddedRecyclerView, ProgressBar participantsProgress,
      RecyclerView participantsRecyclerView, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.RecyclerSeparator = RecyclerSeparator;
    this.add = add;
    this.participantsAddedRecyclerView = participantsAddedRecyclerView;
    this.participantsProgress = participantsProgress;
    this.participantsRecyclerView = participantsRecyclerView;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityAddParticipantsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_add_participants, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAddParticipantsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityAddParticipantsBinding>inflateInternal(inflater, R.layout.activity_add_participants, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAddParticipantsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_add_participants, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAddParticipantsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityAddParticipantsBinding>inflateInternal(inflater, R.layout.activity_add_participants, null, false, component);
  }

  public static ActivityAddParticipantsBinding bind(@NonNull View view) {
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
  public static ActivityAddParticipantsBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityAddParticipantsBinding)bind(component, view, R.layout.activity_add_participants);
  }
}