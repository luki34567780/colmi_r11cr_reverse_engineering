package com.qcwireless.qcwatch.ui.base.repository.mine;

/* compiled from: UserProfileRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "Lcom/qcwireless/qcwatch/ui/base/bean/response/mine/UserProfileResp;", "e", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$downUserProfileFromServer$4", f = "UserProfileRepository.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class UserProfileRepository$downUserProfileFromServer$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserProfileResp>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    UserProfileRepository$downUserProfileFromServer$4(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$downUserProfileFromServer$4> continuation) {
        super(3, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserProfileResp>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$downUserProfileFromServer$4 userProfileRepository$downUserProfileFromServer$4 = new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$downUserProfileFromServer$4(continuation);
        userProfileRepository$downUserProfileFromServer$4.L$0 = flowCollector;
        userProfileRepository$downUserProfileFromServer$4.L$1 = th;
        return userProfileRepository$downUserProfileFromServer$4.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            ((java.lang.Throwable) this.L$1).printStackTrace();
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(new com.qcwireless.qcwatch.ui.base.repository.mine.NetState(false, null, com.qcwireless.qcwatch.ui.base.api.RetCodeValue.ErrorCode_0, true, 3, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
