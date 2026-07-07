package com.luck.picture.lib;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureSelectorSystemFragment extends com.luck.picture.lib.basic.PictureCommonFragment {
    public static final java.lang.String TAG = "PictureSelectorSystemFragment";
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> mContentLauncher;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> mContentsLauncher;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> mDocMultipleLauncher;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> mDocSingleLauncher;

    public static com.luck.picture.lib.PictureSelectorSystemFragment newInstance() {
        return new com.luck.picture.lib.PictureSelectorSystemFragment();
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
        createSystemContracts();
        if (com.luck.picture.lib.permissions.PermissionChecker.isCheckReadStorage(this.selectorConfig.chooseMode, getContext())) {
            openSystemAlbum();
            return;
        }
        final java.lang.String[] readPermissionArray = com.luck.picture.lib.permissions.PermissionConfig.getReadPermissionArray(getAppContext(), this.selectorConfig.chooseMode);
        onPermissionExplainEvent(true, readPermissionArray);
        if (this.selectorConfig.onPermissionsEventListener != null) {
            onApplyPermissionsEvent(-2, readPermissionArray);
        } else {
            com.luck.picture.lib.permissions.PermissionChecker.getInstance().requestPermissions(this, readPermissionArray, new com.luck.picture.lib.permissions.PermissionResultCallback() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.1
                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onGranted() {
                    com.luck.picture.lib.PictureSelectorSystemFragment.this.openSystemAlbum();
                }

                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onDenied() {
                    com.luck.picture.lib.PictureSelectorSystemFragment.this.handlePermissionDenied(readPermissionArray);
                }
            });
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onApplyPermissionsEvent(int i, java.lang.String[] strArr) {
        if (i == -2) {
            this.selectorConfig.onPermissionsEventListener.requestPermission(this, com.luck.picture.lib.permissions.PermissionConfig.getReadPermissionArray(getAppContext(), this.selectorConfig.chooseMode), new com.luck.picture.lib.interfaces.OnRequestPermissionListener() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.2
                @Override // com.luck.picture.lib.interfaces.OnRequestPermissionListener
                public void onCall(java.lang.String[] strArr2, boolean z) {
                    if (z) {
                        com.luck.picture.lib.PictureSelectorSystemFragment.this.openSystemAlbum();
                    } else {
                        com.luck.picture.lib.PictureSelectorSystemFragment.this.handlePermissionDenied(strArr2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openSystemAlbum() {
        onPermissionExplainEvent(false, null);
        if (this.selectorConfig.selectionMode == 1) {
            if (this.selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAll()) {
                this.mDocSingleLauncher.launch(com.luck.picture.lib.config.SelectMimeType.SYSTEM_ALL);
                return;
            } else {
                this.mContentLauncher.launch(getInput());
                return;
            }
        }
        if (this.selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAll()) {
            this.mDocMultipleLauncher.launch(com.luck.picture.lib.config.SelectMimeType.SYSTEM_ALL);
        } else {
            this.mContentsLauncher.launch(getInput());
        }
    }

    private void createSystemContracts() {
        if (this.selectorConfig.selectionMode == 1) {
            if (this.selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAll()) {
                createSingleDocuments();
                return;
            } else {
                createContent();
                return;
            }
        }
        if (this.selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAll()) {
            createMultipleDocuments();
        } else {
            createMultipleContents();
        }
    }

    private void createMultipleDocuments() {
        this.mDocMultipleLauncher = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContract<java.lang.String, java.util.List<android.net.Uri>>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.3
            public java.util.List<android.net.Uri> parseResult(int i, android.content.Intent intent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (intent == null) {
                    return arrayList;
                }
                if (intent.getClipData() != null) {
                    android.content.ClipData clipData = intent.getClipData();
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        arrayList.add(clipData.getItemAt(i2).getUri());
                    }
                } else if (intent.getData() != null) {
                    arrayList.add(intent.getData());
                }
                return arrayList;
            }

            public android.content.Intent createIntent(android.content.Context context, java.lang.String str) {
                android.content.Intent intent = new android.content.Intent("android.intent.action.PICK");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType(str);
                return intent;
            }
        }, new androidx.activity.result.ActivityResultCallback<java.util.List<android.net.Uri>>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.4
            public void onActivityResult(java.util.List<android.net.Uri> list) {
                if (list == null || list.size() == 0) {
                    com.luck.picture.lib.PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                    return;
                }
                for (int i = 0; i < list.size(); i++) {
                    com.luck.picture.lib.entity.LocalMedia buildLocalMedia = com.luck.picture.lib.PictureSelectorSystemFragment.this.buildLocalMedia(list.get(i).toString());
                    buildLocalMedia.setPath(com.luck.picture.lib.utils.SdkVersionUtils.isQ() ? buildLocalMedia.getPath() : buildLocalMedia.getRealPath());
                    com.luck.picture.lib.PictureSelectorSystemFragment.this.selectorConfig.addSelectResult(buildLocalMedia);
                }
                com.luck.picture.lib.PictureSelectorSystemFragment.this.dispatchTransformResult();
            }
        });
    }

    private void createSingleDocuments() {
        this.mDocSingleLauncher = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContract<java.lang.String, android.net.Uri>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.5
            /* renamed from: parseResult, reason: merged with bridge method [inline-methods] */
            public android.net.Uri m99parseResult(int i, android.content.Intent intent) {
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            }

            public android.content.Intent createIntent(android.content.Context context, java.lang.String str) {
                android.content.Intent intent = new android.content.Intent("android.intent.action.PICK");
                intent.setType(str);
                return intent;
            }
        }, new androidx.activity.result.ActivityResultCallback<android.net.Uri>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.6
            public void onActivityResult(android.net.Uri uri) {
                if (uri != null) {
                    com.luck.picture.lib.entity.LocalMedia buildLocalMedia = com.luck.picture.lib.PictureSelectorSystemFragment.this.buildLocalMedia(uri.toString());
                    buildLocalMedia.setPath(com.luck.picture.lib.utils.SdkVersionUtils.isQ() ? buildLocalMedia.getPath() : buildLocalMedia.getRealPath());
                    if (com.luck.picture.lib.PictureSelectorSystemFragment.this.confirmSelect(buildLocalMedia, false) == 0) {
                        com.luck.picture.lib.PictureSelectorSystemFragment.this.dispatchTransformResult();
                        return;
                    } else {
                        com.luck.picture.lib.PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                        return;
                    }
                }
                com.luck.picture.lib.PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
            }
        });
    }

    private void createMultipleContents() {
        this.mContentsLauncher = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContract<java.lang.String, java.util.List<android.net.Uri>>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.7
            public java.util.List<android.net.Uri> parseResult(int i, android.content.Intent intent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (intent == null) {
                    return arrayList;
                }
                if (intent.getClipData() != null) {
                    android.content.ClipData clipData = intent.getClipData();
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        arrayList.add(clipData.getItemAt(i2).getUri());
                    }
                } else if (intent.getData() != null) {
                    arrayList.add(intent.getData());
                }
                return arrayList;
            }

            public android.content.Intent createIntent(android.content.Context context, java.lang.String str) {
                android.content.Intent intent;
                if (android.text.TextUtils.equals(com.luck.picture.lib.config.SelectMimeType.SYSTEM_VIDEO, str)) {
                    intent = new android.content.Intent("android.intent.action.PICK", android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                } else if (android.text.TextUtils.equals(com.luck.picture.lib.config.SelectMimeType.SYSTEM_AUDIO, str)) {
                    intent = new android.content.Intent("android.intent.action.PICK", android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
                } else {
                    intent = new android.content.Intent("android.intent.action.PICK", android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                }
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                return intent;
            }
        }, new androidx.activity.result.ActivityResultCallback<java.util.List<android.net.Uri>>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.8
            public void onActivityResult(java.util.List<android.net.Uri> list) {
                if (list == null || list.size() == 0) {
                    com.luck.picture.lib.PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                    return;
                }
                for (int i = 0; i < list.size(); i++) {
                    com.luck.picture.lib.entity.LocalMedia buildLocalMedia = com.luck.picture.lib.PictureSelectorSystemFragment.this.buildLocalMedia(list.get(i).toString());
                    buildLocalMedia.setPath(com.luck.picture.lib.utils.SdkVersionUtils.isQ() ? buildLocalMedia.getPath() : buildLocalMedia.getRealPath());
                    com.luck.picture.lib.PictureSelectorSystemFragment.this.selectorConfig.addSelectResult(buildLocalMedia);
                }
                com.luck.picture.lib.PictureSelectorSystemFragment.this.dispatchTransformResult();
            }
        });
    }

    private void createContent() {
        this.mContentLauncher = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContract<java.lang.String, android.net.Uri>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.9
            /* renamed from: parseResult, reason: merged with bridge method [inline-methods] */
            public android.net.Uri m101parseResult(int i, android.content.Intent intent) {
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            }

            public android.content.Intent createIntent(android.content.Context context, java.lang.String str) {
                if (android.text.TextUtils.equals(com.luck.picture.lib.config.SelectMimeType.SYSTEM_VIDEO, str)) {
                    return new android.content.Intent("android.intent.action.PICK", android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                }
                if (android.text.TextUtils.equals(com.luck.picture.lib.config.SelectMimeType.SYSTEM_AUDIO, str)) {
                    return new android.content.Intent("android.intent.action.PICK", android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
                }
                return new android.content.Intent("android.intent.action.PICK", android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            }
        }, new androidx.activity.result.ActivityResultCallback<android.net.Uri>() { // from class: com.luck.picture.lib.PictureSelectorSystemFragment.10
            public void onActivityResult(android.net.Uri uri) {
                if (uri != null) {
                    com.luck.picture.lib.entity.LocalMedia buildLocalMedia = com.luck.picture.lib.PictureSelectorSystemFragment.this.buildLocalMedia(uri.toString());
                    buildLocalMedia.setPath(com.luck.picture.lib.utils.SdkVersionUtils.isQ() ? buildLocalMedia.getPath() : buildLocalMedia.getRealPath());
                    if (com.luck.picture.lib.PictureSelectorSystemFragment.this.confirmSelect(buildLocalMedia, false) == 0) {
                        com.luck.picture.lib.PictureSelectorSystemFragment.this.dispatchTransformResult();
                        return;
                    } else {
                        com.luck.picture.lib.PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
                        return;
                    }
                }
                com.luck.picture.lib.PictureSelectorSystemFragment.this.onKeyBackFragmentFinish();
            }
        });
    }

    private java.lang.String getInput() {
        return this.selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofVideo() ? com.luck.picture.lib.config.SelectMimeType.SYSTEM_VIDEO : this.selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAudio() ? com.luck.picture.lib.config.SelectMimeType.SYSTEM_AUDIO : com.luck.picture.lib.config.SelectMimeType.SYSTEM_IMAGE;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void handlePermissionSettingResult(java.lang.String[] strArr) {
        boolean isCheckReadStorage;
        onPermissionExplainEvent(false, null);
        if (this.selectorConfig.onPermissionsEventListener != null) {
            isCheckReadStorage = this.selectorConfig.onPermissionsEventListener.hasPermissions(this, strArr);
        } else {
            isCheckReadStorage = com.luck.picture.lib.permissions.PermissionChecker.isCheckReadStorage(this.selectorConfig.chooseMode, getContext());
        }
        if (isCheckReadStorage) {
            openSystemAlbum();
        } else {
            com.luck.picture.lib.utils.ToastUtils.showToast(getContext(), getString(com.luck.picture.lib.R.string.ps_jurisdiction));
            onKeyBackFragmentFinish();
        }
        com.luck.picture.lib.permissions.PermissionConfig.CURRENT_REQUEST_PERMISSION = new java.lang.String[0];
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            onKeyBackFragmentFinish();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void onDestroy() {
        super.onDestroy();
        androidx.activity.result.ActivityResultLauncher<java.lang.String> activityResultLauncher = this.mDocMultipleLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        androidx.activity.result.ActivityResultLauncher<java.lang.String> activityResultLauncher2 = this.mDocSingleLauncher;
        if (activityResultLauncher2 != null) {
            activityResultLauncher2.unregister();
        }
        androidx.activity.result.ActivityResultLauncher<java.lang.String> activityResultLauncher3 = this.mContentsLauncher;
        if (activityResultLauncher3 != null) {
            activityResultLauncher3.unregister();
        }
        androidx.activity.result.ActivityResultLauncher<java.lang.String> activityResultLauncher4 = this.mContentLauncher;
        if (activityResultLauncher4 != null) {
            activityResultLauncher4.unregister();
        }
    }
}
