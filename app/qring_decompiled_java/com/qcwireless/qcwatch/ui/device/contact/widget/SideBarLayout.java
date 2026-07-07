package com.qcwireless.qcwatch.ui.device.contact.widget;

/* loaded from: /tmp/dex/classes2.dex */
public class SideBarLayout extends android.widget.RelativeLayout implements com.qcwireless.qcwatch.ui.device.contact.widget.SideBarSortView.OnIndexChangedListener, skin.support.widget.SkinCompatSupportable {
    private android.content.Context mContext;
    private android.view.View mLayout;
    private java.util.List<java.lang.String> mList;
    private com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout.OnSideBarLayoutListener mListener;
    private com.qcwireless.qcwatch.ui.device.contact.widget.SideBarSortView mSortView;
    private android.widget.TextView mTvTips;
    private int selectTextColor;
    private int selectTextId;
    private float selectTextSize;
    private int unSelectTextId;
    private int unselectTextColor;
    private float unselectTextSize;
    private android.graphics.drawable.Drawable wordBackground;
    private int wordTextColor;
    private float wordTextSize;

    public interface OnSideBarLayoutListener {
        void onSideBarScrollUpdateItem(java.lang.String word);
    }

    private void applyTextColor() {
    }

    public SideBarLayout(android.content.Context context) {
        super(context);
        this.selectTextId = 0;
        this.unSelectTextId = 0;
    }

    public SideBarLayout(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.selectTextId = 0;
        this.unSelectTextId = 0;
        init(context, attrs);
        initView();
    }

    public SideBarLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.selectTextId = 0;
        this.unSelectTextId = 0;
        init(context, attrs);
        initView();
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        this.mContext = context;
        if (attrs != null) {
            context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.SideBarView);
            android.content.res.TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.SideBarView);
            this.unselectTextColor = obtainStyledAttributes.getColor(4, android.graphics.Color.parseColor("#1ABDE6"));
            this.selectTextColor = obtainStyledAttributes.getColor(2, android.graphics.Color.parseColor("#2E56D7"));
            this.selectTextSize = obtainStyledAttributes.getDimension(3, dip2px(this.mContext, 12.0f));
            this.unselectTextSize = obtainStyledAttributes.getDimension(5, dip2px(this.mContext, 10.0f));
            this.wordTextSize = obtainStyledAttributes.getDimension(8, px2sp(this.mContext, 45.0f));
            this.wordTextColor = obtainStyledAttributes.getColor(7, android.graphics.Color.parseColor("#FFFFFF"));
            android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(6);
            this.wordBackground = drawable;
            if (drawable == null) {
                this.wordBackground = context.getResources().getDrawable(com.qcwireless.qcwatch.R.drawable.sort_text_view_hint_bg);
            }
            obtainStyledAttributes.recycle();
        }
    }

    private void initView() {
        android.view.View inflate = android.view.LayoutInflater.from(this.mContext).inflate(com.qcwireless.qcwatch.R.layout.view_sidebar_layout, (android.view.ViewGroup) null, true);
        this.mLayout = inflate;
        this.mTvTips = (android.widget.TextView) inflate.findViewById(com.qcwireless.qcwatch.R.id.tvTips);
        com.qcwireless.qcwatch.ui.device.contact.widget.SideBarSortView sideBarSortView = (com.qcwireless.qcwatch.ui.device.contact.widget.SideBarSortView) this.mLayout.findViewById(com.qcwireless.qcwatch.R.id.sortView);
        this.mSortView = sideBarSortView;
        sideBarSortView.setIndexChangedListener(this);
        this.mSortView.setmTextColor(this.unselectTextColor);
        this.mSortView.setmTextColorChoose(this.selectTextColor);
        this.mSortView.setmTextSize(this.unselectTextSize);
        this.mSortView.setmTextSizeChoose(this.selectTextSize);
        this.mSortView.invalidate();
        this.mTvTips.setTextColor(skin.support.content.res.SkinCompatResources.getColor(this.mContext, com.qcwireless.qcwatch.R.color.color_FF6A00));
        this.mTvTips.setTextSize(px2sp(this.mContext, this.wordTextSize));
        this.mTvTips.setBackground(this.wordBackground);
        applyTextColor();
        addView(this.mLayout);
    }

    public void applySkin() {
        applyTextColor();
    }

    public void setSideBarLayout(com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout.OnSideBarLayoutListener listener) {
        this.mListener = listener;
    }

    @Override // com.qcwireless.qcwatch.ui.device.contact.widget.SideBarSortView.OnIndexChangedListener
    public void onSideBarScrollUpdateItem(java.lang.String word) {
        this.mTvTips.setVisibility(0);
        this.mTvTips.setText(word);
        com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout.OnSideBarLayoutListener onSideBarLayoutListener = this.mListener;
        if (onSideBarLayoutListener != null) {
            onSideBarLayoutListener.onSideBarScrollUpdateItem(word);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.device.contact.widget.SideBarSortView.OnIndexChangedListener
    public void onSideBarScrollEndHideText() {
        this.mTvTips.setVisibility(8);
    }

    public void OnItemScrollUpdateText(java.lang.String word) {
        if (this.mListener != null) {
            this.mSortView.onitemScrollUpdateText(word);
        }
    }

    public static int dip2px(android.content.Context context, float dpValue) {
        return (int) ((dpValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2sp(android.content.Context context, float pxValue) {
        return (int) ((pxValue / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
