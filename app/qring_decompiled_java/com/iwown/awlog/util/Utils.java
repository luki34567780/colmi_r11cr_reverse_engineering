package com.iwown.awlog.util;

/* loaded from: /tmp/dex/classes2.dex */
public class Utils {
    public static final int DIVIDER_BOTTOM = 2;
    public static final int DIVIDER_CENTER = 4;
    public static final int DIVIDER_NORMAL = 3;
    public static final int DIVIDER_TOP = 1;

    public static java.lang.String printDividingLine(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "├────────────────────────────────────────────────────────────────────────────" : "│" : "└────────────────────────────────────────────────────────────────────────────" : "┌────────────────────────────────────────────────────────────────────────────";
    }

    public static java.lang.String shortenClassName(java.lang.String str, int i, int i2) throws java.lang.Exception {
        java.lang.String shortenPackagesName = shortenPackagesName(str, i);
        if (shortenPackagesName == null) {
            return null;
        }
        if (i2 == 0 || i2 > shortenPackagesName.length()) {
            return shortenPackagesName;
        }
        int i3 = 0;
        if (i2 < 0) {
            int i4 = -i2;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int length = shortenPackagesName.length() - 1;
            while (true) {
                if (length > 0) {
                    int lastIndexOf = shortenPackagesName.lastIndexOf(46, length);
                    if (lastIndexOf == -1) {
                        if (sb.length() > 0 && sb.length() + length + 1 > i4) {
                            sb.insert(0, '*');
                            break;
                        }
                        sb.insert(0, shortenPackagesName.substring(0, length + 1));
                        length = lastIndexOf - 1;
                    } else {
                        if (sb.length() > 0 && sb.length() + ((length + 1) - lastIndexOf) + 1 > i4) {
                            sb.insert(0, '*');
                            break;
                        }
                        sb.insert(0, shortenPackagesName.substring(lastIndexOf, length + 1));
                        length = lastIndexOf - 1;
                    }
                } else {
                    break;
                }
            }
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        while (true) {
            if (i3 < shortenPackagesName.length()) {
                int indexOf = shortenPackagesName.indexOf(46, i3);
                if (indexOf == -1) {
                    if (sb2.length() > 0) {
                        sb2.insert(sb2.length(), '*');
                    } else {
                        sb2.insert(sb2.length(), shortenPackagesName.substring(i3, shortenPackagesName.length()));
                    }
                } else {
                    if (sb2.length() > 0 && indexOf + 1 > i2) {
                        sb2.insert(sb2.length(), '*');
                        break;
                    }
                    int i5 = indexOf + 1;
                    sb2.insert(sb2.length(), shortenPackagesName.substring(i3, i5));
                    i3 = i5;
                }
            } else {
                break;
            }
        }
        return sb2.toString();
    }

    private static java.lang.String shortenPackagesName(java.lang.String str, int i) {
        if (str == null) {
            return null;
        }
        if (i == 0) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i2 = 1;
        if (i > 0) {
            int i3 = 0;
            while (true) {
                if (i3 >= str.length()) {
                    break;
                }
                int indexOf = str.indexOf(46, i3);
                if (indexOf == -1) {
                    sb.insert(sb.length(), str.substring(i3, str.length()));
                    break;
                }
                if (i2 == i) {
                    sb.insert(sb.length(), str.substring(i3, indexOf));
                    break;
                }
                int i4 = indexOf + 1;
                sb.insert(sb.length(), str.substring(i3, i4));
                i2++;
                i3 = i4;
            }
        } else {
            java.lang.String shortenPackagesName = shortenPackagesName(str, -i);
            if (str.equals(shortenPackagesName)) {
                sb.insert(sb.length(), str.substring(str.lastIndexOf(46) + 1, str.length()));
            } else {
                return str.replaceFirst(shortenPackagesName + '.', "");
            }
        }
        return sb.toString();
    }

    public static java.lang.String shorten(java.lang.String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (java.lang.Math.abs(i2) < str.length()) {
            str = i2 < 0 ? str.substring(str.length() + i2, str.length()) : i2 > 0 ? str.substring(0, i2) : str;
        }
        if (java.lang.Math.abs(i) <= str.length()) {
            return str;
        }
        return java.lang.String.format("%" + i + "s", str);
    }
}
