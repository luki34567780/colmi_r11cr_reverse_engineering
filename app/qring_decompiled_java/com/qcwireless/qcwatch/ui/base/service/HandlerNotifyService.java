package com.qcwireless.qcwatch.ui.base.service;

/* compiled from: HandlerNotifyService.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000eH\u0007J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/service/HandlerNotifyService;", "Landroid/app/Service;", "()V", "mLastContext", "", "mTime", "", "qcMessagePushDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcMessagePushDao;", "filterGroupName", "msg", "handlerNotification", "", "sbn", "Landroid/service/notification/StatusBarNotification;", "isSameContext", "", "data", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onEventMainThread", "event", "onStartCommand", "", "flags", "startId", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class HandlerNotifyService extends android.app.Service {
    private static final java.lang.String TAG = "HandlerNotifyService";
    private long mTime = java.lang.System.currentTimeMillis();
    private java.lang.String mLastContext = "";
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcMessagePushDao();

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.Notification initBandNotification = new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
            if (initBandNotification != null) {
                startForeground(com.qcwireless.qcwatch.ui.base.util.NotificationUtils.QCNotification, initBandNotification);
            } else {
                startForeground(com.qcwireless.qcwatch.ui.base.util.NotificationUtils.QCNotification, new android.app.Notification());
            }
        }
        try {
            java.lang.Object systemService = getSystemService("phone");
            if (systemService == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            }
            ((android.telephony.TelephonyManager) systemService).listen(com.qcwireless.qcwatch.ui.device.push.call.MyPhoneStateListener.INSTANCE.getGetInstance(), 32);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(android.service.notification.StatusBarNotification event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMessagePushEnable()) {
            handlerNotification(event);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int flags, int startId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                android.app.Notification initBandNotification = new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
                if (initBandNotification != null) {
                    startForeground(com.qcwireless.qcwatch.ui.base.util.NotificationUtils.QCNotification, initBandNotification);
                } else {
                    startForeground(com.qcwireless.qcwatch.ui.base.util.NotificationUtils.QCNotification, new android.app.Notification());
                }
            }
            return 2;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return 2;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    private final void handlerNotification(final android.service.notification.StatusBarNotification sbn) {
        try {
            final int messagePushSupport = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMessagePushSupport();
            final android.app.Notification notification = sbn.getNotification();
            java.lang.String statusBarNotification = sbn.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(statusBarNotification, "sbn.toString()");
            final java.lang.String packageName = sbn.getPackageName();
            java.lang.CharSequence charSequence = notification.tickerText;
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef.element = notification.extras.getCharSequence("android.title");
            final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef2.element = notification.extras.getCharSequence("android.text");
            if (objectRef.element == null) {
                objectRef.element = "";
            }
            if (objectRef2.element == null) {
                objectRef2.element = "";
            }
            if (android.text.TextUtils.isEmpty(charSequence) || !kotlin.text.StringsKt.equals("misscall", charSequence.toString(), true)) {
                android.util.Log.i(TAG, "handlerNotification.. sbnText: " + statusBarNotification);
                android.util.Log.i(TAG, "handlerNotification.. tickerText: " + ((java.lang.Object) charSequence));
                android.util.Log.i(TAG, "handlerNotification.. extraTitle: " + objectRef.element);
                android.util.Log.i(TAG, "handlerNotification.. extraText: " + objectRef2.element);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                if (kotlin.text.StringsKt.contains$default(packageName, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.wechat, false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.wechat);
                            if (queryByName != null) {
                                if (queryByName.getOpen() != 1) {
                                    return;
                                }
                                if (((java.lang.CharSequence) objectRef2.element).length() > 0) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(objectRef.element);
                                    sb.append(':');
                                    sb.append(objectRef2.element);
                                    com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(3, sb.toString());
                                    return;
                                }
                                if (notification.tickerText != null) {
                                    java.lang.CharSequence charSequence2 = notification.tickerText;
                                    java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                    java.lang.String str = (java.lang.String) charSequence2;
                                    if (android.text.TextUtils.isEmpty(str) || kotlin.text.StringsKt.startsWith$default(str, "语音聊天中, 轻击以继续", false, 2, (java.lang.Object) null)) {
                                        return;
                                    }
                                    com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(3, str);
                                }
                            }
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.qq, false, 2, (java.lang.Object) null)) {
                    android.util.Log.i(TAG, "com.tencent.mobileqq.. tickerText: " + ((java.lang.Object) charSequence));
                    android.util.Log.i(TAG, "com.tencent.mobileqq.. extraTitle: " + objectRef.element);
                    android.util.Log.i(TAG, "com.tencent.mobileqq.. extraText: " + objectRef2.element);
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            boolean isSameContext;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.qq);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (objectRef2.element != null) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(objectRef.element);
                                sb.append(':');
                                sb.append(objectRef2.element);
                                java.lang.String sb2 = sb.toString();
                                if (android.text.TextUtils.isEmpty(sb2)) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(2, sb2);
                                return;
                            }
                            if (objectRef.element != null || objectRef2.element != null) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                sb3.append(objectRef.element);
                                sb3.append(' ');
                                sb3.append(objectRef2.element);
                                java.lang.String sb4 = sb3.toString();
                                isSameContext = handlerNotifyService.isSameContext(sb4);
                                android.util.Log.i("HandlerNotifyService", "com.tencent.mobileqq.. isSame: " + isSameContext);
                                if (kotlin.text.StringsKt.contains$default(sb4, "条新消息", false, 2, (java.lang.Object) null)) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(2, sb4);
                                return;
                            }
                            if (sbn.getId() < 65535) {
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(2, "New message");
                            }
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, "com.twitter", false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.TWITTER);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (notification.tickerText != null) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String filterGroupName = handlerNotifyService.filterGroupName((java.lang.String) charSequence2);
                                if (android.text.TextUtils.isEmpty(filterGroupName)) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(7, filterGroupName);
                                return;
                            }
                            com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(7, "New message");
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, "com.facebook", false, 2, (java.lang.Object) null)) {
                    android.util.Log.i(TAG, "com.facebook.. tickerText: " + ((java.lang.Object) notification.tickerText));
                    android.util.Log.i(TAG, "com.facebook.. EXTRA_TITLE: " + ((java.lang.Object) notification.extras.getCharSequence("android.title")));
                    android.util.Log.i(TAG, "com.facebook.. EXTRA_TEXT: " + ((java.lang.Object) notification.extras.getCharSequence("android.text")));
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            boolean isSameContext;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.FACEBOOK);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (notification.tickerText != null) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String filterGroupName = handlerNotifyService.filterGroupName((java.lang.String) charSequence2);
                                if (android.text.TextUtils.isEmpty(filterGroupName)) {
                                    return;
                                }
                                if ((messagePushSupport & 1) != 0) {
                                    java.lang.String str = packageName;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "packageName");
                                    if (kotlin.text.StringsKt.contains$default(str, "orca", false, 2, (java.lang.Object) null)) {
                                        com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(17, filterGroupName);
                                        return;
                                    } else {
                                        com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(5, filterGroupName);
                                        return;
                                    }
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(5, filterGroupName);
                                return;
                            }
                            if (notification.extras.getCharSequence("android.title") != null || notification.extras.getCharSequence("android.text") != null) {
                                java.lang.String str2 = "" + ((java.lang.Object) notification.extras.getCharSequence("android.text"));
                                isSameContext = handlerNotifyService.isSameContext(str2);
                                android.util.Log.i("HandlerNotifyService", "handlerNotification.. isSame: " + isSameContext);
                                java.lang.String str3 = str2;
                                if (kotlin.text.StringsKt.contains$default(str3, "条新消息", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.contains$default(str3, "开始聊天", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.contains$default(str3, "个对话", false, 2, (java.lang.Object) null)) {
                                    return;
                                }
                                if ((messagePushSupport & 1) != 0) {
                                    java.lang.String str4 = packageName;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "packageName");
                                    if (kotlin.text.StringsKt.contains$default(str4, "orca", false, 2, (java.lang.Object) null)) {
                                        com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(17, str2);
                                        return;
                                    } else {
                                        com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(5, str2);
                                        return;
                                    }
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(5, str2);
                                return;
                            }
                            com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(5, "New message");
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.whatsapp, false, 2, (java.lang.Object) null)) {
                    android.util.Log.i(TAG, "com.whatsapp.. tickerText: " + ((java.lang.Object) notification.tickerText));
                    android.util.Log.i(TAG, "com.whatsapp.. EXTRA_TITLE: " + ((java.lang.Object) notification.extras.getCharSequence("android.title")));
                    android.util.Log.i(TAG, "com.whatsapp.. EXTRA_TEXT: " + ((java.lang.Object) notification.extras.getCharSequence("android.text")));
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            boolean isSameContext;
                            boolean isSameContext2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.whatsapp);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (notification.tickerText != null) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append((java.lang.Object) notification.extras.getCharSequence("android.title"));
                                sb.append(' ');
                                sb.append((java.lang.Object) notification.extras.getCharSequence("android.text"));
                                java.lang.String filterGroupName = handlerNotifyService.filterGroupName(sb.toString());
                                java.lang.String str = filterGroupName;
                                if (android.text.TextUtils.isEmpty(str)) {
                                    return;
                                }
                                isSameContext2 = handlerNotifyService.isSameContext(filterGroupName);
                                android.util.Log.i("HandlerNotifyService", "handlerNotification.. isSame: " + isSameContext2);
                                if (isSameContext2 || kotlin.text.StringsKt.contains$default(str, "条新消息", false, 2, (java.lang.Object) null)) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(6, filterGroupName);
                                return;
                            }
                            if (notification.extras.getCharSequence("android.title") != null || notification.extras.getCharSequence("android.text") != null) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append((java.lang.Object) notification.extras.getCharSequence("android.title"));
                                sb2.append(' ');
                                sb2.append((java.lang.Object) notification.extras.getCharSequence("android.text"));
                                java.lang.String sb3 = sb2.toString();
                                isSameContext = handlerNotifyService.isSameContext(sb3);
                                android.util.Log.i("HandlerNotifyService", "handlerNotification.. isSame: " + isSameContext);
                                if (isSameContext || kotlin.text.StringsKt.contains$default(sb3, "条新消息", false, 2, (java.lang.Object) null)) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(6, sb3);
                                return;
                            }
                            if (sbn.getTag() == null) {
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(6, "New message");
                            }
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, "com.skype", false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao2;
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao3;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            if (kotlin.jvm.internal.Intrinsics.areEqual(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE1, sbn.getPackageName())) {
                                qcMessagePushDao3 = handlerNotifyService.qcMessagePushDao;
                                com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao3.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE1);
                                if (queryByName == null || queryByName.getOpen() != 1) {
                                    return;
                                }
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE2, sbn.getPackageName())) {
                                qcMessagePushDao2 = handlerNotifyService.qcMessagePushDao;
                                com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName2 = qcMessagePushDao2.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE2);
                                if (queryByName2 == null || queryByName2.getOpen() != 1) {
                                    return;
                                }
                            }
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, packageName);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE3, sbn.getPackageName())) {
                                qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                                com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName3 = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE3);
                                if (queryByName3 == null || queryByName3.getOpen() != 1) {
                                    return;
                                }
                            }
                            if (notification.tickerText != null) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String filterGroupName = handlerNotifyService.filterGroupName((java.lang.String) charSequence2);
                                if (!android.text.TextUtils.isEmpty(filterGroupName)) {
                                    com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(8, filterGroupName);
                                }
                            } else if (notification.priority > 0) {
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(8, "New message");
                            }
                            if ((((java.lang.CharSequence) objectRef2.element).length() > 0) && notification.tickerText == null) {
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(8, objectRef2.element.toString());
                            }
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, "jp.naver.line", false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.LINE);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (notification.tickerText != null) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String filterGroupName = handlerNotifyService.filterGroupName((java.lang.String) charSequence2);
                                if (android.text.TextUtils.isEmpty(filterGroupName)) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(9, filterGroupName);
                                return;
                            }
                            com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(9, java.lang.String.valueOf(objectRef2.element));
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.linkedin, false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            boolean isSameContext;
                            boolean isSameContext2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.linkedin);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (!android.text.TextUtils.isEmpty(notification.tickerText) && !notification.tickerText.equals("null")) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String filterGroupName = handlerNotifyService.filterGroupName((java.lang.String) charSequence2);
                                isSameContext2 = handlerNotifyService.isSameContext(filterGroupName);
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "handlerNotification.. linkin: " + isSameContext2);
                                if (isSameContext2) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(10, filterGroupName);
                                return;
                            }
                            if (notification.extras.getCharSequence("android.title") != null || notification.extras.getCharSequence("android.text") != null) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append((java.lang.Object) notification.extras.getCharSequence("android.title"));
                                sb.append(' ');
                                sb.append((java.lang.Object) notification.extras.getCharSequence("android.text"));
                                java.lang.String sb2 = sb.toString();
                                isSameContext = handlerNotifyService.isSameContext(sb2);
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "handlerNotification.. isSame: " + isSameContext);
                                if (isSameContext) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(10, sb2);
                                return;
                            }
                            com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(10, java.lang.String.valueOf(objectRef2.element));
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.instagram, false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.instagram);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (notification.tickerText != null) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String filterGroupName = handlerNotifyService.filterGroupName((java.lang.String) charSequence2);
                                if (android.text.TextUtils.isEmpty(filterGroupName)) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(11, filterGroupName);
                                return;
                            }
                            try {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(objectRef.element);
                                sb.append(' ');
                                sb.append(objectRef2.element);
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(11, sb.toString());
                            } catch (java.lang.Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.tim, false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.tim);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (notification.tickerText != null) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String filterGroupName = handlerNotifyService.filterGroupName((java.lang.String) charSequence2);
                                if (android.text.TextUtils.isEmpty(filterGroupName)) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(12, filterGroupName);
                                return;
                            }
                            com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(12, "New message");
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.snapchat, false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$11
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.snapchat);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (notification.tickerText != null) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String filterGroupName = handlerNotifyService.filterGroupName((java.lang.String) charSequence2);
                                if (android.text.TextUtils.isEmpty(filterGroupName)) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(13, filterGroupName);
                                return;
                            }
                            try {
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(13, objectRef2.element.toString());
                            } catch (java.lang.Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, "com.viber", false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName("com.viber.voip");
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, queryByName);
                            if (notification.tickerText != null) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String filterGroupName = handlerNotifyService.filterGroupName((java.lang.String) charSequence2);
                                if (android.text.TextUtils.isEmpty(filterGroupName)) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, filterGroupName);
                                return;
                            }
                            try {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(objectRef.element);
                                sb.append(' ');
                                sb.append(objectRef2.element);
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, sb.toString());
                            } catch (java.lang.Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, "org.telegram", false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$13
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Telegram);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (notification.tickerText != null) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String filterGroupName = handlerNotifyService.filterGroupName((java.lang.String) charSequence2);
                                if (android.text.TextUtils.isEmpty(filterGroupName)) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, filterGroupName);
                                return;
                            }
                            try {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(objectRef.element);
                                sb.append(' ');
                                sb.append(objectRef2.element);
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, sb.toString());
                            } catch (java.lang.Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.KAKAOTALK, false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$14
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.KAKAOTALK);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (notification.tickerText != null) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String filterGroupName = handlerNotifyService.filterGroupName((java.lang.String) charSequence2);
                                if (android.text.TextUtils.isEmpty(filterGroupName)) {
                                    return;
                                }
                                if ((messagePushSupport & 4) != 0) {
                                    com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(19, filterGroupName);
                                    return;
                                } else {
                                    com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, filterGroupName);
                                    return;
                                }
                            }
                            try {
                                if ((messagePushSupport & 4) != 0) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(objectRef.element);
                                    sb.append(' ');
                                    sb.append(objectRef2.element);
                                    com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(19, sb.toString());
                                } else {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                    sb2.append(objectRef.element);
                                    sb2.append(' ');
                                    sb2.append(objectRef2.element);
                                    com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, sb2.toString());
                                }
                            } catch (java.lang.Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.ZALO, false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$15
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.ZALO);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (notification.tickerText != null) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String filterGroupName = handlerNotifyService.filterGroupName((java.lang.String) charSequence2);
                                if (android.text.TextUtils.isEmpty(filterGroupName)) {
                                    return;
                                }
                                if ((messagePushSupport & 2) != 0) {
                                    com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(18, filterGroupName);
                                    return;
                                } else {
                                    com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, filterGroupName);
                                    return;
                                }
                            }
                            try {
                                if ((messagePushSupport & 2) != 0) {
                                    com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(18, objectRef.element + " :" + objectRef2.element);
                                } else {
                                    com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, objectRef.element + " :" + objectRef2.element);
                                }
                            } catch (java.lang.Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Pinterest, false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$16
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Pinterest);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (notification.tickerText != null) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String str = (java.lang.String) charSequence2;
                                if (android.text.TextUtils.isEmpty(str)) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, str);
                                return;
                            }
                            try {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(objectRef.element);
                                sb.append(' ');
                                sb.append(objectRef2.element);
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, sb.toString());
                            } catch (java.lang.Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Tumblr, false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$17
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Tumblr);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (notification.tickerText != null) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String str = (java.lang.String) charSequence2;
                                if (android.text.TextUtils.isEmpty(str)) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, str);
                                return;
                            }
                            try {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(objectRef.element);
                                sb.append(' ');
                                sb.append(objectRef2.element);
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, sb.toString());
                            } catch (java.lang.Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    return;
                }
                if (kotlin.text.StringsKt.contains$default(packageName, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Gmail, false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$18
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                            qcMessagePushDao = handlerNotifyService.qcMessagePushDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByName = qcMessagePushDao.queryByName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Gmail);
                            if (queryByName == null || queryByName.getOpen() != 1) {
                                return;
                            }
                            if (notification.tickerText != null) {
                                java.lang.CharSequence charSequence2 = notification.tickerText;
                                java.util.Objects.requireNonNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
                                java.lang.String str = (java.lang.String) charSequence2;
                                if (android.text.TextUtils.isEmpty(str)) {
                                    return;
                                }
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, str);
                                return;
                            }
                            try {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(objectRef.element);
                                sb.append(' ');
                                sb.append(objectRef2.element);
                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, sb.toString());
                            } catch (java.lang.Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    return;
                }
                if (!kotlin.text.StringsKt.contains$default(packageName, "sms", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default(packageName, "mms", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default(packageName, "conversations", false, 2, (java.lang.Object) null)) {
                    if (!kotlin.text.StringsKt.contains$default(packageName, "com.android", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default(packageName, "com.samsung.android", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default(statusBarNotification, "sms", false, 2, (java.lang.Object) null)) {
                        if (notification.tickerText != null) {
                            if (kotlin.text.StringsKt.contains$default(packageName, "com.android.mms", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default(packageName, "com.samsung.android.messaging", false, 2, (java.lang.Object) null)) {
                                return;
                            }
                            final kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                            java.lang.Object obj = objectRef2.element;
                            if (obj == null) {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            objectRef3.element = (java.lang.String) obj;
                            objectRef3.element = filterGroupName((java.lang.String) objectRef3.element);
                            if (android.text.TextUtils.isEmpty((java.lang.CharSequence) objectRef3.element)) {
                                return;
                            }
                            boolean isSameContext = isSameContext((java.lang.String) objectRef3.element);
                            android.util.Log.i(TAG, "handlerNotification.. isSame: " + isSameContext + ", mLastContext: " + this.mLastContext);
                            if (isSameContext) {
                                return;
                            }
                            if ((!kotlin.text.StringsKt.contains$default(packageName, "com.tencent.qqmusic", false, 2, (java.lang.Object) null) || !android.text.TextUtils.isEmpty(this.mLastContext)) && !kotlin.text.StringsKt.contains$default(packageName, "com.qcwx", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default(packageName, "com.qcwireless", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default(packageName, "com.app.watch", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default(packageName, "com.wacsoso", false, 2, (java.lang.Object) null)) {
                                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$19
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                                        invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj2);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                                        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getOtherSoftwarePush()) {
                                            com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, (java.lang.String) objectRef3.element);
                                        }
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        try {
                            if (!kotlin.text.StringsKt.contains$default(packageName, "com.qcwx", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default(packageName, "com.qcwireless", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default(packageName, "com.app.watch", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.contains$default(packageName, "com.wacsoso", false, 2, (java.lang.Object) null)) {
                                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService$handlerNotification$20
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                                        invoke((com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService) obj2);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(com.qcwireless.qcwatch.ui.base.service.HandlerNotifyService handlerNotifyService) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerNotifyService, "$this$ktxRunOnBgSingle");
                                        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getOtherSoftwarePush()) {
                                            java.lang.CharSequence charSequence2 = (java.lang.CharSequence) objectRef.element;
                                            if (charSequence2 == null || charSequence2.length() == 0) {
                                                java.lang.CharSequence charSequence3 = (java.lang.CharSequence) objectRef2.element;
                                                if (charSequence3 == null || charSequence3.length() == 0) {
                                                    return;
                                                }
                                            }
                                            java.lang.CharSequence charSequence4 = (java.lang.CharSequence) objectRef2.element;
                                            if (charSequence4 == null || charSequence4.length() == 0) {
                                                com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, java.lang.String.valueOf(objectRef.element));
                                                return;
                                            }
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            sb.append(objectRef.element);
                                            sb.append(':');
                                            sb.append(objectRef2.element);
                                            com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushMsg(14, sb.toString());
                                        }
                                    }
                                });
                                return;
                            }
                            return;
                        } catch (java.lang.Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
                try {
                    if (kotlin.text.StringsKt.contains$default(packageName, "com.miui", false, 2, (java.lang.Object) null)) {
                        return;
                    }
                } catch (java.lang.Exception unused) {
                }
                if (notification.tickerText != null) {
                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getSmsPushEnable()) {
                        java.lang.CharSequence charSequence2 = notification.tickerText;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charSequence2, "notification.tickerText");
                        com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushSmsMsg(1, (java.lang.String) kotlin.text.StringsKt.trim(charSequence2));
                        return;
                    }
                    return;
                }
                if ((((java.lang.CharSequence) objectRef2.element).length() > 0) && com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getSmsPushEnable()) {
                    com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.pushSmsMsgFromTitle(1, kotlin.text.StringsKt.replace$default(java.lang.String.valueOf(objectRef.element), " ", "", false, 4, (java.lang.Object) null) + ':' + objectRef2.element);
                }
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSameContext(java.lang.String data) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.mTime;
        this.mTime = java.lang.System.currentTimeMillis();
        android.util.Log.i(TAG, "isSameContext.. delay: " + currentTimeMillis);
        if (currentTimeMillis > 300000) {
            this.mLastContext = data;
            return false;
        }
        android.util.Log.i(TAG, "isSameContext.. data: " + data);
        android.util.Log.i(TAG, "isSameContext.. mLastContext: " + this.mLastContext);
        boolean equals = android.text.TextUtils.equals(data, this.mLastContext);
        this.mLastContext = data;
        return equals;
    }

    public final java.lang.String filterGroupName(java.lang.String msg) {
        java.lang.String replaceFirst = java.util.regex.Pattern.compile("\\(.+\\):").matcher(msg).replaceFirst(":");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(replaceFirst, "pattern.matcher(msg).replaceFirst(\":\")");
        return replaceFirst;
    }
}
