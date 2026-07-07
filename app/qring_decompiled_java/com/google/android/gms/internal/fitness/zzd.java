package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzd {
    public static int zza(java.lang.Object obj, java.util.List list) {
        if (obj == null) {
            return -1;
        }
        int indexOf = list.indexOf(obj);
        if (indexOf >= 0) {
            return indexOf;
        }
        list.add(obj);
        return list.size() - 1;
    }
}
