package androidx.core.view;

/* loaded from: classes.dex */
public final class LayoutInflaterCompat {
    private static final java.lang.String TAG = "LayoutInflaterCompatHC";
    private static boolean sCheckedField;
    private static java.lang.reflect.Field sLayoutInflaterFactory2Field;

    static class Factory2Wrapper implements android.view.LayoutInflater.Factory2 {
        final androidx.core.view.LayoutInflaterFactory mDelegateFactory;

        Factory2Wrapper(androidx.core.view.LayoutInflaterFactory layoutInflaterFactory) {
            this.mDelegateFactory = layoutInflaterFactory;
        }

        @Override // android.view.LayoutInflater.Factory
        public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
            return this.mDelegateFactory.onCreateView(null, str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory2
        public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
            return this.mDelegateFactory.onCreateView(view, str, context, attributeSet);
        }

        public java.lang.String toString() {
            return getClass().getName() + "{" + this.mDelegateFactory + "}";
        }
    }

    private static void forceSetFactory2(android.view.LayoutInflater layoutInflater, android.view.LayoutInflater.Factory2 factory2) {
        if (!sCheckedField) {
            try {
                java.lang.reflect.Field declaredField = android.view.LayoutInflater.class.getDeclaredField("mFactory2");
                sLayoutInflaterFactory2Field = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e) {
                android.util.Log.e(TAG, "forceSetFactory2 Could not find field 'mFactory2' on class " + android.view.LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            sCheckedField = true;
        }
        java.lang.reflect.Field field = sLayoutInflaterFactory2Field;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (java.lang.IllegalAccessException e2) {
                android.util.Log.e(TAG, "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    private LayoutInflaterCompat() {
    }

    @java.lang.Deprecated
    public static void setFactory(android.view.LayoutInflater layoutInflater, androidx.core.view.LayoutInflaterFactory layoutInflaterFactory) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            layoutInflater.setFactory2(layoutInflaterFactory != null ? new androidx.core.view.LayoutInflaterCompat.Factory2Wrapper(layoutInflaterFactory) : null);
            return;
        }
        androidx.core.view.LayoutInflaterCompat.Factory2Wrapper factory2Wrapper = layoutInflaterFactory != null ? new androidx.core.view.LayoutInflaterCompat.Factory2Wrapper(layoutInflaterFactory) : null;
        layoutInflater.setFactory2(factory2Wrapper);
        android.view.LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof android.view.LayoutInflater.Factory2) {
            forceSetFactory2(layoutInflater, (android.view.LayoutInflater.Factory2) factory);
        } else {
            forceSetFactory2(layoutInflater, factory2Wrapper);
        }
    }

    public static void setFactory2(android.view.LayoutInflater layoutInflater, android.view.LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (android.os.Build.VERSION.SDK_INT < 21) {
            android.view.LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof android.view.LayoutInflater.Factory2) {
                forceSetFactory2(layoutInflater, (android.view.LayoutInflater.Factory2) factory);
            } else {
                forceSetFactory2(layoutInflater, factory2);
            }
        }
    }

    @java.lang.Deprecated
    public static androidx.core.view.LayoutInflaterFactory getFactory(android.view.LayoutInflater layoutInflater) {
        android.view.LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof androidx.core.view.LayoutInflaterCompat.Factory2Wrapper) {
            return ((androidx.core.view.LayoutInflaterCompat.Factory2Wrapper) factory).mDelegateFactory;
        }
        return null;
    }
}
