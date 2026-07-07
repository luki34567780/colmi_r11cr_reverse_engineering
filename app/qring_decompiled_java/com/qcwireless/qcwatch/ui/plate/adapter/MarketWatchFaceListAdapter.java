package com.qcwireless.qcwatch.ui.plate.adapter;

/* compiled from: MarketWatchFaceListAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/adapter/MarketWatchFaceListAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/qcwireless/qcwatch/ui/plate/bean/MarketWatchFaceBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_fileNotExists", "Landroidx/lifecycle/MutableLiveData;", "fileNotExists", "Landroidx/lifecycle/LiveData;", "getFileNotExists", "()Landroidx/lifecycle/LiveData;", "convert", "", "holder", "item", "getItemId", "", "position", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MarketWatchFaceListAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean> _fileNotExists;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketWatchFaceListAdapter(android.content.Context context) {
        super(com.qcwireless.qcwatch.R.layout.recycleview_item_watch_face_market, null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this._fileNotExists = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean> getFileNotExists() {
        return this._fileNotExists;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, final com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        final android.widget.ImageView imageView = (android.widget.ImageView) holder.getView(com.qcwireless.qcwatch.R.id.image_watch_face);
        if (item.getWatchFace().getLocalImageUrl().length() > 0) {
            java.lang.String str = "file://" + item.getWatchFace().getLocalImageUrl();
            if (kotlin.text.StringsKt.endsWith$default(str, com.luck.picture.lib.config.PictureMimeType.GIF, false, 2, (java.lang.Object) null)) {
                com.bumptech.glide.Glide.with(getContext()).asGif().load(str).fitCenter().signature(new com.bumptech.glide.signature.ObjectKey(str + com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion())).diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.AUTOMATIC).into(new com.bumptech.glide.request.target.CustomTarget<com.bumptech.glide.load.resource.gif.GifDrawable>() { // from class: com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter$convert$1
                    @Override // com.bumptech.glide.request.target.Target
                    public /* bridge */ /* synthetic */ void onResourceReady(java.lang.Object obj, com.bumptech.glide.request.transition.Transition transition) {
                        onResourceReady((com.bumptech.glide.load.resource.gif.GifDrawable) obj, (com.bumptech.glide.request.transition.Transition<? super com.bumptech.glide.load.resource.gif.GifDrawable>) transition);
                    }

                    public void onResourceReady(com.bumptech.glide.load.resource.gif.GifDrawable resource, com.bumptech.glide.request.transition.Transition<? super com.bumptech.glide.load.resource.gif.GifDrawable> transition) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "resource");
                        resource.start();
                        imageView.setImageDrawable(resource);
                    }

                    @Override // com.bumptech.glide.request.target.Target
                    public void onLoadCleared(android.graphics.drawable.Drawable placeholder) {
                        androidx.lifecycle.MutableLiveData mutableLiveData;
                        mutableLiveData = this._fileNotExists;
                        mutableLiveData.postValue(item);
                    }
                });
            } else {
                com.bumptech.glide.Glide.with(getContext()).load(str).fitCenter().placeholder(com.qcwireless.qcwatch.R.mipmap.app_icon).dontAnimate().signature(new com.bumptech.glide.signature.ObjectKey(str + com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion())).diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.AUTOMATIC).into(new com.bumptech.glide.request.target.CustomTarget<android.graphics.drawable.Drawable>() { // from class: com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter$convert$2
                    @Override // com.bumptech.glide.request.target.Target
                    public void onLoadCleared(android.graphics.drawable.Drawable placeholder) {
                    }

                    @Override // com.bumptech.glide.request.target.Target
                    public /* bridge */ /* synthetic */ void onResourceReady(java.lang.Object obj, com.bumptech.glide.request.transition.Transition transition) {
                        onResourceReady((android.graphics.drawable.Drawable) obj, (com.bumptech.glide.request.transition.Transition<? super android.graphics.drawable.Drawable>) transition);
                    }

                    public void onResourceReady(android.graphics.drawable.Drawable resource, com.bumptech.glide.request.transition.Transition<? super android.graphics.drawable.Drawable> transition) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "resource");
                        imageView.setImageDrawable(resource);
                    }

                    @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                    public void onLoadFailed(android.graphics.drawable.Drawable errorDrawable) {
                        androidx.lifecycle.MutableLiveData mutableLiveData;
                        super.onLoadFailed(errorDrawable);
                        android.widget.ImageView imageView2 = imageView;
                        coil.Coil.imageLoader(imageView2.getContext()).enqueue(new coil.request.ImageRequest.Builder(imageView2.getContext()).data(item.getWatchFace().getPreImageUrl()).target(imageView2).build());
                        mutableLiveData = this._fileNotExists;
                        mutableLiveData.postValue(item);
                    }
                });
            }
        } else {
            com.bumptech.glide.Glide.with(getContext()).load(item.getWatchFace().getPreImageUrl()).fitCenter().signature(new com.bumptech.glide.signature.ObjectKey(item.getWatchFace().getPreImageUrl() + com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion())).into(imageView);
        }
        com.qcwireless.qcwatch.ui.base.view.LoadSendView loadSendView = (com.qcwireless.qcwatch.ui.base.view.LoadSendView) holder.getView(com.qcwireless.qcwatch.R.id.lsv_loading);
        if (item.getProgressBar() > 0) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(loadSendView);
            loadSendView.updateUI(item.getProgressBar() * 3.6f);
        } else {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(loadSendView);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public long getItemId(int position) {
        try {
            return java.lang.Integer.parseInt((java.lang.String) kotlin.text.StringsKt.split$default(getItem(position).getWatchFace().getName(), new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null).get(0), kotlin.text.CharsKt.checkRadix(16));
        } catch (java.lang.Exception unused) {
            return position;
        }
    }
}
