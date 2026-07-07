package com.realsil.sdk.audioconnect.localplayback.entity;

/* loaded from: /tmp/dex/classes2.dex */
public class SongInfo {
    public int a;
    public int b;
    public int c;
    public int d;
    public java.lang.String e;
    public java.lang.String f;
    public byte[] g;
    public java.util.List<java.lang.Integer> h;
    public boolean i;
    public boolean j;

    public static byte a(int i, int i2) {
        return (byte) ((i >> i2) & 1);
    }

    public java.util.List<java.lang.Integer> getRelatePlayList() {
        return this.h;
    }

    public int getRelatePlayListIndex() {
        return this.d;
    }

    public int getSongIndexInFileList() {
        return this.c;
    }

    public java.lang.String getSongName() {
        return this.e;
    }

    public byte[] getSongNameBuffer() {
        return this.g;
    }

    public int getSongNameLength() {
        return this.b;
    }

    public int getSongNameOffset() {
        return this.a;
    }

    public java.lang.String getSongNameWithoutSuffix() {
        return this.f;
    }

    public boolean isChecked() {
        return this.i;
    }

    public boolean isDeleted() {
        return this.j;
    }

    public void setChecked(boolean z) {
        this.i = z;
    }

    public void setDeleted(boolean z) {
        this.j = z;
    }

    public void setRelatePlayListIndex(int i) {
        this.d = i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < 16; i2++) {
            if (a(this.d, i2) == 1) {
                arrayList.add(java.lang.Integer.valueOf(i2));
            }
        }
        this.h = arrayList;
    }

    public void setSongIndexInFileList(int i) {
        this.c = i;
    }

    public void setSongName(java.lang.String str) {
        this.e = str;
    }

    public void setSongNameBuffer(byte[] bArr) {
        this.g = bArr;
    }

    public void setSongNameLength(int i) {
        this.b = i;
    }

    public void setSongNameOffset(int i) {
        this.a = i;
    }

    public void setSongNameWithoutSuffix(java.lang.String str) {
        this.f = str;
    }
}
