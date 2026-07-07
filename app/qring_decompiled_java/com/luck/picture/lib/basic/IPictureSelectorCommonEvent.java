package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public interface IPictureSelectorCommonEvent {
    boolean checkAddBitmapWatermark();

    boolean checkCompressValidity();

    boolean checkCropValidity();

    @java.lang.Deprecated
    boolean checkOldCompressValidity();

    @java.lang.Deprecated
    boolean checkOldCropValidity();

    @java.lang.Deprecated
    boolean checkOldTransformSandboxFile();

    boolean checkOnlyMimeTypeValidity(com.luck.picture.lib.entity.LocalMedia localMedia, boolean z, java.lang.String str, java.lang.String str2, long j, long j2);

    boolean checkTransformSandboxFile();

    boolean checkVideoThumbnail();

    boolean checkWithMimeTypeValidity(com.luck.picture.lib.entity.LocalMedia localMedia, boolean z, java.lang.String str, int i, long j, long j2);

    int confirmSelect(com.luck.picture.lib.entity.LocalMedia localMedia, boolean z);

    void dismissLoading();

    void dispatchCameraMediaResult(com.luck.picture.lib.entity.LocalMedia localMedia);

    int getResourceId();

    void handlePermissionDenied(java.lang.String[] strArr);

    void handlePermissionSettingResult(java.lang.String[] strArr);

    void initAppLanguage();

    void onApplyPermissionsEvent(int i, java.lang.String[] strArr);

    void onCheckOriginalChange();

    void onCompress(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList);

    void onCreateLoader();

    void onCrop(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList);

    void onEditMedia(android.content.Intent intent);

    void onEnterFragment();

    void onExitFragment();

    void onFixedSelectedChange(com.luck.picture.lib.entity.LocalMedia localMedia);

    void onFragmentResume();

    void onInterceptCameraEvent(int i);

    void onKeyBackFragmentFinish();

    @java.lang.Deprecated
    void onOldCompress(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList);

    void onOldCrop(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList);

    void onPermissionExplainEvent(boolean z, java.lang.String[] strArr);

    void onRecreateEngine();

    void onResultEvent(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList);

    void onSelectedChange(boolean z, com.luck.picture.lib.entity.LocalMedia localMedia);

    void onSelectedOnlyCamera();

    void openImageCamera();

    void openSelectedCamera();

    void openSoundRecording();

    void openVideoCamera();

    void reStartSavedInstance(android.os.Bundle bundle);

    void sendChangeSubSelectPositionEvent(boolean z);

    void sendFixedSelectedChangeEvent(com.luck.picture.lib.entity.LocalMedia localMedia);

    void sendSelectedChangeEvent(boolean z, com.luck.picture.lib.entity.LocalMedia localMedia);

    void sendSelectedOriginalChangeEvent();

    void showLoading();
}
