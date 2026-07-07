package com.oudmon.ble.base.communication.bigData.bean;

/* loaded from: /tmp/dex/classes2.dex */
public class ManualHeartRate {
    private java.util.List<com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean> data;
    private int index;

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public java.util.List<com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean> getData() {
        return this.data;
    }

    public void setData(java.util.List<com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean> list) {
        this.data = list;
    }

    public static class DetailBean {
        private int m;
        private int v;

        public int getM() {
            return this.m;
        }

        public void setM(int i) {
            this.m = i;
        }

        public int getV() {
            return this.v;
        }

        public void setV(int i) {
            this.v = i;
        }
    }
}
