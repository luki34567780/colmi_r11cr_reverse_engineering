package com.realsil.sdk.bbpro.core.gatt;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class BaseChannel {
    public static final int STATE_CONNECTED = 3;
    public static final int STATE_CONNECTING = 2;
    public static final int STATE_DISCONNECTED = 1;
    public static final int STATE_DISCONNECTING = 4;
    public static final int STATE_INITIAL = 0;
    public android.content.Context a;
    public int b;
    public com.realsil.sdk.bbpro.core.gatt.ChannelCallback c;

    public BaseChannel(android.content.Context context, com.realsil.sdk.bbpro.core.gatt.ChannelCallback channelCallback) {
        this.a = context;
        this.c = channelCallback;
        a();
    }

    public final void a() {
        android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        updateConnectionState(0);
    }

    public int getConnectState() {
        return this.b;
    }

    public android.bluetooth.BluetoothDevice getDevice() {
        return null;
    }

    public boolean isFlowCtrlEnabled() {
        return false;
    }

    public boolean isRxSupported() {
        return true;
    }

    public boolean isRxValidateEnabled() {
        return false;
    }

    public boolean isTxSupported() {
        return true;
    }

    public boolean isTxValidateEnabled() {
        return false;
    }

    public void updateConnectionState(int i) {
        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "%d -> %d", java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(i)));
        this.b = i;
        com.realsil.sdk.bbpro.core.gatt.ChannelCallback channelCallback = this.c;
        if (channelCallback != null) {
            channelCallback.onConnectionStateChange(null, true, i);
        } else {
            com.realsil.sdk.core.logger.ZLogger.w("no channel callback");
        }
    }
}
