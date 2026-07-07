package com.amap.api.col.p0003sl;

/* compiled from: RomIdentifier.java */
/* loaded from: classes.dex */
public final class jq {
    private static volatile com.amap.api.col.p0003sl.jp a;
    private static java.util.Properties b = b();

    private jq() {
    }

    public static com.amap.api.col.p0003sl.jp a() {
        if (a == null) {
            synchronized (com.amap.api.col.p0003sl.jq.class) {
                if (a == null) {
                    try {
                        com.amap.api.col.p0003sl.jp a2 = a(android.os.Build.MANUFACTURER);
                        if ("".equals(a2.a())) {
                            java.util.Iterator it = java.util.Arrays.asList(com.amap.api.col.p0003sl.jp.MIUI.a(), com.amap.api.col.p0003sl.jp.Flyme.a(), com.amap.api.col.p0003sl.jp.RH.a(), com.amap.api.col.p0003sl.jp.ColorOS.a(), com.amap.api.col.p0003sl.jp.FuntouchOS.a(), com.amap.api.col.p0003sl.jp.SmartisanOS.a(), com.amap.api.col.p0003sl.jp.AmigoOS.a(), com.amap.api.col.p0003sl.jp.Sense.a(), com.amap.api.col.p0003sl.jp.LG.a(), com.amap.api.col.p0003sl.jp.Google.a(), com.amap.api.col.p0003sl.jp.NubiaUI.a()).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    com.amap.api.col.p0003sl.jp a3 = a((java.lang.String) it.next());
                                    if (!"".equals(a3.a())) {
                                        a2 = a3;
                                        break;
                                    }
                                } else {
                                    a2 = com.amap.api.col.p0003sl.jp.Other;
                                    break;
                                }
                            }
                        }
                        a = a2;
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return a;
    }

    private static com.amap.api.col.p0003sl.jp a(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return com.amap.api.col.p0003sl.jp.Other;
        }
        if (str.equals(com.amap.api.col.p0003sl.jp.MIUI.a())) {
            com.amap.api.col.p0003sl.jp jpVar = com.amap.api.col.p0003sl.jp.MIUI;
            if (a(jpVar)) {
                return jpVar;
            }
        } else if (str.equals(com.amap.api.col.p0003sl.jp.Flyme.a())) {
            com.amap.api.col.p0003sl.jp jpVar2 = com.amap.api.col.p0003sl.jp.Flyme;
            if (b(jpVar2)) {
                return jpVar2;
            }
        } else if (str.equals(com.amap.api.col.p0003sl.jp.RH.a())) {
            com.amap.api.col.p0003sl.jp jpVar3 = com.amap.api.col.p0003sl.jp.RH;
            if (c(jpVar3)) {
                return jpVar3;
            }
        } else if (str.equals(com.amap.api.col.p0003sl.jp.ColorOS.a())) {
            com.amap.api.col.p0003sl.jp jpVar4 = com.amap.api.col.p0003sl.jp.ColorOS;
            if (d(jpVar4)) {
                return jpVar4;
            }
        } else if (str.equals(com.amap.api.col.p0003sl.jp.FuntouchOS.a())) {
            com.amap.api.col.p0003sl.jp jpVar5 = com.amap.api.col.p0003sl.jp.FuntouchOS;
            if (e(jpVar5)) {
                return jpVar5;
            }
        } else if (str.equals(com.amap.api.col.p0003sl.jp.SmartisanOS.a())) {
            com.amap.api.col.p0003sl.jp jpVar6 = com.amap.api.col.p0003sl.jp.SmartisanOS;
            if (f(jpVar6)) {
                return jpVar6;
            }
        } else if (str.equals(com.amap.api.col.p0003sl.jp.AmigoOS.a())) {
            com.amap.api.col.p0003sl.jp jpVar7 = com.amap.api.col.p0003sl.jp.AmigoOS;
            if (g(jpVar7)) {
                return jpVar7;
            }
        } else if (str.equals(com.amap.api.col.p0003sl.jp.EUI.a())) {
            com.amap.api.col.p0003sl.jp jpVar8 = com.amap.api.col.p0003sl.jp.EUI;
            if (h(jpVar8)) {
                return jpVar8;
            }
        } else if (str.equals(com.amap.api.col.p0003sl.jp.Sense.a())) {
            com.amap.api.col.p0003sl.jp jpVar9 = com.amap.api.col.p0003sl.jp.Sense;
            if (i(jpVar9)) {
                return jpVar9;
            }
        } else if (str.equals(com.amap.api.col.p0003sl.jp.LG.a())) {
            com.amap.api.col.p0003sl.jp jpVar10 = com.amap.api.col.p0003sl.jp.LG;
            if (j(jpVar10)) {
                return jpVar10;
            }
        } else if (str.equals(com.amap.api.col.p0003sl.jp.Google.a())) {
            com.amap.api.col.p0003sl.jp jpVar11 = com.amap.api.col.p0003sl.jp.Google;
            if (k(jpVar11)) {
                return jpVar11;
            }
        } else if (str.equals(com.amap.api.col.p0003sl.jp.NubiaUI.a())) {
            com.amap.api.col.p0003sl.jp jpVar12 = com.amap.api.col.p0003sl.jp.NubiaUI;
            if (l(jpVar12)) {
                return jpVar12;
            }
        }
        return com.amap.api.col.p0003sl.jp.Other;
    }

    private static void a(com.amap.api.col.p0003sl.jp jpVar, java.lang.String str) {
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("([\\d.]+)[^\\d]*").matcher(str);
        if (matcher.find()) {
            try {
                java.lang.String group = matcher.group(1);
                jpVar.a(group);
                jpVar.a(java.lang.Integer.parseInt(group.split("\\.")[0]));
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static java.lang.String b(java.lang.String str) {
        java.lang.String property = b.getProperty("[" + str + "]", null);
        if (android.text.TextUtils.isEmpty(property)) {
            return c(str);
        }
        return property.replace("[", "").replace("]", "");
    }

    private static java.lang.String c(java.lang.String str) {
        java.io.BufferedReader bufferedReader;
        java.io.BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.Runtime.getRuntime().exec("getprop ".concat(java.lang.String.valueOf(str))).getInputStream()), 1024);
        } catch (java.io.IOException unused) {
            bufferedReader = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            java.lang.String readLine = bufferedReader.readLine();
            bufferedReader.close();
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused2) {
            }
            return readLine;
        } catch (java.io.IOException unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (java.io.IOException unused4) {
                }
            }
            return null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (java.io.IOException unused5) {
                }
            }
            throw th;
        }
    }

    private static java.util.Properties b() {
        java.util.Properties properties = new java.util.Properties();
        try {
            properties.load(java.lang.Runtime.getRuntime().exec("getprop").getInputStream());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

    private static boolean a(com.amap.api.col.p0003sl.jp jpVar) {
        if (android.text.TextUtils.isEmpty(b("ro.miui.ui.version.name"))) {
            return false;
        }
        java.lang.String b2 = b("ro.build.version.incremental");
        a(jpVar, b2);
        jpVar.b(b2);
        return true;
    }

    private static boolean b(com.amap.api.col.p0003sl.jp jpVar) {
        java.lang.String b2 = b("ro.flyme.published");
        java.lang.String b3 = b("ro.meizu.setupwizard.flyme");
        if (android.text.TextUtils.isEmpty(b2) && android.text.TextUtils.isEmpty(b3)) {
            return false;
        }
        java.lang.String b4 = b("ro.build.display.id");
        a(jpVar, b4);
        jpVar.b(b4);
        return true;
    }

    private static boolean c(com.amap.api.col.p0003sl.jp jpVar) {
        java.lang.String b2 = b("ro.build.version.emui");
        if (android.text.TextUtils.isEmpty(b2)) {
            return false;
        }
        a(jpVar, b2);
        jpVar.b(b2);
        return true;
    }

    private static boolean d(com.amap.api.col.p0003sl.jp jpVar) {
        java.lang.String b2 = b("ro.build.version.opporom");
        if (android.text.TextUtils.isEmpty(b2)) {
            return false;
        }
        a(jpVar, b2);
        jpVar.b(b2);
        return true;
    }

    private static boolean e(com.amap.api.col.p0003sl.jp jpVar) {
        java.lang.String b2 = b("ro.vivo.os.build.display.id");
        if (android.text.TextUtils.isEmpty(b2)) {
            return false;
        }
        a(jpVar, b2);
        jpVar.b(b2);
        return true;
    }

    private static boolean f(com.amap.api.col.p0003sl.jp jpVar) {
        java.lang.String b2 = b("ro.smartisan.version");
        if (android.text.TextUtils.isEmpty(b2)) {
            return false;
        }
        a(jpVar, b2);
        jpVar.b(b2);
        return true;
    }

    private static boolean g(com.amap.api.col.p0003sl.jp jpVar) {
        java.lang.String b2 = b("ro.build.display.id");
        if (android.text.TextUtils.isEmpty(b2) || !b2.matches("amigo([\\d.]+)[a-zA-Z]*")) {
            return false;
        }
        a(jpVar, b2);
        jpVar.b(b2);
        return true;
    }

    private static boolean h(com.amap.api.col.p0003sl.jp jpVar) {
        java.lang.String b2 = b("ro.letv.release.version");
        if (android.text.TextUtils.isEmpty(b2)) {
            return false;
        }
        a(jpVar, b2);
        jpVar.b(b2);
        return true;
    }

    private static boolean i(com.amap.api.col.p0003sl.jp jpVar) {
        java.lang.String b2 = b("ro.build.sense.version");
        if (android.text.TextUtils.isEmpty(b2)) {
            return false;
        }
        a(jpVar, b2);
        jpVar.b(b2);
        return true;
    }

    private static boolean j(com.amap.api.col.p0003sl.jp jpVar) {
        java.lang.String b2 = b("sys.lge.lgmdm_version");
        if (android.text.TextUtils.isEmpty(b2)) {
            return false;
        }
        a(jpVar, b2);
        jpVar.b(b2);
        return true;
    }

    private static boolean k(com.amap.api.col.p0003sl.jp jpVar) {
        if (!"android-google".equals(b("ro.com.google.clientidbase"))) {
            return false;
        }
        java.lang.String b2 = b("ro.build.version.release");
        jpVar.a(android.os.Build.VERSION.SDK_INT);
        jpVar.b(b2);
        return true;
    }

    private static boolean l(com.amap.api.col.p0003sl.jp jpVar) {
        java.lang.String b2 = b("ro.build.nubia.rom.code");
        if (android.text.TextUtils.isEmpty(b2)) {
            return false;
        }
        a(jpVar, b2);
        jpVar.b(b2);
        return true;
    }
}
