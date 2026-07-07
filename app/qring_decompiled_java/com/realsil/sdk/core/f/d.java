package com.realsil.sdk.core.f;

/* loaded from: classes3.dex */
public final class d extends com.realsil.sdk.core.f.a {
    public com.realsil.sdk.core.f.d.a g;

    public class a implements android.bluetooth.BluetoothAdapter.LeScanCallback {
        public a() {
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public final void onLeScan(android.bluetooth.BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            com.realsil.sdk.core.f.d dVar = com.realsil.sdk.core.f.d.this;
            com.realsil.sdk.core.f.a.InterfaceC0068a interfaceC0068a = dVar.f;
            if (interfaceC0068a != null) {
                com.realsil.sdk.core.bluetooth.scanner.LeScannerPresenter.this.a(bluetoothDevice, i, bArr);
            } else {
                com.realsil.sdk.core.logger.ZLogger.v(dVar.b, "no listeners register");
            }
        }
    }

    public d(android.content.Context context) {
        super(context);
        this.g = new com.realsil.sdk.core.f.d.a();
        com.realsil.sdk.core.logger.ZLogger.v(this.b, "LeScannerV19 init");
    }

    @Override // com.realsil.sdk.core.f.a
    public final boolean a(com.realsil.sdk.core.bluetooth.scanner.ScannerParams scannerParams) {
        if (!super.a(scannerParams)) {
            return false;
        }
        java.util.UUID[] uuidArr = null;
        java.util.List<com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter> scanFilters = scannerParams.getScanFilters();
        if (scanFilters != null && scanFilters.size() > 0) {
            boolean z = this.b;
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("contains ");
            a2.append(scanFilters.size());
            a2.append(" filters");
            com.realsil.sdk.core.logger.ZLogger.v(z, a2.toString());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter compatScanFilter : scanFilters) {
                com.realsil.sdk.core.logger.ZLogger.v(compatScanFilter.toString());
                if (compatScanFilter.getServiceUuid() != null) {
                    arrayList.add(compatScanFilter.getServiceUuid());
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                uuidArr = new java.util.UUID[size];
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) != null) {
                        uuidArr[i] = ((android.os.ParcelUuid) arrayList.get(i)).getUuid();
                    }
                }
            }
        }
        try {
            return this.c.startLeScan(uuidArr, this.g);
        } catch (java.lang.Exception e) {
            com.realsil.sdk.core.logger.ZLogger.w(e.toString());
            return false;
        }
    }

    @Override // com.realsil.sdk.core.f.a
    public final boolean a() {
        super.a();
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.c;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            try {
                this.c.stopLeScan(this.g);
                return true;
            } catch (java.lang.Exception e) {
                com.realsil.sdk.core.logger.ZLogger.w(e.toString());
                return false;
            }
        }
        com.realsil.sdk.core.logger.ZLogger.w("BT Adapter is not turned ON");
        return false;
    }
}
