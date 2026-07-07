package com.qcwireless.qcwatch.base.event;

/* compiled from: DeviceGpsDataEvent.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0002\u0010\u0006R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/base/event/DeviceGpsDataEvent;", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "data", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/qcwireless/qcwatch/ui/home/gps/bean/QcLatLon;", "(Landroidx/lifecycle/MutableLiveData;)V", "getData", "()Landroidx/lifecycle/MutableLiveData;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public class DeviceGpsDataEvent extends com.qcwireless.qcwatch.base.event.MessageEvent {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon>> data;

    public DeviceGpsDataEvent(androidx.lifecycle.MutableLiveData<java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon>> mutableLiveData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableLiveData, "data");
        this.data = mutableLiveData;
    }

    public final androidx.lifecycle.MutableLiveData<java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon>> getData() {
        return this.data;
    }
}
