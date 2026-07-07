package com.realsil.sdk.bbpro.core.gatt;

/* loaded from: /tmp/dex/classes2.dex */
public class GattTransportLayer {
    public com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback b;
    public volatile int c;
    public volatile int d;
    public volatile boolean e;
    public int g;
    public com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.ThreadTx h;
    public com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.ThreadRx i;
    public com.realsil.sdk.bbpro.core.gatt.GattLayer a = null;
    public final java.lang.Object f = new java.lang.Object();
    public com.realsil.sdk.bbpro.core.gatt.ChannelCallback j = new com.realsil.sdk.bbpro.core.gatt.ChannelCallback() { // from class: com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.1
        @Override // com.realsil.sdk.bbpro.core.gatt.ChannelCallback
        public void onConnectionStateChange(android.bluetooth.BluetoothDevice bluetoothDevice, boolean z, int i) {
            super.onConnectionStateChange(bluetoothDevice, z, i);
            if (!z || i == 1) {
                com.realsil.sdk.bbpro.core.gatt.GattTransportLayer gattTransportLayer = com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.this;
                gattTransportLayer.getClass();
                com.realsil.sdk.core.logger.ZLogger.v("closePassive");
                gattTransportLayer.b();
                gattTransportLayer.c();
            } else {
                com.realsil.sdk.core.logger.ZLogger.v("status: " + z + ", newState: " + i);
            }
            com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback transportLayerCallback = com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.this.b;
            if (transportLayerCallback != null) {
                transportLayerCallback.onConnectionStateChanged(bluetoothDevice, z, i);
            }
        }

        @Override // com.realsil.sdk.bbpro.core.gatt.ChannelCallback
        public void onDataReceive(byte[] bArr) {
            com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.ThreadRx threadRx = com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.this.i;
            if (threadRx == null || bArr == null) {
                return;
            }
            threadRx.addQueue(bArr);
        }
    };

    public class ThreadRx extends com.realsil.sdk.core.base.BaseThread<byte[]> {
        public ThreadRx() {
        }

        public void run() {
            com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback transportLayerCallback;
            com.realsil.sdk.core.logger.ZLogger.d("RxThread is running");
            while (!java.lang.Thread.currentThread().isInterrupted() && !isCanceled()) {
                byte[] bArr = (byte[]) take();
                if (bArr != null) {
                    com.realsil.sdk.bbpro.core.gatt.GattTransportLayer gattTransportLayer = com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.this;
                    gattTransportLayer.getClass();
                    try {
                        int length = bArr.length;
                        int i = 0;
                        do {
                            int i2 = length - i;
                            if (i2 <= 0) {
                                break;
                            }
                            byte[] bArr2 = new byte[i2];
                            java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
                            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.core.utility.DataConverter.bytes2Hex(bArr));
                            com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket builderPacket = com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket.builderPacket(bArr2);
                            if (builderPacket == null) {
                                break;
                            }
                            short opcode = builderPacket.getOpcode();
                            builderPacket.getPayload();
                            byte[] parameters = builderPacket.getParameters();
                            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "[0x%04X >>] %s", java.lang.Short.valueOf(opcode), com.realsil.sdk.core.utility.DataConverter.bytes2HexWithSeparate(parameters)));
                            if (opcode != 0) {
                                gattTransportLayer.sendAck(opcode, (byte) 0);
                                if (builderPacket.getSeqNum() != gattTransportLayer.d) {
                                    gattTransportLayer.d = builderPacket.getSeqNum();
                                    com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback transportLayerCallback2 = gattTransportLayer.b;
                                    if (transportLayerCallback2 != null) {
                                        transportLayerCallback2.onDataReceive(builderPacket);
                                    }
                                }
                            } else if (builderPacket.getSeqNum() != gattTransportLayer.d) {
                                gattTransportLayer.d = builderPacket.getSeqNum();
                                synchronized (gattTransportLayer.f) {
                                    gattTransportLayer.e = true;
                                    gattTransportLayer.f.notifyAll();
                                }
                                com.realsil.sdk.bbpro.core.transportlayer.AckPacket builder = com.realsil.sdk.bbpro.core.transportlayer.AckPacket.builder(parameters);
                                if (builder != null && (transportLayerCallback = gattTransportLayer.b) != null) {
                                    transportLayerCallback.onAckReceive(builder);
                                }
                            }
                            i += builderPacket.getPacketLength();
                        } while (i < length);
                    } catch (java.lang.Exception e) {
                        com.realsil.sdk.core.logger.ZLogger.e(e.toString());
                    }
                }
            }
            com.realsil.sdk.core.logger.ZLogger.d("RxThread stopped");
        }
    }

    public class ThreadTx extends com.realsil.sdk.core.base.BaseThread<byte[]> {
        public ThreadTx() {
        }

        public void run() {
            com.realsil.sdk.core.logger.ZLogger.v("TxThread is running");
            while (!java.lang.Thread.currentThread().isInterrupted() && !isCanceled()) {
                byte[] bArr = (byte[]) take();
                if (bArr != null) {
                    com.realsil.sdk.bbpro.core.gatt.GattTransportLayer gattTransportLayer = com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.this;
                    gattTransportLayer.g = 0;
                    if (gattTransportLayer.a(bArr, false)) {
                        continue;
                    } else {
                        while (com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.this.g < 3) {
                            if (isCanceled()) {
                                return;
                            }
                            com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.this.g++;
                            com.realsil.sdk.core.logger.ZLogger.v("<< Retrans " + com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.this.g + ", data: " + com.realsil.sdk.core.utility.DataConverter.bytes2Hex(bArr));
                            if (com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.this.a(bArr, false)) {
                                break;
                            }
                            com.realsil.sdk.bbpro.core.gatt.GattTransportLayer gattTransportLayer2 = com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.this;
                            if (gattTransportLayer2.g >= 3 && gattTransportLayer2.b != null) {
                                com.realsil.sdk.core.logger.ZLogger.v(true, ">> ERR_TRANSPORT_RETRAINS_EXCEED_MAX_TIMES: 3");
                                com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.this.b.onError(64);
                            }
                        }
                    }
                }
            }
            com.realsil.sdk.core.logger.ZLogger.d("TxThread stopped");
        }
    }

    public GattTransportLayer(com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback transportLayerCallback) {
        this.b = transportLayerCallback;
        a();
    }

    public final com.realsil.sdk.bbpro.core.gatt.GattLayer a() {
        if (this.a == null) {
            this.a = new com.realsil.sdk.bbpro.core.gatt.GattLayer(this.j);
        }
        return this.a;
    }

    public final void b() {
        com.realsil.sdk.core.logger.ZLogger.v("stopRxSchedule.");
        com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.ThreadRx threadRx = this.i;
        if (threadRx != null) {
            threadRx.cancel(true);
        }
    }

    public final void c() {
        if (this.h != null) {
            com.realsil.sdk.core.logger.ZLogger.v("stopTxSchedule.");
            this.h.cancel(true);
            synchronized (this.f) {
                this.e = false;
                this.f.notifyAll();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.realsil.sdk.bbpro.core.gatt.GattTransportLayer$ThreadTx, java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.realsil.sdk.bbpro.core.gatt.GattTransportLayer$ThreadRx, java.lang.Thread] */
    public boolean connect(android.bluetooth.BluetoothDevice bluetoothDevice, android.bluetooth.BluetoothSocket bluetoothSocket) {
        this.c = 1;
        this.g = 0;
        this.d = 0;
        com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.ThreadTx threadTx = this.h;
        if (threadTx != null) {
            threadTx.cancel(true);
        }
        com.realsil.sdk.core.logger.ZLogger.v("startTxSchedule.");
        ?? threadTx2 = new com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.ThreadTx();
        this.h = threadTx2;
        threadTx2.start();
        com.realsil.sdk.core.logger.ZLogger.v("startRxSchedule.");
        com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.ThreadRx threadRx = this.i;
        if (threadRx != null) {
            threadRx.cancel(true);
        }
        ?? threadRx2 = new com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.ThreadRx();
        this.i = threadRx2;
        threadRx2.start();
        return this.a.connect(bluetoothDevice);
    }

    public void destory() {
        com.realsil.sdk.core.logger.ZLogger.v("destory");
        this.b = null;
        b();
        c();
    }

    public void disconnect() {
        com.realsil.sdk.core.logger.ZLogger.v("disconnect");
        b();
        c();
        com.realsil.sdk.bbpro.core.gatt.GattLayer gattLayer = this.a;
        if (gattLayer != null) {
            gattLayer.close();
        }
    }

    public void sendAck(short s, byte b) {
        byte[] encode = com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket.encode(this.c, com.realsil.sdk.bbpro.core.transportlayer.AckPacket.encode(s, b));
        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("[0x%02X ACK<-0x%04x]", java.lang.Integer.valueOf(this.c), java.lang.Short.valueOf(s)));
        int i = this.c;
        this.c = i != 255 ? i + 1 : 1;
        a(encode, true);
    }

    public boolean sendCmd(byte[] bArr) {
        byte[] encode = com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket.encode(this.c, bArr);
        if (encode == null) {
            return false;
        }
        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "<< 0x%02x (%d) %s", java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(encode.length), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(encode)));
        int i = this.c;
        this.c = i != 255 ? i + 1 : 1;
        com.realsil.sdk.bbpro.core.gatt.GattTransportLayer.ThreadTx threadTx = this.h;
        if (threadTx != null) {
            threadTx.addQueue(encode);
        }
        return true;
    }

    public final boolean a(byte[] bArr, boolean z) {
        if (!z) {
            this.e = false;
        }
        com.realsil.sdk.bbpro.core.gatt.GattLayer gattLayer = this.a;
        if (gattLayer == null || gattLayer.sendData(bArr)) {
            com.realsil.sdk.core.logger.ZLogger.w("send gatt data failed");
            return false;
        }
        if (z) {
            return true;
        }
        synchronized (this.f) {
            if (this.e) {
                return true;
            }
            try {
                this.f.wait(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL);
            } catch (java.lang.InterruptedException e) {
                com.realsil.sdk.core.logger.ZLogger.w(e.toString());
            }
            return this.e;
        }
    }
}
