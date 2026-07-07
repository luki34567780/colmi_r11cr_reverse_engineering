package com.autonavi.aps.amapapi.storage;

/* compiled from: SdCardDbCreator.java */
/* loaded from: classes.dex */
public class c implements com.amap.api.col.p0003sl.kc {
    @Override // com.amap.api.col.p0003sl.kc
    public final void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i) {
    }

    @Override // com.amap.api.col.p0003sl.kc
    public final java.lang.String b() {
        return "alsn20170807.db";
    }

    @Override // com.amap.api.col.p0003sl.kc
    public final int c() {
        return 1;
    }

    @Override // com.amap.api.col.p0003sl.kc
    public final void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS c (_id integer primary key autoincrement, a2 varchar(100), a4 varchar(2000), a3 LONG );");
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "SdCardDbCreator", "onCreate");
        }
    }
}
