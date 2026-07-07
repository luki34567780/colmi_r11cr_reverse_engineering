package com.qcwireless.qcwatch.ui.mine.goal;

/* compiled from: GoalSettingViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0018R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/goal/GoalSettingViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "userProfileRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/mine/goal/GoalSettingViewModel$GoalSettingUI;", "_uiTargetState", "Lcom/qcwireless/qcwatch/ui/mine/goal/GoalSettingViewModel$GoalSettingMacUI;", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "uiTargetState", "getUiTargetState", "goalSettingFromServer", "", "queryTargetByMac", "queryUserByUid", "uid", "", "saveUserEntity", "entity", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;", "saveUserEntityTarget", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/TargetEntity;", "sendToDevice", "userEntity", "updateGoalSettingToServer", "GoalSettingMacUI", "GoalSettingUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GoalSettingViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingUI> _uiState;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingMacUI> _uiTargetState;
    private final com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;

    public final void goalSettingFromServer() {
    }

    public GoalSettingViewModel(com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        this.userProfileRepository = userProfileRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._uiTargetState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingMacUI> getUiTargetState() {
        return this._uiTargetState;
    }

    public final void queryUserByUid() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel$queryUserByUid$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel goalSettingViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSettingViewModel, "$this$ktxRunOnBgSingle");
                userProfileRepository = goalSettingViewModel.userProfileRepository;
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity queryUserByUid = userProfileRepository.queryUserByUid(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid());
                if (queryUserByUid != null) {
                    mutableLiveData2 = goalSettingViewModel._uiState;
                    mutableLiveData2.postValue(new com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingUI(queryUserByUid));
                    return;
                }
                long uid = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid();
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity(uid, "", "", 1, 60.0f, 120, 175.0f, "1995-01", "", "", 10000, 200.0f, 5.0f, 1.5f, 8.0f, y_m_d, 0);
                mutableLiveData = goalSettingViewModel._uiState;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingUI(userEntity));
            }
        });
    }

    public final void queryTargetByMac() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel$queryTargetByMac$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel goalSettingViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSettingViewModel, "$this$ktxRunOnBgSingle");
                userProfileRepository = goalSettingViewModel.userProfileRepository;
                com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity queryTarget = userProfileRepository.queryTarget();
                if (queryTarget != null) {
                    mutableLiveData2 = goalSettingViewModel._uiTargetState;
                    mutableLiveData2.postValue(new com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingMacUI(queryTarget));
                } else {
                    com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity targetEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), 10000, 200.0f, 5.0f, 1.5f, 8.0f);
                    mutableLiveData = goalSettingViewModel._uiTargetState;
                    mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingMacUI(targetEntity));
                }
            }
        });
    }

    public final void queryUserByUid(final long uid) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel$queryUserByUid$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel goalSettingViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSettingViewModel, "$this$ktxRunOnBgSingle");
                userProfileRepository = goalSettingViewModel.userProfileRepository;
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity queryUserByUid = userProfileRepository.queryUserByUid(uid);
                if (queryUserByUid != null) {
                    mutableLiveData = goalSettingViewModel._uiState;
                    mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingUI(queryUserByUid));
                }
            }
        });
    }

    public final void saveUserEntity(final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel$saveUserEntity$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel goalSettingViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSettingViewModel, "$this$ktxRunOnBgSingle");
                userProfileRepository = goalSettingViewModel.userProfileRepository;
                userProfileRepository.insertUser(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity.this);
            }
        });
    }

    public final void saveUserEntityTarget(final com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel$saveUserEntityTarget$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel goalSettingViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSettingViewModel, "$this$ktxRunOnBgSingle");
                userProfileRepository = goalSettingViewModel.userProfileRepository;
                userProfileRepository.insertTarget(com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity.this);
            }
        });
    }

    public final void sendToDevice(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEntity, "userEntity");
        float f = 1000;
        float f2 = 60;
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(com.oudmon.ble.base.communication.req.TargetSettingReq.getWriteInstance(userEntity.getGoalSteps(), (int) (userEntity.getGoalCalorie() * f), (int) (userEntity.getGoalDistance() * f), (int) (userEntity.getGoalSportTime() * f2), (int) (userEntity.getGoalSleepTime() * f2)));
    }

    public final void updateGoalSettingToServer(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEntity, "userEntity");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel$updateGoalSettingToServer$1(this, userEntity, null), 3, (java.lang.Object) null);
    }

    /* compiled from: GoalSettingViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/goal/GoalSettingViewModel$GoalSettingUI;", "", "userEntity", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;", "(Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;)V", "getUserEntity", "()Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class GoalSettingUI {
        private final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingUI copy$default(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingUI goalSettingUI, com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userEntity = goalSettingUI.userEntity;
            }
            return goalSettingUI.copy(userEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity getUserEntity() {
            return this.userEntity;
        }

        public final com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingUI copy(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEntity, "userEntity");
            return new com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingUI(userEntity);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingUI) && kotlin.jvm.internal.Intrinsics.areEqual(this.userEntity, ((com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingUI) other).userEntity);
        }

        public int hashCode() {
            return this.userEntity.hashCode();
        }

        public java.lang.String toString() {
            return "GoalSettingUI(userEntity=" + this.userEntity + ')';
        }

        public GoalSettingUI(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEntity, "userEntity");
            this.userEntity = userEntity;
        }

        public final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity getUserEntity() {
            return this.userEntity;
        }
    }

    /* compiled from: GoalSettingViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/goal/GoalSettingViewModel$GoalSettingMacUI;", "", "target", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/TargetEntity;", "(Lcom/qcwireless/qcwatch/ui/base/repository/entity/TargetEntity;)V", "getTarget", "()Lcom/qcwireless/qcwatch/ui/base/repository/entity/TargetEntity;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class GoalSettingMacUI {
        private final com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity target;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingMacUI copy$default(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingMacUI goalSettingMacUI, com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity targetEntity, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                targetEntity = goalSettingMacUI.target;
            }
            return goalSettingMacUI.copy(targetEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity getTarget() {
            return this.target;
        }

        public final com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingMacUI copy(com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity target) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
            return new com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingMacUI(target);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingMacUI) && kotlin.jvm.internal.Intrinsics.areEqual(this.target, ((com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingMacUI) other).target);
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public java.lang.String toString() {
            return "GoalSettingMacUI(target=" + this.target + ')';
        }

        public GoalSettingMacUI(com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity targetEntity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetEntity, "target");
            this.target = targetEntity;
        }

        public final com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity getTarget() {
            return this.target;
        }
    }
}
