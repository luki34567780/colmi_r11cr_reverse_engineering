package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzh implements android.os.Parcelable.Creator<com.google.android.gms.common.internal.BinderWrapper> {
    zzh() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.internal.BinderWrapper createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.gms.common.internal.BinderWrapper(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.internal.BinderWrapper[] newArray(int i) {
        return new com.google.android.gms.common.internal.BinderWrapper[i];
    }
}
