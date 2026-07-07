package com.oudmon.ble.base.bluetooth.spp.jieli;

/* loaded from: /tmp/dex/classes2.dex */
public class BleMusicHandle {
    public static int FileTypeMuSic = 3;
    private static final java.lang.String TAG = "SppHandle";
    private static com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle mInstance;
    private byte[] mFileSend;
    private byte[] mFileSendA;
    private byte[] mFileSendB;
    private int mPackageLength;
    private byte[] mReceivedData;
    private boolean mReceiving;
    private com.oudmon.ble.base.bluetooth.spp.SerialListener outSerialListener;
    private java.util.ArrayList<java.lang.String> fileNames = new java.util.ArrayList<>();
    private java.util.concurrent.CopyOnWriteArraySet<com.oudmon.ble.base.communication.file.IEbookCallback> mCallbackArray = new java.util.concurrent.CopyOnWriteArraySet<>();
    private int currFileType = 0;
    private com.oudmon.ble.base.bluetooth.spp.SerialListener serialListener = new com.oudmon.ble.base.bluetooth.spp.SerialListener() { // from class: com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.1
        @Override // com.oudmon.ble.base.bluetooth.spp.SerialListener
        public void onSerialRead(java.util.ArrayDeque<byte[]> arrayDeque) {
        }

        @Override // com.oudmon.ble.base.bluetooth.spp.SerialListener
        public void onSerialConnect() {
            if (com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.outSerialListener != null) {
                com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.outSerialListener.onSerialConnect();
            }
        }

        @Override // com.oudmon.ble.base.bluetooth.spp.SerialListener
        public void onSerialConnectError(java.lang.Exception exc) {
            if (com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.outSerialListener != null) {
                com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.outSerialListener.onSerialConnectError(exc);
            }
        }

        @Override // com.oudmon.ble.base.bluetooth.spp.SerialListener
        public void onSerialRead(byte[] bArr) {
            if (bArr != null) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.oudmon.ble.base.communication.utils.ByteUtil.byteArrayToString(bArr));
                if ((bArr[0] & 255) == 188 && bArr[1] == 49) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "初始化完成，开始向手环发送实际文件");
                    com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.cmdSendPacket();
                    return;
                }
                if ((bArr[0] & 255) == 188 && bArr[1] == 50) {
                    if (com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.readNextBigPocket()) {
                        float parseFloat = java.lang.Float.parseFloat(new java.text.DecimalFormat("#.00", new java.text.DecimalFormatSymbols(java.util.Locale.US)).format((((com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mPocketIndex * 1024) * 1.0f) * 100.0f) / com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.totalSize));
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "向手环发送数据进度: " + parseFloat + ", 包序: " + ((int) com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mPocketIndex) + "总包:" + com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.totalSize);
                        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallback.onProgress(java.lang.Math.min(parseFloat, 100.0f));
                        return;
                    }
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "向手环发送数据完毕, 包序: " + ((int) com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mPocketIndex));
                    com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.cmdCheck();
                    return;
                }
                if ((bArr[0] & 255) == 188 && bArr[1] == 51) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "===============回调 onComplete");
                    com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mFileSend = new byte[0];
                    com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallback.onComplete();
                    return;
                }
                if ((bArr[0] & 255) == 188 && bArr[1] == Byte.MIN_VALUE) {
                    int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 7, 8));
                    if (com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 8, 9)) == 0) {
                        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.fileNames = new java.util.ArrayList();
                    }
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(bytesToInt));
                    if (bytesToInt <= 0) {
                        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallback.onFileNames(com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.fileNames);
                        return;
                    } else {
                        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.parseEbookData(bArr, 11, com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 10, 11)), bytesToInt, 0);
                        return;
                    }
                }
                if ((bArr[0] & 255) == 188 && bArr[1] == -127) {
                    com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallback.onDeleteSuccess(com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 6, 7)));
                }
            }
        }

        @Override // com.oudmon.ble.base.bluetooth.spp.SerialListener
        public void onSerialIoError(java.lang.Exception exc) {
            if (com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.outSerialListener != null) {
                com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.outSerialListener.onSerialIoError(exc);
            }
        }
    };
    private com.oudmon.ble.base.communication.file.IEbookCallback mCallback = new com.oudmon.ble.base.communication.file.IEbookCallback() { // from class: com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.2
        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onFileNames(java.util.ArrayList<java.lang.String> arrayList) {
            java.util.Iterator it = com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IEbookCallback) it.next()).onFileNames(arrayList);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onProgress(float f) {
            java.util.Iterator it = com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IEbookCallback) it.next()).onProgress(f);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onComplete() {
            java.util.Iterator it = com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IEbookCallback) it.next()).onComplete();
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onDeleteSuccess(int i) {
            java.util.Iterator it = com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IEbookCallback) it.next()).onDeleteSuccess(i);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onActionResult(int i) {
            java.util.Iterator it = com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IEbookCallback) it.next()).onActionResult(i);
            }
        }
    };
    private short mPocketIndex = 0;
    private short mPocketIndexA = 0;
    private short mPocketIndexB = 0;
    private int totalSize = 1;
    private int sizeA = 1;
    private int sizeB = 1;
    private int mTotalCount = 0;
    private int mReceivedCount = 0;
    private com.oudmon.ble.base.bluetooth.OnGattEventCallback callback = new com.oudmon.ble.base.bluetooth.OnGattEventCallback() { // from class: com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.3
        @Override // com.oudmon.ble.base.bluetooth.OnGattEventCallback
        public void onReceivedData(java.lang.String str, byte[] bArr) {
            if (bArr != null) {
                if ((bArr[0] & 255) == 188 && bArr[1] == 49) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "初始化完成，开始向手环发送实际文件");
                    com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.cmdSendPacket();
                    return;
                }
                if ((bArr[0] & 255) == 188 && bArr[1] == 50) {
                    int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 6, 7));
                    if (bytesToInt == 0) {
                        if (com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.readNextBigPocket()) {
                            float parseFloat = java.lang.Float.parseFloat(new java.text.DecimalFormat("#.00", new java.text.DecimalFormatSymbols(java.util.Locale.US)).format((((com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mPocketIndex * 1024) * 1.0f) * 100.0f) / com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.totalSize));
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "向手环发送数据进度: " + parseFloat + ", 包序: " + ((int) com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mPocketIndex) + "总包:" + com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.totalSize);
                            com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallback.onProgress(java.lang.Math.min(parseFloat, 100.0f));
                            return;
                        }
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "向手环发送数据完毕, 包序: " + ((int) com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mPocketIndex));
                        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.cmdCheck();
                        return;
                    }
                    com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallback.onDeleteSuccess(bytesToInt);
                    return;
                }
                if ((bArr[0] & 255) == 188 && bArr[1] == 51) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "===============回调 onComplete");
                    com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mFileSend = new byte[0];
                    com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallback.onComplete();
                    return;
                }
                if ((bArr[0] & 255) != 188 || bArr[1] != Byte.MIN_VALUE) {
                    if (com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceiving) {
                        java.lang.System.arraycopy(bArr, 0, com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedData, com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedCount, bArr.length);
                        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.access$1112(com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this, bArr.length);
                        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle bleMusicHandle = com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this;
                        bleMusicHandle.mReceiving = bleMusicHandle.mReceivedCount < com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mTotalCount;
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件：->3 mTotalCount: " + com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mTotalCount + ", mReceivedCount: " + com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedCount + ", mReceiving: " + com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceiving);
                        if (com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceiving) {
                            return;
                        }
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件：->4 ->" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedData));
                        int bytesToInt2 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedData, 1, 2));
                        if (com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedData, 2, 3)) == 0) {
                            com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.fileNames = new java.util.ArrayList();
                        }
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(bytesToInt2));
                        if (bytesToInt2 > 0) {
                            int bytesToInt3 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedData, 4, 5));
                            com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle bleMusicHandle2 = com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this;
                            bleMusicHandle2.parseEbookData(bleMusicHandle2.mReceivedData, 5, bytesToInt3, bytesToInt2, 0);
                            return;
                        }
                        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallback.onFileNames(com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.fileNames);
                        return;
                    }
                    if ((bArr[0] & 255) == 188 && bArr[1] == -127) {
                        com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallback.onDeleteSuccess(com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 6, 7)));
                        return;
                    }
                    return;
                }
                com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mTotalCount = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, 2);
                com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedCount = bArr.length - 6;
                com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle bleMusicHandle3 = com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this;
                bleMusicHandle3.mReceivedData = new byte[bleMusicHandle3.mTotalCount];
                java.lang.System.arraycopy(bArr, 6, com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedData, 0, com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedCount);
                com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle bleMusicHandle4 = com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this;
                bleMusicHandle4.mReceiving = bleMusicHandle4.mReceivedCount < com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mTotalCount;
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件：-> 1mTotalCount: " + com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mTotalCount + ", mReceivedCount: " + com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedCount + ", mReceiving: " + com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceiving);
                if (com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceiving) {
                    return;
                }
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件：->2->" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedData));
                int bytesToInt4 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedData, 1, 2));
                if (com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedData, 2, 3)) == 0) {
                    com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.fileNames = new java.util.ArrayList();
                }
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(bytesToInt4));
                if (bytesToInt4 > 0) {
                    int bytesToInt5 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mReceivedData, 4, 5));
                    com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle bleMusicHandle5 = com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this;
                    bleMusicHandle5.parseEbookData(bleMusicHandle5.mReceivedData, 5, bytesToInt5, bytesToInt4, 0);
                    return;
                }
                com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.mCallback.onFileNames(com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.this.fileNames);
            }
        }
    };
    boolean mPocketIndexAFlag = false;

    public void endAndRelease() {
    }

    static /* synthetic */ int access$1112(com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle bleMusicHandle, int i) {
        int i2 = bleMusicHandle.mReceivedCount + i;
        bleMusicHandle.mReceivedCount = i2;
        return i2;
    }

    public int getCurrFileType() {
        return this.currFileType;
    }

    public void setCurrFileType(int i) {
        this.currFileType = i;
    }

    public void setOutSerialListener(com.oudmon.ble.base.bluetooth.spp.SerialListener serialListener) {
        this.outSerialListener = serialListener;
    }

    public static com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle getInstance() {
        if (mInstance == null) {
            synchronized (com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.class) {
                if (mInstance == null) {
                    mInstance = new com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle();
                }
            }
        }
        return mInstance;
    }

    private BleMusicHandle() {
        this.mPackageLength = 244;
        this.mPackageLength = com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "create FileHandle.. mPackageLength: " + this.mPackageLength);
    }

    public void initRegister() {
        registerMusicBleCallback();
        com.oudmon.ble.base.bluetooth.spp.SerialSocket.getInstance().setListener(this.serialListener);
    }

    public void registerMusicBleCallback() {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setCallback(this.callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseEbookData(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i4 + 1;
        int i6 = i2 + i;
        try {
            this.fileNames.add(unicodeByteToStr(java.util.Arrays.copyOfRange(bArr, i, i6)));
            if (i5 < i3) {
                parseEbookData(bArr, i6 + 1, bArr[i6], i3, i5);
            } else {
                this.mCallback.onFileNames(this.fileNames);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public java.lang.String unicodeByteToStr(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        while (i < bArr.length) {
            int i2 = i + 2;
            sb.append((char) com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, i, i2)));
            i = i2;
        }
        return sb.toString();
    }

    public void registerCallback(com.oudmon.ble.base.communication.file.IEbookCallback iEbookCallback) {
        try {
            this.mCallbackArray.remove(iEbookCallback);
            this.mCallbackArray.add(iEbookCallback);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void removeCallback(com.oudmon.ble.base.communication.file.ICallback iCallback) {
        try {
            this.mCallbackArray.remove(iCallback);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void clearCallback() {
        try {
            this.mCallbackArray.clear();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void start(int i) {
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4, new byte[]{1, (byte) i}), this.mPackageLength));
    }

    public void deleteMusic(int i, java.lang.String str) {
        try {
            byte[] bytes = str.getBytes(java.nio.charset.Charset.forName("unicode"));
            if (!com.oudmon.ble.base.communication.utils.ByteUtil.byteArrayToString(bytes).startsWith("fffe")) {
                int i2 = 0;
                while (i2 < bytes.length) {
                    int i3 = i2 + 2;
                    int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bytes, i2, i3));
                    bytes[i2] = (byte) com.oudmon.ble.base.communication.utils.ByteUtil.hiword(bytesToInt);
                    bytes[i2 + 1] = (byte) com.oudmon.ble.base.communication.utils.ByteUtil.loword(bytesToInt);
                    i2 = i3;
                }
            }
            com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(129, com.oudmon.ble.base.communication.utils.ByteUtil.concat(new byte[]{1, (byte) i, (byte) bytes.length}, bytes)), this.mPackageLength));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public boolean executeFilePrepare(java.lang.String str) {
        java.io.RandomAccessFile randomAccessFile;
        java.io.RandomAccessFile randomAccessFile2;
        if (this.currFileType != FileTypeMuSic) {
            return false;
        }
        if (!new java.io.File(str).exists()) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "准备发送的文件不存在！");
            return false;
        }
        try {
            this.mPocketIndexA = (short) 0;
            this.mPocketIndexB = (short) 0;
            this.mPocketIndex = (short) 0;
            randomAccessFile = null;
            try {
                try {
                    randomAccessFile2 = new java.io.RandomAccessFile(str, "r");
                } catch (java.lang.Exception e) {
                    e = e;
                }
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        try {
            byte[] bArr = new byte[(int) randomAccessFile2.length()];
            this.mFileSend = bArr;
            this.totalSize = bArr.length;
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "准备发送的文件.. dataSize = " + this.mFileSend.length + ", readSize = " + randomAccessFile2.read(bArr, 0, bArr.length));
            try {
                randomAccessFile2.close();
            } catch (java.io.IOException e3) {
                e3.printStackTrace();
            }
            return true;
        } catch (java.lang.Exception e4) {
            e = e4;
            randomAccessFile = randomAccessFile2;
            e.printStackTrace();
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException e5) {
                    e5.printStackTrace();
                }
            }
            return this.totalSize > 0;
        } catch (java.lang.Throwable th2) {
            th = th2;
            randomAccessFile = randomAccessFile2;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[Catch: Exception -> 0x0095, LOOP:0: B:17:0x0053->B:45:0x0053, LOOP_START, TryCatch #0 {Exception -> 0x0095, blocks: (B:3:0x0005, B:5:0x001a, B:8:0x001e, B:11:0x0026, B:15:0x004e, B:17:0x0053, B:48:0x006f, B:37:0x0080, B:40:0x0088, B:59:0x0091, B:61:0x002e, B:63:0x0032, B:66:0x0039, B:68:0x003f, B:70:0x0045), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String charset(java.lang.String r8) {
        /*
            java.lang.String r0 = "GBK"
            r1 = 3
            byte[] r2 = new byte[r1]
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L95
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L95
            r4.<init>(r8)     // Catch: java.lang.Exception -> L95
            r3.<init>(r4)     // Catch: java.lang.Exception -> L95
            r8 = 0
            r3.mark(r8)     // Catch: java.lang.Exception -> L95
            int r1 = r3.read(r2, r8, r1)     // Catch: java.lang.Exception -> L95
            r4 = -1
            if (r1 != r4) goto L1e
            r3.close()     // Catch: java.lang.Exception -> L95
            return r0
        L1e:
            r1 = r2[r8]     // Catch: java.lang.Exception -> L95
            java.lang.String r5 = "UTF-8"
            r6 = -2
            r7 = 1
            if (r1 != r4) goto L2e
            r1 = r2[r7]     // Catch: java.lang.Exception -> L95
            if (r1 != r6) goto L2e
            java.lang.String r0 = "UTF-16LE"
        L2c:
            r8 = 1
            goto L4e
        L2e:
            r1 = r2[r8]     // Catch: java.lang.Exception -> L95
            if (r1 != r6) goto L39
            r1 = r2[r7]     // Catch: java.lang.Exception -> L95
            if (r1 != r4) goto L39
            java.lang.String r0 = "UTF-16BE"
            goto L2c
        L39:
            r1 = r2[r8]     // Catch: java.lang.Exception -> L95
            r6 = -17
            if (r1 != r6) goto L4e
            r1 = r2[r7]     // Catch: java.lang.Exception -> L95
            r6 = -69
            if (r1 != r6) goto L4e
            r1 = 2
            r1 = r2[r1]     // Catch: java.lang.Exception -> L95
            r2 = -65
            if (r1 != r2) goto L4e
            r0 = r5
            goto L2c
        L4e:
            r3.reset()     // Catch: java.lang.Exception -> L95
            if (r8 != 0) goto L91
        L53:
            int r8 = r3.read()     // Catch: java.lang.Exception -> L95
            if (r8 == r4) goto L91
            r1 = 240(0xf0, float:3.36E-43)
            if (r8 < r1) goto L5e
            goto L91
        L5e:
            r1 = 191(0xbf, float:2.68E-43)
            r2 = 128(0x80, float:1.8E-43)
            if (r2 > r8) goto L67
            if (r8 > r1) goto L67
            goto L91
        L67:
            r6 = 192(0xc0, float:2.69E-43)
            if (r6 > r8) goto L78
            r6 = 223(0xdf, float:3.12E-43)
            if (r8 > r6) goto L78
            int r8 = r3.read()     // Catch: java.lang.Exception -> L95
            if (r2 > r8) goto L91
            if (r8 > r1) goto L91
            goto L53
        L78:
            r6 = 224(0xe0, float:3.14E-43)
            if (r6 > r8) goto L53
            r6 = 239(0xef, float:3.35E-43)
            if (r8 > r6) goto L53
            int r8 = r3.read()     // Catch: java.lang.Exception -> L95
            if (r2 > r8) goto L91
            if (r8 > r1) goto L91
            int r8 = r3.read()     // Catch: java.lang.Exception -> L95
            if (r2 > r8) goto L91
            if (r8 > r1) goto L91
            r0 = r5
        L91:
            r3.close()     // Catch: java.lang.Exception -> L95
            goto L99
        L95:
            r8 = move-exception
            r8.printStackTrace()
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oudmon.ble.base.bluetooth.spp.jieli.BleMusicHandle.charset(java.lang.String):java.lang.String");
    }

    public void cmdFileInit(java.lang.String str) {
        try {
            byte[] bytes = str.getBytes(java.nio.charset.Charset.forName("unicode"));
            if (!com.oudmon.ble.base.communication.utils.ByteUtil.byteArrayToString(bytes).startsWith("fffe")) {
                int i = 0;
                while (i < bytes.length) {
                    int i2 = i + 2;
                    int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bytes, i, i2));
                    bytes[i] = (byte) com.oudmon.ble.base.communication.utils.ByteUtil.hiword(bytesToInt);
                    bytes[i + 1] = (byte) com.oudmon.ble.base.communication.utils.ByteUtil.loword(bytesToInt);
                    i = i2;
                }
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.oudmon.ble.base.communication.utils.ByteUtil.byteArrayToString(bytes));
            byte[] bArr = new byte[bytes.length + 10];
            bArr[0] = (byte) this.currFileType;
            java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.intToBytes(this.totalSize), 0, bArr, 1, 4);
            bArr[9] = (byte) bytes.length;
            java.lang.System.arraycopy(bytes, 0, bArr, 10, bytes.length);
            sendPocketToBle(addHeader(49, bArr));
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "cmdFileInit.. 完成");
        } catch (java.lang.Exception e) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "cmdFileInit.. Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void cmdSendPacket() {
        if (this.mFileSend == null) {
            return;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "cmdSendPacket.. 开始发送数据，数据长度: " + this.totalSize);
        readNextBigPocket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean readNextBigPocket() {
        try {
            short s = this.mPocketIndex;
            int i = s * 1024;
            int i2 = this.totalSize;
            if (i < i2) {
                if (this.mFileSend.length > 0) {
                    int min = java.lang.Math.min(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2, i2 - (s * 1024));
                    byte[] bArr = new byte[min];
                    java.lang.System.arraycopy(this.mFileSend, this.mPocketIndex * 1024, bArr, 0, min);
                    byte[] compress = com.oudmon.ble.base.communication.CompressUtils.compress(bArr);
                    byte[] bArr2 = new byte[compress.length + 2];
                    java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) (this.mPocketIndex + 1)), 0, bArr2, 0, 2);
                    java.lang.System.arraycopy(compress, 0, bArr2, 2, compress.length);
                    sendPocketToBle(addHeader(50, bArr2));
                    this.mPocketIndex = (short) (this.mPocketIndex + 1);
                    return true;
                }
                short s2 = this.mPocketIndexA;
                int i3 = s2 * 1024;
                int i4 = this.sizeA;
                if (i3 < i4) {
                    int min2 = java.lang.Math.min(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2, i4 - (s2 * 1024));
                    byte[] bArr3 = new byte[min2];
                    java.lang.System.arraycopy(this.mFileSendA, this.mPocketIndexA * 1024, bArr3, 0, min2);
                    byte[] compress2 = com.oudmon.ble.base.communication.CompressUtils.compress(bArr3);
                    byte[] bArr4 = new byte[compress2.length + 2];
                    java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) (this.mPocketIndexA + 1)), 0, bArr4, 0, 2);
                    java.lang.System.arraycopy(compress2, 0, bArr4, 2, compress2.length);
                    sendPocketToBle(addHeader(50, bArr4));
                    short s3 = (short) (this.mPocketIndexA + 1);
                    this.mPocketIndexA = s3;
                    this.mPocketIndex = (short) (s3 + this.mPocketIndexB);
                    return true;
                }
                int min3 = java.lang.Math.min(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2, this.sizeB - (this.mPocketIndexB * 1024));
                byte[] bArr5 = new byte[min3];
                java.lang.System.arraycopy(this.mFileSendB, this.mPocketIndexB * 1024, bArr5, 0, min3);
                byte[] compress3 = com.oudmon.ble.base.communication.CompressUtils.compress(bArr5);
                byte[] bArr6 = new byte[compress3.length + 2];
                java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) (this.mPocketIndexA + this.mPocketIndexB + 1)), 0, bArr6, 0, 2);
                java.lang.System.arraycopy(compress3, 0, bArr6, 2, compress3.length);
                sendPocketToBle(addHeader(50, bArr6));
                short s4 = (short) (this.mPocketIndexB + 1);
                this.mPocketIndexB = s4;
                this.mPocketIndex = (short) (this.mPocketIndexA + s4);
                return true;
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件发送完毕");
            return false;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件发送异常: " + e.getMessage());
            return false;
        }
    }

    private void sendPocketToBle(byte[] bArr) {
        resetPackageLength();
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(bArr, this.mPackageLength));
    }

    private void resetPackageLength() {
        this.mPackageLength = com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "resetPackageLength.. mPackageLength: " + this.mPackageLength);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cmdCheck() {
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(51, null), this.mPackageLength));
    }

    private byte[] addHeader(int i, byte[] bArr) {
        byte[] bArr2 = new byte[(bArr == null ? 0 : bArr.length) + 6];
        bArr2[0] = -68;
        bArr2[1] = (byte) i;
        if (bArr != null && bArr.length > 0) {
            java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) bArr.length), 0, bArr2, 2, 2);
            java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) com.oudmon.ble.base.communication.utils.CRC16.calcCrc16(bArr)), 0, bArr2, 4, 2);
            java.lang.System.arraycopy(bArr, 0, bArr2, 6, bArr.length);
        } else {
            bArr2[4] = -1;
            bArr2[5] = -1;
        }
        return bArr2;
    }

    public java.util.List<java.util.List<byte[]>> subListBySegment(java.util.List<byte[]> list, int i) {
        java.util.List<byte[]> subList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        if (size > 0 && i > 0) {
            int i2 = size / i;
            for (int i3 = 0; i3 < i; i3++) {
                if (i3 == i - 1) {
                    subList = list.subList(i2 * i3, size);
                } else {
                    subList = list.subList(i2 * i3, (i3 + 1) * i2);
                }
                arrayList.add(subList);
            }
        } else {
            arrayList.add(list);
        }
        return arrayList;
    }
}
