package com.amap.api.col.p0003sl;

/* compiled from: AmapDelegateListenerManager.java */
/* loaded from: classes.dex */
public final class q {
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3sl.q.a> a = new java.util.concurrent.ConcurrentHashMap<>();

    /* compiled from: AmapDelegateListenerManager.java */
    private class a<T> {
        public java.util.List<T> a = java.util.Collections.synchronizedList(new java.util.ArrayList());
        public T b = null;

        public a() {
        }
    }

    public final <T> void a(java.lang.Integer num, T t) {
        java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3sl.q.a> concurrentHashMap;
        if (t == null || (concurrentHashMap = this.a) == null) {
            return;
        }
        try {
            com.amap.api.col.3sl.q.a aVar = concurrentHashMap.get(num);
            if (aVar == null) {
                aVar = new com.amap.api.col.3sl.q.a();
                this.a.putIfAbsent(num, aVar);
            }
            if (aVar.a == null || aVar.a.contains(t)) {
                return;
            }
            aVar.a.add(t);
        } catch (java.lang.Throwable unused) {
        }
    }

    public final <T> void b(java.lang.Integer num, T t) {
        java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3sl.q.a> concurrentHashMap;
        com.amap.api.col.3sl.q.a aVar;
        if (t == null || (concurrentHashMap = this.a) == null) {
            return;
        }
        try {
            if (!concurrentHashMap.containsKey(num) || (aVar = this.a.get(num)) == null || aVar.a == null || !aVar.a.contains(t)) {
                return;
            }
            aVar.a.remove(t);
        } catch (java.lang.Throwable unused) {
        }
    }

    public final <T> void a(java.lang.Integer num) {
        com.amap.api.col.3sl.q.a aVar;
        try {
            if (!this.a.containsKey(num) || (aVar = this.a.get(num)) == null || aVar.a == null) {
                return;
            }
            aVar.a.clear();
        } catch (java.lang.Throwable unused) {
        }
    }

    public final <T> java.util.List<T> a(int i) {
        try {
            com.amap.api.col.3sl.q.a aVar = this.a.get(java.lang.Integer.valueOf(i));
            if (aVar != null) {
                return aVar.a;
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final <T> void a(int i, T t) {
        java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3sl.q.a> concurrentHashMap = this.a;
        if (concurrentHashMap == null) {
            return;
        }
        try {
            com.amap.api.col.3sl.q.a aVar = concurrentHashMap.get(java.lang.Integer.valueOf(i));
            if (aVar == null) {
                aVar = new com.amap.api.col.3sl.q.a();
                this.a.putIfAbsent(java.lang.Integer.valueOf(i), aVar);
            }
            if (aVar.b == t) {
                return;
            }
            b(java.lang.Integer.valueOf(i), aVar.b);
            aVar.b = t;
            a(java.lang.Integer.valueOf(i), (java.lang.Integer) t);
        } catch (java.lang.Throwable unused) {
        }
    }

    public final <T> void a() {
        java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.amap.api.col.3sl.q.a> concurrentHashMap = this.a;
        if (concurrentHashMap == null) {
            return;
        }
        try {
            java.util.Iterator<java.util.Map.Entry<java.lang.Integer, com.amap.api.col.3sl.q.a>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                com.amap.api.col.3sl.q.a value = it.next().getValue();
                value.a.clear();
                value.b = null;
            }
            this.a.clear();
        } catch (java.lang.Throwable unused) {
        }
    }
}
