package com.amap.api.col.p0003sl;

/* compiled from: ServiceUtils.java */
/* loaded from: classes.dex */
public class ez {
    private static android.content.res.AssetManager b = null;
    private static android.content.res.Resources c = null;
    private static android.content.res.Resources d = null;
    private static boolean e = true;
    private static android.content.Context f = null;
    private static java.lang.String g = "amap_resource";
    private static java.lang.String h = "1_0_0";
    private static java.lang.String j = ".jar";
    private static java.lang.String k = g + h + j;
    private static java.lang.String i = ".png";
    private static java.lang.String l = g + h + i;
    private static java.lang.String m = "";
    private static java.lang.String n = m + k;
    private static android.content.res.Resources.Theme o = null;
    private static android.content.res.Resources.Theme p = null;
    private static java.lang.reflect.Field q = null;
    private static java.lang.reflect.Field r = null;
    private static android.app.Activity s = null;
    public static int a = -1;

    public static boolean a(android.content.Context context) {
        try {
            f = context;
            java.io.File b2 = b(context);
            if (b2 != null) {
                m = b2.getAbsolutePath() + "/";
            }
            n = m + k;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        if (!e) {
            return true;
        }
        if (!c(context)) {
            return false;
        }
        android.content.res.AssetManager a2 = a(n);
        b = a2;
        c = a(context, a2);
        return true;
    }

    private static java.io.File b(android.content.Context context) {
        java.io.File filesDir;
        try {
            if (context == null) {
                if (context != null) {
                    context.getFilesDir();
                }
                return null;
            }
            try {
                if (android.os.Environment.getExternalStorageState().equals("mounted") && android.os.Environment.getExternalStorageDirectory().canWrite()) {
                    filesDir = context.getExternalFilesDir("LBS");
                } else {
                    filesDir = context.getFilesDir();
                }
                if (filesDir == null && context != null) {
                    context.getFilesDir();
                }
                return filesDir;
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
                if (0 != 0 || context == null) {
                    return null;
                }
                return context.getFilesDir();
            }
        } catch (java.lang.Throwable th) {
            if (0 == 0 && context != null) {
                context.getFilesDir();
            }
            throw th;
        }
    }

    public static android.content.res.Resources a() {
        android.content.res.Resources resources = c;
        return resources == null ? f.getResources() : resources;
    }

    private static android.content.res.Resources a(android.content.Context context, android.content.res.AssetManager assetManager) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        displayMetrics.setToDefaults();
        return new android.content.res.Resources(assetManager, displayMetrics, context.getResources().getConfiguration());
    }

    private static android.content.res.AssetManager a(java.lang.String str) {
        android.content.res.AssetManager assetManager = null;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.content.res.AssetManager");
            android.content.res.AssetManager assetManager2 = (android.content.res.AssetManager) cls.getConstructor(null).newInstance(null);
            try {
                cls.getDeclaredMethod("addAssetPath", java.lang.String.class).invoke(assetManager2, str);
                return assetManager2;
            } catch (java.lang.Throwable th) {
                th = th;
                assetManager = assetManager2;
                com.amap.api.col.p0003sl.ju.c(th, "ResourcesUtil", "getAssetManager(String apkPath)");
                return assetManager;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private static boolean c(android.content.Context context) {
        d(context);
        java.io.InputStream inputStream = null;
        try {
            inputStream = context.getResources().getAssets().open(l);
            if (b(inputStream)) {
                return true;
            }
            e();
            java.io.OutputStream a2 = a(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e2) {
                    e2.printStackTrace();
                    com.amap.api.col.p0003sl.ju.c(e2, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                }
            }
            a2.close();
            return true;
        } catch (java.lang.Throwable th) {
            try {
                th.printStackTrace();
                com.amap.api.col.p0003sl.ju.c(th, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                if (inputStream == null) {
                    return false;
                }
                try {
                    inputStream.close();
                    return false;
                } catch (java.io.IOException e3) {
                    e3.printStackTrace();
                    com.amap.api.col.p0003sl.ju.c(e3, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                    return false;
                }
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e4) {
                        e4.printStackTrace();
                        com.amap.api.col.p0003sl.ju.c(e4, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                    }
                }
            }
        }
    }

    private static java.io.OutputStream a(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new java.io.File(m, k));
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return fileOutputStream;
            }
            fileOutputStream.write(bArr, 0, read);
        }
    }

    private static boolean b(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.File file = new java.io.File(n);
        long length = file.length();
        int available = inputStream.available();
        if (!file.exists() || length != available) {
            return false;
        }
        inputStream.close();
        return true;
    }

    private static void e() {
        java.io.File[] listFiles = new java.io.File(m).listFiles(new com.amap.api.col.3sl.ez.a());
        if (listFiles == null || listFiles.length <= 0) {
            return;
        }
        for (java.io.File file : listFiles) {
            file.delete();
        }
    }

    private static void d(android.content.Context context) {
        m = context.getFilesDir().getAbsolutePath();
        n = m + "/" + k;
    }

    public static android.view.View a(android.content.Context context, int i2) {
        android.content.res.XmlResourceParser xml = a().getXml(i2);
        android.view.View view = null;
        if (!e) {
            return android.view.LayoutInflater.from(context).inflate(xml, (android.view.ViewGroup) null);
        }
        try {
            int i3 = a;
            if (i3 == -1) {
                i3 = 0;
            }
            view = android.view.LayoutInflater.from(new com.amap.api.col.p0003sl.ey(context, i3, com.amap.api.col.p0003sl.ez.class.getClassLoader())).inflate(xml, (android.view.ViewGroup) null);
        } finally {
            try {
                return view;
            } finally {
            }
        }
        return view;
    }

    /* compiled from: ServiceUtils.java */
    static class a implements java.io.FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(java.io.File file, java.lang.String str) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.amap.api.col.p0003sl.ez.h);
            sb.append(com.amap.api.col.p0003sl.ez.j);
            return str.startsWith(com.amap.api.col.p0003sl.ez.g) && !str.endsWith(sb.toString());
        }
    }
}
