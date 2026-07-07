package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public final class ExpandedProductParsedResult extends com.google.zxing.client.result.ParsedResult {
    public static final java.lang.String KILOGRAM = "KG";
    public static final java.lang.String POUND = "LB";
    private final java.lang.String bestBeforeDate;
    private final java.lang.String expirationDate;
    private final java.lang.String lotNumber;
    private final java.lang.String packagingDate;
    private final java.lang.String price;
    private final java.lang.String priceCurrency;
    private final java.lang.String priceIncrement;
    private final java.lang.String productID;
    private final java.lang.String productionDate;
    private final java.lang.String rawText;
    private final java.lang.String sscc;
    private final java.util.Map<java.lang.String, java.lang.String> uncommonAIs;
    private final java.lang.String weight;
    private final java.lang.String weightIncrement;
    private final java.lang.String weightType;

    public ExpandedProductParsedResult(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.util.Map<java.lang.String, java.lang.String> map) {
        super(com.google.zxing.client.result.ParsedResultType.PRODUCT);
        this.rawText = str;
        this.productID = str2;
        this.sscc = str3;
        this.lotNumber = str4;
        this.productionDate = str5;
        this.packagingDate = str6;
        this.bestBeforeDate = str7;
        this.expirationDate = str8;
        this.weight = str9;
        this.weightType = str10;
        this.weightIncrement = str11;
        this.price = str12;
        this.priceIncrement = str13;
        this.priceCurrency = str14;
        this.uncommonAIs = map;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.zxing.client.result.ExpandedProductParsedResult)) {
            return false;
        }
        com.google.zxing.client.result.ExpandedProductParsedResult expandedProductParsedResult = (com.google.zxing.client.result.ExpandedProductParsedResult) obj;
        return equalsOrNull(this.productID, expandedProductParsedResult.productID) && equalsOrNull(this.sscc, expandedProductParsedResult.sscc) && equalsOrNull(this.lotNumber, expandedProductParsedResult.lotNumber) && equalsOrNull(this.productionDate, expandedProductParsedResult.productionDate) && equalsOrNull(this.bestBeforeDate, expandedProductParsedResult.bestBeforeDate) && equalsOrNull(this.expirationDate, expandedProductParsedResult.expirationDate) && equalsOrNull(this.weight, expandedProductParsedResult.weight) && equalsOrNull(this.weightType, expandedProductParsedResult.weightType) && equalsOrNull(this.weightIncrement, expandedProductParsedResult.weightIncrement) && equalsOrNull(this.price, expandedProductParsedResult.price) && equalsOrNull(this.priceIncrement, expandedProductParsedResult.priceIncrement) && equalsOrNull(this.priceCurrency, expandedProductParsedResult.priceCurrency) && equalsOrNull(this.uncommonAIs, expandedProductParsedResult.uncommonAIs);
    }

    private static boolean equalsOrNull(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public int hashCode() {
        return ((((((((((((hashNotNull(this.productID) ^ 0) ^ hashNotNull(this.sscc)) ^ hashNotNull(this.lotNumber)) ^ hashNotNull(this.productionDate)) ^ hashNotNull(this.bestBeforeDate)) ^ hashNotNull(this.expirationDate)) ^ hashNotNull(this.weight)) ^ hashNotNull(this.weightType)) ^ hashNotNull(this.weightIncrement)) ^ hashNotNull(this.price)) ^ hashNotNull(this.priceIncrement)) ^ hashNotNull(this.priceCurrency)) ^ hashNotNull(this.uncommonAIs);
    }

    private static int hashNotNull(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public java.lang.String getRawText() {
        return this.rawText;
    }

    public java.lang.String getProductID() {
        return this.productID;
    }

    public java.lang.String getSscc() {
        return this.sscc;
    }

    public java.lang.String getLotNumber() {
        return this.lotNumber;
    }

    public java.lang.String getProductionDate() {
        return this.productionDate;
    }

    public java.lang.String getPackagingDate() {
        return this.packagingDate;
    }

    public java.lang.String getBestBeforeDate() {
        return this.bestBeforeDate;
    }

    public java.lang.String getExpirationDate() {
        return this.expirationDate;
    }

    public java.lang.String getWeight() {
        return this.weight;
    }

    public java.lang.String getWeightType() {
        return this.weightType;
    }

    public java.lang.String getWeightIncrement() {
        return this.weightIncrement;
    }

    public java.lang.String getPrice() {
        return this.price;
    }

    public java.lang.String getPriceIncrement() {
        return this.priceIncrement;
    }

    public java.lang.String getPriceCurrency() {
        return this.priceCurrency;
    }

    public java.util.Map<java.lang.String, java.lang.String> getUncommonAIs() {
        return this.uncommonAIs;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public java.lang.String getDisplayResult() {
        return java.lang.String.valueOf(this.rawText);
    }
}
