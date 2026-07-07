package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zbb implements java.lang.Runnable {
    private static final com.google.android.gms.common.logging.Logger zba = new com.google.android.gms.common.logging.Logger("RevokeAccessOperation", new java.lang.String[0]);
    private final java.lang.String zbb;
    private final com.google.android.gms.common.api.internal.StatusPendingResult zbc = new com.google.android.gms.common.api.internal.StatusPendingResult((com.google.android.gms.common.api.GoogleApiClient) null);

    public zbb(java.lang.String str) {
        this.zbb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
    }

    public static com.google.android.gms.common.api.PendingResult zba(java.lang.String str) {
        if (str == null) {
            return com.google.android.gms.common.api.PendingResults.immediateFailedResult(new com.google.android.gms.common.api.Status(4), null);
        }
        com.google.android.gms.auth.api.signin.internal.zbb zbbVar = new com.google.android.gms.auth.api.signin.internal.zbb(str);
        new java.lang.Thread(zbbVar).start();
        return zbbVar.zbc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.Status status = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR;
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.zbb).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
            } else {
                zba.e("Unable to revoke access!", new java.lang.Object[0]);
            }
            zba.d("Response Code: " + responseCode, new java.lang.Object[0]);
        } catch (java.io.IOException e) {
            zba.e("IOException when revoking access: ".concat(java.lang.String.valueOf(e.toString())), new java.lang.Object[0]);
        } catch (java.lang.Exception e2) {
            zba.e("Exception when revoking access: ".concat(java.lang.String.valueOf(e2.toString())), new java.lang.Object[0]);
        }
        this.zbc.setResult(status);
    }
}
