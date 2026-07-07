package com.autonavi.aps.amapapi.restruct;

/* compiled from: AgeEstimator.java */
/* loaded from: classes.dex */
public abstract class a<T> {
    public java.lang.String a;
    private java.io.File b;
    private android.os.Handler e;
    private java.lang.String f;
    private boolean g;
    private boolean c = false;
    private java.util.Map<java.lang.String, com.autonavi.aps.amapapi.restruct.a.C0021a> d = new java.util.concurrent.ConcurrentHashMap();
    private java.lang.Runnable h = new java.lang.Runnable() { // from class: com.autonavi.aps.amapapi.restruct.a.2
        @Override // java.lang.Runnable
        public final void run() {
            if (com.autonavi.aps.amapapi.restruct.a.this.c) {
                if (com.autonavi.aps.amapapi.restruct.a.this.g) {
                    com.autonavi.aps.amapapi.restruct.a.this.e();
                    com.autonavi.aps.amapapi.restruct.a.e(com.autonavi.aps.amapapi.restruct.a.this);
                }
                if (com.autonavi.aps.amapapi.restruct.a.this.e != null) {
                    com.autonavi.aps.amapapi.restruct.a.this.e.postDelayed(com.autonavi.aps.amapapi.restruct.a.this.h, 60000L);
                }
            }
        }
    };

    public static int a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    abstract void a(T t, long j);

    abstract long b();

    public abstract java.lang.String b(T t);

    abstract int c(T t);

    abstract long c();

    abstract long d(T t);

    static /* synthetic */ boolean e(com.autonavi.aps.amapapi.restruct.a aVar) {
        aVar.g = false;
        return false;
    }

    public a(android.content.Context context, java.lang.String str, android.os.Handler handler) {
        this.f = null;
        if (context == null) {
            return;
        }
        this.e = handler;
        this.a = android.text.TextUtils.isEmpty(str) ? "unknow" : str;
        this.f = com.autonavi.aps.amapapi.utils.j.l(context);
        try {
            this.b = new java.io.File(context.getFilesDir().getPath(), this.a);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        d();
    }

    public final void a() {
        android.os.Handler handler;
        if (!this.c && (handler = this.e) != null) {
            handler.removeCallbacks(this.h);
            this.e.postDelayed(this.h, 60000L);
        }
        this.c = true;
    }

    public final void a(boolean z) {
        android.os.Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacks(this.h);
        }
        if (!z) {
            this.h.run();
        }
        this.c = false;
    }

    public final void a(T t) {
        b(t, com.autonavi.aps.amapapi.utils.j.b());
    }

    public final void a(java.util.List<T> list) {
        long b = com.autonavi.aps.amapapi.utils.j.b();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b(it.next(), b);
        }
        if (this.d.size() >= list.size()) {
            this.g = true;
        }
        if (this.d.size() > 16384 || c() <= 0) {
            this.d.clear();
            for (T t : list) {
                this.d.put(b((com.autonavi.aps.amapapi.restruct.a<T>) t), new com.autonavi.aps.amapapi.restruct.a.C0021a(c((com.autonavi.aps.amapapi.restruct.a<T>) t), d((com.autonavi.aps.amapapi.restruct.a<T>) t), b));
            }
        }
    }

    private void b(T t, long j) {
        if (t == null || d((com.autonavi.aps.amapapi.restruct.a<T>) t) < 0) {
            return;
        }
        java.lang.String b = b((com.autonavi.aps.amapapi.restruct.a<T>) t);
        com.autonavi.aps.amapapi.restruct.a.C0021a c0021a = this.d.get(b);
        if (c0021a == null) {
            a((com.autonavi.aps.amapapi.restruct.a<T>) t, j);
            this.d.put(b, new com.autonavi.aps.amapapi.restruct.a.C0021a(c((com.autonavi.aps.amapapi.restruct.a<T>) t), d((com.autonavi.aps.amapapi.restruct.a<T>) t), j));
            this.g = true;
            return;
        }
        c0021a.c = j;
        if (c0021a.a != c((com.autonavi.aps.amapapi.restruct.a<T>) t)) {
            a((com.autonavi.aps.amapapi.restruct.a<T>) t, j);
            c0021a.a = c((com.autonavi.aps.amapapi.restruct.a<T>) t);
            c0021a.b = d((com.autonavi.aps.amapapi.restruct.a<T>) t);
            this.g = true;
            return;
        }
        a((com.autonavi.aps.amapapi.restruct.a<T>) t, c0021a.b);
    }

    private void d() {
        long b;
        try {
            java.util.Iterator<java.lang.String> it = com.autonavi.aps.amapapi.utils.j.a(this.b).iterator();
            while (it.hasNext()) {
                try {
                    java.lang.String[] split = new java.lang.String(com.autonavi.aps.amapapi.security.a.b(com.amap.api.col.p0003sl.ij.b(it.next()), this.f), com.bumptech.glide.load.Key.STRING_CHARSET_NAME).split(",");
                    if (split.length >= 4) {
                        b = java.lang.Long.parseLong(split[3]);
                    } else {
                        b = com.autonavi.aps.amapapi.utils.j.b();
                    }
                    this.d.put(split[0], new com.autonavi.aps.amapapi.restruct.a.C0021a(java.lang.Integer.parseInt(split[1]), java.lang.Long.parseLong(split[2]), b));
                } catch (java.lang.Throwable th) {
                    if (this.b.exists()) {
                        this.b.delete();
                    }
                    th.printStackTrace();
                }
            }
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (c() > 0) {
            this.d.size();
            if (b() > 0) {
                long b = com.autonavi.aps.amapapi.utils.j.b();
                java.util.Iterator<java.util.Map.Entry<java.lang.String, com.autonavi.aps.amapapi.restruct.a.C0021a>> it = this.d.entrySet().iterator();
                while (it.hasNext()) {
                    if (b - this.d.get(it.next().getKey()).c > b()) {
                        it.remove();
                    }
                }
            }
            if (this.d.size() > c()) {
                java.util.ArrayList arrayList = new java.util.ArrayList(this.d.keySet());
                java.util.Collections.sort(arrayList, new java.util.Comparator<java.lang.String>() { // from class: com.autonavi.aps.amapapi.restruct.a.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.Comparator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public int compare(java.lang.String str, java.lang.String str2) {
                        return com.autonavi.aps.amapapi.restruct.a.a(((com.autonavi.aps.amapapi.restruct.a.C0021a) com.autonavi.aps.amapapi.restruct.a.this.d.get(str2)).c, ((com.autonavi.aps.amapapi.restruct.a.C0021a) com.autonavi.aps.amapapi.restruct.a.this.d.get(str)).c);
                    }
                });
                for (int c = (int) c(); c < arrayList.size(); c++) {
                    this.d.remove(arrayList.get(c));
                }
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.util.Map.Entry<java.lang.String, com.autonavi.aps.amapapi.restruct.a.C0021a> entry : this.d.entrySet()) {
            try {
                sb.append(com.amap.api.col.p0003sl.ij.b(com.autonavi.aps.amapapi.security.a.a((entry.getKey() + "," + entry.getValue().a + "," + entry.getValue().b + "," + entry.getValue().c).getBytes(com.bumptech.glide.load.Key.STRING_CHARSET_NAME), this.f)) + "\n");
            } catch (java.io.UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        java.lang.String sb2 = sb.toString();
        if (android.text.TextUtils.isEmpty(sb2)) {
            return;
        }
        com.autonavi.aps.amapapi.utils.j.a(this.b, sb2);
    }

    /* compiled from: AgeEstimator.java */
    /* renamed from: com.autonavi.aps.amapapi.restruct.a$a, reason: collision with other inner class name */
    static class C0021a {
        int a;
        long b;
        long c;

        public C0021a(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public final long e(T t) {
        return (com.autonavi.aps.amapapi.utils.j.b() - d((com.autonavi.aps.amapapi.restruct.a<T>) t)) / 1000;
    }
}
