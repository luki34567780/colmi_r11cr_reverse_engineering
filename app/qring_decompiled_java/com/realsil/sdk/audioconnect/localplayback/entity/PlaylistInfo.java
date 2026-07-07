package com.realsil.sdk.audioconnect.localplayback.entity;

/* loaded from: /tmp/dex/classes2.dex */
public class PlaylistInfo {
    public int a;
    public java.lang.String b;
    public java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.SongInfo> c;

    public java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.SongInfo> getContainSongList() {
        return this.c;
    }

    public int getContainSongNum() {
        java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.SongInfo> list = this.c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public java.lang.String getPlaylistName() {
        return this.b;
    }

    public int getPlaylistNo() {
        return this.a;
    }

    public void setContainSongList(java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.SongInfo> list) {
        this.c = list;
    }

    public void setPlaylistName(java.lang.String str) {
        this.b = str;
    }

    public void setPlaylistNo(int i) {
        this.a = i;
    }
}
