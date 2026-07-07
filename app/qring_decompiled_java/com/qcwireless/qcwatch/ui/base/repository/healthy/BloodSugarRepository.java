package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: BloodSugarRepository.kt */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0016\u0010\"\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u001c\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodSugarRepository;", "", "()V", "bloodSugarDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcBloodSugarDao;", "qcAppManualSugarContinuousDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcAppManualSugarContinuousDao;", "qcAppManualSugarDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcAppManualSugarDao;", "deleteData", "", "queryAppSugarLast", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/AppBloodSugarEntity;", "queryBloodSugarByDate", "", "Lcom/qcwireless/qcwatch/ui/base/view/QBloodSugarLineChartView$DataBean;", "mac", "", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "queryBloodSugarByDateDetail", "Lcom/qcwireless/qcwatch/ui/home/bloodsugar/bean/BloodSugarDetailBean;", "queryBloodSugarByDateDetailAll", "queryLastBloodSugar", "Lcom/qcwireless/qcwatch/ui/base/view/QBloodSugarLineChartHomeView$DataBean;", "queryLastBloodSugarDate", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/BloodSugarEntity;", "queryManualAppSugar", "", "querySugarByDate", "dataTime", "", "value", "", "saveManualSugar", "syncBloodSugar", "offset", "result", "Lcom/qcwireless/qcwatch/ui/base/repository/base/BaseDeviceResult;", "Lcom/oudmon/ble/base/communication/rsp/ReadBlePressureRsp;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodSugarRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository m546invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao bloodSugarDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcBloodSugar();
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarDao qcAppManualSugarDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcAppManualSugarDao();
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao qcAppManualSugarContinuousDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcAppManualSugarContinuousDao();

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean> queryBloodSugarByDate(java.lang.String mac, com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao qcAppManualSugarContinuousDao = this.qcAppManualSugarContinuousDao;
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity> queryBloodSugarByDate = qcAppManualSugarContinuousDao.queryBloodSugarByDate(mac, y_m_d);
        if (queryBloodSugarByDate != null) {
            java.util.Iterator<T> it = queryBloodSugarByDate.iterator();
            while (it.hasNext()) {
                float f = 10;
                arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean(((com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity) it.next()).getHour() * 3600, (r8.getMinSugar() * 1.0f) / f, (r8.getMaxSugar() * 1.0f) / f));
            }
        }
        return arrayList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean> queryBloodSugarByDateDetailAll(java.lang.String mac, com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarDao qcAppManualSugarDao = this.qcAppManualSugarDao;
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        java.util.Iterator<T> it = qcAppManualSugarDao.queryByDate(mac, y_m_d).iterator();
        while (it.hasNext()) {
            float f = 10;
            arrayList.add(new com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean(((com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity) it.next()).getTimestamp(), (r8.getSugar() * 1.0f) / f, (r8.getSugar() * 1.0f) / f));
        }
        return arrayList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean> queryBloodSugarByDateDetail(java.lang.String mac, com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao qcAppManualSugarContinuousDao = this.qcAppManualSugarContinuousDao;
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity> queryBloodSugarByDate = qcAppManualSugarContinuousDao.queryBloodSugarByDate(mac, y_m_d);
        if (queryBloodSugarByDate != null) {
            java.util.Iterator<T> it = queryBloodSugarByDate.iterator();
            while (it.hasNext()) {
                float f = 10;
                arrayList.add(new com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean(((com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity) it.next()).getHour() * 3600, (r8.getMinSugar() * 1.0f) / f, (r8.getMaxSugar() * 1.0f) / f));
            }
        }
        if (arrayList.size() > 1) {
            kotlin.collections.CollectionsKt.sortWith(arrayList, new java.util.Comparator() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository$queryBloodSugarByDateDetail$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean) t2).getSeconds()), java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean) t).getSeconds()));
                }
            });
        }
        return arrayList;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity queryLastBloodSugarDate() {
        return this.bloodSugarDao.queryBloodSugarByDateDesc(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    public final void deleteData() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingleAnother(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository$deleteData$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository bloodSugarRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarDao qcAppManualSugarDao;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao qcAppManualSugarContinuousDao;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao qcAppManualSugarContinuousDao2;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarDao qcAppManualSugarDao2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarRepository, "$this$ktxRunOnBgSingleAnother");
                qcAppManualSugarDao = bloodSugarRepository.qcAppManualSugarDao;
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity> queryByDate = qcAppManualSugarDao.queryByDate(deviceAddressNoClear, y_m_d);
                if (!queryByDate.isEmpty()) {
                    qcAppManualSugarDao2 = bloodSugarRepository.qcAppManualSugarDao;
                    qcAppManualSugarDao2.deleteList(kotlin.jvm.internal.TypeIntrinsics.asMutableList(queryByDate));
                }
                qcAppManualSugarContinuousDao = bloodSugarRepository.qcAppManualSugarContinuousDao;
                java.lang.String deviceAddressNoClear2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d2 = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "DateUtil().y_M_D");
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity> queryBloodSugarByDate = qcAppManualSugarContinuousDao.queryBloodSugarByDate(deviceAddressNoClear2, y_m_d2);
                if (queryBloodSugarByDate != null) {
                    qcAppManualSugarContinuousDao2 = bloodSugarRepository.qcAppManualSugarContinuousDao;
                    qcAppManualSugarContinuousDao2.deleteList(kotlin.jvm.internal.TypeIntrinsics.asMutableList(queryBloodSugarByDate));
                }
            }
        });
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartHomeView.DataBean> queryLastBloodSugar(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity queryBloodSugarByDateDesc = this.bloodSugarDao.queryBloodSugarByDateDesc(mac);
        if (queryBloodSugarByDateDesc != null) {
            java.lang.String maxArray = queryBloodSugarByDateDesc.getMaxArray();
            com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.util.List<? extends java.lang.Float>>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository$queryLastBloodSugar$$inlined$fromJson$1
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            java.util.List list = (java.util.List) adapter.fromJson(maxArray);
            java.lang.String minArray = queryBloodSugarByDateDesc.getMinArray();
            com.squareup.moshi.JsonAdapter adapter2 = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.util.List<? extends java.lang.Float>>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository$queryLastBloodSugar$$inlined$fromJson$2
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter2, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            java.util.List list2 = (java.util.List) adapter2.fromJson(minArray);
            if (list != null) {
                java.util.Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    float floatValue = ((java.lang.Number) it.next()).floatValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                    float f = 10;
                    arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartHomeView.DataBean(i * 3600, (((java.lang.Number) list2.get(i)).floatValue() * 1.0f) / f, (floatValue * 1.0f) / f, (int) queryBloodSugarByDateDesc.getUnixTime()));
                    i++;
                }
            }
        }
        return arrayList;
    }

    public final void syncBloodSugar(int offset, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        com.oudmon.ble.base.communication.LargeDataHandler.getInstance().syncBloodSugar(offset, new com.oudmon.ble.base.communication.ILargeDataResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ILargeDataResponse
            public final void parseData(int i, byte[] bArr) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository.m545syncBloodSugar$lambda4(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository.this, result, i, bArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncBloodSugar$lambda-4, reason: not valid java name */
    public static final void m545syncBloodSugar$lambda4(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository bloodSugarRepository, com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult baseDeviceResult, int i, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarRepository, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDeviceResult, "$result");
        if (i == 71) {
            int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 2, 4)) / 49;
            int i2 = 0;
            while (i2 < bytesToInt) {
                int i3 = (i2 * 49) + 6;
                i2++;
                byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, i3, (i2 * 49) + 6);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, copyOfRange);
                final com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
                final java.util.ArrayList arrayList = new java.util.ArrayList();
                final java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int length = copyOfRange.length;
                for (int i4 = 0; i4 < length; i4++) {
                    if (i4 == 0) {
                        dateUtil.addDay(-copyOfRange[0]);
                    } else if (i4 % 2 == 0) {
                        arrayList2.add(java.lang.Integer.valueOf(copyOfRange[i4]));
                    } else {
                        arrayList.add(java.lang.Integer.valueOf(copyOfRange[i4]));
                    }
                }
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(bloodSugarRepository, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository$syncBloodSugar$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository bloodSugarRepository2) {
                        com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao qcBloodSugarDao;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarRepository2, "$this$ktxRunOnBgSingle");
                        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                        java.lang.String y_m_d = com.qcwireless.qc_utils.date.DateUtil.this.getY_M_D();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
                        com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity bloodSugarEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity(deviceAddressNoClear, y_m_d, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(arrayList2), com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(arrayList), com.qcwireless.qc_utils.date.DateUtil.this.getZeroTime(), false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, bloodSugarEntity);
                        qcBloodSugarDao = bloodSugarRepository2.bloodSugarDao;
                        qcBloodSugarDao.insert(bloodSugarEntity);
                    }
                });
            }
            if (bytesToInt == 0) {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(bloodSugarRepository, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository$syncBloodSugar$1$2
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository bloodSugarRepository2) {
                        com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao qcBloodSugarDao;
                        com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodSugarDao qcBloodSugarDao2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarRepository2, "$this$ktxRunOnBgSingle");
                        qcBloodSugarDao = bloodSugarRepository2.bloodSugarDao;
                        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                        com.qcwireless.qcwatch.ui.base.repository.entity.BloodSugarEntity queryBloodSugarByDate = qcBloodSugarDao.queryBloodSugarByDate(deviceAddressNoClear, y_m_d);
                        if (queryBloodSugarByDate != null) {
                            qcBloodSugarDao2 = bloodSugarRepository2.bloodSugarDao;
                            qcBloodSugarDao2.delete(queryBloodSugarByDate);
                        }
                    }
                });
            }
            baseDeviceResult.result(0, new com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp());
        }
    }

    public final void saveManualSugar(final long dataTime, final int value) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingleAnother(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository$saveManualSugar$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository bloodSugarRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarDao qcAppManualSugarDao;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarRepository, "$this$ktxRunOnBgSingleAnother");
                com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(dataTime, true);
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d = dateUtil.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "bean.y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity appBloodSugarEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity(deviceAddressNoClear, y_m_d, (int) dataTime, value);
                qcAppManualSugarDao = bloodSugarRepository.qcAppManualSugarDao;
                qcAppManualSugarDao.insert(appBloodSugarEntity);
                bloodSugarRepository.querySugarByDate(dataTime, value);
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
            }
        });
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity> queryManualAppSugar(com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarDao qcAppManualSugarDao = this.qcAppManualSugarDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        return qcAppManualSugarDao.queryDataLimit(deviceAddressNoClear, y_m_d);
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity queryAppSugarLast() {
        return this.qcAppManualSugarDao.queryLastDataTimesTamp(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void querySugarByDate(long dataTime, int value) {
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(dataTime, true);
        com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualSugarContinuousDao qcAppManualSugarContinuousDao = this.qcAppManualSugarContinuousDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = dateUtil.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity queryDataDate = qcAppManualSugarContinuousDao.queryDataDate(deviceAddressNoClear, y_m_d, dateUtil.getHour());
        if (queryDataDate == null) {
            java.lang.String deviceAddressNoClear2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
            java.lang.String y_m_d2 = dateUtil.getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "date.y_M_D");
            queryDataDate = new com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarContinuousEntity(deviceAddressNoClear2, y_m_d2, (int) dateUtil.getUnixTimestamp(), value, value, dateUtil.getHour());
        } else {
            int minSugar = queryDataDate.getMinSugar();
            int maxSugar = queryDataDate.getMaxSugar();
            if (value < minSugar) {
                queryDataDate.setMinSugar(value);
            }
            if (value > maxSugar) {
                queryDataDate.setMaxSugar(value);
            }
        }
        this.qcAppManualSugarContinuousDao.insert(queryDataDate);
    }

    /* compiled from: BloodSugarRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodSugarRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodSugarRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodSugarRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository) com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository.getInstance$delegate.getValue();
        }
    }
}
