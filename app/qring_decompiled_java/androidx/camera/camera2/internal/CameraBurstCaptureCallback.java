package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
class CameraBurstCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
    androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback mCaptureSequenceCallback = null;
    final java.util.Map<android.hardware.camera2.CaptureRequest, java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback>> mCallbackMap = new java.util.HashMap();

    interface CaptureSequenceCallback {
        void onCaptureSequenceCompletedOrAborted(android.hardware.camera2.CameraCaptureSession session, int sequenceId, boolean isAborted);
    }

    CameraBurstCaptureCallback() {
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.view.Surface surface, long frame) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = getCallbacks(request).iterator();
        while (it.hasNext()) {
            it.next().onCaptureBufferLost(session, request, surface, frame);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = getCallbacks(request).iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(session, request, result);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureFailure failure) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = getCallbacks(request).iterator();
        while (it.hasNext()) {
            it.next().onCaptureFailed(session, request, failure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureResult partialResult) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = getCallbacks(request).iterator();
        while (it.hasNext()) {
            it.next().onCaptureProgressed(session, request, partialResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, long timestamp, long frameNumber) {
        java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = getCallbacks(request).iterator();
        while (it.hasNext()) {
            it.next().onCaptureStarted(session, request, timestamp, frameNumber);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession session, int sequenceId) {
        androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback captureSequenceCallback = this.mCaptureSequenceCallback;
        if (captureSequenceCallback != null) {
            captureSequenceCallback.onCaptureSequenceCompletedOrAborted(session, sequenceId, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession session, int sequenceId, long frameNumber) {
        androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback captureSequenceCallback = this.mCaptureSequenceCallback;
        if (captureSequenceCallback != null) {
            captureSequenceCallback.onCaptureSequenceCompletedOrAborted(session, sequenceId, false);
        }
    }

    private java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> getCallbacks(android.hardware.camera2.CaptureRequest request) {
        java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> list = this.mCallbackMap.get(request);
        return list != null ? list : java.util.Collections.emptyList();
    }

    void addCamera2Callbacks(android.hardware.camera2.CaptureRequest captureRequest, java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> captureCallbacks) {
        java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> list = this.mCallbackMap.get(captureRequest);
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(captureCallbacks.size() + list.size());
            arrayList.addAll(captureCallbacks);
            arrayList.addAll(list);
            this.mCallbackMap.put(captureRequest, arrayList);
            return;
        }
        this.mCallbackMap.put(captureRequest, captureCallbacks);
    }

    public void setCaptureSequenceCallback(androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback callback) {
        this.mCaptureSequenceCallback = callback;
    }
}
