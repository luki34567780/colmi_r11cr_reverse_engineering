package skin.support.app;

/* loaded from: classes3.dex */
public class SkinCardViewInflater implements skin.support.app.SkinLayoutInflater {
    @Override // skin.support.app.SkinLayoutInflater
    public android.view.View createView(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        str.hashCode();
        if (str.equals("androidx.cardview.widget.CardView")) {
            return new skin.support.widget.SkinCompatCardView(context, attributeSet);
        }
        return null;
    }
}
