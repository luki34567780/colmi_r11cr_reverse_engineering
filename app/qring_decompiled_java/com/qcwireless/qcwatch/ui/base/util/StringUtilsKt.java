package com.qcwireless.qcwatch.ui.base.util;

/* compiled from: StringUtils.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\u0007\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\b\u001a\u001a\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\f\u001a\u00020\r\u001a\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u0001¨\u0006\u0014"}, d2 = {"floatArrayToString", "", "floatArray", "", "intArrayToString", "intArray", "", "intListToString", "", "", "listToString1", "list", "separator", "", "stringToFloatArray", "s", "stringToFloatList", "", "stringToIntArray", "stringToIntList", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class StringUtilsKt {
    public static final java.lang.String intArrayToString(int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "intArray");
        if (iArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i : iArr) {
            sb.append(i);
            sb.append(",");
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        java.lang.String substring = sb2.substring(0, sb.length() - 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final int[] stringToIntArray(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "s");
        java.lang.String str2 = str;
        if (android.text.TextUtils.isEmpty(str2)) {
            return new int[0];
        }
        int length = str2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = kotlin.jvm.internal.Intrinsics.compare(str2.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        java.lang.Object[] array = new kotlin.text.Regex(",").split(str2.subSequence(i, length + 1).toString(), 0).toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        java.lang.String[] strArr = (java.lang.String[]) array;
        int[] iArr = new int[strArr.length];
        int length2 = strArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            java.lang.String str3 = strArr[i2];
            int length3 = str3.length() - 1;
            int i3 = 0;
            boolean z3 = false;
            while (i3 <= length3) {
                boolean z4 = kotlin.jvm.internal.Intrinsics.compare(str3.charAt(!z3 ? i3 : length3), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    }
                    length3--;
                } else if (z4) {
                    i3++;
                } else {
                    z3 = true;
                }
            }
            iArr[i2] = (int) java.lang.Float.parseFloat(str3.subSequence(i3, length3 + 1).toString());
        }
        return iArr;
    }

    public static final float[] stringToFloatArray(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "s");
        java.lang.String str2 = str;
        if (android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        int length = str2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = kotlin.jvm.internal.Intrinsics.compare(str2.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        java.lang.Object[] array = new kotlin.text.Regex(",").split(str2.subSequence(i, length + 1).toString(), 0).toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        java.lang.String[] strArr = (java.lang.String[]) array;
        float[] fArr = new float[strArr.length];
        int length2 = strArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            fArr[i2] = java.lang.Float.parseFloat(strArr[i2]);
        }
        return fArr;
    }

    public static final java.lang.String floatArrayToString(float[] fArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fArr, "floatArray");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (float f : fArr) {
            sb.append(f);
            sb.append(",");
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        java.lang.String substring = sb2.substring(0, sb.length() - 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final java.util.List<java.lang.Float> stringToFloatList(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "s");
        java.lang.String str2 = str;
        if (android.text.TextUtils.isEmpty(str2)) {
            return new java.util.ArrayList();
        }
        int length = str2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = kotlin.jvm.internal.Intrinsics.compare(str2.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        java.lang.Object[] array = new kotlin.text.Regex(",").split(str2.subSequence(i, length + 1).toString(), 0).toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str3 : (java.lang.String[]) array) {
            arrayList.add(java.lang.Float.valueOf(java.lang.Float.parseFloat(str3)));
        }
        return arrayList;
    }

    public static final java.util.List<java.lang.Integer> stringToIntList(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "s");
        java.lang.String str2 = str;
        if (android.text.TextUtils.isEmpty(str2)) {
            return new java.util.ArrayList();
        }
        int length = str2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = kotlin.jvm.internal.Intrinsics.compare(str2.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        java.lang.Object[] array = new kotlin.text.Regex(",").split(str2.subSequence(i, length + 1).toString(), 0).toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str3 : (java.lang.String[]) array) {
            arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str3)));
        }
        return arrayList;
    }

    public static final java.lang.String intListToString(java.util.List<java.lang.Integer> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "intArray");
        if (list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i).intValue());
            sb.append(",");
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        java.lang.String substring = sb2.substring(0, sb.length() - 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final java.lang.String listToString1(java.util.List<?> list, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i));
            sb.append(c);
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        java.lang.String substring = sb2.substring(0, sb.toString().length() - 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
