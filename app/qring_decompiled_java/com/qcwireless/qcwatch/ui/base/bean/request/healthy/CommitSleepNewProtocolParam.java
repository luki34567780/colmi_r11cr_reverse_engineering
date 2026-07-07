package com.qcwireless.qcwatch.ui.base.bean.request.healthy;

/* loaded from: /tmp/dex/classes2.dex */
public class CommitSleepNewProtocolParam {
    public java.util.List<com.qcwireless.qcwatch.ui.base.bean.request.healthy.CommitSleepNewProtocolParam.SleepList> data;
    public java.lang.String deviceAddress;
    public java.lang.String deviceName;
    public long uid;

    public static class SleepList {
        public java.lang.String date;
        public java.util.List<com.qcwireless.qcwatch.ui.base.bean.request.healthy.CommitSleepNewProtocolParam.SleepList.SleepDetail> detail;
        public int et;
        public int st;

        public static class SleepDetail {
            public int d;
            public int t;
        }
    }
}
