package com.google.android.gms.common.images;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zac implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;
    private final android.graphics.Bitmap zac;
    private final java.util.concurrent.CountDownLatch zad;

    public zac(com.google.android.gms.common.images.ImageManager imageManager, android.net.Uri uri, android.graphics.Bitmap bitmap, boolean z, java.util.concurrent.CountDownLatch countDownLatch) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = bitmap;
        this.zad = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map;
        java.lang.Object obj;
        java.util.HashSet hashSet;
        java.util.ArrayList arrayList;
        java.util.Map map2;
        com.google.android.gms.internal.base.zak zakVar;
        java.util.Map map3;
        com.google.android.gms.common.internal.Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        android.graphics.Bitmap bitmap = this.zac;
        map = this.zaa.zai;
        com.google.android.gms.common.images.ImageManager.ImageReceiver imageReceiver = (com.google.android.gms.common.images.ImageManager.ImageReceiver) map.remove(this.zab);
        if (imageReceiver != null) {
            arrayList = imageReceiver.zac;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                com.google.android.gms.common.images.zag zagVar = (com.google.android.gms.common.images.zag) arrayList.get(i);
                android.graphics.Bitmap bitmap2 = this.zac;
                if (bitmap2 == null || bitmap == null) {
                    map2 = this.zaa.zaj;
                    map2.put(this.zab, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                    com.google.android.gms.common.images.ImageManager imageManager = this.zaa;
                    android.content.Context context = imageManager.zad;
                    zakVar = imageManager.zag;
                    zagVar.zab(context, zakVar, false);
                } else {
                    zagVar.zac(this.zaa.zad, bitmap2, false);
                }
                if (!(zagVar instanceof com.google.android.gms.common.images.zaf)) {
                    map3 = this.zaa.zah;
                    map3.remove(zagVar);
                }
            }
        }
        this.zad.countDown();
        obj = com.google.android.gms.common.images.ImageManager.zaa;
        synchronized (obj) {
            hashSet = com.google.android.gms.common.images.ImageManager.zab;
            hashSet.remove(this.zab);
        }
    }
}
