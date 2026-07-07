package com.qcwireless.qcwatch.ui.device.album.bean;

/* compiled from: AlbumBean.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/album/bean/AlbumBean;", "", "path", "", "type", "", "progress", "(Ljava/lang/String;II)V", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "getProgress", "()I", "setProgress", "(I)V", "getType", "setType", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class AlbumBean {
    private java.lang.String path;
    private int progress;
    private int type;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean copy$default(com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean albumBean, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = albumBean.path;
        }
        if ((i3 & 2) != 0) {
            i = albumBean.type;
        }
        if ((i3 & 4) != 0) {
            i2 = albumBean.progress;
        }
        return albumBean.copy(str, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    public final com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean copy(java.lang.String path, int type, int progress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        return new com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean(path, type, progress);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean albumBean = (com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.path, albumBean.path) && this.type == albumBean.type && this.progress == albumBean.progress;
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + this.type) * 31) + this.progress;
    }

    public java.lang.String toString() {
        return "AlbumBean(path=" + this.path + ", type=" + this.type + ", progress=" + this.progress + ')';
    }

    public AlbumBean(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "path");
        this.path = str;
        this.type = i;
        this.progress = i2;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getType() {
        return this.type;
    }

    public final void setPath(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.path = str;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
