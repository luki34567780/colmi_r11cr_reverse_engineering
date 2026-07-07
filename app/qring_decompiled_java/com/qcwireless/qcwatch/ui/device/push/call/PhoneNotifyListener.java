package com.qcwireless.qcwatch.ui.device.push.call;

/* loaded from: /tmp/dex/classes2.dex */
public class PhoneNotifyListener implements com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.PhoneNotifyRsp> {
    private android.content.Context mContext;

    public PhoneNotifyListener(android.content.Context context) {
        this.mContext = context;
    }

    @Override // com.oudmon.ble.base.communication.ICommandResponse
    public void onDataResponse(com.oudmon.ble.base.communication.rsp.PhoneNotifyRsp resultEntity) {
        if (resultEntity.isReject()) {
            rejectCall();
        }
    }

    private void rejectCall() {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                endCall();
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "rejectCall.. SDK(>=29): " + android.os.Build.VERSION.SDK_INT);
                android.telecom.TelecomManager telecomManager = (android.telecom.TelecomManager) java.lang.Class.forName("android.telecom.TelecomManager").getMethod("from", android.content.Context.class).invoke(null, this.mContext);
                if (androidx.core.app.ActivityCompat.checkSelfPermission(this.mContext, com.hjq.permissions.Permission.ANSWER_PHONE_CALLS) == 0) {
                    telecomManager.endCall();
                }
                com.android.internal.telecom.ITelecomService.Stub.asInterface((android.os.IBinder) java.lang.Class.forName("android.os.ServiceManager").getMethod("getService", java.lang.String.class).invoke(null, "telecom")).endCall((java.lang.String) null);
                return;
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "rejectCall.. SDK(<29): " + android.os.Build.VERSION.SDK_INT);
            com.android.internal.telephony.ITelephony.Stub.asInterface((android.os.IBinder) java.lang.Class.forName("android.os.ServiceManager").getMethod("getService", java.lang.String.class).invoke(null, "phone")).endCall();
        } catch (java.lang.ClassNotFoundException e) {
            e = e;
            e.printStackTrace();
        } catch (java.lang.Error e2) {
            e = e2;
            e.printStackTrace();
        } catch (java.lang.NoSuchMethodException e3) {
            e = e3;
            e.printStackTrace();
        } catch (java.lang.Exception e4) {
            e = e4;
            e.printStackTrace();
        }
    }

    private void endCall() {
        try {
            android.telecom.TelecomManager telecomManager = (android.telecom.TelecomManager) this.mContext.getApplicationContext().getSystemService("telecom");
            if (androidx.core.app.ActivityCompat.checkSelfPermission(this.mContext, com.hjq.permissions.Permission.ANSWER_PHONE_CALLS) == 0) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "endCall.. bool: " + telecomManager.endCall());
            } else {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "endCall.. noPermission..");
            }
        } catch (java.lang.Error | java.lang.Exception e) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "endCall.. exception or error..");
            e.printStackTrace();
        }
    }
}
