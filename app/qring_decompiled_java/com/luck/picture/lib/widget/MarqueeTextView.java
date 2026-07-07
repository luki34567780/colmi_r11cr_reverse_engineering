package com.luck.picture.lib.widget;

/* loaded from: /tmp/dex/classes2.dex */
public class MarqueeTextView extends com.luck.picture.lib.widget.MediumBoldTextView {
    public boolean isFocused() {
        return true;
    }

    public boolean isSelected() {
        return true;
    }

    public MarqueeTextView(android.content.Context context) {
        super(context);
    }

    public MarqueeTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        if (z) {
            super.onFocusChanged(true, i, rect);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            super.onWindowFocusChanged(true);
        }
    }
}
