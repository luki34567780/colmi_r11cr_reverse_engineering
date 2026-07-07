package com.realsil.sdk.bbpro;

/* loaded from: /tmp/dex/classes2.dex */
public class BeeProManager extends com.realsil.sdk.bbpro.internal.BaseBeeProManager {
    public static volatile com.realsil.sdk.bbpro.BeeProManager G;

    public BeeProManager(android.content.Context context) {
        super(context);
    }

    public static synchronized com.realsil.sdk.bbpro.BeeProManager getInstance(android.content.Context context) {
        com.realsil.sdk.bbpro.BeeProManager beeProManager;
        synchronized (com.realsil.sdk.bbpro.BeeProManager.class) {
            if (G == null) {
                synchronized (com.realsil.sdk.bbpro.BeeProManager.class) {
                    if (G == null) {
                        G = new com.realsil.sdk.bbpro.BeeProManager(context.getApplicationContext());
                    }
                }
            }
            beeProManager = G;
        }
        return beeProManager;
    }

    public final android.bluetooth.BluetoothDevice a(java.lang.String str) {
        android.bluetooth.BluetoothAdapter bluetoothAdapter;
        if (android.text.TextUtils.isEmpty(str) || (bluetoothAdapter = this.a) == null) {
            return null;
        }
        try {
            return bluetoothAdapter.getRemoteDevice(str);
        } catch (java.lang.Exception e) {
            com.realsil.sdk.core.logger.ZLogger.e(e.toString());
            return null;
        }
    }

    public com.realsil.sdk.bbpro.core.BeeError connect(int i, java.lang.String str) {
        return connect(a(str));
    }

    @Override // com.realsil.sdk.bbpro.internal.BaseBeeProManager
    public void destroy() {
        super.destroy();
        G = null;
    }

    public com.realsil.sdk.bbpro.core.BeeError disconnect(int i) {
        return disconnect();
    }

    public android.bluetooth.BluetoothDevice getConnectedDevice() {
        return getConnectedDevice(1);
    }

    public java.lang.String getDeviceLeAddr() {
        com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo = getDeviceInfo();
        return deviceInfo != null ? deviceInfo.getLeAddr() : "";
    }

    public java.lang.String getDeviceLeName() {
        com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo = getDeviceInfo();
        return deviceInfo != null ? deviceInfo.getLeName() : "";
    }

    public java.lang.String getDeviceName() {
        com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo = getDeviceInfo();
        return deviceInfo != null ? deviceInfo.getBrEdrName() : "";
    }

    public boolean isAudioPassthroughEnabled() {
        com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo != null) {
            return deviceInfo.isAptEnabled();
        }
        return false;
    }

    public boolean isConnected(int i) {
        return isConnected();
    }

    public boolean isEqSettingsEnabled() {
        com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo != null) {
            return deviceInfo.isEqSettingsEnabled();
        }
        return false;
    }

    public boolean isOtaOverSppEnabled() {
        com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo != null) {
            return deviceInfo.isSppOtaSupported();
        }
        return false;
    }

    public android.bluetooth.BluetoothDevice getConnectedDevice(int i) {
        android.bluetooth.BluetoothDevice curDevice = getCurDevice();
        if (curDevice != null) {
            return curDevice;
        }
        java.util.List<android.bluetooth.BluetoothDevice> connectedBluetoothDevices = com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.getConnectedBluetoothDevices(i);
        if (connectedBluetoothDevices.size() <= 0) {
            com.realsil.sdk.core.logger.ZLogger.d("no connected device exist.");
            return null;
        }
        for (android.bluetooth.BluetoothDevice bluetoothDevice : connectedBluetoothDevices) {
            if (com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.isConnected(bluetoothDevice)) {
                return bluetoothDevice;
            }
        }
        return null;
    }

    public com.realsil.sdk.bbpro.core.BeeError connect(int i, android.bluetooth.BluetoothDevice bluetoothDevice) {
        return connect(bluetoothDevice);
    }
}
