package com.amap.api.col.p0003sl;

/* compiled from: WifiCollector.java */
/* loaded from: classes.dex */
public final class mj {
    private com.amap.api.col.p0003sl.nn b;
    private java.util.List<com.amap.api.col.p0003sl.no> a = new java.util.ArrayList();
    private java.util.ArrayList<com.amap.api.col.p0003sl.no> c = new java.util.ArrayList<>();

    final java.util.List<com.amap.api.col.p0003sl.no> a(com.amap.api.col.p0003sl.nn nnVar, java.util.List<com.amap.api.col.p0003sl.no> list, boolean z, long j, long j2) {
        if (!b(nnVar, list, z, j, j2)) {
            return null;
        }
        b(this.c, list);
        this.a.clear();
        this.a.addAll(list);
        this.b = nnVar;
        return this.c;
    }

    private boolean b(com.amap.api.col.p0003sl.nn nnVar, java.util.List<com.amap.api.col.p0003sl.no> list, boolean z, long j, long j2) {
        if (!z || !a(nnVar, j, j2) || list == null || list.size() <= 0) {
            return false;
        }
        if (this.b == null) {
            return true;
        }
        boolean a = a(nnVar);
        return !a ? !a(list, this.a) : a;
    }

    private static boolean a(com.amap.api.col.p0003sl.nn nnVar, long j, long j2) {
        return j > 0 && j2 - j < ((long) ((nnVar.g > 10.0f ? 1 : (nnVar.g == 10.0f ? 0 : -1)) >= 0 ? 2000 : 3500));
    }

    private boolean a(com.amap.api.col.p0003sl.nn nnVar) {
        float f = 10.0f;
        if (nnVar.g > 10.0f) {
            f = 200.0f;
        } else if (nnVar.g > 2.0f) {
            f = 50.0f;
        }
        return nnVar.a(this.b) > ((double) f);
    }

    private static boolean a(java.util.List<com.amap.api.col.p0003sl.no> list, java.util.List<com.amap.api.col.p0003sl.no> list2) {
        if (list != null && list2 != null) {
            int size = list.size();
            int size2 = list2.size();
            int i = size + size2;
            if (size <= size2) {
                list2 = list;
                list = list2;
            }
            java.util.HashMap hashMap = new java.util.HashMap(list.size());
            java.util.Iterator<com.amap.api.col.p0003sl.no> it = list.iterator();
            while (it.hasNext()) {
                hashMap.put(java.lang.Long.valueOf(it.next().a), 1);
            }
            java.util.Iterator<com.amap.api.col.p0003sl.no> it2 = list2.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                if (((java.lang.Integer) hashMap.get(java.lang.Long.valueOf(it2.next().a))) != null) {
                    i2++;
                }
            }
            if (i2 * 2.0d >= i * 0.5d) {
                return true;
            }
        }
        return false;
    }

    private void b(java.util.List<com.amap.api.col.p0003sl.no> list, java.util.List<com.amap.api.col.p0003sl.no> list2) {
        list.clear();
        if (list2 != null) {
            java.util.List<com.amap.api.col.p0003sl.no> b = b(a(list2));
            int size = b.size();
            if (size > 40) {
                size = 40;
            }
            for (int i = 0; i < size; i++) {
                list.add(b.get(i));
            }
        }
    }

    private static java.util.List<com.amap.api.col.p0003sl.no> a(java.util.List<com.amap.api.col.p0003sl.no> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i = 0; i < list.size(); i++) {
            com.amap.api.col.p0003sl.no noVar = list.get(i);
            hashMap.put(java.lang.Integer.valueOf(noVar.c), noVar);
        }
        arrayList.addAll(hashMap.values());
        return arrayList;
    }

    private java.util.List<com.amap.api.col.p0003sl.no> b(java.util.List<com.amap.api.col.p0003sl.no> list) {
        java.util.Collections.sort(list, new java.util.Comparator<com.amap.api.col.p0003sl.no>() { // from class: com.amap.api.col.3sl.mj.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(com.amap.api.col.p0003sl.no noVar, com.amap.api.col.p0003sl.no noVar2) {
                return a(noVar, noVar2);
            }

            private static int a(com.amap.api.col.p0003sl.no noVar, com.amap.api.col.p0003sl.no noVar2) {
                return noVar2.c - noVar.c;
            }
        });
        return list;
    }
}
