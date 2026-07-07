package com.google.android.gms.auth.api.phone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class SmsCodeRetriever {
    public static final java.lang.String EXTRA_SMS_CODE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE";
    public static final java.lang.String EXTRA_SMS_CODE_LINE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE_LINE";
    public static final java.lang.String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    public static final java.lang.String SMS_CODE_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED";

    private SmsCodeRetriever() {
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeAutofillClient getAutofillClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.p001authapiphone.zzr(activity);
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeBrowserClient getBrowserClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.p001authapiphone.zzv(activity);
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeAutofillClient getAutofillClient(android.content.Context context) {
        return new com.google.android.gms.internal.p001authapiphone.zzr(context);
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeBrowserClient getBrowserClient(android.content.Context context) {
        return new com.google.android.gms.internal.p001authapiphone.zzv(context);
    }
}
