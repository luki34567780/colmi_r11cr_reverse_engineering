package com.oudmon.ble.base.bluetooth.spp;

/* loaded from: /tmp/dex/classes2.dex */
public interface MyLocalPlaybackModelCallback {
    void onAddOrDeleteSongToPlaylistReport(int i);

    void onCancelTransferReport(boolean z);

    void onDeleteAllSongReport(int i);

    void onDeleteSingleSongReport(int i);

    void onEnterSongTransferModeReport(boolean z);

    void onExitSongTransferModeReport(boolean z);

    void onGetDeviceInfoReport(android.os.Bundle bundle);

    void onGetFileContentReport(int i, byte[] bArr);

    void onGetFileFooterReport(int i, byte[] bArr);

    void onGetFileHeaderReport(int i, long j);

    void onTransferWasValidReport(int i);

    void onWriteFailedReport();

    void onWriteSuccessReport(int i);
}
