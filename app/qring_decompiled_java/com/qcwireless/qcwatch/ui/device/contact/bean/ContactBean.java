package com.qcwireless.qcwatch.ui.device.contact.bean;

/* compiled from: ContactBean.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/contact/bean/ContactBean;", "", "()V", "contactName", "", "getContactName", "()Ljava/lang/String;", "setContactName", "(Ljava/lang/String;)V", "firstName", "getFirstName", "setFirstName", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ContactBean {
    private boolean select;
    private java.lang.String phoneNumber = "";
    private java.lang.String contactName = "";
    private java.lang.String firstName = "";

    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final void setPhoneNumber(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneNumber = str;
    }

    public final java.lang.String getContactName() {
        return this.contactName;
    }

    public final void setContactName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contactName = str;
    }

    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public final void setFirstName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstName = str;
    }

    public final boolean getSelect() {
        return this.select;
    }

    public final void setSelect(boolean z) {
        this.select = z;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        java.util.Objects.requireNonNull(other, "null cannot be cast to non-null type com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean");
        com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean contactBean = (com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, contactBean.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactName, contactBean.contactName);
    }

    public int hashCode() {
        return (this.phoneNumber.hashCode() * 31) + this.contactName.hashCode();
    }
}
