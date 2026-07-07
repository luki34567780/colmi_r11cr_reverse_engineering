package retrofit2;

/* loaded from: classes3.dex */
public final class Invocation {
    private final java.util.List<?> arguments;
    private final java.lang.reflect.Method method;

    public static retrofit2.Invocation of(java.lang.reflect.Method method, java.util.List<?> list) {
        java.util.Objects.requireNonNull(method, "method == null");
        java.util.Objects.requireNonNull(list, "arguments == null");
        return new retrofit2.Invocation(method, new java.util.ArrayList(list));
    }

    Invocation(java.lang.reflect.Method method, java.util.List<?> list) {
        this.method = method;
        this.arguments = java.util.Collections.unmodifiableList(list);
    }

    public java.lang.reflect.Method method() {
        return this.method;
    }

    public java.util.List<?> arguments() {
        return this.arguments;
    }

    public java.lang.String toString() {
        return java.lang.String.format("%s.%s() %s", this.method.getDeclaringClass().getName(), this.method.getName(), this.arguments);
    }
}
