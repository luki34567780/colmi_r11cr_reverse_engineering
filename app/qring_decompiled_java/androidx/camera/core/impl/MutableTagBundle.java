package androidx.camera.core.impl;

/* loaded from: classes.dex */
public class MutableTagBundle extends androidx.camera.core.impl.TagBundle {
    private MutableTagBundle(java.util.Map<java.lang.String, java.lang.Integer> source) {
        super(source);
    }

    public static androidx.camera.core.impl.MutableTagBundle create() {
        return new androidx.camera.core.impl.MutableTagBundle(new android.util.ArrayMap());
    }

    public static androidx.camera.core.impl.MutableTagBundle from(androidx.camera.core.impl.TagBundle otherTagBundle) {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        for (java.lang.String str : otherTagBundle.listKeys()) {
            arrayMap.put(str, otherTagBundle.getTag(str));
        }
        return new androidx.camera.core.impl.MutableTagBundle(arrayMap);
    }

    public void putTag(java.lang.String key, java.lang.Integer value) {
        this.mTagMap.put(key, value);
    }

    public void addTagBundle(androidx.camera.core.impl.TagBundle bundle) {
        if (this.mTagMap == null || bundle.mTagMap == null) {
            return;
        }
        this.mTagMap.putAll(bundle.mTagMap);
    }
}
