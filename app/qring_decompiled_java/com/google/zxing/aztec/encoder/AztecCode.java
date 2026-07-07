package com.google.zxing.aztec.encoder;

/* loaded from: /tmp/dex/classes2.dex */
public final class AztecCode {
    private int codeWords;
    private boolean compact;
    private int layers;
    private com.google.zxing.common.BitMatrix matrix;
    private int size;

    public boolean isCompact() {
        return this.compact;
    }

    public void setCompact(boolean z) {
        this.compact = z;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public int getLayers() {
        return this.layers;
    }

    public void setLayers(int i) {
        this.layers = i;
    }

    public int getCodeWords() {
        return this.codeWords;
    }

    public void setCodeWords(int i) {
        this.codeWords = i;
    }

    public com.google.zxing.common.BitMatrix getMatrix() {
        return this.matrix;
    }

    public void setMatrix(com.google.zxing.common.BitMatrix bitMatrix) {
        this.matrix = bitMatrix;
    }
}
