package com.amap.api.col.p0003sl;

/* compiled from: DBOperation.java */
/* loaded from: classes.dex */
public final class kd {
    private static java.util.Map<java.lang.Class<? extends com.amap.api.col.p0003sl.kc>, com.amap.api.col.p0003sl.kc> d = new java.util.HashMap();
    private com.amap.api.col.p0003sl.kg a;
    private android.database.sqlite.SQLiteDatabase b;
    private com.amap.api.col.p0003sl.kc c;

    public static synchronized com.amap.api.col.p0003sl.kc a(java.lang.Class<? extends com.amap.api.col.p0003sl.kc> cls) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
        com.amap.api.col.p0003sl.kc kcVar;
        synchronized (com.amap.api.col.p0003sl.kd.class) {
            if (d.get(cls) == null) {
                d.put(cls, cls.newInstance());
            }
            kcVar = d.get(cls);
        }
        return kcVar;
    }

    public kd(android.content.Context context, com.amap.api.col.p0003sl.kc kcVar) {
        try {
            this.a = new com.amap.api.col.p0003sl.kg(context.getApplicationContext(), kcVar.b(), kcVar.c(), kcVar);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        this.c = kcVar;
    }

    public final <T> void a(java.lang.String str, java.lang.Class<T> cls) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        synchronized (this.c) {
            java.lang.String a = a(b((java.lang.Class) cls));
            if (android.text.TextUtils.isEmpty(a)) {
                return;
            }
            android.database.sqlite.SQLiteDatabase b = b();
            this.b = b;
            if (b == null) {
                return;
            }
            try {
                b.delete(a, str, null);
                sQLiteDatabase = this.b;
            } catch (java.lang.Throwable th) {
                try {
                    com.amap.api.col.p0003sl.jr.a(th, "dbs", "dld");
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = this.b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                    }
                } catch (java.lang.Throwable th2) {
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase3 = this.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.close();
                        this.b = null;
                    }
                    throw th2;
                }
            }
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                this.b = null;
            }
        }
    }

    private <T> void a(java.lang.String str, java.lang.Object obj) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        synchronized (this.c) {
            if (obj == null) {
                return;
            }
            com.amap.api.col.p0003sl.ke b = b((java.lang.Class) obj.getClass());
            java.lang.String a = a(b);
            if (android.text.TextUtils.isEmpty(a)) {
                return;
            }
            android.content.ContentValues a2 = a(obj, b);
            android.database.sqlite.SQLiteDatabase b2 = b();
            this.b = b2;
            if (b2 == null) {
                return;
            }
            try {
                b2.update(a, a2, str, null);
                sQLiteDatabase = this.b;
            } catch (java.lang.Throwable th) {
                try {
                    com.amap.api.col.p0003sl.jr.a(th, "dbs", "udd");
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = this.b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                    }
                } catch (java.lang.Throwable th2) {
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase3 = this.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.close();
                        this.b = null;
                    }
                    throw th2;
                }
            }
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                this.b = null;
            }
        }
    }

    private <T> void b(java.lang.String str, java.lang.Object obj) {
        a(str, obj);
    }

    public final void a(java.lang.Object obj, java.lang.String str) {
        synchronized (this.c) {
            java.util.List b = b(str, (java.lang.Class) obj.getClass());
            if (b != null && b.size() != 0) {
                b(str, obj);
            }
            a((com.amap.api.col.p0003sl.kd) obj);
        }
    }

    private <T> void a(T t) {
        b((com.amap.api.col.p0003sl.kd) t);
    }

    private <T> void b(T t) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        synchronized (this.c) {
            android.database.sqlite.SQLiteDatabase b = b();
            this.b = b;
            if (b == null) {
                return;
            }
            try {
                a(b, t);
                sQLiteDatabase = this.b;
            } catch (java.lang.Throwable th) {
                try {
                    com.amap.api.col.p0003sl.jr.a(th, "dbs", "itd");
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = this.b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                    }
                } catch (java.lang.Throwable th2) {
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase3 = this.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.close();
                        this.b = null;
                    }
                    throw th2;
                }
            }
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                this.b = null;
            }
        }
    }

    private static <T> void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase, T t) {
        com.amap.api.col.p0003sl.ke b = b((java.lang.Class) t.getClass());
        java.lang.String a = a(b);
        if (android.text.TextUtils.isEmpty(a) || t == null || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.insert(a, null, a(t, b));
    }

    public final <T> void a(java.util.List<T> list) {
        java.lang.String str;
        java.lang.String str2;
        synchronized (this.c) {
            if (list.size() == 0) {
                return;
            }
            android.database.sqlite.SQLiteDatabase b = b();
            this.b = b;
            if (b == null) {
                return;
            }
            try {
                b.beginTransaction();
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    a(this.b, it.next());
                }
                this.b.setTransactionSuccessful();
                try {
                    this.b.close();
                    this.b = null;
                } catch (java.lang.Throwable th) {
                    th = th;
                    str = "dbs";
                    str2 = "ild";
                    com.amap.api.col.p0003sl.jr.a(th, str, str2);
                }
            } catch (java.lang.Throwable th2) {
                try {
                    com.amap.api.col.p0003sl.jr.a(th2, "dbs", "ild");
                    try {
                        if (this.b.inTransaction()) {
                            this.b.endTransaction();
                        }
                    } catch (java.lang.Throwable th3) {
                        com.amap.api.col.p0003sl.jr.a(th3, "dbs", "ild");
                    }
                    try {
                        this.b.close();
                        this.b = null;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        str = "dbs";
                        str2 = "ild";
                        com.amap.api.col.p0003sl.jr.a(th, str, str2);
                    }
                } finally {
                    try {
                        if (this.b.inTransaction()) {
                            this.b.endTransaction();
                        }
                    } catch (java.lang.Throwable th5) {
                        com.amap.api.col.p0003sl.jr.a(th5, "dbs", "ild");
                    }
                    try {
                        this.b.close();
                        this.b = null;
                        throw th;
                    } catch (java.lang.Throwable th6) {
                        com.amap.api.col.p0003sl.jr.a(th6, "dbs", "ild");
                    }
                }
            }
        }
    }

    private <T> java.util.List<T> c(java.lang.String str, java.lang.Class<T> cls) {
        android.database.Cursor cursor;
        java.lang.String str2;
        java.lang.String str3;
        synchronized (this.c) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.amap.api.col.p0003sl.ke b = b((java.lang.Class) cls);
            java.lang.String a = a(b);
            if (this.b == null) {
                this.b = a();
            }
            if (this.b == null || android.text.TextUtils.isEmpty(a) || str == null) {
                return arrayList;
            }
            try {
                cursor = this.b.query(a, null, str, null, null, null, null);
            } catch (java.lang.Throwable th) {
                th = th;
                cursor = null;
            }
            try {
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    com.amap.api.col.p0003sl.jr.a(th, "dbs", "sld");
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (java.lang.Throwable th3) {
                            com.amap.api.col.p0003sl.jr.a(th3, "dbs", "sld");
                        }
                    }
                    try {
                        android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.b;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                            this.b = null;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        str2 = "dbs";
                        str3 = "sld";
                        com.amap.api.col.p0003sl.jr.a(th, str2, str3);
                        return arrayList;
                    }
                    return arrayList;
                } finally {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (java.lang.Throwable th5) {
                            com.amap.api.col.p0003sl.jr.a(th5, "dbs", "sld");
                        }
                    }
                    try {
                        android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = this.b;
                        if (sQLiteDatabase2 == null) {
                            throw th;
                        }
                        sQLiteDatabase2.close();
                        this.b = null;
                        throw th;
                    } catch (java.lang.Throwable th6) {
                        com.amap.api.col.p0003sl.jr.a(th6, "dbs", "sld");
                    }
                }
            }
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    arrayList.add(a(cursor, cls, b));
                }
                try {
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase3 = this.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.close();
                        this.b = null;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    str2 = "dbs";
                    str3 = "sld";
                    com.amap.api.col.p0003sl.jr.a(th, str2, str3);
                    return arrayList;
                }
                return arrayList;
            }
            this.b.close();
            this.b = null;
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (java.lang.Throwable th8) {
                    com.amap.api.col.p0003sl.jr.a(th8, "dbs", "sld");
                }
            }
            try {
                android.database.sqlite.SQLiteDatabase sQLiteDatabase4 = this.b;
                if (sQLiteDatabase4 != null) {
                    sQLiteDatabase4.close();
                    this.b = null;
                }
            } catch (java.lang.Throwable th9) {
                com.amap.api.col.p0003sl.jr.a(th9, "dbs", "sld");
            }
            return arrayList;
        }
    }

    public final <T> java.util.List<T> b(java.lang.String str, java.lang.Class<T> cls) {
        return c(str, cls);
    }

    private static <T> T a(android.database.Cursor cursor, java.lang.Class<T> cls, com.amap.api.col.p0003sl.ke keVar) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Field[] a = a((java.lang.Class<?>) cls, keVar.b());
        java.lang.reflect.Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
        declaredConstructor.setAccessible(true);
        T newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
        for (java.lang.reflect.Field field : a) {
            field.setAccessible(true);
            java.lang.annotation.Annotation annotation = field.getAnnotation(com.amap.api.col.p0003sl.kf.class);
            if (annotation != null) {
                com.amap.api.col.p0003sl.kf kfVar = (com.amap.api.col.p0003sl.kf) annotation;
                int b = kfVar.b();
                int columnIndex = cursor.getColumnIndex(kfVar.a());
                switch (b) {
                    case 1:
                        field.set(newInstance, java.lang.Short.valueOf(cursor.getShort(columnIndex)));
                        break;
                    case 2:
                        field.set(newInstance, java.lang.Integer.valueOf(cursor.getInt(columnIndex)));
                        break;
                    case 3:
                        field.set(newInstance, java.lang.Float.valueOf(cursor.getFloat(columnIndex)));
                        break;
                    case 4:
                        field.set(newInstance, java.lang.Double.valueOf(cursor.getDouble(columnIndex)));
                        break;
                    case 5:
                        field.set(newInstance, java.lang.Long.valueOf(cursor.getLong(columnIndex)));
                        break;
                    case 6:
                        field.set(newInstance, cursor.getString(columnIndex));
                        break;
                    case 7:
                        field.set(newInstance, cursor.getBlob(columnIndex));
                        break;
                }
            }
        }
        return newInstance;
    }

    private static void a(java.lang.Object obj, java.lang.reflect.Field field, android.content.ContentValues contentValues) {
        java.lang.annotation.Annotation annotation = field.getAnnotation(com.amap.api.col.p0003sl.kf.class);
        if (annotation == null) {
        }
        com.amap.api.col.p0003sl.kf kfVar = (com.amap.api.col.p0003sl.kf) annotation;
        try {
            switch (kfVar.b()) {
                case 1:
                    contentValues.put(kfVar.a(), java.lang.Short.valueOf(field.getShort(obj)));
                    break;
                case 2:
                    contentValues.put(kfVar.a(), java.lang.Integer.valueOf(field.getInt(obj)));
                    break;
                case 3:
                    contentValues.put(kfVar.a(), java.lang.Float.valueOf(field.getFloat(obj)));
                    break;
                case 4:
                    contentValues.put(kfVar.a(), java.lang.Double.valueOf(field.getDouble(obj)));
                    break;
                case 5:
                    contentValues.put(kfVar.a(), java.lang.Long.valueOf(field.getLong(obj)));
                    break;
                case 6:
                    contentValues.put(kfVar.a(), (java.lang.String) field.get(obj));
                    break;
                case 7:
                    contentValues.put(kfVar.a(), (byte[]) field.get(obj));
                    break;
            }
        } catch (java.lang.IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static android.content.ContentValues a(java.lang.Object obj, com.amap.api.col.p0003sl.ke keVar) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        for (java.lang.reflect.Field field : a(obj.getClass(), keVar.b())) {
            field.setAccessible(true);
            a(obj, field, contentValues);
        }
        return contentValues;
    }

    private static java.lang.reflect.Field[] a(java.lang.Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        if (z) {
            return cls.getSuperclass().getDeclaredFields();
        }
        return cls.getDeclaredFields();
    }

    private android.database.sqlite.SQLiteDatabase a() {
        try {
            if (this.b == null) {
                this.b = this.a.getReadableDatabase();
            }
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "dbs", "grd");
        }
        return this.b;
    }

    private android.database.sqlite.SQLiteDatabase b() {
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase == null || sQLiteDatabase.isReadOnly()) {
                android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = this.b;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.close();
                }
                this.b = this.a.getWritableDatabase();
            }
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "dbs", "gwd");
        }
        return this.b;
    }

    private static <T> java.lang.String a(com.amap.api.col.p0003sl.ke keVar) {
        if (keVar == null) {
            return null;
        }
        return keVar.a();
    }

    private static <T> com.amap.api.col.p0003sl.ke b(java.lang.Class<T> cls) {
        java.lang.annotation.Annotation annotation = cls.getAnnotation(com.amap.api.col.p0003sl.ke.class);
        if (annotation != null) {
            return (com.amap.api.col.p0003sl.ke) annotation;
        }
        return null;
    }
}
