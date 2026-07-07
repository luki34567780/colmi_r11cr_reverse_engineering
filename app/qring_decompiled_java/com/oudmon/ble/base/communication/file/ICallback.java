package com.oudmon.ble.base.communication.file;

/* loaded from: /tmp/dex/classes2.dex */
public interface ICallback {
    public static final java.lang.String TAG = "ICallback";

    void onActionResult(int i, int i2);

    void onComplete();

    void onDeletePlate();

    void onDeletePlateError(int i);

    void onFileNames(java.util.ArrayList<java.lang.String> arrayList);

    void onProgress(int i);

    void onRequestAGPS();

    void onUpdatePlate(java.util.List<com.oudmon.ble.base.communication.file.PlateEntity> list);

    void onUpdatePlateError(int i);

    void onUpdateTemperature(com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity temperatureEntity);

    void onUpdateTemperatureList(java.util.List<com.oudmon.ble.base.communication.dfu_temperature.TemperatureOnceEntity> list);
}
