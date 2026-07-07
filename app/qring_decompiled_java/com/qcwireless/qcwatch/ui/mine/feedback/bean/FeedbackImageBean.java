package com.qcwireless.qcwatch.ui.mine.feedback.bean;

/* compiled from: FeedbackImageBean.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/feedback/bean/FeedbackImageBean;", "", "path", "", "add", "", "(Ljava/lang/String;Z)V", "getAdd", "()Z", "getPath", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class FeedbackImageBean {
    private final boolean add;
    private final java.lang.String path;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean copy$default(com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean feedbackImageBean, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = feedbackImageBean.path;
        }
        if ((i & 2) != 0) {
            z = feedbackImageBean.add;
        }
        return feedbackImageBean.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAdd() {
        return this.add;
    }

    public final com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean copy(java.lang.String path, boolean add) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        return new com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean(path, add);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean feedbackImageBean = (com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.path, feedbackImageBean.path) && this.add == feedbackImageBean.add;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.path.hashCode() * 31;
        boolean z = this.add;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public java.lang.String toString() {
        return "FeedbackImageBean(path=" + this.path + ", add=" + this.add + ')';
    }

    public FeedbackImageBean(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "path");
        this.path = str;
        this.add = z;
    }

    public final boolean getAdd() {
        return this.add;
    }

    public final java.lang.String getPath() {
        return this.path;
    }
}
