package com.oudmon.ble.base.bluetooth.queue;

/* loaded from: /tmp/dex/classes2.dex */
public class BleConsumer extends java.lang.Thread {
    java.util.concurrent.BlockingQueue<com.oudmon.ble.base.bluetooth.queue.BleDataBean> blockingQueue;
    private static final java.util.UUID SERIAL_PORT_SERVICE = java.util.UUID.fromString("de5bf728-d711-4e47-af26-65e3012a5dc7");
    private static final java.util.UUID SERIAL_PORT_CHARACTER_NOTIFY = java.util.UUID.fromString("de5bf729-d711-4e47-af26-65e3012a5dc7");
    private static final java.util.UUID SERIAL_PORT_CHARACTER_WRITE = java.util.UUID.fromString("de5bf72a-d711-4e47-af26-65e3012a5dc7");

    public BleConsumer(java.lang.String str, java.util.concurrent.BlockingQueue<com.oudmon.ble.base.bluetooth.queue.BleDataBean> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                com.oudmon.ble.base.bluetooth.queue.BleDataBean take = this.blockingQueue.take();
                int i = 0;
                int subLength = take.getSubLength();
                while (true) {
                    int i2 = i * subLength;
                    if (i2 < take.getData().length) {
                        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().execute(getWriteRequest(java.util.Arrays.copyOfRange(take.getData(), i2, java.lang.Math.min(subLength, take.getData().length - i2) + i2)));
                        i++;
                    }
                }
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
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

    public com.oudmon.ble.base.request.WriteRequest getWriteRequest(byte[] bArr) {
        com.oudmon.ble.base.request.WriteRequest noRspInstance = com.oudmon.ble.base.request.WriteRequest.getNoRspInstance(SERIAL_PORT_SERVICE, SERIAL_PORT_CHARACTER_WRITE);
        noRspInstance.setValue(bArr);
        return noRspInstance;
    }
}
