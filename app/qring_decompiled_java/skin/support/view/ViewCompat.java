package skin.support.view;

/* loaded from: classes3.dex */
public class ViewCompat {
    public static boolean hasOnClickListeners(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }
}
