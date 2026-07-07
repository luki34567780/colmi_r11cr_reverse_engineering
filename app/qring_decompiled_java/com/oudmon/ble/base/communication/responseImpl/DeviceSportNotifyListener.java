package com.oudmon.ble.base.communication.responseImpl;

/* loaded from: /tmp/dex/classes2.dex */
public class DeviceSportNotifyListener implements com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp> {
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp>> respList = new java.util.concurrent.ConcurrentHashMap<>();

    public void setOutRspIOdmOpResponse(int i, com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp> iCommandResponse) {
        this.respList.put(java.lang.Integer.valueOf(i), iCommandResponse);
        if (this.respList.get(100) != null) {
            removeOtherCallbacks();
        }
    }

    public void removeCallback(int i) {
        this.respList.remove(java.lang.Integer.valueOf(i));
    }

    public void removeOtherCallbacks() {
        this.respList.remove(78);
    }

    @Override // com.oudmon.ble.base.communication.ICommandResponse
    public void onDataResponse(com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp deviceNotifyRsp) {
        java.util.Iterator<com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp>> it = this.respList.values().iterator();
        while (it.hasNext()) {
            it.next().onDataResponse(deviceNotifyRsp);
        }
    }
}
