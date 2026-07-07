package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewFirstGoalSettingBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnOver;
    public final com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView distanceGoalSelect;
    public final com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView kcalGoalSelect;
    public final android.view.View line1;
    public final android.view.View line2;
    public final android.view.View line3;
    public final android.view.View line4;
    public final android.view.View line5;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView sleepGoalSelect;
    public final com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView sportGoalSelect;
    public final com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView stepGoalSelect;
    public final android.widget.TextView tvDistanceGoalValue;
    public final android.widget.TextView tvDistanceTitle;
    public final android.widget.TextView tvDistanceValueUnit;
    public final android.widget.TextView tvKcalGoalValue;
    public final android.widget.TextView tvKcalTitle;
    public final android.widget.TextView tvKcalValueUnit;
    public final android.widget.TextView tvSleepGoalValue;
    public final android.widget.TextView tvSleepTitle;
    public final android.widget.TextView tvSleepValueUnit;
    public final android.widget.TextView tvSportGoalValue;
    public final android.widget.TextView tvSportTitle;
    public final android.widget.TextView tvSportValueUnit;
    public final android.widget.TextView tvStepGoal;
    public final android.widget.TextView tvStepGoalValue;
    public final android.widget.TextView tvStepValueUnit;

    private RecycleviewFirstGoalSettingBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnOver, com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView distanceGoalSelect, com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView kcalGoalSelect, android.view.View line1, android.view.View line2, android.view.View line3, android.view.View line4, android.view.View line5, com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView sleepGoalSelect, com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView sportGoalSelect, com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView stepGoalSelect, android.widget.TextView tvDistanceGoalValue, android.widget.TextView tvDistanceTitle, android.widget.TextView tvDistanceValueUnit, android.widget.TextView tvKcalGoalValue, android.widget.TextView tvKcalTitle, android.widget.TextView tvKcalValueUnit, android.widget.TextView tvSleepGoalValue, android.widget.TextView tvSleepTitle, android.widget.TextView tvSleepValueUnit, android.widget.TextView tvSportGoalValue, android.widget.TextView tvSportTitle, android.widget.TextView tvSportValueUnit, android.widget.TextView tvStepGoal, android.widget.TextView tvStepGoalValue, android.widget.TextView tvStepValueUnit) {
        this.rootView = rootView;
        this.btnOver = btnOver;
        this.distanceGoalSelect = distanceGoalSelect;
        this.kcalGoalSelect = kcalGoalSelect;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
        this.line5 = line5;
        this.sleepGoalSelect = sleepGoalSelect;
        this.sportGoalSelect = sportGoalSelect;
        this.stepGoalSelect = stepGoalSelect;
        this.tvDistanceGoalValue = tvDistanceGoalValue;
        this.tvDistanceTitle = tvDistanceTitle;
        this.tvDistanceValueUnit = tvDistanceValueUnit;
        this.tvKcalGoalValue = tvKcalGoalValue;
        this.tvKcalTitle = tvKcalTitle;
        this.tvKcalValueUnit = tvKcalValueUnit;
        this.tvSleepGoalValue = tvSleepGoalValue;
        this.tvSleepTitle = tvSleepTitle;
        this.tvSleepValueUnit = tvSleepValueUnit;
        this.tvSportGoalValue = tvSportGoalValue;
        this.tvSportTitle = tvSportTitle;
        this.tvSportValueUnit = tvSportValueUnit;
        this.tvStepGoal = tvStepGoal;
        this.tvStepGoalValue = tvStepGoalValue;
        this.tvStepValueUnit = tvStepValueUnit;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewFirstGoalSettingBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewFirstGoalSettingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_first_goal_setting, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewFirstGoalSettingBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_over;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_over);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.distance_goal_select;
            com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView moneySelectRuleView = (com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.distance_goal_select);
            if (moneySelectRuleView != null) {
                i = com.qcwireless.qcwatch.R.id.kcal_goal_select;
                com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView moneySelectRuleView2 = (com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.kcal_goal_select);
                if (moneySelectRuleView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.line_1;
                    android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
                    if (findChildViewById != null) {
                        i = com.qcwireless.qcwatch.R.id.line_2;
                        android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_2);
                        if (findChildViewById2 != null) {
                            i = com.qcwireless.qcwatch.R.id.line_3;
                            android.view.View findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_3);
                            if (findChildViewById3 != null) {
                                i = com.qcwireless.qcwatch.R.id.line_4;
                                android.view.View findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_4);
                                if (findChildViewById4 != null) {
                                    i = com.qcwireless.qcwatch.R.id.line_5;
                                    android.view.View findChildViewById5 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_5);
                                    if (findChildViewById5 != null) {
                                        i = com.qcwireless.qcwatch.R.id.sleep_goal_select;
                                        com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView moneySelectRuleView3 = (com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sleep_goal_select);
                                        if (moneySelectRuleView3 != null) {
                                            i = com.qcwireless.qcwatch.R.id.sport_goal_select;
                                            com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView moneySelectRuleView4 = (com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sport_goal_select);
                                            if (moneySelectRuleView4 != null) {
                                                i = com.qcwireless.qcwatch.R.id.step_goal_select;
                                                com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView moneySelectRuleView5 = (com.qcwireless.qcwatch.ui.base.view.ucenter.MoneySelectRuleView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.step_goal_select);
                                                if (moneySelectRuleView5 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.tv_distance_goal_value;
                                                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_distance_goal_value);
                                                    if (textView != null) {
                                                        i = com.qcwireless.qcwatch.R.id.tv_distance_title;
                                                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_distance_title);
                                                        if (textView2 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.tv_distance_value_unit;
                                                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_distance_value_unit);
                                                            if (textView3 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.tv_kcal_goal_value;
                                                                android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_kcal_goal_value);
                                                                if (textView4 != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.tv_kcal_title;
                                                                    android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_kcal_title);
                                                                    if (textView5 != null) {
                                                                        i = com.qcwireless.qcwatch.R.id.tv_kcal_value_unit;
                                                                        android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_kcal_value_unit);
                                                                        if (textView6 != null) {
                                                                            i = com.qcwireless.qcwatch.R.id.tv_sleep_goal_value;
                                                                            android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_goal_value);
                                                                            if (textView7 != null) {
                                                                                i = com.qcwireless.qcwatch.R.id.tv_sleep_title;
                                                                                android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_title);
                                                                                if (textView8 != null) {
                                                                                    i = com.qcwireless.qcwatch.R.id.tv_sleep_value_unit;
                                                                                    android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_value_unit);
                                                                                    if (textView9 != null) {
                                                                                        i = com.qcwireless.qcwatch.R.id.tv_sport_goal_value;
                                                                                        android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sport_goal_value);
                                                                                        if (textView10 != null) {
                                                                                            i = com.qcwireless.qcwatch.R.id.tv_sport_title;
                                                                                            android.widget.TextView textView11 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sport_title);
                                                                                            if (textView11 != null) {
                                                                                                i = com.qcwireless.qcwatch.R.id.tv_sport_value_unit;
                                                                                                android.widget.TextView textView12 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sport_value_unit);
                                                                                                if (textView12 != null) {
                                                                                                    i = com.qcwireless.qcwatch.R.id.tv_step_goal;
                                                                                                    android.widget.TextView textView13 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_step_goal);
                                                                                                    if (textView13 != null) {
                                                                                                        i = com.qcwireless.qcwatch.R.id.tv_step_goal_value;
                                                                                                        android.widget.TextView textView14 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_step_goal_value);
                                                                                                        if (textView14 != null) {
                                                                                                            i = com.qcwireless.qcwatch.R.id.tv_step_value_unit;
                                                                                                            android.widget.TextView textView15 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_step_value_unit);
                                                                                                            if (textView15 != null) {
                                                                                                                return new com.qcwireless.qcwatch.databinding.RecycleviewFirstGoalSettingBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, moneySelectRuleView, moneySelectRuleView2, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, moneySelectRuleView3, moneySelectRuleView4, moneySelectRuleView5, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15);
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
