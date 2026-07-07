package com.qcwireless.qcwatch.base.utils;

/* compiled from: ActivityCollector.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\bR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/qcwireless/qcwatch/base/utils/ActivityCollector;", "", "()V", "activitys", "Ljava/util/Stack;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "pushTask", "", "task", "removeAll", "removeTask", "taskIndex", "", "removeToTop", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityCollector {
    public static final com.qcwireless.qcwatch.base.utils.ActivityCollector INSTANCE = new com.qcwireless.qcwatch.base.utils.ActivityCollector();
    private static final java.util.Stack<java.lang.ref.WeakReference<android.app.Activity>> activitys = new java.util.Stack<>();

    private ActivityCollector() {
    }

    public final void pushTask(java.lang.ref.WeakReference<android.app.Activity> task) {
        activitys.push(task);
    }

    public final void removeTask(java.lang.ref.WeakReference<android.app.Activity> task) {
        activitys.remove(task);
    }

    public final void removeTask(int taskIndex) {
        java.util.Stack<java.lang.ref.WeakReference<android.app.Activity>> stack = activitys;
        if (stack.size() > taskIndex) {
            stack.remove(taskIndex);
        }
    }

    public final void removeToTop() {
        int size = activitys.size() - 1;
        if (1 > size) {
            return;
        }
        while (true) {
            android.app.Activity activity = activitys.get(size).get();
            if (activity != null && !activity.isFinishing()) {
                activity.finish();
            }
            if (size == 1) {
                return;
            } else {
                size--;
            }
        }
    }

    public final void removeAll() {
        java.util.Iterator<java.lang.ref.WeakReference<android.app.Activity>> it = activitys.iterator();
        while (it.hasNext()) {
            android.app.Activity activity = it.next().get();
            if (activity != null && !activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
