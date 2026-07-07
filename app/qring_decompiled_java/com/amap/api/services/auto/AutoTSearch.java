package com.amap.api.services.auto;

/* loaded from: classes.dex */
public class AutoTSearch {
    private com.amap.api.services.interfaces.IAutoTSearch a;

    public interface OnChargeStationListener {
        void onChargeStationSearched(com.amap.api.services.auto.AutoTChargeStationResult autoTChargeStationResult, int i);
    }

    public AutoTSearch(android.content.Context context) throws com.amap.api.services.core.AMapException {
        if (this.a == null) {
            try {
                this.a = new com.amap.api.col.p0003sl.hf(context);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                if (e instanceof com.amap.api.services.core.AMapException) {
                    throw ((com.amap.api.services.core.AMapException) e);
                }
            }
        }
    }

    public void setQuery(com.amap.api.services.auto.AutoTSearch.Query query) {
        com.amap.api.services.interfaces.IAutoTSearch iAutoTSearch = this.a;
        if (iAutoTSearch == null) {
            return;
        }
        iAutoTSearch.setQuery(query);
    }

    public com.amap.api.services.auto.AutoTChargeStationResult searchChargeStation() throws com.amap.api.services.core.AMapException {
        com.amap.api.services.interfaces.IAutoTSearch iAutoTSearch = this.a;
        if (iAutoTSearch == null) {
            return null;
        }
        return iAutoTSearch.searchChargeStation();
    }

    public void searchChargeStationAsync() throws com.amap.api.services.core.AMapException {
        com.amap.api.services.interfaces.IAutoTSearch iAutoTSearch = this.a;
        if (iAutoTSearch == null) {
            return;
        }
        iAutoTSearch.searchChargeStationAsync();
    }

    public void setChargeStationListener(com.amap.api.services.auto.AutoTSearch.OnChargeStationListener onChargeStationListener) {
        com.amap.api.services.interfaces.IAutoTSearch iAutoTSearch = this.a;
        if (iAutoTSearch == null || onChargeStationListener == null) {
            return;
        }
        iAutoTSearch.setChargeStationListener(onChargeStationListener);
    }

    public static class FilterBox implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.AutoTSearch.FilterBox> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.AutoTSearch.FilterBox>() { // from class: com.amap.api.services.auto.AutoTSearch.FilterBox.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.AutoTSearch.FilterBox createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.AutoTSearch.FilterBox[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.AutoTSearch.FilterBox a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.AutoTSearch.FilterBox(parcel);
            }

            private static com.amap.api.services.auto.AutoTSearch.FilterBox[] a(int i) {
                return new com.amap.api.services.auto.AutoTSearch.FilterBox[i];
            }
        };
        private java.lang.String a;
        private java.lang.String b;
        private java.lang.String c;
        private java.lang.String d;
        private java.lang.String e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public FilterBox() {
        }

        public java.lang.String getRetainState() {
            return this.a;
        }

        public void setRetainState(java.lang.String str) {
            this.a = str;
        }

        public java.lang.String getCheckedLevel() {
            return this.b;
        }

        public void setCheckedLevel(java.lang.String str) {
            this.b = str;
        }

        public java.lang.String getClassifyV2Data() {
            return this.c;
        }

        public void setClassifyV2Data(java.lang.String str) {
            this.c = str;
        }

        public java.lang.String getClassifyV2Level2Data() {
            return this.d;
        }

        public void setClassifyV2Level2Data(java.lang.String str) {
            this.d = str;
        }

        public java.lang.String getClassifyV2Level3Data() {
            return this.e;
        }

        public void setClassifyV2Level3Data(java.lang.String str) {
            this.e = str;
        }

        protected FilterBox(android.os.Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.amap.api.services.auto.AutoTSearch.FilterBox m195clone() {
            try {
                super.clone();
            } catch (java.lang.CloneNotSupportedException e) {
                e.printStackTrace();
            }
            com.amap.api.services.auto.AutoTSearch.FilterBox filterBox = new com.amap.api.services.auto.AutoTSearch.FilterBox();
            filterBox.setRetainState(this.a);
            filterBox.setCheckedLevel(this.b);
            filterBox.setClassifyV2Data(this.c);
            filterBox.setClassifyV2Level2Data(this.d);
            filterBox.setClassifyV2Level3Data(this.e);
            return filterBox;
        }
    }

    public static class Query implements android.os.Parcelable, java.lang.Cloneable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.AutoTSearch.Query> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.AutoTSearch.Query>() { // from class: com.amap.api.services.auto.AutoTSearch.Query.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.AutoTSearch.Query createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.AutoTSearch.Query[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.AutoTSearch.Query a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.AutoTSearch.Query(parcel);
            }

            private static com.amap.api.services.auto.AutoTSearch.Query[] a(int i) {
                return new com.amap.api.services.auto.AutoTSearch.Query[i];
            }
        };
        private java.lang.String a;
        private java.lang.String b;
        private java.lang.String c;
        private java.lang.String d;
        private java.lang.String e;
        private int f;
        private int g;
        private boolean h;
        private java.lang.String i;
        private int j;
        private com.amap.api.services.core.LatLonPoint k;
        private java.lang.String l;
        private java.lang.String m;
        private com.amap.api.services.auto.AutoTSearch.FilterBox n;
        private java.lang.String o;
        private java.lang.String p;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Query() {
            this.h = false;
        }

        protected Query(android.os.Parcel parcel) {
            this.h = false;
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readByte() != 0;
            this.i = parcel.readString();
            this.j = parcel.readInt();
            this.k = (com.amap.api.services.core.LatLonPoint) parcel.readParcelable(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
            this.l = parcel.readString();
            this.m = parcel.readString();
            this.n = (com.amap.api.services.auto.AutoTSearch.FilterBox) parcel.readParcelable(com.amap.api.services.auto.AutoTSearch.FilterBox.class.getClassLoader());
            this.o = parcel.readString();
            this.p = parcel.readString();
        }

        public java.lang.String getAdCode() {
            return this.a;
        }

        public void setAdCode(java.lang.String str) {
            this.a = str;
        }

        public java.lang.String getCity() {
            return this.b;
        }

        public void setCity(java.lang.String str) {
            this.b = str;
        }

        public java.lang.String getDataType() {
            return this.c;
        }

        public void setDataType(java.lang.String str) {
            this.c = str;
        }

        public java.lang.String getGeoObj() {
            return this.d;
        }

        public void setGeoObj(java.lang.String str) {
            this.d = str;
        }

        public java.lang.String getKeywords() {
            return this.e;
        }

        public void setKeywords(java.lang.String str) {
            this.e = str;
        }

        public int getPageNum() {
            return this.f;
        }

        public void setPageNum(int i) {
            this.f = i;
        }

        public int getPageSize() {
            return this.g;
        }

        public void setPageSize(int i) {
            this.g = i;
        }

        public boolean isQii() {
            return this.h;
        }

        public void setQii(boolean z) {
            this.h = z;
        }

        public java.lang.String getQueryType() {
            return this.i;
        }

        public void setQueryType(java.lang.String str) {
            this.i = str;
        }

        public int getRange() {
            return this.j;
        }

        public void setRange(int i) {
            this.j = i;
        }

        public com.amap.api.services.core.LatLonPoint getLatLonPoint() {
            return this.k;
        }

        public void setLatLonPoint(com.amap.api.services.core.LatLonPoint latLonPoint) {
            this.k = latLonPoint;
        }

        public java.lang.String getUserLoc() {
            return this.l;
        }

        public void setUserLoc(java.lang.String str) {
            this.l = str;
        }

        public java.lang.String getUserCity() {
            return this.m;
        }

        public void setUserCity(java.lang.String str) {
            this.m = str;
        }

        public com.amap.api.services.auto.AutoTSearch.FilterBox getFilterBox() {
            return this.n;
        }

        public void setFilterBox(com.amap.api.services.auto.AutoTSearch.FilterBox filterBox) {
            this.n = filterBox;
        }

        public java.lang.String getAccessKey() {
            return this.o;
        }

        public void setAccessKey(java.lang.String str) {
            this.o = str;
        }

        public java.lang.String getSecretKey() {
            return this.p;
        }

        public void setSecretKey(java.lang.String str) {
            this.p = str;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.amap.api.services.auto.AutoTSearch.Query m196clone() {
            try {
                super.clone();
            } catch (java.lang.CloneNotSupportedException e) {
                e.printStackTrace();
            }
            com.amap.api.services.auto.AutoTSearch.Query query = new com.amap.api.services.auto.AutoTSearch.Query();
            query.setAdCode(this.a);
            query.setCity(this.b);
            query.setDataType(this.c);
            query.setGeoObj(this.d);
            query.setKeywords(this.e);
            query.setPageNum(this.f);
            query.setPageSize(this.g);
            query.setQii(this.h);
            query.setQueryType(this.i);
            query.setRange(this.j);
            query.setLatLonPoint(this.k);
            query.setUserLoc(this.l);
            query.setUserCity(this.m);
            query.setAccessKey(this.o);
            query.setSecretKey(this.p);
            query.setFilterBox(this.n);
            return query;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
            parcel.writeString(this.i);
            parcel.writeInt(this.j);
            parcel.writeParcelable(this.k, i);
            parcel.writeString(this.l);
            parcel.writeString(this.m);
            parcel.writeParcelable(this.n, i);
            parcel.writeString(this.o);
            parcel.writeString(this.p);
        }
    }
}
