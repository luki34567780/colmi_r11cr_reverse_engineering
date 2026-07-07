package com.oudmon.ble.base.communication.file;

/* loaded from: /tmp/dex/classes2.dex */
public class SimpleCallback implements com.oudmon.ble.base.communication.file.ICallback {
    @Override // com.oudmon.ble.base.communication.file.ICallback
    public void onDeletePlate() {
    }

    @Override // com.oudmon.ble.base.communication.file.ICallback
    public void onDeletePlateError(int i) {
    }

    @Override // com.oudmon.ble.base.communication.file.ICallback
    public void onUpdatePlate(java.util.List<com.oudmon.ble.base.communication.file.PlateEntity> list) {
    }

    @Override // com.oudmon.ble.base.communication.file.ICallback
    public void onUpdatePlateError(int i) {
    }

    @Override // com.oudmon.ble.base.communication.file.ICallback
    public void onRequestAGPS() {
        android.util.Log.i(com.oudmon.ble.base.communication.file.ICallback.TAG, "onRequestAGPS..");
    }

    @Override // com.oudmon.ble.base.communication.file.ICallback
    public void onUpdateTemperature(com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity temperatureEntity) {
        android.util.Log.i(com.oudmon.ble.base.communication.file.ICallback.TAG, "onUpdateTemperature..");
    }

    @Override // com.oudmon.ble.base.communication.file.ICallback
    public void onUpdateTemperatureList(java.util.List<com.oudmon.ble.base.communication.dfu_temperature.TemperatureOnceEntity> list) {
        android.util.Log.i(com.oudmon.ble.base.communication.file.ICallback.TAG, "onUpdateTemperatureList..");
    }

    @Override // com.oudmon.ble.base.communication.file.ICallback
    public void onFileNames(java.util.ArrayList<java.lang.String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, arrayList);
    }

    @Override // com.oudmon.ble.base.communication.file.ICallback
    public void onProgress(int i) {
        android.util.Log.i(com.oudmon.ble.base.communication.file.ICallback.TAG, "onProgress..");
    }

    @Override // com.oudmon.ble.base.communication.file.ICallback
    public void onComplete() {
        android.util.Log.i(com.oudmon.ble.base.communication.file.ICallback.TAG, "onComplete..");
    }

    @Override // com.oudmon.ble.base.communication.file.ICallback
    public void onActionResult(int i, int i2) {
        android.util.Log.i(com.oudmon.ble.base.communication.file.ICallback.TAG, "onActionResult..");
    }
}
