package com.oudmon.ble.base.bluetooth;

/* loaded from: /tmp/dex/classes2.dex */
public class BeanFactory {
    public static com.oudmon.ble.base.communication.rsp.BaseRspCmd createBean(int i, int i2) {
        switch (i) {
            case 1:
                return new com.oudmon.ble.base.communication.rsp.SetTimeRsp();
            case 2:
                return new com.oudmon.ble.base.communication.rsp.CameraNotifyRsp();
            case 3:
                return new com.oudmon.ble.base.communication.rsp.BatteryRsp();
            case 5:
                return new com.oudmon.ble.base.communication.rsp.PalmScreenRsp();
            case 6:
                return new com.oudmon.ble.base.communication.rsp.DndRsp();
            case 10:
                return new com.oudmon.ble.base.communication.rsp.TimeFormatRsp();
            case 12:
                return new com.oudmon.ble.base.communication.rsp.BpSettingRsp();
            case 13:
                return new com.oudmon.ble.base.communication.rsp.BpDataRsp();
            case 17:
                return new com.oudmon.ble.base.communication.rsp.PhoneNotifyRsp();
            case 20:
                return new com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp();
            case 21:
                return new com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp();
            case 22:
                return new com.oudmon.ble.base.communication.rsp.HeartRateSettingRsp();
            case 25:
                return new com.oudmon.ble.base.communication.rsp.DegreeSwitchRsp();
            case 26:
                return new com.oudmon.ble.base.communication.rsp.WeatherForecastRsp();
            case 29:
                return new com.oudmon.ble.base.communication.rsp.MusicCommandRsp();
            case 30:
                return new com.oudmon.ble.base.communication.rsp.RealTimeHeartRateRsp();
            case 31:
                return new com.oudmon.ble.base.communication.rsp.DisplayTimeRsp();
            case 33:
                return new com.oudmon.ble.base.communication.rsp.TargetSettingRsp();
            case 34:
                return new com.oudmon.ble.base.communication.rsp.FindPhoneRsp();
            case 38:
                return new com.oudmon.ble.base.communication.rsp.ReadSitLongRsp();
            case 40:
                return new com.oudmon.ble.base.communication.rsp.ReadAlarmRsp();
            case 44:
                return new com.oudmon.ble.base.communication.rsp.BloodOxygenSettingRsp();
            case 47:
                return new com.oudmon.ble.base.communication.rsp.PackageLengthRsp();
            case 50:
                return new com.oudmon.ble.base.communication.rsp.DeviceAvatarRsp();
            case 54:
                return new com.oudmon.ble.base.communication.rsp.PressureSettingRsp();
            case 55:
                return new com.oudmon.ble.base.communication.rsp.PressureRsp();
            case 67:
                return new com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp();
            case 68:
                return new com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp();
            case 72:
                return new com.oudmon.ble.base.communication.rsp.TodaySportDataRsp();
            case 97:
                return new com.oudmon.ble.base.communication.rsp.ReadMessagePushRsp();
            case 105:
                return new com.oudmon.ble.base.communication.rsp.StartHeartRateRsp();
            case 114:
                return new com.oudmon.ble.base.communication.rsp.SimpleStatusRsp();
            case 115:
            case 120:
                return new com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp();
            case 119:
                return new com.oudmon.ble.base.communication.rsp.AppSportRsp();
            default:
                return null;
        }
    }
}
