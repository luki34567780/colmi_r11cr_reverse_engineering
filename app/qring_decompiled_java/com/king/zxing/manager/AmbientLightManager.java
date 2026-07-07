package com.king.zxing.manager;

/* loaded from: /tmp/dex/classes2.dex */
public class AmbientLightManager implements android.hardware.SensorEventListener {
    protected static final float BRIGHT_LUX = 100.0f;
    protected static final float DARK_LUX = 45.0f;
    private static final int INTERVAL_TIME = 200;
    private boolean isLightSensorEnabled;
    private long lastTime;
    private android.hardware.Sensor lightSensor;
    private com.king.zxing.manager.AmbientLightManager.OnLightSensorEventListener mOnLightSensorEventListener;
    private android.hardware.SensorManager sensorManager;
    private float darkLightLux = DARK_LUX;
    private float brightLightLux = BRIGHT_LUX;

    public interface OnLightSensorEventListener {

        /* renamed from: com.king.zxing.manager.AmbientLightManager$OnLightSensorEventListener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onSensorChanged(com.king.zxing.manager.AmbientLightManager.OnLightSensorEventListener _this, float f) {
            }
        }

        void onSensorChanged(float f);

        void onSensorChanged(boolean z, float f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    public AmbientLightManager(android.content.Context context) {
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.sensorManager = sensorManager;
        this.lightSensor = sensorManager.getDefaultSensor(5);
        this.isLightSensorEnabled = true;
    }

    public void register() {
        android.hardware.Sensor sensor;
        android.hardware.SensorManager sensorManager = this.sensorManager;
        if (sensorManager == null || (sensor = this.lightSensor) == null) {
            return;
        }
        sensorManager.registerListener(this, sensor, 3);
    }

    public void unregister() {
        android.hardware.SensorManager sensorManager = this.sensorManager;
        if (sensorManager == null || this.lightSensor == null) {
            return;
        }
        sensorManager.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (this.isLightSensorEnabled) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.lastTime < 200) {
                return;
            }
            this.lastTime = currentTimeMillis;
            if (this.mOnLightSensorEventListener != null) {
                float f = sensorEvent.values[0];
                this.mOnLightSensorEventListener.onSensorChanged(f);
                if (f <= this.darkLightLux) {
                    this.mOnLightSensorEventListener.onSensorChanged(true, f);
                } else if (f >= this.brightLightLux) {
                    this.mOnLightSensorEventListener.onSensorChanged(false, f);
                }
            }
        }
    }

    public void setDarkLightLux(float f) {
        this.darkLightLux = f;
    }

    public void setBrightLightLux(float f) {
        this.brightLightLux = f;
    }

    public boolean isLightSensorEnabled() {
        return this.isLightSensorEnabled;
    }

    public void setLightSensorEnabled(boolean z) {
        this.isLightSensorEnabled = z;
    }

    public void setOnLightSensorEventListener(com.king.zxing.manager.AmbientLightManager.OnLightSensorEventListener onLightSensorEventListener) {
        this.mOnLightSensorEventListener = onLightSensorEventListener;
    }
}
