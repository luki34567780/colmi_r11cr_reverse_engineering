package androidx.core.app;

/* loaded from: classes.dex */
public class ActivityOptionsCompat {
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    public android.graphics.Rect getLaunchBounds() {
        return null;
    }

    public void requestUsageTimeReport(android.app.PendingIntent pendingIntent) {
    }

    public androidx.core.app.ActivityOptionsCompat setLaunchBounds(android.graphics.Rect rect) {
        return this;
    }

    public android.os.Bundle toBundle() {
        return null;
    }

    public void update(androidx.core.app.ActivityOptionsCompat activityOptionsCompat) {
    }

    public static androidx.core.app.ActivityOptionsCompat makeCustomAnimation(android.content.Context context, int i, int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeCustomAnimation(context, i, i2));
        }
        return new androidx.core.app.ActivityOptionsCompat();
    }

    public static androidx.core.app.ActivityOptionsCompat makeScaleUpAnimation(android.view.View view, int i, int i2, int i3, int i4) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
        }
        return new androidx.core.app.ActivityOptionsCompat();
    }

    public static androidx.core.app.ActivityOptionsCompat makeClipRevealAnimation(android.view.View view, int i, int i2, int i3, int i4) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4));
        }
        return new androidx.core.app.ActivityOptionsCompat();
    }

    public static androidx.core.app.ActivityOptionsCompat makeThumbnailScaleUpAnimation(android.view.View view, android.graphics.Bitmap bitmap, int i, int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
        }
        return new androidx.core.app.ActivityOptionsCompat();
    }

    public static androidx.core.app.ActivityOptionsCompat makeSceneTransitionAnimation(android.app.Activity activity, android.view.View view, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
        }
        return new androidx.core.app.ActivityOptionsCompat();
    }

    public static androidx.core.app.ActivityOptionsCompat makeSceneTransitionAnimation(android.app.Activity activity, androidx.core.util.Pair<android.view.View, java.lang.String>... pairArr) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            android.util.Pair[] pairArr2 = null;
            if (pairArr != null) {
                pairArr2 = new android.util.Pair[pairArr.length];
                for (int i = 0; i < pairArr.length; i++) {
                    pairArr2[i] = android.util.Pair.create(pairArr[i].first, pairArr[i].second);
                }
            }
            return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeSceneTransitionAnimation(activity, pairArr2));
        }
        return new androidx.core.app.ActivityOptionsCompat();
    }

    public static androidx.core.app.ActivityOptionsCompat makeTaskLaunchBehind() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeTaskLaunchBehind());
        }
        return new androidx.core.app.ActivityOptionsCompat();
    }

    public static androidx.core.app.ActivityOptionsCompat makeBasic() {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(android.app.ActivityOptions.makeBasic());
        }
        return new androidx.core.app.ActivityOptionsCompat();
    }

    private static class ActivityOptionsCompatImpl extends androidx.core.app.ActivityOptionsCompat {
        private final android.app.ActivityOptions mActivityOptions;

        ActivityOptionsCompatImpl(android.app.ActivityOptions activityOptions) {
            this.mActivityOptions = activityOptions;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public android.os.Bundle toBundle() {
            return this.mActivityOptions.toBundle();
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void update(androidx.core.app.ActivityOptionsCompat activityOptionsCompat) {
            if (activityOptionsCompat instanceof androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl) {
                this.mActivityOptions.update(((androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl) activityOptionsCompat).mActivityOptions);
            }
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void requestUsageTimeReport(android.app.PendingIntent pendingIntent) {
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                this.mActivityOptions.requestUsageTimeReport(pendingIntent);
            }
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public androidx.core.app.ActivityOptionsCompat setLaunchBounds(android.graphics.Rect rect) {
            return android.os.Build.VERSION.SDK_INT < 24 ? this : new androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl(this.mActivityOptions.setLaunchBounds(rect));
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public android.graphics.Rect getLaunchBounds() {
            if (android.os.Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return this.mActivityOptions.getLaunchBounds();
        }
    }

    protected ActivityOptionsCompat() {
    }
}
