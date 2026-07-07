package com.luck.picture.lib.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public class PicturePreviewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.luck.picture.lib.adapter.holder.BasePreviewHolder> {
    private java.util.List<com.luck.picture.lib.entity.LocalMedia> mData;
    private final java.util.LinkedHashMap<java.lang.Integer, com.luck.picture.lib.adapter.holder.BasePreviewHolder> mHolderCache;
    private com.luck.picture.lib.adapter.holder.BasePreviewHolder.OnPreviewEventListener onPreviewEventListener;
    private final com.luck.picture.lib.config.SelectorConfig selectorConfig;

    public PicturePreviewAdapter() {
        this(com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig());
    }

    public PicturePreviewAdapter(com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        this.mHolderCache = new java.util.LinkedHashMap<>();
        this.selectorConfig = selectorConfig;
    }

    public com.luck.picture.lib.adapter.holder.BasePreviewHolder getCurrentHolder(int i) {
        return this.mHolderCache.get(java.lang.Integer.valueOf(i));
    }

    public void setData(java.util.List<com.luck.picture.lib.entity.LocalMedia> list) {
        this.mData = list;
    }

    public void setOnPreviewEventListener(com.luck.picture.lib.adapter.holder.BasePreviewHolder.OnPreviewEventListener onPreviewEventListener) {
        this.onPreviewEventListener = onPreviewEventListener;
    }

    public com.luck.picture.lib.adapter.holder.BasePreviewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        if (i == 2) {
            int layoutResource = com.luck.picture.lib.config.InjectResourceSource.getLayoutResource(viewGroup.getContext(), 8, this.selectorConfig);
            if (layoutResource == 0) {
                layoutResource = com.luck.picture.lib.R.layout.ps_preview_video;
            }
            return com.luck.picture.lib.adapter.holder.BasePreviewHolder.generate(viewGroup, i, layoutResource);
        }
        if (i == 3) {
            int layoutResource2 = com.luck.picture.lib.config.InjectResourceSource.getLayoutResource(viewGroup.getContext(), 10, this.selectorConfig);
            if (layoutResource2 == 0) {
                layoutResource2 = com.luck.picture.lib.R.layout.ps_preview_audio;
            }
            return com.luck.picture.lib.adapter.holder.BasePreviewHolder.generate(viewGroup, i, layoutResource2);
        }
        int layoutResource3 = com.luck.picture.lib.config.InjectResourceSource.getLayoutResource(viewGroup.getContext(), 7, this.selectorConfig);
        if (layoutResource3 == 0) {
            layoutResource3 = com.luck.picture.lib.R.layout.ps_preview_image;
        }
        return com.luck.picture.lib.adapter.holder.BasePreviewHolder.generate(viewGroup, i, layoutResource3);
    }

    public void onBindViewHolder(com.luck.picture.lib.adapter.holder.BasePreviewHolder basePreviewHolder, int i) {
        basePreviewHolder.setOnPreviewEventListener(this.onPreviewEventListener);
        com.luck.picture.lib.entity.LocalMedia item = getItem(i);
        this.mHolderCache.put(java.lang.Integer.valueOf(i), basePreviewHolder);
        basePreviewHolder.bindData(item, i);
    }

    public com.luck.picture.lib.entity.LocalMedia getItem(int i) {
        if (i > this.mData.size()) {
            return null;
        }
        return this.mData.get(i);
    }

    public int getItemViewType(int i) {
        if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(this.mData.get(i).getMimeType())) {
            return 2;
        }
        return com.luck.picture.lib.config.PictureMimeType.isHasAudio(this.mData.get(i).getMimeType()) ? 3 : 1;
    }

    public int getItemCount() {
        java.util.List<com.luck.picture.lib.entity.LocalMedia> list = this.mData;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void onViewAttachedToWindow(com.luck.picture.lib.adapter.holder.BasePreviewHolder basePreviewHolder) {
        super.onViewAttachedToWindow(basePreviewHolder);
        basePreviewHolder.onViewAttachedToWindow();
    }

    public void onViewDetachedFromWindow(com.luck.picture.lib.adapter.holder.BasePreviewHolder basePreviewHolder) {
        super.onViewDetachedFromWindow(basePreviewHolder);
        basePreviewHolder.onViewDetachedFromWindow();
    }

    public void setCoverScaleType(int i) {
        com.luck.picture.lib.adapter.holder.BasePreviewHolder currentHolder = getCurrentHolder(i);
        if (currentHolder != null) {
            com.luck.picture.lib.entity.LocalMedia item = getItem(i);
            if (item.getWidth() == 0 && item.getHeight() == 0) {
                currentHolder.coverImageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            } else {
                currentHolder.coverImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
        }
    }

    public void setVideoPlayButtonUI(int i) {
        com.luck.picture.lib.adapter.holder.BasePreviewHolder currentHolder = getCurrentHolder(i);
        if (currentHolder instanceof com.luck.picture.lib.adapter.holder.PreviewVideoHolder) {
            com.luck.picture.lib.adapter.holder.PreviewVideoHolder previewVideoHolder = (com.luck.picture.lib.adapter.holder.PreviewVideoHolder) currentHolder;
            if (previewVideoHolder.isPlaying()) {
                return;
            }
            previewVideoHolder.ivPlayButton.setVisibility(0);
        }
    }

    public void startAutoVideoPlay(int i) {
        com.luck.picture.lib.adapter.holder.BasePreviewHolder currentHolder = getCurrentHolder(i);
        if (currentHolder instanceof com.luck.picture.lib.adapter.holder.PreviewVideoHolder) {
            ((com.luck.picture.lib.adapter.holder.PreviewVideoHolder) currentHolder).startPlay();
        }
    }

    public boolean isPlaying(int i) {
        com.luck.picture.lib.adapter.holder.BasePreviewHolder currentHolder = getCurrentHolder(i);
        return currentHolder != null && currentHolder.isPlaying();
    }

    public void destroy() {
        java.util.Iterator<java.lang.Integer> it = this.mHolderCache.keySet().iterator();
        while (it.hasNext()) {
            com.luck.picture.lib.adapter.holder.BasePreviewHolder basePreviewHolder = this.mHolderCache.get(it.next());
            if (basePreviewHolder != null) {
                basePreviewHolder.release();
            }
        }
    }
}
