package com.oudmon.ble.base.communication.file;

/* loaded from: /tmp/dex/classes2.dex */
public class AvatarHandle {
    private static final java.lang.String TAG = "EbookHandle";
    private static com.oudmon.ble.base.communication.file.AvatarHandle mInstance;
    private byte[] mFileSend;
    private static final java.util.UUID SERIAL_PORT_SERVICE = java.util.UUID.fromString("de5bf728-d711-4e47-af26-65e3012a5dc7");
    private static final java.util.UUID SERIAL_PORT_CHARACTER_NOTIFY = java.util.UUID.fromString("de5bf729-d711-4e47-af26-65e3012a5dc7");
    private static final java.util.UUID SERIAL_PORT_CHARACTER_WRITE = java.util.UUID.fromString("de5bf72a-d711-4e47-af26-65e3012a5dc7");
    private java.util.ArrayList<java.lang.String> fileNames = new java.util.ArrayList<>();
    private com.oudmon.ble.base.request.EnableNotifyRequest enableNotifyRequest = new com.oudmon.ble.base.request.EnableNotifyRequest(SERIAL_PORT_SERVICE, SERIAL_PORT_CHARACTER_NOTIFY, new com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback() { // from class: com.oudmon.ble.base.communication.file.AvatarHandle.1
        @Override // com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback
        public void enable(boolean z) {
        }
    });
    private java.util.concurrent.CopyOnWriteArraySet<com.oudmon.ble.base.communication.file.IEbookCallback> mCallbackArray = new java.util.concurrent.CopyOnWriteArraySet<>();
    private int currFileType = 0;
    private com.oudmon.ble.base.communication.file.IEbookCallback mCallback = new com.oudmon.ble.base.communication.file.IEbookCallback() { // from class: com.oudmon.ble.base.communication.file.AvatarHandle.2
        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onFileNames(java.util.ArrayList<java.lang.String> arrayList) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.AvatarHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IEbookCallback) it.next()).onFileNames(arrayList);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onProgress(float f) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.AvatarHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IEbookCallback) it.next()).onProgress(f);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onComplete() {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.AvatarHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IEbookCallback) it.next()).onComplete();
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onDeleteSuccess(int i) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.AvatarHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IEbookCallback) it.next()).onDeleteSuccess(i);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onActionResult(int i) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.AvatarHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IEbookCallback) it.next()).onActionResult(i);
            }
        }
    };
    private short mPocketIndex = 0;
    private int totalCount = 1;
    private int totalSize = 1;
    private com.oudmon.ble.base.bluetooth.OnGattEventCallback callback = new com.oudmon.ble.base.bluetooth.OnGattEventCallback() { // from class: com.oudmon.ble.base.communication.file.AvatarHandle.3
        @Override // com.oudmon.ble.base.bluetooth.OnGattEventCallback
        public void onReceivedData(java.lang.String str, byte[] bArr) {
            if (bArr != null) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.oudmon.ble.base.communication.utils.ByteUtil.byteArrayToString(bArr));
                if ((bArr[0] & 255) == 188 && bArr[1] == 74) {
                    if (com.oudmon.ble.base.communication.file.AvatarHandle.this.readNextBigPocket()) {
                        float parseFloat = java.lang.Float.parseFloat(new java.text.DecimalFormat("#.00", new java.text.DecimalFormatSymbols(java.util.Locale.US)).format((((com.oudmon.ble.base.communication.file.AvatarHandle.this.mPocketIndex * 1024) * 1.0f) * 100.0f) / com.oudmon.ble.base.communication.file.AvatarHandle.this.totalSize));
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "向手环发送数据进度: " + parseFloat + ", 包序: " + ((int) com.oudmon.ble.base.communication.file.AvatarHandle.this.mPocketIndex) + "总包:" + com.oudmon.ble.base.communication.file.AvatarHandle.this.totalSize);
                        com.oudmon.ble.base.communication.file.AvatarHandle.this.mCallback.onProgress(java.lang.Math.min(parseFloat, 100.0f));
                        return;
                    }
                    com.oudmon.ble.base.communication.file.AvatarHandle.this.mCallback.onComplete();
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "向手环发送数据完毕, 包序: " + ((int) com.oudmon.ble.base.communication.file.AvatarHandle.this.mPocketIndex));
                }
            }
        }
    };
    private int mPackageLength = com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength();

    public int getCurrFileType() {
        return this.currFileType;
    }

    public void setCurrFileType(int i) {
        this.currFileType = i;
    }

    public static com.oudmon.ble.base.communication.file.AvatarHandle getInstance() {
        if (mInstance == null) {
            synchronized (com.oudmon.ble.base.communication.file.AvatarHandle.class) {
                if (mInstance == null) {
                    mInstance = new com.oudmon.ble.base.communication.file.AvatarHandle();
                }
            }
        }
        return mInstance;
    }

    private AvatarHandle() {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "create FileHandle.. mPackageLength: " + this.mPackageLength);
    }

    public void initRegister() {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setCallback(this.callback);
    }

    public void setBleOperateManagerCallback() {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setCallback(this.callback);
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

    public void cmdSendPacket() {
        setBleOperateManagerCallback();
        this.mPocketIndex = (short) 0;
        if (this.mFileSend == null) {
            return;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "cmdSendPacket.. 开始发送数据，数据长度: " + this.totalSize);
        readNextBigPocket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean readNextBigPocket() {
        try {
            setBleOperateManagerCallback();
            short s = this.mPocketIndex;
            int i = s * 1024;
            int i2 = this.totalSize;
            if (i < i2) {
                if (this.mFileSend.length > 0) {
                    int min = java.lang.Math.min(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2, i2 - (s * 1024));
                    byte[] bArr = new byte[min];
                    java.lang.System.arraycopy(this.mFileSend, this.mPocketIndex * 1024, bArr, 0, min);
                    byte[] compress = com.oudmon.ble.base.communication.CompressUtils.compress(bArr);
                    byte[] bArr2 = new byte[compress.length + 3];
                    java.lang.System.arraycopy(new byte[]{(byte) this.totalCount, (byte) (this.mPocketIndex + 1), 1}, 0, bArr2, 0, 3);
                    java.lang.System.arraycopy(compress, 0, bArr2, 3, compress.length);
                    sendPocketToBle(addHeader(74, bArr2));
                    this.mPocketIndex = (short) (this.mPocketIndex + 1);
                    return true;
                }
            } else {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件发送完毕");
            }
            return false;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件发送异常: " + e.getMessage());
            return false;
        }
    }

    private void sendPocketToBle(byte[] bArr) {
        setBleOperateManagerCallback();
        resetPackageLength();
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(bArr, this.mPackageLength));
    }

    private void resetPackageLength() {
        this.mPackageLength = com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "resetPackageLength.. mPackageLength: " + this.mPackageLength);
    }

    public boolean checkData(byte[] bArr) {
        this.mFileSend = bArr;
        this.totalSize = bArr.length;
        int length = bArr.length;
        int i = length / com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2;
        this.totalCount = i;
        if (length % com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2 != 0) {
            this.totalCount = i + 1;
        }
        setBleOperateManagerCallback();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "总包数: " + this.totalCount);
        return true;
    }

    public void endAndRelease() {
        this.enableNotifyRequest.setEnable(false);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().execute(this.enableNotifyRequest);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setCallback(null);
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
}
