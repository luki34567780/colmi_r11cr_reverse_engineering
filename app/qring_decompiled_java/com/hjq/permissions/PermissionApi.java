package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
final class PermissionApi {
    private static final com.hjq.permissions.PermissionDelegate DELEGATE;

    PermissionApi() {
    }

    static {
        if (com.hjq.permissions.AndroidVersion.isAndroid13()) {
            DELEGATE = new com.hjq.permissions.PermissionDelegateImplV33();
            return;
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid12()) {
            DELEGATE = new com.hjq.permissions.PermissionDelegateImplV31();
            return;
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid11()) {
            DELEGATE = new com.hjq.permissions.PermissionDelegateImplV30();
            return;
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid10()) {
            DELEGATE = new com.hjq.permissions.PermissionDelegateImplV29();
            return;
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid9()) {
            DELEGATE = new com.hjq.permissions.PermissionDelegateImplV28();
            return;
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid8()) {
            DELEGATE = new com.hjq.permissions.PermissionDelegateImplV26();
            return;
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid6()) {
            DELEGATE = new com.hjq.permissions.PermissionDelegateImplV23();
            return;
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid5()) {
            DELEGATE = new com.hjq.permissions.PermissionDelegateImplV21();
            return;
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid4_4()) {
            DELEGATE = new com.hjq.permissions.PermissionDelegateImplV19();
        } else if (com.hjq.permissions.AndroidVersion.isAndroid4_3()) {
            DELEGATE = new com.hjq.permissions.PermissionDelegateImplV18();
        } else {
            DELEGATE = new com.hjq.permissions.PermissionDelegateImplV14();
        }
    }

    static boolean isGrantedPermission(android.content.Context context, java.lang.String str) {
        return DELEGATE.isGrantedPermission(context, str);
    }

    static boolean isPermissionPermanentDenied(android.app.Activity activity, java.lang.String str) {
        return DELEGATE.isPermissionPermanentDenied(activity, str);
    }

    static android.content.Intent getPermissionIntent(android.content.Context context, java.lang.String str) {
        return DELEGATE.getPermissionIntent(context, str);
    }

    static boolean isSpecialPermission(java.lang.String str) {
        return com.hjq.permissions.PermissionUtils.isSpecialPermission(str);
    }

    static boolean containsSpecialPermission(java.util.List<java.lang.String> list) {
        if (list != null && !list.isEmpty()) {
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                if (isSpecialPermission(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isGrantedPermissions(android.content.Context context, java.util.List<java.lang.String> list) {
        if (list.isEmpty()) {
            return false;
        }
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (!isGrantedPermission(context, it.next())) {
                return false;
            }
        }
        return true;
    }

    static java.util.List<java.lang.String> getGrantedPermissions(android.content.Context context, java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.lang.String str : list) {
            if (isGrantedPermission(context, str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    static java.util.List<java.lang.String> getDeniedPermissions(android.content.Context context, java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.lang.String str : list) {
            if (!isGrantedPermission(context, str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    static boolean isPermissionPermanentDenied(android.app.Activity activity, java.util.List<java.lang.String> list) {
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (isPermissionPermanentDenied(activity, it.next())) {
                return true;
            }
        }
        return false;
    }

    static java.util.List<java.lang.String> getDeniedPermissions(java.util.List<java.lang.String> list, int[] iArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == -1) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    static java.util.List<java.lang.String> getGrantedPermissions(java.util.List<java.lang.String> list, int[] iArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == 0) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }
}
