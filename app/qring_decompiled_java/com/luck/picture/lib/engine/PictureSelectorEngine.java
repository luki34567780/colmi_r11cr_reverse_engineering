package com.luck.picture.lib.engine;

/* loaded from: /tmp/dex/classes2.dex */
public interface PictureSelectorEngine {
    com.luck.picture.lib.engine.CompressEngine createCompressEngine();

    com.luck.picture.lib.engine.CompressFileEngine createCompressFileEngine();

    com.luck.picture.lib.engine.ImageEngine createImageLoaderEngine();

    com.luck.picture.lib.interfaces.OnInjectLayoutResourceListener createLayoutResourceListener();

    com.luck.picture.lib.engine.ExtendLoaderEngine createLoaderDataEngine();

    com.luck.picture.lib.engine.SandboxFileEngine createSandboxFileEngine();

    com.luck.picture.lib.engine.UriToFileTransformEngine createUriToFileTransformEngine();

    com.luck.picture.lib.engine.VideoPlayerEngine createVideoPlayerEngine();

    com.luck.picture.lib.interfaces.OnResultCallbackListener<com.luck.picture.lib.entity.LocalMedia> getResultCallbackListener();

    com.luck.picture.lib.basic.IBridgeLoaderFactory onCreateLoader();
}
