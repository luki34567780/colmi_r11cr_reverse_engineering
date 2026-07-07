package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityDrinkBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink0;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink1;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink2;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink3;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink4;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink5;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink6;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink7;
    public final androidx.constraintlayout.widget.ConstraintLayout drinkAll;
    public final androidx.constraintlayout.widget.Group drinkGroup;
    public final androidx.core.widget.NestedScrollView drinkScroll;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem drinkSwitch;
    public final android.view.View line1;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView subTitle1;
    public final android.widget.TextView subTitle2;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final androidx.recyclerview.widget.RecyclerView weekDayRecycler;

    private ActivityDrinkBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink0, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink1, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink2, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink3, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink4, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink5, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink6, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick drink7, androidx.constraintlayout.widget.ConstraintLayout drinkAll, androidx.constraintlayout.widget.Group drinkGroup, androidx.core.widget.NestedScrollView drinkScroll, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem drinkSwitch, android.view.View line1, android.widget.TextView subTitle1, android.widget.TextView subTitle2, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, androidx.recyclerview.widget.RecyclerView weekDayRecycler) {
        this.rootView = rootView;
        this.drink0 = drink0;
        this.drink1 = drink1;
        this.drink2 = drink2;
        this.drink3 = drink3;
        this.drink4 = drink4;
        this.drink5 = drink5;
        this.drink6 = drink6;
        this.drink7 = drink7;
        this.drinkAll = drinkAll;
        this.drinkGroup = drinkGroup;
        this.drinkScroll = drinkScroll;
        this.drinkSwitch = drinkSwitch;
        this.line1 = line1;
        this.subTitle1 = subTitle1;
        this.subTitle2 = subTitle2;
        this.titleBar = titleBar;
        this.weekDayRecycler = weekDayRecycler;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDrinkBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDrinkBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_drink, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDrinkBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.drink_0;
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.drink_0);
        if (qSettingItemWithClick != null) {
            i = com.qcwireless.qcwatch.R.id.drink_1;
            com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick2 = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.drink_1);
            if (qSettingItemWithClick2 != null) {
                i = com.qcwireless.qcwatch.R.id.drink_2;
                com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick3 = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.drink_2);
                if (qSettingItemWithClick3 != null) {
                    i = com.qcwireless.qcwatch.R.id.drink_3;
                    com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick4 = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.drink_3);
                    if (qSettingItemWithClick4 != null) {
                        i = com.qcwireless.qcwatch.R.id.drink_4;
                        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick5 = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.drink_4);
                        if (qSettingItemWithClick5 != null) {
                            i = com.qcwireless.qcwatch.R.id.drink_5;
                            com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick6 = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.drink_5);
                            if (qSettingItemWithClick6 != null) {
                                i = com.qcwireless.qcwatch.R.id.drink_6;
                                com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick7 = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.drink_6);
                                if (qSettingItemWithClick7 != null) {
                                    i = com.qcwireless.qcwatch.R.id.drink_7;
                                    com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick8 = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.drink_7);
                                    if (qSettingItemWithClick8 != null) {
                                        i = com.qcwireless.qcwatch.R.id.drink_all;
                                        androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.drink_all);
                                        if (findChildViewById != null) {
                                            i = com.qcwireless.qcwatch.R.id.drink_group;
                                            androidx.constraintlayout.widget.Group findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.drink_group);
                                            if (findChildViewById2 != null) {
                                                i = com.qcwireless.qcwatch.R.id.drink_scroll;
                                                androidx.core.widget.NestedScrollView findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.drink_scroll);
                                                if (findChildViewById3 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.drink_switch;
                                                    com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.drink_switch);
                                                    if (qSettingItemWithClickSystem != null) {
                                                        i = com.qcwireless.qcwatch.R.id.line_1;
                                                        android.view.View findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
                                                        if (findChildViewById4 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.sub_title_1;
                                                            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sub_title_1);
                                                            if (textView != null) {
                                                                i = com.qcwireless.qcwatch.R.id.sub_title_2;
                                                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sub_title_2);
                                                                if (textView2 != null) {
                                                                    i = 2131297388;
                                                                    android.view.View findChildViewById5 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                                                                    if (findChildViewById5 != null) {
                                                                        com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById5);
                                                                        i = com.qcwireless.qcwatch.R.id.week_day_recycler;
                                                                        androidx.recyclerview.widget.RecyclerView findChildViewById6 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.week_day_recycler);
                                                                        if (findChildViewById6 != null) {
                                                                            return new com.qcwireless.qcwatch.databinding.ActivityDrinkBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, qSettingItemWithClick, qSettingItemWithClick2, qSettingItemWithClick3, qSettingItemWithClick4, qSettingItemWithClick5, qSettingItemWithClick6, qSettingItemWithClick7, qSettingItemWithClick8, findChildViewById, findChildViewById2, findChildViewById3, qSettingItemWithClickSystem, findChildViewById4, textView, textView2, bind, findChildViewById6);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
