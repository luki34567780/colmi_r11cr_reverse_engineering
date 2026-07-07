package androidx.core.os;

/* compiled from: Bundle.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"bundleOf", "Landroid/os/Bundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BundleKt {
    public static final android.os.Bundle bundleOf(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "pairs");
        android.os.Bundle bundle = new android.os.Bundle(pairs.length);
        int length = pairs.length;
        int i = 0;
        while (i < length) {
            kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair = pairs[i];
            i++;
            java.lang.String component1 = pair.component1();
            java.lang.Object component2 = pair.component2();
            if (component2 == null) {
                bundle.putString(component1, null);
            } else if (component2 instanceof java.lang.Boolean) {
                bundle.putBoolean(component1, ((java.lang.Boolean) component2).booleanValue());
            } else if (component2 instanceof java.lang.Byte) {
                bundle.putByte(component1, ((java.lang.Number) component2).byteValue());
            } else if (component2 instanceof java.lang.Character) {
                bundle.putChar(component1, ((java.lang.Character) component2).charValue());
            } else if (component2 instanceof java.lang.Double) {
                bundle.putDouble(component1, ((java.lang.Number) component2).doubleValue());
            } else if (component2 instanceof java.lang.Float) {
                bundle.putFloat(component1, ((java.lang.Number) component2).floatValue());
            } else if (component2 instanceof java.lang.Integer) {
                bundle.putInt(component1, ((java.lang.Number) component2).intValue());
            } else if (component2 instanceof java.lang.Long) {
                bundle.putLong(component1, ((java.lang.Number) component2).longValue());
            } else if (component2 instanceof java.lang.Short) {
                bundle.putShort(component1, ((java.lang.Number) component2).shortValue());
            } else if (component2 instanceof android.os.Bundle) {
                bundle.putBundle(component1, (android.os.Bundle) component2);
            } else if (component2 instanceof java.lang.CharSequence) {
                bundle.putCharSequence(component1, (java.lang.CharSequence) component2);
            } else if (component2 instanceof android.os.Parcelable) {
                bundle.putParcelable(component1, (android.os.Parcelable) component2);
            } else if (component2 instanceof boolean[]) {
                bundle.putBooleanArray(component1, (boolean[]) component2);
            } else if (component2 instanceof byte[]) {
                bundle.putByteArray(component1, (byte[]) component2);
            } else if (component2 instanceof char[]) {
                bundle.putCharArray(component1, (char[]) component2);
            } else if (component2 instanceof double[]) {
                bundle.putDoubleArray(component1, (double[]) component2);
            } else if (component2 instanceof float[]) {
                bundle.putFloatArray(component1, (float[]) component2);
            } else if (component2 instanceof int[]) {
                bundle.putIntArray(component1, (int[]) component2);
            } else if (component2 instanceof long[]) {
                bundle.putLongArray(component1, (long[]) component2);
            } else if (component2 instanceof short[]) {
                bundle.putShortArray(component1, (short[]) component2);
            } else if (component2 instanceof java.lang.Object[]) {
                java.lang.Class<?> componentType = component2.getClass().getComponentType();
                kotlin.jvm.internal.Intrinsics.checkNotNull(componentType);
                if (android.os.Parcelable.class.isAssignableFrom(componentType)) {
                    java.util.Objects.requireNonNull(component2, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(component1, (android.os.Parcelable[]) component2);
                } else if (java.lang.String.class.isAssignableFrom(componentType)) {
                    java.util.Objects.requireNonNull(component2, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(component1, (java.lang.String[]) component2);
                } else if (java.lang.CharSequence.class.isAssignableFrom(componentType)) {
                    java.util.Objects.requireNonNull(component2, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(component1, (java.lang.CharSequence[]) component2);
                } else if (java.io.Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(component1, (java.io.Serializable) component2);
                } else {
                    throw new java.lang.IllegalArgumentException("Illegal value array type " + ((java.lang.Object) componentType.getCanonicalName()) + " for key \"" + component1 + kotlin.text.Typography.quote);
                }
            } else if (component2 instanceof java.io.Serializable) {
                bundle.putSerializable(component1, (java.io.Serializable) component2);
            } else if (android.os.Build.VERSION.SDK_INT >= 18 && (component2 instanceof android.os.IBinder)) {
                bundle.putBinder(component1, (android.os.IBinder) component2);
            } else if (android.os.Build.VERSION.SDK_INT >= 21 && (component2 instanceof android.util.Size)) {
                bundle.putSize(component1, (android.util.Size) component2);
            } else if (android.os.Build.VERSION.SDK_INT >= 21 && (component2 instanceof android.util.SizeF)) {
                bundle.putSizeF(component1, (android.util.SizeF) component2);
            } else {
                throw new java.lang.IllegalArgumentException("Illegal value type " + ((java.lang.Object) component2.getClass().getCanonicalName()) + " for key \"" + component1 + kotlin.text.Typography.quote);
            }
        }
        return bundle;
    }
}
