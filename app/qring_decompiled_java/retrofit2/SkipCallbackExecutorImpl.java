package retrofit2;

/* loaded from: classes3.dex */
final class SkipCallbackExecutorImpl implements retrofit2.SkipCallbackExecutor {
    private static final retrofit2.SkipCallbackExecutor INSTANCE = new retrofit2.SkipCallbackExecutorImpl();

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    SkipCallbackExecutorImpl() {
    }

    static java.lang.annotation.Annotation[] ensurePresent(java.lang.annotation.Annotation[] annotationArr) {
        if (retrofit2.Utils.isAnnotationPresent(annotationArr, retrofit2.SkipCallbackExecutor.class)) {
            return annotationArr;
        }
        java.lang.annotation.Annotation[] annotationArr2 = new java.lang.annotation.Annotation[annotationArr.length + 1];
        annotationArr2[0] = INSTANCE;
        java.lang.System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public java.lang.Class<? extends java.lang.annotation.Annotation> annotationType() {
        return retrofit2.SkipCallbackExecutor.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(java.lang.Object obj) {
        return obj instanceof retrofit2.SkipCallbackExecutor;
    }

    @Override // java.lang.annotation.Annotation
    public java.lang.String toString() {
        return "@" + retrofit2.SkipCallbackExecutor.class.getName() + "()";
    }
}
