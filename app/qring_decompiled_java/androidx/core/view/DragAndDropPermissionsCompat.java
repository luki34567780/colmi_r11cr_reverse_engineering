package androidx.core.view;

/* loaded from: classes.dex */
public final class DragAndDropPermissionsCompat {
    private java.lang.Object mDragAndDropPermissions;

    private DragAndDropPermissionsCompat(java.lang.Object obj) {
        this.mDragAndDropPermissions = obj;
    }

    public static androidx.core.view.DragAndDropPermissionsCompat request(android.app.Activity activity, android.view.DragEvent dragEvent) {
        android.view.DragAndDropPermissions requestDragAndDropPermissions;
        if (android.os.Build.VERSION.SDK_INT < 24 || (requestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent)) == null) {
            return null;
        }
        return new androidx.core.view.DragAndDropPermissionsCompat(requestDragAndDropPermissions);
    }

    public void release() {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            ((android.view.DragAndDropPermissions) this.mDragAndDropPermissions).release();
        }
    }
}
