package com.oudmon.ble.base.bluetooth;

/* loaded from: /tmp/dex/classes2.dex */
public class LargeDataParser {
    private static com.oudmon.ble.base.bluetooth.LargeDataParser instance = null;
    public static java.lang.String uuid_notify = "de5bf729-d711-4e47-af26-65e3012a5dc7";
    public int dataLength = 0;
    public byte[] tempData;

    private LargeDataParser() {
    }

    public static com.oudmon.ble.base.bluetooth.LargeDataParser getInstance() {
        if (instance == null) {
            synchronized (com.oudmon.ble.base.bluetooth.LargeDataParser.class) {
                if (instance == null) {
                    instance = new com.oudmon.ble.base.bluetooth.LargeDataParser();
                }
            }
        }
        return instance;
    }

    public void parseBigLargeData(java.lang.String str, byte[] bArr) {
        if (uuid_notify.equals(str)) {
            if (bArr.length >= 6 && (bArr[0] & 255) == 188) {
                int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 2, 4));
                this.dataLength = bytesToInt;
                if (bArr.length - 6 >= bytesToInt) {
                    byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, 0, bArr.length);
                    this.tempData = copyOfRange;
                    parseData(copyOfRange);
                    this.tempData = new byte[0];
                    return;
                }
                this.tempData = java.util.Arrays.copyOfRange(bArr, 0, bArr.length);
                return;
            }
            byte[] concat = com.oudmon.ble.base.communication.utils.ByteUtil.concat(this.tempData, bArr);
            this.tempData = concat;
            if (concat.length - 6 == this.dataLength) {
                parseData(concat);
                this.tempData = new byte[0];
            }
        }
    }

    public void parseData(byte[] bArr) {
        com.oudmon.ble.base.communication.ILargeDataResponse iLargeDataResponse;
        byte b = bArr[1];
        if ((bArr[0] & 255) != 188 || (iLargeDataResponse = com.oudmon.ble.base.communication.LargeDataHandler.getInstance().getRespMap().get(java.lang.Integer.valueOf(b))) == null) {
            return;
        }
        iLargeDataResponse.parseData(b, bArr);
    }
}
