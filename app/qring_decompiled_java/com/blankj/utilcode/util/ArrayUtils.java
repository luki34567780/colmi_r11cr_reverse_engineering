package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public class ArrayUtils {
    public static final int INDEX_NOT_FOUND = -1;

    public interface Closure<E> {
        void execute(int i, E e);
    }

    private ArrayUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static <T> T[] newArray(T... tArr) {
        java.util.Objects.requireNonNull(tArr, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newArray() marked by @androidx.annotation.NonNull");
        return tArr;
    }

    public static long[] newLongArray(long... jArr) {
        java.util.Objects.requireNonNull(jArr, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newLongArray() marked by @androidx.annotation.NonNull");
        return jArr;
    }

    public static int[] newIntArray(int... iArr) {
        java.util.Objects.requireNonNull(iArr, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newIntArray() marked by @androidx.annotation.NonNull");
        return iArr;
    }

    public static short[] newShortArray(short... sArr) {
        java.util.Objects.requireNonNull(sArr, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newShortArray() marked by @androidx.annotation.NonNull");
        return sArr;
    }

    public static char[] newCharArray(char... cArr) {
        java.util.Objects.requireNonNull(cArr, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newCharArray() marked by @androidx.annotation.NonNull");
        return cArr;
    }

    public static byte[] newByteArray(byte... bArr) {
        java.util.Objects.requireNonNull(bArr, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newByteArray() marked by @androidx.annotation.NonNull");
        return bArr;
    }

    public static double[] newDoubleArray(double... dArr) {
        java.util.Objects.requireNonNull(dArr, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newDoubleArray() marked by @androidx.annotation.NonNull");
        return dArr;
    }

    public static float[] newFloatArray(float... fArr) {
        java.util.Objects.requireNonNull(fArr, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newFloatArray() marked by @androidx.annotation.NonNull");
        return fArr;
    }

    public static boolean[] newBooleanArray(boolean... zArr) {
        java.util.Objects.requireNonNull(zArr, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newBooleanArray() marked by @androidx.annotation.NonNull");
        return zArr;
    }

    public static boolean isEmpty(java.lang.Object obj) {
        return getLength(obj) == 0;
    }

    public static int getLength(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return java.lang.reflect.Array.getLength(obj);
    }

    public static boolean isSameLength(java.lang.Object obj, java.lang.Object obj2) {
        return getLength(obj) == getLength(obj2);
    }

    public static java.lang.Object get(java.lang.Object obj, int i) {
        return get(obj, i, null);
    }

    public static java.lang.Object get(java.lang.Object obj, int i, java.lang.Object obj2) {
        if (obj == null) {
            return obj2;
        }
        try {
            return java.lang.reflect.Array.get(obj, i);
        } catch (java.lang.Exception unused) {
            return obj2;
        }
    }

    public static void set(java.lang.Object obj, int i, java.lang.Object obj2) {
        if (obj == null) {
            return;
        }
        java.lang.reflect.Array.set(obj, i, obj2);
    }

    public static boolean equals(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        return java.util.Arrays.deepEquals(objArr, objArr2);
    }

    public static boolean equals(boolean[] zArr, boolean[] zArr2) {
        return java.util.Arrays.equals(zArr, zArr2);
    }

    public static boolean equals(byte[] bArr, byte[] bArr2) {
        return java.util.Arrays.equals(bArr, bArr2);
    }

    public static boolean equals(char[] cArr, char[] cArr2) {
        return java.util.Arrays.equals(cArr, cArr2);
    }

    public static boolean equals(double[] dArr, double[] dArr2) {
        return java.util.Arrays.equals(dArr, dArr2);
    }

    public static boolean equals(float[] fArr, float[] fArr2) {
        return java.util.Arrays.equals(fArr, fArr2);
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        return java.util.Arrays.equals(iArr, iArr2);
    }

    public static boolean equals(short[] sArr, short[] sArr2) {
        return java.util.Arrays.equals(sArr, sArr2);
    }

    public static <T> void reverse(T[] tArr) {
        if (tArr == null) {
            return;
        }
        int length = tArr.length - 1;
        for (int i = 0; length > i; i++) {
            T t = tArr[length];
            tArr[length] = tArr[i];
            tArr[i] = t;
            length--;
        }
    }

    public static void reverse(long[] jArr) {
        if (jArr == null) {
            return;
        }
        int length = jArr.length - 1;
        for (int i = 0; length > i; i++) {
            long j = jArr[length];
            jArr[length] = jArr[i];
            jArr[i] = j;
            length--;
        }
    }

    public static void reverse(int[] iArr) {
        if (iArr == null) {
            return;
        }
        int length = iArr.length - 1;
        for (int i = 0; length > i; i++) {
            int i2 = iArr[length];
            iArr[length] = iArr[i];
            iArr[i] = i2;
            length--;
        }
    }

    public static void reverse(short[] sArr) {
        if (sArr == null) {
            return;
        }
        int length = sArr.length - 1;
        for (int i = 0; length > i; i++) {
            short s = sArr[length];
            sArr[length] = sArr[i];
            sArr[i] = s;
            length--;
        }
    }

    public static void reverse(char[] cArr) {
        if (cArr == null) {
            return;
        }
        int length = cArr.length - 1;
        for (int i = 0; length > i; i++) {
            char c = cArr[length];
            cArr[length] = cArr[i];
            cArr[i] = c;
            length--;
        }
    }

    public static void reverse(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length - 1;
        for (int i = 0; length > i; i++) {
            byte b = bArr[length];
            bArr[length] = bArr[i];
            bArr[i] = b;
            length--;
        }
    }

    public static void reverse(double[] dArr) {
        if (dArr == null) {
            return;
        }
        int length = dArr.length - 1;
        for (int i = 0; length > i; i++) {
            double d = dArr[length];
            dArr[length] = dArr[i];
            dArr[i] = d;
            length--;
        }
    }

    public static void reverse(float[] fArr) {
        if (fArr == null) {
            return;
        }
        int length = fArr.length - 1;
        for (int i = 0; length > i; i++) {
            float f = fArr[length];
            fArr[length] = fArr[i];
            fArr[i] = f;
            length--;
        }
    }

    public static void reverse(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        int length = zArr.length - 1;
        for (int i = 0; length > i; i++) {
            boolean z = zArr[length];
            zArr[length] = zArr[i];
            zArr[i] = z;
            length--;
        }
    }

    public static <T> T[] copy(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) subArray(tArr, 0, tArr.length);
    }

    public static long[] copy(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return subArray(jArr, 0, jArr.length);
    }

    public static int[] copy(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return subArray(iArr, 0, iArr.length);
    }

    public static short[] copy(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return subArray(sArr, 0, sArr.length);
    }

    public static char[] copy(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return subArray(cArr, 0, cArr.length);
    }

    public static byte[] copy(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return subArray(bArr, 0, bArr.length);
    }

    public static double[] copy(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        return subArray(dArr, 0, dArr.length);
    }

    public static float[] copy(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return subArray(fArr, 0, fArr.length);
    }

    public static boolean[] copy(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return subArray(zArr, 0, zArr.length);
    }

    private static java.lang.Object realCopy(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return realSubArray(obj, 0, getLength(obj));
    }

    public static <T> T[] subArray(T[] tArr, int i, int i2) {
        return (T[]) ((java.lang.Object[]) realSubArray(tArr, i, i2));
    }

    public static long[] subArray(long[] jArr, int i, int i2) {
        return (long[]) realSubArray(jArr, i, i2);
    }

    public static int[] subArray(int[] iArr, int i, int i2) {
        return (int[]) realSubArray(iArr, i, i2);
    }

    public static short[] subArray(short[] sArr, int i, int i2) {
        return (short[]) realSubArray(sArr, i, i2);
    }

    public static char[] subArray(char[] cArr, int i, int i2) {
        return (char[]) realSubArray(cArr, i, i2);
    }

    public static byte[] subArray(byte[] bArr, int i, int i2) {
        return (byte[]) realSubArray(bArr, i, i2);
    }

    public static double[] subArray(double[] dArr, int i, int i2) {
        return (double[]) realSubArray(dArr, i, i2);
    }

    public static float[] subArray(float[] fArr, int i, int i2) {
        return (float[]) realSubArray(fArr, i, i2);
    }

    public static boolean[] subArray(boolean[] zArr, int i, int i2) {
        return (boolean[]) realSubArray(zArr, i, i2);
    }

    private static java.lang.Object realSubArray(java.lang.Object obj, int i, int i2) {
        if (obj == null) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        int length = getLength(obj);
        if (i2 > length) {
            i2 = length;
        }
        int i3 = i2 - i;
        java.lang.Class<?> componentType = obj.getClass().getComponentType();
        if (i3 <= 0) {
            return java.lang.reflect.Array.newInstance(componentType, 0);
        }
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance(componentType, i3);
        java.lang.System.arraycopy(obj, i, newInstance, 0, i3);
        return newInstance;
    }

    public static <T> T[] add(T[] tArr, T t) {
        java.lang.Class cls;
        if (tArr != null) {
            cls = tArr.getClass();
        } else {
            cls = t != null ? t.getClass() : java.lang.Object.class;
        }
        T[] tArr2 = (T[]) ((java.lang.Object[]) realAddOne(tArr, t, cls));
        java.util.Objects.requireNonNull(tArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return tArr2;
    }

    public static boolean[] add(boolean[] zArr, boolean z) {
        boolean[] zArr2 = (boolean[]) realAddOne(zArr, java.lang.Boolean.valueOf(z), java.lang.Boolean.TYPE);
        java.util.Objects.requireNonNull(zArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return zArr2;
    }

    public static byte[] add(byte[] bArr, byte b) {
        byte[] bArr2 = (byte[]) realAddOne(bArr, java.lang.Byte.valueOf(b), java.lang.Byte.TYPE);
        java.util.Objects.requireNonNull(bArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return bArr2;
    }

    public static char[] add(char[] cArr, char c) {
        char[] cArr2 = (char[]) realAddOne(cArr, java.lang.Character.valueOf(c), java.lang.Character.TYPE);
        java.util.Objects.requireNonNull(cArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return cArr2;
    }

    public static double[] add(double[] dArr, double d) {
        double[] dArr2 = (double[]) realAddOne(dArr, java.lang.Double.valueOf(d), java.lang.Double.TYPE);
        java.util.Objects.requireNonNull(dArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return dArr2;
    }

    public static float[] add(float[] fArr, float f) {
        float[] fArr2 = (float[]) realAddOne(fArr, java.lang.Float.valueOf(f), java.lang.Float.TYPE);
        java.util.Objects.requireNonNull(fArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return fArr2;
    }

    public static int[] add(int[] iArr, int i) {
        int[] iArr2 = (int[]) realAddOne(iArr, java.lang.Integer.valueOf(i), java.lang.Integer.TYPE);
        java.util.Objects.requireNonNull(iArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return iArr2;
    }

    public static long[] add(long[] jArr, long j) {
        long[] jArr2 = (long[]) realAddOne(jArr, java.lang.Long.valueOf(j), java.lang.Long.TYPE);
        java.util.Objects.requireNonNull(jArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return jArr2;
    }

    public static short[] add(short[] sArr, short s) {
        short[] sArr2 = (short[]) realAddOne(sArr, java.lang.Short.valueOf(s), java.lang.Short.TYPE);
        java.util.Objects.requireNonNull(sArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return sArr2;
    }

    private static java.lang.Object realAddOne(java.lang.Object obj, java.lang.Object obj2, java.lang.Class cls) {
        java.lang.Object newInstance;
        int i = 0;
        if (obj != null) {
            int length = getLength(obj);
            newInstance = java.lang.reflect.Array.newInstance(obj.getClass().getComponentType(), length + 1);
            java.lang.System.arraycopy(obj, 0, newInstance, 0, length);
            i = length;
        } else {
            newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1);
        }
        java.lang.reflect.Array.set(newInstance, i, obj2);
        java.util.Objects.requireNonNull(newInstance, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.realAddOne() marked by @androidx.annotation.NonNull");
        return newInstance;
    }

    public static <T> T[] add(T[] tArr, T[] tArr2) {
        return (T[]) ((java.lang.Object[]) realAddArr(tArr, tArr2));
    }

    public static boolean[] add(boolean[] zArr, boolean[] zArr2) {
        return (boolean[]) realAddArr(zArr, zArr2);
    }

    public static char[] add(char[] cArr, char[] cArr2) {
        return (char[]) realAddArr(cArr, cArr2);
    }

    public static byte[] add(byte[] bArr, byte[] bArr2) {
        return (byte[]) realAddArr(bArr, bArr2);
    }

    public static short[] add(short[] sArr, short[] sArr2) {
        return (short[]) realAddArr(sArr, sArr2);
    }

    public static int[] add(int[] iArr, int[] iArr2) {
        return (int[]) realAddArr(iArr, iArr2);
    }

    public static long[] add(long[] jArr, long[] jArr2) {
        return (long[]) realAddArr(jArr, jArr2);
    }

    public static float[] add(float[] fArr, float[] fArr2) {
        return (float[]) realAddArr(fArr, fArr2);
    }

    public static double[] add(double[] dArr, double[] dArr2) {
        return (double[]) realAddArr(dArr, dArr2);
    }

    private static java.lang.Object realAddArr(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null && obj2 == null) {
            return null;
        }
        if (obj == null) {
            return realCopy(obj2);
        }
        if (obj2 == null) {
            return realCopy(obj);
        }
        int length = getLength(obj);
        int length2 = getLength(obj2);
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance(obj.getClass().getComponentType(), length + length2);
        java.lang.System.arraycopy(obj, 0, newInstance, 0, length);
        java.lang.System.arraycopy(obj2, 0, newInstance, length, length2);
        return newInstance;
    }

    public static <T> T[] add(T[] tArr, int i, T[] tArr2) {
        java.lang.Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else {
            if (tArr2 == null) {
                return null;
            }
            componentType = tArr2.getClass().getComponentType();
        }
        return (T[]) ((java.lang.Object[]) realAddArr(tArr, i, tArr2, componentType));
    }

    public static boolean[] add(boolean[] zArr, int i, boolean[] zArr2) {
        java.lang.Object realAddArr = realAddArr(zArr, i, zArr2, java.lang.Boolean.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (boolean[]) realAddArr;
    }

    public static char[] add(char[] cArr, int i, char[] cArr2) {
        java.lang.Object realAddArr = realAddArr(cArr, i, cArr2, java.lang.Character.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (char[]) realAddArr;
    }

    public static byte[] add(byte[] bArr, int i, byte[] bArr2) {
        java.lang.Object realAddArr = realAddArr(bArr, i, bArr2, java.lang.Byte.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (byte[]) realAddArr;
    }

    public static short[] add(short[] sArr, int i, short[] sArr2) {
        java.lang.Object realAddArr = realAddArr(sArr, i, sArr2, java.lang.Short.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (short[]) realAddArr;
    }

    public static int[] add(int[] iArr, int i, int[] iArr2) {
        java.lang.Object realAddArr = realAddArr(iArr, i, iArr2, java.lang.Integer.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (int[]) realAddArr;
    }

    public static long[] add(long[] jArr, int i, long[] jArr2) {
        java.lang.Object realAddArr = realAddArr(jArr, i, jArr2, java.lang.Long.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (long[]) realAddArr;
    }

    public static float[] add(float[] fArr, int i, float[] fArr2) {
        java.lang.Object realAddArr = realAddArr(fArr, i, fArr2, java.lang.Float.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (float[]) realAddArr;
    }

    public static double[] add(double[] dArr, int i, double[] dArr2) {
        java.lang.Object realAddArr = realAddArr(dArr, i, dArr2, java.lang.Double.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (double[]) realAddArr;
    }

    private static java.lang.Object realAddArr(java.lang.Object obj, int i, java.lang.Object obj2, java.lang.Class cls) {
        if (obj == null && obj2 == null) {
            return null;
        }
        int length = getLength(obj);
        int length2 = getLength(obj2);
        if (length == 0) {
            if (i != 0) {
                throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", array1 Length: 0");
            }
            return realCopy(obj2);
        }
        if (length2 == 0) {
            return realCopy(obj);
        }
        if (i > length || i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", array1 Length: " + length);
        }
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance(obj.getClass().getComponentType(), length + length2);
        if (i == length) {
            java.lang.System.arraycopy(obj, 0, newInstance, 0, length);
            java.lang.System.arraycopy(obj2, 0, newInstance, length, length2);
        } else if (i == 0) {
            java.lang.System.arraycopy(obj2, 0, newInstance, 0, length2);
            java.lang.System.arraycopy(obj, 0, newInstance, length2, length);
        } else {
            java.lang.System.arraycopy(obj, 0, newInstance, 0, i);
            java.lang.System.arraycopy(obj2, 0, newInstance, i, length2);
            java.lang.System.arraycopy(obj, i, newInstance, length2 + i, length - i);
        }
        return newInstance;
    }

    public static <T> T[] add(T[] tArr, int i, T t) {
        java.lang.Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass().getComponentType();
        } else if (t != null) {
            cls = t.getClass();
        } else {
            return (T[]) new java.lang.Object[]{null};
        }
        T[] tArr2 = (T[]) ((java.lang.Object[]) realAdd(tArr, i, t, cls));
        java.util.Objects.requireNonNull(tArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return tArr2;
    }

    public static boolean[] add(boolean[] zArr, int i, boolean z) {
        boolean[] zArr2 = (boolean[]) realAdd(zArr, i, java.lang.Boolean.valueOf(z), java.lang.Boolean.TYPE);
        java.util.Objects.requireNonNull(zArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return zArr2;
    }

    public static char[] add(char[] cArr, int i, char c) {
        char[] cArr2 = (char[]) realAdd(cArr, i, java.lang.Character.valueOf(c), java.lang.Character.TYPE);
        java.util.Objects.requireNonNull(cArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return cArr2;
    }

    public static byte[] add(byte[] bArr, int i, byte b) {
        byte[] bArr2 = (byte[]) realAdd(bArr, i, java.lang.Byte.valueOf(b), java.lang.Byte.TYPE);
        java.util.Objects.requireNonNull(bArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return bArr2;
    }

    public static short[] add(short[] sArr, int i, short s) {
        short[] sArr2 = (short[]) realAdd(sArr, i, java.lang.Short.valueOf(s), java.lang.Short.TYPE);
        java.util.Objects.requireNonNull(sArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return sArr2;
    }

    public static int[] add(int[] iArr, int i, int i2) {
        int[] iArr2 = (int[]) realAdd(iArr, i, java.lang.Integer.valueOf(i2), java.lang.Integer.TYPE);
        java.util.Objects.requireNonNull(iArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return iArr2;
    }

    public static long[] add(long[] jArr, int i, long j) {
        long[] jArr2 = (long[]) realAdd(jArr, i, java.lang.Long.valueOf(j), java.lang.Long.TYPE);
        java.util.Objects.requireNonNull(jArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return jArr2;
    }

    public static float[] add(float[] fArr, int i, float f) {
        float[] fArr2 = (float[]) realAdd(fArr, i, java.lang.Float.valueOf(f), java.lang.Float.TYPE);
        java.util.Objects.requireNonNull(fArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return fArr2;
    }

    public static double[] add(double[] dArr, int i, double d) {
        double[] dArr2 = (double[]) realAdd(dArr, i, java.lang.Double.valueOf(d), java.lang.Double.TYPE);
        java.util.Objects.requireNonNull(dArr2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
        return dArr2;
    }

    private static java.lang.Object realAdd(java.lang.Object obj, int i, java.lang.Object obj2, java.lang.Class cls) {
        if (obj == null) {
            if (i != 0) {
                throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Length: 0");
            }
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj2);
            java.util.Objects.requireNonNull(newInstance, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.realAdd() marked by @androidx.annotation.NonNull");
            return newInstance;
        }
        int length = java.lang.reflect.Array.getLength(obj);
        if (i > length || i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Length: " + length);
        }
        java.lang.Object newInstance2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, length + 1);
        java.lang.System.arraycopy(obj, 0, newInstance2, 0, i);
        java.lang.reflect.Array.set(newInstance2, i, obj2);
        if (i < length) {
            java.lang.System.arraycopy(obj, i, newInstance2, i + 1, length - i);
        }
        java.util.Objects.requireNonNull(newInstance2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.realAdd() marked by @androidx.annotation.NonNull");
        return newInstance2;
    }

    public static java.lang.Object[] remove(java.lang.Object[] objArr, int i) {
        if (objArr == null) {
            return null;
        }
        return (java.lang.Object[]) remove((java.lang.Object) objArr, i);
    }

    public static java.lang.Object[] removeElement(java.lang.Object[] objArr, java.lang.Object obj) {
        int indexOf = indexOf(objArr, obj);
        if (indexOf == -1) {
            return copy(objArr);
        }
        return remove(objArr, indexOf);
    }

    public static boolean[] remove(boolean[] zArr, int i) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) remove((java.lang.Object) zArr, i);
    }

    public static boolean[] removeElement(boolean[] zArr, boolean z) {
        int indexOf = indexOf(zArr, z);
        if (indexOf == -1) {
            return copy(zArr);
        }
        return remove(zArr, indexOf);
    }

    public static byte[] remove(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) remove((java.lang.Object) bArr, i);
    }

    public static byte[] removeElement(byte[] bArr, byte b) {
        int indexOf = indexOf(bArr, b);
        if (indexOf == -1) {
            return copy(bArr);
        }
        return remove(bArr, indexOf);
    }

    public static char[] remove(char[] cArr, int i) {
        if (cArr == null) {
            return null;
        }
        return (char[]) remove((java.lang.Object) cArr, i);
    }

    public static char[] removeElement(char[] cArr, char c) {
        int indexOf = indexOf(cArr, c);
        if (indexOf == -1) {
            return copy(cArr);
        }
        return remove(cArr, indexOf);
    }

    public static double[] remove(double[] dArr, int i) {
        if (dArr == null) {
            return null;
        }
        return (double[]) remove((java.lang.Object) dArr, i);
    }

    public static double[] removeElement(double[] dArr, double d) {
        int indexOf = indexOf(dArr, d);
        if (indexOf == -1) {
            return copy(dArr);
        }
        return remove(dArr, indexOf);
    }

    public static float[] remove(float[] fArr, int i) {
        if (fArr == null) {
            return null;
        }
        return (float[]) remove((java.lang.Object) fArr, i);
    }

    public static float[] removeElement(float[] fArr, float f) {
        int indexOf = indexOf(fArr, f);
        if (indexOf == -1) {
            return copy(fArr);
        }
        return remove(fArr, indexOf);
    }

    public static int[] remove(int[] iArr, int i) {
        if (iArr == null) {
            return null;
        }
        return (int[]) remove((java.lang.Object) iArr, i);
    }

    public static int[] removeElement(int[] iArr, int i) {
        int indexOf = indexOf(iArr, i);
        if (indexOf == -1) {
            return copy(iArr);
        }
        return remove(iArr, indexOf);
    }

    public static long[] remove(long[] jArr, int i) {
        if (jArr == null) {
            return null;
        }
        return (long[]) remove((java.lang.Object) jArr, i);
    }

    public static long[] removeElement(long[] jArr, long j) {
        int indexOf = indexOf(jArr, j);
        if (indexOf == -1) {
            return copy(jArr);
        }
        return remove(jArr, indexOf);
    }

    public static short[] remove(short[] sArr, int i) {
        if (sArr == null) {
            return null;
        }
        return (short[]) remove((java.lang.Object) sArr, i);
    }

    public static short[] removeElement(short[] sArr, short s) {
        int indexOf = indexOf(sArr, s);
        if (indexOf == -1) {
            return copy(sArr);
        }
        return remove(sArr, indexOf);
    }

    private static java.lang.Object remove(java.lang.Object obj, int i) {
        java.util.Objects.requireNonNull(obj, "Argument 'array' of type Object (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        int length = getLength(obj);
        if (i < 0 || i >= length) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Length: " + length);
        }
        int i2 = length - 1;
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance(obj.getClass().getComponentType(), i2);
        java.lang.System.arraycopy(obj, 0, newInstance, 0, i);
        if (i < i2) {
            java.lang.System.arraycopy(obj, i + 1, newInstance, i, (length - i) - 1);
        }
        java.util.Objects.requireNonNull(newInstance, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.remove() marked by @androidx.annotation.NonNull");
        return newInstance;
    }

    public static int indexOf(java.lang.Object[] objArr, java.lang.Object obj) {
        return indexOf(objArr, obj, 0);
    }

    public static int indexOf(java.lang.Object[] objArr, java.lang.Object obj, int i) {
        if (objArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        if (obj == null) {
            while (i < objArr.length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < objArr.length) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static int lastIndexOf(java.lang.Object[] objArr, java.lang.Object obj) {
        return lastIndexOf(objArr, obj, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(java.lang.Object[] objArr, java.lang.Object obj, int i) {
        if (objArr == null || i < 0) {
            return -1;
        }
        if (i >= objArr.length) {
            i = objArr.length - 1;
        }
        if (obj == null) {
            while (i >= 0) {
                if (objArr[i] == null) {
                    return i;
                }
                i--;
            }
        } else {
            while (i >= 0) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i--;
            }
        }
        return -1;
    }

    public static boolean contains(java.lang.Object[] objArr, java.lang.Object obj) {
        return indexOf(objArr, obj) != -1;
    }

    public static int indexOf(long[] jArr, long j) {
        return indexOf(jArr, j, 0);
    }

    public static int indexOf(long[] jArr, long j, int i) {
        if (jArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < jArr.length) {
            if (j == jArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int lastIndexOf(long[] jArr, long j) {
        return lastIndexOf(jArr, j, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(long[] jArr, long j, int i) {
        if (jArr == null || i < 0) {
            return -1;
        }
        if (i >= jArr.length) {
            i = jArr.length - 1;
        }
        while (i >= 0) {
            if (j == jArr[i]) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static boolean contains(long[] jArr, long j) {
        return indexOf(jArr, j) != -1;
    }

    public static int indexOf(int[] iArr, int i) {
        return indexOf(iArr, i, 0);
    }

    public static int indexOf(int[] iArr, int i, int i2) {
        if (iArr == null) {
            return -1;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < iArr.length) {
            if (i == iArr[i2]) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int lastIndexOf(int[] iArr, int i) {
        return lastIndexOf(iArr, i, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(int[] iArr, int i, int i2) {
        if (iArr == null || i2 < 0) {
            return -1;
        }
        if (i2 >= iArr.length) {
            i2 = iArr.length - 1;
        }
        while (i2 >= 0) {
            if (i == iArr[i2]) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public static boolean contains(int[] iArr, int i) {
        return indexOf(iArr, i) != -1;
    }

    public static int indexOf(short[] sArr, short s) {
        return indexOf(sArr, s, 0);
    }

    public static int indexOf(short[] sArr, short s, int i) {
        if (sArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < sArr.length) {
            if (s == sArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int lastIndexOf(short[] sArr, short s) {
        return lastIndexOf(sArr, s, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(short[] sArr, short s, int i) {
        if (sArr == null || i < 0) {
            return -1;
        }
        if (i >= sArr.length) {
            i = sArr.length - 1;
        }
        while (i >= 0) {
            if (s == sArr[i]) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static boolean contains(short[] sArr, short s) {
        return indexOf(sArr, s) != -1;
    }

    public static int indexOf(char[] cArr, char c) {
        return indexOf(cArr, c, 0);
    }

    public static int indexOf(char[] cArr, char c, int i) {
        if (cArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < cArr.length) {
            if (c == cArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int lastIndexOf(char[] cArr, char c) {
        return lastIndexOf(cArr, c, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(char[] cArr, char c, int i) {
        if (cArr == null || i < 0) {
            return -1;
        }
        if (i >= cArr.length) {
            i = cArr.length - 1;
        }
        while (i >= 0) {
            if (c == cArr[i]) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static boolean contains(char[] cArr, char c) {
        return indexOf(cArr, c) != -1;
    }

    public static int indexOf(byte[] bArr, byte b) {
        return indexOf(bArr, b, 0);
    }

    public static int indexOf(byte[] bArr, byte b, int i) {
        if (bArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < bArr.length) {
            if (b == bArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int lastIndexOf(byte[] bArr, byte b) {
        return lastIndexOf(bArr, b, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(byte[] bArr, byte b, int i) {
        if (bArr == null || i < 0) {
            return -1;
        }
        if (i >= bArr.length) {
            i = bArr.length - 1;
        }
        while (i >= 0) {
            if (b == bArr[i]) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static boolean contains(byte[] bArr, byte b) {
        return indexOf(bArr, b) != -1;
    }

    public static int indexOf(double[] dArr, double d) {
        return indexOf(dArr, d, 0);
    }

    public static int indexOf(double[] dArr, double d, double d2) {
        return indexOf(dArr, d, 0, d2);
    }

    public static int indexOf(double[] dArr, double d, int i) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < dArr.length) {
            if (d == dArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int indexOf(double[] dArr, double d, int i, double d2) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        double d3 = d - d2;
        double d4 = d + d2;
        while (i < dArr.length) {
            if (dArr[i] >= d3 && dArr[i] <= d4) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int lastIndexOf(double[] dArr, double d) {
        return lastIndexOf(dArr, d, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(double[] dArr, double d, double d2) {
        return lastIndexOf(dArr, d, Integer.MAX_VALUE, d2);
    }

    public static int lastIndexOf(double[] dArr, double d, int i) {
        if (isEmpty(dArr) || i < 0) {
            return -1;
        }
        if (i >= dArr.length) {
            i = dArr.length - 1;
        }
        while (i >= 0) {
            if (d == dArr[i]) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int lastIndexOf(double[] dArr, double d, int i, double d2) {
        if (isEmpty(dArr) || i < 0) {
            return -1;
        }
        if (i >= dArr.length) {
            i = dArr.length - 1;
        }
        double d3 = d - d2;
        double d4 = d + d2;
        while (i >= 0) {
            if (dArr[i] >= d3 && dArr[i] <= d4) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static boolean contains(double[] dArr, double d) {
        return indexOf(dArr, d) != -1;
    }

    public static boolean contains(double[] dArr, double d, double d2) {
        return indexOf(dArr, d, 0, d2) != -1;
    }

    public static int indexOf(float[] fArr, float f) {
        return indexOf(fArr, f, 0);
    }

    public static int indexOf(float[] fArr, float f, int i) {
        if (isEmpty(fArr)) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < fArr.length) {
            if (f == fArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int lastIndexOf(float[] fArr, float f) {
        return lastIndexOf(fArr, f, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(float[] fArr, float f, int i) {
        if (isEmpty(fArr) || i < 0) {
            return -1;
        }
        if (i >= fArr.length) {
            i = fArr.length - 1;
        }
        while (i >= 0) {
            if (f == fArr[i]) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static boolean contains(float[] fArr, float f) {
        return indexOf(fArr, f) != -1;
    }

    public static int indexOf(boolean[] zArr, boolean z) {
        return indexOf(zArr, z, 0);
    }

    public static int indexOf(boolean[] zArr, boolean z, int i) {
        if (isEmpty(zArr)) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < zArr.length) {
            if (z == zArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int lastIndexOf(boolean[] zArr, boolean z) {
        return lastIndexOf(zArr, z, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(boolean[] zArr, boolean z, int i) {
        if (isEmpty(zArr) || i < 0) {
            return -1;
        }
        if (i >= zArr.length) {
            i = zArr.length - 1;
        }
        while (i >= 0) {
            if (z == zArr[i]) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static boolean contains(boolean[] zArr, boolean z) {
        return indexOf(zArr, z) != -1;
    }

    public static char[] toPrimitive(java.lang.Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int i = 0; i < chArr.length; i++) {
            cArr[i] = chArr[i].charValue();
        }
        return cArr;
    }

    public static char[] toPrimitive(java.lang.Character[] chArr, char c) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int i = 0; i < chArr.length; i++) {
            java.lang.Character ch = chArr[i];
            cArr[i] = ch == null ? c : ch.charValue();
        }
        return cArr;
    }

    public static java.lang.Character[] toObject(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return new java.lang.Character[0];
        }
        java.lang.Character[] chArr = new java.lang.Character[cArr.length];
        for (int i = 0; i < cArr.length; i++) {
            chArr[i] = new java.lang.Character(cArr[i]);
        }
        return chArr;
    }

    public static long[] toPrimitive(java.lang.Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i = 0; i < lArr.length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }

    public static long[] toPrimitive(java.lang.Long[] lArr, long j) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i = 0; i < lArr.length; i++) {
            java.lang.Long l = lArr[i];
            jArr[i] = l == null ? j : l.longValue();
        }
        return jArr;
    }

    public static java.lang.Long[] toObject(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return new java.lang.Long[0];
        }
        java.lang.Long[] lArr = new java.lang.Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = new java.lang.Long(jArr[i]);
        }
        return lArr;
    }

    public static int[] toPrimitive(java.lang.Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] iArr = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public static int[] toPrimitive(java.lang.Integer[] numArr, int i) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] iArr = new int[numArr.length];
        for (int i2 = 0; i2 < numArr.length; i2++) {
            java.lang.Integer num = numArr[i2];
            iArr[i2] = num == null ? i : num.intValue();
        }
        return iArr;
    }

    public static java.lang.Integer[] toObject(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return new java.lang.Integer[0];
        }
        java.lang.Integer[] numArr = new java.lang.Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = new java.lang.Integer(iArr[i]);
        }
        return numArr;
    }

    public static short[] toPrimitive(java.lang.Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int i = 0; i < shArr.length; i++) {
            sArr[i] = shArr[i].shortValue();
        }
        return sArr;
    }

    public static short[] toPrimitive(java.lang.Short[] shArr, short s) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int i = 0; i < shArr.length; i++) {
            java.lang.Short sh = shArr[i];
            sArr[i] = sh == null ? s : sh.shortValue();
        }
        return sArr;
    }

    public static java.lang.Short[] toObject(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return new java.lang.Short[0];
        }
        java.lang.Short[] shArr = new java.lang.Short[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            shArr[i] = new java.lang.Short(sArr[i]);
        }
        return shArr;
    }

    public static byte[] toPrimitive(java.lang.Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[i].byteValue();
        }
        return bArr2;
    }

    public static byte[] toPrimitive(java.lang.Byte[] bArr, byte b) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            java.lang.Byte b2 = bArr[i];
            bArr2[i] = b2 == null ? b : b2.byteValue();
        }
        return bArr2;
    }

    public static java.lang.Byte[] toObject(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new java.lang.Byte[0];
        }
        java.lang.Byte[] bArr2 = new java.lang.Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new java.lang.Byte(bArr[i]);
        }
        return bArr2;
    }

    public static double[] toPrimitive(java.lang.Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = dArr[i].doubleValue();
        }
        return dArr2;
    }

    public static double[] toPrimitive(java.lang.Double[] dArr, double d) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            java.lang.Double d2 = dArr[i];
            dArr2[i] = d2 == null ? d : d2.doubleValue();
        }
        return dArr2;
    }

    public static java.lang.Double[] toObject(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new java.lang.Double[0];
        }
        java.lang.Double[] dArr2 = new java.lang.Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = new java.lang.Double(dArr[i]);
        }
        return dArr2;
    }

    public static float[] toPrimitive(java.lang.Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = fArr[i].floatValue();
        }
        return fArr2;
    }

    public static float[] toPrimitive(java.lang.Float[] fArr, float f) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            java.lang.Float f2 = fArr[i];
            fArr2[i] = f2 == null ? f : f2.floatValue();
        }
        return fArr2;
    }

    public static java.lang.Float[] toObject(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new java.lang.Float[0];
        }
        java.lang.Float[] fArr2 = new java.lang.Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = new java.lang.Float(fArr[i]);
        }
        return fArr2;
    }

    public static boolean[] toPrimitive(java.lang.Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i = 0; i < boolArr.length; i++) {
            zArr[i] = boolArr[i].booleanValue();
        }
        return zArr;
    }

    public static boolean[] toPrimitive(java.lang.Boolean[] boolArr, boolean z) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i = 0; i < boolArr.length; i++) {
            java.lang.Boolean bool = boolArr[i];
            zArr[i] = bool == null ? z : bool.booleanValue();
        }
        return zArr;
    }

    public static java.lang.Boolean[] toObject(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return new java.lang.Boolean[0];
        }
        java.lang.Boolean[] boolArr = new java.lang.Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = zArr[i] ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return boolArr;
    }

    public static <T> java.util.List<T> asList(T... tArr) {
        if (tArr == null || tArr.length == 0) {
            java.util.List<T> emptyList = java.util.Collections.emptyList();
            java.util.Objects.requireNonNull(emptyList, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.asList() marked by @androidx.annotation.NonNull");
            return emptyList;
        }
        java.util.List<T> asList = java.util.Arrays.asList(tArr);
        java.util.Objects.requireNonNull(asList, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.asList() marked by @androidx.annotation.NonNull");
        return asList;
    }

    public static <T> java.util.List<T> asUnmodifiableList(T... tArr) {
        java.util.List<T> unmodifiableList = java.util.Collections.unmodifiableList(asList(tArr));
        java.util.Objects.requireNonNull(unmodifiableList, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.asUnmodifiableList() marked by @androidx.annotation.NonNull");
        return unmodifiableList;
    }

    public static <T> java.util.List<T> asArrayList(T... tArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (tArr != null && tArr.length != 0) {
            arrayList.addAll(java.util.Arrays.asList(tArr));
        }
        return arrayList;
    }

    public static <T> java.util.List<T> asLinkedList(T... tArr) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (tArr != null && tArr.length != 0) {
            linkedList.addAll(java.util.Arrays.asList(tArr));
        }
        return linkedList;
    }

    public static <T> void sort(T[] tArr, java.util.Comparator<? super T> comparator) {
        if (tArr == null || tArr.length < 2) {
            return;
        }
        java.util.Arrays.sort(tArr, comparator);
    }

    public static void sort(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return;
        }
        java.util.Arrays.sort(bArr);
    }

    public static void sort(char[] cArr) {
        if (cArr == null || cArr.length < 2) {
            return;
        }
        java.util.Arrays.sort(cArr);
    }

    public static void sort(double[] dArr) {
        if (dArr == null || dArr.length < 2) {
            return;
        }
        java.util.Arrays.sort(dArr);
    }

    public static void sort(float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            return;
        }
        java.util.Arrays.sort(fArr);
    }

    public static void sort(int[] iArr) {
        if (iArr == null || iArr.length < 2) {
            return;
        }
        java.util.Arrays.sort(iArr);
    }

    public static void sort(long[] jArr) {
        if (jArr == null || jArr.length < 2) {
            return;
        }
        java.util.Arrays.sort(jArr);
    }

    public static void sort(short[] sArr) {
        if (sArr == null || sArr.length < 2) {
            return;
        }
        java.util.Arrays.sort(sArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void forAllDo(java.lang.Object obj, com.blankj.utilcode.util.ArrayUtils.Closure<E> closure) {
        if (obj == null || closure == 0) {
            return;
        }
        int i = 0;
        if (obj instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            int length = objArr.length;
            while (i < length) {
                closure.execute(i, objArr[i]);
                i++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length2 = zArr.length;
            while (i < length2) {
                closure.execute(i, zArr[i] ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
                i++;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length3 = bArr.length;
            while (i < length3) {
                closure.execute(i, java.lang.Byte.valueOf(bArr[i]));
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length4 = cArr.length;
            while (i < length4) {
                closure.execute(i, java.lang.Character.valueOf(cArr[i]));
                i++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length5 = sArr.length;
            while (i < length5) {
                closure.execute(i, java.lang.Short.valueOf(sArr[i]));
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length6 = iArr.length;
            while (i < length6) {
                closure.execute(i, java.lang.Integer.valueOf(iArr[i]));
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length7 = jArr.length;
            while (i < length7) {
                closure.execute(i, java.lang.Long.valueOf(jArr[i]));
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length8 = fArr.length;
            while (i < length8) {
                closure.execute(i, java.lang.Float.valueOf(fArr[i]));
                i++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length9 = dArr.length;
            while (i < length9) {
                closure.execute(i, java.lang.Double.valueOf(dArr[i]));
                i++;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Not an array: " + obj.getClass());
    }

    public static java.lang.String toString(java.lang.Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof java.lang.Object[]) {
            java.lang.String deepToString = java.util.Arrays.deepToString((java.lang.Object[]) obj);
            java.util.Objects.requireNonNull(deepToString, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
            return deepToString;
        }
        if (obj instanceof boolean[]) {
            java.lang.String arrays = java.util.Arrays.toString((boolean[]) obj);
            java.util.Objects.requireNonNull(arrays, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
            return arrays;
        }
        if (obj instanceof byte[]) {
            java.lang.String arrays2 = java.util.Arrays.toString((byte[]) obj);
            java.util.Objects.requireNonNull(arrays2, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
            return arrays2;
        }
        if (obj instanceof char[]) {
            java.lang.String arrays3 = java.util.Arrays.toString((char[]) obj);
            java.util.Objects.requireNonNull(arrays3, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
            return arrays3;
        }
        if (obj instanceof double[]) {
            java.lang.String arrays4 = java.util.Arrays.toString((double[]) obj);
            java.util.Objects.requireNonNull(arrays4, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
            return arrays4;
        }
        if (obj instanceof float[]) {
            java.lang.String arrays5 = java.util.Arrays.toString((float[]) obj);
            java.util.Objects.requireNonNull(arrays5, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
            return arrays5;
        }
        if (obj instanceof int[]) {
            java.lang.String arrays6 = java.util.Arrays.toString((int[]) obj);
            java.util.Objects.requireNonNull(arrays6, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
            return arrays6;
        }
        if (obj instanceof long[]) {
            java.lang.String arrays7 = java.util.Arrays.toString((long[]) obj);
            java.util.Objects.requireNonNull(arrays7, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
            return arrays7;
        }
        if (obj instanceof short[]) {
            java.lang.String arrays8 = java.util.Arrays.toString((short[]) obj);
            java.util.Objects.requireNonNull(arrays8, "Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
            return arrays8;
        }
        throw new java.lang.IllegalArgumentException("Array has incompatible type: " + obj.getClass());
    }
}
