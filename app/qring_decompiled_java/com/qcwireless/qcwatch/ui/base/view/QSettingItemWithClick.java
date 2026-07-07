package com.qcwireless.qcwatch.ui.base.view;

/* compiled from: QSettingItemWithClick.kt */
@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001MB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u000207H\u0002J\u0010\u00109\u001a\u0002072\u0006\u0010:\u001a\u00020\nH\u0002J\"\u0010;\u001a\u0002072\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010<\u001a\u0004\u0018\u00010)J\u0010\u0010=\u001a\u0002072\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010>\u001a\u0002072\u0006\u0010?\u001a\u00020\rJ\u000e\u0010@\u001a\u0002072\u0006\u0010?\u001a\u00020\rJ\u000e\u0010A\u001a\u0002072\u0006\u0010B\u001a\u00020\u0012J\u0010\u0010C\u001a\u0002072\b\u0010D\u001a\u0004\u0018\u00010\u0016J\u0010\u0010E\u001a\u0002072\b\u0010D\u001a\u0004\u0018\u00010\u0016J\u0006\u0010F\u001a\u000207J\u000e\u0010G\u001a\u0002072\u0006\u0010H\u001a\u00020IJ\u0010\u0010J\u001a\u0002072\b\u0010D\u001a\u0004\u0018\u00010\u0016J\u0010\u0010K\u001a\u0002072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010L\u001a\u0002072\u0006\u0010#\u001a\u00020\nH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/QSettingItemWithClick;", "Lskin/support/constraint/SkinCompatConstraintLayout;", "Lskin/support/widget/SkinCompatSupportable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mChecked", "", "mIvLeftIcon", "Landroid/widget/ImageView;", "mIvRightIcon", "mLeftIcon", "Landroid/graphics/drawable/Drawable;", "mLeftIconId", "mLeftIconSzie", "mLeftSubText", "", "mLeftText", "mLeftTextColorId", "mOnLSettingItemClick", "Lcom/qcwireless/qcwatch/ui/base/view/QSettingItemWithClick$OnLSettingItemWithClick;", "mRightIcon", "mRightIconId", "mRightIcon_check", "Landroidx/appcompat/widget/AppCompatCheckBox;", "mRightIcon_switch", "Lcom/qcwireless/qcwatch/ui/base/view/QSwitchView;", "mRightLayout", "Landroid/widget/FrameLayout;", "mRightStyle", "mRightTextColor", "mRightTextColorId", "mRightTextSize", "", "mRootLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mSkinCompatBackgroundHelper", "Lskin/support/widget/SkinCompatBackgroundHelper;", "mSkinCompatBackgroundHelper1", "mTextColor", "mTextSize", "mToast", "Landroid/widget/TextView;", "mTvLeftSubText", "mTvLeftText", "mTvRightText", "mUnderLine", "Landroid/view/View;", "applySkin", "", "applyTopBarBackgroundColor", "clickOn", com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID, "getCustomStyle", "getmRootLayout", "initView", "setChecked", "checked", "setCheckedAble", "setLeftIcon", "drawable", "setLeftSubText", "info", "setLeftText", "setOff", "setQSettingItemCheckListener", "mOnCheckChangeListener", "Lcom/qcwireless/qcwatch/ui/base/view/QSwitchView$OnSwitchStateChangeListener;", "setRightText", "setmOnLSettingItemWithClick", "switchRightStyle", "OnLSettingItemWithClick", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QSettingItemWithClick extends skin.support.constraint.SkinCompatConstraintLayout implements skin.support.widget.SkinCompatSupportable {
    private boolean mChecked;
    private android.widget.ImageView mIvLeftIcon;
    private android.widget.ImageView mIvRightIcon;
    private android.graphics.drawable.Drawable mLeftIcon;
    private int mLeftIconId;
    private int mLeftIconSzie;
    private java.lang.String mLeftSubText;
    private java.lang.String mLeftText;
    private int mLeftTextColorId;
    private com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick.OnLSettingItemWithClick mOnLSettingItemClick;
    private android.graphics.drawable.Drawable mRightIcon;
    private int mRightIconId;
    private androidx.appcompat.widget.AppCompatCheckBox mRightIcon_check;
    private com.qcwireless.qcwatch.ui.base.view.QSwitchView mRightIcon_switch;
    private android.widget.FrameLayout mRightLayout;
    private int mRightStyle;
    private int mRightTextColor;
    private int mRightTextColorId;
    private float mRightTextSize;
    private androidx.constraintlayout.widget.ConstraintLayout mRootLayout;
    private skin.support.widget.SkinCompatBackgroundHelper mSkinCompatBackgroundHelper;
    private skin.support.widget.SkinCompatBackgroundHelper mSkinCompatBackgroundHelper1;
    private int mTextColor;
    private final int mTextSize;
    private final android.widget.TextView mToast;
    private android.widget.TextView mTvLeftSubText;
    private android.widget.TextView mTvLeftText;
    private android.widget.TextView mTvRightText;
    private final android.view.View mUnderLine;

    /* compiled from: QSettingItemWithClick.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/QSettingItemWithClick$OnLSettingItemWithClick;", "", "click", "", com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID, "", "isChecked", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnLSettingItemWithClick {
        void click(int id, boolean isChecked);
    }

    public final void setmOnLSettingItemWithClick(com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick.OnLSettingItemWithClick mOnLSettingItemClick) {
        this.mOnLSettingItemClick = mOnLSettingItemClick;
    }

    public final void setQSettingItemCheckListener(com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener mOnCheckChangeListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mOnCheckChangeListener, "mOnCheckChangeListener");
        com.qcwireless.qcwatch.ui.base.view.QSwitchView qSwitchView = this.mRightIcon_switch;
        kotlin.jvm.internal.Intrinsics.checkNotNull(qSwitchView);
        qSwitchView.setOnSwitchStateChangeListener(mOnCheckChangeListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSettingItemWithClick(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        getCustomStyle(context, null, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSettingItemWithClick(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        getCustomStyle(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QSettingItemWithClick(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        getCustomStyle(context, attributeSet, i);
    }

    public final void getCustomStyle(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.QSettingView);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…R.styleable.QSettingView)");
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (index) {
                case 2:
                    this.mLeftTextColorId = obtainStyledAttributes.getResourceId(2, 0);
                    this.mTextColor = obtainStyledAttributes.getColor(index, -3355444);
                    android.widget.TextView textView = this.mTvLeftText;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
                    textView.setTextColor(this.mTextColor);
                    break;
                case 3:
                    float f = obtainStyledAttributes.getFloat(index, 16.0f);
                    android.widget.TextView textView2 = this.mTvLeftText;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(textView2);
                    textView2.setTextSize(f);
                    break;
                case 4:
                    if (obtainStyledAttributes.getBoolean(index, false)) {
                        android.widget.TextView textView3 = this.mTvRightText;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(textView3);
                        textView3.setVisibility(0);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (obtainStyledAttributes.getBoolean(index, false)) {
                        android.widget.TextView textView4 = this.mTvLeftSubText;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(textView4);
                        textView4.setVisibility(0);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (obtainStyledAttributes.getBoolean(index, true)) {
                        break;
                    } else {
                        android.view.View view = this.mUnderLine;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(view);
                        view.setVisibility(8);
                        break;
                    }
                case 7:
                    this.mLeftIcon = obtainStyledAttributes.getDrawable(index);
                    this.mLeftIconId = obtainStyledAttributes.getResourceId(7, 0);
                    if (this.mLeftIcon != null) {
                        android.widget.ImageView imageView = this.mIvLeftIcon;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(imageView);
                        imageView.setVisibility(0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    this.mLeftIconSzie = (int) obtainStyledAttributes.getDimension(index, 16.0f);
                    android.widget.ImageView imageView2 = this.mIvLeftIcon;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(imageView2);
                    android.view.ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                    java.util.Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    android.view.ViewGroup.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
                    ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams2).width = this.mLeftIconSzie;
                    ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams2).height = this.mLeftIconSzie;
                    android.widget.ImageView imageView3 = this.mIvLeftIcon;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(imageView3);
                    imageView3.setLayoutParams(layoutParams2);
                    break;
                case 9:
                    this.mLeftSubText = obtainStyledAttributes.getString(index);
                    android.widget.TextView textView5 = this.mTvLeftSubText;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(textView5);
                    textView5.setText(this.mLeftSubText);
                    break;
                case 10:
                    this.mLeftText = obtainStyledAttributes.getString(index);
                    android.widget.TextView textView6 = this.mTvLeftText;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(textView6);
                    textView6.setText(this.mLeftText);
                    break;
                case 11:
                    int dimension = (int) obtainStyledAttributes.getDimension(index, 8.0f);
                    android.widget.TextView textView7 = this.mTvLeftText;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(textView7);
                    android.view.ViewGroup.LayoutParams layoutParams3 = textView7.getLayoutParams();
                    java.util.Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    android.view.ViewGroup.LayoutParams layoutParams4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams3;
                    ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams4).leftMargin = dimension;
                    android.widget.TextView textView8 = this.mTvLeftText;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(textView8);
                    textView8.setLayoutParams(layoutParams4);
                    break;
                case 12:
                    this.mRightIconId = obtainStyledAttributes.getResourceId(12, 0);
                    this.mRightIcon = obtainStyledAttributes.getDrawable(index);
                    break;
                case 13:
                    this.mRightStyle = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 14:
                    android.widget.TextView textView9 = this.mTvRightText;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(textView9);
                    textView9.setText(obtainStyledAttributes.getString(index));
                    break;
                case 15:
                    this.mRightTextColor = obtainStyledAttributes.getColor(index, -7829368);
                    this.mRightTextColorId = obtainStyledAttributes.getResourceId(15, 0);
                    break;
                case 16:
                    this.mRightTextSize = obtainStyledAttributes.getFloat(index, 14.0f);
                    android.widget.TextView textView10 = this.mTvRightText;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(textView10);
                    textView10.setTextSize(this.mRightTextSize);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        switchRightStyle(this.mRightStyle);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.mRootLayout;
        kotlin.jvm.internal.Intrinsics.checkNotNull(constraintLayout);
        constraintLayout.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick.m592getCustomStyle$lambda0(com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick.this, view2);
            }
        });
        androidx.appcompat.widget.AppCompatCheckBox appCompatCheckBox = this.mRightIcon_check;
        kotlin.jvm.internal.Intrinsics.checkNotNull(appCompatCheckBox);
        appCompatCheckBox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick.m593getCustomStyle$lambda1(com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick.this, compoundButton, z);
            }
        });
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = new skin.support.widget.SkinCompatBackgroundHelper(this.mIvLeftIcon);
        this.mSkinCompatBackgroundHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attrs, defStyleAttr);
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper2 = this.mSkinCompatBackgroundHelper;
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper3 = null;
        if (skinCompatBackgroundHelper2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mSkinCompatBackgroundHelper");
            skinCompatBackgroundHelper2 = null;
        }
        skinCompatBackgroundHelper2.onSetBackgroundResource(this.mLeftIconId);
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper4 = new skin.support.widget.SkinCompatBackgroundHelper(this.mIvRightIcon);
        this.mSkinCompatBackgroundHelper1 = skinCompatBackgroundHelper4;
        skinCompatBackgroundHelper4.loadFromAttributes(attrs, defStyleAttr);
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper5 = this.mSkinCompatBackgroundHelper1;
        if (skinCompatBackgroundHelper5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mSkinCompatBackgroundHelper1");
        } else {
            skinCompatBackgroundHelper3 = skinCompatBackgroundHelper5;
        }
        skinCompatBackgroundHelper3.onSetBackgroundResource(this.mRightIconId);
        applyTopBarBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCustomStyle$lambda-0, reason: not valid java name */
    public static final void m592getCustomStyle$lambda0(com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qSettingItemWithClick, "this$0");
        qSettingItemWithClick.clickOn(view.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCustomStyle$lambda-1, reason: not valid java name */
    public static final void m593getCustomStyle$lambda1(com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick, android.widget.CompoundButton compoundButton, boolean z) {
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick.OnLSettingItemWithClick onLSettingItemWithClick;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qSettingItemWithClick, "this$0");
        if (compoundButton.isPressed() && (onLSettingItemWithClick = qSettingItemWithClick.mOnLSettingItemClick) != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(onLSettingItemWithClick);
            onLSettingItemWithClick.click(compoundButton.getId(), z);
        }
    }

    private final void applyTopBarBackgroundColor() {
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.mLeftTextColorId);
        if (checkResourceId != 0) {
            int color = skin.support.content.res.SkinCompatResources.getColor(getContext(), checkResourceId);
            android.widget.TextView textView = this.mTvLeftText;
            kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
            textView.setTextColor(color);
        }
        int checkResourceId2 = skin.support.widget.SkinCompatHelper.checkResourceId(this.mRightTextColorId);
        if (checkResourceId2 != 0) {
            int color2 = skin.support.content.res.SkinCompatResources.getColor(getContext(), checkResourceId2);
            android.widget.TextView textView2 = this.mTvRightText;
            kotlin.jvm.internal.Intrinsics.checkNotNull(textView2);
            textView2.setTextColor(color2);
        }
    }

    private final void switchRightStyle(int mRightStyle) {
        if (mRightStyle == 0) {
            android.widget.ImageView imageView = this.mIvRightIcon;
            kotlin.jvm.internal.Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(0);
            androidx.appcompat.widget.AppCompatCheckBox appCompatCheckBox = this.mRightIcon_check;
            kotlin.jvm.internal.Intrinsics.checkNotNull(appCompatCheckBox);
            appCompatCheckBox.setVisibility(8);
            com.qcwireless.qcwatch.ui.base.view.QSwitchView qSwitchView = this.mRightIcon_switch;
            kotlin.jvm.internal.Intrinsics.checkNotNull(qSwitchView);
            qSwitchView.setVisibility(8);
            return;
        }
        if (mRightStyle == 1) {
            android.widget.FrameLayout frameLayout = this.mRightLayout;
            kotlin.jvm.internal.Intrinsics.checkNotNull(frameLayout);
            frameLayout.setVisibility(4);
            return;
        }
        if (mRightStyle == 2) {
            android.widget.ImageView imageView2 = this.mIvRightIcon;
            kotlin.jvm.internal.Intrinsics.checkNotNull(imageView2);
            imageView2.setVisibility(8);
            androidx.appcompat.widget.AppCompatCheckBox appCompatCheckBox2 = this.mRightIcon_check;
            kotlin.jvm.internal.Intrinsics.checkNotNull(appCompatCheckBox2);
            appCompatCheckBox2.setVisibility(0);
            com.qcwireless.qcwatch.ui.base.view.QSwitchView qSwitchView2 = this.mRightIcon_switch;
            kotlin.jvm.internal.Intrinsics.checkNotNull(qSwitchView2);
            qSwitchView2.setVisibility(8);
            return;
        }
        if (mRightStyle != 3) {
            return;
        }
        android.widget.ImageView imageView3 = this.mIvRightIcon;
        kotlin.jvm.internal.Intrinsics.checkNotNull(imageView3);
        imageView3.setVisibility(8);
        androidx.appcompat.widget.AppCompatCheckBox appCompatCheckBox3 = this.mRightIcon_check;
        kotlin.jvm.internal.Intrinsics.checkNotNull(appCompatCheckBox3);
        appCompatCheckBox3.setVisibility(8);
        com.qcwireless.qcwatch.ui.base.view.QSwitchView qSwitchView3 = this.mRightIcon_switch;
        kotlin.jvm.internal.Intrinsics.checkNotNull(qSwitchView3);
        qSwitchView3.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView(android.content.Context context) {
        android.view.View inflate = skin.support.constraint.SkinCompatConstraintLayout.inflate(context, com.qcwireless.qcwatch.R.layout.qc_device_item_with_click, (android.view.ViewGroup) this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(context, R.layou…ce_item_with_click, this)");
        this.mRootLayout = inflate.findViewById(com.qcwireless.qcwatch.R.id.rootLayout);
        this.mTvLeftText = (android.widget.TextView) inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_lefttext);
        this.mTvRightText = (android.widget.TextView) inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_righttext);
        this.mIvLeftIcon = (android.widget.ImageView) inflate.findViewById(com.qcwireless.qcwatch.R.id.iv_lefticon);
        this.mIvRightIcon = (android.widget.ImageView) inflate.findViewById(com.qcwireless.qcwatch.R.id.iv_righticon);
        this.mRightLayout = (android.widget.FrameLayout) inflate.findViewById(com.qcwireless.qcwatch.R.id.rightlayout);
        this.mRightIcon_check = inflate.findViewById(com.qcwireless.qcwatch.R.id.rightcheck);
        this.mRightIcon_switch = (com.qcwireless.qcwatch.ui.base.view.QSwitchView) inflate.findViewById(com.qcwireless.qcwatch.R.id.rightswitch);
        this.mTvLeftSubText = (android.widget.TextView) inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_left_sub_text);
    }

    private final void clickOn(int id) {
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick.OnLSettingItemWithClick onLSettingItemWithClick;
        int i = this.mRightStyle;
        if (i == 0 || i == 1) {
            com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick.OnLSettingItemWithClick onLSettingItemWithClick2 = this.mOnLSettingItemClick;
            if (onLSettingItemWithClick2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(onLSettingItemWithClick2);
                onLSettingItemWithClick2.click(id, this.mChecked);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (onLSettingItemWithClick = this.mOnLSettingItemClick) != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(onLSettingItemWithClick);
                onLSettingItemWithClick.click(id, this.mChecked);
                return;
            }
            return;
        }
        androidx.appcompat.widget.AppCompatCheckBox appCompatCheckBox = this.mRightIcon_check;
        kotlin.jvm.internal.Intrinsics.checkNotNull(appCompatCheckBox);
        kotlin.jvm.internal.Intrinsics.checkNotNull(this.mRightIcon_check);
        appCompatCheckBox.setChecked(!r0.isChecked());
        androidx.appcompat.widget.AppCompatCheckBox appCompatCheckBox2 = this.mRightIcon_check;
        kotlin.jvm.internal.Intrinsics.checkNotNull(appCompatCheckBox2);
        this.mChecked = appCompatCheckBox2.isChecked();
    }

    /* renamed from: getmRootLayout, reason: from getter */
    public final androidx.constraintlayout.widget.ConstraintLayout getMRootLayout() {
        return this.mRootLayout;
    }

    public final void setLeftText(java.lang.String info) {
        android.widget.TextView textView = this.mTvLeftText;
        kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
        textView.setText(info);
    }

    public final void setLeftSubText(java.lang.String info) {
        android.widget.TextView textView = this.mTvLeftSubText;
        kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
        textView.setText(info);
    }

    public final void setRightText(java.lang.String info) {
        android.widget.TextView textView = this.mTvRightText;
        kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
        textView.setText(info);
    }

    public final void setChecked(boolean checked) {
        com.qcwireless.qcwatch.ui.base.view.QSwitchView qSwitchView = this.mRightIcon_switch;
        kotlin.jvm.internal.Intrinsics.checkNotNull(qSwitchView);
        qSwitchView.setOn(checked);
    }

    public final void setOff() {
        com.qcwireless.qcwatch.ui.base.view.QSwitchView qSwitchView = this.mRightIcon_switch;
        kotlin.jvm.internal.Intrinsics.checkNotNull(qSwitchView);
        qSwitchView.setOff();
    }

    public final void setCheckedAble(boolean checked) {
        com.qcwireless.qcwatch.ui.base.view.QSwitchView qSwitchView = this.mRightIcon_switch;
        kotlin.jvm.internal.Intrinsics.checkNotNull(qSwitchView);
        qSwitchView.setClickable(checked);
    }

    public final void setLeftIcon(android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "drawable");
        com.bumptech.glide.RequestBuilder override = com.bumptech.glide.Glide.with(getContext()).load(drawable).override(90, 90);
        android.widget.ImageView imageView = this.mIvLeftIcon;
        kotlin.jvm.internal.Intrinsics.checkNotNull(imageView);
        override.into(imageView);
        com.qcwireless.qcwatch.base.view.ViewKt.visible(this.mIvLeftIcon);
    }

    public void applySkin() {
        applyTopBarBackgroundColor();
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mSkinCompatBackgroundHelper;
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper2 = null;
        if (skinCompatBackgroundHelper == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mSkinCompatBackgroundHelper");
            skinCompatBackgroundHelper = null;
        }
        skinCompatBackgroundHelper.applySkin();
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper3 = this.mSkinCompatBackgroundHelper1;
        if (skinCompatBackgroundHelper3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mSkinCompatBackgroundHelper1");
        } else {
            skinCompatBackgroundHelper2 = skinCompatBackgroundHelper3;
        }
        skinCompatBackgroundHelper2.applySkin();
    }
}
