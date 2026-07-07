package com.qcwireless.qcwatch.ui.home.healthy.bean;

/* compiled from: DFUInformationBean.kt */
@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/bean/DFUInformationBean;", "", "()V", "downloadUrl", "", "getDownloadUrl", "()Ljava/lang/String;", "setDownloadUrl", "(Ljava/lang/String;)V", "hardwareVersion", "getHardwareVersion", "setHardwareVersion", "isEnforceUpdate", "", "()I", "setEnforceUpdate", "(I)V", "lastVersion", "getLastVersion", "setLastVersion", "openOrNot", "getOpenOrNot", "setOpenOrNot", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DFUInformationBean {
    private java.lang.String hardwareVersion = "";
    private java.lang.String lastVersion = "";
    private int isEnforceUpdate = 1;
    private java.lang.String downloadUrl = "";
    private int openOrNot = 1;

    public final java.lang.String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public final void setHardwareVersion(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.hardwareVersion = str;
    }

    public final java.lang.String getLastVersion() {
        return this.lastVersion;
    }

    public final void setLastVersion(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastVersion = str;
    }

    /* renamed from: isEnforceUpdate, reason: from getter */
    public final int getIsEnforceUpdate() {
        return this.isEnforceUpdate;
    }

    public final void setEnforceUpdate(int i) {
        this.isEnforceUpdate = i;
    }

    public final java.lang.String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final void setDownloadUrl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.downloadUrl = str;
    }

    public final int getOpenOrNot() {
        return this.openOrNot;
    }

    public final void setOpenOrNot(int i) {
        this.openOrNot = i;
    }
}
