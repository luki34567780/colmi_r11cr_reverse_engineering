package com.realsil.sdk.audioconnect.localplayback;

/* loaded from: /tmp/dex/classes2.dex */
public class LocalPlaybackTransferEngine {
    public static final int MAX_SEQUENCE_NUMBER = 65535;
    public static volatile com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine k;
    public com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngineCallback a;
    public com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.a b;
    public int d;
    public int e;
    public java.util.concurrent.LinkedBlockingQueue<java.lang.Integer> f;
    public java.util.concurrent.atomic.AtomicInteger g;
    public java.util.concurrent.atomic.AtomicInteger h;
    public long i;
    public volatile boolean c = false;
    public byte j = 0;

    public class a extends java.lang.Thread {
        public final java.io.File a;

        public a(java.io.File file) {
            this.a = file;
        }

        public void a() {
            com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.this.c = false;
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.a);
                com.realsil.sdk.core.logger.ZLogger.d("transfer thread has running, file name: " + this.a.getName() + ", sendPktSize: " + com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.this.d);
                byte[] bArr = new byte[com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.this.d];
                while (com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.this.c) {
                    try {
                        com.realsil.sdk.core.logger.ZLogger.d("current put buffer type: " + ((java.lang.Integer) com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.this.f.take()));
                        for (int i = 0; i < com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.this.e; i++) {
                            try {
                                int read = fileInputStream.read(bArr);
                                com.realsil.sdk.core.logger.ZLogger.d("read len: " + read);
                                if (read == -1) {
                                    com.realsil.sdk.core.logger.ZLogger.w("read the end of file, will exit the transfer thread ...");
                                    return;
                                }
                                if (com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.this.g.get() > 65535) {
                                    com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.this.g.set(0);
                                    com.realsil.sdk.core.logger.ZLogger.w("sequence number more than the max number(65535), reset to 0");
                                }
                                int andIncrement = com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.this.g.getAndIncrement();
                                int andAdd = com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.this.h.getAndAdd(read);
                                short b = com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.b(bArr, read % 2 == 0 ? read : read - 1);
                                com.realsil.sdk.core.logger.ZLogger.d("read completed, prepare to send, seq: " + andIncrement + ", Transferred: " + andAdd + ", sendSize: " + read);
                                com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient.getInstance().transfer((short) andIncrement, b, andAdd, (short) read, bArr);
                            } catch (java.io.IOException e) {
                                e.printStackTrace();
                                com.realsil.sdk.core.logger.ZLogger.e("read song file data failed, catch a io exception");
                                return;
                            }
                        }
                    } catch (java.lang.InterruptedException unused) {
                        com.realsil.sdk.core.logger.ZLogger.w("receive a interrupt signal, will exit the transfer thread ... ");
                        return;
                    }
                }
                com.realsil.sdk.core.logger.ZLogger.w("exit transfer thread");
            } catch (java.io.FileNotFoundException unused2) {
                com.realsil.sdk.core.logger.ZLogger.e("send file data failed, transfer file can not found");
            }
        }
    }

    public static com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine getInstance() {
        if (k == null) {
            synchronized (com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.class) {
                if (k == null) {
                    k = new com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine();
                }
            }
        }
        return k;
    }

    public synchronized void destroy() {
        a();
        b();
        this.f = null;
        this.a = null;
        this.d = 0;
        this.e = 0;
    }

    public synchronized void init(int i, int i2) {
        if (i <= 0) {
            com.realsil.sdk.core.logger.ZLogger.e("parameter error, sent packet size is invalid");
            return;
        }
        if (i2 <= 0) {
            com.realsil.sdk.core.logger.ZLogger.e("parameter error, buffer check size is invalid");
            return;
        }
        this.d = i;
        this.e = i2 / i;
        if (this.f == null) {
            this.f = new java.util.concurrent.LinkedBlockingQueue<>();
        }
        this.g = new java.util.concurrent.atomic.AtomicInteger(0);
        this.h = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public void setTransferCallback(com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngineCallback localPlaybackTransferEngineCallback) {
        this.a = localPlaybackTransferEngineCallback;
    }

    public synchronized void startTransfer(java.io.File file) {
        if (file == null) {
            com.realsil.sdk.core.logger.ZLogger.e("input file can not be null");
            return;
        }
        if (!file.exists()) {
            com.realsil.sdk.core.logger.ZLogger.e("input file not exists");
            return;
        }
        if (file.length() == 0) {
            com.realsil.sdk.core.logger.ZLogger.e("input file content cannot be empty");
        } else if (this.f == null) {
            com.realsil.sdk.core.logger.ZLogger.e("start failed, please call init() at first.");
        } else {
            a(file);
        }
    }

    public void updateTransferState(int i) {
        if (this.f == null) {
            com.realsil.sdk.core.logger.ZLogger.e("start failed, please call init() at first");
            return;
        }
        if (this.b == null) {
            com.realsil.sdk.core.logger.ZLogger.e("update file, transfer has not yet started");
            return;
        }
        if (i == 241) {
            com.realsil.sdk.core.logger.ZLogger.w("onTransferSuccess: >>>>> Buffer A can use");
        } else {
            if (i != 242) {
                com.realsil.sdk.core.logger.ZLogger.e("invalid buffer flag!");
                return;
            }
            com.realsil.sdk.core.logger.ZLogger.w("onTransferSuccess: >>>>> Buffer B can use");
        }
        if (this.a != null) {
            this.a.onTransferProgressChanged((int) (new java.math.BigDecimal(this.h.get()).divide(new java.math.BigDecimal(this.i), 2, 1).doubleValue() * 100.0d));
        }
        com.realsil.sdk.core.logger.ZLogger.d("(transfer/total): [" + this.h + "/" + this.i + "]");
        if (this.i != this.h.get()) {
            try {
                this.f.put(java.lang.Integer.valueOf(i));
                return;
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
        if (i == 241) {
            this.j = (byte) (this.j | 1);
        } else {
            this.j = (byte) (this.j | 2);
        }
        com.realsil.sdk.core.logger.ZLogger.d("check transmission state: " + ((int) this.j));
        if (this.j == 3) {
            com.realsil.sdk.core.logger.ZLogger.w("The transmission is complete, valid song...");
            com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient.getInstance().validTransfer((int) this.i);
        }
    }

    public final void b() {
        com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.a aVar = this.b;
        if (aVar != null) {
            aVar.a();
            this.b = null;
            com.realsil.sdk.core.logger.ZLogger.d("stop last transfer thread");
        }
    }

    public final void a(java.io.File file) {
        b();
        a();
        this.i = file.length();
        try {
            this.f.put(java.lang.Integer.valueOf(com.realsil.sdk.audioconnect.localplayback.LocalPlaybackConstants.BUFFER_A_CAN_USE_FLAG));
            this.f.put(java.lang.Integer.valueOf(com.realsil.sdk.audioconnect.localplayback.LocalPlaybackConstants.BUFFER_B_CAN_USE_FLAG));
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        this.c = true;
        com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.a aVar = new com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.a(file);
        this.b = aVar;
        aVar.start();
    }

    public static short b(byte[] bArr, int i) {
        short s = 0;
        for (int i2 = 0; i2 < i; i2 += 2) {
            s = (short) (s ^ ((short) ((bArr[i2 + 1] << 8) | (bArr[i2] & 255))));
        }
        return (short) (((s & 255) << 8) | ((65280 & s) >> 8));
    }

    public final void a() {
        java.util.concurrent.LinkedBlockingQueue<java.lang.Integer> linkedBlockingQueue = this.f;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.clear();
        }
        this.g.set(0);
        this.h.set(0);
        this.i = 0L;
        this.j = (byte) 0;
    }
}
