package com.qcwireless.qcwatch.ui.base.view;

/* compiled from: QDateSwitchView.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001fB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\fJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/QDateSwitchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dateListener", "Lcom/qcwireless/qcwatch/ui/base/view/QDateSwitchView$QDateBefore;", "dateUtil", "Lcom/qcwireless/qc_utils/date/DateUtil;", "mAfter", "Landroid/widget/ImageView;", "mBefore", "mTitle", "Landroid/widget/TextView;", "sportFlag", "", "getSportFlag", "()Z", "setSportFlag", "(Z)V", "initView", "", "setDateListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setDateUtil", "QDateBefore", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QDateSwitchView extends androidx.constraintlayout.widget.ConstraintLayout {
    private com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore dateListener;
    private com.qcwireless.qc_utils.date.DateUtil dateUtil;
    private android.widget.ImageView mAfter;
    private android.widget.ImageView mBefore;
    private android.widget.TextView mTitle;
    private boolean sportFlag;

    /* compiled from: QDateSwitchView.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/QDateSwitchView$QDateBefore;", "", "clickBefore", "", "boolean", "", "dateUtil", "Lcom/qcwireless/qc_utils/date/DateUtil;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface QDateBefore {
        void clickBefore(boolean r1, com.qcwireless.qc_utils.date.DateUtil dateUtil);
    }

    public final boolean getSportFlag() {
        return this.sportFlag;
    }

    public final void setSportFlag(boolean z) {
        this.sportFlag = z;
    }

    public final void setDateUtil(com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
        if (dateUtil.getZeroTime() > new com.qcwireless.qc_utils.date.DateUtil().getZeroTime()) {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(this.mAfter);
            return;
        }
        if (dateUtil.isToday() || com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().sportIsToday(dateUtil)) {
            this.dateUtil = dateUtil;
            if (this.sportFlag) {
                android.widget.TextView textView = this.mTitle;
                kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
                textView.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormatSport(dateUtil));
            } else {
                android.widget.TextView textView2 = this.mTitle;
                kotlin.jvm.internal.Intrinsics.checkNotNull(textView2);
                textView2.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(dateUtil));
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(this.mAfter);
            return;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(this.mAfter);
        this.dateUtil = dateUtil;
        if (this.sportFlag) {
            android.widget.TextView textView3 = this.mTitle;
            kotlin.jvm.internal.Intrinsics.checkNotNull(textView3);
            textView3.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormatSport(dateUtil));
        } else {
            android.widget.TextView textView4 = this.mTitle;
            kotlin.jvm.internal.Intrinsics.checkNotNull(textView4);
            textView4.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(dateUtil));
        }
    }

    public final void setDateListener(com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.dateListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QDateSwitchView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QDateSwitchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QDateSwitchView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
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
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.base.view.QDateSwitchView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.m579initView$lambda1(com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.this, view);
            }
        });
        android.widget.ImageView imageView2 = this.mAfter;
        kotlin.jvm.internal.Intrinsics.checkNotNull(imageView2);
        imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.base.view.QDateSwitchView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.m580initView$lambda3(com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m579initView$lambda1(com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView, android.view.View view) {
        com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore qDateBefore;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qDateSwitchView, "this$0");
        com.qcwireless.qc_utils.date.DateUtil dateUtil = qDateSwitchView.dateUtil;
        if (dateUtil != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil);
            dateUtil.addDay(-1);
            if (qDateSwitchView.sportFlag) {
                android.widget.TextView textView = qDateSwitchView.mTitle;
                kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
                com.qcwireless.qcwatch.base.utils.QcDateUtil getInstance = com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance();
                com.qcwireless.qc_utils.date.DateUtil dateUtil2 = qDateSwitchView.dateUtil;
                kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil2);
                textView.setText(getInstance.localDateFormatSport(dateUtil2));
            } else {
                android.widget.TextView textView2 = qDateSwitchView.mTitle;
                kotlin.jvm.internal.Intrinsics.checkNotNull(textView2);
                com.qcwireless.qcwatch.base.utils.QcDateUtil getInstance2 = com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance();
                com.qcwireless.qc_utils.date.DateUtil dateUtil3 = qDateSwitchView.dateUtil;
                kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil3);
                textView2.setText(getInstance2.localDateFormat(dateUtil3));
            }
        }
        com.qcwireless.qc_utils.date.DateUtil dateUtil4 = qDateSwitchView.dateUtil;
        if (dateUtil4 == null || (qDateBefore = qDateSwitchView.dateListener) == null) {
            return;
        }
        qDateBefore.clickBefore(true, dateUtil4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-3, reason: not valid java name */
    public static final void m580initView$lambda3(com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView, android.view.View view) {
        com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore qDateBefore;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qDateSwitchView, "this$0");
        com.qcwireless.qc_utils.date.DateUtil dateUtil = qDateSwitchView.dateUtil;
        if (dateUtil != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil);
            dateUtil.addDay(1);
            if (qDateSwitchView.sportFlag) {
                android.widget.TextView textView = qDateSwitchView.mTitle;
                kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
                com.qcwireless.qcwatch.base.utils.QcDateUtil getInstance = com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance();
                com.qcwireless.qc_utils.date.DateUtil dateUtil2 = qDateSwitchView.dateUtil;
                kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil2);
                textView.setText(getInstance.localDateFormatSport(dateUtil2));
            } else {
                android.widget.TextView textView2 = qDateSwitchView.mTitle;
                kotlin.jvm.internal.Intrinsics.checkNotNull(textView2);
                com.qcwireless.qcwatch.base.utils.QcDateUtil getInstance2 = com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance();
                com.qcwireless.qc_utils.date.DateUtil dateUtil3 = qDateSwitchView.dateUtil;
                kotlin.jvm.internal.Intrinsics.checkNotNull(dateUtil3);
                textView2.setText(getInstance2.localDateFormat(dateUtil3));
            }
        }
        com.qcwireless.qc_utils.date.DateUtil dateUtil4 = qDateSwitchView.dateUtil;
        if (dateUtil4 == null || (qDateBefore = qDateSwitchView.dateListener) == null) {
            return;
        }
        qDateBefore.clickBefore(false, dateUtil4);
    }
}
