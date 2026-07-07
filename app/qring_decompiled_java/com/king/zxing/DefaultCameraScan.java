package com.king.zxing;

/* loaded from: /tmp/dex/classes2.dex */
public class DefaultCameraScan extends com.king.zxing.CameraScan {
    private static final int HOVER_TAP_SLOP = 20;
    private static final int HOVER_TAP_TIMEOUT = 150;
    private android.view.View flashlightView;
    private volatile boolean isAnalyzeResult;
    private boolean isClickTap;
    private com.king.zxing.manager.AmbientLightManager mAmbientLightManager;
    private com.king.zxing.analyze.Analyzer mAnalyzer;
    private com.king.zxing.manager.BeepManager mBeepManager;
    private androidx.camera.core.Camera mCamera;
    private com.king.zxing.config.CameraConfig mCameraConfig;
    private com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.ProcessCameraProvider> mCameraProviderFuture;
    private android.content.Context mContext;
    private float mDownX;
    private float mDownY;
    private androidx.fragment.app.FragmentActivity mFragmentActivity;
    private long mLastAutoZoomTime;
    private long mLastHoveTapTime;
    private androidx.lifecycle.LifecycleOwner mLifecycleOwner;
    private com.king.zxing.CameraScan.OnScanResultCallback mOnScanResultCallback;
    private int mOrientation;
    private androidx.camera.view.PreviewView mPreviewView;
    private androidx.lifecycle.MutableLiveData<com.google.zxing.Result> mResultLiveData;
    private int mScreenHeight;
    private int mScreenWidth;
    private volatile boolean isAnalyze = true;
    private android.view.ScaleGestureDetector.OnScaleGestureListener mOnScaleGestureListener = new android.view.ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: com.king.zxing.DefaultCameraScan.1
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (com.king.zxing.DefaultCameraScan.this.mCamera == null) {
                return true;
            }
            com.king.zxing.DefaultCameraScan.this.zoomTo(((androidx.camera.core.ZoomState) com.king.zxing.DefaultCameraScan.this.mCamera.getCameraInfo().getZoomState().getValue()).getZoomRatio() * scaleFactor);
            return true;
        }
    };

    public DefaultCameraScan(androidx.fragment.app.FragmentActivity fragmentActivity, androidx.camera.view.PreviewView previewView) {
        this.mFragmentActivity = fragmentActivity;
        this.mLifecycleOwner = fragmentActivity;
        this.mContext = fragmentActivity;
        this.mPreviewView = previewView;
        initData();
    }

    public DefaultCameraScan(androidx.fragment.app.Fragment fragment, androidx.camera.view.PreviewView previewView) {
        this.mFragmentActivity = fragment.getActivity();
        this.mLifecycleOwner = fragment;
        this.mContext = fragment.getContext();
        this.mPreviewView = previewView;
        initData();
    }

    private void initData() {
        androidx.lifecycle.MutableLiveData<com.google.zxing.Result> mutableLiveData = new androidx.lifecycle.MutableLiveData<>();
        this.mResultLiveData = mutableLiveData;
        mutableLiveData.observe(this.mLifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.king.zxing.DefaultCameraScan$$ExternalSyntheticLambda2
            public final void onChanged(java.lang.Object obj) {
                com.king.zxing.DefaultCameraScan.this.m89lambda$initData$0$comkingzxingDefaultCameraScan((com.google.zxing.Result) obj);
            }
        });
        this.mOrientation = this.mContext.getResources().getConfiguration().orientation;
        final android.view.ScaleGestureDetector scaleGestureDetector = new android.view.ScaleGestureDetector(this.mContext, this.mOnScaleGestureListener);
        this.mPreviewView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.king.zxing.DefaultCameraScan$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.king.zxing.DefaultCameraScan.this.m90lambda$initData$1$comkingzxingDefaultCameraScan(scaleGestureDetector, view, motionEvent);
            }
        });
        android.util.DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
        this.mScreenWidth = displayMetrics.widthPixels;
        this.mScreenHeight = displayMetrics.heightPixels;
        com.king.zxing.util.LogUtils.d(java.lang.String.format("displayMetrics:%dx%d", java.lang.Integer.valueOf(this.mScreenWidth), java.lang.Integer.valueOf(this.mScreenHeight)));
        this.mBeepManager = new com.king.zxing.manager.BeepManager(this.mContext);
        com.king.zxing.manager.AmbientLightManager ambientLightManager = new com.king.zxing.manager.AmbientLightManager(this.mContext);
        this.mAmbientLightManager = ambientLightManager;
        ambientLightManager.register();
        this.mAmbientLightManager.setOnLightSensorEventListener(new com.king.zxing.manager.AmbientLightManager.OnLightSensorEventListener() { // from class: com.king.zxing.DefaultCameraScan$$ExternalSyntheticLambda3
            @Override // com.king.zxing.manager.AmbientLightManager.OnLightSensorEventListener
            public /* synthetic */ void onSensorChanged(float f) {
                com.king.zxing.manager.AmbientLightManager.OnLightSensorEventListener.CC.$default$onSensorChanged(this, f);
            }

            @Override // com.king.zxing.manager.AmbientLightManager.OnLightSensorEventListener
            public final void onSensorChanged(boolean z, float f) {
                com.king.zxing.DefaultCameraScan.this.m91lambda$initData$2$comkingzxingDefaultCameraScan(z, f);
            }
        });
    }

    /* renamed from: lambda$initData$0$com-king-zxing-DefaultCameraScan, reason: not valid java name */
    public /* synthetic */ void m89lambda$initData$0$comkingzxingDefaultCameraScan(com.google.zxing.Result result) {
        if (result != null) {
            handleAnalyzeResult(result);
            return;
        }
        com.king.zxing.CameraScan.OnScanResultCallback onScanResultCallback = this.mOnScanResultCallback;
        if (onScanResultCallback != null) {
            onScanResultCallback.onScanResultFailure();
        }
    }

    /* renamed from: lambda$initData$1$com-king-zxing-DefaultCameraScan, reason: not valid java name */
    public /* synthetic */ boolean m90lambda$initData$1$comkingzxingDefaultCameraScan(android.view.ScaleGestureDetector scaleGestureDetector, android.view.View view, android.view.MotionEvent motionEvent) {
        handlePreviewViewClickTap(motionEvent);
        if (isNeedTouchZoom()) {
            return scaleGestureDetector.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: lambda$initData$2$com-king-zxing-DefaultCameraScan, reason: not valid java name */
    public /* synthetic */ void m91lambda$initData$2$comkingzxingDefaultCameraScan(boolean z, float f) {
        android.view.View view = this.flashlightView;
        if (view != null) {
            if (z) {
                if (view.getVisibility() != 0) {
                    this.flashlightView.setVisibility(0);
                    this.flashlightView.setSelected(isTorchEnabled());
                    return;
                }
                return;
            }
            if (view.getVisibility() != 0 || isTorchEnabled()) {
                return;
            }
            this.flashlightView.setVisibility(4);
            this.flashlightView.setSelected(false);
        }
    }

    private void handlePreviewViewClickTap(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.isClickTap = true;
                this.mDownX = motionEvent.getX();
                this.mDownY = motionEvent.getY();
                this.mLastHoveTapTime = java.lang.System.currentTimeMillis();
                return;
            }
            if (action != 1) {
                if (action != 2) {
                    return;
                }
                this.isClickTap = com.google.zxing.common.detector.MathUtils.distance(this.mDownX, this.mDownY, motionEvent.getX(), motionEvent.getY()) < 20.0f;
            } else {
                if (!this.isClickTap || this.mLastHoveTapTime + 150 <= java.lang.System.currentTimeMillis()) {
                    return;
                }
                startFocusAndMetering(motionEvent.getX(), motionEvent.getY());
            }
        }
    }

    private void startFocusAndMetering(float f, float f2) {
        if (this.mCamera != null) {
            com.king.zxing.util.LogUtils.d("startFocusAndMetering:" + f + "," + f2);
            this.mCamera.getCameraControl().startFocusAndMetering(new androidx.camera.core.FocusMeteringAction.Builder(this.mPreviewView.getMeteringPointFactory().createPoint(f, f2)).build());
        }
    }

    private void initConfig() {
        if (this.mCameraConfig == null) {
            this.mCameraConfig = new com.king.zxing.config.CameraConfig();
        }
        if (this.mAnalyzer == null) {
            this.mAnalyzer = new com.king.zxing.analyze.MultiFormatAnalyzer();
        }
    }

    @Override // com.king.zxing.CameraScan
    public com.king.zxing.CameraScan setCameraConfig(com.king.zxing.config.CameraConfig cameraConfig) {
        if (cameraConfig != null) {
            this.mCameraConfig = cameraConfig;
        }
        return this;
    }

    @Override // com.king.zxing.ICamera
    public void startCamera() {
        initConfig();
        com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.ProcessCameraProvider> processCameraProvider = androidx.camera.lifecycle.ProcessCameraProvider.getInstance(this.mContext);
        this.mCameraProviderFuture = processCameraProvider;
        processCameraProvider.addListener(new java.lang.Runnable() { // from class: com.king.zxing.DefaultCameraScan$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.king.zxing.DefaultCameraScan.this.m93lambda$startCamera$4$comkingzxingDefaultCameraScan();
            }
        }, androidx.core.content.ContextCompat.getMainExecutor(this.mContext));
    }

    /* renamed from: lambda$startCamera$4$com-king-zxing-DefaultCameraScan, reason: not valid java name */
    public /* synthetic */ void m93lambda$startCamera$4$comkingzxingDefaultCameraScan() {
        try {
            androidx.camera.core.UseCase options = this.mCameraConfig.options(new androidx.camera.core.Preview.Builder());
            androidx.camera.core.CameraSelector options2 = this.mCameraConfig.options(new androidx.camera.core.CameraSelector.Builder());
            options.setSurfaceProvider(this.mPreviewView.getSurfaceProvider());
            androidx.camera.core.UseCase options3 = this.mCameraConfig.options(new androidx.camera.core.ImageAnalysis.Builder().setBackpressureStrategy(0));
            options3.setAnalyzer(java.util.concurrent.Executors.newSingleThreadExecutor(), new androidx.camera.core.ImageAnalysis.Analyzer() { // from class: com.king.zxing.DefaultCameraScan$$ExternalSyntheticLambda1
                public final void analyze(androidx.camera.core.ImageProxy imageProxy) {
                    com.king.zxing.DefaultCameraScan.this.m92lambda$null$3$comkingzxingDefaultCameraScan(imageProxy);
                }
            });
            if (this.mCamera != null) {
                this.mCameraProviderFuture.get().unbindAll();
            }
            this.mCamera = this.mCameraProviderFuture.get().bindToLifecycle(this.mLifecycleOwner, options2, new androidx.camera.core.UseCase[]{options, options3});
        } catch (java.lang.Exception e) {
            com.king.zxing.util.LogUtils.e(e);
        }
    }

    /* renamed from: lambda$null$3$com-king-zxing-DefaultCameraScan, reason: not valid java name */
    public /* synthetic */ void m92lambda$null$3$comkingzxingDefaultCameraScan(androidx.camera.core.ImageProxy imageProxy) {
        com.king.zxing.analyze.Analyzer analyzer;
        if (this.isAnalyze && !this.isAnalyzeResult && (analyzer = this.mAnalyzer) != null) {
            this.mResultLiveData.postValue(analyzer.analyze(imageProxy, this.mOrientation));
        }
        imageProxy.close();
    }

    private synchronized void handleAnalyzeResult(com.google.zxing.Result result) {
        com.google.zxing.ResultPoint[] resultPoints;
        if (!this.isAnalyzeResult && this.isAnalyze) {
            this.isAnalyzeResult = true;
            com.king.zxing.manager.BeepManager beepManager = this.mBeepManager;
            if (beepManager != null) {
                beepManager.playBeepSoundAndVibrate();
            }
            if (result.getBarcodeFormat() == com.google.zxing.BarcodeFormat.QR_CODE && isNeedAutoZoom() && this.mLastAutoZoomTime + 100 < java.lang.System.currentTimeMillis() && (resultPoints = result.getResultPoints()) != null && resultPoints.length >= 2) {
                float distance = com.google.zxing.ResultPoint.distance(resultPoints[0], resultPoints[1]);
                if (resultPoints.length >= 3) {
                    distance = java.lang.Math.max(java.lang.Math.max(distance, com.google.zxing.ResultPoint.distance(resultPoints[1], resultPoints[2])), com.google.zxing.ResultPoint.distance(resultPoints[0], resultPoints[2]));
                }
                if (handleAutoZoom((int) distance, result)) {
                    return;
                }
            }
            scanResultCallback(result);
        }
    }

    private boolean handleAutoZoom(int i, com.google.zxing.Result result) {
        if (i * 4 >= java.lang.Math.min(this.mScreenWidth, this.mScreenHeight)) {
            return false;
        }
        this.mLastAutoZoomTime = java.lang.System.currentTimeMillis();
        zoomIn();
        scanResultCallback(result);
        return true;
    }

    private void scanResultCallback(com.google.zxing.Result result) {
        com.king.zxing.CameraScan.OnScanResultCallback onScanResultCallback = this.mOnScanResultCallback;
        if (onScanResultCallback != null && onScanResultCallback.onScanResultCallback(result)) {
            this.isAnalyzeResult = false;
        } else if (this.mFragmentActivity != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(SCAN_RESULT, result.getText());
            this.mFragmentActivity.setResult(-1, intent);
            this.mFragmentActivity.finish();
        }
    }

    @Override // com.king.zxing.ICamera
    public void stopCamera() {
        com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.ProcessCameraProvider> listenableFuture = this.mCameraProviderFuture;
        if (listenableFuture != null) {
            try {
                listenableFuture.get().unbindAll();
            } catch (java.lang.Exception e) {
                com.king.zxing.util.LogUtils.e(e);
            }
        }
    }

    @Override // com.king.zxing.CameraScan
    public com.king.zxing.CameraScan setAnalyzeImage(boolean z) {
        this.isAnalyze = z;
        return this;
    }

    @Override // com.king.zxing.CameraScan
    public com.king.zxing.CameraScan setAnalyzer(com.king.zxing.analyze.Analyzer analyzer) {
        this.mAnalyzer = analyzer;
        return this;
    }

    @Override // com.king.zxing.ICameraControl
    public void zoomIn() {
        androidx.camera.core.Camera camera = this.mCamera;
        if (camera != null) {
            float zoomRatio = ((androidx.camera.core.ZoomState) camera.getCameraInfo().getZoomState().getValue()).getZoomRatio() + 0.1f;
            if (zoomRatio <= ((androidx.camera.core.ZoomState) this.mCamera.getCameraInfo().getZoomState().getValue()).getMaxZoomRatio()) {
                this.mCamera.getCameraControl().setZoomRatio(zoomRatio);
            }
        }
    }

    @Override // com.king.zxing.ICameraControl
    public void zoomOut() {
        androidx.camera.core.Camera camera = this.mCamera;
        if (camera != null) {
            float zoomRatio = ((androidx.camera.core.ZoomState) camera.getCameraInfo().getZoomState().getValue()).getZoomRatio() - 0.1f;
            if (zoomRatio >= ((androidx.camera.core.ZoomState) this.mCamera.getCameraInfo().getZoomState().getValue()).getMinZoomRatio()) {
                this.mCamera.getCameraControl().setZoomRatio(zoomRatio);
            }
        }
    }

    @Override // com.king.zxing.ICameraControl
    public void zoomTo(float f) {
        androidx.camera.core.Camera camera = this.mCamera;
        if (camera != null) {
            androidx.camera.core.ZoomState zoomState = (androidx.camera.core.ZoomState) camera.getCameraInfo().getZoomState().getValue();
            float maxZoomRatio = zoomState.getMaxZoomRatio();
            this.mCamera.getCameraControl().setZoomRatio(java.lang.Math.max(java.lang.Math.min(f, maxZoomRatio), zoomState.getMinZoomRatio()));
        }
    }

    @Override // com.king.zxing.ICameraControl
    public void lineZoomIn() {
        androidx.camera.core.Camera camera = this.mCamera;
        if (camera != null) {
            float linearZoom = ((androidx.camera.core.ZoomState) camera.getCameraInfo().getZoomState().getValue()).getLinearZoom() + 0.1f;
            if (linearZoom <= 1.0f) {
                this.mCamera.getCameraControl().setLinearZoom(linearZoom);
            }
        }
    }

    @Override // com.king.zxing.ICameraControl
    public void lineZoomOut() {
        androidx.camera.core.Camera camera = this.mCamera;
        if (camera != null) {
            float linearZoom = ((androidx.camera.core.ZoomState) camera.getCameraInfo().getZoomState().getValue()).getLinearZoom() - 0.1f;
            if (linearZoom >= 0.0f) {
                this.mCamera.getCameraControl().setLinearZoom(linearZoom);
            }
        }
    }

    @Override // com.king.zxing.ICameraControl
    public void lineZoomTo(float f) {
        androidx.camera.core.Camera camera = this.mCamera;
        if (camera != null) {
            camera.getCameraControl().setLinearZoom(f);
        }
    }

    @Override // com.king.zxing.ICameraControl
    public void enableTorch(boolean z) {
        if (this.mCamera == null || !hasFlashUnit()) {
            return;
        }
        this.mCamera.getCameraControl().enableTorch(z);
    }

    @Override // com.king.zxing.ICameraControl
    public boolean isTorchEnabled() {
        androidx.camera.core.Camera camera = this.mCamera;
        return camera != null && ((java.lang.Integer) camera.getCameraInfo().getTorchState().getValue()).intValue() == 1;
    }

    @Override // com.king.zxing.ICameraControl
    public boolean hasFlashUnit() {
        androidx.camera.core.Camera camera = this.mCamera;
        if (camera != null) {
            return camera.getCameraInfo().hasFlashUnit();
        }
        return false;
    }

    @Override // com.king.zxing.CameraScan
    public com.king.zxing.CameraScan setVibrate(boolean z) {
        com.king.zxing.manager.BeepManager beepManager = this.mBeepManager;
        if (beepManager != null) {
            beepManager.setVibrate(z);
        }
        return this;
    }

    @Override // com.king.zxing.CameraScan
    public com.king.zxing.CameraScan setPlayBeep(boolean z) {
        com.king.zxing.manager.BeepManager beepManager = this.mBeepManager;
        if (beepManager != null) {
            beepManager.setPlayBeep(z);
        }
        return this;
    }

    @Override // com.king.zxing.CameraScan
    public com.king.zxing.CameraScan setOnScanResultCallback(com.king.zxing.CameraScan.OnScanResultCallback onScanResultCallback) {
        this.mOnScanResultCallback = onScanResultCallback;
        return this;
    }

    @Override // com.king.zxing.ICamera
    public androidx.camera.core.Camera getCamera() {
        return this.mCamera;
    }

    @Override // com.king.zxing.ICamera
    public void release() {
        this.isAnalyze = false;
        this.flashlightView = null;
        com.king.zxing.manager.AmbientLightManager ambientLightManager = this.mAmbientLightManager;
        if (ambientLightManager != null) {
            ambientLightManager.unregister();
        }
        com.king.zxing.manager.BeepManager beepManager = this.mBeepManager;
        if (beepManager != null) {
            beepManager.close();
        }
        stopCamera();
    }

    @Override // com.king.zxing.CameraScan
    public com.king.zxing.CameraScan bindFlashlightView(android.view.View view) {
        this.flashlightView = view;
        com.king.zxing.manager.AmbientLightManager ambientLightManager = this.mAmbientLightManager;
        if (ambientLightManager != null) {
            ambientLightManager.setLightSensorEnabled(view != null);
        }
        return this;
    }

    @Override // com.king.zxing.CameraScan
    public com.king.zxing.CameraScan setDarkLightLux(float f) {
        com.king.zxing.manager.AmbientLightManager ambientLightManager = this.mAmbientLightManager;
        if (ambientLightManager != null) {
            ambientLightManager.setDarkLightLux(f);
        }
        return this;
    }

    @Override // com.king.zxing.CameraScan
    public com.king.zxing.CameraScan setBrightLightLux(float f) {
        com.king.zxing.manager.AmbientLightManager ambientLightManager = this.mAmbientLightManager;
        if (ambientLightManager != null) {
            ambientLightManager.setBrightLightLux(f);
        }
        return this;
    }
}
