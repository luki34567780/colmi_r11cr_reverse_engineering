package com.bumptech.glide.request.target;

/* loaded from: /tmp/dex/classes2.dex */
public class NotificationTarget extends com.bumptech.glide.request.target.CustomTarget<android.graphics.Bitmap> {
    private final android.content.Context context;
    private final android.app.Notification notification;
    private final int notificationId;
    private final java.lang.String notificationTag;
    private final android.widget.RemoteViews remoteViews;
    private final int viewId;

    @Override // com.bumptech.glide.request.target.Target
    public /* bridge */ /* synthetic */ void onResourceReady(java.lang.Object obj, com.bumptech.glide.request.transition.Transition transition) {
        onResourceReady((android.graphics.Bitmap) obj, (com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap>) transition);
    }

    public NotificationTarget(android.content.Context context, int i, android.widget.RemoteViews remoteViews, android.app.Notification notification, int i2) {
        this(context, i, remoteViews, notification, i2, null);
    }

    public NotificationTarget(android.content.Context context, int i, android.widget.RemoteViews remoteViews, android.app.Notification notification, int i2, java.lang.String str) {
        this(context, com.bumptech.glide.request.target.Target.SIZE_ORIGINAL, com.bumptech.glide.request.target.Target.SIZE_ORIGINAL, i, remoteViews, notification, i2, str);
    }

    public NotificationTarget(android.content.Context context, int i, int i2, int i3, android.widget.RemoteViews remoteViews, android.app.Notification notification, int i4, java.lang.String str) {
        super(i, i2);
        this.context = (android.content.Context) com.bumptech.glide.util.Preconditions.checkNotNull(context, "Context must not be null!");
        this.notification = (android.app.Notification) com.bumptech.glide.util.Preconditions.checkNotNull(notification, "Notification object can not be null!");
        this.remoteViews = (android.widget.RemoteViews) com.bumptech.glide.util.Preconditions.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.viewId = i3;
        this.notificationId = i4;
        this.notificationTag = str;
    }

    private void update() {
        ((android.app.NotificationManager) com.bumptech.glide.util.Preconditions.checkNotNull((android.app.NotificationManager) this.context.getSystemService("notification"))).notify(this.notificationTag, this.notificationId, this.notification);
    }

    public void onResourceReady(android.graphics.Bitmap bitmap, com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap> transition) {
        setBitmap(bitmap);
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(android.graphics.drawable.Drawable drawable) {
        setBitmap(null);
    }

    private void setBitmap(android.graphics.Bitmap bitmap) {
        this.remoteViews.setImageViewBitmap(this.viewId, bitmap);
        update();
    }
}
