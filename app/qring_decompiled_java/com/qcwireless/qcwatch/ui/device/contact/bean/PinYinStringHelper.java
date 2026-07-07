package com.qcwireless.qcwatch.ui.device.contact.bean;

/* loaded from: /tmp/dex/classes2.dex */
public class PinYinStringHelper {
    public static java.util.Map<java.lang.String, java.lang.String> specialHanzi;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        specialHanzi = hashMap;
        hashMap.put("重", "虫");
        specialHanzi.put("贾", "甲");
        specialHanzi.put("瞿", "渠");
        specialHanzi.put("单", "擅");
        specialHanzi.put("沈", "审");
        specialHanzi.put("解", "谢");
        specialHanzi.put("俞", "于");
        specialHanzi.put("曾", "增");
    }

    public static java.lang.String getPingYin(java.lang.String src) {
        if (src.trim().length() < 1) {
            return null;
        }
        java.lang.String substring = src.trim().substring(0, 1);
        if (specialHanzi.containsKey(substring)) {
            src = src.replace(substring, specialHanzi.get(substring));
        }
        char[] charArray = src.toCharArray();
        java.lang.String[] strArr = new java.lang.String[charArray.length];
        net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat hanyuPinyinOutputFormat = new net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat();
        hanyuPinyinOutputFormat.setCaseType(net.sourceforge.pinyin4j.format.HanyuPinyinCaseType.LOWERCASE);
        hanyuPinyinOutputFormat.setToneType(net.sourceforge.pinyin4j.format.HanyuPinyinToneType.WITHOUT_TONE);
        hanyuPinyinOutputFormat.setVCharType(net.sourceforge.pinyin4j.format.HanyuPinyinVCharType.WITH_V);
        int length = charArray.length;
        java.lang.String str = "";
        for (int i = 0; i < length; i++) {
            try {
                str = java.lang.Character.toString(charArray[i]).matches("[\\u4E00-\\u9FA5]+") ? str + net.sourceforge.pinyin4j.PinyinHelper.toHanyuPinyinStringArray(charArray[i], hanyuPinyinOutputFormat)[0] : str + java.lang.Character.toString(charArray[i]);
            } catch (net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination e) {
                e.printStackTrace();
                return str.toUpperCase();
            }
        }
        return str.toUpperCase();
    }

    public static java.lang.String getFirstPingYin(java.lang.String src) {
        if (src.length() < 1) {
            return null;
        }
        if (!isHanzi(src)) {
            return src.substring(0, 1).toUpperCase();
        }
        java.lang.String substring = src.substring(0, 1);
        if (specialHanzi.containsKey(substring)) {
            substring = specialHanzi.get(substring);
        }
        char[] charArray = substring.toCharArray();
        java.lang.String[] strArr = new java.lang.String[charArray.length];
        net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat hanyuPinyinOutputFormat = new net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat();
        hanyuPinyinOutputFormat.setCaseType(net.sourceforge.pinyin4j.format.HanyuPinyinCaseType.LOWERCASE);
        hanyuPinyinOutputFormat.setToneType(net.sourceforge.pinyin4j.format.HanyuPinyinToneType.WITHOUT_TONE);
        hanyuPinyinOutputFormat.setVCharType(net.sourceforge.pinyin4j.format.HanyuPinyinVCharType.WITH_V);
        int length = charArray.length;
        java.lang.String str = "";
        for (int i = 0; i < length; i++) {
            try {
                str = java.lang.Character.toString(charArray[i]).matches("[\\u4E00-\\u9FA5]+") ? str + net.sourceforge.pinyin4j.PinyinHelper.toHanyuPinyinStringArray(charArray[i], hanyuPinyinOutputFormat)[0] : str + java.lang.Character.toString(charArray[i]);
            } catch (net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination e) {
                e.printStackTrace();
                return str.toUpperCase();
            }
        }
        return str.toUpperCase();
    }

    public static java.lang.String getPinYinHeadChar(java.lang.String str) {
        if (str.trim().length() < 1) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            java.lang.String[] hanyuPinyinStringArray = net.sourceforge.pinyin4j.PinyinHelper.toHanyuPinyinStringArray(charAt);
            if (hanyuPinyinStringArray != null) {
                sb.append(hanyuPinyinStringArray[0].charAt(0));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString().toUpperCase();
    }

    public static java.lang.String getAlpha(java.lang.String str) {
        if (str == null || str.trim().length() == 0) {
            return "#";
        }
        if (!isHanzi(str) && !isLetter(str)) {
            return "#";
        }
        char charAt = str.trim().substring(0, 1).charAt(0);
        if (java.util.regex.Pattern.compile("^[A-Za-z]+$").matcher(charAt + "").matches()) {
            return (charAt + "").toUpperCase();
        }
        java.lang.String headChar = getHeadChar(str);
        return (headChar == null || headChar.length() <= 0) ? "#" : headChar.substring(0, 1);
    }

    public static java.lang.String getHeadChar(java.lang.String str) {
        java.lang.String str2;
        if (str == null) {
            return "#";
        }
        try {
            if (str.trim().length() < 1) {
                return "#";
            }
            java.lang.String substring = str.trim().substring(0, 1);
            if (specialHanzi.containsKey(substring)) {
                str = specialHanzi.get(substring);
            }
            char charAt = str.charAt(0);
            java.lang.String[] hanyuPinyinStringArray = net.sourceforge.pinyin4j.PinyinHelper.toHanyuPinyinStringArray(charAt);
            if (hanyuPinyinStringArray != null) {
                str2 = "" + hanyuPinyinStringArray[0].charAt(0);
            } else {
                str2 = "" + charAt;
            }
            return str2.toUpperCase();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "#";
        }
    }

    public static boolean isHanzi(java.lang.String str) {
        char charAt = str.charAt(0);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[\\u4E00-\\u9FA5]+");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charAt);
        sb.append("");
        return compile.matcher(sb.toString()).matches();
    }

    public static boolean isLetter(java.lang.String str) {
        char charAt = str.charAt(0);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^[A-Za-z]+$");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charAt);
        sb.append("");
        return compile.matcher(sb.toString()).matches();
    }
}
