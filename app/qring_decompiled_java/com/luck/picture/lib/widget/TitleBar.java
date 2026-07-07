package com.luck.picture.lib.widget;

/* loaded from: /tmp/dex/classes2.dex */
public class TitleBar extends android.widget.RelativeLayout implements android.view.View.OnClickListener {
    protected com.luck.picture.lib.config.SelectorConfig config;
    protected android.widget.ImageView ivArrow;
    protected android.widget.ImageView ivDelete;
    protected android.widget.ImageView ivLeftBack;
    protected android.widget.RelativeLayout rlAlbumBg;
    protected android.widget.RelativeLayout titleBarLayout;
    protected android.view.View titleBarLine;
    protected com.luck.picture.lib.widget.TitleBar.OnTitleBarListener titleBarListener;
    protected android.widget.TextView tvCancel;
    protected com.luck.picture.lib.widget.MarqueeTextView tvTitle;
    protected android.view.View viewAlbumClickArea;
    protected android.view.View viewTopStatusBar;

    public static class OnTitleBarListener {
        public void onBackPressed() {
        }

        public void onShowAlbumPopWindow(android.view.View view) {
        }

        public void onTitleDoubleClick() {
        }
    }

    protected void handleLayoutUI() {
    }

    public android.widget.TextView getTitleCancelView() {
        return this.tvCancel;
    }

    public TitleBar(android.content.Context context) {
        super(context);
        init();
    }

    public TitleBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TitleBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    protected void init() {
        android.content.Context context;
        int i;
        inflateLayout();
        setClickable(true);
        setFocusable(true);
        this.config = com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig();
        this.viewTopStatusBar = findViewById(com.luck.picture.lib.R.id.top_status_bar);
        this.titleBarLayout = (android.widget.RelativeLayout) findViewById(com.luck.picture.lib.R.id.rl_title_bar);
        this.ivLeftBack = (android.widget.ImageView) findViewById(com.luck.picture.lib.R.id.ps_iv_left_back);
        this.rlAlbumBg = (android.widget.RelativeLayout) findViewById(com.luck.picture.lib.R.id.ps_rl_album_bg);
        this.ivDelete = (android.widget.ImageView) findViewById(com.luck.picture.lib.R.id.ps_iv_delete);
        this.viewAlbumClickArea = findViewById(com.luck.picture.lib.R.id.ps_rl_album_click);
        this.tvTitle = (com.luck.picture.lib.widget.MarqueeTextView) findViewById(com.luck.picture.lib.R.id.ps_tv_title);
        this.ivArrow = (android.widget.ImageView) findViewById(com.luck.picture.lib.R.id.ps_iv_arrow);
        this.tvCancel = (android.widget.TextView) findViewById(com.luck.picture.lib.R.id.ps_tv_cancel);
        this.titleBarLine = findViewById(com.luck.picture.lib.R.id.title_bar_line);
        this.ivLeftBack.setOnClickListener(this);
        this.tvCancel.setOnClickListener(this);
        this.rlAlbumBg.setOnClickListener(this);
        this.titleBarLayout.setOnClickListener(this);
        this.viewAlbumClickArea.setOnClickListener(this);
        setBackgroundColor(androidx.core.content.ContextCompat.getColor(getContext(), com.luck.picture.lib.R.color.ps_color_grey));
        handleLayoutUI();
        if (android.text.TextUtils.isEmpty(this.config.defaultAlbumName)) {
            if (this.config.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
                context = getContext();
                i = com.luck.picture.lib.R.string.ps_all_audio;
            } else {
                context = getContext();
                i = com.luck.picture.lib.R.string.ps_camera_roll;
            }
            setTitle(context.getString(i));
            return;
        }
        setTitle(this.config.defaultAlbumName);
    }

    protected void inflateLayout() {
        android.view.LayoutInflater.from(getContext()).inflate(com.luck.picture.lib.R.layout.ps_title_bar, this);
    }

    public android.widget.ImageView getImageArrow() {
        return this.ivArrow;
    }

    public android.widget.ImageView getImageDelete() {
        return this.ivDelete;
    }

    public android.view.View getTitleBarLine() {
        return this.titleBarLine;
    }

    public void setTitle(java.lang.String str) {
        this.tvTitle.setText(str);
    }

    public java.lang.String getTitleText() {
        return this.tvTitle.getText().toString();
    }

    public void setTitleBarStyle() {
        if (this.config.isPreviewFullScreenMode) {
            this.viewTopStatusBar.getLayoutParams().height = com.luck.picture.lib.utils.DensityUtil.getStatusBarHeight(getContext());
        }
        com.luck.picture.lib.style.TitleBarStyle titleBarStyle = this.config.selectorStyle.getTitleBarStyle();
        int titleBarHeight = titleBarStyle.getTitleBarHeight();
        if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(titleBarHeight)) {
            this.titleBarLayout.getLayoutParams().height = titleBarHeight;
        } else {
            this.titleBarLayout.getLayoutParams().height = com.luck.picture.lib.utils.DensityUtil.dip2px(getContext(), 48.0f);
        }
        if (this.titleBarLine != null) {
            if (titleBarStyle.isDisplayTitleBarLine()) {
                this.titleBarLine.setVisibility(0);
                if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(titleBarStyle.getTitleBarLineColor())) {
                    this.titleBarLine.setBackgroundColor(titleBarStyle.getTitleBarLineColor());
                }
            } else {
                this.titleBarLine.setVisibility(8);
            }
        }
        int titleBackgroundColor = titleBarStyle.getTitleBackgroundColor();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(titleBackgroundColor)) {
            setBackgroundColor(titleBackgroundColor);
        }
        int titleLeftBackResource = titleBarStyle.getTitleLeftBackResource();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(titleLeftBackResource)) {
            this.ivLeftBack.setImageResource(titleLeftBackResource);
        }
        java.lang.String string = com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(titleBarStyle.getTitleDefaultTextResId()) ? getContext().getString(titleBarStyle.getTitleDefaultTextResId()) : titleBarStyle.getTitleDefaultText();
        if (com.luck.picture.lib.utils.StyleUtils.checkTextValidity(string)) {
            this.tvTitle.setText(string);
        }
        int titleTextSize = titleBarStyle.getTitleTextSize();
        if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(titleTextSize)) {
            this.tvTitle.setTextSize(titleTextSize);
        }
        int titleTextColor = titleBarStyle.getTitleTextColor();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(titleTextColor)) {
            this.tvTitle.setTextColor(titleTextColor);
        }
        if (this.config.isOnlySandboxDir) {
            this.ivArrow.setImageResource(com.luck.picture.lib.R.drawable.ps_ic_trans_1px);
        } else {
            int titleDrawableRightResource = titleBarStyle.getTitleDrawableRightResource();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(titleDrawableRightResource)) {
                this.ivArrow.setImageResource(titleDrawableRightResource);
            }
        }
        int titleAlbumBackgroundResource = titleBarStyle.getTitleAlbumBackgroundResource();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(titleAlbumBackgroundResource)) {
            this.rlAlbumBg.setBackgroundResource(titleAlbumBackgroundResource);
        }
        if (titleBarStyle.isHideCancelButton()) {
            this.tvCancel.setVisibility(8);
        } else {
            this.tvCancel.setVisibility(0);
            int titleCancelBackgroundResource = titleBarStyle.getTitleCancelBackgroundResource();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(titleCancelBackgroundResource)) {
                this.tvCancel.setBackgroundResource(titleCancelBackgroundResource);
            }
            java.lang.String string2 = com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(titleBarStyle.getTitleCancelTextResId()) ? getContext().getString(titleBarStyle.getTitleCancelTextResId()) : titleBarStyle.getTitleCancelText();
            if (com.luck.picture.lib.utils.StyleUtils.checkTextValidity(string2)) {
                this.tvCancel.setText(string2);
            }
            int titleCancelTextColor = titleBarStyle.getTitleCancelTextColor();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(titleCancelTextColor)) {
                this.tvCancel.setTextColor(titleCancelTextColor);
            }
            int titleCancelTextSize = titleBarStyle.getTitleCancelTextSize();
            if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(titleCancelTextSize)) {
                this.tvCancel.setTextSize(titleCancelTextSize);
            }
        }
        int previewDeleteBackgroundResource = titleBarStyle.getPreviewDeleteBackgroundResource();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(previewDeleteBackgroundResource)) {
            this.ivDelete.setBackgroundResource(previewDeleteBackgroundResource);
        } else {
            this.ivDelete.setBackgroundResource(com.luck.picture.lib.R.drawable.ps_ic_delete);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.luck.picture.lib.widget.TitleBar.OnTitleBarListener onTitleBarListener;
        int id = view.getId();
        if (id == com.luck.picture.lib.R.id.ps_iv_left_back || id == com.luck.picture.lib.R.id.ps_tv_cancel) {
            com.luck.picture.lib.widget.TitleBar.OnTitleBarListener onTitleBarListener2 = this.titleBarListener;
            if (onTitleBarListener2 != null) {
                onTitleBarListener2.onBackPressed();
                return;
            }
            return;
        }
        if (id == com.luck.picture.lib.R.id.ps_rl_album_bg || id == com.luck.picture.lib.R.id.ps_rl_album_click) {
            com.luck.picture.lib.widget.TitleBar.OnTitleBarListener onTitleBarListener3 = this.titleBarListener;
            if (onTitleBarListener3 != null) {
                onTitleBarListener3.onShowAlbumPopWindow(this);
                return;
            }
            return;
        }
        if (id != com.luck.picture.lib.R.id.rl_title_bar || (onTitleBarListener = this.titleBarListener) == null) {
            return;
        }
        onTitleBarListener.onTitleDoubleClick();
    }

    public void setOnTitleBarListener(com.luck.picture.lib.widget.TitleBar.OnTitleBarListener onTitleBarListener) {
        this.titleBarListener = onTitleBarListener;
    }
}
