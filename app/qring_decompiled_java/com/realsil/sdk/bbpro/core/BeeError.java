package com.realsil.sdk.bbpro.core;

/* loaded from: /tmp/dex/classes2.dex */
public class BeeError {
    public static final int ERROR = 1;
    public static final int ERR_CMD_NOT_SUPPORTED = 49;
    public static final int ERR_DEVICE_CONNECT_FAILED = 33;
    public static final int ERR_DEVICE_DISCONNECTED = 32;
    public static final int ERR_OPERATION_FAILED = 17;
    public static final int ERR_PARAMETER_INVALID = 48;
    public static final int ERR_SERVICE_NOT_INITIALIZED = 16;
    public static final int ERR_TRANSPORT_RETRAINS_EXCEED_MAX_TIMES = 64;
    public static final int SUCCESS = 0;
    public int code;
    public java.lang.String message;

    public BeeError(int i) {
        this.code = i;
        this.message = parseError(i);
    }

    public static java.lang.String parseError(int i) {
        return i != 0 ? i != 1 ? i != 16 ? i != 17 ? i != 32 ? i != 33 ? i != 48 ? i != 49 ? i != 64 ? "Unknown" : "retrans exceed max times" : "CMD_NOT_SUPPORTED" : "Parameter invalid" : "Connect device failed" : "Device disconnected" : "operation failed" : "Service not initialized" : "Error" : "Success";
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "%d--%s", java.lang.Integer.valueOf(this.code), this.message);
    }

    public BeeError(int i, java.lang.String str) {
        this.code = i;
        this.message = str;
    }
}
