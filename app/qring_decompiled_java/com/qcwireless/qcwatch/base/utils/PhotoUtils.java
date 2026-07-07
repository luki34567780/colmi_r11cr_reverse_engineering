package com.qcwireless.qcwatch.base.utils;

/* compiled from: PhotoUtils.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ&\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n¨\u0006\u0011"}, d2 = {"Lcom/qcwireless/qcwatch/base/utils/PhotoUtils;", "", "()V", "saveBitmap2Gallery", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "file", "Ljava/io/File;", "saveBitmap2Gallery2", "saveBitmapGallery", "", "saveBitmapGalleryBitmap", "name", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class PhotoUtils {
    public static final com.qcwireless.qcwatch.base.utils.PhotoUtils INSTANCE = new com.qcwireless.qcwatch.base.utils.PhotoUtils();

    private PhotoUtils() {
    }

    public final boolean saveBitmap2Gallery(android.content.Context context, android.graphics.Bitmap bitmap, java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.net.Uri insert = context.getContentResolver().insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new android.content.ContentValues());
            if (insert == null) {
                return false;
            }
            java.io.OutputStream openOutputStream = context.getContentResolver().openOutputStream(insert);
            try {
                java.io.OutputStream outputStream = openOutputStream;
                if (outputStream == null) {
                    kotlin.io.CloseableKt.closeFinally(openOutputStream, (java.lang.Throwable) null);
                    return false;
                }
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, outputStream);
                kotlin.io.CloseableKt.closeFinally(openOutputStream, (java.lang.Throwable) null);
                com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().sendBroadcast(new android.content.Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", android.net.Uri.parse("file://" + file.getAbsolutePath())));
                return true;
            } finally {
            }
        } else {
            android.provider.MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "title", "desc");
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().sendBroadcast(new android.content.Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", android.net.Uri.parse("file://" + file.getAbsolutePath())));
            return true;
        }
    }

    public final boolean saveBitmap2Gallery2(android.content.Context context, android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        java.lang.String str = android.os.Environment.DIRECTORY_DCIM + "/Camera";
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("_display_name", valueOf);
        contentValues.put("mime_type", "image/jpeg");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            contentValues.put("relative_path", str);
            contentValues.put("is_pending", (java.lang.Boolean) true);
        }
        android.net.Uri insert = context.getContentResolver().insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (insert == null) {
            return false;
        }
        java.io.OutputStream openOutputStream = context.getContentResolver().openOutputStream(insert);
        try {
            java.io.OutputStream outputStream = openOutputStream;
            if (outputStream == null) {
                kotlin.io.CloseableKt.closeFinally(openOutputStream, (java.lang.Throwable) null);
                return false;
            }
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, outputStream);
            kotlin.io.CloseableKt.closeFinally(openOutputStream, (java.lang.Throwable) null);
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                contentValues.put("is_pending", (java.lang.Boolean) false);
            }
            return true;
        } finally {
        }
    }

    public final void saveBitmapGallery(android.content.Context context, java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        try {
            android.provider.MediaStore.Images.Media.insertImage(context.getContentResolver(), file.getAbsolutePath(), file.getName(), (java.lang.String) null);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().sendBroadcast(new android.content.Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", android.net.Uri.parse("file://" + file.getAbsolutePath())));
    }

    public final void saveBitmapGalleryBitmap(android.content.Context context, android.graphics.Bitmap bitmap, java.lang.String name, java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        try {
            android.provider.MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, name, (java.lang.String) null);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().sendBroadcast(new android.content.Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", android.net.Uri.parse("file://" + file.getAbsolutePath())));
    }
}
