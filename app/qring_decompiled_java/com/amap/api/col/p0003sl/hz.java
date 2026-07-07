package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.TraceLocation;
import com.autonavi.base.amap.mapcore.AeUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TraceHandlerAbstract.java */
/* loaded from: classes.dex */
public final class hz extends hx<List<TraceLocation>, List<LatLng>> implements Runnable {
    private List<TraceLocation> f;
    private Handler g;
    private int h;
    private int i;
    private String j;

    @Override // com.amap.api.col.p0003sl.kz
    public final boolean isSupportIPV6() {
        return true;
    }

    @Override // com.amap.api.col.p0003sl.hx, com.amap.api.col.p0003sl.hw
    protected final /* synthetic */ Object a(String str) throws hv {
        return b(str);
    }

    public hz(Context context, Handler handler, List<TraceLocation> list, String str, int i, int i2) {
        super(context, list);
        this.g = null;
        this.h = 0;
        this.i = 0;
        this.f = list;
        this.g = handler;
        this.i = i;
        this.h = i2;
        this.j = str;
    }

    @Override // com.amap.api.col.p0003sl.hx, com.amap.api.col.p0003sl.hw
    protected final String c() {
        JSONArray jSONArray = new JSONArray();
        long j = 0;
        for (int i = 0; i < this.f.size(); i++) {
            TraceLocation traceLocation = this.f.get(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("x", traceLocation.getLongitude());
                jSONObject.put("y", traceLocation.getLatitude());
                jSONObject.put("ag", (int) traceLocation.getBearing());
                long time = traceLocation.getTime();
                if (i == 0) {
                    if (time == 0) {
                        time = (System.currentTimeMillis() - WorkRequest.MIN_BACKOFF_MILLIS) / 1000;
                    }
                    jSONObject.put("tm", time / 1000);
                } else {
                    if (time != 0) {
                        long j2 = time - j;
                        if (j2 >= 1000) {
                            jSONObject.put("tm", j2 / 1000);
                        }
                    }
                    jSONObject.put("tm", 1);
                }
                j = time;
                jSONObject.put("sp", (int) traceLocation.getSpeed());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            jSONArray.put(jSONObject);
        }
        this.d = getURL() + "&" + jSONArray.toString();
        return jSONArray.toString();
    }

    private static List<LatLng> b(String str) throws hv {
        JSONObject jSONObject;
        JSONArray optJSONArray;
        ArrayList arrayList = new ArrayList();
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (jSONObject.has(AeUtil.ROOT_DATA_PATH_OLD_NAME) && (optJSONArray = jSONObject.optJSONObject(AeUtil.ROOT_DATA_PATH_OLD_NAME).optJSONArray("points")) != null && optJSONArray.length() != 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                arrayList.add(new LatLng(Double.parseDouble(optJSONObject.optString("y")), Double.parseDouble(optJSONObject.optString("x"))));
            }
            return arrayList;
        }
        return arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new ArrayList();
        try {
            try {
                ib.a().a(this.j, this.h, d());
                ib.a().a(this.j).a(this.g);
            } catch (hv e) {
                ib.a();
                ib.a(this.g, this.i, e.a());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final String getURL() {
        String str = "key=" + ie.f(this.c);
        String a = ih.a();
        return "http://restsdk.amap.com/v4/grasproad/driving?" + str + "&ts=".concat(String.valueOf(a)) + "&scode=".concat(String.valueOf(ih.a(this.c, a, str)));
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final String getIPV6URL() {
        return dx.a(getURL());
    }
}
