package com.qcwireless.qcwatch.ui.device.music;

/* loaded from: /tmp/dex/classes2.dex */
public class MusicUtils {
    private static final int BIT_RATE = 128000;
    private static final java.lang.String MIME_TYPE = "audio/mpeg";
    private static final int SAMPLE_RATE = 44100;
    private static final java.lang.String TAG = "aaaa";
    private static final int TIMEOUT_US = 10000;

    public interface ProgressCallback {
        void onProgress(float progress);
    }

    public static void convertMp3ToPcm(java.lang.String inputPath, java.lang.String outputPath, com.qcwireless.qcwatch.ui.device.music.MusicUtils.ProgressCallback progressCallback) {
        java.nio.ByteBuffer[] byteBufferArr;
        long j;
        android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
        try {
            mediaExtractor.setDataSource(inputPath);
            int audioTrackIndex = getAudioTrackIndex(mediaExtractor);
            if (audioTrackIndex == -1) {
                return;
            }
            mediaExtractor.selectTrack(audioTrackIndex);
            android.media.MediaFormat trackFormat = mediaExtractor.getTrackFormat(audioTrackIndex);
            android.media.MediaCodec createDecoderByType = android.media.MediaCodec.createDecoderByType("audio/mpeg");
            int i = 0;
            createDecoderByType.configure(trackFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
            createDecoderByType.start();
            java.nio.ByteBuffer[] inputBuffers = createDecoderByType.getInputBuffers();
            java.nio.ByteBuffer[] outputBuffers = createDecoderByType.getOutputBuffers();
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new java.io.File(outputPath));
            long j2 = 0;
            while (true) {
                int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(10000L);
                if (dequeueInputBuffer >= 0) {
                    int readSampleData = mediaExtractor.readSampleData(inputBuffers[dequeueInputBuffer], i);
                    if (readSampleData < 0) {
                        createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, j2, 4);
                        break;
                    }
                    byteBufferArr = inputBuffers;
                    j = 10000;
                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor.getSampleTime(), 0);
                    mediaExtractor.advance();
                    j2 = mediaExtractor.getSampleTime();
                } else {
                    byteBufferArr = inputBuffers;
                    j = 10000;
                }
                int dequeueOutputBuffer = createDecoderByType.dequeueOutputBuffer(bufferInfo, j);
                if (dequeueOutputBuffer >= 0) {
                    java.nio.ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                    byte[] bArr = new byte[bufferInfo.size];
                    byteBuffer.get(bArr);
                    fileOutputStream.write(bArr);
                    createDecoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if (progressCallback != null) {
                        progressCallback.onProgress(bufferInfo.presentationTimeUs / trackFormat.getLong("durationUs"));
                    }
                    if ((bufferInfo.flags & 4) != 0) {
                        break;
                    }
                }
                inputBuffers = byteBufferArr;
                i = 0;
            }
            mediaExtractor.release();
            createDecoderByType.stop();
            createDecoderByType.release();
            fileOutputStream.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    private static int getAudioTrackIndex(android.media.MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            if (mediaExtractor.getTrackFormat(i).getString("mime").startsWith("audio/")) {
                return i;
            }
        }
        return -1;
    }
}
