package com.realsil.sdk.bbpro.model;

/* loaded from: /tmp/dex/classes2.dex */
public class DeviceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.realsil.sdk.bbpro.model.DeviceInfo> CREATOR = new android.os.Parcelable.Creator<com.realsil.sdk.bbpro.model.DeviceInfo>() { // from class: com.realsil.sdk.bbpro.model.DeviceInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.realsil.sdk.bbpro.model.DeviceInfo createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.bbpro.model.DeviceInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.realsil.sdk.bbpro.model.DeviceInfo[] newArray(int i) {
            return new com.realsil.sdk.bbpro.model.DeviceInfo[i];
        }
    };
    public static final int INDICATOR_ADDR_LE = 4;
    public static final int INDICATOR_ANC_GROUP = 16;
    public static final int INDICATOR_ANC_SCENARIO_CHOOSE_INFO = 57;
    public static final int INDICATOR_ANC_STATE = 17;
    public static final int INDICATOR_APT_GAIN = 33;
    public static final int INDICATOR_APT_NR_STATUS = 32;
    public static final int INDICATOR_APT_POWER_ON_DELAY_TIME = 34;
    public static final int INDICATOR_APT_STATUS = 25;
    public static final int INDICATOR_APT_VOLUME_INFO = 33;
    public static final int INDICATOR_APT_VOLUME_STATUS = 33;
    public static final int INDICATOR_BATTERY_STATUS = 8;
    public static final int INDICATOR_BUD_INFO = 39;
    public static final int INDICATOR_CMD_SET_VERSION = 12;
    public static final int INDICATOR_COMPANY_MODEL_ID = 59;
    public static final int INDICATOR_DEVICE_ID = 60;
    public static final int INDICATOR_DSP_CAPABILITY = 13;
    public static final int INDICATOR_EAR_DETECTION_STATUS = 55;
    public static final int INDICATOR_FIND_ME = 23;
    public static final int INDICATOR_FW_VERSION = 63;
    public static final int INDICATOR_GAMING_MODE = 21;
    public static final int INDICATOR_IC_NAME = 58;
    public static final int INDICATOR_LISTENING_MODE_BASIC_INFO = 40;
    public static final int INDICATOR_LISTENING_MODE_CYCLE = 41;
    public static final int INDICATOR_LISTENING_MODE_STATUS = 48;
    public static final int INDICATOR_LLAPT_BASIC_INFO = 49;
    public static final int INDICATOR_LLAPT_BRIGHTNESS_INFO = 51;
    public static final int INDICATOR_LLAPT_BRIGHTNESS_STATUS = 52;
    public static final int INDICATOR_LLAPT_SCENARIO_CHOOSE_INFO = 53;
    public static final int INDICATOR_LLAPT_STATE = 50;
    public static final int INDICATOR_LOCK_BUTTON_STATUS = 38;
    public static final int INDICATOR_LOW_LATENCY_LEVEL = 22;
    public static final int INDICATOR_MOTOR_MODE_PARAMETERS = 19;
    public static final int INDICATOR_MOTOR_STATUS = 18;
    public static final int INDICATOR_NA = 0;
    public static final int INDICATOR_NAME_BREDR = 2;
    public static final int INDICATOR_NAME_LE = 3;
    public static final int INDICATOR_PACKAGE_ID = 11;
    public static final int INDICATOR_RWS = 39;
    public static final int INDICATOR_RWS_BUD_SIDE = 10;
    public static final int INDICATOR_RWS_CHANNEL = 6;
    public static final int INDICATOR_RWS_DEFAULT_CHANNEL = 7;
    public static final int INDICATOR_RWS_DEFAULT_ROLE = 9;
    public static final int INDICATOR_SINGLE_DEVICE_ID = 61;
    public static final int INDICATOR_SINGLE_DEVICE_ID_LCH = 61;
    public static final int INDICATOR_SINGLE_DEVICE_ID_RCH = 62;
    public static final int INDICATOR_SPATIAL_AUDIO_MODE = 64;
    public static final int INDICATOR_SPP_OTA_DEVICE_INFO = 14;
    public static final int INDICATOR_STATUS_AUDIO_PASS_THROUGH_STATUS = 25;
    public static final int INDICATOR_STATUS_BATTERY_STATUS = 8;
    public static final int INDICATOR_STATUS_GAMING_MODE = 21;
    public static final int INDICATOR_STATUS_RWS_CHANNEL = 6;
    public static final int INDICATOR_STATUS_RWS_STATE = 5;
    public static final int INDICATOR_SUPPORTED_CALL_STATE = 37;
    public static final int INDICATOR_SUPPORTED_CLICK_TYPE = 36;
    public static final int INDICATOR_SUPPORTED_MMI_LIST = 35;
    public static final int INDICATOR_VIBRATION_STATUS = 20;
    public static final int INDICATOR_VOLUME = 54;
    public static final int INDICATOR_VP_RINGTONE_STATUS = 56;
    public static final byte MOTOR_STATUS_DISABLE = 0;
    public static final byte MOTOR_STATUS_ENABLE = 1;
    public int A;
    public int B;
    public int C;
    public byte D;
    public byte E;
    public byte F;
    public byte G;
    public int H;
    public int I;
    public int J;
    public byte K;
    public com.realsil.sdk.bbpro.apt.AptVolumeInfo L;
    public boolean M;
    public int N;
    public byte O;
    public com.realsil.sdk.bbpro.model.AncGroup P;
    public com.realsil.sdk.bbpro.anc.AncScenarioGroupInfo Q;
    public byte R;
    public byte S;
    public com.realsil.sdk.bbpro.llapt.LlAptBasicInfo T;
    public com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo U;
    public com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo V;
    public int W;
    public int X;
    public byte Y;
    public com.realsil.sdk.bbpro.vp.VpVolumeInfo Z;
    public byte a;
    public boolean a0;
    public byte b;
    public com.realsil.sdk.bbpro.model.ImageVersionInfo b0;
    public int c;
    public byte c0;
    public int d;
    public java.lang.String e;
    public java.lang.String f;
    public java.lang.String g;
    public java.lang.String h;
    public int i;
    public int j;
    public java.lang.String k;
    public java.lang.String l;
    public java.lang.String m;
    public com.realsil.sdk.bbpro.model.DeviceStatusInfo0 n;
    public com.realsil.sdk.bbpro.model.DeviceStatusInfo o;
    public com.realsil.sdk.bbpro.model.DspCapability p;
    public byte[] q;
    public byte[] r;
    public byte[] s;
    public java.util.List<com.realsil.sdk.bbpro.model.KeyMmiSettings> t;
    public java.util.List<com.realsil.sdk.bbpro.model.KeyMmiSettings> u;
    public byte v;
    public byte w;
    public int x;
    public int y;
    public boolean z;

    public DeviceInfo() {
        this.c = 0;
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = 0;
        this.j = 0;
        this.k = "";
        this.l = "";
        this.m = "";
        this.v = (byte) 0;
        this.w = (byte) 0;
        this.z = false;
        this.A = 0;
        this.B = -1;
        this.C = -1;
        this.D = (byte) 0;
        this.E = (byte) 0;
        this.F = (byte) 0;
        this.G = (byte) 0;
        this.R = (byte) 0;
        this.W = 1;
        this.X = 0;
        this.Y = (byte) 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.realsil.sdk.bbpro.model.AncGroup getAncGroup() {
        return this.P;
    }

    public com.realsil.sdk.bbpro.anc.AncScenarioGroupInfo getAncScenarioChooseInfo() {
        return this.Q;
    }

    public byte getAncStatus() {
        return this.O;
    }

    public int getAptFeatureType() {
        return this.W;
    }

    public int getAptPowerOnDelayTime() {
        return this.N;
    }

    public byte getAptStatus() {
        return this.R;
    }

    public com.realsil.sdk.bbpro.apt.AptVolumeInfo getAptVolumeInfo() {
        return this.L;
    }

    public int getAptVolumeVersion() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return 0;
        }
        if (dspCapability.isDspAptSupported()) {
            int i = this.c;
            if (i >= 262) {
                return 3;
            }
            if (i >= 260) {
                return 2;
            }
            return (i < 258 && i >= 1) ? 1 : 0;
        }
        if (this.p.isLlAptSupported()) {
            int i2 = this.c;
            if (i2 >= 262) {
                return 3;
            }
            if (i2 >= 260) {
                return 2;
            }
        }
        return 0;
    }

    public byte getAudioPassthroughStatus() {
        return this.R;
    }

    public java.lang.String getBrEdrName() {
        return this.e;
    }

    public byte getChipId() {
        return this.a;
    }

    public int getCmdSetVersion() {
        return this.c;
    }

    public int getCompanyId() {
        return this.i;
    }

    public int getCurVolumeLevel() {
        return this.x;
    }

    public int getCurrentLatencyLevel() {
        return this.C;
    }

    public java.lang.String getDeviceId() {
        return this.k;
    }

    public com.realsil.sdk.bbpro.model.DeviceStatusInfo getDeviceStatusInfo() {
        if (this.o == null) {
            this.o = new com.realsil.sdk.bbpro.model.DeviceStatusInfo();
        }
        return this.o;
    }

    public com.realsil.sdk.bbpro.model.DeviceStatusInfo0 getDeviceStatusInfo0() {
        if (this.n == null) {
            this.n = new com.realsil.sdk.bbpro.model.DeviceStatusInfo0();
        }
        return this.n;
    }

    public com.realsil.sdk.bbpro.model.DspCapability getDspCapability() {
        return this.p;
    }

    public int getEqSpecVersion() {
        return this.d;
    }

    public java.lang.String getIcName() {
        return this.h;
    }

    public java.util.List<com.realsil.sdk.bbpro.model.KeyMmiSettings> getKeyMmiSettings() {
        return this.t;
    }

    public int getLatencyValue() {
        return this.A;
    }

    public java.lang.String getLchSingleDeviceId() {
        return this.l;
    }

    public java.lang.String getLeAddr() {
        return this.g;
    }

    public java.lang.String getLeName() {
        return this.f;
    }

    public int getListeningModeCycle() {
        return this.X;
    }

    public byte getListeningModeState() {
        if (isListeningModeReportSupported()) {
            return this.Y;
        }
        if (isDspAptSupported() && isDspAptEnabled()) {
            return (byte) 1;
        }
        if (isLlAptSupported() && isLlAptEnabled()) {
            return (byte) 3;
        }
        return (isAncSupported() && isAncEnabled()) ? (byte) 2 : (byte) 0;
    }

    public com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo getLlAptBrightnessInfo() {
        return this.V;
    }

    public com.realsil.sdk.bbpro.llapt.LlAptBasicInfo getLlaptBasicInfo() {
        return this.T;
    }

    public com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo getLlaptScenarioChooseInfo() {
        return this.U;
    }

    public byte getLockButtonStatus() {
        return this.K;
    }

    public int getMaxLatencyLevel() {
        return this.B;
    }

    public int getMaxVolumeLevel() {
        return this.y;
    }

    public int getModelId() {
        return this.j;
    }

    public byte getMotorFeature() {
        return this.E;
    }

    public byte getMotorStatus() {
        return this.F;
    }

    public byte getPackageId() {
        return this.b;
    }

    public com.realsil.sdk.bbpro.model.ImageVersionInfo getPrimaryUiOtaVersion() {
        return this.b0;
    }

    public java.lang.String getRchSingleDeviceId() {
        return this.m;
    }

    public java.util.List<com.realsil.sdk.bbpro.model.KeyMmiSettings> getRwsKeyMmiSettings() {
        return this.u;
    }

    public byte getSpatialAudioMode() {
        return this.c0;
    }

    public byte[] getSupportedCallStatus() {
        byte[] bArr = this.s;
        return bArr == null ? new byte[0] : bArr;
    }

    public byte[] getSupportedClickType() {
        byte[] bArr = this.r;
        return bArr == null ? new byte[0] : bArr;
    }

    public byte[] getSupportedMmi() {
        byte[] bArr = this.q;
        return bArr == null ? new byte[0] : bArr;
    }

    public int getVibrateCount() {
        return this.J;
    }

    public int getVibrateOffTime() {
        return this.I;
    }

    public int getVibrateOnTime() {
        return this.H;
    }

    public byte getVibrationStatus() {
        return this.G;
    }

    public com.realsil.sdk.bbpro.vp.VpVolumeInfo getVpVolumeInfo() {
        if (this.Z == null) {
            this.Z = com.realsil.sdk.bbpro.vp.VpVolumeInfo.DEFAULT;
        }
        return this.Z;
    }

    public boolean isAncAndDspAptListeningModeSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isAncAndDspAptListeningModeSupported();
    }

    public boolean isAncEnabled() {
        return this.O == 1;
    }

    public boolean isAncEqConfigureSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isAncEqConfigureSupported();
    }

    public boolean isAncEqSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isAncEqSupported();
    }

    public boolean isAncScenarioGroupSettingsSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isAncScenarioGroupSettingsSupported();
    }

    public boolean isAncScenarioSupported() {
        com.realsil.sdk.bbpro.model.AncGroup ancGroup;
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null || !dspCapability.isAncSupported() || (ancGroup = this.P) == null) {
            return false;
        }
        return ancGroup.isAncScenarioSupported();
    }

    public boolean isAncSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isAncSupported();
    }

    public boolean isAptEnabled() {
        int i = this.W;
        return i == 1 ? this.R == 1 : i == 2 && this.S == 1;
    }

    public boolean isAptEqBudSettingsSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isAptEqBudSettingsSupported();
    }

    public boolean isAptEqSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        return dspCapability != null && dspCapability.isDspAptSupported() && this.p.isAptEqSupported();
    }

    public boolean isAptNrEnabled() {
        return this.M;
    }

    public boolean isAptNrSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isAptNrSupported();
    }

    public boolean isAptPowerOnDelayTimeSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isAptPowerOnDelayTimeSupported();
    }

    public boolean isAptSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isDspAptSupported() || this.p.isLlAptSupported();
    }

    public boolean isAptVolumeForceSyncSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return true;
        }
        return dspCapability.isAptVolumeForceSyncSupported();
    }

    public boolean isAptVolumeGainSaveFlashSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isAptVolumeGainSaveFlashSupported();
    }

    public boolean isAptVolumeIndividualAdjustSupported() {
        if (this.p == null) {
            return false;
        }
        return !r0.isAptVolumeForceSyncSupported();
    }

    public boolean isAptVolumeRwsSyncSupported() {
        return isAptVolumeRwsSyncToggleSupported();
    }

    public boolean isAptVolumeRwsSyncToggleSupported() {
        com.realsil.sdk.bbpro.apt.AptVolumeInfo aptVolumeInfo;
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null || dspCapability.isAptVolumeForceSyncSupported() || (aptVolumeInfo = this.L) == null) {
            return false;
        }
        return aptVolumeInfo.isRwsSyncSupported();
    }

    public boolean isBudInfoReqSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isBudInfoReqSupported();
    }

    public boolean isDeviceIdSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability != null) {
            return dspCapability.isDeviceIdSupported();
        }
        return false;
    }

    public boolean isDspAptEnabled() {
        return this.R == 1;
    }

    public boolean isDspAptSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isDspAptSupported();
    }

    public boolean isDurianMasterSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isDurianMasterSupported();
    }

    public boolean isDurianSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isDurianSupported();
    }

    public boolean isEarDetectionOn() {
        return this.D == 1;
    }

    public boolean isEarDetectionSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isEarDetectionSupported();
    }

    public boolean isEqInCompatible() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null || !dspCapability.isEqSupported() || this.d <= com.realsil.sdk.bbpro.c.c.a()) {
            return false;
        }
        com.realsil.sdk.core.logger.ZLogger.v("app is too old, not support eq at present");
        return true;
    }

    public boolean isEqPersistenceSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isEqPersistenceSupported();
    }

    public boolean isEqSettingsEnabled() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return true;
        }
        return dspCapability.isEqSupported();
    }

    public boolean isEqSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return true;
        }
        return dspCapability.isEqSupported();
    }

    public boolean isGamingModeEnabled() {
        return this.z;
    }

    public boolean isGamingModeEqSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability != null) {
            return dspCapability.isGamingModeEqSupported();
        }
        return false;
    }

    public boolean isGamingModeSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability != null) {
            return dspCapability.isGamingModeSupported();
        }
        return false;
    }

    public boolean isHASupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isHASupported();
    }

    public boolean isKeyMapSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        return dspCapability != null ? dspCapability.isKeyMapSupported() : this.c == 1;
    }

    public boolean isKeyMappingResetByBudSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability != null) {
            return dspCapability.isKeyMappingResetByBudSupported();
        }
        return false;
    }

    public boolean isKeyMappingResetSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability != null) {
            return dspCapability.isKeyMappingResetSupported();
        }
        return false;
    }

    public boolean isLanguageSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return true;
        }
        return dspCapability.isLanguageSupported();
    }

    public boolean isLeNameSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return true;
        }
        return dspCapability.isLeNameSupported();
    }

    public boolean isLeftBudFindMeEnabled() {
        return this.v == 1;
    }

    public boolean isLegacyNameSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return true;
        }
        return dspCapability.isBrEdrNameSupported();
    }

    public boolean isListeningModeCycleSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isListeningModeCycleSupported();
    }

    public boolean isListeningModeReportSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isListeningModeReportSupported();
    }

    public boolean isListeningModeToggleSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isAncSupported() || this.p.isDspAptSupported() || this.p.isLlAptSupported();
    }

    public boolean isLlAptEnabled() {
        return this.S == 1;
    }

    public boolean isLlAptSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isLlAptSupported();
    }

    public boolean isLlAptVolumeHeSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isLlAptVolumeHeSupported();
    }

    public boolean isLlaptScenarioEnableSettingsSupported() {
        return isLlaptScenarioGroupSettingsSupported();
    }

    public boolean isLlaptScenarioGroupSettingsSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isLlaptScenarioGroupSettingsSupported();
    }

    public boolean isLocalPlaybackSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isLocalPlaybackSupported();
    }

    public boolean isLockButtonSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        return dspCapability == null ? this.c == 1 : dspCapability.isLockButtonSupported();
    }

    public boolean isMultiLinkSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isMultiLinkSupported();
    }

    public boolean isNormalModeEqAllowed() {
        if ((com.realsil.sdk.bbpro.i.b.a(this.a, this.b) || com.realsil.sdk.bbpro.i.b.a(this.a)) && isAncEqSupported()) {
            return !isAncEnabled();
        }
        return true;
    }

    public boolean isOtaSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return true;
        }
        return dspCapability.isOtaSupported();
    }

    public boolean isRightBudFindMeEnabled() {
        return this.w == 1;
    }

    public boolean isRws() {
        return wrapperRwsInfo().isRws;
    }

    public boolean isRwsChannelFeatureSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        return dspCapability != null ? dspCapability.isRwsChannelSupported() : isRws();
    }

    public boolean isRwsEngaged() {
        return wrapperRwsInfo().isRwsEngaged();
    }

    public boolean isRwsKeyMappingSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability != null) {
            return dspCapability.isRwsKeymapConfigureSupported();
        }
        return false;
    }

    public boolean isSpatialAudioSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isSpatialAudioSupported();
    }

    public boolean isSppCaptureV2Supported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isSppCaptureV2Supported();
    }

    public boolean isSppOtaSupported() {
        return this.a0;
    }

    public boolean isTtsSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return true;
        }
        return dspCapability.isTtsSupported();
    }

    public boolean isUiOtaVersionSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isUiOtaVersionSupported();
    }

    public boolean isVpRingtoneSupported() {
        com.realsil.sdk.bbpro.model.DspCapability dspCapability = this.p;
        if (dspCapability == null) {
            return false;
        }
        return dspCapability.isVpRingtoneSupported();
    }

    public boolean isVpRwsSyncSupported() {
        if (wrapperRwsInfo().isRws) {
            return this.Z.rwsSyncSupported;
        }
        return false;
    }

    public void setAncGroup(com.realsil.sdk.bbpro.model.AncGroup ancGroup) {
        this.P = ancGroup;
        if (ancGroup != null) {
            this.O = ancGroup.getStatus();
        }
    }

    public void setAncScenarioChooseInfo(com.realsil.sdk.bbpro.anc.AncScenarioGroupInfo ancScenarioGroupInfo) {
        this.Q = ancScenarioGroupInfo;
    }

    public void setAncStatus(byte b) {
        this.O = b;
    }

    public void setAptNrEnabled(boolean z) {
        this.M = z;
    }

    public void setAptPowerOnDelayTime(int i) {
        this.N = i;
    }

    public void setAptStatus(byte b) {
        this.R = b;
    }

    public void setAptVolumeInfo(com.realsil.sdk.bbpro.apt.AptVolumeInfo aptVolumeInfo) {
        this.L = aptVolumeInfo;
    }

    public void setAptVolumeStatus(com.realsil.sdk.bbpro.apt.AptVolumeStatus aptVolumeStatus) {
        com.realsil.sdk.bbpro.apt.AptVolumeInfo aptVolumeInfo = this.L;
        if (aptVolumeInfo != null) {
            aptVolumeInfo.updateAptVolumeStatus(aptVolumeStatus);
        }
    }

    public void setAptVolumeSyncEnabled(boolean z) {
        com.realsil.sdk.bbpro.apt.AptVolumeInfo aptVolumeInfo = this.L;
        if (aptVolumeInfo != null) {
            aptVolumeInfo.setRwsSyncEnabled(z);
        }
    }

    public void setBrEdrName(java.lang.String str) {
        this.e = str;
    }

    public void setChipId(byte b) {
        this.a = b;
    }

    public void setCmdSetInfo(com.realsil.sdk.bbpro.i.c cVar) {
        this.c = cVar.a();
        this.d = cVar.b();
    }

    public void setCompanyId(int i) {
        this.i = i;
    }

    public void setCurVolumeLevel(int i) {
        this.x = i;
    }

    public void setDeviceId(java.lang.String str) {
        this.k = str;
    }

    public void setDeviceStatusInfo(com.realsil.sdk.bbpro.model.DeviceStatusInfo deviceStatusInfo) {
        this.o = deviceStatusInfo;
    }

    public void setDspCapability(com.realsil.sdk.bbpro.model.DspCapability dspCapability) {
        this.p = dspCapability;
        if (dspCapability == null) {
            this.W = 1;
            return;
        }
        com.realsil.sdk.core.logger.ZLogger.v(dspCapability.toString());
        if (dspCapability.isDspAptSupported()) {
            this.W = 1;
        } else if (dspCapability.isLlAptSupported()) {
            this.W = 2;
        } else {
            this.W = 0;
        }
    }

    public void setEarDetectionStatus(byte b) {
        this.D = b;
    }

    public void setGamingModeEnabled(boolean z) {
        this.z = z;
    }

    public void setIcName(java.lang.String str) {
        this.h = str;
    }

    public void setKeyMmiSettings(java.util.List<com.realsil.sdk.bbpro.model.KeyMmiSettings> list) {
        this.t = list;
    }

    public void setLchSingleDeviceId(java.lang.String str) {
        this.l = str;
    }

    public void setLeAddr(java.lang.String str) {
        this.g = str;
    }

    public void setLeName(java.lang.String str) {
        this.f = str;
    }

    public void setLeftBudFindMeEnabled(byte b) {
        this.v = b;
    }

    public void setListeningModeCycle(int i) {
        this.X = i;
    }

    public void setLlAptBrighenessStatus(com.realsil.sdk.bbpro.llapt.LlAptBrightnessStatus llAptBrightnessStatus) {
        com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo llAptBrightnessInfo = this.V;
        if (llAptBrightnessInfo != null) {
            llAptBrightnessInfo.updateLlAptBrighenessStatus(llAptBrightnessStatus);
        }
    }

    public void setLlAptBrightnessInfo(com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo llAptBrightnessInfo) {
        this.V = llAptBrightnessInfo;
    }

    public void setLlAptStatus(byte b) {
        this.S = b;
    }

    public void setLlaptBasicInfo(com.realsil.sdk.bbpro.llapt.LlAptBasicInfo llAptBasicInfo) {
        this.T = llAptBasicInfo;
        if (llAptBasicInfo != null) {
            this.S = llAptBasicInfo.getStatus();
        }
    }

    public void setLlaptScenarioChooseInfo(com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo llAptScenarioGroupInfo) {
        this.U = llAptScenarioGroupInfo;
    }

    public void setLockButtonStatus(byte b) {
        this.K = b;
    }

    public void setMaxVolumeLevel(int i) {
        this.y = i;
    }

    public void setModelId(int i) {
        this.j = i;
    }

    public void setMotorFeature(byte b) {
        this.E = b;
    }

    public void setMotorStatus(byte b) {
        this.F = b;
    }

    public void setPackageId(byte b) {
        this.b = b;
    }

    public void setPrimaryBatStatus(int i) {
        getDeviceStatusInfo0().setPrimaryBatStatus(i);
    }

    public void setPrimaryDefaultRwsChannel(byte b) {
        getDeviceStatusInfo0().setRwsPrimaryDefaultChannel(b);
    }

    public void setPrimaryRwsChannel(byte b) {
        getDeviceStatusInfo0().setRwsPrimaryChannel(b);
    }

    public void setPrimaryUiOtaVersion(com.realsil.sdk.bbpro.model.ImageVersionInfo imageVersionInfo) {
        this.b0 = imageVersionInfo;
    }

    public void setRchSingleDeviceId(java.lang.String str) {
        this.m = str;
    }

    public void setRightBudFindMeEnabled(byte b) {
        this.w = b;
    }

    public void setRwsBudSide(byte b) {
        getDeviceStatusInfo0().setRwsBudSide(b);
    }

    public void setRwsDefaultRole(byte b) {
        getDeviceStatusInfo0().setRwsDefaultRole(b);
    }

    public void setRwsKeyMmiSettings(java.util.List<com.realsil.sdk.bbpro.model.KeyMmiSettings> list) {
        this.u = list;
    }

    public void setRwsState(byte b) {
        getDeviceStatusInfo0().setRwsState(b);
    }

    public void setSecondaryBatStatus(int i) {
        getDeviceStatusInfo0().setSecondaryBatStatus(i);
    }

    public void setSecondaryDefaultRwsChannel(byte b) {
        getDeviceStatusInfo0().setSecondaryDefaultRwsChannel(b);
    }

    public void setSecondaryRwsChannel(byte b) {
        getDeviceStatusInfo0().setSecondaryRwsChannel(b);
    }

    public void setSpatialAudioMode(byte b) {
        this.c0 = b;
    }

    public void setSppOtaSupported(boolean z) {
        this.a0 = z;
    }

    public void setSupportedCallStatus(byte[] bArr) {
        this.s = bArr;
    }

    public void setSupportedClickType(byte[] bArr) {
        this.r = bArr;
    }

    public void setSupportedMmi(byte[] bArr) {
        this.q = bArr;
    }

    public void setVibrateCount(int i) {
        this.J = i;
    }

    public void setVibrateOffTime(int i) {
        this.I = i;
    }

    public void setVibrateOnTime(int i) {
        this.H = i;
    }

    public void setVibrationStatus(byte b) {
        this.G = b;
    }

    public void setVpVolumeInfo(com.realsil.sdk.bbpro.vp.VpVolumeInfo vpVolumeInfo) {
        this.Z = vpVolumeInfo;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DeviceInfo{");
        sb.append(java.lang.String.format("\n\tCI%04XPI%04XCSV%04XESV%04X", java.lang.Byte.valueOf(this.a), java.lang.Byte.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d)));
        sb.append(java.lang.String.format("\n\tLE=%s(%s), BR/EDR=%s", this.f, this.g, this.e));
        if (isListeningModeCycleSupported()) {
            sb.append(java.lang.String.format(java.util.Locale.US, "\n\tlisteningModeCycle=%d", java.lang.Integer.valueOf(this.X)));
        }
        java.util.Locale locale = java.util.Locale.US;
        sb.append(java.lang.String.format(locale, "\n\tlisteningModeState=%d", java.lang.Byte.valueOf(getListeningModeState())));
        if (isAncSupported()) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(isAncEnabled());
            com.realsil.sdk.bbpro.model.AncGroup ancGroup = this.P;
            objArr[1] = ancGroup != null ? ancGroup.toString() : "ancGroup=null";
            sb.append(java.lang.String.format(locale, "\n\tisAncEnabled=%b, %s", objArr));
        }
        if (isAptSupported()) {
            sb.append(java.lang.String.format(locale, "\n\taptEnabled=%b, aptNrEnabled=%b, aptFeatureType=0x%02X", java.lang.Boolean.valueOf(isAptEnabled()), java.lang.Boolean.valueOf(this.M), java.lang.Integer.valueOf(this.W)));
            if (this.W == 2) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                com.realsil.sdk.bbpro.llapt.LlAptBasicInfo llAptBasicInfo = this.T;
                objArr2[0] = llAptBasicInfo != null ? llAptBasicInfo.toString() : "null";
                sb.append(java.lang.String.format(locale, "\n\t\tllaptBasicInfo=%s", objArr2));
            }
        }
        if (isSpatialAudioSupported()) {
            sb.append(java.lang.String.format("\n\tspatialAudioMode=0x%02X", java.lang.Byte.valueOf(this.c0)));
        }
        sb.append(java.lang.String.format("\n\tfindMe: L=%b, R=%b", java.lang.Boolean.valueOf(isLeftBudFindMeEnabled()), java.lang.Boolean.valueOf(isRightBudFindMeEnabled())));
        sb.append(java.lang.String.format(locale, "\n\tvolume=%d/%d", java.lang.Integer.valueOf(this.x), java.lang.Integer.valueOf(this.y)));
        sb.append(java.lang.String.format("\n\tgamingModeEnabled=%b, earDetectionStatus=0x%02X", java.lang.Boolean.valueOf(this.z), java.lang.Byte.valueOf(this.D)));
        sb.append(java.lang.String.format("\n\tmLockButtonStatus=0x%02X", java.lang.Byte.valueOf(this.K)));
        sb.append(java.lang.String.format("\n\tsppOtaSupported= %b", java.lang.Boolean.valueOf(this.a0)));
        com.realsil.sdk.bbpro.model.RwsInfo wrapperRwsInfo = wrapperRwsInfo();
        if (wrapperRwsInfo != null) {
            sb.append(java.lang.String.format("\n\trwsInfo= %s", wrapperRwsInfo.toString()));
        }
        sb.append("\n}");
        return sb.toString();
    }

    public void updateListeningModeStatus(com.realsil.sdk.bbpro.hearing.a aVar) {
        byte b = aVar.a;
        this.Y = b;
        if (b == 3) {
            this.R = (byte) 0;
            this.O = (byte) 0;
            this.S = (byte) 1;
            com.realsil.sdk.bbpro.llapt.LlAptBasicInfo llAptBasicInfo = this.T;
            if (llAptBasicInfo != null) {
                llAptBasicInfo.setActiveGroupIndex(aVar.b);
                return;
            }
            return;
        }
        if (b == 1) {
            this.R = (byte) 1;
            this.O = (byte) 0;
            this.S = (byte) 0;
            return;
        }
        if (b == 2) {
            this.R = (byte) 0;
            this.O = (byte) 1;
            com.realsil.sdk.bbpro.model.AncGroup ancGroup = this.P;
            if (ancGroup != null) {
                ancGroup.setActiveGroupIndex(aVar.b);
            }
            this.S = (byte) 0;
            return;
        }
        if (b != 4) {
            this.R = (byte) 0;
            this.O = (byte) 0;
            this.S = (byte) 0;
        } else {
            this.R = (byte) 1;
            this.O = (byte) 1;
            com.realsil.sdk.bbpro.model.AncGroup ancGroup2 = this.P;
            if (ancGroup2 != null) {
                ancGroup2.setActiveGroupIndex(aVar.b);
            }
            this.S = (byte) 0;
        }
    }

    public void updateLowLatencyInfo(com.realsil.sdk.bbpro.d.a aVar) {
        this.z = aVar.a;
        this.A = aVar.b;
        this.B = aVar.c;
        this.C = aVar.d;
    }

    public void updateLowLatencyLevelReport(com.realsil.sdk.bbpro.d.b bVar) {
        this.A = bVar.b;
        this.C = bVar.a;
    }

    public com.realsil.sdk.bbpro.model.RwsInfo wrapperRwsInfo() {
        return isBudInfoReqSupported() ? getDeviceStatusInfo().toRwsInfo() : getDeviceStatusInfo0().toRwsInfo(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByte(this.a);
        parcel.writeByte(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeParcelable(this.n, i);
        parcel.writeParcelable(this.o, i);
        parcel.writeParcelable(this.p, i);
        parcel.writeByteArray(this.q);
        parcel.writeByteArray(this.r);
        parcel.writeByteArray(this.s);
        parcel.writeTypedList(this.t);
        parcel.writeTypedList(this.u);
        parcel.writeByte(this.v);
        parcel.writeByte(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeByte(this.z ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeByte(this.D);
        parcel.writeByte(this.E);
        parcel.writeByte(this.F);
        parcel.writeByte(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
        parcel.writeByte(this.K);
        parcel.writeParcelable(this.L, i);
        parcel.writeByte(this.M ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.N);
        parcel.writeByte(this.O);
        parcel.writeParcelable(this.P, i);
        parcel.writeParcelable(this.Q, i);
        parcel.writeByte(this.R);
        parcel.writeByte(this.S);
        parcel.writeParcelable(this.T, i);
        parcel.writeParcelable(this.U, i);
        parcel.writeParcelable(this.V, i);
        parcel.writeInt(this.W);
        parcel.writeInt(this.X);
        parcel.writeByte(this.Y);
        parcel.writeParcelable(this.Z, i);
        parcel.writeByte(this.a0 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.b0, i);
        parcel.writeByte(this.c0);
    }

    public void setAncStatus(boolean z, int i) {
        this.O = this.O;
        com.realsil.sdk.bbpro.model.AncGroup ancGroup = this.P;
        if (ancGroup != null) {
            ancGroup.setActiveGroupIndex(i);
        }
    }

    public byte[] getSupportedListeningModes() {
        byte[] bArr = new byte[4];
        int i = 1;
        if (isDspAptSupported()) {
            bArr[0] = 1;
            if (isAncAndDspAptListeningModeSupported()) {
                bArr[1] = 4;
                i = 2;
            }
        } else if (isLlAptSupported()) {
            bArr[0] = 3;
        } else {
            i = 0;
        }
        if (isAncSupported()) {
            bArr[i] = 2;
            i++;
        }
        if (i > 0) {
            bArr[i] = 0;
            i++;
        }
        return java.util.Arrays.copyOfRange(bArr, 0, i);
    }

    public byte[] getSupportedListeningModeCycle() {
        byte[] bArr = new byte[5];
        bArr[0] = 0;
        bArr[1] = 1;
        bArr[2] = 2;
        int i = 3;
        if (this.c >= 263) {
            bArr[3] = 3;
            i = 4;
        }
        if (isDspAptSupported() && isAncAndDspAptListeningModeSupported()) {
            bArr[i] = 4;
            i++;
        }
        return java.util.Arrays.copyOfRange(bArr, 0, i);
    }

    public DeviceInfo(android.os.Parcel parcel) {
        this.c = 0;
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = 0;
        this.j = 0;
        this.k = "";
        this.l = "";
        this.m = "";
        this.v = (byte) 0;
        this.w = (byte) 0;
        this.z = false;
        this.A = 0;
        this.B = -1;
        this.C = -1;
        this.D = (byte) 0;
        this.E = (byte) 0;
        this.F = (byte) 0;
        this.G = (byte) 0;
        this.R = (byte) 0;
        this.W = 1;
        this.X = 0;
        this.Y = (byte) 0;
        this.a = parcel.readByte();
        this.b = parcel.readByte();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = (com.realsil.sdk.bbpro.model.DeviceStatusInfo0) parcel.readParcelable(com.realsil.sdk.bbpro.model.DeviceStatusInfo0.class.getClassLoader());
        this.o = (com.realsil.sdk.bbpro.model.DeviceStatusInfo) parcel.readParcelable(com.realsil.sdk.bbpro.model.DeviceStatusInfo.class.getClassLoader());
        this.p = (com.realsil.sdk.bbpro.model.DspCapability) parcel.readParcelable(com.realsil.sdk.bbpro.model.DspCapability.class.getClassLoader());
        this.q = parcel.createByteArray();
        this.r = parcel.createByteArray();
        this.s = parcel.createByteArray();
        android.os.Parcelable.Creator<com.realsil.sdk.bbpro.model.KeyMmiSettings> creator = com.realsil.sdk.bbpro.model.KeyMmiSettings.CREATOR;
        this.t = parcel.createTypedArrayList(creator);
        this.u = parcel.createTypedArrayList(creator);
        this.v = parcel.readByte();
        this.w = parcel.readByte();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readByte() != 0;
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readByte();
        this.E = parcel.readByte();
        this.F = parcel.readByte();
        this.G = parcel.readByte();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.J = parcel.readInt();
        this.K = parcel.readByte();
        this.L = (com.realsil.sdk.bbpro.apt.AptVolumeInfo) parcel.readParcelable(com.realsil.sdk.bbpro.apt.AptVolumeInfo.class.getClassLoader());
        this.M = parcel.readByte() != 0;
        this.N = parcel.readInt();
        this.O = parcel.readByte();
        this.P = (com.realsil.sdk.bbpro.model.AncGroup) parcel.readParcelable(com.realsil.sdk.bbpro.model.AncGroup.class.getClassLoader());
        this.Q = (com.realsil.sdk.bbpro.anc.AncScenarioGroupInfo) parcel.readParcelable(com.realsil.sdk.bbpro.anc.AncScenarioGroupInfo.class.getClassLoader());
        this.R = parcel.readByte();
        this.S = parcel.readByte();
        this.T = (com.realsil.sdk.bbpro.llapt.LlAptBasicInfo) parcel.readParcelable(com.realsil.sdk.bbpro.llapt.LlAptBasicInfo.class.getClassLoader());
        this.U = (com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo) parcel.readParcelable(com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo.class.getClassLoader());
        this.V = (com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo) parcel.readParcelable(com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo.class.getClassLoader());
        this.W = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readByte();
        this.Z = parcel.readParcelable(com.realsil.sdk.bbpro.vp.VpVolumeInfo.class.getClassLoader());
        this.a0 = parcel.readByte() != 0;
        this.b0 = (com.realsil.sdk.bbpro.model.ImageVersionInfo) parcel.readParcelable(com.realsil.sdk.bbpro.model.ImageVersionInfo.class.getClassLoader());
        this.c0 = parcel.readByte();
    }
}
