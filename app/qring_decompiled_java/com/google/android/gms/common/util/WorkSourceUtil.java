package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class WorkSourceUtil {
    private static final int zza = android.os.Process.myUid();
    private static final java.lang.reflect.Method zzb;
    private static final java.lang.reflect.Method zzc;
    private static final java.lang.reflect.Method zzd;
    private static final java.lang.reflect.Method zze;
    private static final java.lang.reflect.Method zzf;
    private static final java.lang.reflect.Method zzg;
    private static final java.lang.reflect.Method zzh;
    private static final java.lang.reflect.Method zzi;

    /* JADX WARN: Can't wrap try/catch for region: R(26:0|1|2|3|4|(21:49|50|7|8|9|10|11|12|13|(12:41|42|16|(9:36|37|19|(6:31|32|22|(2:27|28)|24|25)|21|22|(0)|24|25)|18|19|(0)|21|22|(0)|24|25)|15|16|(0)|18|19|(0)|21|22|(0)|24|25)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0053, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0041, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "add"
            int r1 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r1
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L18
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L18
            r4[r2] = r5     // Catch: java.lang.Exception -> L18
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.reflect.Method r4 = r5.getMethod(r0, r4)     // Catch: java.lang.Exception -> L18
            goto L19
        L18:
            r4 = r3
        L19:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r4
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            r5 = 2
            if (r4 == 0) goto L33
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L33
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L33
            r4[r2] = r6     // Catch: java.lang.Exception -> L33
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r1] = r6     // Catch: java.lang.Exception -> L33
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.reflect.Method r0 = r6.getMethod(r0, r4)     // Catch: java.lang.Exception -> L33
            goto L34
        L33:
            r0 = r3
        L34:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r0
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r4 = "size"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L41
            java.lang.reflect.Method r0 = r0.getMethod(r4, r6)     // Catch: java.lang.Exception -> L41
            goto L42
        L41:
            r0 = r3
        L42:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r0
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L53
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L53
            r0[r2] = r4     // Catch: java.lang.Exception -> L53
            java.lang.Class<android.os.WorkSource> r4 = android.os.WorkSource.class
            java.lang.String r6 = "get"
            java.lang.reflect.Method r0 = r4.getMethod(r6, r0)     // Catch: java.lang.Exception -> L53
            goto L54
        L53:
            r0 = r3
        L54:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r0 == 0) goto L6b
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L6b
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L6b
            r0[r2] = r4     // Catch: java.lang.Exception -> L6b
            java.lang.Class<android.os.WorkSource> r4 = android.os.WorkSource.class
            java.lang.String r6 = "getName"
            java.lang.reflect.Method r0 = r4.getMethod(r6, r0)     // Catch: java.lang.Exception -> L6b
            goto L6c
        L6b:
            r0 = r3
        L6c:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            java.lang.String r4 = "WorkSourceUtil"
            if (r0 == 0) goto L87
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r6 = "createWorkChain"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L81
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch: java.lang.Exception -> L81
            goto L88
        L81:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r4, r6, r0)
        L87:
            r0 = r3
        L88:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Lad
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> La7
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> La7
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> La7
            r5[r2] = r6     // Catch: java.lang.Exception -> La7
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r1] = r6     // Catch: java.lang.Exception -> La7
            java.lang.String r6 = "addNode"
            java.lang.reflect.Method r0 = r0.getMethod(r6, r5)     // Catch: java.lang.Exception -> La7
            goto Lae
        La7:
            r0 = move-exception
            java.lang.String r5 = "Missing WorkChain class"
            android.util.Log.w(r4, r5, r0)
        Lad:
            r0 = r3
        Lae:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Lc3
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r4 = "isEmpty"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lc3
            java.lang.reflect.Method r3 = r0.getMethod(r4, r2)     // Catch: java.lang.Exception -> Lc3
            r3.setAccessible(r1)     // Catch: java.lang.Exception -> Lc3
        Lc3:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    public static void add(android.os.WorkSource workSource, int i, java.lang.String str) {
        java.lang.reflect.Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, java.lang.Integer.valueOf(i), str);
                return;
            } catch (java.lang.Exception e) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        java.lang.reflect.Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, java.lang.Integer.valueOf(i));
            } catch (java.lang.Exception e2) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    public static android.os.WorkSource fromPackage(android.content.Context context, java.lang.String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                android.content.pm.ApplicationInfo applicationInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    android.util.Log.e("WorkSourceUtil", str.length() != 0 ? "Could not get applicationInfo from package: ".concat(str) : new java.lang.String("Could not get applicationInfo from package: "));
                    return null;
                }
                int i = applicationInfo.uid;
                android.os.WorkSource workSource = new android.os.WorkSource();
                add(workSource, i, str);
                return workSource;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                android.util.Log.e("WorkSourceUtil", str.length() != 0 ? "Could not find package: ".concat(str) : new java.lang.String("Could not find package: "));
            }
        }
        return null;
    }

    public static android.os.WorkSource fromPackageAndModuleExperimentalPi(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.reflect.Method method;
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            android.util.Log.w("WorkSourceUtil", "Unexpected null arguments");
            return null;
        }
        int i = -1;
        try {
            android.content.pm.ApplicationInfo applicationInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                android.util.Log.e("WorkSourceUtil", str.length() != 0 ? "Could not get applicationInfo from package: ".concat(str) : new java.lang.String("Could not get applicationInfo from package: "));
            } else {
                i = applicationInfo.uid;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.util.Log.e("WorkSourceUtil", str.length() != 0 ? "Could not find package: ".concat(str) : new java.lang.String("Could not find package: "));
        }
        if (i < 0) {
            return null;
        }
        android.os.WorkSource workSource = new android.os.WorkSource();
        java.lang.reflect.Method method2 = zzg;
        if (method2 == null || (method = zzh) == null) {
            add(workSource, i, str);
        } else {
            try {
                java.lang.Object invoke = method2.invoke(workSource, new java.lang.Object[0]);
                int i2 = zza;
                if (i != i2) {
                    method.invoke(invoke, java.lang.Integer.valueOf(i), str);
                }
                method.invoke(invoke, java.lang.Integer.valueOf(i2), str2);
            } catch (java.lang.Exception e) {
                android.util.Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e);
            }
        }
        return workSource;
    }

    public static java.util.List<java.lang.String> getNames(android.os.WorkSource workSource) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int zza2 = workSource == null ? 0 : zza(workSource);
        if (zza2 != 0) {
            for (int i = 0; i < zza2; i++) {
                java.lang.reflect.Method method = zzf;
                java.lang.String str = null;
                if (method != null) {
                    try {
                        str = (java.lang.String) method.invoke(workSource, java.lang.Integer.valueOf(i));
                    } catch (java.lang.Exception e) {
                        android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                    }
                }
                if (!com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(str)) {
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static boolean hasWorkSourcePermission(android.content.Context context) {
        return (context == null || context.getPackageManager() == null || com.google.android.gms.common.wrappers.Wrappers.packageManager(context).checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    public static boolean isEmpty(android.os.WorkSource workSource) {
        java.lang.reflect.Method method = zzi;
        if (method != null) {
            try {
                java.lang.Object invoke = method.invoke(workSource, new java.lang.Object[0]);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(invoke);
                return ((java.lang.Boolean) invoke).booleanValue();
            } catch (java.lang.Exception e) {
                android.util.Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        return zza(workSource) == 0;
    }

    public static int zza(android.os.WorkSource workSource) {
        java.lang.reflect.Method method = zzd;
        if (method != null) {
            try {
                java.lang.Object invoke = method.invoke(workSource, new java.lang.Object[0]);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(invoke);
                return ((java.lang.Integer) invoke).intValue();
            } catch (java.lang.Exception e) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }
}
