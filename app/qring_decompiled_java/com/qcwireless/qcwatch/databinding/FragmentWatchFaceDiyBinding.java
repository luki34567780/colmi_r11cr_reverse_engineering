package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentWatchFaceDiyBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.ProgressButton btnDiySave;
    public final com.qcwireless.qcwatch.ui.base.view.ColorPickerView colorPicker;
    public final com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup colorRadioGroup;
    public final androidx.constraintlayout.widget.ConstraintLayout cslDiy;
    public final androidx.recyclerview.widget.RecyclerView diyFaceRecycler;
    public final androidx.recyclerview.widget.RecyclerView diyNeedleRecycler;
    public final com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup diyRadioGroup;
    public final com.qcwireless.qcwatch.ui.base.view.CircleFrameLayout dragLayout;
    public final androidx.constraintlayout.widget.Group group1;
    public final androidx.constraintlayout.widget.Group group2;
    public final android.widget.ImageView imageCamera;
    public final android.widget.ImageView imageWatchNeedle;
    public final android.widget.ImageView imageWatchPreview;
    public final android.widget.TextView ivImageLight;
    public final android.widget.TextView ivImageShow;
    public final android.widget.TextView ivNeedleShow;
    public final android.widget.LinearLayout layoutSeekbar;
    public final android.widget.RadioButton rbNeedle;
    public final android.widget.RadioButton rbNumber;
    public final android.widget.RadioButton rbText1;
    public final android.widget.RadioButton rbText2;
    public final android.widget.RadioButton rbText3;
    public final android.widget.RadioButton rbText4;
    public final android.widget.RadioButton rbText5;
    public final android.widget.RadioButton rbText6;
    public final android.widget.RadioButton rbText7;
    public final android.widget.RadioButton rbText8;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.SeekBar seekBar;
    public final android.widget.TextView tvColorTitle;
    public final android.view.View viewOut;
    public final android.view.View viewOutCamera;

    private FragmentWatchFaceDiyBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.ProgressButton btnDiySave, com.qcwireless.qcwatch.ui.base.view.ColorPickerView colorPicker, com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup colorRadioGroup, androidx.constraintlayout.widget.ConstraintLayout cslDiy, androidx.recyclerview.widget.RecyclerView diyFaceRecycler, androidx.recyclerview.widget.RecyclerView diyNeedleRecycler, com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup diyRadioGroup, com.qcwireless.qcwatch.ui.base.view.CircleFrameLayout dragLayout, androidx.constraintlayout.widget.Group group1, androidx.constraintlayout.widget.Group group2, android.widget.ImageView imageCamera, android.widget.ImageView imageWatchNeedle, android.widget.ImageView imageWatchPreview, android.widget.TextView ivImageLight, android.widget.TextView ivImageShow, android.widget.TextView ivNeedleShow, android.widget.LinearLayout layoutSeekbar, android.widget.RadioButton rbNeedle, android.widget.RadioButton rbNumber, android.widget.RadioButton rbText1, android.widget.RadioButton rbText2, android.widget.RadioButton rbText3, android.widget.RadioButton rbText4, android.widget.RadioButton rbText5, android.widget.RadioButton rbText6, android.widget.RadioButton rbText7, android.widget.RadioButton rbText8, android.widget.SeekBar seekBar, android.widget.TextView tvColorTitle, android.view.View viewOut, android.view.View viewOutCamera) {
        this.rootView = rootView;
        this.btnDiySave = btnDiySave;
        this.colorPicker = colorPicker;
        this.colorRadioGroup = colorRadioGroup;
        this.cslDiy = cslDiy;
        this.diyFaceRecycler = diyFaceRecycler;
        this.diyNeedleRecycler = diyNeedleRecycler;
        this.diyRadioGroup = diyRadioGroup;
        this.dragLayout = dragLayout;
        this.group1 = group1;
        this.group2 = group2;
        this.imageCamera = imageCamera;
        this.imageWatchNeedle = imageWatchNeedle;
        this.imageWatchPreview = imageWatchPreview;
        this.ivImageLight = ivImageLight;
        this.ivImageShow = ivImageShow;
        this.ivNeedleShow = ivNeedleShow;
        this.layoutSeekbar = layoutSeekbar;
        this.rbNeedle = rbNeedle;
        this.rbNumber = rbNumber;
        this.rbText1 = rbText1;
        this.rbText2 = rbText2;
        this.rbText3 = rbText3;
        this.rbText4 = rbText4;
        this.rbText5 = rbText5;
        this.rbText6 = rbText6;
        this.rbText7 = rbText7;
        this.rbText8 = rbText8;
        this.seekBar = seekBar;
        this.tvColorTitle = tvColorTitle;
        this.viewOut = viewOut;
        this.viewOutCamera = viewOutCamera;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWatchFaceDiyBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWatchFaceDiyBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_watch_face_diy, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWatchFaceDiyBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_diy_save;
        com.qcwireless.qcwatch.ui.base.view.ProgressButton progressButton = (com.qcwireless.qcwatch.ui.base.view.ProgressButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_diy_save);
        if (progressButton != null) {
            i = com.qcwireless.qcwatch.R.id.color_picker;
            com.qcwireless.qcwatch.ui.base.view.ColorPickerView colorPickerView = (com.qcwireless.qcwatch.ui.base.view.ColorPickerView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.color_picker);
            if (colorPickerView != null) {
                i = com.qcwireless.qcwatch.R.id.color_radio_group;
                com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup constraintRadioGroup = (com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.color_radio_group);
                if (constraintRadioGroup != null) {
                    i = com.qcwireless.qcwatch.R.id.csl_diy;
                    androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.csl_diy);
                    if (findChildViewById != null) {
                        i = com.qcwireless.qcwatch.R.id.diy_face_recycler;
                        androidx.recyclerview.widget.RecyclerView findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.diy_face_recycler);
                        if (findChildViewById2 != null) {
                            i = com.qcwireless.qcwatch.R.id.diy_needle_recycler;
                            androidx.recyclerview.widget.RecyclerView findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.diy_needle_recycler);
                            if (findChildViewById3 != null) {
                                i = com.qcwireless.qcwatch.R.id.diy_radio_group;
                                com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup constraintRadioGroup2 = (com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.diy_radio_group);
                                if (constraintRadioGroup2 != null) {
                                    i = com.qcwireless.qcwatch.R.id.drag_layout;
                                    com.qcwireless.qcwatch.ui.base.view.CircleFrameLayout circleFrameLayout = (com.qcwireless.qcwatch.ui.base.view.CircleFrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.drag_layout);
                                    if (circleFrameLayout != null) {
                                        i = com.qcwireless.qcwatch.R.id.group_1;
                                        androidx.constraintlayout.widget.Group findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.group_1);
                                        if (findChildViewById4 != null) {
                                            i = com.qcwireless.qcwatch.R.id.group_2;
                                            androidx.constraintlayout.widget.Group findChildViewById5 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.group_2);
                                            if (findChildViewById5 != null) {
                                                i = com.qcwireless.qcwatch.R.id.image_camera;
                                                android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_camera);
                                                if (imageView != null) {
                                                    i = com.qcwireless.qcwatch.R.id.image_watch_needle;
                                                    android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_watch_needle);
                                                    if (imageView2 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.image_watch_preview;
                                                        android.widget.ImageView imageView3 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_watch_preview);
                                                        if (imageView3 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.iv_image_light;
                                                            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.iv_image_light);
                                                            if (textView != null) {
                                                                i = com.qcwireless.qcwatch.R.id.iv_image_show;
                                                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.iv_image_show);
                                                                if (textView2 != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.iv_needle_show;
                                                                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.iv_needle_show);
                                                                    if (textView3 != null) {
                                                                        i = com.qcwireless.qcwatch.R.id.layout_seekbar;
                                                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.layout_seekbar);
                                                                        if (linearLayout != null) {
                                                                            i = com.qcwireless.qcwatch.R.id.rb_needle;
                                                                            android.widget.RadioButton radioButton = (android.widget.RadioButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rb_needle);
                                                                            if (radioButton != null) {
                                                                                i = com.qcwireless.qcwatch.R.id.rb_number;
                                                                                android.widget.RadioButton radioButton2 = (android.widget.RadioButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rb_number);
                                                                                if (radioButton2 != null) {
                                                                                    i = com.qcwireless.qcwatch.R.id.rb_text1;
                                                                                    android.widget.RadioButton radioButton3 = (android.widget.RadioButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rb_text1);
                                                                                    if (radioButton3 != null) {
                                                                                        i = com.qcwireless.qcwatch.R.id.rb_text2;
                                                                                        android.widget.RadioButton radioButton4 = (android.widget.RadioButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rb_text2);
                                                                                        if (radioButton4 != null) {
                                                                                            i = com.qcwireless.qcwatch.R.id.rb_text3;
                                                                                            android.widget.RadioButton radioButton5 = (android.widget.RadioButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rb_text3);
                                                                                            if (radioButton5 != null) {
                                                                                                i = com.qcwireless.qcwatch.R.id.rb_text4;
                                                                                                android.widget.RadioButton radioButton6 = (android.widget.RadioButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rb_text4);
                                                                                                if (radioButton6 != null) {
                                                                                                    i = com.qcwireless.qcwatch.R.id.rb_text5;
                                                                                                    android.widget.RadioButton radioButton7 = (android.widget.RadioButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rb_text5);
                                                                                                    if (radioButton7 != null) {
                                                                                                        i = com.qcwireless.qcwatch.R.id.rb_text6;
                                                                                                        android.widget.RadioButton radioButton8 = (android.widget.RadioButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rb_text6);
                                                                                                        if (radioButton8 != null) {
                                                                                                            i = com.qcwireless.qcwatch.R.id.rb_text7;
                                                                                                            android.widget.RadioButton radioButton9 = (android.widget.RadioButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rb_text7);
                                                                                                            if (radioButton9 != null) {
                                                                                                                i = com.qcwireless.qcwatch.R.id.rb_text8;
                                                                                                                android.widget.RadioButton radioButton10 = (android.widget.RadioButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rb_text8);
                                                                                                                if (radioButton10 != null) {
                                                                                                                    i = com.qcwireless.qcwatch.R.id.seek_bar;
                                                                                                                    android.widget.SeekBar seekBar = (android.widget.SeekBar) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.seek_bar);
                                                                                                                    if (seekBar != null) {
                                                                                                                        i = com.qcwireless.qcwatch.R.id.tv_color_title;
                                                                                                                        android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_color_title);
                                                                                                                        if (textView4 != null) {
                                                                                                                            i = com.qcwireless.qcwatch.R.id.view_out;
                                                                                                                            android.view.View findChildViewById6 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.view_out);
                                                                                                                            if (findChildViewById6 != null) {
                                                                                                                                i = com.qcwireless.qcwatch.R.id.view_out_camera;
                                                                                                                                android.view.View findChildViewById7 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.view_out_camera);
                                                                                                                                if (findChildViewById7 != null) {
                                                                                                                                    return new com.qcwireless.qcwatch.databinding.FragmentWatchFaceDiyBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, progressButton, colorPickerView, constraintRadioGroup, findChildViewById, findChildViewById2, findChildViewById3, constraintRadioGroup2, circleFrameLayout, findChildViewById4, findChildViewById5, imageView, imageView2, imageView3, textView, textView2, textView3, linearLayout, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioButton7, radioButton8, radioButton9, radioButton10, seekBar, textView4, findChildViewById6, findChildViewById7);
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
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
