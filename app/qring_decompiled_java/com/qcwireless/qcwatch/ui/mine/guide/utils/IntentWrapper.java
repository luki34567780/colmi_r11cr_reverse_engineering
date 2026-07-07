package com.qcwireless.qcwatch.ui.mine.guide.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class IntentWrapper {
    protected static final int COOLPAD = 113;
    protected static final int DOZE = 98;
    protected static final int GIONEE = 110;
    protected static final int HUAWEI = 99;
    protected static final int HUAWEI_GOD = 100;
    protected static final int LENOVO = 114;
    protected static final int LENOVO_GOD = 115;
    protected static final int LETV = 111;
    protected static final int LETV_GOD = 112;
    protected static final int MEIZU = 104;
    protected static final int MEIZU_GOD = 105;
    protected static final int OPPO = 106;
    protected static final int OPPO_OLD = 108;
    protected static final int SAMSUNG_Auto = 118;
    protected static final int SAMSUNG_L = 103;
    protected static final int SAMSUNG_M = 107;
    protected static final int VIVO_GOD = 109;
    protected static final int XIAOMI = 101;
    protected static final int XIAOMI_GOD = 102;
    protected static final int ZTE = 116;
    protected static final int ZTE_GOD = 117;
    protected android.content.Intent intent;
    protected int type;

    public static java.util.List<com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper> getIntentWrapperList(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.os.Build.VERSION.SDK_INT >= 24 && !((android.os.PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName())) {
            android.content.Intent intent = new android.content.Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            intent.setData(android.net.Uri.parse("package:" + context.getPackageName()));
            arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent, 98));
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setAction("huawei.intent.action.HSM_BOOTAPP_MANAGER");
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent2, 99));
        android.content.Intent intent3 = new android.content.Intent();
        intent3.setComponent(new android.content.ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent3, 100));
        android.content.Intent intent4 = new android.content.Intent();
        intent4.setAction("miui.intent.action.OP_AUTO_START");
        intent4.addCategory("android.intent.category.DEFAULT");
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent4, 101));
        android.content.Intent intent5 = new android.content.Intent();
        try {
            intent5.addFlags(268435456);
            intent5.setComponent(new android.content.ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"));
            arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent5, 101));
        } catch (java.lang.Exception unused) {
        }
        android.content.Intent intent6 = new android.content.Intent();
        intent6.setComponent(new android.content.ComponentName("com.miui.powerkeeper", "com.miui.powerkeeper.ui.HiddenAppsConfigActivity"));
        intent6.putExtra("package_name", context.getPackageName());
        intent6.putExtra("package_label", getApplicationName(context));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent6, 102));
        android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.samsung.android.sm");
        if (launchIntentForPackage != null) {
            arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(launchIntentForPackage, 103));
        }
        android.content.Intent intent7 = new android.content.Intent();
        intent7.setComponent(new android.content.ComponentName("com.samsung.android.sm", "com.samsung.android.sm.ui.battery.BatteryActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent7, 107));
        android.content.Intent intent8 = new android.content.Intent();
        intent8.setComponent(new android.content.ComponentName("com.samsung.android.lool", "com.samsung.android.sm.ui.scoreboard.ScoreBoardActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent8, 118));
        android.content.Intent intent9 = new android.content.Intent("android.intent.action.MAIN");
        intent9.addCategory("android.intent.category.LAUNCHER");
        intent9.setComponent(new android.content.ComponentName("com.samsung.android.sm_cn", "com.samsung.android.sm.ui.scoreboard.CstyleScoreBoardActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent9, 118));
        android.content.Intent intent10 = new android.content.Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent10.addCategory("android.intent.category.DEFAULT");
        intent10.putExtra("packageName", context.getPackageName());
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent10, 104));
        android.content.Intent intent11 = new android.content.Intent();
        intent11.setComponent(new android.content.ComponentName("com.meizu.safe", "com.meizu.safe.powerui.PowerAppPermissionActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent11, 105));
        android.content.Intent intent12 = new android.content.Intent();
        intent12.setComponent(new android.content.ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.startup.StartupAppListActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent12, 106));
        android.content.Intent intent13 = new android.content.Intent();
        intent13.setComponent(new android.content.ComponentName("com.oppo.safe", "com.oppo.safe.permission.startup.StartupAppListActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent13, 108));
        android.content.Intent intent14 = new android.content.Intent();
        intent14.setComponent(new android.content.ComponentName("com.color.safecenter", "com.color.safecenter.permission.startup.StartupAppListActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent14, 108));
        android.content.Intent intent15 = new android.content.Intent();
        intent15.setComponent(new android.content.ComponentName("com.vivo.abe", "com.vivo.applicationbehaviorengine.ui.ExcessivePowerManagerActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent15, 109));
        android.content.Intent intent16 = new android.content.Intent();
        intent16.setComponent(new android.content.ComponentName("com.gionee.softmanager", "com.gionee.softmanager.MainActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent16, 110));
        android.content.Intent intent17 = new android.content.Intent();
        intent17.setComponent(new android.content.ComponentName("com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent17, 111));
        android.content.Intent intent18 = new android.content.Intent();
        intent18.setComponent(new android.content.ComponentName("com.letv.android.letvsafe", "com.letv.android.letvsafe.BackgroundAppManageActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent18, 112));
        android.content.Intent intent19 = new android.content.Intent();
        intent19.setComponent(new android.content.ComponentName("com.yulong.android.security", "com.yulong.android.seccenter.tabbarmain"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent19, 113));
        android.content.Intent intent20 = new android.content.Intent();
        intent20.setComponent(new android.content.ComponentName("com.lenovo.security", "com.lenovo.security.purebackground.PureBackgroundActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent20, 114));
        android.content.Intent intent21 = new android.content.Intent();
        intent21.setComponent(new android.content.ComponentName("com.lenovo.powersetting", "com.lenovo.powersetting.ui.Settings$HighPowerApplicationsActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent21, 115));
        android.content.Intent intent22 = new android.content.Intent();
        intent22.setComponent(new android.content.ComponentName("com.zte.heartyservice", "com.zte.heartyservice.autorun.AppAutoRunManager"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent22, 116));
        android.content.Intent intent23 = new android.content.Intent();
        intent23.setComponent(new android.content.ComponentName("com.zte.heartyservice", "com.zte.heartyservice.setting.ClearAppSettingsActivity"));
        arrayList.add(new com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper(intent23, 117));
        return arrayList;
    }

    public static java.lang.String getApplicationName(android.content.Context context) {
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0)).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return context.getPackageName();
        }
    }

    public static java.util.List<com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper> whiteListMatters(final android.app.Activity a) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.qcwireless.qcwatch.ui.mine.guide.utils.IntentWrapper intentWrapper : getIntentWrapperList(a)) {
            if (intentWrapper.doesActivityExists(a)) {
                intentWrapper.startActivitySafely(a);
                arrayList.add(intentWrapper);
            }
        }
        return arrayList;
    }

    public static void onBackPressed(android.app.Activity a) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        a.startActivity(intent);
    }

    protected IntentWrapper(android.content.Intent intent, int type) {
        this.intent = intent;
        this.type = type;
    }

    protected boolean doesActivityExists(android.content.Context context) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(this.intent, com.liulishuo.okdownload.DownloadTask.Builder.DEFAULT_SYNC_BUFFER_SIZE);
        return queryIntentActivities != null && queryIntentActivities.size() > 0;
    }

    protected void startActivitySafely(android.app.Activity activityContext) {
        try {
            activityContext.startActivity(this.intent);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
