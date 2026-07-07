package com.qcwireless.qcwatch.ui.base;

/* compiled from: BaseThemeActivity.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0012\u0010\u0017\u001a\u00020\u00102\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\b\b\u0001\u0010\u001c\u001a\u00020\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/BaseThemeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "activityWR", "Ljava/lang/ref/WeakReference;", "mFrameLayoutContent", "Landroid/widget/FrameLayout;", "mViewStatusBarPlace", "Landroid/view/View;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "setContentView", "view", "layoutResID", "", "setStatusBarBackground", "statusBarColor", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public class BaseThemeActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.app.Activity activity;
    private java.lang.ref.WeakReference<android.app.Activity> activityWR;
    private android.widget.FrameLayout mFrameLayoutContent;
    private android.view.View mViewStatusBarPlace;

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
    }

    protected final android.app.Activity getActivity() {
        return this.activity;
    }

    protected final void setActivity(android.app.Activity activity) {
        this.activity = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(com.qcwireless.qcwatch.R.layout.activity_status_bar);
        this.mViewStatusBarPlace = findViewById(com.qcwireless.qcwatch.R.id.view_status_bar_place);
        this.mFrameLayoutContent = (android.widget.FrameLayout) findViewById(com.qcwireless.qcwatch.R.id.frame_layout_content_place);
        try {
            android.view.View view = this.mViewStatusBarPlace;
            kotlin.jvm.internal.Intrinsics.checkNotNull(view);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = com.qcwireless.qcwatch.ui.base.util.AppToolsKt.getStatusBarHeight((android.content.Context) this);
            android.view.View view2 = this.mViewStatusBarPlace;
            kotlin.jvm.internal.Intrinsics.checkNotNull(view2);
            view2.setLayoutParams(layoutParams);
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getSkinType() == com.qcwireless.qcwatch.ui.mine.skin.util.SkinType.INSTANCE.getSkin_Black()) {
                com.gyf.immersionbar.ImmersionBar.with((android.app.Activity) this).statusBarDarkFont(false).transparentStatusBar().init();
            } else {
                com.gyf.immersionbar.ImmersionBar.with((android.app.Activity) this).statusBarDarkFont(true).transparentStatusBar().init();
            }
        } catch (java.lang.Exception unused) {
        }
        getWindow().addFlags(com.bumptech.glide.request.target.Target.SIZE_ORIGINAL);
        getWindow().setNavigationBarColor(skin.support.content.res.SkinCompatResources.getColor((android.content.Context) this, com.qcwireless.qcwatch.R.color.navigation_bar));
        this.activity = (android.app.Activity) this;
        android.app.Activity activity = this.activity;
        kotlin.jvm.internal.Intrinsics.checkNotNull(activity);
        this.activityWR = new java.lang.ref.WeakReference<>(activity);
        com.qcwireless.qcwatch.base.utils.ActivityCollector.INSTANCE.pushTask(this.activityWR);
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setContentView(int layoutResID) {
        android.view.View inflate = android.view.LayoutInflater.from((android.content.Context) this).inflate(layoutResID, (android.view.ViewGroup) this.mFrameLayoutContent, false);
        android.widget.FrameLayout frameLayout = this.mFrameLayoutContent;
        kotlin.jvm.internal.Intrinsics.checkNotNull(frameLayout);
        frameLayout.addView(inflate);
    }

    public void setContentView(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        android.widget.FrameLayout frameLayout = this.mFrameLayoutContent;
        kotlin.jvm.internal.Intrinsics.checkNotNull(frameLayout);
        frameLayout.addView(view);
    }

    public final void setStatusBarBackground(int statusBarColor) {
        android.view.View view = this.mViewStatusBarPlace;
        kotlin.jvm.internal.Intrinsics.checkNotNull(view);
        view.setBackgroundResource(statusBarColor);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.activity = null;
        com.qcwireless.qcwatch.base.utils.ActivityCollector.INSTANCE.removeTask(this.activityWR);
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }
}
