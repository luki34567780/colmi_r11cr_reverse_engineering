package androidx.work;

/* loaded from: classes.dex */
public abstract class InputMergerFactory {
    public abstract androidx.work.InputMerger createInputMerger(java.lang.String className);

    public final androidx.work.InputMerger createInputMergerWithDefaultFallback(java.lang.String className) {
        androidx.work.InputMerger createInputMerger = createInputMerger(className);
        return createInputMerger == null ? androidx.work.InputMerger.fromClassName(className) : createInputMerger;
    }

    public static androidx.work.InputMergerFactory getDefaultInputMergerFactory() {
        return new androidx.work.InputMergerFactory() { // from class: androidx.work.InputMergerFactory.1
            @Override // androidx.work.InputMergerFactory
            public androidx.work.InputMerger createInputMerger(java.lang.String className) {
                return null;
            }
        };
    }
}
