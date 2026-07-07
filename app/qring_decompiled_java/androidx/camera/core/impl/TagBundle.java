package androidx.camera.core.impl;

/* loaded from: classes.dex */
public class TagBundle {
    private static final androidx.camera.core.impl.TagBundle EMPTY_TAGBUNDLE = new androidx.camera.core.impl.TagBundle(new android.util.ArrayMap());
    protected final java.util.Map<java.lang.String, java.lang.Integer> mTagMap;

    protected TagBundle(java.util.Map<java.lang.String, java.lang.Integer> tagMap) {
        this.mTagMap = tagMap;
    }

    public static androidx.camera.core.impl.TagBundle emptyBundle() {
        return EMPTY_TAGBUNDLE;
    }

    public static androidx.camera.core.impl.TagBundle create(android.util.Pair<java.lang.String, java.lang.Integer> source) {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put((java.lang.String) source.first, (java.lang.Integer) source.second);
        return new androidx.camera.core.impl.TagBundle(arrayMap);
    }

    public static androidx.camera.core.impl.TagBundle from(androidx.camera.core.impl.TagBundle otherTagBundle) {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        for (java.lang.String str : otherTagBundle.listKeys()) {
            arrayMap.put(str, otherTagBundle.getTag(str));
        }
        return new androidx.camera.core.impl.TagBundle(arrayMap);
    }

    public java.lang.Integer getTag(java.lang.String key) {
        return this.mTagMap.get(key);
    }

    public java.util.Set<java.lang.String> listKeys() {
        return this.mTagMap.keySet();
    }
}
