package com.qcwireless.qcwatch.ui.device.push.bean;

/* loaded from: /tmp/dex/classes2.dex */
public class MusicBean implements java.io.Serializable {
    public java.lang.String album;
    public java.lang.String artistName;
    public java.lang.Long duration;
    public java.lang.Boolean playing;
    public java.lang.Long position;
    public java.lang.String track;

    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        com.qcwireless.qcwatch.ui.device.push.bean.MusicBean musicBean = (com.qcwireless.qcwatch.ui.device.push.bean.MusicBean) o;
        return this.artistName.equals(musicBean.artistName) && this.album.equals(musicBean.album) && this.track.equals(musicBean.track) && this.playing.equals(musicBean.playing);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.artistName, this.album, this.track, this.playing);
    }

    public java.lang.String toString() {
        return "MusicBean{artistName='" + this.artistName + "', album='" + this.album + "', track='" + this.track + "', playing=" + this.playing + ", duration=" + this.duration + ", position=" + this.position + '}';
    }
}
