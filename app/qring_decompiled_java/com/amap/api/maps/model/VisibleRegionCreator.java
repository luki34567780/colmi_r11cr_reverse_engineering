package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class VisibleRegionCreator implements android.os.Parcelable.Creator<com.amap.api.maps.model.VisibleRegion> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.VisibleRegion createFromParcel(android.os.Parcel parcel) {
        com.amap.api.maps.model.LatLng latLng;
        com.amap.api.maps.model.LatLng latLng2;
        com.amap.api.maps.model.LatLng latLng3;
        com.amap.api.maps.model.LatLng latLng4;
        com.amap.api.maps.model.LatLngBounds latLngBounds;
        int readInt = parcel.readInt();
        try {
            latLng = (com.amap.api.maps.model.LatLng) parcel.readParcelable(com.amap.api.maps.model.LatLng.class.getClassLoader());
        } catch (android.os.BadParcelableException e) {
            e = e;
            latLng = null;
            latLng2 = null;
        }
        try {
            latLng2 = (com.amap.api.maps.model.LatLng) parcel.readParcelable(com.amap.api.maps.model.LatLng.class.getClassLoader());
            try {
                latLng3 = (com.amap.api.maps.model.LatLng) parcel.readParcelable(com.amap.api.maps.model.LatLng.class.getClassLoader());
                try {
                    latLng4 = (com.amap.api.maps.model.LatLng) parcel.readParcelable(com.amap.api.maps.model.LatLng.class.getClassLoader());
                } catch (android.os.BadParcelableException e2) {
                    e = e2;
                    latLng4 = null;
                }
                try {
                    latLngBounds = (com.amap.api.maps.model.LatLngBounds) parcel.readParcelable(com.amap.api.maps.model.LatLngBounds.class.getClassLoader());
                } catch (android.os.BadParcelableException e3) {
                    e = e3;
                    e.printStackTrace();
                    latLngBounds = null;
                    return new com.amap.api.maps.model.VisibleRegion(readInt, latLng, latLng2, latLng3, latLng4, latLngBounds);
                }
            } catch (android.os.BadParcelableException e4) {
                e = e4;
                latLng3 = null;
                latLng4 = latLng3;
                e.printStackTrace();
                latLngBounds = null;
                return new com.amap.api.maps.model.VisibleRegion(readInt, latLng, latLng2, latLng3, latLng4, latLngBounds);
            }
        } catch (android.os.BadParcelableException e5) {
            e = e5;
            latLng2 = null;
            latLng3 = latLng2;
            latLng4 = latLng3;
            e.printStackTrace();
            latLngBounds = null;
            return new com.amap.api.maps.model.VisibleRegion(readInt, latLng, latLng2, latLng3, latLng4, latLngBounds);
        }
        return new com.amap.api.maps.model.VisibleRegion(readInt, latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public com.amap.api.maps.model.VisibleRegion[] newArray(int i) {
        return new com.amap.api.maps.model.VisibleRegion[i];
    }

    static void a(com.amap.api.maps.model.VisibleRegion visibleRegion, android.os.Parcel parcel, int i) {
        parcel.writeInt(visibleRegion.a());
        parcel.writeParcelable(visibleRegion.nearLeft, i);
        parcel.writeParcelable(visibleRegion.nearRight, i);
        parcel.writeParcelable(visibleRegion.farLeft, i);
        parcel.writeParcelable(visibleRegion.farRight, i);
        parcel.writeParcelable(visibleRegion.latLngBounds, i);
    }
}
