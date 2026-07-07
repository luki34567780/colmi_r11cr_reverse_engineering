package com.amap.api.services.poisearch;

/* loaded from: classes.dex */
public class PoiSearchV2 {
    public static final java.lang.String CHINESE = "zh-CN";
    public static final java.lang.String ENGLISH = "en";
    private com.amap.api.services.interfaces.IPoiSearchV2 a;

    public interface OnPoiSearchListener {
        void onPoiItemSearched(com.amap.api.services.core.PoiItemV2 poiItemV2, int i);

        void onPoiSearched(com.amap.api.services.poisearch.PoiResultV2 poiResultV2, int i);
    }

    public enum PremiumType {
        DEFAULT(""),
        ENTIRETY("entirety_poi");

        private final java.lang.String a;

        PremiumType(java.lang.String str) {
            this.a = str;
        }

        final java.lang.String a() {
            return this.a;
        }

        static com.amap.api.services.poisearch.PoiSearchV2.PremiumType a(java.lang.String str) {
            com.amap.api.services.poisearch.PoiSearchV2.PremiumType premiumType = DEFAULT;
            if (str.equals(premiumType.a())) {
                return premiumType;
            }
            com.amap.api.services.poisearch.PoiSearchV2.PremiumType premiumType2 = ENTIRETY;
            return str.equals(premiumType2.a()) ? premiumType2 : premiumType;
        }
    }

    public PoiSearchV2(android.content.Context context, com.amap.api.services.poisearch.PoiSearchV2.Query query) throws com.amap.api.services.core.AMapException {
        this.a = null;
        try {
            this.a = new com.amap.api.col.p0003sl.hp(context, query);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            if (e instanceof com.amap.api.services.core.AMapException) {
                throw ((com.amap.api.services.core.AMapException) e);
            }
        }
    }

    public void setOnPoiSearchListener(com.amap.api.services.poisearch.PoiSearchV2.OnPoiSearchListener onPoiSearchListener) {
        com.amap.api.services.interfaces.IPoiSearchV2 iPoiSearchV2 = this.a;
        if (iPoiSearchV2 != null) {
            iPoiSearchV2.setOnPoiSearchListener(onPoiSearchListener);
        }
    }

    public com.amap.api.services.poisearch.PoiResultV2 searchPOI() throws com.amap.api.services.core.AMapException {
        com.amap.api.services.interfaces.IPoiSearchV2 iPoiSearchV2 = this.a;
        if (iPoiSearchV2 != null) {
            return iPoiSearchV2.searchPOI();
        }
        return null;
    }

    public void searchPOIAsyn() {
        com.amap.api.services.interfaces.IPoiSearchV2 iPoiSearchV2 = this.a;
        if (iPoiSearchV2 != null) {
            iPoiSearchV2.searchPOIAsyn();
        }
    }

    public com.amap.api.services.core.PoiItemV2 searchPOIId(java.lang.String str) throws com.amap.api.services.core.AMapException {
        com.amap.api.services.interfaces.IPoiSearchV2 iPoiSearchV2 = this.a;
        if (iPoiSearchV2 != null) {
            return iPoiSearchV2.searchPOIId(str);
        }
        return null;
    }

    public void searchPOIIdAsyn(java.lang.String str) {
        com.amap.api.services.interfaces.IPoiSearchV2 iPoiSearchV2 = this.a;
        if (iPoiSearchV2 != null) {
            iPoiSearchV2.searchPOIIdAsyn(str);
        }
    }

    public void setQuery(com.amap.api.services.poisearch.PoiSearchV2.Query query) {
        com.amap.api.services.interfaces.IPoiSearchV2 iPoiSearchV2 = this.a;
        if (iPoiSearchV2 != null) {
            iPoiSearchV2.setQuery(query);
        }
    }

    public void setBound(com.amap.api.services.poisearch.PoiSearchV2.SearchBound searchBound) {
        com.amap.api.services.interfaces.IPoiSearchV2 iPoiSearchV2 = this.a;
        if (iPoiSearchV2 != null) {
            iPoiSearchV2.setBound(searchBound);
        }
    }

    public com.amap.api.services.poisearch.PoiSearchV2.Query getQuery() {
        com.amap.api.services.interfaces.IPoiSearchV2 iPoiSearchV2 = this.a;
        if (iPoiSearchV2 != null) {
            return iPoiSearchV2.getQuery();
        }
        return null;
    }

    public com.amap.api.services.poisearch.PoiSearchV2.SearchBound getBound() {
        com.amap.api.services.interfaces.IPoiSearchV2 iPoiSearchV2 = this.a;
        if (iPoiSearchV2 != null) {
            return iPoiSearchV2.getBound();
        }
        return null;
    }

    public static class ShowFields {
        public static final int ALL = -1;
        public static final int BUSINESS = 2;
        public static final int CHILDREN = 1;
        public static final int DEFAULT = 0;
        public static final int INDOOR = 4;
        public static final int NAVI = 8;
        public static final int PHOTOS = 16;
        public int value;

        ShowFields() {
            this.value = 0;
        }

        public ShowFields(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(int i) {
            this.value = i;
        }
    }

    public static class Query implements java.lang.Cloneable {
        private java.lang.String a;
        private java.lang.String b;
        private java.lang.String c;
        private int d;
        private int e;
        private java.lang.String f;
        private boolean g;
        private java.lang.String h;
        private boolean i;
        private com.amap.api.services.core.LatLonPoint j;
        private boolean k;
        private java.lang.String l;
        private java.lang.String m;
        private com.amap.api.services.poisearch.PoiSearchV2.ShowFields n;

        private static java.lang.String a() {
            return "";
        }

        public Query(java.lang.String str, java.lang.String str2) {
            this(str, str2, null);
        }

        public Query(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.d = 1;
            this.e = 20;
            this.f = "zh-CN";
            this.g = false;
            this.i = true;
            this.k = true;
            this.m = com.amap.api.services.poisearch.PoiSearchV2.PremiumType.DEFAULT.a();
            this.n = new com.amap.api.services.poisearch.PoiSearchV2.ShowFields();
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public java.lang.String getBuilding() {
            return this.h;
        }

        public void setBuilding(java.lang.String str) {
            this.h = str;
        }

        public java.lang.String getQueryString() {
            return this.a;
        }

        public void setQueryLanguage(java.lang.String str) {
            if ("en".equals(str)) {
                this.f = "en";
            } else {
                this.f = "zh-CN";
            }
        }

        protected java.lang.String getQueryLanguage() {
            return this.f;
        }

        public java.lang.String getCategory() {
            java.lang.String str = this.b;
            if (str == null || str.equals("00") || this.b.equals("00|")) {
                return a();
            }
            return this.b;
        }

        public java.lang.String getCity() {
            return this.c;
        }

        public int getPageNum() {
            return this.d;
        }

        public void setPageNum(int i) {
            if (i <= 0) {
                i = 1;
            }
            this.d = i;
        }

        public void setPageSize(int i) {
            if (i <= 0) {
                this.e = 20;
            } else if (i > 30) {
                this.e = 30;
            } else {
                this.e = i;
            }
        }

        public int getPageSize() {
            return this.e;
        }

        public void setCityLimit(boolean z) {
            this.g = z;
        }

        public boolean getCityLimit() {
            return this.g;
        }

        public boolean isDistanceSort() {
            return this.i;
        }

        public void setDistanceSort(boolean z) {
            this.i = z;
        }

        public com.amap.api.services.core.LatLonPoint getLocation() {
            return this.j;
        }

        public void setLocation(com.amap.api.services.core.LatLonPoint latLonPoint) {
            this.j = latLonPoint;
        }

        public boolean isSpecial() {
            return this.k;
        }

        public void setSpecial(boolean z) {
            this.k = z;
        }

        public com.amap.api.services.poisearch.PoiSearchV2.ShowFields getShowFields() {
            return this.n;
        }

        public void setShowFields(com.amap.api.services.poisearch.PoiSearchV2.ShowFields showFields) {
            if (showFields == null) {
                this.n = new com.amap.api.services.poisearch.PoiSearchV2.ShowFields();
            } else {
                this.n = showFields;
            }
        }

        public void setChannel(java.lang.String str) {
            this.l = str;
        }

        public java.lang.String getChannel() {
            return this.l;
        }

        public void setPremium(com.amap.api.services.poisearch.PoiSearchV2.PremiumType premiumType) {
            if (premiumType == null) {
                return;
            }
            this.m = premiumType.a();
        }

        public java.lang.String getPremium() {
            return this.m;
        }

        public boolean queryEquals(com.amap.api.services.poisearch.PoiSearchV2.Query query) {
            if (query == null) {
                return false;
            }
            if (query == this) {
                return true;
            }
            return com.amap.api.services.poisearch.PoiSearchV2.b(query.a, this.a) && com.amap.api.services.poisearch.PoiSearchV2.b(query.b, this.b) && com.amap.api.services.poisearch.PoiSearchV2.b(query.f, this.f) && com.amap.api.services.poisearch.PoiSearchV2.b(query.c, this.c) && com.amap.api.services.poisearch.PoiSearchV2.b(query.h, this.h) && com.amap.api.services.poisearch.PoiSearchV2.b(query.l, this.l) && com.amap.api.services.poisearch.PoiSearchV2.b(query.m, this.m) && query.g == this.g && query.e == this.e && query.i == this.i && query.k == this.k && query.n.value == this.n.value;
        }

        public int hashCode() {
            java.lang.String str = this.b;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            java.lang.String str2 = this.l;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.m;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.String str4 = this.c;
            int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31;
            java.lang.String str5 = this.f;
            int hashCode5 = (((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
            java.lang.String str6 = this.a;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            java.lang.String str7 = this.h;
            return ((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + (this.n.value % 1024);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.amap.api.services.poisearch.PoiSearchV2.Query query = (com.amap.api.services.poisearch.PoiSearchV2.Query) obj;
            java.lang.String str = this.b;
            if (str == null) {
                if (query.b != null) {
                    return false;
                }
            } else if (!str.equals(query.b)) {
                return false;
            }
            java.lang.String str2 = this.c;
            if (str2 == null) {
                if (query.c != null) {
                    return false;
                }
            } else if (!str2.equals(query.c)) {
                return false;
            }
            java.lang.String str3 = this.f;
            if (str3 == null) {
                if (query.f != null) {
                    return false;
                }
            } else if (!str3.equals(query.f)) {
                return false;
            }
            if (this.d != query.d || this.e != query.e) {
                return false;
            }
            java.lang.String str4 = this.a;
            if (str4 == null) {
                if (query.a != null) {
                    return false;
                }
            } else if (!str4.equals(query.a)) {
                return false;
            }
            java.lang.String str5 = this.l;
            if (str5 == null) {
                if (query.l != null) {
                    return false;
                }
            } else if (!str5.equals(query.l)) {
                return false;
            }
            java.lang.String str6 = this.m;
            if (str6 == null) {
                if (query.m != null) {
                    return false;
                }
            } else if (!str6.equals(query.m)) {
                return false;
            }
            java.lang.String str7 = this.h;
            if (str7 == null) {
                if (query.h != null) {
                    return false;
                }
            } else if (!str7.equals(query.h)) {
                return false;
            }
            return this.g == query.g && this.k == query.k && this.n.value == this.n.value;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.amap.api.services.poisearch.PoiSearchV2.Query m204clone() {
            try {
                super.clone();
            } catch (java.lang.CloneNotSupportedException e) {
                com.amap.api.col.p0003sl.fn.a(e, "PoiSearch", "queryclone");
            }
            com.amap.api.services.poisearch.PoiSearchV2.Query query = new com.amap.api.services.poisearch.PoiSearchV2.Query(this.a, this.b, this.c);
            query.setPageNum(this.d);
            query.setPageSize(this.e);
            query.setQueryLanguage(this.f);
            query.setCityLimit(this.g);
            query.setBuilding(this.h);
            query.setLocation(this.j);
            query.setDistanceSort(this.i);
            query.setSpecial(this.k);
            query.setChannel(this.l);
            query.setPremium(com.amap.api.services.poisearch.PoiSearchV2.PremiumType.a(this.m));
            query.setShowFields(new com.amap.api.services.poisearch.PoiSearchV2.ShowFields(this.n.value));
            return query;
        }
    }

    public static class SearchBound implements java.lang.Cloneable {
        public static final java.lang.String BOUND_SHAPE = "Bound";
        public static final java.lang.String ELLIPSE_SHAPE = "Ellipse";
        public static final java.lang.String POLYGON_SHAPE = "Polygon";
        public static final java.lang.String RECTANGLE_SHAPE = "Rectangle";
        private com.amap.api.services.core.LatLonPoint a;
        private com.amap.api.services.core.LatLonPoint b;
        private int c;
        private com.amap.api.services.core.LatLonPoint d;
        private java.lang.String e;
        private boolean f;
        private java.util.List<com.amap.api.services.core.LatLonPoint> g;

        public SearchBound(com.amap.api.services.core.LatLonPoint latLonPoint, int i) {
            this.c = com.google.android.gms.common.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            this.f = true;
            this.e = "Bound";
            this.c = i;
            this.d = latLonPoint;
        }

        public SearchBound(com.amap.api.services.core.LatLonPoint latLonPoint, int i, boolean z) {
            this.c = com.google.android.gms.common.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            this.f = true;
            this.e = "Bound";
            this.c = i;
            this.d = latLonPoint;
            this.f = z;
        }

        public SearchBound(com.amap.api.services.core.LatLonPoint latLonPoint, com.amap.api.services.core.LatLonPoint latLonPoint2) {
            this.c = com.google.android.gms.common.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            this.f = true;
            this.e = "Rectangle";
            a(latLonPoint, latLonPoint2);
        }

        public SearchBound(java.util.List<com.amap.api.services.core.LatLonPoint> list) {
            this.c = com.google.android.gms.common.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            this.f = true;
            this.e = "Polygon";
            this.g = list;
        }

        private SearchBound(com.amap.api.services.core.LatLonPoint latLonPoint, com.amap.api.services.core.LatLonPoint latLonPoint2, int i, com.amap.api.services.core.LatLonPoint latLonPoint3, java.lang.String str, java.util.List<com.amap.api.services.core.LatLonPoint> list, boolean z) {
            this.c = com.google.android.gms.common.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            this.f = true;
            this.a = latLonPoint;
            this.b = latLonPoint2;
            this.c = i;
            this.d = latLonPoint3;
            this.e = str;
            this.g = list;
            this.f = z;
        }

        private void a(com.amap.api.services.core.LatLonPoint latLonPoint, com.amap.api.services.core.LatLonPoint latLonPoint2) {
            this.a = latLonPoint;
            this.b = latLonPoint2;
            if (latLonPoint.getLatitude() >= this.b.getLatitude() || this.a.getLongitude() >= this.b.getLongitude()) {
                new java.lang.IllegalArgumentException("invalid rect ").printStackTrace();
            }
            this.d = new com.amap.api.services.core.LatLonPoint((this.a.getLatitude() + this.b.getLatitude()) / 2.0d, (this.a.getLongitude() + this.b.getLongitude()) / 2.0d);
        }

        public com.amap.api.services.core.LatLonPoint getLowerLeft() {
            return this.a;
        }

        public com.amap.api.services.core.LatLonPoint getUpperRight() {
            return this.b;
        }

        public com.amap.api.services.core.LatLonPoint getCenter() {
            return this.d;
        }

        public int getRange() {
            return this.c;
        }

        public java.lang.String getShape() {
            return this.e;
        }

        public boolean isDistanceSort() {
            return this.f;
        }

        public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyGonList() {
            return this.g;
        }

        public int hashCode() {
            com.amap.api.services.core.LatLonPoint latLonPoint = this.d;
            int hashCode = ((((latLonPoint == null ? 0 : latLonPoint.hashCode()) + 31) * 31) + (this.f ? 1231 : 1237)) * 31;
            com.amap.api.services.core.LatLonPoint latLonPoint2 = this.a;
            int hashCode2 = (hashCode + (latLonPoint2 == null ? 0 : latLonPoint2.hashCode())) * 31;
            com.amap.api.services.core.LatLonPoint latLonPoint3 = this.b;
            int hashCode3 = (hashCode2 + (latLonPoint3 == null ? 0 : latLonPoint3.hashCode())) * 31;
            java.util.List<com.amap.api.services.core.LatLonPoint> list = this.g;
            int hashCode4 = (((hashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.c) * 31;
            java.lang.String str = this.e;
            return hashCode4 + (str != null ? str.hashCode() : 0);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.amap.api.services.poisearch.PoiSearchV2.SearchBound searchBound = (com.amap.api.services.poisearch.PoiSearchV2.SearchBound) obj;
            com.amap.api.services.core.LatLonPoint latLonPoint = this.d;
            if (latLonPoint == null) {
                if (searchBound.d != null) {
                    return false;
                }
            } else if (!latLonPoint.equals(searchBound.d)) {
                return false;
            }
            if (this.f != searchBound.f) {
                return false;
            }
            com.amap.api.services.core.LatLonPoint latLonPoint2 = this.a;
            if (latLonPoint2 == null) {
                if (searchBound.a != null) {
                    return false;
                }
            } else if (!latLonPoint2.equals(searchBound.a)) {
                return false;
            }
            com.amap.api.services.core.LatLonPoint latLonPoint3 = this.b;
            if (latLonPoint3 == null) {
                if (searchBound.b != null) {
                    return false;
                }
            } else if (!latLonPoint3.equals(searchBound.b)) {
                return false;
            }
            java.util.List<com.amap.api.services.core.LatLonPoint> list = this.g;
            if (list == null) {
                if (searchBound.g != null) {
                    return false;
                }
            } else if (!list.equals(searchBound.g)) {
                return false;
            }
            if (this.c != searchBound.c) {
                return false;
            }
            java.lang.String str = this.e;
            if (str == null) {
                if (searchBound.e != null) {
                    return false;
                }
            } else if (!str.equals(searchBound.e)) {
                return false;
            }
            return true;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.amap.api.services.poisearch.PoiSearchV2.SearchBound m205clone() {
            try {
                super.clone();
            } catch (java.lang.CloneNotSupportedException e) {
                com.amap.api.col.p0003sl.fn.a(e, "PoiSearch", "SearchBoundClone");
            }
            return new com.amap.api.services.poisearch.PoiSearchV2.SearchBound(this.a, this.b, this.c, this.d, this.e, this.g, this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(java.lang.String str, java.lang.String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }
}
