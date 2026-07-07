package com.amap.api.col.p0003sl;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class kp implements java.io.Closeable {
    static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("[a-z0-9_-]{1,120}");
    public static final java.nio.charset.Charset b = java.nio.charset.Charset.forName("US-ASCII");
    static final java.nio.charset.Charset c = java.nio.charset.Charset.forName(com.bumptech.glide.load.Key.STRING_CHARSET_NAME);
    static java.util.concurrent.ThreadPoolExecutor d;
    private static final java.util.concurrent.ThreadFactory r;
    private static final java.io.OutputStream t;
    private final java.io.File e;
    private final java.io.File f;
    private final java.io.File g;
    private final java.io.File h;
    private long j;
    private java.io.Writer m;
    private int p;
    private long l = 0;
    private int n = 1000;
    private final java.util.LinkedHashMap<java.lang.String, com.amap.api.col.3sl.kp.c> o = new java.util.LinkedHashMap<>(0, 0.75f, true);
    private long q = 0;
    private final java.util.concurrent.Callable<java.lang.Void> s = new java.util.concurrent.Callable<java.lang.Void>() { // from class: com.amap.api.col.3sl.kp.2
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Void call() throws java.lang.Exception {
            synchronized (com.amap.api.col.p0003sl.kp.this) {
                if (com.amap.api.col.p0003sl.kp.this.m == null) {
                    return null;
                }
                com.amap.api.col.p0003sl.kp.this.l();
                if (com.amap.api.col.p0003sl.kp.this.j()) {
                    com.amap.api.col.p0003sl.kp.this.i();
                    com.amap.api.col.p0003sl.kp.e(com.amap.api.col.p0003sl.kp.this);
                }
                return null;
            }
        }
    };
    private final int i = 1;
    private final int k = 1;

    static /* synthetic */ int e(com.amap.api.col.p0003sl.kp kpVar) {
        kpVar.p = 0;
        return 0;
    }

    static {
        java.util.concurrent.ThreadFactory threadFactory = new java.util.concurrent.ThreadFactory() { // from class: com.amap.api.col.3sl.kp.1
            private final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return new java.lang.Thread(runnable, "disklrucache#" + this.a.getAndIncrement());
            }
        };
        r = threadFactory;
        d = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory);
        t = new java.io.OutputStream() { // from class: com.amap.api.col.3sl.kp.3
            @Override // java.io.OutputStream
            public final void write(int i) throws java.io.IOException {
            }
        };
    }

    public final void a(int i) {
        if (i < 10) {
            i = 10;
        } else if (i > 10000) {
            i = 10000;
        }
        this.n = i;
    }

    public static void a() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = d;
        if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
            return;
        }
        d.shutdown();
    }

    private static java.util.concurrent.ThreadPoolExecutor f() {
        try {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = d;
            if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
                d = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(256), r);
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        return d;
    }

    private kp(java.io.File file, long j) {
        this.e = file;
        this.f = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE);
        this.g = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE_TMP);
        this.h = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE_BACKUP);
        this.j = j;
    }

    public static com.amap.api.col.p0003sl.kp a(java.io.File file, long j) throws java.io.IOException {
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        java.io.File file2 = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE_BACKUP);
        if (file2.exists()) {
            java.io.File file3 = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE);
            if (file3.exists()) {
                file2.delete();
            } else {
                a(file2, file3, false);
            }
        }
        com.amap.api.col.p0003sl.kp kpVar = new com.amap.api.col.p0003sl.kp(file, j);
        if (kpVar.f.exists()) {
            try {
                kpVar.g();
                kpVar.h();
                kpVar.m = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(kpVar.f, true), b));
                return kpVar;
            } catch (java.lang.Throwable unused) {
                kpVar.d();
            }
        }
        file.mkdirs();
        com.amap.api.col.p0003sl.kp kpVar2 = new com.amap.api.col.p0003sl.kp(file, j);
        kpVar2.i();
        return kpVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(r3)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.kp.g():void");
    }

    private void h() throws java.io.IOException {
        a(this.g);
        java.util.Iterator<com.amap.api.col.3sl.kp.c> it = this.o.values().iterator();
        while (it.hasNext()) {
            com.amap.api.col.3sl.kp.c next = it.next();
            int i = 0;
            if (next.e == null) {
                while (i < this.k) {
                    this.l += next.c[i];
                    i++;
                }
            } else {
                next.e = null;
                while (i < this.k) {
                    a(next.a(i));
                    a(next.b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() throws java.io.IOException {
        java.io.Writer writer = this.m;
        if (writer != null) {
            writer.close();
        }
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.g), b));
        try {
            bufferedWriter.write(coil.disk.DiskLruCache.MAGIC);
            bufferedWriter.write("\n");
            bufferedWriter.write(coil.disk.DiskLruCache.VERSION);
            bufferedWriter.write("\n");
            bufferedWriter.write(java.lang.Integer.toString(this.i));
            bufferedWriter.write("\n");
            bufferedWriter.write(java.lang.Integer.toString(this.k));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (com.amap.api.col.3sl.kp.c cVar : this.o.values()) {
                if (cVar.e != null) {
                    bufferedWriter.write("DIRTY " + cVar.b + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + cVar.b + cVar.a() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f.exists()) {
                a(this.f, this.h, true);
            }
            a(this.g, this.f, false);
            this.h.delete();
            this.m = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.f, true), b));
        } catch (java.lang.Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    private static void a(java.io.File file) throws java.io.IOException {
        if (file.exists() && !file.delete()) {
            throw new java.io.IOException();
        }
    }

    private static void a(java.io.File file, java.io.File file2, boolean z) throws java.io.IOException {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new java.io.IOException();
        }
    }

    public final synchronized com.amap.api.col.3sl.kp.b a(java.lang.String str) throws java.io.IOException {
        k();
        e(str);
        com.amap.api.col.3sl.kp.c cVar = this.o.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.d) {
            return null;
        }
        java.io.InputStream[] inputStreamArr = new java.io.InputStream[this.k];
        for (int i = 0; i < this.k; i++) {
            try {
                inputStreamArr[i] = new java.io.FileInputStream(cVar.a(i));
            } catch (java.io.FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.k && inputStreamArr[i2] != null; i2++) {
                    a(inputStreamArr[i2]);
                }
                return null;
            }
        }
        this.p++;
        this.m.append((java.lang.CharSequence) ("READ " + str + '\n'));
        if (j()) {
            f().submit(this.s);
        }
        return new com.amap.api.col.3sl.kp.b(this, str, cVar.f, inputStreamArr, cVar.c, (byte) 0);
    }

    public final com.amap.api.col.3sl.kp.a b(java.lang.String str) throws java.io.IOException {
        return d(str);
    }

    private synchronized com.amap.api.col.3sl.kp.a d(java.lang.String str) throws java.io.IOException {
        k();
        e(str);
        com.amap.api.col.3sl.kp.c cVar = this.o.get(str);
        byte b2 = 0;
        if (cVar == null) {
            cVar = new com.amap.api.col.3sl.kp.c(this, str, b2);
            this.o.put(str, cVar);
        } else if (cVar.e != null) {
            return null;
        }
        com.amap.api.col.3sl.kp.a aVar = new com.amap.api.col.3sl.kp.a(this, cVar, b2);
        cVar.e = aVar;
        this.m.write("DIRTY " + str + '\n');
        this.m.flush();
        return aVar;
    }

    public final java.io.File b() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(com.amap.api.col.3sl.kp.a aVar, boolean z) throws java.io.IOException {
        com.amap.api.col.3sl.kp.c cVar = aVar.b;
        if (cVar.e != aVar) {
            throw new java.lang.IllegalStateException();
        }
        if (z && !cVar.d) {
            for (int i = 0; i < this.k; i++) {
                if (!aVar.c[i]) {
                    aVar.c();
                    throw new java.lang.IllegalStateException("Newly created entry didn't create value for index ".concat(java.lang.String.valueOf(i)));
                }
                if (!cVar.b(i).exists()) {
                    aVar.c();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.k; i2++) {
            java.io.File b2 = cVar.b(i2);
            if (z) {
                if (b2.exists()) {
                    java.io.File a2 = cVar.a(i2);
                    b2.renameTo(a2);
                    long j = cVar.c[i2];
                    long length = a2.length();
                    cVar.c[i2] = length;
                    this.l = (this.l - j) + length;
                }
            } else {
                a(b2);
            }
        }
        this.p++;
        cVar.e = null;
        if (cVar.d | z) {
            com.amap.api.col.3sl.kp.c.a(cVar);
            this.m.write("CLEAN " + cVar.b + cVar.a() + '\n');
            if (z) {
                long j2 = this.q;
                this.q = 1 + j2;
                cVar.f = j2;
            }
        } else {
            this.o.remove(cVar.b);
            this.m.write("REMOVE " + cVar.b + '\n');
        }
        this.m.flush();
        if (this.l > this.j || j()) {
            f().submit(this.s);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        int i = this.p;
        return i >= 2000 && i >= this.o.size();
    }

    public final synchronized boolean c(java.lang.String str) throws java.io.IOException {
        k();
        e(str);
        com.amap.api.col.3sl.kp.c cVar = this.o.get(str);
        if (cVar != null && cVar.e == null) {
            for (int i = 0; i < this.k; i++) {
                java.io.File a2 = cVar.a(i);
                if (a2.exists() && !a2.delete()) {
                    throw new java.io.IOException("failed to delete ".concat(java.lang.String.valueOf(a2)));
                }
                this.l -= cVar.c[i];
                cVar.c[i] = 0;
            }
            this.p++;
            this.m.append((java.lang.CharSequence) ("REMOVE " + str + '\n'));
            this.o.remove(str);
            if (j()) {
                f().submit(this.s);
            }
            return true;
        }
        return false;
    }

    private void k() {
        if (this.m == null) {
            throw new java.lang.IllegalStateException("cache is closed");
        }
    }

    public final synchronized void c() throws java.io.IOException {
        k();
        l();
        this.m.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws java.io.IOException {
        if (this.m == null) {
            return;
        }
        java.util.Iterator it = new java.util.ArrayList(this.o.values()).iterator();
        while (it.hasNext()) {
            com.amap.api.col.3sl.kp.c cVar = (com.amap.api.col.3sl.kp.c) it.next();
            if (cVar.e != null) {
                cVar.e.c();
            }
        }
        l();
        this.m.close();
        this.m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws java.io.IOException {
        while (true) {
            if (this.l <= this.j && this.o.size() <= this.n) {
                return;
            } else {
                c(this.o.entrySet().iterator().next().getKey());
            }
        }
    }

    public final void d() throws java.io.IOException {
        close();
        b(this.e);
    }

    private static void e(java.lang.String str) {
        if (a.matcher(str).matches()) {
            return;
        }
        throw new java.lang.IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* compiled from: DiskLruCache.java */
    public final class b implements java.io.Closeable {
        private final java.lang.String b;
        private final long c;
        private final java.io.InputStream[] d;
        private final long[] e;

        /* synthetic */ b(com.amap.api.col.p0003sl.kp kpVar, java.lang.String str, long j, java.io.InputStream[] inputStreamArr, long[] jArr, byte b) {
            this(str, j, inputStreamArr, jArr);
        }

        private b(java.lang.String str, long j, java.io.InputStream[] inputStreamArr, long[] jArr) {
            this.b = str;
            this.c = j;
            this.d = inputStreamArr;
            this.e = jArr;
        }

        public final java.io.InputStream a() {
            return this.d[0];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (java.io.InputStream inputStream : this.d) {
                com.amap.api.col.p0003sl.kp.a(inputStream);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class a {
        private final com.amap.api.col.3sl.kp.c b;
        private final boolean[] c;
        private boolean d;
        private boolean e;

        /* synthetic */ a(com.amap.api.col.p0003sl.kp kpVar, com.amap.api.col.3sl.kp.c cVar, byte b) {
            this(cVar);
        }

        static /* synthetic */ boolean c(com.amap.api.col.3sl.kp.a aVar) {
            aVar.d = true;
            return true;
        }

        private a(com.amap.api.col.3sl.kp.c cVar) {
            this.b = cVar;
            this.c = cVar.d ? null : new boolean[com.amap.api.col.p0003sl.kp.this.k];
        }

        public final java.io.OutputStream a() throws java.io.IOException {
            java.io.FileOutputStream fileOutputStream;
            com.amap.api.col.3sl.kp.a.C0017a c0017a;
            if (com.amap.api.col.p0003sl.kp.this.k <= 0) {
                throw new java.lang.IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + com.amap.api.col.p0003sl.kp.this.k);
            }
            synchronized (com.amap.api.col.p0003sl.kp.this) {
                if (this.b.e != this) {
                    throw new java.lang.IllegalStateException();
                }
                byte b = 0;
                if (!this.b.d) {
                    this.c[0] = true;
                }
                java.io.File b2 = this.b.b(0);
                try {
                    fileOutputStream = new java.io.FileOutputStream(b2);
                } catch (java.io.FileNotFoundException unused) {
                    com.amap.api.col.p0003sl.kp.this.e.mkdirs();
                    try {
                        fileOutputStream = new java.io.FileOutputStream(b2);
                    } catch (java.io.FileNotFoundException unused2) {
                        return com.amap.api.col.p0003sl.kp.t;
                    }
                }
                c0017a = new com.amap.api.col.3sl.kp.a.C0017a(this, fileOutputStream, b);
            }
            return c0017a;
        }

        public final void b() throws java.io.IOException {
            if (this.d) {
                com.amap.api.col.p0003sl.kp.this.a(this, false);
                com.amap.api.col.p0003sl.kp.this.c(this.b.b);
            } else {
                com.amap.api.col.p0003sl.kp.this.a(this, true);
            }
            this.e = true;
        }

        public final void c() throws java.io.IOException {
            com.amap.api.col.p0003sl.kp.this.a(this, false);
        }

        /* compiled from: DiskLruCache.java */
        /* renamed from: com.amap.api.col.3sl.kp$a$a, reason: collision with other inner class name */
        private class C0017a extends java.io.FilterOutputStream {
            /* synthetic */ C0017a(com.amap.api.col.3sl.kp.a aVar, java.io.OutputStream outputStream, byte b) {
                this(outputStream);
            }

            private C0017a(java.io.OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (java.io.IOException unused) {
                    com.amap.api.col.3sl.kp.a.c(com.amap.api.col.3sl.kp.a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (java.io.IOException unused) {
                    com.amap.api.col.3sl.kp.a.c(com.amap.api.col.3sl.kp.a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    this.out.close();
                } catch (java.io.IOException unused) {
                    com.amap.api.col.3sl.kp.a.c(com.amap.api.col.3sl.kp.a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    this.out.flush();
                } catch (java.io.IOException unused) {
                    com.amap.api.col.3sl.kp.a.c(com.amap.api.col.3sl.kp.a.this);
                }
            }
        }
    }

    private static void b(java.io.File file) throws java.io.IOException {
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new java.io.IOException("not a readable directory: ".concat(java.lang.String.valueOf(file)));
        }
        for (java.io.File file2 : listFiles) {
            if (file2.isDirectory()) {
                b(file2);
            }
            if (!file2.delete()) {
                throw new java.io.IOException("failed to delete file: ".concat(java.lang.String.valueOf(file2)));
            }
        }
    }

    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    private final class c {
        private final java.lang.String b;
        private final long[] c;
        private boolean d;
        private com.amap.api.col.3sl.kp.a e;
        private long f;

        /* synthetic */ c(com.amap.api.col.p0003sl.kp kpVar, java.lang.String str, byte b) {
            this(str);
        }

        static /* synthetic */ boolean a(com.amap.api.col.3sl.kp.c cVar) {
            cVar.d = true;
            return true;
        }

        private c(java.lang.String str) {
            this.b = str;
            this.c = new long[com.amap.api.col.p0003sl.kp.this.k];
        }

        public final java.lang.String a() throws java.io.IOException {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (long j : this.c) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private static java.io.IOException a(java.lang.String[] strArr) throws java.io.IOException {
            throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(strArr));
        }

        public final java.io.File a(int i) {
            return new java.io.File(com.amap.api.col.p0003sl.kp.this.e, this.b + "." + i);
        }

        public final java.io.File b(int i) {
            return new java.io.File(com.amap.api.col.p0003sl.kp.this.e, this.b + "." + i + ".tmp");
        }

        static /* synthetic */ void a(com.amap.api.col.3sl.kp.c cVar, java.lang.String[] strArr) throws java.io.IOException {
            if (strArr.length != com.amap.api.col.p0003sl.kp.this.k) {
                throw a(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    cVar.c[i] = java.lang.Long.parseLong(strArr[i]);
                } catch (java.lang.NumberFormatException unused) {
                    throw a(strArr);
                }
            }
        }
    }
}
