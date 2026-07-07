package com.oudmon.ble.base.util;

/* loaded from: /tmp/dex/classes2.dex */
public class BleHandler extends android.os.Handler {
    private static final java.lang.String TAG = "BleHandler";
    private static com.oudmon.ble.base.util.BleHandler sHandler;

    public static com.oudmon.ble.base.util.BleHandler of() {
        com.oudmon.ble.base.util.BleHandler bleHandler;
        synchronized (com.oudmon.ble.base.util.BleHandler.class) {
            if (sHandler == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("handler thread");
                handlerThread.start();
                sHandler = new com.oudmon.ble.base.util.BleHandler(handlerThread.getLooper());
            }
            bleHandler = sHandler;
        }
        return bleHandler;
    }

    private BleHandler(android.os.Looper looper) {
        super(android.os.Looper.myLooper());
    }
}
