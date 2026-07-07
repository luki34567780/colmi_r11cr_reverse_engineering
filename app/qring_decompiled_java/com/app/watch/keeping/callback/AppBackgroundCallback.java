package com.app.watch.keeping.callback;

/* compiled from: AppBackgroundCallback.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B+\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u001a\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0002J\u0015\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u001eJ\u001d\u0010\u001f\u001a\u00020\u0007*\u00020 2\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070!H\u0082\bR\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/app/watch/keeping/callback/AppBackgroundCallback;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "context", "Landroid/content/Context;", "block", "Lkotlin/Function1;", "", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "mContext", "Ljava/lang/ref/WeakReference;", "mFrontActivityCount", "", "mIsFirst", "mIsSend", "mUseCallback", "onActivityCreated", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "post", "useCallback", "useCallback$keeping_release", "postDelayed", "Landroid/os/Handler;", "Lkotlin/Function0;", "Companion", "keeping_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBackgroundCallback implements android.app.Application.ActivityLifecycleCallbacks {
    private static final long FIRST_TIME = 1000;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block;
    private android.content.Context context;
    private java.lang.ref.WeakReference<android.content.Context> mContext;
    private int mFrontActivityCount;
    private boolean mIsFirst;
    private boolean mIsSend;
    private boolean mUseCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public AppBackgroundCallback() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppBackgroundCallback(android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
    }

    public AppBackgroundCallback(android.content.Context context, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        this.context = context;
        this.block = function1;
        this.mIsFirst = true;
        this.mUseCallback = true;
        com.app.watch.keeping.ext.CactusExtKt.getSMainHandler().postDelayed(new java.lang.Runnable() { // from class: com.app.watch.keeping.callback.AppBackgroundCallback$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.app.watch.keeping.callback.AppBackgroundCallback.m221_init_$lambda0(com.app.watch.keeping.callback.AppBackgroundCallback.this);
            }
        }, 1000L);
    }

    public /* synthetic */ AppBackgroundCallback(android.content.Context context, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : context, (i & 2) != 0 ? null : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m221_init_$lambda0(com.app.watch.keeping.callback.AppBackgroundCallback this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mFrontActivityCount == 0) {
            this$0.post();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof com.app.watch.keeping.pix.OnePixActivity) {
            return;
        }
        this.mContext = new java.lang.ref.WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof com.app.watch.keeping.pix.OnePixActivity) {
            return;
        }
        this.mFrontActivityCount++;
        post();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof com.app.watch.keeping.pix.OnePixActivity) {
            return;
        }
        this.mFrontActivityCount--;
        post();
    }

    public final void useCallback$keeping_release(boolean useCallback) {
        this.mUseCallback = useCallback;
    }

    private final void post() {
        final android.content.Context context;
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.mContext;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = this.context;
        }
        if (context == null || !this.mUseCallback) {
            return;
        }
        if (this.mFrontActivityCount == 0) {
            this.mIsSend = false;
            android.os.Handler sMainHandler = com.app.watch.keeping.ext.CactusExtKt.getSMainHandler();
            if (!this.mIsFirst) {
                context.sendBroadcast(new android.content.Intent().setAction(com.app.watch.keeping.Cactus.CACTUS_BACKGROUND));
                kotlin.jvm.functions.Function1 function1 = this.block;
                if (function1 != null) {
                    function1.invoke(true);
                    return;
                }
                return;
            }
            sMainHandler.postDelayed(new java.lang.Runnable() { // from class: com.app.watch.keeping.callback.AppBackgroundCallback$post$lambda-5$$inlined$postDelayed$1
                @Override // java.lang.Runnable
                public final void run() {
                    context.sendBroadcast(new android.content.Intent().setAction(com.app.watch.keeping.Cactus.CACTUS_BACKGROUND));
                    kotlin.jvm.functions.Function1 function12 = this.block;
                    if (function12 != null) {
                        function12.invoke(true);
                    }
                    com.app.watch.keeping.callback.AppBackgroundCallback.this.mIsFirst = false;
                }
            }, 1000L);
            return;
        }
        if (this.mIsSend) {
            return;
        }
        this.mIsSend = true;
        android.os.Handler sMainHandler2 = com.app.watch.keeping.ext.CactusExtKt.getSMainHandler();
        if (!this.mIsFirst) {
            context.sendBroadcast(new android.content.Intent().setAction(com.app.watch.keeping.Cactus.CACTUS_FOREGROUND));
            kotlin.jvm.functions.Function1 function12 = this.block;
            if (function12 != null) {
                function12.invoke(false);
                return;
            }
            return;
        }
        sMainHandler2.postDelayed(new java.lang.Runnable() { // from class: com.app.watch.keeping.callback.AppBackgroundCallback$post$lambda-5$$inlined$postDelayed$2
            @Override // java.lang.Runnable
            public final void run() {
                context.sendBroadcast(new android.content.Intent().setAction(com.app.watch.keeping.Cactus.CACTUS_FOREGROUND));
                kotlin.jvm.functions.Function1 function13 = this.block;
                if (function13 != null) {
                    function13.invoke(false);
                }
                com.app.watch.keeping.callback.AppBackgroundCallback.this.mIsFirst = false;
            }
        }, 1000L);
    }

    private final void postDelayed(android.os.Handler handler, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        if (this.mIsFirst) {
            handler.postDelayed(new java.lang.Runnable() { // from class: com.app.watch.keeping.callback.AppBackgroundCallback$postDelayed$1
                @Override // java.lang.Runnable
                public final void run() {
                    function0.invoke();
                    this.mIsFirst = false;
                }
            }, 1000L);
        } else {
            function0.invoke();
        }
    }
}
