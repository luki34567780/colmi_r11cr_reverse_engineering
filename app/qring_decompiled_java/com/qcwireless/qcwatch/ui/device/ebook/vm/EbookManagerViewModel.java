package com.qcwireless.qcwatch.ui.device.ebook.vm;

/* compiled from: EbookManagerViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/ebook/vm/EbookManagerViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "ebookRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/EbookRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/EbookRepository;)V", "deviceEbookList", "", "Lcom/qcwireless/qcwatch/ui/device/ebook/bean/Ebook;", "getDeviceEbookList", "()Ljava/util/List;", "setDeviceEbookList", "(Ljava/util/List;)V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class EbookManagerViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> deviceEbookList;
    private com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository ebookRepository;

    public EbookManagerViewModel(com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository ebookRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookRepository, "ebookRepository");
        this.ebookRepository = ebookRepository;
        this.deviceEbookList = new java.util.ArrayList();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> getDeviceEbookList() {
        return this.deviceEbookList;
    }

    public final void setDeviceEbookList(java.util.List<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.deviceEbookList = list;
    }
}
