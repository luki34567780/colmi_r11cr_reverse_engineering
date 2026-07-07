package com.amap.api.col.p0003sl;

/* compiled from: DB.java */
/* loaded from: classes.dex */
public final class kg extends android.database.sqlite.SQLiteOpenHelper {
    private static boolean b = true;
    private static boolean c;
    private com.amap.api.col.p0003sl.kc a;

    public kg(android.content.Context context, java.lang.String str, int i, com.amap.api.col.p0003sl.kc kcVar) {
        super(context, str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, i);
        this.a = kcVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        this.a.a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.a.a(sQLiteDatabase, i);
    }
}
