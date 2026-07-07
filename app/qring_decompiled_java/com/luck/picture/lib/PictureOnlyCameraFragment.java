package com.luck.picture.lib;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureOnlyCameraFragment extends com.luck.picture.lib.basic.PictureCommonFragment {
    public static final java.lang.String TAG = "PictureOnlyCameraFragment";

    public static com.luck.picture.lib.PictureOnlyCameraFragment newInstance() {
        return new com.luck.picture.lib.PictureOnlyCameraFragment();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public java.lang.String getFragmentTag() {
        return TAG;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public int getResourceId() {
        return com.luck.picture.lib.R.layout.ps_empty;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            if (com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
                openSelectedCamera();
            } else {
                final java.lang.String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
                com.luck.picture.lib.permissions.PermissionChecker.getInstance().requestPermissions(this, strArr, new com.luck.picture.lib.permissions.PermissionResultCallback() { // from class: com.luck.picture.lib.PictureOnlyCameraFragment.1
                    @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                    public void onGranted() {
                        com.luck.picture.lib.PictureOnlyCameraFragment.this.openSelectedCamera();
                    }

                    @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                    public void onDenied() {
                        com.luck.picture.lib.PictureOnlyCameraFragment.this.handlePermissionDenied(strArr);
                    }
                });
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void dispatchCameraMediaResult(com.luck.picture.lib.entity.LocalMedia localMedia) {
        if (confirmSelect(localMedia, false) == 0) {
            dispatchTransformResult();
        } else {
            onKeyBackFragmentFinish();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            onKeyBackFragmentFinish();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void handlePermissionSettingResult(java.lang.String[] strArr) {
        boolean isCheckCamera;
        onPermissionExplainEvent(false, null);
        if (this.selectorConfig.onPermissionsEventListener != null) {
            isCheckCamera = this.selectorConfig.onPermissionsEventListener.hasPermissions(this, strArr);
        } else {
            isCheckCamera = com.luck.picture.lib.permissions.PermissionChecker.isCheckCamera(getContext());
            if (!com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
                isCheckCamera = com.luck.picture.lib.permissions.PermissionChecker.isCheckWriteExternalStorage(getContext());
            }
        }
        if (isCheckCamera) {
            openSelectedCamera();
        } else {
            if (!com.luck.picture.lib.permissions.PermissionChecker.isCheckCamera(getContext())) {
                com.luck.picture.lib.utils.ToastUtils.showToast(getContext(), getString(com.luck.picture.lib.R.string.ps_camera));
            } else if (!com.luck.picture.lib.permissions.PermissionChecker.isCheckWriteExternalStorage(getContext())) {
                com.luck.picture.lib.utils.ToastUtils.showToast(getContext(), getString(com.luck.picture.lib.R.string.ps_jurisdiction));
            }
            onKeyBackFragmentFinish();
        }
        com.luck.picture.lib.permissions.PermissionConfig.CURRENT_REQUEST_PERMISSION = new java.lang.String[0];
    }
}
