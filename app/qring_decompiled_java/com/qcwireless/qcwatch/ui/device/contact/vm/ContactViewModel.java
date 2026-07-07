package com.qcwireless.qcwatch.ui.device.contact.vm;

/* compiled from: ContactViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u00029:B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0014\u00103\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0006\u00104\u001a\u000201J\u0014\u00105\u001a\u0002012\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0006\u00107\u001a\u000201J\u0006\u00108\u001a\u000201R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0&8F¢\u0006\u0006\u001a\u0004\b-\u0010(R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0&8F¢\u0006\u0006\u001a\u0004\b/\u0010(¨\u0006;"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/contact/vm/ContactViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "contactsRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/ContactsRepository;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/ContactsRepository;Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_localUiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/device/contact/vm/ContactViewModel$LocalContactUI;", "_textStatus", "", "_uiState", "Lcom/qcwireless/qcwatch/ui/device/contact/vm/ContactViewModel$ContactUI;", "addList", "", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/ContactsEntity;", "getAddList", "()Ljava/util/List;", "setAddList", "(Ljava/util/List;)V", "contactsBackUpList", "Lcom/qcwireless/qcwatch/ui/device/contact/bean/ContactBean;", "getContactsBackUpList", "setContactsBackUpList", "contactsList", "getContactsList", "setContactsList", "deleteList", "getDeleteList", "setDeleteList", "deviceContacts", "getDeviceContacts", "setDeviceContacts", "localList", "getLocalList", "setLocalList", "localUiState", "Landroidx/lifecycle/LiveData;", "getLocalUiState", "()Landroidx/lifecycle/LiveData;", "tempList", "getTempList", "setTempList", "textStatus", "getTextStatus", "uiState", "getUiState", "addContact", "", "mutableList", "addContactDefaultStatus", "deleteLocalContact", "initData", "list", "queryDeviceContact", "queryLocalContactList", "ContactUI", "LocalContactUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ContactViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.LocalContactUI> _localUiState;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _textStatus;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.ContactUI> _uiState;
    private java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> addList;
    private java.util.List<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> contactsBackUpList;
    private java.util.List<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> contactsList;
    private final com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository contactsRepository;
    private java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> deleteList;
    private java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> deviceContacts;
    private com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
    private java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> localList;
    private java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> tempList;

    public ContactViewModel(com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository contactsRepository, com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.contactsRepository = contactsRepository;
        this.deviceSettingRepository = deviceSettingRepository;
        this.contactsList = new java.util.ArrayList();
        this.contactsBackUpList = new java.util.ArrayList();
        this.addList = new java.util.ArrayList();
        this.localList = new java.util.ArrayList();
        this.deleteList = new java.util.ArrayList();
        this.deviceContacts = new java.util.ArrayList();
        this.tempList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._localUiState = new androidx.lifecycle.MutableLiveData<>();
        this._textStatus = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> getContactsList() {
        return this.contactsList;
    }

    public final void setContactsList(java.util.List<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.contactsList = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> getContactsBackUpList() {
        return this.contactsBackUpList;
    }

    public final void setContactsBackUpList(java.util.List<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.contactsBackUpList = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> getAddList() {
        return this.addList;
    }

    public final void setAddList(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.addList = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> getLocalList() {
        return this.localList;
    }

    public final void setLocalList(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.localList = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> getDeleteList() {
        return this.deleteList;
    }

    public final void setDeleteList(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.deleteList = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> getDeviceContacts() {
        return this.deviceContacts;
    }

    public final void setDeviceContacts(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.deviceContacts = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> getTempList() {
        return this.tempList;
    }

    public final void setTempList(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tempList = list;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.ContactUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.LocalContactUI> getLocalUiState() {
        return this._localUiState;
    }

    public final androidx.lifecycle.LiveData<java.lang.Boolean> getTextStatus() {
        return this._textStatus;
    }

    public final void initData(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        try {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel$initData$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel contactViewModel) {
                    com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository contactsRepository;
                    androidx.lifecycle.MutableLiveData mutableLiveData;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactViewModel, "$this$ktxRunOnBgSingle");
                    contactsRepository = contactViewModel.contactsRepository;
                    java.util.List<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> contactsFromPhone = contactsRepository.getContactsFromPhone(list);
                    com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.ContactUI contactUI = new com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.ContactUI();
                    contactUI.setList(contactsFromPhone);
                    mutableLiveData = contactViewModel._uiState;
                    mutableLiveData.postValue(contactUI);
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    public final void deleteLocalContact() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel$deleteLocalContact$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel contactViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository contactsRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactViewModel, "$this$ktxRunOnBgSingle");
                contactsRepository = contactViewModel.contactsRepository;
                contactsRepository.deleteAllData();
            }
        });
    }

    public final void queryLocalContactList() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel$queryLocalContactList$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel contactViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository contactsRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactViewModel, "$this$ktxRunOnBgSingle");
                contactsRepository = contactViewModel.contactsRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> queryAll = contactsRepository.queryAll();
                com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.LocalContactUI localContactUI = new com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.LocalContactUI();
                localContactUI.setList(queryAll);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(queryAll.size()));
                mutableLiveData = contactViewModel._localUiState;
                mutableLiveData.postValue(localContactUI);
            }
        });
    }

    public final void addContactDefaultStatus(final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> mutableList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableList, "mutableList");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel$addContactDefaultStatus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel contactViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository contactsRepository;
                com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository contactsRepository2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactViewModel, "$this$ktxRunOnBgSingle");
                contactsRepository = contactViewModel.contactsRepository;
                contactsRepository.deleteAllData();
                contactsRepository2 = contactViewModel.contactsRepository;
                contactsRepository2.addDefaultContact(mutableList);
            }
        });
    }

    public final void addContact(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> mutableList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableList, "mutableList");
        this.deviceContacts.clear();
        this.deviceContacts.addAll(mutableList);
        this.deviceSettingRepository.saveContact(mutableList);
    }

    public final void queryDeviceContact() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel$queryDeviceContact$1(this, null), 3, (java.lang.Object) null);
    }

    /* compiled from: ContactViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/contact/vm/ContactViewModel$ContactUI;", "", "()V", "list", "", "Lcom/qcwireless/qcwatch/ui/device/contact/bean/ContactBean;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ContactUI {
        private java.util.List<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> list = new java.util.ArrayList();

        public final java.util.List<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> getList() {
            return this.list;
        }

        public final void setList(java.util.List<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.list = list;
        }
    }

    /* compiled from: ContactViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/contact/vm/ContactViewModel$LocalContactUI;", "", "()V", "list", "", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/ContactsEntity;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class LocalContactUI {
        private java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> list = new java.util.ArrayList();

        public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> getList() {
            return this.list;
        }

        public final void setList(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.list = list;
        }
    }
}
