package com.qcwireless.qcwatch.ui.base.view;

/* compiled from: QSportItemView.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000fR\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/QSportItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tvSize", "tvTitle", "Landroid/widget/TextView;", "tvUnit", "", "tvUnitView", "getCustomStyle", "", "initView", "setItemTitle", "text", "setItemUnit", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QSportItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private int tvSize;
    private android.widget.TextView tvTitle;
    private java.lang.String tvUnit;
    private android.widget.TextView tvUnitView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSportItemView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.tvUnit = "";
        initView(context);
        getCustomStyle(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSportItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.tvUnit = "";
        initView(context);
        getCustomStyle(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSportItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.tvUnit = "";
        initView(context);
        getCustomStyle(context, attributeSet);
    }

    private final void getCustomStyle(android.content.Context context, android.util.AttributeSet attrs) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.QSportItem);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.QSportItem)");
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            android.widget.TextView textView = null;
            if (index == 0) {
                this.tvSize = obtainStyledAttributes.getInteger(0, 18);
                android.widget.TextView textView2 = this.tvTitle;
                if (textView2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
                } else {
                    textView = textView2;
                }
                textView.setTextSize(this.tvSize);
            } else if (index == 1) {
                android.widget.TextView textView3 = this.tvTitle;
                if (textView3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
                } else {
                    textView = textView3;
                }
                textView.setText(java.lang.String.valueOf(obtainStyledAttributes.getString(index)));
            } else if (index == 2) {
                this.tvUnit = java.lang.String.valueOf(obtainStyledAttributes.getString(index));
                android.widget.TextView textView4 = this.tvUnitView;
                if (textView4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tvUnitView");
                } else {
                    textView = textView4;
                }
                textView.setText(this.tvUnit);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView(android.content.Context context) {
        android.view.View inflate = androidx.constraintlayout.widget.ConstraintLayout.inflate(context, com.qcwireless.qcwatch.R.layout.qc_sport_item, (android.view.ViewGroup) this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(context, R.layout.qc_sport_item, this)");
        android.view.View findViewById = inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "mView.findViewById(R.id.tv_2)");
        this.tvUnitView = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "mView.findViewById(R.id.tv_1)");
        this.tvTitle = (android.widget.TextView) findViewById2;
    }

    public final void setItemTitle(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        android.widget.TextView textView = this.tvTitle;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
            textView = null;
        }
        textView.setText(text);
    }

    public final void setItemUnit(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        android.widget.TextView textView = this.tvUnitView;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("tvUnitView");
            textView = null;
        }
        textView.setText(text);
    }
}
