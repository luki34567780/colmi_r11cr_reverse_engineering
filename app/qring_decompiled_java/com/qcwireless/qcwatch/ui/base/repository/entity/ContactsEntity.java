package com.qcwireless.qcwatch.ui.base.repository.entity;

/* compiled from: ContactsEntity.kt */
@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/entity/ContactsEntity;", "", "mac", "", "phoneNumber", "contactName", "status", "", "firstName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getContactName", "()Ljava/lang/String;", "getFirstName", "setFirstName", "(Ljava/lang/String;)V", "getMac", "getPhoneNumber", "getStatus", "()I", "setStatus", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class ContactsEntity {
    private final java.lang.String contactName;
    private java.lang.String firstName;
    private final java.lang.String mac;
    private final java.lang.String phoneNumber;
    private int status;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity copy$default(com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity contactsEntity, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = contactsEntity.mac;
        }
        if ((i2 & 2) != 0) {
            str2 = contactsEntity.phoneNumber;
        }
        java.lang.String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = contactsEntity.contactName;
        }
        java.lang.String str6 = str3;
        if ((i2 & 8) != 0) {
            i = contactsEntity.status;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = contactsEntity.firstName;
        }
        return contactsEntity.copy(str, str5, str6, i3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMac() {
        return this.mac;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getContactName() {
        return this.contactName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity copy(java.lang.String mac, java.lang.String phoneNumber, java.lang.String contactName, int status, java.lang.String firstName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactName, "contactName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "firstName");
        return new com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity(mac, phoneNumber, contactName, status, firstName);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity contactsEntity = (com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.mac, contactsEntity.mac) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, contactsEntity.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactName, contactsEntity.contactName) && this.status == contactsEntity.status && kotlin.jvm.internal.Intrinsics.areEqual(this.firstName, contactsEntity.firstName);
    }

    public int hashCode() {
        return (((((((this.mac.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.contactName.hashCode()) * 31) + this.status) * 31) + this.firstName.hashCode();
    }

    public java.lang.String toString() {
        return "ContactsEntity(mac=" + this.mac + ", phoneNumber=" + this.phoneNumber + ", contactName=" + this.contactName + ", status=" + this.status + ", firstName=" + this.firstName + ')';
    }

    public ContactsEntity(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "contactName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "firstName");
        this.mac = str;
        this.phoneNumber = str2;
        this.contactName = str3;
        this.status = i;
        this.firstName = str4;
    }

    public final java.lang.String getMac() {
        return this.mac;
    }

    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final java.lang.String getContactName() {
        return this.contactName;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public final void setFirstName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstName = str;
    }
}
