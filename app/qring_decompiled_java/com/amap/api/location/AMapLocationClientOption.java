package com.amap.api.location;

/* loaded from: classes.dex */
public class AMapLocationClientOption implements android.os.Parcelable, java.lang.Cloneable {
    private static int d = 0;
    private static int e = 1;
    private static int f = 2;
    private static int g = 4;
    private boolean A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private float F;
    private com.amap.api.location.AMapLocationClientOption.AMapLocationPurpose G;
    boolean b;
    java.lang.String c;
    private long h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private com.amap.api.location.AMapLocationClientOption.AMapLocationMode o;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private long x;
    private long y;
    private com.amap.api.location.AMapLocationClientOption.GeoLanguage z;
    private static com.amap.api.location.AMapLocationClientOption.AMapLocationProtocol p = com.amap.api.location.AMapLocationClientOption.AMapLocationProtocol.HTTP;
    static java.lang.String a = "";
    public static final android.os.Parcelable.Creator<com.amap.api.location.AMapLocationClientOption> CREATOR = new android.os.Parcelable.Creator<com.amap.api.location.AMapLocationClientOption>() { // from class: com.amap.api.location.AMapLocationClientOption.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.location.AMapLocationClientOption createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.location.AMapLocationClientOption[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.location.AMapLocationClientOption a(android.os.Parcel parcel) {
            return new com.amap.api.location.AMapLocationClientOption(parcel);
        }

        private static com.amap.api.location.AMapLocationClientOption[] a(int i) {
            return new com.amap.api.location.AMapLocationClientOption[i];
        }
    };
    public static boolean OPEN_ALWAYS_SCAN_WIFI = true;
    public static long SCAN_WIFI_INTERVAL = androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;

    public enum AMapLocationMode {
        Battery_Saving,
        Device_Sensors,
        Hight_Accuracy
    }

    public enum AMapLocationPurpose {
        SignIn,
        Transport,
        Sport
    }

    public enum GeoLanguage {
        DEFAULT,
        ZH,
        EN
    }

    public static boolean isDownloadCoordinateConvertLibrary() {
        return false;
    }

    public static void setDownloadCoordinateConvertLibrary(boolean z) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isSelfStartServiceEnable() {
        return this.E;
    }

    public void setSelfStartServiceEnable(boolean z) {
        this.E = z;
    }

    public void setCacheCallBack(boolean z) {
        this.A = z;
    }

    public boolean getCacheCallBack() {
        return this.A;
    }

    public void setCacheCallBackTime(int i) {
        this.B = i;
    }

    public int getCacheCallBackTime() {
        return this.B;
    }

    public void setCacheTimeOut(int i) {
        this.C = i;
    }

    public int getCacheTimeOut() {
        return this.C;
    }

    public enum AMapLocationProtocol {
        HTTP(0),
        HTTPS(1);

        private int a;

        AMapLocationProtocol(int i) {
            this.a = i;
        }

        public final int getValue() {
            return this.a;
        }
    }

    public static java.lang.String getAPIKEY() {
        return a;
    }

    public boolean isMockEnable() {
        return this.k;
    }

    public com.amap.api.location.AMapLocationClientOption setMockEnable(boolean z) {
        this.k = z;
        return this;
    }

    public long getInterval() {
        return this.h;
    }

    public com.amap.api.location.AMapLocationClientOption setInterval(long j) {
        if (j <= 800) {
            j = 800;
        }
        this.h = j;
        return this;
    }

    public boolean isOnceLocation() {
        return this.j;
    }

    public com.amap.api.location.AMapLocationClientOption setOnceLocation(boolean z) {
        this.j = z;
        return this;
    }

    public boolean isNeedAddress() {
        return this.l;
    }

    public com.amap.api.location.AMapLocationClientOption setNeedAddress(boolean z) {
        this.l = z;
        return this;
    }

    public boolean isWifiActiveScan() {
        return this.m;
    }

    public com.amap.api.location.AMapLocationClientOption setWifiActiveScan(boolean z) {
        this.m = z;
        this.n = z;
        return this;
    }

    public boolean isWifiScan() {
        return this.w;
    }

    public com.amap.api.location.AMapLocationClientOption setWifiScan(boolean z) {
        this.w = z;
        if (z) {
            this.m = this.n;
        } else {
            this.m = false;
        }
        return this;
    }

    public com.amap.api.location.AMapLocationClientOption.AMapLocationMode getLocationMode() {
        return this.o;
    }

    public com.amap.api.location.AMapLocationClientOption setLocationMode(com.amap.api.location.AMapLocationClientOption.AMapLocationMode aMapLocationMode) {
        this.o = aMapLocationMode;
        return this;
    }

    public com.amap.api.location.AMapLocationClientOption.AMapLocationProtocol getLocationProtocol() {
        return p;
    }

    public static void setLocationProtocol(com.amap.api.location.AMapLocationClientOption.AMapLocationProtocol aMapLocationProtocol) {
        p = aMapLocationProtocol;
    }

    public boolean isKillProcess() {
        return this.q;
    }

    public com.amap.api.location.AMapLocationClientOption setKillProcess(boolean z) {
        this.q = z;
        return this;
    }

    public boolean isGpsFirst() {
        return this.r;
    }

    public com.amap.api.location.AMapLocationClientOption setGpsFirst(boolean z) {
        this.r = z;
        return this;
    }

    public com.amap.api.location.AMapLocationClientOption setGpsFirstTimeout(long j) {
        if (j < 5000) {
            j = 5000;
        }
        if (j > androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            j = 30000;
        }
        this.y = j;
        return this;
    }

    public long getGpsFirstTimeout() {
        return this.y;
    }

    public boolean isBeidouFirst() {
        return this.D;
    }

    public com.amap.api.location.AMapLocationClientOption setBeidouFirst(boolean z) {
        this.D = z;
        return this;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.amap.api.location.AMapLocationClientOption m182clone() {
        try {
            super.clone();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        return new com.amap.api.location.AMapLocationClientOption().a(this);
    }

    public long getHttpTimeOut() {
        return this.i;
    }

    public com.amap.api.location.AMapLocationClientOption setHttpTimeOut(long j) {
        this.i = j;
        return this;
    }

    public boolean isOffset() {
        return this.s;
    }

    public com.amap.api.location.AMapLocationClientOption setOffset(boolean z) {
        this.s = z;
        return this;
    }

    public boolean isLocationCacheEnable() {
        return this.t;
    }

    public com.amap.api.location.AMapLocationClientOption setLocationCacheEnable(boolean z) {
        this.t = z;
        return this;
    }

    public boolean isOnceLocationLatest() {
        return this.u;
    }

    public com.amap.api.location.AMapLocationClientOption setOnceLocationLatest(boolean z) {
        this.u = z;
        return this;
    }

    public boolean isSensorEnable() {
        return this.v;
    }

    public com.amap.api.location.AMapLocationClientOption setSensorEnable(boolean z) {
        this.v = z;
        return this;
    }

    public com.amap.api.location.AMapLocationClientOption setLastLocationLifeCycle(long j) {
        this.x = j;
        return this;
    }

    public long getLastLocationLifeCycle() {
        return this.x;
    }

    public com.amap.api.location.AMapLocationClientOption.GeoLanguage getGeoLanguage() {
        return this.z;
    }

    public com.amap.api.location.AMapLocationClientOption setGeoLanguage(com.amap.api.location.AMapLocationClientOption.GeoLanguage geoLanguage) {
        this.z = geoLanguage;
        return this;
    }

    public float getDeviceModeDistanceFilter() {
        return this.F;
    }

    public com.amap.api.location.AMapLocationClientOption setDeviceModeDistanceFilter(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.F = f2;
        return this;
    }

    public com.amap.api.location.AMapLocationClientOption setLocationPurpose(com.amap.api.location.AMapLocationClientOption.AMapLocationPurpose aMapLocationPurpose) {
        this.G = aMapLocationPurpose;
        if (aMapLocationPurpose != null) {
            int i = com.amap.api.location.AMapLocationClientOption.AnonymousClass2.a[aMapLocationPurpose.ordinal()];
            if (i == 1) {
                this.o = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
                this.j = true;
                this.u = true;
                this.r = false;
                this.D = false;
                this.k = false;
                this.w = true;
                this.E = true;
                int i2 = d;
                int i3 = e;
                if ((i2 & i3) == 0) {
                    this.b = true;
                    d = i2 | i3;
                    this.c = "signin";
                }
            } else if (i == 2) {
                int i4 = d;
                int i5 = f;
                if ((i4 & i5) == 0) {
                    this.b = true;
                    d = i4 | i5;
                    this.c = androidx.core.app.NotificationCompat.CATEGORY_TRANSPORT;
                }
                this.o = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
                this.j = false;
                this.u = false;
                this.r = true;
                this.D = false;
                this.E = true;
                this.k = false;
                this.w = true;
            } else if (i == 3) {
                int i6 = d;
                int i7 = g;
                if ((i6 & i7) == 0) {
                    this.b = true;
                    d = i6 | i7;
                    this.c = "sport";
                }
                this.o = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
                this.j = false;
                this.u = false;
                this.r = true;
                this.D = false;
                this.E = true;
                this.k = false;
                this.w = true;
            }
        }
        return this;
    }

    /* renamed from: com.amap.api.location.AMapLocationClientOption$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amap.api.location.AMapLocationClientOption.AMapLocationPurpose.values().length];
            a = iArr;
            try {
                iArr[com.amap.api.location.AMapLocationClientOption.AMapLocationPurpose.SignIn.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                a[com.amap.api.location.AMapLocationClientOption.AMapLocationPurpose.Transport.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                a[com.amap.api.location.AMapLocationClientOption.AMapLocationPurpose.Sport.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public com.amap.api.location.AMapLocationClientOption.AMapLocationPurpose getLocationPurpose() {
        return this.G;
    }

    private com.amap.api.location.AMapLocationClientOption a(com.amap.api.location.AMapLocationClientOption aMapLocationClientOption) {
        this.h = aMapLocationClientOption.h;
        this.j = aMapLocationClientOption.j;
        this.o = aMapLocationClientOption.o;
        this.k = aMapLocationClientOption.k;
        this.q = aMapLocationClientOption.q;
        this.r = aMapLocationClientOption.r;
        this.D = aMapLocationClientOption.D;
        this.l = aMapLocationClientOption.l;
        this.m = aMapLocationClientOption.m;
        this.i = aMapLocationClientOption.i;
        this.s = aMapLocationClientOption.s;
        this.t = aMapLocationClientOption.t;
        this.u = aMapLocationClientOption.u;
        this.v = aMapLocationClientOption.isSensorEnable();
        this.w = aMapLocationClientOption.isWifiScan();
        this.x = aMapLocationClientOption.x;
        setLocationProtocol(aMapLocationClientOption.getLocationProtocol());
        this.z = aMapLocationClientOption.z;
        setDownloadCoordinateConvertLibrary(isDownloadCoordinateConvertLibrary());
        this.F = aMapLocationClientOption.F;
        this.G = aMapLocationClientOption.G;
        setOpenAlwaysScanWifi(isOpenAlwaysScanWifi());
        setScanWifiInterval(aMapLocationClientOption.getScanWifiInterval());
        this.y = aMapLocationClientOption.y;
        this.C = aMapLocationClientOption.getCacheTimeOut();
        this.A = aMapLocationClientOption.getCacheCallBack();
        this.B = aMapLocationClientOption.getCacheCallBackTime();
        this.E = aMapLocationClientOption.isSelfStartServiceEnable();
        return this;
    }

    public java.lang.String toString() {
        return "interval:" + java.lang.String.valueOf(this.h) + "#isOnceLocation:" + java.lang.String.valueOf(this.j) + "#locationMode:" + java.lang.String.valueOf(this.o) + "#locationProtocol:" + java.lang.String.valueOf(p) + "#isMockEnable:" + java.lang.String.valueOf(this.k) + "#isKillProcess:" + java.lang.String.valueOf(this.q) + "#isGpsFirst:" + java.lang.String.valueOf(this.r) + "#isBeidouFirst:" + java.lang.String.valueOf(this.D) + "#isSelfStartServiceEnable:" + java.lang.String.valueOf(this.E) + "#isNeedAddress:" + java.lang.String.valueOf(this.l) + "#isWifiActiveScan:" + java.lang.String.valueOf(this.m) + "#wifiScan:" + java.lang.String.valueOf(this.w) + "#httpTimeOut:" + java.lang.String.valueOf(this.i) + "#isLocationCacheEnable:" + java.lang.String.valueOf(this.t) + "#isOnceLocationLatest:" + java.lang.String.valueOf(this.u) + "#sensorEnable:" + java.lang.String.valueOf(this.v) + "#geoLanguage:" + java.lang.String.valueOf(this.z) + "#locationPurpose:" + java.lang.String.valueOf(this.G) + "#callback:" + java.lang.String.valueOf(this.A) + "#time:" + java.lang.String.valueOf(this.B) + "#";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        com.amap.api.location.AMapLocationClientOption.AMapLocationMode aMapLocationMode = this.o;
        parcel.writeInt(aMapLocationMode == null ? -1 : aMapLocationMode.ordinal());
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.w ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.x);
        parcel.writeInt(p == null ? -1 : getLocationProtocol().ordinal());
        com.amap.api.location.AMapLocationClientOption.GeoLanguage geoLanguage = this.z;
        parcel.writeInt(geoLanguage == null ? -1 : geoLanguage.ordinal());
        parcel.writeFloat(this.F);
        com.amap.api.location.AMapLocationClientOption.AMapLocationPurpose aMapLocationPurpose = this.G;
        parcel.writeInt(aMapLocationPurpose != null ? aMapLocationPurpose.ordinal() : -1);
        parcel.writeInt(OPEN_ALWAYS_SCAN_WIFI ? 1 : 0);
        parcel.writeLong(this.y);
    }

    public AMapLocationClientOption() {
        this.h = com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL;
        this.i = com.autonavi.aps.amapapi.utils.b.i;
        this.j = false;
        this.k = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
        this.q = false;
        this.r = false;
        this.s = true;
        this.t = true;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.y = androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.z = com.amap.api.location.AMapLocationClientOption.GeoLanguage.DEFAULT;
        this.A = false;
        this.B = com.google.android.gms.common.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.C = 21600000;
        this.D = false;
        this.E = true;
        this.F = 0.0f;
        this.G = null;
        this.b = false;
        this.c = null;
    }

    protected AMapLocationClientOption(android.os.Parcel parcel) {
        this.h = com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL;
        this.i = com.autonavi.aps.amapapi.utils.b.i;
        this.j = false;
        this.k = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
        this.q = false;
        this.r = false;
        this.s = true;
        this.t = true;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.y = androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.z = com.amap.api.location.AMapLocationClientOption.GeoLanguage.DEFAULT;
        this.A = false;
        this.B = com.google.android.gms.common.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.C = 21600000;
        this.D = false;
        this.E = true;
        this.F = 0.0f;
        this.G = null;
        this.b = false;
        this.c = null;
        this.h = parcel.readLong();
        this.i = parcel.readLong();
        this.j = parcel.readByte() != 0;
        this.k = parcel.readByte() != 0;
        this.l = parcel.readByte() != 0;
        this.m = parcel.readByte() != 0;
        this.n = parcel.readByte() != 0;
        int readInt = parcel.readInt();
        this.o = readInt == -1 ? com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy : com.amap.api.location.AMapLocationClientOption.AMapLocationMode.values()[readInt];
        this.q = parcel.readByte() != 0;
        this.r = parcel.readByte() != 0;
        this.D = parcel.readByte() != 0;
        this.E = parcel.readByte() != 0;
        this.s = parcel.readByte() != 0;
        this.t = parcel.readByte() != 0;
        this.u = parcel.readByte() != 0;
        this.v = parcel.readByte() != 0;
        this.w = parcel.readByte() != 0;
        this.x = parcel.readLong();
        int readInt2 = parcel.readInt();
        p = readInt2 == -1 ? com.amap.api.location.AMapLocationClientOption.AMapLocationProtocol.HTTP : com.amap.api.location.AMapLocationClientOption.AMapLocationProtocol.values()[readInt2];
        int readInt3 = parcel.readInt();
        this.z = readInt3 == -1 ? com.amap.api.location.AMapLocationClientOption.GeoLanguage.DEFAULT : com.amap.api.location.AMapLocationClientOption.GeoLanguage.values()[readInt3];
        this.F = parcel.readFloat();
        int readInt4 = parcel.readInt();
        this.G = readInt4 != -1 ? com.amap.api.location.AMapLocationClientOption.AMapLocationPurpose.values()[readInt4] : null;
        OPEN_ALWAYS_SCAN_WIFI = parcel.readByte() != 0;
        this.y = parcel.readLong();
    }

    public static boolean isOpenAlwaysScanWifi() {
        return OPEN_ALWAYS_SCAN_WIFI;
    }

    public static void setOpenAlwaysScanWifi(boolean z) {
        OPEN_ALWAYS_SCAN_WIFI = z;
    }

    public static void setScanWifiInterval(long j) {
        SCAN_WIFI_INTERVAL = j;
    }

    public long getScanWifiInterval() {
        return SCAN_WIFI_INTERVAL;
    }
}
