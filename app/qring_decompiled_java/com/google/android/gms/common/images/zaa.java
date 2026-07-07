package com.google.android.gms.common.images;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zaa implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;
    private final android.os.ParcelFileDescriptor zac;

    public zaa(com.google.android.gms.common.images.ImageManager imageManager, android.net.Uri uri, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap;
        boolean z;
        android.os.Handler handler;
        com.google.android.gms.common.internal.Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        android.os.ParcelFileDescriptor parcelFileDescriptor = this.zac;
        android.graphics.Bitmap bitmap2 = null;
        boolean z2 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap2 = android.graphics.BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (java.lang.OutOfMemoryError e) {
                java.lang.String valueOf = java.lang.String.valueOf(this.zab);
                java.lang.String.valueOf(valueOf).length();
                android.util.Log.e("ImageManager", "OOM while loading bitmap for uri: ".concat(java.lang.String.valueOf(valueOf)), e);
                z2 = true;
            }
            try {
                this.zac.close();
            } catch (java.io.IOException e2) {
                android.util.Log.e("ImageManager", "closed failed", e2);
            }
            bitmap = bitmap2;
            z = z2;
        } else {
            bitmap = null;
            z = false;
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        com.google.android.gms.common.images.ImageManager imageManager = this.zaa;
        handler = imageManager.zae;
        handler.post(new com.google.android.gms.common.images.zac(imageManager, this.zab, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException unused) {
            java.lang.String valueOf2 = java.lang.String.valueOf(this.zab);
            java.lang.String.valueOf(valueOf2).length();
            android.util.Log.w("ImageManager", "Latch interrupted while posting ".concat(java.lang.String.valueOf(valueOf2)));
        }
    }
}
