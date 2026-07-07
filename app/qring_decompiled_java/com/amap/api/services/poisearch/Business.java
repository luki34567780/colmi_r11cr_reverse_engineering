package com.amap.api.services.poisearch;

/* loaded from: classes.dex */
public class Business implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.poisearch.Business> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.poisearch.Business>() { // from class: com.amap.api.services.poisearch.Business.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.poisearch.Business createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.poisearch.Business[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.poisearch.Business a(android.os.Parcel parcel) {
            return new com.amap.api.services.poisearch.Business(parcel);
        }

        private static com.amap.api.services.poisearch.Business[] a(int i) {
            return new com.amap.api.services.poisearch.Business[i];
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

    public Business(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    public java.lang.String getBusinessArea() {
        return this.a;
    }

    public java.lang.String getOpentimeToday() {
        return this.b;
    }

    public java.lang.String getOpentimeWeek() {
        return this.c;
    }

    public java.lang.String getTel() {
        return this.d;
    }

    public java.lang.String getTag() {
        return this.e;
    }

    public java.lang.String getmRating() {
        return this.f;
    }

    public java.lang.String getCost() {
        return this.g;
    }

    public java.lang.String getParkingType() {
        return this.h;
    }

    public java.lang.String getAlias() {
        return this.i;
    }

    public java.lang.String getCPID() {
        return this.j;
    }

    public void setCPID(java.lang.String str) {
        this.j = str;
    }

    protected Business(android.os.Parcel parcel) {
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
}
