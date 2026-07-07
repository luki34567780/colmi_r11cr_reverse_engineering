package com.qcwireless.qcwatch.ui.device.push.call;

/* compiled from: MyPhoneStateListener.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/call/MyPhoneStateListener;", "Landroid/telephony/PhoneStateListener;", "()V", "onCallStateChanged", "", "state", "", "phoneNumber", "", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MyPhoneStateListener extends android.telephony.PhoneStateListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.device.push.call.MyPhoneStateListener.Companion INSTANCE = new com.qcwireless.qcwatch.ui.device.push.call.MyPhoneStateListener.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.device.push.call.MyPhoneStateListener> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.push.call.MyPhoneStateListener>() { // from class: com.qcwireless.qcwatch.ui.device.push.call.MyPhoneStateListener$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.device.push.call.MyPhoneStateListener m837invoke() {
            return new com.qcwireless.qcwatch.ui.device.push.call.MyPhoneStateListener();
        }
    });

    @Override // android.telephony.PhoneStateListener
    public void onCallStateChanged(int state, java.lang.String phoneNumber) {
        super.onCallStateChanged(state, phoneNumber);
        if (phoneNumber != null) {
            java.lang.String str = phoneNumber;
            if (kotlin.text.StringsKt.isBlank(str)) {
                return;
            }
            if (state == 0) {
                android.util.Log.d("call", "incoming IDLE, number:" + phoneNumber);
                if (!android.text.TextUtils.isEmpty(str)) {
                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getCallPushEnable()) {
                        com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushCallMsg(4, com.qcwireless.qcwatch.ui.device.push.call.XPhoneStateReceiver.INSTANCE.getDisplayNameByPhone(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT(), phoneNumber));
                        return;
                    }
                    return;
                } else {
                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getCallPushEnable()) {
                        com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushCallMsg(4, "Dialout");
                        return;
                    }
                    return;
                }
            }
            if (state != 1) {
                if (state != 2) {
                    return;
                }
                android.util.Log.d("call", "incoming ACCEPT :" + phoneNumber);
                if (!android.text.TextUtils.isEmpty(str)) {
                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getCallPushEnable()) {
                        com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushCallMsg(4, com.qcwireless.qcwatch.ui.device.push.call.XPhoneStateReceiver.INSTANCE.getDisplayNameByPhone(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT(), phoneNumber));
                        return;
                    }
                    return;
                } else {
                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getCallPushEnable()) {
                        com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushCallMsg(4, "Dialout");
                        return;
                    }
                    return;
                }
            }
            if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
                com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
            }
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "RINGING number:" + phoneNumber);
            if (!android.text.TextUtils.isEmpty(str)) {
                java.lang.String displayNameByPhone = com.qcwireless.qcwatch.ui.device.push.call.XPhoneStateReceiver.INSTANCE.getDisplayNameByPhone(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT(), phoneNumber);
                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getCallPushEnable()) {
                    com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushCallMsg(0, displayNameByPhone);
                    return;
                }
                return;
            }
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getCallPushEnable()) {
                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushCallMsg(0, phoneNumber);
            }
        }
    }

    /* compiled from: MyPhoneStateListener.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/call/MyPhoneStateListener$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/device/push/call/MyPhoneStateListener;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/device/push/call/MyPhoneStateListener;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.device.push.call.MyPhoneStateListener getGetInstance() {
            return (com.qcwireless.qcwatch.ui.device.push.call.MyPhoneStateListener) com.qcwireless.qcwatch.ui.device.push.call.MyPhoneStateListener.getInstance$delegate.getValue();
        }
    }
}
