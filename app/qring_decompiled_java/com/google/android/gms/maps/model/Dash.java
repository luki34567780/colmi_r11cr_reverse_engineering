package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class Dash extends com.google.android.gms.maps.model.PatternItem {
    public final float length;

    public Dash(float f) {
        super(0, java.lang.Float.valueOf(java.lang.Math.max(f, 0.0f)));
        this.length = java.lang.Math.max(f, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    public java.lang.String toString() {
        return "[Dash: length=" + this.length + "]";
    }
}
