package com.qcwireless.qcwatch.base.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class TransPCMHandlerPure {
    private com.qcwireless.qcwatch.base.utils.TransPCMHandlerPure.OnProgressListener listener;
    private java.lang.String outFile;
    private long rangeEnd;
    private long rangeStart;
    private java.lang.String srcFile;

    public interface OnProgressListener {
        void onFail();

        void onProgress(int max, int progress);

        void onStart();

        void onSuccess();
    }

    public TransPCMHandlerPure(java.lang.String srcFile, java.lang.String outFile) {
        this(srcFile, outFile, null);
    }

    public TransPCMHandlerPure(java.lang.String srcFile, java.lang.String outFile, com.qcwireless.qcwatch.base.utils.TransPCMHandlerPure.OnProgressListener listener) {
        this(srcFile, outFile, -1L, -1L, listener);
    }

    public TransPCMHandlerPure(java.lang.String srcFile, java.lang.String outFile, long rangeStart, long rangeEnd, com.qcwireless.qcwatch.base.utils.TransPCMHandlerPure.OnProgressListener listener) {
        this.rangeStart = -1L;
        this.rangeEnd = -1L;
        this.srcFile = srcFile;
        this.outFile = outFile;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
        this.listener = listener;
    }

    public void start() {
        com.qcwireless.qcwatch.base.utils.TransPCMHandlerPure.DecodeTask decodeTask = new com.qcwireless.qcwatch.base.utils.TransPCMHandlerPure.DecodeTask(this.srcFile, this.outFile, this.listener);
        decodeTask.setRangeTime(this.rangeStart, this.rangeEnd);
        new java.lang.Thread(decodeTask).start();
    }

    public void setRangeTime(long rangeStart, long rangeEnd) {
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }

    public void setListener(com.qcwireless.qcwatch.base.utils.TransPCMHandlerPure.OnProgressListener listener) {
        this.listener = listener;
    }

    private static class DecodeTask implements java.lang.Runnable {
        private static final long TIME_OUT = 5000;
        private android.media.MediaCodec codec;
        private int duration = 0;
        private android.media.MediaExtractor extractor;
        private com.qcwireless.qcwatch.base.utils.TransPCMHandlerPure.OnProgressListener listener;
        private java.io.OutputStream mOutput;
        private java.lang.String outFile;
        private long rangeEnd;
        private long rangeStart;
        private java.lang.String srcFile;

        public void setRangeTime(long rangeStart, long rangeEnd) {
            this.rangeStart = rangeStart;
            this.rangeEnd = rangeEnd;
        }

        public DecodeTask(java.lang.String srcFile, java.lang.String outFile, com.qcwireless.qcwatch.base.utils.TransPCMHandlerPure.OnProgressListener listener) {
            this.srcFile = srcFile;
            this.outFile = outFile;
            this.listener = listener;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.base.utils.TransPCMHandlerPure.OnProgressListener onProgressListener;
            com.qcwireless.qcwatch.base.utils.TransPCMHandlerPure.OnProgressListener onProgressListener2 = this.listener;
            if (onProgressListener2 != null) {
                onProgressListener2.onStart();
            }
            boolean z = false;
            try {
                prepare();
                z = true;
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
            if (z) {
                output();
            }
            release();
            if (z || (onProgressListener = this.listener) == null) {
                return;
            }
            onProgressListener.onFail();
        }

        private void release() {
            android.media.MediaExtractor mediaExtractor = this.extractor;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.extractor = null;
            }
            android.media.MediaCodec mediaCodec = this.codec;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.codec.release();
                this.codec = null;
            }
        }

        private void prepare() throws java.io.IOException {
            android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
            this.extractor = mediaExtractor;
            mediaExtractor.setDataSource(this.srcFile);
            int trackCount = this.extractor.getTrackCount();
            int i = 0;
            while (true) {
                if (i >= trackCount) {
                    break;
                }
                android.media.MediaFormat trackFormat = this.extractor.getTrackFormat(i);
                java.lang.String string = trackFormat.getString("mime");
                if (!android.text.TextUtils.isEmpty(string) && string.startsWith(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO)) {
                    this.extractor.selectTrack(i);
                    try {
                        this.duration = trackFormat.getInteger("durationUs") / 1000;
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                        android.media.MediaPlayer mediaPlayer = new android.media.MediaPlayer();
                        mediaPlayer.setDataSource(this.srcFile);
                        mediaPlayer.prepare();
                        this.duration = mediaPlayer.getDuration();
                        mediaPlayer.release();
                    }
                    android.media.MediaCodec createDecoderByType = android.media.MediaCodec.createDecoderByType(string);
                    this.codec = createDecoderByType;
                    createDecoderByType.configure(trackFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
                    this.codec.start();
                    break;
                }
                i++;
            }
            com.qcwireless.qcwatch.base.utils.TransPCMHandlerPure.createFile(this.outFile + ".pcm", true);
            this.mOutput = new java.io.DataOutputStream(new java.io.FileOutputStream(this.outFile + ".pcm"));
        }

        private void output() {
            boolean z;
            long j;
            int dequeueInputBuffer;
            java.nio.ByteBuffer[] inputBuffers = this.codec.getInputBuffers();
            java.nio.ByteBuffer[] outputBuffers = this.codec.getOutputBuffers();
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            long j2 = this.rangeStart;
            long j3 = 1000;
            if (j2 > 0) {
                this.extractor.seekTo(j2 * 1000, 2);
            }
            java.nio.ByteBuffer[] byteBufferArr = outputBuffers;
            boolean z2 = false;
            while (true) {
                if (z2 || (dequeueInputBuffer = this.codec.dequeueInputBuffer(5000L)) < 0) {
                    z = z2;
                    j = 0;
                } else {
                    int readSampleData = this.extractor.readSampleData(inputBuffers[dequeueInputBuffer], 0);
                    long sampleTime = this.extractor.getSampleTime();
                    long j4 = sampleTime / j3;
                    long j5 = this.rangeEnd;
                    int i = (j5 <= 0 || j4 <= j5) ? readSampleData : -1;
                    if (i <= 0) {
                        this.codec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        j = j4;
                        z = true;
                    } else {
                        this.codec.queueInputBuffer(dequeueInputBuffer, 0, i, sampleTime, 0);
                        this.extractor.advance();
                        z = z2;
                        j = j4;
                    }
                }
                int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 5000L);
                if (dequeueOutputBuffer == -3) {
                    byteBufferArr = this.codec.getOutputBuffers();
                } else if (dequeueOutputBuffer != -2 && dequeueOutputBuffer != -1) {
                    java.nio.ByteBuffer byteBuffer = byteBufferArr[dequeueOutputBuffer];
                    byte[] bArr = new byte[bufferInfo.size];
                    byteBuffer.get(bArr, 0, bufferInfo.size);
                    this.codec.releaseOutputBuffer(dequeueOutputBuffer, true);
                    try {
                        this.mOutput.write(bArr);
                    } catch (java.io.IOException e) {
                        e.printStackTrace();
                    }
                    com.qcwireless.qcwatch.base.utils.TransPCMHandlerPure.OnProgressListener onProgressListener = this.listener;
                    if (onProgressListener != null) {
                        long j6 = this.rangeEnd;
                        int i2 = j6 > 0 ? (int) j6 : this.duration;
                        long j7 = this.rangeStart;
                        if (j7 > 0) {
                            j -= j7;
                        }
                        onProgressListener.onProgress(i2, (int) j);
                    }
                }
                z2 = z;
                j3 = 1000;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean createFile(java.lang.String filePath, boolean recreate) {
        if (android.text.TextUtils.isEmpty(filePath)) {
            return false;
        }
        try {
            java.io.File file = new java.io.File(filePath);
            if (file.exists()) {
                if (!recreate) {
                    return true;
                }
                file.delete();
                file.createNewFile();
                return true;
            }
            java.io.File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            file.createNewFile();
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
