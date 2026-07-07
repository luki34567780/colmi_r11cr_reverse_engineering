package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class StringResourceValueReader {
    private final android.content.res.Resources zza;
    private final java.lang.String zzb;

    public StringResourceValueReader(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        android.content.res.Resources resources = context.getResources();
        this.zza = resources;
        this.zzb = resources.getResourcePackageName(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
    }

    public java.lang.String getString(java.lang.String str) {
        int identifier = this.zza.getIdentifier(str, "string", this.zzb);
        if (identifier == 0) {
            return null;
        }
        return this.zza.getString(identifier);
    }
}
