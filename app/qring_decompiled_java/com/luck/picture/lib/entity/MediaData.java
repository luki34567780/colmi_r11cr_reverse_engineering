package com.luck.picture.lib.entity;

/* loaded from: /tmp/dex/classes2.dex */
public class MediaData {
    public java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> data;
    public boolean isHasNextMore;

    public MediaData() {
    }

    public MediaData(boolean z, java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        this.isHasNextMore = z;
        this.data = arrayList;
    }
}
