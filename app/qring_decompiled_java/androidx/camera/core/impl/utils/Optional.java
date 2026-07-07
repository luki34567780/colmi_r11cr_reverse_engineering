package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
public abstract class Optional<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;

    public abstract boolean equals(java.lang.Object object);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract androidx.camera.core.impl.utils.Optional<T> or(androidx.camera.core.impl.utils.Optional<? extends T> secondChoice);

    public abstract T or(androidx.core.util.Supplier<? extends T> supplier);

    public abstract T or(T defaultValue);

    public abstract T orNull();

    public abstract java.lang.String toString();

    public static <T> androidx.camera.core.impl.utils.Optional<T> absent() {
        return androidx.camera.core.impl.utils.Absent.withType();
    }

    public static <T> androidx.camera.core.impl.utils.Optional<T> of(T reference) {
        return new androidx.camera.core.impl.utils.Present(androidx.core.util.Preconditions.checkNotNull(reference));
    }

    public static <T> androidx.camera.core.impl.utils.Optional<T> fromNullable(T nullableReference) {
        return nullableReference == null ? absent() : new androidx.camera.core.impl.utils.Present(nullableReference);
    }

    Optional() {
    }
}
