// Generated by view binder compiler. Do not edit!
package com.example.piranti_evaluasi2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TimePicker;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.piranti_evaluasi2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAlaramTestBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnCancelAlarm;

  @NonNull
  public final Button btnSetAlarm;

  @NonNull
  public final Button btnStartAlarm;

  @NonNull
  public final TimePicker timePicker;

  private ActivityAlaramTestBinding(@NonNull RelativeLayout rootView,
      @NonNull Button btnCancelAlarm, @NonNull Button btnSetAlarm, @NonNull Button btnStartAlarm,
      @NonNull TimePicker timePicker) {
    this.rootView = rootView;
    this.btnCancelAlarm = btnCancelAlarm;
    this.btnSetAlarm = btnSetAlarm;
    this.btnStartAlarm = btnStartAlarm;
    this.timePicker = timePicker;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAlaramTestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAlaramTestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_alaram_test, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAlaramTestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCancelAlarm;
      Button btnCancelAlarm = ViewBindings.findChildViewById(rootView, id);
      if (btnCancelAlarm == null) {
        break missingId;
      }

      id = R.id.btnSetAlarm;
      Button btnSetAlarm = ViewBindings.findChildViewById(rootView, id);
      if (btnSetAlarm == null) {
        break missingId;
      }

      id = R.id.btnStartAlarm;
      Button btnStartAlarm = ViewBindings.findChildViewById(rootView, id);
      if (btnStartAlarm == null) {
        break missingId;
      }

      id = R.id.timePicker;
      TimePicker timePicker = ViewBindings.findChildViewById(rootView, id);
      if (timePicker == null) {
        break missingId;
      }

      return new ActivityAlaramTestBinding((RelativeLayout) rootView, btnCancelAlarm, btnSetAlarm,
          btnStartAlarm, timePicker);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
