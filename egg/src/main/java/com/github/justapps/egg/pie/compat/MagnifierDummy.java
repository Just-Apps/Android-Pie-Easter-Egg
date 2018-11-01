package com.github.justapps.egg.pie.compat;

public final class MagnifierDummy implements MagnifierCompat {
    MagnifierDummy() {}

    @Override
    public void show(float xPosInView, float yPosInView) {}

    @Override
    public void dismiss() {}
}
