package com.amap.api.services.route;

/* loaded from: classes.dex */
public class RouteSearchV2 {
    private com.amap.api.services.interfaces.IRouteSearchV2 a;

    public static class BusMode {
        public static final int BUS_COMFORTABLE = 4;
        public static final int BUS_DEFAULT = 0;
        public static final int BUS_LEASE_CHANGE = 2;
        public static final int BUS_LEASE_WALK = 3;
        public static final int BUS_NO_SUBWAY = 5;
        public static final int BUS_SAVE_MONEY = 1;
        public static final int BUS_SUBWAY = 6;
        public static final int BUS_SUBWAY_FIRST = 7;
        public static final int BUS_WASTE_LESS = 8;
    }

    public interface OnRoutePlanSearchListener {
        void onDriveRoutePlanSearched(com.amap.api.services.route.DriveRoutePlanResult driveRoutePlanResult, int i);
    }

    public interface OnRouteSearchListener {
        void onBusRouteSearched(com.amap.api.services.route.BusRouteResultV2 busRouteResultV2, int i);

        void onDriveRouteSearched(com.amap.api.services.route.DriveRouteResultV2 driveRouteResultV2, int i);

        void onRideRouteSearched(com.amap.api.services.route.RideRouteResultV2 rideRouteResultV2, int i);

        void onWalkRouteSearched(com.amap.api.services.route.WalkRouteResultV2 walkRouteResultV2, int i);
    }

    public interface OnTruckRouteSearchListener {
        void onTruckRouteSearched(com.amap.api.services.route.TruckRouteRestult truckRouteRestult, int i);
    }

    public static class ShowFields {
        public static final int ALL = -1;
        public static final int CHARGE_STATION_INFO = 64;
        public static final int CITIES = 8;
        public static final int COST = 1;
        public static final int ELEC_COSUME_INFO = 32;
        public static final int NAVI = 4;
        public static final int POLINE = 16;
        public static final int TMCS = 2;
    }

    public enum DrivingStrategy {
        DEFAULT(32),
        AVOID_CONGESTION(33),
        HIGHWAY_PRIORITY(34),
        AVOID_HIGHWAY(35),
        LESS_CHARGE(36),
        ROAD_PRIORITY(37),
        SPEED_PRIORITY(38),
        AVOID_CONGESTION_HIGHWAY_PRIORITY(39),
        AVOID_CONGESTION_AVOID_HIGHWAY(40),
        AVOID_CONGESTION_LESS_CHARGE(41),
        LESS_CHARGE_AVOID_HIGHWAY(42),
        AVOID_CONGESTION_LESS_CHARGE_AVOID_HIGHWAY(43),
        AVOID_CONGESTION_ROAD_PRIORITY(44),
        AVOID_CONGESTION_SPEED_PRIORITY(45);

        int a;

        DrivingStrategy(int i) {
            this.a = i;
        }

        public final int getValue() {
            return this.a;
        }

        public static com.amap.api.services.route.RouteSearchV2.DrivingStrategy fromValue(int i) {
            return values()[i - 32];
        }
    }

    public RouteSearchV2(android.content.Context context) throws com.amap.api.services.core.AMapException {
        if (this.a == null) {
            try {
                this.a = new com.amap.api.col.p0003sl.hs(context);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                if (e instanceof com.amap.api.services.core.AMapException) {
                    throw ((com.amap.api.services.core.AMapException) e);
                }
            }
        }
    }

    public void setRouteSearchListener(com.amap.api.services.route.RouteSearchV2.OnRouteSearchListener onRouteSearchListener) {
        com.amap.api.services.interfaces.IRouteSearchV2 iRouteSearchV2 = this.a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.setRouteSearchListener(onRouteSearchListener);
        }
    }

    public com.amap.api.services.route.DriveRouteResultV2 calculateDriveRoute(com.amap.api.services.route.RouteSearchV2.DriveRouteQuery driveRouteQuery) throws com.amap.api.services.core.AMapException {
        com.amap.api.services.interfaces.IRouteSearchV2 iRouteSearchV2 = this.a;
        if (iRouteSearchV2 != null) {
            return iRouteSearchV2.calculateDriveRoute(driveRouteQuery);
        }
        return null;
    }

    public void calculateDriveRouteAsyn(com.amap.api.services.route.RouteSearchV2.DriveRouteQuery driveRouteQuery) {
        com.amap.api.services.interfaces.IRouteSearchV2 iRouteSearchV2 = this.a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.calculateDriveRouteAsyn(driveRouteQuery);
        }
    }

    public com.amap.api.services.route.WalkRouteResultV2 calculateWalkRoute(com.amap.api.services.route.RouteSearchV2.WalkRouteQuery walkRouteQuery) throws com.amap.api.services.core.AMapException {
        com.amap.api.services.interfaces.IRouteSearchV2 iRouteSearchV2 = this.a;
        if (iRouteSearchV2 != null) {
            return iRouteSearchV2.calculateWalkRoute(walkRouteQuery);
        }
        return null;
    }

    public void calculateWalkRouteAsyn(com.amap.api.services.route.RouteSearchV2.WalkRouteQuery walkRouteQuery) {
        com.amap.api.services.interfaces.IRouteSearchV2 iRouteSearchV2 = this.a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.calculateWalkRouteAsyn(walkRouteQuery);
        }
    }

    public void calculateRideRouteAsyn(com.amap.api.services.route.RouteSearchV2.RideRouteQuery rideRouteQuery) {
        com.amap.api.services.interfaces.IRouteSearchV2 iRouteSearchV2 = this.a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.calculateRideRouteAsyn(rideRouteQuery);
        }
    }

    public com.amap.api.services.route.RideRouteResultV2 calculateRideRoute(com.amap.api.services.route.RouteSearchV2.RideRouteQuery rideRouteQuery) throws com.amap.api.services.core.AMapException {
        com.amap.api.services.interfaces.IRouteSearchV2 iRouteSearchV2 = this.a;
        if (iRouteSearchV2 != null) {
            return iRouteSearchV2.calculateRideRoute(rideRouteQuery);
        }
        return null;
    }

    public com.amap.api.services.route.BusRouteResultV2 calculateBusRoute(com.amap.api.services.route.RouteSearchV2.BusRouteQuery busRouteQuery) throws com.amap.api.services.core.AMapException {
        com.amap.api.services.interfaces.IRouteSearchV2 iRouteSearchV2 = this.a;
        if (iRouteSearchV2 != null) {
            return iRouteSearchV2.calculateBusRoute(busRouteQuery);
        }
        return null;
    }

    public void calculateBusRouteAsyn(com.amap.api.services.route.RouteSearchV2.BusRouteQuery busRouteQuery) {
        com.amap.api.services.interfaces.IRouteSearchV2 iRouteSearchV2 = this.a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.calculateBusRouteAsyn(busRouteQuery);
        }
    }

    public static class FromAndTo implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.FromAndTo> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.FromAndTo>() { // from class: com.amap.api.services.route.RouteSearchV2.FromAndTo.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.route.RouteSearchV2.FromAndTo createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.route.RouteSearchV2.FromAndTo[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.route.RouteSearchV2.FromAndTo a(android.os.Parcel parcel) {
                return new com.amap.api.services.route.RouteSearchV2.FromAndTo(parcel);
            }

            private static com.amap.api.services.route.RouteSearchV2.FromAndTo[] a(int i) {
                return new com.amap.api.services.route.RouteSearchV2.FromAndTo[i];
            }
        };
        private com.amap.api.services.core.LatLonPoint a;
        private com.amap.api.services.core.LatLonPoint b;
        private java.lang.String c;
        private java.lang.String d;
        private java.lang.String e;
        private java.lang.String f;
        private java.lang.String g;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public FromAndTo(com.amap.api.services.core.LatLonPoint latLonPoint, com.amap.api.services.core.LatLonPoint latLonPoint2) {
            this.a = latLonPoint;
            this.b = latLonPoint2;
        }

        public com.amap.api.services.core.LatLonPoint getFrom() {
            return this.a;
        }

        public com.amap.api.services.core.LatLonPoint getTo() {
            return this.b;
        }

        public java.lang.String getStartPoiID() {
            return this.c;
        }

        public void setStartPoiID(java.lang.String str) {
            this.c = str;
        }

        public java.lang.String getDestinationPoiID() {
            return this.d;
        }

        public void setDestinationPoiID(java.lang.String str) {
            this.d = str;
        }

        public java.lang.String getOriginType() {
            return this.e;
        }

        public void setOriginType(java.lang.String str) {
            this.e = str;
        }

        public java.lang.String getDestinationType() {
            return this.f;
        }

        public void setDestinationType(java.lang.String str) {
            this.f = str;
        }

        public java.lang.String getPlateNumber() {
            return this.g;
        }

        public void setPlateNumber(java.lang.String str) {
            this.g = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        }

        public FromAndTo(android.os.Parcel parcel) {
            this.a = (com.amap.api.services.core.LatLonPoint) parcel.readParcelable(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
            this.b = (com.amap.api.services.core.LatLonPoint) parcel.readParcelable(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
        }

        public FromAndTo() {
        }

        public int hashCode() {
            java.lang.String str = this.d;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            com.amap.api.services.core.LatLonPoint latLonPoint = this.a;
            int hashCode2 = (hashCode + (latLonPoint == null ? 0 : latLonPoint.hashCode())) * 31;
            java.lang.String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            com.amap.api.services.core.LatLonPoint latLonPoint2 = this.b;
            int hashCode4 = (hashCode3 + (latLonPoint2 == null ? 0 : latLonPoint2.hashCode())) * 31;
            java.lang.String str3 = this.e;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.String str4 = this.f;
            return hashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.amap.api.services.route.RouteSearchV2.FromAndTo fromAndTo = (com.amap.api.services.route.RouteSearchV2.FromAndTo) obj;
            java.lang.String str = this.d;
            if (str == null) {
                if (fromAndTo.d != null) {
                    return false;
                }
            } else if (!str.equals(fromAndTo.d)) {
                return false;
            }
            com.amap.api.services.core.LatLonPoint latLonPoint = this.a;
            if (latLonPoint == null) {
                if (fromAndTo.a != null) {
                    return false;
                }
            } else if (!latLonPoint.equals(fromAndTo.a)) {
                return false;
            }
            java.lang.String str2 = this.c;
            if (str2 == null) {
                if (fromAndTo.c != null) {
                    return false;
                }
            } else if (!str2.equals(fromAndTo.c)) {
                return false;
            }
            com.amap.api.services.core.LatLonPoint latLonPoint2 = this.b;
            if (latLonPoint2 == null) {
                if (fromAndTo.b != null) {
                    return false;
                }
            } else if (!latLonPoint2.equals(fromAndTo.b)) {
                return false;
            }
            java.lang.String str3 = this.e;
            if (str3 == null) {
                if (fromAndTo.e != null) {
                    return false;
                }
            } else if (!str3.equals(fromAndTo.e)) {
                return false;
            }
            java.lang.String str4 = this.f;
            if (str4 == null) {
                if (fromAndTo.f != null) {
                    return false;
                }
            } else if (!str4.equals(fromAndTo.f)) {
                return false;
            }
            return true;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.amap.api.services.route.RouteSearchV2.FromAndTo m216clone() {
            try {
                super.clone();
            } catch (java.lang.CloneNotSupportedException e) {
                com.amap.api.col.p0003sl.fn.a(e, "RouteSearchV2", "FromAndToclone");
            }
            com.amap.api.services.route.RouteSearchV2.FromAndTo fromAndTo = new com.amap.api.services.route.RouteSearchV2.FromAndTo(this.a, this.b);
            fromAndTo.setStartPoiID(this.c);
            fromAndTo.setDestinationPoiID(this.d);
            fromAndTo.setOriginType(this.e);
            fromAndTo.setDestinationType(this.f);
            return fromAndTo;
        }
    }

    public static class SpeedCost {
        private int a;
        private float b;

        public int getSpeed() {
            return this.a;
        }

        public void setSpeed(int i) {
            this.a = i;
        }

        public float getValue() {
            return this.b;
        }

        public void setValue(float f) {
            this.b = f;
        }
    }

    public static class CurveCost {
        private float a;
        private float b;

        public float getAccess() {
            return this.a;
        }

        public void setAccess(float f) {
            this.a = f;
        }

        public float getValue() {
            return this.b;
        }

        public void setValue(float f) {
            this.b = f;
        }
    }

    public static class SlopeCost {
        private float a;
        private float b;

        public float getUp() {
            return this.a;
        }

        public void setUp(float f) {
            this.a = f;
        }

        public float getDown() {
            return this.b;
        }

        public void setDown(float f) {
            this.b = f;
        }
    }

    public static class TransCost {
        private float a;
        private float b;

        public float getAccess() {
            return this.a;
        }

        public void setAccess(float f) {
            this.a = f;
        }

        public float getDecess() {
            return this.b;
        }

        public void setDecess(float f) {
            this.b = f;
        }
    }

    public static class PowerTrainLoss {
        private int a;
        private float b;
        private int c;
        private int d;

        public int getPowerDemand() {
            return this.a;
        }

        public void setPowerDemand(int i) {
            this.a = i;
        }

        public float getPowerDemandValue() {
            return this.b;
        }

        public void setPowerDemandValue(float f) {
            this.b = f;
        }

        public int getSpeed() {
            return this.c;
        }

        public void setSpeed(int i) {
            this.c = i;
        }

        public int getSpeedValue() {
            return this.d;
        }

        public void setSpeedValue(int i) {
            this.d = i;
        }
    }

    public static class CustomCostMode {
        private java.util.List<com.amap.api.services.route.RouteSearchV2.SpeedCost> a;
        private com.amap.api.services.route.RouteSearchV2.CurveCost b;
        private com.amap.api.services.route.RouteSearchV2.SlopeCost c;
        private float d;
        private com.amap.api.services.route.RouteSearchV2.TransCost e;
        private float f;
        private com.amap.api.services.route.RouteSearchV2.PowerTrainLoss g;

        public java.util.List<com.amap.api.services.route.RouteSearchV2.SpeedCost> getSpeedCosts() {
            return this.a;
        }

        public void setSpeedCosts(java.util.List<com.amap.api.services.route.RouteSearchV2.SpeedCost> list) {
            this.a = list;
        }

        public com.amap.api.services.route.RouteSearchV2.CurveCost getCurveCost() {
            return this.b;
        }

        public void setCurveCost(com.amap.api.services.route.RouteSearchV2.CurveCost curveCost) {
            this.b = curveCost;
        }

        public com.amap.api.services.route.RouteSearchV2.SlopeCost getSlopeCost() {
            return this.c;
        }

        public void setSlopeCost(com.amap.api.services.route.RouteSearchV2.SlopeCost slopeCost) {
            this.c = slopeCost;
        }

        public float getAuxCost() {
            return this.d;
        }

        public void setAuxCost(float f) {
            this.d = f;
        }

        public com.amap.api.services.route.RouteSearchV2.TransCost getTransCost() {
            return this.e;
        }

        public void setTransCost(com.amap.api.services.route.RouteSearchV2.TransCost transCost) {
            this.e = transCost;
        }

        public float getFerryCost() {
            return this.f;
        }

        public void setFerryCost(float f) {
            this.f = f;
        }

        public com.amap.api.services.route.RouteSearchV2.PowerTrainLoss getPowerTrainLosses() {
            return this.g;
        }

        public void setPowerTrainLosses(com.amap.api.services.route.RouteSearchV2.PowerTrainLoss powerTrainLoss) {
            this.g = powerTrainLoss;
        }

        public java.lang.String toJson() {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.List<com.amap.api.services.route.RouteSearchV2.SpeedCost> list = this.a;
                if (list != null) {
                    for (com.amap.api.services.route.RouteSearchV2.SpeedCost speedCost : list) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("speed", speedCost.getSpeed());
                        jSONObject2.put("value", speedCost.getValue());
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put("speed_cost", jSONArray);
                }
                if (this.b != null) {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("access", this.b.getAccess());
                    jSONObject3.put("value", this.b.getValue());
                    jSONObject.put("curve_cost", jSONObject3);
                }
                if (this.c != null) {
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    jSONObject4.put("up", this.c.getUp());
                    jSONObject4.put("down", this.c.getDown());
                    jSONObject.put("slope_cost", jSONObject4);
                }
                jSONObject.put("aux_cost", this.d);
                if (this.e != null) {
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    jSONObject5.put("access", this.e.getAccess());
                    jSONObject5.put("decess", this.e.getDecess());
                    jSONObject.put("trans_cost", jSONObject5);
                }
                jSONObject.put("ferry_cost", this.f);
                if (this.g != null) {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                    jSONObject6.put("powerdemand", this.g.getPowerDemand());
                    jSONObject6.put("value", this.g.getPowerDemandValue());
                    org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                    jSONObject7.put("speed", this.g.getSpeed());
                    jSONObject7.put("value", this.g.getSpeedValue());
                    jSONArray2.put(jSONObject6);
                    jSONArray2.put(jSONObject7);
                    jSONObject.put("powertrain_loss", jSONArray2);
                }
                return jSONObject.toString();
            } catch (org.json.JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static class NewEnergy {
        private java.lang.String a;
        private com.amap.api.services.route.RouteSearchV2.CustomCostMode b;
        private java.lang.String h;
        private float c = -1.0f;
        private float d = -1.0f;
        private float e = 1.5f;
        private float f = 100.0f;
        private float g = 0.0f;
        private int i = 0;

        public java.lang.String getKey() {
            return this.a;
        }

        public void setKey(java.lang.String str) {
            this.a = str;
        }

        public com.amap.api.services.route.RouteSearchV2.CustomCostMode getCustomCostMode() {
            return this.b;
        }

        public void setCustomCostMode(com.amap.api.services.route.RouteSearchV2.CustomCostMode customCostMode) {
            this.b = customCostMode;
        }

        public float getMaxVehicleCharge() {
            return this.c;
        }

        public void setMaxVehicleCharge(float f) {
            this.c = f;
        }

        public float getVehicleCharge() {
            return this.d;
        }

        public void setVehicleCharge(float f) {
            this.d = f;
        }

        public float getLoad() {
            return this.e;
        }

        public void setLoad(float f) {
            this.e = f;
        }

        public float getLeavingPercent() {
            return this.f;
        }

        public void setLeavingPercent(float f) {
            this.f = f;
        }

        public float getArrivingPercent() {
            return this.g;
        }

        public void setArrivingPercent(float f) {
            this.g = f;
        }

        public java.lang.String getCustomChargingArguments() {
            return this.h;
        }

        public void setCustomChargingArguments(java.lang.String str) {
            this.h = str;
        }

        public int getWaypointsArrivingPercent() {
            return this.i;
        }

        public void setWaypointsArrivingPercent(int i) {
            this.i = i;
        }

        public java.lang.String buildParam() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.a != null) {
                sb.append("&key=");
                sb.append(this.a);
            }
            if (this.b != null) {
                sb.append("&custom_cost_mode=");
                sb.append(this.b.toJson());
            }
            if (this.c > 0.0f) {
                sb.append("&max_vehicle_charge=");
                sb.append(this.c);
            }
            if (this.d > 0.0f) {
                sb.append("&vehicle_charge=");
                sb.append(this.d);
            }
            sb.append("&load=");
            sb.append(this.e);
            sb.append("&leaving_percent=");
            sb.append(this.f);
            sb.append("&arriving_percent=");
            sb.append(this.g);
            if (this.h != null) {
                sb.append("&custom_charging_arguments=");
                sb.append(this.h);
            }
            if (this.i > 0) {
                sb.append("&waypoints_arriving_percent=");
                sb.append(this.i);
            }
            return sb.toString();
        }
    }

    public class AlternativeRoute {
        public static final int ALTERNATIVE_ROUTE_ONE = 1;
        public static final int ALTERNATIVE_ROUTE_THREE = 3;
        public static final int ALTERNATIVE_ROUTE_TWO = 2;

        public AlternativeRoute() {
        }
    }

    public static class WalkRouteQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.WalkRouteQuery> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.WalkRouteQuery>() { // from class: com.amap.api.services.route.RouteSearchV2.WalkRouteQuery.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.route.RouteSearchV2.WalkRouteQuery createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.route.RouteSearchV2.WalkRouteQuery[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.route.RouteSearchV2.WalkRouteQuery a(android.os.Parcel parcel) {
                return new com.amap.api.services.route.RouteSearchV2.WalkRouteQuery(parcel);
            }

            private static com.amap.api.services.route.RouteSearchV2.WalkRouteQuery[] a(int i) {
                return new com.amap.api.services.route.RouteSearchV2.WalkRouteQuery[i];
            }
        };
        private com.amap.api.services.route.RouteSearchV2.FromAndTo a;
        private int b;
        private boolean c;
        private int d;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public WalkRouteQuery(com.amap.api.services.route.RouteSearchV2.FromAndTo fromAndTo) {
            this.b = 1;
            this.c = false;
            this.d = 1;
            this.a = fromAndTo;
        }

        public com.amap.api.services.route.RouteSearchV2.FromAndTo getFromAndTo() {
            return this.a;
        }

        public boolean isIndoor() {
            return this.c;
        }

        public void setIndoor(boolean z) {
            this.c = z;
        }

        public int getAlternativeRoute() {
            return this.d;
        }

        public void setAlternativeRoute(int i) {
            this.d = i;
        }

        public int getShowFields() {
            return this.b;
        }

        public void setShowFields(int i) {
            this.b = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeBooleanArray(new boolean[]{this.c});
            parcel.writeInt(this.d);
            parcel.writeInt(this.b);
        }

        public WalkRouteQuery(android.os.Parcel parcel) {
            this.b = 1;
            this.c = false;
            this.d = 1;
            this.a = (com.amap.api.services.route.RouteSearchV2.FromAndTo) parcel.readParcelable(com.amap.api.services.route.RouteSearchV2.FromAndTo.class.getClassLoader());
            boolean[] zArr = new boolean[1];
            parcel.readBooleanArray(zArr);
            this.c = zArr[0];
            this.d = parcel.readInt();
            this.b = parcel.readInt();
        }

        public WalkRouteQuery() {
            this.b = 1;
            this.c = false;
            this.d = 1;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b) * 31) + (this.c ? 1 : 0)) * 31) + this.d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.amap.api.services.route.RouteSearchV2.WalkRouteQuery walkRouteQuery = (com.amap.api.services.route.RouteSearchV2.WalkRouteQuery) obj;
            if (this.b == walkRouteQuery.b && this.c == walkRouteQuery.c && this.d == walkRouteQuery.d) {
                return this.a.equals(walkRouteQuery.a);
            }
            return false;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.amap.api.services.route.RouteSearchV2.WalkRouteQuery m218clone() {
            try {
                super.clone();
            } catch (java.lang.CloneNotSupportedException e) {
                com.amap.api.col.p0003sl.fn.a(e, "RouteSearchV2", "WalkRouteQueryclone");
            }
            com.amap.api.services.route.RouteSearchV2.WalkRouteQuery walkRouteQuery = new com.amap.api.services.route.RouteSearchV2.WalkRouteQuery(this.a);
            walkRouteQuery.setShowFields(this.b);
            walkRouteQuery.setIndoor(this.c);
            walkRouteQuery.setAlternativeRoute(this.d);
            return walkRouteQuery;
        }
    }

    public static class DriveRouteQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.DriveRouteQuery> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.DriveRouteQuery>() { // from class: com.amap.api.services.route.RouteSearchV2.DriveRouteQuery.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.route.RouteSearchV2.DriveRouteQuery createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.route.RouteSearchV2.DriveRouteQuery[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.route.RouteSearchV2.DriveRouteQuery a(android.os.Parcel parcel) {
                return new com.amap.api.services.route.RouteSearchV2.DriveRouteQuery(parcel);
            }

            private static com.amap.api.services.route.RouteSearchV2.DriveRouteQuery[] a(int i) {
                return new com.amap.api.services.route.RouteSearchV2.DriveRouteQuery[i];
            }
        };
        private com.amap.api.services.route.RouteSearchV2.FromAndTo a;
        private com.amap.api.services.route.RouteSearchV2.NewEnergy b;
        private int c;
        private java.util.List<com.amap.api.services.core.LatLonPoint> d;
        private java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> e;
        private java.lang.String f;
        private boolean g;
        private int h;
        private java.lang.String i;
        private int j;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public DriveRouteQuery(com.amap.api.services.route.RouteSearchV2.FromAndTo fromAndTo, com.amap.api.services.route.RouteSearchV2.DrivingStrategy drivingStrategy, java.util.List<com.amap.api.services.core.LatLonPoint> list, java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> list2, java.lang.String str) {
            this.c = com.amap.api.services.route.RouteSearchV2.DrivingStrategy.DEFAULT.getValue();
            this.g = true;
            this.h = 0;
            this.i = null;
            this.j = 1;
            this.a = fromAndTo;
            this.c = drivingStrategy.getValue();
            this.d = list;
            this.e = list2;
            this.f = str;
        }

        public com.amap.api.services.route.RouteSearchV2.NewEnergy getNewEnergy() {
            return this.b;
        }

        public void setNewEnergy(com.amap.api.services.route.RouteSearchV2.NewEnergy newEnergy) {
            this.b = newEnergy;
        }

        public com.amap.api.services.route.RouteSearchV2.FromAndTo getFromAndTo() {
            return this.a;
        }

        public com.amap.api.services.route.RouteSearchV2.DrivingStrategy getMode() {
            return com.amap.api.services.route.RouteSearchV2.DrivingStrategy.fromValue(this.c);
        }

        public int getCarType() {
            return this.h;
        }

        public java.util.List<com.amap.api.services.core.LatLonPoint> getPassedByPoints() {
            return this.d;
        }

        public java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> getAvoidpolygons() {
            return this.e;
        }

        public java.lang.String getAvoidRoad() {
            return this.f;
        }

        public java.lang.String getPassedPointStr() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            java.util.List<com.amap.api.services.core.LatLonPoint> list = this.d;
            if (list == null || list.size() == 0) {
                return null;
            }
            for (int i = 0; i < this.d.size(); i++) {
                com.amap.api.services.core.LatLonPoint latLonPoint = this.d.get(i);
                stringBuffer.append(latLonPoint.getLongitude());
                stringBuffer.append(",");
                stringBuffer.append(latLonPoint.getLatitude());
                if (i < this.d.size() - 1) {
                    stringBuffer.append(";");
                }
            }
            return stringBuffer.toString();
        }

        public boolean hasPassPoint() {
            return !com.amap.api.col.p0003sl.fn.a(getPassedPointStr());
        }

        public java.lang.String getAvoidpolygonsStr() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> list = this.e;
            if (list == null || list.size() == 0) {
                return null;
            }
            for (int i = 0; i < this.e.size(); i++) {
                java.util.List<com.amap.api.services.core.LatLonPoint> list2 = this.e.get(i);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    com.amap.api.services.core.LatLonPoint latLonPoint = list2.get(i2);
                    stringBuffer.append(latLonPoint.getLongitude());
                    stringBuffer.append(",");
                    stringBuffer.append(latLonPoint.getLatitude());
                    if (i2 < list2.size() - 1) {
                        stringBuffer.append(";");
                    }
                }
                if (i < this.e.size() - 1) {
                    stringBuffer.append(com.king.zxing.util.LogUtils.VERTICAL);
                }
            }
            return stringBuffer.toString();
        }

        public boolean hasAvoidpolygons() {
            return !com.amap.api.col.p0003sl.fn.a(getAvoidpolygonsStr());
        }

        public boolean hasAvoidRoad() {
            return !com.amap.api.col.p0003sl.fn.a(getAvoidRoad());
        }

        public java.lang.String getExclude() {
            return this.i;
        }

        public void setExclude(java.lang.String str) {
            this.i = str;
        }

        public int getShowFields() {
            return this.j;
        }

        public void setShowFields(int i) {
            this.j = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeInt(this.c);
            parcel.writeTypedList(this.d);
            java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> list = this.e;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(list.size());
                java.util.Iterator<java.util.List<com.amap.api.services.core.LatLonPoint>> it = this.e.iterator();
                while (it.hasNext()) {
                    parcel.writeTypedList(it.next());
                }
            }
            parcel.writeString(this.f);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h);
            parcel.writeString(this.i);
            parcel.writeInt(this.j);
        }

        public DriveRouteQuery(android.os.Parcel parcel) {
            this.c = com.amap.api.services.route.RouteSearchV2.DrivingStrategy.DEFAULT.getValue();
            this.g = true;
            this.h = 0;
            this.i = null;
            this.j = 1;
            this.a = (com.amap.api.services.route.RouteSearchV2.FromAndTo) parcel.readParcelable(com.amap.api.services.route.RouteSearchV2.FromAndTo.class.getClassLoader());
            this.c = parcel.readInt();
            this.d = parcel.createTypedArrayList(com.amap.api.services.core.LatLonPoint.CREATOR);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                this.e = null;
            } else {
                this.e = new java.util.ArrayList();
            }
            for (int i = 0; i < readInt; i++) {
                this.e.add(parcel.createTypedArrayList(com.amap.api.services.core.LatLonPoint.CREATOR));
            }
            this.f = parcel.readString();
            this.g = parcel.readInt() == 1;
            this.h = parcel.readInt();
            this.i = parcel.readString();
            this.j = parcel.readInt();
        }

        public DriveRouteQuery() {
            this.c = com.amap.api.services.route.RouteSearchV2.DrivingStrategy.DEFAULT.getValue();
            this.g = true;
            this.h = 0;
            this.i = null;
            this.j = 1;
        }

        public int hashCode() {
            java.lang.String str = this.f;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> list = this.e;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            com.amap.api.services.route.RouteSearchV2.FromAndTo fromAndTo = this.a;
            int hashCode3 = (((hashCode2 + (fromAndTo == null ? 0 : fromAndTo.hashCode())) * 31) + this.c) * 31;
            java.util.List<com.amap.api.services.core.LatLonPoint> list2 = this.d;
            return ((hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.h;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.amap.api.services.route.RouteSearchV2.DriveRouteQuery driveRouteQuery = (com.amap.api.services.route.RouteSearchV2.DriveRouteQuery) obj;
            java.lang.String str = this.f;
            if (str == null) {
                if (driveRouteQuery.f != null) {
                    return false;
                }
            } else if (!str.equals(driveRouteQuery.f)) {
                return false;
            }
            java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> list = this.e;
            if (list == null) {
                if (driveRouteQuery.e != null) {
                    return false;
                }
            } else if (!list.equals(driveRouteQuery.e)) {
                return false;
            }
            com.amap.api.services.route.RouteSearchV2.FromAndTo fromAndTo = this.a;
            if (fromAndTo == null) {
                if (driveRouteQuery.a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(driveRouteQuery.a)) {
                return false;
            }
            if (this.c != driveRouteQuery.c) {
                return false;
            }
            java.util.List<com.amap.api.services.core.LatLonPoint> list2 = this.d;
            if (list2 == null) {
                if (driveRouteQuery.d != null) {
                    return false;
                }
            } else if (!list2.equals(driveRouteQuery.d) || this.g != driveRouteQuery.isUseFerry() || this.h != driveRouteQuery.h || this.j != driveRouteQuery.j) {
                return false;
            }
            return true;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.amap.api.services.route.RouteSearchV2.DriveRouteQuery m215clone() {
            try {
                super.clone();
            } catch (java.lang.CloneNotSupportedException e) {
                com.amap.api.col.p0003sl.fn.a(e, "RouteSearchV2", "DriveRouteQueryclone");
            }
            com.amap.api.services.route.RouteSearchV2.DriveRouteQuery driveRouteQuery = new com.amap.api.services.route.RouteSearchV2.DriveRouteQuery(this.a, com.amap.api.services.route.RouteSearchV2.DrivingStrategy.fromValue(this.c), this.d, this.e, this.f);
            driveRouteQuery.setUseFerry(this.g);
            driveRouteQuery.setCarType(this.h);
            driveRouteQuery.setExclude(this.i);
            driveRouteQuery.setShowFields(this.j);
            driveRouteQuery.setNewEnergy(this.b);
            return driveRouteQuery;
        }

        public boolean isUseFerry() {
            return this.g;
        }

        public void setUseFerry(boolean z) {
            this.g = z;
        }

        public void setCarType(int i) {
            this.h = i;
        }
    }

    public static class RideRouteQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.RideRouteQuery> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.RideRouteQuery>() { // from class: com.amap.api.services.route.RouteSearchV2.RideRouteQuery.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.route.RouteSearchV2.RideRouteQuery createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.route.RouteSearchV2.RideRouteQuery[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.route.RouteSearchV2.RideRouteQuery a(android.os.Parcel parcel) {
                return new com.amap.api.services.route.RouteSearchV2.RideRouteQuery(parcel);
            }

            private static com.amap.api.services.route.RouteSearchV2.RideRouteQuery[] a(int i) {
                return new com.amap.api.services.route.RouteSearchV2.RideRouteQuery[i];
            }
        };
        private com.amap.api.services.route.RouteSearchV2.FromAndTo a;
        private int b;
        private int c;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public RideRouteQuery(com.amap.api.services.route.RouteSearchV2.FromAndTo fromAndTo) {
            this.b = 1;
            this.c = 1;
            this.a = fromAndTo;
        }

        public com.amap.api.services.route.RouteSearchV2.FromAndTo getFromAndTo() {
            return this.a;
        }

        public int getShowFields() {
            return this.b;
        }

        public void setShowFields(int i) {
            this.b = i;
        }

        public int getAlternativeRoute() {
            return this.c;
        }

        public void setAlternativeRoute(int i) {
            this.c = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.b);
        }

        public RideRouteQuery(android.os.Parcel parcel) {
            this.b = 1;
            this.c = 1;
            this.a = (com.amap.api.services.route.RouteSearchV2.FromAndTo) parcel.readParcelable(com.amap.api.services.route.RouteSearch.FromAndTo.class.getClassLoader());
            this.c = parcel.readInt();
            this.b = parcel.readInt();
        }

        public RideRouteQuery() {
            this.b = 1;
            this.c = 1;
        }

        public int hashCode() {
            com.amap.api.services.route.RouteSearchV2.FromAndTo fromAndTo = this.a;
            return (((((fromAndTo == null ? 0 : fromAndTo.hashCode()) + 31) * 31) + this.b) * 31) + this.c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.amap.api.services.route.RouteSearchV2.RideRouteQuery rideRouteQuery = (com.amap.api.services.route.RouteSearchV2.RideRouteQuery) obj;
            com.amap.api.services.route.RouteSearchV2.FromAndTo fromAndTo = this.a;
            if (fromAndTo == null) {
                if (rideRouteQuery.a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(rideRouteQuery.a)) {
                return false;
            }
            return this.b == rideRouteQuery.b && this.c == rideRouteQuery.c;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.amap.api.services.route.RouteSearchV2.RideRouteQuery m217clone() {
            try {
                super.clone();
            } catch (java.lang.CloneNotSupportedException e) {
                com.amap.api.col.p0003sl.fn.a(e, "RouteSearchV2", "RideRouteQueryclone");
            }
            com.amap.api.services.route.RouteSearchV2.RideRouteQuery rideRouteQuery = new com.amap.api.services.route.RouteSearchV2.RideRouteQuery(this.a);
            rideRouteQuery.setShowFields(this.b);
            rideRouteQuery.setAlternativeRoute(this.c);
            return rideRouteQuery;
        }
    }

    public static class BusRouteQuery implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.BusRouteQuery> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.RouteSearchV2.BusRouteQuery>() { // from class: com.amap.api.services.route.RouteSearchV2.BusRouteQuery.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.route.RouteSearchV2.BusRouteQuery createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.route.RouteSearchV2.BusRouteQuery[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.route.RouteSearchV2.BusRouteQuery a(android.os.Parcel parcel) {
                return new com.amap.api.services.route.RouteSearchV2.BusRouteQuery(parcel);
            }

            private static com.amap.api.services.route.RouteSearchV2.BusRouteQuery[] a(int i) {
                return new com.amap.api.services.route.RouteSearchV2.BusRouteQuery[i];
            }
        };
        private com.amap.api.services.route.RouteSearchV2.FromAndTo a;
        private int b;
        private java.lang.String c;
        private java.lang.String d;
        private java.lang.String e;
        private java.lang.String f;
        private int g;
        private java.lang.String h;
        private java.lang.String i;
        private java.lang.String j;
        private java.lang.String k;
        private int l;
        private int m;
        private int n;
        private int o;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public BusRouteQuery(com.amap.api.services.route.RouteSearchV2.FromAndTo fromAndTo, int i, java.lang.String str, int i2) {
            this.b = 0;
            this.g = 0;
            this.l = 5;
            this.m = 0;
            this.n = 4;
            this.o = 1;
            this.a = fromAndTo;
            this.b = i;
            this.c = str;
            this.g = i2;
        }

        public com.amap.api.services.route.RouteSearchV2.FromAndTo getFromAndTo() {
            return this.a;
        }

        public int getMode() {
            return this.b;
        }

        public java.lang.String getCity() {
            return this.c;
        }

        public int getNightFlag() {
            return this.g;
        }

        public java.lang.String getCityd() {
            return this.d;
        }

        public void setCityd(java.lang.String str) {
            this.d = str;
        }

        public int getShowFields() {
            return this.o;
        }

        public void setShowFields(int i) {
            this.o = i;
        }

        public java.lang.String getDate() {
            return this.e;
        }

        public void setDate(java.lang.String str) {
            this.e = str;
        }

        public java.lang.String getTime() {
            return this.f;
        }

        public void setTime(java.lang.String str) {
            this.f = str;
        }

        public java.lang.String getOriginPoiId() {
            return this.h;
        }

        public void setOriginPoiId(java.lang.String str) {
            this.h = str;
        }

        public java.lang.String getDestinationPoiId() {
            return this.i;
        }

        public void setDestinationPoiId(java.lang.String str) {
            this.i = str;
        }

        public java.lang.String getAd1() {
            return this.j;
        }

        public void setAd1(java.lang.String str) {
            this.j = str;
        }

        public java.lang.String getAd2() {
            return this.k;
        }

        public void setAd2(java.lang.String str) {
            this.k = str;
        }

        public int getAlternativeRoute() {
            return this.l;
        }

        public void setAlternativeRoute(int i) {
            this.l = i;
        }

        public int getMultiExport() {
            return this.m;
        }

        public void setMultiExport(int i) {
            this.m = i;
        }

        public int getMaxTrans() {
            return this.n;
        }

        public void setMaxTrans(int i) {
            this.n = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeInt(this.g);
            parcel.writeString(this.d);
            parcel.writeInt(this.o);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeInt(this.l);
            parcel.writeInt(this.n);
            parcel.writeInt(this.m);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        }

        public BusRouteQuery(android.os.Parcel parcel) {
            this.b = 0;
            this.g = 0;
            this.l = 5;
            this.m = 0;
            this.n = 4;
            this.o = 1;
            this.a = (com.amap.api.services.route.RouteSearchV2.FromAndTo) parcel.readParcelable(com.amap.api.services.route.RouteSearchV2.FromAndTo.class.getClassLoader());
            this.b = parcel.readInt();
            this.c = parcel.readString();
            this.g = parcel.readInt();
            this.d = parcel.readString();
            this.o = parcel.readInt();
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
            this.n = parcel.readInt();
            this.m = parcel.readInt();
            this.l = parcel.readInt();
            this.j = parcel.readString();
            this.k = parcel.readString();
        }

        public BusRouteQuery() {
            this.b = 0;
            this.g = 0;
            this.l = 5;
            this.m = 0;
            this.n = 4;
            this.o = 1;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.amap.api.services.route.RouteSearchV2.BusRouteQuery busRouteQuery = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) obj;
            if (this.b == busRouteQuery.b && this.g == busRouteQuery.g && this.h.equals(busRouteQuery.h) && this.i.equals(busRouteQuery.i) && this.l == busRouteQuery.l && this.m == busRouteQuery.m && this.n == busRouteQuery.n && this.o == busRouteQuery.o && this.a.equals(busRouteQuery.a) && this.c.equals(busRouteQuery.c) && this.d.equals(busRouteQuery.d) && this.e.equals(busRouteQuery.e) && this.f.equals(busRouteQuery.f) && this.j.equals(busRouteQuery.j)) {
                return this.k.equals(busRouteQuery.k);
            }
            return false;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.amap.api.services.route.RouteSearchV2.BusRouteQuery m214clone() {
            try {
                super.clone();
            } catch (java.lang.CloneNotSupportedException e) {
                com.amap.api.col.p0003sl.fn.a(e, "RouteSearchV2", "BusRouteQueryclone");
            }
            com.amap.api.services.route.RouteSearchV2.BusRouteQuery busRouteQuery = new com.amap.api.services.route.RouteSearchV2.BusRouteQuery(this.a, this.b, this.c, this.g);
            busRouteQuery.setCityd(this.d);
            busRouteQuery.setShowFields(this.o);
            busRouteQuery.setDate(this.e);
            busRouteQuery.setTime(this.f);
            busRouteQuery.setAd1(this.j);
            busRouteQuery.setAd2(this.k);
            busRouteQuery.setOriginPoiId(this.h);
            busRouteQuery.setDestinationPoiId(this.i);
            busRouteQuery.setMaxTrans(this.n);
            busRouteQuery.setMultiExport(this.m);
            busRouteQuery.setAlternativeRoute(this.l);
            return busRouteQuery;
        }
    }
}
