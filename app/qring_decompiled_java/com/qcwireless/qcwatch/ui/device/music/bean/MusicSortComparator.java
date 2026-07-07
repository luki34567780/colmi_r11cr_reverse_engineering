package com.qcwireless.qcwatch.ui.device.music.bean;

/* loaded from: /tmp/dex/classes2.dex */
public class MusicSortComparator implements java.util.Comparator {
    private int compareCallNum = 0;

    @Override // java.util.Comparator
    public int compare(java.lang.Object o1, java.lang.Object o2) {
        com.qcwireless.qcwatch.ui.device.music.bean.Song song = (com.qcwireless.qcwatch.ui.device.music.bean.Song) o1;
        if (song.getFirstName().equals("#") && !((com.qcwireless.qcwatch.ui.device.music.bean.Song) o2).getFirstName().equals("#")) {
            return 1;
        }
        if (song.getFirstName().equals("#") || !((com.qcwireless.qcwatch.ui.device.music.bean.Song) o2).getFirstName().equals("#")) {
            return song.getFirstName().compareToIgnoreCase(((com.qcwireless.qcwatch.ui.device.music.bean.Song) o2).getFirstName());
        }
        return -1;
    }

    private int compareString(java.lang.String o1, java.lang.String o2) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        this.compareCallNum++;
        if (o1.length() == 0 && o2.length() == 0) {
            return 0;
        }
        if (o1.length() == 0) {
            return -1;
        }
        if (o2.length() == 0) {
            return 1;
        }
        java.lang.String substring = o1.substring(0, 1);
        java.lang.String substring2 = o2.substring(0, 1);
        int firstCharType = getFirstCharType(o1);
        int firstCharType2 = getFirstCharType(o2);
        if (firstCharType > firstCharType2) {
            return -1;
        }
        if (firstCharType < firstCharType2) {
            return 1;
        }
        if (firstCharType < 9 && firstCharType2 < 9) {
            int compareTo4 = substring.compareTo(substring2);
            return compareTo4 != 0 ? compareTo4 : compareString(o1.substring(1), o2.substring(1));
        }
        java.lang.String substring3 = com.qcwireless.qcwatch.ui.device.contact.bean.PinYinStringHelper.getFirstPingYin(o1).substring(0, 1);
        java.lang.String substring4 = com.qcwireless.qcwatch.ui.device.contact.bean.PinYinStringHelper.getFirstPingYin(o2).substring(0, 1);
        if (this.compareCallNum == 1 && (compareTo3 = substring3.compareTo(substring4)) != 0) {
            return compareTo3;
        }
        int firstCharType22 = getFirstCharType2(o1);
        int firstCharType23 = getFirstCharType2(o2);
        if (firstCharType22 > firstCharType23) {
            return -1;
        }
        if (firstCharType22 < firstCharType23) {
            return 1;
        }
        if (this.compareCallNum != 1 && (compareTo2 = substring3.compareTo(substring4)) != 0) {
            return compareTo2;
        }
        if (isLetter(o1) && isLetter(o2) && (compareTo = substring.compareTo(substring2)) != 0) {
            return compareTo;
        }
        if (isHanzi(o1) && isHanzi(o2)) {
            int compareTo5 = com.qcwireless.qcwatch.ui.device.contact.bean.PinYinStringHelper.getFirstPingYin(o1).compareTo(com.qcwireless.qcwatch.ui.device.contact.bean.PinYinStringHelper.getFirstPingYin(o2));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            int compareTo6 = substring.compareTo(substring2);
            if (compareTo6 != 0) {
                return compareTo6;
            }
        }
        return compareString(o1.substring(1), o2.substring(1));
    }

    private int getFirstCharType2(java.lang.String str) {
        if (isHanzi(str)) {
            return 10;
        }
        if (isLetter(str)) {
            return 9;
        }
        return isNumber(str) ? 8 : 0;
    }

    private int getFirstCharType(java.lang.String str) {
        if (isHanzi(str) || isLetter(str)) {
            return 10;
        }
        return isNumber(str) ? 8 : 0;
    }

    private boolean isLetter(java.lang.String str) {
        char charAt = str.charAt(0);
        return java.util.regex.Pattern.compile("^[A-Za-z]+$").matcher(charAt + "").matches();
    }

    private boolean isNumber(java.lang.String str) {
        char charAt = str.charAt(0);
        return java.util.regex.Pattern.compile("^[1-9]+$").matcher(charAt + "").matches();
    }

    private boolean isHanzi(java.lang.String str) {
        char charAt = str.charAt(0);
        return java.util.regex.Pattern.compile("[\\u4E00-\\u9FA5]+").matcher(charAt + "").matches();
    }
}
