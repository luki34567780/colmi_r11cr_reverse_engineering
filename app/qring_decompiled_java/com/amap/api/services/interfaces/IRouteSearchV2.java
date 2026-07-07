package com.amap.api.services.interfaces;

/* loaded from: classes.dex */
public interface IRouteSearchV2 {
    com.amap.api.services.route.BusRouteResultV2 calculateBusRoute(com.amap.api.services.route.RouteSearchV2.BusRouteQuery busRouteQuery) throws com.amap.api.services.core.AMapException;

    void calculateBusRouteAsyn(com.amap.api.services.route.RouteSearchV2.BusRouteQuery busRouteQuery);

    com.amap.api.services.route.DriveRouteResultV2 calculateDriveRoute(com.amap.api.services.route.RouteSearchV2.DriveRouteQuery driveRouteQuery) throws com.amap.api.services.core.AMapException;

    void calculateDriveRouteAsyn(com.amap.api.services.route.RouteSearchV2.DriveRouteQuery driveRouteQuery);

    com.amap.api.services.route.RideRouteResultV2 calculateRideRoute(com.amap.api.services.route.RouteSearchV2.RideRouteQuery rideRouteQuery) throws com.amap.api.services.core.AMapException;

    void calculateRideRouteAsyn(com.amap.api.services.route.RouteSearchV2.RideRouteQuery rideRouteQuery);

    com.amap.api.services.route.WalkRouteResultV2 calculateWalkRoute(com.amap.api.services.route.RouteSearchV2.WalkRouteQuery walkRouteQuery) throws com.amap.api.services.core.AMapException;

    void calculateWalkRouteAsyn(com.amap.api.services.route.RouteSearchV2.WalkRouteQuery walkRouteQuery);

    void setRouteSearchListener(com.amap.api.services.route.RouteSearchV2.OnRouteSearchListener onRouteSearchListener);
}
