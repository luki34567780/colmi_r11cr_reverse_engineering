package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
final class Absent<T> extends androidx.camera.core.impl.utils.Optional<T> {
    static final androidx.camera.core.impl.utils.Absent<java.lang.Object> sInstance = new androidx.camera.core.impl.utils.Absent<>();
    private static final long serialVersionUID = 0;

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean equals(java.lang.Object object) {
        return object == this;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T orNull() {
        return null;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public java.lang.String toString() {
        return "Optional.absent()";
    }

    static <T> androidx.camera.core.impl.utils.Optional<T> withType() {
        return sInstance;
    }

    private Absent() {
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T get() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T or(T t) {
        return (T) androidx.core.util.Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public androidx.camera.core.impl.utils.Optional<T> or(androidx.camera.core.impl.utils.Optional<? extends T> secondChoice) {
        return (androidx.camera.core.impl.utils.Optional) androidx.core.util.Preconditions.checkNotNull(secondChoice);
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T or(androidx.core.util.Supplier<? extends T> supplier) {
        return (T) androidx.core.util.Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    private java.lang.Object readResolve() {
        return sInstance;
    }
}
