package com.google.android.material.badge;

/* loaded from: /tmp/dex/classes2.dex */
public class BadgeUtils {
    public static final boolean USE_COMPAT_PARENT;

    static {
        USE_COMPAT_PARENT = android.os.Build.VERSION.SDK_INT < 18;
    }

    private BadgeUtils() {
    }

    public static void updateBadgeBounds(android.graphics.Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    public static void attachBadgeDrawable(com.google.android.material.badge.BadgeDrawable badgeDrawable, android.view.View view, android.widget.FrameLayout frameLayout) {
        setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
        if (USE_COMPAT_PARENT) {
            frameLayout.setForeground(badgeDrawable);
        } else {
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void detachBadgeDrawable(com.google.android.material.badge.BadgeDrawable badgeDrawable, android.view.View view, android.widget.FrameLayout frameLayout) {
        if (badgeDrawable == null) {
            return;
        }
        if (USE_COMPAT_PARENT) {
            frameLayout.setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    public static void setBadgeDrawableBounds(com.google.android.material.badge.BadgeDrawable badgeDrawable, android.view.View view, android.widget.FrameLayout frameLayout) {
        android.graphics.Rect rect = new android.graphics.Rect();
        (USE_COMPAT_PARENT ? frameLayout : view).getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.updateBadgeCoordinates(view, frameLayout);
    }

    public static com.google.android.material.internal.ParcelableSparseArray createParcelableBadgeStates(android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> sparseArray) {
        com.google.android.material.internal.ParcelableSparseArray parcelableSparseArray = new com.google.android.material.internal.ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            com.google.android.material.badge.BadgeDrawable valueAt = sparseArray.valueAt(i);
            if (valueAt == null) {
                throw new java.lang.IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(keyAt, valueAt.getSavedState());
        }
        return parcelableSparseArray;
    }

    public static android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> createBadgeDrawablesFromSavedStates(android.content.Context context, com.google.android.material.internal.ParcelableSparseArray parcelableSparseArray) {
        android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> sparseArray = new android.util.SparseArray<>(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int keyAt = parcelableSparseArray.keyAt(i);
            com.google.android.material.badge.BadgeDrawable.SavedState savedState = (com.google.android.material.badge.BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i);
            if (savedState == null) {
                throw new java.lang.IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(keyAt, com.google.android.material.badge.BadgeDrawable.createFromSavedState(context, savedState));
        }
        return sparseArray;
    }
}
