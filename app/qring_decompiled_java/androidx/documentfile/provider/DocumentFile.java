package androidx.documentfile.provider;

/* loaded from: classes.dex */
public abstract class DocumentFile {
    static final java.lang.String TAG = "DocumentFile";
    private final androidx.documentfile.provider.DocumentFile mParent;

    public abstract boolean canRead();

    public abstract boolean canWrite();

    public abstract androidx.documentfile.provider.DocumentFile createDirectory(java.lang.String str);

    public abstract androidx.documentfile.provider.DocumentFile createFile(java.lang.String str, java.lang.String str2);

    public abstract boolean delete();

    public abstract boolean exists();

    public abstract java.lang.String getName();

    public abstract java.lang.String getType();

    public abstract android.net.Uri getUri();

    public abstract boolean isDirectory();

    public abstract boolean isFile();

    public abstract boolean isVirtual();

    public abstract long lastModified();

    public abstract long length();

    public abstract androidx.documentfile.provider.DocumentFile[] listFiles();

    public abstract boolean renameTo(java.lang.String str);

    DocumentFile(androidx.documentfile.provider.DocumentFile documentFile) {
        this.mParent = documentFile;
    }

    public static androidx.documentfile.provider.DocumentFile fromFile(java.io.File file) {
        return new androidx.documentfile.provider.RawDocumentFile(null, file);
    }

    public static androidx.documentfile.provider.DocumentFile fromSingleUri(android.content.Context context, android.net.Uri uri) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return new androidx.documentfile.provider.SingleDocumentFile(null, context, uri);
        }
        return null;
    }

    public static androidx.documentfile.provider.DocumentFile fromTreeUri(android.content.Context context, android.net.Uri uri) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return new androidx.documentfile.provider.TreeDocumentFile(null, context, android.provider.DocumentsContract.buildDocumentUriUsingTree(uri, android.provider.DocumentsContract.getTreeDocumentId(uri)));
        }
        return null;
    }

    public static boolean isDocumentUri(android.content.Context context, android.net.Uri uri) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return android.provider.DocumentsContract.isDocumentUri(context, uri);
        }
        return false;
    }

    public androidx.documentfile.provider.DocumentFile getParentFile() {
        return this.mParent;
    }

    public androidx.documentfile.provider.DocumentFile findFile(java.lang.String str) {
        for (androidx.documentfile.provider.DocumentFile documentFile : listFiles()) {
            if (str.equals(documentFile.getName())) {
                return documentFile;
            }
        }
        return null;
    }
}
