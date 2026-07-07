package androidx.work.impl.background.systemjob;

/* loaded from: classes.dex */
class SystemJobInfoConverter {
    static final java.lang.String EXTRA_IS_PERIODIC = "EXTRA_IS_PERIODIC";
    static final java.lang.String EXTRA_WORK_SPEC_ID = "EXTRA_WORK_SPEC_ID";
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("SystemJobInfoConverter");
    private final android.content.ComponentName mWorkServiceComponent;

    SystemJobInfoConverter(android.content.Context context) {
        this.mWorkServiceComponent = new android.content.ComponentName(context.getApplicationContext(), (java.lang.Class<?>) androidx.work.impl.background.systemjob.SystemJobService.class);
    }

    android.app.job.JobInfo convert(androidx.work.impl.model.WorkSpec workSpec, int jobId) {
        androidx.work.Constraints constraints = workSpec.constraints;
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString(EXTRA_WORK_SPEC_ID, workSpec.id);
        persistableBundle.putBoolean(EXTRA_IS_PERIODIC, workSpec.isPeriodic());
        android.app.job.JobInfo.Builder extras = new android.app.job.JobInfo.Builder(jobId, this.mWorkServiceComponent).setRequiresCharging(constraints.requiresCharging()).setRequiresDeviceIdle(constraints.requiresDeviceIdle()).setExtras(persistableBundle);
        setRequiredNetwork(extras, constraints.getRequiredNetworkType());
        if (!constraints.requiresDeviceIdle()) {
            extras.setBackoffCriteria(workSpec.backoffDelayDuration, workSpec.backoffPolicy == androidx.work.BackoffPolicy.LINEAR ? 0 : 1);
        }
        long max = java.lang.Math.max(workSpec.calculateNextRunTime() - java.lang.System.currentTimeMillis(), 0L);
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!workSpec.expedited) {
            extras.setImportantWhileForeground(true);
        }
        if (android.os.Build.VERSION.SDK_INT >= 24 && constraints.hasContentUriTriggers()) {
            java.util.Iterator<androidx.work.ContentUriTriggers.Trigger> it = constraints.getContentUriTriggers().getTriggers().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(convertContentUriTrigger(it.next()));
            }
            extras.setTriggerContentUpdateDelay(constraints.getTriggerContentUpdateDelay());
            extras.setTriggerContentMaxDelay(constraints.getTriggerMaxContentDelay());
        }
        extras.setPersisted(false);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(constraints.requiresBatteryNotLow());
            extras.setRequiresStorageNotLow(constraints.requiresStorageNotLow());
        }
        boolean z = workSpec.runAttemptCount > 0;
        boolean z2 = max > 0;
        if (androidx.core.os.BuildCompat.isAtLeastS() && workSpec.expedited && !z && !z2) {
            extras.setExpedited(true);
        }
        return extras.build();
    }

    private static android.app.job.JobInfo.TriggerContentUri convertContentUriTrigger(androidx.work.ContentUriTriggers.Trigger trigger) {
        return new android.app.job.JobInfo.TriggerContentUri(trigger.getUri(), trigger.shouldTriggerForDescendants() ? 1 : 0);
    }

    static void setRequiredNetwork(android.app.job.JobInfo.Builder builder, androidx.work.NetworkType networkType) {
        if (android.os.Build.VERSION.SDK_INT >= 30 && networkType == androidx.work.NetworkType.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetwork(new android.net.NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(convertNetworkType(networkType));
        }
    }

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobInfoConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$work$NetworkType;

        static {
            int[] iArr = new int[androidx.work.NetworkType.values().length];
            $SwitchMap$androidx$work$NetworkType = iArr;
            try {
                iArr[androidx.work.NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[androidx.work.NetworkType.CONNECTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[androidx.work.NetworkType.UNMETERED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[androidx.work.NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[androidx.work.NetworkType.METERED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    static int convertNetworkType(androidx.work.NetworkType networkType) {
        int i = androidx.work.impl.background.systemjob.SystemJobInfoConverter.AnonymousClass1.$SwitchMap$androidx$work$NetworkType[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                return 3;
            }
        } else if (i == 5 && android.os.Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("API version too low. Cannot convert network type value %s", networkType), new java.lang.Throwable[0]);
        return 1;
    }
}
