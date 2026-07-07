package com.king.zxing;

/* loaded from: /tmp/dex/classes2.dex */
public class CaptureFragment extends androidx.fragment.app.Fragment implements com.king.zxing.CameraScan.OnScanResultCallback {
    private static final int CAMERA_PERMISSION_REQUEST_CODE = 134;
    protected android.view.View ivFlashlight;
    private com.king.zxing.CameraScan mCameraScan;
    private android.view.View mRootView;
    protected androidx.camera.view.PreviewView previewView;
    protected com.king.zxing.ViewfinderView viewfinderView;

    public boolean isContentView(int i) {
        return true;
    }

    @Override // com.king.zxing.CameraScan.OnScanResultCallback
    public boolean onScanResultCallback(com.google.zxing.Result result) {
        return false;
    }

    @Override // com.king.zxing.CameraScan.OnScanResultCallback
    public /* synthetic */ void onScanResultFailure() {
        com.king.zxing.CameraScan.OnScanResultCallback.CC.$default$onScanResultFailure(this);
    }

    public static com.king.zxing.CaptureFragment newInstance() {
        android.os.Bundle bundle = new android.os.Bundle();
        com.king.zxing.CaptureFragment captureFragment = new com.king.zxing.CaptureFragment();
        captureFragment.setArguments(bundle);
        return captureFragment;
    }

    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (isContentView(getLayoutId())) {
            this.mRootView = createRootView(layoutInflater, viewGroup);
        }
        initUI();
        return this.mRootView;
    }

    public void initUI() {
        this.previewView = this.mRootView.findViewById(getPreviewViewId());
        int viewfinderViewId = getViewfinderViewId();
        if (viewfinderViewId != 0) {
            this.viewfinderView = (com.king.zxing.ViewfinderView) this.mRootView.findViewById(viewfinderViewId);
        }
        int flashlightId = getFlashlightId();
        if (flashlightId != 0) {
            android.view.View findViewById = this.mRootView.findViewById(flashlightId);
            this.ivFlashlight = findViewById;
            if (findViewById != null) {
                findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.king.zxing.CaptureFragment$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        com.king.zxing.CaptureFragment.this.m88lambda$initUI$0$comkingzxingCaptureFragment(view);
                    }
                });
            }
        }
        initCameraScan();
        startCamera();
    }

    /* renamed from: lambda$initUI$0$com-king-zxing-CaptureFragment, reason: not valid java name */
    public /* synthetic */ void m88lambda$initUI$0$comkingzxingCaptureFragment(android.view.View view) {
        onClickFlashlight();
    }

    protected void onClickFlashlight() {
        toggleTorchState();
    }

    public void initCameraScan() {
        com.king.zxing.DefaultCameraScan defaultCameraScan = new com.king.zxing.DefaultCameraScan(this, this.previewView);
        this.mCameraScan = defaultCameraScan;
        defaultCameraScan.setOnScanResultCallback(this);
    }

    public void startCamera() {
        if (this.mCameraScan != null) {
            if (com.king.zxing.util.PermissionUtils.checkPermission(getContext(), com.hjq.permissions.Permission.CAMERA)) {
                this.mCameraScan.startCamera();
            } else {
                com.king.zxing.util.LogUtils.d("checkPermissionResult != PERMISSION_GRANTED");
                com.king.zxing.util.PermissionUtils.requestPermission(this, com.hjq.permissions.Permission.CAMERA, CAMERA_PERMISSION_REQUEST_CODE);
            }
        }
    }

    private void releaseCamera() {
        com.king.zxing.CameraScan cameraScan = this.mCameraScan;
        if (cameraScan != null) {
            cameraScan.release();
        }
    }

    protected void toggleTorchState() {
        com.king.zxing.CameraScan cameraScan = this.mCameraScan;
        if (cameraScan != null) {
            boolean isTorchEnabled = cameraScan.isTorchEnabled();
            this.mCameraScan.enableTorch(!isTorchEnabled);
            android.view.View view = this.ivFlashlight;
            if (view != null) {
                view.setSelected(!isTorchEnabled);
            }
        }
    }

    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == CAMERA_PERMISSION_REQUEST_CODE) {
            requestCameraPermissionResult(strArr, iArr);
        }
    }

    public void requestCameraPermissionResult(java.lang.String[] strArr, int[] iArr) {
        if (com.king.zxing.util.PermissionUtils.requestPermissionsResult(com.hjq.permissions.Permission.CAMERA, strArr, iArr)) {
            startCamera();
        } else {
            getActivity().finish();
        }
    }

    public void onDestroy() {
        releaseCamera();
        super.onDestroy();
    }

    public android.view.View createRootView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        return layoutInflater.inflate(getLayoutId(), viewGroup, false);
    }

    public int getLayoutId() {
        return com.king.zxing.R.layout.zxl_capture;
    }

    public int getViewfinderViewId() {
        return com.king.zxing.R.id.viewfinderView;
    }

    public int getPreviewViewId() {
        return com.king.zxing.R.id.previewView;
    }

    public int getFlashlightId() {
        return com.king.zxing.R.id.ivFlashlight;
    }

    public com.king.zxing.CameraScan getCameraScan() {
        return this.mCameraScan;
    }

    public android.view.View getRootView() {
        return this.mRootView;
    }
}
