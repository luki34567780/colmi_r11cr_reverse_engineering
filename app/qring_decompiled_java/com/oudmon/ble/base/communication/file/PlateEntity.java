package com.oudmon.ble.base.communication.file;

/* loaded from: /tmp/dex/classes2.dex */
public class PlateEntity {
    public boolean mDelete;
    public java.lang.String mPlateName;

    public PlateEntity(boolean z, java.lang.String str) {
        this.mDelete = false;
        this.mPlateName = "";
        this.mDelete = z;
        this.mPlateName = str;
    }

    public java.lang.String toString() {
        return "PlateEntity{mDelete=" + this.mDelete + ", mPlateName='" + this.mPlateName + "'}";
    }
}
