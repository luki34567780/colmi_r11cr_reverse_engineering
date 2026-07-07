package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzi implements com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions {
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zza;

    public zzi(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        if ("<<default account>>".equals(googleSignInAccount.getEmail()) && com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google")) {
            this.zza = null;
        } else {
            this.zza = googleSignInAccount;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return obj == this || ((obj instanceof com.google.android.gms.fitness.zzi) && com.google.android.gms.common.internal.Objects.equal(((com.google.android.gms.fitness.zzi) obj).zza, this.zza));
    }

    @Override // com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleSignInAccount() {
        return this.zza;
    }

    public final int hashCode() {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = this.zza;
        if (googleSignInAccount != null) {
            return googleSignInAccount.hashCode();
        }
        return 0;
    }
}
