package com.oudmon.ble.base.communication.bigData;

/* loaded from: /tmp/dex/classes2.dex */
public class AlarmNewEntity {
    private java.util.List<com.oudmon.ble.base.communication.bigData.AlarmNewEntity.AlarmBean> data;
    private int total;

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public java.util.List<com.oudmon.ble.base.communication.bigData.AlarmNewEntity.AlarmBean> getData() {
        return this.data;
    }

    public void setData(java.util.List<com.oudmon.ble.base.communication.bigData.AlarmNewEntity.AlarmBean> list) {
        this.data = list;
    }

    public static class AlarmBean {
        private int alarmLength;
        private java.lang.String content;
        private int min;
        private int repeatAndEnable;

        public int getAlarmLength() {
            return this.alarmLength;
        }

        public void setAlarmLength(int i) {
            this.alarmLength = i;
        }

        public int getRepeatAndEnable() {
            return this.repeatAndEnable;
        }

        public void setRepeatAndEnable(int i) {
            this.repeatAndEnable = i;
        }

        public int getMin() {
            return this.min;
        }

        public void setMin(int i) {
            this.min = i;
        }

        public java.lang.String getContent() {
            return this.content;
        }

        public void setContent(java.lang.String str) {
            this.content = str;
        }
    }
}
