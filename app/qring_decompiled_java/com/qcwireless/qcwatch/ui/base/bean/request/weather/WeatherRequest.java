package com.qcwireless.qcwatch.ui.base.bean.request.weather;

/* compiled from: WeatherRequest.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/request/weather/WeatherRequest;", "", "longitude", "", "latitude", "language", "", "city", "(FFLjava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getLanguage", "getLatitude", "()F", "getLongitude", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class WeatherRequest {
    private final java.lang.String city;
    private final java.lang.String language;
    private final float latitude;
    private final float longitude;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.request.weather.WeatherRequest copy$default(com.qcwireless.qcwatch.ui.base.bean.request.weather.WeatherRequest weatherRequest, float f, float f2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = weatherRequest.longitude;
        }
        if ((i & 2) != 0) {
            f2 = weatherRequest.latitude;
        }
        if ((i & 4) != 0) {
            str = weatherRequest.language;
        }
        if ((i & 8) != 0) {
            str2 = weatherRequest.city;
        }
        return weatherRequest.copy(f, f2, str, str2);
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

    public final com.qcwireless.qcwatch.ui.base.bean.request.weather.WeatherRequest copy(float longitude, float latitude, java.lang.String language, java.lang.String city) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(city, "city");
        return new com.qcwireless.qcwatch.ui.base.bean.request.weather.WeatherRequest(longitude, latitude, language, city);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.bean.request.weather.WeatherRequest)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.bean.request.weather.WeatherRequest weatherRequest = (com.qcwireless.qcwatch.ui.base.bean.request.weather.WeatherRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.valueOf(this.longitude), java.lang.Float.valueOf(weatherRequest.longitude)) && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.valueOf(this.latitude), java.lang.Float.valueOf(weatherRequest.latitude)) && kotlin.jvm.internal.Intrinsics.areEqual(this.language, weatherRequest.language) && kotlin.jvm.internal.Intrinsics.areEqual(this.city, weatherRequest.city);
    }

    public int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.longitude) * 31) + java.lang.Float.floatToIntBits(this.latitude)) * 31) + this.language.hashCode()) * 31) + this.city.hashCode();
    }

    public java.lang.String toString() {
        return "WeatherRequest(longitude=" + this.longitude + ", latitude=" + this.latitude + ", language=" + this.language + ", city=" + this.city + ')';
    }

    public WeatherRequest(float f, float f2, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "language");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "city");
        this.longitude = f;
        this.latitude = f2;
        this.language = str;
        this.city = str2;
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
