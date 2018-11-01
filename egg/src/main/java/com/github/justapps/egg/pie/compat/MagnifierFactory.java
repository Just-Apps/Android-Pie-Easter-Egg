package com.github.justapps.egg.pie.compat;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;

public final class MagnifierFactory {
    public static final MagnifierCompat createMagnifierCompat(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            return new MagnifierApi28(view);
        } else {
            return new MagnifierDummy();
        }
    }
}
