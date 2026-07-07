package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class StringUtils {
    public static java.lang.String null2Length0(java.lang.String str) {
        return str == null ? "" : str;
    }

    private StringUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean isEmpty(java.lang.CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isTrimEmpty(java.lang.String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isSpace(java.lang.String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!java.lang.Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equals(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsIgnoreCase(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static int length(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static java.lang.String upperFirstLetter(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (!java.lang.Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return ((char) (str.charAt(0) - ' ')) + str.substring(1);
    }

    public static java.lang.String lowerFirstLetter(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (!java.lang.Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        return java.lang.String.valueOf((char) (str.charAt(0) + ' ')) + str.substring(1);
    }

    public static java.lang.String reverse(java.lang.String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        if (length <= 1) {
            return str;
        }
        int i = length >> 1;
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < i; i2++) {
            char c = charArray[i2];
            int i3 = (length - i2) - 1;
            charArray[i2] = charArray[i3];
            charArray[i3] = c;
        }
        return new java.lang.String(charArray);
    }

    public static java.lang.String toDBC(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            if (charArray[i] == 12288) {
                charArray[i] = ' ';
            } else if (65281 <= charArray[i] && charArray[i] <= 65374) {
                charArray[i] = (char) (charArray[i] - 65248);
            } else {
                charArray[i] = charArray[i];
            }
        }
        return new java.lang.String(charArray);
    }

    public static java.lang.String toSBC(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            if (charArray[i] == ' ') {
                charArray[i] = 12288;
            } else if ('!' <= charArray[i] && charArray[i] <= '~') {
                charArray[i] = (char) (charArray[i] + 65248);
            } else {
                charArray[i] = charArray[i];
            }
        }
        return new java.lang.String(charArray);
    }

    public static java.lang.String getString(int i) {
        return getString(i, null);
    }

    public static java.lang.String getString(int i, java.lang.Object... objArr) {
        try {
            return format(com.blankj.utilcode.util.Utils.getApp().getString(i), objArr);
        } catch (android.content.res.Resources.NotFoundException e) {
            e.printStackTrace();
            return java.lang.String.valueOf(i);
        }
    }

    public static java.lang.String[] getStringArray(int i) {
        try {
            return com.blankj.utilcode.util.Utils.getApp().getResources().getStringArray(i);
        } catch (android.content.res.Resources.NotFoundException e) {
            e.printStackTrace();
            return new java.lang.String[]{java.lang.String.valueOf(i)};
        }
    }

    public static java.lang.String format(java.lang.String str, java.lang.Object... objArr) {
        if (str == null || objArr == null || objArr.length <= 0) {
            return str;
        }
        try {
            return java.lang.String.format(str, objArr);
        } catch (java.util.IllegalFormatException e) {
            e.printStackTrace();
            return str;
        }
    }
}
