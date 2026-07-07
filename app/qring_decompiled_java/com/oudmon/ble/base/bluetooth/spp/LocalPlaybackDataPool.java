package com.oudmon.ble.base.bluetooth.spp;

/* loaded from: /tmp/dex/classes2.dex */
public class LocalPlaybackDataPool {
    private static volatile com.oudmon.ble.base.bluetooth.spp.LocalPlaybackDataPool sInstance;
    private java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.PlaylistInfo> mPlaylistInfoList;
    private java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.SongInfo> mSongInfoList;
    private boolean mWhetherNeedToUpdatePlaylist = true;

    private LocalPlaybackDataPool() {
    }

    public static com.oudmon.ble.base.bluetooth.spp.LocalPlaybackDataPool getInstance() {
        if (sInstance == null) {
            synchronized (com.oudmon.ble.base.bluetooth.spp.LocalPlaybackDataPool.class) {
                if (sInstance == null) {
                    sInstance = new com.oudmon.ble.base.bluetooth.spp.LocalPlaybackDataPool();
                }
            }
        }
        return sInstance;
    }

    public synchronized void setSongInfoList(java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.SongInfo> list) {
        this.mSongInfoList = list;
    }

    public java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.SongInfo> getSongInfoList() {
        return this.mSongInfoList;
    }

    public java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.PlaylistInfo> getPlaylistInfoList() {
        return this.mPlaylistInfoList;
    }

    public synchronized void setPlaylistInfoList(java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.PlaylistInfo> list) {
        this.mPlaylistInfoList = list;
    }

    public boolean isWhetherNeedToUpdatePlaylist() {
        return this.mWhetherNeedToUpdatePlaylist;
    }

    public synchronized void setWhetherNeedToUpdatePlaylist(boolean z) {
        this.mWhetherNeedToUpdatePlaylist = z;
    }

    public synchronized void clear() {
        java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.SongInfo> list = this.mSongInfoList;
        if (list != null) {
            list.clear();
            this.mSongInfoList = null;
        }
        java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.PlaylistInfo> list2 = this.mPlaylistInfoList;
        if (list2 != null) {
            list2.clear();
            this.mPlaylistInfoList = null;
        }
    }
}
