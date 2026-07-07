package com.qcwireless.qcwatch.ui.base.repository.watchface;

/* compiled from: WatchFaceRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 =2\u00020\u0001:\u0001=B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\n\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J,\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\n2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eJ\u001c\u0010\u001c\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001d0\n2\u0006\u0010\u001e\u001a\u00020\u000eJ\u001c\u0010\u001f\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001d0\n2\u0006\u0010\u001e\u001a\u00020\u000eJ\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"J%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$2\u0006\u0010'\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010(J'\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010\n0$2\u0006\u0010+\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0019\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0$H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010-J3\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\n0%0$2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u00100J%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120%0$2\u0006\u0010'\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010(J!\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030$2\u0006\u00104\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010(J\u000e\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0012J\u000e\u00108\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\nJ\u000e\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u000203J\u000e\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u000206R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceRepository;", "", "()V", "qcCustomFaceDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcCustomFaceDao;", "qcDeviceSettingDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcDeviceSettingDao;", "watchFaceDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcWatchFaceDao;", "averageAssign", "", "T", "source", "n", "", "createTask", "Lcom/liulishuo/okdownload/DownloadTask;", "url", "", "fileName", "tag", "downloadCustomImage", "", "bgUrl", "list", "Lcom/qcwireless/qcwatch/ui/base/bean/response/device/CustomDialResp$ElementUI;", "width", "height", "downloadWatchFaceBinFile", "Lcom/qcwireless/qcwatch/ui/base/bean/response/watchface/WatchFaceResp;", "version", "downloadWatchFaceImageFile", "downloadWatchFaceImageFileNotExists", "item", "Lcom/qcwireless/qcwatch/ui/plate/bean/MarketWatchFaceBean;", "getCustomWatchFaceParams", "Lkotlinx/coroutines/flow/Flow;", "Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceState;", "Lcom/qcwireless/qcwatch/ui/base/bean/response/device/CustomDialResp;", "hardwareVersion", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomizeParamsFromLocal", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/CustomFaceEntity;", "address", "getCustomizeParamsFromLocalByType", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWatchFaceFromServer", "marketVersion", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWatchFaceServiceVersion", "getWatchFaceSetting", "Lcom/qcwireless/qcwatch/ui/plate/bean/DiyWatchFaceSettingBean;", "mac", "queryByName", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/WatchFace;", "name", "queryWatchFaceListByVersion", "saveWatchFaceSetting", "watchFaceSettingBean", "updateWatchFaceBean", "bean", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WatchFaceRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository m571invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao watchFaceDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcWatchFaceDao();
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao qcDeviceSettingDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcDeviceSettingDao();
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao qcCustomFaceDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcCustomFaceDao();

    public final void downloadWatchFaceBinFile(java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp> list, int version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
    }

    public final java.lang.Object getWatchFaceFromServer(java.lang.String str, int i, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp>>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2(str, i, this, null)), new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$4(null));
    }

    public final java.lang.Object getWatchFaceServiceVersion(java.lang.String str, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.lang.String>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$2(str, null)), new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceServiceVersion$4(null));
    }

    public final void downloadWatchFaceImageFileNotExists(com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        java.io.File watchFaceDirFile = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getWatchFaceDirFile();
        java.lang.String name = item.getWatchFace().getName();
        java.lang.String str = name;
        java.util.List split$default = kotlin.text.StringsKt.split$default(str, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
        java.lang.String str2 = ((java.lang.String) kotlin.text.StringsKt.split$default(str, new char[]{'.'}, false, 0, 6, (java.lang.Object) null).get(0)) + '.' + ((java.lang.String) split$default.get(split$default.size() - 1));
        if (com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.fileExists(watchFaceDirFile.getAbsolutePath() + '/' + str2)) {
            com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.deleteFile(watchFaceDirFile.getAbsolutePath() + '/' + str2);
        }
        createTask(item.getWatchFace().getPreImageUrl(), str2, name).enqueue(new com.qcwireless.qcwatch.ui.base.repository.watchface.DownloadAImageListener());
    }

    public final void downloadWatchFaceImageFile(java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp> list, final int version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        int size = list.size() / 10;
        if (size == 0) {
            size = 1;
        }
        java.util.List<java.util.List> averageAssign = averageAssign(list, size);
        final int size2 = averageAssign.size();
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        for (java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp> list2 : averageAssign) {
            com.liulishuo.okdownload.DownloadContext.QueueSet queueSet = new com.liulishuo.okdownload.DownloadContext.QueueSet();
            java.io.File watchFaceDirFile = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getWatchFaceDirFile();
            queueSet.setParentPathFile(watchFaceDirFile);
            queueSet.setMinIntervalMillisCallbackProcess(1000);
            com.liulishuo.okdownload.DownloadContext.Builder commit = queueSet.commit();
            for (com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp watchFaceResp : list2) {
                java.lang.String name = watchFaceResp.getName();
                java.util.List split$default = kotlin.text.StringsKt.split$default(watchFaceResp.getPreImageUrl(), new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
                java.lang.String str = ((java.lang.String) kotlin.text.StringsKt.split$default(name, new char[]{'.'}, false, 0, 6, (java.lang.Object) null).get(0)) + '.' + ((java.lang.String) split$default.get(split$default.size() - 1));
                if (!com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.fileExists(watchFaceDirFile.getAbsolutePath() + '/' + str)) {
                    commit.bindSetTask(createTask(watchFaceResp.getPreImageUrl(), str, name));
                } else {
                    com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace queryWatchFaceByNameAndHdVersion = this.watchFaceDao.queryWatchFaceByNameAndHdVersion(watchFaceResp.getName(), com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion());
                    if (queryWatchFaceByNameAndHdVersion != null) {
                        queryWatchFaceByNameAndHdVersion.setLocalImageUrl(watchFaceDirFile.getAbsolutePath() + '/' + str);
                        queryWatchFaceByNameAndHdVersion.setMarketVersion(version);
                        this.watchFaceDao.insert(queryWatchFaceByNameAndHdVersion);
                    }
                }
            }
            commit.setListener(new com.liulishuo.okdownload.DownloadContextListener() { // from class: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$downloadWatchFaceImageFile$1
                @Override // com.liulishuo.okdownload.DownloadContextListener
                public void taskEnd(com.liulishuo.okdownload.DownloadContext context, com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.EndCause cause, java.lang.Exception realCause, int remainCount) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
                }

                @Override // com.liulishuo.okdownload.DownloadContextListener
                public void queueEnd(com.liulishuo.okdownload.DownloadContext context) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                    intRef.element++;
                    if (intRef.element >= size2) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "------------1000");
                        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setDownloadWatchFace(false);
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-----------图片下载完");
                        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.WatchFaceDownloadProgressEvent(50));
                        com.qcwireless.qcwatch.ui.base.repository.healthy.HealthyRepository.INSTANCE.getGetInstance().saveWatchFaceVersion(new com.qcwireless.qcwatch.ui.home.healthy.bean.WatchFaceVersionBean(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion(), java.lang.String.valueOf(version)));
                    }
                }
            });
            commit.build().startOnParallel(new com.qcwireless.qcwatch.ui.base.repository.watchface.QueueImageListener());
        }
    }

    public final void downloadCustomImage(final java.lang.String bgUrl, java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.device.CustomDialResp.ElementUI> list, final int width, final int height) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bgUrl, "bgUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        com.liulishuo.okdownload.DownloadContext.QueueSet queueSet = new com.liulishuo.okdownload.DownloadContext.QueueSet();
        final java.io.File customDialDirFile = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getCustomDialDirFile();
        queueSet.setParentPathFile(customDialDirFile);
        queueSet.setMinIntervalMillisCallbackProcess(1000);
        com.liulishuo.okdownload.DownloadContext.Builder commit = queueSet.commit();
        for (com.qcwireless.qcwatch.ui.base.bean.response.device.CustomDialResp.ElementUI elementUI : list) {
            java.lang.String valueOf = java.lang.String.valueOf(elementUI.getType());
            if (!(elementUI.getImageUrl().length() == 0)) {
                java.lang.String str = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion() + '_' + valueOf + com.luck.picture.lib.config.PictureMimeType.PNG;
                if (!com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.fileExists(customDialDirFile.getAbsolutePath() + '/' + str)) {
                    commit.bindSetTask(createTask(elementUI.getImageUrl(), str));
                }
                this.qcCustomFaceDao.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion(), elementUI.getType(), elementUI.getX(), elementUI.getY(), elementUI.getImageUrl(), customDialDirFile.getAbsolutePath() + '/' + str));
            }
        }
        final java.lang.String str2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion() + "_bg.png";
        if (!com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.fileExists(customDialDirFile.getAbsolutePath() + '/' + str2)) {
            commit.bindSetTask(createTask(bgUrl, str2));
        }
        commit.setListener(new com.liulishuo.okdownload.DownloadContextListener() { // from class: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$downloadCustomImage$1
            @Override // com.liulishuo.okdownload.DownloadContextListener
            public void taskEnd(com.liulishuo.okdownload.DownloadContext context, com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.EndCause cause, java.lang.Exception realCause, int remainCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
            }

            @Override // com.liulishuo.okdownload.DownloadContextListener
            public void queueEnd(com.liulishuo.okdownload.DownloadContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "--------end");
                final int i = width;
                final int i2 = height;
                final java.lang.String str3 = bgUrl;
                final java.io.File file = customDialDirFile;
                final java.lang.String str4 = str2;
                final com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository = this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$downloadCustomImage$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$downloadCustomImage$1$queueEnd$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$downloadCustomImage$1) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$downloadCustomImage$1 watchFaceRepository$downloadCustomImage$1) {
                        com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao qcCustomFaceDao;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFaceRepository$downloadCustomImage$1, "$this$ktxRunOnBgSingle");
                        com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity customFaceEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion(), 666, i, i2, str3, file.getAbsolutePath() + '/' + str4);
                        qcCustomFaceDao = watchFaceRepository.qcCustomFaceDao;
                        qcCustomFaceDao.insert(customFaceEntity);
                    }
                });
            }
        });
        commit.build().startOnParallel(new com.qcwireless.qcwatch.ui.base.repository.watchface.QueueDiyImageListener());
    }

    private final com.liulishuo.okdownload.DownloadTask createTask(java.lang.String url, java.lang.String fileName) {
        com.liulishuo.okdownload.DownloadTask build = new com.liulishuo.okdownload.DownloadTask.Builder(url, com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getCustomDialDirFile()).setFilename(fileName).setMinIntervalMillisCallbackProcess(64).setPriority(10).setPassIfAlreadyCompleted(false).setReadBufferSize(8192).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder(url, parentFile)…192)\n            .build()");
        return build;
    }

    private final com.liulishuo.okdownload.DownloadTask createTask(java.lang.String url, java.lang.String fileName, java.lang.String tag) {
        com.liulishuo.okdownload.DownloadTask build = new com.liulishuo.okdownload.DownloadTask.Builder(url, com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getWatchFaceDirFile()).setFilename(fileName).setMinIntervalMillisCallbackProcess(64).setPassIfAlreadyCompleted(false).setPriority(10).setConnectionCount(1).setReadBufferSize(8192).build();
        build.setTag(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "task");
        return build;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace> queryWatchFaceListByVersion() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao qcWatchFaceDao = this.watchFaceDao;
        java.lang.String hwVersion = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion();
        kotlin.jvm.internal.Intrinsics.checkNotNull(hwVersion);
        return qcWatchFaceDao.queryWatchFaceByHardwareVersion(hwVersion, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWatchFaceMarketVersion());
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace queryByName(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return this.watchFaceDao.queryWatchFaceByName(name, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion());
    }

    public final void updateWatchFaceBean(com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace bean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bean, "bean");
        this.watchFaceDao.insert(bean);
    }

    public final void saveWatchFaceSetting(final com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean watchFaceSettingBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFaceSettingBean, "watchFaceSettingBean");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$saveWatchFaceSetting$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcCustomFaceDao qcCustomFaceDao;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao qcDeviceSettingDao;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFaceRepository, "$this$ktxRunOnBgSingle");
                qcCustomFaceDao = watchFaceRepository.qcCustomFaceDao;
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity> queryWatchFaceList = qcCustomFaceDao.queryWatchFaceList(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
                if (queryWatchFaceList != null && (!queryWatchFaceList.isEmpty())) {
                    for (com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity customFaceEntity : queryWatchFaceList) {
                        int type = customFaceEntity.getType();
                        if (type == 1) {
                            com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean.this.setLocalHourImageUrl(customFaceEntity.getLocalUrl());
                        } else if (type == 2) {
                            com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean.this.setLocalBatteryImageUrl(customFaceEntity.getLocalUrl());
                        } else if (type == 3) {
                            com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean.this.setLocalDataImageUrl(customFaceEntity.getLocalUrl());
                        } else if (type == 666) {
                            com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean.this.setLocalDefaultImageUrl(customFaceEntity.getLocalUrl());
                        }
                    }
                }
                qcDeviceSettingDao = watchFaceRepository.qcDeviceSettingDao;
                qcDeviceSettingDao.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.DiyWatchFaceSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean.this)));
            }
        });
    }

    private final <T> java.util.List<java.util.List<T>> averageAssign(java.util.List<? extends T> source, int n) {
        java.util.List<? extends T> subList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = source.size() % n;
        int size2 = source.size() / n;
        int i = 0;
        for (int i2 = 0; i2 < n; i2++) {
            if (size > 0) {
                subList = source.subList((i2 * size2) + i, ((i2 + 1) * size2) + i + 1);
                size--;
                i++;
            } else {
                subList = source.subList((i2 * size2) + i, ((i2 + 1) * size2) + i);
            }
            arrayList.add(subList);
        }
        return arrayList;
    }

    public final java.lang.Object getWatchFaceSetting(java.lang.String str, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean>> continuation) {
        final kotlinx.coroutines.flow.Flow flow = kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$2(this, str, null));
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(new kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean>() { // from class: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$$inlined$map$1
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation2) {
                java.lang.Object collect = flow.collect(new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$$inlined$map$1.AnonymousClass2(flowCollector), continuation2);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$$inlined$map$1$2", f = "WatchFaceRepository.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                /* renamed from: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= com.bumptech.glide.request.target.Target.SIZE_ORIGINAL;
                        return com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$$inlined$map$1.AnonymousClass2.this.emit(null, (kotlin.coroutines.Continuation) this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r7
                        com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$$inlined$map$1$2$1 r0 = (com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r7 = r0.label
                        int r7 = r7 - r2
                        r0.label = r7
                        goto L19
                    L14:
                        com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$$inlined$map$1$2$1 r0 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L19:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L65
                    L2a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L32:
                        kotlin.ResultKt.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity r6 = (com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity) r6
                        java.lang.String r6 = r6.getContent()
                        com.qcwireless.qcwatch.base.utils.MoshiUtils r2 = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE
                        com.squareup.moshi.Moshi r2 = r2.getMoshiBuild()
                        com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$lambda-0$$inlined$fromJson$1 r4 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$lambda-0$$inlined$fromJson$1
                        r4.<init>()
                        java.lang.reflect.Type r4 = r4.getType()
                        com.squareup.moshi.JsonAdapter r2 = r2.adapter(r4)
                        java.lang.String r4 = "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)"
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
                        java.lang.Object r6 = r2.fromJson(r6)
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L65
                        return r1
                    L65:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }
        }, new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$4(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceSetting$5(this, str, null));
    }

    public final java.lang.Object getCustomWatchFaceParams(java.lang.String str, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<com.qcwireless.qcwatch.ui.base.bean.response.device.CustomDialResp>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getCustomWatchFaceParams$2(str, null)), new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getCustomWatchFaceParams$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getCustomWatchFaceParams$4(null));
    }

    public final java.lang.Object getCustomizeParamsFromLocal(java.lang.String str, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getCustomizeParamsFromLocal$2(this, str, null)), new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getCustomizeParamsFromLocal$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getCustomizeParamsFromLocal$4(null));
    }

    public final java.lang.Object getCustomizeParamsFromLocalByType(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getCustomizeParamsFromLocalByType$2(this, null)), new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getCustomizeParamsFromLocalByType$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getCustomizeParamsFromLocalByType$4(null));
    }

    /* compiled from: WatchFaceRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository) com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository.getInstance$delegate.getValue();
        }
    }
}
