package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public final class PictureSelector {
    private final java.lang.ref.SoftReference<android.app.Activity> mActivity;
    private final java.lang.ref.SoftReference<androidx.fragment.app.Fragment> mFragment;

    private PictureSelector(android.app.Activity activity) {
        this(activity, null);
    }

    private PictureSelector(androidx.fragment.app.Fragment fragment) {
        this(fragment.getActivity(), fragment);
    }

    private PictureSelector(android.app.Activity activity, androidx.fragment.app.Fragment fragment) {
        this.mActivity = new java.lang.ref.SoftReference<>(activity);
        this.mFragment = new java.lang.ref.SoftReference<>(fragment);
    }

    public static com.luck.picture.lib.basic.PictureSelector create(android.content.Context context) {
        return new com.luck.picture.lib.basic.PictureSelector((android.app.Activity) context);
    }

    public static com.luck.picture.lib.basic.PictureSelector create(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        return new com.luck.picture.lib.basic.PictureSelector((android.app.Activity) appCompatActivity);
    }

    public static com.luck.picture.lib.basic.PictureSelector create(androidx.fragment.app.FragmentActivity fragmentActivity) {
        return new com.luck.picture.lib.basic.PictureSelector((android.app.Activity) fragmentActivity);
    }

    public static com.luck.picture.lib.basic.PictureSelector create(androidx.fragment.app.Fragment fragment) {
        return new com.luck.picture.lib.basic.PictureSelector(fragment);
    }

    public com.luck.picture.lib.basic.PictureSelectionModel openGallery(int i) {
        return new com.luck.picture.lib.basic.PictureSelectionModel(this, i);
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel openCamera(int i) {
        return new com.luck.picture.lib.basic.PictureSelectionCameraModel(this, i);
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel openSystemGallery(int i) {
        return new com.luck.picture.lib.basic.PictureSelectionSystemModel(this, i);
    }

    public com.luck.picture.lib.basic.PictureSelectionQueryModel dataSource(int i) {
        return new com.luck.picture.lib.basic.PictureSelectionQueryModel(this, i);
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel openPreview() {
        return new com.luck.picture.lib.basic.PictureSelectionPreviewModel(this);
    }

    public static android.content.Intent putIntentResult(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        return new android.content.Intent().putParcelableArrayListExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_RESULT_SELECTION, arrayList);
    }

    public static java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> obtainSelectorList(android.content.Intent intent) {
        if (intent == null) {
            return new java.util.ArrayList<>();
        }
        java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> parcelableArrayListExtra = intent.getParcelableArrayListExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_RESULT_SELECTION);
        return parcelableArrayListExtra != null ? parcelableArrayListExtra : new java.util.ArrayList<>();
    }

    android.app.Activity getActivity() {
        return this.mActivity.get();
    }

    androidx.fragment.app.Fragment getFragment() {
        java.lang.ref.SoftReference<androidx.fragment.app.Fragment> softReference = this.mFragment;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }
}
