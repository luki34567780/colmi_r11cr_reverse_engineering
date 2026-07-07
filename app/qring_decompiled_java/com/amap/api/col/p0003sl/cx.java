package com.amap.api.col.p0003sl;

/* compiled from: StyleElementType.java */
/* loaded from: classes.dex */
public enum cx {
    STYLE_ELEMENT_LABELFILL_OLD("labels.text.fill", 0),
    STYLE_ELEMENT_LABELSTROKE_OLD("labels.text.stroke", 1),
    STYLE_ELEMENT_GEOMETRYSTROKE_OLD("geometry.stroke", 2),
    STYLE_ELEMENT_GEOMETRYFILL_OLD("geometry.fill", 3),
    STYLE_ELEMENT_LABELFILL("textFillColor", 0),
    STYLE_ELEMENT_LABELSTROKE("textStrokeColor", 1),
    STYLE_ELEMENT_GEOMETRYSTROKE("strokeColor", 2),
    STYLE_ELEMENT_GEOMETRYFILL("fillColor", 3),
    STYLE_ELEMENT_GEOMETRYFILL1(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, 3),
    STYLE_ELEMENT_GEOMETRYFILL2("textureName", 3),
    STYLE_ELEMENT_BACKGROUNDFILL("backgroundColor", 4),
    STYLE_ELEMENT_VISIBLE("visible", 5);

    private java.lang.String m;
    private int n;

    cx(java.lang.String str, int i) {
        this.m = str;
        this.n = i;
    }

    private java.lang.String a() {
        return this.m;
    }

    public static int a(java.lang.String str) {
        for (com.amap.api.col.p0003sl.cx cxVar : values()) {
            if (cxVar.a().equals(str)) {
                return cxVar.n;
            }
        }
        return -1;
    }
}
