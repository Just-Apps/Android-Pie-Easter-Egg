package com.github.justapps.egg.pie.common;

import android.app.ActionBar;
import android.app.Activity;
import android.view.View;

public final class BarHelper {

    public static void showStatusBar(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_VISIBLE;
        decorView.setSystemUiVisibility(uiOptions);
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.show();
        }
    }

    public static void hideStatusBar(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }
}
