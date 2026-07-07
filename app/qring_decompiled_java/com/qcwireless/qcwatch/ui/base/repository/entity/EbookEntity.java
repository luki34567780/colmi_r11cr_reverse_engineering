package com.qcwireless.qcwatch.ui.base.repository.entity;

/* compiled from: EbookEntity.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/entity/EbookEntity;", "", "bookName", "", "firstName", "filePath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBookName", "()Ljava/lang/String;", "setBookName", "(Ljava/lang/String;)V", "getFilePath", "setFilePath", "getFirstName", "setFirstName", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class EbookEntity {
    private java.lang.String bookName;
    private java.lang.String filePath;
    private java.lang.String firstName;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity copy$default(com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity ebookEntity, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = ebookEntity.bookName;
        }
        if ((i & 2) != 0) {
            str2 = ebookEntity.firstName;
        }
        if ((i & 4) != 0) {
            str3 = ebookEntity.filePath;
        }
        return ebookEntity.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBookName() {
        return this.bookName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFilePath() {
        return this.filePath;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity copy(java.lang.String bookName, java.lang.String firstName, java.lang.String filePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bookName, "bookName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "firstName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity(bookName, firstName, filePath);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity ebookEntity = (com.qcwireless.qcwatch.ui.base.repository.entity.EbookEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.bookName, ebookEntity.bookName) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstName, ebookEntity.firstName) && kotlin.jvm.internal.Intrinsics.areEqual(this.filePath, ebookEntity.filePath);
    }

    public int hashCode() {
        return (((this.bookName.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.filePath.hashCode();
    }

    public java.lang.String toString() {
        return "EbookEntity(bookName=" + this.bookName + ", firstName=" + this.firstName + ", filePath=" + this.filePath + ')';
    }

    public EbookEntity(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "bookName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "firstName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "filePath");
        this.bookName = str;
        this.firstName = str2;
        this.filePath = str3;
    }

    public final java.lang.String getBookName() {
        return this.bookName;
    }

    public final void setBookName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bookName = str;
    }

    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public final void setFirstName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstName = str;
    }

    public final java.lang.String getFilePath() {
        return this.filePath;
    }

    public final void setFilePath(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filePath = str;
    }
}
