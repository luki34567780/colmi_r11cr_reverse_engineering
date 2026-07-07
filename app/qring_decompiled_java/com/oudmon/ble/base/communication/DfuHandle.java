package com.oudmon.ble.base.communication;

/* loaded from: /tmp/dex/classes2.dex */
public class DfuHandle {
    public static final int RSP_CMD_FORMAT = 4;
    public static final int RSP_CMD_STATUS = 3;
    public static final int RSP_DATA_CONTENT = 2;
    public static final int RSP_DATA_SIZE = 1;
    public static final int RSP_INNER = 5;
    public static final int RSP_LOW_BATTERY = 6;
    public static final int RSP_OK = 0;
    private static final java.lang.String TAG = "DfuHandle";
    private static com.oudmon.ble.base.communication.DfuHandle odmHandle;
    private byte[] dfuData;
    private com.oudmon.ble.base.communication.DfuHandle.IOpResult iOpResult;
    public static final java.util.UUID SERIAL_PORT_SERVICE = java.util.UUID.fromString("de5bf728-d711-4e47-af26-65e3012a5dc7");
    public static final java.util.UUID SERIAL_PORT_CHAREACTER_NOTIRY = java.util.UUID.fromString("de5bf729-d711-4e47-af26-65e3012a5dc7");
    public static final java.util.UUID SERIAL_PORT_CHAREACTER_WRITE = java.util.UUID.fromString("de5bf72a-d711-4e47-af26-65e3012a5dc7");
    private com.oudmon.ble.base.bluetooth.OnGattEventCallback localEventCallback = new com.oudmon.ble.base.bluetooth.OnGattEventCallback() { // from class: com.oudmon.ble.base.communication.DfuHandle.1
        @Override // com.oudmon.ble.base.bluetooth.OnGattEventCallback
        public void onReceivedData(java.lang.String str, byte[] bArr) {
            if (bArr != null && com.oudmon.ble.base.communication.DfuHandle.this.checkTheData(bArr)) {
                if (bArr[6] == 0 && bArr[1] == 3) {
                    if (!com.oudmon.ble.base.communication.DfuHandle.this.readNextBigPocket()) {
                        com.oudmon.ble.base.communication.DfuHandle.this.iOpResult.onProgress(100);
                    } else {
                        com.oudmon.ble.base.communication.DfuHandle.this.iOpResult.onProgress(((com.oudmon.ble.base.communication.DfuHandle.this.bigPocketIndex * 1024) * 100) / com.oudmon.ble.base.communication.DfuHandle.this.dfuData.length);
                        return;
                    }
                }
                if (com.oudmon.ble.base.communication.DfuHandle.this.iOpResult != null) {
                    com.oudmon.ble.base.communication.DfuHandle.this.iOpResult.onActionResult(bArr[1], bArr[6]);
                }
            }
        }
    };
    private short dfuFileChecksum = 0;
    private short dfuFileCrc16 = 0;
    private short bigPocketIndex = 0;
    private int mPackageLength = com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength();

    public interface IOpResult {
        void onActionResult(int i, int i2);

        void onProgress(int i);
    }

    private void openNotify() {
    }

    public static com.oudmon.ble.base.communication.DfuHandle getInstance() {
        if (odmHandle == null) {
            synchronized (com.oudmon.ble.base.communication.DfuHandle.class) {
                if (odmHandle == null) {
                    odmHandle = new com.oudmon.ble.base.communication.DfuHandle();
                }
            }
        }
        return odmHandle;
    }

    public void initCallback() {
        this.mPackageLength = com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setCallback(this.localEventCallback);
    }

    public void setBleOperateManagerCallback() {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setCallback(this.localEventCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkTheData(byte[] bArr) {
        android.util.Log.i(TAG, "checkTheData: data=" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bArr));
        if (bArr.length >= 6) {
            if ((bArr[0] & 255) == 188 && com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, 2) == bArr.length - 6) {
                if ((com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, 4) & 65535) == com.oudmon.ble.base.communication.utils.CRC16.calcCrc16(java.util.Arrays.copyOfRange(bArr, 6, bArr.length))) {
                    return true;
                }
                android.util.Log.e(TAG, "checkTheData: CRC 校验失败");
            } else {
                android.util.Log.e(TAG, "checkTheData: 数据长度不一致");
            }
        } else {
            android.util.Log.e(TAG, "checkTheData: 协议长度有问题");
        }
        return false;
    }

    public boolean checkFile(java.lang.String str) {
        java.io.RandomAccessFile randomAccessFile;
        android.util.Log.i("OTA升级调试--", "选择升级文件：" + str);
        if (!new java.io.File(str).exists()) {
            android.util.Log.i("OTA升级调试--", "文件不存在！");
            return false;
        }
        java.io.RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                try {
                    this.dfuFileChecksum = (short) 0;
                    this.dfuFileCrc16 = (short) 0;
                    randomAccessFile = new java.io.RandomAccessFile(str, "r");
                } catch (java.lang.Throwable th) {
                    th = th;
                }
            } catch (java.io.FileNotFoundException e) {
                e = e;
            } catch (java.io.IOException e2) {
                e = e2;
            }
        } catch (java.io.IOException e3) {
            e3.printStackTrace();
        }
        try {
            if (randomAccessFile.length() > 12288000) {
                android.util.Log.i("OTA升级调试--", "文件大小溢出！");
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException e4) {
                    e4.printStackTrace();
                }
                return false;
            }
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            this.dfuData = bArr;
            android.util.Log.i("OTA升级调试--", "start cal check sum.. dataSize=" + this.dfuData.length + "  readSize=" + randomAccessFile.read(bArr, 0, bArr.length));
            this.dfuFileChecksum = (short) 0;
            int i = 0;
            while (true) {
                byte[] bArr2 = this.dfuData;
                if (i >= bArr2.length) {
                    this.dfuFileChecksum = (short) (this.dfuFileChecksum & (-1));
                    this.dfuFileCrc16 = (short) com.oudmon.ble.base.communication.utils.CRC16.calcCrc16(bArr2);
                    android.util.Log.i("OTA升级调试--", "dfuFileChecksum: " + ((int) this.dfuFileChecksum) + ", dfuFileCrc16: " + ((int) this.dfuFileCrc16));
                    try {
                        randomAccessFile.close();
                        return true;
                    } catch (java.io.IOException e5) {
                        e5.printStackTrace();
                        return true;
                    }
                }
                this.dfuFileChecksum = (short) (this.dfuFileChecksum + (bArr2[i] & 255));
                i++;
            }
        } catch (java.io.FileNotFoundException e6) {
            e = e6;
            randomAccessFile2 = randomAccessFile;
            e.printStackTrace();
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            return false;
        } catch (java.io.IOException e7) {
            e = e7;
            randomAccessFile2 = randomAccessFile;
            e.printStackTrace();
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            return false;
        } catch (java.lang.Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (java.io.IOException e8) {
                    e8.printStackTrace();
                }
            }
            throw th;
        }
    }

    public void start(com.oudmon.ble.base.communication.DfuHandle.IOpResult iOpResult) {
        openNotify();
        this.iOpResult = iOpResult;
        setBleOperateManagerCallback();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().execute(getWriteRequest(addHeader(1, null)));
    }

    public void init() {
        setBleOperateManagerCallback();
        byte[] bArr = new byte[9];
        bArr[0] = 1;
        java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.intToBytes(this.dfuData.length), 0, bArr, 1, 4);
        java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes(this.dfuFileCrc16), 0, bArr, 5, 2);
        java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes(this.dfuFileChecksum), 0, bArr, 7, 2);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().execute(getWriteRequest(addHeader(2, bArr)));
    }

    public void sendPacket() {
        this.bigPocketIndex = (short) 0;
        readNextBigPocket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean readNextBigPocket() {
        setBleOperateManagerCallback();
        short s = this.bigPocketIndex;
        int i = s * 1024;
        byte[] bArr = this.dfuData;
        if (i < bArr.length) {
            int min = java.lang.Math.min(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2, bArr.length - (s * 1024)) + 2;
            byte[] bArr2 = new byte[min];
            java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) (this.bigPocketIndex + 1)), 0, bArr2, 0, 2);
            java.lang.System.arraycopy(this.dfuData, this.bigPocketIndex * 1024, bArr2, 2, min - 2);
            sendPocketToBle(addHeader(3, bArr2));
            this.bigPocketIndex = (short) (this.bigPocketIndex + 1);
            return true;
        }
        android.util.Log.i(TAG, "升级包发送完毕");
        return false;
    }

    private void sendPocketToBle(byte[] bArr) {
        android.util.Log.i(TAG, "sendPocketToBle: bigPocket=" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bArr));
        setBleOperateManagerCallback();
        for (int i = 0; this.mPackageLength * i < bArr.length; i++) {
            com.oudmon.ble.base.bluetooth.BleOperateManager bleOperateManager = com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance();
            int i2 = this.mPackageLength;
            bleOperateManager.execute(getWriteRequest(java.util.Arrays.copyOfRange(bArr, i * i2, (i * i2) + java.lang.Math.min(i2, bArr.length - (i * i2)))));
        }
    }

    public void check() {
        setBleOperateManagerCallback();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().execute(getWriteRequest(addHeader(4, null)));
    }

    public void endAndRelease() {
        this.iOpResult = null;
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().execute(getWriteRequest(addHeader(5, null)));
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setCallback(null);
    }

    private byte[] addHeader(int i, byte[] bArr) {
        byte[] bArr2 = new byte[(bArr == null ? 0 : bArr.length) + 6];
        bArr2[0] = -68;
        bArr2[1] = (byte) i;
        if (bArr != null && bArr.length > 0) {
            java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) bArr.length), 0, bArr2, 2, 2);
            java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) com.oudmon.ble.base.communication.utils.CRC16.calcCrc16(bArr)), 0, bArr2, 4, 2);
            java.lang.System.arraycopy(bArr, 0, bArr2, 6, bArr.length);
        } else {
            bArr2[4] = -1;
            bArr2[5] = -1;
        }
        return bArr2;
    }

    private com.oudmon.ble.base.request.WriteRequest getWriteRequest(byte[] bArr) {
        com.oudmon.ble.base.request.WriteRequest noRspInstance = com.oudmon.ble.base.request.WriteRequest.getNoRspInstance(SERIAL_PORT_SERVICE, SERIAL_PORT_CHAREACTER_WRITE);
        noRspInstance.setValue(bArr);
        return noRspInstance;
    }
}
