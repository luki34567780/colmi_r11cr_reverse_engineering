package com.amap.api.maps.model.particle;

/* loaded from: classes.dex */
public class RectParticleShape extends com.amap.api.maps.model.particle.ParticleShapeModule {
    private final float bottom;
    private final float left;
    private final float right;

    /* renamed from: top, reason: collision with root package name */
    private final float f28top;

    @Override // com.amap.api.maps.model.particle.ParticleShapeModule
    public float[] getPoint() {
        return null;
    }

    public RectParticleShape(float f, float f2, float f3, float f4, boolean z) {
        this.left = f;
        this.f28top = f2;
        this.right = f3;
        this.bottom = f4;
        this.isUseRatio = z;
        this.type = 1;
    }
}
