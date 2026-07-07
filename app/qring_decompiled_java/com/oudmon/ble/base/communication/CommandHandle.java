package com.oudmon.ble.base.communication;

/* loaded from: /tmp/dex/classes2.dex */
public class CommandHandle {
    private static final java.lang.String TAG = "CommandHandle";
    private static com.oudmon.ble.base.communication.CommandHandle odmHandle;

    public static com.oudmon.ble.base.communication.CommandHandle getInstance() {
        if (odmHandle == null) {
            synchronized (com.oudmon.ble.base.communication.CommandHandle.class) {
                if (odmHandle == null) {
                    odmHandle = new com.oudmon.ble.base.communication.CommandHandle();
                }
            }
        }
        return odmHandle;
    }

    private CommandHandle() {
    }

    private <T extends com.oudmon.ble.base.communication.rsp.BaseRspCmd> com.oudmon.ble.base.request.LocalWriteRequest<T> getWriteRequest(byte[] bArr) {
        com.oudmon.ble.base.request.LocalWriteRequest<T> localWriteRequest = new com.oudmon.ble.base.request.LocalWriteRequest<>(com.oudmon.ble.base.communication.Constants.UUID_SERVICE, com.oudmon.ble.base.communication.Constants.UUID_WRITE);
        localWriteRequest.setValue(bArr);
        return localWriteRequest;
    }

    public com.oudmon.ble.base.request.ReadRequest getReadHwRequest() {
        return new com.oudmon.ble.base.request.ReadRequest(com.oudmon.ble.base.communication.Constants.SERVICE_DEVICE_INFO, com.oudmon.ble.base.communication.Constants.CHAR_HW_REVISION);
    }

    public com.oudmon.ble.base.request.ReadRequest getReadFmRequest() {
        return new com.oudmon.ble.base.request.ReadRequest(com.oudmon.ble.base.communication.Constants.SERVICE_DEVICE_INFO, com.oudmon.ble.base.communication.Constants.CHAR_FIRMWARE_REVISION);
    }

    public void executeReqCmd(com.oudmon.ble.base.communication.req.BaseReqCmd baseReqCmd, com.oudmon.ble.base.communication.ICommandResponse iCommandResponse) {
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "设备已经断开：" + com.oudmon.ble.base.communication.utils.ByteUtil.byteArrayToString(baseReqCmd.getData()));
            return;
        }
        com.oudmon.ble.base.request.LocalWriteRequest writeRequest = getWriteRequest(baseReqCmd.getData());
        int i = writeRequest.getValue()[0] & (~com.oudmon.ble.base.communication.Constants.FLAG_MASK_ERROR);
        writeRequest.setiOpResponse(iCommandResponse);
        if (iCommandResponse != null) {
            com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().getLocalWriteRequestConcurrentHashMap().put(java.lang.Integer.valueOf(i), writeRequest);
        }
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().execute(writeRequest);
    }

    public void executeReqCmdNoCallback(com.oudmon.ble.base.communication.req.BaseReqCmd baseReqCmd) {
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "设备已经断开");
        } else {
            com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().execute(getWriteRequest(baseReqCmd.getData()));
        }
    }

    public void execReadCmd(com.oudmon.ble.base.request.ReadRequest readRequest) {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().execute(readRequest);
    }
}
