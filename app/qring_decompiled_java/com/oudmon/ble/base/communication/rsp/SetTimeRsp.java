package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class SetTimeRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    public int height;
    public boolean mEbookSupport;
    public int mMaxContacts;
    public int mMaxWatchFace;
    public boolean mMusicSupport;
    public boolean mNewSleepProtocol;
    public boolean mSupportAlbum;
    public boolean mSupportAvatar;
    public boolean mSupportBloodOxygen;
    public boolean mSupportBloodPressure;
    public boolean mSupportBloodSugar;
    public boolean mSupportContact;
    public boolean mSupportCustomWallpaper;
    public boolean mSupportECard;
    public boolean mSupportFeature;
    public boolean mSupportGPS;
    public boolean mSupportJieLiMusic;
    public boolean mSupportLocation;
    public boolean mSupportLyrics;
    public boolean mSupportManualHeart;
    public boolean mSupportMenstruation;
    public boolean mSupportOneKeyCheck;
    public boolean mSupportPlate;
    public boolean mSupportTemperature;
    public boolean mSupportWeChat;
    public boolean mSupportWeather;
    public boolean rtkMcu;
    public int width;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        this.mSupportTemperature = bArr[0] == 1;
        this.mSupportPlate = bArr[1] == 1;
        this.mSupportMenstruation = bArr[2] == 1;
        this.mSupportCustomWallpaper = (bArr[3] & 1) != 0;
        this.mSupportBloodOxygen = (bArr[3] & 2) != 0;
        this.mSupportBloodPressure = (bArr[3] & 4) != 0;
        this.mSupportFeature = (bArr[3] & 8) != 0;
        this.mSupportOneKeyCheck = (bArr[3] & 16) != 0;
        this.mSupportWeather = (bArr[3] & 32) != 0;
        this.mSupportWeChat = (bArr[3] & 64) == 0;
        this.mSupportAvatar = (bArr[3] & com.realsil.sdk.bbpro.params.Mmi.AU_MMI_GAMING_MODE_SWITCH) != 0;
        this.width = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 4, 6));
        this.height = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 6, 8));
        this.mNewSleepProtocol = bArr[8] == 1;
        this.mMaxWatchFace = bArr[9];
        this.mSupportContact = (bArr[10] & 1) != 0;
        this.mSupportLyrics = (bArr[10] & 2) != 0;
        this.mSupportAlbum = (bArr[10] & 4) != 0;
        this.mSupportGPS = (bArr[10] & 8) != 0;
        this.mSupportJieLiMusic = (bArr[10] & 16) != 0;
        this.mSupportManualHeart = (bArr[11] & 1) != 0;
        this.mSupportECard = (2 & bArr[11]) != 0;
        this.mSupportLocation = (bArr[11] & 4) != 0;
        this.mMusicSupport = (bArr[11] & 16) != 0;
        this.rtkMcu = (bArr[11] & 32) != 0;
        this.mEbookSupport = (bArr[11] & 64) != 0;
        this.mSupportBloodSugar = (bArr[11] & com.realsil.sdk.bbpro.params.Mmi.AU_MMI_GAMING_MODE_SWITCH) != 0;
        if (bArr[12] == 0) {
            this.mMaxContacts = 20;
        } else {
            this.mMaxContacts = bArr[12] * 10;
        }
        return false;
    }
}
