package com.qcwireless.qcwatch.ui.home.sport;

/* compiled from: SportDetailCalorieActivity.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/SportDetailCalorieActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivitySportDetailCalorieBinding;", "detailViewModel", "Lcom/qcwireless/qcwatch/ui/home/sport/vm/SportDetailViewModel;", "getDetailViewModel", "()Lcom/qcwireless/qcwatch/ui/home/sport/vm/SportDetailViewModel;", "detailViewModel$delegate", "Lkotlin/Lazy;", "distanceDf", "Ljava/text/DecimalFormat;", "maxHeart", "", "sportMap", "", "", "sportMaxHeart", "sportStartTime", "", "sportType", "userAge", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SportDetailCalorieActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivitySportDetailCalorieBinding binding;

    /* renamed from: detailViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy detailViewModel;
    private java.text.DecimalFormat distanceDf;
    private int maxHeart;
    private java.util.Map<java.lang.Integer, java.lang.Integer[]> sportMap;
    private int sportMaxHeart;
    private long sportStartTime;
    private int sportType;
    private int userAge;

    public SportDetailCalorieActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.detailViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportDetailCalorieActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel m1184invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel.class), qualifier, qualifier);
            }
        });
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.sportMap = linkedHashMap;
        this.userAge = 27;
        this.maxHeart = 200;
        linkedHashMap.put(4, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_213), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_buxing)});
        this.sportMap.put(5, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_271), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_tiaosheng)});
        this.sportMap.put(6, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_338), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_youyong)});
        this.sportMap.put(7, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_295), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_paobu)});
        java.util.Map<java.lang.Integer, java.lang.Integer[]> map = this.sportMap;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_tubu);
        map.put(8, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_214), valueOf});
        this.sportMap.put(9, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_216), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_qixing)});
        this.sportMap.put(10, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_215), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_duanlian)});
        this.sportMap.put(11, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_217), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_huipai)});
        this.sportMap.put(20, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_339), valueOf});
        this.sportMap.put(21, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_340), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_yumaoqiu)});
        this.sportMap.put(22, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_341), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_yujia)});
        this.sportMap.put(23, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_342), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_jianshencao)});
        this.sportMap.put(24, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_343), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_donggandanche)});
        this.sportMap.put(25, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_344), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_pihuating)});
        this.sportMap.put(26, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_345), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_tuoyuanji)});
        this.sportMap.put(27, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_346), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_huachuanji)});
        this.sportMap.put(28, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_347), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_pingpangq)});
        this.sportMap.put(29, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_348), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_wangqiu)});
        this.sportMap.put(30, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_349), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_gaoerfu)});
        this.sportMap.put(31, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_350), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_lanqiu)});
        this.sportMap.put(32, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_351), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_zuqiu)});
        this.sportMap.put(33, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_352), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_paiqiu)});
        this.sportMap.put(34, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_353), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_panyan)});
        this.sportMap.put(35, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_354), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_wudao)});
        this.sportMap.put(36, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_355), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_lunhua)});
        this.sportMap.put(40, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2590), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_40)});
        this.sportMap.put(41, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2615), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_41)});
        this.sportMap.put(42, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2654), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_42)});
        this.sportMap.put(43, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2576), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_43)});
        this.sportMap.put(44, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2526), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_44)});
        this.sportMap.put(45, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2567), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_45)});
        this.sportMap.put(50, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2557), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_50)});
        this.sportMap.put(51, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2618), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_51)});
        this.sportMap.put(52, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2613), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_52)});
        this.sportMap.put(53, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2645), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_53)});
        this.sportMap.put(55, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2651), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_55)});
        this.sportMap.put(56, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2620), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_56)});
        this.sportMap.put(57, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2597), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_57)});
        this.sportMap.put(58, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2559), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_58)});
        this.sportMap.put(60, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2558), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_60)});
        this.sportMap.put(61, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2537), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_61)});
        this.sportMap.put(62, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2535), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_62)});
        this.sportMap.put(63, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2528), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_63)});
        this.sportMap.put(64, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2560), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_64)});
        this.sportMap.put(65, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2591), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_65)});
        this.sportMap.put(66, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2610), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_66)});
        this.sportMap.put(67, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2653), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_67)});
        this.sportMap.put(68, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2607), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_68)});
        this.sportMap.put(69, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2622), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_69)});
        this.sportMap.put(70, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2584), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_70)});
        this.sportMap.put(71, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2657), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_71)});
        this.sportMap.put(80, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2589), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_80)});
        this.sportMap.put(81, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2627), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_81)});
        this.sportMap.put(82, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2563), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_82)});
        this.sportMap.put(83, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2525), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_83)});
        this.sportMap.put(84, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2553), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_84)});
        this.sportMap.put(85, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2573), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_85)});
        this.sportMap.put(86, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2617), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_86)});
        this.sportMap.put(87, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2638), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_87)});
        this.sportMap.put(88, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2582), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_88)});
        this.sportMap.put(89, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2566), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_89)});
        this.sportMap.put(90, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2672), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_90)});
        this.sportMap.put(91, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2605), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_91)});
        this.sportMap.put(92, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2634), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_92)});
        this.sportMap.put(93, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2580), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_93)});
        this.sportMap.put(94, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2596), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_94)});
        this.sportMap.put(95, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2530), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_95)});
        this.sportMap.put(96, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2625), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_96)});
        this.sportMap.put(97, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2656), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_97)});
        this.sportMap.put(98, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2570), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_98)});
        this.sportMap.put(99, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2595), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_99)});
        this.sportMap.put(100, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2628), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_100)});
        this.sportMap.put(110, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2550), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_110)});
        this.sportMap.put(111, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2574), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_111)});
        this.sportMap.put(112, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2539), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_112)});
        this.sportMap.put(113, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2516), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_113)});
        this.sportMap.put(114, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2575), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_114)});
        this.sportMap.put(115, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2673), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_115)});
        this.sportMap.put(116, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2579), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_116)});
        this.sportMap.put(117, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2577), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_117)});
        this.sportMap.put(118, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2642), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_118)});
        this.sportMap.put(119, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2548), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_119)});
        this.sportMap.put(120, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2592), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_120)});
        this.sportMap.put(121, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2588), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_121)});
        this.sportMap.put(122, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2641), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_122)});
        this.sportMap.put(123, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2643), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_123)});
        this.sportMap.put(124, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2533), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_124)});
        this.sportMap.put(125, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2633), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_125)});
        this.sportMap.put(126, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2598), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_126)});
        this.sportMap.put(130, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2603), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_130)});
        this.sportMap.put(131, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2623), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_131)});
        this.sportMap.put(132, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2640), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_132)});
        this.sportMap.put(133, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2630), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_133)});
        this.sportMap.put(134, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2631), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_134)});
        this.sportMap.put(135, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2604), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_135)});
        this.sportMap.put(136, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2629), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_136)});
        this.sportMap.put(137, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2578), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_137)});
        this.sportMap.put(138, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2671), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_138)});
        this.sportMap.put(139, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2569), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_139)});
        this.sportMap.put(140, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2606), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_140)});
        java.util.Map<java.lang.Integer, java.lang.Integer[]> map2 = this.sportMap;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2568);
        map2.put(141, new java.lang.Integer[]{valueOf2, java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_141)});
        this.sportMap.put(142, new java.lang.Integer[]{valueOf2, java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_142)});
        this.sportMap.put(150, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2612), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_150)});
        this.sportMap.put(151, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2611), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_151)});
        this.sportMap.put(152, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2519), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_152)});
        this.sportMap.put(153, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2581), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_153)});
        this.sportMap.put(154, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2674), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_154)});
        this.sportMap.put(155, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2602), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_155)});
        this.sportMap.put(156, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2522), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_156)});
        this.sportMap.put(157, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2587), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_157)});
        this.sportMap.put(158, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2518), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_158)});
        this.sportMap.put(159, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2621), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_159)});
        this.sportMap.put(160, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2520), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_160)});
        this.sportMap.put(161, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2585), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_161)});
        this.sportMap.put(162, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2599), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_162)});
        this.sportMap.put(163, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2658), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_163)});
        this.sportMap.put(164, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2632), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_164)});
        this.sportMap.put(165, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2540), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_165)});
        this.sportMap.put(166, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2626), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_166)});
        this.sportMap.put(167, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2524), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_167)});
        this.sportMap.put(168, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2571), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_168)});
        this.sportMap.put(169, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2619), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_169)});
        this.sportMap.put(170, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2608), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_170)});
        this.sportMap.put(171, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2532), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_171)});
        this.sportMap.put(172, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2562), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_172)});
        this.sportMap.put(173, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2531), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_173)});
        this.sportMap.put(174, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2515), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_174)});
        this.sportMap.put(175, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2593), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_175)});
        this.sportMap.put(180, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2556), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_180)});
        this.sportMap.put(181, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2541), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_181)});
        this.sportMap.put(182, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2583), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_182)});
        this.sportMap.put(183, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2527), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_183)});
        this.sportMap.put(184, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2545), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_184)});
        this.sportMap.put(185, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2561), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_185)});
        this.sportMap.put(186, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2572), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_186)});
        this.sportMap.put(187, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2616), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_187)});
        this.sportMap.put(java.lang.Integer.valueOf(com.luck.picture.lib.config.PictureConfig.CHOOSE_REQUEST), new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2594), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_188)});
        this.sportMap.put(189, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2546), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_189)});
        this.sportMap.put(190, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2624), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_190)});
        this.sportMap.put(191, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2529), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_191)});
        this.sportMap.put(192, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2549), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_192)});
        this.sportMap.put(193, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2652), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_193)});
        this.sportMap.put(194, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2536), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_194)});
        this.sportMap.put(195, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2538), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_195)});
        this.sportMap.put(196, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2555), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_196)});
        this.sportMap.put(197, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2675), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_197)});
        this.sportMap.put(198, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2523), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_198)});
        this.sportMap.put(199, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2646), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_199)});
        this.sportMap.put(200, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2648), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_200)});
        this.sportMap.put(java.lang.Integer.valueOf(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.PICK_IMAGE_PERMISSIONS_REQUEST_CODE), new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2647), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_201)});
        this.sportMap.put(202, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2649), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_202)});
        this.sportMap.put(210, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2554), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_210)});
        this.sportMap.put(211, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2544), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_211)});
        this.sportMap.put(java.lang.Integer.valueOf(com.realsil.sdk.bbpro.equalizer.AudioEq.PARSE_EQ_DATA_LENGTH), new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2543), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_212)});
        this.sportMap.put(213, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2542), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_213)});
        this.sportMap.put(214, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2517), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_214)});
        this.sportMap.put(215, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2534), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_215)});
        this.sportMap.put(216, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2586), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_216)});
        this.sportMap.put(217, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2601), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_217)});
        this.sportMap.put(218, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2609), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_218)});
        this.sportMap.put(219, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2659), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_219)});
        this.sportMap.put(220, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2635), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_220)});
        this.sportMap.put(221, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2521), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_221)});
        this.sportMap.put(222, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2636), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_222)});
        this.sportMap.put(223, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2514), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_223)});
        this.sportMap.put(224, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2650), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_224)});
        this.sportMap.put(225, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2655), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_225)});
        this.sportMap.put(230, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2552), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_230)});
        this.sportMap.put(231, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2639), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_231)});
        this.sportMap.put(232, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2551), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_232)});
        this.sportMap.put(233, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2670), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_233)});
        this.sportMap.put(234, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2600), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_234)});
        this.sportMap.put(235, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2637), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_235)});
        this.sportMap.put(236, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2614), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_236)});
        this.sportMap.put(237, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2547), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_237)});
        this.sportMap.put(238, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2565), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_238)});
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.00");
        this.distanceDf = decimalFormat;
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
    }

    private final com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel getDetailViewModel() {
        return (com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel) this.detailViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivitySportDetailCalorieBinding inflate = com.qcwireless.qcwatch.databinding.ActivitySportDetailCalorieBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        androidx.constraintlayout.widget.ConstraintLayout root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView((android.view.View) root);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.sport_bg);
        com.qcwireless.qcwatch.databinding.ActivitySportDetailCalorieBinding activitySportDetailCalorieBinding = null;
        try {
            android.os.Bundle extras = getIntent().getExtras();
            java.lang.Integer valueOf = extras != null ? java.lang.Integer.valueOf(extras.getInt("sport_type")) : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
            this.sportType = valueOf.intValue();
            android.os.Bundle extras2 = getIntent().getExtras();
            java.lang.Long valueOf2 = extras2 != null ? java.lang.Long.valueOf(extras2.getLong("start_time")) : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf2);
            this.sportStartTime = valueOf2.longValue();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        getDetailViewModel().m1211getAge();
        com.qcwireless.qcwatch.databinding.ActivitySportDetailCalorieBinding activitySportDetailCalorieBinding2 = this.binding;
        if (activitySportDetailCalorieBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportDetailCalorieBinding2 = null;
        }
        activitySportDetailCalorieBinding2.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_83));
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getDetailViewModel().getAge().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportDetailCalorieActivity$$ExternalSyntheticLambda2
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.sport.SportDetailCalorieActivity.m1181setupViews$lambda1(com.qcwireless.qcwatch.ui.home.sport.SportDetailCalorieActivity.this, (com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge) obj);
            }
        });
        getDetailViewModel().getUi().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportDetailCalorieActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.sport.SportDetailCalorieActivity.m1182setupViews$lambda4(com.qcwireless.qcwatch.ui.home.sport.SportDetailCalorieActivity.this, (com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivitySportDetailCalorieBinding activitySportDetailCalorieBinding3 = this.binding;
        if (activitySportDetailCalorieBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activitySportDetailCalorieBinding = activitySportDetailCalorieBinding3;
        }
        activitySportDetailCalorieBinding.tvDesc.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportDetailCalorieActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.sport.SportDetailCalorieActivity.m1183setupViews$lambda5(com.qcwireless.qcwatch.ui.home.sport.SportDetailCalorieActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m1181setupViews$lambda1(com.qcwireless.qcwatch.ui.home.sport.SportDetailCalorieActivity sportDetailCalorieActivity, com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge userAge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportDetailCalorieActivity, "this$0");
        int age = userAge.getAge();
        sportDetailCalorieActivity.userAge = age;
        sportDetailCalorieActivity.maxHeart = 220 - age;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sportDetailCalorieActivity.maxHeart + "--" + sportDetailCalorieActivity.userAge);
        sportDetailCalorieActivity.getDetailViewModel().querySportDetail(sportDetailCalorieActivity.sportType, sportDetailCalorieActivity.sportStartTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m1182setupViews$lambda4(com.qcwireless.qcwatch.ui.home.sport.SportDetailCalorieActivity sportDetailCalorieActivity, com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail sportPlusDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportDetailCalorieActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivitySportDetailCalorieBinding activitySportDetailCalorieBinding = sportDetailCalorieActivity.binding;
        if (activitySportDetailCalorieBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportDetailCalorieBinding = null;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sportPlusDetail);
        activitySportDetailCalorieBinding.tvKcal.setText(java.lang.String.valueOf((int) (sportPlusDetail.getCalories() / 1000)));
        activitySportDetailCalorieBinding.tvSportStartTime.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateYMDHMSFormatSport(new com.qcwireless.qc_utils.date.DateUtil(sportPlusDetail.getStartTime(), true)));
        android.widget.TextView textView = activitySportDetailCalorieBinding.tvSportName;
        java.lang.Integer[] numArr = sportDetailCalorieActivity.sportMap.get(java.lang.Integer.valueOf(sportPlusDetail.getSportType()));
        textView.setText(numArr != null ? sportDetailCalorieActivity.getString(numArr[0].intValue()) : null);
        com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem qSportDetailItem = activitySportDetailCalorieBinding.sportDurationTime;
        java.lang.String secondToStr = com.qcwireless.qc_utils.date.DateUtil.secondToStr(sportPlusDetail.getDuration());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(secondToStr, "secondToStr(it.duration)");
        qSportDetailItem.setValue(secondToStr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int[] stringToIntArray = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(sportPlusDetail.getRateValue());
        int length = stringToIntArray.length;
        for (int i = 0; i < length; i++) {
            int i2 = stringToIntArray[i];
            if (i2 > sportDetailCalorieActivity.sportMaxHeart) {
                sportDetailCalorieActivity.sportMaxHeart = i2;
            }
            arrayList = arrayList;
            arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QHeartSportDetailLineChartView.HeartDataBean((int) (sportPlusDetail.getStartTime() + (i * 60)), i2, false));
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            com.qcwireless.qcwatch.databinding.ActivitySportDetailCalorieBinding activitySportDetailCalorieBinding2 = sportDetailCalorieActivity.binding;
            if (activitySportDetailCalorieBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activitySportDetailCalorieBinding2 = null;
            }
            activitySportDetailCalorieBinding2.sportDetailHeartLine.setData(sportPlusDetail.getStartTime(), sportPlusDetail.getDuration() + sportPlusDetail.getStartTime(), arrayList);
        } else {
            com.qcwireless.qcwatch.databinding.ActivitySportDetailCalorieBinding activitySportDetailCalorieBinding3 = sportDetailCalorieActivity.binding;
            if (activitySportDetailCalorieBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activitySportDetailCalorieBinding3 = null;
            }
            activitySportDetailCalorieBinding3.sportDetailHeartLine.setData(0L, 0L, arrayList);
        }
        if (!arrayList2.isEmpty()) {
            int[] iArr = {0, 0, 0, 0, 0};
            int duration = sportPlusDetail.getDuration() / arrayList.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                float value = ((com.qcwireless.qcwatch.ui.base.view.QHeartSportDetailLineChartView.HeartDataBean) it.next()).getValue();
                int i3 = sportDetailCalorieActivity.maxHeart;
                if (value >= i3 * 0.9f) {
                    iArr[0] = iArr[0] + duration;
                } else if (value >= i3 * 0.8f) {
                    iArr[1] = iArr[1] + duration;
                } else if (value >= i3 * 0.7f) {
                    iArr[2] = iArr[2] + duration;
                } else if (value >= i3 * 0.6f) {
                    iArr[3] = iArr[3] + duration;
                } else if (value >= i3 * 0.5f) {
                    iArr[4] = iArr[4] + duration;
                }
            }
            iArr[0] = iArr[0] / 60;
            iArr[1] = iArr[1] / 60;
            iArr[2] = iArr[2] / 60;
            iArr[3] = iArr[3] / 60;
            iArr[4] = iArr[4] / 60;
            activitySportDetailCalorieBinding.heartCircleView.dataInit(iArr);
            if (iArr[0] > 0) {
                android.widget.TextView textView2 = activitySportDetailCalorieBinding.tvValue1;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_100)");
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(iArr[0])}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                textView2.setText(format);
            } else {
                android.widget.TextView textView3 = activitySportDetailCalorieBinding.tvValue1;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string2 = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_100)");
                java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
                textView3.setText(format2);
            }
            if (iArr[1] > 0) {
                android.widget.TextView textView4 = activitySportDetailCalorieBinding.tvValue2;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string3 = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_100)");
                java.lang.String format3 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(iArr[1])}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "format(format, *args)");
                textView4.setText(format3);
            } else {
                android.widget.TextView textView5 = activitySportDetailCalorieBinding.tvValue2;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject4 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string4 = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_100)");
                java.lang.String format4 = java.lang.String.format(string4, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format4, "format(format, *args)");
                textView5.setText(format4);
            }
            if (iArr[2] > 0) {
                android.widget.TextView textView6 = activitySportDetailCalorieBinding.tvValue3;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject5 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string5 = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_100)");
                java.lang.String format5 = java.lang.String.format(string5, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(iArr[2])}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format5, "format(format, *args)");
                textView6.setText(format5);
            } else {
                android.widget.TextView textView7 = activitySportDetailCalorieBinding.tvValue3;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject6 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string6 = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.qc_text_100)");
                java.lang.String format6 = java.lang.String.format(string6, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format6, "format(format, *args)");
                textView7.setText(format6);
            }
            if (iArr[3] > 0) {
                android.widget.TextView textView8 = activitySportDetailCalorieBinding.tvValue4;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject7 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string7 = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.qc_text_100)");
                java.lang.String format7 = java.lang.String.format(string7, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(iArr[3])}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format7, "format(format, *args)");
                textView8.setText(format7);
            } else {
                android.widget.TextView textView9 = activitySportDetailCalorieBinding.tvValue4;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject8 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string8 = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.qc_text_100)");
                java.lang.String format8 = java.lang.String.format(string8, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format8, "format(format, *args)");
                textView9.setText(format8);
            }
            if (iArr[4] > 0) {
                android.widget.TextView textView10 = activitySportDetailCalorieBinding.tvValue5;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject9 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string9 = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string9, "getString(R.string.qc_text_100)");
                java.lang.String format9 = java.lang.String.format(string9, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(iArr[4])}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format9, "format(format, *args)");
                textView10.setText(format9);
            } else {
                android.widget.TextView textView11 = activitySportDetailCalorieBinding.tvValue5;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject10 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string10 = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string10, "getString(R.string.qc_text_100)");
                java.lang.String format10 = java.lang.String.format(string10, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format10, "format(format, *args)");
                textView11.setText(format10);
            }
        } else {
            activitySportDetailCalorieBinding.heartCircleView.dataInit(new int[]{0, 0, 0, 0, 0});
            android.widget.TextView textView12 = activitySportDetailCalorieBinding.tvValue1;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject11 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string11 = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string11, "getString(R.string.qc_text_100)");
            java.lang.String format11 = java.lang.String.format(string11, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format11, "format(format, *args)");
            textView12.setText(format11);
            android.widget.TextView textView13 = activitySportDetailCalorieBinding.tvValue2;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject12 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string12 = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string12, "getString(R.string.qc_text_100)");
            java.lang.String format12 = java.lang.String.format(string12, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format12, "format(format, *args)");
            textView13.setText(format12);
            android.widget.TextView textView14 = activitySportDetailCalorieBinding.tvValue3;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject13 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string13 = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string13, "getString(R.string.qc_text_100)");
            java.lang.String format13 = java.lang.String.format(string13, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format13, "format(format, *args)");
            textView14.setText(format13);
            android.widget.TextView textView15 = activitySportDetailCalorieBinding.tvValue4;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject14 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string14 = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string14, "getString(R.string.qc_text_100)");
            java.lang.String format14 = java.lang.String.format(string14, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format14, "format(format, *args)");
            textView15.setText(format14);
            android.widget.TextView textView16 = activitySportDetailCalorieBinding.tvValue5;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject15 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string15 = sportDetailCalorieActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string15, "getString(R.string.qc_text_100)");
            java.lang.String format15 = java.lang.String.format(string15, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format15, "format(format, *args)");
            textView16.setText(format15);
        }
        if (sportPlusDetail.getAvgRate() > 0) {
            int avgRate = sportPlusDetail.getAvgRate();
            activitySportDetailCalorieBinding.tvHeartMaxValue.setText(java.lang.String.valueOf(sportDetailCalorieActivity.sportMaxHeart));
            activitySportDetailCalorieBinding.tvHeartMinValue.setText(java.lang.String.valueOf(avgRate));
            activitySportDetailCalorieBinding.sportHeart.setValue(java.lang.String.valueOf(avgRate));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m1183setupViews$lambda5(com.qcwireless.qcwatch.ui.home.sport.SportDetailCalorieActivity sportDetailCalorieActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportDetailCalorieActivity, "this$0");
        android.app.Activity activity = (android.app.Activity) sportDetailCalorieActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.heart.ExerciseHeartGuideActivity.class);
        for (kotlin.Pair pair : arrayList) {
            if (pair != null) {
                java.lang.String str = (java.lang.String) pair.getFirst();
                java.lang.Object second = pair.getSecond();
                if (second instanceof java.lang.Integer) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Byte) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Character) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Short) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Boolean) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Long) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Float) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.Double) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                } else if (second instanceof java.lang.String) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                } else if (second instanceof java.lang.CharSequence) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                } else if (second instanceof android.os.Parcelable) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                } else if (second instanceof java.lang.Object[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                } else if (second instanceof java.util.ArrayList) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                } else if (second instanceof java.io.Serializable) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                } else if (second instanceof boolean[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                } else if (second instanceof byte[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                } else if (second instanceof short[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                } else if (second instanceof char[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                } else if (second instanceof int[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                } else if (second instanceof long[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                } else if (second instanceof float[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                } else if (second instanceof double[]) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                } else if (second instanceof android.os.Bundle) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                } else if (second instanceof android.content.Intent) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                } else {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }
        activity.startActivity(intent);
    }
}
