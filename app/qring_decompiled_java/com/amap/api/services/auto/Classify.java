package com.amap.api.services.auto;

/* loaded from: classes.dex */
public class Classify implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.Classify>() { // from class: com.amap.api.services.auto.Classify.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.auto.Classify createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.auto.Classify[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.auto.Classify a(android.os.Parcel parcel) {
            return new com.amap.api.services.auto.Classify(parcel);
        }

        private static com.amap.api.services.auto.Classify[] a(int i) {
            return new com.amap.api.services.auto.Classify[i];
        }
    };
    public com.amap.api.services.auto.Classify.ItermData itermData;
    public com.amap.api.services.auto.Classify.RetainState retainState;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Classify() {
    }

    protected Classify(android.os.Parcel parcel) {
        this.itermData = (com.amap.api.services.auto.Classify.ItermData) parcel.readParcelable(com.amap.api.services.auto.Classify.ItermData.class.getClassLoader());
        this.retainState = (com.amap.api.services.auto.Classify.RetainState) parcel.readParcelable(com.amap.api.services.auto.Classify.RetainState.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.itermData, i);
        parcel.writeParcelable(this.retainState, i);
    }

    public static class ItermData implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.ItermData> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.ItermData>() { // from class: com.amap.api.services.auto.Classify.ItermData.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.Classify.ItermData createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.Classify.ItermData[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.Classify.ItermData a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.Classify.ItermData(parcel);
            }

            private static com.amap.api.services.auto.Classify.ItermData[] a(int i) {
                return new com.amap.api.services.auto.Classify.ItermData[i];
            }
        };
        public java.util.List<com.amap.api.services.auto.Classify.CheckedNode> checkedNodes;
        public com.amap.api.services.auto.Classify.CheckedValue checkedValue;
        public java.util.List<com.amap.api.services.auto.Classify.Data> datas;
        public java.util.List<com.amap.api.services.auto.Classify.Data> defaultPositionDatas;
        public java.util.List<com.amap.api.services.auto.Classify.Data> level2Datas;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ItermData() {
        }

        protected ItermData(android.os.Parcel parcel) {
            this.checkedNodes = parcel.createTypedArrayList(com.amap.api.services.auto.Classify.CheckedNode.CREATOR);
            this.checkedValue = (com.amap.api.services.auto.Classify.CheckedValue) parcel.readParcelable(com.amap.api.services.auto.Classify.CheckedValue.class.getClassLoader());
            this.datas = parcel.createTypedArrayList(com.amap.api.services.auto.Classify.Data.CREATOR);
            this.defaultPositionDatas = parcel.createTypedArrayList(com.amap.api.services.auto.Classify.Data.CREATOR);
            this.level2Datas = parcel.createTypedArrayList(com.amap.api.services.auto.Classify.Data.CREATOR);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeTypedList(this.checkedNodes);
            parcel.writeParcelable(this.checkedValue, i);
            parcel.writeTypedList(this.datas);
            parcel.writeTypedList(this.defaultPositionDatas);
            parcel.writeTypedList(this.level2Datas);
        }
    }

    public static class CheckedNode implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.CheckedNode> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.CheckedNode>() { // from class: com.amap.api.services.auto.Classify.CheckedNode.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.Classify.CheckedNode createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.Classify.CheckedNode[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.Classify.CheckedNode a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.Classify.CheckedNode(parcel);
            }

            private static com.amap.api.services.auto.Classify.CheckedNode[] a(int i) {
                return new com.amap.api.services.auto.Classify.CheckedNode[i];
            }
        };
        public java.lang.String id;
        public java.lang.String name;
        public java.lang.String value;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public CheckedNode() {
        }

        protected CheckedNode(android.os.Parcel parcel) {
            this.id = parcel.readString();
            this.value = parcel.readString();
            this.name = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.id);
            parcel.writeString(this.value);
            parcel.writeString(this.name);
        }
    }

    public static class CheckedValue implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.CheckedValue> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.CheckedValue>() { // from class: com.amap.api.services.auto.Classify.CheckedValue.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.Classify.CheckedValue createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.Classify.CheckedValue[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.Classify.CheckedValue a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.Classify.CheckedValue(parcel);
            }

            private static com.amap.api.services.auto.Classify.CheckedValue[] a(int i) {
                return new com.amap.api.services.auto.Classify.CheckedValue[i];
            }
        };
        public java.lang.String classifyV2Data;
        public java.lang.String classifyV2Level2Data;
        public java.lang.String classifyV2Level3Data;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public CheckedValue() {
        }

        protected CheckedValue(android.os.Parcel parcel) {
            this.classifyV2Data = parcel.readString();
            this.classifyV2Level2Data = parcel.readString();
            this.classifyV2Level3Data = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.classifyV2Data);
            parcel.writeString(this.classifyV2Level2Data);
            parcel.writeString(this.classifyV2Level3Data);
        }
    }

    public static class Data implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.Data> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.Data>() { // from class: com.amap.api.services.auto.Classify.Data.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.Classify.Data createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.Classify.Data[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.Classify.Data a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.Classify.Data(parcel);
            }

            private static com.amap.api.services.auto.Classify.Data[] a(int i) {
                return new com.amap.api.services.auto.Classify.Data[i];
            }
        };
        public java.util.List<com.amap.api.services.auto.Classify.DataCategory> categories;
        public int checked;
        public java.lang.String classifyItemType;
        public int isCancelDefaultSelect;
        public int isNoBtn;
        public int multiSelect;
        public java.lang.String name;
        public java.lang.String params;
        public java.lang.String separator;
        public java.lang.String type;
        public int useCommonlyUsedConfig;
        public int useLocalConfig;
        public int useRemoteConfig;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Data() {
        }

        protected Data(android.os.Parcel parcel) {
            this.categories = parcel.createTypedArrayList(com.amap.api.services.auto.Classify.DataCategory.CREATOR);
            this.checked = parcel.readInt();
            this.classifyItemType = parcel.readString();
            this.isCancelDefaultSelect = parcel.readInt();
            this.isNoBtn = parcel.readInt();
            this.name = parcel.readString();
            this.params = parcel.readString();
            this.separator = parcel.readString();
            this.type = parcel.readString();
            this.useCommonlyUsedConfig = parcel.readInt();
            this.useLocalConfig = parcel.readInt();
            this.useRemoteConfig = parcel.readInt();
            this.multiSelect = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeTypedList(this.categories);
            parcel.writeInt(this.checked);
            parcel.writeString(this.classifyItemType);
            parcel.writeInt(this.isCancelDefaultSelect);
            parcel.writeInt(this.isNoBtn);
            parcel.writeString(this.name);
            parcel.writeString(this.params);
            parcel.writeString(this.separator);
            parcel.writeString(this.type);
            parcel.writeInt(this.useCommonlyUsedConfig);
            parcel.writeInt(this.useLocalConfig);
            parcel.writeInt(this.useRemoteConfig);
            parcel.writeInt(this.multiSelect);
        }
    }

    public static class DataCategory implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.DataCategory> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.DataCategory>() { // from class: com.amap.api.services.auto.Classify.DataCategory.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.Classify.DataCategory createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.Classify.DataCategory[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.Classify.DataCategory a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.Classify.DataCategory(parcel);
            }

            private static com.amap.api.services.auto.Classify.DataCategory[] a(int i) {
                return new com.amap.api.services.auto.Classify.DataCategory[i];
            }
        };
        public int areaSubwayMark;
        public java.util.List<com.amap.api.services.auto.Classify.Category> categories;
        public int checked;
        public java.lang.String classifyItemType;
        public java.lang.String componentType;
        public int defaultValue;
        public int hideTitle;
        public java.lang.String img;
        public int maxShowNum;
        public int maxShowNumRow;
        public int multiSelect;
        public java.lang.String name;
        public java.lang.String params;
        public java.lang.String showType;
        public java.lang.String value;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public DataCategory() {
        }

        protected DataCategory(android.os.Parcel parcel) {
            this.categories = parcel.createTypedArrayList(com.amap.api.services.auto.Classify.Category.CREATOR);
            this.checked = parcel.readInt();
            this.defaultValue = parcel.readInt();
            this.componentType = parcel.readString();
            this.name = parcel.readString();
            this.params = parcel.readString();
            this.areaSubwayMark = parcel.readInt();
            this.hideTitle = parcel.readInt();
            this.maxShowNum = parcel.readInt();
            this.maxShowNumRow = parcel.readInt();
            this.multiSelect = parcel.readInt();
            this.img = parcel.readString();
            this.showType = parcel.readString();
            this.value = parcel.readString();
            this.classifyItemType = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeTypedList(this.categories);
            parcel.writeInt(this.checked);
            parcel.writeInt(this.defaultValue);
            parcel.writeString(this.componentType);
            parcel.writeString(this.name);
            parcel.writeString(this.params);
            parcel.writeInt(this.areaSubwayMark);
            parcel.writeInt(this.hideTitle);
            parcel.writeInt(this.maxShowNum);
            parcel.writeInt(this.maxShowNumRow);
            parcel.writeInt(this.multiSelect);
            parcel.writeString(this.img);
            parcel.writeString(this.showType);
            parcel.writeString(this.value);
            parcel.writeString(this.classifyItemType);
        }
    }

    public static class Category implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.Category> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.Category>() { // from class: com.amap.api.services.auto.Classify.Category.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.Classify.Category createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.Classify.Category[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.Classify.Category a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.Classify.Category(parcel);
            }

            private static com.amap.api.services.auto.Classify.Category[] a(int i) {
                return new com.amap.api.services.auto.Classify.Category[i];
            }
        };
        public int checked;
        public java.lang.String classifyItemType;
        public java.lang.String componentType;
        public int defaultValue;
        public java.lang.String img;
        public java.lang.String name;
        public java.lang.String params;
        public java.lang.String showType;
        public java.lang.String value;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Category() {
        }

        protected Category(android.os.Parcel parcel) {
            this.checked = parcel.readInt();
            this.componentType = parcel.readString();
            this.defaultValue = parcel.readInt();
            this.name = parcel.readString();
            this.params = parcel.readString();
            this.value = parcel.readString();
            this.classifyItemType = parcel.readString();
            this.img = parcel.readString();
            this.showType = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.checked);
            parcel.writeString(this.componentType);
            parcel.writeInt(this.defaultValue);
            parcel.writeString(this.name);
            parcel.writeString(this.params);
            parcel.writeString(this.value);
            parcel.writeString(this.classifyItemType);
            parcel.writeString(this.img);
            parcel.writeString(this.showType);
        }
    }

    public static class RetainState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.RetainState> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.RetainState>() { // from class: com.amap.api.services.auto.Classify.RetainState.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.Classify.RetainState createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.Classify.RetainState[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.Classify.RetainState a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.Classify.RetainState(parcel);
            }

            private static com.amap.api.services.auto.Classify.RetainState[] a(int i) {
                return new com.amap.api.services.auto.Classify.RetainState[i];
            }
        };
        public java.lang.String classifyBusinessType;
        public java.lang.String classifyConf;
        public java.lang.String classifyRetainLevel2;
        public java.lang.String level2All;
        public java.lang.String newClassifyCityadcode;
        public java.lang.String newClassifyFlag;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public RetainState() {
        }

        protected RetainState(android.os.Parcel parcel) {
            this.classifyBusinessType = parcel.readString();
            this.classifyConf = parcel.readString();
            this.classifyRetainLevel2 = parcel.readString();
            this.level2All = parcel.readString();
            this.newClassifyCityadcode = parcel.readString();
            this.newClassifyFlag = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.classifyBusinessType);
            parcel.writeString(this.classifyConf);
            parcel.writeString(this.classifyRetainLevel2);
            parcel.writeString(this.level2All);
            parcel.writeString(this.newClassifyCityadcode);
            parcel.writeString(this.newClassifyFlag);
        }
    }
}
