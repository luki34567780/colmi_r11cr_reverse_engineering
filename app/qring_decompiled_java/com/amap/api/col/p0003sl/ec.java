package com.amap.api.col.p0003sl;

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: OverlayerStrategy.java */
/* loaded from: classes.dex */
public final class ec implements ea {
    private static Map<String, a> a = new ConcurrentHashMap();

    /* compiled from: OverlayerStrategy.java */
    class a {
        String a;
        String b;
        int c;
        final AtomicInteger d = new AtomicInteger(0);

        public a(int i, String str, String str2) {
            this.a = "";
            this.b = "";
            this.a = str;
            this.b = str2;
            this.c = i;
        }

        public final int a() {
            return this.d.incrementAndGet();
        }
    }

    private static String b(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        if (str == null) {
            str = "";
        }
        sb.append(str);
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.amap.api.col.p0003sl.ea
    public final void a(int i, String str, String str2) {
        try {
            String b = b(i, str, str2);
            a aVar = a.get(b);
            if (aVar == null) {
                aVar = new a(i, str, str2);
                a.put(b, aVar);
            }
            if (aVar.a() > 100) {
                a(aVar.c, aVar.a, aVar.b, aVar.d.get());
                a.remove(b);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.col.p0003sl.ea
    public final void a() {
        try {
            Iterator<Map.Entry<String, a>> it = a.entrySet().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                if (value != null) {
                    a(value.c, value.a, value.b, value.d.get());
                }
            }
            a.clear();
            jb.a(dx.a()).a();
        } catch (Throwable unused) {
        }
    }

    private static void a(int i, String str, String str2, int i2) {
        if (i == 0) {
            jb.a(dx.a()).a(ja.a(str, str2 + " counter " + i2));
        } else {
            jb.a(dx.a()).a(ja.a(str, str2 + " counter " + i2));
        }
        if (dy.b) {
            c(i, str, str2 + " counter " + i2);
        }
    }

    private static void c(int i, String str, String str2) {
        if (i == 0) {
            Log.i("linklog", str + " " + str2);
            return;
        }
        Log.e("linklog", str + " " + str2);
    }
}
