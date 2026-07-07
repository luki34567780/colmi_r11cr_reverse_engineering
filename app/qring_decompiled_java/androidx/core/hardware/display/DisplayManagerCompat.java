package androidx.core.hardware.display;

/* loaded from: classes.dex */
public final class DisplayManagerCompat {
    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private static final java.util.WeakHashMap<android.content.Context, androidx.core.hardware.display.DisplayManagerCompat> sInstances = new java.util.WeakHashMap<>();
    private final android.content.Context mContext;

    private DisplayManagerCompat(android.content.Context context) {
        this.mContext = context;
    }

    public static androidx.core.hardware.display.DisplayManagerCompat getInstance(android.content.Context context) {
        androidx.core.hardware.display.DisplayManagerCompat displayManagerCompat;
        java.util.WeakHashMap<android.content.Context, androidx.core.hardware.display.DisplayManagerCompat> weakHashMap = sInstances;
        synchronized (weakHashMap) {
            displayManagerCompat = weakHashMap.get(context);
            if (displayManagerCompat == null) {
                displayManagerCompat = new androidx.core.hardware.display.DisplayManagerCompat(context);
                weakHashMap.put(context, displayManagerCompat);
            }
        }
        return displayManagerCompat;
    }

    public android.view.Display getDisplay(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return ((android.hardware.display.DisplayManager) this.mContext.getSystemService("display")).getDisplay(i);
        }
        android.view.Display defaultDisplay = ((android.view.WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay.getDisplayId() == i) {
            return defaultDisplay;
        }
        return null;
    }

    public android.view.Display[] getDisplays() {
        return android.os.Build.VERSION.SDK_INT >= 17 ? ((android.hardware.display.DisplayManager) this.mContext.getSystemService("display")).getDisplays() : new android.view.Display[]{((android.view.WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay()};
    }

    public android.view.Display[] getDisplays(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return ((android.hardware.display.DisplayManager) this.mContext.getSystemService("display")).getDisplays(str);
        }
        return str == null ? new android.view.Display[0] : new android.view.Display[]{((android.view.WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay()};
    }
}
