package com.oudmon.ble.base.communication.entity;

/* loaded from: /tmp/dex/classes2.dex */
public class MessagePushBean {
    private java.lang.String message;
    private long time;

    public MessagePushBean(java.lang.String str, long j) {
        this.message = str;
        this.time = j;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String str) {
        this.message = str;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long j) {
        this.time = j;
    }
}
