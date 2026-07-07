package com.amap.api.col.p0003sl;

/* compiled from: WeatherSearchHandler.java */
/* loaded from: classes.dex */
abstract class hd<T, V> extends com.amap.api.col.p0003sl.ff<T, V> {
    public hd(android.content.Context context, T t) {
        super(context, t);
    }

    public T f() {
        return this.b;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public java.lang.String getURL() {
        return com.amap.api.col.p0003sl.fm.a() + "/weather/weatherInfo?";
    }
}
