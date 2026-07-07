package net.sourceforge.pinyin4j;

/* loaded from: classes3.dex */
class ChineseToPinyinResource {
    private net.sourceforge.pinyin4j.multipinyin.Trie unicodeToHanyuPinyinTable;

    private void setUnicodeToHanyuPinyinTable(net.sourceforge.pinyin4j.multipinyin.Trie trie) {
        this.unicodeToHanyuPinyinTable = trie;
    }

    net.sourceforge.pinyin4j.multipinyin.Trie getUnicodeToHanyuPinyinTable() {
        return this.unicodeToHanyuPinyinTable;
    }

    private ChineseToPinyinResource() {
        this.unicodeToHanyuPinyinTable = null;
        initializeResource();
    }

    private void initializeResource() {
        try {
            setUnicodeToHanyuPinyinTable(new net.sourceforge.pinyin4j.multipinyin.Trie());
            getUnicodeToHanyuPinyinTable().load(net.sourceforge.pinyin4j.ResourceHelper.getResourceInputStream("/pinyindb/unicode_to_hanyu_pinyin.txt"));
            getUnicodeToHanyuPinyinTable().loadMultiPinyin(net.sourceforge.pinyin4j.ResourceHelper.getResourceInputStream("/pinyindb/multi_pinyin.txt"));
            getUnicodeToHanyuPinyinTable().loadMultiPinyinExtend();
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
        }
    }

    net.sourceforge.pinyin4j.multipinyin.Trie getHanyuPinyinTrie(char c) {
        return getUnicodeToHanyuPinyinTable().get(java.lang.Integer.toHexString(c).toUpperCase());
    }

    java.lang.String[] getHanyuPinyinStringArray(char c) {
        return parsePinyinString(getHanyuPinyinRecordFromChar(c));
    }

    java.lang.String[] parsePinyinString(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return str.substring(str.indexOf("(") + 1, str.lastIndexOf(")")).split(",");
    }

    private boolean isValidRecord(java.lang.String str) {
        return str != null && !str.equals("(none0)") && str.startsWith("(") && str.endsWith(")");
    }

    private java.lang.String getHanyuPinyinRecordFromChar(char c) {
        net.sourceforge.pinyin4j.multipinyin.Trie trie = getUnicodeToHanyuPinyinTable().get(java.lang.Integer.toHexString(c).toUpperCase());
        java.lang.String pinyin = trie != null ? trie.getPinyin() : null;
        if (isValidRecord(pinyin)) {
            return pinyin;
        }
        return null;
    }

    static net.sourceforge.pinyin4j.ChineseToPinyinResource getInstance() {
        return net.sourceforge.pinyin4j.ChineseToPinyinResource.ChineseToPinyinResourceHolder.theInstance;
    }

    private static class ChineseToPinyinResourceHolder {
        static final net.sourceforge.pinyin4j.ChineseToPinyinResource theInstance = new net.sourceforge.pinyin4j.ChineseToPinyinResource();

        private ChineseToPinyinResourceHolder() {
        }
    }

    class Field {
        static final java.lang.String COMMA = ",";
        static final java.lang.String LEFT_BRACKET = "(";
        static final java.lang.String RIGHT_BRACKET = ")";

        Field() {
        }
    }
}
