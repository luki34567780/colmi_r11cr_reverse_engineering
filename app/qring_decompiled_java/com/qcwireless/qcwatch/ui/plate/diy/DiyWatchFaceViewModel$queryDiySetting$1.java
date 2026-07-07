package com.qcwireless.qcwatch.ui.plate.diy;

/* compiled from: DiyWatchFaceViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel$queryDiySetting$1", f = "DiyWatchFaceViewModel.kt", i = {}, l = {485, 485}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class DiyWatchFaceViewModel$queryDiySetting$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $mac;
    final /* synthetic */ int $width;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiyWatchFaceViewModel$queryDiySetting$1(com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel diyWatchFaceViewModel, java.lang.String str, int i, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel$queryDiySetting$1> continuation) {
        super(2, continuation);
        this.this$0 = diyWatchFaceViewModel;
        this.$mac = str;
        this.$width = i;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel$queryDiySetting$1(this.this$0, this.$mac, this.$width, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.Callback callback;
        com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.oudmon.ble.base.communication.file.FileHandle fileHandle = com.oudmon.ble.base.communication.file.FileHandle.getInstance();
            callback = this.this$0.callback;
            fileHandle.registerCallback(callback);
            watchFaceRepository = this.this$0.watchFaceRepository;
            this.label = 1;
            obj = watchFaceRepository.getWatchFaceSetting(this.$mac, (kotlin.coroutines.Continuation) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        final com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel diyWatchFaceViewModel = this.this$0;
        final int i2 = this.$width;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel$queryDiySetting$1.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean diyWatchFaceSettingBean, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                androidx.lifecycle.MutableLiveData mutableLiveData;
                if (diyWatchFaceSettingBean != null) {
                    if (android.text.TextUtils.isEmpty(diyWatchFaceSettingBean.getHourImageUrl()) || diyWatchFaceSettingBean.getHourWidth() == 0 || diyWatchFaceSettingBean.getRadius() == -1 || !com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getPingHwServer()) {
                        com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.this.customDeviceWatchFace(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion(), i2);
                    } else {
                        mutableLiveData = com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.this._uiState;
                        mutableLiveData.postValue(diyWatchFaceSettingBean);
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
