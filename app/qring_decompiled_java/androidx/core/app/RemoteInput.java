package androidx.core.app;

/* loaded from: classes.dex */
public final class RemoteInput {
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    private static final java.lang.String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
    public static final java.lang.String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    private static final java.lang.String EXTRA_RESULTS_SOURCE = "android.remoteinput.resultsSource";
    public static final java.lang.String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final int SOURCE_CHOICE = 1;
    public static final int SOURCE_FREE_FORM_INPUT = 0;
    private static final java.lang.String TAG = "RemoteInput";
    private final boolean mAllowFreeFormTextInput;
    private final java.util.Set<java.lang.String> mAllowedDataTypes;
    private final java.lang.CharSequence[] mChoices;
    private final int mEditChoicesBeforeSending;
    private final android.os.Bundle mExtras;
    private final java.lang.CharSequence mLabel;
    private final java.lang.String mResultKey;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EditChoicesBeforeSending {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Source {
    }

    RemoteInput(java.lang.String str, java.lang.CharSequence charSequence, java.lang.CharSequence[] charSequenceArr, boolean z, int i, android.os.Bundle bundle, java.util.Set<java.lang.String> set) {
        this.mResultKey = str;
        this.mLabel = charSequence;
        this.mChoices = charSequenceArr;
        this.mAllowFreeFormTextInput = z;
        this.mEditChoicesBeforeSending = i;
        this.mExtras = bundle;
        this.mAllowedDataTypes = set;
        if (getEditChoicesBeforeSending() == 2 && !getAllowFreeFormInput()) {
            throw new java.lang.IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public java.lang.String getResultKey() {
        return this.mResultKey;
    }

    public java.lang.CharSequence getLabel() {
        return this.mLabel;
    }

    public java.lang.CharSequence[] getChoices() {
        return this.mChoices;
    }

    public java.util.Set<java.lang.String> getAllowedDataTypes() {
        return this.mAllowedDataTypes;
    }

    public boolean isDataOnly() {
        return (getAllowFreeFormInput() || (getChoices() != null && getChoices().length != 0) || getAllowedDataTypes() == null || getAllowedDataTypes().isEmpty()) ? false : true;
    }

    public boolean getAllowFreeFormInput() {
        return this.mAllowFreeFormTextInput;
    }

    public int getEditChoicesBeforeSending() {
        return this.mEditChoicesBeforeSending;
    }

    public android.os.Bundle getExtras() {
        return this.mExtras;
    }

    public static final class Builder {
        private java.lang.CharSequence[] mChoices;
        private java.lang.CharSequence mLabel;
        private final java.lang.String mResultKey;
        private final java.util.Set<java.lang.String> mAllowedDataTypes = new java.util.HashSet();
        private final android.os.Bundle mExtras = new android.os.Bundle();
        private boolean mAllowFreeFormTextInput = true;
        private int mEditChoicesBeforeSending = 0;

        public Builder(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalArgumentException("Result key can't be null");
            }
            this.mResultKey = str;
        }

        public androidx.core.app.RemoteInput.Builder setLabel(java.lang.CharSequence charSequence) {
            this.mLabel = charSequence;
            return this;
        }

        public androidx.core.app.RemoteInput.Builder setChoices(java.lang.CharSequence[] charSequenceArr) {
            this.mChoices = charSequenceArr;
            return this;
        }

        public androidx.core.app.RemoteInput.Builder setAllowDataType(java.lang.String str, boolean z) {
            if (z) {
                this.mAllowedDataTypes.add(str);
            } else {
                this.mAllowedDataTypes.remove(str);
            }
            return this;
        }

        public androidx.core.app.RemoteInput.Builder setAllowFreeFormInput(boolean z) {
            this.mAllowFreeFormTextInput = z;
            return this;
        }

        public androidx.core.app.RemoteInput.Builder setEditChoicesBeforeSending(int i) {
            this.mEditChoicesBeforeSending = i;
            return this;
        }

        public androidx.core.app.RemoteInput.Builder addExtras(android.os.Bundle bundle) {
            if (bundle != null) {
                this.mExtras.putAll(bundle);
            }
            return this;
        }

        public android.os.Bundle getExtras() {
            return this.mExtras;
        }

        public androidx.core.app.RemoteInput build() {
            return new androidx.core.app.RemoteInput(this.mResultKey, this.mLabel, this.mChoices, this.mAllowFreeFormTextInput, this.mEditChoicesBeforeSending, this.mExtras, this.mAllowedDataTypes);
        }
    }

    public static java.util.Map<java.lang.String, android.net.Uri> getDataResultsFromIntent(android.content.Intent intent, java.lang.String str) {
        android.content.Intent clipDataIntentFromIntent;
        java.lang.String string;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return android.app.RemoteInput.getDataResultsFromIntent(intent, str);
        }
        if (android.os.Build.VERSION.SDK_INT < 16 || (clipDataIntentFromIntent = getClipDataIntentFromIntent(intent)) == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str2 : clipDataIntentFromIntent.getExtras().keySet()) {
            if (str2.startsWith(EXTRA_DATA_TYPE_RESULTS_DATA)) {
                java.lang.String substring = str2.substring(39);
                if (!substring.isEmpty() && (string = clipDataIntentFromIntent.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    hashMap.put(substring, android.net.Uri.parse(string));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public static android.os.Bundle getResultsFromIntent(android.content.Intent intent) {
        android.content.Intent clipDataIntentFromIntent;
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }
        if (android.os.Build.VERSION.SDK_INT < 16 || (clipDataIntentFromIntent = getClipDataIntentFromIntent(intent)) == null) {
            return null;
        }
        return (android.os.Bundle) clipDataIntentFromIntent.getExtras().getParcelable(EXTRA_RESULTS_DATA);
    }

    public static void addResultsToIntent(androidx.core.app.RemoteInput[] remoteInputArr, android.content.Intent intent, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.RemoteInput.addResultsToIntent(fromCompat(remoteInputArr), intent, bundle);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            android.os.Bundle resultsFromIntent = getResultsFromIntent(intent);
            int resultsSource = getResultsSource(intent);
            if (resultsFromIntent != null) {
                resultsFromIntent.putAll(bundle);
                bundle = resultsFromIntent;
            }
            for (androidx.core.app.RemoteInput remoteInput : remoteInputArr) {
                java.util.Map<java.lang.String, android.net.Uri> dataResultsFromIntent = getDataResultsFromIntent(intent, remoteInput.getResultKey());
                android.app.RemoteInput.addResultsToIntent(fromCompat(new androidx.core.app.RemoteInput[]{remoteInput}), intent, bundle);
                if (dataResultsFromIntent != null) {
                    addDataResultToIntent(remoteInput, intent, dataResultsFromIntent);
                }
            }
            setResultsSource(intent, resultsSource);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            android.content.Intent clipDataIntentFromIntent = getClipDataIntentFromIntent(intent);
            if (clipDataIntentFromIntent == null) {
                clipDataIntentFromIntent = new android.content.Intent();
            }
            android.os.Bundle bundleExtra = clipDataIntentFromIntent.getBundleExtra(EXTRA_RESULTS_DATA);
            if (bundleExtra == null) {
                bundleExtra = new android.os.Bundle();
            }
            for (androidx.core.app.RemoteInput remoteInput2 : remoteInputArr) {
                java.lang.Object obj = bundle.get(remoteInput2.getResultKey());
                if (obj instanceof java.lang.CharSequence) {
                    bundleExtra.putCharSequence(remoteInput2.getResultKey(), (java.lang.CharSequence) obj);
                }
            }
            clipDataIntentFromIntent.putExtra(EXTRA_RESULTS_DATA, bundleExtra);
            intent.setClipData(android.content.ClipData.newIntent(RESULTS_CLIP_LABEL, clipDataIntentFromIntent));
        }
    }

    public static void addDataResultToIntent(androidx.core.app.RemoteInput remoteInput, android.content.Intent intent, java.util.Map<java.lang.String, android.net.Uri> map) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.RemoteInput.addDataResultToIntent(fromCompat(remoteInput), intent, map);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            android.content.Intent clipDataIntentFromIntent = getClipDataIntentFromIntent(intent);
            if (clipDataIntentFromIntent == null) {
                clipDataIntentFromIntent = new android.content.Intent();
            }
            for (java.util.Map.Entry<java.lang.String, android.net.Uri> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                android.net.Uri value = entry.getValue();
                if (key != null) {
                    android.os.Bundle bundleExtra = clipDataIntentFromIntent.getBundleExtra(getExtraResultsKeyForData(key));
                    if (bundleExtra == null) {
                        bundleExtra = new android.os.Bundle();
                    }
                    bundleExtra.putString(remoteInput.getResultKey(), value.toString());
                    clipDataIntentFromIntent.putExtra(getExtraResultsKeyForData(key), bundleExtra);
                }
            }
            intent.setClipData(android.content.ClipData.newIntent(RESULTS_CLIP_LABEL, clipDataIntentFromIntent));
        }
    }

    public static void setResultsSource(android.content.Intent intent, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.app.RemoteInput.setResultsSource(intent, i);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            android.content.Intent clipDataIntentFromIntent = getClipDataIntentFromIntent(intent);
            if (clipDataIntentFromIntent == null) {
                clipDataIntentFromIntent = new android.content.Intent();
            }
            clipDataIntentFromIntent.putExtra(EXTRA_RESULTS_SOURCE, i);
            intent.setClipData(android.content.ClipData.newIntent(RESULTS_CLIP_LABEL, clipDataIntentFromIntent));
        }
    }

    public static int getResultsSource(android.content.Intent intent) {
        android.content.Intent clipDataIntentFromIntent;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return android.app.RemoteInput.getResultsSource(intent);
        }
        if (android.os.Build.VERSION.SDK_INT < 16 || (clipDataIntentFromIntent = getClipDataIntentFromIntent(intent)) == null) {
            return 0;
        }
        return clipDataIntentFromIntent.getExtras().getInt(EXTRA_RESULTS_SOURCE, 0);
    }

    private static java.lang.String getExtraResultsKeyForData(java.lang.String str) {
        return EXTRA_DATA_TYPE_RESULTS_DATA + str;
    }

    static android.app.RemoteInput[] fromCompat(androidx.core.app.RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            remoteInputArr2[i] = fromCompat(remoteInputArr[i]);
        }
        return remoteInputArr2;
    }

    static android.app.RemoteInput fromCompat(androidx.core.app.RemoteInput remoteInput) {
        java.util.Set<java.lang.String> allowedDataTypes;
        android.app.RemoteInput.Builder addExtras = new android.app.RemoteInput.Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
        if (android.os.Build.VERSION.SDK_INT >= 26 && (allowedDataTypes = remoteInput.getAllowedDataTypes()) != null) {
            java.util.Iterator<java.lang.String> it = allowedDataTypes.iterator();
            while (it.hasNext()) {
                addExtras.setAllowDataType(it.next(), true);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(remoteInput.getEditChoicesBeforeSending());
        }
        return addExtras.build();
    }

    static androidx.core.app.RemoteInput fromPlatform(android.app.RemoteInput remoteInput) {
        java.util.Set<java.lang.String> allowedDataTypes;
        androidx.core.app.RemoteInput.Builder addExtras = new androidx.core.app.RemoteInput.Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
        if (android.os.Build.VERSION.SDK_INT >= 26 && (allowedDataTypes = remoteInput.getAllowedDataTypes()) != null) {
            java.util.Iterator<java.lang.String> it = allowedDataTypes.iterator();
            while (it.hasNext()) {
                addExtras.setAllowDataType(it.next(), true);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(remoteInput.getEditChoicesBeforeSending());
        }
        return addExtras.build();
    }

    private static android.content.Intent getClipDataIntentFromIntent(android.content.Intent intent) {
        android.content.ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        android.content.ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(RESULTS_CLIP_LABEL)) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }
}
