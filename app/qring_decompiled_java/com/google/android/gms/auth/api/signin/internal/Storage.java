package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class Storage {
    private static final java.util.concurrent.locks.Lock zaa = new java.util.concurrent.locks.ReentrantLock();
    private static com.google.android.gms.auth.api.signin.internal.Storage zab;
    private final java.util.concurrent.locks.Lock zac = new java.util.concurrent.locks.ReentrantLock();
    private final android.content.SharedPreferences zad;

    Storage(android.content.Context context) {
        this.zad = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static com.google.android.gms.auth.api.signin.internal.Storage getInstance(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        java.util.concurrent.locks.Lock lock = zaa;
        lock.lock();
        try {
            if (zab == null) {
                zab = new com.google.android.gms.auth.api.signin.internal.Storage(context.getApplicationContext());
            }
            com.google.android.gms.auth.api.signin.internal.Storage storage = zab;
            lock.unlock();
            return storage;
        } catch (java.lang.Throwable th) {
            zaa.unlock();
            throw th;
        }
    }

    private static final java.lang.String zae(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 1 + java.lang.String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public void clear() {
        this.zac.lock();
        try {
            this.zad.edit().clear().apply();
        } finally {
            this.zac.unlock();
        }
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        java.lang.String zaa2;
        java.lang.String zaa3 = zaa("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(zaa3) || (zaa2 = zaa(zae("googleSignInAccount", zaa3))) == null) {
            return null;
        }
        try {
            return com.google.android.gms.auth.api.signin.GoogleSignInAccount.zab(zaa2);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        java.lang.String zaa2;
        java.lang.String zaa3 = zaa("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(zaa3) || (zaa2 = zaa(zae("googleSignInOptions", zaa3))) == null) {
            return null;
        }
        try {
            return com.google.android.gms.auth.api.signin.GoogleSignInOptions.zab(zaa2);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public java.lang.String getSavedRefreshToken() {
        return zaa("refreshToken");
    }

    public void saveDefaultGoogleSignInAccount(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions);
        zad("defaultGoogleSignInAccount", googleSignInAccount.zac());
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions);
        java.lang.String zac = googleSignInAccount.zac();
        zad(zae("googleSignInAccount", zac), googleSignInAccount.zad());
        zad(zae("googleSignInOptions", zac), googleSignInOptions.zaf());
    }

    protected final java.lang.String zaa(java.lang.String str) {
        this.zac.lock();
        try {
            return this.zad.getString(str, null);
        } finally {
            this.zac.unlock();
        }
    }

    protected final void zab(java.lang.String str) {
        this.zac.lock();
        try {
            this.zad.edit().remove(str).apply();
        } finally {
            this.zac.unlock();
        }
    }

    public final void zac() {
        java.lang.String zaa2 = zaa("defaultGoogleSignInAccount");
        zab("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(zaa2)) {
            return;
        }
        zab(zae("googleSignInAccount", zaa2));
        zab(zae("googleSignInOptions", zaa2));
    }

    protected final void zad(java.lang.String str, java.lang.String str2) {
        this.zac.lock();
        try {
            this.zad.edit().putString(str, str2).apply();
        } finally {
            this.zac.unlock();
        }
    }
}
