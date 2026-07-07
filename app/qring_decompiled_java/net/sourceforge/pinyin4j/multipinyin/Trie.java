package net.sourceforge.pinyin4j.multipinyin;

/* loaded from: classes3.dex */
public class Trie {
    private net.sourceforge.pinyin4j.multipinyin.Trie nextTire;
    private java.lang.String pinyin;
    private java.util.Hashtable<java.lang.String, net.sourceforge.pinyin4j.multipinyin.Trie> values = new java.util.Hashtable<>();

    public java.lang.String getPinyin() {
        return this.pinyin;
    }

    public void setPinyin(java.lang.String str) {
        this.pinyin = str;
    }

    public net.sourceforge.pinyin4j.multipinyin.Trie getNextTire() {
        return this.nextTire;
    }

    public void setNextTire(net.sourceforge.pinyin4j.multipinyin.Trie trie) {
        this.nextTire = trie;
    }

    public synchronized void load(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.InputStreamReader inputStreamReader;
        java.lang.Throwable th;
        java.io.BufferedReader bufferedReader;
        try {
            try {
                inputStreamReader = new java.io.InputStreamReader(inputStream);
                try {
                    bufferedReader = new java.io.BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            java.lang.String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                java.lang.String[] split = readLine.split(" ");
                                if (split.length == 2) {
                                    net.sourceforge.pinyin4j.multipinyin.Trie trie = new net.sourceforge.pinyin4j.multipinyin.Trie();
                                    trie.pinyin = split[1];
                                    put(split[0], trie);
                                }
                            } else {
                                inputStreamReader.close();
                                bufferedReader.close();
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                }
            } catch (java.lang.Throwable th4) {
                throw th4;
            }
        } catch (java.lang.Throwable th5) {
            inputStreamReader = null;
            th = th5;
            bufferedReader = null;
        }
    }

    public synchronized void loadMultiPinyin(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.InputStreamReader inputStreamReader;
        java.lang.Throwable th;
        java.io.BufferedReader bufferedReader;
        try {
            try {
                inputStreamReader = new java.io.InputStreamReader(inputStream);
                try {
                    bufferedReader = new java.io.BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            java.lang.String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                java.lang.String[] split = readLine.split(" ");
                                if (split.length == 2) {
                                    int i = 0;
                                    java.lang.String str = split[0];
                                    java.lang.String str2 = split[1];
                                    char[] charArray = str.toCharArray();
                                    net.sourceforge.pinyin4j.multipinyin.Trie trie = this;
                                    while (true) {
                                        if (i >= charArray.length) {
                                            break;
                                        }
                                        java.lang.String upperCase = java.lang.Integer.toHexString(charArray[i]).toUpperCase();
                                        net.sourceforge.pinyin4j.multipinyin.Trie trie2 = trie.get(upperCase);
                                        if (trie2 == null) {
                                            trie.put(upperCase, new net.sourceforge.pinyin4j.multipinyin.Trie());
                                            trie2 = trie.get(upperCase);
                                        }
                                        net.sourceforge.pinyin4j.multipinyin.Trie nextTire = trie2.getNextTire();
                                        if (charArray.length - 1 == i) {
                                            trie2.pinyin = str2;
                                            break;
                                        }
                                        if (nextTire != null) {
                                            trie = nextTire;
                                        } else if (charArray.length - 1 != i) {
                                            trie = new net.sourceforge.pinyin4j.multipinyin.Trie();
                                            trie2.setNextTire(trie);
                                            trie.put(java.lang.Integer.toHexString(charArray[i + 1]).toUpperCase(), new net.sourceforge.pinyin4j.multipinyin.Trie());
                                        }
                                        i++;
                                    }
                                }
                            } else {
                                inputStreamReader.close();
                                bufferedReader.close();
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                }
            } catch (java.lang.Throwable th4) {
                throw th4;
            }
        } catch (java.lang.Throwable th5) {
            inputStreamReader = null;
            th = th5;
            bufferedReader = null;
        }
    }

    public void loadMultiPinyinExtend() throws java.io.IOException {
        java.lang.String str = net.sourceforge.pinyin4j.multipinyin.MultiPinyinConfig.multiPinyinPath;
        if (str != null) {
            java.io.File file = new java.io.File(str);
            if (file.exists()) {
                loadMultiPinyin(new java.io.FileInputStream(file));
            }
        }
    }

    public net.sourceforge.pinyin4j.multipinyin.Trie get(java.lang.String str) {
        return this.values.get(str);
    }

    public void put(java.lang.String str, net.sourceforge.pinyin4j.multipinyin.Trie trie) {
        this.values.put(str, trie);
    }
}
