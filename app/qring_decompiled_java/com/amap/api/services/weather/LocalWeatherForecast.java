package com.amap.api.services.weather;

/* loaded from: classes.dex */
public class LocalWeatherForecast implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.weather.LocalWeatherForecast> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.weather.LocalWeatherForecast>() { // from class: com.amap.api.services.weather.LocalWeatherForecast.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.weather.LocalWeatherForecast[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.weather.LocalWeatherForecast createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.weather.LocalWeatherForecast a(android.os.Parcel parcel) {
            return new com.amap.api.services.weather.LocalWeatherForecast(parcel);
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.util.List<com.amap.api.services.weather.LocalDayWeatherForecast> e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LocalWeatherForecast() {
        this.e = new java.util.ArrayList();
    }

    public java.lang.String getProvince() {
        return this.a;
    }

    public void setProvince(java.lang.String str) {
        this.a = str;
    }

    public java.lang.String getCity() {
        return this.b;
    }

    public void setCity(java.lang.String str) {
        this.b = str;
    }

    public java.lang.String getAdCode() {
        return this.c;
    }

    public void setAdCode(java.lang.String str) {
        this.c = str;
    }

    public java.lang.String getReportTime() {
        return this.d;
    }

    public void setReportTime(java.lang.String str) {
        this.d = str;
    }

    public java.util.List<com.amap.api.services.weather.LocalDayWeatherForecast> getWeatherForecast() {
        return this.e;
    }

    public void setWeatherForecast(java.util.List<com.amap.api.services.weather.LocalDayWeatherForecast> list) {
        this.e = list;
    }

    public LocalWeatherForecast(android.os.Parcel parcel) {
        this.e = new java.util.ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readArrayList(com.amap.api.services.weather.LocalWeatherForecast.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeList(this.e);
    }
}
