package com.realsil.sdk.core.f;

/* loaded from: classes3.dex */
public final class e extends com.realsil.sdk.core.f.a {
    public android.bluetooth.le.BluetoothLeScanner g;
    public final com.realsil.sdk.core.f.e.a h;

    public class a extends android.bluetooth.le.ScanCallback {
        public a() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> list) {
            super.onBatchScanResults(list);
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onScanFailed(int i) {
            super.onScanFailed(i);
            com.realsil.sdk.core.logger.ZLogger.w(com.realsil.sdk.core.f.e.this.a, "scan failed with " + i);
            com.realsil.sdk.core.f.e eVar = com.realsil.sdk.core.f.e.this;
            com.realsil.sdk.core.f.a.InterfaceC0068a interfaceC0068a = eVar.f;
            if (interfaceC0068a == null) {
                com.realsil.sdk.core.logger.ZLogger.v(eVar.b, "no listeners register");
                return;
            }
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.bluetooth.scanner.LeScannerPresenter.this.b, "onLeScanFailed:" + i);
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onScanResult(int i, android.bluetooth.le.ScanResult scanResult) {
            super.onScanResult(i, scanResult);
            com.realsil.sdk.core.f.e eVar = com.realsil.sdk.core.f.e.this;
            if (eVar.a) {
                eVar.getClass();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("ScanResult{");
                if (scanResult.getDevice() != null) {
                    sb.append(java.lang.String.format("\n\tdevice=%s/%s", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(scanResult.getDevice().getAddress(), true), scanResult.getDevice().getName()));
                }
                if (scanResult.getScanRecord() != null) {
                    sb.append("\n\tscanRecord=");
                    sb.append(com.realsil.sdk.core.f.b.a(scanResult.getScanRecord()));
                }
                sb.append("\n\trssi=");
                sb.append(scanResult.getRssi());
                sb.append("\n\ttimestampNanos=");
                sb.append(scanResult.getTimestampNanos());
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    sb.append("\n\tisLegacy=");
                    sb.append(scanResult.isConnectable());
                    sb.append("\n\tisLegacy=");
                    sb.append(scanResult.isLegacy());
                    sb.append("\n\tprimaryPhy=");
                    sb.append(scanResult.getPrimaryPhy());
                    sb.append("\n\tsecondaryPhy=");
                    sb.append(scanResult.getSecondaryPhy());
                    sb.append("\n\tadvertisingSid=");
                    sb.append(scanResult.getAdvertisingSid());
                    sb.append("\n\ttxPower=");
                    sb.append(scanResult.getTxPower());
                    sb.append("\n\tperiodicAdvertisingInterval=");
                    sb.append(scanResult.getPeriodicAdvertisingInterval());
                }
                sb.append("\n}");
                com.realsil.sdk.core.logger.ZLogger.v(sb.toString());
            }
            com.realsil.sdk.core.f.e eVar2 = com.realsil.sdk.core.f.e.this;
            if (!eVar2.d) {
                com.realsil.sdk.core.logger.ZLogger.v("scan procedure has already been stopped, ignore.");
                return;
            }
            com.realsil.sdk.core.bluetooth.scanner.ScannerParams scannerParams = eVar2.e;
            if (scannerParams != null && scannerParams.isConnectable() && android.os.Build.VERSION.SDK_INT >= 26 && !scanResult.isConnectable()) {
                if (com.realsil.sdk.core.f.e.this.b) {
                    com.realsil.sdk.core.logger.ZLogger.v("ignore noconnectable device");
                    return;
                }
                return;
            }
            android.bluetooth.le.ScanRecord scanRecord = scanResult.getScanRecord();
            com.realsil.sdk.core.f.e eVar3 = com.realsil.sdk.core.f.e.this;
            android.bluetooth.BluetoothDevice device = scanResult.getDevice();
            int rssi = scanResult.getRssi();
            byte[] bytes = scanRecord != null ? scanRecord.getBytes() : new byte[0];
            com.realsil.sdk.core.f.a.InterfaceC0068a interfaceC0068a = eVar3.f;
            if (interfaceC0068a != null) {
                com.realsil.sdk.core.bluetooth.scanner.LeScannerPresenter.this.a(device, rssi, bytes);
            } else {
                com.realsil.sdk.core.logger.ZLogger.v(eVar3.b, "no listeners register");
            }
        }
    }

    public e(android.content.Context context) {
        super(context);
        this.h = new com.realsil.sdk.core.f.e.a();
        com.realsil.sdk.core.logger.ZLogger.v(this.b, "LeScannerV21 init");
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.c;
        if (bluetoothAdapter != null) {
            this.g = bluetoothAdapter.getBluetoothLeScanner();
        }
        if (this.g == null) {
            com.realsil.sdk.core.logger.ZLogger.d("mBluetoothLeScanner == null");
        }
    }

    @Override // com.realsil.sdk.core.f.a
    public final boolean a(com.realsil.sdk.core.bluetooth.scanner.ScannerParams scannerParams) {
        if (!super.a(scannerParams)) {
            com.realsil.sdk.core.logger.ZLogger.w("startScan failed");
            return false;
        }
        if (this.g == null) {
            com.realsil.sdk.core.logger.ZLogger.d("getBluetoothLeScanner...");
            this.g = this.c.getBluetoothLeScanner();
        }
        if (this.g == null) {
            com.realsil.sdk.core.logger.ZLogger.w("mBluetoothLeScanner is null");
            a();
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter> scanFilters = scannerParams.getScanFilters();
        if (scanFilters != null && scanFilters.size() > 0) {
            boolean z = this.b;
            java.lang.StringBuilder a2 = com.realsil.sdk.core.a.a.a("contains ");
            a2.append(scanFilters.size());
            a2.append(" filters");
            com.realsil.sdk.core.logger.ZLogger.v(z, a2.toString());
            for (com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter compatScanFilter : scanFilters) {
                android.bluetooth.le.ScanFilter.Builder builder = new android.bluetooth.le.ScanFilter.Builder();
                builder.setServiceUuid(compatScanFilter.getServiceUuid()).setDeviceAddress(compatScanFilter.getDeviceAddress()).setDeviceName(compatScanFilter.getDeviceName()).setManufacturerData(compatScanFilter.getManufacturerId(), compatScanFilter.getManufacturerData(), compatScanFilter.getManufacturerDataMask());
                if (compatScanFilter.getServiceDataUuid() != null) {
                    builder.setServiceData(compatScanFilter.getServiceDataUuid(), compatScanFilter.getServiceData());
                }
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    builder.setServiceSolicitationUuid(compatScanFilter.getServiceSolicitationUuid());
                }
                arrayList.add(builder.build());
                com.realsil.sdk.core.logger.ZLogger.v(this.b, compatScanFilter.toString());
            }
        }
        android.bluetooth.le.ScanSettings.Builder scanMode = new android.bluetooth.le.ScanSettings.Builder().setScanMode(2);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            scanMode.setPhy(scannerParams.getPhy()).setLegacy(false);
        }
        try {
            this.g.startScan(arrayList, scanMode.build(), this.h);
            return true;
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
            android.bluetooth.le.BluetoothLeScanner bluetoothLeScanner = this.g;
            if (bluetoothLeScanner == null) {
                com.realsil.sdk.core.logger.ZLogger.w("BluetoothLeScanner has not been initialized");
                return false;
            }
            try {
                bluetoothLeScanner.stopScan(this.h);
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
