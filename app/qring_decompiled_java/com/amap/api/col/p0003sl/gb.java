package com.amap.api.col.p0003sl;

/* compiled from: NearbyUpdateHandler.java */
/* loaded from: classes.dex */
public final class gb extends com.amap.api.col.p0003sl.ff<com.amap.api.services.nearby.UploadInfo, java.lang.Integer> {
    private android.content.Context g;
    private com.amap.api.services.nearby.UploadInfo h;

    @Override // com.amap.api.col.p0003sl.ff, com.amap.api.col.p0003sl.fe
    protected final /* synthetic */ java.lang.Object a(java.lang.String str) throws com.amap.api.services.core.AMapException {
        return f();
    }

    public gb(android.content.Context context, com.amap.api.services.nearby.UploadInfo uploadInfo) {
        super(context, uploadInfo);
        this.g = context;
        this.h = uploadInfo;
    }

    @Override // com.amap.api.col.p0003sl.ff, com.amap.api.col.p0003sl.fe
    protected final java.lang.String c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(com.amap.api.col.p0003sl.ie.f(this.g));
        stringBuffer.append("&userid=");
        stringBuffer.append(this.h.getUserID());
        com.amap.api.services.core.LatLonPoint point = this.h.getPoint();
        int longitude = (int) (point.getLongitude() * 1000000.0d);
        int latitude = (int) (point.getLatitude() * 1000000.0d);
        stringBuffer.append("&location=");
        stringBuffer.append(longitude / 1000000.0f);
        stringBuffer.append(",");
        stringBuffer.append(latitude / 1000000.0f);
        stringBuffer.append("&coordtype=");
        stringBuffer.append(this.h.getCoordType());
        return stringBuffer.toString();
    }

    private static java.lang.Integer f() throws com.amap.api.services.core.AMapException {
        return 0;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.lang.String getURL() {
        return com.amap.api.col.p0003sl.fm.d() + "/nearby/data/create";
    }
}
