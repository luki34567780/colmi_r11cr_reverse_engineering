package com.amap.api.col.p0003sl;

/* compiled from: AutoTCommonParam.java */
/* loaded from: classes.dex */
public final class fa {
    private android.content.Context a;

    private static java.lang.String b() {
        return kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF;
    }

    private static java.lang.String c() {
        return "ANDA0605000";
    }

    private static java.lang.String d() {
        return "";
    }

    private static java.lang.String f() {
        return "9.7.0";
    }

    private static java.lang.String g() {
        return "";
    }

    private static java.lang.String i() {
        return "";
    }

    private static java.lang.String j() {
        return "";
    }

    private static java.lang.String k() {
        return "";
    }

    private static java.lang.String l() {
        return "";
    }

    private static java.lang.String m() {
        return "";
    }

    private static java.lang.String n() {
        return "";
    }

    private static java.lang.String o() {
        return "";
    }

    private static java.lang.String p() {
        return "ANDH070308";
    }

    private static java.lang.String q() {
        return "android";
    }

    private static java.lang.String r() {
        return "";
    }

    private static java.lang.String s() {
        return "";
    }

    public fa(android.content.Context context) {
        this.a = context.getApplicationContext();
    }

    private java.lang.String e() {
        return com.amap.api.col.p0003sl.ii.a(this.a);
    }

    private static java.lang.String h() {
        return com.amap.api.col.p0003sl.ii.k();
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        sb.append("personal_switch=");
        sb.append(b());
        sb.append("&autodiv=");
        sb.append(c());
        java.lang.String d = d();
        if (!android.text.TextUtils.isEmpty(d)) {
            sb.append("&tid=");
            sb.append(d);
        }
        java.lang.String e = e();
        if (!android.text.TextUtils.isEmpty(e)) {
            sb.append("&adiu=");
            sb.append(e);
        }
        java.lang.String f = f();
        if (!android.text.TextUtils.isEmpty(f)) {
            sb.append("&app_version=");
            sb.append(f);
        }
        java.lang.String g = g();
        if (!android.text.TextUtils.isEmpty(g)) {
            sb.append("&cifa=");
            sb.append(g);
        }
        java.lang.String h = h();
        if (!android.text.TextUtils.isEmpty(h)) {
            sb.append("&deviceid=");
            sb.append(h);
        }
        java.lang.String i = i();
        if (!android.text.TextUtils.isEmpty(i)) {
            sb.append("&did=");
            sb.append(i);
        }
        java.lang.String j = j();
        if (!android.text.TextUtils.isEmpty(j)) {
            sb.append("&didv=");
            sb.append(j);
        }
        java.lang.String k = k();
        if (!android.text.TextUtils.isEmpty(k)) {
            sb.append("&dic=");
            sb.append(k);
        }
        java.lang.String l = l();
        if (!android.text.TextUtils.isEmpty(l)) {
            sb.append("&dip=");
            sb.append(l);
        }
        java.lang.String m = m();
        if (!android.text.TextUtils.isEmpty(m)) {
            sb.append("&diu=");
            sb.append(m);
        }
        java.lang.String n = n();
        if (!android.text.TextUtils.isEmpty(n)) {
            sb.append("&diu2=");
            sb.append(n);
        }
        java.lang.String o = o();
        if (!android.text.TextUtils.isEmpty(o)) {
            sb.append("&diu3=");
            sb.append(o);
        }
        java.lang.String p = p();
        if (!android.text.TextUtils.isEmpty(p)) {
            sb.append("&div=");
            sb.append(p);
        }
        java.lang.String q = q();
        if (!android.text.TextUtils.isEmpty(q)) {
            sb.append("&os=");
            sb.append(q);
        }
        java.lang.String r = r();
        if (!android.text.TextUtils.isEmpty(r)) {
            sb.append("&stepid=");
            sb.append(r);
        }
        java.lang.String s = s();
        if (!android.text.TextUtils.isEmpty(s)) {
            sb.append("&session=");
            sb.append(s);
        }
        return sb.toString();
    }
}
