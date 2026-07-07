package com.google.android.gms.auth.api.phone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: /tmp/dex/classes2.dex */
public interface SmsCodeAutofillClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {

    /* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PermissionState {
        public static final int DENIED = 2;
        public static final int GRANTED = 1;
        public static final int NONE = 0;
    }

    com.google.android.gms.tasks.Task<java.lang.Integer> checkPermissionState();

    com.google.android.gms.tasks.Task<java.lang.Boolean> hasOngoingSmsRequest(java.lang.String str);

    com.google.android.gms.tasks.Task<java.lang.Void> startSmsCodeRetriever();
}
