package com.realsil.sdk.audioconnect.localplayback;

/* loaded from: /tmp/dex/classes2.dex */
public final class LocalPlaybackUtil {
    public static boolean checkAudioFormatWhetherSupport(int i, int i2) {
        if (i2 == 0) {
            return true;
        }
        return i2 == 1 ? (i & 1) == 1 : i2 == 2 ? ((i & 2) >> 1) == 1 : i2 == 4 ? ((i & 4) >> 2) == 1 : i2 == 8 && ((i & 8) >> 3) == 1;
    }

    public static java.io.File createNewFile(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            com.realsil.sdk.core.logger.ZLogger.e("create failed, input dir and name can not be null");
            return null;
        }
        java.io.File file = new java.io.File(str, str2);
        if (file.exists()) {
            file.delete();
        }
        try {
            if (file.createNewFile()) {
                return file;
            }
            return null;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.PlaylistInfo> getPlaylistInfoList(java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.SongInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < 16; i++) {
            com.realsil.sdk.audioconnect.localplayback.entity.PlaylistInfo playlistInfo = new com.realsil.sdk.audioconnect.localplayback.entity.PlaylistInfo();
            playlistInfo.setPlaylistNo(i);
            playlistInfo.setContainSongList(new java.util.ArrayList());
            arrayList.add(playlistInfo);
        }
        if (list != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                com.realsil.sdk.audioconnect.localplayback.entity.SongInfo songInfo = list.get(i2);
                if (!songInfo.isDeleted()) {
                    java.util.Iterator<java.lang.Integer> it = songInfo.getRelatePlayList().iterator();
                    while (it.hasNext()) {
                        ((com.realsil.sdk.audioconnect.localplayback.entity.PlaylistInfo) arrayList.get(it.next().intValue())).getContainSongList().add(songInfo);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.SongInfo> getSongInfoList(java.io.File r13, java.io.File r14) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.audioconnect.localplayback.LocalPlaybackUtil.getSongInfoList(java.io.File, java.io.File):java.util.List");
    }

    public static boolean writeContentToFile(java.io.File file, byte[] bArr) {
        if (file == null || bArr == null) {
            com.realsil.sdk.core.logger.ZLogger.e("write failed, input file and content can not be null");
            return false;
        }
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file, true);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
