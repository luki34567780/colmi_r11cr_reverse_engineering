package skin.support.load;

/* loaded from: classes3.dex */
public class SkinAssetsLoader extends skin.support.load.SkinSDCardLoader {
    @Override // skin.support.load.SkinSDCardLoader, skin.support.SkinCompatManager.SkinLoaderStrategy
    public java.lang.String getTargetResourceEntryName(android.content.Context context, java.lang.String str, int i) {
        return null;
    }

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public int getType() {
        return 0;
    }

    @Override // skin.support.load.SkinSDCardLoader
    protected java.lang.String getSkinPath(android.content.Context context, java.lang.String str) {
        return copySkinFromAssets(context, str);
    }

    private java.lang.String copySkinFromAssets(android.content.Context context, java.lang.String str) {
        java.lang.String absolutePath = new java.io.File(skin.support.utils.SkinFileUtils.getSkinDir(context), str).getAbsolutePath();
        try {
            java.io.InputStream open = context.getAssets().open(skin.support.utils.SkinConstants.SKIN_DEPLOY_PATH + java.io.File.separator + str);
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(absolutePath);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
            open.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return absolutePath;
    }
}
