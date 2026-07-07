package com.luck.picture.lib.magical;

/* loaded from: /tmp/dex/classes2.dex */
public class MagicalViewWrapper {
    private final android.view.ViewGroup.MarginLayoutParams params;
    private final android.view.View viewWrapper;

    public MagicalViewWrapper(android.view.View view) {
        this.viewWrapper = view;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.params = marginLayoutParams;
        if (marginLayoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            ((android.widget.LinearLayout.LayoutParams) marginLayoutParams).gravity = 8388611;
        }
    }

    public int getWidth() {
        return this.params.width;
    }

    public int getHeight() {
        return this.params.height;
    }

    public void setWidth(float f) {
        this.params.width = java.lang.Math.round(f);
        this.viewWrapper.setLayoutParams(this.params);
    }

    public void setHeight(float f) {
        this.params.height = java.lang.Math.round(f);
        this.viewWrapper.setLayoutParams(this.params);
    }

    public void setMarginTop(int i) {
        this.params.topMargin = i;
        this.viewWrapper.setLayoutParams(this.params);
    }

    public void setMarginBottom(int i) {
        this.params.bottomMargin = i;
        this.viewWrapper.setLayoutParams(this.params);
    }

    public int getMarginTop() {
        return this.params.topMargin;
    }

    public void setMarginRight(int i) {
        this.params.rightMargin = i;
        this.viewWrapper.setLayoutParams(this.params);
    }

    public void setMarginLeft(int i) {
        this.params.leftMargin = i;
        this.viewWrapper.setLayoutParams(this.params);
    }

    public int getMarginRight() {
        return this.params.rightMargin;
    }

    public int getMarginLeft() {
        return this.params.leftMargin;
    }

    public int getMarginBottom() {
        return this.params.bottomMargin;
    }
}
