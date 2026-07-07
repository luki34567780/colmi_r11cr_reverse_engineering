package com.amap.api.col.p0003sl;

/* compiled from: BinaryRequest.java */
/* loaded from: classes.dex */
public abstract class kt extends com.amap.api.col.p0003sl.il {
    protected android.content.Context a;
    protected com.amap.api.col.p0003sl.iq b;
    protected byte[] c;

    public abstract byte[] c();

    public abstract byte[] d();

    protected java.lang.String e() {
        return "2.1";
    }

    public boolean f() {
        return true;
    }

    protected boolean h() {
        return false;
    }

    public kt(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar) {
        if (context != null) {
            this.a = context.getApplicationContext();
        }
        this.b = iqVar;
        setBinary(true);
    }

    @Override // com.amap.api.col.p0003sl.kz
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
        java.lang.String f = com.amap.api.col.p0003sl.ie.f(this.a);
        java.lang.String a = com.amap.api.col.p0003sl.ih.a();
        java.lang.String a2 = com.amap.api.col.p0003sl.ih.a(this.a, a, "key=".concat(java.lang.String.valueOf(f)));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ts", a);
        hashMap.put("key", f);
        hashMap.put("scode", a2);
        return hashMap;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final byte[] getEntityBytes() {
        byte[] bArr = this.c;
        if (bArr != null) {
            return bArr;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(i());
            byteArrayOutputStream.write(j());
            byteArrayOutputStream.write(k());
            byteArrayOutputStream.write(l());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.c = byteArray;
            return byteArray;
        } catch (java.lang.Throwable th) {
            try {
                com.amap.api.col.p0003sl.jr.a(th, "bre", "geb");
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (java.lang.Throwable th2) {
                    com.amap.api.col.p0003sl.jr.a(th2, "bre", "geb");
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th3) {
                    com.amap.api.col.p0003sl.jr.a(th3, "bre", "geb");
                }
            }
        }
    }

    private static byte[] i() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(com.amap.api.col.p0003sl.ir.a("PANDORA$"));
            byteArrayOutputStream.write(new byte[]{1});
            byteArrayOutputStream.write(new byte[]{0});
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Throwable th) {
            try {
                com.amap.api.col.p0003sl.jr.a(th, "bre", "gbh");
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (java.lang.Throwable th2) {
                    com.amap.api.col.p0003sl.jr.a(th2, "bre", "gbh");
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th3) {
                    com.amap.api.col.p0003sl.jr.a(th3, "bre", "gbh");
                }
            }
        }
    }

    private byte[] j() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{3});
            if (f()) {
                android.content.Context context = this.a;
                boolean h = h();
                com.amap.api.col.p0003sl.iq iqVar = this.b;
                byte[] a = com.amap.api.col.p0003sl.ih.a(context, h, iqVar != null && "navi".equals(iqVar.a()));
                byteArrayOutputStream.write(a(a));
                byteArrayOutputStream.write(a);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] a2 = com.amap.api.col.p0003sl.ir.a(e());
            if (a2 != null && a2.length > 0) {
                byteArrayOutputStream.write(a(a2));
                byteArrayOutputStream.write(a2);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] a3 = com.amap.api.col.p0003sl.ir.a(g());
            if (a3 != null && a3.length > 0) {
                byteArrayOutputStream.write(a(a3));
                byteArrayOutputStream.write(a3);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Throwable th) {
            try {
                com.amap.api.col.p0003sl.jr.a(th, "bre", "gpd");
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    com.amap.api.col.p0003sl.jr.a(th2, "bre", "gred");
                }
                return new byte[]{0};
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th3) {
                    com.amap.api.col.p0003sl.jr.a(th3, "bre", "gred");
                }
            }
        }
    }

    public java.lang.String g() {
        return java.lang.String.format("platform=Android&sdkversion=%s&product=%s", this.b.c(), this.b.a());
    }

    protected static byte[] a(byte[] bArr) {
        return com.amap.api.col.p0003sl.ir.a(bArr.length);
    }

    private byte[] k() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byte[] c = c();
            if (c != null && c.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byteArrayOutputStream.write(a(c));
                byteArrayOutputStream.write(c);
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th) {
                com.amap.api.col.p0003sl.jr.a(th, "bre", "grrd");
            }
            return byteArray;
        } catch (java.lang.Throwable th2) {
            try {
                com.amap.api.col.p0003sl.jr.a(th2, "bre", "grrd");
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th3) {
                    com.amap.api.col.p0003sl.jr.a(th3, "bre", "grrd");
                }
                return new byte[]{0};
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th4) {
                    com.amap.api.col.p0003sl.jr.a(th4, "bre", "grrd");
                }
            }
        }
    }

    private byte[] l() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byte[] d = d();
            if (d != null && d.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byte[] a = com.amap.api.col.p0003sl.ih.a(d);
                byteArrayOutputStream.write(a(a));
                byteArrayOutputStream.write(a);
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th) {
                com.amap.api.col.p0003sl.jr.a(th, "bre", "gred");
            }
            return byteArray;
        } catch (java.lang.Throwable th2) {
            try {
                com.amap.api.col.p0003sl.jr.a(th2, "bre", "gred");
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th3) {
                    com.amap.api.col.p0003sl.jr.a(th3, "bre", "gred");
                }
                return new byte[]{0};
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th4) {
                    com.amap.api.col.p0003sl.jr.a(th4, "bre", "gred");
                }
            }
        }
    }
}
