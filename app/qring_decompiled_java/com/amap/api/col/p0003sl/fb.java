package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.auto.AutoTChargeStationResult;
import com.amap.api.services.auto.AutoTSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: AutoTPoiSearchHandler.java */
/* loaded from: classes.dex */
public final class fb extends ff<AutoTSearch.Query, AutoTChargeStationResult> {
    private fa g;

    @Override // com.amap.api.col.p0003sl.ff, com.amap.api.col.p0003sl.fe
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public fb(Context context, AutoTSearch.Query query) {
        super(context, query);
        this.g = null;
        this.g = new fa(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.ff, com.amap.api.col.p0003sl.fe
    protected final String c() {
        StringBuilder sb = new StringBuilder(this.g.a());
        String adCode = ((AutoTSearch.Query) this.b).getAdCode();
        if (!TextUtils.isEmpty(adCode)) {
            sb.append("&adcode=");
            sb.append(b(adCode));
        }
        String city = ((AutoTSearch.Query) this.b).getCity();
        if (!TextUtils.isEmpty(city)) {
            sb.append("&city=");
            sb.append(b(city));
        }
        String dataType = ((AutoTSearch.Query) this.b).getDataType();
        if (!TextUtils.isEmpty(dataType)) {
            sb.append("&data_type=");
            sb.append(b(dataType));
        }
        String geoObj = ((AutoTSearch.Query) this.b).getGeoObj();
        if (!TextUtils.isEmpty(geoObj)) {
            sb.append("&geoobj=");
            sb.append(b(geoObj));
        }
        String keywords = ((AutoTSearch.Query) this.b).getKeywords();
        if (!TextUtils.isEmpty(keywords)) {
            sb.append("&keywords=");
            sb.append(b(keywords));
        }
        sb.append("&pagenum=");
        sb.append(((AutoTSearch.Query) this.b).getPageNum());
        sb.append("&pagesize=");
        sb.append(((AutoTSearch.Query) this.b).getPageSize());
        sb.append("&qii=");
        sb.append(((AutoTSearch.Query) this.b).isQii());
        String queryType = ((AutoTSearch.Query) this.b).getQueryType();
        if (!TextUtils.isEmpty(queryType)) {
            sb.append("&query_type=");
            sb.append(b(queryType));
        }
        sb.append("&range=");
        sb.append(((AutoTSearch.Query) this.b).getRange());
        LatLonPoint latLonPoint = ((AutoTSearch.Query) this.b).getLatLonPoint();
        if (latLonPoint != null) {
            sb.append("&longitude=");
            sb.append(latLonPoint.getLongitude());
            sb.append("&latitude=");
            sb.append(latLonPoint.getLatitude());
        }
        String userLoc = ((AutoTSearch.Query) this.b).getUserLoc();
        if (!TextUtils.isEmpty(userLoc)) {
            sb.append("&user_loc=");
            sb.append(b(userLoc));
        }
        String userCity = ((AutoTSearch.Query) this.b).getUserCity();
        if (!TextUtils.isEmpty(userCity)) {
            sb.append("&user_city=");
            sb.append(b(userCity));
        }
        AutoTSearch.FilterBox filterBox = ((AutoTSearch.Query) this.b).getFilterBox();
        if (filterBox != null) {
            String retainState = filterBox.getRetainState();
            if (!TextUtils.isEmpty(retainState)) {
                sb.append("&retain_state=");
                sb.append(b(retainState));
            }
            String checkedLevel = filterBox.getCheckedLevel();
            if (!TextUtils.isEmpty(checkedLevel)) {
                sb.append("&checked_level=");
                sb.append(b(checkedLevel));
            }
            String classifyV2Data = filterBox.getClassifyV2Data();
            if (!TextUtils.isEmpty(classifyV2Data)) {
                sb.append("&classify_v2_data=");
                sb.append(b(classifyV2Data));
            }
            String classifyV2Level2Data = filterBox.getClassifyV2Level2Data();
            if (!TextUtils.isEmpty(classifyV2Level2Data)) {
                sb.append("&classify_v2_level2_data=");
                sb.append(b(classifyV2Level2Data));
            }
            String classifyV2Level3Data = filterBox.getClassifyV2Level3Data();
            if (!TextUtils.isEmpty(classifyV2Level3Data)) {
                sb.append("&classify_v2_level3_data=");
                sb.append(b(classifyV2Level3Data));
            }
        }
        return sb.toString();
    }

    private static AutoTChargeStationResult c(String str) throws AMapException {
        try {
            return fc.a(new JSONObject(str));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.kz
    public final String getURL() {
        try {
            String a = fd.a(new HashMap(), ((AutoTSearch.Query) this.b).getAccessKey());
            return fm.f() + "/ws/mapapi/poi/infolite/auto?" + a + "&Signature=" + fd.a("POST", a, ((AutoTSearch.Query) this.b).getSecretKey());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
