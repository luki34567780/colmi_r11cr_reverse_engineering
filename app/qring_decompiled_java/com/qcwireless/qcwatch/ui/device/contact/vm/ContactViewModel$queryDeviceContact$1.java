package com.qcwireless.qcwatch.ui.device.contact.vm;

/* compiled from: ContactViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel$queryDeviceContact$1", f = "ContactViewModel.kt", i = {}, l = {96, 96}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class ContactViewModel$queryDeviceContact$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactViewModel$queryDeviceContact$1(com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel contactViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel$queryDeviceContact$1> continuation) {
        super(2, continuation);
        this.this$0 = contactViewModel;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel$queryDeviceContact$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            deviceSettingRepository = this.this$0.deviceSettingRepository;
            this.label = 1;
            obj = deviceSettingRepository.getDeviceContact(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), (kotlin.coroutines.Continuation) this);
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
        final com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel contactViewModel = this.this$0;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel$queryDeviceContact$1.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                androidx.lifecycle.MutableLiveData mutableLiveData;
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository contactsRepository;
                com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.LocalContactUI localContactUI = new com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.LocalContactUI();
                if (list != null) {
                    localContactUI.setList(list);
                    mutableLiveData2 = com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.this._textStatus;
                    mutableLiveData2.postValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.this.getDeviceContacts().clear();
                    com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.this.getDeviceContacts().addAll(list);
                    contactsRepository = com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.this.contactsRepository;
                    contactsRepository.addDefaultContact(list);
                } else {
                    localContactUI.setList(new java.util.ArrayList());
                }
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, kotlin.coroutines.jvm.internal.Boxing.boxInt(localContactUI.getList().size()));
                mutableLiveData = com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.this._localUiState;
                mutableLiveData.postValue(localContactUI);
                return kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
