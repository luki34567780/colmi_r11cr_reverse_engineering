package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zaz extends com.google.android.gms.dynamic.RemoteCreator<com.google.android.gms.common.internal.zam> {
    private static final com.google.android.gms.common.internal.zaz zaa = new com.google.android.gms.common.internal.zaz();

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static android.view.View zaa(android.content.Context context, int i, int i2) throws com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException {
        com.google.android.gms.common.internal.zaz zazVar = zaa;
        try {
            com.google.android.gms.common.internal.zax zaxVar = new com.google.android.gms.common.internal.zax(1, i, i2, null);
            return (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zazVar.getRemoteCreatorInstance(context).zae(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), zaxVar));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException(sb.toString(), e);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ com.google.android.gms.common.internal.zam getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof com.google.android.gms.common.internal.zam ? (com.google.android.gms.common.internal.zam) queryLocalInterface : new com.google.android.gms.common.internal.zam(iBinder);
    }
}
