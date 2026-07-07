package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzt {
    private static final android.net.Uri zza;
    private static final android.net.Uri zzb;

    static {
        android.net.Uri parse = android.net.Uri.parse("https://plus.google.com/");
        zza = parse;
        zzb = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static android.content.Intent zza() {
        android.content.Intent intent = new android.content.Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    public static android.content.Intent zzb(java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        android.net.Uri.Builder appendQueryParameter = android.net.Uri.parse("market://details").buildUpon().appendQueryParameter(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID, "com.google.android.gms");
        if (!android.text.TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static android.content.Intent zzc(java.lang.String str) {
        android.net.Uri fromParts = android.net.Uri.fromParts("package", "com.google.android.gms", null);
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }
}
