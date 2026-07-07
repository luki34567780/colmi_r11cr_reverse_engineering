package com.qcwireless.qcwatch.ui.base.repository.device;

/* compiled from: MessagePushRepository.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0011\u0010\t\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/device/MessagePushRepository;", "", "()V", "qcMessagePushDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcMessagePushDao;", "deleteByPackageName", "", "name", "", "downAndroidOtherSoftwarePushFromServer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initData", "queryByOpen", "", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/MessagePushEntity;", "open", "", "queryByPackageName", "querySoftwareOpen", "saveData", "entity", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MessagePushRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository m531invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcMessagePushDao qcMessagePushDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcMessagePushDao();

    public final void initData() {
        if (queryByPackageName(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.ZALO) == null) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "message push init --facebook");
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.FACEBOOK, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.FACEBOOK_1, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.KAKAOTALK, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.LINE, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE1, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE2, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE3, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.TWITTER, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Telegram, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity("com.viber.voip", 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.linkedin, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.qq, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.whatsapp, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.instagram, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.snapchat, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.tim, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.wechat, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Tumblr, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Pinterest, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Gmail, 1));
            saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.ZALO, 1));
        }
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity> querySoftwareOpen() {
        return this.qcMessagePushDao.queryByStatus();
    }

    public final void saveData(com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        this.qcMessagePushDao.insert(entity);
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByPackageName(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return this.qcMessagePushDao.queryByName(name);
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity> queryByOpen(int open) {
        return this.qcMessagePushDao.queryByOpen(open);
    }

    public final void deleteByPackageName(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.qcMessagePushDao.deleteByPackageName(name);
    }

    public final java.lang.Object downAndroidOtherSoftwarePushFromServer(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$2(null)), new com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$4(null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository$downAndroidOtherSoftwarePushFromServer$5
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.device.AndroidMessagePush>>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.device.AndroidMessagePush>> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.device.AndroidMessagePush> isSuccess;
                try {
                    if (netState.getRetCode() == 0 && (isSuccess = netState.isSuccess()) != null) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, isSuccess);
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    /* compiled from: MessagePushRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/device/MessagePushRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/device/MessagePushRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/device/MessagePushRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository) com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository.getInstance$delegate.getValue();
        }
    }
}
