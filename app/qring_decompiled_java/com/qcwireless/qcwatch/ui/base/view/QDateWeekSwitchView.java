package com.qcwireless.qcwatch.ui.base.view;

/* compiled from: QDateWeekSwitchView.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\fJ\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u000eR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/QDateWeekSwitchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dateListener", "Lcom/qcwireless/qcwatch/ui/base/view/QDateWeekSwitchView$QDateBefore;", "dateUtil", "Lcom/qcwireless/qc_utils/date/DateUtil;", "endDate", "mAfter", "Landroid/widget/ImageView;", "mBefore", "mTitle", "Landroid/widget/TextView;", "initView", "", "setDateListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setWeekDayStart", "start", "QDateBefore", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QDateWeekSwitchView extends androidx.constraintlayout.widget.ConstraintLayout {
    private com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.QDateBefore dateListener;
    private com.qcwireless.qc_utils.date.DateUtil dateUtil;
    private com.qcwireless.qc_utils.date.DateUtil endDate;
    private android.widget.ImageView mAfter;
    private android.widget.ImageView mBefore;
    private android.widget.TextView mTitle;

    /* compiled from: QDateWeekSwitchView.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/QDateWeekSwitchView$QDateBefore;", "", "clickBefore", "", "boolean", "", "dateUtil", "Lcom/qcwireless/qc_utils/date/DateUtil;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface QDateBefore {
        void clickBefore(boolean r1, com.qcwireless.qc_utils.date.DateUtil dateUtil);
    }

    public final void setWeekDayStart(com.qcwireless.qc_utils.date.DateUtil start) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        this.dateUtil = start;
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(start.getUnixTimestamp(), true);
        this.endDate = dateUtil;
        kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil);
        dateUtil.addDay(6);
        android.widget.TextView textView = this.mTitle;
        kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
        com.qcwireless.qcwatch.base.utils.QcDateUtil getInstance = com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance();
        com.qcwireless.qc_utils.date.DateUtil dateUtil2 = this.dateUtil;
        kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil2);
        com.qcwireless.qc_utils.date.DateUtil dateUtil3 = this.endDate;
        kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil3);
        textView.setText(getInstance.localDateNoYearFormat(dateUtil2, dateUtil3));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(this.mAfter);
    }

    public final void setDateListener(com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.QDateBefore listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.dateListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QDateWeekSwitchView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QDateWeekSwitchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QDateWeekSwitchView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView(android.content.Context context) {
        android.view.View inflate = androidx.constraintlayout.widget.ConstraintLayout.inflate(context, com.qcwireless.qcwatch.R.layout.view_date_switch, (android.view.ViewGroup) this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(context, R.layout.view_date_switch, this)");
        this.mBefore = (android.widget.ImageView) inflate.findViewById(com.qcwireless.qcwatch.R.id.image_before);
        this.mAfter = (android.widget.ImageView) inflate.findViewById(com.qcwireless.qcwatch.R.id.image_next);
        this.mTitle = (android.widget.TextView) inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_date_title);
        android.widget.ImageView imageView = this.mBefore;
        kotlin.jvm.internal.Intrinsics.checkNotNull(imageView);
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.m582initView$lambda1(com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.this, view);
            }
        });
        android.widget.ImageView imageView2 = this.mAfter;
        kotlin.jvm.internal.Intrinsics.checkNotNull(imageView2);
        imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.m583initView$lambda3(com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m582initView$lambda1(com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView qDateWeekSwitchView, android.view.View view) {
        com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.QDateBefore qDateBefore;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qDateWeekSwitchView, "this$0");
        if (qDateWeekSwitchView.dateUtil != null) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(qDateWeekSwitchView.mAfter);
            com.qcwireless.qc_utils.date.DateUtil dateUtil = qDateWeekSwitchView.dateUtil;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil);
            dateUtil.addDay(-7);
            com.qcwireless.qc_utils.date.DateUtil dateUtil2 = qDateWeekSwitchView.dateUtil;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil2);
            com.qcwireless.qc_utils.date.DateUtil dateUtil3 = new com.qcwireless.qc_utils.date.DateUtil(dateUtil2.getUnixTimestamp(), true);
            qDateWeekSwitchView.endDate = dateUtil3;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil3);
            dateUtil3.addDay(6);
            android.widget.TextView textView = qDateWeekSwitchView.mTitle;
            kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
            com.qcwireless.qcwatch.base.utils.QcDateUtil getInstance = com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance();
            com.qcwireless.qc_utils.date.DateUtil dateUtil4 = qDateWeekSwitchView.dateUtil;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil4);
            com.qcwireless.qc_utils.date.DateUtil dateUtil5 = qDateWeekSwitchView.endDate;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil5);
            textView.setText(getInstance.localDateNoYearFormat(dateUtil4, dateUtil5));
        }
        com.qcwireless.qc_utils.date.DateUtil dateUtil6 = qDateWeekSwitchView.dateUtil;
        if (dateUtil6 == null || (qDateBefore = qDateWeekSwitchView.dateListener) == null) {
            return;
        }
        qDateBefore.clickBefore(true, dateUtil6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-3, reason: not valid java name */
    public static final void m583initView$lambda3(com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView qDateWeekSwitchView, android.view.View view) {
        com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.QDateBefore qDateBefore;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qDateWeekSwitchView, "this$0");
        com.qcwireless.qc_utils.date.DateUtil dateUtil = qDateWeekSwitchView.dateUtil;
        if (dateUtil != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil);
            dateUtil.addDay(7);
            com.qcwireless.qc_utils.date.DateUtil dateUtil2 = qDateWeekSwitchView.dateUtil;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil2);
            com.qcwireless.qc_utils.date.DateUtil dateUtil3 = new com.qcwireless.qc_utils.date.DateUtil(dateUtil2.getUnixTimestamp(), true);
            qDateWeekSwitchView.endDate = dateUtil3;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil3);
            dateUtil3.addDay(6);
            android.widget.TextView textView = qDateWeekSwitchView.mTitle;
            kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
            com.qcwireless.qcwatch.base.utils.QcDateUtil getInstance = com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance();
            com.qcwireless.qc_utils.date.DateUtil dateUtil4 = qDateWeekSwitchView.dateUtil;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil4);
            com.qcwireless.qc_utils.date.DateUtil dateUtil5 = qDateWeekSwitchView.endDate;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil5);
            textView.setText(getInstance.localDateNoYearFormat(dateUtil4, dateUtil5));
            long zeroTime = com.qcwireless.qc_utils.date.DateUtil.firstDayOfWeek().getZeroTime();
            com.qcwireless.qc_utils.date.DateUtil dateUtil6 = qDateWeekSwitchView.dateUtil;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil6);
            if (zeroTime == dateUtil6.getZeroTime()) {
                com.qcwireless.qcwatch.base.view.ViewKt.gone(qDateWeekSwitchView.mAfter);
            }
        }
        com.qcwireless.qc_utils.date.DateUtil dateUtil7 = qDateWeekSwitchView.dateUtil;
        if (dateUtil7 == null || (qDateBefore = qDateWeekSwitchView.dateListener) == null) {
            return;
        }
        qDateBefore.clickBefore(false, dateUtil7);
    }
}
