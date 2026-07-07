package com.qcwireless.qcwatch.ui.base.bean.request.user;

/* compiled from: FindPwdRequest.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/request/user/FindPwdRequest;", "", com.google.android.gms.common.Scopes.EMAIL, "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class FindPwdRequest {
    private final java.lang.String email;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.request.user.FindPwdRequest copy$default(com.qcwireless.qcwatch.ui.base.bean.request.user.FindPwdRequest findPwdRequest, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = findPwdRequest.email;
        }
        return findPwdRequest.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    public final com.qcwireless.qcwatch.ui.base.bean.request.user.FindPwdRequest copy(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, com.google.android.gms.common.Scopes.EMAIL);
        return new com.qcwireless.qcwatch.ui.base.bean.request.user.FindPwdRequest(email);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.qcwireless.qcwatch.ui.base.bean.request.user.FindPwdRequest) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, ((com.qcwireless.qcwatch.ui.base.bean.request.user.FindPwdRequest) other).email);
    }

    public int hashCode() {
        return this.email.hashCode();
    }

    public java.lang.String toString() {
        return "FindPwdRequest(email=" + this.email + ')';
    }

    public FindPwdRequest(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.google.android.gms.common.Scopes.EMAIL);
        this.email = str;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }
}
