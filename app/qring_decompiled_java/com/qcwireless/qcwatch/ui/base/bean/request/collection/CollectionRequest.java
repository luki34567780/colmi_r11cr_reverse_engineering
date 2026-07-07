package com.qcwireless.qcwatch.ui.base.bean.request.collection;

/* compiled from: CollectionRequest.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000eHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003Jw\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006/"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/request/collection/CollectionRequest;", "", "deviceName", "", "deviceAddress", "country", "phoneModel", "phoneBrand", "osVersion", "appVersion", "hdVersion", "fwVersion", "userEmail", "uid", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getAppVersion", "()Ljava/lang/String;", "getCountry", "getDeviceAddress", "getDeviceName", "getFwVersion", "getHdVersion", "getOsVersion", "getPhoneBrand", "getPhoneModel", "getUid", "()J", "getUserEmail", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class CollectionRequest {
    private final java.lang.String appVersion;
    private final java.lang.String country;
    private final java.lang.String deviceAddress;
    private final java.lang.String deviceName;
    private final java.lang.String fwVersion;
    private final java.lang.String hdVersion;
    private final java.lang.String osVersion;
    private final java.lang.String phoneBrand;
    private final java.lang.String phoneModel;
    private final long uid;
    private final java.lang.String userEmail;

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getUserEmail() {
        return this.userEmail;
    }

    /* renamed from: component11, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDeviceAddress() {
        return this.deviceAddress;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCountry() {
        return this.country;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPhoneModel() {
        return this.phoneModel;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getPhoneBrand() {
        return this.phoneBrand;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getHdVersion() {
        return this.hdVersion;
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getFwVersion() {
        return this.fwVersion;
    }

    public final com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest copy(java.lang.String deviceName, java.lang.String deviceAddress, java.lang.String country, java.lang.String phoneModel, java.lang.String phoneBrand, java.lang.String osVersion, java.lang.String appVersion, java.lang.String hdVersion, java.lang.String fwVersion, java.lang.String userEmail, long uid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "country");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneModel, "phoneModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneBrand, "phoneBrand");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hdVersion, "hdVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fwVersion, "fwVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        return new com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest(deviceName, deviceAddress, country, phoneModel, phoneBrand, osVersion, appVersion, hdVersion, fwVersion, userEmail, uid);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest collectionRequest = (com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceName, collectionRequest.deviceName) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceAddress, collectionRequest.deviceAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.country, collectionRequest.country) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneModel, collectionRequest.phoneModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneBrand, collectionRequest.phoneBrand) && kotlin.jvm.internal.Intrinsics.areEqual(this.osVersion, collectionRequest.osVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.appVersion, collectionRequest.appVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.hdVersion, collectionRequest.hdVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.fwVersion, collectionRequest.fwVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.userEmail, collectionRequest.userEmail) && this.uid == collectionRequest.uid;
    }

    public int hashCode() {
        return (((((((((((((((((((this.deviceName.hashCode() * 31) + this.deviceAddress.hashCode()) * 31) + this.country.hashCode()) * 31) + this.phoneModel.hashCode()) * 31) + this.phoneBrand.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.hdVersion.hashCode()) * 31) + this.fwVersion.hashCode()) * 31) + this.userEmail.hashCode()) * 31) + com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest$$ExternalSyntheticBackport0.m(this.uid);
    }

    public java.lang.String toString() {
        return "CollectionRequest(deviceName=" + this.deviceName + ", deviceAddress=" + this.deviceAddress + ", country=" + this.country + ", phoneModel=" + this.phoneModel + ", phoneBrand=" + this.phoneBrand + ", osVersion=" + this.osVersion + ", appVersion=" + this.appVersion + ", hdVersion=" + this.hdVersion + ", fwVersion=" + this.fwVersion + ", userEmail=" + this.userEmail + ", uid=" + this.uid + ')';
    }

    public CollectionRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "deviceName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "deviceAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "country");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "phoneModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "phoneBrand");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "osVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "appVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "hdVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "fwVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "userEmail");
        this.deviceName = str;
        this.deviceAddress = str2;
        this.country = str3;
        this.phoneModel = str4;
        this.phoneBrand = str5;
        this.osVersion = str6;
        this.appVersion = str7;
        this.hdVersion = str8;
        this.fwVersion = str9;
        this.userEmail = str10;
        this.uid = j;
    }

    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    public final java.lang.String getCountry() {
        return this.country;
    }

    public final java.lang.String getDeviceAddress() {
        return this.deviceAddress;
    }

    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    public final java.lang.String getFwVersion() {
        return this.fwVersion;
    }

    public final java.lang.String getHdVersion() {
        return this.hdVersion;
    }

    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    public final java.lang.String getPhoneBrand() {
        return this.phoneBrand;
    }

    public final java.lang.String getPhoneModel() {
        return this.phoneModel;
    }

    public final long getUid() {
        return this.uid;
    }

    public final java.lang.String getUserEmail() {
        return this.userEmail;
    }
}
