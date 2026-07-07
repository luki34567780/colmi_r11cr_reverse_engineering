package com.qcwireless.qcwatch.ui.base.repository.device;

/* compiled from: ContactsRepository.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0006\u0010\u000e\u001a\u00020\nJ$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/device/ContactsRepository;", "", "()V", "PROJECTION", "", "", "[Ljava/lang/String;", "qcContactDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcContactsDao;", "addDefaultContact", "", "mutableList", "", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/ContactsEntity;", "deleteAllData", "getContacts", "Lcom/qcwireless/qcwatch/ui/device/contact/bean/ContactBean;", "localList", "context", "Landroid/content/Context;", "getContactsFromPhone", "queryAll", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ContactsRepository {
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcContactsDao qcContactDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcContactDao();
    private final java.lang.String[] PROJECTION = {"display_name", "data1"};

    public final void addDefaultContact(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> mutableList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableList, "mutableList");
        if (mutableList.size() > 0) {
            this.qcContactDao.insertAll(mutableList);
        }
    }

    public final void deleteAllData() {
        this.qcContactDao.deleteList(this.qcContactDao.queryAll(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear()));
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> queryAll() {
        return this.qcContactDao.queryAll(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        java.util.Collections.sort(r0, new com.qcwireless.qcwatch.ui.device.contact.bean.SortComparator());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> getContacts(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> r9, android.content.Context r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            android.content.ContentResolver r1 = r10.getContentResolver()
            r10 = 0
            android.net.Uri r2 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String[] r3 = r8.PROJECTION     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r4 = 0
            r5 = 0
            java.lang.String r6 = "sort_key"
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            if (r10 == 0) goto L8e
            java.lang.String r1 = "display_name"
            int r1 = r10.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r2 = "data1"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
        L26:
            boolean r3 = r10.moveToNext()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            if (r3 == 0) goto L8e
            java.lang.String r3 = r10.getString(r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r4 = r10.getString(r1)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean r5 = new com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r5.<init>()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r6 = com.qcwireless.qcwatch.ui.device.contact.bean.PinYinStringHelper.getHeadChar(r4)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r7 = "getHeadChar(displayName)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r5.setFirstName(r6)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r5.setPhoneNumber(r3)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            r5.setContactName(r4)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r3 = r5.getFirstName()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            boolean r3 = com.qcwireless.qcwatch.ui.device.contact.bean.PinYinStringHelper.isLetter(r3)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            if (r3 != 0) goto L5a
            java.lang.String r3 = "#"
            r5.setFirstName(r3)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
        L5a:
            java.util.Iterator r3 = r9.iterator()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
        L5e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity r4 = (com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity) r4     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r6 = r4.getContactName()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r7 = r5.getContactName()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            if (r6 == 0) goto L5e
            java.lang.String r4 = r4.getPhoneNumber()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            java.lang.String r6 = r5.getPhoneNumber()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            if (r4 == 0) goto L5e
            r3 = 1
            r5.setSelect(r3)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
        L8a:
            r0.add(r5)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            goto L26
        L8e:
            if (r10 == 0) goto L9d
        L90:
            r10.close()
            goto L9d
        L94:
            r9 = move-exception
            goto La8
        L96:
            r9 = move-exception
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L94
            if (r10 == 0) goto L9d
            goto L90
        L9d:
            com.qcwireless.qcwatch.ui.device.contact.bean.SortComparator r9 = new com.qcwireless.qcwatch.ui.device.contact.bean.SortComparator
            r9.<init>()
            java.util.Comparator r9 = (java.util.Comparator) r9
            java.util.Collections.sort(r0, r9)
            return r0
        La8:
            if (r10 == 0) goto Lad
            r10.close()
        Lad:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository.getContacts(java.util.List, android.content.Context):java.util.List");
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.contact.bean.ContactBean> getContactsFromPhone(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity> localList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localList, "localList");
        return getContacts(localList, com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT());
    }
}
