package androidx.core.view;

/* loaded from: classes.dex */
public final class DisplayCompat {
    private static final int DISPLAY_SIZE_4K_HEIGHT = 2160;
    private static final int DISPLAY_SIZE_4K_WIDTH = 3840;

    private DisplayCompat() {
    }

    public static androidx.core.view.DisplayCompat.ModeCompat getMode(android.content.Context context, android.view.Display display) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return androidx.core.view.DisplayCompat.Api23Impl.getMode(context, display);
        }
        return new androidx.core.view.DisplayCompat.ModeCompat(getDisplaySize(context, display));
    }

    private static android.graphics.Point getDisplaySize(android.content.Context context, android.view.Display display) {
        android.graphics.Point currentDisplaySizeFromWorkarounds = getCurrentDisplaySizeFromWorkarounds(context, display);
        if (currentDisplaySizeFromWorkarounds != null) {
            return currentDisplaySizeFromWorkarounds;
        }
        android.graphics.Point point = new android.graphics.Point();
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            androidx.core.view.DisplayCompat.Api17Impl.getRealSize(display, point);
        } else {
            display.getSize(point);
        }
        return point;
    }

    public static androidx.core.view.DisplayCompat.ModeCompat[] getSupportedModes(android.content.Context context, android.view.Display display) {
        return android.os.Build.VERSION.SDK_INT >= 23 ? androidx.core.view.DisplayCompat.Api23Impl.getSupportedModes(context, display) : new androidx.core.view.DisplayCompat.ModeCompat[]{getMode(context, display)};
    }

    private static android.graphics.Point parseDisplaySize(java.lang.String str) throws java.lang.NumberFormatException {
        java.lang.String[] split = str.trim().split("x", -1);
        if (split.length == 2) {
            int parseInt = java.lang.Integer.parseInt(split[0]);
            int parseInt2 = java.lang.Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new android.graphics.Point(parseInt, parseInt2);
            }
        }
        throw new java.lang.NumberFormatException();
    }

    private static java.lang.String getSystemProperty(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class).invoke(cls, str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static boolean isTv(android.content.Context context) {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    private static android.graphics.Point parsePhysicalDisplaySizeFromSystemProperties(java.lang.String str, android.view.Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        java.lang.String systemProperty = getSystemProperty(str);
        if (android.text.TextUtils.isEmpty(systemProperty)) {
            return null;
        }
        try {
            return parseDisplaySize(systemProperty);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    static android.graphics.Point getCurrentDisplaySizeFromWorkarounds(android.content.Context context, android.view.Display display) {
        android.graphics.Point parsePhysicalDisplaySizeFromSystemProperties;
        if (android.os.Build.VERSION.SDK_INT < 28) {
            parsePhysicalDisplaySizeFromSystemProperties = parsePhysicalDisplaySizeFromSystemProperties("sys.display-size", display);
        } else {
            parsePhysicalDisplaySizeFromSystemProperties = parsePhysicalDisplaySizeFromSystemProperties("vendor.display-size", display);
        }
        if (parsePhysicalDisplaySizeFromSystemProperties != null) {
            return parsePhysicalDisplaySizeFromSystemProperties;
        }
        if (isSonyBravia4kTv(context) && isCurrentModeTheLargestMode(display)) {
            return new android.graphics.Point(DISPLAY_SIZE_4K_WIDTH, DISPLAY_SIZE_4K_HEIGHT);
        }
        return null;
    }

    private static boolean isSonyBravia4kTv(android.content.Context context) {
        return isTv(context) && "Sony".equals(android.os.Build.MANUFACTURER) && android.os.Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    static boolean isCurrentModeTheLargestMode(android.view.Display display) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return androidx.core.view.DisplayCompat.Api23Impl.isCurrentModeTheLargestMode(display);
        }
        return true;
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static androidx.core.view.DisplayCompat.ModeCompat getMode(android.content.Context context, android.view.Display display) {
            android.view.Display.Mode mode = display.getMode();
            android.graphics.Point currentDisplaySizeFromWorkarounds = androidx.core.view.DisplayCompat.getCurrentDisplaySizeFromWorkarounds(context, display);
            if (currentDisplaySizeFromWorkarounds == null || physicalSizeEquals(mode, currentDisplaySizeFromWorkarounds)) {
                return new androidx.core.view.DisplayCompat.ModeCompat(mode, true);
            }
            return new androidx.core.view.DisplayCompat.ModeCompat(mode, currentDisplaySizeFromWorkarounds);
        }

        public static androidx.core.view.DisplayCompat.ModeCompat[] getSupportedModes(android.content.Context context, android.view.Display display) {
            androidx.core.view.DisplayCompat.ModeCompat modeCompat;
            android.view.Display.Mode[] supportedModes = display.getSupportedModes();
            androidx.core.view.DisplayCompat.ModeCompat[] modeCompatArr = new androidx.core.view.DisplayCompat.ModeCompat[supportedModes.length];
            android.view.Display.Mode mode = display.getMode();
            android.graphics.Point currentDisplaySizeFromWorkarounds = androidx.core.view.DisplayCompat.getCurrentDisplaySizeFromWorkarounds(context, display);
            if (currentDisplaySizeFromWorkarounds == null || physicalSizeEquals(mode, currentDisplaySizeFromWorkarounds)) {
                for (int i = 0; i < supportedModes.length; i++) {
                    modeCompatArr[i] = new androidx.core.view.DisplayCompat.ModeCompat(supportedModes[i], physicalSizeEquals(supportedModes[i], mode));
                }
            } else {
                for (int i2 = 0; i2 < supportedModes.length; i2++) {
                    if (physicalSizeEquals(supportedModes[i2], mode)) {
                        modeCompat = new androidx.core.view.DisplayCompat.ModeCompat(supportedModes[i2], currentDisplaySizeFromWorkarounds);
                    } else {
                        modeCompat = new androidx.core.view.DisplayCompat.ModeCompat(supportedModes[i2], false);
                    }
                    modeCompatArr[i2] = modeCompat;
                }
            }
            return modeCompatArr;
        }

        static boolean isCurrentModeTheLargestMode(android.view.Display display) {
            android.view.Display.Mode mode = display.getMode();
            android.view.Display.Mode[] supportedModes = display.getSupportedModes();
            for (int i = 0; i < supportedModes.length; i++) {
                if (mode.getPhysicalHeight() < supportedModes[i].getPhysicalHeight() || mode.getPhysicalWidth() < supportedModes[i].getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        static boolean physicalSizeEquals(android.view.Display.Mode mode, android.graphics.Point point) {
            return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
        }

        static boolean physicalSizeEquals(android.view.Display.Mode mode, android.view.Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    static class Api17Impl {
        private Api17Impl() {
        }

        static void getRealSize(android.view.Display display, android.graphics.Point point) {
            display.getRealSize(point);
        }
    }

    public static final class ModeCompat {
        private final boolean mIsNative;
        private final android.view.Display.Mode mMode;
        private final android.graphics.Point mPhysicalSize;

        ModeCompat(android.graphics.Point point) {
            androidx.core.util.Preconditions.checkNotNull(point, "physicalSize == null");
            this.mPhysicalSize = point;
            this.mMode = null;
            this.mIsNative = true;
        }

        ModeCompat(android.view.Display.Mode mode, boolean z) {
            androidx.core.util.Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            this.mPhysicalSize = new android.graphics.Point(mode.getPhysicalWidth(), mode.getPhysicalHeight());
            this.mMode = mode;
            this.mIsNative = z;
        }

        ModeCompat(android.view.Display.Mode mode, android.graphics.Point point) {
            androidx.core.util.Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            androidx.core.util.Preconditions.checkNotNull(point, "physicalSize == null");
            this.mPhysicalSize = point;
            this.mMode = mode;
            this.mIsNative = true;
        }

        public int getPhysicalWidth() {
            return this.mPhysicalSize.x;
        }

        public int getPhysicalHeight() {
            return this.mPhysicalSize.y;
        }

        @java.lang.Deprecated
        public boolean isNative() {
            return this.mIsNative;
        }

        public android.view.Display.Mode toMode() {
            return this.mMode;
        }
    }
}
