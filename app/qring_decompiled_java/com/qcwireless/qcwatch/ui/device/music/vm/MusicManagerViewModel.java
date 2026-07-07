package com.qcwireless.qcwatch.ui.device.music.vm;

/* compiled from: MusicManagerViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001LB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u00108\u001a\u0002092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010;\u001a\u00020#2\u0006\u0010<\u001a\u00020\tJ\u0014\u0010=\u001a\u0002092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020$0\u000bJ\u001e\u0010>\u001a\u0002092\u0006\u0010?\u001a\u00020\f2\u0006\u0010;\u001a\u00020#2\u0006\u0010<\u001a\u00020\tJ\u000e\u0010@\u001a\u0002092\u0006\u0010A\u001a\u00020#J\u0014\u0010B\u001a\u0002092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0006\u0010C\u001a\u000209J\u0016\u0010D\u001a\u0002092\u0006\u0010?\u001a\u00020\f2\u0006\u0010E\u001a\u00020\tJ\u0016\u0010F\u001a\u0002092\u0006\u0010?\u001a\u00020\f2\u0006\u0010E\u001a\u00020\tJ\u000e\u0010G\u001a\u0002092\u0006\u0010?\u001a\u00020\fJ\u0006\u0010H\u001a\u00020\tJ\u0006\u0010I\u001a\u000209J\u0006\u0010J\u001a\u000209J\u0006\u0010K\u001a\u000209R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0010R\u00020\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\u00178F¢\u0006\u0006\u001a\u0004\b1\u0010\u0019R\u001d\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00178F¢\u0006\u0006\u001a\u0004\b3\u0010\u0019R\u001d\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u00178F¢\u0006\u0006\u001a\u0004\b5\u0010\u0019R\u001b\u00106\u001a\f\u0012\b\u0012\u00060\u0010R\u00020\u00000\u00178F¢\u0006\u0006\u001a\u0004\b7\u0010\u0019¨\u0006M"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/vm/MusicManagerViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "musicRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/MusicRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/MusicRepository;)V", "_uiAddMenuState", "Landroidx/lifecycle/MutableLiveData;", "", "_uiAddToDeviceRefresh", "", "_uiMusicRefresh", "", "Lcom/qcwireless/qcwatch/ui/device/music/bean/Song;", "_uiRefresh", "Lcom/qcwireless/qcwatch/ui/device/music/bean/MenuSongBean;", "_uiState", "Lcom/qcwireless/qcwatch/ui/device/music/vm/MusicManagerViewModel$MusicUi;", "addList", "getAddList", "()Ljava/util/List;", "setAddList", "(Ljava/util/List;)V", "addMusicState", "Landroidx/lifecycle/LiveData;", "getAddMusicState", "()Landroidx/lifecycle/LiveData;", "blockingQueue", "Lcom/qcwireless/qcwatch/ui/device/music/bean/MusicToDeviceBean;", "getBlockingQueue", "setBlockingQueue", "deviceMusicList", "getDeviceMusicList", "setDeviceMusicList", "deviceMusicMap", "", "", "Lcom/oudmon/ble/base/bluetooth/spp/bean/MySongInfo;", "getDeviceMusicMap", "()Ljava/util/Map;", "setDeviceMusicMap", "(Ljava/util/Map;)V", "menusDialogList", "Lcom/qcwireless/qcwatch/base/dialog/bean/ListDataBean;", "getMenusDialogList", "setMenusDialogList", "menusList", "getMenusList", "setMenusList", "uiAddToDeviceRefresh", "getUiAddToDeviceRefresh", "uiMusicRefresh", "getUiMusicRefresh", "uiRefresh", "getUiRefresh", "uiState", "getUiState", "addMusicToMenus", "", "list", "menuName", "menuId", "addMusics", "addSingleMusicToMenus", "song", "addSongMenu", "name", "deleteMusic", "deleteMusicsByAddress", "deleteSingMusicJieLi", "position", "deleteSingMusicJieLiBle", "deleteSingleMusic", "existsMusic", "queryAddToDevice", "queryAllMenus", "queryAllMusicNoMenus", "MusicUi", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MusicManagerViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _uiAddMenuState;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _uiAddToDeviceRefresh;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song>> _uiMusicRefresh;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean>> _uiRefresh;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel.MusicUi> _uiState;
    private java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> addList;
    private java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.MusicToDeviceBean> blockingQueue;
    private java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> deviceMusicList;
    private java.util.Map<java.lang.String, com.oudmon.ble.base.bluetooth.spp.bean.MySongInfo> deviceMusicMap;
    private java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> menusDialogList;
    private java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean> menusList;
    private com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;

    public MusicManagerViewModel(com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicRepository, "musicRepository");
        this.musicRepository = musicRepository;
        this.menusList = new java.util.ArrayList();
        this.deviceMusicList = new java.util.ArrayList();
        this.addList = new java.util.ArrayList();
        this.menusDialogList = new java.util.ArrayList();
        this.deviceMusicMap = new java.util.LinkedHashMap();
        this.blockingQueue = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._uiAddMenuState = new androidx.lifecycle.MutableLiveData<>();
        this._uiRefresh = new androidx.lifecycle.MutableLiveData<>();
        this._uiMusicRefresh = new androidx.lifecycle.MutableLiveData<>();
        this._uiAddToDeviceRefresh = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean> getMenusList() {
        return this.menusList;
    }

    public final void setMenusList(java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.menusList = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> getDeviceMusicList() {
        return this.deviceMusicList;
    }

    public final void setDeviceMusicList(java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.deviceMusicList = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> getAddList() {
        return this.addList;
    }

    public final void setAddList(java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.addList = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> getMenusDialogList() {
        return this.menusDialogList;
    }

    public final void setMenusDialogList(java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.menusDialogList = list;
    }

    public final java.util.Map<java.lang.String, com.oudmon.ble.base.bluetooth.spp.bean.MySongInfo> getDeviceMusicMap() {
        return this.deviceMusicMap;
    }

    public final void setDeviceMusicMap(java.util.Map<java.lang.String, com.oudmon.ble.base.bluetooth.spp.bean.MySongInfo> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.deviceMusicMap = map;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.MusicToDeviceBean> getBlockingQueue() {
        return this.blockingQueue;
    }

    public final void setBlockingQueue(java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.MusicToDeviceBean> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.blockingQueue = list;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel.MusicUi> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<java.lang.Boolean> getAddMusicState() {
        return this._uiAddMenuState;
    }

    public final androidx.lifecycle.LiveData<java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean>> getUiRefresh() {
        return this._uiRefresh;
    }

    public final androidx.lifecycle.LiveData<java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song>> getUiMusicRefresh() {
        return this._uiMusicRefresh;
    }

    public final androidx.lifecycle.LiveData<java.lang.Integer> getUiAddToDeviceRefresh() {
        return this._uiAddToDeviceRefresh;
    }

    public final void addSongMenu(final java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel$addSongMenu$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel musicManagerViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerViewModel, "$this$ktxRunOnBgSingle");
                com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity songMenuEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp(), name);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, songMenuEntity);
                musicRepository = musicManagerViewModel.musicRepository;
                if (musicRepository.saveMusicMenu(songMenuEntity) > 0) {
                    mutableLiveData2 = musicManagerViewModel._uiAddMenuState;
                    mutableLiveData2.postValue(true);
                } else {
                    mutableLiveData = musicManagerViewModel._uiAddMenuState;
                    mutableLiveData.postValue(false);
                }
            }
        });
    }

    public final void queryAllMenus() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel$queryAllMenus$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel musicManagerViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerViewModel, "$this$ktxRunOnBgSingle");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                musicRepository = musicManagerViewModel.musicRepository;
                for (com.qcwireless.qcwatch.ui.base.repository.entity.SongMenuEntity songMenuEntity : musicRepository.queryAllMenus()) {
                    musicRepository2 = musicManagerViewModel.musicRepository;
                    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity> queryMusicsByMenusId = musicRepository2.queryMusicsByMenusId(songMenuEntity.getMenuId());
                    com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean menuSongBean = new com.qcwireless.qcwatch.ui.device.music.bean.MenuSongBean();
                    menuSongBean.setMenuName(songMenuEntity.getMenuName());
                    menuSongBean.setMenuId((int) songMenuEntity.getMenuId());
                    menuSongBean.setSongCounts(queryMusicsByMenusId.size());
                    arrayList.add(menuSongBean);
                }
                mutableLiveData = musicManagerViewModel._uiRefresh;
                mutableLiveData.postValue(arrayList);
            }
        });
    }

    public final void queryAllMusicNoMenus() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel$queryAllMusicNoMenus$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel musicManagerViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerViewModel, "$this$ktxRunOnBgSingle");
                musicRepository = musicManagerViewModel.musicRepository;
                java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> queryAllMusic = musicRepository.queryAllMusic();
                mutableLiveData = musicManagerViewModel._uiMusicRefresh;
                mutableLiveData.postValue(queryAllMusic);
            }
        });
    }

    public final void queryAddToDevice() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel$queryAddToDevice$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel musicManagerViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerViewModel, "$this$ktxRunOnBgSingle");
                musicRepository = musicManagerViewModel.musicRepository;
                java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> queryAllMusic = musicRepository.queryAllMusic();
                musicManagerViewModel.getBlockingQueue().clear();
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(musicManagerViewModel.getBlockingQueue().size()));
                java.util.Iterator<com.qcwireless.qcwatch.ui.device.music.bean.Song> it = queryAllMusic.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        mutableLiveData = musicManagerViewModel._uiAddToDeviceRefresh;
                        mutableLiveData.postValue(1);
                        return;
                    }
                    com.qcwireless.qcwatch.ui.device.music.bean.Song next = it.next();
                    if (musicManagerViewModel.getDeviceMusicMap().get(next.getName()) == null) {
                        com.qcwireless.qcwatch.ui.device.music.bean.MusicToDeviceBean musicToDeviceBean = new com.qcwireless.qcwatch.ui.device.music.bean.MusicToDeviceBean();
                        if (!(next.getPath().length() == 0)) {
                            musicToDeviceBean.setFilePath(next.getPath());
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, musicToDeviceBean);
                            musicManagerViewModel.getBlockingQueue().add(musicToDeviceBean);
                        }
                    }
                }
            }
        });
    }

    public final void addMusicToMenus(final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list, final java.lang.String menuName, final int menuId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuName, "menuName");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel$addMusicToMenus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel musicManagerViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerViewModel, "$this$ktxRunOnBgSingle");
                for (com.qcwireless.qcwatch.ui.device.music.bean.Song song : list) {
                    musicRepository = musicManagerViewModel.musicRepository;
                    com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity queryMusicByNameAndId = musicRepository.queryMusicByNameAndId(song.getName());
                    if (queryMusicByNameAndId != null) {
                        queryMusicByNameAndId.setSongMenuName(menuName);
                        queryMusicByNameAndId.setSongMenuId(menuId);
                        musicRepository2 = musicManagerViewModel.musicRepository;
                        musicRepository2.updateMusic(queryMusicByNameAndId);
                    }
                }
                musicManagerViewModel.queryAllMusicNoMenus();
            }
        });
    }

    public final void addSingleMusicToMenus(final com.qcwireless.qcwatch.ui.device.music.bean.Song song, final java.lang.String menuName, final int menuId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(song, "song");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuName, "menuName");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel$addSingleMusicToMenus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel musicManagerViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerViewModel, "$this$ktxRunOnBgSingle");
                musicRepository = musicManagerViewModel.musicRepository;
                com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity queryMusicByNameAndId = musicRepository.queryMusicByNameAndId(com.qcwireless.qcwatch.ui.device.music.bean.Song.this.getName());
                if (queryMusicByNameAndId != null) {
                    queryMusicByNameAndId.setSongMenuName(menuName);
                    queryMusicByNameAndId.setSongMenuId(menuId);
                    musicRepository2 = musicManagerViewModel.musicRepository;
                    musicRepository2.updateMusic(queryMusicByNameAndId);
                }
                musicManagerViewModel.queryAllMusicNoMenus();
            }
        });
    }

    public final void deleteMusic(final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel$deleteMusic$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel musicManagerViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerViewModel, "$this$ktxRunOnBgSingle");
                for (com.qcwireless.qcwatch.ui.device.music.bean.Song song : list) {
                    com.oudmon.ble.base.bluetooth.spp.bean.MySongInfo mySongInfo = musicManagerViewModel.getDeviceMusicMap().get(song.getName());
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, mySongInfo);
                    if (mySongInfo != null) {
                        com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().deleteSingleSongFromDevice(mySongInfo.songIndexInFileList, mySongInfo.songNameBuffer);
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, mySongInfo.songIndexInFileList + mySongInfo.songName);
                    }
                    musicRepository = musicManagerViewModel.musicRepository;
                    musicRepository.deleteMusic(song.getName());
                }
                musicManagerViewModel.queryAllMusicNoMenus();
            }
        });
    }

    public final void deleteSingleMusic(final com.qcwireless.qcwatch.ui.device.music.bean.Song song) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(song, "song");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel$deleteSingleMusic$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel musicManagerViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerViewModel, "$this$ktxRunOnBgSingle");
                musicRepository = musicManagerViewModel.musicRepository;
                musicRepository.deleteMusic(com.qcwireless.qcwatch.ui.device.music.bean.Song.this.getName());
                com.oudmon.ble.base.bluetooth.spp.bean.MySongInfo mySongInfo = musicManagerViewModel.getDeviceMusicMap().get(com.qcwireless.qcwatch.ui.device.music.bean.Song.this.getName());
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, mySongInfo);
                if (mySongInfo != null) {
                    com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.getInstance().deleteSingleSongFromDevice(mySongInfo.songIndexInFileList, mySongInfo.songNameBuffer);
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, mySongInfo.songIndexInFileList + '-' + mySongInfo.songName);
                }
                musicManagerViewModel.queryAllMusicNoMenus();
            }
        });
    }

    public final void deleteSingMusicJieLi(com.qcwireless.qcwatch.ui.device.music.bean.Song song, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(song, "song");
        if (!kotlin.text.StringsKt.endsWith$default(song.getName(), com.luck.picture.lib.config.PictureMimeType.MP3, false, 2, (java.lang.Object) null)) {
            com.oudmon.ble.base.bluetooth.spp.jieli.SppHandle.getInstance().deleteMusic(position, song.getName() + com.luck.picture.lib.config.PictureMimeType.MP3);
        } else {
            com.oudmon.ble.base.bluetooth.spp.jieli.SppHandle.getInstance().deleteMusic(position, song.getName());
        }
        com.oudmon.ble.base.bluetooth.spp.jieli.SppHandle.getInstance().deleteMusic(position, song.getName() + com.luck.picture.lib.config.PictureMimeType.MP3);
    }

    public final void deleteSingMusicJieLiBle(com.qcwireless.qcwatch.ui.device.music.bean.Song song, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(song, "song");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, song.getName());
        if (kotlin.text.StringsKt.endsWith$default(song.getName(), com.luck.picture.lib.config.PictureMimeType.MP3, false, 2, (java.lang.Object) null)) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "1");
            com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.getInstance().deleteMusic(position, song.getName());
            return;
        }
        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.getInstance().deleteMusic(position, song.getName() + com.luck.picture.lib.config.PictureMimeType.MP3);
    }

    public final void addMusics(final java.util.List<com.oudmon.ble.base.bluetooth.spp.bean.MySongInfo> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel$addMusics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel musicManagerViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository2;
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerViewModel, "$this$ktxRunOnBgSingle");
                musicManagerViewModel.getDeviceMusicMap().clear();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.oudmon.ble.base.bluetooth.spp.bean.MySongInfo mySongInfo : list) {
                    com.qcwireless.qcwatch.ui.device.music.bean.Song song = new com.qcwireless.qcwatch.ui.device.music.bean.Song();
                    java.lang.String str = mySongInfo.songName;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "item.songName");
                    if ((str.length() > 0) && mySongInfo.songName != null) {
                        try {
                            java.lang.String str2 = mySongInfo.songName;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "item.songName");
                            song.setName(kotlin.text.StringsKt.replace$default(str2, "\u0000", "", false, 4, (java.lang.Object) null));
                            song.setSongIndexInFileList(mySongInfo.songIndexInFileList);
                            byte[] bArr = mySongInfo.songNameBuffer;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArr, "item.songNameBuffer");
                            song.setSongNameBuffer(bArr);
                            java.lang.String headChar = com.qcwireless.qcwatch.ui.device.contact.bean.PinYinStringHelper.getHeadChar(song.getName());
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(headChar, "getHeadChar(song.name)");
                            song.setFirstName(headChar);
                            arrayList.add(song);
                            musicManagerViewModel.getDeviceMusicMap().put(song.getName(), mySongInfo);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }
                musicRepository = musicManagerViewModel.musicRepository;
                java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> queryAllMusic = musicRepository.queryAllMusic();
                final java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (com.qcwireless.qcwatch.ui.device.music.bean.Song song2 : queryAllMusic) {
                    if (musicManagerViewModel.getDeviceMusicMap().get(song2.getName()) == null) {
                        arrayList2.add(song2);
                    }
                }
                if (arrayList2.size() > 0) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(musicManagerViewModel, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel$addMusics$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MusicManagerViewModel musicManagerViewModel2) {
                            com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository4;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerViewModel2, "$this$ktxRunOnBgSingle");
                            for (com.qcwireless.qcwatch.ui.device.music.bean.Song song3 : arrayList2) {
                                musicRepository4 = musicManagerViewModel2.musicRepository;
                                musicRepository4.deleteMusicByName(song3.getName());
                            }
                        }
                    });
                }
                musicRepository2 = musicManagerViewModel.musicRepository;
                musicRepository2.addMusicList(arrayList);
                if (list.size() == 0) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "delete music");
                    musicRepository3 = musicManagerViewModel.musicRepository;
                    musicRepository3.deleteMusicByAddress(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
                }
            }
        });
    }

    public final void deleteMusicsByAddress() {
        this.musicRepository.deleteMusicByAddress(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    public final int existsMusic() {
        return this.musicRepository.queryExistsMusic();
    }

    /* compiled from: MusicManagerViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/vm/MusicManagerViewModel$MusicUi;", "", "(Lcom/qcwireless/qcwatch/ui/device/music/vm/MusicManagerViewModel;)V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MusicUi {
        public MusicUi() {
        }
    }
}
