package com.luck.picture.lib.widget;

/* loaded from: /tmp/dex/classes2.dex */
public class PreviewTitleBar extends com.luck.picture.lib.widget.TitleBar {
    public PreviewTitleBar(android.content.Context context) {
        super(context);
    }

    public PreviewTitleBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewTitleBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.luck.picture.lib.widget.TitleBar
    public void setTitleBarStyle() {
        super.setTitleBarStyle();
        com.luck.picture.lib.style.TitleBarStyle titleBarStyle = this.config.selectorStyle.getTitleBarStyle();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(titleBarStyle.getPreviewTitleBackgroundColor())) {
            setBackgroundColor(titleBarStyle.getPreviewTitleBackgroundColor());
        } else if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(titleBarStyle.getTitleBackgroundColor())) {
            setBackgroundColor(titleBarStyle.getTitleBackgroundColor());
        }
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(titleBarStyle.getPreviewTitleLeftBackResource())) {
            this.ivLeftBack.setImageResource(titleBarStyle.getPreviewTitleLeftBackResource());
        }
        this.rlAlbumBg.setOnClickListener(null);
        this.viewAlbumClickArea.setOnClickListener(null);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.rlAlbumBg.getLayoutParams();
        layoutParams.removeRule(17);
        layoutParams.addRule(14);
        this.rlAlbumBg.setBackgroundResource(com.luck.picture.lib.R.drawable.ps_ic_trans_1px);
        this.tvCancel.setVisibility(8);
        this.ivArrow.setVisibility(8);
        this.viewAlbumClickArea.setVisibility(8);
    }
}
