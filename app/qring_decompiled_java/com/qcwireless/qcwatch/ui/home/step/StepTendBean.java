package com.qcwireless.qcwatch.ui.home.step;

/* compiled from: StepTendBean.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/StepTendBean;", "", "title", "", "select", "", "dateUtil", "Lcom/qcwireless/qc_utils/date/DateUtil;", "(Ljava/lang/String;ZLcom/qcwireless/qc_utils/date/DateUtil;)V", "getDateUtil", "()Lcom/qcwireless/qc_utils/date/DateUtil;", "setDateUtil", "(Lcom/qcwireless/qc_utils/date/DateUtil;)V", "getSelect", "()Z", "setSelect", "(Z)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class StepTendBean {
    private com.qcwireless.qc_utils.date.DateUtil dateUtil;
    private boolean select;
    private java.lang.String title;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.home.step.StepTendBean copy$default(com.qcwireless.qcwatch.ui.home.step.StepTendBean stepTendBean, java.lang.String str, boolean z, com.qcwireless.qc_utils.date.DateUtil dateUtil, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = stepTendBean.title;
        }
        if ((i & 2) != 0) {
            z = stepTendBean.select;
        }
        if ((i & 4) != 0) {
            dateUtil = stepTendBean.dateUtil;
        }
        return stepTendBean.copy(str, z, dateUtil);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSelect() {
        return this.select;
    }

    /* renamed from: component3, reason: from getter */
    public final com.qcwireless.qc_utils.date.DateUtil getDateUtil() {
        return this.dateUtil;
    }

    public final com.qcwireless.qcwatch.ui.home.step.StepTendBean copy(java.lang.String title, boolean select, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
        return new com.qcwireless.qcwatch.ui.home.step.StepTendBean(title, select, dateUtil);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.home.step.StepTendBean)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.home.step.StepTendBean stepTendBean = (com.qcwireless.qcwatch.ui.home.step.StepTendBean) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, stepTendBean.title) && this.select == stepTendBean.select && kotlin.jvm.internal.Intrinsics.areEqual(this.dateUtil, stepTendBean.dateUtil);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        boolean z = this.select;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.dateUtil.hashCode();
    }

    public java.lang.String toString() {
        return "StepTendBean(title=" + this.title + ", select=" + this.select + ", dateUtil=" + this.dateUtil + ')';
    }

    public StepTendBean(java.lang.String str, boolean z, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
        this.title = str;
        this.select = z;
        this.dateUtil = dateUtil;
    }

    public final com.qcwireless.qc_utils.date.DateUtil getDateUtil() {
        return this.dateUtil;
    }

    public final boolean getSelect() {
        return this.select;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final void setDateUtil(com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "<set-?>");
        this.dateUtil = dateUtil;
    }

    public final void setSelect(boolean z) {
        this.select = z;
    }

    public final void setTitle(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }
}
