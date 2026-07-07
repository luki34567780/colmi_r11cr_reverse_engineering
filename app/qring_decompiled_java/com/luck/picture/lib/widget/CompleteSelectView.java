package com.luck.picture.lib.widget;

/* loaded from: /tmp/dex/classes2.dex */
public class CompleteSelectView extends android.widget.LinearLayout {
    private com.luck.picture.lib.config.SelectorConfig config;
    private android.view.animation.Animation numberChangeAnimation;
    private android.widget.TextView tvComplete;
    private android.widget.TextView tvSelectNum;

    public CompleteSelectView(android.content.Context context) {
        super(context);
        init();
    }

    public CompleteSelectView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public CompleteSelectView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        inflateLayout();
        setOrientation(0);
        this.tvSelectNum = (android.widget.TextView) findViewById(com.luck.picture.lib.R.id.ps_tv_select_num);
        this.tvComplete = (android.widget.TextView) findViewById(com.luck.picture.lib.R.id.ps_tv_complete);
        setGravity(16);
        this.numberChangeAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.luck.picture.lib.R.anim.ps_anim_modal_in);
        this.config = com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig();
    }

    protected void inflateLayout() {
        android.view.LayoutInflater.from(getContext()).inflate(com.luck.picture.lib.R.layout.ps_complete_selected_layout, this);
    }

    public void setCompleteSelectViewStyle() {
        com.luck.picture.lib.style.PictureSelectorStyle pictureSelectorStyle = this.config.selectorStyle;
        com.luck.picture.lib.style.SelectMainStyle selectMainStyle = pictureSelectorStyle.getSelectMainStyle();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectMainStyle.getSelectNormalBackgroundResources())) {
            setBackgroundResource(selectMainStyle.getSelectNormalBackgroundResources());
        }
        java.lang.String string = com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectMainStyle.getSelectNormalTextResId()) ? getContext().getString(selectMainStyle.getSelectNormalTextResId()) : selectMainStyle.getSelectNormalText();
        if (com.luck.picture.lib.utils.StyleUtils.checkTextValidity(string)) {
            if (com.luck.picture.lib.utils.StyleUtils.checkTextTwoFormatValidity(string)) {
                this.tvComplete.setText(java.lang.String.format(string, java.lang.Integer.valueOf(this.config.getSelectCount()), java.lang.Integer.valueOf(this.config.maxSelectNum)));
            } else {
                this.tvComplete.setText(string);
            }
        }
        int selectNormalTextSize = selectMainStyle.getSelectNormalTextSize();
        if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(selectNormalTextSize)) {
            this.tvComplete.setTextSize(selectNormalTextSize);
        }
        int selectNormalTextColor = selectMainStyle.getSelectNormalTextColor();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectNormalTextColor)) {
            this.tvComplete.setTextColor(selectNormalTextColor);
        }
        com.luck.picture.lib.style.BottomNavBarStyle bottomBarStyle = pictureSelectorStyle.getBottomBarStyle();
        if (bottomBarStyle.isCompleteCountTips()) {
            int bottomSelectNumResources = bottomBarStyle.getBottomSelectNumResources();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomSelectNumResources)) {
                this.tvSelectNum.setBackgroundResource(bottomSelectNumResources);
            }
            int bottomSelectNumTextSize = bottomBarStyle.getBottomSelectNumTextSize();
            if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(bottomSelectNumTextSize)) {
                this.tvSelectNum.setTextSize(bottomSelectNumTextSize);
            }
            int bottomSelectNumTextColor = bottomBarStyle.getBottomSelectNumTextColor();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomSelectNumTextColor)) {
                this.tvSelectNum.setTextColor(bottomSelectNumTextColor);
            }
        }
    }

    public void setSelectedChange(boolean z) {
        com.luck.picture.lib.style.PictureSelectorStyle pictureSelectorStyle = this.config.selectorStyle;
        com.luck.picture.lib.style.SelectMainStyle selectMainStyle = pictureSelectorStyle.getSelectMainStyle();
        if (this.config.getSelectCount() > 0) {
            setEnabled(true);
            int selectBackgroundResources = selectMainStyle.getSelectBackgroundResources();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectBackgroundResources)) {
                setBackgroundResource(selectBackgroundResources);
            } else {
                setBackgroundResource(com.luck.picture.lib.R.drawable.ps_ic_trans_1px);
            }
            java.lang.String string = com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectMainStyle.getSelectTextResId()) ? getContext().getString(selectMainStyle.getSelectTextResId()) : selectMainStyle.getSelectText();
            if (com.luck.picture.lib.utils.StyleUtils.checkTextValidity(string)) {
                if (com.luck.picture.lib.utils.StyleUtils.checkTextTwoFormatValidity(string)) {
                    this.tvComplete.setText(java.lang.String.format(string, java.lang.Integer.valueOf(this.config.getSelectCount()), java.lang.Integer.valueOf(this.config.maxSelectNum)));
                } else {
                    this.tvComplete.setText(string);
                }
            } else {
                this.tvComplete.setText(getContext().getString(com.luck.picture.lib.R.string.ps_completed));
            }
            int selectTextSize = selectMainStyle.getSelectTextSize();
            if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(selectTextSize)) {
                this.tvComplete.setTextSize(selectTextSize);
            }
            int selectTextColor = selectMainStyle.getSelectTextColor();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectTextColor)) {
                this.tvComplete.setTextColor(selectTextColor);
            } else {
                this.tvComplete.setTextColor(androidx.core.content.ContextCompat.getColor(getContext(), com.luck.picture.lib.R.color.ps_color_fa632d));
            }
            if (pictureSelectorStyle.getBottomBarStyle().isCompleteCountTips()) {
                if (this.tvSelectNum.getVisibility() == 8 || this.tvSelectNum.getVisibility() == 4) {
                    this.tvSelectNum.setVisibility(0);
                }
                if (android.text.TextUtils.equals(com.luck.picture.lib.utils.ValueOf.toString(java.lang.Integer.valueOf(this.config.getSelectCount())), this.tvSelectNum.getText())) {
                    return;
                }
                this.tvSelectNum.setText(com.luck.picture.lib.utils.ValueOf.toString(java.lang.Integer.valueOf(this.config.getSelectCount())));
                if (this.config.onSelectAnimListener != null) {
                    this.config.onSelectAnimListener.onSelectAnim(this.tvSelectNum);
                    return;
                } else {
                    this.tvSelectNum.startAnimation(this.numberChangeAnimation);
                    return;
                }
            }
            this.tvSelectNum.setVisibility(8);
            return;
        }
        if (z && selectMainStyle.isCompleteSelectRelativeTop()) {
            setEnabled(true);
            int selectBackgroundResources2 = selectMainStyle.getSelectBackgroundResources();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectBackgroundResources2)) {
                setBackgroundResource(selectBackgroundResources2);
            } else {
                setBackgroundResource(com.luck.picture.lib.R.drawable.ps_ic_trans_1px);
            }
            int selectTextColor2 = selectMainStyle.getSelectTextColor();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectTextColor2)) {
                this.tvComplete.setTextColor(selectTextColor2);
            } else {
                this.tvComplete.setTextColor(androidx.core.content.ContextCompat.getColor(getContext(), com.luck.picture.lib.R.color.ps_color_9b));
            }
        } else {
            setEnabled(this.config.isEmptyResultReturn);
            int selectNormalBackgroundResources = selectMainStyle.getSelectNormalBackgroundResources();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectNormalBackgroundResources)) {
                setBackgroundResource(selectNormalBackgroundResources);
            } else {
                setBackgroundResource(com.luck.picture.lib.R.drawable.ps_ic_trans_1px);
            }
            int selectNormalTextColor = selectMainStyle.getSelectNormalTextColor();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectNormalTextColor)) {
                this.tvComplete.setTextColor(selectNormalTextColor);
            } else {
                this.tvComplete.setTextColor(androidx.core.content.ContextCompat.getColor(getContext(), com.luck.picture.lib.R.color.ps_color_9b));
            }
        }
        this.tvSelectNum.setVisibility(8);
        java.lang.String string2 = com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectMainStyle.getSelectNormalTextResId()) ? getContext().getString(selectMainStyle.getSelectNormalTextResId()) : selectMainStyle.getSelectNormalText();
        if (com.luck.picture.lib.utils.StyleUtils.checkTextValidity(string2)) {
            if (com.luck.picture.lib.utils.StyleUtils.checkTextTwoFormatValidity(string2)) {
                this.tvComplete.setText(java.lang.String.format(string2, java.lang.Integer.valueOf(this.config.getSelectCount()), java.lang.Integer.valueOf(this.config.maxSelectNum)));
            } else {
                this.tvComplete.setText(string2);
            }
        } else {
            this.tvComplete.setText(getContext().getString(com.luck.picture.lib.R.string.ps_please_select));
        }
        int selectNormalTextSize = selectMainStyle.getSelectNormalTextSize();
        if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(selectNormalTextSize)) {
            this.tvComplete.setTextSize(selectNormalTextSize);
        }
    }
}
