package com.oudmon.ble.base.bluetooth;

/* loaded from: /tmp/dex/classes2.dex */
public class QCDataParser {
    private static android.util.SparseArray<com.oudmon.ble.base.communication.rsp.BaseRspCmd> tempRspDataSparseArray = new android.util.SparseArray<>();

    public static boolean checkCrc(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < bArr.length - 1; i2++) {
            i += bArr[i2];
        }
        return bArr[bArr.length - 1] == ((byte) (i & 255));
    }

    public static boolean parserAndDispatchReqData(byte[] bArr) {
        com.oudmon.ble.base.communication.ICommandResponse iCommandResponse;
        int i = bArr[0] & (~com.oudmon.ble.base.communication.Constants.FLAG_MASK_ERROR);
        byte b = bArr[0];
        int i2 = com.oudmon.ble.base.communication.Constants.FLAG_MASK_ERROR;
        com.oudmon.ble.base.request.LocalWriteRequest localWriteRequest = com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().getLocalWriteRequestConcurrentHashMap().get(java.lang.Integer.valueOf(i));
        if (localWriteRequest != null && (iCommandResponse = localWriteRequest.getiOpResponse()) != null) {
            com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd = tempRspDataSparseArray.get(i);
            if (baseRspCmd == null) {
                try {
                    baseRspCmd = com.oudmon.ble.base.bluetooth.BeanFactory.createBean(i, localWriteRequest.getType());
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().getLocalWriteRequestConcurrentHashMap().clear();
                }
            }
            if (baseRspCmd != null) {
                if (baseRspCmd.acceptData(java.util.Arrays.copyOfRange(bArr, 1, bArr.length - 1))) {
                    tempRspDataSparseArray.put(i, baseRspCmd);
                    return true;
                }
                iCommandResponse.onDataResponse(baseRspCmd);
                tempRspDataSparseArray.delete(i);
                return true;
            }
        }
        return false;
    }

    public static boolean parserAndDispatchNotifyData(android.util.SparseArray<com.oudmon.ble.base.communication.ICommandResponse> sparseArray, byte[] bArr) {
        int i = bArr[0] & (~com.oudmon.ble.base.communication.Constants.FLAG_MASK_ERROR);
        byte b = bArr[0];
        int i2 = com.oudmon.ble.base.communication.Constants.FLAG_MASK_ERROR;
        com.oudmon.ble.base.communication.ICommandResponse iCommandResponse = sparseArray.get(i);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "notifyKey: " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.qcwireless.qc_utils.bytes.DataTransferUtils.intToBytes(i)));
        if (iCommandResponse != null) {
            com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd = tempRspDataSparseArray.get(i);
            if (baseRspCmd == null) {
                baseRspCmd = com.oudmon.ble.base.bluetooth.BeanFactory.createBean(i, 0);
            }
            if (baseRspCmd != null) {
                if (baseRspCmd.acceptData(java.util.Arrays.copyOfRange(bArr, 1, bArr.length - 1))) {
                    tempRspDataSparseArray.put(i, baseRspCmd);
                    return true;
                }
                iCommandResponse.onDataResponse(baseRspCmd);
                tempRspDataSparseArray.delete(i);
                return true;
            }
        }
        return false;
    }
}
