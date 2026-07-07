package com.luck.picture.lib.adapter.holder;

/* loaded from: /tmp/dex/classes2.dex */
public class CameraViewHolder extends com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder {
    public CameraViewHolder(android.view.View view) {
        super(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.tvCamera);
        this.selectorConfig = com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig();
        com.luck.picture.lib.style.SelectMainStyle selectMainStyle = this.selectorConfig.selectorStyle.getSelectMainStyle();
        int adapterCameraBackgroundColor = selectMainStyle.getAdapterCameraBackgroundColor();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(adapterCameraBackgroundColor)) {
            textView.setBackgroundColor(adapterCameraBackgroundColor);
        }
        int adapterCameraDrawableTop = selectMainStyle.getAdapterCameraDrawableTop();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(adapterCameraDrawableTop)) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, adapterCameraDrawableTop, 0, 0);
        }
        java.lang.String string = com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectMainStyle.getAdapterCameraTextResId()) ? view.getContext().getString(selectMainStyle.getAdapterCameraTextResId()) : selectMainStyle.getAdapterCameraText();
        if (com.luck.picture.lib.utils.StyleUtils.checkTextValidity(string)) {
            textView.setText(string);
        } else if (this.selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
            textView.setText(view.getContext().getString(com.luck.picture.lib.R.string.ps_tape));
        }
        int adapterCameraTextSize = selectMainStyle.getAdapterCameraTextSize();
        if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(adapterCameraTextSize)) {
            textView.setTextSize(adapterCameraTextSize);
        }
        int adapterCameraTextColor = selectMainStyle.getAdapterCameraTextColor();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(adapterCameraTextColor)) {
            textView.setTextColor(adapterCameraTextColor);
        }
    }
}
