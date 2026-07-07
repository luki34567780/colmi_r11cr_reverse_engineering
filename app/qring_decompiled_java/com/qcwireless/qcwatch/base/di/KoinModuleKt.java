package com.qcwireless.qcwatch.base.di;

/* compiled from: KoinModule.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"appModule", "", "Lorg/koin/core/module/Module;", "getAppModule", "()Ljava/util/List;", "repositoryModule", "getRepositoryModule", "()Lorg/koin/core/module/Module;", "viewModelModule", "getViewModelModule", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class KoinModuleKt {
    private static final java.util.List<org.koin.core.module.Module> appModule;
    private static final org.koin.core.module.Module repositoryModule;
    private static final org.koin.core.module.Module viewModelModule;

    static {
        org.koin.core.module.Module module$default = org.koin.dsl.ModuleKt.module$default(false, false, new kotlin.jvm.functions.Function1<org.koin.core.module.Module, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((org.koin.core.module.Module) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(org.koin.core.module.Module module) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "$this$module");
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass1 anonymousClass1 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.1
                    public final com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel((com.qcwireless.qcwatch.ui.base.repository.device.DeviceBindRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceBindRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel.class));
                beanDefinition.setDefinition(anonymousClass1);
                beanDefinition.setKind(kind);
                module.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass2 anonymousClass2 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.mine.login.LoginViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.2
                    public final com.qcwireless.qcwatch.ui.mine.login.LoginViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.mine.login.LoginViewModel((com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory2 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind2 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition2 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.login.LoginViewModel.class));
                beanDefinition2.setDefinition(anonymousClass2);
                beanDefinition2.setKind(kind2);
                module.declareDefinition(beanDefinition2, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition2);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass3 anonymousClass3 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.heart.HeartDetectionViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.3
                    public final com.qcwireless.qcwatch.ui.device.heart.HeartDetectionViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.heart.HeartDetectionViewModel((com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory3 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind3 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition3 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.heart.HeartDetectionViewModel.class));
                beanDefinition3.setDefinition(anonymousClass3);
                beanDefinition3.setKind(kind3);
                module.declareDefinition(beanDefinition3, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition3);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass4 anonymousClass4 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.4
                    public final com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel((com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory4 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind4 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition4 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel.class));
                beanDefinition4.setDefinition(anonymousClass4);
                beanDefinition4.setKind(kind4);
                module.declareDefinition(beanDefinition4, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition4);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass5 anonymousClass5 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.5
                    public final com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel((com.qcwireless.qcwatch.ui.base.repository.mine.RegisterRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.RegisterRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory5 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind5 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition5 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel.class));
                beanDefinition5.setDefinition(anonymousClass5);
                beanDefinition5.setKind(kind5);
                module.declareDefinition(beanDefinition5, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition5);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass6 anonymousClass6 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.6
                    public final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.HealthyRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.HealthyRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory6 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind6 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition6 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.class));
                beanDefinition6.setDefinition(anonymousClass6);
                beanDefinition6.setKind(kind6);
                module.declareDefinition(beanDefinition6, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition6);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass7 anonymousClass7 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.7
                    public final com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel((com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory7 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind7 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition7 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.class));
                beanDefinition7.setDefinition(anonymousClass7);
                beanDefinition7.setKind(kind7);
                module.declareDefinition(beanDefinition7, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition7);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass8 anonymousClass8 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.8
                    public final com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel((com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory8 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind8 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition8 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.class));
                beanDefinition8.setDefinition(anonymousClass8);
                beanDefinition8.setKind(kind8);
                module.declareDefinition(beanDefinition8, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition8);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass9 anonymousClass9 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.9
                    public final com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel((com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory9 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind9 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition9 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.class));
                beanDefinition9.setDefinition(anonymousClass9);
                beanDefinition9.setKind(kind9);
                module.declareDefinition(beanDefinition9, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition9);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass10 anonymousClass10 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.10
                    public final com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel((com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory10 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind10 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition10 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.class));
                beanDefinition10.setDefinition(anonymousClass10);
                beanDefinition10.setKind(kind10);
                module.declareDefinition(beanDefinition10, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition10);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass11 anonymousClass11 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.11
                    public final com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel((com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory11 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind11 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition11 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel.class));
                beanDefinition11.setDefinition(anonymousClass11);
                beanDefinition11.setKind(kind11);
                module.declareDefinition(beanDefinition11, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition11);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass12 anonymousClass12 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.12
                    public final com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel((com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory12 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind12 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition12 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel.class));
                beanDefinition12.setDefinition(anonymousClass12);
                beanDefinition12.setKind(kind12);
                module.declareDefinition(beanDefinition12, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition12);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass13 anonymousClass13 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.13
                    public final com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel((com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory13 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind13 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition13 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.class));
                beanDefinition13.setDefinition(anonymousClass13);
                beanDefinition13.setKind(kind13);
                module.declareDefinition(beanDefinition13, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition13);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass14 anonymousClass14 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.14
                    public final com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel((com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory14 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind14 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition14 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel.class));
                beanDefinition14.setDefinition(anonymousClass14);
                beanDefinition14.setKind(kind14);
                module.declareDefinition(beanDefinition14, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition14);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass15 anonymousClass15 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.15
                    public final com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory15 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind15 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition15 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel.class));
                beanDefinition15.setDefinition(anonymousClass15);
                beanDefinition15.setKind(kind15);
                module.declareDefinition(beanDefinition15, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition15);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass16 anonymousClass16 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.16
                    public final com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel((com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory16 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind16 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition16 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.class));
                beanDefinition16.setDefinition(anonymousClass16);
                beanDefinition16.setKind(kind16);
                module.declareDefinition(beanDefinition16, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition16);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass17 anonymousClass17 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.plate.vm.PlateFragmentViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.17
                    public final com.qcwireless.qcwatch.ui.plate.vm.PlateFragmentViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.plate.vm.PlateFragmentViewModel((com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory17 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind17 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition17 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.plate.vm.PlateFragmentViewModel.class));
                beanDefinition17.setDefinition(anonymousClass17);
                beanDefinition17.setKind(kind17);
                module.declareDefinition(beanDefinition17, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition17);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass18 anonymousClass18 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.18
                    public final com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory18 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind18 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition18 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.class));
                beanDefinition18.setDefinition(anonymousClass18);
                beanDefinition18.setKind(kind18);
                module.declareDefinition(beanDefinition18, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition18);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass19 anonymousClass19 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.19
                    public final com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.StepHistoryRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.StepHistoryRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory19 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind19 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition19 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel.class));
                beanDefinition19.setDefinition(anonymousClass19);
                beanDefinition19.setKind(kind19);
                module.declareDefinition(beanDefinition19, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition19);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass20 anonymousClass20 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.20
                    public final com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.StepHistoryRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.StepHistoryRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory20 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind20 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition20 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel.class));
                beanDefinition20.setDefinition(anonymousClass20);
                beanDefinition20.setKind(kind20);
                module.declareDefinition(beanDefinition20, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition20);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass21 anonymousClass21 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.21
                    public final com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory21 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind21 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition21 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel.class));
                beanDefinition21.setDefinition(anonymousClass21);
                beanDefinition21.setKind(kind21);
                module.declareDefinition(beanDefinition21, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition21);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass22 anonymousClass22 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.22
                    public final com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory22 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind22 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition22 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel.class));
                beanDefinition22.setDefinition(anonymousClass22);
                beanDefinition22.setKind(kind22);
                module.declareDefinition(beanDefinition22, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition22);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass23 anonymousClass23 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragmentViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.23
                    public final com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragmentViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragmentViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory23 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind23 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition23 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragmentViewModel.class));
                beanDefinition23.setDefinition(anonymousClass23);
                beanDefinition23.setKind(kind23);
                module.declareDefinition(beanDefinition23, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition23);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass24 anonymousClass24 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.24
                    public final com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory24 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind24 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition24 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.class));
                beanDefinition24.setDefinition(anonymousClass24);
                beanDefinition24.setKind(kind24);
                module.declareDefinition(beanDefinition24, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition24);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass25 anonymousClass25 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.25
                    public final com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory25 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind25 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition25 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.class));
                beanDefinition25.setDefinition(anonymousClass25);
                beanDefinition25.setKind(kind25);
                module.declareDefinition(beanDefinition25, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition25);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass26 anonymousClass26 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.26
                    public final com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory26 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind26 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition26 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.class));
                beanDefinition26.setDefinition(anonymousClass26);
                beanDefinition26.setKind(kind26);
                module.declareDefinition(beanDefinition26, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition26);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass27 anonymousClass27 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.27
                    public final com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel((com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory27 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind27 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition27 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.class));
                beanDefinition27.setDefinition(anonymousClass27);
                beanDefinition27.setKind(kind27);
                module.declareDefinition(beanDefinition27, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition27);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass28 anonymousClass28 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.28
                    public final com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory28 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind28 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition28 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.class));
                beanDefinition28.setDefinition(anonymousClass28);
                beanDefinition28.setKind(kind28);
                module.declareDefinition(beanDefinition28, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition28);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass29 anonymousClass29 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.29
                    public final com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel((com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory29 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind29 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition29 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel.class));
                beanDefinition29.setDefinition(anonymousClass29);
                beanDefinition29.setKind(kind29);
                module.declareDefinition(beanDefinition29, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition29);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass30 anonymousClass30 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.30
                    public final com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel((com.qcwireless.qcwatch.ui.base.repository.device.OTARepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.OTARepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory30 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind30 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition30 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.class));
                beanDefinition30.setDefinition(anonymousClass30);
                beanDefinition30.setKind(kind30);
                module.declareDefinition(beanDefinition30, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition30);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass31 anonymousClass31 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.31
                    public final com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel((com.qcwireless.qcwatch.ui.base.repository.device.OTARepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.OTARepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory31 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind31 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition31 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.class));
                beanDefinition31.setDefinition(anonymousClass31);
                beanDefinition31.setKind(kind31);
                module.declareDefinition(beanDefinition31, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition31);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass32 anonymousClass32 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.32
                    public final com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel((com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory32 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind32 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition32 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.class));
                beanDefinition32.setDefinition(anonymousClass32);
                beanDefinition32.setKind(kind32);
                module.declareDefinition(beanDefinition32, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition32);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass33 anonymousClass33 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.33
                    public final com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel((com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory33 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind33 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition33 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel.class));
                beanDefinition33.setDefinition(anonymousClass33);
                beanDefinition33.setKind(kind33);
                module.declareDefinition(beanDefinition33, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition33);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass34 anonymousClass34 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.34
                    public final com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel((com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory34 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind34 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition34 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel.class));
                beanDefinition34.setDefinition(anonymousClass34);
                beanDefinition34.setKind(kind34);
                module.declareDefinition(beanDefinition34, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition34);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass35 anonymousClass35 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.35
                    public final com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel((com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory35 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind35 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition35 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel.class));
                beanDefinition35.setDefinition(anonymousClass35);
                beanDefinition35.setKind(kind35);
                module.declareDefinition(beanDefinition35, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition35);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass36 anonymousClass36 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.mine.skin.SkinSelectViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.36
                    public final com.qcwireless.qcwatch.ui.mine.skin.SkinSelectViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.mine.skin.SkinSelectViewModel();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory36 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind36 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition36 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.skin.SkinSelectViewModel.class));
                beanDefinition36.setDefinition(anonymousClass36);
                beanDefinition36.setKind(kind36);
                module.declareDefinition(beanDefinition36, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition36);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass37 anonymousClass37 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.37
                    public final com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory37 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind37 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition37 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.class));
                beanDefinition37.setDefinition(anonymousClass37);
                beanDefinition37.setKind(kind37);
                module.declareDefinition(beanDefinition37, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition37);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass38 anonymousClass38 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.38
                    public final com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory38 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind38 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition38 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.class));
                beanDefinition38.setDefinition(anonymousClass38);
                beanDefinition38.setKind(kind38);
                module.declareDefinition(beanDefinition38, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition38);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass39 anonymousClass39 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.39
                    public final com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory39 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind39 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition39 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.class));
                beanDefinition39.setDefinition(anonymousClass39);
                beanDefinition39.setKind(kind39);
                module.declareDefinition(beanDefinition39, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition39);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass40 anonymousClass40 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.40
                    public final com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel((com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory40 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind40 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition40 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.class));
                beanDefinition40.setDefinition(anonymousClass40);
                beanDefinition40.setKind(kind40);
                module.declareDefinition(beanDefinition40, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition40);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass41 anonymousClass41 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.41
                    public final com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory41 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind41 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition41 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel.class));
                beanDefinition41.setDefinition(anonymousClass41);
                beanDefinition41.setKind(kind41);
                module.declareDefinition(beanDefinition41, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition41);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass42 anonymousClass42 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.42
                    public final com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel((com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory42 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind42 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition42 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel.class));
                beanDefinition42.setDefinition(anonymousClass42);
                beanDefinition42.setKind(kind42);
                module.declareDefinition(beanDefinition42, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition42);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass43 anonymousClass43 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.43
                    public final com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory43 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind43 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition43 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel.class));
                beanDefinition43.setDefinition(anonymousClass43);
                beanDefinition43.setKind(kind43);
                module.declareDefinition(beanDefinition43, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition43);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass44 anonymousClass44 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.44
                    public final com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel((com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null), (com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory44 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind44 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition44 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.contact.vm.ContactViewModel.class));
                beanDefinition44.setDefinition(anonymousClass44);
                beanDefinition44.setKind(kind44);
                module.declareDefinition(beanDefinition44, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition44);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass45 anonymousClass45 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.45
                    public final com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel((com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory45 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind45 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition45 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel.class));
                beanDefinition45.setDefinition(anonymousClass45);
                beanDefinition45.setKind(kind45);
                module.declareDefinition(beanDefinition45, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition45);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass46 anonymousClass46 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.46
                    public final com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel((com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory46 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind46 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition46 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel.class));
                beanDefinition46.setDefinition(anonymousClass46);
                beanDefinition46.setKind(kind46);
                module.declareDefinition(beanDefinition46, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition46);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass47 anonymousClass47 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.47
                    public final com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel((com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory47 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind47 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition47 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel.class));
                beanDefinition47.setDefinition(anonymousClass47);
                beanDefinition47.setKind(kind47);
                module.declareDefinition(beanDefinition47, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition47);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass48 anonymousClass48 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.48
                    public final com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel((com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory48 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind48 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition48 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.ebook.vm.EbookSelectViewModel.class));
                beanDefinition48.setDefinition(anonymousClass48);
                beanDefinition48.setKind(kind48);
                module.declareDefinition(beanDefinition48, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition48);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass49 anonymousClass49 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.device.ebook.vm.EbookManagerViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.49
                    public final com.qcwireless.qcwatch.ui.device.ebook.vm.EbookManagerViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.device.ebook.vm.EbookManagerViewModel((com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory49 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind49 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition49 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.ebook.vm.EbookManagerViewModel.class));
                beanDefinition49.setDefinition(anonymousClass49);
                beanDefinition49.setKind(kind49);
                module.declareDefinition(beanDefinition49, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition49);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass50 anonymousClass50 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.50
                    public final com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory50 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind50 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition50 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.class));
                beanDefinition50.setDefinition(anonymousClass50);
                beanDefinition50.setKind(kind50);
                module.declareDefinition(beanDefinition50, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition50);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass51 anonymousClass51 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.51
                    public final com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel((com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory51 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind51 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition51 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel.class));
                beanDefinition51.setDefinition(anonymousClass51);
                beanDefinition51.setKind(kind51);
                module.declareDefinition(beanDefinition51, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition51);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass52 anonymousClass52 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.52
                    public final com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel((com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory52 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind52 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition52 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.class));
                beanDefinition52.setDefinition(anonymousClass52);
                beanDefinition52.setKind(kind52);
                module.declareDefinition(beanDefinition52, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition52);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass53 anonymousClass53 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.53
                    public final com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory53 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind53 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition53 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.class));
                beanDefinition53.setDefinition(anonymousClass53);
                beanDefinition53.setKind(kind53);
                module.declareDefinition(beanDefinition53, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition53);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass54 anonymousClass54 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragmentViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.54
                    public final com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragmentViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragmentViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory54 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind54 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition54 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragmentViewModel.class));
                beanDefinition54.setDefinition(anonymousClass54);
                beanDefinition54.setKind(kind54);
                module.declareDefinition(beanDefinition54, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition54);
                com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.AnonymousClass55 anonymousClass55 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragmentViewModel>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$viewModelModule$1.55
                    public final com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragmentViewModel invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragmentViewModel((com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory55 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind55 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition55 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragmentViewModel.class));
                beanDefinition55.setDefinition(anonymousClass55);
                beanDefinition55.setKind(kind55);
                module.declareDefinition(beanDefinition55, new org.koin.core.definition.Options(false, false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition55);
            }
        }, 3, (java.lang.Object) null);
        viewModelModule = module$default;
        org.koin.core.module.Module module$default2 = org.koin.dsl.ModuleKt.module$default(false, false, new kotlin.jvm.functions.Function1<org.koin.core.module.Module, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((org.koin.core.module.Module) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(org.koin.core.module.Module module) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "$this$module");
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass1 anonymousClass1 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.device.DeviceBindRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.1
                    public final com.qcwireless.qcwatch.ui.base.repository.device.DeviceBindRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.device.DeviceBindRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceBindRepository.class));
                beanDefinition.setDefinition(anonymousClass1);
                beanDefinition.setKind(kind);
                module.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass2 anonymousClass2 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.2
                    public final com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory2 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind2 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition2 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.LoginRepository.class));
                beanDefinition2.setDefinition(anonymousClass2);
                beanDefinition2.setKind(kind2);
                module.declareDefinition(beanDefinition2, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass3 anonymousClass3 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.3
                    public final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory3 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind3 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition3 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.class));
                beanDefinition3.setDefinition(anonymousClass3);
                beanDefinition3.setKind(kind3);
                module.declareDefinition(beanDefinition3, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass4 anonymousClass4 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.healthy.HealthyRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.4
                    public final com.qcwireless.qcwatch.ui.base.repository.healthy.HealthyRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.healthy.HealthyRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory4 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind4 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition4 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.HealthyRepository.class));
                beanDefinition4.setDefinition(anonymousClass4);
                beanDefinition4.setKind(kind4);
                module.declareDefinition(beanDefinition4, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass5 anonymousClass5 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.5
                    public final com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory5 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind5 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition5 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.class));
                beanDefinition5.setDefinition(anonymousClass5);
                beanDefinition5.setKind(kind5);
                module.declareDefinition(beanDefinition5, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass6 anonymousClass6 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.6
                    public final com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory6 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind6 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition6 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.class));
                beanDefinition6.setDefinition(anonymousClass6);
                beanDefinition6.setKind(kind6);
                module.declareDefinition(beanDefinition6, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass7 anonymousClass7 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.7
                    public final com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory7 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind7 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition7 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository.class));
                beanDefinition7.setDefinition(anonymousClass7);
                beanDefinition7.setKind(kind7);
                module.declareDefinition(beanDefinition7, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass8 anonymousClass8 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.healthy.StepHistoryRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.8
                    public final com.qcwireless.qcwatch.ui.base.repository.healthy.StepHistoryRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.healthy.StepHistoryRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory8 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind8 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition8 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.StepHistoryRepository.class));
                beanDefinition8.setDefinition(anonymousClass8);
                beanDefinition8.setKind(kind8);
                module.declareDefinition(beanDefinition8, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass9 anonymousClass9 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.9
                    public final com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory9 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind9 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition9 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.class));
                beanDefinition9.setDefinition(anonymousClass9);
                beanDefinition9.setKind(kind9);
                module.declareDefinition(beanDefinition9, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass10 anonymousClass10 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.10
                    public final com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory10 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind10 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition10 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.class));
                beanDefinition10.setDefinition(anonymousClass10);
                beanDefinition10.setKind(kind10);
                module.declareDefinition(beanDefinition10, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass11 anonymousClass11 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.11
                    public final com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory11 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind11 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition11 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.class));
                beanDefinition11.setDefinition(anonymousClass11);
                beanDefinition11.setKind(kind11);
                module.declareDefinition(beanDefinition11, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass12 anonymousClass12 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.12
                    public final com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory12 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind12 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition12 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository.class));
                beanDefinition12.setDefinition(anonymousClass12);
                beanDefinition12.setKind(kind12);
                module.declareDefinition(beanDefinition12, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass13 anonymousClass13 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.mine.RegisterRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.13
                    public final com.qcwireless.qcwatch.ui.base.repository.mine.RegisterRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.mine.RegisterRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory13 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind13 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition13 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.RegisterRepository.class));
                beanDefinition13.setDefinition(anonymousClass13);
                beanDefinition13.setKind(kind13);
                module.declareDefinition(beanDefinition13, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass14 anonymousClass14 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.14
                    public final com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory14 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind14 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition14 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository.class));
                beanDefinition14.setDefinition(anonymousClass14);
                beanDefinition14.setKind(kind14);
                module.declareDefinition(beanDefinition14, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass15 anonymousClass15 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.15
                    public final com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory15 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind15 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition15 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository.class));
                beanDefinition15.setDefinition(anonymousClass15);
                beanDefinition15.setKind(kind15);
                module.declareDefinition(beanDefinition15, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass16 anonymousClass16 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.device.OTARepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.16
                    public final com.qcwireless.qcwatch.ui.base.repository.device.OTARepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.device.OTARepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory16 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind16 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition16 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.OTARepository.class));
                beanDefinition16.setDefinition(anonymousClass16);
                beanDefinition16.setKind(kind16);
                module.declareDefinition(beanDefinition16, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass17 anonymousClass17 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.17
                    public final com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory17 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind17 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition17 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository.class));
                beanDefinition17.setDefinition(anonymousClass17);
                beanDefinition17.setKind(kind17);
                module.declareDefinition(beanDefinition17, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass18 anonymousClass18 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.18
                    public final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory18 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind18 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition18 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository.class));
                beanDefinition18.setDefinition(anonymousClass18);
                beanDefinition18.setKind(kind18);
                module.declareDefinition(beanDefinition18, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass19 anonymousClass19 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.19
                    public final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory19 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind19 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition19 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository.class));
                beanDefinition19.setDefinition(anonymousClass19);
                beanDefinition19.setKind(kind19);
                module.declareDefinition(beanDefinition19, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass20 anonymousClass20 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.20
                    public final com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory20 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind20 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition20 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository.class));
                beanDefinition20.setDefinition(anonymousClass20);
                beanDefinition20.setKind(kind20);
                module.declareDefinition(beanDefinition20, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass21 anonymousClass21 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.21
                    public final com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory21 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind21 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition21 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository.class));
                beanDefinition21.setDefinition(anonymousClass21);
                beanDefinition21.setKind(kind21);
                module.declareDefinition(beanDefinition21, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass22 anonymousClass22 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.22
                    public final com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory22 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind22 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition22 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.class));
                beanDefinition22.setDefinition(anonymousClass22);
                beanDefinition22.setKind(kind22);
                module.declareDefinition(beanDefinition22, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass23 anonymousClass23 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.23
                    public final com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory23 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind23 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition23 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.ContactsRepository.class));
                beanDefinition23.setDefinition(anonymousClass23);
                beanDefinition23.setKind(kind23);
                module.declareDefinition(beanDefinition23, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass24 anonymousClass24 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.24
                    public final com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory24 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind24 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition24 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository.class));
                beanDefinition24.setDefinition(anonymousClass24);
                beanDefinition24.setKind(kind24);
                module.declareDefinition(beanDefinition24, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass25 anonymousClass25 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.25
                    public final com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory25 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind25 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition25 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.device.EbookRepository.class));
                beanDefinition25.setDefinition(anonymousClass25);
                beanDefinition25.setKind(kind25);
                module.declareDefinition(beanDefinition25, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass26 anonymousClass26 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.26
                    public final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory26 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind26 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition26 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository.class));
                beanDefinition26.setDefinition(anonymousClass26);
                beanDefinition26.setKind(kind26);
                module.declareDefinition(beanDefinition26, new org.koin.core.definition.Options(false, false));
                com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.AnonymousClass27 anonymousClass27 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository>() { // from class: com.qcwireless.qcwatch.base.di.KoinModuleKt$repositoryModule$1.27
                    public final com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitionParameters, "it");
                        return new com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory27 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind27 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition27 = new org.koin.core.definition.BeanDefinition((org.koin.core.qualifier.Qualifier) null, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.class));
                beanDefinition27.setDefinition(anonymousClass27);
                beanDefinition27.setKind(kind27);
                module.declareDefinition(beanDefinition27, new org.koin.core.definition.Options(false, false));
            }
        }, 3, (java.lang.Object) null);
        repositoryModule = module$default2;
        appModule = kotlin.collections.CollectionsKt.listOf(new org.koin.core.module.Module[]{module$default, module$default2});
    }

    public static final org.koin.core.module.Module getViewModelModule() {
        return viewModelModule;
    }

    public static final org.koin.core.module.Module getRepositoryModule() {
        return repositoryModule;
    }

    public static final java.util.List<org.koin.core.module.Module> getAppModule() {
        return appModule;
    }
}
