package com.qcwireless.qcwatch.ui.base.view.pullrefresh;

/* loaded from: /tmp/dex/classes2.dex */
public class ClassicsHeader extends com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsAbstract<com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader> implements com.scwang.smart.refresh.layout.api.RefreshHeader {
    public static final int ID_TEXT_UPDATE = 2131297304;
    public static java.lang.String REFRESH_HEADER_FAILED;
    public static java.lang.String REFRESH_HEADER_FINISH;
    public static java.lang.String REFRESH_HEADER_LOADING;
    public static java.lang.String REFRESH_HEADER_PULLING;
    public static java.lang.String REFRESH_HEADER_REFRESHING;
    public static java.lang.String REFRESH_HEADER_RELEASE;
    public static java.lang.String REFRESH_HEADER_SECONDARY;
    public static java.lang.String REFRESH_HEADER_UPDATE;
    protected java.lang.String KEY_LAST_UPDATE_TIME;
    protected android.content.Context mContext;
    protected boolean mEnableLastTime;
    protected java.util.Date mLastTime;
    protected android.widget.TextView mLastUpdateText;
    protected android.content.SharedPreferences mShared;
    protected java.lang.String mTextFailed;
    protected java.lang.String mTextFinish;
    protected java.lang.String mTextLoading;
    protected java.lang.String mTextPulling;
    protected java.lang.String mTextRefreshing;
    protected java.lang.String mTextRelease;
    protected java.lang.String mTextSecondary;
    protected java.lang.String mTextUpdate;

    public ClassicsHeader(android.content.Context context) {
        this(context, null);
        this.mContext = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClassicsHeader(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs, 0);
        androidx.fragment.app.FragmentManager supportFragmentManager;
        this.KEY_LAST_UPDATE_TIME = "LAST_UPDATE_TIME";
        this.mEnableLastTime = false;
        this.mContext = context;
        android.view.View.inflate(context, com.qcwireless.qcwatch.R.layout.srl_classics_header, this);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(2131297301);
        this.mArrowView = imageView;
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131297304);
        this.mLastUpdateText = textView;
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(2131297302);
        this.mProgressView = imageView2;
        this.mTitleText = (android.widget.TextView) findViewById(2131297303);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.ClassicsHeader);
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = imageView.getLayoutParams();
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2).topMargin = obtainStyledAttributes.getDimensionPixelSize(20, com.scwang.smart.refresh.layout.util.SmartUtil.dp2px(0.0f));
        layoutParams2.rightMargin = obtainStyledAttributes.getDimensionPixelSize(4, com.scwang.smart.refresh.layout.util.SmartUtil.dp2px(20.0f));
        layoutParams.rightMargin = layoutParams2.rightMargin;
        layoutParams.width = obtainStyledAttributes.getLayoutDimension(3, layoutParams.width);
        layoutParams.height = obtainStyledAttributes.getLayoutDimension(3, layoutParams.height);
        layoutParams2.width = obtainStyledAttributes.getLayoutDimension(6, layoutParams2.width);
        layoutParams2.height = obtainStyledAttributes.getLayoutDimension(6, layoutParams2.height);
        layoutParams.width = obtainStyledAttributes.getLayoutDimension(7, layoutParams.width);
        layoutParams.height = obtainStyledAttributes.getLayoutDimension(7, layoutParams.height);
        layoutParams2.width = obtainStyledAttributes.getLayoutDimension(7, layoutParams2.width);
        layoutParams2.height = obtainStyledAttributes.getLayoutDimension(7, layoutParams2.height);
        this.mFinishDuration = obtainStyledAttributes.getInt(9, this.mFinishDuration);
        this.mEnableLastTime = obtainStyledAttributes.getBoolean(8, this.mEnableLastTime);
        this.mSpinnerStyle = com.scwang.smart.refresh.layout.constant.SpinnerStyle.values[obtainStyledAttributes.getInt(1, this.mSpinnerStyle.ordinal)];
        if (obtainStyledAttributes.hasValue(2)) {
            this.mArrowView.setImageDrawable(obtainStyledAttributes.getDrawable(2));
        } else if (this.mArrowView.getDrawable() == null) {
            this.mArrowDrawable = new com.qcwireless.qcwatch.ui.base.view.pullrefresh.ArrowDrawable();
            this.mArrowDrawable.setColor(-10066330);
            this.mArrowView.setImageDrawable(this.mArrowDrawable);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            this.mProgressView.setImageDrawable(obtainStyledAttributes.getDrawable(5));
        } else if (this.mProgressView.getDrawable() == null) {
            this.mProgressDrawable = new com.qcwireless.qcwatch.ui.base.view.pullrefresh.ProgressDrawable();
            this.mProgressDrawable.setColor(-10066330);
            this.mProgressView.setImageDrawable(this.mProgressDrawable);
        }
        if (obtainStyledAttributes.hasValue(19)) {
            this.mTitleText.setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(19, com.scwang.smart.refresh.layout.util.SmartUtil.dp2px(16.0f)));
        }
        if (obtainStyledAttributes.hasValue(18)) {
            this.mLastUpdateText.setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(18, com.scwang.smart.refresh.layout.util.SmartUtil.dp2px(12.0f)));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            super.setPrimaryColor(obtainStyledAttributes.getColor(10, 0));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            setAccentColor(obtainStyledAttributes.getColor(0, 0));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            this.mTextPulling = obtainStyledAttributes.getString(14);
        } else {
            java.lang.String str = REFRESH_HEADER_PULLING;
            if (str != null) {
                this.mTextPulling = str;
            } else {
                this.mTextPulling = context.getString(com.qcwireless.qcwatch.R.string.srl_header_pulling);
            }
        }
        if (obtainStyledAttributes.hasValue(13)) {
            this.mTextLoading = obtainStyledAttributes.getString(13);
        } else {
            java.lang.String str2 = REFRESH_HEADER_LOADING;
            if (str2 != null) {
                this.mTextLoading = str2;
            } else {
                this.mTextLoading = context.getString(com.qcwireless.qcwatch.R.string.srl_header_loading);
            }
        }
        if (obtainStyledAttributes.hasValue(16)) {
            this.mTextRelease = obtainStyledAttributes.getString(16);
        } else {
            java.lang.String str3 = REFRESH_HEADER_RELEASE;
            if (str3 != null) {
                this.mTextRelease = str3;
            } else {
                this.mTextRelease = context.getString(com.qcwireless.qcwatch.R.string.srl_header_release);
            }
        }
        if (obtainStyledAttributes.hasValue(12)) {
            this.mTextFinish = obtainStyledAttributes.getString(12);
        } else {
            java.lang.String str4 = REFRESH_HEADER_FINISH;
            if (str4 != null) {
                this.mTextFinish = str4;
            } else {
                this.mTextFinish = context.getString(com.qcwireless.qcwatch.R.string.srl_header_finish);
            }
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.mTextFailed = obtainStyledAttributes.getString(11);
        } else {
            java.lang.String str5 = REFRESH_HEADER_FAILED;
            if (str5 != null) {
                this.mTextFailed = str5;
            } else {
                this.mTextFailed = context.getString(com.qcwireless.qcwatch.R.string.srl_header_failed);
            }
        }
        if (obtainStyledAttributes.hasValue(17)) {
            this.mTextSecondary = obtainStyledAttributes.getString(17);
        } else {
            java.lang.String str6 = REFRESH_HEADER_SECONDARY;
            if (str6 != null) {
                this.mTextSecondary = str6;
            } else {
                this.mTextSecondary = context.getString(com.qcwireless.qcwatch.R.string.srl_header_secondary);
            }
        }
        if (obtainStyledAttributes.hasValue(15)) {
            this.mTextRefreshing = obtainStyledAttributes.getString(15);
        } else {
            java.lang.String str7 = REFRESH_HEADER_REFRESHING;
            if (str7 != null) {
                this.mTextRefreshing = str7;
            } else {
                this.mTextRefreshing = context.getString(com.qcwireless.qcwatch.R.string.srl_header_refreshing);
            }
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.mTextUpdate = obtainStyledAttributes.getString(21);
        } else {
            java.lang.String str8 = REFRESH_HEADER_UPDATE;
            if (str8 != null) {
                this.mTextUpdate = str8;
            } else {
                this.mTextUpdate = context.getString(com.qcwireless.qcwatch.R.string.srl_header_update);
            }
        }
        obtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        textView.setVisibility(this.mEnableLastTime ? 0 : 8);
        this.mTitleText.setText(isInEditMode() ? this.mTextRefreshing : this.mTextPulling);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
        try {
            if ((context instanceof androidx.fragment.app.FragmentActivity) && (supportFragmentManager = ((androidx.fragment.app.FragmentActivity) context).getSupportFragmentManager()) != null && supportFragmentManager.getFragments().size() > 0) {
                setLastUpdateTime(new java.util.Date());
                return;
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        this.KEY_LAST_UPDATE_TIME += context.getClass().getName();
        this.mShared = context.getSharedPreferences("ClassicsHeader", 0);
        setLastUpdateTime(new java.util.Date(this.mShared.getLong(this.KEY_LAST_UPDATE_TIME, java.lang.System.currentTimeMillis())));
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsAbstract
    public int onFinish(com.scwang.smart.refresh.layout.api.RefreshLayout layout, boolean success) {
        if (success) {
            this.mTitleText.setText(this.mTextFinish);
            if (this.mLastTime != null) {
                setLastUpdateTime(new java.util.Date());
            }
        } else {
            this.mTitleText.setText(this.mTextFailed);
        }
        return super.onFinish(layout, success);
    }

    public void onStateChanged(com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout, com.scwang.smart.refresh.layout.constant.RefreshState oldState, com.scwang.smart.refresh.layout.constant.RefreshState newState) {
        android.widget.ImageView imageView = this.mArrowView;
        android.widget.TextView textView = this.mLastUpdateText;
        switch (com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader.AnonymousClass1.$SwitchMap$com$scwang$smart$refresh$layout$constant$RefreshState[newState.ordinal()]) {
            case 1:
                textView.setVisibility(this.mEnableLastTime ? 0 : 8);
                break;
            case 2:
                break;
            case 3:
            case 4:
                this.mTitleText.setText(this.mTextRefreshing);
                imageView.setVisibility(8);
                return;
            case 5:
                this.mTitleText.setText(this.mTextRelease);
                imageView.animate().rotation(180.0f);
                return;
            case 6:
                this.mTitleText.setText(this.mTextSecondary);
                imageView.animate().rotation(0.0f);
                return;
            case 7:
                imageView.setVisibility(8);
                textView.setVisibility(this.mEnableLastTime ? 4 : 8);
                this.mTitleText.setText(this.mTextLoading);
                return;
            default:
                return;
        }
        this.mTitleText.setText(this.mTextPulling);
        imageView.setVisibility(0);
        imageView.animate().rotation(0.0f);
    }

    /* renamed from: com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$scwang$smart$refresh$layout$constant$RefreshState;

        static {
            int[] iArr = new int[com.scwang.smart.refresh.layout.constant.RefreshState.values().length];
            $SwitchMap$com$scwang$smart$refresh$layout$constant$RefreshState = iArr;
            try {
                iArr[com.scwang.smart.refresh.layout.constant.RefreshState.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$scwang$smart$refresh$layout$constant$RefreshState[com.scwang.smart.refresh.layout.constant.RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$scwang$smart$refresh$layout$constant$RefreshState[com.scwang.smart.refresh.layout.constant.RefreshState.Refreshing.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$scwang$smart$refresh$layout$constant$RefreshState[com.scwang.smart.refresh.layout.constant.RefreshState.RefreshReleased.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$scwang$smart$refresh$layout$constant$RefreshState[com.scwang.smart.refresh.layout.constant.RefreshState.ReleaseToRefresh.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$scwang$smart$refresh$layout$constant$RefreshState[com.scwang.smart.refresh.layout.constant.RefreshState.ReleaseToTwoLevel.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$scwang$smart$refresh$layout$constant$RefreshState[com.scwang.smart.refresh.layout.constant.RefreshState.Loading.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader setLastUpdateTime(java.util.Date time) {
        this.mLastTime = time;
        this.mLastUpdateText.setText(this.mContext.getString(com.qcwireless.qcwatch.R.string.srl_header_update, new com.oudmon.ble.base.util.DateUtil(time).getMMdd_HHmmDate()));
        if (this.mShared != null && !isInEditMode()) {
            this.mShared.edit().putLong(this.KEY_LAST_UPDATE_TIME, time.getTime()).apply();
        }
        return this;
    }

    public long getLastUpdateTime() {
        android.content.SharedPreferences sharedPreferences = this.mContext.getSharedPreferences("ClassicsHeader", 0);
        this.mShared = sharedPreferences;
        return sharedPreferences.getLong(this.KEY_LAST_UPDATE_TIME, 0L);
    }

    public com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader setLastUpdateText(java.lang.CharSequence text) {
        this.mLastTime = null;
        this.mLastUpdateText.setText(text);
        return this;
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsAbstract
    public com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader setAccentColor(int accentColor) {
        this.mLastUpdateText.setTextColor((16777215 & accentColor) | (-872415232));
        return (com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader) super.setAccentColor(accentColor);
    }

    public com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader setEnableLastTime(boolean enable) {
        android.widget.TextView textView = this.mLastUpdateText;
        this.mEnableLastTime = enable;
        textView.setVisibility(enable ? 0 : 8);
        if (this.mRefreshKernel != null) {
            this.mRefreshKernel.requestRemeasureHeightFor(this);
        }
        return this;
    }

    public com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader setTextSizeTime(float size) {
        this.mLastUpdateText.setTextSize(size);
        if (this.mRefreshKernel != null) {
            this.mRefreshKernel.requestRemeasureHeightFor(this);
        }
        return this;
    }

    public com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader setTextSizeTime(int unit, float size) {
        this.mLastUpdateText.setTextSize(unit, size);
        if (this.mRefreshKernel != null) {
            this.mRefreshKernel.requestRemeasureHeightFor(this);
        }
        return this;
    }

    public com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader setTextTimeMarginTop(float dp) {
        android.widget.TextView textView = this.mLastUpdateText;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.topMargin = com.scwang.smart.refresh.layout.util.SmartUtil.dp2px(dp);
        textView.setLayoutParams(marginLayoutParams);
        return this;
    }

    public com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader setTextTimeMarginTopPx(int px) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.mLastUpdateText.getLayoutParams();
        marginLayoutParams.topMargin = px;
        this.mLastUpdateText.setLayoutParams(marginLayoutParams);
        return this;
    }
}
