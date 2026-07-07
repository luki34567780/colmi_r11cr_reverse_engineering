package com.autonavi.aps.amapapi.restruct;

/* compiled from: HistoryLocationRecorder.java */
/* loaded from: classes.dex */
public final class g {
    private java.io.File b;
    private android.os.Handler d;
    private java.lang.String e;
    private boolean f;
    private java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> a = new java.util.LinkedList<>();
    private boolean c = false;
    private java.lang.Runnable g = new java.lang.Runnable() { // from class: com.autonavi.aps.amapapi.restruct.g.1
        @Override // java.lang.Runnable
        public final void run() {
            if (com.autonavi.aps.amapapi.restruct.g.this.c) {
                return;
            }
            if (com.autonavi.aps.amapapi.restruct.g.this.f) {
                com.autonavi.aps.amapapi.restruct.g.this.b();
                com.autonavi.aps.amapapi.restruct.g.d(com.autonavi.aps.amapapi.restruct.g.this);
            }
            if (com.autonavi.aps.amapapi.restruct.g.this.d != null) {
                com.autonavi.aps.amapapi.restruct.g.this.d.postDelayed(com.autonavi.aps.amapapi.restruct.g.this.g, 60000L);
            }
        }
    };

    static /* synthetic */ boolean d(com.autonavi.aps.amapapi.restruct.g gVar) {
        gVar.f = false;
        return false;
    }

    public g(android.content.Context context, android.os.Handler handler) {
        this.e = null;
        this.d = handler;
        java.lang.String path = context.getFilesDir().getPath();
        if (this.e == null) {
            this.e = com.autonavi.aps.amapapi.utils.j.l(context);
        }
        try {
            this.b = new java.io.File(path, "hisloc");
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.nr.a(th);
        }
        a();
        android.os.Handler handler2 = this.d;
        if (handler2 != null) {
            handler2.removeCallbacks(this.g);
            this.d.postDelayed(this.g, 60000L);
        }
    }

    public final void a(boolean z) {
        if (!z) {
            this.g.run();
        }
        android.os.Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacks(this.g);
        }
        this.c = true;
    }

    public final void a(com.autonavi.aps.amapapi.restruct.f fVar) {
        java.util.Iterator<com.autonavi.aps.amapapi.restruct.f> it = this.a.iterator();
        com.autonavi.aps.amapapi.restruct.f fVar2 = null;
        com.autonavi.aps.amapapi.restruct.f fVar3 = null;
        int i = 0;
        while (it.hasNext()) {
            com.autonavi.aps.amapapi.restruct.f next = it.next();
            if (next.a == 1) {
                if (fVar3 == null) {
                    fVar3 = next;
                }
                i++;
                fVar2 = next;
            }
        }
        if (fVar2 != null) {
            new android.location.Location(com.amap.api.services.geocoder.GeocodeSearch.GPS);
            if (fVar.d - fVar2.d < 20000 && com.autonavi.aps.amapapi.utils.j.a(new double[]{fVar.b, fVar.c, fVar2.b, fVar2.c}) < 20.0f) {
                return;
            }
        }
        if (i >= 5) {
            this.a.remove(fVar3);
        }
        if (this.a.size() >= 10) {
            this.a.removeFirst();
        }
        this.a.add(fVar);
        this.f = true;
    }

    public final void b(com.autonavi.aps.amapapi.restruct.f fVar) {
        if (this.a.size() > 0) {
            if (fVar.a == 6 || fVar.a == 5) {
                com.autonavi.aps.amapapi.restruct.f last = this.a.getLast();
                if (last.c == fVar.c && last.b == fVar.b && last.e == fVar.e) {
                    return;
                }
                if (this.a.size() >= 10) {
                    this.a.removeFirst();
                }
                this.a.add(fVar);
                this.f = true;
                return;
            }
            if (this.a.contains(fVar)) {
                return;
            }
            if (this.a.size() >= 10) {
                this.a.removeFirst();
            }
            this.a.add(fVar);
            this.f = true;
        }
    }

    public final java.util.List<com.autonavi.aps.amapapi.restruct.f> a(java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> arrayList, java.util.ArrayList<com.amap.api.col.p0003sl.no> arrayList2) {
        if (!b(arrayList, arrayList2)) {
            return null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int i = 0;
        java.util.Iterator<com.autonavi.aps.amapapi.restruct.f> it = this.a.iterator();
        while (it.hasNext()) {
            com.autonavi.aps.amapapi.restruct.f next = it.next();
            if (currentTimeMillis - next.d < 21600000000L) {
                arrayList3.add(next);
                i++;
            }
            if (i == 10) {
                break;
            }
        }
        return arrayList3;
    }

    private static boolean b(java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> arrayList, java.util.ArrayList<com.amap.api.col.p0003sl.no> arrayList2) {
        return arrayList == null || arrayList.size() <= 0 || arrayList2 == null || arrayList2.size() <= 0 || (((long) arrayList.size()) < 4 && ((long) arrayList2.size()) < 20);
    }

    private void a() {
        java.util.LinkedList<com.autonavi.aps.amapapi.restruct.f> linkedList = this.a;
        if (linkedList == null || linkedList.size() <= 0) {
            java.util.Iterator<java.lang.String> it = com.autonavi.aps.amapapi.utils.j.a(this.b).iterator();
            while (it.hasNext()) {
                try {
                    java.lang.String str = new java.lang.String(com.autonavi.aps.amapapi.security.a.b(com.amap.api.col.p0003sl.ij.b(it.next()), this.e), com.bumptech.glide.load.Key.STRING_CHARSET_NAME);
                    com.autonavi.aps.amapapi.restruct.f fVar = new com.autonavi.aps.amapapi.restruct.f();
                    fVar.a(new org.json.JSONObject(str));
                    this.a.add(fVar);
                } catch (java.io.UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (org.json.JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<com.autonavi.aps.amapapi.restruct.f> it = this.a.iterator();
        while (it.hasNext()) {
            try {
                sb.append(com.amap.api.col.p0003sl.ij.b(com.autonavi.aps.amapapi.security.a.a(it.next().a().getBytes(com.bumptech.glide.load.Key.STRING_CHARSET_NAME), this.e)) + "\n");
            } catch (java.io.UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        java.lang.String sb2 = sb.toString();
        if (android.text.TextUtils.isEmpty(sb2)) {
            return;
        }
        com.autonavi.aps.amapapi.utils.j.a(this.b, sb2);
    }
}
