package skin.support.app;

/* loaded from: classes3.dex */
public class SkinCompatDelegate implements android.view.LayoutInflater.Factory2 {
    private final android.content.Context mContext;
    private skin.support.app.SkinCompatViewInflater mSkinCompatViewInflater;
    private java.util.List<java.lang.ref.WeakReference<skin.support.widget.SkinCompatSupportable>> mSkinHelpers = new java.util.concurrent.CopyOnWriteArrayList();

    private SkinCompatDelegate(android.content.Context context) {
        this.mContext = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View createView = createView(view, str, context, attributeSet);
        if (createView == 0) {
            return null;
        }
        if (createView instanceof skin.support.widget.SkinCompatSupportable) {
            this.mSkinHelpers.add(new java.lang.ref.WeakReference<>((skin.support.widget.SkinCompatSupportable) createView));
        }
        return createView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View createView = createView(null, str, context, attributeSet);
        if (createView == 0) {
            return null;
        }
        if (createView instanceof skin.support.widget.SkinCompatSupportable) {
            this.mSkinHelpers.add(new java.lang.ref.WeakReference<>((skin.support.widget.SkinCompatSupportable) createView));
        }
        return createView;
    }

    public android.view.View createView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        if (this.mSkinCompatViewInflater == null) {
            this.mSkinCompatViewInflater = new skin.support.app.SkinCompatViewInflater();
        }
        java.util.Iterator<skin.support.app.SkinWrapper> it = skin.support.SkinCompatManager.getInstance().getWrappers().iterator();
        while (it.hasNext()) {
            android.content.Context wrapContext = it.next().wrapContext(this.mContext, view, attributeSet);
            if (wrapContext != null) {
                context = wrapContext;
            }
        }
        return this.mSkinCompatViewInflater.createView(view, str, context, attributeSet);
    }

    public static skin.support.app.SkinCompatDelegate create(android.content.Context context) {
        return new skin.support.app.SkinCompatDelegate(context);
    }

    public void applySkin() {
        java.util.List<java.lang.ref.WeakReference<skin.support.widget.SkinCompatSupportable>> list = this.mSkinHelpers;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (java.lang.ref.WeakReference<skin.support.widget.SkinCompatSupportable> weakReference : this.mSkinHelpers) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().applySkin();
            }
        }
    }
}
