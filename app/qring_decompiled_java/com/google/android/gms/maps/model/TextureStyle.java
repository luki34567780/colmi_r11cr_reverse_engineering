package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class TextureStyle extends com.google.android.gms.maps.model.StampStyle {

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    public static final class Builder extends com.google.android.gms.maps.model.StampStyle.Builder<com.google.android.gms.maps.model.TextureStyle.Builder> {
        private Builder() {
        }

        /* synthetic */ Builder(com.google.android.gms.maps.model.zzx zzxVar) {
        }

        public com.google.android.gms.maps.model.TextureStyle build() {
            return new com.google.android.gms.maps.model.TextureStyle(this.zza, null);
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        protected final /* bridge */ /* synthetic */ com.google.android.gms.maps.model.TextureStyle.Builder self() {
            return this;
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        /* renamed from: self, reason: avoid collision after fix types in other method */
        protected com.google.android.gms.maps.model.TextureStyle.Builder self2() {
            return this;
        }
    }

    /* synthetic */ TextureStyle(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, com.google.android.gms.maps.model.zzy zzyVar) {
        super(bitmapDescriptor);
    }

    public static com.google.android.gms.maps.model.TextureStyle.Builder newBuilder(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        return new com.google.android.gms.maps.model.TextureStyle.Builder(null).stamp(bitmapDescriptor);
    }
}
