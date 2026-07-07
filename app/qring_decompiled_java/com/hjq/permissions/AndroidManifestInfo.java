package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
final class AndroidManifestInfo {
    com.hjq.permissions.AndroidManifestInfo.ApplicationInfo applicationInfo;
    java.lang.String packageName;
    com.hjq.permissions.AndroidManifestInfo.UsesSdkInfo usesSdkInfo;
    final java.util.List<com.hjq.permissions.AndroidManifestInfo.PermissionInfo> permissionInfoList = new java.util.ArrayList();
    final java.util.List<com.hjq.permissions.AndroidManifestInfo.ActivityInfo> activityInfoList = new java.util.ArrayList();
    final java.util.List<com.hjq.permissions.AndroidManifestInfo.ServiceInfo> serviceInfoList = new java.util.ArrayList();

    AndroidManifestInfo() {
    }

    static final class UsesSdkInfo {
        public int minSdkVersion;

        UsesSdkInfo() {
        }
    }

    static final class PermissionInfo {
        private static final int REQUESTED_PERMISSION_NEVER_FOR_LOCATION = 65536;
        public int maxSdkVersion;
        public java.lang.String name;
        public int usesPermissionFlags;

        PermissionInfo() {
        }

        public boolean neverForLocation() {
            return (this.usesPermissionFlags & 65536) != 0;
        }
    }

    static final class ApplicationInfo {
        public java.lang.String name;
        public boolean requestLegacyExternalStorage;

        ApplicationInfo() {
        }
    }

    static final class ActivityInfo {
        public java.lang.String name;
        public boolean supportsPictureInPicture;

        ActivityInfo() {
        }
    }

    static final class ServiceInfo {
        public java.lang.String name;
        public java.lang.String permission;

        ServiceInfo() {
        }
    }
}
