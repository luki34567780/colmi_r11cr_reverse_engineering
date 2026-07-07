package com.google.android.gms.auth.api.phone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class SmsRetriever {
    public static final java.lang.String EXTRA_CONSENT_INTENT = "com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT";
    public static final java.lang.String EXTRA_SIM_SUBSCRIPTION_ID = "com.google.android.gms.auth.api.phone.EXTRA_SIM_SUBSCRIPTION_ID";
    public static final java.lang.String EXTRA_SMS_MESSAGE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE";
    public static final java.lang.String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    public static final java.lang.String SEND_PERMISSION = "com.google.android.gms.auth.api.phone.permission.SEND";
    public static final java.lang.String SMS_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";

    private SmsRetriever() {
    }

    public static com.google.android.gms.auth.api.phone.SmsRetrieverClient getClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.p001authapiphone.zzab(activity);
    }

    public static com.google.android.gms.auth.api.phone.SmsRetrieverClient getClient(android.content.Context context) {
        return new com.google.android.gms.internal.p001authapiphone.zzab(context);
    }
}
