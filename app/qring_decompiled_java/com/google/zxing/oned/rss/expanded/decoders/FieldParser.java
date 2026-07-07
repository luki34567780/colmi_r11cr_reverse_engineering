package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: /tmp/dex/classes2.dex */
final class FieldParser {
    private static final java.lang.Object[][] FOUR_DIGIT_DATA_LENGTH;
    private static final java.lang.Object[][] THREE_DIGIT_DATA_LENGTH;
    private static final java.lang.Object[][] THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH;
    private static final java.lang.Object[][] TWO_DIGIT_DATA_LENGTH;
    private static final java.lang.Object VARIABLE_LENGTH;

    static {
        java.lang.Object obj = new java.lang.Object();
        VARIABLE_LENGTH = obj;
        TWO_DIGIT_DATA_LENGTH = new java.lang.Object[][]{new java.lang.Object[]{"00", 18}, new java.lang.Object[]{"01", 14}, new java.lang.Object[]{"02", 14}, new java.lang.Object[]{"10", obj, 20}, new java.lang.Object[]{"11", 6}, new java.lang.Object[]{"12", 6}, new java.lang.Object[]{"13", 6}, new java.lang.Object[]{"15", 6}, new java.lang.Object[]{"17", 6}, new java.lang.Object[]{"20", 2}, new java.lang.Object[]{"21", obj, 20}, new java.lang.Object[]{"22", obj, 29}, new java.lang.Object[]{"30", obj, 8}, new java.lang.Object[]{"37", obj, 8}, new java.lang.Object[]{"90", obj, 30}, new java.lang.Object[]{"91", obj, 30}, new java.lang.Object[]{"92", obj, 30}, new java.lang.Object[]{"93", obj, 30}, new java.lang.Object[]{"94", obj, 30}, new java.lang.Object[]{"95", obj, 30}, new java.lang.Object[]{"96", obj, 30}, new java.lang.Object[]{"97", obj, 30}, new java.lang.Object[]{"98", obj, 30}, new java.lang.Object[]{"99", obj, 30}};
        THREE_DIGIT_DATA_LENGTH = new java.lang.Object[][]{new java.lang.Object[]{"240", obj, 30}, new java.lang.Object[]{"241", obj, 30}, new java.lang.Object[]{"242", obj, 6}, new java.lang.Object[]{"250", obj, 30}, new java.lang.Object[]{"251", obj, 30}, new java.lang.Object[]{"253", obj, 17}, new java.lang.Object[]{"254", obj, 20}, new java.lang.Object[]{"400", obj, 30}, new java.lang.Object[]{"401", obj, 30}, new java.lang.Object[]{"402", 17}, new java.lang.Object[]{"403", obj, 30}, new java.lang.Object[]{"410", 13}, new java.lang.Object[]{"411", 13}, new java.lang.Object[]{"412", 13}, new java.lang.Object[]{"413", 13}, new java.lang.Object[]{"414", 13}, new java.lang.Object[]{"420", obj, 20}, new java.lang.Object[]{"421", obj, 15}, new java.lang.Object[]{"422", 3}, new java.lang.Object[]{"423", obj, 15}, new java.lang.Object[]{"424", 3}, new java.lang.Object[]{"425", 3}, new java.lang.Object[]{"426", 3}};
        THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH = new java.lang.Object[][]{new java.lang.Object[]{"310", 6}, new java.lang.Object[]{"311", 6}, new java.lang.Object[]{"312", 6}, new java.lang.Object[]{"313", 6}, new java.lang.Object[]{"314", 6}, new java.lang.Object[]{"315", 6}, new java.lang.Object[]{"316", 6}, new java.lang.Object[]{"320", 6}, new java.lang.Object[]{"321", 6}, new java.lang.Object[]{"322", 6}, new java.lang.Object[]{"323", 6}, new java.lang.Object[]{"324", 6}, new java.lang.Object[]{"325", 6}, new java.lang.Object[]{"326", 6}, new java.lang.Object[]{"327", 6}, new java.lang.Object[]{"328", 6}, new java.lang.Object[]{"329", 6}, new java.lang.Object[]{"330", 6}, new java.lang.Object[]{"331", 6}, new java.lang.Object[]{"332", 6}, new java.lang.Object[]{"333", 6}, new java.lang.Object[]{"334", 6}, new java.lang.Object[]{"335", 6}, new java.lang.Object[]{"336", 6}, new java.lang.Object[]{"340", 6}, new java.lang.Object[]{"341", 6}, new java.lang.Object[]{"342", 6}, new java.lang.Object[]{"343", 6}, new java.lang.Object[]{"344", 6}, new java.lang.Object[]{"345", 6}, new java.lang.Object[]{"346", 6}, new java.lang.Object[]{"347", 6}, new java.lang.Object[]{"348", 6}, new java.lang.Object[]{"349", 6}, new java.lang.Object[]{"350", 6}, new java.lang.Object[]{"351", 6}, new java.lang.Object[]{"352", 6}, new java.lang.Object[]{"353", 6}, new java.lang.Object[]{"354", 6}, new java.lang.Object[]{"355", 6}, new java.lang.Object[]{"356", 6}, new java.lang.Object[]{"357", 6}, new java.lang.Object[]{"360", 6}, new java.lang.Object[]{"361", 6}, new java.lang.Object[]{"362", 6}, new java.lang.Object[]{"363", 6}, new java.lang.Object[]{"364", 6}, new java.lang.Object[]{"365", 6}, new java.lang.Object[]{"366", 6}, new java.lang.Object[]{"367", 6}, new java.lang.Object[]{"368", 6}, new java.lang.Object[]{"369", 6}, new java.lang.Object[]{"390", obj, 15}, new java.lang.Object[]{"391", obj, 18}, new java.lang.Object[]{"392", obj, 15}, new java.lang.Object[]{"393", obj, 18}, new java.lang.Object[]{"703", obj, 30}};
        FOUR_DIGIT_DATA_LENGTH = new java.lang.Object[][]{new java.lang.Object[]{"7001", 13}, new java.lang.Object[]{"7002", obj, 30}, new java.lang.Object[]{"7003", 10}, new java.lang.Object[]{"8001", 14}, new java.lang.Object[]{"8002", obj, 20}, new java.lang.Object[]{"8003", obj, 30}, new java.lang.Object[]{"8004", obj, 30}, new java.lang.Object[]{"8005", 6}, new java.lang.Object[]{"8006", 18}, new java.lang.Object[]{"8007", obj, 30}, new java.lang.Object[]{"8008", obj, 12}, new java.lang.Object[]{"8018", 18}, new java.lang.Object[]{"8020", obj, 25}, new java.lang.Object[]{"8100", 6}, new java.lang.Object[]{"8101", 10}, new java.lang.Object[]{"8102", 2}, new java.lang.Object[]{"8110", obj, 70}, new java.lang.Object[]{"8200", obj, 70}};
    }

    private FieldParser() {
    }

    static java.lang.String parseFieldsInGeneralPurpose(java.lang.String str) throws com.google.zxing.NotFoundException {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        java.lang.String substring = str.substring(0, 2);
        for (java.lang.Object[] objArr : TWO_DIGIT_DATA_LENGTH) {
            if (objArr[0].equals(substring)) {
                if (objArr[1] == VARIABLE_LENGTH) {
                    return processVariableAI(2, ((java.lang.Integer) objArr[2]).intValue(), str);
                }
                return processFixedAI(2, ((java.lang.Integer) objArr[1]).intValue(), str);
            }
        }
        if (str.length() < 3) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        java.lang.String substring2 = str.substring(0, 3);
        for (java.lang.Object[] objArr2 : THREE_DIGIT_DATA_LENGTH) {
            if (objArr2[0].equals(substring2)) {
                if (objArr2[1] == VARIABLE_LENGTH) {
                    return processVariableAI(3, ((java.lang.Integer) objArr2[2]).intValue(), str);
                }
                return processFixedAI(3, ((java.lang.Integer) objArr2[1]).intValue(), str);
            }
        }
        for (java.lang.Object[] objArr3 : THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH) {
            if (objArr3[0].equals(substring2)) {
                if (objArr3[1] == VARIABLE_LENGTH) {
                    return processVariableAI(4, ((java.lang.Integer) objArr3[2]).intValue(), str);
                }
                return processFixedAI(4, ((java.lang.Integer) objArr3[1]).intValue(), str);
            }
        }
        if (str.length() < 4) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        java.lang.String substring3 = str.substring(0, 4);
        for (java.lang.Object[] objArr4 : FOUR_DIGIT_DATA_LENGTH) {
            if (objArr4[0].equals(substring3)) {
                if (objArr4[1] == VARIABLE_LENGTH) {
                    return processVariableAI(4, ((java.lang.Integer) objArr4[2]).intValue(), str);
                }
                return processFixedAI(4, ((java.lang.Integer) objArr4[1]).intValue(), str);
            }
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    private static java.lang.String processFixedAI(int i, int i2, java.lang.String str) throws com.google.zxing.NotFoundException {
        if (str.length() < i) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        java.lang.String substring = str.substring(0, i);
        int i3 = i2 + i;
        if (str.length() < i3) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        java.lang.String substring2 = str.substring(i, i3);
        java.lang.String str2 = "(" + substring + ')' + substring2;
        java.lang.String parseFieldsInGeneralPurpose = parseFieldsInGeneralPurpose(str.substring(i3));
        if (parseFieldsInGeneralPurpose == null) {
            return str2;
        }
        return str2 + parseFieldsInGeneralPurpose;
    }

    private static java.lang.String processVariableAI(int i, int i2, java.lang.String str) throws com.google.zxing.NotFoundException {
        java.lang.String substring = str.substring(0, i);
        int i3 = i2 + i;
        if (str.length() < i3) {
            i3 = str.length();
        }
        java.lang.String substring2 = str.substring(i, i3);
        java.lang.String str2 = "(" + substring + ')' + substring2;
        java.lang.String parseFieldsInGeneralPurpose = parseFieldsInGeneralPurpose(str.substring(i3));
        if (parseFieldsInGeneralPurpose == null) {
            return str2;
        }
        return str2 + parseFieldsInGeneralPurpose;
    }
}
