package com.amap.api.col.p0003sl;

/* compiled from: UnZipFile.java */
/* loaded from: classes.dex */
public final class bu {
    private com.amap.api.col.3sl.bu.b a;

    /* compiled from: UnZipFile.java */
    public static class a {
        public boolean a = false;
    }

    /* compiled from: UnZipFile.java */
    public interface c {
        void a();

        void a(long j);
    }

    public bu(com.amap.api.col.p0003sl.br brVar, com.amap.api.col.p0003sl.bq bqVar) {
        this.a = new com.amap.api.col.3sl.bu.b(brVar, bqVar);
    }

    public final void a() {
        com.amap.api.col.3sl.bu.b bVar = this.a;
        if (bVar != null) {
            bVar.f();
        }
    }

    public final void b() {
        com.amap.api.col.3sl.bu.b bVar = this.a;
        if (bVar != null) {
            a(bVar);
        }
    }

    private static void a(com.amap.api.col.3sl.bu.b bVar) {
        if (bVar == null) {
            return;
        }
        final com.amap.api.col.p0003sl.bq d = bVar.d();
        if (d != null) {
            d.p();
        }
        java.lang.String a2 = bVar.a();
        java.lang.String b2 = bVar.b();
        if (android.text.TextUtils.isEmpty(a2) || android.text.TextUtils.isEmpty(b2)) {
            if (bVar.e().a) {
                if (d != null) {
                    d.r();
                    return;
                }
                return;
            } else {
                if (d != null) {
                    d.q();
                    return;
                }
                return;
            }
        }
        java.io.File file = new java.io.File(a2);
        if (!file.exists()) {
            if (bVar.e().a) {
                if (d != null) {
                    d.r();
                    return;
                }
                return;
            } else {
                if (d != null) {
                    d.q();
                    return;
                }
                return;
            }
        }
        java.io.File file2 = new java.io.File(b2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        com.amap.api.col.3sl.bu.c cVar = new com.amap.api.col.3sl.bu.c() { // from class: com.amap.api.col.3sl.bu.1
            @Override // com.amap.api.col.3sl.bu.c
            public final void a(long j) {
                try {
                    com.amap.api.col.p0003sl.bq bqVar = com.amap.api.col.p0003sl.bq.this;
                    if (bqVar != null) {
                        bqVar.a(j);
                    }
                } catch (java.lang.Exception unused) {
                }
            }

            @Override // com.amap.api.col.3sl.bu.c
            public final void a() {
                com.amap.api.col.p0003sl.bq bqVar = com.amap.api.col.p0003sl.bq.this;
                if (bqVar != null) {
                    bqVar.q();
                }
            }
        };
        try {
            if (bVar.e().a && d != null) {
                d.r();
            }
            a(file, file2, cVar, bVar);
            if (bVar.e().a) {
                if (d != null) {
                    d.r();
                }
            } else if (d != null) {
                d.b(bVar.c());
            }
        } catch (java.lang.Throwable unused) {
            if (bVar.e().a) {
                if (d != null) {
                    d.r();
                }
            } else if (d != null) {
                d.q();
            }
        }
    }

    private static void a(java.io.File file, java.io.File file2, com.amap.api.col.3sl.bu.c cVar, com.amap.api.col.3sl.bu.b bVar) throws java.lang.Exception {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        com.amap.api.col.3sl.bu.a e = bVar.e();
        long j = 0;
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            java.util.zip.CheckedInputStream checkedInputStream = new java.util.zip.CheckedInputStream(fileInputStream, new java.util.zip.CRC32());
            java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(checkedInputStream);
            while (true) {
                java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    if (e != null && e.a) {
                        zipInputStream.closeEntry();
                        zipInputStream.close();
                        checkedInputStream.close();
                        fileInputStream.close();
                        break;
                    }
                    if (!nextEntry.isDirectory()) {
                        if (!a(nextEntry.getName())) {
                            cVar.a();
                            break;
                        } else {
                            stringBuffer.append(nextEntry.getName());
                            stringBuffer.append(";");
                        }
                    }
                    j += nextEntry.getSize();
                    zipInputStream.closeEntry();
                } else {
                    break;
                }
            }
            bVar.a(stringBuffer.toString());
            zipInputStream.close();
            checkedInputStream.close();
            fileInputStream.close();
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
        java.util.zip.CheckedInputStream checkedInputStream2 = new java.util.zip.CheckedInputStream(fileInputStream2, new java.util.zip.CRC32());
        java.util.zip.ZipInputStream zipInputStream2 = new java.util.zip.ZipInputStream(checkedInputStream2);
        a(file2, zipInputStream2, j, cVar, e);
        zipInputStream2.close();
        checkedInputStream2.close();
        fileInputStream2.close();
    }

    private static void a(java.io.File file, java.util.zip.ZipInputStream zipInputStream, long j, com.amap.api.col.3sl.bu.c cVar, com.amap.api.col.3sl.bu.a aVar) throws java.lang.Exception {
        int i = 0;
        while (true) {
            java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                return;
            }
            if (aVar != null && aVar.a) {
                zipInputStream.closeEntry();
                return;
            }
            java.lang.String str = file.getPath() + java.io.File.separator + nextEntry.getName();
            if (!a(nextEntry.getName())) {
                if (cVar != null) {
                    cVar.a();
                    return;
                }
                return;
            } else {
                java.io.File file2 = new java.io.File(str);
                a(file2);
                if (nextEntry.isDirectory()) {
                    file2.mkdirs();
                } else {
                    i += a(file2, zipInputStream, i, j, cVar, aVar);
                }
                zipInputStream.closeEntry();
            }
        }
    }

    private static boolean a(java.lang.String str) {
        return (str.contains("..") || str.contains("/") || str.contains("\\") || str.contains("%")) ? false : true;
    }

    private static int a(java.io.File file, java.util.zip.ZipInputStream zipInputStream, long j, long j2, com.amap.api.col.3sl.bu.c cVar, com.amap.api.col.3sl.bu.a aVar) throws java.lang.Exception {
        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
        byte[] bArr = new byte[1024];
        int i = 0;
        while (true) {
            int read = zipInputStream.read(bArr, 0, 1024);
            if (read != -1) {
                if (aVar != null && aVar.a) {
                    bufferedOutputStream.close();
                    return i;
                }
                bufferedOutputStream.write(bArr, 0, read);
                i += read;
                if (j2 > 0 && cVar != null) {
                    long j3 = ((i + j) * 100) / j2;
                    if (aVar == null || !aVar.a) {
                        cVar.a(j3);
                    }
                }
            } else {
                bufferedOutputStream.close();
                return i;
            }
        }
    }

    private static void a(java.io.File file) {
        java.io.File parentFile = file.getParentFile();
        if (parentFile.exists()) {
            return;
        }
        a(parentFile);
        parentFile.mkdir();
    }

    /* compiled from: UnZipFile.java */
    private static class b {
        private java.lang.String a;
        private java.lang.String b;
        private com.amap.api.col.p0003sl.bq c;
        private com.amap.api.col.3sl.bu.a d = new com.amap.api.col.3sl.bu.a();
        private java.lang.String e;

        public b(com.amap.api.col.p0003sl.br brVar, com.amap.api.col.p0003sl.bq bqVar) {
            this.c = null;
            this.a = brVar.x();
            this.b = brVar.y();
            this.c = bqVar;
        }

        public final void a(java.lang.String str) {
            if (str.length() > 1) {
                this.e = str;
            }
        }

        public final java.lang.String a() {
            return this.a;
        }

        public final java.lang.String b() {
            return this.b;
        }

        public final java.lang.String c() {
            return this.e;
        }

        public final com.amap.api.col.p0003sl.bq d() {
            return this.c;
        }

        public final com.amap.api.col.3sl.bu.a e() {
            return this.d;
        }

        public final void f() {
            this.d.a = true;
        }
    }
}
