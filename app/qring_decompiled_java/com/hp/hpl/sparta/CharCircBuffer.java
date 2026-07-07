package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
class CharCircBuffer {
    private final int[] buf_;
    private int next_ = 0;
    private int total_ = 0;
    private boolean enabled_ = true;

    CharCircBuffer(int i) {
        this.buf_ = new int[i];
    }

    void enable() {
        this.enabled_ = true;
    }

    void disable() {
        this.enabled_ = false;
    }

    void addInt(int i) {
        addRaw(i + com.liulishuo.okdownload.DownloadTask.Builder.DEFAULT_SYNC_BUFFER_SIZE);
    }

    void addChar(char c) {
        addRaw(c);
    }

    private void addRaw(int i) {
        if (this.enabled_) {
            int[] iArr = this.buf_;
            int i2 = this.next_;
            iArr[i2] = i;
            this.next_ = (i2 + 1) % iArr.length;
            this.total_++;
        }
    }

    void addString(java.lang.String str) {
        for (char c : str.toCharArray()) {
            addChar(c);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer((this.buf_.length * 11) / 10);
        int i = this.total_;
        int[] iArr = this.buf_;
        int length = i < iArr.length ? iArr.length - i : 0;
        while (true) {
            int[] iArr2 = this.buf_;
            if (length < iArr2.length) {
                int i2 = iArr2[(this.next_ + length) % iArr2.length];
                if (i2 < 65536) {
                    stringBuffer.append((char) i2);
                } else {
                    stringBuffer.append(java.lang.Integer.toString(i2 - com.liulishuo.okdownload.DownloadTask.Builder.DEFAULT_SYNC_BUFFER_SIZE));
                }
                length++;
            } else {
                return stringBuffer.toString();
            }
        }
    }
}
