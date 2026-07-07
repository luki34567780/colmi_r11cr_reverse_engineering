package com.qcwireless.qcwatch.ui.base.bean.weather;

/* compiled from: MyLocationBean.kt */
@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/weather/MyLocationBean;", "", "longitude", "", "latitude", "language", "", "city", "address", "(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getCity", "getLanguage", "getLatitude", "()F", "getLongitude", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class MyLocationBean {
    private final java.lang.String address;
    private final java.lang.String city;
    private final java.lang.String language;
    private final float latitude;
    private final float longitude;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean copy$default(com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean myLocationBean, float f, float f2, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = myLocationBean.longitude;
        }
        if ((i & 2) != 0) {
            f2 = myLocationBean.latitude;
        }
        float f3 = f2;
        if ((i & 4) != 0) {
            str = myLocationBean.language;
        }
        java.lang.String str4 = str;
        if ((i & 8) != 0) {
            str2 = myLocationBean.city;
        }
        java.lang.String str5 = str2;
        if ((i & 16) != 0) {
            str3 = myLocationBean.address;
        }
        return myLocationBean.copy(f, f3, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final float getLongitude() {
        return this.longitude;
    }

    /* renamed from: component2, reason: from getter */
    public final float getLatitude() {
        return this.latitude;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLanguage() {
        return this.language;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCity() {
        return this.city;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAddress() {
        return this.address;
    }

    public final com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean copy(float longitude, float latitude, java.lang.String language, java.lang.String city, java.lang.String address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(city, "city");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
        return new com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean(longitude, latitude, language, city, address);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean myLocationBean = (com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.valueOf(this.longitude), java.lang.Float.valueOf(myLocationBean.longitude)) && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.valueOf(this.latitude), java.lang.Float.valueOf(myLocationBean.latitude)) && kotlin.jvm.internal.Intrinsics.areEqual(this.language, myLocationBean.language) && kotlin.jvm.internal.Intrinsics.areEqual(this.city, myLocationBean.city) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, myLocationBean.address);
    }

    public int hashCode() {
        return (((((((java.lang.Float.floatToIntBits(this.longitude) * 31) + java.lang.Float.floatToIntBits(this.latitude)) * 31) + this.language.hashCode()) * 31) + this.city.hashCode()) * 31) + this.address.hashCode();
    }

    public java.lang.String toString() {
        return "MyLocationBean(longitude=" + this.longitude + ", latitude=" + this.latitude + ", language=" + this.language + ", city=" + this.city + ", address=" + this.address + ')';
    }

    public MyLocationBean(float f, float f2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "language");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "city");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "address");
        this.longitude = f;
        this.latitude = f2;
        this.language = str;
        this.city = str2;
        this.address = str3;
    }

    public final java.lang.String getAddress() {
        return this.address;
    }

    public final java.lang.String getCity() {
        return this.city;
    }

    public final java.lang.String getLanguage() {
        return this.language;
    }

    public final float getLatitude() {
        return this.latitude;
    }

    public final float getLongitude() {
        return this.longitude;
    }
}
