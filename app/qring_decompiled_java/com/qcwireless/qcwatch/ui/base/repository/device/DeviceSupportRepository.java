package com.qcwireless.qcwatch.ui.base.repository.device;

/* compiled from: DeviceSupportRepository.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u001a\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSupportRepository;", "", "()V", "qcDeviceSettingDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcDeviceSettingDao;", "getDeviceSupport", "Lkotlinx/coroutines/flow/Flow;", "", "", "Lcom/qcwireless/qcwatch/ui/home/drag/helper/ItemEntity;", "mac", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveDeviceSupport", "", "deviceSupport", "saveDragSelectDeviceSupport", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DeviceSupportRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository m529invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao qcDeviceSettingDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcDeviceSettingDao();

    public final java.lang.Object getDeviceSupport(java.lang.String str, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity>>> continuation) {
        final kotlinx.coroutines.flow.Flow flow = kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$2(this, str, null));
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(new kotlinx.coroutines.flow.Flow<java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity>>() { // from class: com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$$inlined$map$1
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation2) {
                java.lang.Object collect = flow.collect(new com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$$inlined$map$1.AnonymousClass2(flowCollector), continuation2);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$$inlined$map$1$2", f = "DeviceSupportRepository.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                /* renamed from: com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= com.bumptech.glide.request.target.Target.SIZE_ORIGINAL;
                        return com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$$inlined$map$1.AnonymousClass2.this.emit(null, (kotlin.coroutines.Continuation) this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r7
                        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$$inlined$map$1$2$1 r0 = (com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r7 = r0.label
                        int r7 = r7 - r2
                        r0.label = r7
                        goto L19
                    L14:
                        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$$inlined$map$1$2$1 r0 = new com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L19:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L65
                    L2a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L32:
                        kotlin.ResultKt.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity r6 = (com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity) r6
                        java.lang.String r6 = r6.getContent()
                        com.qcwireless.qcwatch.base.utils.MoshiUtils r2 = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE
                        com.squareup.moshi.Moshi r2 = r2.getMoshiBuild()
                        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$lambda-0$$inlined$fromJson$1 r4 = new com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$lambda-0$$inlined$fromJson$1
                        r4.<init>()
                        java.lang.reflect.Type r4 = r4.getType()
                        com.squareup.moshi.JsonAdapter r2 = r2.adapter(r4)
                        java.lang.String r4 = "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)"
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
                        java.lang.Object r6 = r2.fromJson(r6)
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L65
                        return r1
                    L65:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }
        }, new com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$4(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$getDeviceSupport$5(this, str, null));
    }

    public final void saveDeviceSupport(final java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> deviceSupport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSupport, "deviceSupport");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingleAnother(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$saveDeviceSupport$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository deviceSupportRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao qcDeviceSettingDao;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSupportRepository, "$this$ktxRunOnBgSingleAnother");
                try {
                    com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity deviceSettingEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.DeviceSupport, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(deviceSupport));
                    qcDeviceSettingDao = deviceSupportRepository.qcDeviceSettingDao;
                    qcDeviceSettingDao.insert(deviceSettingEntity);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public final void saveDragSelectDeviceSupport(final java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> deviceSupport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSupport, "deviceSupport");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository$saveDragSelectDeviceSupport$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository deviceSupportRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao qcDeviceSettingDao;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSupportRepository, "$this$ktxRunOnBgSingle");
                com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity deviceSettingEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.DeviceSupport, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(deviceSupport));
                qcDeviceSettingDao = deviceSupportRepository.qcDeviceSettingDao;
                qcDeviceSettingDao.insert(deviceSettingEntity);
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.ui.base.bean.event.HealthItemRefreshEvent());
            }
        });
    }

    /* compiled from: DeviceSupportRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSupportRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSupportRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSupportRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository) com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository.getInstance$delegate.getValue();
        }
    }
}
