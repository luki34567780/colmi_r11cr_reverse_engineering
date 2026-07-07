package com.luck.picture.lib.adapter.holder;

/* loaded from: /tmp/dex/classes2.dex */
public class ImageViewHolder extends com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder {
    private final android.widget.ImageView ivEditor;
    private final android.widget.TextView tvMediaTag;

    public ImageViewHolder(android.view.View view, com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        super(view, selectorConfig);
        this.tvMediaTag = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.tv_media_tag);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.luck.picture.lib.R.id.ivEditor);
        this.ivEditor = imageView;
        com.luck.picture.lib.style.SelectMainStyle selectMainStyle = this.selectorConfig.selectorStyle.getSelectMainStyle();
        int adapterImageEditorResources = selectMainStyle.getAdapterImageEditorResources();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(adapterImageEditorResources)) {
            imageView.setImageResource(adapterImageEditorResources);
        }
        int[] adapterImageEditorGravity = selectMainStyle.getAdapterImageEditorGravity();
        if (com.luck.picture.lib.utils.StyleUtils.checkArrayValidity(adapterImageEditorGravity) && (imageView.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams)) {
            ((android.widget.RelativeLayout.LayoutParams) imageView.getLayoutParams()).removeRule(12);
            for (int i : adapterImageEditorGravity) {
                ((android.widget.RelativeLayout.LayoutParams) this.ivEditor.getLayoutParams()).addRule(i);
            }
        }
        int[] adapterTagGravity = selectMainStyle.getAdapterTagGravity();
        if (com.luck.picture.lib.utils.StyleUtils.checkArrayValidity(adapterTagGravity) && (this.tvMediaTag.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams)) {
            ((android.widget.RelativeLayout.LayoutParams) this.tvMediaTag.getLayoutParams()).removeRule(21);
            ((android.widget.RelativeLayout.LayoutParams) this.tvMediaTag.getLayoutParams()).removeRule(12);
            for (int i2 : adapterTagGravity) {
                ((android.widget.RelativeLayout.LayoutParams) this.tvMediaTag.getLayoutParams()).addRule(i2);
            }
        }
        int adapterTagBackgroundResources = selectMainStyle.getAdapterTagBackgroundResources();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(adapterTagBackgroundResources)) {
            this.tvMediaTag.setBackgroundResource(adapterTagBackgroundResources);
        }
        int adapterTagTextSize = selectMainStyle.getAdapterTagTextSize();
        if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(adapterTagTextSize)) {
            this.tvMediaTag.setTextSize(adapterTagTextSize);
        }
        int adapterTagTextColor = selectMainStyle.getAdapterTagTextColor();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(adapterTagTextColor)) {
            this.tvMediaTag.setTextColor(adapterTagTextColor);
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder
    public void bindData(com.luck.picture.lib.entity.LocalMedia localMedia, int i) {
        super.bindData(localMedia, i);
        if (localMedia.isEditorImage() && localMedia.isCut()) {
            this.ivEditor.setVisibility(0);
        } else {
            this.ivEditor.setVisibility(8);
        }
        this.tvMediaTag.setVisibility(0);
        if (com.luck.picture.lib.config.PictureMimeType.isHasGif(localMedia.getMimeType())) {
            this.tvMediaTag.setText(this.mContext.getString(com.luck.picture.lib.R.string.ps_gif_tag));
            return;
        }
        if (com.luck.picture.lib.config.PictureMimeType.isHasWebp(localMedia.getMimeType())) {
            this.tvMediaTag.setText(this.mContext.getString(com.luck.picture.lib.R.string.ps_webp_tag));
        } else if (com.luck.picture.lib.utils.MediaUtils.isLongImage(localMedia.getWidth(), localMedia.getHeight())) {
            this.tvMediaTag.setText(this.mContext.getString(com.luck.picture.lib.R.string.ps_long_chart));
        } else {
            this.tvMediaTag.setVisibility(8);
        }
    }
}
