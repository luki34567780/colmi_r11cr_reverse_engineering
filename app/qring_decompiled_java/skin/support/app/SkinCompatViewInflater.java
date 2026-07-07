package skin.support.app;

/* loaded from: classes3.dex */
public class SkinCompatViewInflater {
    private final java.lang.Object[] mConstructorArgs = new java.lang.Object[2];
    private static final java.lang.Class<?>[] sConstructorSignature = {android.content.Context.class, android.util.AttributeSet.class};
    private static final int[] sOnClickAttrs = {android.R.attr.onClick};
    private static final java.lang.String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final java.util.Map<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> sConstructorMap = new skin.support.collection.ArrayMap();

    public final android.view.View createView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View createViewFromHackInflater = createViewFromHackInflater(context, str, attributeSet);
        if (createViewFromHackInflater == null) {
            createViewFromHackInflater = createViewFromInflater(context, str, attributeSet);
        }
        if (createViewFromHackInflater == null) {
            createViewFromHackInflater = createViewFromTag(context, str, attributeSet);
        }
        if (createViewFromHackInflater != null) {
            checkOnClickListener(createViewFromHackInflater, attributeSet);
        }
        return createViewFromHackInflater;
    }

    private android.view.View createViewFromHackInflater(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        java.util.Iterator<skin.support.app.SkinLayoutInflater> it = skin.support.SkinCompatManager.getInstance().getHookInflaters().iterator();
        android.view.View view = null;
        while (it.hasNext() && (view = it.next().createView(context, str, attributeSet)) == null) {
        }
        return view;
    }

    private android.view.View createViewFromInflater(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        java.util.Iterator<skin.support.app.SkinLayoutInflater> it = skin.support.SkinCompatManager.getInstance().getInflaters().iterator();
        android.view.View view = null;
        while (it.hasNext() && (view = it.next().createView(context, str, attributeSet)) == null) {
        }
        return view;
    }

    public android.view.View createViewFromTag(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        if ("view".equals(str)) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            java.lang.Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createView(context, str, null);
            }
            int i = 0;
            while (true) {
                java.lang.String[] strArr = sClassPrefixList;
                if (i >= strArr.length) {
                    return null;
                }
                android.view.View createView = createView(context, str, strArr[i]);
                if (createView != null) {
                    return createView;
                }
                i++;
            }
        } catch (java.lang.Exception unused) {
            return null;
        } finally {
            java.lang.Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private void checkOnClickListener(android.view.View view, android.util.AttributeSet attributeSet) {
        android.content.Context context = view.getContext();
        if (context instanceof android.content.ContextWrapper) {
            if (android.os.Build.VERSION.SDK_INT < 15 || skin.support.view.ViewCompat.hasOnClickListeners(view)) {
                android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
                java.lang.String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new skin.support.app.SkinCompatViewInflater.DeclaredOnClickListener(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private android.view.View createView(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.ClassNotFoundException, android.view.InflateException {
        java.lang.String str3;
        java.util.Map<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> map = sConstructorMap;
        java.lang.reflect.Constructor<? extends android.view.View> constructor = map.get(str);
        if (constructor == null) {
            try {
                java.lang.ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(android.view.View.class).getConstructor(sConstructorSignature);
                map.put(str, constructor);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }

    private static class DeclaredOnClickListener implements android.view.View.OnClickListener {
        private final android.view.View mHostView;
        private final java.lang.String mMethodName;
        private android.content.Context mResolvedContext;
        private java.lang.reflect.Method mResolvedMethod;

        public DeclaredOnClickListener(android.view.View view, java.lang.String str) {
            this.mHostView = view;
            this.mMethodName = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (this.mResolvedMethod == null) {
                resolveMethod(this.mHostView.getContext(), this.mMethodName);
            }
            try {
                this.mResolvedMethod.invoke(this.mResolvedContext, view);
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (java.lang.reflect.InvocationTargetException e2) {
                throw new java.lang.IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        private void resolveMethod(android.content.Context context, java.lang.String str) {
            java.lang.String str2;
            java.lang.reflect.Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.mMethodName, android.view.View.class)) != null) {
                        this.mResolvedMethod = method;
                        this.mResolvedContext = context;
                        return;
                    }
                } catch (java.lang.NoSuchMethodException unused) {
                }
                context = context instanceof android.content.ContextWrapper ? ((android.content.ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.mHostView.getId();
            if (id == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.mHostView.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new java.lang.IllegalStateException("Could not find method " + this.mMethodName + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.mHostView.getClass() + str2);
        }
    }
}
