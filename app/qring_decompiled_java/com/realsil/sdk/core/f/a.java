package com.realsil.sdk.core.f;

/* loaded from: classes3.dex */
public abstract class a {
    public boolean a;
    public boolean b;
    public android.bluetooth.BluetoothAdapter c;
    public boolean d;
    public com.realsil.sdk.core.bluetooth.scanner.ScannerParams e;
    public com.realsil.sdk.core.f.a.InterfaceC0068a f;

    /* renamed from: com.realsil.sdk.core.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC0068a {
    }

    public a(android.content.Context context) {
        this.a = false;
        this.b = false;
        this.a = com.realsil.sdk.core.RtkCore.DEBUG;
        this.b = com.realsil.sdk.core.RtkCore.VDBG;
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) context.getSystemService("bluetooth");
        this.c = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
    }

    public boolean a(com.realsil.sdk.core.bluetooth.scanner.ScannerParams scannerParams) {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.c;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            com.realsil.sdk.core.logger.ZLogger.w("BT Adapter is not turned ON");
            return false;
        }
        com.realsil.sdk.core.logger.ZLogger.v(this.b, "LeScanner--startScan");
        if (this.f == null) {
            com.realsil.sdk.core.logger.ZLogger.v(this.b, "no listeners register");
        }
        this.d = true;
        this.e = scannerParams;
        return true;
    }

    public boolean a() {
        com.realsil.sdk.core.f.a.InterfaceC0068a interfaceC0068a = this.f;
        if (interfaceC0068a != null) {
            com.realsil.sdk.core.bluetooth.scanner.LeScannerPresenter.a aVar = (com.realsil.sdk.core.bluetooth.scanner.LeScannerPresenter.a) interfaceC0068a;
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.scanner.LeScannerPresenter.this.b, "onLeScanStop");
            com.realsil.sdk.core.bluetooth.scanner.LeScannerPresenter.this.a(3);
        } else {
            com.realsil.sdk.core.logger.ZLogger.v(this.b, "no listeners register");
        }
        this.d = false;
        return true;
    }

    public final boolean a(com.realsil.sdk.core.bluetooth.scanner.ScannerParams scannerParams, boolean z) {
        if (z) {
            if (!this.c.isEnabled()) {
                com.realsil.sdk.core.logger.ZLogger.d("BT Adapter is not enable");
                return false;
            }
            return a(scannerParams);
        }
        return a();
    }
}
