package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class RomUtils {
    private static final java.lang.String UNKNOWN = "unknown";
    private static final java.lang.String VERSION_PROPERTY_360 = "ro.build.uiversion";
    private static final java.lang.String VERSION_PROPERTY_HUAWEI = "ro.build.version.emui";
    private static final java.lang.String VERSION_PROPERTY_LEECO = "ro.letv.release.version";
    private static final java.lang.String VERSION_PROPERTY_NUBIA = "ro.build.rom.id";
    private static final java.lang.String VERSION_PROPERTY_ONEPLUS = "ro.rom.version";
    private static final java.lang.String VERSION_PROPERTY_OPPO = "ro.build.version.opporom";
    private static final java.lang.String VERSION_PROPERTY_VIVO = "ro.vivo.os.build.display.id";
    private static final java.lang.String VERSION_PROPERTY_XIAOMI = "ro.build.version.incremental";
    private static final java.lang.String VERSION_PROPERTY_ZTE = "ro.build.MiFavor_version";
    private static final java.lang.String[] ROM_HUAWEI = {"huawei"};
    private static final java.lang.String[] ROM_VIVO = {"vivo"};
    private static final java.lang.String[] ROM_XIAOMI = {"xiaomi"};
    private static final java.lang.String[] ROM_OPPO = {"oppo"};
    private static final java.lang.String[] ROM_LEECO = {"leeco", "letv"};
    private static final java.lang.String[] ROM_360 = {"360", "qiku"};
    private static final java.lang.String[] ROM_ZTE = {"zte"};
    private static final java.lang.String[] ROM_ONEPLUS = {"oneplus"};
    private static final java.lang.String[] ROM_NUBIA = {"nubia"};
    private static final java.lang.String[] ROM_COOLPAD = {"coolpad", "yulong"};
    private static final java.lang.String[] ROM_LG = {"lg", "lge"};
    private static final java.lang.String[] ROM_GOOGLE = {"google"};
    private static final java.lang.String[] ROM_SAMSUNG = {"samsung"};
    private static final java.lang.String[] ROM_MEIZU = {"meizu"};
    private static final java.lang.String[] ROM_LENOVO = {"lenovo"};
    private static final java.lang.String[] ROM_SMARTISAN = {"smartisan", "deltainno"};
    private static final java.lang.String[] ROM_HTC = {"htc"};
    private static final java.lang.String[] ROM_SONY = {"sony"};
    private static final java.lang.String[] ROM_GIONEE = {"gionee", "amigo"};
    private static final java.lang.String[] ROM_MOTOROLA = {"motorola"};
    private static com.blankj.utilcode.util.RomUtils.RomInfo bean = null;

    private RomUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean isHuawei() {
        return ROM_HUAWEI[0].equals(getRomInfo().name);
    }

    public static boolean isVivo() {
        return ROM_VIVO[0].equals(getRomInfo().name);
    }

    public static boolean isXiaomi() {
        return ROM_XIAOMI[0].equals(getRomInfo().name);
    }

    public static boolean isOppo() {
        return ROM_OPPO[0].equals(getRomInfo().name);
    }

    public static boolean isLeeco() {
        return ROM_LEECO[0].equals(getRomInfo().name);
    }

    public static boolean is360() {
        return ROM_360[0].equals(getRomInfo().name);
    }

    public static boolean isZte() {
        return ROM_ZTE[0].equals(getRomInfo().name);
    }

    public static boolean isOneplus() {
        return ROM_ONEPLUS[0].equals(getRomInfo().name);
    }

    public static boolean isNubia() {
        return ROM_NUBIA[0].equals(getRomInfo().name);
    }

    public static boolean isCoolpad() {
        return ROM_COOLPAD[0].equals(getRomInfo().name);
    }

    public static boolean isLg() {
        return ROM_LG[0].equals(getRomInfo().name);
    }

    public static boolean isGoogle() {
        return ROM_GOOGLE[0].equals(getRomInfo().name);
    }

    public static boolean isSamsung() {
        return ROM_SAMSUNG[0].equals(getRomInfo().name);
    }

    public static boolean isMeizu() {
        return ROM_MEIZU[0].equals(getRomInfo().name);
    }

    public static boolean isLenovo() {
        return ROM_LENOVO[0].equals(getRomInfo().name);
    }

    public static boolean isSmartisan() {
        return ROM_SMARTISAN[0].equals(getRomInfo().name);
    }

    public static boolean isHtc() {
        return ROM_HTC[0].equals(getRomInfo().name);
    }

    public static boolean isSony() {
        return ROM_SONY[0].equals(getRomInfo().name);
    }

    public static boolean isGionee() {
        return ROM_GIONEE[0].equals(getRomInfo().name);
    }

    public static boolean isMotorola() {
        return ROM_MOTOROLA[0].equals(getRomInfo().name);
    }

    public static com.blankj.utilcode.util.RomUtils.RomInfo getRomInfo() {
        com.blankj.utilcode.util.RomUtils.RomInfo romInfo = bean;
        if (romInfo != null) {
            return romInfo;
        }
        bean = new com.blankj.utilcode.util.RomUtils.RomInfo();
        java.lang.String brand = getBrand();
        java.lang.String manufacturer = getManufacturer();
        java.lang.String[] strArr = ROM_HUAWEI;
        if (isRightRom(brand, manufacturer, strArr)) {
            bean.name = strArr[0];
            java.lang.String romVersion = getRomVersion(VERSION_PROPERTY_HUAWEI);
            java.lang.String[] split = romVersion.split("_");
            if (split.length > 1) {
                bean.version = split[1];
            } else {
                bean.version = romVersion;
            }
            return bean;
        }
        java.lang.String[] strArr2 = ROM_VIVO;
        if (isRightRom(brand, manufacturer, strArr2)) {
            bean.name = strArr2[0];
            bean.version = getRomVersion(VERSION_PROPERTY_VIVO);
            return bean;
        }
        java.lang.String[] strArr3 = ROM_XIAOMI;
        if (isRightRom(brand, manufacturer, strArr3)) {
            bean.name = strArr3[0];
            bean.version = getRomVersion(VERSION_PROPERTY_XIAOMI);
            return bean;
        }
        java.lang.String[] strArr4 = ROM_OPPO;
        if (isRightRom(brand, manufacturer, strArr4)) {
            bean.name = strArr4[0];
            bean.version = getRomVersion(VERSION_PROPERTY_OPPO);
            return bean;
        }
        java.lang.String[] strArr5 = ROM_LEECO;
        if (isRightRom(brand, manufacturer, strArr5)) {
            bean.name = strArr5[0];
            bean.version = getRomVersion(VERSION_PROPERTY_LEECO);
            return bean;
        }
        java.lang.String[] strArr6 = ROM_360;
        if (isRightRom(brand, manufacturer, strArr6)) {
            bean.name = strArr6[0];
            bean.version = getRomVersion(VERSION_PROPERTY_360);
            return bean;
        }
        java.lang.String[] strArr7 = ROM_ZTE;
        if (isRightRom(brand, manufacturer, strArr7)) {
            bean.name = strArr7[0];
            bean.version = getRomVersion(VERSION_PROPERTY_ZTE);
            return bean;
        }
        java.lang.String[] strArr8 = ROM_ONEPLUS;
        if (isRightRom(brand, manufacturer, strArr8)) {
            bean.name = strArr8[0];
            bean.version = getRomVersion(VERSION_PROPERTY_ONEPLUS);
            return bean;
        }
        java.lang.String[] strArr9 = ROM_NUBIA;
        if (isRightRom(brand, manufacturer, strArr9)) {
            bean.name = strArr9[0];
            bean.version = getRomVersion(VERSION_PROPERTY_NUBIA);
            return bean;
        }
        java.lang.String[] strArr10 = ROM_COOLPAD;
        if (isRightRom(brand, manufacturer, strArr10)) {
            bean.name = strArr10[0];
        } else {
            java.lang.String[] strArr11 = ROM_LG;
            if (isRightRom(brand, manufacturer, strArr11)) {
                bean.name = strArr11[0];
            } else {
                java.lang.String[] strArr12 = ROM_GOOGLE;
                if (isRightRom(brand, manufacturer, strArr12)) {
                    bean.name = strArr12[0];
                } else {
                    java.lang.String[] strArr13 = ROM_SAMSUNG;
                    if (isRightRom(brand, manufacturer, strArr13)) {
                        bean.name = strArr13[0];
                    } else {
                        java.lang.String[] strArr14 = ROM_MEIZU;
                        if (isRightRom(brand, manufacturer, strArr14)) {
                            bean.name = strArr14[0];
                        } else {
                            java.lang.String[] strArr15 = ROM_LENOVO;
                            if (isRightRom(brand, manufacturer, strArr15)) {
                                bean.name = strArr15[0];
                            } else {
                                java.lang.String[] strArr16 = ROM_SMARTISAN;
                                if (isRightRom(brand, manufacturer, strArr16)) {
                                    bean.name = strArr16[0];
                                } else {
                                    java.lang.String[] strArr17 = ROM_HTC;
                                    if (isRightRom(brand, manufacturer, strArr17)) {
                                        bean.name = strArr17[0];
                                    } else {
                                        java.lang.String[] strArr18 = ROM_SONY;
                                        if (isRightRom(brand, manufacturer, strArr18)) {
                                            bean.name = strArr18[0];
                                        } else {
                                            java.lang.String[] strArr19 = ROM_GIONEE;
                                            if (isRightRom(brand, manufacturer, strArr19)) {
                                                bean.name = strArr19[0];
                                            } else {
                                                java.lang.String[] strArr20 = ROM_MOTOROLA;
                                                if (isRightRom(brand, manufacturer, strArr20)) {
                                                    bean.name = strArr20[0];
                                                } else {
                                                    bean.name = manufacturer;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bean.version = getRomVersion("");
        return bean;
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

    private static java.lang.String getRomVersion(java.lang.String str) {
        java.lang.String systemProperty = !android.text.TextUtils.isEmpty(str) ? getSystemProperty(str) : "";
        if (android.text.TextUtils.isEmpty(systemProperty) || systemProperty.equals("unknown")) {
            try {
                java.lang.String str2 = android.os.Build.DISPLAY;
                if (!android.text.TextUtils.isEmpty(str2)) {
                    systemProperty = str2.toLowerCase();
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return android.text.TextUtils.isEmpty(systemProperty) ? "unknown" : systemProperty;
    }

    private static java.lang.String getSystemProperty(java.lang.String str) {
        java.lang.String systemPropertyByShell = getSystemPropertyByShell(str);
        if (!android.text.TextUtils.isEmpty(systemPropertyByShell)) {
            return systemPropertyByShell;
        }
        java.lang.String systemPropertyByStream = getSystemPropertyByStream(str);
        return (android.text.TextUtils.isEmpty(systemPropertyByStream) && android.os.Build.VERSION.SDK_INT < 28) ? getSystemPropertyByReflect(str) : systemPropertyByStream;
    }

    private static java.lang.String getSystemPropertyByShell(java.lang.String str) {
        java.io.BufferedReader bufferedReader;
        java.lang.String readLine;
        java.io.BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            } catch (java.io.IOException unused) {
                return "";
            }
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            readLine = bufferedReader.readLine();
        } catch (java.io.IOException unused3) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 == null) {
                return "";
            }
            bufferedReader2.close();
            return "";
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (java.io.IOException unused4) {
                }
            }
            throw th;
        }
        if (readLine != null) {
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused5) {
            }
            return readLine;
        }
        bufferedReader.close();
        return "";
    }

    private static java.lang.String getSystemPropertyByStream(java.lang.String str) {
        try {
            java.util.Properties properties = new java.util.Properties();
            properties.load(new java.io.FileInputStream(new java.io.File(android.os.Environment.getRootDirectory(), "build.prop")));
            return properties.getProperty(str, "");
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    private static java.lang.String getSystemPropertyByReflect(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class, java.lang.String.class).invoke(cls, str, "");
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static class RomInfo {
        private java.lang.String name;
        private java.lang.String version;

        public java.lang.String getName() {
            return this.name;
        }

        public java.lang.String getVersion() {
            return this.version;
        }

        public java.lang.String toString() {
            return "RomInfo{name=" + this.name + ", version=" + this.version + "}";
        }
    }
}
