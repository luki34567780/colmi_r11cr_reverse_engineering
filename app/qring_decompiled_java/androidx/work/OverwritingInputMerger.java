package androidx.work;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends androidx.work.InputMerger {
    @Override // androidx.work.InputMerger
    public androidx.work.Data merge(java.util.List<androidx.work.Data> inputs) {
        androidx.work.Data.Builder builder = new androidx.work.Data.Builder();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<androidx.work.Data> it = inputs.iterator();
        while (it.hasNext()) {
            hashMap.putAll(it.next().getKeyValueMap());
        }
        builder.putAll(hashMap);
        return builder.build();
    }
}
