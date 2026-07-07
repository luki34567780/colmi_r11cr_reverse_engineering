package com.blankj.utilcode.constant;

/* loaded from: classes.dex */
public final class PermissionConstants {
    public static final java.lang.String ACTIVITY_RECOGNITION = "ACTIVITY_RECOGNITION";
    public static final java.lang.String CALENDAR = "CALENDAR";
    public static final java.lang.String CAMERA = "CAMERA";
    public static final java.lang.String CONTACTS = "CONTACTS";
    public static final java.lang.String LOCATION = "LOCATION";
    public static final java.lang.String MICROPHONE = "MICROPHONE";
    public static final java.lang.String PHONE = "PHONE";
    public static final java.lang.String SENSORS = "SENSORS";
    public static final java.lang.String SMS = "SMS";
    public static final java.lang.String STORAGE = "STORAGE";
    private static final java.lang.String[] GROUP_CALENDAR = {com.hjq.permissions.Permission.READ_CALENDAR, com.hjq.permissions.Permission.WRITE_CALENDAR};
    private static final java.lang.String[] GROUP_CAMERA = {com.hjq.permissions.Permission.CAMERA};
    private static final java.lang.String[] GROUP_CONTACTS = {com.hjq.permissions.Permission.READ_CONTACTS, com.hjq.permissions.Permission.WRITE_CONTACTS, com.hjq.permissions.Permission.GET_ACCOUNTS};
    private static final java.lang.String[] GROUP_LOCATION = {com.hjq.permissions.Permission.ACCESS_FINE_LOCATION, com.hjq.permissions.Permission.ACCESS_COARSE_LOCATION, com.hjq.permissions.Permission.ACCESS_BACKGROUND_LOCATION};
    private static final java.lang.String[] GROUP_MICROPHONE = {com.hjq.permissions.Permission.RECORD_AUDIO};
    private static final java.lang.String[] GROUP_PHONE = {com.hjq.permissions.Permission.READ_PHONE_STATE, com.hjq.permissions.Permission.READ_PHONE_NUMBERS, com.hjq.permissions.Permission.CALL_PHONE, com.hjq.permissions.Permission.READ_CALL_LOG, com.hjq.permissions.Permission.WRITE_CALL_LOG, com.hjq.permissions.Permission.ADD_VOICEMAIL, com.hjq.permissions.Permission.USE_SIP, com.hjq.permissions.Permission.PROCESS_OUTGOING_CALLS, com.hjq.permissions.Permission.ANSWER_PHONE_CALLS};
    private static final java.lang.String[] GROUP_PHONE_BELOW_O = {com.hjq.permissions.Permission.READ_PHONE_STATE, com.hjq.permissions.Permission.READ_PHONE_NUMBERS, com.hjq.permissions.Permission.CALL_PHONE, com.hjq.permissions.Permission.READ_CALL_LOG, com.hjq.permissions.Permission.WRITE_CALL_LOG, com.hjq.permissions.Permission.ADD_VOICEMAIL, com.hjq.permissions.Permission.USE_SIP, com.hjq.permissions.Permission.PROCESS_OUTGOING_CALLS};
    private static final java.lang.String[] GROUP_SENSORS = {com.hjq.permissions.Permission.BODY_SENSORS};
    private static final java.lang.String[] GROUP_SMS = {com.hjq.permissions.Permission.SEND_SMS, com.hjq.permissions.Permission.RECEIVE_SMS, com.hjq.permissions.Permission.READ_SMS, com.hjq.permissions.Permission.RECEIVE_WAP_PUSH, com.hjq.permissions.Permission.RECEIVE_MMS};
    private static final java.lang.String[] GROUP_STORAGE = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final java.lang.String[] GROUP_ACTIVITY_RECOGNITION = {com.hjq.permissions.Permission.ACTIVITY_RECOGNITION};

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PermissionGroup {
    }

    public static java.lang.String[] getPermissions(java.lang.String str) {
        if (str == null) {
            return new java.lang.String[0];
        }
        str.hashCode();
        switch (str) {
            case "LOCATION":
                return GROUP_LOCATION;
            case "SENSORS":
                return GROUP_SENSORS;
            case "STORAGE":
                return GROUP_STORAGE;
            case "SMS":
                return GROUP_SMS;
            case "PHONE":
                if (android.os.Build.VERSION.SDK_INT < 26) {
                    return GROUP_PHONE_BELOW_O;
                }
                return GROUP_PHONE;
            case "ACTIVITY_RECOGNITION":
                return GROUP_ACTIVITY_RECOGNITION;
            case "CONTACTS":
                return GROUP_CONTACTS;
            case "CALENDAR":
                return GROUP_CALENDAR;
            case "MICROPHONE":
                return GROUP_MICROPHONE;
            case "CAMERA":
                return GROUP_CAMERA;
            default:
                return new java.lang.String[]{str};
        }
    }
}
