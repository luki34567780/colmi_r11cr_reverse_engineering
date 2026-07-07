package skin.support.constraint;

/* loaded from: classes3.dex */
public class SkinConstraintManager {
    private static volatile skin.support.constraint.SkinConstraintManager sInstance;

    public static skin.support.constraint.SkinConstraintManager init(android.content.Context context) {
        if (sInstance == null) {
            synchronized (skin.support.constraint.SkinConstraintManager.class) {
                if (sInstance == null) {
                    sInstance = new skin.support.constraint.SkinConstraintManager(context);
                }
            }
        }
        return sInstance;
    }

    public static skin.support.constraint.SkinConstraintManager getInstance() {
        return sInstance;
    }

    private SkinConstraintManager(android.content.Context context) {
        skin.support.SkinCompatManager.init(context).addInflater(new skin.support.constraint.app.SkinConstraintViewInflater());
    }
}
