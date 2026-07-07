package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class SpriteStyle extends com.google.android.gms.maps.model.StampStyle {

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    public static final class Builder extends com.google.android.gms.maps.model.StampStyle.Builder<com.google.android.gms.maps.model.SpriteStyle.Builder> {
        private Builder() {
        }

        /* synthetic */ Builder(com.google.android.gms.maps.model.zzn zznVar) {
        }

        public com.google.android.gms.maps.model.SpriteStyle build() {
            return new com.google.android.gms.maps.model.SpriteStyle(this.zza);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        protected com.google.android.gms.maps.model.SpriteStyle.Builder self() {
            return this;
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        protected final /* bridge */ /* synthetic */ com.google.android.gms.maps.model.SpriteStyle.Builder self() {
            return this;
        }
    }

    public SpriteStyle(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        super(bitmapDescriptor);
    }

    public static com.google.android.gms.maps.model.SpriteStyle.Builder newBuilder(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        return new com.google.android.gms.maps.model.SpriteStyle.Builder(null).stamp(bitmapDescriptor);
    }
}
