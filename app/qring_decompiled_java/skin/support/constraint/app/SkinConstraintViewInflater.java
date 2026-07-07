package skin.support.constraint.app;

/* loaded from: classes3.dex */
public class SkinConstraintViewInflater implements skin.support.app.SkinLayoutInflater {
    @Override // skin.support.app.SkinLayoutInflater
    public android.view.View createView(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        str.hashCode();
        if (str.equals("androidx.constraintlayout.widget.ConstraintLayout")) {
            return new skin.support.constraint.SkinCompatConstraintLayout(context, attributeSet);
        }
        return null;
    }
}
