package com.qcwireless.qcwatch.ui.device.music.vm;

/* compiled from: MyMusicListViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0016\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/vm/MyMusicListViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "musicRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/MusicRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/MusicRepository;)V", "_uiMusicRefresh", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/qcwireless/qcwatch/ui/device/music/bean/Song;", "menuMusicList", "getMenuMusicList", "()Ljava/util/List;", "uiMusicRefresh", "Landroidx/lifecycle/LiveData;", "getUiMusicRefresh", "()Landroidx/lifecycle/LiveData;", "deleteFromMenu", "", "song", "menuId", "", "queryMusicsByMenuId", "removeMenu", "songs", "updateMenuName", "menuName", "", "MusicUi", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MyMusicListViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song>> _uiMusicRefresh;
    private final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> menuMusicList;
    private com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;

    public MyMusicListViewModel(com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicRepository, "musicRepository");
        this.musicRepository = musicRepository;
        this.menuMusicList = new java.util.ArrayList();
        this._uiMusicRefresh = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> getMenuMusicList() {
        return this.menuMusicList;
    }

    public final androidx.lifecycle.LiveData<java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song>> getUiMusicRefresh() {
        return this._uiMusicRefresh;
    }

    public final void queryMusicsByMenuId(final long menuId) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel$queryMusicsByMenuId$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel myMusicListViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myMusicListViewModel, "$this$ktxRunOnBgSingle");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                musicRepository = myMusicListViewModel.musicRepository;
                for (com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity musicToDeviceEntity : musicRepository.queryMusicsByMenusId(menuId)) {
                    com.qcwireless.qcwatch.ui.device.music.bean.Song song = new com.qcwireless.qcwatch.ui.device.music.bean.Song();
                    song.setAlbumId(musicToDeviceEntity.getAlbumId());
                    song.setDuration(musicToDeviceEntity.getDuration());
                    song.setName(musicToDeviceEntity.getMusicName());
                    song.setPath(musicToDeviceEntity.getPath());
                    song.setSinger(musicToDeviceEntity.getSinger());
                    song.setSize(musicToDeviceEntity.getSize());
                    arrayList.add(song);
                }
                mutableLiveData = myMusicListViewModel._uiMusicRefresh;
                mutableLiveData.postValue(arrayList);
            }
        });
    }

    public final void deleteFromMenu(final com.qcwireless.qcwatch.ui.device.music.bean.Song song, final long menuId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(song, "song");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel$deleteFromMenu$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel myMusicListViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myMusicListViewModel, "$this$ktxRunOnBgSingle");
                musicRepository = myMusicListViewModel.musicRepository;
                com.qcwireless.qcwatch.ui.base.repository.entity.MusicToDeviceEntity queryMusicByNameAndId = musicRepository.queryMusicByNameAndId(com.qcwireless.qcwatch.ui.device.music.bean.Song.this.getName());
                if (queryMusicByNameAndId != null) {
                    queryMusicByNameAndId.setSongMenuId(0L);
                    queryMusicByNameAndId.setSongMenuName("");
                    musicRepository2 = myMusicListViewModel.musicRepository;
                    musicRepository2.updateMusic(queryMusicByNameAndId);
                }
                myMusicListViewModel.queryMusicsByMenuId(menuId);
            }
        });
    }

    public final void updateMenuName(final java.lang.String menuName, final long menuId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuName, "menuName");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel$updateMenuName$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel myMusicListViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myMusicListViewModel, "$this$ktxRunOnBgSingle");
                musicRepository = myMusicListViewModel.musicRepository;
                musicRepository.updateMenuName(menuName, menuId);
            }
        });
    }

    public final void removeMenu(final long menuId, final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> songs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(songs, "songs");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel$removeMenu$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MyMusicListViewModel myMusicListViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myMusicListViewModel, "$this$ktxRunOnBgSingle");
                musicRepository = myMusicListViewModel.musicRepository;
                musicRepository.removeMenu(menuId, songs);
            }
        });
    }

    /* compiled from: MyMusicListViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/vm/MyMusicListViewModel$MusicUi;", "", "(Lcom/qcwireless/qcwatch/ui/device/music/vm/MyMusicListViewModel;)V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MusicUi {
        public MusicUi() {
        }
    }
}
