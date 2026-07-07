package skin.support.design;

/* loaded from: classes3.dex */
public class SkinMaterialManager {
    private static volatile skin.support.design.SkinMaterialManager sInstance;

    public static skin.support.design.SkinMaterialManager init(android.content.Context context) {
        if (sInstance == null) {
            synchronized (skin.support.design.SkinMaterialManager.class) {
                if (sInstance == null) {
                    sInstance = new skin.support.design.SkinMaterialManager(context);
                }
            }
        }
        return sInstance;
    }

    public static skin.support.design.SkinMaterialManager getInstance() {
        return sInstance;
    }

    private SkinMaterialManager(android.content.Context context) {
        skin.support.SkinCompatManager.init(context).addInflater(new skin.support.design.app.SkinMaterialViewInflater());
    }
}
