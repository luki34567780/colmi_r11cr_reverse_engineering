package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public class UtilsTransActivity extends androidx.appcompat.app.AppCompatActivity {
    private static final java.util.Map<com.blankj.utilcode.util.UtilsTransActivity, com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate> CALLBACK_MAP = new java.util.HashMap();
    protected static final java.lang.String EXTRA_DELEGATE = "extra_delegate";

    public static void start(com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate) {
        start(null, null, transActivityDelegate, com.blankj.utilcode.util.UtilsTransActivity.class);
    }

    public static void start(com.blankj.utilcode.util.Utils.Consumer<android.content.Intent> consumer, com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate) {
        start(null, consumer, transActivityDelegate, com.blankj.utilcode.util.UtilsTransActivity.class);
    }

    public static void start(android.app.Activity activity, com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate) {
        start(activity, null, transActivityDelegate, com.blankj.utilcode.util.UtilsTransActivity.class);
    }

    public static void start(android.app.Activity activity, com.blankj.utilcode.util.Utils.Consumer<android.content.Intent> consumer, com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate) {
        start(activity, consumer, transActivityDelegate, com.blankj.utilcode.util.UtilsTransActivity.class);
    }

    protected static void start(android.app.Activity activity, com.blankj.utilcode.util.Utils.Consumer<android.content.Intent> consumer, com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate, java.lang.Class<?> cls) {
        if (transActivityDelegate == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(com.blankj.utilcode.util.Utils.getApp(), cls);
        intent.putExtra(EXTRA_DELEGATE, transActivityDelegate);
        if (consumer != null) {
            consumer.accept(intent);
        }
        if (activity == null) {
            intent.addFlags(com.autonavi.amap.mapcore.AMapEngineUtils.MAX_P20_WIDTH);
            com.blankj.utilcode.util.Utils.getApp().startActivity(intent);
        } else {
            activity.startActivity(intent);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(0, 0);
        java.io.Serializable serializableExtra = getIntent().getSerializableExtra(EXTRA_DELEGATE);
        if (!(serializableExtra instanceof com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate)) {
            super.onCreate(bundle);
            finish();
            return;
        }
        com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate = (com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate) serializableExtra;
        CALLBACK_MAP.put(this, transActivityDelegate);
        transActivityDelegate.onCreateBefore(this, bundle);
        super.onCreate(bundle);
        transActivityDelegate.onCreated(this, bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate = CALLBACK_MAP.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onStarted(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate = CALLBACK_MAP.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onResumed(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
        com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate = CALLBACK_MAP.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onPaused(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate = CALLBACK_MAP.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onStopped(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate = CALLBACK_MAP.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onSaveInstanceState(this, bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        java.util.Map<com.blankj.utilcode.util.UtilsTransActivity, com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate> map = CALLBACK_MAP;
        com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate = map.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onDestroy(this);
        map.remove(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        java.util.Objects.requireNonNull(strArr, "Argument 'permissions' of type String[] (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(iArr, "Argument 'grantResults' of type int[] (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        super.onRequestPermissionsResult(i, strArr, iArr);
        com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate = CALLBACK_MAP.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate = CALLBACK_MAP.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onActivityResult(this, i, i2, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate = CALLBACK_MAP.get(this);
        if (transActivityDelegate == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (transActivityDelegate.dispatchTouchEvent(this, motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static abstract class TransActivityDelegate implements java.io.Serializable {
        public void onCreateBefore(com.blankj.utilcode.util.UtilsTransActivity utilsTransActivity, android.os.Bundle bundle) {
            java.util.Objects.requireNonNull(utilsTransActivity, "Argument 'activity' of type UtilsTransActivity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onCreated(com.blankj.utilcode.util.UtilsTransActivity utilsTransActivity, android.os.Bundle bundle) {
            java.util.Objects.requireNonNull(utilsTransActivity, "Argument 'activity' of type UtilsTransActivity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onStarted(com.blankj.utilcode.util.UtilsTransActivity utilsTransActivity) {
            java.util.Objects.requireNonNull(utilsTransActivity, "Argument 'activity' of type UtilsTransActivity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onDestroy(com.blankj.utilcode.util.UtilsTransActivity utilsTransActivity) {
            java.util.Objects.requireNonNull(utilsTransActivity, "Argument 'activity' of type UtilsTransActivity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onResumed(com.blankj.utilcode.util.UtilsTransActivity utilsTransActivity) {
            java.util.Objects.requireNonNull(utilsTransActivity, "Argument 'activity' of type UtilsTransActivity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onPaused(com.blankj.utilcode.util.UtilsTransActivity utilsTransActivity) {
            java.util.Objects.requireNonNull(utilsTransActivity, "Argument 'activity' of type UtilsTransActivity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onStopped(com.blankj.utilcode.util.UtilsTransActivity utilsTransActivity) {
            java.util.Objects.requireNonNull(utilsTransActivity, "Argument 'activity' of type UtilsTransActivity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onSaveInstanceState(com.blankj.utilcode.util.UtilsTransActivity utilsTransActivity, android.os.Bundle bundle) {
            java.util.Objects.requireNonNull(utilsTransActivity, "Argument 'activity' of type UtilsTransActivity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onRequestPermissionsResult(com.blankj.utilcode.util.UtilsTransActivity utilsTransActivity, int i, java.lang.String[] strArr, int[] iArr) {
            java.util.Objects.requireNonNull(utilsTransActivity, "Argument 'activity' of type UtilsTransActivity (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            java.util.Objects.requireNonNull(strArr, "Argument 'permissions' of type String[] (#2 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            java.util.Objects.requireNonNull(iArr, "Argument 'grantResults' of type int[] (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public void onActivityResult(com.blankj.utilcode.util.UtilsTransActivity utilsTransActivity, int i, int i2, android.content.Intent intent) {
            java.util.Objects.requireNonNull(utilsTransActivity, "Argument 'activity' of type UtilsTransActivity (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public boolean dispatchTouchEvent(com.blankj.utilcode.util.UtilsTransActivity utilsTransActivity, android.view.MotionEvent motionEvent) {
            java.util.Objects.requireNonNull(utilsTransActivity, "Argument 'activity' of type UtilsTransActivity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            return false;
        }
    }
}
