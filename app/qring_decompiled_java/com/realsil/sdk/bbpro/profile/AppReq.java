package com.realsil.sdk.bbpro.profile;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class AppReq {
    public abstract com.realsil.sdk.bbpro.core.transportlayer.Command encode();

    public abstract com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i);

    public abstract short getCommandId();

    public short getEventId() {
        return (short) 0;
    }
}
