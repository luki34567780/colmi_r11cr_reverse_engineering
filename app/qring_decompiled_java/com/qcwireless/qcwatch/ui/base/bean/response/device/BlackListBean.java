package com.qcwireless.qcwatch.ui.base.bean.response.device;

/* compiled from: BlackListBean.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/response/device/BlackListBean;", "", "address", "", "status", "", "(Ljava/lang/String;I)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getStatus", "()I", "setStatus", "(I)V", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class BlackListBean {
    private java.lang.String address;
    private int status;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.response.device.BlackListBean copy$default(com.qcwireless.qcwatch.ui.base.bean.response.device.BlackListBean blackListBean, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = blackListBean.address;
        }
        if ((i2 & 2) != 0) {
            i = blackListBean.status;
        }
        return blackListBean.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final com.qcwireless.qcwatch.ui.base.bean.response.device.BlackListBean copy(java.lang.String address, int status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
        return new com.qcwireless.qcwatch.ui.base.bean.response.device.BlackListBean(address, status);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.bean.response.device.BlackListBean)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.bean.response.device.BlackListBean blackListBean = (com.qcwireless.qcwatch.ui.base.bean.response.device.BlackListBean) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.address, blackListBean.address) && this.status == blackListBean.status;
    }

    public int hashCode() {
        return (this.address.hashCode() * 31) + this.status;
    }

    public java.lang.String toString() {
        return "BlackListBean(address=" + this.address + ", status=" + this.status + ')';
    }

    public BlackListBean(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "address");
        this.address = str;
        this.status = i;
    }

    public final java.lang.String getAddress() {
        return this.address;
    }

    public final void setAddress(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }
}
