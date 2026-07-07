package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class EqModelCallback extends com.realsil.sdk.bbpro.internal.ModelClientCallback {
    public void onAudioEqBasicInfoReport(byte b, int i, com.realsil.sdk.bbpro.equalizer.EqInfo eqInfo) {
    }

    public void onAudioEqEntryIndexReport(byte b, com.realsil.sdk.bbpro.equalizer.EqEntryIndex eqEntryIndex) {
    }

    public void onAudioEqEntryNumberReport(byte b, int i, int i2) {
    }

    public void onAudioEqIndexParamsReport(byte b, com.realsil.sdk.bbpro.equalizer.EqIndex eqIndex) {
    }

    public void onAudioEqIndexReport(byte b, int i, int i2) {
    }

    public void onAudioEqStateReport(byte b, byte b2) {
    }

    public void onClearAudioEqResponse(byte b) {
    }

    public void onDisableAudioEqResponse(byte b) {
    }

    public void onDspAudioEqReport(byte b, byte b2, byte[] bArr) {
    }

    public void onDspAudioEqReport(byte b, com.realsil.sdk.bbpro.equalizer.AudioEq audioEq) {
    }

    public void onDspParamsChanged(com.realsil.sdk.bbpro.model.DspParams dspParams) {
    }

    public void onDspStatusChanged(byte b) {
    }

    public void onEnableAudioEqResponse(byte b) {
    }

    public void onGamingModeStatusChanged(boolean z) {
    }

    public void onMicAudioEqBasicInfoReport(byte b, int i, com.realsil.sdk.bbpro.equalizer.EqInfo eqInfo) {
    }

    public void onResetAudioEqIndexResponse(byte b) {
    }

    public void onSetAudioEqIndexParamsResponse(byte b, int i, int i2, int i3) {
    }

    public void onSetAudioEqIndexResponse(byte b, int i) {
    }
}
