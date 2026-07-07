package androidx.activity.result.contract;

/* loaded from: classes.dex */
public final class ActivityResultContracts {
    private ActivityResultContracts() {
    }

    public static final class StartActivityForResult extends androidx.activity.result.contract.ActivityResultContract<android.content.Intent, androidx.activity.result.ActivityResult> {
        public static final java.lang.String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, android.content.Intent input) {
            return input;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.ActivityResult parseResult(int resultCode, android.content.Intent intent) {
            return new androidx.activity.result.ActivityResult(resultCode, intent);
        }
    }

    public static final class StartIntentSenderForResult extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> {
        public static final java.lang.String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        public static final java.lang.String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        public static final java.lang.String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, androidx.activity.result.IntentSenderRequest input) {
            return new android.content.Intent(ACTION_INTENT_SENDER_REQUEST).putExtra(EXTRA_INTENT_SENDER_REQUEST, input);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.ActivityResult parseResult(int resultCode, android.content.Intent intent) {
            return new androidx.activity.result.ActivityResult(resultCode, intent);
        }
    }

    public static final class RequestMultiplePermissions extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], java.util.Map<java.lang.String, java.lang.Boolean>> {
        public static final java.lang.String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        public static final java.lang.String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
        public static final java.lang.String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.String[] input) {
            return createIntent(input);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.Map<java.lang.String, java.lang.Boolean>> getSynchronousResult(android.content.Context context, java.lang.String[] input) {
            if (input == null || input.length == 0) {
                return new androidx.activity.result.contract.ActivityResultContract.SynchronousResult<>(java.util.Collections.emptyMap());
            }
            androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
            boolean z = true;
            for (java.lang.String str : input) {
                boolean z2 = androidx.core.content.ContextCompat.checkSelfPermission(context, str) == 0;
                arrayMap.put(str, java.lang.Boolean.valueOf(z2));
                if (!z2) {
                    z = false;
                }
            }
            if (z) {
                return new androidx.activity.result.contract.ActivityResultContract.SynchronousResult<>(arrayMap);
            }
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public java.util.Map<java.lang.String, java.lang.Boolean> parseResult(int resultCode, android.content.Intent intent) {
            if (resultCode != -1) {
                return java.util.Collections.emptyMap();
            }
            if (intent == null) {
                return java.util.Collections.emptyMap();
            }
            java.lang.String[] stringArrayExtra = intent.getStringArrayExtra(EXTRA_PERMISSIONS);
            int[] intArrayExtra = intent.getIntArrayExtra(EXTRA_PERMISSION_GRANT_RESULTS);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return java.util.Collections.emptyMap();
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            int length = stringArrayExtra.length;
            for (int i = 0; i < length; i++) {
                hashMap.put(stringArrayExtra[i], java.lang.Boolean.valueOf(intArrayExtra[i] == 0));
            }
            return hashMap;
        }

        static android.content.Intent createIntent(java.lang.String[] input) {
            return new android.content.Intent(ACTION_REQUEST_PERMISSIONS).putExtra(EXTRA_PERMISSIONS, input);
        }
    }

    public static final class RequestPermission extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, java.lang.Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.String input) {
            return androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.createIntent(new java.lang.String[]{input});
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public java.lang.Boolean parseResult(int resultCode, android.content.Intent intent) {
            int[] intArrayExtra;
            if (intent == null || resultCode != -1 || (intArrayExtra = intent.getIntArrayExtra(androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS)) == null || intArrayExtra.length == 0) {
                return false;
            }
            return java.lang.Boolean.valueOf(intArrayExtra[0] == 0);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context context, java.lang.String input) {
            if (input == null) {
                return new androidx.activity.result.contract.ActivityResultContract.SynchronousResult<>(false);
            }
            if (androidx.core.content.ContextCompat.checkSelfPermission(context, input) == 0) {
                return new androidx.activity.result.contract.ActivityResultContract.SynchronousResult<>(true);
            }
            return null;
        }
    }

    public static class TakePicturePreview extends androidx.activity.result.contract.ActivityResultContract<java.lang.Void, android.graphics.Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult(android.content.Context context, java.lang.Void input) {
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.Void input) {
            return new android.content.Intent("android.media.action.IMAGE_CAPTURE");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.graphics.Bitmap parseResult(int resultCode, android.content.Intent intent) {
            if (intent == null || resultCode != -1) {
                return null;
            }
            return (android.graphics.Bitmap) intent.getParcelableExtra(com.autonavi.base.amap.mapcore.AeUtil.ROOT_DATA_PATH_OLD_NAME);
        }
    }

    public static class TakePicture extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, java.lang.Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context context, android.net.Uri input) {
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, android.net.Uri input) {
            return new android.content.Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final java.lang.Boolean parseResult(int resultCode, android.content.Intent intent) {
            return java.lang.Boolean.valueOf(resultCode == -1);
        }
    }

    @java.lang.Deprecated
    public static class TakeVideo extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, android.graphics.Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult(android.content.Context context, android.net.Uri input) {
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, android.net.Uri input) {
            return new android.content.Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.graphics.Bitmap parseResult(int resultCode, android.content.Intent intent) {
            if (intent == null || resultCode != -1) {
                return null;
            }
            return (android.graphics.Bitmap) intent.getParcelableExtra(com.autonavi.base.amap.mapcore.AeUtil.ROOT_DATA_PATH_OLD_NAME);
        }
    }

    public static class CaptureVideo extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, java.lang.Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context context, android.net.Uri input) {
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, android.net.Uri input) {
            return new android.content.Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final java.lang.Boolean parseResult(int resultCode, android.content.Intent intent) {
            return java.lang.Boolean.valueOf(resultCode == -1);
        }
    }

    public static final class PickContact extends androidx.activity.result.contract.ActivityResultContract<java.lang.Void, android.net.Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.Void input) {
            return new android.content.Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.net.Uri parseResult(int resultCode, android.content.Intent intent) {
            if (intent == null || resultCode != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    public static class GetContent extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, android.net.Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context context, java.lang.String input) {
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.String input) {
            return new android.content.Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int resultCode, android.content.Intent intent) {
            if (intent == null || resultCode != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    public static class GetMultipleContents extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, java.util.List<android.net.Uri>> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context context, java.lang.String input) {
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.String input) {
            return new android.content.Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final java.util.List<android.net.Uri> parseResult(int resultCode, android.content.Intent intent) {
            if (intent == null || resultCode != -1) {
                return java.util.Collections.emptyList();
            }
            return getClipDataUris(intent);
        }

        static java.util.List<android.net.Uri> getClipDataUris(android.content.Intent intent) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            if (intent.getData() != null) {
                linkedHashSet.add(intent.getData());
            }
            android.content.ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                return java.util.Collections.emptyList();
            }
            if (clipData != null) {
                for (int i = 0; i < clipData.getItemCount(); i++) {
                    android.net.Uri uri = clipData.getItemAt(i).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            return new java.util.ArrayList(linkedHashSet);
        }
    }

    public static class OpenDocument extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], android.net.Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context context, java.lang.String[] input) {
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.String[] input) {
            return new android.content.Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int resultCode, android.content.Intent intent) {
            if (intent == null || resultCode != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    public static class OpenMultipleDocuments extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], java.util.List<android.net.Uri>> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context context, java.lang.String[] input) {
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.String[] input) {
            return new android.content.Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final java.util.List<android.net.Uri> parseResult(int resultCode, android.content.Intent intent) {
            if (resultCode != -1 || intent == null) {
                return java.util.Collections.emptyList();
            }
            return androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.getClipDataUris(intent);
        }
    }

    public static class OpenDocumentTree extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, android.net.Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context context, android.net.Uri input) {
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, android.net.Uri input) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (android.os.Build.VERSION.SDK_INT >= 26 && input != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", input);
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int resultCode, android.content.Intent intent) {
            if (intent == null || resultCode != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    public static class CreateDocument extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, android.net.Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context context, java.lang.String input) {
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.String input) {
            return new android.content.Intent("android.intent.action.CREATE_DOCUMENT").setType("*/*").putExtra("android.intent.extra.TITLE", input);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int resultCode, android.content.Intent intent) {
            if (intent == null || resultCode != -1) {
                return null;
            }
            return intent.getData();
        }
    }
}
