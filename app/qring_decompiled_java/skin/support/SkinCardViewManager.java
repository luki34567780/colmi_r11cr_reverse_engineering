package skin.support;

/* loaded from: classes3.dex */
public class SkinCardViewManager {
    private static volatile skin.support.SkinCardViewManager sInstance;

    public static skin.support.SkinCardViewManager init(android.content.Context context) {
        if (sInstance == null) {
            synchronized (skin.support.SkinCardViewManager.class) {
                if (sInstance == null) {
                    sInstance = new skin.support.SkinCardViewManager(context);
                }
            }
        }
        return sInstance;
    }

    public static skin.support.SkinCardViewManager getInstance() {
        return sInstance;
    }

    private SkinCardViewManager(android.content.Context context) {
        skin.support.SkinCompatManager.init(context).addInflater(new skin.support.app.SkinCardViewInflater());
    }
}
