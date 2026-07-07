package com.qcwireless.qcwatch.ui.base.bean.device;

/* compiled from: AlarmBean.kt */
@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013¨\u0006)"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/device/AlarmBean;", "", "index", "", "time", "title", "", "switch", "", "week", "default", "(IILjava/lang/String;ZIZ)V", "getDefault", "()Z", "setDefault", "(Z)V", "getIndex", "()I", "setIndex", "(I)V", "getSwitch", "setSwitch", "getTime", "setTime", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getWeek", "setWeek", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class AlarmBean {
    private boolean default;
    private int index;
    private boolean switch;
    private int time;
    private java.lang.String title;
    private int week;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean copy$default(com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean alarmBean, int i, int i2, java.lang.String str, boolean z, int i3, boolean z2, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = alarmBean.index;
        }
        if ((i4 & 2) != 0) {
            i2 = alarmBean.time;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            str = alarmBean.title;
        }
        java.lang.String str2 = str;
        if ((i4 & 8) != 0) {
            z = alarmBean.switch;
        }
        boolean z3 = z;
        if ((i4 & 16) != 0) {
            i3 = alarmBean.week;
        }
        int i6 = i3;
        if ((i4 & 32) != 0) {
            z2 = alarmBean.default;
        }
        return alarmBean.copy(i, i5, str2, z3, i6, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSwitch() {
        return this.switch;
    }

    /* renamed from: component5, reason: from getter */
    public final int getWeek() {
        return this.week;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDefault() {
        return this.default;
    }

    public final com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean copy(int index, int time, java.lang.String title, boolean r12, int week, boolean r14) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        return new com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean(index, time, title, r12, week, r14);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean alarmBean = (com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean) other;
        return this.index == alarmBean.index && this.time == alarmBean.time && kotlin.jvm.internal.Intrinsics.areEqual(this.title, alarmBean.title) && this.switch == alarmBean.switch && this.week == alarmBean.week && this.default == alarmBean.default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.index * 31) + this.time) * 31) + this.title.hashCode()) * 31;
        boolean z = this.switch;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + this.week) * 31;
        boolean z2 = this.default;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public java.lang.String toString() {
        return "AlarmBean(index=" + this.index + ", time=" + this.time + ", title=" + this.title + ", switch=" + this.switch + ", week=" + this.week + ", default=" + this.default + ')';
    }

    public AlarmBean(int i, int i2, java.lang.String str, boolean z, int i3, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        this.index = i;
        this.time = i2;
        this.title = str;
        this.switch = z;
        this.week = i3;
        this.default = z2;
    }

    public /* synthetic */ AlarmBean(int i, int i2, java.lang.String str, boolean z, int i3, boolean z2, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, z, i3, (i4 & 32) != 0 ? false : z2);
    }

    public final int getIndex() {
        return this.index;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final int getTime() {
        return this.time;
    }

    public final void setTime(int i) {
        this.time = i;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final void setTitle(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final boolean getSwitch() {
        return this.switch;
    }

    public final void setSwitch(boolean z) {
        this.switch = z;
    }

    public final int getWeek() {
        return this.week;
    }

    public final void setWeek(int i) {
        this.week = i;
    }

    public final boolean getDefault() {
        return this.default;
    }

    public final void setDefault(boolean z) {
        this.default = z;
    }
}
