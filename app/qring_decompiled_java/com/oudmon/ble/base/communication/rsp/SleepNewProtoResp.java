package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class SleepNewProtoResp {
    private int et;
    private java.util.List<com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean> list;
    private int st;

    public int getSt() {
        return this.st;
    }

    public void setSt(int i) {
        this.st = i;
    }

    public int getEt() {
        return this.et;
    }

    public void setEt(int i) {
        this.et = i;
    }

    public java.util.List<com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean> getList() {
        return this.list;
    }

    public void setList(java.util.List<com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean> list) {
        this.list = list;
    }

    public static class DetailBean {
        private int d;
        private int t;

        public int getD() {
            return this.d;
        }

        public void setD(int i) {
            this.d = i;
        }

        public int getT() {
            return this.t;
        }

        public void setT(int i) {
            this.t = i;
        }
    }
}
