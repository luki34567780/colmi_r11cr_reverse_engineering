package com.google.android.gms.common.images;

import com.google.android.gms.common.images.ImageManager.ImageReceiver;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zab implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final com.google.android.gms.common.images.zag zab;

    public zab(com.google.android.gms.common.images.ImageManager imageManager, com.google.android.gms.common.images.zag zagVar) {
        this.zaa = imageManager;
        this.zab = zagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map;
        com.google.android.gms.internal.base.zak zakVar;
        java.util.Map map2;
        java.util.Map map3;
        java.lang.Object obj;
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        java.util.Map map4;
        java.util.Map map5;
        java.util.Map map6;
        com.google.android.gms.internal.base.zak zakVar2;
        java.util.Map map7;
        com.google.android.gms.common.internal.Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        map = this.zaa.zah;
        com.google.android.gms.common.images.ImageManager.ImageReceiver imageReceiver = (com.google.android.gms.common.images.ImageManager.ImageReceiver) map.get(this.zab);
        if (imageReceiver != null) {
            map7 = this.zaa.zah;
            map7.remove(this.zab);
            imageReceiver.zac(this.zab);
        }
        com.google.android.gms.common.images.zag zagVar = this.zab;
        com.google.android.gms.common.images.zad zadVar = zagVar.zaa;
        android.net.Uri uri = zadVar.zaa;
        if (uri == null) {
            com.google.android.gms.common.images.ImageManager imageManager = this.zaa;
            android.content.Context context = imageManager.zad;
            zakVar = imageManager.zag;
            zagVar.zab(context, zakVar, true);
            return;
        }
        map2 = this.zaa.zaj;
        java.lang.Long l = (java.lang.Long) map2.get(uri);
        if (l != null) {
            if (android.os.SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                com.google.android.gms.common.images.zag zagVar2 = this.zab;
                com.google.android.gms.common.images.ImageManager imageManager2 = this.zaa;
                android.content.Context context2 = imageManager2.zad;
                zakVar2 = imageManager2.zag;
                zagVar2.zab(context2, zakVar2, true);
                return;
            }
            map6 = this.zaa.zaj;
            map6.remove(zadVar.zaa);
        }
        this.zab.zaa(null, false, true, false);
        map3 = this.zaa.zai;
        com.google.android.gms.common.images.ImageManager.ImageReceiver imageReceiver2 = (com.google.android.gms.common.images.ImageManager.ImageReceiver) map3.get(zadVar.zaa);
        if (imageReceiver2 == null) {
            imageReceiver2 = this.zaa.new ImageReceiver(zadVar.zaa);
            map5 = this.zaa.zai;
            map5.put(zadVar.zaa, imageReceiver2);
        }
        imageReceiver2.zab(this.zab);
        com.google.android.gms.common.images.zag zagVar3 = this.zab;
        if (!(zagVar3 instanceof com.google.android.gms.common.images.zaf)) {
            map4 = this.zaa.zah;
            map4.put(zagVar3, imageReceiver2);
        }
        obj = com.google.android.gms.common.images.ImageManager.zaa;
        synchronized (obj) {
            hashSet = com.google.android.gms.common.images.ImageManager.zab;
            if (!hashSet.contains(zadVar.zaa)) {
                hashSet2 = com.google.android.gms.common.images.ImageManager.zab;
                hashSet2.add(zadVar.zaa);
                imageReceiver2.zad();
            }
        }
    }
}
