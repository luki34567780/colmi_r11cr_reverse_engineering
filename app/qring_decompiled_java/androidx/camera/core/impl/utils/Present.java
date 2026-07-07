package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
final class Present<T> extends androidx.camera.core.impl.utils.Optional<T> {
    private static final long serialVersionUID = 0;
    private final T mReference;

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean isPresent() {
        return true;
    }

    Present(T reference) {
        this.mReference = reference;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T get() {
        return this.mReference;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T or(T defaultValue) {
        androidx.core.util.Preconditions.checkNotNull(defaultValue, "use Optional.orNull() instead of Optional.or(null)");
        return this.mReference;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public androidx.camera.core.impl.utils.Optional<T> or(androidx.camera.core.impl.utils.Optional<? extends T> secondChoice) {
        androidx.core.util.Preconditions.checkNotNull(secondChoice);
        return this;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T or(androidx.core.util.Supplier<? extends T> supplier) {
        androidx.core.util.Preconditions.checkNotNull(supplier);
        return this.mReference;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T orNull() {
        return this.mReference;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean equals(java.lang.Object object) {
        if (object instanceof androidx.camera.core.impl.utils.Present) {
            return this.mReference.equals(((androidx.camera.core.impl.utils.Present) object).mReference);
        }
        return false;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public int hashCode() {
        return this.mReference.hashCode() + 1502476572;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public java.lang.String toString() {
        return "Optional.of(" + this.mReference + ")";
    }
}
