package skin.support.utils;

/* loaded from: classes3.dex */
public class ImageUtils {
    public static int getImageRotateAngle(java.lang.String str) {
        android.media.ExifInterface exifInterface;
        try {
            exifInterface = new android.media.ExifInterface(str);
        } catch (java.io.IOException e) {
            e.printStackTrace();
            exifInterface = null;
        }
        if (exifInterface == null) {
            return 0;
        }
        int attributeInt = exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }
}
