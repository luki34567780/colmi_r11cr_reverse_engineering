package com.amap.api.col.p0003sl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.in;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.model.MyLocationStyle;
import com.autonavi.base.ae.gmap.glyph.ReflectUtil;
import com.qcwireless.qcwatch.ui.home.gps.service.TrackingService;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: AMapReflectionLocationSource.java */
/* loaded from: classes.dex */
public final class aw implements LocationSource {
    private Method A;
    private Method B;
    private Method C;
    private Method D;
    private Method E;
    private Method F;
    private Method G;
    private Method H;
    private Method I;
    private boolean J = false;
    private long K = TrackingService.Constant.FASTEST_UPDATE_INTERVAL;
    private InvocationHandler L = new InvocationHandler() { // from class: com.amap.api.col.3sl.aw.1
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (!TextUtils.equals(method.getName(), "onLocationChanged") || aw.this.b == null || objArr == null || objArr.length != 1) {
                return null;
            }
            Object obj2 = objArr[0];
            Location location = (Location) obj2;
            Bundle extras = location.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            Object invokeMethod = ReflectUtil.invokeMethod(obj2, aw.this.p, new Object[0]);
            if (invokeMethod instanceof Integer) {
                extras.putInt(MyLocationStyle.ERROR_CODE, ((Integer) invokeMethod).intValue());
            }
            Object invokeMethod2 = ReflectUtil.invokeMethod(obj2, aw.this.q, new Object[0]);
            if (invokeMethod2 instanceof String) {
                extras.putString(MyLocationStyle.ERROR_INFO, (String) invokeMethod2);
            }
            Object invokeMethod3 = ReflectUtil.invokeMethod(obj2, aw.this.r, new Object[0]);
            if (invokeMethod3 instanceof Integer) {
                extras.putInt(MyLocationStyle.LOCATION_TYPE, ((Integer) invokeMethod3).intValue());
            }
            Object invokeMethod4 = ReflectUtil.invokeMethod(obj2, aw.this.s, new Object[0]);
            if (invokeMethod4 instanceof Float) {
                extras.putFloat("Accuracy", ((Float) invokeMethod4).floatValue());
            }
            Object invokeMethod5 = ReflectUtil.invokeMethod(obj2, aw.this.t, new Object[0]);
            if (invokeMethod5 instanceof String) {
                extras.putString("AdCode", (String) invokeMethod5);
            }
            Object invokeMethod6 = ReflectUtil.invokeMethod(obj2, aw.this.u, new Object[0]);
            if (invokeMethod6 instanceof String) {
                extras.putString("Address", (String) invokeMethod6);
            }
            Object invokeMethod7 = ReflectUtil.invokeMethod(obj2, aw.this.v, new Object[0]);
            if (invokeMethod7 instanceof String) {
                extras.putString("AoiName", (String) invokeMethod7);
            }
            Object invokeMethod8 = ReflectUtil.invokeMethod(obj2, aw.this.w, new Object[0]);
            if (invokeMethod8 instanceof String) {
                extras.putString("City", (String) invokeMethod8);
            }
            Object invokeMethod9 = ReflectUtil.invokeMethod(obj2, aw.this.x, new Object[0]);
            if (invokeMethod9 instanceof String) {
                extras.putString("CityCode", (String) invokeMethod9);
            }
            Object invokeMethod10 = ReflectUtil.invokeMethod(obj2, aw.this.y, new Object[0]);
            if (invokeMethod10 instanceof String) {
                extras.putString("Country", (String) invokeMethod10);
            }
            Object invokeMethod11 = ReflectUtil.invokeMethod(obj2, aw.this.z, new Object[0]);
            if (invokeMethod11 instanceof String) {
                extras.putString("District", (String) invokeMethod11);
            }
            Object invokeMethod12 = ReflectUtil.invokeMethod(obj2, aw.this.A, new Object[0]);
            if (invokeMethod12 instanceof String) {
                extras.putString("Street", (String) invokeMethod12);
            }
            Object invokeMethod13 = ReflectUtil.invokeMethod(obj2, aw.this.B, new Object[0]);
            if (invokeMethod13 instanceof String) {
                extras.putString("StreetNum", (String) invokeMethod13);
            }
            Object invokeMethod14 = ReflectUtil.invokeMethod(obj2, aw.this.C, new Object[0]);
            if (invokeMethod14 instanceof String) {
                extras.putString("PoiName", (String) invokeMethod14);
            }
            Object invokeMethod15 = ReflectUtil.invokeMethod(obj2, aw.this.D, new Object[0]);
            if (invokeMethod15 instanceof String) {
                extras.putString("Province", (String) invokeMethod15);
            }
            Object invokeMethod16 = ReflectUtil.invokeMethod(obj2, aw.this.E, new Object[0]);
            if (invokeMethod16 instanceof Float) {
                extras.putFloat("Speed", ((Float) invokeMethod16).floatValue());
            }
            Object invokeMethod17 = ReflectUtil.invokeMethod(obj2, aw.this.F, new Object[0]);
            if (invokeMethod17 instanceof String) {
                extras.putString("Floor", (String) invokeMethod17);
            }
            Object invokeMethod18 = ReflectUtil.invokeMethod(obj2, aw.this.G, new Object[0]);
            if (invokeMethod18 instanceof Float) {
                extras.putFloat("Bearing", ((Float) invokeMethod18).floatValue());
            }
            Object invokeMethod19 = ReflectUtil.invokeMethod(obj2, aw.this.H, new Object[0]);
            if (invokeMethod19 instanceof String) {
                extras.putString("BuildingId", (String) invokeMethod19);
            }
            Object invokeMethod20 = ReflectUtil.invokeMethod(obj2, aw.this.I, new Object[0]);
            if (invokeMethod20 instanceof Double) {
                extras.putDouble("Altitude", ((Double) invokeMethod20).doubleValue());
            }
            location.setExtras(extras);
            aw.this.b.onLocationChanged(location);
            return null;
        }
    };
    private Context a;
    private LocationSource.OnLocationChangedListener b;
    private Object c;
    private Object d;
    private Object e;
    private Method f;
    private Method g;
    private Method h;
    private Method i;
    private Method j;
    private Method k;
    private Method l;
    private Method m;
    private Method n;
    private Method o;
    private Method p;
    private Method q;
    private Method r;
    private Method s;
    private Method t;
    private Method u;
    private Method v;
    private Method w;
    private Method x;
    private Method y;
    private Method z;

    public aw(Context context) {
        this.a = context;
        a();
        b();
        c();
    }

    @Override // com.amap.api.maps.LocationSource
    public final void activate(LocationSource.OnLocationChangedListener onLocationChangedListener) {
        this.b = onLocationChangedListener;
        if (in.a(this.a, dx.a()).a == in.c.SuccessCode && this.c == null) {
            try {
                Object newInstance = ReflectUtil.newInstance("com.amap.api.location.AMapLocationClient", new Class[]{Context.class}, new Object[]{this.a});
                this.c = newInstance;
                if (newInstance == null) {
                    return;
                }
                this.d = ReflectUtil.newInstance("com.amap.api.location.AMapLocationClientOption", null, null);
                Object newProxyInstance = Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{Class.forName("com.amap.api.location.AMapLocationListener")}, this.L);
                this.e = newProxyInstance;
                ReflectUtil.invokeMethod(this.c, this.f, newProxyInstance);
                ReflectUtil.invokeMethod(this.d, this.k, Long.valueOf(this.K));
                ReflectUtil.invokeMethod(this.d, this.l, Boolean.valueOf(this.J));
                ReflectUtil.invokeMethod(this.d, this.m, ReflectUtil.getField("com.amap.api.location.AMapLocationClientOption$AMapLocationMode", null, "Hight_Accuracy"));
                ReflectUtil.invokeMethod(this.d, this.n, Boolean.FALSE);
                ReflectUtil.invokeMethod(this.c, this.g, this.d);
                ReflectUtil.invokeMethod(this.c, this.h, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.amap.api.maps.LocationSource
    public final void deactivate() {
        this.b = null;
        Object obj = this.c;
        if (obj != null) {
            ReflectUtil.invokeMethod(obj, this.i, new Object[0]);
            ReflectUtil.invokeMethod(this.c, this.j, new Object[0]);
        }
        this.c = null;
    }

    public final void a(long j) {
        Object obj = this.d;
        if (obj != null && this.c != null) {
            Object invokeMethod = ReflectUtil.invokeMethod(obj, this.o, new Object[0]);
            if ((invokeMethod instanceof Long) && ((Long) invokeMethod).longValue() != j) {
                ReflectUtil.invokeMethod(this.d, this.k, Long.valueOf(j));
                ReflectUtil.invokeMethod(this.c, this.g, this.d);
            }
        }
        this.K = j;
    }

    public final void a(int i) {
        if (i == 1 || i == 0) {
            a(true);
        } else {
            a(false);
        }
    }

    private void a(boolean z) {
        Object obj;
        if (this.d != null && (obj = this.c) != null) {
            try {
                ReflectUtil.invokeMethod(obj, this.j, new Object[0]);
                this.c = ReflectUtil.newInstance("com.amap.api.location.AMapLocationClient", new Class[]{Context.class}, new Object[]{this.a});
                Object newProxyInstance = Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{Class.forName("com.amap.api.location.AMapLocationListener")}, this.L);
                this.e = newProxyInstance;
                ReflectUtil.invokeMethod(this.c, this.f, newProxyInstance);
                ReflectUtil.invokeMethod(this.d, this.l, Boolean.valueOf(z));
                ReflectUtil.invokeMethod(this.d, this.n, Boolean.FALSE);
                if (!z) {
                    ReflectUtil.invokeMethod(this.d, this.k, Long.valueOf(this.K));
                }
                ReflectUtil.invokeMethod(this.c, this.g, this.d);
                ReflectUtil.invokeMethod(this.c, this.h, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.J = z;
    }

    private void a() {
        try {
            this.f = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClient", "setLocationListener", Class.forName("com.amap.api.location.AMapLocationListener"));
            this.g = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClient", "setLocationOption", Class.forName("com.amap.api.location.AMapLocationClientOption"));
            this.h = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClient", "startLocation", new Class[0]);
            this.i = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClient", "stopLocation", new Class[0]);
            this.j = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClient", "onDestroy", new Class[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void b() {
        try {
            this.k = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClientOption", "setInterval", Long.TYPE);
            this.l = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClientOption", "setOnceLocation", Boolean.TYPE);
            this.m = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClientOption", "setLocationMode", Class.forName("com.amap.api.location.AMapLocationClientOption$AMapLocationMode"));
            this.n = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClientOption", "setNeedAddress", Boolean.TYPE);
            this.o = ReflectUtil.getMethod("com.amap.api.location.AMapLocationClientOption", "getInterval", new Class[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void c() {
        try {
            this.p = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getErrorCode", new Class[0]);
            this.q = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getErrorInfo", new Class[0]);
            this.r = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getLocationType", new Class[0]);
            this.s = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getAccuracy", new Class[0]);
            this.t = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getAdCode", new Class[0]);
            this.u = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getAddress", new Class[0]);
            this.v = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getAoiName", new Class[0]);
            this.w = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getCity", new Class[0]);
            this.x = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getCityCode", new Class[0]);
            this.y = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getCountry", new Class[0]);
            this.z = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getDistrict", new Class[0]);
            this.A = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getStreet", new Class[0]);
            this.B = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getStreetNum", new Class[0]);
            this.C = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getPoiName", new Class[0]);
            this.D = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getProvince", new Class[0]);
            this.E = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getSpeed", new Class[0]);
            this.F = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getFloor", new Class[0]);
            this.G = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getBearing", new Class[0]);
            this.H = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getBuildingId", new Class[0]);
            this.I = ReflectUtil.getMethod("com.amap.api.location.AMapLocation", "getAltitude", new Class[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
