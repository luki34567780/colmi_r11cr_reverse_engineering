package com.qcwireless.qcwatch.ui.base.repository.mine;

/* compiled from: UserProfileRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$getUserAge$1", f = "UserProfileRepository.kt", i = {0, 1, 2}, l = {56, 58, 61, 65}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class UserProfileRepository$getUserAge$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super java.lang.Integer>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserProfileRepository$getUserAge$1(com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$getUserAge$1> continuation) {
        super(2, continuation);
        this.this$0 = userProfileRepository;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> userProfileRepository$getUserAge$1 = new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$getUserAge$1(this.this$0, continuation);
        userProfileRepository$getUserAge$1.L$0 = obj;
        return userProfileRepository$getUserAge$1;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Integer> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c9 -> B:16:0x00cc). Please report as a decompilation issue!!! */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao qcUserDao;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            this.L$0 = null;
            this.label = 4;
            java.lang.Object emit = r1.emit(kotlin.coroutines.jvm.internal.Boxing.boxInt(27), (kotlin.coroutines.Continuation) this);
            r1 = r1;
            if (emit == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (r1 != 0) {
            if (r1 == 1) {
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            } else if (r1 == 2) {
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            } else {
                if (r1 != 3) {
                    if (r1 == 4) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            r1 = flowCollector;
        } else {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLoginStatus()) {
                qcUserDao = this.this$0.userDao;
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity queryUserByUid = qcUserDao.queryUserByUid(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid());
                if (queryUserByUid != null) {
                    this.L$0 = flowCollector2;
                    this.label = 1;
                    java.lang.Object emit2 = flowCollector2.emit(kotlin.coroutines.jvm.internal.Boxing.boxInt(com.qcwireless.qc_utils.date.DateUtil.getAgeByBirthday(com.qcwireless.qc_utils.date.DateUtil.String2Date("yyyy-MM-dd", queryUserByUid.getBirthday() + "-01"))), (kotlin.coroutines.Continuation) this);
                    r1 = flowCollector2;
                    if (emit2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.L$0 = flowCollector2;
                    this.label = 2;
                    java.lang.Object emit3 = flowCollector2.emit(kotlin.coroutines.jvm.internal.Boxing.boxInt(27), (kotlin.coroutines.Continuation) this);
                    r1 = flowCollector2;
                    if (emit3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                this.L$0 = flowCollector2;
                this.label = 3;
                java.lang.Object emit4 = flowCollector2.emit(kotlin.coroutines.jvm.internal.Boxing.boxInt(27), (kotlin.coroutines.Continuation) this);
                r1 = flowCollector2;
                if (emit4 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
