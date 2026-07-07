package com.oudmon.ble.base.communication.dfu_temperature;

/* loaded from: /tmp/dex/classes2.dex */
public class TemperatureHandle {
    private static final byte ACTION_ONCE = 38;
    private static final byte ACTION_SERIES = 37;
    private static final java.lang.String TAG = "TemperatureHandle";
    private com.oudmon.ble.base.bluetooth.IBleListener mBleManager;
    private com.oudmon.ble.base.communication.dfu_temperature.TemperatureHandle.HandlerCallback mCallback;
    private byte[] mFileSend;
    private byte[] mReceivedData;
    private boolean mReceiving;
    private static final java.util.UUID SERIAL_PORT_SERVICE = java.util.UUID.fromString("de5bf728-d711-4e47-af26-65e3012a5dc7");
    private static final java.util.UUID SERIAL_PORT_CHARACTER_NOTIFY = java.util.UUID.fromString("de5bf729-d711-4e47-af26-65e3012a5dc7");
    private static final java.util.UUID SERIAL_PORT_CHARACTER_WRITE = java.util.UUID.fromString("de5bf72a-d711-4e47-af26-65e3012a5dc7");
    private short mPocketIndex = 0;
    private int mTotalCount = 0;
    private int mReceivedCount = 0;
    private java.util.List<java.lang.String> mFileNames = new java.util.ArrayList();
    private com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity mTempEntity = new com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity();
    private int mPackageLength = com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength();

    public interface HandlerCallback {
        void onActionResult(int i, int i2);

        void onComplete();

        void onNext(com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity temperatureEntity);

        void onProgress(int i);
    }

    public void endAndRelease() {
    }

    public TemperatureHandle(com.oudmon.ble.base.bluetooth.IBleListener iBleListener) {
        this.mBleManager = iBleListener;
    }

    private void parseReceivedData(byte[] bArr) {
        try {
            android.util.Log.i(TAG, "===========================ParseReceivedData开始============================");
            this.mTempEntity.clear();
            this.mTempEntity.mIndex = bArr[0];
            int i = 1;
            this.mTempEntity.mTimeSpan = bArr[1];
            com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity temperatureEntity = this.mTempEntity;
            if (bArr[1] != 0) {
                i = 1440 / temperatureEntity.mTimeSpan;
            }
            temperatureEntity.mValues = new float[i];
            int i2 = 0;
            for (int i3 = 2; i3 < bArr.length; i3++) {
                int i4 = bArr[i3] & 255;
                if (i4 > 128) {
                    int i5 = i4 - 128;
                    int i6 = 0;
                    while (i6 < i5) {
                        this.mTempEntity.mValues[i2] = 0.0f;
                        i6++;
                        i2++;
                    }
                } else {
                    this.mTempEntity.mValues[i2] = ((bArr[i3] * 1.0f) / 10.0f) + 32.0f;
                    i2++;
                }
            }
            android.util.Log.i(TAG, "mTempEntity: " + this.mTempEntity);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        android.util.Log.i(TAG, "===========================ParseReceivedData结束============================");
    }

    public void init(com.oudmon.ble.base.communication.dfu_temperature.TemperatureHandle.HandlerCallback handlerCallback) {
        this.mCallback = handlerCallback;
    }

    public void startObtainSeries(int i) {
        android.util.Log.i(TAG, "startObtainSeries... ");
        this.mBleManager.execute(getWriteRequest(addHeader(37, new byte[]{(byte) i})));
    }

    @java.lang.Deprecated
    public void testSend() {
        android.util.Log.i(TAG, "testSend... ");
        this.mBleManager.execute(getWriteRequest(addHeader(84, null)));
    }

    private boolean sendNextBigPocket() {
        try {
            short s = this.mPocketIndex;
            int i = s * 1024;
            byte[] bArr = this.mFileSend;
            if (i < bArr.length) {
                int min = java.lang.Math.min(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2, bArr.length - (s * 1024));
                byte[] bArr2 = new byte[min];
                java.lang.System.arraycopy(this.mFileSend, this.mPocketIndex * 1024, bArr2, 0, min);
                byte[] compress = com.oudmon.ble.base.communication.CompressUtils.compress(bArr2);
                byte[] bArr3 = new byte[compress.length + 2];
                java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) (this.mPocketIndex + 1)), 0, bArr3, 0, 2);
                java.lang.System.arraycopy(compress, 0, bArr3, 2, compress.length);
                sendPocketToBle(addHeader(50, bArr3));
                this.mPocketIndex = (short) (this.mPocketIndex + 1);
                return true;
            }
            android.util.Log.i(TAG, "文件发送完毕");
            return false;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            android.util.Log.i(TAG, "文件发送异常: " + e.getMessage());
            return false;
        }
    }

    public void cmdSendPacket() {
        this.mPocketIndex = (short) 0;
        readNextBigPocket();
    }

    private boolean readNextBigPocket() {
        try {
            short s = this.mPocketIndex;
            int i = s * 1024;
            byte[] bArr = this.mFileSend;
            if (i < bArr.length) {
                int min = java.lang.Math.min(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2, bArr.length - (s * 1024));
                byte[] bArr2 = new byte[min];
                java.lang.System.arraycopy(this.mFileSend, this.mPocketIndex * 1024, bArr2, 0, min);
                byte[] compress = com.oudmon.ble.base.communication.CompressUtils.compress(bArr2);
                byte[] bArr3 = new byte[compress.length + 2];
                java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) (this.mPocketIndex + 1)), 0, bArr3, 0, 2);
                java.lang.System.arraycopy(compress, 0, bArr3, 2, compress.length);
                sendPocketToBle(addHeader(50, bArr3));
                this.mPocketIndex = (short) (this.mPocketIndex + 1);
                return true;
            }
            android.util.Log.i(TAG, "文件发送完毕");
            return false;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            android.util.Log.i(TAG, "文件发送异常: " + e.getMessage());
            return false;
        }
    }

    private void sendPocketToBle(byte[] bArr) {
        android.util.Log.i(TAG, "sendPocketToBle: bigPocket=" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bArr));
        int i = 0;
        while (true) {
            int i2 = this.mPackageLength;
            if (i * i2 >= bArr.length) {
                return;
            }
            this.mBleManager.execute(getWriteRequest(java.util.Arrays.copyOfRange(bArr, i * i2, (i * i2) + java.lang.Math.min(i2, bArr.length - (i * i2)))));
            i++;
        }
    }

    private void cmdCheck() {
        this.mBleManager.execute(getWriteRequest(addHeader(51, null)));
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
        com.oudmon.ble.base.request.WriteRequest noRspInstance = com.oudmon.ble.base.request.WriteRequest.getNoRspInstance(SERIAL_PORT_SERVICE, SERIAL_PORT_CHARACTER_WRITE);
        noRspInstance.setValue(bArr);
        return noRspInstance;
    }
}
