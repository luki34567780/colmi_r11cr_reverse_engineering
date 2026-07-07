package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public final class FileDirMap {
    private static final java.util.HashMap<java.lang.Integer, java.lang.String> dirMap = new java.util.HashMap<>();

    public static void init(android.content.Context context) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.assertValidRequest(context)) {
            java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = dirMap;
            if (hashMap.get(1) == null) {
                hashMap.put(1, context.getExternalFilesDir(android.os.Environment.DIRECTORY_PICTURES).getPath());
            }
            if (hashMap.get(2) == null) {
                hashMap.put(2, context.getExternalFilesDir(android.os.Environment.DIRECTORY_MOVIES).getPath());
            }
            if (hashMap.get(3) == null) {
                hashMap.put(3, context.getExternalFilesDir(android.os.Environment.DIRECTORY_MUSIC).getPath());
            }
        }
    }

    public static java.lang.String getFileDirPath(android.content.Context context, int i) {
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = dirMap;
        java.lang.String str = hashMap.get(java.lang.Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        init(context);
        return hashMap.get(java.lang.Integer.valueOf(i));
    }

    public static void clear() {
        dirMap.clear();
    }
}
