package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class KeyCache {
    java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> map = new java.util.HashMap<>();

    public void setFloatValue(java.lang.Object obj, java.lang.String str, int i, float f) {
        if (!this.map.containsKey(obj)) {
            java.util.HashMap<java.lang.String, float[]> hashMap = new java.util.HashMap<>();
            float[] fArr = new float[i + 1];
            fArr[i] = f;
            hashMap.put(str, fArr);
            this.map.put(obj, hashMap);
            return;
        }
        java.util.HashMap<java.lang.String, float[]> hashMap2 = this.map.get(obj);
        if (hashMap2 == null) {
            hashMap2 = new java.util.HashMap<>();
        }
        if (!hashMap2.containsKey(str)) {
            float[] fArr2 = new float[i + 1];
            fArr2[i] = f;
            hashMap2.put(str, fArr2);
            this.map.put(obj, hashMap2);
            return;
        }
        float[] fArr3 = hashMap2.get(str);
        if (fArr3 == null) {
            fArr3 = new float[0];
        }
        if (fArr3.length <= i) {
            fArr3 = java.util.Arrays.copyOf(fArr3, i + 1);
        }
        fArr3[i] = f;
        hashMap2.put(str, fArr3);
    }

    public float getFloatValue(java.lang.Object obj, java.lang.String str, int i) {
        java.util.HashMap<java.lang.String, float[]> hashMap;
        float[] fArr;
        if (this.map.containsKey(obj) && (hashMap = this.map.get(obj)) != null && hashMap.containsKey(str) && (fArr = hashMap.get(str)) != null && fArr.length > i) {
            return fArr[i];
        }
        return Float.NaN;
    }
}
