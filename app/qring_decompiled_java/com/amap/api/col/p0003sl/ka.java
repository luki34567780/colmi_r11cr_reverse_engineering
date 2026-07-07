package com.amap.api.col.p0003sl;

/* compiled from: SDKSPUtil.java */
/* loaded from: classes.dex */
public final class ka {
    private com.amap.api.col.p0003sl.iq a;

    public ka(java.lang.String str) {
        this.a = null;
        try {
            this.a = new com.amap.api.col.3sl.iq.a(str, "1.0", "1.0.0").a(new java.lang.String[]{"info"}).a();
        } catch (com.amap.api.col.p0003sl.id unused) {
        }
    }

    public final void a(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar) {
        org.json.JSONArray jSONArray;
        if (iqVar == null) {
            return;
        }
        java.util.ArrayList<com.amap.api.col.p0003sl.iq> arrayList = new java.util.ArrayList();
        arrayList.add(iqVar);
        if (arrayList.size() == 0) {
            jSONArray = new org.json.JSONArray();
        } else {
            jSONArray = new org.json.JSONArray();
            for (com.amap.api.col.p0003sl.iq iqVar2 : arrayList) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("a", iqVar2.a());
                    jSONObject.put("b", iqVar2.b());
                    jSONObject.put("c", iqVar2.c());
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    for (int i = 0; iqVar2.f() != null && i < iqVar2.f().length; i++) {
                        jSONArray2.put(iqVar2.f()[i]);
                    }
                    jSONObject.put("d", jSONArray2);
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                }
                jSONArray.put(jSONObject);
            }
        }
        java.lang.String jSONArray3 = jSONArray.toString();
        if (android.text.TextUtils.isEmpty(jSONArray3)) {
            return;
        }
        com.amap.api.col.p0003sl.jz.a(context, this.a, "rbck", jSONArray3);
    }

    public final java.util.List<com.amap.api.col.p0003sl.iq> a(android.content.Context context) {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(com.amap.api.col.p0003sl.jz.a(context, this.a, "rbck"));
            if (jSONArray.length() == 0) {
                return new java.util.ArrayList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                com.amap.api.col.p0003sl.iq iqVar = null;
                try {
                    iqVar = a(jSONArray.getJSONObject(i));
                } catch (org.json.JSONException unused) {
                }
                if (iqVar != null) {
                    arrayList.add(iqVar);
                }
            }
            return arrayList;
        } catch (org.json.JSONException unused2) {
            return new java.util.ArrayList();
        }
    }

    private static com.amap.api.col.p0003sl.iq a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            java.lang.String optString = jSONObject.optString("a");
            java.lang.String optString2 = jSONObject.optString("b");
            java.lang.String optString3 = jSONObject.optString("c");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("d");
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
            return new com.amap.api.col.3sl.iq.a(optString, optString2, optString).a(optString3).a((java.lang.String[]) arrayList.toArray(new java.lang.String[0])).a();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
