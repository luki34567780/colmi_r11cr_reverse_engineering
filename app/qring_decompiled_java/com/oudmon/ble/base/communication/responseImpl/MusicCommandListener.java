package com.oudmon.ble.base.communication.responseImpl;

/* loaded from: /tmp/dex/classes2.dex */
public class MusicCommandListener implements com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.MusicCommandRsp> {
    private android.content.Context mContext;

    public MusicCommandListener(android.content.Context context) {
        this.mContext = context;
    }

    @Override // com.oudmon.ble.base.communication.ICommandResponse
    public void onDataResponse(com.oudmon.ble.base.communication.rsp.MusicCommandRsp musicCommandRsp) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, musicCommandRsp);
        if (musicCommandRsp.getStatus() == 0) {
            if (musicCommandRsp.getAction() == 1) {
                android.view.KeyEvent keyEvent = new android.view.KeyEvent(0, 85);
                android.view.KeyEvent keyEvent2 = new android.view.KeyEvent(0, 79);
                controlMusic(this.mContext, keyEvent, new android.view.KeyEvent(1, 85), keyEvent2);
                return;
            }
            if (musicCommandRsp.getAction() == 2) {
                controlMusic(this.mContext, new android.view.KeyEvent(0, 88), new android.view.KeyEvent(1, 88));
            } else if (musicCommandRsp.getAction() == 3) {
                controlMusic(this.mContext, new android.view.KeyEvent(0, 87), new android.view.KeyEvent(1, 87));
            } else if (musicCommandRsp.getAction() == 4) {
                ((android.media.AudioManager) this.mContext.getSystemService(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO)).adjustStreamVolume(3, 1, 1);
            } else if (musicCommandRsp.getAction() == 5) {
                ((android.media.AudioManager) this.mContext.getSystemService(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO)).adjustStreamVolume(3, -1, 1);
            }
        }
    }

    private void controlMusic(android.content.Context context, android.view.KeyEvent keyEvent, android.view.KeyEvent keyEvent2) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO);
        audioManager.dispatchMediaKeyEvent(keyEvent);
        audioManager.dispatchMediaKeyEvent(keyEvent2);
        if (audioManager.isMusicActive()) {
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.MusicSwitchReq.getNewWriteInstance(false, 0, getSystemVolume(this.mContext), ""), null);
        }
    }

    private void controlMusic(android.content.Context context, android.view.KeyEvent keyEvent, android.view.KeyEvent keyEvent2, android.view.KeyEvent keyEvent3) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO);
        audioManager.dispatchMediaKeyEvent(keyEvent);
        audioManager.dispatchMediaKeyEvent(keyEvent2);
        audioManager.dispatchMediaKeyEvent(keyEvent3);
        if (audioManager.isMusicActive()) {
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.MusicSwitchReq.getNewWriteInstance(false, 0, getSystemVolume(this.mContext), ""), null);
        }
    }

    private int getSystemVolume(android.content.Context context) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO);
        return (audioManager.getStreamVolume(3) * 100) / audioManager.getStreamMaxVolume(3);
    }
}
