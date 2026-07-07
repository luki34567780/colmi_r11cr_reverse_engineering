package skin.support.widget;

/* loaded from: classes3.dex */
public abstract class SkinCompatHelper {
    public static final int INVALID_ID = 0;
    protected static final java.lang.String SYSTEM_ID_PREFIX = "1";

    public abstract void applySkin();

    public static final int checkResourceId(int i) {
        if (java.lang.Integer.toHexString(i).startsWith("1")) {
            return 0;
        }
        return i;
    }
}
