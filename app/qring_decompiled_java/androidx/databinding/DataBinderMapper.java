package androidx.databinding;

/* loaded from: classes.dex */
public abstract class DataBinderMapper {
    public abstract java.lang.String convertBrIdToString(int i);

    public abstract androidx.databinding.ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent dataBindingComponent, android.view.View view, int i);

    public abstract androidx.databinding.ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent dataBindingComponent, android.view.View[] viewArr, int i);

    public abstract int getLayoutId(java.lang.String str);

    public java.util.List<androidx.databinding.DataBinderMapper> collectDependencies() {
        return java.util.Collections.emptyList();
    }
}
