package com.realsil.sdk.bbpro.vendor;

/* loaded from: classes3.dex */
public abstract class VendorModelCallback extends com.realsil.sdk.bbpro.internal.ModelClientCallback {
    public void onCreateConnectionResponse(byte b) {
    }

    public void onDeviceInfoChanged(int i, com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo) {
    }

    public void onDisconnectResponse(byte b) {
    }

    public void onKeyMapSettingsReported(java.util.List<com.realsil.sdk.bbpro.model.KeyMmiSettings> list) {
    }

    public void onKeyeventReported(int i) {
    }

    public void onListeningModeCycleReported(int i) {
    }

    public void onMultilinkInfoChanged(com.realsil.sdk.bbpro.multilink.MultilinkInfo multilinkInfo) {
    }

    public void onPlayRingtongResponse(byte b) {
    }

    public void onPlayRingtongResult(byte b) {
    }

    public void onProfileConnected(byte b, byte[] bArr) {
    }

    public void onProfileDisconnected(byte b, byte[] bArr) {
    }

    public void onRwsKeyMapSettingsReported(java.util.List<com.realsil.sdk.bbpro.model.KeyMmiSettings> list) {
    }
}
