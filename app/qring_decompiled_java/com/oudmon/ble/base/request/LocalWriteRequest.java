package com.oudmon.ble.base.request;

/* loaded from: /tmp/dex/classes2.dex */
public class LocalWriteRequest<T extends com.oudmon.ble.base.communication.rsp.BaseRspCmd> extends com.oudmon.ble.base.request.WriteRequest {
    private com.oudmon.ble.base.communication.ICommandResponse<T> iOpResponse;
    private int type;

    public LocalWriteRequest(java.util.UUID uuid, java.util.UUID uuid2) {
        super(uuid, uuid2);
    }

    public com.oudmon.ble.base.communication.ICommandResponse<T> getiOpResponse() {
        return this.iOpResponse;
    }

    public void setiOpResponse(com.oudmon.ble.base.communication.ICommandResponse<T> iCommandResponse) {
        this.iOpResponse = iCommandResponse;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }
}
