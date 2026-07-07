package io.fotoapparat.hardware.display;

/* compiled from: Display.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"getDisplay", "Landroid/view/Display;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class DisplayKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.view.Display getDisplay(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("window");
        if (systemService != null) {
            return ((android.view.WindowManager) systemService).getDefaultDisplay();
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
