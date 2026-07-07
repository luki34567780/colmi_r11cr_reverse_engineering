package com.oudmon.ble.base.communication.file;

/* loaded from: /tmp/dex/classes2.dex */
public class RecordHandle {
    private static final java.lang.String TAG = "RecondHandle";
    private static com.oudmon.ble.base.communication.file.RecordHandle mInstance;
    private java.lang.String fileName;
    private byte[] mDetails;
    private byte[] mDetailsName;
    private boolean mReceiving;
    private boolean mReceivingName;
    private static final java.util.UUID SERIAL_PORT_SERVICE = java.util.UUID.fromString("de5bf728-d711-4e47-af26-65e3012a5dc7");
    private static final java.util.UUID SERIAL_PORT_CHARACTER_NOTIFY = java.util.UUID.fromString("de5bf729-d711-4e47-af26-65e3012a5dc7");
    private static final java.util.UUID SERIAL_PORT_CHARACTER_WRITE = java.util.UUID.fromString("de5bf72a-d711-4e47-af26-65e3012a5dc7");
    private java.util.ArrayList<com.oudmon.ble.base.communication.entity.RecordEntity> fileNames = new java.util.ArrayList<>();
    private com.oudmon.ble.base.request.EnableNotifyRequest enableNotifyRequest = new com.oudmon.ble.base.request.EnableNotifyRequest(SERIAL_PORT_SERVICE, SERIAL_PORT_CHARACTER_NOTIFY, new com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback() { // from class: com.oudmon.ble.base.communication.file.RecordHandle.1
        @Override // com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback
        public void enable(boolean z) {
        }
    });
    private java.util.concurrent.CopyOnWriteArraySet<com.oudmon.ble.base.communication.file.IRecordCallback> mCallbackArray = new java.util.concurrent.CopyOnWriteArraySet<>();
    private int currFileType = 0;
    private int mReceivedCount = 0;
    private int mTotalCount = 0;
    private int mReceivedCountName = 0;
    private int mTotalCountName = 0;
    private com.oudmon.ble.base.communication.file.IRecordCallback mCallback = new com.oudmon.ble.base.communication.file.IRecordCallback() { // from class: com.oudmon.ble.base.communication.file.RecordHandle.2
        @Override // com.oudmon.ble.base.communication.file.IRecordCallback
        public void onFileNames(java.util.ArrayList<com.oudmon.ble.base.communication.entity.RecordEntity> arrayList) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.RecordHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IRecordCallback) it.next()).onFileNames(arrayList);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IRecordCallback
        public void onProgress(float f) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.RecordHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IRecordCallback) it.next()).onProgress(f);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IRecordCallback
        public void onComplete() {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.RecordHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IRecordCallback) it.next()).onComplete();
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IRecordCallback
        public void onReceiver(byte[] bArr) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.RecordHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IRecordCallback) it.next()).onReceiver(bArr);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.IRecordCallback
        public void onActionResult(int i) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.RecordHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.IRecordCallback) it.next()).onActionResult(i);
            }
        }
    };
    private com.oudmon.ble.base.bluetooth.OnGattEventCallback callback = new com.oudmon.ble.base.bluetooth.OnGattEventCallback() { // from class: com.oudmon.ble.base.communication.file.RecordHandle.3
        @Override // com.oudmon.ble.base.bluetooth.OnGattEventCallback
        public void onReceivedData(java.lang.String str, byte[] bArr) {
            if (bArr != null) {
                if ((bArr[0] & 255) != 188 || bArr[1] != -126) {
                    if (com.oudmon.ble.base.communication.file.RecordHandle.this.mReceiving) {
                        java.lang.System.arraycopy(bArr, 0, com.oudmon.ble.base.communication.file.RecordHandle.this.mDetails, com.oudmon.ble.base.communication.file.RecordHandle.this.mReceivedCount, bArr.length);
                        com.oudmon.ble.base.communication.file.RecordHandle.access$212(com.oudmon.ble.base.communication.file.RecordHandle.this, bArr.length);
                        com.oudmon.ble.base.communication.file.RecordHandle recordHandle = com.oudmon.ble.base.communication.file.RecordHandle.this;
                        recordHandle.mReceiving = recordHandle.mReceivedCount < com.oudmon.ble.base.communication.file.RecordHandle.this.mTotalCount;
                        if (com.oudmon.ble.base.communication.file.RecordHandle.this.mReceiving) {
                            return;
                        }
                        com.oudmon.ble.base.communication.file.RecordHandle recordHandle2 = com.oudmon.ble.base.communication.file.RecordHandle.this;
                        recordHandle2.parseRecord(recordHandle2.mDetails);
                        return;
                    }
                    if ((bArr[0] & 255) != 188 || bArr[1] != Byte.MIN_VALUE) {
                        if (com.oudmon.ble.base.communication.file.RecordHandle.this.mReceivingName) {
                            java.lang.System.arraycopy(bArr, 0, com.oudmon.ble.base.communication.file.RecordHandle.this.mDetailsName, com.oudmon.ble.base.communication.file.RecordHandle.this.mReceivedCountName, bArr.length);
                            com.oudmon.ble.base.communication.file.RecordHandle.access$712(com.oudmon.ble.base.communication.file.RecordHandle.this, bArr.length);
                            com.oudmon.ble.base.communication.file.RecordHandle recordHandle3 = com.oudmon.ble.base.communication.file.RecordHandle.this;
                            recordHandle3.mReceivingName = recordHandle3.mReceivedCountName < com.oudmon.ble.base.communication.file.RecordHandle.this.mTotalCountName;
                            if (com.oudmon.ble.base.communication.file.RecordHandle.this.mReceivingName) {
                                return;
                            }
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.oudmon.ble.base.communication.utils.ByteUtil.byteArrayToString(com.oudmon.ble.base.communication.file.RecordHandle.this.mDetailsName));
                            int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.communication.file.RecordHandle.this.mDetailsName, 1, 2));
                            if (com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.communication.file.RecordHandle.this.mDetailsName, 2, 3)) == 0) {
                                com.oudmon.ble.base.communication.file.RecordHandle.this.fileNames = new java.util.ArrayList();
                            }
                            if (bytesToInt > 0) {
                                int bytesToInt2 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.communication.file.RecordHandle.this.mDetailsName, 8, 9));
                                com.oudmon.ble.base.communication.file.RecordHandle recordHandle4 = com.oudmon.ble.base.communication.file.RecordHandle.this;
                                recordHandle4.parseRecordData(recordHandle4.mDetailsName, 4, 9, bytesToInt2, bytesToInt, 0);
                                return;
                            }
                            com.oudmon.ble.base.communication.file.RecordHandle.this.mCallback.onFileNames(com.oudmon.ble.base.communication.file.RecordHandle.this.fileNames);
                            return;
                        }
                        return;
                    }
                    com.oudmon.ble.base.communication.file.RecordHandle.this.mTotalCountName = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, 2);
                    com.oudmon.ble.base.communication.file.RecordHandle.this.mReceivedCountName = bArr.length - 6;
                    com.oudmon.ble.base.communication.file.RecordHandle recordHandle5 = com.oudmon.ble.base.communication.file.RecordHandle.this;
                    recordHandle5.mReceivingName = recordHandle5.mReceivedCountName < com.oudmon.ble.base.communication.file.RecordHandle.this.mTotalCountName;
                    com.oudmon.ble.base.communication.file.RecordHandle recordHandle6 = com.oudmon.ble.base.communication.file.RecordHandle.this;
                    recordHandle6.mDetailsName = new byte[recordHandle6.mTotalCountName];
                    java.lang.System.arraycopy(bArr, 6, com.oudmon.ble.base.communication.file.RecordHandle.this.mDetailsName, 0, com.oudmon.ble.base.communication.file.RecordHandle.this.mReceivedCountName);
                    if (com.oudmon.ble.base.communication.file.RecordHandle.this.mReceivingName) {
                        return;
                    }
                    int bytesToInt3 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.communication.file.RecordHandle.this.mDetailsName, 1, 2));
                    if (com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.communication.file.RecordHandle.this.mDetailsName, 2, 3)) == 0) {
                        com.oudmon.ble.base.communication.file.RecordHandle.this.fileNames = new java.util.ArrayList();
                    }
                    if (bytesToInt3 > 0) {
                        int bytesToInt4 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(com.oudmon.ble.base.communication.file.RecordHandle.this.mDetailsName, 8, 9));
                        com.oudmon.ble.base.communication.file.RecordHandle recordHandle7 = com.oudmon.ble.base.communication.file.RecordHandle.this;
                        recordHandle7.parseRecordData(recordHandle7.mDetailsName, 4, 9, bytesToInt4, bytesToInt3, 0);
                        return;
                    }
                    com.oudmon.ble.base.communication.file.RecordHandle.this.mCallback.onFileNames(com.oudmon.ble.base.communication.file.RecordHandle.this.fileNames);
                    return;
                }
                com.oudmon.ble.base.communication.file.RecordHandle.this.mTotalCount = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, 2);
                com.oudmon.ble.base.communication.file.RecordHandle.this.mReceivedCount = bArr.length - 6;
                com.oudmon.ble.base.communication.file.RecordHandle recordHandle8 = com.oudmon.ble.base.communication.file.RecordHandle.this;
                recordHandle8.mReceiving = recordHandle8.mReceivedCount < com.oudmon.ble.base.communication.file.RecordHandle.this.mTotalCount;
                com.oudmon.ble.base.communication.file.RecordHandle recordHandle9 = com.oudmon.ble.base.communication.file.RecordHandle.this;
                recordHandle9.mDetails = new byte[recordHandle9.mTotalCount];
                java.lang.System.arraycopy(bArr, 6, com.oudmon.ble.base.communication.file.RecordHandle.this.mDetails, 0, com.oudmon.ble.base.communication.file.RecordHandle.this.mReceivedCount);
                if (com.oudmon.ble.base.communication.file.RecordHandle.this.mReceiving) {
                    return;
                }
                com.oudmon.ble.base.communication.file.RecordHandle recordHandle10 = com.oudmon.ble.base.communication.file.RecordHandle.this;
                recordHandle10.parseRecord(recordHandle10.mDetails);
            }
        }
    };
    private int mPackageLength = com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength();

    static /* synthetic */ int access$212(com.oudmon.ble.base.communication.file.RecordHandle recordHandle, int i) {
        int i2 = recordHandle.mReceivedCount + i;
        recordHandle.mReceivedCount = i2;
        return i2;
    }

    static /* synthetic */ int access$712(com.oudmon.ble.base.communication.file.RecordHandle recordHandle, int i) {
        int i2 = recordHandle.mReceivedCountName + i;
        recordHandle.mReceivedCountName = i2;
        return i2;
    }

    public int getCurrFileType() {
        return this.currFileType;
    }

    public void setCurrFileType(int i) {
        this.currFileType = i;
    }

    public static com.oudmon.ble.base.communication.file.RecordHandle getInstance() {
        if (mInstance == null) {
            synchronized (com.oudmon.ble.base.communication.file.RecordHandle.class) {
                if (mInstance == null) {
                    mInstance = new com.oudmon.ble.base.communication.file.RecordHandle();
                }
            }
        }
        return mInstance;
    }

    private RecordHandle() {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "create FileHandle.. mPackageLength: " + this.mPackageLength);
    }

    public void initRegister() {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setCallback(this.callback);
    }

    public void setBleOperateManagerCallback() {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setCallback(this.callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseRecord(byte[] bArr) {
        int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 0, 4));
        int bytesToInt2 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 4, 8));
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, bytesToInt + "---" + bytesToInt2);
        try {
            this.mCallback.onProgress(java.lang.Math.min(java.lang.Float.parseFloat(new java.text.DecimalFormat("#.00", new java.text.DecimalFormatSymbols(java.util.Locale.US)).format(((bytesToInt2 * 1.0f) * 100.0f) / bytesToInt)), 100.0f));
            if (bytesToInt2 < bytesToInt) {
                this.mCallback.onReceiver(java.util.Arrays.copyOfRange(bArr, 8, bArr.length));
                readRecordFile(bytesToInt2 + 1, this.fileName);
            } else {
                this.mCallback.onComplete();
            }
        } catch (java.lang.NumberFormatException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseRecordData(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = i5 + 1;
        try {
            int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, i, i + 4));
            int i7 = i2 + i3;
            java.lang.String unicodeByteToStr = unicodeByteToStr(java.util.Arrays.copyOfRange(bArr, i2, i7));
            com.oudmon.ble.base.communication.entity.RecordEntity recordEntity = new com.oudmon.ble.base.communication.entity.RecordEntity();
            recordEntity.setFileName(unicodeByteToStr);
            recordEntity.setLength(bytesToInt);
            this.fileNames.add(recordEntity);
            if (i6 < i4) {
                int i8 = i2 + 4 + i3;
                parseRecordData(bArr, i7, i8 + 1, bArr[i8], i4, i6);
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

    public void registerCallback(com.oudmon.ble.base.communication.file.IRecordCallback iRecordCallback) {
        try {
            this.mCallbackArray.remove(iRecordCallback);
            this.mCallbackArray.add(iRecordCallback);
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
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4, new byte[]{3, (byte) i}), this.mPackageLength));
    }

    public void readRecordFile(int i, java.lang.String str) {
        resetPackageLength();
        this.fileName = str;
        byte[] intToByte = com.oudmon.ble.base.communication.utils.ByteUtil.intToByte(i, 4);
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
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(130, com.oudmon.ble.base.communication.utils.ByteUtil.concat(new byte[]{intToByte[0], intToByte[1], intToByte[2], intToByte[3], (byte) bytes.length}, bytes)), this.mPackageLength));
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
        throw new UnsupportedOperationException("Method not decompiled: com.oudmon.ble.base.communication.file.RecordHandle.charset(java.lang.String):java.lang.String");
    }

    private void resetPackageLength() {
        this.mPackageLength = com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "resetPackageLength.. mPackageLength: " + this.mPackageLength);
    }

    private void cmdCheck() {
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
}
