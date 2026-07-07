package com.realsil.sdk.bbpro.core.transportlayer;

/* loaded from: /tmp/dex/classes2.dex */
public final class SppTransportLayer {
    public static boolean D = true;
    public static boolean n = true;
    public static volatile com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer o;
    public com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp b;
    public volatile int e;
    public volatile int f;
    public com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.CommandThread g;
    public com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.AckThread h;
    public com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.ThreadRx i;
    public volatile boolean j;
    public volatile com.realsil.sdk.bbpro.core.transportlayer.Command l;
    public java.util.UUID c = com.realsil.sdk.bbpro.core.transportlayer.TransportConnParams.VENDOR_SPP_UUID;
    public java.lang.Object d = new java.lang.Object();
    public final java.lang.Object k = new java.lang.Object();
    public com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback m = new com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback() { // from class: com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.1
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List<com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        public void onConnectionStateChanged(com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp, boolean z, int i) {
            super.onConnectionStateChanged(bluetoothSpp, z, i);
            android.bluetooth.BluetoothDevice device = bluetoothSpp.getDevice();
            java.lang.String address = device != null ? device.getAddress() : null;
            if (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.n) {
                com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "%s status: %b 0x%04X", com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(address, true), java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i)));
            }
            if (!z || i == 0) {
                com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.a();
            }
            try {
                synchronized (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.a) {
                    ?? r1 = com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.a;
                    if (r1 != 0 && r1.size() > 0) {
                        java.util.Iterator it = com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.a.iterator();
                        while (it.hasNext()) {
                            ((com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback) it.next()).onConnectionStateChanged(device, z, i);
                        }
                    }
                }
            } catch (java.lang.Exception e) {
                com.realsil.sdk.core.logger.ZLogger.w(e.toString());
            }
        }

        public void onDataReceive(byte[] bArr) {
            com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.ThreadRx threadRx = com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.i;
            if (threadRx == null || bArr == null) {
                return;
            }
            threadRx.addQueue(bArr);
        }
    };
    public java.util.List<com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback> a = new java.util.concurrent.CopyOnWriteArrayList();

    public class AckThread extends com.realsil.sdk.core.base.BaseThread<com.realsil.sdk.bbpro.core.transportlayer.Command> {
        public AckThread() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            byte[] encode;
            setName("AckThread");
            if (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.n) {
                com.realsil.sdk.core.logger.ZLogger.v("AckThread is running...");
            }
            while (!java.lang.Thread.currentThread().isInterrupted() && !isCanceled()) {
                com.realsil.sdk.bbpro.core.transportlayer.Command command = (com.realsil.sdk.bbpro.core.transportlayer.Command) take();
                if (command != null) {
                    if (command.getPayload() == null) {
                        com.realsil.sdk.core.logger.ZLogger.v("payload == null");
                    } else {
                        synchronized (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.d) {
                            encode = command.encode(com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.e);
                            com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.a(com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this);
                        }
                        com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.b().write(encode);
                    }
                }
            }
            if (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.n) {
                com.realsil.sdk.core.logger.ZLogger.v("TxThread stopped");
            }
        }
    }

    public class CommandThread extends com.realsil.sdk.core.base.BaseThread<com.realsil.sdk.bbpro.core.transportlayer.Command> {
        public CommandThread() {
        }

        public final boolean a(com.realsil.sdk.bbpro.core.transportlayer.Command command) {
            byte[] encode;
            boolean write;
            synchronized (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.d) {
                encode = command.encode(com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.e);
                com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.a(com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this);
            }
            if (command.getWriteType() == 1) {
                return com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.b().write(encode);
            }
            boolean z = false;
            com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.j = false;
            int i = 0;
            do {
                write = com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.b().write(encode);
                if (!write) {
                    break;
                }
                synchronized (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.k) {
                    if (!com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.j) {
                        try {
                            com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.k.wait(500L);
                        } catch (java.lang.InterruptedException e) {
                            com.realsil.sdk.core.logger.ZLogger.w(e.toString());
                        }
                        z = !com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.j;
                        write = com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.j;
                        if (!com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.j) {
                            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.n, "ACK timeout for 500 ms");
                        }
                    }
                }
                i++;
                if (i > command.getRetransCount()) {
                    break;
                }
            } while (z);
            return write;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            setName("CommandThread");
            if (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.n) {
                com.realsil.sdk.core.logger.ZLogger.v("CommandThread is running...");
            }
            com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.l = null;
            while (!java.lang.Thread.currentThread().isInterrupted() && !isCanceled()) {
                com.realsil.sdk.bbpro.core.transportlayer.Command command = (com.realsil.sdk.bbpro.core.transportlayer.Command) take();
                if (command != null) {
                    if (command.isCommandIdAvailable()) {
                        com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.l = command;
                    }
                    a(command);
                }
            }
            com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.l = null;
            if (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.n) {
                com.realsil.sdk.core.logger.ZLogger.v("TxThread stopped");
            }
        }
    }

    public class ThreadRx extends com.realsil.sdk.core.base.BaseThread<byte[]> {
        public ThreadRx() {
        }

        /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List<com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List<com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List<com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
        public final synchronized void a(com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket transportLayerPacket) {
            short opcode = transportLayerPacket.getOpcode();
            transportLayerPacket.getPayload();
            byte[] parameters = transportLayerPacket.getParameters();
            boolean z = transportLayerPacket.getSeqNum() == com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.f;
            com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.f = transportLayerPacket.getSeqNum();
            if (!transportLayerPacket.isAckPkt()) {
                com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.sendAck(transportLayerPacket.getOpcode(), (byte) 0);
                if (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.D) {
                    com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "[0x%02X(%b) PACK->0x%04X] %s", java.lang.Byte.valueOf(transportLayerPacket.getSeqNum()), java.lang.Boolean.valueOf(z), java.lang.Short.valueOf(opcode), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(parameters)));
                }
                if (!z) {
                    try {
                        if (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.l != null && com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.l.getEventId() == transportLayerPacket.getOpcode()) {
                            com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.c();
                            com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.l = null;
                        }
                        synchronized (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.a) {
                            ?? r1 = com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.a;
                            if (r1 != 0 && r1.size() > 0) {
                                java.util.Iterator it = com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.a.iterator();
                                while (it.hasNext()) {
                                    ((com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback) it.next()).onDataReceive(transportLayerPacket);
                                }
                            }
                        }
                    } catch (java.lang.Exception e) {
                        com.realsil.sdk.core.logger.ZLogger.w(e.toString());
                    }
                }
                return;
            }
            if (z) {
                return;
            }
            com.realsil.sdk.bbpro.core.transportlayer.AckPacket ackPacket = transportLayerPacket.toAckPacket();
            if (ackPacket != null) {
                if (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.D) {
                    com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "[0x%02X ACK->0x%04X] 0x%02X", java.lang.Byte.valueOf(transportLayerPacket.getSeqNum()), java.lang.Short.valueOf(ackPacket.getToAckId()), java.lang.Byte.valueOf(ackPacket.getStatus())));
                }
                try {
                    if (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.l == null) {
                        com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.c();
                    } else if (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.l.getCommandId() == ackPacket.getToAckId()) {
                        com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.c();
                        com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.l = null;
                    } else {
                        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.n, java.lang.String.format("ignore ACK, expect is 0x%04X", java.lang.Short.valueOf(com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.l.getCommandId())));
                    }
                    synchronized (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.a) {
                        ?? r0 = com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.a;
                        if (r0 != 0 && r0.size() > 0) {
                            java.util.Iterator it2 = com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.this.a.iterator();
                            while (it2.hasNext()) {
                                ((com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback) it2.next()).onAckReceive(ackPacket);
                            }
                        }
                    }
                } catch (java.lang.Exception e2) {
                    com.realsil.sdk.core.logger.ZLogger.e(e2.toString());
                }
            } else {
                com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "[0x%02X NA->0x%04X] %s", java.lang.Byte.valueOf(transportLayerPacket.getSeqNum()), java.lang.Short.valueOf(opcode), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(parameters)));
            }
            return;
        }

        public void run() {
            if (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.D) {
                com.realsil.sdk.core.logger.ZLogger.d("RxThread is running");
            }
            while (!java.lang.Thread.currentThread().isInterrupted() && !isCanceled()) {
                byte[] bArr = (byte[]) take();
                if (bArr != null) {
                    int length = bArr.length;
                    int i = 0;
                    do {
                        int i2 = length - i;
                        if (i2 <= 0) {
                            break;
                        }
                        try {
                            byte[] bArr2 = new byte[i2];
                            java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
                            com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket builderPacket = com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket.builderPacket(bArr2);
                            if (builderPacket == null) {
                                break;
                            }
                            a(builderPacket);
                            i += builderPacket.getPacketLength();
                        } catch (java.lang.Exception e) {
                            com.realsil.sdk.core.logger.ZLogger.w(e.toString());
                        }
                    } while (i < length);
                }
            }
            if (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.D) {
                com.realsil.sdk.core.logger.ZLogger.d("RxThread stopped");
            }
        }
    }

    public SppTransportLayer() {
        D = com.realsil.sdk.core.RtkCore.DEBUG;
        n = com.realsil.sdk.core.RtkCore.VDBG;
    }

    public static synchronized com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer getInstance() {
        com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer sppTransportLayer;
        synchronized (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.class) {
            if (o == null) {
                synchronized (com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.class) {
                    if (o == null) {
                        o = new com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer();
                    }
                }
            }
            sppTransportLayer = o;
        }
        return sppTransportLayer;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer$AckThread, java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer$ThreadRx, java.lang.Thread] */
    public final boolean a(android.bluetooth.BluetoothDevice bluetoothDevice, android.bluetooth.BluetoothSocket bluetoothSocket, java.util.UUID uuid, int i) {
        if (bluetoothDevice == null) {
            return false;
        }
        if (b().isConnected(bluetoothDevice)) {
            com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback bluetoothSppCallback = this.m;
            if (bluetoothSppCallback != null) {
                bluetoothSppCallback.onConnectionStateChanged(b(), true, 512);
            }
            return true;
        }
        this.e = 1;
        this.f = 0;
        d();
        com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.AckThread ackThread = this.h;
        if (ackThread != null) {
            ackThread.cancel(true);
        }
        if (n) {
            com.realsil.sdk.core.logger.ZLogger.v("startAckThread.");
        }
        ?? ackThread2 = new com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.AckThread();
        this.h = ackThread2;
        ackThread2.start();
        com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.ThreadRx threadRx = this.i;
        if (threadRx != null) {
            threadRx.cancel(true);
        }
        ?? threadRx2 = new com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.ThreadRx();
        this.i = threadRx2;
        threadRx2.start();
        if (n) {
            com.realsil.sdk.core.bluetooth.impl.BluetoothDeviceImpl.dumpSupportedUuids(bluetoothDevice);
        }
        android.os.ParcelUuid uuid2 = com.realsil.sdk.bbpro.core.Utils.getUuid(bluetoothDevice.getUuids(), uuid, true);
        if (uuid2 != null) {
            com.realsil.sdk.core.logger.ZLogger.v(D, "use pref spp: " + uuid);
        } else {
            if (i == 1) {
                com.realsil.sdk.core.logger.ZLogger.w(D, "not find pref spp: " + uuid);
                return false;
            }
            uuid2 = com.realsil.sdk.bbpro.core.transportlayer.TransportConnParams.WELL_KNOWN_SPP_UUID;
            com.realsil.sdk.core.logger.ZLogger.v(D, "use well-known spp: " + uuid2.toString());
        }
        this.c = uuid2.getUuid();
        return b().connect(new com.realsil.sdk.core.bluetooth.connection.legacy.SppConnParameters.Builder(bluetoothDevice).bluetoothSocket(bluetoothSocket).uuid(uuid2.getUuid()).build());
    }

    public final com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp b() {
        if (this.b == null) {
            this.b = new com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp(this.m);
        }
        return this.b;
    }

    public final void c() {
        synchronized (this.k) {
            this.j = true;
            this.k.notifyAll();
        }
    }

    public boolean connect(android.bluetooth.BluetoothDevice bluetoothDevice, android.bluetooth.BluetoothSocket bluetoothSocket) {
        return a(bluetoothDevice, bluetoothSocket, this.c, 0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer$CommandThread, java.lang.Thread] */
    public final void d() {
        com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.CommandThread commandThread = this.g;
        if (commandThread != null) {
            commandThread.cancel(true);
        }
        if (n) {
            com.realsil.sdk.core.logger.ZLogger.v("startTxSchedule.");
        }
        ?? commandThread2 = new com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer.CommandThread();
        this.g = commandThread2;
        commandThread2.start();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public void destory() {
        if (n) {
            com.realsil.sdk.core.logger.ZLogger.v("destory");
        }
        synchronized (this.a) {
            ?? r1 = this.a;
            if (r1 != 0) {
                r1.clear();
            }
        }
        if (this.i != null) {
            if (n) {
                com.realsil.sdk.core.logger.ZLogger.v("stopRxSchedule.");
            }
            this.i.clearQueue();
            this.i.cancel(true);
        }
        if (this.g != null) {
            if (n) {
                com.realsil.sdk.core.logger.ZLogger.v("stopTxSchedule.");
            }
            this.g.clearQueue();
            this.g.cancel(true);
            c();
        }
        if (this.h != null) {
            if (n) {
                com.realsil.sdk.core.logger.ZLogger.v("stopAckThread.");
            }
            this.h.clearQueue();
            this.h.cancel(true);
            c();
        }
        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp = this.b;
        if (bluetoothSpp != null) {
            bluetoothSpp.destroy();
            this.b = null;
        }
    }

    public void disconnect() {
        a();
        if (this.b != null) {
            if (n) {
                com.realsil.sdk.core.logger.ZLogger.v("disconnect");
            }
            this.b.stop();
        }
    }

    public int getConnectionState() {
        return b().getConnectionState();
    }

    public boolean isConnected(android.bluetooth.BluetoothDevice bluetoothDevice) {
        com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp bluetoothSpp = this.b;
        if (bluetoothSpp == null) {
            return false;
        }
        return bluetoothSpp.isConnected(bluetoothDevice);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List<com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public void register(com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback transportLayerCallback) {
        synchronized (this.a) {
            if (this.a == null) {
                this.a = new java.util.concurrent.CopyOnWriteArrayList();
            }
            if (!this.a.contains(transportLayerCallback)) {
                this.a.add(transportLayerCallback);
            }
            if (n) {
                com.realsil.sdk.core.logger.ZLogger.v("callback's size=" + this.a.size());
            }
        }
    }

    public synchronized boolean sendAck(com.realsil.sdk.bbpro.core.transportlayer.Command command) {
        if (command == null) {
            return false;
        }
        if (this.h == null) {
            d();
        }
        if (this.h == null) {
            return false;
        }
        if (n) {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "<< writeType=%d, (%d)%s", java.lang.Integer.valueOf(command.getWriteType()), java.lang.Integer.valueOf(command.getPayloadLength()), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(command.getPayload())));
        }
        this.h.addQueue(command);
        return true;
    }

    public boolean sendCmd(byte[] bArr) {
        return sendCommand(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).payload(bArr).build());
    }

    public synchronized boolean sendCommand(com.realsil.sdk.bbpro.core.transportlayer.Command command) {
        if (command == null) {
            return false;
        }
        if (this.g == null) {
            d();
        }
        if (this.g == null) {
            return false;
        }
        if (n) {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "<< writeType=%d, (%d)%s", java.lang.Integer.valueOf(command.getWriteType()), java.lang.Integer.valueOf(command.getPayloadLength()), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(command.getPayload())));
        }
        this.g.addQueue(command);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback>, java.util.concurrent.CopyOnWriteArrayList] */
    public void unregister(com.realsil.sdk.bbpro.core.transportlayer.TransportLayerCallback transportLayerCallback) {
        synchronized (this.a) {
            ?? r1 = this.a;
            if (r1 != 0) {
                r1.remove(transportLayerCallback);
            }
        }
    }

    public boolean connect(android.bluetooth.BluetoothDevice bluetoothDevice, android.bluetooth.BluetoothSocket bluetoothSocket, java.util.UUID uuid) {
        return a(bluetoothDevice, bluetoothSocket, uuid, 0);
    }

    public boolean connect(com.realsil.sdk.bbpro.core.transportlayer.TransportConnParams transportConnParams) {
        if (transportConnParams == null) {
            com.realsil.sdk.core.logger.ZLogger.w("connParams can not be null");
            return false;
        }
        return a(transportConnParams.getBluetoothDevice(), transportConnParams.getBluetoothSocket(), transportConnParams.getUuid(), transportConnParams.getTransport());
    }

    public boolean sendCmd(short s, byte[] bArr) {
        return sendCommand(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(s, bArr).build());
    }

    public boolean sendAck(short s, byte b) {
        return sendAck(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(1).commandId(s).payload(com.realsil.sdk.bbpro.core.transportlayer.AckPacket.encode(s, b)).build());
    }

    public boolean sendCommand(short s, short s2, byte[] bArr) {
        return sendCommand(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(s, bArr).eventId(s2).build());
    }

    public final void a() {
        if (this.i != null) {
            if (n) {
                com.realsil.sdk.core.logger.ZLogger.v("clearRx");
            }
            this.i.clearQueue();
            this.i.cancel(true);
        }
        if (this.g != null) {
            if (n) {
                com.realsil.sdk.core.logger.ZLogger.v("clearTx.");
            }
            this.g.clearQueue();
            c();
        }
        if (this.h != null) {
            if (n) {
                com.realsil.sdk.core.logger.ZLogger.v("clearAck.");
            }
            this.h.clearQueue();
            c();
        }
    }

    public static void a(com.realsil.sdk.bbpro.core.transportlayer.SppTransportLayer sppTransportLayer) {
        if (sppTransportLayer.e != 255) {
            sppTransportLayer.e++;
        } else {
            sppTransportLayer.e = 1;
        }
    }
}
