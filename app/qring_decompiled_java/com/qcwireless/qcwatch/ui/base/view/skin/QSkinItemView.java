package com.qcwireless.qcwatch.ui.base.view.skin;

/* compiled from: QSkinItemView.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/skin/QSkinItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "checkImage", "Landroid/widget/ImageView;", "tvBg", "Landroid/widget/TextView;", "tvTitle", "initView", "", "setCheckStatus", "check", "", "setSkinBg", "drawableId", "setSkinName", "name", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QSkinItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private android.widget.ImageView checkImage;
    private android.widget.TextView tvBg;
    private android.widget.TextView tvTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSkinItemView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSkinItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSkinItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.view.View inflate = androidx.constraintlayout.widget.ConstraintLayout.inflate(context, com.qcwireless.qcwatch.R.layout.view_skin_item, (android.view.ViewGroup) this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(context, R.layout.view_skin_item, this)");
        this.tvTitle = (android.widget.TextView) inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_skin_name);
        this.tvBg = (android.widget.TextView) inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_skin_bg);
        this.checkImage = (android.widget.ImageView) inflate.findViewById(com.qcwireless.qcwatch.R.id.image_skin_check);
    }

    public final void setSkinName(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        android.widget.TextView textView = this.tvTitle;
        kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
        textView.setText(name);
    }

    public final void setSkinBg(int drawableId) {
        android.widget.TextView textView = this.tvBg;
        kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
        textView.setBackgroundResource(drawableId);
    }

    public final void setCheckStatus(boolean check) {
        if (check) {
            android.widget.ImageView imageView = this.checkImage;
            kotlin.jvm.internal.Intrinsics.checkNotNull(imageView);
            imageView.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.qc_check_on);
        } else {
            android.widget.ImageView imageView2 = this.checkImage;
            kotlin.jvm.internal.Intrinsics.checkNotNull(imageView2);
            imageView2.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.qc_check_off);
        }
    }
}
