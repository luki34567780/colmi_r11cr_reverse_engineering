package com.qcwireless.qcwatch.ui.mine.login;

/* compiled from: LoginViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.mine.login.LoginViewModel$login$1", f = "LoginViewModel.kt", i = {}, l = {30, 30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class LoginViewModel$login$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $account;
    final /* synthetic */ java.lang.String $password;
    final /* synthetic */ int $type;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.mine.login.LoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoginViewModel$login$1(com.qcwireless.qcwatch.ui.mine.login.LoginViewModel loginViewModel, java.lang.String str, java.lang.String str2, int i, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.mine.login.LoginViewModel$login$1> continuation) {
        super(2, continuation);
        this.this$0 = loginViewModel;
        this.$account = str;
        this.$password = str2;
        this.$type = i;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.mine.login.LoginViewModel$login$1(this.this$0, this.$account, this.$password, this.$type, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.lifecycle.MutableLiveData mutableLiveData;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (java.lang.Exception unused) {
            com.qcwireless.qcwatch.ui.base.repository.mine.NetState netState = new com.qcwireless.qcwatch.ui.base.repository.mine.NetState(false, null, com.qcwireless.qcwatch.ui.base.api.RetCodeValue.ErrorCode_0, true, 3, null);
            mutableLiveData = this.this$0._uiState;
            mutableLiveData.postValue(netState);
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.getRepository().login(this.$account, this.$password, this.$type, (kotlin.coroutines.Continuation) this);
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
        final java.lang.String str = this.$password;
        final com.qcwireless.qcwatch.ui.mine.login.LoginViewModel loginViewModel = this.this$0;
        final java.lang.String str2 = this.$account;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.mine.login.LoginViewModel$login$1.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp> netState2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setUserPwd(str);
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                loginViewModel.insertOrUpdateProfile(str2, netState2);
                mutableLiveData2 = loginViewModel._uiState;
                mutableLiveData2.postValue(netState2);
                return kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
