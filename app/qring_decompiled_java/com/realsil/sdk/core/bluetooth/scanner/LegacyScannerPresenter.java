package com.realsil.sdk.core.bluetooth.scanner;

/* loaded from: classes3.dex */
public final class LegacyScannerPresenter extends com.realsil.sdk.core.d.b {
    public LegacyScannerPresenter(android.content.Context context) {
        super(context);
    }

    @Override // com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ android.bluetooth.BluetoothAdapter getBluetoothAdapter() {
        return super.getBluetoothAdapter();
    }

    @Override // com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ java.util.List getPairedDevices() {
        return super.getPairedDevices();
    }

    @Override // com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ java.util.List getPairedDevicesByProfile(int i) {
        return super.getPairedDevicesByProfile(i);
    }

    @Override // com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ int getState() {
        return super.getState();
    }

    @Override // com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ boolean isBluetoothEnabled() {
        return super.isBluetoothEnabled();
    }

    @Override // com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ boolean isBluetoothSupported() {
        return super.isBluetoothSupported();
    }

    @Override // com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ boolean isScanning() {
        return super.isScanning();
    }

    @Override // com.realsil.sdk.core.d.b, com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ boolean scanDevice(boolean z) {
        return super.scanDevice(z);
    }

    @Override // com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ void setScanMode(int i) {
        super.setScanMode(i);
    }

    @Override // com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ void setScannerCallback(com.realsil.sdk.core.bluetooth.scanner.ScannerCallback scannerCallback) {
        super.setScannerCallback(scannerCallback);
    }

    @Override // com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ void setScannerParams(com.realsil.sdk.core.bluetooth.scanner.ScannerParams scannerParams) {
        super.setScannerParams(scannerParams);
    }

    @Override // com.realsil.sdk.core.d.b, com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ boolean startScan() {
        return super.startScan();
    }

    @Override // com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ boolean stopScan() {
        return super.stopScan();
    }

    public LegacyScannerPresenter(android.content.Context context, com.realsil.sdk.core.bluetooth.scanner.ScannerParams scannerParams, com.realsil.sdk.core.bluetooth.scanner.ScannerCallback scannerCallback) {
        super(context, scannerParams, scannerCallback);
    }

    @Override // com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ java.util.List getPairedDevices(int i) {
        return super.getPairedDevices(i);
    }

    @Override // com.realsil.sdk.core.d.a
    public /* bridge */ /* synthetic */ boolean scanDevice(boolean z, boolean z2) {
        return super.scanDevice(z, z2);
    }

    public LegacyScannerPresenter(android.content.Context context, android.os.Handler handler, com.realsil.sdk.core.bluetooth.scanner.ScannerParams scannerParams, com.realsil.sdk.core.bluetooth.scanner.ScannerCallback scannerCallback) {
        super(context, handler, scannerParams, scannerCallback);
    }
}
