package com.qcwireless.qcwatch.ui.plate.diy;

/* compiled from: DiyWatchFaceViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel$customDeviceWatchFace$1", f = "DiyWatchFaceViewModel.kt", i = {}, l = {369, 369}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class DiyWatchFaceViewModel$customDeviceWatchFace$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $hwVersion;
    final /* synthetic */ int $width;
    int I$0;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiyWatchFaceViewModel$customDeviceWatchFace$1(com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel diyWatchFaceViewModel, java.lang.String str, int i, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel$customDeviceWatchFace$1> continuation) {
        super(2, continuation);
        this.this$0 = diyWatchFaceViewModel;
        this.$hwVersion = str;
        this.$width = i;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel$customDeviceWatchFace$1(this.this$0, this.$hwVersion, this.$width, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository;
        final com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel diyWatchFaceViewModel;
        final int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            watchFaceRepository = this.this$0.watchFaceRepository;
            java.lang.String str = this.$hwVersion;
            com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel diyWatchFaceViewModel2 = this.this$0;
            int i3 = this.$width;
            this.L$0 = diyWatchFaceViewModel2;
            this.I$0 = i3;
            this.label = 1;
            obj = watchFaceRepository.getCustomWatchFaceParams(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            diyWatchFaceViewModel = diyWatchFaceViewModel2;
            i = i3;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            diyWatchFaceViewModel = (com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.flow.FlowCollector flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel$customDeviceWatchFace$1$1$1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<com.qcwireless.qcwatch.ui.base.bean.response.device.CustomDialResp>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<com.qcwireless.qcwatch.ui.base.bean.response.device.CustomDialResp> watchFaceState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean diyWatchFaceSettingBean;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository2;
                if (watchFaceState.isSuccess() != null) {
                    com.qcwireless.qcwatch.ui.base.bean.response.device.CustomDialResp isSuccess = watchFaceState.isSuccess();
                    com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean diyWatchFaceSettingBean2 = new com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean(0, 0, 0, 0, 0, 0, null, null, null, 0, 0, null, null, 0, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, null, null, 0, 0, 0, 0, null, null, 0, -1, 255, null);
                    com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.this.setZoom((isSuccess.getWidth() < 360 || i > 720) ? 2 : 1);
                    if (com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.this.getZoom() == 1) {
                        diyWatchFaceSettingBean = diyWatchFaceSettingBean2;
                        diyWatchFaceSettingBean.setRadius(isSuccess.getRadius());
                    } else {
                        diyWatchFaceSettingBean = diyWatchFaceSettingBean2;
                        if (com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.this.getZoom() == 2) {
                            diyWatchFaceSettingBean.setRadius(isSuccess.getRadius() * 2);
                        }
                    }
                    diyWatchFaceSettingBean.setRoom(com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.this.getZoom());
                    java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.device.CustomDialResp.ElementUI> elements = isSuccess.getElements();
                    if (elements != null) {
                        watchFaceRepository2 = com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.this.watchFaceRepository;
                        watchFaceRepository2.downloadCustomImage(watchFaceState.isSuccess().getBgImage(), elements, isSuccess.getWidth(), isSuccess.getHeight());
                        com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel diyWatchFaceViewModel3 = com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.this;
                        for (com.qcwireless.qcwatch.ui.base.bean.response.device.CustomDialResp.ElementUI elementUI : elements) {
                            int type = elementUI.getType();
                            if (type == 1) {
                                diyWatchFaceSettingBean.setHourLeft(elementUI.getX() * diyWatchFaceViewModel3.getZoom());
                                diyWatchFaceSettingBean.setHourTop(elementUI.getY() * diyWatchFaceViewModel3.getZoom());
                                diyWatchFaceSettingBean.setHourImageUrl(elementUI.getImageUrl());
                                diyWatchFaceSettingBean.setHourWidth(elementUI.getW());
                                diyWatchFaceSettingBean.setHourHeight(elementUI.getH());
                            } else if (type == 2) {
                                diyWatchFaceSettingBean.setBatteryLeft(elementUI.getX() * diyWatchFaceViewModel3.getZoom());
                                diyWatchFaceSettingBean.setBatteryTop(elementUI.getY() * diyWatchFaceViewModel3.getZoom());
                                diyWatchFaceSettingBean.setBatteryImageUrl(elementUI.getImageUrl());
                                diyWatchFaceSettingBean.setBatteryWidth(elementUI.getW());
                                diyWatchFaceSettingBean.setBatteryHeight(elementUI.getH());
                            } else if (type == 3) {
                                diyWatchFaceSettingBean.setDataLeft(elementUI.getX() * diyWatchFaceViewModel3.getZoom());
                                diyWatchFaceSettingBean.setDataTop(elementUI.getY() * diyWatchFaceViewModel3.getZoom());
                                diyWatchFaceSettingBean.setDataImageUrl(elementUI.getImageUrl());
                                diyWatchFaceSettingBean.setStepIconUrl(elementUI.getImageUrl());
                                diyWatchFaceSettingBean.setDataWidth(elementUI.getW());
                                diyWatchFaceSettingBean.setDataHeight(elementUI.getH());
                            } else if (type != 401) {
                                switch (type) {
                                    case 301:
                                        diyWatchFaceSettingBean.setCalorieIconUrl(elementUI.getImageUrl());
                                        break;
                                    case 302:
                                        diyWatchFaceSettingBean.setWeatherIconUrl(elementUI.getImageUrl());
                                        break;
                                    case 303:
                                        diyWatchFaceSettingBean.setHeartIconUrl(elementUI.getImageUrl());
                                        break;
                                }
                            } else {
                                diyWatchFaceSettingBean.setNeedleBg(elementUI.getImageUrl());
                            }
                        }
                    }
                    diyWatchFaceSettingBean.setWatchScreenType(isSuccess.getDisplay());
                    diyWatchFaceSettingBean.setWatchWidth(isSuccess.getWidth() * com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.this.getZoom());
                    diyWatchFaceSettingBean.setWatchHeight(isSuccess.getHeight() * com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.this.getZoom());
                    diyWatchFaceSettingBean.setImageUrl(isSuccess.getBgImage());
                    mutableLiveData = com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.this._uiState;
                    mutableLiveData.postValue(diyWatchFaceSettingBean);
                }
                return kotlin.Unit.INSTANCE;
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(flowCollector, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
