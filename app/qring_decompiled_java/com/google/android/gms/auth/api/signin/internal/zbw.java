package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zbw implements androidx.loader.app.LoaderManager.LoaderCallbacks {
    final /* synthetic */ com.google.android.gms.auth.api.signin.internal.SignInHubActivity zba;

    /* synthetic */ zbw(com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity, com.google.android.gms.auth.api.signin.internal.zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    public final androidx.loader.content.Loader onCreateLoader(int i, android.os.Bundle bundle) {
        return new com.google.android.gms.auth.api.signin.internal.zbc(this.zba, com.google.android.gms.common.api.GoogleApiClient.getAllClients());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(androidx.loader.content.Loader loader, java.lang.Object obj) {
        int i;
        android.content.Intent intent;
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity = this.zba;
        i = signInHubActivity.zbe;
        intent = signInHubActivity.zbf;
        signInHubActivity.setResult(i, intent);
        this.zba.finish();
    }

    public final void onLoaderReset(androidx.loader.content.Loader loader) {
    }
}
