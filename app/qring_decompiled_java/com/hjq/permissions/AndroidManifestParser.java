package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
final class AndroidManifestParser {
    private static final java.lang.String ANDROID_MANIFEST_FILE_NAME = "AndroidManifest.xml";
    private static final java.lang.String ANDROID_NAMESPACE_URI = "http://schemas.android.com/apk/res/android";
    private static final java.lang.String ATTR_MAX_SDK_VERSION = "maxSdkVersion";
    private static final java.lang.String ATTR_MIN_SDK_VERSION = "minSdkVersion";
    private static final java.lang.String ATTR_NAME = "name";
    private static final java.lang.String ATTR_PACKAGE = "package";
    private static final java.lang.String ATTR_PERMISSION = "permission";
    private static final java.lang.String ATTR_REQUEST_LEGACY_EXTERNAL_STORAGE = "requestLegacyExternalStorage";
    private static final java.lang.String ATTR_SUPPORTS_PICTURE_IN_PICTURE = "supportsPictureInPicture";
    private static final java.lang.String ATTR_USES_PERMISSION_FLAGS = "usesPermissionFlags";
    private static final java.lang.String TAG_ACTIVITY = "activity";
    private static final java.lang.String TAG_ACTIVITY_ALIAS = "activity-alias";
    private static final java.lang.String TAG_APPLICATION = "application";
    private static final java.lang.String TAG_MANIFEST = "manifest";
    private static final java.lang.String TAG_SERVICE = "service";
    private static final java.lang.String TAG_USES_PERMISSION = "uses-permission";
    private static final java.lang.String TAG_USES_PERMISSION_SDK_23 = "uses-permission-sdk-23";
    private static final java.lang.String TAG_USES_PERMISSION_SDK_M = "uses-permission-sdk-m";
    private static final java.lang.String TAG_USES_SDK = "uses-sdk";

    AndroidManifestParser() {
    }

    static com.hjq.permissions.AndroidManifestInfo parseAndroidManifest(android.content.Context context, int i) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        com.hjq.permissions.AndroidManifestInfo androidManifestInfo = new com.hjq.permissions.AndroidManifestInfo();
        android.content.res.XmlResourceParser openXmlResourceParser = context.getAssets().openXmlResourceParser(i, ANDROID_MANIFEST_FILE_NAME);
        do {
            if (openXmlResourceParser.getEventType() == 2) {
                java.lang.String name = openXmlResourceParser.getName();
                if (android.text.TextUtils.equals(TAG_MANIFEST, name)) {
                    androidManifestInfo.packageName = openXmlResourceParser.getAttributeValue(null, ATTR_PACKAGE);
                }
                if (android.text.TextUtils.equals(TAG_USES_SDK, name)) {
                    androidManifestInfo.usesSdkInfo = parseUsesSdkFromXml(openXmlResourceParser);
                }
                if (android.text.TextUtils.equals(TAG_USES_PERMISSION, name) || android.text.TextUtils.equals(TAG_USES_PERMISSION_SDK_23, name) || android.text.TextUtils.equals(TAG_USES_PERMISSION_SDK_M, name)) {
                    androidManifestInfo.permissionInfoList.add(parsePermissionFromXml(openXmlResourceParser));
                }
                if (android.text.TextUtils.equals(TAG_APPLICATION, name)) {
                    androidManifestInfo.applicationInfo = parseApplicationFromXml(openXmlResourceParser);
                }
                if (android.text.TextUtils.equals(TAG_ACTIVITY, name) || android.text.TextUtils.equals(TAG_ACTIVITY_ALIAS, name)) {
                    androidManifestInfo.activityInfoList.add(parseActivityFromXml(openXmlResourceParser));
                }
                if (android.text.TextUtils.equals(TAG_SERVICE, name)) {
                    androidManifestInfo.serviceInfoList.add(parseServerFromXml(openXmlResourceParser));
                }
            }
        } while (openXmlResourceParser.next() != 1);
        openXmlResourceParser.close();
        return androidManifestInfo;
    }

    private static com.hjq.permissions.AndroidManifestInfo.UsesSdkInfo parseUsesSdkFromXml(android.content.res.XmlResourceParser xmlResourceParser) {
        com.hjq.permissions.AndroidManifestInfo.UsesSdkInfo usesSdkInfo = new com.hjq.permissions.AndroidManifestInfo.UsesSdkInfo();
        usesSdkInfo.minSdkVersion = xmlResourceParser.getAttributeIntValue(ANDROID_NAMESPACE_URI, ATTR_MIN_SDK_VERSION, 0);
        return usesSdkInfo;
    }

    private static com.hjq.permissions.AndroidManifestInfo.PermissionInfo parsePermissionFromXml(android.content.res.XmlResourceParser xmlResourceParser) {
        com.hjq.permissions.AndroidManifestInfo.PermissionInfo permissionInfo = new com.hjq.permissions.AndroidManifestInfo.PermissionInfo();
        permissionInfo.name = xmlResourceParser.getAttributeValue(ANDROID_NAMESPACE_URI, ATTR_NAME);
        permissionInfo.maxSdkVersion = xmlResourceParser.getAttributeIntValue(ANDROID_NAMESPACE_URI, ATTR_MAX_SDK_VERSION, com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER);
        permissionInfo.usesPermissionFlags = xmlResourceParser.getAttributeIntValue(ANDROID_NAMESPACE_URI, ATTR_USES_PERMISSION_FLAGS, 0);
        return permissionInfo;
    }

    private static com.hjq.permissions.AndroidManifestInfo.ApplicationInfo parseApplicationFromXml(android.content.res.XmlResourceParser xmlResourceParser) {
        com.hjq.permissions.AndroidManifestInfo.ApplicationInfo applicationInfo = new com.hjq.permissions.AndroidManifestInfo.ApplicationInfo();
        applicationInfo.name = xmlResourceParser.getAttributeValue(ANDROID_NAMESPACE_URI, ATTR_NAME);
        applicationInfo.requestLegacyExternalStorage = xmlResourceParser.getAttributeBooleanValue(ANDROID_NAMESPACE_URI, ATTR_REQUEST_LEGACY_EXTERNAL_STORAGE, false);
        return applicationInfo;
    }

    private static com.hjq.permissions.AndroidManifestInfo.ActivityInfo parseActivityFromXml(android.content.res.XmlResourceParser xmlResourceParser) {
        com.hjq.permissions.AndroidManifestInfo.ActivityInfo activityInfo = new com.hjq.permissions.AndroidManifestInfo.ActivityInfo();
        activityInfo.name = xmlResourceParser.getAttributeValue(ANDROID_NAMESPACE_URI, ATTR_NAME);
        activityInfo.supportsPictureInPicture = xmlResourceParser.getAttributeBooleanValue(ANDROID_NAMESPACE_URI, ATTR_SUPPORTS_PICTURE_IN_PICTURE, false);
        return activityInfo;
    }

    private static com.hjq.permissions.AndroidManifestInfo.ServiceInfo parseServerFromXml(android.content.res.XmlResourceParser xmlResourceParser) {
        com.hjq.permissions.AndroidManifestInfo.ServiceInfo serviceInfo = new com.hjq.permissions.AndroidManifestInfo.ServiceInfo();
        serviceInfo.name = xmlResourceParser.getAttributeValue(ANDROID_NAMESPACE_URI, ATTR_NAME);
        serviceInfo.permission = xmlResourceParser.getAttributeValue(ANDROID_NAMESPACE_URI, ATTR_PERMISSION);
        return serviceInfo;
    }
}
