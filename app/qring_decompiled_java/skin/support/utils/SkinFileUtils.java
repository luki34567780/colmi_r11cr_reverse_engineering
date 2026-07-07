package skin.support.utils;

/* loaded from: classes3.dex */
public class SkinFileUtils {
    public static java.lang.String getSkinDir(android.content.Context context) {
        java.io.File file = new java.io.File(getCacheDir(context), skin.support.utils.SkinConstants.SKIN_DEPLOY_PATH);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private static java.lang.String getCacheDir(android.content.Context context) {
        java.io.File externalCacheDir;
        if (android.os.Environment.getExternalStorageState().equals("mounted") && (externalCacheDir = context.getExternalCacheDir()) != null && (externalCacheDir.exists() || externalCacheDir.mkdirs())) {
            return externalCacheDir.getAbsolutePath();
        }
        return context.getCacheDir().getAbsolutePath();
    }

    public static boolean isFileExists(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && new java.io.File(str).exists();
    }
}
