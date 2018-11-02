package com.github.justapps.egg.pie.compat;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;

@TargetApi(Build.VERSION_CODES.P)
public final class MagnifierApi28 implements MagnifierCompat {

    android.widget.Magnifier  magnifier;

    MagnifierApi28(@NonNull View view) {
        magnifier = new android.widget.Magnifier(view);
    }

    @Override
    public void show(float xPosInView, float yPosInView) {
        magnifier.show(xPosInView, yPosInView);
    }

    @Override
    public void dismiss() {
        magnifier.dismiss();
    }
}
