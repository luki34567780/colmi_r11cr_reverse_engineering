package com.qcwireless.qcwatch.ui.base.view.sport;

/* compiled from: QSportDetailItem.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0002J \u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0012R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/sport/QSportDetailItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lskin/support/widget/SkinCompatSupportable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "drawableTitleId", "icon", "Landroid/widget/ImageView;", "mSkinCompatBackgroundHelper", "Lskin/support/widget/SkinCompatBackgroundHelper;", "titleStr", "", "titleText", "Landroid/widget/TextView;", "unitStr", "unitText", "valueText", "applySkin", "", "applyTopBarBackgroundColor", "getCustomStyle", "initView", "setTextMarquee", "setUnit", "text", "setValue", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QSportDetailItem extends androidx.constraintlayout.widget.ConstraintLayout implements skin.support.widget.SkinCompatSupportable {
    private int drawableTitleId;
    private android.widget.ImageView icon;
    private skin.support.widget.SkinCompatBackgroundHelper mSkinCompatBackgroundHelper;
    private java.lang.String titleStr;
    private android.widget.TextView titleText;
    private java.lang.String unitStr;
    private android.widget.TextView unitText;
    private android.widget.TextView valueText;

    private final void applyTopBarBackgroundColor() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSportDetailItem(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.titleStr = "";
        this.unitStr = "";
        getCustomStyle(context, null, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSportDetailItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.titleStr = "";
        this.unitStr = "";
        getCustomStyle(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSportDetailItem(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.titleStr = "";
        this.unitStr = "";
        getCustomStyle(context, attributeSet, i);
    }

    public final void getCustomStyle(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        android.widget.TextView textView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.QSportDetailView);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…yleable.QSportDetailView)");
        int indexCount = obtainStyledAttributes.getIndexCount();
        int i = 0;
        while (true) {
            textView = null;
            if (i >= indexCount) {
                break;
            }
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.drawableTitleId = obtainStyledAttributes.getResourceId(0, 0);
            } else if (index == 1) {
                this.titleStr = java.lang.String.valueOf(obtainStyledAttributes.getString(index));
                android.widget.TextView textView2 = this.titleText;
                if (textView2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("titleText");
                } else {
                    textView = textView2;
                }
                textView.setText(this.titleStr);
            } else if (index == 2) {
                this.unitStr = java.lang.String.valueOf(obtainStyledAttributes.getString(index));
                android.widget.TextView textView3 = this.unitText;
                if (textView3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("unitText");
                } else {
                    textView = textView3;
                }
                textView.setText(this.unitStr);
            }
            i++;
        }
        obtainStyledAttributes.recycle();
        android.widget.ImageView imageView = this.icon;
        if (imageView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("icon");
            imageView = null;
        }
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = new skin.support.widget.SkinCompatBackgroundHelper(imageView);
        this.mSkinCompatBackgroundHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attrs, defStyleAttr);
        android.widget.TextView textView4 = this.mSkinCompatBackgroundHelper;
        if (textView4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mSkinCompatBackgroundHelper");
        } else {
            textView = textView4;
        }
        textView.onSetBackgroundResource(this.drawableTitleId);
    }

    public final void setValue(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        android.widget.TextView textView = this.valueText;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("valueText");
            textView = null;
        }
        textView.setText(text);
    }

    public final void setUnit(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        android.widget.TextView textView = this.unitText;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("unitText");
            textView = null;
        }
        textView.setText(text);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView(android.content.Context context) {
        android.view.View inflate = androidx.constraintlayout.widget.ConstraintLayout.inflate(context, com.qcwireless.qcwatch.R.layout.sport_detail_item, (android.view.ViewGroup) this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(context, R.layout.sport_detail_item, this)");
        android.view.View findViewById = inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_item_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "mView.findViewById(R.id.tv_item_title)");
        this.titleText = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.qcwireless.qcwatch.R.id.image_item);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "mView.findViewById(R.id.image_item)");
        this.icon = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_item_value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "mView.findViewById(R.id.tv_item_value)");
        this.valueText = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_item_value_unit);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "mView.findViewById(R.id.tv_item_value_unit)");
        this.unitText = (android.widget.TextView) findViewById4;
        setTextMarquee();
    }

    private final void setTextMarquee() {
        android.widget.TextView textView = this.titleText;
        android.widget.TextView textView2 = null;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("titleText");
            textView = null;
        }
        textView.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
        android.widget.TextView textView3 = this.titleText;
        if (textView3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("titleText");
            textView3 = null;
        }
        textView3.setSingleLine();
        android.widget.TextView textView4 = this.titleText;
        if (textView4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("titleText");
            textView4 = null;
        }
        textView4.setSelected(true);
        android.widget.TextView textView5 = this.titleText;
        if (textView5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("titleText");
            textView5 = null;
        }
        textView5.setFocusable(true);
        android.widget.TextView textView6 = this.titleText;
        if (textView6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("titleText");
            textView6 = null;
        }
        textView6.setFocusableInTouchMode(true);
        android.widget.TextView textView7 = this.unitText;
        if (textView7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("unitText");
            textView7 = null;
        }
        textView7.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
        android.widget.TextView textView8 = this.unitText;
        if (textView8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("unitText");
            textView8 = null;
        }
        textView8.setSingleLine();
        android.widget.TextView textView9 = this.unitText;
        if (textView9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("unitText");
            textView9 = null;
        }
        textView9.setSelected(true);
        android.widget.TextView textView10 = this.unitText;
        if (textView10 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("unitText");
            textView10 = null;
        }
        textView10.setFocusable(true);
        android.widget.TextView textView11 = this.unitText;
        if (textView11 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("unitText");
        } else {
            textView2 = textView11;
        }
        textView2.setFocusableInTouchMode(true);
    }

    public void applySkin() {
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mSkinCompatBackgroundHelper;
        if (skinCompatBackgroundHelper == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mSkinCompatBackgroundHelper");
            skinCompatBackgroundHelper = null;
        }
        skinCompatBackgroundHelper.applySkin();
    }
}
