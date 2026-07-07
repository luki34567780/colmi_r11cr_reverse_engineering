package com.oudmon.ble.base.bluetooth.spp;

/* loaded from: /tmp/dex/classes2.dex */
public interface SerialListener {
    void onSerialConnect();

    void onSerialConnectError(java.lang.Exception exc);

    void onSerialIoError(java.lang.Exception exc);

    void onSerialRead(java.util.ArrayDeque<byte[]> arrayDeque);

    void onSerialRead(byte[] bArr);
}
