package com.qcwireless.qcwatch.ui.device.push.bean;

/* compiled from: SoftwarePush.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/bean/SoftwarePush;", "", "name", "", "packageName", "switch", "", "icon", "Landroid/graphics/drawable/Drawable;", "(Ljava/lang/String;Ljava/lang/String;ZLandroid/graphics/drawable/Drawable;)V", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "getName", "()Ljava/lang/String;", "getPackageName", "getSwitch", "()Z", "setSwitch", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class SoftwarePush {
    private android.graphics.drawable.Drawable icon;
    private final java.lang.String name;
    private final java.lang.String packageName;
    private boolean switch;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush copy$default(com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush softwarePush, java.lang.String str, java.lang.String str2, boolean z, android.graphics.drawable.Drawable drawable, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = softwarePush.name;
        }
        if ((i & 2) != 0) {
            str2 = softwarePush.packageName;
        }
        if ((i & 4) != 0) {
            z = softwarePush.switch;
        }
        if ((i & 8) != 0) {
            drawable = softwarePush.icon;
        }
        return softwarePush.copy(str, str2, z, drawable);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSwitch() {
        return this.switch;
    }

    /* renamed from: component4, reason: from getter */
    public final android.graphics.drawable.Drawable getIcon() {
        return this.icon;
    }

    public final com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush copy(java.lang.String name, java.lang.String packageName, boolean r4, android.graphics.drawable.Drawable icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "icon");
        return new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(name, packageName, r4, icon);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush softwarePush = (com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, softwarePush.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.packageName, softwarePush.packageName) && this.switch == softwarePush.switch && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, softwarePush.icon);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.packageName.hashCode()) * 31;
        boolean z = this.switch;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.icon.hashCode();
    }

    public java.lang.String toString() {
        return "SoftwarePush(name=" + this.name + ", packageName=" + this.packageName + ", switch=" + this.switch + ", icon=" + this.icon + ')';
    }

    public SoftwarePush(java.lang.String str, java.lang.String str2, boolean z, android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "packageName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "icon");
        this.name = str;
        this.packageName = str2;
        this.switch = z;
        this.icon = drawable;
    }

    public /* synthetic */ SoftwarePush(java.lang.String str, java.lang.String str2, boolean z, android.graphics.drawable.Drawable drawable, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, drawable);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    public final boolean getSwitch() {
        return this.switch;
    }

    public final void setSwitch(boolean z) {
        this.switch = z;
    }

    public final android.graphics.drawable.Drawable getIcon() {
        return this.icon;
    }

    public final void setIcon(android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "<set-?>");
        this.icon = drawable;
    }
}
