package com.oudmon.ble.base.communication;

/* loaded from: /tmp/dex/classes2.dex */
public interface ICommandResponse<T extends com.oudmon.ble.base.communication.rsp.BaseRspCmd> {
    void onDataResponse(T t);
}
