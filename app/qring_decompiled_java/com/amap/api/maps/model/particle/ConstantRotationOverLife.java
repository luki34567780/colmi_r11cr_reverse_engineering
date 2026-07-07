package com.amap.api.maps.model.particle;

/* loaded from: classes.dex */
public class ConstantRotationOverLife extends com.amap.api.maps.model.particle.RotationOverLife {
    private float rotate;

    public ConstantRotationOverLife(float f) {
        this.rotate = 0.0f;
        this.rotate = f;
        this.type = 0;
    }

    @Override // com.amap.api.maps.model.particle.RotationOverLife
    public float getRotate() {
        return this.rotate;
    }
}
