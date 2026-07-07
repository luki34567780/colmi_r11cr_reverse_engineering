package androidx.multidex;

/* loaded from: classes.dex */
public class MultiDexApplication extends android.app.Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
        androidx.multidex.MultiDex.install(this);
    }
}
