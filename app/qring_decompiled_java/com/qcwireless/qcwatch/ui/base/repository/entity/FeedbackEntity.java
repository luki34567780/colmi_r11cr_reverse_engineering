package com.qcwireless.qcwatch.ui.base.repository.entity;

/* compiled from: FeedbackEntity.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/entity/FeedbackEntity;", "", "typeId", "", "feedbackId", "content", "", "(IILjava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getFeedbackId", "()I", "getTypeId", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class FeedbackEntity {
    private final java.lang.String content;
    private final int feedbackId;
    private final int typeId;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity copy$default(com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity feedbackEntity, int i, int i2, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = feedbackEntity.typeId;
        }
        if ((i3 & 2) != 0) {
            i2 = feedbackEntity.feedbackId;
        }
        if ((i3 & 4) != 0) {
            str = feedbackEntity.content;
        }
        return feedbackEntity.copy(i, i2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFeedbackId() {
        return this.feedbackId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getContent() {
        return this.content;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity copy(int typeId, int feedbackId, java.lang.String content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        return new com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity(typeId, feedbackId, content);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity feedbackEntity = (com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity) other;
        return this.typeId == feedbackEntity.typeId && this.feedbackId == feedbackEntity.feedbackId && kotlin.jvm.internal.Intrinsics.areEqual(this.content, feedbackEntity.content);
    }

    public int hashCode() {
        return (((this.typeId * 31) + this.feedbackId) * 31) + this.content.hashCode();
    }

    public java.lang.String toString() {
        return "FeedbackEntity(typeId=" + this.typeId + ", feedbackId=" + this.feedbackId + ", content=" + this.content + ')';
    }

    public FeedbackEntity(int i, int i2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "content");
        this.typeId = i;
        this.feedbackId = i2;
        this.content = str;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final int getFeedbackId() {
        return this.feedbackId;
    }

    public final java.lang.String getContent() {
        return this.content;
    }
}
