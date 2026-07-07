package coil.network;

/* compiled from: NetworkObserver.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"TAG", "", coil.network.NetworkObserverKt.TAG, "Lcoil/network/NetworkObserver;", "context", "Landroid/content/Context;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/network/NetworkObserver$Listener;", "logger", "Lcoil/util/Logger;", "coil-base_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkObserverKt {
    private static final java.lang.String TAG = "NetworkObserver";

    public static final coil.network.NetworkObserver NetworkObserver(android.content.Context context, coil.network.NetworkObserver.Listener listener, coil.util.Logger logger) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) androidx.core.content.ContextCompat.getSystemService(context, android.net.ConnectivityManager.class);
        if (connectivityManager != null && coil.util.Contexts.isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                return new coil.network.RealNetworkObserver(connectivityManager, listener);
            } catch (java.lang.Exception e) {
                if (logger != null) {
                    coil.util.Logs.log(logger, TAG, new java.lang.RuntimeException("Failed to register network observer.", e));
                }
                return new coil.network.EmptyNetworkObserver();
            }
        }
        if (logger != null && logger.getLevel() <= 5) {
            logger.log(TAG, 5, "Unable to register network observer.", null);
        }
        return new coil.network.EmptyNetworkObserver();
    }
}
