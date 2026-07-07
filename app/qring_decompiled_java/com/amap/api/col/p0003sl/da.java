package com.amap.api.col.p0003sl;

/* compiled from: StyleParserResult.java */
/* loaded from: classes.dex */
public final class da {
    private java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> a = new java.util.concurrent.ConcurrentHashMap();
    private java.lang.Object b = null;
    private com.autonavi.base.ae.gmap.style.StyleItem[] c;

    public final java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> a() {
        return this.a;
    }

    public final com.autonavi.base.ae.gmap.style.StyleItem[] b() {
        java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> map = this.a;
        if (map != null && map.size() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.autonavi.base.ae.gmap.style.StyleItem styleItem : this.a.values()) {
                if (styleItem.isValid()) {
                    arrayList.add(styleItem);
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                com.autonavi.base.ae.gmap.style.StyleItem[] styleItemArr = (com.autonavi.base.ae.gmap.style.StyleItem[]) arrayList.toArray(new com.autonavi.base.ae.gmap.style.StyleItem[size]);
                this.c = styleItemArr;
                return styleItemArr;
            }
        }
        return null;
    }

    public final com.autonavi.base.ae.gmap.style.StyleItem[] c() {
        return this.c;
    }

    public final java.lang.Object d() {
        return this.b;
    }
}
