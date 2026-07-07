package okhttp3.internal.cache;

/* compiled from: DiskLruCache.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\r\u0010\u000b\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R$\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012 \u0006*\b\u0018\u00010\u0005R\u00020\u00030\u0005R\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "delegate", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "kotlin.jvm.PlatformType", "nextSnapshot", "removeSnapshot", "hasNext", "", "next", "remove", "", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class DiskLruCache$snapshots$1 implements java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot>, kotlin.jvm.internal.markers.KMutableIterator {
    private final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Entry> delegate;
    private okhttp3.internal.cache.DiskLruCache.Snapshot nextSnapshot;
    private okhttp3.internal.cache.DiskLruCache.Snapshot removeSnapshot;
    final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;

    DiskLruCache$snapshots$1(okhttp3.internal.cache.DiskLruCache diskLruCache) {
        this.this$0 = diskLruCache;
        java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Entry> it = new java.util.ArrayList(diskLruCache.getLruEntries$okhttp().values()).iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "ArrayList(lruEntries.values).iterator()");
        this.delegate = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        okhttp3.internal.cache.DiskLruCache.Snapshot snapshot$okhttp;
        if (this.nextSnapshot != null) {
            return true;
        }
        synchronized (this.this$0) {
            if (this.this$0.getClosed()) {
                return false;
            }
            while (this.delegate.hasNext()) {
                okhttp3.internal.cache.DiskLruCache.Entry next = this.delegate.next();
                if (next != null && (snapshot$okhttp = next.snapshot$okhttp()) != null) {
                    this.nextSnapshot = snapshot$okhttp;
                    return true;
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return false;
        }
    }

    @Override // java.util.Iterator
    public okhttp3.internal.cache.DiskLruCache.Snapshot next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        okhttp3.internal.cache.DiskLruCache.Snapshot snapshot = this.nextSnapshot;
        this.removeSnapshot = snapshot;
        this.nextSnapshot = null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(snapshot);
        return snapshot;
    }

    @Override // java.util.Iterator
    public void remove() {
        okhttp3.internal.cache.DiskLruCache.Snapshot snapshot = this.removeSnapshot;
        if (snapshot == null) {
            throw new java.lang.IllegalStateException("remove() before next()".toString());
        }
        try {
            this.this$0.remove(snapshot.getKey());
        } catch (java.io.IOException unused) {
        } catch (java.lang.Throwable th) {
            this.removeSnapshot = null;
            throw th;
        }
        this.removeSnapshot = null;
    }
}
