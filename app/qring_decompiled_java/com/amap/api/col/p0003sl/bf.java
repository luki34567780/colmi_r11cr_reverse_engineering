package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.col.p0003sl.Cif;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OfflineUpdateCityHandlerAbstract.java */
/* loaded from: classes.dex */
public final class bf extends bw<String, List<OfflineMapProvince>> {
    private Context d;

    public bf(Context context, String str) {
        super(context, str);
    }

    public final void a(Context context) {
        this.d = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.amap.api.col.p0003sl.bw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<OfflineMapProvince> a(JSONObject jSONObject) throws AMapException {
        try {
            if (this.d != null) {
                bv.c(jSONObject.toString(), this.d);
            }
        } catch (Throwable th) {
            ju.c(th, "OfflineUpdateCityHandlerAbstract", "loadData jsonInit");
            th.printStackTrace();
        }
        try {
            Context context = this.d;
            if (context != null) {
                return bv.a(jSONObject, context);
            }
            return null;
        } catch (JSONException e) {
            ju.c(e, "OfflineUpdateCityHandlerAbstract", "loadData parseJson");
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.bw
    protected final JSONObject a(Cif.b bVar) {
        if (bVar == null || bVar.f == null) {
            return null;
        }
        JSONObject optJSONObject = bVar.f.optJSONObject("015");
        if (!optJSONObject.has("result")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("result", new JSONObject().put("offlinemap_with_province_vfour", optJSONObject));
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return optJSONObject;
    }

    @Override // com.amap.api.col.p0003sl.bw
    protected final String a() {
        return "015";
    }

    @Override // com.amap.api.col.p0003sl.bw
    protected final Map<String, String> b() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("mapver", this.a);
        return hashtable;
    }
}
