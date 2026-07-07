package com.google.android.gms.internal.p001authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes2.dex */
public final class zbn {
    public static android.app.PendingIntent zba(android.content.Context context, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions, com.google.android.gms.auth.api.credentials.HintRequest hintRequest, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "context must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(hintRequest, "request must not be null");
        java.lang.String zba = android.text.TextUtils.isEmpty(str) ? com.google.android.gms.internal.p001authapi.zbbb.zba() : (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        android.content.Intent putExtra = new android.content.Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", (java.lang.String) null);
        putExtra.putExtra("logSessionId", zba);
        com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
        return android.app.PendingIntent.getActivity(context, 2000, putExtra, com.google.android.gms.internal.p001authapi.zbbc.zba | com.autonavi.amap.mapcore.AMapEngineUtils.HALF_MAX_P20_WIDTH);
    }
}
