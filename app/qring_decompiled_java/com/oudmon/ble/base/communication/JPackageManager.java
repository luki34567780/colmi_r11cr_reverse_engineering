package com.oudmon.ble.base.communication;

/* loaded from: /tmp/dex/classes2.dex */
public class JPackageManager {
    private static com.oudmon.ble.base.communication.JPackageManager mInstance;
    private int mLength = 20;

    private JPackageManager() {
    }

    public static com.oudmon.ble.base.communication.JPackageManager getInstance() {
        if (mInstance == null) {
            synchronized (com.oudmon.ble.base.communication.JPackageManager.class) {
                if (mInstance == null) {
                    mInstance = new com.oudmon.ble.base.communication.JPackageManager();
                }
            }
        }
        return mInstance;
    }

    public void setLength(int i) {
        this.mLength = i;
    }

    public int getLength() {
        return java.lang.Math.max(this.mLength, 20);
    }
}
