package com.oudmon.ble.base.bluetooth.spp;

/* loaded from: /tmp/dex/classes2.dex */
public class RtkMusicSpp {
    private static com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp rtkMusicSpp;
    com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback mLocalPlaybackModelCallback = new com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback() { // from class: com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.2
        @Override // com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback
        public void onGetFileHeaderReport(int i, long j) {
            if (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback != null) {
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback.onGetFileHeaderReport(i, j);
            }
        }

        @Override // com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback
        public void onGetFileContentReport(int i, byte[] bArr) {
            if (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback != null) {
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback.onGetFileContentReport(i, bArr);
            }
        }

        @Override // com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback
        public void onGetFileFooterReport(int i, byte[] bArr) {
            if (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback != null) {
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback.onGetFileFooterReport(i, bArr);
            }
        }

        @Override // com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback
        public void onAddOrDeleteSongToPlaylistReport(int i) {
            if (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback != null) {
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback.onAddOrDeleteSongToPlaylistReport(i);
            }
        }

        @Override // com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback
        public void onDeleteSingleSongReport(int i) {
            if (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback != null) {
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback.onDeleteSingleSongReport(i);
            }
        }

        @Override // com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback
        public void onDeleteAllSongReport(int i) {
            if (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback != null) {
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback.onDeleteAllSongReport(i);
            }
        }

        @Override // com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback
        public void onGetDeviceInfoReport(android.os.Bundle bundle) {
            if (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback != null) {
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback.onGetDeviceInfoReport(bundle);
            }
        }

        @Override // com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback
        public void onEnterSongTransferModeReport(boolean z) {
            if (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback != null) {
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback.onEnterSongTransferModeReport(z);
            }
        }

        @Override // com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback
        public void onExitSongTransferModeReport(boolean z) {
            if (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback != null) {
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback.onExitSongTransferModeReport(z);
            }
        }

        @Override // com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback
        public void onCancelTransferReport(boolean z) {
            if (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback != null) {
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback.onCancelTransferReport(z);
            }
        }

        @Override // com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback
        public void onWriteSuccessReport(int i) {
            if (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback != null) {
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback.onWriteSuccessReport(i);
            }
        }

        @Override // com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback
        public void onWriteFailedReport() {
            if (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback != null) {
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback.onWriteFailedReport();
            }
        }

        @Override // com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback
        public void onTransferWasValidReport(int i) {
            if (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback != null) {
                com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.this.myLocalPlaybackModelCallback.onTransferWasValidReport(i);
            }
        }
    };
    private com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient mLocalPlaybackModelClient;
    private com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback myLocalPlaybackModelCallback;

    public static com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp getInstance() {
        if (rtkMusicSpp == null) {
            synchronized (com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.class) {
                if (rtkMusicSpp == null) {
                    rtkMusicSpp = new com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp();
                }
            }
        }
        return rtkMusicSpp;
    }

    public void initLocalPlaybackModelClient(android.app.Application application) {
        com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient.initialize(application);
    }

    public void initModelClient() {
        if (this.mLocalPlaybackModelClient == null) {
            this.mLocalPlaybackModelClient = com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient.getInstance();
            registerModelCallback();
        }
    }

    private void registerModelCallback() {
        this.mLocalPlaybackModelClient.registerCallback(this.mLocalPlaybackModelCallback);
    }

    private void unRegisterModelCallback() {
        com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient localPlaybackModelClient = this.mLocalPlaybackModelClient;
        if (localPlaybackModelClient != null) {
            localPlaybackModelClient.unregisterCallback(this.mLocalPlaybackModelCallback);
        }
    }

    public void registerMyMusicCallback(com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackModelCallback myLocalPlaybackModelCallback) {
        this.myLocalPlaybackModelCallback = myLocalPlaybackModelCallback;
    }

    public java.lang.Integer getFileListData(int i) {
        if (this.mLocalPlaybackModelClient == null) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "spp 连接失败");
            return -1;
        }
        if (i == com.oudmon.ble.base.bluetooth.spp.RtkSppConstants.FILE_TYPE_HEADER_BIN) {
            com.realsil.sdk.bbpro.core.BeeError fileListData = this.mLocalPlaybackModelClient.getFileListData((byte) 0);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(fileListData.code));
            return java.lang.Integer.valueOf(fileListData.code);
        }
        if (i == com.oudmon.ble.base.bluetooth.spp.RtkSppConstants.FILE_TYPE_NAME_BIN) {
            com.realsil.sdk.bbpro.core.BeeError fileListData2 = this.mLocalPlaybackModelClient.getFileListData((byte) 1);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(fileListData2.code));
            return java.lang.Integer.valueOf(fileListData2.code);
        }
        return 0;
    }

    public boolean getConnectState() {
        com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient localPlaybackModelClient = this.mLocalPlaybackModelClient;
        if (localPlaybackModelClient == null) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "没有初始化");
            return false;
        }
        int connectState = localPlaybackModelClient.getVendorClient().getConnectState();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(connectState));
        return connectState >= 263;
    }

    public java.lang.String getCacheDirPath() {
        return com.realsil.sdk.audioconnect.localplayback.LocalPlaybackConfiguration.getInstance().getCacheDirPath();
    }

    public void setCacheDirPath(java.lang.String str) {
        com.realsil.sdk.audioconnect.localplayback.LocalPlaybackConfiguration.getInstance().setCacheDirPath(str);
    }

    public java.io.File createNewHeaderFile(java.lang.String str) {
        return com.realsil.sdk.audioconnect.localplayback.LocalPlaybackUtil.createNewFile(str, "header.bin");
    }

    public java.io.File createNewNameFile(java.lang.String str) {
        return com.realsil.sdk.audioconnect.localplayback.LocalPlaybackUtil.createNewFile(str, "name.bin");
    }

    public void writeContentToFile(java.io.File file, byte[] bArr) {
        com.realsil.sdk.audioconnect.localplayback.LocalPlaybackUtil.writeContentToFile(file, bArr);
    }

    public int deleteSingleSongFromDevice(int i, byte[] bArr) {
        return this.mLocalPlaybackModelClient.deleteSingleSongFromDevice(i, bArr).code;
    }

    public int deleteAllSongFromDevice() {
        return this.mLocalPlaybackModelClient.deleteAllSongFromDevice().code;
    }

    public void updateTransferState(int i) {
        com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.getInstance().updateTransferState(i);
    }

    public int queryDeviceInfo() {
        return com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient.getInstance().queryDeviceInfo().code;
    }

    public int enterTransferMode(java.io.File file) {
        return com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient.getInstance().enterSongTransferMode(file).code;
    }

    public void startTransferInit(int i, int i2) {
        com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.getInstance().init(i, i2);
    }

    public void startTransfer(java.io.File file, final com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackTransferEngineCallback myLocalPlaybackTransferEngineCallback) {
        com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.getInstance().startTransfer(file);
        com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.getInstance().setTransferCallback(new com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngineCallback() { // from class: com.oudmon.ble.base.bluetooth.spp.RtkMusicSpp.1
            @Override // com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngineCallback
            public void onTransferProgressChanged(int i) {
                com.oudmon.ble.base.bluetooth.spp.MyLocalPlaybackTransferEngineCallback myLocalPlaybackTransferEngineCallback2 = myLocalPlaybackTransferEngineCallback;
                if (myLocalPlaybackTransferEngineCallback2 != null) {
                    myLocalPlaybackTransferEngineCallback2.onTransferProgressChanged(i);
                }
            }
        });
    }

    public int stopTransfer() {
        return com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient.getInstance().cancelTransfer().code;
    }

    public int exitSongTransferMode() {
        return com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient.getInstance().exitSongTransferMode().code;
    }

    public java.util.List<com.oudmon.ble.base.bluetooth.spp.bean.MySongInfo> getSongInfoList(java.io.File file, java.io.File file2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<com.realsil.sdk.audioconnect.localplayback.entity.SongInfo> songInfoList = com.realsil.sdk.audioconnect.localplayback.LocalPlaybackUtil.getSongInfoList(file, file2);
        com.oudmon.ble.base.bluetooth.spp.LocalPlaybackDataPool.getInstance().clear();
        com.oudmon.ble.base.bluetooth.spp.LocalPlaybackDataPool.getInstance().setSongInfoList(songInfoList);
        for (com.realsil.sdk.audioconnect.localplayback.entity.SongInfo songInfo : com.oudmon.ble.base.bluetooth.spp.LocalPlaybackDataPool.getInstance().getSongInfoList()) {
            com.oudmon.ble.base.bluetooth.spp.bean.MySongInfo mySongInfo = new com.oudmon.ble.base.bluetooth.spp.bean.MySongInfo();
            mySongInfo.setSongNameLength(songInfo.getSongNameLength());
            mySongInfo.setSongName(songInfo.getSongName());
            mySongInfo.setChecked(songInfo.isChecked());
            mySongInfo.setSongIndexInFileList(songInfo.getSongIndexInFileList());
            mySongInfo.setSongNameBuffer(songInfo.getSongNameBuffer());
            mySongInfo.setDeleted(songInfo.isDeleted());
            mySongInfo.setRelatePlayListIndex(songInfo.getRelatePlayListIndex());
            mySongInfo.setSongNameWithoutSuffix(songInfo.getSongNameWithoutSuffix());
            mySongInfo.setSongNameOffset(songInfo.getSongNameOffset());
            arrayList.add(mySongInfo);
        }
        return arrayList;
    }
}
