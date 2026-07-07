package com.qcwireless.qcwatch.ui.plate.bean;

/* compiled from: MarketWatchFaceBean.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/bean/MarketWatchFaceBean;", "", "watchFace", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/WatchFace;", "progressBar", "", "(Lcom/qcwireless/qcwatch/ui/base/repository/entity/WatchFace;I)V", "getProgressBar", "()I", "setProgressBar", "(I)V", "getWatchFace", "()Lcom/qcwireless/qcwatch/ui/base/repository/entity/WatchFace;", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class MarketWatchFaceBean {
    private int progressBar;
    private final com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean copy$default(com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean marketWatchFaceBean, com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            watchFace = marketWatchFaceBean.watchFace;
        }
        if ((i2 & 2) != 0) {
            i = marketWatchFaceBean.progressBar;
        }
        return marketWatchFaceBean.copy(watchFace, i);
    }

    /* renamed from: component1, reason: from getter */
    public final com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace getWatchFace() {
        return this.watchFace;
    }

    /* renamed from: component2, reason: from getter */
    public final int getProgressBar() {
        return this.progressBar;
    }

    public final com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean copy(com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace, int progressBar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFace, "watchFace");
        return new com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean(watchFace, progressBar);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean marketWatchFaceBean = (com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.watchFace, marketWatchFaceBean.watchFace) && this.progressBar == marketWatchFaceBean.progressBar;
    }

    public int hashCode() {
        return (this.watchFace.hashCode() * 31) + this.progressBar;
    }

    public java.lang.String toString() {
        return "MarketWatchFaceBean(watchFace=" + this.watchFace + ", progressBar=" + this.progressBar + ')';
    }

    public MarketWatchFaceBean(com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFace, "watchFace");
        this.watchFace = watchFace;
        this.progressBar = i;
    }

    public final int getProgressBar() {
        return this.progressBar;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace getWatchFace() {
        return this.watchFace;
    }

    public final void setProgressBar(int i) {
        this.progressBar = i;
    }
}
