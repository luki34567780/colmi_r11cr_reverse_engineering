package com.google.android.gms.common.wrappers;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class Wrappers {
    private static com.google.android.gms.common.wrappers.Wrappers zza = new com.google.android.gms.common.wrappers.Wrappers();
    private com.google.android.gms.common.wrappers.PackageManagerWrapper zzb = null;

    public static com.google.android.gms.common.wrappers.PackageManagerWrapper packageManager(android.content.Context context) {
        return zza.zza(context);
    }

    public final synchronized com.google.android.gms.common.wrappers.PackageManagerWrapper zza(android.content.Context context) {
        if (this.zzb == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzb = new com.google.android.gms.common.wrappers.PackageManagerWrapper(context);
        }
        return this.zzb;
    }
}
