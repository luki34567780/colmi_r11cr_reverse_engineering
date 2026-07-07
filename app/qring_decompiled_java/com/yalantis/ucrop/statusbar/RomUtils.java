package com.yalantis.ucrop.statusbar;

/* loaded from: classes3.dex */
public class RomUtils {
    private static final java.lang.String[] ROM_SAMSUNG = {"samsung"};
    private static final java.lang.String UNKNOWN = "unknown";
    private static java.lang.Integer romType;

    public static class AvailableRomType {
        public static final int ANDROID_NATIVE = 3;
        public static final int FLYME = 2;
        public static final int MIUI = 1;
        public static final int NA = 4;
    }

    public static int getLightStatausBarAvailableRomType() {
        java.lang.Integer num = romType;
        if (num != null) {
            return num.intValue();
        }
        if (isMIUIV6OrAbove()) {
            java.lang.Integer num2 = 1;
            romType = num2;
            return num2.intValue();
        }
        if (isFlymeV4OrAbove()) {
            java.lang.Integer num3 = 2;
            romType = num3;
            return num3.intValue();
        }
        if (isAndroid5OrAbove()) {
            java.lang.Integer num4 = 3;
            romType = num4;
            return num4.intValue();
        }
        java.lang.Integer num5 = 4;
        romType = num5;
        return num5.intValue();
    }

    private static boolean isFlymeV4OrAbove() {
        return getFlymeVersion() >= 4;
    }

    public static int getFlymeVersion() {
        java.lang.String str = android.os.Build.DISPLAY;
        if (android.text.TextUtils.isEmpty(str) || !str.contains("Flyme")) {
            return 0;
        }
        return stringToInt(str.replaceAll("Flyme", "").replaceAll("OS", "").replaceAll(" ", "").substring(0, 1));
    }

    private static boolean isMIUIV6OrAbove() {
        java.lang.String systemProperty = getSystemProperty();
        if (android.text.TextUtils.isEmpty(systemProperty)) {
            return false;
        }
        try {
            return toInt(systemProperty) >= 4;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int getMIUIVersionCode() {
        java.lang.String systemProperty = getSystemProperty();
        if (android.text.TextUtils.isEmpty(systemProperty)) {
            return 0;
        }
        try {
            return toInt(systemProperty);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private static boolean isAndroid5OrAbove() {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    private static java.lang.String getSystemProperty() {
        java.io.BufferedReader bufferedReader;
        java.lang.Throwable th;
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.Runtime.getRuntime().exec("getprop ro.miui.ui.version.code").getInputStream()), 1024);
            try {
                java.lang.String readLine = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
                return readLine;
            } catch (java.io.IOException unused) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (java.io.IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (java.io.IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (java.io.IOException unused2) {
            bufferedReader = null;
        } catch (java.lang.Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static boolean isSamsung() {
        return isRightRom(getBrand(), getManufacturer(), ROM_SAMSUNG);
    }

    private static boolean isRightRom(java.lang.String str, java.lang.String str2, java.lang.String... strArr) {
        for (java.lang.String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    private static java.lang.String getManufacturer() {
        try {
            java.lang.String str = android.os.Build.MANUFACTURER;
            return !android.text.TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (java.lang.Throwable unused) {
            return "unknown";
        }
    }

    private static java.lang.String getBrand() {
        try {
            java.lang.String str = android.os.Build.BRAND;
            return !android.text.TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (java.lang.Throwable unused) {
            return "unknown";
        }
    }

    public static int stringToInt(java.lang.String str) {
        if (java.util.regex.Pattern.compile("^[-\\+]?[\\d]+$").matcher(str).matches()) {
            return toInt(str);
        }
        return 0;
    }

    public static int toInt(java.lang.Object obj) {
        return toInt(obj, 0);
    }

    public static int toInt(java.lang.Object obj, int i) {
        int parseInt;
        if (obj == null) {
            return i;
        }
        try {
            java.lang.String trim = obj.toString().trim();
            if (trim.contains(".")) {
                parseInt = java.lang.Integer.parseInt(trim.substring(0, trim.lastIndexOf(".")));
            } else {
                parseInt = java.lang.Integer.parseInt(trim);
            }
            return parseInt;
        } catch (java.lang.Exception unused) {
            return i;
        }
    }
}
