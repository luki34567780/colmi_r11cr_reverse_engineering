package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: BloodPressureRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$syncAutoBp$1$1", f = "BloodPressureRepository.kt", i = {0}, l = {74}, m = "invokeSuspend", n = {"time"}, s = {"L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class BloodPressureRepository$syncAutoBp$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.oudmon.ble.base.communication.rsp.BpDataRsp $it;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BloodPressureRepository$syncAutoBp$1$1(com.oudmon.ble.base.communication.rsp.BpDataRsp bpDataRsp, com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository bloodPressureRepository, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$syncAutoBp$1$1> continuation) {
        super(2, continuation);
        this.$it = bpDataRsp;
        this.this$0 = bloodPressureRepository;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$syncAutoBp$1$1(this.$it, this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository bloodPressureRepository;
        com.oudmon.ble.base.util.DateUtil dateUtil;
        java.util.Iterator it;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.oudmon.ble.base.communication.entity.BpDataEntity bpDataEntity = this.$it.getBpDataEntity();
            com.oudmon.ble.base.util.DateUtil dateUtil2 = new com.oudmon.ble.base.util.DateUtil(bpDataEntity.getYear(), bpDataEntity.getMouth(), bpDataEntity.getDay());
            java.util.ArrayList<com.oudmon.ble.base.communication.entity.BpDataEntity.BpValue> bpValues = bpDataEntity.getBpValues();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bpValues, "entity.bpValues");
            bloodPressureRepository = this.this$0;
            dateUtil = dateUtil2;
            it = bpValues.iterator();
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.L$2;
            bloodPressureRepository = (com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository) this.L$1;
            dateUtil = (com.oudmon.ble.base.util.DateUtil) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            com.oudmon.ble.base.communication.entity.BpDataEntity.BpValue bpValue = (com.oudmon.ble.base.communication.entity.BpDataEntity.BpValue) it.next();
            final long unixTimestamp = dateUtil.getUnixTimestamp() + (bpValue.getTimeMinute() * 60);
            final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
            intRef.element = bpValue.getValue();
            if (intRef.element <= 50) {
                intRef.element = new java.util.Random().nextInt(5) + 70;
            }
            kotlinx.coroutines.flow.Flow<java.lang.Integer> userAge = com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.INSTANCE.getGetInstance().getUserAge();
            kotlinx.coroutines.flow.FlowCollector flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$syncAutoBp$1$1$1$1
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return emit(((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                }

                public final java.lang.Object emit(int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodPressureDao qcBloodPressureDao;
                    int cal_sbp = com.qcwireless.qcwatch.ui.home.bp.util.CalcBloodPressureByHeart.cal_sbp(intRef.element, i2);
                    if (cal_sbp > 130) {
                        int i3 = cal_sbp - 130;
                        if (i3 <= 8) {
                            i3 *= 2;
                        }
                        cal_sbp = 130 - i3;
                    }
                    if (cal_sbp < 90) {
                        cal_sbp = (90 - cal_sbp) + 90;
                    }
                    int i4 = cal_sbp;
                    int cal_dbp = com.qcwireless.qcwatch.ui.home.bp.util.CalcBloodPressureByHeart.cal_dbp(i4);
                    if (cal_dbp < 60) {
                        cal_dbp = (60 - cal_dbp) + 60;
                    }
                    com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity bloodPressureEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), unixTimestamp, i4, cal_dbp > 90 ? 90 - (cal_dbp - 90) : cal_dbp, false, new com.oudmon.ble.base.util.DateUtil().getUnixTimestamp());
                    qcBloodPressureDao = bloodPressureRepository.bloodPressureDao;
                    qcBloodPressureDao.insert(bloodPressureEntity);
                    return kotlin.Unit.INSTANCE;
                }
            };
            this.L$0 = dateUtil;
            this.L$1 = bloodPressureRepository;
            this.L$2 = it;
            this.label = 1;
            if (userAge.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.this$0.syncAutoBpConfirm();
        return kotlin.Unit.INSTANCE;
    }
}
