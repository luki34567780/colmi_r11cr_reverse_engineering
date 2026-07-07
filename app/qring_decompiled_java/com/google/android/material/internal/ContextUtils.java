package com.google.android.material.internal;

/* loaded from: /tmp/dex/classes2.dex */
public class ContextUtils {
    public static android.app.Activity getActivity(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
