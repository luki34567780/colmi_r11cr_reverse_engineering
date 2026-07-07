package com.luck.picture.lib.widget;

/* loaded from: /tmp/dex/classes2.dex */
public class BottomNavBar extends android.widget.RelativeLayout implements android.view.View.OnClickListener {
    protected com.luck.picture.lib.widget.BottomNavBar.OnBottomNavBarListener bottomNavBarListener;
    protected com.luck.picture.lib.config.SelectorConfig config;
    private android.widget.CheckBox originalCheckbox;
    protected android.widget.TextView tvImageEditor;
    protected android.widget.TextView tvPreview;

    public static class OnBottomNavBarListener {
        public void onCheckOriginalChange() {
        }

        public void onEditImage() {
        }

        public void onFirstCheckOriginalSelectedChange() {
        }

        public void onPreview() {
        }
    }

    protected void handleLayoutUI() {
    }

    public BottomNavBar(android.content.Context context) {
        super(context);
        init();
    }

    public BottomNavBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public BottomNavBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    protected void init() {
        inflateLayout();
        setClickable(true);
        setFocusable(true);
        this.config = com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig();
        this.tvPreview = (android.widget.TextView) findViewById(com.luck.picture.lib.R.id.ps_tv_preview);
        this.tvImageEditor = (android.widget.TextView) findViewById(com.luck.picture.lib.R.id.ps_tv_editor);
        this.originalCheckbox = (android.widget.CheckBox) findViewById(com.luck.picture.lib.R.id.cb_original);
        this.tvPreview.setOnClickListener(this);
        this.tvImageEditor.setVisibility(8);
        setBackgroundColor(androidx.core.content.ContextCompat.getColor(getContext(), com.luck.picture.lib.R.color.ps_color_grey));
        this.originalCheckbox.setChecked(this.config.isCheckOriginalImage);
        this.originalCheckbox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.luck.picture.lib.widget.BottomNavBar.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.luck.picture.lib.widget.BottomNavBar.this.config.isCheckOriginalImage = z;
                com.luck.picture.lib.widget.BottomNavBar.this.originalCheckbox.setChecked(com.luck.picture.lib.widget.BottomNavBar.this.config.isCheckOriginalImage);
                if (com.luck.picture.lib.widget.BottomNavBar.this.bottomNavBarListener != null) {
                    com.luck.picture.lib.widget.BottomNavBar.this.bottomNavBarListener.onCheckOriginalChange();
                    if (z && com.luck.picture.lib.widget.BottomNavBar.this.config.getSelectCount() == 0) {
                        com.luck.picture.lib.widget.BottomNavBar.this.bottomNavBarListener.onFirstCheckOriginalSelectedChange();
                    }
                }
            }
        });
        handleLayoutUI();
    }

    protected void inflateLayout() {
        inflate(getContext(), com.luck.picture.lib.R.layout.ps_bottom_nav_bar, this);
    }

    public void setBottomNavBarStyle() {
        if (this.config.isDirectReturnSingle) {
            setVisibility(8);
            return;
        }
        com.luck.picture.lib.style.BottomNavBarStyle bottomBarStyle = this.config.selectorStyle.getBottomBarStyle();
        if (this.config.isOriginalControl) {
            this.originalCheckbox.setVisibility(0);
            int bottomOriginalDrawableLeft = bottomBarStyle.getBottomOriginalDrawableLeft();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomOriginalDrawableLeft)) {
                this.originalCheckbox.setButtonDrawable(bottomOriginalDrawableLeft);
            }
            java.lang.String string = com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomBarStyle.getBottomOriginalTextResId()) ? getContext().getString(bottomBarStyle.getBottomOriginalTextResId()) : bottomBarStyle.getBottomOriginalText();
            if (com.luck.picture.lib.utils.StyleUtils.checkTextValidity(string)) {
                this.originalCheckbox.setText(string);
            }
            int bottomOriginalTextSize = bottomBarStyle.getBottomOriginalTextSize();
            if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(bottomOriginalTextSize)) {
                this.originalCheckbox.setTextSize(bottomOriginalTextSize);
            }
            int bottomOriginalTextColor = bottomBarStyle.getBottomOriginalTextColor();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomOriginalTextColor)) {
                this.originalCheckbox.setTextColor(bottomOriginalTextColor);
            }
        }
        int bottomNarBarHeight = bottomBarStyle.getBottomNarBarHeight();
        if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(bottomNarBarHeight)) {
            getLayoutParams().height = bottomNarBarHeight;
        } else {
            getLayoutParams().height = com.luck.picture.lib.utils.DensityUtil.dip2px(getContext(), 46.0f);
        }
        int bottomNarBarBackgroundColor = bottomBarStyle.getBottomNarBarBackgroundColor();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomNarBarBackgroundColor)) {
            setBackgroundColor(bottomNarBarBackgroundColor);
        }
        int bottomPreviewNormalTextColor = bottomBarStyle.getBottomPreviewNormalTextColor();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomPreviewNormalTextColor)) {
            this.tvPreview.setTextColor(bottomPreviewNormalTextColor);
        }
        int bottomPreviewNormalTextSize = bottomBarStyle.getBottomPreviewNormalTextSize();
        if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(bottomPreviewNormalTextSize)) {
            this.tvPreview.setTextSize(bottomPreviewNormalTextSize);
        }
        java.lang.String string2 = com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomBarStyle.getBottomPreviewNormalTextResId()) ? getContext().getString(bottomBarStyle.getBottomPreviewNormalTextResId()) : bottomBarStyle.getBottomPreviewNormalText();
        if (com.luck.picture.lib.utils.StyleUtils.checkTextValidity(string2)) {
            this.tvPreview.setText(string2);
        }
        java.lang.String string3 = com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomBarStyle.getBottomEditorTextResId()) ? getContext().getString(bottomBarStyle.getBottomEditorTextResId()) : bottomBarStyle.getBottomEditorText();
        if (com.luck.picture.lib.utils.StyleUtils.checkTextValidity(string3)) {
            this.tvImageEditor.setText(string3);
        }
        int bottomEditorTextSize = bottomBarStyle.getBottomEditorTextSize();
        if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(bottomEditorTextSize)) {
            this.tvImageEditor.setTextSize(bottomEditorTextSize);
        }
        int bottomEditorTextColor = bottomBarStyle.getBottomEditorTextColor();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomEditorTextColor)) {
            this.tvImageEditor.setTextColor(bottomEditorTextColor);
        }
        int bottomOriginalDrawableLeft2 = bottomBarStyle.getBottomOriginalDrawableLeft();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomOriginalDrawableLeft2)) {
            this.originalCheckbox.setButtonDrawable(bottomOriginalDrawableLeft2);
        }
        java.lang.String string4 = com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomBarStyle.getBottomOriginalTextResId()) ? getContext().getString(bottomBarStyle.getBottomOriginalTextResId()) : bottomBarStyle.getBottomOriginalText();
        if (com.luck.picture.lib.utils.StyleUtils.checkTextValidity(string4)) {
            this.originalCheckbox.setText(string4);
        }
        int bottomOriginalTextSize2 = bottomBarStyle.getBottomOriginalTextSize();
        if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(bottomOriginalTextSize2)) {
            this.originalCheckbox.setTextSize(bottomOriginalTextSize2);
        }
        int bottomOriginalTextColor2 = bottomBarStyle.getBottomOriginalTextColor();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomOriginalTextColor2)) {
            this.originalCheckbox.setTextColor(bottomOriginalTextColor2);
        }
    }

    public void setOriginalCheck() {
        this.originalCheckbox.setChecked(this.config.isCheckOriginalImage);
    }

    public void setSelectedChange() {
        calculateFileTotalSize();
        com.luck.picture.lib.style.BottomNavBarStyle bottomBarStyle = this.config.selectorStyle.getBottomBarStyle();
        if (this.config.getSelectCount() > 0) {
            this.tvPreview.setEnabled(true);
            int bottomPreviewSelectTextColor = bottomBarStyle.getBottomPreviewSelectTextColor();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomPreviewSelectTextColor)) {
                this.tvPreview.setTextColor(bottomPreviewSelectTextColor);
            } else {
                this.tvPreview.setTextColor(androidx.core.content.ContextCompat.getColor(getContext(), com.luck.picture.lib.R.color.ps_color_fa632d));
            }
            java.lang.String string = com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomBarStyle.getBottomPreviewSelectTextResId()) ? getContext().getString(bottomBarStyle.getBottomPreviewSelectTextResId()) : bottomBarStyle.getBottomPreviewSelectText();
            if (com.luck.picture.lib.utils.StyleUtils.checkTextValidity(string)) {
                if (com.luck.picture.lib.utils.StyleUtils.checkTextFormatValidity(string)) {
                    this.tvPreview.setText(java.lang.String.format(string, java.lang.Integer.valueOf(this.config.getSelectCount())));
                    return;
                } else {
                    this.tvPreview.setText(string);
                    return;
                }
            }
            this.tvPreview.setText(getContext().getString(com.luck.picture.lib.R.string.ps_preview_num, java.lang.Integer.valueOf(this.config.getSelectCount())));
            return;
        }
        this.tvPreview.setEnabled(false);
        int bottomPreviewNormalTextColor = bottomBarStyle.getBottomPreviewNormalTextColor();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomPreviewNormalTextColor)) {
            this.tvPreview.setTextColor(bottomPreviewNormalTextColor);
        } else {
            this.tvPreview.setTextColor(androidx.core.content.ContextCompat.getColor(getContext(), com.luck.picture.lib.R.color.ps_color_9b));
        }
        java.lang.String string2 = com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomBarStyle.getBottomPreviewNormalTextResId()) ? getContext().getString(bottomBarStyle.getBottomPreviewNormalTextResId()) : bottomBarStyle.getBottomPreviewNormalText();
        if (com.luck.picture.lib.utils.StyleUtils.checkTextValidity(string2)) {
            this.tvPreview.setText(string2);
        } else {
            this.tvPreview.setText(getContext().getString(com.luck.picture.lib.R.string.ps_preview));
        }
    }

    private void calculateFileTotalSize() {
        if (this.config.isOriginalControl) {
            long j = 0;
            for (int i = 0; i < this.config.getSelectCount(); i++) {
                j += this.config.getSelectedResult().get(i).getSize();
            }
            if (j > 0) {
                this.originalCheckbox.setText(getContext().getString(com.luck.picture.lib.R.string.ps_original_image, com.luck.picture.lib.utils.PictureFileUtils.formatAccurateUnitFileSize(j)));
                return;
            } else {
                this.originalCheckbox.setText(getContext().getString(com.luck.picture.lib.R.string.ps_default_original_image));
                return;
            }
        }
        this.originalCheckbox.setText(getContext().getString(com.luck.picture.lib.R.string.ps_default_original_image));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (this.bottomNavBarListener != null && view.getId() == com.luck.picture.lib.R.id.ps_tv_preview) {
            this.bottomNavBarListener.onPreview();
        }
    }

    public void setOnBottomNavBarListener(com.luck.picture.lib.widget.BottomNavBar.OnBottomNavBarListener onBottomNavBarListener) {
        this.bottomNavBarListener = onBottomNavBarListener;
    }
}
