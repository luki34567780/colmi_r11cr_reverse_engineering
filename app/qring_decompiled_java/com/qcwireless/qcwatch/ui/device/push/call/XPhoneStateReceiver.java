package com.qcwireless.qcwatch.ui.device.push.call;

/* compiled from: XPhoneStateReceiver.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/call/XPhoneStateReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "mApp", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "onReceive", "", "context", "intent", "Landroid/content/Intent;", "Companion", "Contact", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class XPhoneStateReceiver extends android.content.BroadcastReceiver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.device.push.call.XPhoneStateReceiver.Companion INSTANCE = new com.qcwireless.qcwatch.ui.device.push.call.XPhoneStateReceiver.Companion(null);
    private static final java.lang.String TAG = "XPhoneStateReceiver";
    private static boolean inComingFlag;
    private java.lang.ref.WeakReference<android.content.Context> mApp;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            this.mApp = new java.lang.ref.WeakReference<>(context);
            if (kotlin.jvm.internal.Intrinsics.areEqual("android.intent.action.NEW_OUTGOING_CALL", intent.getAction())) {
                java.lang.String stringExtra = intent.getStringExtra("android.intent.extra.PHONE_NUMBER");
                android.util.Log.i(TAG, "OutGoingCall.. phoneNumber: " + stringExtra);
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("incoming_number");
            java.lang.ref.WeakReference<android.content.Context> weakReference = this.mApp;
            if (weakReference == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mApp");
                weakReference = null;
            }
            android.content.Context context2 = weakReference.get();
            java.lang.Object systemService = context2 != null ? context2.getSystemService("phone") : null;
            if (systemService == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            }
            int callState = ((android.telephony.TelephonyManager) systemService).getCallState();
            if (callState == 0) {
                if (inComingFlag) {
                    com.qcwireless.qcwatch.ui.device.push.call.XPhoneStateReceiver.Companion companion = INSTANCE;
                    inComingFlag = false;
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "incoming IDLE, number:" + stringExtra2);
                    if (!android.text.TextUtils.isEmpty(stringExtra2)) {
                        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getCallPushEnable()) {
                            android.content.Context applicationContext = context.getApplicationContext();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                            com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushCallMsg(4, companion.getDisplayNameByPhone(applicationContext, stringExtra2));
                            return;
                        }
                        return;
                    }
                    if (stringExtra2 != null) {
                        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getCallPushEnable()) {
                            com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushCallMsg(4, "Dialout");
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
                return;
            }
            if (callState == 1) {
                if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                    new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
                    com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
                }
                com.qcwireless.qcwatch.ui.device.push.call.XPhoneStateReceiver.Companion companion2 = INSTANCE;
                inComingFlag = true;
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "RINGING :" + stringExtra2);
                if (!android.text.TextUtils.isEmpty(stringExtra2)) {
                    android.content.Context applicationContext2 = context.getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
                    java.lang.String displayNameByPhone = companion2.getDisplayNameByPhone(applicationContext2, stringExtra2);
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, displayNameByPhone);
                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getCallPushEnable()) {
                        com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushCallMsg(0, displayNameByPhone);
                        return;
                    }
                    return;
                }
                if (stringExtra2 == null || !com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getCallPushEnable()) {
                    return;
                }
                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushCallMsg(0, "inComingNumber");
                return;
            }
            if (callState == 2 && inComingFlag) {
                com.qcwireless.qcwatch.ui.device.push.call.XPhoneStateReceiver.Companion companion3 = INSTANCE;
                inComingFlag = false;
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "incoming ACCEPT :" + stringExtra2);
                if (!android.text.TextUtils.isEmpty(stringExtra2)) {
                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getCallPushEnable()) {
                        android.content.Context applicationContext3 = context.getApplicationContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext3, "context.applicationContext");
                        com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushCallMsg(4, companion3.getDisplayNameByPhone(applicationContext3, stringExtra2));
                        return;
                    }
                    return;
                }
                if (stringExtra2 != null) {
                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getCallPushEnable()) {
                        com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushCallMsg(4, "Dialout");
                    }
                } else if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getCallPushEnable()) {
                    com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushCallMsg(4, "Dialout");
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* compiled from: XPhoneStateReceiver.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/call/XPhoneStateReceiver$Contact;", "", "number", "", "(Ljava/lang/String;)V", "displayName", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "getNumber", "setNumber", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Contact {
        private java.lang.String displayName;
        private java.lang.String number;

        public Contact(java.lang.String str) {
            this.number = str;
            this.displayName = str;
        }

        public final java.lang.String getNumber() {
            return this.number;
        }

        public final void setNumber(java.lang.String str) {
            this.number = str;
        }

        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        public final void setDisplayName(java.lang.String str) {
            this.displayName = str;
        }
    }

    /* compiled from: XPhoneStateReceiver.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/call/XPhoneStateReceiver$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "inComingFlag", "", "getDisplayNameByPhone", "context", "Landroid/content/Context;", "phoneNum", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x0059, code lost:
        
            if (r1 == null) goto L17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized java.lang.String getDisplayNameByPhone(android.content.Context r11, java.lang.String r12) {
            /*
                r10 = this;
                monitor-enter(r10)
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)     // Catch: java.lang.Throwable -> Lb6
                com.qcwireless.qcwatch.ui.device.push.call.XPhoneStateReceiver$Contact r0 = new com.qcwireless.qcwatch.ui.device.push.call.XPhoneStateReceiver$Contact     // Catch: java.lang.Throwable -> Lb6
                r0.<init>(r12)     // Catch: java.lang.Throwable -> Lb6
                r1 = r12
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Throwable -> Lb6
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lb6
                if (r1 == 0) goto L19
                java.lang.String r1 = ""
                r0.setDisplayName(r1)     // Catch: java.lang.Throwable -> Lb6
            L19:
                r1 = 0
                android.net.Uri r2 = android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
                java.lang.String r3 = android.net.Uri.encode(r12)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
                android.net.Uri r5 = android.net.Uri.withAppendedPath(r2, r3)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
                android.content.ContentResolver r4 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
                java.lang.String r11 = "display_name"
                java.lang.String r2 = "type"
                java.lang.String r3 = "label"
                java.lang.String[] r6 = new java.lang.String[]{r11, r2, r3}     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
                r7 = 0
                r8 = 0
                java.lang.String r9 = "display_name LIMIT 1"
                android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
                boolean r11 = r1.moveToNext()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
                if (r11 == 0) goto L50
                java.lang.String r11 = "display_name"
                int r11 = r1.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
                java.lang.String r11 = r1.getString(r11)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
                r0.setDisplayName(r11)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            L50:
                r1.close()     // Catch: java.lang.Throwable -> Lb6
                goto L5c
            L54:
                r11 = move-exception
                goto Lb0
            L56:
                r0.setDisplayName(r12)     // Catch: java.lang.Throwable -> L54
                if (r1 == 0) goto L5c
                goto L50
            L5c:
                java.lang.String r11 = ""
                java.lang.String r1 = r0.getDisplayName()     // Catch: java.lang.Throwable -> Lb6
                boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r1)     // Catch: java.lang.Throwable -> Lb6
                if (r11 != 0) goto Lae
                java.lang.String r11 = r0.getDisplayName()     // Catch: java.lang.Throwable -> Lb6
                if (r11 == 0) goto Lae
                java.lang.String r11 = r0.getDisplayName()     // Catch: java.lang.Throwable -> Lb6
                kotlin.jvm.internal.Intrinsics.checkNotNull(r11)     // Catch: java.lang.Throwable -> Lb6
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch: java.lang.Throwable -> Lb6
                int r12 = r11.length()     // Catch: java.lang.Throwable -> Lb6
                r0 = 1
                int r12 = r12 - r0
                r1 = 0
                r2 = 0
                r3 = 0
            L80:
                if (r2 > r12) goto La5
                if (r3 != 0) goto L86
                r4 = r2
                goto L87
            L86:
                r4 = r12
            L87:
                char r4 = r11.charAt(r4)     // Catch: java.lang.Throwable -> Lb6
                r5 = 32
                int r4 = kotlin.jvm.internal.Intrinsics.compare(r4, r5)     // Catch: java.lang.Throwable -> Lb6
                if (r4 > 0) goto L95
                r4 = 1
                goto L96
            L95:
                r4 = 0
            L96:
                if (r3 != 0) goto L9f
                if (r4 != 0) goto L9c
                r3 = 1
                goto L80
            L9c:
                int r2 = r2 + 1
                goto L80
            L9f:
                if (r4 != 0) goto La2
                goto La5
            La2:
                int r12 = r12 + (-1)
                goto L80
            La5:
                int r12 = r12 + r0
                java.lang.CharSequence r11 = r11.subSequence(r2, r12)     // Catch: java.lang.Throwable -> Lb6
                java.lang.String r12 = r11.toString()     // Catch: java.lang.Throwable -> Lb6
            Lae:
                monitor-exit(r10)
                return r12
            Lb0:
                if (r1 == 0) goto Lb5
                r1.close()     // Catch: java.lang.Throwable -> Lb6
            Lb5:
                throw r11     // Catch: java.lang.Throwable -> Lb6
            Lb6:
                r11 = move-exception
                monitor-exit(r10)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.push.call.XPhoneStateReceiver.Companion.getDisplayNameByPhone(android.content.Context, java.lang.String):java.lang.String");
        }
    }
}
