package skin.support.design.app;

/* loaded from: classes3.dex */
public class SkinMaterialViewInflater implements skin.support.app.SkinLayoutInflater {
    @Override // skin.support.app.SkinLayoutInflater
    public android.view.View createView(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        if ("androidx.coordinatorlayout.widget.CoordinatorLayout".equals(str)) {
            return new skin.support.design.widget.SkinMaterialCoordinatorLayout(context, attributeSet);
        }
        if (!str.startsWith("com.google.android.material.")) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "com.google.android.material.tabs.TabLayout":
                return new skin.support.design.widget.SkinMaterialTabLayout(context, attributeSet);
            case "com.google.android.material.appbar.AppBarLayout":
                return new skin.support.design.widget.SkinMaterialAppBarLayout(context, attributeSet);
            case "com.google.android.material.appbar.CollapsingToolbarLayout":
                return new skin.support.design.widget.SkinMaterialCollapsingToolbarLayout(context, attributeSet);
            case "com.google.android.material.floatingactionbutton.FloatingActionButton":
                return new skin.support.design.widget.SkinMaterialFloatingActionButton(context, attributeSet);
            case "com.google.android.material.navigation.NavigationView":
                return new skin.support.design.widget.SkinMaterialNavigationView(context, attributeSet);
            case "com.google.android.material.textfield.TextInputLayout":
                return new skin.support.design.widget.SkinMaterialTextInputLayout(context, attributeSet);
            case "com.google.android.material.textfield.TextInputEditText":
                return new skin.support.design.widget.SkinMaterialTextInputEditText(context, attributeSet);
            default:
                return null;
        }
    }
}
