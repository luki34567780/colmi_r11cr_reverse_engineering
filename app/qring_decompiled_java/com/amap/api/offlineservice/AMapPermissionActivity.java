package com.amap.api.offlineservice;

/* loaded from: classes.dex */
public class AMapPermissionActivity extends android.app.Activity {
    protected java.lang.String[] needPermissions = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private boolean a = true;

    @Override // android.app.Activity
    protected void onResume() {
        try {
            super.onResume();
            if (android.os.Build.VERSION.SDK_INT < 23 || !this.a) {
                return;
            }
            a(this.needPermissions);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(java.lang.String... strArr) {
        java.util.List<java.lang.String> b;
        try {
            if (android.os.Build.VERSION.SDK_INT < 23 || getApplicationInfo().targetSdkVersion < 23 || (b = b(strArr)) == null) {
                return;
            }
            if (b.size() > 0) {
                try {
                    getClass().getMethod("requestPermissions", java.lang.String[].class, java.lang.Integer.TYPE).invoke(this, (java.lang.String[]) b.toArray(new java.lang.String[b.size()]), 0);
                } catch (java.lang.Throwable unused) {
                }
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    private java.util.List<java.lang.String> b(java.lang.String[] strArr) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (android.os.Build.VERSION.SDK_INT >= 23 && getApplicationInfo().targetSdkVersion >= 23) {
                for (java.lang.String str : strArr) {
                    if (a(str) != 0 || b(str)) {
                        arrayList.add(str);
                    }
                }
            }
            return arrayList;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private int a(java.lang.String str) {
        try {
            return ((java.lang.Integer) getClass().getMethod("checkSelfPermission", java.lang.String.class).invoke(this, str)).intValue();
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    private boolean b(java.lang.String str) {
        try {
            return ((java.lang.Boolean) getClass().getMethod("shouldShowRequestPermissionRationale", java.lang.String.class).invoke(this, str)).booleanValue();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private static boolean a(int[] iArr) {
        try {
            for (int i : iArr) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        try {
            if (android.os.Build.VERSION.SDK_INT < 23 || i != 0 || a(iArr)) {
                return;
            }
            a();
            this.a = false;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    private void a() {
        try {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
            builder.setTitle("提示");
            builder.setMessage("当前应用缺少必要权限。\n\n请点击\"设置\"-\"权限\"-打开所需权限");
            builder.setNegativeButton("取消", new android.content.DialogInterface.OnClickListener() { // from class: com.amap.api.offlineservice.AMapPermissionActivity.1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    try {
                        com.amap.api.offlineservice.AMapPermissionActivity.this.finish();
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
            builder.setPositiveButton("设置", new android.content.DialogInterface.OnClickListener() { // from class: com.amap.api.offlineservice.AMapPermissionActivity.2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    try {
                        com.amap.api.offlineservice.AMapPermissionActivity.this.b();
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
            builder.setCancelable(false);
            builder.show();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(android.net.Uri.parse("package:" + getPackageName()));
            startActivity(intent);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }
}
