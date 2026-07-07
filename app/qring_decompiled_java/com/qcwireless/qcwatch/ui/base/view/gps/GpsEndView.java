package com.qcwireless.qcwatch.ui.base.view.gps;

/* loaded from: /tmp/dex/classes2.dex */
public class GpsEndView extends com.qcwireless.qcwatch.ui.base.view.gps.LockBaseView {
    private com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView.GpsEndListener listener;

    public interface GpsEndListener {
        void gpsEnd();
    }

    public GpsEndView(android.content.Context context) {
        super(context);
    }

    public GpsEndView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
    }

    public com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView.GpsEndListener getListener() {
        return this.listener;
    }

    public void setListener(com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView.GpsEndListener listener) {
        this.listener = listener;
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.gps.LockBaseView
    protected void animBack() {
        com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView.GpsEndListener gpsEndListener;
        super.animBack();
        if (!this.isLock || (gpsEndListener = this.listener) == null) {
            return;
        }
        gpsEndListener.gpsEnd();
    }
}
