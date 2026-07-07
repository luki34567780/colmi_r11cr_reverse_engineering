package com.qcwireless.qcwatch.ui.base.imagepicker;

/* loaded from: /tmp/dex/classes2.dex */
public class Utils {
    public static android.net.Uri getIntentUri(android.content.Context context, android.net.Uri uri) {
        return android.os.Build.VERSION.SDK_INT >= 24 ? getContentUri(context, uri) : uri;
    }

    public static android.net.Uri getContentUri(android.content.Context context, android.net.Uri fileUri) {
        return androidx.core.content.FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".imagePicker.provider", new java.io.File(fileUri.getPath()));
    }

    public static java.lang.String getRealPathFromURI(android.content.Context context, android.net.Uri contentUri) {
        android.database.Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(contentUri, new java.lang.String[]{"_data"}, null, null, null);
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            cursor.moveToFirst();
            return cursor.getString(columnIndexOrThrow);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
