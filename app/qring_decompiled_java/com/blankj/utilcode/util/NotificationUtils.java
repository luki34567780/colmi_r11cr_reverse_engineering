package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public class NotificationUtils {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Importance {
    }

    public static boolean areNotificationsEnabled() {
        return androidx.core.app.NotificationManagerCompat.from(com.blankj.utilcode.util.Utils.getApp()).areNotificationsEnabled();
    }

    public static void notify(int i, com.blankj.utilcode.util.Utils.Consumer<androidx.core.app.NotificationCompat.Builder> consumer) {
        notify(null, i, com.blankj.utilcode.util.NotificationUtils.ChannelConfig.DEFAULT_CHANNEL_CONFIG, consumer);
    }

    public static void notify(java.lang.String str, int i, com.blankj.utilcode.util.Utils.Consumer<androidx.core.app.NotificationCompat.Builder> consumer) {
        notify(str, i, com.blankj.utilcode.util.NotificationUtils.ChannelConfig.DEFAULT_CHANNEL_CONFIG, consumer);
    }

    public static void notify(int i, com.blankj.utilcode.util.NotificationUtils.ChannelConfig channelConfig, com.blankj.utilcode.util.Utils.Consumer<androidx.core.app.NotificationCompat.Builder> consumer) {
        notify(null, i, channelConfig, consumer);
    }

    public static void notify(java.lang.String str, int i, com.blankj.utilcode.util.NotificationUtils.ChannelConfig channelConfig, com.blankj.utilcode.util.Utils.Consumer<androidx.core.app.NotificationCompat.Builder> consumer) {
        androidx.core.app.NotificationManagerCompat.from(com.blankj.utilcode.util.Utils.getApp()).notify(str, i, getNotification(channelConfig, consumer));
    }

    public static android.app.Notification getNotification(com.blankj.utilcode.util.NotificationUtils.ChannelConfig channelConfig, com.blankj.utilcode.util.Utils.Consumer<androidx.core.app.NotificationCompat.Builder> consumer) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            ((android.app.NotificationManager) com.blankj.utilcode.util.Utils.getApp().getSystemService("notification")).createNotificationChannel(channelConfig.getNotificationChannel());
        }
        androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(com.blankj.utilcode.util.Utils.getApp());
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId(channelConfig.mNotificationChannel.getId());
        }
        if (consumer != null) {
            consumer.accept(builder);
        }
        return builder.build();
    }

    public static void cancel(java.lang.String str, int i) {
        androidx.core.app.NotificationManagerCompat.from(com.blankj.utilcode.util.Utils.getApp()).cancel(str, i);
    }

    public static void cancel(int i) {
        androidx.core.app.NotificationManagerCompat.from(com.blankj.utilcode.util.Utils.getApp()).cancel(i);
    }

    public static void cancelAll() {
        androidx.core.app.NotificationManagerCompat.from(com.blankj.utilcode.util.Utils.getApp()).cancelAll();
    }

    public static void setNotificationBarVisibility(boolean z) {
        java.lang.String str;
        if (z) {
            str = android.os.Build.VERSION.SDK_INT <= 16 ? "expand" : "expandNotificationsPanel";
        } else {
            str = android.os.Build.VERSION.SDK_INT <= 16 ? "collapse" : "collapsePanels";
        }
        invokePanels(str);
    }

    private static void invokePanels(java.lang.String str) {
        try {
            java.lang.Class.forName("android.app.StatusBarManager").getMethod(str, new java.lang.Class[0]).invoke(com.blankj.utilcode.util.Utils.getApp().getSystemService("statusbar"), new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static class ChannelConfig {
        public static final com.blankj.utilcode.util.NotificationUtils.ChannelConfig DEFAULT_CHANNEL_CONFIG = new com.blankj.utilcode.util.NotificationUtils.ChannelConfig(com.blankj.utilcode.util.Utils.getApp().getPackageName(), com.blankj.utilcode.util.Utils.getApp().getPackageName(), 3);
        private android.app.NotificationChannel mNotificationChannel;

        public ChannelConfig(java.lang.String str, java.lang.CharSequence charSequence, int i) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel = new android.app.NotificationChannel(str, charSequence, i);
            }
        }

        public android.app.NotificationChannel getNotificationChannel() {
            return this.mNotificationChannel;
        }

        public com.blankj.utilcode.util.NotificationUtils.ChannelConfig setBypassDnd(boolean z) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setBypassDnd(z);
            }
            return this;
        }

        public com.blankj.utilcode.util.NotificationUtils.ChannelConfig setDescription(java.lang.String str) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setDescription(str);
            }
            return this;
        }

        public com.blankj.utilcode.util.NotificationUtils.ChannelConfig setGroup(java.lang.String str) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setGroup(str);
            }
            return this;
        }

        public com.blankj.utilcode.util.NotificationUtils.ChannelConfig setImportance(int i) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setImportance(i);
            }
            return this;
        }

        public com.blankj.utilcode.util.NotificationUtils.ChannelConfig setLightColor(int i) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setLightColor(i);
            }
            return this;
        }

        public com.blankj.utilcode.util.NotificationUtils.ChannelConfig setLockscreenVisibility(int i) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setLockscreenVisibility(i);
            }
            return this;
        }

        public com.blankj.utilcode.util.NotificationUtils.ChannelConfig setName(java.lang.CharSequence charSequence) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setName(charSequence);
            }
            return this;
        }

        public com.blankj.utilcode.util.NotificationUtils.ChannelConfig setShowBadge(boolean z) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setShowBadge(z);
            }
            return this;
        }

        public com.blankj.utilcode.util.NotificationUtils.ChannelConfig setSound(android.net.Uri uri, android.media.AudioAttributes audioAttributes) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setSound(uri, audioAttributes);
            }
            return this;
        }

        public com.blankj.utilcode.util.NotificationUtils.ChannelConfig setVibrationPattern(long[] jArr) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setVibrationPattern(jArr);
            }
            return this;
        }
    }
}
