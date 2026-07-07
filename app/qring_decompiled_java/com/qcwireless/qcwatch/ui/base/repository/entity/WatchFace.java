package com.qcwireless.qcwatch.ui.base.repository.entity;

/* compiled from: WatchFace.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0002\u0010\u0010J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003Jw\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\nHÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001e\u0010\u000e\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001a¨\u0006>"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/entity/WatchFace;", "", "name", "", "hardwareVersion", "preImageUrl", "binUrl", "price", "", "faceType", "", "faceDesc", "localImageUrl", "localBinUrl", "marketVersion", "typeId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getBinUrl", "()Ljava/lang/String;", "setBinUrl", "(Ljava/lang/String;)V", "getFaceDesc", "setFaceDesc", "getFaceType", "()I", "setFaceType", "(I)V", "getHardwareVersion", "setHardwareVersion", "getLocalBinUrl", "setLocalBinUrl", "getLocalImageUrl", "setLocalImageUrl", "getMarketVersion", "setMarketVersion", "getName", "setName", "getPreImageUrl", "setPreImageUrl", "getPrice", "()F", "setPrice", "(F)V", "getTypeId", "setTypeId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class WatchFace {
    private java.lang.String binUrl;
    private java.lang.String faceDesc;
    private int faceType;
    private java.lang.String hardwareVersion;
    private java.lang.String localBinUrl;
    private java.lang.String localImageUrl;
    private int marketVersion;
    private java.lang.String name;
    private java.lang.String preImageUrl;
    private float price;
    private int typeId;

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final int getMarketVersion() {
        return this.marketVersion;
    }

    /* renamed from: component11, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getHardwareVersion() {
        return this.hardwareVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPreImageUrl() {
        return this.preImageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getBinUrl() {
        return this.binUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final float getPrice() {
        return this.price;
    }

    /* renamed from: component6, reason: from getter */
    public final int getFaceType() {
        return this.faceType;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getFaceDesc() {
        return this.faceDesc;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getLocalImageUrl() {
        return this.localImageUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getLocalBinUrl() {
        return this.localBinUrl;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace copy(java.lang.String name, java.lang.String hardwareVersion, java.lang.String preImageUrl, java.lang.String binUrl, float price, int faceType, java.lang.String faceDesc, java.lang.String localImageUrl, java.lang.String localBinUrl, int marketVersion, int typeId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preImageUrl, "preImageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binUrl, "binUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceDesc, "faceDesc");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localImageUrl, "localImageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localBinUrl, "localBinUrl");
        return new com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace(name, hardwareVersion, preImageUrl, binUrl, price, faceType, faceDesc, localImageUrl, localBinUrl, marketVersion, typeId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace = (com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, watchFace.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.hardwareVersion, watchFace.hardwareVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.preImageUrl, watchFace.preImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.binUrl, watchFace.binUrl) && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.valueOf(this.price), java.lang.Float.valueOf(watchFace.price)) && this.faceType == watchFace.faceType && kotlin.jvm.internal.Intrinsics.areEqual(this.faceDesc, watchFace.faceDesc) && kotlin.jvm.internal.Intrinsics.areEqual(this.localImageUrl, watchFace.localImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.localBinUrl, watchFace.localBinUrl) && this.marketVersion == watchFace.marketVersion && this.typeId == watchFace.typeId;
    }

    public int hashCode() {
        return (((((((((((((((((((this.name.hashCode() * 31) + this.hardwareVersion.hashCode()) * 31) + this.preImageUrl.hashCode()) * 31) + this.binUrl.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.price)) * 31) + this.faceType) * 31) + this.faceDesc.hashCode()) * 31) + this.localImageUrl.hashCode()) * 31) + this.localBinUrl.hashCode()) * 31) + this.marketVersion) * 31) + this.typeId;
    }

    public java.lang.String toString() {
        return "WatchFace(name=" + this.name + ", hardwareVersion=" + this.hardwareVersion + ", preImageUrl=" + this.preImageUrl + ", binUrl=" + this.binUrl + ", price=" + this.price + ", faceType=" + this.faceType + ", faceDesc=" + this.faceDesc + ", localImageUrl=" + this.localImageUrl + ", localBinUrl=" + this.localBinUrl + ", marketVersion=" + this.marketVersion + ", typeId=" + this.typeId + ')';
    }

    public WatchFace(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, float f, int i, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "hardwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "preImageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "binUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "faceDesc");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "localImageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "localBinUrl");
        this.name = str;
        this.hardwareVersion = str2;
        this.preImageUrl = str3;
        this.binUrl = str4;
        this.price = f;
        this.faceType = i;
        this.faceDesc = str5;
        this.localImageUrl = str6;
        this.localBinUrl = str7;
        this.marketVersion = i2;
        this.typeId = i3;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final void setName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final java.lang.String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public final void setHardwareVersion(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.hardwareVersion = str;
    }

    public final java.lang.String getPreImageUrl() {
        return this.preImageUrl;
    }

    public final void setPreImageUrl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.preImageUrl = str;
    }

    public final java.lang.String getBinUrl() {
        return this.binUrl;
    }

    public final void setBinUrl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.binUrl = str;
    }

    public final float getPrice() {
        return this.price;
    }

    public final void setPrice(float f) {
        this.price = f;
    }

    public final int getFaceType() {
        return this.faceType;
    }

    public final void setFaceType(int i) {
        this.faceType = i;
    }

    public final java.lang.String getFaceDesc() {
        return this.faceDesc;
    }

    public final void setFaceDesc(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.faceDesc = str;
    }

    public final java.lang.String getLocalImageUrl() {
        return this.localImageUrl;
    }

    public final void setLocalImageUrl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localImageUrl = str;
    }

    public final java.lang.String getLocalBinUrl() {
        return this.localBinUrl;
    }

    public final void setLocalBinUrl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localBinUrl = str;
    }

    public final int getMarketVersion() {
        return this.marketVersion;
    }

    public final void setMarketVersion(int i) {
        this.marketVersion = i;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final void setTypeId(int i) {
        this.typeId = i;
    }
}
