package com.luck.picture.lib.widget;

/* loaded from: /tmp/dex/classes2.dex */
public class PreviewBottomNavBar extends com.luck.picture.lib.widget.BottomNavBar {
    public PreviewBottomNavBar(android.content.Context context) {
        super(context);
    }

    public PreviewBottomNavBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewBottomNavBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.luck.picture.lib.widget.BottomNavBar
    protected void handleLayoutUI() {
        this.tvPreview.setVisibility(8);
        this.tvImageEditor.setOnClickListener(this);
        this.tvImageEditor.setVisibility(this.config.onEditMediaEventListener != null ? 0 : 8);
    }

    public void isDisplayEditor(boolean z) {
        this.tvImageEditor.setVisibility((this.config.onEditMediaEventListener == null || z) ? 8 : 0);
    }

    public android.widget.TextView getEditor() {
        return this.tvImageEditor;
    }

    @Override // com.luck.picture.lib.widget.BottomNavBar
    public void setBottomNavBarStyle() {
        super.setBottomNavBarStyle();
        com.luck.picture.lib.style.BottomNavBarStyle bottomBarStyle = this.config.selectorStyle.getBottomBarStyle();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(bottomBarStyle.getBottomPreviewNarBarBackgroundColor())) {
            setBackgroundColor(bottomBarStyle.getBottomPreviewNarBarBackgroundColor());
        } else if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(bottomBarStyle.getBottomNarBarBackgroundColor())) {
            setBackgroundColor(bottomBarStyle.getBottomNarBarBackgroundColor());
        }
    }

    @Override // com.luck.picture.lib.widget.BottomNavBar, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        super.onClick(view);
        if (view.getId() != com.luck.picture.lib.R.id.ps_tv_editor || this.bottomNavBarListener == null) {
            return;
        }
        this.bottomNavBarListener.onEditImage();
    }
}
