package com.qcwireless.qcwatch.ui.base.view;

/* compiled from: QSleepAnalysisView.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0015J\u0016\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0015R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/QSleepAnalysisView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tvStatus", "Landroid/widget/TextView;", "tvUnit1", "tvUnit2", "tvValue", "tvValue2", "initView", "", "setStatus", "status", "", "drawable", "Landroid/graphics/drawable/Drawable;", "setStatusNull", "setTitleValue", "text", "setValue2", "setValueAndUnit2", "unit", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QSleepAnalysisView extends androidx.constraintlayout.widget.ConstraintLayout {
    private android.widget.TextView tvStatus;
    private android.widget.TextView tvUnit1;
    private android.widget.TextView tvUnit2;
    private android.widget.TextView tvValue;
    private android.widget.TextView tvValue2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSleepAnalysisView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSleepAnalysisView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSleepAnalysisView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView(android.content.Context context, android.util.AttributeSet attrs) {
        android.view.View inflate = androidx.constraintlayout.widget.ConstraintLayout.inflate(context, com.qcwireless.qcwatch.R.layout.view_sleep_analysis, (android.view.ViewGroup) this);
        android.view.View findViewById = inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_sleep_hour);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tv_sleep_hour)");
        this.tvValue = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_sleep_status);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.tv_sleep_status)");
        this.tvStatus = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_sleep_unit_h);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.tv_sleep_unit_h)");
        this.tvUnit1 = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_sleep_unit_min);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.tv_sleep_unit_min)");
        this.tvUnit2 = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_sleep_min);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.tv_sleep_min)");
        this.tvValue2 = (android.widget.TextView) findViewById5;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_sleep_total_time);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_1);
        android.view.View view = (androidx.constraintlayout.widget.Group) inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_detail_group);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.QSleepItem);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.QSleepItem)");
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index != 0) {
                if (index == 1) {
                    textView2.setText(obtainStyledAttributes.getString(index));
                } else if (index == 2) {
                    textView.setText(obtainStyledAttributes.getString(index));
                } else if (index == 3) {
                    java.lang.String string = obtainStyledAttributes.getString(index);
                    android.widget.TextView textView3 = this.tvUnit1;
                    if (textView3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tvUnit1");
                        textView3 = null;
                    }
                    textView3.setText(string);
                }
            } else if (obtainStyledAttributes.getBoolean(index, false)) {
                com.qcwireless.qcwatch.base.view.ViewKt.visible(view);
            } else {
                com.qcwireless.qcwatch.base.view.ViewKt.gone(view);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void setTitleValue(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        android.widget.TextView textView = this.tvValue;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tvValue");
            textView = null;
        }
        textView.setText(text);
    }

    public final void setValue2(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        android.widget.TextView textView = this.tvValue2;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tvValue2");
            textView = null;
        }
        textView.setText(text);
    }

    public final void setValueAndUnit2(java.lang.String text, java.lang.String unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        android.widget.TextView textView = this.tvValue2;
        android.widget.TextView textView2 = null;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tvValue2");
            textView = null;
        }
        textView.setText(text);
        android.widget.TextView textView3 = this.tvUnit2;
        if (textView3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tvUnit2");
        } else {
            textView2 = textView3;
        }
        textView2.setText(unit);
    }

    public final void setStatus(java.lang.String status, android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "drawable");
        android.widget.TextView textView = this.tvStatus;
        android.widget.TextView textView2 = null;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tvStatus");
            textView = null;
        }
        textView.setText(status);
        android.widget.TextView textView3 = this.tvStatus;
        if (textView3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tvStatus");
        } else {
            textView2 = textView3;
        }
        textView2.setBackground(drawable);
    }

    public final void setStatusNull(java.lang.String status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        android.widget.TextView textView = this.tvStatus;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tvStatus");
            textView = null;
        }
        textView.setText(status);
        android.widget.TextView textView2 = this.tvStatus;
        if (textView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tvStatus");
            textView2 = null;
        }
        textView2.setBackground(null);
    }
}
