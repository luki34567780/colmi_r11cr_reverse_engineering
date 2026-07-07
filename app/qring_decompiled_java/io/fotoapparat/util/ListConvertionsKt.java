package io.fotoapparat.util;

/* compiled from: ListConvertions.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¨\u0006\u0004"}, d2 = {"toInts", "", "", "", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class ListConvertionsKt {
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<java.lang.Integer> toInts(java.util.List<java.lang.String> r3) {
        /*
            java.lang.String r0 = "receiver$0"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L33
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.NumberFormatException -> L3b
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)     // Catch: java.lang.NumberFormatException -> L3b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L3b
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L3b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L3b
            goto L3c
        L33:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException     // Catch: java.lang.NumberFormatException -> L3b
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.CharSequence"
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> L3b
            throw r1     // Catch: java.lang.NumberFormatException -> L3b
        L3b:
            r1 = 0
        L3c:
            if (r1 == 0) goto L12
            r0.add(r1)
            goto L12
        L42:
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.util.ListConvertionsKt.toInts(java.util.List):java.util.List");
    }
}
