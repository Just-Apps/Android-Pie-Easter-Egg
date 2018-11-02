package com.github.justapps.egg.pie.compat;

import androidx.annotation.FloatRange;

public interface MagnifierCompat {
    void show(@FloatRange(from = 0) float xPosInView, @FloatRange(from = 0) float yPosInView);
    void dismiss();
}
