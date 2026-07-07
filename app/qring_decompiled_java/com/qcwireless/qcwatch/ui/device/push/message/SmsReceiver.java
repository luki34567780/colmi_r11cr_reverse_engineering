package com.qcwireless.qcwatch.ui.device.push.message;

/* compiled from: SmsReceiver.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0005\u0014\u0015\u0016\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "addMessage", "", "msg", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "CallMessage", "Companion", "Contact", "Sms", "SmsInfo", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SmsReceiver extends android.content.BroadcastReceiver {
    public static final boolean D = true;
    private static final java.lang.String PHONE_360_RECEIVED = "com.qiku.android.action.NEW_MESSAGE";
    private static final java.lang.String SMS_RECEIVED = "android.provider.Telephony.SMS_RECEIVED";
    private static final java.lang.String SMS_RECEIVED_NEW = "android.provider.Telephony.SMS_DELIVER";
    private final java.lang.String TAG = getClass().getSimpleName();
    private android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.Companion INSTANCE = new com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.Companion(null);
    private static com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.CallMessage smsMessage = new com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.CallMessage();

    public final android.os.Handler getMHandler() {
        return this.mHandler;
    }

    public final void setMHandler(android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.mHandler = handler;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.Sms sms;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        if ((kotlin.jvm.internal.Intrinsics.areEqual(intent.getAction(), SMS_RECEIVED) || kotlin.jvm.internal.Intrinsics.areEqual(intent.getAction(), SMS_RECEIVED_NEW)) && (sms = INSTANCE.getSms(context, intent)) != null) {
            com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.Contact contact = sms.getContact();
            kotlin.jvm.internal.Intrinsics.checkNotNull(contact);
            java.lang.String replace$default = kotlin.text.StringsKt.replace$default(contact.getDisplayName(), " ", "", false, 4, (java.lang.Object) null);
            java.lang.String body = sms.getBody();
            if (sms.getBody() != null) {
                replace$default = replace$default + ':' + body;
            }
            if (replace$default == null) {
                replace$default = sms.getNumber() + body;
            }
            addMessage(replace$default);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "短信广播收到的短信内容为：" + replace$default);
        }
    }

    private final synchronized void addMessage(java.lang.String msg) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, msg);
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getSmsPushEnable()) {
            synchronized (smsMessage) {
                java.lang.System.currentTimeMillis();
                smsMessage.getLast_receive_time();
                smsMessage.setLast_msg(msg);
                smsMessage.setLast_receive_time(java.lang.System.currentTimeMillis());
                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushSmsMsg(1, msg);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    /* compiled from: SmsReceiver.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver$Sms;", "", "()V", "number", "", "body", "contact", "Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver$Contact;", "(Ljava/lang/String;Ljava/lang/String;Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver$Contact;)V", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "getContact", "()Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver$Contact;", "setContact", "(Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver$Contact;)V", "getNumber", "setNumber", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Sms {
        private java.lang.String body;
        private com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.Contact contact;
        private java.lang.String number;

        public Sms() {
        }

        public Sms(java.lang.String str, java.lang.String str2, com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.Contact contact) {
            this.number = str;
            this.body = str2;
            this.contact = contact;
        }

        public final java.lang.String getNumber() {
            return this.number;
        }

        public final void setNumber(java.lang.String str) {
            this.number = str;
        }

        public final java.lang.String getBody() {
            return this.body;
        }

        public final void setBody(java.lang.String str) {
            this.body = str;
        }

        public final com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.Contact getContact() {
            return this.contact;
        }

        public final void setContact(com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.Contact contact) {
            this.contact = contact;
        }
    }

    /* compiled from: SmsReceiver.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver$Contact;", "", "number", "", "(Ljava/lang/String;)V", "displayName", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "getNumber", "setNumber", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Contact {
        private java.lang.String displayName;
        private java.lang.String number;

        public Contact(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
            this.number = str;
            this.displayName = str;
        }

        public final java.lang.String getNumber() {
            return this.number;
        }

        public final void setNumber(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.number = str;
        }

        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        public final void setDisplayName(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.displayName = str;
        }
    }

    /* compiled from: SmsReceiver.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006\""}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver$SmsInfo;", "", "(Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver;)V", "_id", "", "get_id", "()Ljava/lang/String;", "set_id", "(Ljava/lang/String;)V", "action", "", "getAction", "()I", "setAction", "(I)V", "date", "getDate", "setDate", "person", "getPerson", "setPerson", "read", "getRead", "setRead", "smsAddress", "getSmsAddress", "setSmsAddress", "smsBody", "getSmsBody", "setSmsBody", "thread_id", "getThread_id", "setThread_id", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class SmsInfo {
        private int action;
        private java.lang.String _id = "";
        private java.lang.String thread_id = "";
        private java.lang.String smsAddress = "";
        private java.lang.String smsBody = "";
        private java.lang.String read = "";
        private java.lang.String date = "";
        private java.lang.String person = "";

        public SmsInfo() {
        }

        public final java.lang.String get_id() {
            return this._id;
        }

        public final void set_id(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this._id = str;
        }

        public final java.lang.String getThread_id() {
            return this.thread_id;
        }

        public final void setThread_id(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.thread_id = str;
        }

        public final java.lang.String getSmsAddress() {
            return this.smsAddress;
        }

        public final void setSmsAddress(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.smsAddress = str;
        }

        public final java.lang.String getSmsBody() {
            return this.smsBody;
        }

        public final void setSmsBody(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.smsBody = str;
        }

        public final java.lang.String getRead() {
            return this.read;
        }

        public final void setRead(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.read = str;
        }

        public final java.lang.String getDate() {
            return this.date;
        }

        public final void setDate(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.date = str;
        }

        public final java.lang.String getPerson() {
            return this.person;
        }

        public final void setPerson(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.person = str;
        }

        public final int getAction() {
            return this.action;
        }

        public final void setAction(int i) {
            this.action = i;
        }

        public java.lang.String toString() {
            return "SmsInfo{_id='" + this._id + "', thread_id='" + this.thread_id + "', smsAddress='" + this.smsAddress + "', smsBody='" + this.smsBody + "', read='" + this.read + "', date='" + this.date + "', person='" + this.person + "', action=" + this.action + '}';
        }
    }

    /* compiled from: SmsReceiver.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver$CallMessage;", "", "()V", "last_msg", "", "getLast_msg", "()Ljava/lang/String;", "setLast_msg", "(Ljava/lang/String;)V", "last_receive_time", "", "getLast_receive_time", "()J", "setLast_receive_time", "(J)V", "type", "", "getType", "()I", "setType", "(I)V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class CallMessage {
        private java.lang.String last_msg = "";
        private long last_receive_time;
        private int type;

        public final long getLast_receive_time() {
            return this.last_receive_time;
        }

        public final void setLast_receive_time(long j) {
            this.last_receive_time = j;
        }

        public final java.lang.String getLast_msg() {
            return this.last_msg;
        }

        public final void setLast_msg(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.last_msg = str;
        }

        public final int getType() {
            return this.type;
        }

        public final void setType(int i) {
            this.type = i;
        }
    }

    /* compiled from: SmsReceiver.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver$Companion;", "", "()V", "D", "", "PHONE_360_RECEIVED", "", "SMS_RECEIVED", "SMS_RECEIVED_NEW", "smsMessage", "Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver$CallMessage;", "getSmsMessage", "()Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver$CallMessage;", "setSmsMessage", "(Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver$CallMessage;)V", "getContact", "Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver$Contact;", "context", "Landroid/content/Context;", "phoneNumber", "getSms", "Lcom/qcwireless/qcwatch/ui/device/push/message/SmsReceiver$Sms;", "intent", "Landroid/content/Intent;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.CallMessage getSmsMessage() {
            return com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.smsMessage;
        }

        public final void setSmsMessage(com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.CallMessage callMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callMessage, "<set-?>");
            com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.smsMessage = callMessage;
        }

        public final com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.Sms getSms(android.content.Context context, android.content.Intent intent) {
            java.lang.Object[] objArr;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("");
            android.os.Bundle extras = intent.getExtras();
            if (extras == null || (objArr = (java.lang.Object[]) extras.get("pdus")) == null || objArr.length == 0) {
                return null;
            }
            int length = objArr.length;
            android.telephony.SmsMessage[] smsMessageArr = new android.telephony.SmsMessage[length];
            int length2 = objArr.length;
            for (int i = 0; i < length2; i++) {
                smsMessageArr[i] = android.telephony.SmsMessage.createFromPdu((byte[]) objArr[i]);
            }
            for (int i2 = 0; i2 < length; i2++) {
                android.telephony.SmsMessage smsMessage = smsMessageArr[i2];
                java.lang.String sb3 = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNull(smsMessage);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(sb3, smsMessage.getDisplayOriginatingAddress())) {
                    sb.append(smsMessage.getDisplayOriginatingAddress());
                }
                sb2.append(smsMessage.getDisplayMessageBody());
            }
            java.lang.String sb4 = sb.toString();
            java.lang.String sb5 = sb2.toString();
            java.lang.String sb6 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb6, "number.toString()");
            return new com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.Sms(sb4, sb5, getContact(context, sb6));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
        
            if (r2 == null) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.Contact getContact(android.content.Context r12, java.lang.String r13) {
            /*
                r11 = this;
                java.lang.String r0 = "display_name"
                java.lang.String r1 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
                java.lang.String r1 = "phoneNumber"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
                com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver$Contact r1 = new com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver$Contact
                r1.<init>(r13)
                r2 = r13
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 == 0) goto L1f
                java.lang.String r2 = "Unknown Number"
                r1.setDisplayName(r2)
            L1f:
                r2 = 0
                android.net.Uri r3 = android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                java.lang.String r4 = android.net.Uri.encode(r13)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                android.net.Uri r6 = android.net.Uri.withAppendedPath(r3, r4)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                android.content.ContentResolver r5 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                java.lang.String r12 = "type"
                java.lang.String r3 = "label"
                java.lang.String[] r7 = new java.lang.String[]{r0, r12, r3}     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                r8 = 0
                r9 = 0
                java.lang.String r10 = "display_name LIMIT 1"
                android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                boolean r12 = r2.moveToNext()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                if (r12 == 0) goto L57
                int r12 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                java.lang.String r12 = r2.getString(r12)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                java.lang.String r0 = "cursor.getString(cursor.…honeLookup.DISPLAY_NAME))"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                r1.setDisplayName(r12)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            L57:
                r2.close()
                goto L63
            L5b:
                r12 = move-exception
                goto L64
            L5d:
                r1.setDisplayName(r13)     // Catch: java.lang.Throwable -> L5b
                if (r2 == 0) goto L63
                goto L57
            L63:
                return r1
            L64:
                if (r2 == 0) goto L69
                r2.close()
            L69:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver.Companion.getContact(android.content.Context, java.lang.String):com.qcwireless.qcwatch.ui.device.push.message.SmsReceiver$Contact");
        }
    }
}
