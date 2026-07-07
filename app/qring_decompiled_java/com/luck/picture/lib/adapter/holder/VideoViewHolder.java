package com.luck.picture.lib.adapter.holder;

/* loaded from: /tmp/dex/classes2.dex */
public class VideoViewHolder extends com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder {
    private final android.widget.TextView tvDuration;

    public VideoViewHolder(android.view.View view, com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        super(view, selectorConfig);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.tv_duration);
        this.tvDuration = textView;
        com.luck.picture.lib.style.SelectMainStyle selectMainStyle = this.selectorConfig.selectorStyle.getSelectMainStyle();
        int adapterDurationDrawableLeft = selectMainStyle.getAdapterDurationDrawableLeft();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(adapterDurationDrawableLeft)) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(adapterDurationDrawableLeft, 0, 0, 0);
        }
        int adapterDurationTextSize = selectMainStyle.getAdapterDurationTextSize();
        if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(adapterDurationTextSize)) {
            textView.setTextSize(adapterDurationTextSize);
        }
        int adapterDurationTextColor = selectMainStyle.getAdapterDurationTextColor();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(adapterDurationTextColor)) {
            textView.setTextColor(adapterDurationTextColor);
        }
        int adapterDurationBackgroundResources = selectMainStyle.getAdapterDurationBackgroundResources();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(adapterDurationBackgroundResources)) {
            textView.setBackgroundResource(adapterDurationBackgroundResources);
        }
        int[] adapterDurationGravity = selectMainStyle.getAdapterDurationGravity();
        if (com.luck.picture.lib.utils.StyleUtils.checkArrayValidity(adapterDurationGravity) && (textView.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams)) {
            ((android.widget.RelativeLayout.LayoutParams) textView.getLayoutParams()).removeRule(12);
            for (int i : adapterDurationGravity) {
                ((android.widget.RelativeLayout.LayoutParams) this.tvDuration.getLayoutParams()).addRule(i);
            }
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder
    public void bindData(com.luck.picture.lib.entity.LocalMedia localMedia, int i) {
        super.bindData(localMedia, i);
        this.tvDuration.setText(com.luck.picture.lib.utils.DateUtils.formatDurationTime(localMedia.getDuration()));
    }
}
