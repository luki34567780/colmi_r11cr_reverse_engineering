package androidx.room;

/* loaded from: classes.dex */
public abstract class EntityDeletionOrUpdateAdapter<T> extends androidx.room.SharedSQLiteStatement {
    protected abstract void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, T t);

    @Override // androidx.room.SharedSQLiteStatement
    protected abstract java.lang.String createQuery();

    public EntityDeletionOrUpdateAdapter(androidx.room.RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public final int handle(T t) {
        androidx.sqlite.db.SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t);
            return acquire.executeUpdateDelete();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(java.lang.Iterable<? extends T> iterable) {
        androidx.sqlite.db.SupportSQLiteStatement acquire = acquire();
        int i = 0;
        try {
            java.util.Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                i += acquire.executeUpdateDelete();
            }
            return i;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(T[] tArr) {
        androidx.sqlite.db.SupportSQLiteStatement acquire = acquire();
        try {
            int i = 0;
            for (T t : tArr) {
                bind(acquire, t);
                i += acquire.executeUpdateDelete();
            }
            return i;
        } finally {
            release(acquire);
        }
    }
}
