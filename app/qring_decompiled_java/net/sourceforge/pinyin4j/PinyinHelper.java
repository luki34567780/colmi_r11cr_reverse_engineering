package net.sourceforge.pinyin4j;

/* loaded from: classes3.dex */
public class PinyinHelper {
    private static final java.lang.String[] ARR_EMPTY = new java.lang.String[0];
    private static final java.lang.String EMPTY = "";

    public static java.lang.String[] toHanyuPinyinStringArray(char c) {
        return getUnformattedHanyuPinyinStringArray(c);
    }

    public static java.lang.String[] toHanyuPinyinStringArray(char c, net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat hanyuPinyinOutputFormat) throws net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination {
        return getFormattedHanyuPinyinStringArray(c, hanyuPinyinOutputFormat);
    }

    private static java.lang.String[] getFormattedHanyuPinyinStringArray(char c, net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat hanyuPinyinOutputFormat) throws net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination {
        java.lang.String[] unformattedHanyuPinyinStringArray = getUnformattedHanyuPinyinStringArray(c);
        if (unformattedHanyuPinyinStringArray != null) {
            for (int i = 0; i < unformattedHanyuPinyinStringArray.length; i++) {
                unformattedHanyuPinyinStringArray[i] = net.sourceforge.pinyin4j.PinyinFormatter.formatHanyuPinyin(unformattedHanyuPinyinStringArray[i], hanyuPinyinOutputFormat);
            }
            return unformattedHanyuPinyinStringArray;
        }
        return ARR_EMPTY;
    }

    private static java.lang.String[] getUnformattedHanyuPinyinStringArray(char c) {
        return net.sourceforge.pinyin4j.ChineseToPinyinResource.getInstance().getHanyuPinyinStringArray(c);
    }

    public static java.lang.String[] toTongyongPinyinStringArray(char c) {
        return convertToTargetPinyinStringArray(c, net.sourceforge.pinyin4j.PinyinRomanizationType.TONGYONG_PINYIN);
    }

    public static java.lang.String[] toWadeGilesPinyinStringArray(char c) {
        return convertToTargetPinyinStringArray(c, net.sourceforge.pinyin4j.PinyinRomanizationType.WADEGILES_PINYIN);
    }

    public static java.lang.String[] toMPS2PinyinStringArray(char c) {
        return convertToTargetPinyinStringArray(c, net.sourceforge.pinyin4j.PinyinRomanizationType.MPS2_PINYIN);
    }

    public static java.lang.String[] toYalePinyinStringArray(char c) {
        return convertToTargetPinyinStringArray(c, net.sourceforge.pinyin4j.PinyinRomanizationType.YALE_PINYIN);
    }

    private static java.lang.String[] convertToTargetPinyinStringArray(char c, net.sourceforge.pinyin4j.PinyinRomanizationType pinyinRomanizationType) {
        java.lang.String[] unformattedHanyuPinyinStringArray = getUnformattedHanyuPinyinStringArray(c);
        if (unformattedHanyuPinyinStringArray != null) {
            java.lang.String[] strArr = new java.lang.String[unformattedHanyuPinyinStringArray.length];
            for (int i = 0; i < unformattedHanyuPinyinStringArray.length; i++) {
                strArr[i] = net.sourceforge.pinyin4j.PinyinRomanizationTranslator.convertRomanizationSystem(unformattedHanyuPinyinStringArray[i], net.sourceforge.pinyin4j.PinyinRomanizationType.HANYU_PINYIN, pinyinRomanizationType);
            }
            return strArr;
        }
        return ARR_EMPTY;
    }

    public static java.lang.String[] toGwoyeuRomatzyhStringArray(char c) {
        return convertToGwoyeuRomatzyhStringArray(c);
    }

    private static java.lang.String[] convertToGwoyeuRomatzyhStringArray(char c) {
        java.lang.String[] unformattedHanyuPinyinStringArray = getUnformattedHanyuPinyinStringArray(c);
        if (unformattedHanyuPinyinStringArray != null) {
            java.lang.String[] strArr = new java.lang.String[unformattedHanyuPinyinStringArray.length];
            for (int i = 0; i < unformattedHanyuPinyinStringArray.length; i++) {
                strArr[i] = net.sourceforge.pinyin4j.GwoyeuRomatzyhTranslator.convertHanyuPinyinToGwoyeuRomatzyh(unformattedHanyuPinyinStringArray[i]);
            }
            return strArr;
        }
        return ARR_EMPTY;
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.String toHanYuPinyinString(java.lang.String r9, net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat r10, java.lang.String r11, boolean r12) throws net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination {
        /*
            net.sourceforge.pinyin4j.ChineseToPinyinResource r0 = net.sourceforge.pinyin4j.ChineseToPinyinResource.getInstance()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char[] r9 = r9.toCharArray()
            r2 = 0
            r3 = 0
        Lf:
            int r4 = r9.length
            if (r3 >= r4) goto L75
            r4 = 0
            char r5 = r9[r3]
            net.sourceforge.pinyin4j.multipinyin.Trie r6 = r0.getUnicodeToHanyuPinyinTable()
            r7 = r3
            r8 = r7
        L1b:
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            java.lang.String r5 = r5.toUpperCase()
            net.sourceforge.pinyin4j.multipinyin.Trie r5 = r6.get(r5)
            if (r5 == 0) goto L38
            java.lang.String r6 = r5.getPinyin()
            if (r6 == 0) goto L34
            java.lang.String r4 = r5.getPinyin()
            r8 = r7
        L34:
            net.sourceforge.pinyin4j.multipinyin.Trie r5 = r5.getNextTire()
        L38:
            r6 = r5
            int r7 = r7 + 1
            int r5 = r9.length
            if (r7 >= r5) goto L42
            char r5 = r9[r7]
            if (r6 != 0) goto L1b
        L42:
            if (r4 != 0) goto L4c
            if (r12 == 0) goto L72
            char r3 = r9[r3]
            r1.append(r3)
            goto L72
        L4c:
            java.lang.String[] r4 = r0.parsePinyinString(r4)
            if (r4 == 0) goto L72
            r5 = 0
        L53:
            int r6 = r4.length
            if (r5 >= r6) goto L72
            r6 = r4[r5]
            java.lang.String r6 = net.sourceforge.pinyin4j.PinyinFormatter.formatHanyuPinyin(r6, r10)
            r1.append(r6)
            int r6 = r9.length
            if (r7 < r6) goto L69
            int r6 = r4.length
            int r6 = r6 + (-1)
            if (r5 >= r6) goto L6c
            if (r3 == r8) goto L6c
        L69:
            r1.append(r11)
        L6c:
            if (r3 != r8) goto L6f
            goto L72
        L6f:
            int r5 = r5 + 1
            goto L53
        L72:
            int r3 = r8 + 1
            goto Lf
        L75:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sourceforge.pinyin4j.PinyinHelper.toHanYuPinyinString(java.lang.String, net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat, java.lang.String, boolean):java.lang.String");
    }

    private PinyinHelper() {
    }
}
