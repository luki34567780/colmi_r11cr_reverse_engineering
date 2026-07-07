package com.qcwireless.qcwatch.ui.base.api;

/* compiled from: QcResponse.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000e\u0010\u0012\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/api/QcResponse;", "T", "", "retCode", "", "message", "", "data", "(ILjava/lang/String;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getRetCode", "()I", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Object;)Lcom/qcwireless/qcwatch/ui/base/api/QcResponse;", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class QcResponse<T> {
    private final T data;
    private final java.lang.String message;
    private final int retCode;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.api.QcResponse copy$default(com.qcwireless.qcwatch.ui.base.api.QcResponse qcResponse, int i, java.lang.String str, java.lang.Object obj, int i2, java.lang.Object obj2) {
        if ((i2 & 1) != 0) {
            i = qcResponse.retCode;
        }
        if ((i2 & 2) != 0) {
            str = qcResponse.message;
        }
        if ((i2 & 4) != 0) {
            obj = qcResponse.data;
        }
        return qcResponse.copy(i, str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRetCode() {
        return this.retCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final T component3() {
        return this.data;
    }

    public final com.qcwireless.qcwatch.ui.base.api.QcResponse<T> copy(int retCode, java.lang.String message, T data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        return new com.qcwireless.qcwatch.ui.base.api.QcResponse<>(retCode, message, data);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.api.QcResponse)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.api.QcResponse qcResponse = (com.qcwireless.qcwatch.ui.base.api.QcResponse) other;
        return this.retCode == qcResponse.retCode && kotlin.jvm.internal.Intrinsics.areEqual(this.message, qcResponse.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, qcResponse.data);
    }

    public int hashCode() {
        int hashCode = ((this.retCode * 31) + this.message.hashCode()) * 31;
        T t = this.data;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public java.lang.String toString() {
        return "QcResponse(retCode=" + this.retCode + ", message=" + this.message + ", data=" + this.data + ')';
    }

    public QcResponse(int i, java.lang.String str, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "message");
        this.retCode = i;
        this.message = str;
        this.data = t;
    }

    public final T getData() {
        return this.data;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final int getRetCode() {
        return this.retCode;
    }
}
