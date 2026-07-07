package com.king.zxing;

/* loaded from: /tmp/dex/classes2.dex */
public final class DecodeFormatManager {
    public static final java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> ALL_HINTS;
    public static final java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> CODE_128_HINTS;
    public static final java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> DEFAULT_HINTS;
    public static final java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> ONE_DIMENSIONAL_HINTS;
    public static final java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> QR_CODE_HINTS;
    public static final java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> TWO_DIMENSIONAL_HINTS;

    static {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.zxing.DecodeHintType.class);
        ALL_HINTS = enumMap;
        CODE_128_HINTS = createDecodeHint(com.google.zxing.BarcodeFormat.CODE_128);
        QR_CODE_HINTS = createDecodeHint(com.google.zxing.BarcodeFormat.QR_CODE);
        java.util.EnumMap enumMap2 = new java.util.EnumMap(com.google.zxing.DecodeHintType.class);
        ONE_DIMENSIONAL_HINTS = enumMap2;
        java.util.EnumMap enumMap3 = new java.util.EnumMap(com.google.zxing.DecodeHintType.class);
        TWO_DIMENSIONAL_HINTS = enumMap3;
        java.util.EnumMap enumMap4 = new java.util.EnumMap(com.google.zxing.DecodeHintType.class);
        DEFAULT_HINTS = enumMap4;
        addDecodeHintTypes(enumMap, getAllFormats());
        addDecodeHintTypes(enumMap2, getOneDimensionalFormats());
        addDecodeHintTypes(enumMap3, getTwoDimensionalFormats());
        addDecodeHintTypes(enumMap4, getDefaultFormats());
    }

    private static java.util.List<com.google.zxing.BarcodeFormat> getAllFormats() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.google.zxing.BarcodeFormat.AZTEC);
        arrayList.add(com.google.zxing.BarcodeFormat.CODABAR);
        arrayList.add(com.google.zxing.BarcodeFormat.CODE_39);
        arrayList.add(com.google.zxing.BarcodeFormat.CODE_93);
        arrayList.add(com.google.zxing.BarcodeFormat.CODE_128);
        arrayList.add(com.google.zxing.BarcodeFormat.DATA_MATRIX);
        arrayList.add(com.google.zxing.BarcodeFormat.EAN_8);
        arrayList.add(com.google.zxing.BarcodeFormat.EAN_13);
        arrayList.add(com.google.zxing.BarcodeFormat.ITF);
        arrayList.add(com.google.zxing.BarcodeFormat.MAXICODE);
        arrayList.add(com.google.zxing.BarcodeFormat.PDF_417);
        arrayList.add(com.google.zxing.BarcodeFormat.QR_CODE);
        arrayList.add(com.google.zxing.BarcodeFormat.RSS_14);
        arrayList.add(com.google.zxing.BarcodeFormat.RSS_EXPANDED);
        arrayList.add(com.google.zxing.BarcodeFormat.UPC_A);
        arrayList.add(com.google.zxing.BarcodeFormat.UPC_E);
        arrayList.add(com.google.zxing.BarcodeFormat.UPC_EAN_EXTENSION);
        return arrayList;
    }

    private static java.util.List<com.google.zxing.BarcodeFormat> getOneDimensionalFormats() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.google.zxing.BarcodeFormat.CODABAR);
        arrayList.add(com.google.zxing.BarcodeFormat.CODE_39);
        arrayList.add(com.google.zxing.BarcodeFormat.CODE_93);
        arrayList.add(com.google.zxing.BarcodeFormat.CODE_128);
        arrayList.add(com.google.zxing.BarcodeFormat.EAN_8);
        arrayList.add(com.google.zxing.BarcodeFormat.EAN_13);
        arrayList.add(com.google.zxing.BarcodeFormat.ITF);
        arrayList.add(com.google.zxing.BarcodeFormat.RSS_14);
        arrayList.add(com.google.zxing.BarcodeFormat.RSS_EXPANDED);
        arrayList.add(com.google.zxing.BarcodeFormat.UPC_A);
        arrayList.add(com.google.zxing.BarcodeFormat.UPC_E);
        arrayList.add(com.google.zxing.BarcodeFormat.UPC_EAN_EXTENSION);
        return arrayList;
    }

    private static java.util.List<com.google.zxing.BarcodeFormat> getTwoDimensionalFormats() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.google.zxing.BarcodeFormat.AZTEC);
        arrayList.add(com.google.zxing.BarcodeFormat.DATA_MATRIX);
        arrayList.add(com.google.zxing.BarcodeFormat.MAXICODE);
        arrayList.add(com.google.zxing.BarcodeFormat.PDF_417);
        arrayList.add(com.google.zxing.BarcodeFormat.QR_CODE);
        return arrayList;
    }

    private static java.util.List<com.google.zxing.BarcodeFormat> getDefaultFormats() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.google.zxing.BarcodeFormat.QR_CODE);
        arrayList.add(com.google.zxing.BarcodeFormat.UPC_A);
        arrayList.add(com.google.zxing.BarcodeFormat.EAN_13);
        arrayList.add(com.google.zxing.BarcodeFormat.CODE_128);
        return arrayList;
    }

    private static <T> java.util.List<T> singletonList(T t) {
        return java.util.Collections.singletonList(t);
    }

    public static java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> createDecodeHints(com.google.zxing.BarcodeFormat... barcodeFormatArr) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.zxing.DecodeHintType.class);
        addDecodeHintTypes(enumMap, java.util.Arrays.asList(barcodeFormatArr));
        return enumMap;
    }

    public static java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> createDecodeHint(com.google.zxing.BarcodeFormat barcodeFormat) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.zxing.DecodeHintType.class);
        addDecodeHintTypes(enumMap, singletonList(barcodeFormat));
        return enumMap;
    }

    private static void addDecodeHintTypes(java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> map, java.util.List<com.google.zxing.BarcodeFormat> list) {
        map.put(com.google.zxing.DecodeHintType.POSSIBLE_FORMATS, list);
        map.put(com.google.zxing.DecodeHintType.TRY_HARDER, java.lang.Boolean.TRUE);
        map.put(com.google.zxing.DecodeHintType.CHARACTER_SET, "UTF-8");
    }
}
