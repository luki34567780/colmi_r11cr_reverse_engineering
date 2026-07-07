package com.liulishuo.okdownload.core.breakpoint;

/* loaded from: /tmp/dex/classes2.dex */
public class BreakpointSQLiteHelper extends android.database.sqlite.SQLiteOpenHelper {
    private static final java.lang.String BLOCK_TABLE_NAME = "block";
    private static final java.lang.String BREAKPOINT_TABLE_NAME = "breakpoint";
    private static final java.lang.String NAME = "okdownload-breakpoint.db";
    private static final java.lang.String RESPONSE_FILENAME_TABLE_NAME = "okdownloadResponseFilename";
    static final java.lang.String TASK_FILE_DIRTY_TABLE_NAME = "taskFileDirty";
    private static final int VERSION = 3;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public BreakpointSQLiteHelper(android.content.Context context) {
        super(context, NAME, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            setWriteAheadLoggingEnabled(true);
        } else {
            sQLiteDatabase.enableWriteAheadLogging();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS breakpoint( id INTEGER PRIMARY KEY, url VARCHAR NOT NULL, etag VARCHAR, parent_path VARCHAR NOT NULL, filename VARCHAR, task_only_parent_path TINYINT(1) DEFAULT 0, chunked TINYINT(1) DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS block( id INTEGER PRIMARY KEY AUTOINCREMENT, breakpoint_id INTEGER, block_index INTEGER, start_offset INTEGER, content_length INTEGER, current_offset INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS okdownloadResponseFilename( url VARCHAR NOT NULL PRIMARY KEY, filename VARCHAR NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS taskFileDirty( id INTEGER PRIMARY KEY)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1 && i2 == 2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS okdownloadResponseFilename( url VARCHAR NOT NULL PRIMARY KEY, filename VARCHAR NOT NULL)");
        }
        if (i <= 2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS taskFileDirty( id INTEGER PRIMARY KEY)");
        }
    }

    public void markFileDirty(int i) {
        android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
        android.content.ContentValues contentValues = new android.content.ContentValues(1);
        contentValues.put(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID, java.lang.Integer.valueOf(i));
        writableDatabase.insert(TASK_FILE_DIRTY_TABLE_NAME, null, contentValues);
    }

    public void markFileClear(int i) {
        getWritableDatabase().delete(TASK_FILE_DIRTY_TABLE_NAME, "id = ?", new java.lang.String[]{java.lang.String.valueOf(i)});
    }

    public java.util.List<java.lang.Integer> loadDirtyFileList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursor = null;
        try {
            cursor = getWritableDatabase().rawQuery("SELECT * FROM taskFileDirty", null);
            while (cursor.moveToNext()) {
                arrayList.add(java.lang.Integer.valueOf(cursor.getInt(cursor.getColumnIndex(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID))));
            }
            return arrayList;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public android.util.SparseArray<com.liulishuo.okdownload.core.breakpoint.BreakpointInfo> loadToCache() {
        android.database.Cursor cursor;
        android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.database.Cursor cursor2 = null;
        try {
            android.database.Cursor rawQuery = writableDatabase.rawQuery("SELECT * FROM breakpoint", null);
            while (rawQuery.moveToNext()) {
                try {
                    arrayList.add(new com.liulishuo.okdownload.core.breakpoint.BreakpointInfoRow(rawQuery));
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = cursor2;
                    cursor2 = rawQuery;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            cursor2 = writableDatabase.rawQuery("SELECT * FROM block", null);
            while (cursor2.moveToNext()) {
                arrayList2.add(new com.liulishuo.okdownload.core.breakpoint.BlockInfoRow(cursor2));
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            android.util.SparseArray<com.liulishuo.okdownload.core.breakpoint.BreakpointInfo> sparseArray = new android.util.SparseArray<>();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info = ((com.liulishuo.okdownload.core.breakpoint.BreakpointInfoRow) it.next()).toInfo();
                java.util.Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    com.liulishuo.okdownload.core.breakpoint.BlockInfoRow blockInfoRow = (com.liulishuo.okdownload.core.breakpoint.BlockInfoRow) it2.next();
                    if (blockInfoRow.getBreakpointId() == info.id) {
                        info.addBlock(blockInfoRow.toInfo());
                        it2.remove();
                    }
                }
                sparseArray.put(info.id, info);
            }
            return sparseArray;
        } catch (java.lang.Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    public java.util.HashMap<java.lang.String, java.lang.String> loadResponseFilenameToMap() {
        android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        android.database.Cursor cursor = null;
        try {
            cursor = writableDatabase.rawQuery("SELECT * FROM okdownloadResponseFilename", null);
            while (cursor.moveToNext()) {
                hashMap.put(cursor.getString(cursor.getColumnIndex("url")), cursor.getString(cursor.getColumnIndex(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.FILENAME)));
            }
            return hashMap;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public void updateFilename(java.lang.String str, java.lang.String str2) {
        android.database.Cursor rawQuery;
        android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
        android.content.ContentValues contentValues = new android.content.ContentValues(2);
        contentValues.put("url", str);
        contentValues.put(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.FILENAME, str2);
        synchronized (str.intern()) {
            android.database.Cursor cursor = null;
            try {
                rawQuery = writableDatabase.rawQuery("SELECT filename FROM okdownloadResponseFilename WHERE url = ?", new java.lang.String[]{str});
            } catch (java.lang.Throwable th) {
                th = th;
            }
            try {
                if (rawQuery.moveToFirst()) {
                    if (!str2.equals(rawQuery.getString(rawQuery.getColumnIndex(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.FILENAME)))) {
                        writableDatabase.replace(RESPONSE_FILENAME_TABLE_NAME, null, contentValues);
                    }
                } else {
                    writableDatabase.insert(RESPONSE_FILENAME_TABLE_NAME, null, contentValues);
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                cursor = rawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public void insert(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) throws java.io.IOException {
        int blockCount = breakpointInfo.getBlockCount();
        android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
        for (int i = 0; i < blockCount; i++) {
            com.liulishuo.okdownload.core.breakpoint.BlockInfo block = breakpointInfo.getBlock(i);
            if (writableDatabase.insert(BLOCK_TABLE_NAME, null, toValues(breakpointInfo.id, i, block)) == -1) {
                throw new com.liulishuo.okdownload.core.exception.SQLiteException("insert block " + block + " failed!");
            }
        }
        if (writableDatabase.insert(BREAKPOINT_TABLE_NAME, null, toValues(breakpointInfo)) != -1) {
            return;
        }
        throw new com.liulishuo.okdownload.core.exception.SQLiteException("insert info " + breakpointInfo + " failed!");
    }

    public void updateBlockIncrease(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, int i, long j) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.CURRENT_OFFSET, java.lang.Long.valueOf(j));
        getWritableDatabase().update(BLOCK_TABLE_NAME, contentValues, "breakpoint_id = ? AND block_index = ?", new java.lang.String[]{java.lang.Integer.toString(breakpointInfo.id), java.lang.Integer.toString(i)});
    }

    public void updateInfo(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) throws java.io.IOException {
        android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        android.database.Cursor cursor = null;
        try {
            cursor = getWritableDatabase().rawQuery("SELECT id FROM breakpoint WHERE id =" + breakpointInfo.id + " LIMIT 1", null);
            if (cursor.moveToNext()) {
                removeInfo(breakpointInfo.id);
                insert(breakpointInfo);
                writableDatabase.setTransactionSuccessful();
                if (cursor != null) {
                    cursor.close();
                }
                writableDatabase.endTransaction();
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            writableDatabase.endTransaction();
        }
    }

    public void removeInfo(int i) {
        getWritableDatabase().delete(BREAKPOINT_TABLE_NAME, "id = ?", new java.lang.String[]{java.lang.String.valueOf(i)});
        removeBlock(i);
    }

    public void removeBlock(int i) {
        getWritableDatabase().delete(BLOCK_TABLE_NAME, "breakpoint_id = ?", new java.lang.String[]{java.lang.String.valueOf(i)});
    }

    private static android.content.ContentValues toValues(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID, java.lang.Integer.valueOf(breakpointInfo.id));
        contentValues.put("url", breakpointInfo.getUrl());
        contentValues.put(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ETAG, breakpointInfo.getEtag());
        contentValues.put(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.PARENT_PATH, breakpointInfo.parentFile.getAbsolutePath());
        contentValues.put(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.FILENAME, breakpointInfo.getFilename());
        contentValues.put(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.TASK_ONLY_PARENT_PATH, java.lang.Integer.valueOf(breakpointInfo.isTaskOnlyProvidedParentPath() ? 1 : 0));
        contentValues.put("chunked", java.lang.Integer.valueOf(breakpointInfo.isChunked() ? 1 : 0));
        return contentValues;
    }

    private static android.content.ContentValues toValues(int i, int i2, com.liulishuo.okdownload.core.breakpoint.BlockInfo blockInfo) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.HOST_ID, java.lang.Integer.valueOf(i));
        contentValues.put(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.BLOCK_INDEX, java.lang.Integer.valueOf(i2));
        contentValues.put(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.START_OFFSET, java.lang.Long.valueOf(blockInfo.getStartOffset()));
        contentValues.put(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.CONTENT_LENGTH, java.lang.Long.valueOf(blockInfo.getContentLength()));
        contentValues.put(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.CURRENT_OFFSET, java.lang.Long.valueOf(blockInfo.getCurrentOffset()));
        return contentValues;
    }
}
