package com.qcwireless.qcwatch.ui.base.util;

/* loaded from: /tmp/dex/classes2.dex */
public class LocationUtils {
    private static final java.lang.String TAG = "FloatBall";
    static com.qcwireless.qcwatch.ui.base.util.LocationUtils locationUtils;
    private android.location.LocationManager locationManager;

    private enum permission {
        ACCESS_COARSE_LOCATION,
        ACCESS_FINE_LOCATION
    }

    public static boolean isGPSEnable(android.content.Context context) {
        android.location.LocationManager locationManager = (android.location.LocationManager) context.getSystemService("location");
        return locationManager != null && locationManager.isProviderEnabled("gps");
    }

    public static com.qcwireless.qcwatch.ui.base.util.LocationUtils getInstance() {
        if (locationUtils == null) {
            locationUtils = new com.qcwireless.qcwatch.ui.base.util.LocationUtils();
        }
        return locationUtils;
    }

    public java.lang.String getLocations(android.content.Context context) {
        java.lang.String str = "";
        if (!isOPenGPS(context)) {
            return "";
        }
        checkPermission(context, com.qcwireless.qcwatch.ui.base.util.LocationUtils.permission.ACCESS_COARSE_LOCATION);
        try {
            this.locationManager = (android.location.LocationManager) context.getSystemService("location");
            android.location.Criteria criteria = new android.location.Criteria();
            criteria.setAccuracy(2);
            criteria.setAltitudeRequired(false);
            criteria.setBearingRequired(false);
            criteria.setCostAllowed(true);
            criteria.setPowerRequirement(1);
            java.lang.String bestProvider = this.locationManager.getBestProvider(criteria, true);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "Location Provider is " + bestProvider);
            android.location.Location lastKnownLocation = this.locationManager.getLastKnownLocation(bestProvider);
            if (lastKnownLocation == null) {
                return "";
            }
            java.lang.String str2 = "" + getLocationAddress(context, lastKnownLocation);
            try {
                if (!str2.equals("")) {
                    return str2;
                }
                return str2 + "" + convertAddress(context, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
            } catch (java.lang.SecurityException e) {
                e = e;
                str = str2;
                e.printStackTrace();
                return str;
            } catch (java.lang.Exception e2) {
                e = e2;
                str = str2;
                e.printStackTrace();
                return str;
            }
        } catch (java.lang.SecurityException e3) {
            e = e3;
        } catch (java.lang.Exception e4) {
            e = e4;
        }
    }

    public java.lang.String convertAddress(android.content.Context context, double latitude, double longitude) {
        android.location.Geocoder geocoder = new android.location.Geocoder(context, java.util.Locale.US);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.util.List<android.location.Address> fromLocation = geocoder.getFromLocation(latitude, longitude, 1);
            if (!fromLocation.isEmpty()) {
                android.location.Address address = fromLocation.get(0);
                sb.append(address.getLocality());
                sb.append(address.getThoroughfare());
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private boolean checkPermission(android.content.Context context, com.qcwireless.qcwatch.ui.base.util.LocationUtils.permission permName) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("android.permission.");
        sb.append(permName.toString());
        return context.checkCallingOrSelfPermission(sb.toString()) == 0;
    }

    private java.lang.String getLocationAddress(android.content.Context mContext, android.location.Location location) {
        java.lang.String str;
        try {
            android.location.Address address = new android.location.Geocoder(mContext, java.util.Locale.CHINESE).getFromLocation(location.getLatitude(), location.getLongitude(), 1).get(0);
            android.util.Log.w("wqs", "远程获取定位全部为: " + address.toString());
            if (address.getAddressLine(0) != null && !address.getAddressLine(0).equals("")) {
                str = address.getAddressLine(0);
                android.util.Log.w("wqs", "获取成功第一种: " + str);
            } else if (address.getFeatureName() != null && !address.getFeatureName().equals("")) {
                str = address.getLocality() + address.getFeatureName();
                android.util.Log.w("wqs", "获取成功第二种: " + str);
            } else {
                if (address.getMaxAddressLineIndex() >= 2) {
                    str = address.getAddressLine(1) + address.getAddressLine(2);
                } else {
                    str = address.getAddressLine(1);
                }
                android.util.Log.w("wqs", "获取成功第三种: " + str);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
            str = "";
        }
        return str.contains("null") ? str.replaceAll("null", "") : str;
    }

    private boolean isOPenGPS(final android.content.Context context) {
        android.location.LocationManager locationManager = (android.location.LocationManager) context.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }
}
