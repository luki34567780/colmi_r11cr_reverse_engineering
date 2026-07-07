package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class RegexUtils {
    private static final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.String> CITY_MAP = new androidx.collection.SimpleArrayMap<>();

    private RegexUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean isMobileSimple(java.lang.CharSequence charSequence) {
        return isMatch(com.blankj.utilcode.constant.RegexConstants.REGEX_MOBILE_SIMPLE, charSequence);
    }

    public static boolean isMobileExact(java.lang.CharSequence charSequence) {
        return isMobileExact(charSequence, null);
    }

    public static boolean isMobileExact(java.lang.CharSequence charSequence, java.util.List<java.lang.String> list) {
        if (isMatch(com.blankj.utilcode.constant.RegexConstants.REGEX_MOBILE_EXACT, charSequence)) {
            return true;
        }
        if (list != null && charSequence != null && charSequence.length() == 11) {
            java.lang.String charSequence2 = charSequence.toString();
            for (char c : charSequence2.toCharArray()) {
                if (!java.lang.Character.isDigit(c)) {
                    return false;
                }
            }
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                if (charSequence2.startsWith(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isTel(java.lang.CharSequence charSequence) {
        return isMatch(com.blankj.utilcode.constant.RegexConstants.REGEX_TEL, charSequence);
    }

    public static boolean isIDCard15(java.lang.CharSequence charSequence) {
        return isMatch(com.blankj.utilcode.constant.RegexConstants.REGEX_ID_CARD15, charSequence);
    }

    public static boolean isIDCard18(java.lang.CharSequence charSequence) {
        return isMatch(com.blankj.utilcode.constant.RegexConstants.REGEX_ID_CARD18, charSequence);
    }

    public static boolean isIDCard18Exact(java.lang.CharSequence charSequence) {
        if (!isIDCard18(charSequence)) {
            return false;
        }
        int[] iArr = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] cArr = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        androidx.collection.SimpleArrayMap<java.lang.String, java.lang.String> simpleArrayMap = CITY_MAP;
        if (simpleArrayMap.isEmpty()) {
            simpleArrayMap.put("11", "北京");
            simpleArrayMap.put("12", "天津");
            simpleArrayMap.put("13", "河北");
            simpleArrayMap.put("14", "山西");
            simpleArrayMap.put("15", "内蒙古");
            simpleArrayMap.put("21", "辽宁");
            simpleArrayMap.put("22", "吉林");
            simpleArrayMap.put("23", "黑龙江");
            simpleArrayMap.put("31", "上海");
            simpleArrayMap.put("32", "江苏");
            simpleArrayMap.put("33", "浙江");
            simpleArrayMap.put("34", "安徽");
            simpleArrayMap.put("35", "福建");
            simpleArrayMap.put("36", "江西");
            simpleArrayMap.put("37", "山东");
            simpleArrayMap.put("41", "河南");
            simpleArrayMap.put(androidx.room.RoomMasterTable.DEFAULT_ID, "湖北");
            simpleArrayMap.put("43", "湖南");
            simpleArrayMap.put("44", "广东");
            simpleArrayMap.put("45", "广西");
            simpleArrayMap.put("46", "海南");
            simpleArrayMap.put("50", "重庆");
            simpleArrayMap.put("51", "四川");
            simpleArrayMap.put("52", "贵州");
            simpleArrayMap.put("53", "云南");
            simpleArrayMap.put("54", "西藏");
            simpleArrayMap.put("61", "陕西");
            simpleArrayMap.put("62", "甘肃");
            simpleArrayMap.put("63", "青海");
            simpleArrayMap.put("64", "宁夏");
            simpleArrayMap.put("65", "新疆");
            simpleArrayMap.put("71", "台湾老");
            simpleArrayMap.put("81", "香港");
            simpleArrayMap.put("82", "澳门");
            simpleArrayMap.put("83", "台湾新");
            simpleArrayMap.put("91", "国外");
        }
        if (simpleArrayMap.get(charSequence.subSequence(0, 2).toString()) == null) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < 17; i2++) {
            i += (charSequence.charAt(i2) - '0') * iArr[i2];
        }
        return charSequence.charAt(17) == cArr[i % 11];
    }

    public static boolean isEmail(java.lang.CharSequence charSequence) {
        return isMatch(com.blankj.utilcode.constant.RegexConstants.REGEX_EMAIL, charSequence);
    }

    public static boolean isURL(java.lang.CharSequence charSequence) {
        return isMatch(com.blankj.utilcode.constant.RegexConstants.REGEX_URL, charSequence);
    }

    public static boolean isZh(java.lang.CharSequence charSequence) {
        return isMatch(com.blankj.utilcode.constant.RegexConstants.REGEX_ZH, charSequence);
    }

    public static boolean isUsername(java.lang.CharSequence charSequence) {
        return isMatch(com.blankj.utilcode.constant.RegexConstants.REGEX_USERNAME, charSequence);
    }

    public static boolean isDate(java.lang.CharSequence charSequence) {
        return isMatch(com.blankj.utilcode.constant.RegexConstants.REGEX_DATE, charSequence);
    }

    public static boolean isIP(java.lang.CharSequence charSequence) {
        return isMatch(com.blankj.utilcode.constant.RegexConstants.REGEX_IP, charSequence);
    }

    public static boolean isMatch(java.lang.String str, java.lang.CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0 && java.util.regex.Pattern.matches(str, charSequence);
    }

    public static java.util.List<java.lang.String> getMatches(java.lang.String str, java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(str).matcher(charSequence);
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }

    public static java.lang.String[] getSplits(java.lang.String str, java.lang.String str2) {
        return str == null ? new java.lang.String[0] : str.split(str2);
    }

    public static java.lang.String getReplaceFirst(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str == null ? "" : java.util.regex.Pattern.compile(str2).matcher(str).replaceFirst(str3);
    }

    public static java.lang.String getReplaceAll(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str == null ? "" : java.util.regex.Pattern.compile(str2).matcher(str).replaceAll(str3);
    }
}
