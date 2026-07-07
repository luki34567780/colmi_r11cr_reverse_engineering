package com.qcwireless.qcwatch.ui.base.view.pop;

/* compiled from: WPopupModel.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopupModel;", "", "text", "", "imgRes", "", "(Ljava/lang/String;I)V", "getImgRes", "()I", "setImgRes", "(I)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class WPopupModel {
    private int imgRes;
    private java.lang.String text;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel copy$default(com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel wPopupModel, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = wPopupModel.text;
        }
        if ((i2 & 2) != 0) {
            i = wPopupModel.imgRes;
        }
        return wPopupModel.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final int getImgRes() {
        return this.imgRes;
    }

    public final com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel copy(java.lang.String text, int imgRes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        return new com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel(text, imgRes);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel wPopupModel = (com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, wPopupModel.text) && this.imgRes == wPopupModel.imgRes;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.imgRes;
    }

    public java.lang.String toString() {
        return "WPopupModel(text=" + this.text + ", imgRes=" + this.imgRes + ')';
    }

    public WPopupModel(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        this.text = str;
        this.imgRes = i;
    }

    public /* synthetic */ WPopupModel(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? -1 : i);
    }

    public final int getImgRes() {
        return this.imgRes;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final void setImgRes(int i) {
        this.imgRes = i;
    }

    public final void setText(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }
}
