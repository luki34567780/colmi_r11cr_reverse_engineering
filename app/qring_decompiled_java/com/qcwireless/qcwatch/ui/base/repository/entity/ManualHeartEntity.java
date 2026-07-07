package com.qcwireless.qcwatch.ui.base.repository.entity;

/* compiled from: ManualHeartEntity.kt */
@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/entity/ManualHeartEntity;", "", "mac", "", "dateStr", "content", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDateStr", "getMac", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class ManualHeartEntity {
    private final java.lang.String content;
    private final java.lang.String dateStr;
    private final java.lang.String mac;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.entity.ManualHeartEntity copy$default(com.qcwireless.qcwatch.ui.base.repository.entity.ManualHeartEntity manualHeartEntity, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = manualHeartEntity.mac;
        }
        if ((i & 2) != 0) {
            str2 = manualHeartEntity.dateStr;
        }
        if ((i & 4) != 0) {
            str3 = manualHeartEntity.content;
        }
        return manualHeartEntity.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMac() {
        return this.mac;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDateStr() {
        return this.dateStr;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getContent() {
        return this.content;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.ManualHeartEntity copy(java.lang.String mac, java.lang.String dateStr, java.lang.String content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateStr, "dateStr");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        return new com.qcwireless.qcwatch.ui.base.repository.entity.ManualHeartEntity(mac, dateStr, content);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.repository.entity.ManualHeartEntity)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.ManualHeartEntity manualHeartEntity = (com.qcwireless.qcwatch.ui.base.repository.entity.ManualHeartEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.mac, manualHeartEntity.mac) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateStr, manualHeartEntity.dateStr) && kotlin.jvm.internal.Intrinsics.areEqual(this.content, manualHeartEntity.content);
    }

    public int hashCode() {
        return (((this.mac.hashCode() * 31) + this.dateStr.hashCode()) * 31) + this.content.hashCode();
    }

    public java.lang.String toString() {
        return "ManualHeartEntity(mac=" + this.mac + ", dateStr=" + this.dateStr + ", content=" + this.content + ')';
    }

    public ManualHeartEntity(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "dateStr");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "content");
        this.mac = str;
        this.dateStr = str2;
        this.content = str3;
    }

    public final java.lang.String getMac() {
        return this.mac;
    }

    public final java.lang.String getDateStr() {
        return this.dateStr;
    }

    public final java.lang.String getContent() {
        return this.content;
    }
}
