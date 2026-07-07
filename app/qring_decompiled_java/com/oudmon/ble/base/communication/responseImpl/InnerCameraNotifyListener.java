package com.oudmon.ble.base.communication.responseImpl;

/* loaded from: /tmp/dex/classes2.dex */
public class InnerCameraNotifyListener implements com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.CameraNotifyRsp> {
    private android.content.Context mContext;
    private com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.CameraNotifyRsp> outRspIOdmOpResponse;

    public InnerCameraNotifyListener(android.content.Context context) {
        this.mContext = context;
    }

    public com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.CameraNotifyRsp> getOutRspIOdmOpResponse() {
        return this.outRspIOdmOpResponse;
    }

    public void setOutRspIOdmOpResponse(com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.CameraNotifyRsp> iCommandResponse) {
        this.outRspIOdmOpResponse = iCommandResponse;
    }

    @Override // com.oudmon.ble.base.communication.ICommandResponse
    public void onDataResponse(com.oudmon.ble.base.communication.rsp.CameraNotifyRsp cameraNotifyRsp) {
        com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.CameraNotifyRsp> iCommandResponse = this.outRspIOdmOpResponse;
        if (iCommandResponse != null) {
            iCommandResponse.onDataResponse(cameraNotifyRsp);
        } else if (cameraNotifyRsp.getStatus() == 0) {
            cameraNotifyRsp.getAction();
        }
    }
}
