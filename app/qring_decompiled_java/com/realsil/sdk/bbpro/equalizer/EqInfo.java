package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public class EqInfo {
    public static final boolean DEFAULT_EQ_STATE = true;
    public static final int DEFAULT_SUPPORTED_SAMPLE_RATE = 8;
    public static final int INVALID_INDEX = 255;
    public byte activeSampleRate;
    public int gamingModeActiveIndex;
    public int gamingModeEntryNumber;
    public int micAptEqActiveIndex;
    public int micAptEqEntryNumber;
    public int micAptIndexMap;
    public int micEqSaveNum;
    public int normalModeActiveIndex;
    public int normalModeEntryNumber;
    public int spkAncEqActiveIndex;
    public int spkAncEqEntryNumber;
    public int spkAncIndexMap;
    public int spkEqSaveNum;
    public int spkGamingIndexMap;
    public int spkNormalIndexMap;
    public int supportedSampleRate;
    public boolean enabled = true;
    public int spkActiveMode = 0;
    public boolean normalModeEqEnabled = true;
    public boolean gamingModeEnabled = true;
    public boolean gamingModeEqEnabled = true;
    public int micActiveMode = 0;

    public byte getActiveSampleRate() {
        return this.activeSampleRate;
    }

    public int getGamingModeActiveIndex() {
        return this.gamingModeActiveIndex;
    }

    public int getGamingModeEntryNumber() {
        return this.gamingModeEntryNumber;
    }

    public int getMicActiveMode() {
        return this.micActiveMode;
    }

    public int getMicAptEqActiveIndex() {
        return this.micAptEqActiveIndex;
    }

    public int getMicAptEqEntryNumber() {
        return this.micAptEqEntryNumber;
    }

    public int getMicAptIndexMap() {
        return this.micAptIndexMap;
    }

    public int getMicEqSaveNum() {
        return this.micEqSaveNum;
    }

    public int getNormalModeActiveIndex() {
        return this.normalModeActiveIndex;
    }

    public int getNormalModeEntryNumber() {
        return this.normalModeEntryNumber;
    }

    public int getSpkActiveMode() {
        return this.spkActiveMode;
    }

    public int getSpkAncEqActiveIndex() {
        return this.spkAncEqActiveIndex;
    }

    public int getSpkAncEqEntryNumber() {
        return this.spkAncEqEntryNumber;
    }

    public int getSpkAncIndexMap() {
        return this.spkAncIndexMap;
    }

    public int getSpkEqSaveNum() {
        return this.spkEqSaveNum;
    }

    public int getSpkGamingIndexMap() {
        return this.spkGamingIndexMap;
    }

    public int getSpkNormalIndexMap() {
        return this.spkNormalIndexMap;
    }

    public int getSupportedSampleRate() {
        return this.supportedSampleRate;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isGamingModeEnabled() {
        return this.gamingModeEnabled;
    }

    public boolean isGamingModeEqEnabled() {
        return this.gamingModeEqEnabled;
    }

    public boolean isNormalModeEqEnabled() {
        return this.normalModeEqEnabled;
    }

    public boolean parseEqConfigure(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            byte b = bArr[0];
            if (b == 0) {
                if (bArr.length >= 2) {
                    setEqEnabled(bArr[1] == 1);
                }
                return true;
            }
            if (b == 1) {
                updateEqConfigure1(bArr);
                return true;
            }
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "Unknown query type: 0x%02X", java.lang.Byte.valueOf(b)));
        }
        return false;
    }

    public void setEqActiveIndex(int i, int i2, int i3) {
        if (i != 0) {
            this.micAptEqActiveIndex = i3;
            return;
        }
        if (i2 == 0) {
            this.normalModeActiveIndex = i3;
        } else if (i2 == 1) {
            this.gamingModeActiveIndex = i3;
        } else if (i2 == 2) {
            this.spkAncEqActiveIndex = i3;
        }
    }

    public void setEqBasicInfo(int i, com.realsil.sdk.bbpro.equalizer.c cVar) {
        if (i < 512) {
            int i2 = cVar.g;
            if (i2 == 0) {
                this.normalModeEqEnabled = cVar.c;
                this.normalModeEntryNumber = cVar.a;
                this.normalModeActiveIndex = cVar.b;
                return;
            } else if (i2 == 1) {
                this.gamingModeEqEnabled = cVar.c;
                this.gamingModeEntryNumber = cVar.a;
                this.gamingModeActiveIndex = cVar.b;
                return;
            } else {
                if (i2 == 2) {
                    this.spkAncEqEntryNumber = cVar.a;
                    this.spkAncEqActiveIndex = cVar.b;
                    return;
                }
                return;
            }
        }
        boolean z = cVar.c;
        this.enabled = z;
        this.activeSampleRate = cVar.d;
        this.supportedSampleRate = cVar.e;
        this.spkEqSaveNum = cVar.f;
        this.spkActiveMode = cVar.g;
        this.normalModeEqEnabled = z;
        this.normalModeEntryNumber = cVar.h;
        this.spkNormalIndexMap = cVar.i;
        this.normalModeActiveIndex = cVar.j;
        this.gamingModeEnabled = z;
        this.gamingModeEntryNumber = cVar.k;
        this.spkGamingIndexMap = cVar.l;
        this.gamingModeActiveIndex = cVar.m;
        this.spkAncEqEntryNumber = cVar.n;
        this.spkAncIndexMap = cVar.o;
        this.spkAncEqActiveIndex = cVar.p;
        this.micEqSaveNum = cVar.q;
        this.micActiveMode = cVar.r;
        this.micAptEqEntryNumber = cVar.s;
        this.micAptIndexMap = cVar.t;
        this.micAptEqActiveIndex = cVar.u;
    }

    public void setEqEnabled(boolean z) {
        this.gamingModeEqEnabled = z;
        this.normalModeEqEnabled = z;
    }

    public void setGamingModeEnabled(boolean z) {
        this.gamingModeEnabled = z;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EqInfo{");
        java.util.Locale locale = java.util.Locale.US;
        sb.append(java.lang.String.format(locale, "\nenabled=%b, supportedSampleRate=%d, activeSampleRate=%d", java.lang.Boolean.valueOf(this.enabled), java.lang.Integer.valueOf(this.supportedSampleRate), java.lang.Byte.valueOf(this.activeSampleRate)));
        sb.append("\n\tSpk:");
        sb.append(java.lang.String.format(locale, "\n\t\teqSaveNum=%d, activeMode=%d", java.lang.Integer.valueOf(this.spkEqSaveNum), java.lang.Integer.valueOf(this.spkActiveMode)));
        sb.append(java.lang.String.format(locale, "\n\t\tnormal: eq=%b, entryNumber=%d, spkNormalIndexMap=%d, activeIndex=%d", java.lang.Boolean.valueOf(this.normalModeEqEnabled), java.lang.Integer.valueOf(this.normalModeEntryNumber), java.lang.Integer.valueOf(this.spkNormalIndexMap), java.lang.Integer.valueOf(this.normalModeActiveIndex)));
        sb.append(java.lang.String.format(locale, "\n\t\tgaming: state=%b, eq=%b, entryNumber=%d, spkGamingIndexMap=%d, activeIndex=%d", java.lang.Boolean.valueOf(this.gamingModeEnabled), java.lang.Boolean.valueOf(this.gamingModeEqEnabled), java.lang.Integer.valueOf(this.gamingModeEntryNumber), java.lang.Integer.valueOf(this.spkGamingIndexMap), java.lang.Integer.valueOf(this.gamingModeActiveIndex)));
        sb.append(java.lang.String.format(locale, "\n\t\tanc: entryNumber=%d, spkAncIndexMap=%d, activeIndex=%d", java.lang.Integer.valueOf(this.spkAncEqEntryNumber), java.lang.Integer.valueOf(this.spkAncIndexMap), java.lang.Integer.valueOf(this.spkAncEqActiveIndex)));
        sb.append("\n\tMic:");
        sb.append(java.lang.String.format(locale, "\n\t\teqSaveNum=%d, activeMode=%d", java.lang.Integer.valueOf(this.micEqSaveNum), java.lang.Integer.valueOf(this.micActiveMode)));
        sb.append(java.lang.String.format(locale, "\n\t\tapt:entryNumber=%d, micAptIndexMap=%d, activeIndex=%d", java.lang.Integer.valueOf(this.micAptEqEntryNumber), java.lang.Integer.valueOf(this.micAptIndexMap), java.lang.Integer.valueOf(this.micAptEqActiveIndex)));
        sb.append("\n}");
        return sb.toString();
    }

    public void updateEqConfigure1(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (bArr.length >= 2) {
            this.normalModeEntryNumber = bArr[1];
        }
        if (bArr.length >= 3) {
            this.gamingModeEntryNumber = bArr[2];
        }
        if (bArr.length >= 4) {
            this.micAptEqEntryNumber = bArr[3];
        }
        if (bArr.length >= 5) {
            this.spkAncEqEntryNumber = bArr[4];
        }
    }
}
