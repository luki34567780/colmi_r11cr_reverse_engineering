package androidx.camera.core.impl;

/* loaded from: classes.dex */
final class AutoValue_Config_Option<T> extends androidx.camera.core.impl.Config.Option<T> {
    private final java.lang.String id;
    private final java.lang.Object token;
    private final java.lang.Class<T> valueClass;

    AutoValue_Config_Option(java.lang.String id, java.lang.Class<T> valueClass, java.lang.Object token) {
        java.util.Objects.requireNonNull(id, "Null id");
        this.id = id;
        java.util.Objects.requireNonNull(valueClass, "Null valueClass");
        this.valueClass = valueClass;
        this.token = token;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public java.lang.String getId() {
        return this.id;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public java.lang.Class<T> getValueClass() {
        return this.valueClass;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public java.lang.Object getToken() {
        return this.token;
    }

    public java.lang.String toString() {
        return "Option{id=" + this.id + ", valueClass=" + this.valueClass + ", token=" + this.token + "}";
    }

    public boolean equals(java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof androidx.camera.core.impl.Config.Option)) {
            return false;
        }
        androidx.camera.core.impl.Config.Option option = (androidx.camera.core.impl.Config.Option) o;
        if (this.id.equals(option.getId()) && this.valueClass.equals(option.getValueClass())) {
            java.lang.Object obj = this.token;
            if (obj == null) {
                if (option.getToken() == null) {
                    return true;
                }
            } else if (obj.equals(option.getToken())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.id.hashCode() ^ 1000003) * 1000003) ^ this.valueClass.hashCode()) * 1000003;
        java.lang.Object obj = this.token;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }
}
