package com.amap.api.col.p0003sl;

/* compiled from: EngineStyleKeyItem.java */
/* loaded from: classes.dex */
public final class cv {
    int a;
    int[] b;
    int c;
    int d;
    java.lang.String e;
    java.lang.String f;
    java.lang.String g;

    public cv(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = i;
        this.b = iArr;
        this.e = str;
        this.f = str2;
        this.g = str3;
        str = android.text.TextUtils.isEmpty(str) ? str2 : str;
        this.c = -1000;
        if ("regions".equals(str)) {
            this.c = 1001;
        } else if ("water".equals(str)) {
            this.c = 1002;
        } else if ("buildings".equals(str)) {
            this.c = 1003;
        } else if ("roads".equals(str)) {
            this.c = 1004;
        } else if ("labels".equals(str)) {
            this.c = 1005;
        } else if ("borders".equals(str)) {
            this.c = 1006;
        }
        this.d = (i * 1000) + iArr.hashCode();
    }
}
