package com.qcwireless.qcwatch.ui.mine.ucenter;

/* compiled from: UserProfileViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$upPhotoImage$1", f = "UserProfileViewModel.kt", i = {}, l = {347, 347}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class UserProfileViewModel$upPhotoImage$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.io.File $file;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserProfileViewModel$upPhotoImage$1(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel userProfileViewModel, java.io.File file, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$upPhotoImage$1> continuation) {
        super(2, continuation);
        this.this$0 = userProfileViewModel;
        this.$file = file;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$upPhotoImage$1(this.this$0, this.$file, continuation);
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
            obj = userProfileRepository.upPhotoImage(this.$file, (kotlin.coroutines.Continuation) this);
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
        final com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel userProfileViewModel = this.this$0;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$upPhotoImage$1.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.String>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.String> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository2;
                com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository3;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                userProfileRepository2 = com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.this.userProfileRepository;
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity queryUserByUid = userProfileRepository2.queryUserByUid(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid());
                if (queryUserByUid != null) {
                    queryUserByUid.setAvatarUrl(java.lang.String.valueOf(netState.isSuccess()));
                    userProfileRepository3 = com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.this.userProfileRepository;
                    userProfileRepository3.insertUser(queryUserByUid);
                    mutableLiveData = com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.this._uiState;
                    mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI(queryUserByUid.getNickName(), queryUserByUid.getGender(), queryUserByUid.getBirthday(), (int) queryUserByUid.getHeight(), (int) queryUserByUid.getWeight(), queryUserByUid.getWeightLbs(), queryUserByUid));
                }
                return kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
