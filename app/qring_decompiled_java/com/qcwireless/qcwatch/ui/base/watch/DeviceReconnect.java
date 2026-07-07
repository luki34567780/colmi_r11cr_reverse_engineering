package com.qcwireless.qcwatch.ui.base.watch;

/* compiled from: DeviceReconnect.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/watch/DeviceReconnect;", "", "()V", "connectWithScanValidation", "", "macAddress", "", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DeviceReconnect {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.watch.DeviceReconnect.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.watch.DeviceReconnect.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.watch.DeviceReconnect> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.watch.DeviceReconnect>() { // from class: com.qcwireless.qcwatch.ui.base.watch.DeviceReconnect$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.watch.DeviceReconnect m619invoke() {
            return new com.qcwireless.qcwatch.ui.base.watch.DeviceReconnect(null);
        }
    });

    public /* synthetic */ DeviceReconnect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DeviceReconnect() {
    }

    public final void connectWithScanValidation(java.lang.String macAddress) {
        java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
        if (deviceAddress == null || deviceAddress.length() == 0) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "手环已经解绑,不用重连");
        } else {
            com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().connectDirectly(macAddress);
        }
    }

    /* compiled from: DeviceReconnect.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/watch/DeviceReconnect$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/watch/DeviceReconnect;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/watch/DeviceReconnect;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.watch.DeviceReconnect getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.watch.DeviceReconnect) com.qcwireless.qcwatch.ui.base.watch.DeviceReconnect.getInstance$delegate.getValue();
        }
    }
}
