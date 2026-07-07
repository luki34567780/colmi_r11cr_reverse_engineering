package com.amap.api.col.p0003sl;

/* compiled from: MethodCallHelper.java */
/* loaded from: classes.dex */
public final class ej {
    private boolean b = false;
    java.util.ArrayList<com.amap.api.col.3sl.ej.a> a = new java.util.ArrayList<>();

    public final synchronized void a() {
        java.lang.Class<?> cls;
        if (this.b) {
            return;
        }
        this.b = true;
        for (int i = 0; i < this.a.size(); i++) {
            com.amap.api.col.3sl.ej.a aVar = this.a.get(i);
            try {
                try {
                    try {
                        if (aVar.b != null && (cls = aVar.b.getClass()) != null) {
                            java.lang.reflect.Method method = null;
                            try {
                                method = cls.getDeclaredMethod(aVar.a, aVar.c);
                            } catch (java.lang.NoSuchMethodException unused) {
                                if (aVar.c.length > 0) {
                                    java.lang.Class<?>[] clsArr = new java.lang.Class[aVar.c.length];
                                    for (int i2 = 0; i2 < aVar.c.length; i2++) {
                                        if (aVar.c[i2].getInterfaces().length > 0) {
                                            clsArr[i2] = aVar.c[i2].getInterfaces()[0];
                                        }
                                    }
                                    method = cls.getDeclaredMethod(aVar.a, clsArr);
                                }
                            }
                            if (method != null) {
                                method.setAccessible(true);
                                method.invoke(aVar.b, aVar.d);
                            }
                        }
                    } catch (java.lang.NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                } catch (java.lang.IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (java.lang.IllegalArgumentException e3) {
                    e3.printStackTrace();
                }
            } catch (java.lang.SecurityException e4) {
                e4.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e5) {
                e5.printStackTrace();
            }
        }
        this.a.clear();
    }

    public final synchronized void a(java.lang.Object obj, java.lang.Object... objArr) {
        try {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            if (stackTrace != null && stackTrace.length >= 3) {
                this.a.add(new com.amap.api.col.3sl.ej.a(obj, stackTrace[3].getMethodName(), objArr));
            }
        } catch (java.lang.Throwable unused) {
        }
        this.b = false;
    }

    /* compiled from: MethodCallHelper.java */
    public static class a {
        private java.lang.String a;
        private java.lang.Object b;
        private java.lang.Class<?>[] c;
        private java.lang.Object[] d;

        public a(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) {
            this.b = obj;
            this.a = str;
            if (objArr == null || objArr.length <= 0) {
                return;
            }
            this.c = new java.lang.Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                this.c[i] = objArr[i].getClass();
            }
            this.d = new java.lang.Object[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                this.d[i2] = objArr[i2];
            }
        }
    }
}
