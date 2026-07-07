package com.amap.api.trace;

/* loaded from: classes.dex */
public interface TraceListener {
    void onFinished(int i, java.util.List<com.amap.api.maps.model.LatLng> list, int i2, int i3);

    void onRequestFailed(int i, java.lang.String str);

    void onTraceProcessing(int i, int i2, java.util.List<com.amap.api.maps.model.LatLng> list);
}
