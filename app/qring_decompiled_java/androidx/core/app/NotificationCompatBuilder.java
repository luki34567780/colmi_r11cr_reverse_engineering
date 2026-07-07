package androidx.core.app;

/* loaded from: classes.dex */
class NotificationCompatBuilder implements androidx.core.app.NotificationBuilderWithBuilderAccessor {
    private android.widget.RemoteViews mBigContentView;
    private final android.app.Notification.Builder mBuilder;
    private final androidx.core.app.NotificationCompat.Builder mBuilderCompat;
    private android.widget.RemoteViews mContentView;
    private final android.content.Context mContext;
    private int mGroupAlertBehavior;
    private android.widget.RemoteViews mHeadsUpContentView;
    private final java.util.List<android.os.Bundle> mActionExtrasList = new java.util.ArrayList();
    private final android.os.Bundle mExtras = new android.os.Bundle();

    NotificationCompatBuilder(androidx.core.app.NotificationCompat.Builder builder) {
        java.util.List list;
        java.util.List<java.lang.String> combineLists;
        this.mBuilderCompat = builder;
        this.mContext = builder.mContext;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mBuilder = new android.app.Notification.Builder(builder.mContext, builder.mChannelId);
        } else {
            this.mBuilder = new android.app.Notification.Builder(builder.mContext);
        }
        android.app.Notification notification = builder.mNotification;
        this.mBuilder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(builder.mFullScreenIntent, (notification.flags & 128) != 0).setLargeIcon(builder.mLargeIcon).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        if (android.os.Build.VERSION.SDK_INT < 21) {
            this.mBuilder.setSound(notification.sound, notification.audioStreamType);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            this.mBuilder.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
            java.util.Iterator<androidx.core.app.NotificationCompat.Action> it = builder.mActions.iterator();
            while (it.hasNext()) {
                addAction(it.next());
            }
            if (builder.mExtras != null) {
                this.mExtras.putAll(builder.mExtras);
            }
            if (android.os.Build.VERSION.SDK_INT < 20) {
                if (builder.mLocalOnly) {
                    this.mExtras.putBoolean(androidx.core.app.NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
                }
                if (builder.mGroupKey != null) {
                    this.mExtras.putString(androidx.core.app.NotificationCompatExtras.EXTRA_GROUP_KEY, builder.mGroupKey);
                    if (builder.mGroupSummary) {
                        this.mExtras.putBoolean(androidx.core.app.NotificationCompatExtras.EXTRA_GROUP_SUMMARY, true);
                    } else {
                        this.mExtras.putBoolean(androidx.core.app.NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL, true);
                    }
                }
                if (builder.mSortKey != null) {
                    this.mExtras.putString(androidx.core.app.NotificationCompatExtras.EXTRA_SORT_KEY, builder.mSortKey);
                }
            }
            this.mContentView = builder.mContentView;
            this.mBigContentView = builder.mBigContentView;
        }
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            this.mBuilder.setShowWhen(builder.mShowWhen);
        }
        if (android.os.Build.VERSION.SDK_INT >= 19 && android.os.Build.VERSION.SDK_INT < 21 && (combineLists = combineLists(getPeople(builder.mPersonList), builder.mPeople)) != null && !combineLists.isEmpty()) {
            this.mExtras.putStringArray(androidx.core.app.NotificationCompat.EXTRA_PEOPLE, (java.lang.String[]) combineLists.toArray(new java.lang.String[combineLists.size()]));
        }
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            this.mBuilder.setLocalOnly(builder.mLocalOnly).setGroup(builder.mGroupKey).setGroupSummary(builder.mGroupSummary).setSortKey(builder.mSortKey);
            this.mGroupAlertBehavior = builder.mGroupAlertBehavior;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.mBuilder.setCategory(builder.mCategory).setColor(builder.mColor).setVisibility(builder.mVisibility).setPublicVersion(builder.mPublicVersion).setSound(notification.sound, notification.audioAttributes);
            if (android.os.Build.VERSION.SDK_INT < 28) {
                list = combineLists(getPeople(builder.mPersonList), builder.mPeople);
            } else {
                list = builder.mPeople;
            }
            if (list != null && !list.isEmpty()) {
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    this.mBuilder.addPerson((java.lang.String) it2.next());
                }
            }
            this.mHeadsUpContentView = builder.mHeadsUpContentView;
            if (builder.mInvisibleActions.size() > 0) {
                android.os.Bundle bundle = builder.getExtras().getBundle("android.car.EXTENSIONS");
                bundle = bundle == null ? new android.os.Bundle() : bundle;
                android.os.Bundle bundle2 = new android.os.Bundle(bundle);
                android.os.Bundle bundle3 = new android.os.Bundle();
                for (int i = 0; i < builder.mInvisibleActions.size(); i++) {
                    bundle3.putBundle(java.lang.Integer.toString(i), androidx.core.app.NotificationCompatJellybean.getBundleForAction(builder.mInvisibleActions.get(i)));
                }
                bundle.putBundle("invisible_actions", bundle3);
                bundle2.putBundle("invisible_actions", bundle3);
                builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
                this.mExtras.putBundle("android.car.EXTENSIONS", bundle2);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 23 && builder.mSmallIcon != null) {
            this.mBuilder.setSmallIcon(builder.mSmallIcon);
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            this.mBuilder.setExtras(builder.mExtras).setRemoteInputHistory(builder.mRemoteInputHistory);
            if (builder.mContentView != null) {
                this.mBuilder.setCustomContentView(builder.mContentView);
            }
            if (builder.mBigContentView != null) {
                this.mBuilder.setCustomBigContentView(builder.mBigContentView);
            }
            if (builder.mHeadsUpContentView != null) {
                this.mBuilder.setCustomHeadsUpContentView(builder.mHeadsUpContentView);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mBuilder.setBadgeIconType(builder.mBadgeIcon).setSettingsText(builder.mSettingsText).setShortcutId(builder.mShortcutId).setTimeoutAfter(builder.mTimeout).setGroupAlertBehavior(builder.mGroupAlertBehavior);
            if (builder.mColorizedSet) {
                this.mBuilder.setColorized(builder.mColorized);
            }
            if (!android.text.TextUtils.isEmpty(builder.mChannelId)) {
                this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            java.util.Iterator<androidx.core.app.Person> it3 = builder.mPersonList.iterator();
            while (it3.hasNext()) {
                this.mBuilder.addPerson(it3.next().toAndroidPerson());
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.mBuilder.setAllowSystemGeneratedContextualActions(builder.mAllowSystemGeneratedContextualActions);
            this.mBuilder.setBubbleMetadata(androidx.core.app.NotificationCompat.BubbleMetadata.toPlatform(builder.mBubbleMetadata));
            if (builder.mLocusId != null) {
                this.mBuilder.setLocusId(builder.mLocusId.toLocusId());
            }
        }
        if (androidx.core.os.BuildCompat.isAtLeastS() && builder.mFgsDeferBehavior != 0) {
            this.mBuilder.setForegroundServiceBehavior(builder.mFgsDeferBehavior);
        }
        if (builder.mSilent) {
            if (this.mBuilderCompat.mGroupSummary) {
                this.mGroupAlertBehavior = 2;
            } else {
                this.mGroupAlertBehavior = 1;
            }
            this.mBuilder.setVibrate(null);
            this.mBuilder.setSound(null);
            notification.defaults &= -2;
            notification.defaults &= -3;
            this.mBuilder.setDefaults(notification.defaults);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                if (android.text.TextUtils.isEmpty(this.mBuilderCompat.mGroupKey)) {
                    this.mBuilder.setGroup(androidx.core.app.NotificationCompat.GROUP_KEY_SILENT);
                }
                this.mBuilder.setGroupAlertBehavior(this.mGroupAlertBehavior);
            }
        }
    }

    private static java.util.List<java.lang.String> combineLists(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.ArraySet arraySet = new androidx.collection.ArraySet(list.size() + list2.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new java.util.ArrayList(arraySet);
    }

    private static java.util.List<java.lang.String> getPeople(java.util.List<androidx.core.app.Person> list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<androidx.core.app.Person> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().resolveToLegacyUri());
        }
        return arrayList;
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public android.app.Notification.Builder getBuilder() {
        return this.mBuilder;
    }

    android.content.Context getContext() {
        return this.mContext;
    }

    public android.app.Notification build() {
        android.os.Bundle extras;
        android.widget.RemoteViews makeHeadsUpContentView;
        android.widget.RemoteViews makeBigContentView;
        androidx.core.app.NotificationCompat.Style style = this.mBuilderCompat.mStyle;
        if (style != null) {
            style.apply(this);
        }
        android.widget.RemoteViews makeContentView = style != null ? style.makeContentView(this) : null;
        android.app.Notification buildInternal = buildInternal();
        if (makeContentView != null) {
            buildInternal.contentView = makeContentView;
        } else if (this.mBuilderCompat.mContentView != null) {
            buildInternal.contentView = this.mBuilderCompat.mContentView;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16 && style != null && (makeBigContentView = style.makeBigContentView(this)) != null) {
            buildInternal.bigContentView = makeBigContentView;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21 && style != null && (makeHeadsUpContentView = this.mBuilderCompat.mStyle.makeHeadsUpContentView(this)) != null) {
            buildInternal.headsUpContentView = makeHeadsUpContentView;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16 && style != null && (extras = androidx.core.app.NotificationCompat.getExtras(buildInternal)) != null) {
            style.addCompatExtras(extras);
        }
        return buildInternal;
    }

    private void addAction(androidx.core.app.NotificationCompat.Action action) {
        android.app.Notification.Action.Builder builder;
        android.os.Bundle bundle;
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            androidx.core.graphics.drawable.IconCompat iconCompat = action.getIconCompat();
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                builder = new android.app.Notification.Action.Builder(iconCompat != null ? iconCompat.toIcon() : null, action.getTitle(), action.getActionIntent());
            } else {
                builder = new android.app.Notification.Action.Builder(iconCompat != null ? iconCompat.getResId() : 0, action.getTitle(), action.getActionIntent());
            }
            if (action.getRemoteInputs() != null) {
                for (android.app.RemoteInput remoteInput : androidx.core.app.RemoteInput.fromCompat(action.getRemoteInputs())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            if (action.getExtras() != null) {
                bundle = new android.os.Bundle(action.getExtras());
            } else {
                bundle = new android.os.Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
            }
            bundle.putInt("android.support.action.semanticAction", action.getSemanticAction());
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(action.getSemanticAction());
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                builder.setContextual(action.isContextual());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
            builder.addExtras(bundle);
            this.mBuilder.addAction(builder.build());
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            this.mActionExtrasList.add(androidx.core.app.NotificationCompatJellybean.writeActionAndGetExtras(this.mBuilder, action));
        }
    }

    protected android.app.Notification buildInternal() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return this.mBuilder.build();
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            android.app.Notification build = this.mBuilder.build();
            if (this.mGroupAlertBehavior != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                    removeSoundAndVibration(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(build);
                }
            }
            return build;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.mBuilder.setExtras(this.mExtras);
            android.app.Notification build2 = this.mBuilder.build();
            android.widget.RemoteViews remoteViews = this.mContentView;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            android.widget.RemoteViews remoteViews2 = this.mBigContentView;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            android.widget.RemoteViews remoteViews3 = this.mHeadsUpContentView;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.mGroupAlertBehavior != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                    removeSoundAndVibration(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(build2);
                }
            }
            return build2;
        }
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            this.mBuilder.setExtras(this.mExtras);
            android.app.Notification build3 = this.mBuilder.build();
            android.widget.RemoteViews remoteViews4 = this.mContentView;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            android.widget.RemoteViews remoteViews5 = this.mBigContentView;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.mGroupAlertBehavior != 0) {
                if (build3.getGroup() != null && (build3.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                    removeSoundAndVibration(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(build3);
                }
            }
            return build3;
        }
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            android.util.SparseArray<android.os.Bundle> buildActionExtrasMap = androidx.core.app.NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if (buildActionExtrasMap != null) {
                this.mExtras.putSparseParcelableArray(androidx.core.app.NotificationCompatExtras.EXTRA_ACTION_EXTRAS, buildActionExtrasMap);
            }
            this.mBuilder.setExtras(this.mExtras);
            android.app.Notification build4 = this.mBuilder.build();
            android.widget.RemoteViews remoteViews6 = this.mContentView;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            android.widget.RemoteViews remoteViews7 = this.mBigContentView;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            android.app.Notification build5 = this.mBuilder.build();
            android.os.Bundle extras = androidx.core.app.NotificationCompat.getExtras(build5);
            android.os.Bundle bundle = new android.os.Bundle(this.mExtras);
            for (java.lang.String str : this.mExtras.keySet()) {
                if (extras.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            extras.putAll(bundle);
            android.util.SparseArray<android.os.Bundle> buildActionExtrasMap2 = androidx.core.app.NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if (buildActionExtrasMap2 != null) {
                androidx.core.app.NotificationCompat.getExtras(build5).putSparseParcelableArray(androidx.core.app.NotificationCompatExtras.EXTRA_ACTION_EXTRAS, buildActionExtrasMap2);
            }
            android.widget.RemoteViews remoteViews8 = this.mContentView;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            android.widget.RemoteViews remoteViews9 = this.mBigContentView;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
        return this.mBuilder.getNotification();
    }

    private void removeSoundAndVibration(android.app.Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
