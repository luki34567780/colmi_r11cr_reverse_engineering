package com.oudmon.ble.base.communication.bigData.bean;

/* loaded from: /tmp/dex/classes2.dex */
public class ECardEntity {
    int deviceError;
    int readOrWrite;
    boolean support;
    int type;
    java.lang.String url;

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public void setUrl(java.lang.String str) {
        this.url = str;
    }

    public boolean isSupport() {
        return this.support;
    }

    public void setSupport(boolean z) {
        this.support = z;
    }

    public int getDeviceError() {
        return this.deviceError;
    }

    public void setDeviceError(int i) {
        this.deviceError = i;
    }

    public int getReadOrWrite() {
        return this.readOrWrite;
    }

    public void setReadOrWrite(int i) {
        this.readOrWrite = i;
    }
}
