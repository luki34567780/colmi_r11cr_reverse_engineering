package com.hjq.permissions;

/* loaded from: /tmp/dex/classes2.dex */
final class PermissionChecker {
    PermissionChecker() {
    }

    static boolean checkActivityStatus(android.app.Activity activity, boolean z) {
        if (activity == null) {
            if (z) {
                throw new java.lang.IllegalArgumentException("The instance of the context must be an activity object");
            }
            return false;
        }
        if (activity.isFinishing()) {
            if (z) {
                throw new java.lang.IllegalStateException("The activity has been finishing, please manually determine the status of the activity");
            }
            return false;
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid4_2() || !activity.isDestroyed()) {
            return true;
        }
        if (z) {
            throw new java.lang.IllegalStateException("The activity has been destroyed, please manually determine the status of the activity");
        }
        return false;
    }

    static boolean checkPermissionArgument(java.util.List<java.lang.String> list, boolean z) {
        if (list == null || list.isEmpty()) {
            if (z) {
                throw new java.lang.IllegalArgumentException("The requested permission cannot be empty");
            }
            return false;
        }
        if (com.hjq.permissions.AndroidVersion.getAndroidVersionCode() <= 33 && z) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.reflect.Field[] declaredFields = com.hjq.permissions.Permission.class.getDeclaredFields();
            if (declaredFields.length == 0) {
                return true;
            }
            for (java.lang.reflect.Field field : declaredFields) {
                if (java.lang.String.class.equals(field.getType())) {
                    try {
                        arrayList.add((java.lang.String) field.get(null));
                    } catch (java.lang.IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            for (java.lang.String str : list) {
                if (!com.hjq.permissions.PermissionUtils.containsPermission(arrayList, str)) {
                    throw new java.lang.IllegalArgumentException("The " + str + " is not a dangerous permission or special permission, please do not request dynamically");
                }
            }
        }
        return true;
    }

    static void checkMediaLocationPermission(android.content.Context context, java.util.List<java.lang.String> list) {
        if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.ACCESS_MEDIA_LOCATION)) {
            for (java.lang.String str : list) {
                if (!com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_MEDIA_LOCATION) && !com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_IMAGES") && !com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_EXTERNAL_STORAGE") && !com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.WRITE_EXTERNAL_STORAGE") && !com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE)) {
                    throw new java.lang.IllegalArgumentException("Because it includes access media location permissions, do not apply for permissions unrelated to access media location");
                }
            }
            if (com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(context) >= 33) {
                if (!com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_MEDIA_IMAGES") && !com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE)) {
                    throw new java.lang.IllegalArgumentException("You must add android.permission.READ_MEDIA_IMAGES or android.permission.MANAGE_EXTERNAL_STORAGE rights to apply for android.permission.ACCESS_MEDIA_LOCATION rights");
                }
            } else if (!com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_EXTERNAL_STORAGE") && !com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE)) {
                throw new java.lang.IllegalArgumentException("You must add android.permission.READ_EXTERNAL_STORAGE or android.permission.MANAGE_EXTERNAL_STORAGE rights to apply for android.permission.ACCESS_MEDIA_LOCATION rights");
            }
        }
    }

    static void checkStoragePermission(android.content.Context context, java.util.List<java.lang.String> list, com.hjq.permissions.AndroidManifestInfo androidManifestInfo) {
        com.hjq.permissions.AndroidManifestInfo.ApplicationInfo applicationInfo;
        if (com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_MEDIA_IMAGES") || com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_MEDIA_VIDEO") || com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_MEDIA_AUDIO") || com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE) || com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_EXTERNAL_STORAGE") || com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            if (com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(context) >= 33 && com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_EXTERNAL_STORAGE")) {
                throw new java.lang.IllegalArgumentException("When targetSdkVersion >= 33 should use android.permission.READ_MEDIA_IMAGES, android.permission.READ_MEDIA_VIDEO, android.permission.READ_MEDIA_AUDIO instead of android.permission.READ_EXTERNAL_STORAGE");
            }
            if (com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_MEDIA_IMAGES") || com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.ACCESS_MEDIA_LOCATION) || androidManifestInfo == null || (applicationInfo = androidManifestInfo.applicationInfo) == null) {
                return;
            }
            boolean isScopedStorage = com.hjq.permissions.PermissionUtils.isScopedStorage(context);
            int targetSdkVersionCode = com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(context);
            boolean z = applicationInfo.requestLegacyExternalStorage;
            if (targetSdkVersionCode >= 29 && !z && (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE) || !isScopedStorage)) {
                throw new java.lang.IllegalStateException("Please register the android:requestLegacyExternalStorage=\"true\" attribute in the AndroidManifest.xml file, otherwise it will cause incompatibility with the old version");
            }
            if (targetSdkVersionCode >= 30 && !com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE) && !isScopedStorage) {
                throw new java.lang.IllegalArgumentException("The storage permission application is abnormal. If you have adapted the scope storage, please register the <meta-data android:name=\"ScopedStorage\" android:value=\"true\" /> attribute in the AndroidManifest.xml file. If there is no adaptation scope storage, please use android.permission.MANAGE_EXTERNAL_STORAGE to apply for permission");
            }
        }
    }

    static void checkBodySensorsPermission(java.util.List<java.lang.String> list) {
        if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.BODY_SENSORS_BACKGROUND)) {
            if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.BODY_SENSORS_BACKGROUND) && !com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.BODY_SENSORS)) {
                throw new java.lang.IllegalArgumentException("Applying for background sensor permissions must contain android.permission.BODY_SENSORS");
            }
            for (java.lang.String str : list) {
                if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_BACKGROUND_LOCATION)) {
                    throw new java.lang.IllegalArgumentException("Applying for permissions android.permission.BODY_SENSORS_BACKGROUND and android.permission.ACCESS_BACKGROUND_LOCATION at the same time is not supported");
                }
                if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_MEDIA_LOCATION)) {
                    throw new java.lang.IllegalArgumentException("Applying for permissions android.permission.BODY_SENSORS_BACKGROUND and android.permission.ACCESS_MEDIA_LOCATION at the same time is not supported");
                }
            }
        }
    }

    static void checkLocationPermission(java.util.List<java.lang.String> list) {
        if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.ACCESS_BACKGROUND_LOCATION)) {
            if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.ACCESS_COARSE_LOCATION) && !com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION)) {
                throw new java.lang.IllegalArgumentException("Applying for background positioning permissions must include android.permission.ACCESS_FINE_LOCATION");
            }
            for (java.lang.String str : list) {
                if (!com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) && !com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_COARSE_LOCATION) && !com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_BACKGROUND_LOCATION)) {
                    throw new java.lang.IllegalArgumentException("Because it includes background location permissions, do not apply for permissions unrelated to location");
                }
            }
        }
    }

    static void checkNearbyDevicesPermission(java.util.List<java.lang.String> list, com.hjq.permissions.AndroidManifestInfo androidManifestInfo) {
        if ((!com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.BLUETOOTH_SCAN) && !com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.NEARBY_WIFI_DEVICES)) || com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) || androidManifestInfo == null) {
            return;
        }
        for (com.hjq.permissions.AndroidManifestInfo.PermissionInfo permissionInfo : androidManifestInfo.permissionInfoList) {
            if (com.hjq.permissions.PermissionUtils.equalsPermission(permissionInfo.name, com.hjq.permissions.Permission.BLUETOOTH_SCAN) || com.hjq.permissions.PermissionUtils.equalsPermission(permissionInfo.name, com.hjq.permissions.Permission.NEARBY_WIFI_DEVICES)) {
                if (!permissionInfo.neverForLocation()) {
                    java.lang.String str = permissionInfo.maxSdkVersion != Integer.MAX_VALUE ? "android:maxSdkVersion=\"" + permissionInfo.maxSdkVersion + "\" " : "";
                    throw new java.lang.IllegalArgumentException("If your app doesn't use " + permissionInfo.name + " to get physical location, please change the <uses-permission android:name=\"" + permissionInfo.name + "\" " + str + "/> node in the manifest file to <uses-permission android:name=\"" + permissionInfo.name + "\" android:usesPermissionFlags=\"neverForLocation\" " + str + "/> node, if your app need use " + permissionInfo.name + " to get physical location, also need to add " + com.hjq.permissions.Permission.ACCESS_FINE_LOCATION + " permissions");
                }
            }
        }
    }

    static void checkNotificationListenerPermission(java.util.List<java.lang.String> list, com.hjq.permissions.AndroidManifestInfo androidManifestInfo) {
        if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.BIND_NOTIFICATION_LISTENER_SERVICE) && androidManifestInfo != null) {
            java.util.List<com.hjq.permissions.AndroidManifestInfo.ServiceInfo> list2 = androidManifestInfo.serviceInfoList;
            for (int i = 0; i < list2.size(); i++) {
                if (android.text.TextUtils.equals(list2.get(i).permission, com.hjq.permissions.Permission.BIND_NOTIFICATION_LISTENER_SERVICE)) {
                    return;
                }
            }
            throw new java.lang.IllegalArgumentException("No service registered permission attribute, please register <service android:permission=\"android.permission.BIND_NOTIFICATION_LISTENER_SERVICE\" > in AndroidManifest.xml");
        }
    }

    static void checkPictureInPicturePermission(android.app.Activity activity, java.util.List<java.lang.String> list, com.hjq.permissions.AndroidManifestInfo androidManifestInfo) {
        if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.PICTURE_IN_PICTURE) && androidManifestInfo != null) {
            java.util.List<com.hjq.permissions.AndroidManifestInfo.ActivityInfo> list2 = androidManifestInfo.activityInfoList;
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i).supportsPictureInPicture) {
                    return;
                }
            }
            throw new java.lang.IllegalArgumentException("No activity registered supportsPictureInPicture attribute, please register \n<activity android:name=\"" + activity.getClass().getName().replace(activity.getPackageName(), "") + "\" android:supportsPictureInPicture=\"true\" > in AndroidManifest.xml");
        }
    }

    static void checkTargetSdkVersion(android.content.Context context, java.util.List<java.lang.String> list) {
        int i;
        if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.POST_NOTIFICATIONS) || com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.NEARBY_WIFI_DEVICES) || com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.BODY_SENSORS_BACKGROUND) || com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_MEDIA_IMAGES") || com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_MEDIA_VIDEO") || com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_MEDIA_AUDIO")) {
            i = 33;
        } else if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.BLUETOOTH_SCAN) || com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.BLUETOOTH_CONNECT) || com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.BLUETOOTH_ADVERTISE) || com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.SCHEDULE_EXACT_ALARM)) {
            i = 31;
        } else if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE)) {
            i = 30;
        } else if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.ACCESS_BACKGROUND_LOCATION) || com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.ACTIVITY_RECOGNITION) || com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.ACCESS_MEDIA_LOCATION)) {
            i = 29;
        } else if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.ACCEPT_HANDOVER)) {
            i = 28;
        } else {
            i = (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.REQUEST_INSTALL_PACKAGES) || com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.ANSWER_PHONE_CALLS) || com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.READ_PHONE_NUMBERS) || com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.PICTURE_IN_PICTURE)) ? 26 : 23;
        }
        if (com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(context) >= i) {
            return;
        }
        throw new java.lang.RuntimeException("The targetSdkVersion SDK must be " + i + " or more, if you do not want to upgrade targetSdkVersion, please apply with the old permissions");
    }

    static void checkManifestPermissions(android.content.Context context, java.util.List<java.lang.String> list, com.hjq.permissions.AndroidManifestInfo androidManifestInfo) {
        int i;
        if (androidManifestInfo == null) {
            return;
        }
        java.util.List<com.hjq.permissions.AndroidManifestInfo.PermissionInfo> list2 = androidManifestInfo.permissionInfoList;
        if (list2.isEmpty()) {
            throw new java.lang.IllegalStateException("No permissions are registered in the AndroidManifest.xml file");
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid7()) {
            i = context.getApplicationInfo().minSdkVersion;
        } else {
            i = androidManifestInfo.usesSdkInfo != null ? androidManifestInfo.usesSdkInfo.minSdkVersion : 23;
        }
        for (java.lang.String str : list) {
            if (!com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.NOTIFICATION_SERVICE) && !com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BIND_NOTIFICATION_LISTENER_SERVICE) && !com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BIND_VPN_SERVICE) && !com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.PICTURE_IN_PICTURE)) {
                checkManifestPermission(list2, str);
                if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BODY_SENSORS_BACKGROUND)) {
                    checkManifestPermission(list2, com.hjq.permissions.Permission.BODY_SENSORS);
                } else if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.ACCESS_BACKGROUND_LOCATION)) {
                    if (com.hjq.permissions.AndroidVersion.getTargetSdkVersionCode(context) >= 31) {
                        checkManifestPermission(list2, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION, 30);
                        checkManifestPermission(list2, com.hjq.permissions.Permission.ACCESS_COARSE_LOCATION);
                    } else {
                        checkManifestPermission(list2, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION);
                    }
                } else {
                    if (i < 33) {
                        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_IMAGES") || com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_VIDEO") || com.hjq.permissions.PermissionUtils.equalsPermission(str, "android.permission.READ_MEDIA_AUDIO")) {
                            checkManifestPermission(list2, "android.permission.READ_EXTERNAL_STORAGE", 32);
                        } else if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.NEARBY_WIFI_DEVICES)) {
                            checkManifestPermission(list2, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION, 32);
                        }
                    }
                    if (i < 31) {
                        if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_SCAN)) {
                            checkManifestPermission(list2, "android.permission.BLUETOOTH_ADMIN", 30);
                            checkManifestPermission(list2, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION, 30);
                        } else if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_CONNECT)) {
                            checkManifestPermission(list2, "android.permission.BLUETOOTH", 30);
                        } else if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.BLUETOOTH_ADVERTISE)) {
                            checkManifestPermission(list2, "android.permission.BLUETOOTH_ADMIN", 30);
                        }
                    }
                    if (i < 30 && com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE)) {
                        checkManifestPermission(list2, "android.permission.READ_EXTERNAL_STORAGE", 29);
                        checkManifestPermission(list2, "android.permission.WRITE_EXTERNAL_STORAGE", 29);
                    } else if (i < 26 && com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.READ_PHONE_NUMBERS)) {
                        checkManifestPermission(list2, com.hjq.permissions.Permission.READ_PHONE_STATE, 25);
                    } else if (com.hjq.permissions.PermissionUtils.equalsPermission(str, com.hjq.permissions.Permission.GET_INSTALLED_APPS)) {
                        checkManifestPermission(list2, "android.permission.QUERY_ALL_PACKAGES");
                    }
                }
            }
        }
    }

    static void checkManifestPermission(java.util.List<com.hjq.permissions.AndroidManifestInfo.PermissionInfo> list, java.lang.String str) {
        checkManifestPermission(list, str, com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    static void checkManifestPermission(java.util.List<com.hjq.permissions.AndroidManifestInfo.PermissionInfo> list, java.lang.String str, int i) {
        com.hjq.permissions.AndroidManifestInfo.PermissionInfo permissionInfo;
        java.lang.String str2;
        java.util.Iterator<com.hjq.permissions.AndroidManifestInfo.PermissionInfo> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                permissionInfo = null;
                break;
            } else {
                permissionInfo = it.next();
                if (android.text.TextUtils.equals(permissionInfo.name, str)) {
                    break;
                }
            }
        }
        if (permissionInfo == null) {
            throw new java.lang.IllegalStateException("Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\"" + str + "\" />");
        }
        int i2 = permissionInfo.maxSdkVersion;
        if (i2 < i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("The AndroidManifest.xml file <uses-permission android:name=\"");
            sb.append(str);
            sb.append("\" android:maxSdkVersion=\"");
            sb.append(i2);
            sb.append("\" /> does not meet the requirements, ");
            if (i != Integer.MAX_VALUE) {
                str2 = "the minimum requirement for maxSdkVersion is " + i;
            } else {
                str2 = "please delete the android:maxSdkVersion=\"" + i2 + "\" attribute";
            }
            sb.append(str2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    static void optimizeDeprecatedPermission(java.util.List<java.lang.String> list) {
        if (!com.hjq.permissions.AndroidVersion.isAndroid13()) {
            if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.POST_NOTIFICATIONS) && !com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.NOTIFICATION_SERVICE)) {
                list.add(com.hjq.permissions.Permission.NOTIFICATION_SERVICE);
            }
            if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.NEARBY_WIFI_DEVICES) && !com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION)) {
                list.add(com.hjq.permissions.Permission.ACCESS_FINE_LOCATION);
            }
            if ((com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_MEDIA_IMAGES") || com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_MEDIA_VIDEO") || com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_MEDIA_AUDIO")) && !com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_EXTERNAL_STORAGE")) {
                list.add("android.permission.READ_EXTERNAL_STORAGE");
            }
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid12() && com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.BLUETOOTH_SCAN) && !com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION)) {
            list.add(com.hjq.permissions.Permission.ACCESS_FINE_LOCATION);
        }
        if (com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.MANAGE_EXTERNAL_STORAGE)) {
            if (com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.READ_EXTERNAL_STORAGE") || com.hjq.permissions.PermissionUtils.containsPermission(list, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                throw new java.lang.IllegalArgumentException("If you have applied for MANAGE_EXTERNAL_STORAGE permissions, do not apply for the READ_EXTERNAL_STORAGE and WRITE_EXTERNAL_STORAGE permissions");
            }
            if (!com.hjq.permissions.AndroidVersion.isAndroid11()) {
                list.add("android.permission.READ_EXTERNAL_STORAGE");
                list.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
        }
        if (!com.hjq.permissions.AndroidVersion.isAndroid10() && com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.ACTIVITY_RECOGNITION) && !com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.BODY_SENSORS)) {
            list.add(com.hjq.permissions.Permission.BODY_SENSORS);
        }
        if (com.hjq.permissions.AndroidVersion.isAndroid8() || !com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.READ_PHONE_NUMBERS) || com.hjq.permissions.PermissionUtils.containsPermission(list, com.hjq.permissions.Permission.READ_PHONE_STATE)) {
            return;
        }
        list.add(com.hjq.permissions.Permission.READ_PHONE_STATE);
    }
}
