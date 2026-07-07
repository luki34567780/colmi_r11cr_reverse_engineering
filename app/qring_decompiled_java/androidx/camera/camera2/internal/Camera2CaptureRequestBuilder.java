package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
class Camera2CaptureRequestBuilder {
    private static final java.lang.String TAG = "CaptureRequestBuilder";

    private Camera2CaptureRequestBuilder() {
    }

    private static java.util.List<android.view.Surface> getConfiguredSurfaces(java.util.List<androidx.camera.core.impl.DeferrableSurface> deferrableSurfaces, java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> configuredSurfaceMap) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = deferrableSurfaces.iterator();
        while (it.hasNext()) {
            android.view.Surface surface = configuredSurfaceMap.get(it.next());
            if (surface == null) {
                throw new java.lang.IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }

    private static void applyImplementationOptionToCaptureBuilder(android.hardware.camera2.CaptureRequest.Builder builder, androidx.camera.core.impl.Config config) {
        androidx.camera.camera2.interop.CaptureRequestOptions build = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(config).build();
        for (androidx.camera.core.impl.Config.Option option : build.listOptions()) {
            android.hardware.camera2.CaptureRequest.Key key = (android.hardware.camera2.CaptureRequest.Key) option.getToken();
            try {
                builder.set(key, build.retrieveOption(option));
            } catch (java.lang.IllegalArgumentException unused) {
                androidx.camera.core.Logger.e(TAG, "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static android.hardware.camera2.CaptureRequest build(androidx.camera.core.impl.CaptureConfig captureConfig, android.hardware.camera2.CameraDevice device, java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> configuredSurfaceMap) throws android.hardware.camera2.CameraAccessException {
        if (device == null) {
            return null;
        }
        java.util.List<android.view.Surface> configuredSurfaces = getConfiguredSurfaces(captureConfig.getSurfaces(), configuredSurfaceMap);
        if (configuredSurfaces.isEmpty()) {
            return null;
        }
        android.hardware.camera2.CaptureRequest.Builder createCaptureRequest = device.createCaptureRequest(captureConfig.getTemplateType());
        applyImplementationOptionToCaptureBuilder(createCaptureRequest, captureConfig.getImplementationOptions());
        if (captureConfig.getImplementationOptions().containsOption(androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION)) {
            createCaptureRequest.set(android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION, (java.lang.Integer) captureConfig.getImplementationOptions().retrieveOption(androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION));
        }
        if (captureConfig.getImplementationOptions().containsOption(androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY)) {
            createCaptureRequest.set(android.hardware.camera2.CaptureRequest.JPEG_QUALITY, java.lang.Byte.valueOf(((java.lang.Integer) captureConfig.getImplementationOptions().retrieveOption(androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY)).byteValue()));
        }
        java.util.Iterator<android.view.Surface> it = configuredSurfaces.iterator();
        while (it.hasNext()) {
            createCaptureRequest.addTarget(it.next());
        }
        createCaptureRequest.setTag(captureConfig.getTagBundle());
        return createCaptureRequest.build();
    }

    public static android.hardware.camera2.CaptureRequest buildWithoutTarget(androidx.camera.core.impl.CaptureConfig captureConfig, android.hardware.camera2.CameraDevice device) throws android.hardware.camera2.CameraAccessException {
        if (device == null) {
            return null;
        }
        android.hardware.camera2.CaptureRequest.Builder createCaptureRequest = device.createCaptureRequest(captureConfig.getTemplateType());
        applyImplementationOptionToCaptureBuilder(createCaptureRequest, captureConfig.getImplementationOptions());
        return createCaptureRequest.build();
    }
}
