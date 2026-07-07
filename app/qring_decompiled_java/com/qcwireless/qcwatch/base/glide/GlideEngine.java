package com.qcwireless.qcwatch.base.glide;

/* loaded from: /tmp/dex/classes2.dex */
public class GlideEngine implements com.luck.picture.lib.engine.ImageEngine {
    @Override // com.luck.picture.lib.engine.ImageEngine
    public void loadImage(android.content.Context context, java.lang.String url, android.widget.ImageView imageView) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.assertValidRequest(context)) {
            com.bumptech.glide.Glide.with(context).load(url).into(imageView);
        }
    }

    @Override // com.luck.picture.lib.engine.ImageEngine
    public void loadImage(android.content.Context context, android.widget.ImageView imageView, java.lang.String url, int maxWidth, int maxHeight) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.assertValidRequest(context)) {
            com.bumptech.glide.Glide.with(context).load(url).override(maxWidth, maxHeight).into(imageView);
        }
    }

    @Override // com.luck.picture.lib.engine.ImageEngine
    public void loadAlbumCover(android.content.Context context, java.lang.String url, android.widget.ImageView imageView) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.assertValidRequest(context)) {
            com.bumptech.glide.Glide.with(context).asBitmap().load(url).override(180, 180).sizeMultiplier(0.5f).transform(new com.bumptech.glide.load.Transformation[]{new com.bumptech.glide.load.resource.bitmap.CenterCrop(), new com.bumptech.glide.load.resource.bitmap.RoundedCorners(8)}).placeholder(2131231014).into(imageView);
        }
    }

    @Override // com.luck.picture.lib.engine.ImageEngine
    public void loadGridImage(android.content.Context context, java.lang.String url, android.widget.ImageView imageView) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.assertValidRequest(context)) {
            com.bumptech.glide.Glide.with(context).load(url).override(200, 200).centerCrop().placeholder(2131231014).into(imageView);
        }
    }

    @Override // com.luck.picture.lib.engine.ImageEngine
    public void pauseRequests(android.content.Context context) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.assertValidRequest(context)) {
            com.bumptech.glide.Glide.with(context).pauseRequests();
        }
    }

    @Override // com.luck.picture.lib.engine.ImageEngine
    public void resumeRequests(android.content.Context context) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.assertValidRequest(context)) {
            com.bumptech.glide.Glide.with(context).resumeRequests();
        }
    }

    private GlideEngine() {
    }

    private static final class InstanceHolder {
        static final com.qcwireless.qcwatch.base.glide.GlideEngine instance = new com.qcwireless.qcwatch.base.glide.GlideEngine();

        private InstanceHolder() {
        }
    }

    public static com.qcwireless.qcwatch.base.glide.GlideEngine createGlideEngine() {
        return com.qcwireless.qcwatch.base.glide.GlideEngine.InstanceHolder.instance;
    }
}
