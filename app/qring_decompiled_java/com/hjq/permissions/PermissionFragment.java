package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
public final class PermissionFragment extends android.app.Fragment implements java.lang.Runnable {
    private static final java.lang.String REQUEST_CODE = "request_code";
    private static final java.util.List<java.lang.Integer> REQUEST_CODE_ARRAY = new java.util.ArrayList();
    private static final java.lang.String REQUEST_PERMISSIONS = "request_permissions";
    private com.hjq.permissions.OnPermissionCallback mCallBack;
    private boolean mDangerousRequest;
    private com.hjq.permissions.IPermissionInterceptor mInterceptor;
    private boolean mRequestFlag;
    private int mScreenOrientation;
    private boolean mSpecialRequest;

    public static void launch(android.app.Activity activity, java.util.ArrayList<java.lang.String> arrayList, com.hjq.permissions.IPermissionInterceptor iPermissionInterceptor, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
        int nextInt;
        java.util.List<java.lang.Integer> list;
        com.hjq.permissions.PermissionFragment permissionFragment = new com.hjq.permissions.PermissionFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        do {
            nextInt = new java.util.Random().nextInt((int) java.lang.Math.pow(2.0d, 8.0d));
            list = REQUEST_CODE_ARRAY;
        } while (list.contains(java.lang.Integer.valueOf(nextInt)));
        list.add(java.lang.Integer.valueOf(nextInt));
        bundle.putInt(REQUEST_CODE, nextInt);
        bundle.putStringArrayList(REQUEST_PERMISSIONS, arrayList);
        permissionFragment.setArguments(bundle);
        permissionFragment.setRetainInstance(true);
        permissionFragment.setRequestFlag(true);
        permissionFragment.setCallBack(onPermissionCallback);
        permissionFragment.setInterceptor(iPermissionInterceptor);
        permissionFragment.attachActivity(activity);
    }

    public void attachActivity(android.app.Activity activity) {
        activity.getFragmentManager().beginTransaction().add(this, toString()).commitAllowingStateLoss();
    }

    public void detachActivity(android.app.Activity activity) {
        activity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    public void setCallBack(com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
        this.mCallBack = onPermissionCallback;
    }

    public void setRequestFlag(boolean z) {
        this.mRequestFlag = z;
    }

    public void setInterceptor(com.hjq.permissions.IPermissionInterceptor iPermissionInterceptor) {
        this.mInterceptor = iPermissionInterceptor;
    }

    @Override // android.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        android.app.Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        int requestedOrientation = activity.getRequestedOrientation();
        this.mScreenOrientation = requestedOrientation;
        if (requestedOrientation != -1) {
            return;
        }
        com.hjq.permissions.PermissionUtils.lockActivityOrientation(activity);
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        android.app.Activity activity = getActivity();
        if (activity == null || this.mScreenOrientation != -1 || activity.getRequestedOrientation() == -1) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mCallBack = null;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.mRequestFlag) {
            detachActivity(getActivity());
        } else {
            if (this.mSpecialRequest) {
                return;
            }
            this.mSpecialRequest = true;
            requestSpecialPermission();
        }
    }

    public void requestSpecialPermission() {
        android.os.Bundle arguments = getArguments();
        android.app.Activity activity = getActivity();
        if (arguments == null || activity == null) {
            return;
        }
        boolean z = false;
        for (java.lang.String str : arguments.getStringArrayList(REQUEST_PERMISSIONS)) {
            if (com.hjq.permissions.PermissionApi.isSpecialPermission(str) && !com.hjq.permissions.PermissionApi.isGrantedPermission(activity, str) && (com.hjq.permissions.AndroidVersion.isAndroid11() || !com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE))) {
                com.hjq.permissions.StartActivityManager.startActivityForResult(this, com.hjq.permissions.PermissionUtils.getSmartPermissionIntent(activity, com.hjq.permissions.PermissionUtils.asArrayList(str)), getArguments().getInt(REQUEST_CODE));
                z = true;
            }
        }
        if (z) {
            return;
        }
        requestDangerousPermission();
    }

    public void requestDangerousPermission() {
        android.app.Activity activity = getActivity();
        android.os.Bundle arguments = getArguments();
        if (activity == null || arguments == null) {
            return;
        }
        int i = arguments.getInt(REQUEST_CODE);
        java.util.ArrayList<java.lang.String> stringArrayList = arguments.getStringArrayList(REQUEST_PERMISSIONS);
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return;
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid6()) {
            int size = stringArrayList.size();
            int[] iArr = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = com.hjq.permissions.PermissionApi.isGrantedPermission(activity, stringArrayList.get(i2)) ? 0 : -1;
            }
            onRequestPermissionsResult(i, (java.lang.String[]) stringArrayList.toArray(new java.lang.String[0]), iArr);
            return;
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid13() && stringArrayList.size() >= 2 && com.hjq.permissions.PermissionUtils.containsPermission(stringArrayList, com.hjq.permissions.Permission.BODY_SENSORS_BACKGROUND)) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(stringArrayList);
            arrayList.remove(com.hjq.permissions.Permission.BODY_SENSORS_BACKGROUND);
            splitTwiceRequestPermission(activity, stringArrayList, arrayList, i);
            return;
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid10() && stringArrayList.size() >= 2 && com.hjq.permissions.PermissionUtils.containsPermission(stringArrayList, com.hjq.permissions.Permission.ACCESS_BACKGROUND_LOCATION)) {
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>(stringArrayList);
            arrayList2.remove(com.hjq.permissions.Permission.ACCESS_BACKGROUND_LOCATION);
            splitTwiceRequestPermission(activity, stringArrayList, arrayList2, i);
        } else {
            if (com.hjq.permissions.AndroidVersion.isAndroid10() && com.hjq.permissions.PermissionUtils.containsPermission(stringArrayList, com.hjq.permissions.Permission.ACCESS_MEDIA_LOCATION) && com.hjq.permissions.PermissionUtils.containsPermission(stringArrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
                java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>(stringArrayList);
                arrayList3.remove(com.hjq.permissions.Permission.ACCESS_MEDIA_LOCATION);
                splitTwiceRequestPermission(activity, stringArrayList, arrayList3, i);
                return;
            }
            requestPermissions((java.lang.String[]) stringArrayList.toArray(new java.lang.String[stringArrayList.size() - 1]), i);
        }
    }

    public void splitTwiceRequestPermission(android.app.Activity activity, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2, int i) {
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList);
        java.util.Iterator<java.lang.String> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.remove(it.next());
        }
        launch(activity, arrayList2, new com.hjq.permissions.IPermissionInterceptor() { // from class: com.hjq.permissions.PermissionFragment.1
            @Override // com.hjq.permissions.IPermissionInterceptor
            public /* synthetic */ void deniedPermissionRequest(android.app.Activity activity2, java.util.List list, java.util.List list2, boolean z, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
                com.hjq.permissions.IPermissionInterceptor.CC.$default$deniedPermissionRequest(this, activity2, list, list2, z, onPermissionCallback);
            }

            @Override // com.hjq.permissions.IPermissionInterceptor
            public /* synthetic */ void finishPermissionRequest(android.app.Activity activity2, java.util.List list, boolean z, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
                com.hjq.permissions.IPermissionInterceptor.CC.$default$finishPermissionRequest(this, activity2, list, z, onPermissionCallback);
            }

            @Override // com.hjq.permissions.IPermissionInterceptor
            public /* synthetic */ void grantedPermissionRequest(android.app.Activity activity2, java.util.List list, java.util.List list2, boolean z, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
                com.hjq.permissions.IPermissionInterceptor.CC.$default$grantedPermissionRequest(this, activity2, list, list2, z, onPermissionCallback);
            }

            @Override // com.hjq.permissions.IPermissionInterceptor
            public /* synthetic */ void launchPermissionRequest(android.app.Activity activity2, java.util.List list, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
                com.hjq.permissions.PermissionFragment.launch(activity2, new java.util.ArrayList(list), this, onPermissionCallback);
            }
        }, new com.hjq.permissions.PermissionFragment.AnonymousClass2(activity, arrayList3, arrayList, i));
    }

    /* renamed from: com.hjq.permissions.PermissionFragment$2, reason: invalid class name */
    class AnonymousClass2 implements com.hjq.permissions.OnPermissionCallback {
        final /* synthetic */ android.app.Activity val$activity;
        final /* synthetic */ java.util.ArrayList val$allPermissions;
        final /* synthetic */ int val$requestCode;
        final /* synthetic */ java.util.ArrayList val$secondPermissions;

        AnonymousClass2(android.app.Activity activity, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i) {
            this.val$activity = activity;
            this.val$secondPermissions = arrayList;
            this.val$allPermissions = arrayList2;
            this.val$requestCode = i;
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> list, boolean z) {
            if (z && com.hjq.permissions.PermissionFragment.this.isAdded()) {
                long j = com.hjq.permissions.AndroidVersion.isAndroid13() ? 150L : 0L;
                final android.app.Activity activity = this.val$activity;
                final java.util.ArrayList arrayList = this.val$secondPermissions;
                final java.util.ArrayList arrayList2 = this.val$allPermissions;
                final int i = this.val$requestCode;
                com.hjq.permissions.PermissionUtils.postDelayed(new java.lang.Runnable() { // from class: com.hjq.permissions.PermissionFragment$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.hjq.permissions.PermissionFragment.AnonymousClass2.this.m86lambda$onGranted$0$comhjqpermissionsPermissionFragment$2(activity, arrayList, arrayList2, i);
                    }
                }, j);
            }
        }

        /* renamed from: lambda$onGranted$0$com-hjq-permissions-PermissionFragment$2, reason: not valid java name */
        public /* synthetic */ void m86lambda$onGranted$0$comhjqpermissionsPermissionFragment$2(android.app.Activity activity, final java.util.ArrayList arrayList, final java.util.ArrayList arrayList2, final int i) {
            com.hjq.permissions.PermissionFragment.launch(activity, arrayList, new com.hjq.permissions.IPermissionInterceptor() { // from class: com.hjq.permissions.PermissionFragment.2.1
                @Override // com.hjq.permissions.IPermissionInterceptor
                public /* synthetic */ void deniedPermissionRequest(android.app.Activity activity2, java.util.List list, java.util.List list2, boolean z, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
                    com.hjq.permissions.IPermissionInterceptor.CC.$default$deniedPermissionRequest(this, activity2, list, list2, z, onPermissionCallback);
                }

                @Override // com.hjq.permissions.IPermissionInterceptor
                public /* synthetic */ void finishPermissionRequest(android.app.Activity activity2, java.util.List list, boolean z, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
                    com.hjq.permissions.IPermissionInterceptor.CC.$default$finishPermissionRequest(this, activity2, list, z, onPermissionCallback);
                }

                @Override // com.hjq.permissions.IPermissionInterceptor
                public /* synthetic */ void grantedPermissionRequest(android.app.Activity activity2, java.util.List list, java.util.List list2, boolean z, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
                    com.hjq.permissions.IPermissionInterceptor.CC.$default$grantedPermissionRequest(this, activity2, list, list2, z, onPermissionCallback);
                }

                @Override // com.hjq.permissions.IPermissionInterceptor
                public /* synthetic */ void launchPermissionRequest(android.app.Activity activity2, java.util.List list, com.hjq.permissions.OnPermissionCallback onPermissionCallback) {
                    com.hjq.permissions.PermissionFragment.launch(activity2, new java.util.ArrayList(list), this, onPermissionCallback);
                }
            }, new com.hjq.permissions.OnPermissionCallback() { // from class: com.hjq.permissions.PermissionFragment.2.2
                @Override // com.hjq.permissions.OnPermissionCallback
                public void onGranted(java.util.List<java.lang.String> list, boolean z) {
                    if (z && com.hjq.permissions.PermissionFragment.this.isAdded()) {
                        int[] iArr = new int[arrayList2.size()];
                        java.util.Arrays.fill(iArr, 0);
                        com.hjq.permissions.PermissionFragment.this.onRequestPermissionsResult(i, (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]), iArr);
                    }
                }

                @Override // com.hjq.permissions.OnPermissionCallback
                public void onDenied(java.util.List<java.lang.String> list, boolean z) {
                    if (com.hjq.permissions.PermissionFragment.this.isAdded()) {
                        int[] iArr = new int[arrayList2.size()];
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            iArr[i2] = com.hjq.permissions.PermissionUtils.containsPermission(arrayList, (java.lang.String) arrayList2.get(i2)) ? -1 : 0;
                        }
                        com.hjq.permissions.PermissionFragment.this.onRequestPermissionsResult(i, (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]), iArr);
                    }
                }
            });
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> list, boolean z) {
            if (com.hjq.permissions.PermissionFragment.this.isAdded()) {
                int[] iArr = new int[this.val$allPermissions.size()];
                java.util.Arrays.fill(iArr, -1);
                com.hjq.permissions.PermissionFragment.this.onRequestPermissionsResult(this.val$requestCode, (java.lang.String[]) this.val$allPermissions.toArray(new java.lang.String[0]), iArr);
            }
        }
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        android.os.Bundle arguments = getArguments();
        android.app.Activity activity = getActivity();
        if (activity == null || arguments == null || this.mInterceptor == null || i != arguments.getInt(REQUEST_CODE)) {
            return;
        }
        com.hjq.permissions.OnPermissionCallback onPermissionCallback = this.mCallBack;
        this.mCallBack = null;
        com.hjq.permissions.IPermissionInterceptor iPermissionInterceptor = this.mInterceptor;
        this.mInterceptor = null;
        com.hjq.permissions.PermissionUtils.optimizePermissionResults(activity, strArr, iArr);
        java.util.ArrayList asArrayList = com.hjq.permissions.PermissionUtils.asArrayList(strArr);
        REQUEST_CODE_ARRAY.remove(java.lang.Integer.valueOf(i));
        detachActivity(activity);
        java.util.List<java.lang.String> grantedPermissions = com.hjq.permissions.PermissionApi.getGrantedPermissions(asArrayList, iArr);
        if (grantedPermissions.size() == asArrayList.size()) {
            iPermissionInterceptor.grantedPermissionRequest(activity, asArrayList, grantedPermissions, true, onPermissionCallback);
            iPermissionInterceptor.finishPermissionRequest(activity, asArrayList, false, onPermissionCallback);
            return;
        }
        java.util.List<java.lang.String> deniedPermissions = com.hjq.permissions.PermissionApi.getDeniedPermissions(asArrayList, iArr);
        iPermissionInterceptor.deniedPermissionRequest(activity, asArrayList, deniedPermissions, com.hjq.permissions.PermissionApi.isPermissionPermanentDenied(activity, deniedPermissions), onPermissionCallback);
        if (!grantedPermissions.isEmpty()) {
            iPermissionInterceptor.grantedPermissionRequest(activity, asArrayList, grantedPermissions, false, onPermissionCallback);
        }
        iPermissionInterceptor.finishPermissionRequest(activity, asArrayList, false, onPermissionCallback);
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayList;
        android.app.Activity activity = getActivity();
        android.os.Bundle arguments = getArguments();
        if (activity == null || arguments == null || this.mDangerousRequest || i != arguments.getInt(REQUEST_CODE) || (stringArrayList = arguments.getStringArrayList(REQUEST_PERMISSIONS)) == null || stringArrayList.isEmpty()) {
            return;
        }
        this.mDangerousRequest = true;
        com.hjq.permissions.PermissionUtils.postActivityResult(stringArrayList, this);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isAdded()) {
            requestDangerousPermission();
        }
    }
}
