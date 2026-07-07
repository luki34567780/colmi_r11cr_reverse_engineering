package com.amap.api.services.auto;

/* loaded from: classes.dex */
public class ListData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.ListData>() { // from class: com.amap.api.services.auto.ListData.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.auto.ListData createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.auto.ListData[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.auto.ListData a(android.os.Parcel parcel) {
            return new com.amap.api.services.auto.ListData(parcel);
        }

        private static com.amap.api.services.auto.ListData[] a(int i) {
            return new com.amap.api.services.auto.ListData[i];
        }
    };
    public java.util.List<com.amap.api.services.auto.ListData.Content> content;

    public static class ShortReview {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ListData() {
    }

    protected ListData(android.os.Parcel parcel) {
        this.content = parcel.createTypedArrayList(com.amap.api.services.auto.ListData.Content.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeTypedList(this.content);
    }

    public static class Content implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.Content> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.Content>() { // from class: com.amap.api.services.auto.ListData.Content.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.Content createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.Content[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.ListData.Content a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.ListData.Content(parcel);
            }

            private static com.amap.api.services.auto.ListData.Content[] a(int i) {
                return new com.amap.api.services.auto.ListData.Content[i];
            }
        };
        public com.amap.api.services.auto.ListData.Data data;
        public java.lang.String itemType;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Content() {
        }

        protected Content(android.os.Parcel parcel) {
            this.data = (com.amap.api.services.auto.ListData.Data) parcel.readParcelable(com.amap.api.services.auto.ListData.Data.class.getClassLoader());
            this.itemType = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeParcelable(this.data, i);
            parcel.writeString(this.itemType);
        }
    }

    public static class Data implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.Data> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.Data>() { // from class: com.amap.api.services.auto.ListData.Data.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.Data createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.Data[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.ListData.Data a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.ListData.Data(parcel);
            }

            private static com.amap.api.services.auto.ListData.Data[] a(int i) {
                return new com.amap.api.services.auto.ListData.Data[i];
            }
        };
        public com.amap.api.services.auto.ListData.BasicInfo basicInfo;
        public com.amap.api.services.auto.ListData.ChargingInfo chargingInfo;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Data() {
        }

        protected Data(android.os.Parcel parcel) {
            this.basicInfo = (com.amap.api.services.auto.ListData.BasicInfo) parcel.readParcelable(com.amap.api.services.auto.ListData.BasicInfo.class.getClassLoader());
            this.chargingInfo = (com.amap.api.services.auto.ListData.ChargingInfo) parcel.readParcelable(com.amap.api.services.auto.ListData.ChargingInfo.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeParcelable(this.basicInfo, i);
            parcel.writeParcelable(this.chargingInfo, i);
        }
    }

    public static class BasicInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.BasicInfo> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.BasicInfo>() { // from class: com.amap.api.services.auto.ListData.BasicInfo.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.BasicInfo createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.BasicInfo[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.ListData.BasicInfo a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.ListData.BasicInfo(parcel);
            }

            private static com.amap.api.services.auto.ListData.BasicInfo[] a(int i) {
                return new com.amap.api.services.auto.ListData.BasicInfo[i];
            }
        };
        public java.lang.String adcode;
        public java.lang.String address;
        public java.lang.String averagecost;
        public java.lang.String buildingStatus;
        public java.lang.String businessArea;
        public java.lang.String category;
        public java.lang.String childShortname;
        public java.lang.String childShortnameEn;
        public java.lang.String childtype;
        public java.lang.String citycode;
        public java.lang.String cname;
        public java.lang.String dispName;
        public java.lang.String distance;
        public java.lang.String dname;
        public java.lang.String eaddress;
        public java.lang.String endPoiExtension;
        public java.lang.String fNona;
        public java.lang.String hisMark;
        public java.lang.String hotText;
        public java.lang.String id;
        public java.lang.String industry;
        public java.lang.String latitude;
        public java.lang.String longitude;
        public java.lang.String name;
        public com.amap.api.services.auto.ListData.NaviVisited naviVisited;
        public java.lang.String numSpaceW;
        public java.lang.String numSpaceWF;
        public java.lang.String opentime2;
        public java.lang.String opentimeText;
        public java.lang.String parent;
        public java.lang.String parentName;
        public java.lang.String picInfo;
        public java.lang.String rating;
        public java.lang.String recommendFlag;
        public java.lang.String reviewTotal;
        public java.lang.String sell;
        public com.amap.api.services.auto.ListData.ShortReview shortReview;
        public java.lang.String tel;
        public java.lang.String towardsAngle;
        public java.lang.String typeCode;
        public java.lang.String updateFlag;
        public java.lang.String xEntr;
        public java.lang.String yEntr;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public BasicInfo() {
        }

        protected BasicInfo(android.os.Parcel parcel) {
            this.adcode = parcel.readString();
            this.address = parcel.readString();
            this.averagecost = parcel.readString();
            this.buildingStatus = parcel.readString();
            this.businessArea = parcel.readString();
            this.childShortname = parcel.readString();
            this.childShortnameEn = parcel.readString();
            this.childtype = parcel.readString();
            this.citycode = parcel.readString();
            this.cname = parcel.readString();
            this.dispName = parcel.readString();
            this.distance = parcel.readString();
            this.dname = parcel.readString();
            this.eaddress = parcel.readString();
            this.endPoiExtension = parcel.readString();
            this.fNona = parcel.readString();
            this.hisMark = parcel.readString();
            this.hotText = parcel.readString();
            this.id = parcel.readString();
            this.industry = parcel.readString();
            this.latitude = parcel.readString();
            this.longitude = parcel.readString();
            this.name = parcel.readString();
            this.naviVisited = (com.amap.api.services.auto.ListData.NaviVisited) parcel.readParcelable(com.amap.api.services.auto.ListData.NaviVisited.class.getClassLoader());
            this.numSpaceW = parcel.readString();
            this.numSpaceWF = parcel.readString();
            this.opentime2 = parcel.readString();
            this.opentimeText = parcel.readString();
            this.parent = parcel.readString();
            this.parentName = parcel.readString();
            this.picInfo = parcel.readString();
            this.rating = parcel.readString();
            this.recommendFlag = parcel.readString();
            this.reviewTotal = parcel.readString();
            this.sell = parcel.readString();
            this.tel = parcel.readString();
            this.towardsAngle = parcel.readString();
            this.typeCode = parcel.readString();
            this.updateFlag = parcel.readString();
            this.xEntr = parcel.readString();
            this.yEntr = parcel.readString();
            this.category = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.adcode);
            parcel.writeString(this.address);
            parcel.writeString(this.averagecost);
            parcel.writeString(this.buildingStatus);
            parcel.writeString(this.businessArea);
            parcel.writeString(this.childShortname);
            parcel.writeString(this.childShortnameEn);
            parcel.writeString(this.childtype);
            parcel.writeString(this.citycode);
            parcel.writeString(this.cname);
            parcel.writeString(this.dispName);
            parcel.writeString(this.distance);
            parcel.writeString(this.dname);
            parcel.writeString(this.eaddress);
            parcel.writeString(this.endPoiExtension);
            parcel.writeString(this.fNona);
            parcel.writeString(this.hisMark);
            parcel.writeString(this.hotText);
            parcel.writeString(this.id);
            parcel.writeString(this.industry);
            parcel.writeString(this.latitude);
            parcel.writeString(this.longitude);
            parcel.writeString(this.name);
            parcel.writeParcelable(this.naviVisited, i);
            parcel.writeString(this.numSpaceW);
            parcel.writeString(this.numSpaceWF);
            parcel.writeString(this.opentime2);
            parcel.writeString(this.opentimeText);
            parcel.writeString(this.parent);
            parcel.writeString(this.parentName);
            parcel.writeString(this.picInfo);
            parcel.writeString(this.rating);
            parcel.writeString(this.recommendFlag);
            parcel.writeString(this.reviewTotal);
            parcel.writeString(this.sell);
            parcel.writeString(this.tel);
            parcel.writeString(this.towardsAngle);
            parcel.writeString(this.typeCode);
            parcel.writeString(this.updateFlag);
            parcel.writeString(this.xEntr);
            parcel.writeString(this.yEntr);
            parcel.writeString(this.category);
        }
    }

    public static class NaviVisited implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.NaviVisited> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.NaviVisited>() { // from class: com.amap.api.services.auto.ListData.NaviVisited.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.NaviVisited createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.NaviVisited[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.ListData.NaviVisited a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.ListData.NaviVisited(parcel);
            }

            private static com.amap.api.services.auto.ListData.NaviVisited[] a(int i) {
                return new com.amap.api.services.auto.ListData.NaviVisited[i];
            }
        };
        public java.lang.String randUnionMonthUv;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public NaviVisited() {
        }

        protected NaviVisited(android.os.Parcel parcel) {
            this.randUnionMonthUv = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.randUnionMonthUv);
        }
    }

    public static class ChargingInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.ChargingInfo> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.ChargingInfo>() { // from class: com.amap.api.services.auto.ListData.ChargingInfo.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.ChargingInfo createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.ChargingInfo[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.ListData.ChargingInfo a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.ListData.ChargingInfo(parcel);
            }

            private static com.amap.api.services.auto.ListData.ChargingInfo[] a(int i) {
                return new com.amap.api.services.auto.ListData.ChargingInfo[i];
            }
        };
        public java.lang.String brandDesc;
        public java.util.List<com.amap.api.services.auto.ListData.ChargeInfo> chargeInfo;
        public java.lang.String chargingRatingFlagTerm;
        public java.lang.String creditZhima;
        public java.lang.String cscf;
        public java.lang.String currentElePrice;
        public java.lang.String currentSerPrice;
        public java.lang.String deepRightsTag;
        public java.util.HashMap<java.lang.String, java.lang.String> idDictionary;
        public java.lang.String latestCharge;
        public java.lang.String numFast;
        public java.lang.String numSlow;
        public java.lang.String parkCategory;
        public com.amap.api.services.auto.ListData.PriceChargingPark priceChargingPark;
        public java.lang.String priceParkingStd;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ChargingInfo() {
        }

        protected ChargingInfo(android.os.Parcel parcel) {
            this.brandDesc = parcel.readString();
            this.chargeInfo = parcel.createTypedArrayList(com.amap.api.services.auto.ListData.ChargeInfo.CREATOR);
            this.chargingRatingFlagTerm = parcel.readString();
            this.creditZhima = parcel.readString();
            this.cscf = parcel.readString();
            this.currentElePrice = parcel.readString();
            this.currentSerPrice = parcel.readString();
            this.deepRightsTag = parcel.readString();
            this.latestCharge = parcel.readString();
            this.numFast = parcel.readString();
            this.numSlow = parcel.readString();
            this.parkCategory = parcel.readString();
            this.priceChargingPark = (com.amap.api.services.auto.ListData.PriceChargingPark) parcel.readParcelable(com.amap.api.services.auto.ListData.PriceChargingPark.class.getClassLoader());
            this.priceParkingStd = parcel.readString();
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
            this.idDictionary = hashMap;
            parcel.readMap(hashMap, java.util.HashMap.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.brandDesc);
            parcel.writeTypedList(this.chargeInfo);
            parcel.writeString(this.chargingRatingFlagTerm);
            parcel.writeString(this.creditZhima);
            parcel.writeString(this.cscf);
            parcel.writeString(this.currentElePrice);
            parcel.writeString(this.currentSerPrice);
            parcel.writeString(this.deepRightsTag);
            parcel.writeString(this.latestCharge);
            parcel.writeString(this.numFast);
            parcel.writeString(this.numSlow);
            parcel.writeString(this.parkCategory);
            parcel.writeParcelable(this.priceChargingPark, i);
            parcel.writeString(this.priceParkingStd);
            parcel.writeMap(this.idDictionary);
        }
    }

    public static class ChargeInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.ChargeInfo> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.ChargeInfo>() { // from class: com.amap.api.services.auto.ListData.ChargeInfo.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.ChargeInfo createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.ChargeInfo[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.ListData.ChargeInfo a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.ListData.ChargeInfo(parcel);
            }

            private static com.amap.api.services.auto.ListData.ChargeInfo[] a(int i) {
                return new com.amap.api.services.auto.ListData.ChargeInfo[i];
            }
        };
        public java.util.List<com.amap.api.services.auto.ListData.PlugsInfo> plugsInfos;
        public java.lang.String plugsType;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ChargeInfo() {
        }

        protected ChargeInfo(android.os.Parcel parcel) {
            this.plugsType = parcel.readString();
            this.plugsInfos = parcel.createTypedArrayList(com.amap.api.services.auto.ListData.PlugsInfo.CREATOR);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.plugsType);
            parcel.writeTypedList(this.plugsInfos);
        }
    }

    public static class PlugsInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.PlugsInfo> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.PlugsInfo>() { // from class: com.amap.api.services.auto.ListData.PlugsInfo.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.PlugsInfo createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.PlugsInfo[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.ListData.PlugsInfo a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.ListData.PlugsInfo(parcel);
            }

            private static com.amap.api.services.auto.ListData.PlugsInfo[] a(int i) {
                return new com.amap.api.services.auto.ListData.PlugsInfo[i];
            }
        };
        public java.lang.String brandDesc;
        public java.lang.String fastcur;
        public java.lang.String fastpower;
        public java.lang.String fastvol;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public PlugsInfo() {
        }

        protected PlugsInfo(android.os.Parcel parcel) {
            this.brandDesc = parcel.readString();
            this.fastcur = parcel.readString();
            this.fastpower = parcel.readString();
            this.fastvol = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.brandDesc);
            parcel.writeString(this.fastcur);
            parcel.writeString(this.fastpower);
            parcel.writeString(this.fastvol);
        }
    }

    public static class PriceChargingPark implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.PriceChargingPark> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.PriceChargingPark>() { // from class: com.amap.api.services.auto.ListData.PriceChargingPark.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.PriceChargingPark createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.PriceChargingPark[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.ListData.PriceChargingPark a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.ListData.PriceChargingPark(parcel);
            }

            private static com.amap.api.services.auto.ListData.PriceChargingPark[] a(int i) {
                return new com.amap.api.services.auto.ListData.PriceChargingPark[i];
            }
        };
        public java.util.List<com.amap.api.services.auto.ListData.Park> parks;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public PriceChargingPark() {
        }

        protected PriceChargingPark(android.os.Parcel parcel) {
            this.parks = parcel.createTypedArrayList(com.amap.api.services.auto.ListData.Park.CREATOR);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeTypedList(this.parks);
        }
    }

    public static class Park implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.Park> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.Park>() { // from class: com.amap.api.services.auto.ListData.Park.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.Park createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.Park[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.ListData.Park a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.ListData.Park(parcel);
            }

            private static com.amap.api.services.auto.ListData.Park[] a(int i) {
                return new com.amap.api.services.auto.ListData.Park[i];
            }
        };
        public java.util.List<com.amap.api.services.auto.ListData.PriceCharging> priceChargings;
        public java.lang.String srcType;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Park() {
        }

        protected Park(android.os.Parcel parcel) {
            this.priceChargings = parcel.createTypedArrayList(com.amap.api.services.auto.ListData.PriceCharging.CREATOR);
            this.srcType = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeTypedList(this.priceChargings);
            parcel.writeString(this.srcType);
        }
    }

    public static class PriceCharging implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.PriceCharging> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.PriceCharging>() { // from class: com.amap.api.services.auto.ListData.PriceCharging.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.PriceCharging createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.auto.ListData.PriceCharging[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.auto.ListData.PriceCharging a(android.os.Parcel parcel) {
                return new com.amap.api.services.auto.ListData.PriceCharging(parcel);
            }

            private static com.amap.api.services.auto.ListData.PriceCharging[] a(int i) {
                return new com.amap.api.services.auto.ListData.PriceCharging[i];
            }
        };
        public java.lang.String elePrice;
        public java.lang.String serPrice;
        public java.lang.String time;
        public int updatetime;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public PriceCharging() {
        }

        protected PriceCharging(android.os.Parcel parcel) {
            this.elePrice = parcel.readString();
            this.serPrice = parcel.readString();
            this.time = parcel.readString();
            this.updatetime = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.elePrice);
            parcel.writeString(this.serPrice);
            parcel.writeString(this.time);
            parcel.writeInt(this.updatetime);
        }
    }
}
