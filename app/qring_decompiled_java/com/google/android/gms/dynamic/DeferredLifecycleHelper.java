package com.google.android.gms.dynamic;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class DeferredLifecycleHelper<T extends com.google.android.gms.dynamic.LifecycleDelegate> {
    private T zaa;
    private android.os.Bundle zab;
    private java.util.LinkedList<com.google.android.gms.dynamic.zah> zac;
    private final com.google.android.gms.dynamic.OnDelegateCreatedListener<T> zad = new com.google.android.gms.dynamic.zaa(this);

    public static void showGooglePlayUnavailableMessage(android.widget.FrameLayout frameLayout) {
        com.google.android.gms.common.GoogleApiAvailability googleApiAvailability = com.google.android.gms.common.GoogleApiAvailability.getInstance();
        android.content.Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        java.lang.String zad = com.google.android.gms.common.internal.zac.zad(context, isGooglePlayServicesAvailable);
        java.lang.String zac = com.google.android.gms.common.internal.zac.zac(context, isGooglePlayServicesAvailable);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        android.widget.TextView textView = new android.widget.TextView(frameLayout.getContext());
        textView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        textView.setText(zad);
        linearLayout.addView(textView);
        android.content.Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            android.widget.Button button = new android.widget.Button(context);
            button.setId(android.R.id.button1);
            button.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            button.setText(zac);
            linearLayout.addView(button);
            button.setOnClickListener(new com.google.android.gms.dynamic.zae(context, errorResolutionIntent));
        }
    }

    private final void zae(int i) {
        while (!this.zac.isEmpty() && this.zac.getLast().zaa() >= i) {
            this.zac.removeLast();
        }
    }

    private final void zaf(android.os.Bundle bundle, com.google.android.gms.dynamic.zah zahVar) {
        T t = this.zaa;
        if (t != null) {
            zahVar.zab(t);
            return;
        }
        if (this.zac == null) {
            this.zac = new java.util.LinkedList<>();
        }
        this.zac.add(zahVar);
        if (bundle != null) {
            android.os.Bundle bundle2 = this.zab;
            if (bundle2 == null) {
                this.zab = (android.os.Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.zad);
    }

    protected abstract void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener<T> onDelegateCreatedListener);

    public T getDelegate() {
        return this.zaa;
    }

    protected void handleGooglePlayUnavailable(android.widget.FrameLayout frameLayout) {
        showGooglePlayUnavailableMessage(frameLayout);
    }

    public void onCreate(android.os.Bundle bundle) {
        zaf(bundle, new com.google.android.gms.dynamic.zac(this, bundle));
    }

    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(layoutInflater.getContext());
        zaf(bundle, new com.google.android.gms.dynamic.zad(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.zaa == null) {
            handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    public void onDestroy() {
        T t = this.zaa;
        if (t != null) {
            t.onDestroy();
        } else {
            zae(1);
        }
    }

    public void onDestroyView() {
        T t = this.zaa;
        if (t != null) {
            t.onDestroyView();
        } else {
            zae(2);
        }
    }

    public void onInflate(android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
        zaf(bundle2, new com.google.android.gms.dynamic.zab(this, activity, bundle, bundle2));
    }

    public void onLowMemory() {
        T t = this.zaa;
        if (t != null) {
            t.onLowMemory();
        }
    }

    public void onPause() {
        T t = this.zaa;
        if (t != null) {
            t.onPause();
        } else {
            zae(5);
        }
    }

    public void onResume() {
        zaf(null, new com.google.android.gms.dynamic.zag(this));
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        T t = this.zaa;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        android.os.Bundle bundle2 = this.zab;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void onStart() {
        zaf(null, new com.google.android.gms.dynamic.zaf(this));
    }

    public void onStop() {
        T t = this.zaa;
        if (t != null) {
            t.onStop();
        } else {
            zae(4);
        }
    }
}
