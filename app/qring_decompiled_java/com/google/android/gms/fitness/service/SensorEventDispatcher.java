package com.google.android.gms.fitness.service;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public interface SensorEventDispatcher {
    void publish(com.google.android.gms.fitness.data.DataPoint dataPoint) throws android.os.RemoteException;

    void publish(java.util.List<com.google.android.gms.fitness.data.DataPoint> list) throws android.os.RemoteException;
}
