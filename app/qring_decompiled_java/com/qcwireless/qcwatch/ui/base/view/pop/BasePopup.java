package com.qcwireless.qcwatch.ui.base.view.pop;

/* compiled from: BasePopup.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010 \u001a\u00020!J\u001d\u0010\"\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020$2\u0006\u0010%\u001a\u00020\r¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020$J\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020\u001bH\u0002J\u000e\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020$J\u000e\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020$J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020$H\u0002J\u0006\u0010/\u001a\u00020\u001dJ\u001c\u00100\u001a\u00020\u00152\b\u00101\u001a\u0004\u0018\u00010$2\b\u00102\u001a\u0004\u0018\u000103H\u0017J\b\u00104\u001a\u00020!H\u0002J\u000e\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020\rJ\b\u00107\u001a\u00020!H\u0002J\u000e\u00108\u001a\u00020\u00002\u0006\u0010,\u001a\u00020$J\u000e\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0013J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0015J\u000e\u0010=\u001a\u00020!2\u0006\u0010,\u001a\u00020$J\u000e\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020\rJ\u0018\u0010@\u001a\u00020!2\u0006\u0010,\u001a\u00020$2\u0006\u0010?\u001a\u00020\rH\u0016J\b\u0010A\u001a\u00020!H\u0016J\u0010\u0010A\u001a\u00020!2\u0006\u0010?\u001a\u00020\rH\u0016J\u0010\u0010B\u001a\u00020!2\u0006\u0010,\u001a\u00020$H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/pop/BasePopup;", "Landroid/view/View$OnTouchListener;", "popParams", "Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopParams;", "(Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopParams;)V", "animDuration", "", "bgDimAnimator", "Landroid/animation/ValueAnimator;", "clearBgDimAnimator", "clickLocation", "", "defaultMargin", "", "getDefaultMargin", "()I", "setDefaultMargin", "(I)V", "dim", "", "isBgDim", "", "mPopup", "Landroid/widget/PopupWindow;", "getPopParams", "()Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopParams;", "popupContentViewSize", "", "window", "Landroid/view/Window;", "windowAttr", "Landroid/view/WindowManager$LayoutParams;", "dismiss", "", "findViewById", "T", "Landroid/view/View;", "resId", "(I)Landroid/view/View;", "getContentView", "getContext", "Landroid/content/Context;", "getPopupContentViewSize", "getPopupShowLocation", "view", "getShowDirection", "getViewLocation", "getWindow", "onTouch", "v", "event", "Landroid/view/MotionEvent;", "resetDim", "setAnim", "anim", "setBgDim", "setContentView", "setDimValue", "dimValue", "setIsBgDim", "boolean", "showAsDropDown", "showAtDirection", "direction", "showAtDirectionByView", "showAtFingerLocation", "showAtView", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public class BasePopup implements android.view.View.OnTouchListener {
    private long animDuration;
    private android.animation.ValueAnimator bgDimAnimator;
    private android.animation.ValueAnimator clearBgDimAnimator;
    private final float[] clickLocation;
    private int defaultMargin;
    private float dim;
    private boolean isBgDim;
    private final android.widget.PopupWindow mPopup;
    private final com.qcwireless.qcwatch.ui.base.view.pop.WPopParams popParams;
    private int[] popupContentViewSize;
    private android.view.Window window;
    private android.view.WindowManager.LayoutParams windowAttr;

    public BasePopup(com.qcwireless.qcwatch.ui.base.view.pop.WPopParams wPopParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wPopParams, "popParams");
        this.popParams = wPopParams;
        this.dim = 0.4f;
        android.view.Window window = wPopParams.getActivity().getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "popParams.activity.window");
        this.window = window;
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attributes, "window.attributes");
        this.windowAttr = attributes;
        this.animDuration = 200L;
        this.clickLocation = new float[2];
        this.window.addFlags(2);
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(wPopParams.getWidth(), wPopParams.getHeight());
        this.mPopup = popupWindow;
        popupWindow.setFocusable(true);
        popupWindow.setContentView(wPopParams.getActivity().getLayoutInflater().inflate(wPopParams.getLayoutRes(), (android.view.ViewGroup) null));
        this.dim = wPopParams.getDimValue();
        this.isBgDim = wPopParams.isDim();
        popupWindow.setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.BasePopup$$ExternalSyntheticLambda5
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.m598_init_$lambda0(com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.this);
            }
        });
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, this.dim);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(1f, dim)");
        this.bgDimAnimator = ofFloat;
        ofFloat.setDuration(this.animDuration);
        this.bgDimAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.BasePopup$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.m599_init_$lambda1(com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.this, valueAnimator);
            }
        });
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(this.dim, 1.0f);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofFloat2, "ofFloat(dim, 1f)");
        this.clearBgDimAnimator = ofFloat2;
        ofFloat2.setDuration(this.animDuration);
        this.clearBgDimAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.BasePopup$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.m600_init_$lambda2(com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.this, valueAnimator);
            }
        });
        if (wPopParams.getLongClickView() != null) {
            android.view.View longClickView = wPopParams.getLongClickView();
            kotlin.jvm.internal.Intrinsics.checkNotNull(longClickView);
            if (longClickView instanceof android.widget.AbsListView) {
                android.view.View longClickView2 = wPopParams.getLongClickView();
                kotlin.jvm.internal.Intrinsics.checkNotNull(longClickView2);
                ((android.widget.AbsListView) longClickView2).setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.BasePopup$$ExternalSyntheticLambda4
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                        boolean m601_init_$lambda3;
                        m601_init_$lambda3 = com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.m601_init_$lambda3(com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.this, view, motionEvent);
                        return m601_init_$lambda3;
                    }
                });
            } else {
                android.view.View longClickView3 = wPopParams.getLongClickView();
                kotlin.jvm.internal.Intrinsics.checkNotNull(longClickView3);
                if (longClickView3 instanceof androidx.recyclerview.widget.RecyclerView) {
                    androidx.recyclerview.widget.RecyclerView longClickView4 = wPopParams.getLongClickView();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(longClickView4);
                    longClickView4.addOnItemTouchListener(new androidx.recyclerview.widget.RecyclerView.OnItemTouchListener() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.5
                        public void onRequestDisallowInterceptTouchEvent(boolean p0) {
                        }

                        public void onTouchEvent(androidx.recyclerview.widget.RecyclerView p0, android.view.MotionEvent p1) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "p1");
                        }

                        public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView p0, android.view.MotionEvent event) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
                            if (event.getAction() == 0) {
                                com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.this.clickLocation[0] = event.getRawX();
                                com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.this.clickLocation[1] = event.getRawY();
                            }
                            return false;
                        }
                    });
                } else {
                    android.view.View longClickView5 = wPopParams.getLongClickView();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(longClickView5);
                    longClickView5.setOnTouchListener(this);
                }
            }
        }
        popupWindow.setAnimationStyle(wPopParams.getAnimRes());
        if (!wPopParams.getCancelable()) {
            popupWindow.setFocusable(true);
            popupWindow.setOutsideTouchable(false);
            popupWindow.setBackgroundDrawable(null);
            getContentView().setFocusable(true);
            getContentView().setFocusableInTouchMode(true);
            getContentView().setOnKeyListener(new android.view.View.OnKeyListener() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.BasePopup$$ExternalSyntheticLambda2
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
                    boolean m602_init_$lambda4;
                    m602_init_$lambda4 = com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.m602_init_$lambda4(com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.this, view, i, keyEvent);
                    return m602_init_$lambda4;
                }
            });
            popupWindow.setTouchInterceptor(new android.view.View.OnTouchListener() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.BasePopup$$ExternalSyntheticLambda3
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    boolean m603_init_$lambda5;
                    m603_init_$lambda5 = com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.m603_init_$lambda5(com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.this, view, motionEvent);
                    return m603_init_$lambda5;
                }
            });
        } else {
            popupWindow.setFocusable(true);
            popupWindow.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
        this.defaultMargin = com.qcwireless.qcwatch.ui.base.view.pop.Utils.INSTANCE.dp2px(getContext(), 4);
    }

    public final com.qcwireless.qcwatch.ui.base.view.pop.WPopParams getPopParams() {
        return this.popParams;
    }

    public final int getDefaultMargin() {
        return this.defaultMargin;
    }

    public final void setDefaultMargin(int i) {
        this.defaultMargin = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m598_init_$lambda0(com.qcwireless.qcwatch.ui.base.view.pop.BasePopup basePopup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basePopup, "this$0");
        basePopup.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m599_init_$lambda1(com.qcwireless.qcwatch.ui.base.view.pop.BasePopup basePopup, android.animation.ValueAnimator valueAnimator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basePopup, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueAnimator, "animation");
        android.view.WindowManager.LayoutParams layoutParams = basePopup.windowAttr;
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        java.util.Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        layoutParams.alpha = ((java.lang.Float) animatedValue).floatValue();
        basePopup.window.setAttributes(basePopup.windowAttr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-2, reason: not valid java name */
    public static final void m600_init_$lambda2(com.qcwireless.qcwatch.ui.base.view.pop.BasePopup basePopup, android.animation.ValueAnimator valueAnimator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basePopup, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueAnimator, "animation");
        android.view.WindowManager.LayoutParams layoutParams = basePopup.windowAttr;
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        java.util.Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        layoutParams.alpha = ((java.lang.Float) animatedValue).floatValue();
        basePopup.window.setAttributes(basePopup.windowAttr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-3, reason: not valid java name */
    public static final boolean m601_init_$lambda3(com.qcwireless.qcwatch.ui.base.view.pop.BasePopup basePopup, android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basePopup, "this$0");
        if (motionEvent.getAction() == 0) {
            basePopup.clickLocation[0] = motionEvent.getRawX();
            basePopup.clickLocation[1] = motionEvent.getRawY();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-4, reason: not valid java name */
    public static final boolean m602_init_$lambda4(com.qcwireless.qcwatch.ui.base.view.pop.BasePopup basePopup, android.view.View view, int i, android.view.KeyEvent keyEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basePopup, "this$0");
        if (i != 4) {
            return false;
        }
        basePopup.dismiss();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r0 >= r10[1]) goto L16;
     */
    /* renamed from: _init_$lambda-5, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m603_init_$lambda5(com.qcwireless.qcwatch.ui.base.view.pop.BasePopup r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            java.lang.String r10 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r10)
            float r10 = r11.getX()
            int r10 = (int) r10
            float r0 = r11.getY()
            int r0 = (int) r0
            int r1 = r11.getAction()
            java.lang.String r2 = ",mHeight="
            java.lang.String r3 = "onTouch outside:mWidth="
            java.lang.String r4 = "ContentValues"
            r5 = 0
            r6 = 1
            r7 = 0
            java.lang.String r8 = "popupContentViewSize"
            if (r1 != 0) goto L6a
            if (r10 < 0) goto L3c
            int[] r1 = r9.popupContentViewSize
            if (r1 != 0) goto L2a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            r1 = r7
        L2a:
            r1 = r1[r5]
            if (r10 >= r1) goto L3c
            if (r0 < 0) goto L3c
            int[] r10 = r9.popupContentViewSize
            if (r10 != 0) goto L38
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            r10 = r7
        L38:
            r10 = r10[r6]
            if (r0 < r10) goto L6a
        L3c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            int[] r11 = r9.popupContentViewSize
            if (r11 != 0) goto L4c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            r11 = r7
        L4c:
            r11 = r11[r5]
            r10.append(r11)
            r10.append(r2)
            int[] r9 = r9.popupContentViewSize
            if (r9 != 0) goto L5c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            goto L5d
        L5c:
            r7 = r9
        L5d:
            r9 = r7[r6]
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            android.util.Log.d(r4, r9)
            return r6
        L6a:
            int r10 = r11.getAction()
            r11 = 4
            if (r10 != r11) goto L9f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            int[] r11 = r9.popupContentViewSize
            if (r11 != 0) goto L81
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            r11 = r7
        L81:
            r11 = r11[r5]
            r10.append(r11)
            r10.append(r2)
            int[] r9 = r9.popupContentViewSize
            if (r9 != 0) goto L91
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            goto L92
        L91:
            r7 = r9
        L92:
            r9 = r7[r6]
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            android.util.Log.d(r4, r9)
            return r6
        L9f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.m603_init_$lambda5(com.qcwireless.qcwatch.ui.base.view.pop.BasePopup, android.view.View, android.view.MotionEvent):boolean");
    }

    public final com.qcwireless.qcwatch.ui.base.view.pop.BasePopup setContentView(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        this.mPopup.setContentView(view);
        return this;
    }

    public final com.qcwireless.qcwatch.ui.base.view.pop.BasePopup setDimValue(float dimValue) {
        this.dim = dimValue;
        return this;
    }

    public final com.qcwireless.qcwatch.ui.base.view.pop.BasePopup setIsBgDim(boolean r1) {
        this.isBgDim = r1;
        return this;
    }

    public final void dismiss() {
        if (this.mPopup.isShowing()) {
            this.mPopup.dismiss();
        }
        resetDim();
    }

    public final void showAsDropDown(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        setBgDim();
        this.mPopup.showAsDropDown(view);
    }

    public final android.view.View getContentView() {
        android.view.View contentView = this.mPopup.getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "mPopup.contentView");
        return contentView;
    }

    public final android.view.Window getWindow() {
        return this.window;
    }

    public final android.content.Context getContext() {
        android.content.Context context = this.window.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "window.context");
        return context;
    }

    public void showAtView(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        setBgDim();
        int[] popupShowLocation = getPopupShowLocation(view);
        this.mPopup.showAtLocation(view, 0, popupShowLocation[0], popupShowLocation[1]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:
    
        if (r3 <= (r5[1] / 2)) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] getPopupShowLocation(android.view.View r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.getPopupShowLocation(android.view.View):int[]");
    }

    public final int getShowDirection(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        int[] viewLocation = getViewLocation(view);
        int measuredHeight = view.getMeasuredHeight();
        int[] windowSize = com.qcwireless.qcwatch.ui.base.view.pop.Utils.INSTANCE.getWindowSize(this.popParams.getActivity());
        int i = measuredHeight / 2;
        int i2 = getPopupContentViewSize()[0] / 2;
        return (windowSize[1] - (viewLocation[1] + i) <= i2 && viewLocation[1] + i > i2) ? -4 : -3;
    }

    public void showAtDirectionByView(android.view.View view, int direction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        setBgDim();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int[] popupContentViewSize = getPopupContentViewSize();
        this.popupContentViewSize = popupContentViewSize;
        int[] iArr3 = null;
        if (direction == -4) {
            int i = iArr2[0] + (measuredWidth / 2);
            if (popupContentViewSize == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
                popupContentViewSize = null;
            }
            iArr[0] = i - (popupContentViewSize[0] / 2);
            int i2 = iArr2[1];
            int[] iArr4 = this.popupContentViewSize;
            if (iArr4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
            } else {
                iArr3 = iArr4;
            }
            iArr[1] = (i2 - iArr3[1]) - com.qcwireless.qcwatch.ui.base.view.pop.Utils.INSTANCE.dp2px(getContext(), this.popParams.getCommonPopMargin());
        } else if (direction == -3) {
            int i3 = iArr2[0] + (measuredWidth / 2);
            if (popupContentViewSize == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
                popupContentViewSize = null;
            }
            iArr[0] = i3 - (popupContentViewSize[0] / 2);
            iArr[1] = iArr2[1] + measuredHeight + com.qcwireless.qcwatch.ui.base.view.pop.Utils.INSTANCE.dp2px(getContext(), this.popParams.getCommonPopMargin());
        } else if (direction == -2) {
            iArr[0] = iArr2[0] + measuredWidth + com.qcwireless.qcwatch.ui.base.view.pop.Utils.INSTANCE.dp2px(getContext(), this.popParams.getCommonPopMargin());
            int i4 = iArr2[1] + (measuredHeight / 2);
            int[] iArr5 = this.popupContentViewSize;
            if (iArr5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
            } else {
                iArr3 = iArr5;
            }
            iArr[1] = i4 - (iArr3[1] / 2);
        } else if (direction == -1) {
            int i5 = iArr2[0];
            if (popupContentViewSize == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
                popupContentViewSize = null;
            }
            iArr[0] = (i5 - popupContentViewSize[0]) - com.qcwireless.qcwatch.ui.base.view.pop.Utils.INSTANCE.dp2px(getContext(), this.popParams.getCommonPopMargin());
            int i6 = iArr2[1] + (measuredHeight / 2);
            int[] iArr6 = this.popupContentViewSize;
            if (iArr6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
            } else {
                iArr3 = iArr6;
            }
            iArr[1] = i6 - (iArr3[1] / 2);
        }
        this.mPopup.showAtLocation(view, 0, iArr[0], iArr[1]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r3 <= r4[0]) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        if (r4 <= r7[1]) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showAtFingerLocation() {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.view.pop.BasePopup.showAtFingerLocation():void");
    }

    public void showAtFingerLocation(int direction) {
        int[] popupContentViewSize = getPopupContentViewSize();
        this.popupContentViewSize = popupContentViewSize;
        int[] iArr = new int[2];
        int[] iArr2 = null;
        switch (direction) {
            case com.qcwireless.qcwatch.ui.base.view.pop.WPopupDirection.RIGHT_BOTTOM /* -8 */:
                float[] fArr = this.clickLocation;
                int i = (int) fArr[0];
                int i2 = this.defaultMargin;
                iArr[0] = i + i2;
                iArr[1] = ((int) fArr[1]) + i2;
                break;
            case com.qcwireless.qcwatch.ui.base.view.pop.WPopupDirection.RIGHT_TOP /* -7 */:
                float[] fArr2 = this.clickLocation;
                iArr[0] = ((int) fArr2[0]) + this.defaultMargin;
                float f = fArr2[1];
                if (popupContentViewSize == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
                    popupContentViewSize = null;
                }
                iArr[1] = ((int) (f - popupContentViewSize[1])) - this.defaultMargin;
                break;
            case com.qcwireless.qcwatch.ui.base.view.pop.WPopupDirection.LEFT_BOTTOM /* -6 */:
                float f2 = this.clickLocation[0];
                if (popupContentViewSize == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
                    popupContentViewSize = null;
                }
                int i3 = (int) (f2 - popupContentViewSize[0]);
                int i4 = this.defaultMargin;
                iArr[0] = i3 - i4;
                iArr[1] = ((int) this.clickLocation[1]) + i4;
                break;
            case com.qcwireless.qcwatch.ui.base.view.pop.WPopupDirection.LEFT_TOP /* -5 */:
                float f3 = this.clickLocation[0];
                if (popupContentViewSize == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
                    popupContentViewSize = null;
                }
                iArr[0] = ((int) (f3 - popupContentViewSize[0])) - this.defaultMargin;
                float f4 = this.clickLocation[1];
                int[] iArr3 = this.popupContentViewSize;
                if (iArr3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
                } else {
                    iArr2 = iArr3;
                }
                iArr[1] = ((int) (f4 - iArr2[1])) - this.defaultMargin;
                break;
            case com.qcwireless.qcwatch.ui.base.view.pop.WPopupDirection.TOP /* -4 */:
                float f5 = this.clickLocation[0];
                if (popupContentViewSize == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
                    popupContentViewSize = null;
                }
                iArr[0] = (int) (f5 - (popupContentViewSize[0] / 2));
                float f6 = this.clickLocation[1];
                int[] iArr4 = this.popupContentViewSize;
                if (iArr4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
                } else {
                    iArr2 = iArr4;
                }
                iArr[1] = ((int) (f6 - iArr2[1])) - this.defaultMargin;
                break;
            case -3:
                float f7 = this.clickLocation[0];
                if (popupContentViewSize == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
                    popupContentViewSize = null;
                }
                iArr[0] = (int) (f7 - (popupContentViewSize[0] / 2));
                iArr[1] = ((int) this.clickLocation[1]) + this.defaultMargin;
                break;
            case -2:
                float[] fArr3 = this.clickLocation;
                iArr[0] = ((int) fArr3[0]) + this.defaultMargin;
                float f8 = fArr3[1];
                if (popupContentViewSize == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
                    popupContentViewSize = null;
                }
                iArr[1] = (int) (f8 - (popupContentViewSize[1] / 2));
                break;
            case -1:
                float f9 = this.clickLocation[0];
                if (popupContentViewSize == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
                    popupContentViewSize = null;
                }
                iArr[0] = ((int) (f9 - popupContentViewSize[0])) - this.defaultMargin;
                float f10 = this.clickLocation[1];
                int[] iArr5 = this.popupContentViewSize;
                if (iArr5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
                } else {
                    iArr2 = iArr5;
                }
                iArr[1] = (int) (f10 - (iArr2[1] / 2));
                break;
        }
        this.mPopup.showAtLocation(getContentView(), 0, iArr[0], iArr[1]);
    }

    public final void showAtDirection(int direction) {
        setBgDim();
        int[] iArr = new int[2];
        this.popupContentViewSize = getPopupContentViewSize();
        int[] windowSize = com.qcwireless.qcwatch.ui.base.view.pop.Utils.INSTANCE.getWindowSize(this.popParams.getActivity());
        if (direction == -4) {
            iArr[0] = 0;
            iArr[1] = 0;
        } else if (direction == -3) {
            iArr[0] = 0;
            int i = windowSize[1];
            int[] iArr2 = this.popupContentViewSize;
            if (iArr2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupContentViewSize");
                iArr2 = null;
            }
            iArr[1] = i - iArr2[1];
        }
        this.mPopup.setAnimationStyle(com.qcwireless.qcwatch.ui.base.view.pop.WPopupAnim.INSTANCE.getANIM_SCALE_Y());
        this.mPopup.showAtLocation(getContentView().getRootView(), 0, iArr[0], iArr[1]);
    }

    private final int[] getViewLocation(android.view.View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr;
    }

    private final int[] getPopupContentViewSize() {
        getContentView().measure(0, 0);
        int measuredHeight = getContentView().getMeasuredHeight();
        int measuredWidth = getContentView().getMeasuredWidth() + this.defaultMargin;
        if (this.popParams.getWidth() == -1) {
            measuredWidth = com.qcwireless.qcwatch.ui.base.view.pop.Utils.INSTANCE.getWindowSize(this.popParams.getActivity())[0];
        }
        return new int[]{measuredWidth, measuredHeight};
    }

    public final void setAnim(int anim) {
        this.popParams.setAnimRes(anim);
        this.mPopup.setAnimationStyle(this.popParams.getAnimRes());
    }

    private final void setBgDim() {
        if (this.isBgDim) {
            this.bgDimAnimator.start();
        }
    }

    private final void resetDim() {
        if (this.isBgDim) {
            this.clearBgDimAnimator.start();
        }
    }

    public final <T extends android.view.View> T findViewById(int resId) {
        T t = (T) getContentView().findViewById(resId);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(t, "getContentView().findViewById(resId)");
        return t;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(event);
        if (event.getAction() == 0) {
            this.clickLocation[0] = event.getRawX();
            this.clickLocation[1] = event.getRawY();
            android.util.Log.d("112233", this.clickLocation[0] + " --- " + this.clickLocation[1]);
        }
        return false;
    }
}
