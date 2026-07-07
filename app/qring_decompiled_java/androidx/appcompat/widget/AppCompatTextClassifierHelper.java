package androidx.appcompat.widget;

/* loaded from: classes.dex */
final class AppCompatTextClassifierHelper {
    private android.view.textclassifier.TextClassifier mTextClassifier;
    private android.widget.TextView mTextView;

    AppCompatTextClassifierHelper(android.widget.TextView textView) {
        this.mTextView = (android.widget.TextView) androidx.core.util.Preconditions.checkNotNull(textView);
    }

    public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        this.mTextClassifier = textClassifier;
    }

    public android.view.textclassifier.TextClassifier getTextClassifier() {
        android.view.textclassifier.TextClassifier textClassifier = this.mTextClassifier;
        if (textClassifier != null) {
            return textClassifier;
        }
        android.view.textclassifier.TextClassificationManager textClassificationManager = (android.view.textclassifier.TextClassificationManager) this.mTextView.getContext().getSystemService(android.view.textclassifier.TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return android.view.textclassifier.TextClassifier.NO_OP;
    }
}
