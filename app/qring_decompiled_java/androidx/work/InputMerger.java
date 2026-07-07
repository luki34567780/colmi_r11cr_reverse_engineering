package androidx.work;

/* loaded from: classes.dex */
public abstract class InputMerger {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("InputMerger");

    public abstract androidx.work.Data merge(java.util.List<androidx.work.Data> inputs);

    public static androidx.work.InputMerger fromClassName(java.lang.String className) {
        try {
            return (androidx.work.InputMerger) java.lang.Class.forName(className).newInstance();
        } catch (java.lang.Exception e) {
            androidx.work.Logger.get().error(TAG, "Trouble instantiating + " + className, e);
            return null;
        }
    }
}
