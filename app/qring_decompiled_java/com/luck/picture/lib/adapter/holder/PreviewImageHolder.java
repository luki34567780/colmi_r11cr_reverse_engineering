package com.luck.picture.lib.adapter.holder;

/* loaded from: /tmp/dex/classes2.dex */
public class PreviewImageHolder extends com.luck.picture.lib.adapter.holder.BasePreviewHolder {
    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    protected void findViews(android.view.View view) {
    }

    public PreviewImageHolder(android.view.View view) {
        super(view);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    protected void loadImage(com.luck.picture.lib.entity.LocalMedia localMedia, int i, int i2) {
        if (this.selectorConfig.imageEngine != null) {
            java.lang.String availablePath = localMedia.getAvailablePath();
            if (i == -1 && i2 == -1) {
                this.selectorConfig.imageEngine.loadImage(this.itemView.getContext(), availablePath, this.coverImageView);
            } else {
                this.selectorConfig.imageEngine.loadImage(this.itemView.getContext(), this.coverImageView, availablePath, i, i2);
            }
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    protected void onClickBackPressed() {
        this.coverImageView.setOnViewTapListener(new com.luck.picture.lib.photoview.OnViewTapListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewImageHolder.1
            @Override // com.luck.picture.lib.photoview.OnViewTapListener
            public void onViewTap(android.view.View view, float f, float f2) {
                if (com.luck.picture.lib.adapter.holder.PreviewImageHolder.this.mPreviewEventListener != null) {
                    com.luck.picture.lib.adapter.holder.PreviewImageHolder.this.mPreviewEventListener.onBackPressed();
                }
            }
        });
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    protected void onLongPressDownload(final com.luck.picture.lib.entity.LocalMedia localMedia) {
        this.coverImageView.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewImageHolder.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(android.view.View view) {
                if (com.luck.picture.lib.adapter.holder.PreviewImageHolder.this.mPreviewEventListener == null) {
                    return false;
                }
                com.luck.picture.lib.adapter.holder.PreviewImageHolder.this.mPreviewEventListener.onLongPressDownload(localMedia);
                return false;
            }
        });
    }
}
