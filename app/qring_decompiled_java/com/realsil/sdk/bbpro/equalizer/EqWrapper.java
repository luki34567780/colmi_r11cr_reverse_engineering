package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public class EqWrapper {
    public byte[] eqData;
    public byte sampleRate;

    public EqWrapper(byte b, byte[] bArr) {
        this.sampleRate = b;
        this.eqData = bArr;
    }
}
