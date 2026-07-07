package com.qcwireless.qcwatch.ui.base.repository.device;

/* compiled from: OTARepository.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ-\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJE\u0010\u000e\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00110\u00070\u00062\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\n0\u000fj\b\u0012\u0004\u0012\u00020\n`\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/device/OTARepository;", "", "()V", "qcDeviceSettingDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcDeviceSettingDao;", "checkOtaFromServer", "Lkotlinx/coroutines/flow/Flow;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "Lcom/qcwireless/qcwatch/ui/base/bean/response/device/FirmwareOtaResp;", "hardwareVersion", "", "romVersion", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkOtaFromServerChina", "getDeviceMissFileFromServer", "Ljava/util/ArrayList;", "Lcom/qcwireless/qcwatch/ui/base/bean/response/device/DeviceMissFileResp;", "Lkotlin/collections/ArrayList;", "fileNames", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class OTARepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.device.OTARepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.device.OTARepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.device.OTARepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.device.OTARepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.device.OTARepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.device.OTARepository m533invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.device.OTARepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao qcDeviceSettingDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcDeviceSettingDao();

    public final java.lang.Object checkOtaFromServer(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.device.OTARepository$checkOtaFromServer$2(str, str2, null)), new com.qcwireless.qcwatch.ui.base.repository.device.OTARepository$checkOtaFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.device.OTARepository$checkOtaFromServer$4(null));
    }

    public final java.lang.Object checkOtaFromServerChina(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.device.OTARepository$checkOtaFromServerChina$2(str, str2, null)), new com.qcwireless.qcwatch.ui.base.repository.device.OTARepository$checkOtaFromServerChina$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.device.OTARepository$checkOtaFromServerChina$4(null));
    }

    public final java.lang.Object getDeviceMissFileFromServer(java.util.ArrayList<java.lang.String> arrayList, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.ArrayList<com.qcwireless.qcwatch.ui.base.bean.response.device.DeviceMissFileResp>>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.device.OTARepository$getDeviceMissFileFromServer$2(arrayList, null)), new com.qcwireless.qcwatch.ui.base.repository.device.OTARepository$getDeviceMissFileFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.device.OTARepository$getDeviceMissFileFromServer$4(null));
    }

    /* compiled from: OTARepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/device/OTARepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/device/OTARepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/device/OTARepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.device.OTARepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.device.OTARepository) com.qcwireless.qcwatch.ui.base.repository.device.OTARepository.getInstance$delegate.getValue();
        }
    }
}
