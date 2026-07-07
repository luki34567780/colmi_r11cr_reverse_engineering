package androidx.work;

/* loaded from: classes.dex */
public final class Data {
    public static final int MAX_DATA_BYTES = 10240;
    java.util.Map<java.lang.String, java.lang.Object> mValues;
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("Data");
    public static final androidx.work.Data EMPTY = new androidx.work.Data.Builder().build();

    Data() {
    }

    public Data(androidx.work.Data other) {
        this.mValues = new java.util.HashMap(other.mValues);
    }

    public Data(java.util.Map<java.lang.String, ?> values) {
        this.mValues = new java.util.HashMap(values);
    }

    public boolean getBoolean(java.lang.String key, boolean defaultValue) {
        java.lang.Object obj = this.mValues.get(key);
        return obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() : defaultValue;
    }

    public boolean[] getBooleanArray(java.lang.String key) {
        java.lang.Object obj = this.mValues.get(key);
        if (obj instanceof java.lang.Boolean[]) {
            return convertToPrimitiveArray((java.lang.Boolean[]) obj);
        }
        return null;
    }

    public byte getByte(java.lang.String key, byte defaultValue) {
        java.lang.Object obj = this.mValues.get(key);
        return obj instanceof java.lang.Byte ? ((java.lang.Byte) obj).byteValue() : defaultValue;
    }

    public byte[] getByteArray(java.lang.String key) {
        java.lang.Object obj = this.mValues.get(key);
        if (obj instanceof java.lang.Byte[]) {
            return convertToPrimitiveArray((java.lang.Byte[]) obj);
        }
        return null;
    }

    public int getInt(java.lang.String key, int defaultValue) {
        java.lang.Object obj = this.mValues.get(key);
        return obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : defaultValue;
    }

    public int[] getIntArray(java.lang.String key) {
        java.lang.Object obj = this.mValues.get(key);
        if (obj instanceof java.lang.Integer[]) {
            return convertToPrimitiveArray((java.lang.Integer[]) obj);
        }
        return null;
    }

    public long getLong(java.lang.String key, long defaultValue) {
        java.lang.Object obj = this.mValues.get(key);
        return obj instanceof java.lang.Long ? ((java.lang.Long) obj).longValue() : defaultValue;
    }

    public long[] getLongArray(java.lang.String key) {
        java.lang.Object obj = this.mValues.get(key);
        if (obj instanceof java.lang.Long[]) {
            return convertToPrimitiveArray((java.lang.Long[]) obj);
        }
        return null;
    }

    public float getFloat(java.lang.String key, float defaultValue) {
        java.lang.Object obj = this.mValues.get(key);
        return obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : defaultValue;
    }

    public float[] getFloatArray(java.lang.String key) {
        java.lang.Object obj = this.mValues.get(key);
        if (obj instanceof java.lang.Float[]) {
            return convertToPrimitiveArray((java.lang.Float[]) obj);
        }
        return null;
    }

    public double getDouble(java.lang.String key, double defaultValue) {
        java.lang.Object obj = this.mValues.get(key);
        return obj instanceof java.lang.Double ? ((java.lang.Double) obj).doubleValue() : defaultValue;
    }

    public double[] getDoubleArray(java.lang.String key) {
        java.lang.Object obj = this.mValues.get(key);
        if (obj instanceof java.lang.Double[]) {
            return convertToPrimitiveArray((java.lang.Double[]) obj);
        }
        return null;
    }

    public java.lang.String getString(java.lang.String key) {
        java.lang.Object obj = this.mValues.get(key);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public java.lang.String[] getStringArray(java.lang.String key) {
        java.lang.Object obj = this.mValues.get(key);
        if (obj instanceof java.lang.String[]) {
            return (java.lang.String[]) obj;
        }
        return null;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getKeyValueMap() {
        return java.util.Collections.unmodifiableMap(this.mValues);
    }

    public byte[] toByteArray() {
        return toByteArrayInternal(this);
    }

    public <T> boolean hasKeyWithValueOfType(java.lang.String key, java.lang.Class<T> klass) {
        java.lang.Object obj = this.mValues.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    public int size() {
        return this.mValues.size();
    }

    public static byte[] toByteArrayInternal(androidx.work.Data data) {
        java.io.ObjectOutputStream objectOutputStream;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.io.IOException e) {
            e = e;
        }
        try {
            objectOutputStream.writeInt(data.size());
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : data.mValues.entrySet()) {
                objectOutputStream.writeUTF(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (java.io.IOException e2) {
                android.util.Log.e(TAG, "Error in Data#toByteArray: ", e2);
            }
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException e3) {
                android.util.Log.e(TAG, "Error in Data#toByteArray: ", e3);
            }
            if (byteArrayOutputStream.size() > 10240) {
                throw new java.lang.IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e4) {
            e = e4;
            objectOutputStream2 = objectOutputStream;
            android.util.Log.e(TAG, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (java.io.IOException e5) {
                    android.util.Log.e(TAG, "Error in Data#toByteArray: ", e5);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException e6) {
                android.util.Log.e(TAG, "Error in Data#toByteArray: ", e6);
            }
            return byteArray;
        } catch (java.lang.Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (java.io.IOException e7) {
                    android.util.Log.e(TAG, "Error in Data#toByteArray: ", e7);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (java.io.IOException e8) {
                android.util.Log.e(TAG, "Error in Data#toByteArray: ", e8);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x005d -> B:16:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.work.Data fromByteArray(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L80
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            int r7 = r3.readInt()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
        L1b:
            if (r7 <= 0) goto L2b
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            r1.put(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r7 = move-exception
            java.lang.String r3 = androidx.work.Data.TAG
            android.util.Log.e(r3, r0, r7)
        L35:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L39:
            r7 = move-exception
            goto L47
        L3b:
            r7 = move-exception
            goto L47
        L3d:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L69
        L41:
            r3 = move-exception
            goto L44
        L43:
            r3 = move-exception
        L44:
            r6 = r3
            r3 = r7
            r7 = r6
        L47:
            java.lang.String r4 = androidx.work.Data.TAG     // Catch: java.lang.Throwable -> L68
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L58
            r3.close()     // Catch: java.io.IOException -> L52
            goto L58
        L52:
            r7 = move-exception
            java.lang.String r3 = androidx.work.Data.TAG
            android.util.Log.e(r3, r0, r7)
        L58:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L5c:
            r7 = move-exception
            java.lang.String r2 = androidx.work.Data.TAG
            android.util.Log.e(r2, r0, r7)
        L62:
            androidx.work.Data r7 = new androidx.work.Data
            r7.<init>(r1)
            return r7
        L68:
            r7 = move-exception
        L69:
            if (r3 == 0) goto L75
            r3.close()     // Catch: java.io.IOException -> L6f
            goto L75
        L6f:
            r1 = move-exception
            java.lang.String r3 = androidx.work.Data.TAG
            android.util.Log.e(r3, r0, r1)
        L75:
            r2.close()     // Catch: java.io.IOException -> L79
            goto L7f
        L79:
            r1 = move-exception
            java.lang.String r2 = androidx.work.Data.TAG
            android.util.Log.e(r2, r0, r1)
        L7f:
            throw r7
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.fromByteArray(byte[]):androidx.work.Data");
    }

    public boolean equals(java.lang.Object o) {
        boolean z;
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        androidx.work.Data data = (androidx.work.Data) o;
        java.util.Set<java.lang.String> keySet = this.mValues.keySet();
        if (!keySet.equals(data.mValues.keySet())) {
            return false;
        }
        for (java.lang.String str : keySet) {
            java.lang.Object obj = this.mValues.get(str);
            java.lang.Object obj2 = data.mValues.get(str);
            if (obj == null || obj2 == null) {
                z = obj == obj2;
            } else if ((obj instanceof java.lang.Object[]) && (obj2 instanceof java.lang.Object[])) {
                z = java.util.Arrays.deepEquals((java.lang.Object[]) obj, (java.lang.Object[]) obj2);
            } else {
                z = obj.equals(obj2);
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.mValues.hashCode() * 31;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Data {");
        if (!this.mValues.isEmpty()) {
            for (java.lang.String str : this.mValues.keySet()) {
                sb.append(str);
                sb.append(" : ");
                java.lang.Object obj = this.mValues.get(str);
                if (obj instanceof java.lang.Object[]) {
                    sb.append(java.util.Arrays.toString((java.lang.Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static java.lang.Boolean[] convertPrimitiveBooleanArray(boolean[] value) {
        java.lang.Boolean[] boolArr = new java.lang.Boolean[value.length];
        for (int i = 0; i < value.length; i++) {
            boolArr[i] = java.lang.Boolean.valueOf(value[i]);
        }
        return boolArr;
    }

    public static java.lang.Byte[] convertPrimitiveByteArray(byte[] value) {
        java.lang.Byte[] bArr = new java.lang.Byte[value.length];
        for (int i = 0; i < value.length; i++) {
            bArr[i] = java.lang.Byte.valueOf(value[i]);
        }
        return bArr;
    }

    public static java.lang.Integer[] convertPrimitiveIntArray(int[] value) {
        java.lang.Integer[] numArr = new java.lang.Integer[value.length];
        for (int i = 0; i < value.length; i++) {
            numArr[i] = java.lang.Integer.valueOf(value[i]);
        }
        return numArr;
    }

    public static java.lang.Long[] convertPrimitiveLongArray(long[] value) {
        java.lang.Long[] lArr = new java.lang.Long[value.length];
        for (int i = 0; i < value.length; i++) {
            lArr[i] = java.lang.Long.valueOf(value[i]);
        }
        return lArr;
    }

    public static java.lang.Float[] convertPrimitiveFloatArray(float[] value) {
        java.lang.Float[] fArr = new java.lang.Float[value.length];
        for (int i = 0; i < value.length; i++) {
            fArr[i] = java.lang.Float.valueOf(value[i]);
        }
        return fArr;
    }

    public static java.lang.Double[] convertPrimitiveDoubleArray(double[] value) {
        java.lang.Double[] dArr = new java.lang.Double[value.length];
        for (int i = 0; i < value.length; i++) {
            dArr[i] = java.lang.Double.valueOf(value[i]);
        }
        return dArr;
    }

    public static boolean[] convertToPrimitiveArray(java.lang.Boolean[] array) {
        boolean[] zArr = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            zArr[i] = array[i].booleanValue();
        }
        return zArr;
    }

    public static byte[] convertToPrimitiveArray(java.lang.Byte[] array) {
        byte[] bArr = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            bArr[i] = array[i].byteValue();
        }
        return bArr;
    }

    public static int[] convertToPrimitiveArray(java.lang.Integer[] array) {
        int[] iArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            iArr[i] = array[i].intValue();
        }
        return iArr;
    }

    public static long[] convertToPrimitiveArray(java.lang.Long[] array) {
        long[] jArr = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            jArr[i] = array[i].longValue();
        }
        return jArr;
    }

    public static float[] convertToPrimitiveArray(java.lang.Float[] array) {
        float[] fArr = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            fArr[i] = array[i].floatValue();
        }
        return fArr;
    }

    public static double[] convertToPrimitiveArray(java.lang.Double[] array) {
        double[] dArr = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            dArr[i] = array[i].doubleValue();
        }
        return dArr;
    }

    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.Object> mValues = new java.util.HashMap();

        public androidx.work.Data.Builder putBoolean(java.lang.String key, boolean value) {
            this.mValues.put(key, java.lang.Boolean.valueOf(value));
            return this;
        }

        public androidx.work.Data.Builder putBooleanArray(java.lang.String key, boolean[] value) {
            this.mValues.put(key, androidx.work.Data.convertPrimitiveBooleanArray(value));
            return this;
        }

        public androidx.work.Data.Builder putByte(java.lang.String key, byte value) {
            this.mValues.put(key, java.lang.Byte.valueOf(value));
            return this;
        }

        public androidx.work.Data.Builder putByteArray(java.lang.String key, byte[] value) {
            this.mValues.put(key, androidx.work.Data.convertPrimitiveByteArray(value));
            return this;
        }

        public androidx.work.Data.Builder putInt(java.lang.String key, int value) {
            this.mValues.put(key, java.lang.Integer.valueOf(value));
            return this;
        }

        public androidx.work.Data.Builder putIntArray(java.lang.String key, int[] value) {
            this.mValues.put(key, androidx.work.Data.convertPrimitiveIntArray(value));
            return this;
        }

        public androidx.work.Data.Builder putLong(java.lang.String key, long value) {
            this.mValues.put(key, java.lang.Long.valueOf(value));
            return this;
        }

        public androidx.work.Data.Builder putLongArray(java.lang.String key, long[] value) {
            this.mValues.put(key, androidx.work.Data.convertPrimitiveLongArray(value));
            return this;
        }

        public androidx.work.Data.Builder putFloat(java.lang.String key, float value) {
            this.mValues.put(key, java.lang.Float.valueOf(value));
            return this;
        }

        public androidx.work.Data.Builder putFloatArray(java.lang.String key, float[] value) {
            this.mValues.put(key, androidx.work.Data.convertPrimitiveFloatArray(value));
            return this;
        }

        public androidx.work.Data.Builder putDouble(java.lang.String key, double value) {
            this.mValues.put(key, java.lang.Double.valueOf(value));
            return this;
        }

        public androidx.work.Data.Builder putDoubleArray(java.lang.String key, double[] value) {
            this.mValues.put(key, androidx.work.Data.convertPrimitiveDoubleArray(value));
            return this;
        }

        public androidx.work.Data.Builder putString(java.lang.String key, java.lang.String value) {
            this.mValues.put(key, value);
            return this;
        }

        public androidx.work.Data.Builder putStringArray(java.lang.String key, java.lang.String[] value) {
            this.mValues.put(key, value);
            return this;
        }

        public androidx.work.Data.Builder putAll(androidx.work.Data data) {
            putAll(data.mValues);
            return this;
        }

        public androidx.work.Data.Builder putAll(java.util.Map<java.lang.String, java.lang.Object> values) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : values.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public androidx.work.Data.Builder put(java.lang.String key, java.lang.Object value) {
            if (value == null) {
                this.mValues.put(key, null);
            } else {
                java.lang.Class<?> cls = value.getClass();
                if (cls == java.lang.Boolean.class || cls == java.lang.Byte.class || cls == java.lang.Integer.class || cls == java.lang.Long.class || cls == java.lang.Float.class || cls == java.lang.Double.class || cls == java.lang.String.class || cls == java.lang.Boolean[].class || cls == java.lang.Byte[].class || cls == java.lang.Integer[].class || cls == java.lang.Long[].class || cls == java.lang.Float[].class || cls == java.lang.Double[].class || cls == java.lang.String[].class) {
                    this.mValues.put(key, value);
                } else if (cls == boolean[].class) {
                    this.mValues.put(key, androidx.work.Data.convertPrimitiveBooleanArray((boolean[]) value));
                } else if (cls == byte[].class) {
                    this.mValues.put(key, androidx.work.Data.convertPrimitiveByteArray((byte[]) value));
                } else if (cls == int[].class) {
                    this.mValues.put(key, androidx.work.Data.convertPrimitiveIntArray((int[]) value));
                } else if (cls == long[].class) {
                    this.mValues.put(key, androidx.work.Data.convertPrimitiveLongArray((long[]) value));
                } else if (cls == float[].class) {
                    this.mValues.put(key, androidx.work.Data.convertPrimitiveFloatArray((float[]) value));
                } else if (cls == double[].class) {
                    this.mValues.put(key, androidx.work.Data.convertPrimitiveDoubleArray((double[]) value));
                } else {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Key %s has invalid type %s", key, cls));
                }
            }
            return this;
        }

        public androidx.work.Data build() {
            androidx.work.Data data = new androidx.work.Data((java.util.Map<java.lang.String, ?>) this.mValues);
            androidx.work.Data.toByteArrayInternal(data);
            return data;
        }
    }
}
