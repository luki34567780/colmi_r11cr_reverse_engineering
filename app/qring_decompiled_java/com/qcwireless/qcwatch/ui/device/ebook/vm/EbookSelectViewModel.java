package com.qcwireless.qcwatch.ui.device.ebook.vm;

import com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel.EbookUi;

/* compiled from: EbookSelectViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u001aR\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001b\u0010\u0015\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\u00000\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/ebook/vm/EbookSelectViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "ebookRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/EbookRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/EbookRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/device/ebook/vm/EbookSelectViewModel$EbookUi;", "addList", "", "Lcom/qcwireless/qcwatch/ui/device/ebook/bean/Ebook;", "getAddList", "()Ljava/util/List;", "setAddList", "(Ljava/util/List;)V", "songList", "getSongList", "setSongList", "songListBackUp", "getSongListBackUp", "setSongListBackUp", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "addEbooks", "", "bean", "deleteBook", "name", "", "saveBook", "ebookEntity", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/EbookEntity;", "selectEbook", "EbookUi", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class EbookSelectViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel.EbookUi> _uiState;
    private java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> addList;
    private com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository ebookRepository;
    private java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> songList;
    private java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> songListBackUp;

    public EbookSelectViewModel(com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository ebookRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookRepository, "ebookRepository");
        this.ebookRepository = ebookRepository;
        this.songList = new java.util.ArrayList();
        this.songListBackUp = new java.util.ArrayList();
        this.addList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> getSongList() {
        return this.songList;
    }

    public final void setSongList(java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.songList = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> getSongListBackUp() {
        return this.songListBackUp;
    }

    public final void setSongListBackUp(java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.songListBackUp = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> getAddList() {
        return this.addList;
    }

    public final void setAddList(java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.addList = list;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel.EbookUi> getUiState() {
        return this._uiState;
    }

    public final void selectEbook() {
        try {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel$selectEbook$1
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel ebookSelectViewModel) {
                    com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository ebookRepository;
                    androidx.lifecycle.MutableLiveData mutableLiveData;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectViewModel, "$this$ktxRunOnBgSingle");
                    ebookRepository = ebookSelectViewModel.ebookRepository;
                    java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> allBooks = ebookRepository.getAllBooks();
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(allBooks.size()));
                    com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel.EbookUi ebookUi = ebookSelectViewModel.new EbookUi();
                    ebookUi.setList(kotlin.jvm.internal.TypeIntrinsics.asMutableList(allBooks));
                    mutableLiveData = ebookSelectViewModel._uiState;
                    mutableLiveData.postValue(ebookUi);
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    public final void addEbooks(final com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook bean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bean, "bean");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel$addEbooks$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel ebookSelectViewModel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectViewModel, "$this$ktxRunOnBgSingle");
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook.this);
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.FinishEbookAddFirstEvent(com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook.this.getName(), com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook.this.getPath()));
            }
        });
    }

    public final void saveBook(com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity ebookEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookEntity, "ebookEntity");
        this.ebookRepository.saveBook(ebookEntity);
    }

    public final void deleteBook(final java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel$deleteBook$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel ebookSelectViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository ebookRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookSelectViewModel, "$this$ktxRunOnBgSingle");
                ebookRepository = ebookSelectViewModel.ebookRepository;
                ebookRepository.deleteBook(name);
            }
        });
    }

    /* compiled from: EbookSelectViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/ebook/vm/EbookSelectViewModel$EbookUi;", "", "(Lcom/qcwireless/qcwatch/ui/device/ebook/vm/EbookSelectViewModel;)V", "list", "", "Lcom/qcwireless/qcwatch/ui/device/ebook/bean/Ebook;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class EbookUi {
        private java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> list = new java.util.ArrayList();

        public EbookUi() {
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> getList() {
            return this.list;
        }

        public final void setList(java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.list = list;
        }
    }
}
