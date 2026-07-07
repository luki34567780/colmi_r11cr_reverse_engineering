package com.qcwireless.qcwatch.ui.home.sport.vm;

/* compiled from: SportDetailViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel$getAge$1", f = "SportDetailViewModel.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class SportDetailViewModel$getAge$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SportDetailViewModel$getAge$1(com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel sportDetailViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel$getAge$1> continuation) {
        super(2, continuation);
        this.this$0 = sportDetailViewModel;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel$getAge$1(this.this$0, continuation);
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
            kotlinx.coroutines.flow.Flow<java.lang.Integer> userAge = userProfileRepository.getUserAge();
            final com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel sportDetailViewModel = this.this$0;
            this.label = 1;
            if (userAge.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel$getAge$1.1
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return emit(((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                }

                public final java.lang.Object emit(int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    androidx.lifecycle.MutableLiveData mutableLiveData;
                    mutableLiveData = com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel.this._age;
                    mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge(i2));
                    return kotlin.Unit.INSTANCE;
                }
            }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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
