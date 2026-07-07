package com.autonavi.aps.amapapi.restruct;

/* compiled from: AmapSensorManager.java */
/* loaded from: classes.dex */
public final class b implements android.hardware.SensorEventListener {
    android.hardware.SensorManager a;
    android.hardware.Sensor b;
    android.hardware.Sensor c;
    android.hardware.Sensor d;
    private android.content.Context s;
    public boolean e = false;
    public double f = 0.0d;
    public float g = 0.0f;
    private float t = 1013.25f;
    private float u = 0.0f;
    android.os.Handler h = new android.os.Handler();
    double i = 0.0d;
    double j = 0.0d;
    double k = 0.0d;
    double l = 0.0d;
    double[] m = new double[3];
    volatile double n = 0.0d;
    long o = 0;
    long p = 0;
    final int q = 100;
    final int r = 30;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    public b(android.content.Context context) {
        this.s = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        try {
            this.s = context;
            if (this.a == null) {
                this.a = (android.hardware.SensorManager) context.getSystemService("sensor");
            }
            try {
                this.b = this.a.getDefaultSensor(6);
            } catch (java.lang.Throwable unused) {
            }
            try {
                this.c = this.a.getDefaultSensor(11);
            } catch (java.lang.Throwable unused2) {
            }
            try {
                this.d = this.a.getDefaultSensor(1);
            } catch (java.lang.Throwable unused3) {
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMapSensorManager", "<init>");
        }
    }

    public final void a() {
        android.hardware.SensorManager sensorManager = this.a;
        if (sensorManager == null || this.e) {
            return;
        }
        this.e = true;
        try {
            android.hardware.Sensor sensor = this.b;
            if (sensor != null) {
                sensorManager.registerListener(this, sensor, 3, this.h);
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMapSensorManager", "registerListener mPressure");
        }
        try {
            android.hardware.Sensor sensor2 = this.c;
            if (sensor2 != null) {
                this.a.registerListener(this, sensor2, 3, this.h);
            }
        } catch (java.lang.Throwable th2) {
            com.autonavi.aps.amapapi.utils.b.a(th2, "AMapSensorManager", "registerListener mRotationVector");
        }
        try {
            android.hardware.Sensor sensor3 = this.d;
            if (sensor3 != null) {
                this.a.registerListener(this, sensor3, 3, this.h);
            }
        } catch (java.lang.Throwable th3) {
            com.autonavi.aps.amapapi.utils.b.a(th3, "AMapSensorManager", "registerListener mAcceleroMeterVector");
        }
    }

    public final void b() {
        android.hardware.SensorManager sensorManager = this.a;
        if (sensorManager == null || !this.e) {
            return;
        }
        this.e = false;
        try {
            android.hardware.Sensor sensor = this.b;
            if (sensor != null) {
                sensorManager.unregisterListener(this, sensor);
            }
        } catch (java.lang.Throwable unused) {
        }
        try {
            android.hardware.Sensor sensor2 = this.c;
            if (sensor2 != null) {
                this.a.unregisterListener(this, sensor2);
            }
        } catch (java.lang.Throwable unused2) {
        }
        try {
            android.hardware.Sensor sensor3 = this.d;
            if (sensor3 != null) {
                this.a.unregisterListener(this, sensor3);
            }
        } catch (java.lang.Throwable unused3) {
        }
    }

    public final double c() {
        return this.f;
    }

    public final float d() {
        return this.u;
    }

    public final double e() {
        return this.l;
    }

    public final void f() {
        try {
            b();
            this.b = null;
            this.c = null;
            this.a = null;
            this.d = null;
            this.e = false;
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMapSensorManager", "destroy");
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent == null) {
            return;
        }
        try {
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                if (this.d != null) {
                    a((float[]) sensorEvent.values.clone());
                    return;
                }
                return;
            }
            if (type != 6) {
                if (type != 11) {
                    return;
                }
                try {
                    if (this.c != null) {
                        c((float[]) sensorEvent.values.clone());
                        return;
                    }
                    return;
                } catch (java.lang.Throwable unused) {
                    return;
                }
            }
            try {
                if (this.b != null) {
                    float[] fArr = (float[]) sensorEvent.values.clone();
                    if (fArr != null) {
                        this.g = fArr[0];
                    }
                    b(fArr);
                }
            } catch (java.lang.Throwable unused2) {
            }
        } catch (java.lang.Throwable unused3) {
        }
    }

    private void a(float[] fArr) {
        double[] dArr = this.m;
        dArr[0] = (dArr[0] * 0.800000011920929d) + (fArr[0] * 0.19999999f);
        dArr[1] = (dArr[1] * 0.800000011920929d) + (fArr[1] * 0.19999999f);
        dArr[2] = (dArr[2] * 0.800000011920929d) + (fArr[2] * 0.19999999f);
        this.i = fArr[0] - dArr[0];
        this.j = fArr[1] - dArr[1];
        this.k = fArr[2] - dArr[2];
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.o < 100) {
            return;
        }
        double d = this.i;
        double d2 = this.j;
        double d3 = (d * d) + (d2 * d2);
        double d4 = this.k;
        double sqrt = java.lang.Math.sqrt(d3 + (d4 * d4));
        this.p++;
        this.o = currentTimeMillis;
        this.n += sqrt;
        if (this.p >= 30) {
            this.l = this.n / this.p;
            this.n = 0.0d;
            this.p = 0L;
        }
    }

    private void b(float[] fArr) {
        if (fArr != null) {
            this.f = com.autonavi.aps.amapapi.utils.j.a(android.hardware.SensorManager.getAltitude(this.t, fArr[0]));
        }
    }

    private void c(float[] fArr) {
        if (fArr != null) {
            float[] fArr2 = new float[9];
            android.hardware.SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            android.hardware.SensorManager.getOrientation(fArr2, new float[3]);
            float degrees = (float) java.lang.Math.toDegrees(r3[0]);
            this.u = degrees;
            if (degrees <= 0.0f) {
                degrees += 360.0f;
            }
            this.u = (float) java.lang.Math.floor(degrees);
        }
    }
}
