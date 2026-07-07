package androidx.camera.core.internal.utils;

/* loaded from: classes.dex */
public final class VideoUtil {
    private static final java.lang.String TAG = "VideoUtil";

    private VideoUtil() {
    }

    public static java.lang.String getAbsolutePathFromUri(android.content.ContentResolver resolver, android.net.Uri contentUri) {
        android.database.Cursor cursor;
        android.database.Cursor cursor2 = null;
        try {
            try {
                cursor2 = resolver.query(contentUri, new java.lang.String[]{"_data"}, null, null, null);
                cursor = (android.database.Cursor) androidx.core.util.Preconditions.checkNotNull(cursor2);
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.lang.RuntimeException e) {
            e = e;
        }
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            cursor.moveToFirst();
            java.lang.String string = cursor.getString(columnIndexOrThrow);
            if (cursor != null) {
                cursor.close();
            }
            return string;
        } catch (java.lang.RuntimeException e2) {
            e = e2;
            cursor2 = cursor;
            androidx.camera.core.Logger.e(TAG, java.lang.String.format("Failed in getting absolute path for Uri %s with Exception %s", contentUri.toString(), e.toString()));
            if (cursor2 != null) {
                cursor2.close();
            }
            return "";
        } catch (java.lang.Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }
}
