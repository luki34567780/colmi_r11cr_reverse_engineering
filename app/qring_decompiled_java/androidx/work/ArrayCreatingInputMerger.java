package androidx.work;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends androidx.work.InputMerger {
    @Override // androidx.work.InputMerger
    public androidx.work.Data merge(java.util.List<androidx.work.Data> inputs) {
        androidx.work.Data.Builder builder = new androidx.work.Data.Builder();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<androidx.work.Data> it = inputs.iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : it.next().getKeyValueMap().entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                java.lang.Class<?> cls = value.getClass();
                java.lang.Object obj = hashMap.get(key);
                if (obj == null) {
                    if (!cls.isArray()) {
                        value = createArrayFor(value);
                    }
                } else {
                    java.lang.Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            value = concatenateArrays(obj, value);
                        } else {
                            value = concatenateNonArrays(obj, value);
                        }
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = concatenateArrayAndNonArray(obj, value);
                    } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                        value = concatenateArrayAndNonArray(value, obj);
                    } else {
                        throw new java.lang.IllegalArgumentException();
                    }
                }
                hashMap.put(key, value);
            }
        }
        builder.putAll(hashMap);
        return builder.build();
    }

    private java.lang.Object concatenateArrays(java.lang.Object array1, java.lang.Object array2) {
        int length = java.lang.reflect.Array.getLength(array1);
        int length2 = java.lang.reflect.Array.getLength(array2);
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance(array1.getClass().getComponentType(), length + length2);
        java.lang.System.arraycopy(array1, 0, newInstance, 0, length);
        java.lang.System.arraycopy(array2, 0, newInstance, length, length2);
        return newInstance;
    }

    private java.lang.Object concatenateNonArrays(java.lang.Object obj1, java.lang.Object obj2) {
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance(obj1.getClass(), 2);
        java.lang.reflect.Array.set(newInstance, 0, obj1);
        java.lang.reflect.Array.set(newInstance, 1, obj2);
        return newInstance;
    }

    private java.lang.Object concatenateArrayAndNonArray(java.lang.Object array, java.lang.Object obj) {
        int length = java.lang.reflect.Array.getLength(array);
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance(obj.getClass(), length + 1);
        java.lang.System.arraycopy(array, 0, newInstance, 0, length);
        java.lang.reflect.Array.set(newInstance, length, obj);
        return newInstance;
    }

    private java.lang.Object createArrayFor(java.lang.Object obj) {
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance(obj.getClass(), 1);
        java.lang.reflect.Array.set(newInstance, 0, obj);
        return newInstance;
    }
}
