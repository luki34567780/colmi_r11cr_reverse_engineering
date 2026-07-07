package com.qcwireless.qcwatch.ui.base.view;

/* compiled from: QDateYearSwitchView.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000eR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/QDateYearSwitchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dateListener", "Lcom/qcwireless/qcwatch/ui/base/view/QDateYearSwitchView$QDateBefore;", "dateUtil", "Lcom/qcwireless/qc_utils/date/DateUtil;", "mAfter", "Landroid/widget/ImageView;", "mBefore", "mTitle", "Landroid/widget/TextView;", "initView", "", "setDateListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setMonth", "start", "QDateBefore", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QDateYearSwitchView extends androidx.constraintlayout.widget.ConstraintLayout {
    private com.qcwireless.qcwatch.ui.base.view.QDateYearSwitchView.QDateBefore dateListener;
    private com.qcwireless.qc_utils.date.DateUtil dateUtil;
    private android.widget.ImageView mAfter;
    private android.widget.ImageView mBefore;
    private android.widget.TextView mTitle;

    /* compiled from: QDateYearSwitchView.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/QDateYearSwitchView$QDateBefore;", "", "clickBefore", "", "boolean", "", "dateUtil", "Lcom/qcwireless/qc_utils/date/DateUtil;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface QDateBefore {
        void clickBefore(boolean r1, com.qcwireless.qc_utils.date.DateUtil dateUtil);
    }

    public final void setMonth(com.qcwireless.qc_utils.date.DateUtil start) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        this.dateUtil = start;
        android.widget.TextView textView = this.mTitle;
        kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
        com.qcwireless.qc_utils.date.DateUtil dateUtil = this.dateUtil;
        kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil);
        textView.setText(java.lang.String.valueOf(dateUtil.getYear()));
    }

    public final void setDateListener(com.qcwireless.qcwatch.ui.base.view.QDateYearSwitchView.QDateBefore listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.dateListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QDateYearSwitchView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QDateYearSwitchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QDateYearSwitchView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
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
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.base.view.QDateYearSwitchView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.base.view.QDateYearSwitchView.m584initView$lambda1(com.qcwireless.qcwatch.ui.base.view.QDateYearSwitchView.this, view);
            }
        });
        android.widget.ImageView imageView2 = this.mAfter;
        kotlin.jvm.internal.Intrinsics.checkNotNull(imageView2);
        imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.base.view.QDateYearSwitchView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.base.view.QDateYearSwitchView.m585initView$lambda3(com.qcwireless.qcwatch.ui.base.view.QDateYearSwitchView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m584initView$lambda1(com.qcwireless.qcwatch.ui.base.view.QDateYearSwitchView qDateYearSwitchView, android.view.View view) {
        com.qcwireless.qcwatch.ui.base.view.QDateYearSwitchView.QDateBefore qDateBefore;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qDateYearSwitchView, "this$0");
        com.qcwireless.qc_utils.date.DateUtil dateUtil = qDateYearSwitchView.dateUtil;
        if (dateUtil != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil);
            dateUtil.addMonth(-12);
            android.widget.TextView textView = qDateYearSwitchView.mTitle;
            kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
            com.qcwireless.qc_utils.date.DateUtil dateUtil2 = qDateYearSwitchView.dateUtil;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil2);
            textView.setText(java.lang.String.valueOf(dateUtil2.getYear()));
        }
        com.qcwireless.qc_utils.date.DateUtil dateUtil3 = qDateYearSwitchView.dateUtil;
        if (dateUtil3 == null || (qDateBefore = qDateYearSwitchView.dateListener) == null) {
            return;
        }
        qDateBefore.clickBefore(true, dateUtil3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-3, reason: not valid java name */
    public static final void m585initView$lambda3(com.qcwireless.qcwatch.ui.base.view.QDateYearSwitchView qDateYearSwitchView, android.view.View view) {
        com.qcwireless.qcwatch.ui.base.view.QDateYearSwitchView.QDateBefore qDateBefore;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qDateYearSwitchView, "this$0");
        com.qcwireless.qc_utils.date.DateUtil dateUtil = qDateYearSwitchView.dateUtil;
        if (dateUtil != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil);
            dateUtil.addMonth(12);
            android.widget.TextView textView = qDateYearSwitchView.mTitle;
            kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
            com.qcwireless.qc_utils.date.DateUtil dateUtil2 = qDateYearSwitchView.dateUtil;
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil2);
            textView.setText(java.lang.String.valueOf(dateUtil2.getYear()));
        }
        com.qcwireless.qc_utils.date.DateUtil dateUtil3 = qDateYearSwitchView.dateUtil;
        if (dateUtil3 == null || (qDateBefore = qDateYearSwitchView.dateListener) == null) {
            return;
        }
        qDateBefore.clickBefore(false, dateUtil3);
    }
}
