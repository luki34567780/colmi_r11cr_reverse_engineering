package androidx.room.util;

/* loaded from: classes.dex */
public final class UUIDUtil {
    private UUIDUtil() {
    }

    public static java.util.UUID convertByteToUUID(byte[] bArr) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        return new java.util.UUID(wrap.getLong(), wrap.getLong());
    }

    public static byte[] convertUUIDToByte(java.util.UUID uuid) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }
}
