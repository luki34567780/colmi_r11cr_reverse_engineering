package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class BaseOptions {
    protected java.lang.Object Field1;
    protected java.lang.Object Field2;
    protected java.lang.String type;

    protected com.amap.api.maps.model.BaseOptions.BaseUpdateFlags getUpdateFlags() {
        return null;
    }

    protected java.lang.Object method1(java.lang.Object... objArr) {
        return null;
    }

    protected java.lang.Object method2(java.lang.Object... objArr) {
        return null;
    }

    public void resetUpdateFlags() {
    }

    public static class BaseUpdateFlags {
        protected boolean zIndexUpdate = false;

        public void reset() {
            this.zIndexUpdate = false;
        }
    }
}
