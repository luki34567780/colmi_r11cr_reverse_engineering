package com.amap.api.col.p0003sl;

/* compiled from: PluginContext.java */
/* loaded from: classes.dex */
public final class ey extends android.view.ContextThemeWrapper {
    private static final java.lang.String[] d = {"android.widget", "android.webkit", "android.app"};
    private android.content.res.Resources a;
    private android.view.LayoutInflater b;
    private java.lang.ClassLoader c;
    private com.amap.api.col.3sl.ey.a e;
    private android.view.LayoutInflater.Factory f;

    public ey(android.content.Context context, int i, java.lang.ClassLoader classLoader) {
        super(context, i);
        this.e = new com.amap.api.col.3sl.ey.a();
        this.f = new android.view.LayoutInflater.Factory() { // from class: com.amap.api.col.3sl.ey.1
            @Override // android.view.LayoutInflater.Factory
            public final android.view.View onCreateView(java.lang.String str, android.content.Context context2, android.util.AttributeSet attributeSet) {
                return com.amap.api.col.p0003sl.ey.this.a(str, context2, attributeSet);
            }
        };
        this.a = com.amap.api.col.p0003sl.ez.a();
        this.c = classLoader;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
        android.content.res.Resources resources = this.a;
        return resources != null ? resources : super.getResources();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        if ("layout_inflater".equals(str)) {
            if (this.b == null) {
                android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) super.getSystemService(str);
                if (layoutInflater != null) {
                    this.b = layoutInflater.cloneInContext(this);
                }
                this.b.setFactory(this.f);
                this.b = this.b.cloneInContext(this);
            }
            return this.b;
        }
        return super.getSystemService(str);
    }

    /* compiled from: PluginContext.java */
    public class a {
        public java.util.HashSet<java.lang.String> a = new java.util.HashSet<>();
        public java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<?>> b = new java.util.HashMap<>();

        public a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a(java.lang.String r12, android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r11 = this;
            com.amap.api.col.3sl.ey$a r0 = r11.e
            java.util.HashSet<java.lang.String> r0 = r0.a
            boolean r0 = r0.contains(r12)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            com.amap.api.col.3sl.ey$a r0 = r11.e
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<?>> r0 = r0.b
            java.lang.Object r0 = r0.get(r12)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L86
            java.lang.String r5 = "api.navi"
            boolean r5 = r12.contains(r5)     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L2a
            java.lang.ClassLoader r5 = r11.c     // Catch: java.lang.Throwable -> L63
            java.lang.Class r5 = r5.loadClass(r12)     // Catch: java.lang.Throwable -> L63
            goto L51
        L2a:
            java.lang.String[] r5 = com.amap.api.col.p0003sl.ey.d     // Catch: java.lang.Throwable -> L63
            int r6 = r5.length     // Catch: java.lang.Throwable -> L63
            r7 = 0
        L2e:
            if (r7 >= r6) goto L50
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L63
            java.lang.ClassLoader r9 = r11.c     // Catch: java.lang.Throwable -> L4d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r10.<init>()     // Catch: java.lang.Throwable -> L4d
            r10.append(r8)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r8 = "."
            r10.append(r8)     // Catch: java.lang.Throwable -> L4d
            r10.append(r12)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L4d
            java.lang.Class r5 = r9.loadClass(r8)     // Catch: java.lang.Throwable -> L4d
            goto L51
        L4d:
            int r7 = r7 + 1
            goto L2e
        L50:
            r5 = r1
        L51:
            if (r5 != 0) goto L54
            goto L64
        L54:
            java.lang.Class<android.view.ViewStub> r6 = android.view.ViewStub.class
            if (r5 == r6) goto L64
            java.lang.ClassLoader r6 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L64
            java.lang.ClassLoader r7 = r11.c     // Catch: java.lang.Throwable -> L64
            if (r6 == r7) goto L61
            goto L64
        L61:
            r6 = 1
            goto L65
        L63:
            r5 = r1
        L64:
            r6 = 0
        L65:
            if (r6 != 0) goto L6f
            com.amap.api.col.3sl.ey$a r13 = r11.e
            java.util.HashSet<java.lang.String> r13 = r13.a
            r13.add(r12)
            return r1
        L6f:
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L85
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r4] = r7     // Catch: java.lang.Throwable -> L85
            java.lang.Class<android.util.AttributeSet> r7 = android.util.AttributeSet.class
            r6[r3] = r7     // Catch: java.lang.Throwable -> L85
            java.lang.reflect.Constructor r0 = r5.getConstructor(r6)     // Catch: java.lang.Throwable -> L85
            com.amap.api.col.3sl.ey$a r5 = r11.e     // Catch: java.lang.Throwable -> L85
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<?>> r5 = r5.b     // Catch: java.lang.Throwable -> L85
            r5.put(r12, r0)     // Catch: java.lang.Throwable -> L85
            goto L86
        L85:
        L86:
            if (r0 == 0) goto L96
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L96
            r12[r4] = r13     // Catch: java.lang.Throwable -> L96
            r12[r3] = r14     // Catch: java.lang.Throwable -> L96
            java.lang.Object r12 = r0.newInstance(r12)     // Catch: java.lang.Throwable -> L96
            android.view.View r12 = (android.view.View) r12     // Catch: java.lang.Throwable -> L96
            r1 = r12
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.ey.a(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }
}
