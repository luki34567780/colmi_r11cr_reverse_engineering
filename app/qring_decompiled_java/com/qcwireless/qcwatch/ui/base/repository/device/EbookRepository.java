package com.qcwireless.qcwatch.ui.base.repository.device;

/* compiled from: EbookRepository.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/device/EbookRepository;", "", "()V", "qcEbookDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcEbookDao;", "deleteBook", "", "name", "", "getAllBooks", "", "Lcom/qcwireless/qcwatch/ui/device/ebook/bean/Ebook;", "saveBook", "ebookEntity", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/EbookEntity;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class EbookRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository m530invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcEbookDao qcEbookDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcEbookDao();

    public final java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> getAllBooks() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity ebookEntity : this.qcEbookDao.queryEbooks()) {
            com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook ebook = new com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook();
            ebook.setFirstName(ebookEntity.getFirstName());
            ebook.setName(ebookEntity.getBookName());
            ebook.setPath(ebookEntity.getFilePath());
            arrayList.add(ebook);
        }
        java.util.Collections.sort(arrayList, new com.qcwireless.qcwatch.ui.device.ebook.bean.EbookSortComparator());
        return arrayList;
    }

    public final void saveBook(com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity ebookEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookEntity, "ebookEntity");
        this.qcEbookDao.insert(ebookEntity);
    }

    public final void deleteBook(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.qcEbookDao.deleteBookName(name);
    }

    /* compiled from: EbookRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/device/EbookRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/device/EbookRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/device/EbookRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository) com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository.getInstance$delegate.getValue();
        }
    }
}
