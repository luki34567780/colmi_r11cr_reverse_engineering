package androidx.core.net;

/* loaded from: classes.dex */
public final class TrafficStatsCompat {
    @java.lang.Deprecated
    public static void clearThreadStatsTag() {
        android.net.TrafficStats.clearThreadStatsTag();
    }

    @java.lang.Deprecated
    public static int getThreadStatsTag() {
        return android.net.TrafficStats.getThreadStatsTag();
    }

    @java.lang.Deprecated
    public static void incrementOperationCount(int i) {
        android.net.TrafficStats.incrementOperationCount(i);
    }

    @java.lang.Deprecated
    public static void incrementOperationCount(int i, int i2) {
        android.net.TrafficStats.incrementOperationCount(i, i2);
    }

    @java.lang.Deprecated
    public static void setThreadStatsTag(int i) {
        android.net.TrafficStats.setThreadStatsTag(i);
    }

    @java.lang.Deprecated
    public static void tagSocket(java.net.Socket socket) throws java.net.SocketException {
        android.net.TrafficStats.tagSocket(socket);
    }

    @java.lang.Deprecated
    public static void untagSocket(java.net.Socket socket) throws java.net.SocketException {
        android.net.TrafficStats.untagSocket(socket);
    }

    public static void tagDatagramSocket(java.net.DatagramSocket datagramSocket) throws java.net.SocketException {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            android.net.TrafficStats.tagDatagramSocket(datagramSocket);
            return;
        }
        android.os.ParcelFileDescriptor fromDatagramSocket = android.os.ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
        android.net.TrafficStats.tagSocket(new androidx.core.net.DatagramSocketWrapper(datagramSocket, fromDatagramSocket.getFileDescriptor()));
        fromDatagramSocket.detachFd();
    }

    public static void untagDatagramSocket(java.net.DatagramSocket datagramSocket) throws java.net.SocketException {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            android.net.TrafficStats.untagDatagramSocket(datagramSocket);
            return;
        }
        android.os.ParcelFileDescriptor fromDatagramSocket = android.os.ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
        android.net.TrafficStats.untagSocket(new androidx.core.net.DatagramSocketWrapper(datagramSocket, fromDatagramSocket.getFileDescriptor()));
        fromDatagramSocket.detachFd();
    }

    private TrafficStatsCompat() {
    }
}
