package com.oudmon.ble.base.bluetooth;

/* loaded from: /tmp/dex/classes2.dex */
public class DeviceManager {
    private static com.oudmon.ble.base.bluetooth.DeviceManager mInstance;
    private java.lang.String mDeviceName = "";
    private java.lang.String mDeviceAddress = "";

    public static com.oudmon.ble.base.bluetooth.DeviceManager getInstance() {
        if (mInstance == null) {
            synchronized (com.oudmon.ble.base.bluetooth.DeviceManager.class) {
                if (mInstance == null) {
                    mInstance = new com.oudmon.ble.base.bluetooth.DeviceManager();
                }
            }
        }
        return mInstance;
    }

    public void reSet() {
        mInstance = null;
        this.mDeviceName = "";
        this.mDeviceAddress = null;
    }

    public java.lang.String getDeviceName() {
        return this.mDeviceName;
    }

    public void setDeviceName(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        this.mDeviceName = str;
    }

    public java.lang.String getDeviceAddress() {
        return this.mDeviceAddress;
    }

    public void setDeviceAddress(java.lang.String str) {
        this.mDeviceAddress = str;
    }
}
