package com.google.android.gms.common.images;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zad {
    public final android.net.Uri zaa;

    public zad(android.net.Uri uri) {
        this.zaa = uri;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.common.images.zad) {
            return com.google.android.gms.common.internal.Objects.equal(((com.google.android.gms.common.images.zad) obj).zaa, this.zaa);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zaa);
    }
}
