package com.amap.api.col.p0003sl;

/* compiled from: PoiHandler.java */
/* loaded from: classes.dex */
abstract class gc<T, V> extends com.amap.api.col.p0003sl.ff<T, V> {
    public gc(android.content.Context context, T t) {
        super(context, t);
    }

    protected static boolean c(java.lang.String str) {
        return str == null || str.equals("") || str.equals(okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
    }

    protected static java.lang.String a(com.amap.api.services.poisearch.PoiSearchV2.ShowFields showFields) {
        if (showFields == null || showFields.getValue() == 0) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((showFields.getValue() & 1) != 0) {
            sb.append("children,");
        }
        if ((showFields.getValue() & 2) != 0) {
            sb.append("business,");
        }
        if ((showFields.getValue() & 4) != 0) {
            sb.append("indoor,");
        }
        if ((showFields.getValue() & 8) != 0) {
            sb.append("navi,");
        }
        if ((showFields.getValue() & 16) != 0) {
            sb.append("photos,");
        }
        if (sb.length() <= 0) {
            return null;
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        return sb.toString();
    }
}
