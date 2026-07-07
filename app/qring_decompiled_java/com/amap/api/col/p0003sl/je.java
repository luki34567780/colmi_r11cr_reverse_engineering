package com.amap.api.col.p0003sl;

/* compiled from: SPConfigUtil.java */
/* loaded from: classes.dex */
public final class je {
    private com.amap.api.col.p0003sl.iq a;

    /* compiled from: SPConfigUtil.java */
    static class a {
        public static java.util.Map<java.lang.String, com.amap.api.col.p0003sl.je> a = new java.util.HashMap();
    }

    public static com.amap.api.col.p0003sl.je a(com.amap.api.col.p0003sl.iq iqVar) {
        if (iqVar == null || android.text.TextUtils.isEmpty(iqVar.a())) {
            return null;
        }
        if (com.amap.api.col.3sl.je.a.a.get(iqVar.a()) == null) {
            com.amap.api.col.3sl.je.a.a.put(iqVar.a(), new com.amap.api.col.p0003sl.je(iqVar));
        }
        return com.amap.api.col.3sl.je.a.a.get(iqVar.a());
    }

    private je(com.amap.api.col.p0003sl.iq iqVar) {
        this.a = iqVar;
    }

    public final java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.amap.api.col.p0003sl.iq iqVar;
        if (context != null && (iqVar = this.a) != null && !android.text.TextUtils.isEmpty(iqVar.a())) {
            java.util.List<com.amap.api.col.3sl.je.b> a2 = com.amap.api.col.3sl.je.b.a(a(context, this.a.a(), str3));
            if (a2.size() == 0) {
                return "";
            }
            for (int i = 0; i < a2.size(); i++) {
                com.amap.api.col.3sl.je.b bVar = a2.get(i);
                if (bVar.a(str, str2)) {
                    return bVar.c;
                }
            }
        }
        return null;
    }

    public final void a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.amap.api.col.p0003sl.iq iqVar;
        if (context == null || (iqVar = this.a) == null || android.text.TextUtils.isEmpty(iqVar.a())) {
            return;
        }
        java.util.List<com.amap.api.col.3sl.je.b> a2 = com.amap.api.col.3sl.je.b.a(a(context, this.a.a(), str3));
        for (int i = 0; i < a2.size(); i++) {
            com.amap.api.col.3sl.je.b bVar = a2.get(i);
            if (bVar.a(str, str2)) {
                bVar.c = str4;
                b(context, this.a.a(), str3, com.amap.api.col.3sl.je.b.a(a2).toString());
                return;
            }
        }
        a2.add(new com.amap.api.col.3sl.je.b(str, str2, str4));
        b(context, this.a.a(), str3, com.amap.api.col.3sl.je.b.a(a2).toString());
    }

    private static void b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str3 == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        c(context, "C7ADB20F22F238708BA5EE26D0401DB9" + com.amap.api.col.p0003sl.im.b(str), "ik".concat(java.lang.String.valueOf(str2)), str3);
    }

    private static java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return b(context, "C7ADB20F22F238708BA5EE26D0401DB9" + com.amap.api.col.p0003sl.im.b(str), "ik".concat(java.lang.String.valueOf(str2)));
    }

    private static void c(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (context == null || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str3)) {
            return;
        }
        java.lang.String g = com.amap.api.col.p0003sl.ir.g(com.amap.api.col.p0003sl.ic.a(com.amap.api.col.p0003sl.ir.a(str3)));
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, g);
        edit.commit();
    }

    private static java.lang.String b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return (context == null || android.text.TextUtils.isEmpty(str2)) ? "" : com.amap.api.col.p0003sl.ir.a(com.amap.api.col.p0003sl.ic.b(com.amap.api.col.p0003sl.ir.d(context.getSharedPreferences(str, 0).getString(str2, ""))));
    }

    /* compiled from: SPConfigUtil.java */
    private static class b {
        private java.lang.String a;
        private java.lang.String b;
        private java.lang.String c;

        public b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean a(java.lang.String str, java.lang.String str2) {
            if (android.text.TextUtils.isEmpty(str)) {
                str = this.a;
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                str2 = this.b;
            }
            return this.a.equals(str) && this.b.equals(str2);
        }

        private org.json.JSONObject a() {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("sdkVersion", this.a);
                jSONObject.put("cpuType", this.b);
                jSONObject.put("content", this.c);
                return jSONObject;
            } catch (java.lang.Throwable unused) {
                return new org.json.JSONObject();
            }
        }

        public static org.json.JSONArray a(java.util.List<com.amap.api.col.3sl.je.b> list) {
            if (list == null) {
                return new org.json.JSONArray();
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator<com.amap.api.col.3sl.je.b> it = list.iterator();
            while (it.hasNext()) {
                com.amap.api.col.3sl.je.b next = it.next();
                if (next != null) {
                    if ((next == null || android.text.TextUtils.isEmpty(next.c)) ? false : true) {
                        jSONArray.put(next.a());
                    }
                }
            }
            return jSONArray;
        }

        private static com.amap.api.col.3sl.je.b a(org.json.JSONObject jSONObject) {
            try {
                return new com.amap.api.col.3sl.je.b(jSONObject.optString("sdkVersion"), jSONObject.optString("cpuType"), jSONObject.optString("content"));
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }

        public static java.util.List<com.amap.api.col.3sl.je.b> a(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                return new java.util.ArrayList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(a(jSONArray.getJSONObject(i)));
                }
                return arrayList;
            } catch (java.lang.Throwable unused) {
                return new java.util.ArrayList();
            }
        }
    }
}
