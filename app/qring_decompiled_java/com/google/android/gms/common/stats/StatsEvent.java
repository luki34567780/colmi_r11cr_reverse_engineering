package com.google.android.gms.common.stats;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public abstract class StatsEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface Types {
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public final java.lang.String toString() {
        long zzc = zzc();
        int zza = zza();
        long zzb = zzb();
        java.lang.String zzd = zzd();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zzd.length() + 53);
        sb.append(zzc);
        sb.append("\t");
        sb.append(zza);
        sb.append("\t");
        sb.append(zzb);
        sb.append(zzd);
        return sb.toString();
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract long zzc();

    public abstract java.lang.String zzd();
}
