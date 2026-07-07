package com.luck.picture.lib.adapter.holder;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class BasePreviewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    public static final int ADAPTER_TYPE_AUDIO = 3;
    public static final int ADAPTER_TYPE_IMAGE = 1;
    public static final int ADAPTER_TYPE_VIDEO = 2;
    public com.luck.picture.lib.photoview.PhotoView coverImageView;
    protected com.luck.picture.lib.adapter.holder.BasePreviewHolder.OnPreviewEventListener mPreviewEventListener;
    protected com.luck.picture.lib.entity.LocalMedia media;
    protected final int screenAppInHeight;
    protected final int screenHeight;
    protected final int screenWidth;
    protected final com.luck.picture.lib.config.SelectorConfig selectorConfig;

    public interface OnPreviewEventListener {
        void onBackPressed();

        void onLongPressDownload(com.luck.picture.lib.entity.LocalMedia localMedia);

        void onPreviewVideoTitle(java.lang.String str);
    }

    protected abstract void findViews(android.view.View view);

    public boolean isPlaying() {
        return false;
    }

    protected abstract void loadImage(com.luck.picture.lib.entity.LocalMedia localMedia, int i, int i2);

    protected abstract void onClickBackPressed();

    protected abstract void onLongPressDownload(com.luck.picture.lib.entity.LocalMedia localMedia);

    public void onViewAttachedToWindow() {
    }

    public void onViewDetachedFromWindow() {
    }

    public void release() {
    }

    public void resumePausePlay() {
    }

    public static com.luck.picture.lib.adapter.holder.BasePreviewHolder generate(android.view.ViewGroup viewGroup, int i, int i2) {
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        if (i == 2) {
            return new com.luck.picture.lib.adapter.holder.PreviewVideoHolder(inflate);
        }
        if (i == 3) {
            return new com.luck.picture.lib.adapter.holder.PreviewAudioHolder(inflate);
        }
        return new com.luck.picture.lib.adapter.holder.PreviewImageHolder(inflate);
    }

    public BasePreviewHolder(android.view.View view) {
        super(view);
        this.selectorConfig = com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig();
        this.screenWidth = com.luck.picture.lib.utils.DensityUtil.getRealScreenWidth(view.getContext());
        this.screenHeight = com.luck.picture.lib.utils.DensityUtil.getScreenHeight(view.getContext());
        this.screenAppInHeight = com.luck.picture.lib.utils.DensityUtil.getRealScreenHeight(view.getContext());
        this.coverImageView = (com.luck.picture.lib.photoview.PhotoView) view.findViewById(com.luck.picture.lib.R.id.preview_image);
        findViews(view);
    }

    public void bindData(com.luck.picture.lib.entity.LocalMedia localMedia, int i) {
        this.media = localMedia;
        int[] realSizeFromMedia = getRealSizeFromMedia(localMedia);
        int[] maxImageSize = com.luck.picture.lib.utils.BitmapUtils.getMaxImageSize(realSizeFromMedia[0], realSizeFromMedia[1]);
        loadImage(localMedia, maxImageSize[0], maxImageSize[1]);
        setScaleDisplaySize(localMedia);
        setCoverScaleType(localMedia);
        onClickBackPressed();
        onLongPressDownload(localMedia);
    }

    protected int[] getRealSizeFromMedia(com.luck.picture.lib.entity.LocalMedia localMedia) {
        return (!localMedia.isCut() || localMedia.getCropImageWidth() <= 0 || localMedia.getCropImageHeight() <= 0) ? new int[]{localMedia.getWidth(), localMedia.getHeight()} : new int[]{localMedia.getCropImageWidth(), localMedia.getCropImageHeight()};
    }

    protected void setCoverScaleType(com.luck.picture.lib.entity.LocalMedia localMedia) {
        if (com.luck.picture.lib.utils.MediaUtils.isLongImage(localMedia.getWidth(), localMedia.getHeight())) {
            this.coverImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        } else {
            this.coverImageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        }
    }

    protected void setScaleDisplaySize(com.luck.picture.lib.entity.LocalMedia localMedia) {
        if (this.selectorConfig.isPreviewZoomEffect || this.screenWidth >= this.screenHeight || localMedia.getWidth() <= 0 || localMedia.getHeight() <= 0) {
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.coverImageView.getLayoutParams();
        layoutParams.width = this.screenWidth;
        layoutParams.height = this.screenAppInHeight;
        layoutParams.gravity = 17;
    }

    public void setOnPreviewEventListener(com.luck.picture.lib.adapter.holder.BasePreviewHolder.OnPreviewEventListener onPreviewEventListener) {
        this.mPreviewEventListener = onPreviewEventListener;
    }
}
