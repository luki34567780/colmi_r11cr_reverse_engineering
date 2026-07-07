package com.luck.picture.lib.app;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureAppMaster implements com.luck.picture.lib.app.IApp {
    private static com.luck.picture.lib.app.PictureAppMaster mInstance;
    private com.luck.picture.lib.app.IApp app;

    @Override // com.luck.picture.lib.app.IApp
    public android.content.Context getAppContext() {
        com.luck.picture.lib.app.IApp iApp = this.app;
        if (iApp == null) {
            return null;
        }
        return iApp.getAppContext();
    }

    @Override // com.luck.picture.lib.app.IApp
    public com.luck.picture.lib.engine.PictureSelectorEngine getPictureSelectorEngine() {
        com.luck.picture.lib.app.IApp iApp = this.app;
        if (iApp == null) {
            return null;
        }
        return iApp.getPictureSelectorEngine();
    }

    private PictureAppMaster() {
    }

    public static com.luck.picture.lib.app.PictureAppMaster getInstance() {
        if (mInstance == null) {
            synchronized (com.luck.picture.lib.app.PictureAppMaster.class) {
                if (mInstance == null) {
                    mInstance = new com.luck.picture.lib.app.PictureAppMaster();
                }
            }
        }
        return mInstance;
    }

    public void setApp(com.luck.picture.lib.app.IApp iApp) {
        this.app = iApp;
    }

    public com.luck.picture.lib.app.IApp getApp() {
        return this.app;
    }
}
