package com.google.android.gms.common.data;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public interface DataBufferObserver {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface Observable {
        void addObserver(com.google.android.gms.common.data.DataBufferObserver dataBufferObserver);

        void removeObserver(com.google.android.gms.common.data.DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i, int i2);

    void onDataRangeInserted(int i, int i2);

    void onDataRangeMoved(int i, int i2, int i3);

    void onDataRangeRemoved(int i, int i2);
}
