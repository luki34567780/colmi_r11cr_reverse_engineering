package com.amap.api.col.p0003sl;

/* compiled from: Privacy.java */
/* loaded from: classes.dex */
public final class in {
    private static volatile com.amap.api.col.3sl.in.b a = com.amap.api.col.3sl.in.b.Unknow;
    private static volatile com.amap.api.col.3sl.in.d b = com.amap.api.col.3sl.in.d.Unknow;
    private static volatile java.lang.String c = "";
    private static volatile java.lang.String d = "";
    private static volatile long e = -1;
    private static volatile com.amap.api.col.3sl.in.a f = com.amap.api.col.3sl.in.a.Unknow;
    private static volatile long g = -1;
    private static volatile java.lang.String h = "";
    private static volatile java.lang.String i = "";
    private static volatile long j = 0;
    private static volatile long k = 0;
    private static volatile boolean l = false;
    private static volatile boolean m = true;

    /* compiled from: Privacy.java */
    public enum d {
        Unknow(-1),
        NotShow(0),
        DidShow(1);

        private int d;

        d(int i) {
            this.d = i;
        }

        public final int a() {
            return this.d;
        }

        public static com.amap.api.col.3sl.in.d a(int i) {
            com.amap.api.col.3sl.in.d dVar = NotShow;
            if (i == dVar.a()) {
                return dVar;
            }
            com.amap.api.col.3sl.in.d dVar2 = DidShow;
            return i == dVar2.a() ? dVar2 : Unknow;
        }
    }

    /* compiled from: Privacy.java */
    public enum b {
        Unknow(-1),
        NotContain(0),
        DidContain(1);

        private int d;

        b(int i) {
            this.d = i;
        }

        public final int a() {
            return this.d;
        }

        public static com.amap.api.col.3sl.in.b a(int i) {
            com.amap.api.col.3sl.in.b bVar = NotContain;
            if (i == bVar.a()) {
                return bVar;
            }
            com.amap.api.col.3sl.in.b bVar2 = DidContain;
            return i == bVar2.a() ? bVar2 : Unknow;
        }
    }

    /* compiled from: Privacy.java */
    public enum a {
        Unknow(-1),
        NotAgree(0),
        DidAgree(1);

        private int d;

        a(int i) {
            this.d = i;
        }

        public final int a() {
            return this.d;
        }

        public static com.amap.api.col.3sl.in.a a(int i) {
            com.amap.api.col.3sl.in.a aVar = NotAgree;
            if (i == aVar.a()) {
                return aVar;
            }
            com.amap.api.col.3sl.in.a aVar2 = DidAgree;
            return i == aVar2.a() ? aVar2 : Unknow;
        }
    }

    /* compiled from: Privacy.java */
    public enum c {
        SuccessCode(0),
        ShowUnknowCode(555570),
        ShowNoShowCode(555571),
        InfoUnknowCode(555572),
        InfoNotContainCode(555573),
        AgreeUnknowCode(555574),
        AgreeNotAgreeCode(555575),
        InvaildUserKeyCode(10001),
        IllegalArgument(20001);

        private final int j;

        c(int i) {
            this.j = i;
        }

        public final int a() {
            return this.j;
        }
    }

    public static void a(android.content.Context context, boolean z, boolean z2, com.amap.api.col.p0003sl.iq iqVar) {
        com.amap.api.col.3sl.in.d dVar;
        com.amap.api.col.3sl.in.b bVar;
        if (z2) {
            dVar = com.amap.api.col.3sl.in.d.DidShow;
        } else {
            dVar = com.amap.api.col.3sl.in.d.NotShow;
        }
        if (z) {
            bVar = com.amap.api.col.3sl.in.b.DidContain;
        } else {
            bVar = com.amap.api.col.3sl.in.b.NotContain;
        }
        a(context, dVar, bVar, iqVar);
    }

    private static synchronized void a(android.content.Context context, com.amap.api.col.3sl.in.d dVar, com.amap.api.col.3sl.in.b bVar, com.amap.api.col.p0003sl.iq iqVar) {
        synchronized (com.amap.api.col.p0003sl.in.class) {
            if (context == null || iqVar == null) {
                return;
            }
            if (!l) {
                e(context);
                l = true;
            }
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (dVar != b) {
                bool = java.lang.Boolean.TRUE;
                b = dVar;
            }
            if (bVar != a) {
                bool = java.lang.Boolean.TRUE;
                a = bVar;
            }
            if (bool.booleanValue()) {
                c = iqVar.a();
                d = iqVar.b();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                e = currentTimeMillis;
                j = currentTimeMillis;
                d(context);
            }
        }
    }

    public static void a(android.content.Context context, boolean z, com.amap.api.col.p0003sl.iq iqVar) {
        com.amap.api.col.3sl.in.a aVar;
        if (z) {
            aVar = com.amap.api.col.3sl.in.a.DidAgree;
        } else {
            aVar = com.amap.api.col.3sl.in.a.NotAgree;
        }
        a(context, aVar, iqVar);
    }

    private static synchronized void a(android.content.Context context, com.amap.api.col.3sl.in.a aVar, com.amap.api.col.p0003sl.iq iqVar) {
        synchronized (com.amap.api.col.p0003sl.in.class) {
            if (context == null || iqVar == null) {
                return;
            }
            if (!l) {
                e(context);
                l = true;
            }
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (aVar != f) {
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                f = aVar;
                h = iqVar.a();
                i = iqVar.b();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                g = currentTimeMillis;
                j = currentTimeMillis;
                d(context);
            }
        }
    }

    public static synchronized com.amap.api.col.p0003sl.io a(final android.content.Context context, com.amap.api.col.p0003sl.iq iqVar) {
        boolean z;
        synchronized (com.amap.api.col.p0003sl.in.class) {
            com.amap.api.col.p0003sl.io ioVar = null;
            if (context == null || iqVar == null) {
                return new com.amap.api.col.p0003sl.io(com.amap.api.col.3sl.in.c.IllegalArgument, iqVar);
            }
            if (!l) {
                e(context);
                l = true;
            }
            if (b != com.amap.api.col.3sl.in.d.DidShow) {
                if (b == com.amap.api.col.3sl.in.d.Unknow) {
                    ioVar = new com.amap.api.col.p0003sl.io(com.amap.api.col.3sl.in.c.ShowUnknowCode, iqVar);
                } else if (b == com.amap.api.col.3sl.in.d.NotShow) {
                    ioVar = new com.amap.api.col.p0003sl.io(com.amap.api.col.3sl.in.c.ShowNoShowCode, iqVar);
                }
                z = false;
            } else {
                z = true;
            }
            if (z && a != com.amap.api.col.3sl.in.b.DidContain) {
                if (a == com.amap.api.col.3sl.in.b.Unknow) {
                    ioVar = new com.amap.api.col.p0003sl.io(com.amap.api.col.3sl.in.c.InfoUnknowCode, iqVar);
                } else if (a == com.amap.api.col.3sl.in.b.NotContain) {
                    ioVar = new com.amap.api.col.p0003sl.io(com.amap.api.col.3sl.in.c.InfoNotContainCode, iqVar);
                }
                z = false;
            }
            if (z && f != com.amap.api.col.3sl.in.a.DidAgree) {
                if (f == com.amap.api.col.3sl.in.a.Unknow) {
                    ioVar = new com.amap.api.col.p0003sl.io(com.amap.api.col.3sl.in.c.AgreeUnknowCode, iqVar);
                } else if (f == com.amap.api.col.3sl.in.a.NotAgree) {
                    ioVar = new com.amap.api.col.p0003sl.io(com.amap.api.col.3sl.in.c.AgreeNotAgreeCode, iqVar);
                }
                z = false;
            }
            if (k != j) {
                final long j2 = j;
                k = j;
                try {
                    final org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("privacyInfo", a.a());
                    jSONObject.put("privacyShow", b.a());
                    jSONObject.put("showTime", e);
                    jSONObject.put("show2SDK", c);
                    jSONObject.put("show2SDKVer", d);
                    jSONObject.put("privacyAgree", f.a());
                    jSONObject.put("agreeTime", g);
                    jSONObject.put("agree2SDK", h);
                    jSONObject.put("agree2SDKVer", i);
                    final boolean z2 = m;
                    com.amap.api.col.p0003sl.lz.a().a(new com.amap.api.col.p0003sl.ma() { // from class: com.amap.api.col.3sl.in.2
                        @Override // com.amap.api.col.p0003sl.ma
                        public final void runTask() {
                            if (z2) {
                                java.util.Iterator it = com.amap.api.col.p0003sl.in.b(com.amap.api.col.p0003sl.in.f(context)).iterator();
                                while (it.hasNext()) {
                                    com.amap.api.col.p0003sl.in.a(context, ((java.io.File) it.next()).getName());
                                }
                            }
                            com.amap.api.col.p0003sl.in.d(context);
                            com.amap.api.col.p0003sl.in.a(context, jSONObject, j2);
                            boolean b2 = com.amap.api.col.p0003sl.in.b(context, jSONObject);
                            if (b2) {
                                com.amap.api.col.p0003sl.in.b(context, com.amap.api.col.p0003sl.in.b(j2));
                            }
                            if (z2) {
                                com.amap.api.col.p0003sl.in.b(context);
                            }
                            if (b2) {
                                return;
                            }
                            com.amap.api.col.p0003sl.in.a(context, com.amap.api.col.p0003sl.in.b(j2));
                        }
                    });
                } catch (java.lang.Throwable unused) {
                }
            } else if (m) {
                com.amap.api.col.p0003sl.lz.a().a(new com.amap.api.col.p0003sl.ma() { // from class: com.amap.api.col.3sl.in.1
                    @Override // com.amap.api.col.p0003sl.ma
                    public final void runTask() {
                        java.util.Iterator it = com.amap.api.col.p0003sl.in.b(com.amap.api.col.p0003sl.in.f(context)).iterator();
                        while (it.hasNext()) {
                            com.amap.api.col.p0003sl.in.a(context, ((java.io.File) it.next()).getName());
                        }
                        com.amap.api.col.p0003sl.in.b(context);
                    }
                });
            }
            m = false;
            java.lang.String f2 = com.amap.api.col.p0003sl.ie.f(context);
            if (f2 == null || f2.length() <= 0) {
                ioVar = new com.amap.api.col.p0003sl.io(com.amap.api.col.3sl.in.c.InvaildUserKeyCode, iqVar);
                android.util.Log.e(iqVar.a(), java.lang.String.format("获取apikey失败：\nerrorCode : %d\n原因：%s", java.lang.Integer.valueOf(ioVar.a.a()), ioVar.b));
            }
            if (z) {
                ioVar = new com.amap.api.col.p0003sl.io(com.amap.api.col.3sl.in.c.SuccessCode, iqVar);
            } else {
                android.util.Log.e(iqVar.a(), java.lang.String.format("隐私合规校验失败：\nerrorCode : %d\n原因：%s", java.lang.Integer.valueOf(ioVar.a.a()), ioVar.b));
            }
            return ioVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d(android.content.Context context) {
        synchronized (com.amap.api.col.p0003sl.in.class) {
            if (context == null) {
                return;
            }
            if (!l) {
                e(context);
                l = true;
            }
            try {
                com.amap.api.col.p0003sl.kh.a(context, "AMap.privacy.data", "AMap.privacy.data", java.lang.String.format("%d&%d&%d&%s&%s&%d&%d&%s&%s&%d&%d", java.lang.Integer.valueOf(a.a()), java.lang.Integer.valueOf(b.a()), java.lang.Long.valueOf(e), c, d, java.lang.Integer.valueOf(f.a()), java.lang.Long.valueOf(g), h, i, java.lang.Long.valueOf(j), java.lang.Long.valueOf(k)));
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void e(android.content.Context context) {
        if (context == null) {
            return;
        }
        java.lang.String str = null;
        try {
            str = com.amap.api.col.p0003sl.kh.a(context, "AMap.privacy.data", "AMap.privacy.data");
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        if (str == null) {
            return;
        }
        java.lang.String[] split = str.split("&");
        if (split.length != 11) {
            return;
        }
        try {
            a = com.amap.api.col.3sl.in.b.a(java.lang.Integer.parseInt(split[0]));
            b = com.amap.api.col.3sl.in.d.a(java.lang.Integer.parseInt(split[1]));
            e = java.lang.Long.parseLong(split[2]);
            d = split[3];
            d = split[4];
            f = com.amap.api.col.3sl.in.a.a(java.lang.Integer.parseInt(split[5]));
            g = java.lang.Long.parseLong(split[6]);
            h = split[7];
            i = split[8];
            j = java.lang.Long.parseLong(split[9]);
            k = java.lang.Long.parseLong(split[10]);
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(android.content.Context context, org.json.JSONObject jSONObject) {
        try {
            com.amap.api.col.p0003sl.kb kbVar = new com.amap.api.col.p0003sl.kb();
            kbVar.b = context;
            kbVar.a = jSONObject;
            new com.amap.api.col.p0003sl.ks();
            com.amap.api.col.p0003sl.la a2 = com.amap.api.col.p0003sl.ks.a(kbVar);
            if (a2 == null) {
                return false;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(com.amap.api.col.p0003sl.ir.a(a2.a));
            if (jSONObject2.has(androidx.core.app.NotificationCompat.CATEGORY_STATUS)) {
                return jSONObject2.getInt(androidx.core.app.NotificationCompat.CATEGORY_STATUS) == 1;
            }
            return false;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String b(long j2) {
        return java.lang.String.format("%d-%s", java.lang.Long.valueOf(j2), "privacy.data");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String f(android.content.Context context) {
        return context.getFilesDir().getAbsolutePath() + "/AMap/Privacy/Upload";
    }

    private static java.lang.String g(android.content.Context context) {
        return context.getFilesDir().getAbsolutePath() + "/AMap/Privacy/Reload";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.ArrayList<java.io.File> b(java.lang.String str) {
        java.util.ArrayList<java.io.File> arrayList = new java.util.ArrayList<>();
        if (str != null && str.length() != 0) {
            java.io.File file = new java.io.File(str);
            if (!file.exists()) {
                return arrayList;
            }
            java.io.File[] listFiles = file.listFiles();
            for (java.io.File file2 : listFiles) {
                if (file2.isFile()) {
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ void a(android.content.Context context, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            java.io.File file = new java.io.File(f(context) + "/" + str);
            if (file.exists()) {
                java.io.File file2 = new java.io.File(g(context) + "/" + str);
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                file.renameTo(file2);
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    static /* synthetic */ void b(android.content.Context context) {
        try {
            java.util.Iterator<java.io.File> it = b(g(context)).iterator();
            while (it.hasNext()) {
                java.io.File next = it.next();
                try {
                    java.lang.String name = next.getName();
                    if (!name.endsWith("-privacy.data")) {
                        next.delete();
                    } else {
                        java.lang.String[] split = name.split("-");
                        if (split == null && split.length != 2) {
                            next.delete();
                        } else if (java.lang.Long.parseLong(split[0]) <= 0) {
                            next.delete();
                        } else {
                            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(next);
                            byte[] bArr = new byte[fileInputStream.available()];
                            fileInputStream.read(bArr);
                            if (b(context, new org.json.JSONObject(new java.lang.String(com.amap.api.col.p0003sl.kh.b(context, bArr))))) {
                                next.delete();
                            }
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th.printStackTrace();
                }
            }
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    static /* synthetic */ void a(android.content.Context context, org.json.JSONObject jSONObject, long j2) {
        java.io.FileOutputStream fileOutputStream = null;
        try {
            byte[] a2 = com.amap.api.col.p0003sl.kh.a(context, jSONObject.toString().getBytes());
            java.lang.String b2 = b(j2);
            java.io.File file = new java.io.File(f(context) + "/" + b2);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
            try {
                fileOutputStream2.write(a2);
                try {
                    fileOutputStream2.close();
                } catch (java.lang.Throwable th) {
                    th.printStackTrace();
                }
            } catch (java.lang.Throwable th2) {
                fileOutputStream = fileOutputStream2;
                th = th2;
                try {
                    th.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.lang.Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.lang.Throwable th5) {
                            th5.printStackTrace();
                        }
                    }
                    throw th4;
                }
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
    }

    static /* synthetic */ void b(android.content.Context context, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            java.io.File file = new java.io.File(f(context) + "/" + str);
            if (file.exists()) {
                file.delete();
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }
}
