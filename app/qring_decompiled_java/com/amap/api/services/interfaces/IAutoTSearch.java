package com.amap.api.services.interfaces;

/* loaded from: classes.dex */
public interface IAutoTSearch {
    com.amap.api.services.auto.AutoTChargeStationResult searchChargeStation() throws com.amap.api.services.core.AMapException;

    void searchChargeStationAsync() throws com.amap.api.services.core.AMapException;

    void setChargeStationListener(com.amap.api.services.auto.AutoTSearch.OnChargeStationListener onChargeStationListener);

    void setQuery(com.amap.api.services.auto.AutoTSearch.Query query);
}
