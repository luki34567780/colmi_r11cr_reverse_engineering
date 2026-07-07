package com.qcwireless.qcwatch.ui.home.sport.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public class ExpandableRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter {
    private java.text.DecimalFormat df;
    private com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.SubItemListener listener;
    private android.content.Context mContext;
    private java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.DataListTree<java.lang.String, com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail>> mDataListTrees;
    private java.util.List<java.lang.Boolean> mGroupItemStatus;
    private java.util.Map<java.lang.Integer, int[]> map;
    private boolean metric;

    public interface SubItemListener {
        void itemClick(com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail item);
    }

    public float kmToIn(float km) {
        return km * 0.6213712f;
    }

    public void setListener(com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.SubItemListener listener) {
        this.listener = listener;
    }

    public ExpandableRecyclerViewAdapter(android.content.Context context) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.map = hashMap;
        this.mContext = context;
        hashMap.put(4, new int[]{com.qcwireless.qcwatch.R.string.qc_text_213, com.qcwireless.qcwatch.R.mipmap.sport_buxing});
        this.map.put(5, new int[]{com.qcwireless.qcwatch.R.string.qc_text_271, com.qcwireless.qcwatch.R.mipmap.sport_tiaosheng});
        this.map.put(6, new int[]{com.qcwireless.qcwatch.R.string.qc_text_338, com.qcwireless.qcwatch.R.mipmap.sport_youyong});
        this.map.put(7, new int[]{com.qcwireless.qcwatch.R.string.qc_text_295, com.qcwireless.qcwatch.R.mipmap.sport_paobu});
        this.map.put(8, new int[]{com.qcwireless.qcwatch.R.string.qc_text_214, com.qcwireless.qcwatch.R.mipmap.sport_tubu});
        this.map.put(9, new int[]{com.qcwireless.qcwatch.R.string.qc_text_216, com.qcwireless.qcwatch.R.mipmap.sport_qixing});
        this.map.put(10, new int[]{com.qcwireless.qcwatch.R.string.qc_text_215, com.qcwireless.qcwatch.R.mipmap.sport_duanlian});
        this.map.put(11, new int[]{com.qcwireless.qcwatch.R.string.qc_text_217, com.qcwireless.qcwatch.R.mipmap.sport_huipai});
        this.map.put(20, new int[]{com.qcwireless.qcwatch.R.string.qc_text_339, com.qcwireless.qcwatch.R.mipmap.sport_tubu});
        this.map.put(21, new int[]{com.qcwireless.qcwatch.R.string.qc_text_340, com.qcwireless.qcwatch.R.mipmap.sport_yumaoqiu});
        this.map.put(22, new int[]{com.qcwireless.qcwatch.R.string.qc_text_341, com.qcwireless.qcwatch.R.mipmap.sport_yujia});
        this.map.put(23, new int[]{com.qcwireless.qcwatch.R.string.qc_text_342, com.qcwireless.qcwatch.R.mipmap.sport_jianshencao});
        this.map.put(24, new int[]{com.qcwireless.qcwatch.R.string.qc_text_343, com.qcwireless.qcwatch.R.mipmap.sport_donggandanche});
        this.map.put(25, new int[]{com.qcwireless.qcwatch.R.string.qc_text_344, com.qcwireless.qcwatch.R.mipmap.sport_pihuating});
        this.map.put(26, new int[]{com.qcwireless.qcwatch.R.string.qc_text_345, com.qcwireless.qcwatch.R.mipmap.sport_tuoyuanji});
        this.map.put(27, new int[]{com.qcwireless.qcwatch.R.string.qc_text_346, com.qcwireless.qcwatch.R.mipmap.sport_huachuanji});
        this.map.put(28, new int[]{com.qcwireless.qcwatch.R.string.qc_text_347, com.qcwireless.qcwatch.R.mipmap.sport_pingpangq});
        this.map.put(29, new int[]{com.qcwireless.qcwatch.R.string.qc_text_348, com.qcwireless.qcwatch.R.mipmap.sport_wangqiu});
        this.map.put(30, new int[]{com.qcwireless.qcwatch.R.string.qc_text_349, com.qcwireless.qcwatch.R.mipmap.sport_gaoerfu});
        this.map.put(31, new int[]{com.qcwireless.qcwatch.R.string.qc_text_350, com.qcwireless.qcwatch.R.mipmap.sport_lanqiu});
        this.map.put(32, new int[]{com.qcwireless.qcwatch.R.string.qc_text_351, com.qcwireless.qcwatch.R.mipmap.sport_zuqiu});
        this.map.put(33, new int[]{com.qcwireless.qcwatch.R.string.qc_text_352, com.qcwireless.qcwatch.R.mipmap.sport_paiqiu});
        this.map.put(34, new int[]{com.qcwireless.qcwatch.R.string.qc_text_353, com.qcwireless.qcwatch.R.mipmap.sport_panyan});
        this.map.put(35, new int[]{com.qcwireless.qcwatch.R.string.qc_text_354, com.qcwireless.qcwatch.R.mipmap.sport_wudao});
        this.map.put(36, new int[]{com.qcwireless.qcwatch.R.string.qc_text_355, com.qcwireless.qcwatch.R.mipmap.sport_lunhua});
        this.map.put(40, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2590, com.qcwireless.qcwatch.R.mipmap.ic_sport_40});
        this.map.put(41, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2615, com.qcwireless.qcwatch.R.mipmap.ic_sport_41});
        this.map.put(42, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2654, com.qcwireless.qcwatch.R.mipmap.ic_sport_42});
        this.map.put(43, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2576, com.qcwireless.qcwatch.R.mipmap.ic_sport_43});
        this.map.put(44, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2526, com.qcwireless.qcwatch.R.mipmap.ic_sport_44});
        this.map.put(45, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2567, com.qcwireless.qcwatch.R.mipmap.ic_sport_45});
        this.map.put(50, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2557, com.qcwireless.qcwatch.R.mipmap.ic_sport_50});
        this.map.put(51, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2618, com.qcwireless.qcwatch.R.mipmap.ic_sport_51});
        this.map.put(52, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2613, com.qcwireless.qcwatch.R.mipmap.ic_sport_52});
        this.map.put(53, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2645, com.qcwireless.qcwatch.R.mipmap.ic_sport_53});
        this.map.put(55, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2651, com.qcwireless.qcwatch.R.mipmap.ic_sport_55});
        this.map.put(56, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2620, com.qcwireless.qcwatch.R.mipmap.ic_sport_56});
        this.map.put(57, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2597, com.qcwireless.qcwatch.R.mipmap.ic_sport_57});
        this.map.put(58, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2559, com.qcwireless.qcwatch.R.mipmap.ic_sport_58});
        this.map.put(60, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2558, com.qcwireless.qcwatch.R.mipmap.ic_sport_60});
        this.map.put(61, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2537, com.qcwireless.qcwatch.R.mipmap.ic_sport_61});
        this.map.put(62, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2535, com.qcwireless.qcwatch.R.mipmap.ic_sport_62});
        this.map.put(63, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2528, com.qcwireless.qcwatch.R.mipmap.ic_sport_63});
        this.map.put(64, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2560, com.qcwireless.qcwatch.R.mipmap.ic_sport_64});
        this.map.put(65, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2591, com.qcwireless.qcwatch.R.mipmap.ic_sport_65});
        this.map.put(66, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2610, com.qcwireless.qcwatch.R.mipmap.ic_sport_66});
        this.map.put(67, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2653, com.qcwireless.qcwatch.R.mipmap.ic_sport_67});
        this.map.put(68, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2607, com.qcwireless.qcwatch.R.mipmap.ic_sport_68});
        this.map.put(69, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2622, com.qcwireless.qcwatch.R.mipmap.ic_sport_69});
        this.map.put(70, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2584, com.qcwireless.qcwatch.R.mipmap.ic_sport_70});
        this.map.put(71, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2657, com.qcwireless.qcwatch.R.mipmap.ic_sport_71});
        this.map.put(80, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2589, com.qcwireless.qcwatch.R.mipmap.ic_sport_80});
        this.map.put(81, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2627, com.qcwireless.qcwatch.R.mipmap.ic_sport_81});
        this.map.put(82, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2563, com.qcwireless.qcwatch.R.mipmap.ic_sport_82});
        this.map.put(83, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2525, com.qcwireless.qcwatch.R.mipmap.ic_sport_83});
        this.map.put(84, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2553, com.qcwireless.qcwatch.R.mipmap.ic_sport_84});
        this.map.put(85, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2573, com.qcwireless.qcwatch.R.mipmap.ic_sport_85});
        this.map.put(86, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2617, com.qcwireless.qcwatch.R.mipmap.ic_sport_86});
        this.map.put(87, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2638, com.qcwireless.qcwatch.R.mipmap.ic_sport_87});
        this.map.put(88, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2582, com.qcwireless.qcwatch.R.mipmap.ic_sport_88});
        this.map.put(89, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2566, com.qcwireless.qcwatch.R.mipmap.ic_sport_89});
        this.map.put(90, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2672, com.qcwireless.qcwatch.R.mipmap.ic_sport_90});
        this.map.put(91, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2605, com.qcwireless.qcwatch.R.mipmap.ic_sport_91});
        this.map.put(92, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2634, com.qcwireless.qcwatch.R.mipmap.ic_sport_92});
        this.map.put(93, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2580, com.qcwireless.qcwatch.R.mipmap.ic_sport_93});
        this.map.put(94, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2596, com.qcwireless.qcwatch.R.mipmap.ic_sport_94});
        this.map.put(95, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2530, com.qcwireless.qcwatch.R.mipmap.ic_sport_95});
        this.map.put(96, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2625, com.qcwireless.qcwatch.R.mipmap.ic_sport_96});
        this.map.put(97, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2656, com.qcwireless.qcwatch.R.mipmap.ic_sport_97});
        this.map.put(98, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2570, com.qcwireless.qcwatch.R.mipmap.ic_sport_98});
        this.map.put(99, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2595, com.qcwireless.qcwatch.R.mipmap.ic_sport_99});
        this.map.put(100, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2628, com.qcwireless.qcwatch.R.mipmap.ic_sport_100});
        this.map.put(110, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2550, com.qcwireless.qcwatch.R.mipmap.ic_sport_110});
        this.map.put(111, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2574, com.qcwireless.qcwatch.R.mipmap.ic_sport_111});
        this.map.put(112, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2539, com.qcwireless.qcwatch.R.mipmap.ic_sport_112});
        this.map.put(113, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2516, com.qcwireless.qcwatch.R.mipmap.ic_sport_113});
        this.map.put(114, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2575, com.qcwireless.qcwatch.R.mipmap.ic_sport_114});
        this.map.put(115, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2673, com.qcwireless.qcwatch.R.mipmap.ic_sport_115});
        this.map.put(116, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2579, com.qcwireless.qcwatch.R.mipmap.ic_sport_116});
        this.map.put(117, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2577, com.qcwireless.qcwatch.R.mipmap.ic_sport_117});
        this.map.put(118, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2642, com.qcwireless.qcwatch.R.mipmap.ic_sport_118});
        this.map.put(119, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2548, com.qcwireless.qcwatch.R.mipmap.ic_sport_119});
        this.map.put(120, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2592, com.qcwireless.qcwatch.R.mipmap.ic_sport_120});
        this.map.put(121, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2588, com.qcwireless.qcwatch.R.mipmap.ic_sport_121});
        this.map.put(122, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2641, com.qcwireless.qcwatch.R.mipmap.ic_sport_122});
        this.map.put(123, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2643, com.qcwireless.qcwatch.R.mipmap.ic_sport_123});
        this.map.put(124, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2533, com.qcwireless.qcwatch.R.mipmap.ic_sport_124});
        this.map.put(125, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2633, com.qcwireless.qcwatch.R.mipmap.ic_sport_125});
        this.map.put(126, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2598, com.qcwireless.qcwatch.R.mipmap.ic_sport_126});
        this.map.put(130, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2603, com.qcwireless.qcwatch.R.mipmap.ic_sport_130});
        this.map.put(131, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2623, com.qcwireless.qcwatch.R.mipmap.ic_sport_131});
        this.map.put(132, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2640, com.qcwireless.qcwatch.R.mipmap.ic_sport_132});
        this.map.put(133, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2630, com.qcwireless.qcwatch.R.mipmap.ic_sport_133});
        this.map.put(134, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2631, com.qcwireless.qcwatch.R.mipmap.ic_sport_134});
        this.map.put(135, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2604, com.qcwireless.qcwatch.R.mipmap.ic_sport_135});
        this.map.put(136, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2629, com.qcwireless.qcwatch.R.mipmap.ic_sport_136});
        this.map.put(137, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2578, com.qcwireless.qcwatch.R.mipmap.ic_sport_137});
        this.map.put(138, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2671, com.qcwireless.qcwatch.R.mipmap.ic_sport_138});
        this.map.put(139, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2569, com.qcwireless.qcwatch.R.mipmap.ic_sport_139});
        this.map.put(140, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2606, com.qcwireless.qcwatch.R.mipmap.ic_sport_140});
        this.map.put(141, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2568, com.qcwireless.qcwatch.R.mipmap.ic_sport_141});
        this.map.put(142, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2568, com.qcwireless.qcwatch.R.mipmap.ic_sport_142});
        this.map.put(150, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2612, com.qcwireless.qcwatch.R.mipmap.ic_sport_150});
        this.map.put(151, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2611, com.qcwireless.qcwatch.R.mipmap.ic_sport_151});
        this.map.put(152, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2519, com.qcwireless.qcwatch.R.mipmap.ic_sport_152});
        this.map.put(153, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2581, com.qcwireless.qcwatch.R.mipmap.ic_sport_153});
        this.map.put(154, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2674, com.qcwireless.qcwatch.R.mipmap.ic_sport_154});
        this.map.put(155, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2602, com.qcwireless.qcwatch.R.mipmap.ic_sport_155});
        this.map.put(156, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2522, com.qcwireless.qcwatch.R.mipmap.ic_sport_156});
        this.map.put(157, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2587, com.qcwireless.qcwatch.R.mipmap.ic_sport_157});
        this.map.put(158, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2518, com.qcwireless.qcwatch.R.mipmap.ic_sport_158});
        this.map.put(159, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2621, com.qcwireless.qcwatch.R.mipmap.ic_sport_159});
        this.map.put(160, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2520, com.qcwireless.qcwatch.R.mipmap.ic_sport_160});
        this.map.put(161, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2585, com.qcwireless.qcwatch.R.mipmap.ic_sport_161});
        this.map.put(162, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2599, com.qcwireless.qcwatch.R.mipmap.ic_sport_162});
        this.map.put(163, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2658, com.qcwireless.qcwatch.R.mipmap.ic_sport_163});
        this.map.put(164, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2632, com.qcwireless.qcwatch.R.mipmap.ic_sport_164});
        this.map.put(165, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2540, com.qcwireless.qcwatch.R.mipmap.ic_sport_165});
        this.map.put(166, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2626, com.qcwireless.qcwatch.R.mipmap.ic_sport_166});
        this.map.put(167, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2524, com.qcwireless.qcwatch.R.mipmap.ic_sport_167});
        this.map.put(168, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2571, com.qcwireless.qcwatch.R.mipmap.ic_sport_168});
        this.map.put(169, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2619, com.qcwireless.qcwatch.R.mipmap.ic_sport_169});
        this.map.put(170, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2608, com.qcwireless.qcwatch.R.mipmap.ic_sport_170});
        this.map.put(171, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2532, com.qcwireless.qcwatch.R.mipmap.ic_sport_171});
        this.map.put(172, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2562, com.qcwireless.qcwatch.R.mipmap.ic_sport_172});
        this.map.put(173, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2531, com.qcwireless.qcwatch.R.mipmap.ic_sport_173});
        this.map.put(174, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2515, com.qcwireless.qcwatch.R.mipmap.ic_sport_174});
        this.map.put(175, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2593, com.qcwireless.qcwatch.R.mipmap.ic_sport_175});
        this.map.put(180, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2556, com.qcwireless.qcwatch.R.mipmap.ic_sport_180});
        this.map.put(181, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2541, com.qcwireless.qcwatch.R.mipmap.ic_sport_181});
        this.map.put(182, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2583, com.qcwireless.qcwatch.R.mipmap.ic_sport_182});
        this.map.put(183, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2527, com.qcwireless.qcwatch.R.mipmap.ic_sport_183});
        this.map.put(184, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2545, com.qcwireless.qcwatch.R.mipmap.ic_sport_184});
        this.map.put(185, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2561, com.qcwireless.qcwatch.R.mipmap.ic_sport_185});
        this.map.put(186, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2572, com.qcwireless.qcwatch.R.mipmap.ic_sport_186});
        this.map.put(187, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2616, com.qcwireless.qcwatch.R.mipmap.ic_sport_187});
        this.map.put(java.lang.Integer.valueOf(com.luck.picture.lib.config.PictureConfig.CHOOSE_REQUEST), new int[]{com.qcwireless.qcwatch.R.string.qc_text_2594, com.qcwireless.qcwatch.R.mipmap.ic_sport_188});
        this.map.put(189, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2546, com.qcwireless.qcwatch.R.mipmap.ic_sport_189});
        this.map.put(190, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2624, com.qcwireless.qcwatch.R.mipmap.ic_sport_190});
        this.map.put(191, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2529, com.qcwireless.qcwatch.R.mipmap.ic_sport_191});
        this.map.put(192, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2549, com.qcwireless.qcwatch.R.mipmap.ic_sport_192});
        this.map.put(193, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2652, com.qcwireless.qcwatch.R.mipmap.ic_sport_193});
        this.map.put(194, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2536, com.qcwireless.qcwatch.R.mipmap.ic_sport_194});
        this.map.put(195, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2538, com.qcwireless.qcwatch.R.mipmap.ic_sport_195});
        this.map.put(196, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2555, com.qcwireless.qcwatch.R.mipmap.ic_sport_196});
        this.map.put(197, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2675, com.qcwireless.qcwatch.R.mipmap.ic_sport_197});
        this.map.put(198, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2523, com.qcwireless.qcwatch.R.mipmap.ic_sport_198});
        this.map.put(199, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2646, com.qcwireless.qcwatch.R.mipmap.ic_sport_199});
        this.map.put(200, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2648, com.qcwireless.qcwatch.R.mipmap.ic_sport_200});
        this.map.put(java.lang.Integer.valueOf(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.PICK_IMAGE_PERMISSIONS_REQUEST_CODE), new int[]{com.qcwireless.qcwatch.R.string.qc_text_2647, com.qcwireless.qcwatch.R.mipmap.ic_sport_201});
        this.map.put(202, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2649, com.qcwireless.qcwatch.R.mipmap.ic_sport_202});
        this.map.put(210, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2554, com.qcwireless.qcwatch.R.mipmap.ic_sport_210});
        this.map.put(211, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2544, com.qcwireless.qcwatch.R.mipmap.ic_sport_211});
        this.map.put(java.lang.Integer.valueOf(com.realsil.sdk.bbpro.equalizer.AudioEq.PARSE_EQ_DATA_LENGTH), new int[]{com.qcwireless.qcwatch.R.string.qc_text_2543, com.qcwireless.qcwatch.R.mipmap.ic_sport_212});
        this.map.put(213, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2542, com.qcwireless.qcwatch.R.mipmap.ic_sport_213});
        this.map.put(214, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2517, com.qcwireless.qcwatch.R.mipmap.ic_sport_214});
        this.map.put(215, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2534, com.qcwireless.qcwatch.R.mipmap.ic_sport_215});
        this.map.put(216, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2586, com.qcwireless.qcwatch.R.mipmap.ic_sport_216});
        this.map.put(217, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2601, com.qcwireless.qcwatch.R.mipmap.ic_sport_217});
        this.map.put(218, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2609, com.qcwireless.qcwatch.R.mipmap.ic_sport_218});
        this.map.put(219, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2659, com.qcwireless.qcwatch.R.mipmap.ic_sport_219});
        this.map.put(220, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2635, com.qcwireless.qcwatch.R.mipmap.ic_sport_220});
        this.map.put(221, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2521, com.qcwireless.qcwatch.R.mipmap.ic_sport_221});
        this.map.put(222, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2636, com.qcwireless.qcwatch.R.mipmap.ic_sport_222});
        this.map.put(223, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2514, com.qcwireless.qcwatch.R.mipmap.ic_sport_223});
        this.map.put(224, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2650, com.qcwireless.qcwatch.R.mipmap.ic_sport_224});
        this.map.put(225, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2655, com.qcwireless.qcwatch.R.mipmap.ic_sport_225});
        this.map.put(230, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2552, com.qcwireless.qcwatch.R.mipmap.ic_sport_230});
        this.map.put(231, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2639, com.qcwireless.qcwatch.R.mipmap.ic_sport_231});
        this.map.put(232, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2551, com.qcwireless.qcwatch.R.mipmap.ic_sport_232});
        this.map.put(233, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2670, com.qcwireless.qcwatch.R.mipmap.ic_sport_233});
        this.map.put(234, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2600, com.qcwireless.qcwatch.R.mipmap.ic_sport_234});
        this.map.put(235, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2637, com.qcwireless.qcwatch.R.mipmap.ic_sport_235});
        this.map.put(236, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2614, com.qcwireless.qcwatch.R.mipmap.ic_sport_236});
        this.map.put(237, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2547, com.qcwireless.qcwatch.R.mipmap.ic_sport_237});
        this.map.put(238, new int[]{com.qcwireless.qcwatch.R.string.qc_text_2565, com.qcwireless.qcwatch.R.mipmap.ic_sport_238});
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0");
        this.df = decimalFormat;
        decimalFormat.setRoundingMode(java.math.RoundingMode.DOWN);
    }

    public void setData(java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.DataListTree<java.lang.String, com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail>> dataListTrees, boolean metric) {
        this.mDataListTrees = dataListTrees;
        this.metric = metric;
        initGroupItemStatus();
        notifyDataSetChanged();
    }

    private void initGroupItemStatus() {
        this.mGroupItemStatus = new java.util.ArrayList();
        for (int i = 0; i < this.mDataListTrees.size(); i++) {
            this.mGroupItemStatus.add(false);
        }
    }

    private com.qcwireless.qcwatch.ui.home.sport.bean.ItemStatus getItemStatusByPosition(int position) {
        com.qcwireless.qcwatch.ui.home.sport.bean.ItemStatus itemStatus = new com.qcwireless.qcwatch.ui.home.sport.bean.ItemStatus();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= this.mGroupItemStatus.size()) {
                break;
            }
            if (i2 == position) {
                itemStatus.setViewType(0);
                itemStatus.setGroupItemIndex(i);
                break;
            }
            if (i2 > position) {
                itemStatus.setViewType(1);
                int i3 = i - 1;
                itemStatus.setGroupItemIndex(i3);
                itemStatus.setSubItemIndex(position - (i2 - this.mDataListTrees.get(i3).getSubItem().size()));
                break;
            }
            i2++;
            if (this.mGroupItemStatus.get(i).booleanValue()) {
                i2 += this.mDataListTrees.get(i).getSubItem().size();
            }
            i++;
        }
        if (i >= this.mGroupItemStatus.size()) {
            itemStatus.setViewType(1);
            int i4 = i - 1;
            itemStatus.setGroupItemIndex(i4);
            itemStatus.setSubItemIndex(position - (i2 - this.mDataListTrees.get(i4).getSubItem().size()));
        }
        return itemStatus;
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        if (viewType == 0) {
            return new com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.GroupItemViewHolder(android.view.LayoutInflater.from(this.mContext).inflate(com.qcwireless.qcwatch.R.layout.recycleview_exp_list_group, parent, false));
        }
        if (viewType == 1) {
            return new com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.SubItemViewHolder(android.view.LayoutInflater.from(this.mContext).inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_sport_detail, parent, false));
        }
        return null;
    }

    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
        com.qcwireless.qcwatch.ui.home.sport.bean.ItemStatus itemStatusByPosition = getItemStatusByPosition(position);
        final com.qcwireless.qcwatch.ui.home.sport.bean.DataListTree<java.lang.String, com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail> dataListTree = this.mDataListTrees.get(itemStatusByPosition.getGroupItemIndex());
        if (itemStatusByPosition.getViewType() == 0) {
            final com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.GroupItemViewHolder groupItemViewHolder = (com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.GroupItemViewHolder) holder;
            groupItemViewHolder.mGroupItemTitle.setText(dataListTree.getGroupItem());
            final int groupItemIndex = itemStatusByPosition.getGroupItemIndex();
            groupItemViewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.this.m1202x90e2ccf8(groupItemIndex, groupItemViewHolder, dataListTree, view);
                }
            });
            return;
        }
        if (itemStatusByPosition.getViewType() == 1) {
            com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.SubItemViewHolder subItemViewHolder = (com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.SubItemViewHolder) holder;
            final com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail sportDetail = dataListTree.getSubItem().get(itemStatusByPosition.getSubItemIndex());
            if (this.map.get(java.lang.Integer.valueOf(sportDetail.getSportType())) != null) {
                subItemViewHolder.sportIcon.setImageResource(this.map.get(java.lang.Integer.valueOf(sportDetail.getSportType()))[1]);
            }
            subItemViewHolder.duration.setText(com.qcwireless.qc_utils.date.DateUtil.secondToStr(sportDetail.getDuration()));
            if (sportDetail.getDistance() > 0.0f) {
                int i = 5999;
                if (this.metric) {
                    try {
                        float distance = (sportDetail.getDistance() * 1.0f) / 1000.0f;
                        subItemViewHolder.value.setText((java.lang.Math.round(distance * 100.0f) / 100.0f) + "km");
                        int duration = (int) (((float) (sportDetail.getDuration() * 1000)) / sportDetail.getDistance());
                        if (duration <= 5999) {
                            i = duration;
                        }
                        subItemViewHolder.speed.setText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStrSymbol(i));
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        float kmToIn = kmToIn((sportDetail.getDistance() * 1.0f) / 1000.0f);
                        subItemViewHolder.value.setText((java.lang.Math.round(kmToIn * 100.0f) / 100.0f) + "mile");
                        int duration2 = (int) ((((double) sportDetail.getDuration()) * 1609.34d) / ((double) sportDetail.getDistance()));
                        if (duration2 <= 5999) {
                            i = duration2;
                        }
                        subItemViewHolder.speed.setText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStrSymbol(i));
                    } catch (java.lang.Exception unused) {
                    }
                }
                subItemViewHolder.group.setVisibility(0);
            } else {
                subItemViewHolder.value.setText(this.df.format((sportDetail.getCalorie() * 1.0f) / 1000.0f) + "kcal");
                subItemViewHolder.group.setVisibility(8);
            }
            subItemViewHolder.itemLayout.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View v) {
                    if (com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.this.listener != null) {
                        com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.this.listener.itemClick(sportDetail);
                    }
                }
            });
        }
    }

    /* renamed from: lambda$onBindViewHolder$0$com-qcwireless-qcwatch-ui-home-sport-adapter-ExpandableRecyclerViewAdapter, reason: not valid java name */
    public /* synthetic */ void m1202x90e2ccf8(int i, com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.GroupItemViewHolder groupItemViewHolder, com.qcwireless.qcwatch.ui.home.sport.bean.DataListTree dataListTree, android.view.View view) {
        if (this.mGroupItemStatus.get(i).booleanValue()) {
            this.mGroupItemStatus.set(i, false);
            groupItemViewHolder.imageRightClick.setImageResource(com.qcwireless.qcwatch.R.mipmap.icon_next);
            notifyItemRangeRemoved(groupItemViewHolder.getAdapterPosition() + 1, dataListTree.getSubItem().size());
        } else {
            this.mGroupItemStatus.set(i, true);
            groupItemViewHolder.imageRightClick.setImageResource(com.qcwireless.qcwatch.R.mipmap.icon_down);
            notifyDataSetChanged();
        }
    }

    public int getItemCount() {
        if (this.mGroupItemStatus.size() == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.mDataListTrees.size(); i2++) {
            try {
                i++;
                if (i2 < this.mGroupItemStatus.size() && this.mGroupItemStatus.get(i2).booleanValue()) {
                    i += this.mDataListTrees.get(i2).getSubItem().size();
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    public int getItemViewType(int position) {
        return getItemStatusByPosition(position).getViewType();
    }

    static class GroupItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        android.widget.ImageView imageRightClick;
        android.widget.TextView mGroupItemTitle;

        GroupItemViewHolder(android.view.View itemView) {
            super(itemView);
            this.mGroupItemTitle = (android.widget.TextView) itemView.findViewById(com.qcwireless.qcwatch.R.id.tv_item_group_title);
            this.imageRightClick = (android.widget.ImageView) itemView.findViewById(com.qcwireless.qcwatch.R.id.image_click);
        }
    }

    static class SubItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        android.widget.TextView duration;
        androidx.constraintlayout.widget.Group group;
        androidx.constraintlayout.widget.ConstraintLayout itemLayout;
        android.widget.TextView speed;
        android.widget.ImageView sportIcon;
        android.widget.TextView value;

        SubItemViewHolder(android.view.View itemView) {
            super(itemView);
            this.value = (android.widget.TextView) itemView.findViewById(com.qcwireless.qcwatch.R.id.tv_sport_distance);
            this.duration = (android.widget.TextView) itemView.findViewById(com.qcwireless.qcwatch.R.id.tv_sport_duration);
            this.speed = (android.widget.TextView) itemView.findViewById(com.qcwireless.qcwatch.R.id.tv_sport_speed);
            this.group = itemView.findViewById(com.qcwireless.qcwatch.R.id.group_speed);
            this.sportIcon = (android.widget.ImageView) itemView.findViewById(com.qcwireless.qcwatch.R.id.sport_type_image);
            this.itemLayout = itemView.findViewById(com.qcwireless.qcwatch.R.id.item_layout);
        }
    }
}
