package com.amap.api.services.weather;

/* loaded from: classes.dex */
public class LocalDayWeatherForecast implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.weather.LocalDayWeatherForecast> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.weather.LocalDayWeatherForecast>() { // from class: com.amap.api.services.weather.LocalDayWeatherForecast.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.weather.LocalDayWeatherForecast[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.weather.LocalDayWeatherForecast createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.weather.LocalDayWeatherForecast a(android.os.Parcel parcel) {
            return new com.amap.api.services.weather.LocalDayWeatherForecast(parcel);
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;
    private java.lang.String h;
    private java.lang.String i;
    private java.lang.String j;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LocalDayWeatherForecast() {
    }

    public java.lang.String getDate() {
        return this.a;
    }

    public void setDate(java.lang.String str) {
        this.a = str;
    }

    public java.lang.String getWeek() {
        return this.b;
    }

    public void setWeek(java.lang.String str) {
        this.b = str;
    }

    public java.lang.String getDayWeather() {
        return this.c;
    }

    public void setDayWeather(java.lang.String str) {
        this.c = str;
    }

    public java.lang.String getNightWeather() {
        return this.d;
    }

    public void setNightWeather(java.lang.String str) {
        this.d = str;
    }

    public java.lang.String getDayTemp() {
        return this.e;
    }

    public void setDayTemp(java.lang.String str) {
        this.e = str;
    }

    public java.lang.String getNightTemp() {
        return this.f;
    }

    public void setNightTemp(java.lang.String str) {
        this.f = str;
    }

    public java.lang.String getDayWindDirection() {
        return this.g;
    }

    public void setDayWindDirection(java.lang.String str) {
        this.g = str;
    }

    public java.lang.String getNightWindDirection() {
        return this.h;
    }

    public void setNightWindDirection(java.lang.String str) {
        this.h = str;
    }

    public java.lang.String getDayWindPower() {
        return this.i;
    }

    public void setDayWindPower(java.lang.String str) {
        this.i = str;
    }

    public java.lang.String getNightWindPower() {
        return this.j;
    }

    public void setNightWindPower(java.lang.String str) {
        this.j = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }

    public LocalDayWeatherForecast(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
    }
}
