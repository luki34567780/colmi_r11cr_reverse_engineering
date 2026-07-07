package com.qcwireless.qcwatch.ui.mine.goal;

/* compiled from: GoalSettingViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel$updateGoalSettingToServer$1", f = "GoalSettingViewModel.kt", i = {}, l = {108, 108}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class GoalSettingViewModel$updateGoalSettingToServer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity $userEntity;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoalSettingViewModel$updateGoalSettingToServer$1(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel goalSettingViewModel, com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel$updateGoalSettingToServer$1> continuation) {
        super(2, continuation);
        this.this$0 = goalSettingViewModel;
        this.$userEntity = userEntity;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel$updateGoalSettingToServer$1(this.this$0, this.$userEntity, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            userProfileRepository = this.this$0.userProfileRepository;
            this.label = 1;
            obj = userProfileRepository.updateGoalSettingToServer(this.$userEntity, (kotlin.coroutines.Continuation) this);
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
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel$updateGoalSettingToServer$1.1
            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return kotlin.Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
