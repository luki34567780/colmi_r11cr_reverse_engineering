package com.qcwireless.qcwatch.ui.base.repository.mine;

/* compiled from: UserProfileRepository.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00170\u000e2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\nJ%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00170\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00170\u000e2\u0006\u0010 \u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010!J%\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00170\u000e2\u0006\u0010 \u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;", "", "()V", "targetDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcTargetDao;", "userDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcUserDao;", "downGoalSettingFromServer", "", "uid", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downUserProfileFromServer", "getUserAge", "Lkotlinx/coroutines/flow/Flow;", "", "insertTarget", "target", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/TargetEntity;", "insertUser", "bean", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;", "logOff", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "queryTarget", "queryUserByUid", "upPhotoImage", "", "file", "Ljava/io/File;", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateGoalSettingToServer", "userEntity", "(Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserProfileToServer", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class UserProfileRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository m570invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao userDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcUserDao();
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcTargetDao targetDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcTargetDao();

    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getUserAge() {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$getUserAge$1(this, null)), new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$getUserAge$2(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$getUserAge$3(null));
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity queryUserByUid(long uid) {
        return this.userDao.queryUserByUid(uid);
    }

    public final void insertUser(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity bean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bean, "bean");
        this.userDao.insert(bean);
    }

    public final void insertTarget(com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        this.targetDao.insert(target);
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity queryTarget() {
        return this.targetDao.queryTarget(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    public final java.lang.Object updateGoalSettingToServer(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateGoalSettingToServer$2(userEntity, null)), new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateGoalSettingToServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateGoalSettingToServer$4(null));
    }

    public final java.lang.Object updateUserProfileToServer(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$2(userEntity, null)), new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$updateUserProfileToServer$4(null));
    }

    public final java.lang.Object downUserProfileFromServer(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$downUserProfileFromServer$2(null)), new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$downUserProfileFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$downUserProfileFromServer$4(null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$downUserProfileFromServer$5
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserProfileResp>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserProfileResp> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao qcUserDao;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao qcUserDao2;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao qcUserDao3;
                try {
                    if (netState.getRetCode() == 0) {
                        com.qcwireless.qcwatch.ui.base.bean.response.mine.UserProfileResp isSuccess = netState.isSuccess();
                        if (isSuccess != null) {
                            qcUserDao = com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.this.userDao;
                            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity queryUserByUid = qcUserDao.queryUserByUid(isSuccess.getUid());
                            if (queryUserByUid != null) {
                                queryUserByUid.setAvatarUrl(isSuccess.getPortraitUrl());
                                queryUserByUid.setNickName(isSuccess.getNickname());
                                queryUserByUid.setGender(isSuccess.getGender());
                                if (isSuccess.getBirthday().length() > 7) {
                                    java.lang.String substring = isSuccess.getBirthday().substring(0, 7);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    queryUserByUid.setBirthday(substring);
                                } else {
                                    if (isSuccess.getBirthday().length() == 0) {
                                        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                                        queryUserByUid.setBirthday(y_m_d);
                                    } else {
                                        queryUserByUid.setBirthday(isSuccess.getBirthday());
                                    }
                                }
                                if (isSuccess.getHeight() > 0.0f) {
                                    queryUserByUid.setHeight(isSuccess.getHeight());
                                }
                                if (isSuccess.getWeight() > 0.0f) {
                                    queryUserByUid.setWeight(isSuccess.getWeight());
                                }
                                qcUserDao3 = com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.this.userDao;
                                qcUserDao3.insert(queryUserByUid);
                            } else {
                                long uid = isSuccess.getUid();
                                java.lang.String nickname = isSuccess.getNickname();
                                int gender = isSuccess.getGender();
                                float weight = isSuccess.getWeight();
                                int kgToLbs = com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kgToLbs((int) isSuccess.getWeight());
                                float height = isSuccess.getHeight();
                                java.lang.String birthday = isSuccess.getBirthday();
                                java.lang.String portraitUrl = isSuccess.getPortraitUrl();
                                java.lang.String y_m_d2 = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "DateUtil().y_M_D");
                                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity(uid, "", nickname, gender, weight, kgToLbs, height, birthday, portraitUrl, "", 10000, 300.0f, 3.0f, 3.0f, 8.0f, y_m_d2, 1);
                                qcUserDao2 = com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.this.userDao;
                                qcUserDao2.insert(userEntity);
                            }
                        }
                        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.RefreshEvent(com.qcwireless.qcwatch.ui.mine.MineFragment.class));
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object downGoalSettingFromServer(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$downGoalSettingFromServer$2(null)), new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$downGoalSettingFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$downGoalSettingFromServer$4(null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$downGoalSettingFromServer$5
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.request.user.GoalSettingRequest>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.request.user.GoalSettingRequest> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                com.qcwireless.qcwatch.ui.base.bean.request.user.GoalSettingRequest isSuccess;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao qcUserDao;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcUserDao qcUserDao2;
                try {
                    if (netState.getRetCode() == 0 && (isSuccess = netState.isSuccess()) != null) {
                        qcUserDao = com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.this.userDao;
                        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity queryUserByUid = qcUserDao.queryUserByUid(isSuccess.getUid());
                        if (queryUserByUid != null) {
                            try {
                                queryUserByUid.setGoalSteps(isSuccess.getSteps());
                                float f = 60;
                                queryUserByUid.setGoalSportTime(isSuccess.getSportTime() / f);
                                float f2 = 1000;
                                queryUserByUid.setGoalDistance(isSuccess.getMile() / f2);
                                queryUserByUid.setGoalCalorie(isSuccess.getCalorie() / f2);
                                queryUserByUid.setGoalSleepTime(isSuccess.getSleep() / f);
                                qcUserDao2 = com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.this.userDao;
                                qcUserDao2.update(queryUserByUid);
                            } catch (java.lang.Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } catch (java.lang.Exception e2) {
                    e2.printStackTrace();
                }
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object logOff(long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$logOff$2(null)), new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$logOff$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$logOff$4(null));
    }

    public final java.lang.Object upPhotoImage(java.io.File file, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.String>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$2(file, null)), new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository$upPhotoImage$4(null));
    }

    /* compiled from: UserProfileRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository) com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.getInstance$delegate.getValue();
        }
    }
}
