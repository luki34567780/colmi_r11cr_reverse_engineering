package com.qcwireless.qcwatch.base.glide;

/* loaded from: /tmp/dex/classes2.dex */
public final class GlideApp {
    private GlideApp() {
    }

    public static java.io.File getPhotoCacheDir(android.content.Context context) {
        return com.bumptech.glide.Glide.getPhotoCacheDir(context);
    }

    public static java.io.File getPhotoCacheDir(android.content.Context context, java.lang.String string) {
        return com.bumptech.glide.Glide.getPhotoCacheDir(context, string);
    }

    public static com.bumptech.glide.Glide get(android.content.Context context) {
        return com.bumptech.glide.Glide.get(context);
    }

    @java.lang.Deprecated
    public static void init(com.bumptech.glide.Glide glide) {
        com.bumptech.glide.Glide.init(glide);
    }

    public static void init(android.content.Context context, com.bumptech.glide.GlideBuilder builder) {
        com.bumptech.glide.Glide.init(context, builder);
    }

    public static void enableHardwareBitmaps() {
        com.bumptech.glide.Glide.enableHardwareBitmaps();
    }

    public static void tearDown() {
        com.bumptech.glide.Glide.tearDown();
    }

    public static com.qcwireless.qcwatch.base.glide.GlideRequests with(android.content.Context context) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequests) com.bumptech.glide.Glide.with(context);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideRequests with(android.app.Activity activity) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequests) com.bumptech.glide.Glide.with(activity);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideRequests with(androidx.fragment.app.FragmentActivity activity) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequests) com.bumptech.glide.Glide.with(activity);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideRequests with(androidx.fragment.app.Fragment fragment) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequests) com.bumptech.glide.Glide.with(fragment);
    }

    @java.lang.Deprecated
    public static com.qcwireless.qcwatch.base.glide.GlideRequests with(android.app.Fragment fragment) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequests) com.bumptech.glide.Glide.with(fragment);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideRequests with(android.view.View view) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequests) com.bumptech.glide.Glide.with(view);
    }
}
