package com.oudmon.ble.base.communication.file;

/* loaded from: /tmp/dex/classes2.dex */
public class EbookHandle {
    private static final java.lang.String TAG = "EbookHandle";
    private static com.oudmon.ble.base.communication.file.EbookHandle mInstance;
    private byte[] mFileSend;
    private byte[] mFileSendA;
    private byte[] mFileSendB;
    private byte[] mReceivedData;
    private boolean mReceiving;
    private static final java.util.UUID SERIAL_PORT_SERVICE = java.util.UUID.fromString("de5bf728-d711-4e47-af26-65e3012a5dc7");
    private static final java.util.UUID SERIAL_PORT_CHARACTER_NOTIFY = java.util.UUID.fromString("de5bf729-d711-4e47-af26-65e3012a5dc7");
    private static final java.util.UUID SERIAL_PORT_CHARACTER_WRITE = java.util.UUID.fromString("de5bf72a-d711-4e47-af26-65e3012a5dc7");
    public static int FileTypeEbook = 4;
    public static int FileTypeAlbum = 5;
    public static int FileTypeLYRICS = 6;
    private java.util.ArrayList<java.lang.String> fileNames = new java.util.ArrayList<>();
    private com.oudmon.ble.base.request.EnableNotifyRequest enableNotifyRequest = new com.oudmon.ble.base.request.EnableNotifyRequest(SERIAL_PORT_SERVICE, SERIAL_PORT_CHARACTER_NOTIFY, new com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback() { // from class: com.oudmon.ble.base.communication.file.EbookHandle.1
        @Override // com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback
        public void enable(boolean z) {
        }
    });
    private java.util.concurrent.CopyOnWriteArraySet<com.oudmon.ble.base.communication.file.IEbookCallback> mCallbackArray = new java.util.concurrent.CopyOnWriteArraySet<>();
    private int currFileType = 0;
    private java.lang.String logPath = "";
    private java.lang.String logPath1 = "";
    private com.oudmon.ble.base.communication.file.IEbookCallback mCallback = new com.oudmon.ble.base.communication.file.IEbookCallback() { // from class: com.oudmon.ble.base.communication.file.EbookHandle.2
        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onFileNames(java.util.ArrayList<java.lang.String> arrayList) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.EbookHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IEbookCallback) it.next()).onFileNames(arrayList);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onProgress(float f) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.EbookHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IEbookCallback) it.next()).onProgress(f);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onComplete() {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.EbookHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IEbookCallback) it.next()).onComplete();
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onDeleteSuccess(int i) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.EbookHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IEbookCallback) it.next()).onDeleteSuccess(i);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IEbookCallback
        public void onActionResult(int i) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.EbookHandle.this.mCallbackArray.iterator();
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
    private com.oudmon.ble.base.bluetooth.OnGattEventCallback callback = new com.oudmon.ble.base.bluetooth.OnGattEventCallback() { // from class: com.oudmon.ble.base.communication.file.EbookHandle.3
        @Override // com.oudmon.ble.base.bluetooth.OnGattEventCallback
        public void onReceivedData(java.lang.String str, byte[] bArr) {
            if (bArr != null) {
                if ((bArr[0] & 255) == 188 && bArr[1] == 49) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "初始化完成，开始向手环发送实际文件");
                    if (bArr[6] > 0) {
                        com.oudmon.ble.base.communication.file.EbookHandle.this.mCallback.onActionResult(bArr[6]);
                        return;
                    } else {
                        com.oudmon.ble.base.communication.file.EbookHandle.this.cmdSendPacket();
                        return;
                    }
                }
                if ((bArr[0] & 255) == 188 && bArr[1] == 50) {
                    if (com.oudmon.ble.base.communication.file.EbookHandle.this.readNextBigPocket()) {
                        float parseFloat = java.lang.Float.parseFloat(new java.text.DecimalFormat("#.00", new java.text.DecimalFormatSymbols(java.util.Locale.US)).format((((com.oudmon.ble.base.communication.file.EbookHandle.this.mPocketIndex * 1024) * 1.0f) * 100.0f) / com.oudmon.ble.base.communication.file.EbookHandle.this.totalSize));
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "向手环发送数据进度: " + parseFloat + ", 包序: " + ((int) com.oudmon.ble.base.communication.file.EbookHandle.this.mPocketIndex) + "总包:" + com.oudmon.ble.base.communication.file.EbookHandle.this.totalSize);
                        com.oudmon.ble.base.communication.file.EbookHandle.this.mCallback.onProgress(java.lang.Math.min(parseFloat, 100.0f));
                        return;
                    }
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "向手环发送数据完毕, 包序: " + ((int) com.oudmon.ble.base.communication.file.EbookHandle.this.mPocketIndex));
                    com.oudmon.ble.base.communication.file.EbookHandle.this.cmdCheck();
                    return;
                }
                if ((bArr[0] & 255) == 188 && bArr[1] == 51) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "===============回调 onComplete");
                    com.oudmon.ble.base.communication.file.EbookHandle.this.mFileSend = new byte[0];
                    if (bArr[6] > 0) {
                        com.oudmon.ble.base.communication.file.EbookHandle.this.mCallback.onActionResult(bArr[6]);
                        return;
                    } else {
                        com.oudmon.ble.base.communication.file.EbookHandle.this.mCallback.onComplete();
                        return;
                    }
                }
                if ((bArr[0] & 255) != 188 || bArr[1] != Byte.MIN_VALUE) {
                    if (com.oudmon.ble.base.communication.file.EbookHandle.this.mReceiving) {
                        java.lang.System.arraycopy(bArr, 0, com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedData, com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedCount, bArr.length);
                        com.oudmon.ble.base.communication.file.EbookHandle.access$812(com.oudmon.ble.base.communication.file.EbookHandle.this, bArr.length);
                        com.oudmon.ble.base.communication.file.EbookHandle ebookHandle = com.oudmon.ble.base.communication.file.EbookHandle.this;
                        ebookHandle.mReceiving = ebookHandle.mReceivedCount < com.oudmon.ble.base.communication.file.EbookHandle.this.mTotalCount;
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件：->3 mTotalCount: " + com.oudmon.ble.base.communication.file.EbookHandle.this.mTotalCount + ", mReceivedCount: " + com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedCount + ", mReceiving: " + com.oudmon.ble.base.communication.file.EbookHandle.this.mReceiving);
                        if (com.oudmon.ble.base.communication.file.EbookHandle.this.mReceiving) {
                            return;
                        }
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件：->4 ->" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedData));
                        int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedData, 1, 2));
                        if (com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedData, 2, 3)) == 0) {
                            com.oudmon.ble.base.communication.file.EbookHandle.this.fileNames = new java.util.ArrayList();
                        }
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(bytesToInt));
                        if (bytesToInt > 0) {
                            int bytesToInt2 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedData, 4, 5));
                            com.oudmon.ble.base.communication.file.EbookHandle ebookHandle2 = com.oudmon.ble.base.communication.file.EbookHandle.this;
                            ebookHandle2.parseEbookData(ebookHandle2.mReceivedData, 5, bytesToInt2, bytesToInt, 0);
                            return;
                        }
                        com.oudmon.ble.base.communication.file.EbookHandle.this.mCallback.onFileNames(com.oudmon.ble.base.communication.file.EbookHandle.this.fileNames);
                        return;
                    }
                    if ((bArr[0] & 255) == 188 && bArr[1] == -127) {
                        com.oudmon.ble.base.communication.file.EbookHandle.this.mCallback.onDeleteSuccess(com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 6, 7)));
                        return;
                    }
                    return;
                }
                com.oudmon.ble.base.communication.file.EbookHandle.this.mTotalCount = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, 2);
                com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedCount = bArr.length - 6;
                com.oudmon.ble.base.communication.file.EbookHandle ebookHandle3 = com.oudmon.ble.base.communication.file.EbookHandle.this;
                ebookHandle3.mReceivedData = new byte[ebookHandle3.mTotalCount];
                java.lang.System.arraycopy(bArr, 6, com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedData, 0, com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedCount);
                com.oudmon.ble.base.communication.file.EbookHandle ebookHandle4 = com.oudmon.ble.base.communication.file.EbookHandle.this;
                ebookHandle4.mReceiving = ebookHandle4.mReceivedCount < com.oudmon.ble.base.communication.file.EbookHandle.this.mTotalCount;
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件：-> 1mTotalCount: " + com.oudmon.ble.base.communication.file.EbookHandle.this.mTotalCount + ", mReceivedCount: " + com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedCount + ", mReceiving: " + com.oudmon.ble.base.communication.file.EbookHandle.this.mReceiving);
                if (com.oudmon.ble.base.communication.file.EbookHandle.this.mReceiving) {
                    return;
                }
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件：->2->" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedData));
                int bytesToInt3 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedData, 1, 2));
                if (com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedData, 2, 3)) == 0) {
                    com.oudmon.ble.base.communication.file.EbookHandle.this.fileNames = new java.util.ArrayList();
                }
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(bytesToInt3));
                if (bytesToInt3 > 0) {
                    int bytesToInt4 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.communication.file.EbookHandle.this.mReceivedData, 4, 5));
                    com.oudmon.ble.base.communication.file.EbookHandle ebookHandle5 = com.oudmon.ble.base.communication.file.EbookHandle.this;
                    ebookHandle5.parseEbookData(ebookHandle5.mReceivedData, 5, bytesToInt4, bytesToInt3, 0);
                    return;
                }
                com.oudmon.ble.base.communication.file.EbookHandle.this.mCallback.onFileNames(com.oudmon.ble.base.communication.file.EbookHandle.this.fileNames);
            }
        }
    };
    boolean mPocketIndexAFlag = false;
    private int mPackageLength = com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength();

    static /* synthetic */ int access$812(com.oudmon.ble.base.communication.file.EbookHandle ebookHandle, int i) {
        int i2 = ebookHandle.mReceivedCount + i;
        ebookHandle.mReceivedCount = i2;
        return i2;
    }

    public int getCurrFileType() {
        return this.currFileType;
    }

    public void setCurrFileType(int i) {
        this.currFileType = i;
    }

    public static com.oudmon.ble.base.communication.file.EbookHandle getInstance() {
        if (mInstance == null) {
            synchronized (com.oudmon.ble.base.communication.file.EbookHandle.class) {
                if (mInstance == null) {
                    mInstance = new com.oudmon.ble.base.communication.file.EbookHandle();
                }
            }
        }
        return mInstance;
    }

    private EbookHandle() {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "create FileHandle.. mPackageLength: " + this.mPackageLength);
    }

    public void initRegister() {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setCallback(this.callback);
    }

    public void setBleOperateManagerCallback() {
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
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4, new byte[]{2, (byte) i}), this.mPackageLength));
    }

    public void deleteEbook(int i, java.lang.String str) {
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
            com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(129, com.oudmon.ble.base.communication.utils.ByteUtil.concat(new byte[]{2, (byte) i, (byte) bytes.length}, bytes)), this.mPackageLength));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public boolean executeFilePrepare(java.lang.String str) {
        java.io.BufferedReader bufferedReader;
        java.io.RandomAccessFile randomAccessFile;
        int i = this.currFileType;
        java.io.BufferedReader bufferedReader2 = null;
        r3 = null;
        java.io.RandomAccessFile randomAccessFile2 = null;
        bufferedReader2 = null;
        if (i != FileTypeEbook && i != FileTypeLYRICS) {
            if (i != FileTypeAlbum) {
                return false;
            }
            if (!new java.io.File(str).exists()) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "准备发送的文件不存在！");
                return false;
            }
            try {
                try {
                    randomAccessFile = new java.io.RandomAccessFile(str, "r");
                } catch (java.lang.Exception e) {
                    e = e;
                }
            } catch (java.lang.Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[(int) randomAccessFile.length()];
                this.mFileSend = bArr;
                this.totalSize = bArr.length;
                this.mPocketIndex = (short) 0;
                com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "准备发送的文件.. dataSize = " + this.mFileSend.length + ", readSize = " + randomAccessFile.read(bArr, 0, bArr.length));
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException e2) {
                    e2.printStackTrace();
                }
                return true;
            } catch (java.lang.Exception e3) {
                e = e3;
                randomAccessFile2 = randomAccessFile;
                e.printStackTrace();
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (java.io.IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return false;
            } catch (java.lang.Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (java.io.IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "准备发送的文件不存在！");
            return false;
        }
        java.lang.String charset = charset(str);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, charset);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            try {
                try {
                    bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(str), charset));
                    while (true) {
                        try {
                            java.lang.String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            stringBuffer.append(readLine);
                            stringBuffer.append("\n");
                        } catch (java.io.IOException e6) {
                            e = e6;
                            bufferedReader2 = bufferedReader;
                            e.printStackTrace();
                            if (bufferedReader2 != null) {
                                bufferedReader2.close();
                            }
                            return false;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (java.io.IOException e7) {
                                    e7.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    java.lang.String stringBuffer2 = stringBuffer.toString();
                    this.mPocketIndexA = (short) 0;
                    this.mPocketIndexB = (short) 0;
                    this.mPocketIndex = (short) 0;
                    if (file.length() > 10485760) {
                        this.mFileSend = new byte[0];
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(stringBuffer2.length()));
                        int i2 = 2;
                        int length = stringBuffer2.length() / 2;
                        java.lang.String substring = stringBuffer2.substring(0, length);
                        java.lang.String substring2 = stringBuffer2.substring(length);
                        this.mFileSendA = substring.getBytes(java.nio.charset.Charset.forName("unicode"));
                        byte[] bytes = substring2.getBytes(java.nio.charset.Charset.forName("unicode"));
                        this.mFileSendB = bytes;
                        byte[] bArr2 = this.mFileSendA;
                        this.sizeA = bArr2.length;
                        this.sizeB = bytes.length;
                        if (!com.oudmon.ble.base.communication.utils.ByteUtil.byteArraySubToString(bArr2).startsWith("fffe")) {
                            int i3 = 0;
                            while (i3 < this.sizeA) {
                                int i4 = i3 + 2;
                                int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(this.mFileSendA, i3, i4));
                                this.mFileSendA[i3] = (byte) com.oudmon.ble.base.communication.utils.ByteUtil.hiword(bytesToInt);
                                this.mFileSendA[i3 + 1] = (byte) com.oudmon.ble.base.communication.utils.ByteUtil.loword(bytesToInt);
                                i3 = i4;
                            }
                        }
                        if (!com.oudmon.ble.base.communication.utils.ByteUtil.byteArraySubToString(this.mFileSendB).startsWith("fffe")) {
                            while (i2 < this.sizeB) {
                                int i5 = i2 + 2;
                                int bytesToInt2 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(this.mFileSendB, i2, i5));
                                this.mFileSendB[i2 - 2] = (byte) com.oudmon.ble.base.communication.utils.ByteUtil.hiword(bytesToInt2);
                                this.mFileSendB[i2 - 1] = (byte) com.oudmon.ble.base.communication.utils.ByteUtil.loword(bytesToInt2);
                                i2 = i5;
                            }
                        }
                        int i6 = 1024 - (this.sizeA % com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2);
                        byte[] bArr3 = new byte[i6];
                        java.lang.System.arraycopy(this.mFileSendB, 0, bArr3, 0, i6);
                        byte[] bArr4 = this.mFileSendB;
                        byte[] bArr5 = new byte[bArr4.length - i6];
                        java.lang.System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - i6);
                        byte[] concat = com.oudmon.ble.base.communication.utils.ByteUtil.concat(this.mFileSendA, bArr3);
                        this.mFileSendA = concat;
                        this.sizeA = concat.length;
                        this.mFileSendB = bArr5;
                        this.sizeB = bArr5.length;
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, this.sizeA + "----" + this.sizeB);
                        this.totalSize = this.sizeA + this.sizeB;
                    } else {
                        byte[] bytes2 = stringBuffer2.getBytes(java.nio.charset.Charset.forName("unicode"));
                        this.mFileSend = bytes2;
                        this.totalSize = bytes2.length;
                        if (!com.oudmon.ble.base.communication.utils.ByteUtil.byteArraySubToString(bytes2).startsWith("fffe")) {
                            int i7 = 0;
                            while (i7 < this.totalSize) {
                                int i8 = i7 + 2;
                                int bytesToInt3 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(this.mFileSend, i7, i8));
                                this.mFileSend[i7] = (byte) com.oudmon.ble.base.communication.utils.ByteUtil.hiword(bytesToInt3);
                                this.mFileSend[i7 + 1] = (byte) com.oudmon.ble.base.communication.utils.ByteUtil.loword(bytesToInt3);
                                i7 = i8;
                            }
                        }
                    }
                } catch (java.io.IOException e8) {
                    e8.printStackTrace();
                }
            } catch (java.io.IOException e9) {
                e = e9;
            }
            if (this.totalSize <= 0) {
                bufferedReader.close();
                return false;
            }
            try {
                bufferedReader.close();
            } catch (java.io.IOException e10) {
                e10.printStackTrace();
            }
            return true;
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    public boolean executeFilePrepareAlbum(byte[] bArr) {
        try {
            this.mFileSend = bArr;
            this.totalSize = bArr.length;
            this.mPocketIndex = (short) 0;
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "准备发送的文件.. dataSize = " + this.mFileSend.length + ", readSize = " + this.totalSize);
            return true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
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
        throw new UnsupportedOperationException("Method not decompiled: com.oudmon.ble.base.communication.file.EbookHandle.charset(java.lang.String):java.lang.String");
    }

    public void cmdFileInit(java.lang.String str) {
        try {
            setBleOperateManagerCallback();
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
        setBleOperateManagerCallback();
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
        setBleOperateManagerCallback();
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

    public void initPath(android.app.Application application) {
        this.logPath = application.getExternalFilesDir("") + "/log/" + new com.oudmon.ble.base.util.DateUtil().getY_M_D() + "1_log.txt";
        this.logPath1 = application.getExternalFilesDir("") + "/log/" + new com.oudmon.ble.base.util.DateUtil().getY_M_D() + "2_log.txt";
    }
}
