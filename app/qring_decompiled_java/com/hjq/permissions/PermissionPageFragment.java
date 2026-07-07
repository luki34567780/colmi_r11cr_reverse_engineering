package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
public final class PermissionPageFragment extends android.app.Fragment implements java.lang.Runnable {
    private static final java.lang.String REQUEST_PERMISSIONS = "request_permissions";
    private com.hjq.permissions.OnPermissionPageCallback mCallBack;
    private boolean mRequestFlag;
    private boolean mStartActivityFlag;

    public static void beginRequest(android.app.Activity activity, java.util.ArrayList<java.lang.String> arrayList, com.hjq.permissions.OnPermissionPageCallback onPermissionPageCallback) {
        com.hjq.permissions.PermissionPageFragment permissionPageFragment = new com.hjq.permissions.PermissionPageFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putStringArrayList(REQUEST_PERMISSIONS, arrayList);
        permissionPageFragment.setArguments(bundle);
        permissionPageFragment.setRetainInstance(true);
        permissionPageFragment.setRequestFlag(true);
        permissionPageFragment.setCallBack(onPermissionPageCallback);
        permissionPageFragment.attachActivity(activity);
    }

    public void attachActivity(android.app.Activity activity) {
        activity.getFragmentManager().beginTransaction().add(this, toString()).commitAllowingStateLoss();
    }

    public void detachActivity(android.app.Activity activity) {
        activity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    public void setCallBack(com.hjq.permissions.OnPermissionPageCallback onPermissionPageCallback) {
        this.mCallBack = onPermissionPageCallback;
    }

    public void setRequestFlag(boolean z) {
        this.mRequestFlag = z;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.mRequestFlag) {
            detachActivity(getActivity());
            return;
        }
        if (this.mStartActivityFlag) {
            return;
        }
        this.mStartActivityFlag = true;
        android.os.Bundle arguments = getArguments();
        android.app.Activity activity = getActivity();
        if (arguments == null || activity == null) {
            return;
        }
        com.hjq.permissions.StartActivityManager.startActivityForResult(this, com.hjq.permissions.PermissionUtils.getSmartPermissionIntent(getActivity(), arguments.getStringArrayList(REQUEST_PERMISSIONS)), com.hjq.permissions.XXPermissions.REQUEST_CODE);
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayList;
        if (i != 1025) {
            return;
        }
        android.app.Activity activity = getActivity();
        android.os.Bundle arguments = getArguments();
        if (activity == null || arguments == null || (stringArrayList = arguments.getStringArrayList(REQUEST_PERMISSIONS)) == null || stringArrayList.isEmpty()) {
            return;
        }
        com.hjq.permissions.PermissionUtils.postActivityResult(stringArrayList, this);
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity activity;
        if (isAdded() && (activity = getActivity()) != null) {
            com.hjq.permissions.OnPermissionPageCallback onPermissionPageCallback = this.mCallBack;
            this.mCallBack = null;
            if (onPermissionPageCallback == null) {
                detachActivity(activity);
                return;
            }
            java.util.ArrayList<java.lang.String> stringArrayList = getArguments().getStringArrayList(REQUEST_PERMISSIONS);
            if (com.hjq.permissions.PermissionApi.getGrantedPermissions(activity, stringArrayList).size() == stringArrayList.size()) {
                onPermissionPageCallback.onGranted();
            } else {
                onPermissionPageCallback.onDenied();
            }
            detachActivity(activity);
        }
    }
}
