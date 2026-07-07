package com.google.android.gms.common.data;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class SingleRefDataBufferIterator<T> extends com.google.android.gms.common.data.DataBufferIterator<T> {
    private T zac;

    public SingleRefDataBufferIterator(com.google.android.gms.common.data.DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            int i = this.zab;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(46);
            sb.append("Cannot advance the iterator beyond ");
            sb.append(i);
            throw new java.util.NoSuchElementException(sb.toString());
        }
        int i2 = this.zab + 1;
        this.zab = i2;
        if (i2 == 0) {
            T t = (T) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaa.get(0));
            this.zac = t;
            if (!(t instanceof com.google.android.gms.common.data.DataBufferRef)) {
                java.lang.String valueOf = java.lang.String.valueOf(t.getClass());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 44);
                sb2.append("DataBuffer reference of type ");
                sb2.append(valueOf);
                sb2.append(" is not movable");
                throw new java.lang.IllegalStateException(sb2.toString());
            }
        } else {
            ((com.google.android.gms.common.data.DataBufferRef) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}
