package com.qcwireless.qcwatch.ui.device.music.vm;

import com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel.MusicUi;

/* compiled from: MusicSelectViewModel.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0006\u0010\u001c\u001a\u00020\u001aR\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001b\u0010\u0015\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\u00000\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/vm/MusicSelectViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "musicRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/MusicRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/MusicRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/device/music/vm/MusicSelectViewModel$MusicUi;", "addList", "", "Lcom/qcwireless/qcwatch/ui/device/music/bean/Song;", "getAddList", "()Ljava/util/List;", "setAddList", "(Ljava/util/List;)V", "songList", "getSongList", "setSongList", "songListBackUp", "getSongListBackUp", "setSongListBackUp", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "addMusics", "", "list", "selectMusic", "MusicUi", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MusicSelectViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel.MusicUi> _uiState;
    private java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> addList;
    private com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
    private java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> songList;
    private java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> songListBackUp;

    public MusicSelectViewModel(com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicRepository, "musicRepository");
        this.musicRepository = musicRepository;
        this.songList = new java.util.ArrayList();
        this.songListBackUp = new java.util.ArrayList();
        this.addList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> getSongList() {
        return this.songList;
    }

    public final void setSongList(java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.songList = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> getSongListBackUp() {
        return this.songListBackUp;
    }

    public final void setSongListBackUp(java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.songListBackUp = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> getAddList() {
        return this.addList;
    }

    public final void setAddList(java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.addList = list;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel.MusicUi> getUiState() {
        return this._uiState;
    }

    public final void selectMusic() {
        try {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel$selectMusic$1
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel musicSelectViewModel) {
                    com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                    androidx.lifecycle.MutableLiveData mutableLiveData;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicSelectViewModel, "$this$ktxRunOnBgSingle");
                    musicRepository = musicSelectViewModel.musicRepository;
                    java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> music = musicRepository.getMusic();
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(music.size()));
                    com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel.MusicUi musicUi = musicSelectViewModel.new MusicUi();
                    musicUi.setList(music);
                    mutableLiveData = musicSelectViewModel._uiState;
                    mutableLiveData.postValue(musicUi);
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    public final void addMusics(final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel$addMusics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.music.vm.MusicSelectViewModel musicSelectViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MusicRepository musicRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicSelectViewModel, "$this$ktxRunOnBgSingle");
                musicRepository = musicSelectViewModel.musicRepository;
                musicRepository.addMusicList(list);
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.FinishMusicAddFirstEvent());
            }
        });
    }

    /* compiled from: MusicSelectViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/vm/MusicSelectViewModel$MusicUi;", "", "(Lcom/qcwireless/qcwatch/ui/device/music/vm/MusicSelectViewModel;)V", "list", "", "Lcom/qcwireless/qcwatch/ui/device/music/bean/Song;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MusicUi {
        private java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list = new java.util.ArrayList();

        public MusicUi() {
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> getList() {
            return this.list;
        }

        public final void setList(java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.list = list;
        }
    }
}
