package com.qcwireless.qcwatch.ui.device.record;

/* loaded from: /tmp/dex/classes2.dex */
public class ADAudioTrackPlayer {
    private android.media.AudioTrack aTrack;
    private boolean isBigendian;
    private boolean isStop;
    private android.content.Context mContext;
    private int mFormat;
    private java.io.InputStream mInputStream;
    private int mMinBufferSize;
    private java.lang.Thread mThread;
    private java.lang.String path;

    public ADAudioTrackPlayer(android.content.Context c, java.lang.String path, int sampleRate, int format, int ch_layout, boolean isBig) {
        this.mContext = c;
        this.mFormat = format;
        this.isBigendian = isBig;
        this.path = path;
        initAudioTrackByBuilder(ch_layout, sampleRate, format);
        initInputStream(path);
    }

    private void initAudioTrack(int ch_layout, int sampleRate, int format) {
        this.mMinBufferSize = android.media.AudioTrack.getMinBufferSize(sampleRate, ch_layout, format);
        this.aTrack = new android.media.AudioTrack(3, sampleRate, ch_layout, format, this.mMinBufferSize, 1);
    }

    private void initAudioTrackByBuilder(int ch_layout, int sampleRate, int format) {
        this.mMinBufferSize = android.media.AudioTrack.getMinBufferSize(sampleRate, ch_layout, format);
        this.aTrack = new android.media.AudioTrack.Builder().setAudioAttributes(new android.media.AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAudioFormat(new android.media.AudioFormat.Builder().setEncoding(format).setSampleRate(sampleRate).setChannelMask(ch_layout).build()).setBufferSizeInBytes(this.mMinBufferSize).build();
    }

    private void initInputStream(java.lang.String path) {
        try {
            this.mInputStream = new java.io.FileInputStream(path);
        } catch (java.io.IOException unused) {
        }
    }

    public void play() {
        this.isStop = false;
        initInputStream(this.path);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(this.aTrack.getState()));
        android.media.AudioTrack audioTrack = this.aTrack;
        if (audioTrack == null || audioTrack.getState() == 0) {
            return;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "start");
        this.aTrack.play();
        startAudioThread();
    }

    public void stop() {
        this.isStop = true;
        android.media.AudioTrack audioTrack = this.aTrack;
        if (audioTrack != null && audioTrack.getState() != 0) {
            this.aTrack.stop();
        }
        java.lang.Thread thread = this.mThread;
        if (thread != null) {
            try {
                thread.join();
                this.mThread = null;
            } catch (java.lang.InterruptedException unused) {
            }
        }
        release();
    }

    public void release() {
        this.aTrack.release();
        this.aTrack = null;
    }

    private void startAudioThread() {
        if (this.mThread == null) {
            java.lang.Thread thread = new java.lang.Thread(new com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer.AudioThread());
            this.mThread = thread;
            thread.start();
        }
    }

    private class AudioThread implements java.lang.Runnable {
        private AudioThread() {
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("AudioThread start mMinBufferSize==> ");
            sb.append(com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer.this.mMinBufferSize);
            sb.append("----");
            sb.append(!com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer.this.isStop);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sb.toString());
            while (!com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer.this.isStop) {
                try {
                    byte[] bArr = new byte[com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2];
                    int read = com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer.this.mInputStream.read(bArr);
                    if (com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer.this.mFormat == 4) {
                        float[] bytesToFloats = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToFloats(bArr, read, com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer.this.isBigendian);
                        com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer.this.aTrack.write(bytesToFloats, 0, bytesToFloats.length, 0);
                    } else if (com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer.this.mFormat == 2) {
                        short[] bytesToShorts = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToShorts(bArr, read, com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer.this.isBigendian);
                        if (bytesToShorts.length == 0) {
                            com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer.this.isStop = true;
                        }
                        com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer.this.aTrack.write(bytesToShorts, 0, bytesToShorts.length);
                    } else {
                        com.qcwireless.qcwatch.ui.device.record.ADAudioTrackPlayer.this.aTrack.write(bArr, 0, read);
                    }
                } catch (java.io.IOException unused) {
                }
            }
        }
    }
}
