package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class SortUtils {
    public static void sortFolder(java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list) {
        java.util.Collections.sort(list, new java.util.Comparator() { // from class: com.luck.picture.lib.utils.SortUtils$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.luck.picture.lib.utils.SortUtils.lambda$sortFolder$0((com.luck.picture.lib.entity.LocalMediaFolder) obj, (com.luck.picture.lib.entity.LocalMediaFolder) obj2);
            }
        });
    }

    static /* synthetic */ int lambda$sortFolder$0(com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder, com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder2) {
        if (localMediaFolder.getData() == null || localMediaFolder2.getData() == null) {
            return 0;
        }
        return java.lang.Integer.compare(localMediaFolder2.getFolderTotalNum(), localMediaFolder.getFolderTotalNum());
    }

    public static void sortLocalMediaAddedTime(java.util.List<com.luck.picture.lib.entity.LocalMedia> list) {
        java.util.Collections.sort(list, new java.util.Comparator() { // from class: com.luck.picture.lib.utils.SortUtils$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int compare;
                compare = java.lang.Long.compare(((com.luck.picture.lib.entity.LocalMedia) obj2).getDateAddedTime(), ((com.luck.picture.lib.entity.LocalMedia) obj).getDateAddedTime());
                return compare;
            }
        });
    }
}
