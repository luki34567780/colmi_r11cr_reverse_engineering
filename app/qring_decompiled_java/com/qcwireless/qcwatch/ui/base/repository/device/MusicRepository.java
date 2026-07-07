package com.qcwireless.qcwatch.ui.base.repository.device;

/* compiled from: MusicRepository.kt */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 I2\u00020\u0001:\u0001IB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0016\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\bJ\u000e\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0012J\u000e\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0012J\u000e\u0010*\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0012J\u000e\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\bJ\u0018\u0010-\u001a\u0004\u0018\u00010\u00122\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0006J\"\u00101\u001a\u0004\u0018\u0001022\u0006\u0010.\u001a\u00020/2\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H\u0002J\f\u00105\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u00106\u001a\b\u0012\u0004\u0012\u00020807J\f\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0006\u0010:\u001a\u00020\bJ\u0010\u0010;\u001a\u0004\u0018\u0001082\u0006\u0010<\u001a\u00020\u0012J\u0010\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010'\u001a\u00020\u0012J\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020>072\u0006\u0010@\u001a\u00020\u0006J\u001c\u0010A\u001a\u00020 2\u0006\u0010@\u001a\u00020\u00062\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u000208J\u0016\u0010E\u001a\u00020 2\u0006\u0010<\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u0006J\u000e\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020>R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006J"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/device/MusicRepository;", "", "()V", "albumArtUri", "Landroid/net/Uri;", "albumId", "", "duration", "", com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID, "list", "", "Lcom/qcwireless/qcwatch/ui/device/music/bean/Song;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "name", "", "path", "qcMusicManagerDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcMusicManagerDao;", "qcMusicMenuDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcMusicMenuDao;", "singer", "size", "song", "getSong", "()Lcom/qcwireless/qcwatch/ui/device/music/bean/Song;", "setSong", "(Lcom/qcwireless/qcwatch/ui/device/music/bean/Song;)V", "addMusicList", "", "data", "computeSampleSize", "options", "Landroid/graphics/BitmapFactory$Options;", "target", "deleteMusic", "musicName", "deleteMusicByAddress", "address", "deleteMusicByName", "formatTime", "time", "getAlbumArt", "context", "Landroid/content/Context;", "album_id", "getArtworkFromFile", "Landroid/graphics/Bitmap;", "songid", "albumid", "getMusic", "queryAllMenus", "", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/SongMenuEntity;", "queryAllMusic", "queryExistsMusic", "queryMenByName", "menuName", "queryMusicByNameAndId", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/MusicToDeviceEntity;", "queryMusicsByMenusId", "menusId", "removeMenu", "songs", "saveMusicMenu", "musicMenu", "updateMenuName", "menuId", "updateMusic", "entity", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MusicRepository {
    private final android.net.Uri albumArtUri;
    private long albumId;
    private int duration;
    private long id;
    private long size;
    private com.qcwireless.qcwatch.ui.device.music.bean.Song song;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository.Companion(null);
    private static java.util.List<java.lang.String> songName = new java.util.ArrayList();
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository m532invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicManagerDao qcMusicManagerDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcMusicManagerDao();
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcMusicMenuDao qcMusicMenuDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcMusicMenuDao();
    private java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list = new java.util.ArrayList();
    private java.lang.String name = "";
    private java.lang.String singer = "";
    private java.lang.String path = "";

    public MusicRepository() {
        android.net.Uri parse = android.net.Uri.parse("content://media/external/audio/albumart");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(\"content://media/external/audio/albumart\")");
        this.albumArtUri = parse;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> getList() {
        return this.list;
    }

    public final void setList(java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list = list;
    }

    public final com.qcwireless.qcwatch.ui.device.music.bean.Song getSong() {
        return this.song;
    }

    public final void setSong(com.qcwireless.qcwatch.ui.device.music.bean.Song song) {
        this.song = song;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> getMusic() {
        try {
            this.list.clear();
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, songName);
            java.util.Iterator<java.lang.String> it = songName.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringBuffer.toString(), "stringBuffer.toString()");
            android.database.Cursor query = com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getContentResolver().query(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, null, null, null, "title_key");
            if (query != null) {
                while (query.moveToNext()) {
                    this.song = new com.qcwireless.qcwatch.ui.device.music.bean.Song();
                    this.name = query.getString(query.getColumnIndexOrThrow("_display_name"));
                    this.id = query.getLong(query.getColumnIndexOrThrow("_id"));
                    java.lang.String string = query.getString(query.getColumnIndexOrThrow("_data"));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…aStore.Audio.Media.DATA))");
                    this.path = string;
                    this.duration = query.getInt(query.getColumnIndexOrThrow("duration"));
                    this.size = query.getLong(query.getColumnIndexOrThrow("_size"));
                    this.albumId = query.getLong(query.getColumnIndexOrThrow("album_id"));
                    com.qcwireless.qcwatch.ui.device.music.bean.Song song = this.song;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(song);
                    song.setSinger("");
                    com.qcwireless.qcwatch.ui.device.music.bean.Song song2 = this.song;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(song2);
                    song2.setPath(this.path);
                    com.qcwireless.qcwatch.ui.device.music.bean.Song song3 = this.song;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(song3);
                    song3.setDuration(this.duration);
                    com.qcwireless.qcwatch.ui.device.music.bean.Song song4 = this.song;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(song4);
                    song4.setSize(this.size);
                    com.qcwireless.qcwatch.ui.device.music.bean.Song song5 = this.song;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(song5);
                    song5.setAlbumId(this.albumId);
                    com.qcwireless.qcwatch.ui.device.music.bean.Song song6 = this.song;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(song6);
                    song6.setName(java.lang.String.valueOf(this.name));
                    boolean z = true;
                    if (!(java.lang.String.valueOf(this.name).length() == 0)) {
                        com.qcwireless.qcwatch.ui.device.music.bean.Song song7 = this.song;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(song7);
                        if (kotlin.text.StringsKt.endsWith$default(song7.getName(), com.luck.picture.lib.config.PictureMimeType.MP3, false, 2, (java.lang.Object) null)) {
                            com.qcwireless.qcwatch.ui.device.music.bean.Song song8 = this.song;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(song8);
                            java.lang.String name = song8.getName();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(this.song);
                            java.lang.String substring = name.substring(0, r7.getName().length() - 4);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            java.lang.String replace$default = kotlin.text.StringsKt.replace$default(substring, " ", "", false, 4, (java.lang.Object) null);
                            if (replace$default.length() > 15) {
                                replace$default = replace$default.substring(0, 15);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(replace$default, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            com.qcwireless.qcwatch.ui.device.music.bean.Song song9 = this.song;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(song9);
                            song9.setName(replace$default + com.luck.picture.lib.config.PictureMimeType.MP3);
                            com.qcwireless.qcwatch.ui.device.music.bean.Song song10 = this.song;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(song10);
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, song10.getName());
                            com.qcwireless.qcwatch.ui.device.music.bean.Song song11 = this.song;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(song11);
                            if (song11.getPath().length() != 0) {
                                z = false;
                            }
                            if (!z) {
                                com.qcwireless.qcwatch.ui.device.music.bean.Song song12 = this.song;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(song12);
                                com.qcwireless.qcwatch.ui.device.music.bean.Song song13 = this.song;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(song13);
                                java.lang.String headChar = com.qcwireless.qcwatch.ui.device.contact.bean.PinYinStringHelper.getHeadChar(kotlin.text.StringsKt.replace$default(song13.getName(), " ", "", false, 4, (java.lang.Object) null));
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(headChar, "getHeadChar(song!!.name.replace(\" \", \"\"))");
                                song12.setFirstName(headChar);
                                com.qcwireless.qcwatch.ui.device.music.bean.Song song14 = this.song;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(song14);
                                if (!com.qcwireless.qcwatch.ui.device.contact.bean.PinYinStringHelper.isLetter(song14.getFirstName())) {
                                    com.qcwireless.qcwatch.ui.device.music.bean.Song song15 = this.song;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(song15);
                                    song15.setFirstName("#");
                                }
                                com.qcwireless.qcwatch.ui.device.music.bean.Song song16 = this.song;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(song16);
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, song16.getName());
                                com.qcwireless.qcwatch.ui.device.music.bean.Song song17 = this.song;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(song17);
                                if (queryMusicByNameAndId(song17.getName()) == null) {
                                    java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list = this.list;
                                    com.qcwireless.qcwatch.ui.device.music.bean.Song song18 = this.song;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(song18);
                                    list.add(song18);
                                }
                            }
                        }
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        java.util.Collections.sort(this.list, new com.qcwireless.qcwatch.ui.device.music.bean.MusicSortComparator());
        return this.list;
    }

    public final java.lang.String formatTime(int time) {
        int i = time / 1000;
        int i2 = i % 60;
        if (i2 < 10) {
            return (i / 60) + ":0" + i2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i / 60);
        sb.append(':');
        sb.append(i2);
        return sb.toString();
    }

    private final android.graphics.Bitmap getArtworkFromFile(android.content.Context context, long songid, long albumid) {
        java.io.FileDescriptor fileDescriptor;
        if (albumid < 0 && songid < 0) {
            throw new java.lang.IllegalArgumentException("Must specify an album or a song id");
        }
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            if (albumid < 0) {
                android.net.Uri parse = android.net.Uri.parse("content://media/external/audio/media/" + songid + "/albumart");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(\n                 …bumart\"\n                )");
                android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(parse, "r");
                if (openFileDescriptor != null) {
                    fileDescriptor = openFileDescriptor.getFileDescriptor();
                    options.inSampleSize = 1;
                    options.inJustDecodeBounds = true;
                    android.graphics.BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    options.inSampleSize = 100;
                    options.inJustDecodeBounds = false;
                    options.inDither = false;
                    options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                    return android.graphics.BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                }
                fileDescriptor = null;
                options.inSampleSize = 1;
                options.inJustDecodeBounds = true;
                android.graphics.BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                options.inSampleSize = 100;
                options.inJustDecodeBounds = false;
                options.inDither = false;
                options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                return android.graphics.BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            }
            android.net.Uri withAppendedId = android.content.ContentUris.withAppendedId(this.albumArtUri, albumid);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(withAppendedId, "withAppendedId(albumArtUri, albumid)");
            android.os.ParcelFileDescriptor openFileDescriptor2 = context.getContentResolver().openFileDescriptor(withAppendedId, "r");
            if (openFileDescriptor2 != null) {
                fileDescriptor = openFileDescriptor2.getFileDescriptor();
                options.inSampleSize = 1;
                options.inJustDecodeBounds = true;
                android.graphics.BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                options.inSampleSize = 100;
                options.inJustDecodeBounds = false;
                options.inDither = false;
                options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                return android.graphics.BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            }
            fileDescriptor = null;
            options.inSampleSize = 1;
            options.inJustDecodeBounds = true;
            android.graphics.BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            options.inSampleSize = 100;
            options.inJustDecodeBounds = false;
            options.inDither = false;
            options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
            return android.graphics.BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final int computeSampleSize(android.graphics.BitmapFactory.Options options, int target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        int i = options.outWidth;
        int i2 = options.outHeight;
        int max = java.lang.Math.max(i / target, i2 / target);
        if (max == 0) {
            return 1;
        }
        if (max > 1 && i > target && i / max < target) {
            max--;
        }
        return (max <= 1 || i2 <= target || i2 / max >= target) ? max : max - 1;
    }

    public final java.lang.String getAlbumArt(android.content.Context context, long album_id) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://media/external/audio/albums/" + album_id), new java.lang.String[]{"album_art"}, null, null, null);
        if (query == null || query.getCount() <= 0 || query.getColumnCount() <= 0) {
            str = null;
        } else {
            query.moveToNext();
            str = query.getString(0);
        }
        if (query != null) {
            query.close();
        }
        if (str != null) {
            return str;
        }
        return null;
    }

    public final int saveMusicMenu(com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity musicMenu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicMenu, "musicMenu");
        if (queryMenByName(musicMenu.getMenuName()) != null) {
            return -1;
        }
        this.qcMusicMenuDao.insert(musicMenu);
        return 1;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity queryMenByName(java.lang.String menuName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuName, "menuName");
        return this.qcMusicMenuDao.queryMusicMenuByMenuName(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), menuName);
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity> queryAllMenus() {
        return this.qcMusicMenuDao.queryMenusList(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity> queryMusicsByMenusId(long menusId) {
        return this.qcMusicManagerDao.queryMusicsByMenuId(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), menusId);
    }

    public final void addMusicList(java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        for (com.qcwireless.qcwatch.ui.device.music.bean.Song song : data) {
            com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity musicToDeviceEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), song.getName(), song.getSinger(), song.getSize(), song.getDuration(), song.getPath(), song.getAlbumId(), "", 0L);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, musicToDeviceEntity);
            this.qcMusicManagerDao.insert(musicToDeviceEntity);
        }
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.FinishMusicAddFirstEvent());
    }

    public final void updateMusic(com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        this.qcMusicManagerDao.insert(entity);
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> queryAllMusic() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity musicToDeviceEntity : this.qcMusicManagerDao.queryAllMusicNoMenuId(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear())) {
            com.qcwireless.qcwatch.ui.device.music.bean.Song song = new com.qcwireless.qcwatch.ui.device.music.bean.Song();
            song.setSize(musicToDeviceEntity.getSize());
            song.setName(musicToDeviceEntity.getMusicName());
            song.setSinger(musicToDeviceEntity.getSinger());
            song.setDuration(musicToDeviceEntity.getDuration());
            song.setPath(musicToDeviceEntity.getPath());
            song.setAlbumId(musicToDeviceEntity.getAlbumId());
            song.setSelect(false);
            arrayList.add(song);
        }
        return arrayList;
    }

    public final int queryExistsMusic() {
        return this.qcMusicManagerDao.queryAll(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear()).size();
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity queryMusicByNameAndId(java.lang.String musicName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicName, "musicName");
        return this.qcMusicManagerDao.queryMusicByName(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), musicName);
    }

    public final void deleteMusic(java.lang.String musicName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicName, "musicName");
        com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity queryMusicByNameAndId = queryMusicByNameAndId(musicName);
        if (queryMusicByNameAndId != null) {
            this.qcMusicManagerDao.delete(queryMusicByNameAndId);
        }
    }

    public final void deleteMusicByAddress(java.lang.String address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
        this.qcMusicManagerDao.deleteMusics(address);
    }

    public final void updateMenuName(java.lang.String menuName, long menuId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuName, "menuName");
        this.qcMusicMenuDao.updateMenuName(menuName, menuId);
        this.qcMusicManagerDao.updateMenuName(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), menuName, menuId);
    }

    public final void removeMenu(long menusId, java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> songs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(songs, "songs");
        this.qcMusicMenuDao.deleteMenu(menusId);
        java.util.Iterator<com.qcwireless.qcwatch.ui.device.music.bean.Song> it = songs.iterator();
        while (it.hasNext()) {
            this.qcMusicManagerDao.updateMusicMenu(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), it.next().getName(), "");
        }
    }

    public final void deleteMusicByName(java.lang.String musicName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicName, "musicName");
        this.qcMusicManagerDao.deleteByMusicName(musicName);
    }

    /* compiled from: MusicRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/device/MusicRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/device/MusicRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/device/MusicRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "songName", "", "", "getSongName", "()Ljava/util/List;", "setSongName", "(Ljava/util/List;)V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.util.List<java.lang.String> getSongName() {
            return com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository.songName;
        }

        public final void setSongName(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository.songName = list;
        }

        public final com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository) com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository.getInstance$delegate.getValue();
        }
    }
}
