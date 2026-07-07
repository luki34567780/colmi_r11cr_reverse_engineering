package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class GLTFOverlayOptionsCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.GLTFOverlayOptions> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.GLTFOverlayOptions[] newArray(int i) {
        return new com.amap.api.maps.model.GLTFOverlayOptions[0];
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.GLTFOverlayOptions createFromParcel(android.os.Parcel parcel) {
        com.amap.api.maps.model.LatLng latLng = (com.amap.api.maps.model.LatLng) parcel.readParcelable(com.amap.api.maps.model.LatLng.class.getClassLoader());
        double readDouble = parcel.readDouble();
        double readDouble2 = parcel.readDouble();
        double readDouble3 = parcel.readDouble();
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = new com.amap.api.maps.model.GLTFOverlayOptions(latLng, parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readArrayList(com.amap.api.maps.model.GLTFResourceIterm.class.getClassLoader()));
        gLTFOverlayOptions.rotationDegree(readDouble2, readDouble3, readDouble);
        return gLTFOverlayOptions;
    }
}
