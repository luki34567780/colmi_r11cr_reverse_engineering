package com.qcwireless.qcwatch.base.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class AssetsUtils {
    public static java.lang.String getFromAssets(android.content.Context context, java.lang.String fileName) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(context.getResources().getAssets().open(fileName)));
            java.lang.String str = "";
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return str;
                }
                str = str + readLine;
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void copyFilesAssets(android.content.Context context, java.lang.String oldPath, java.lang.String newPath) {
        try {
            java.lang.String[] list = context.getAssets().list(oldPath);
            if (list.length > 0) {
                new java.io.File(newPath).mkdirs();
                for (java.lang.String str : list) {
                    copyFilesAssets(context, oldPath + java.io.File.separator + str, newPath + java.io.File.separator + str);
                }
                return;
            }
            java.io.InputStream open = context.getAssets().open(oldPath);
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new java.io.File(newPath));
            byte[] bArr = new byte[com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2];
            while (true) {
                int read = open.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    open.close();
                    fileOutputStream.close();
                    return;
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean checkFilePathExists(java.lang.String path) {
        return new java.io.File(path).exists();
    }
}
