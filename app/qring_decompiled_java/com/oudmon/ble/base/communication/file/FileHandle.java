package com.oudmon.ble.base.communication.file;

/* loaded from: /tmp/dex/classes2.dex */
public class FileHandle {
    private static final byte ACTION_A_GPS = 84;
    private static final byte ACTION_ONCE = 38;
    private static final byte ACTION_PLATE = 53;
    private static final byte ACTION_SERIES = 37;
    private static final java.lang.String TAG = "FileHandle";
    public static final int TypeDismissFile = 3;
    public static final int TypeDiyWatchFace = 2;
    public static final int TypeMarketWatchFace = 1;
    public static final int TypeOtaFile = 4;
    private static com.oudmon.ble.base.communication.file.FileHandle mInstance;
    private byte[] mFileSend;
    private byte[] mReceivedData;
    private boolean mReceiving;
    private int noDataCount;
    private static final java.util.UUID SERIAL_PORT_SERVICE = java.util.UUID.fromString("de5bf728-d711-4e47-af26-65e3012a5dc7");
    private static final java.util.UUID SERIAL_PORT_CHARACTER_NOTIFY = java.util.UUID.fromString("de5bf729-d711-4e47-af26-65e3012a5dc7");
    private static final java.util.UUID SERIAL_PORT_CHARACTER_WRITE = java.util.UUID.fromString("de5bf72a-d711-4e47-af26-65e3012a5dc7");
    private com.oudmon.ble.base.request.EnableNotifyRequest enableNotifyRequest = new com.oudmon.ble.base.request.EnableNotifyRequest(SERIAL_PORT_SERVICE, SERIAL_PORT_CHARACTER_NOTIFY, new com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback() { // from class: com.oudmon.ble.base.communication.file.FileHandle.1
        @Override // com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback
        public void enable(boolean z) {
        }
    });
    private java.util.concurrent.CopyOnWriteArraySet<com.oudmon.ble.base.communication.file.ICallback> mCallbackArray = new java.util.concurrent.CopyOnWriteArraySet<>();
    private int currFileType = 0;
    private java.lang.String notDataString = "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
    private com.oudmon.ble.base.communication.file.ICallback mCallback = new com.oudmon.ble.base.communication.file.ICallback() { // from class: com.oudmon.ble.base.communication.file.FileHandle.2
        @Override // com.oudmon.ble.base.communication.file.ICallback
        public void onRequestAGPS() {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.FileHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.ICallback) it.next()).onRequestAGPS();
            }
        }

        @Override // com.oudmon.ble.base.communication.file.ICallback
        public void onUpdatePlate(java.util.List<com.oudmon.ble.base.communication.file.PlateEntity> list) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.FileHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.ICallback) it.next()).onUpdatePlate(list);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.ICallback
        public void onUpdatePlateError(int i) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.FileHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.ICallback) it.next()).onUpdatePlateError(i);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.ICallback
        public void onDeletePlate() {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.FileHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.ICallback) it.next()).onDeletePlate();
            }
        }

        @Override // com.oudmon.ble.base.communication.file.ICallback
        public void onDeletePlateError(int i) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.FileHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.ICallback) it.next()).onDeletePlateError(i);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.ICallback
        public void onUpdateTemperature(com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity temperatureEntity) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.FileHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.ICallback) it.next()).onUpdateTemperature(temperatureEntity);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.ICallback
        public void onUpdateTemperatureList(java.util.List<com.oudmon.ble.base.communication.dfu_temperature.TemperatureOnceEntity> list) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.FileHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.ICallback) it.next()).onUpdateTemperatureList(list);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.ICallback
        public void onFileNames(java.util.ArrayList<java.lang.String> arrayList) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.FileHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.ICallback) it.next()).onFileNames(arrayList);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.ICallback
        public void onProgress(int i) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.FileHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.ICallback) it.next()).onProgress(i);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.ICallback
        public void onComplete() {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.FileHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.ICallback) it.next()).onComplete();
            }
        }

        @Override // com.oudmon.ble.base.communication.file.ICallback
        public void onActionResult(int i, int i2) {
            java.util.Iterator it = com.oudmon.ble.base.communication.file.FileHandle.this.mCallbackArray.iterator();
            while (it.hasNext()) {
                ((com.oudmon.ble.base.communication.file.ICallback) it.next()).onActionResult(i, i2);
            }
        }
    };
    private short mPocketIndex = 0;
    private boolean mPlateReceivedFinished = true;
    private boolean mTemperatureReceivedFinished = true;
    private boolean mTemperatureOnceReceivedFinished = true;
    private int mTotalCount = 0;
    private int mReceivedCount = 0;
    private java.util.List<java.lang.String> mFileNames = new java.util.ArrayList();
    private com.oudmon.ble.base.bluetooth.OnGattEventCallback callback = new com.oudmon.ble.base.bluetooth.OnGattEventCallback() { // from class: com.oudmon.ble.base.communication.file.FileHandle.3
        @Override // com.oudmon.ble.base.bluetooth.OnGattEventCallback
        public void onReceivedData(java.lang.String str, byte[] bArr) {
            if (bArr != null) {
                if ((bArr[0] & 255) != 188 || bArr[1] != 53) {
                    if (!com.oudmon.ble.base.communication.file.FileHandle.this.mPlateReceivedFinished) {
                        try {
                            java.lang.System.arraycopy(bArr, 0, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount, bArr.length);
                            com.oudmon.ble.base.communication.file.FileHandle.access$212(com.oudmon.ble.base.communication.file.FileHandle.this, bArr.length);
                            com.oudmon.ble.base.communication.file.FileHandle fileHandle = com.oudmon.ble.base.communication.file.FileHandle.this;
                            fileHandle.mPlateReceivedFinished = fileHandle.mReceivedCount >= com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount;
                            if (com.oudmon.ble.base.communication.file.FileHandle.this.mPlateReceivedFinished) {
                                if (com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData.length > 2) {
                                    com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onUpdatePlate(com.oudmon.ble.base.communication.file.DataHelper.parsePlate(com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData));
                                } else {
                                    com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onUpdatePlate(new java.util.ArrayList());
                                }
                            }
                            return;
                        } catch (java.lang.Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    if ((bArr[0] & 255) == 188 && bArr[1] == 84) {
                        if (bArr[2] == 0) {
                            com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onRequestAGPS();
                            return;
                        }
                        if (com.oudmon.ble.base.communication.file.FileHandle.this.sendNextBigPocket()) {
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "向手环发送数据进度: " + (((com.oudmon.ble.base.communication.file.FileHandle.this.mPocketIndex * 1024) * 100) / com.oudmon.ble.base.communication.file.FileHandle.this.mFileSend.length) + ", 包序: " + ((int) com.oudmon.ble.base.communication.file.FileHandle.this.mPocketIndex));
                            return;
                        }
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "向手环发送数据完毕, 包序: " + ((int) com.oudmon.ble.base.communication.file.FileHandle.this.mPocketIndex));
                        com.oudmon.ble.base.communication.file.FileHandle.this.cmdCheck();
                        return;
                    }
                    if ((bArr[0] & 255) != 188 || bArr[1] != 37) {
                        if (!com.oudmon.ble.base.communication.file.FileHandle.this.mTemperatureReceivedFinished) {
                            java.lang.System.arraycopy(bArr, 0, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount, bArr.length);
                            com.oudmon.ble.base.communication.file.FileHandle.access$212(com.oudmon.ble.base.communication.file.FileHandle.this, bArr.length);
                            com.oudmon.ble.base.communication.file.FileHandle fileHandle2 = com.oudmon.ble.base.communication.file.FileHandle.this;
                            fileHandle2.mTemperatureReceivedFinished = fileHandle2.mReceivedCount >= com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount;
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceivedData.. mTotalCount: " + com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount + ", mReceivedCount: " + com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount + ", mTemperatureReceivedFinished: " + com.oudmon.ble.base.communication.file.FileHandle.this.mTemperatureReceivedFinished);
                            if (com.oudmon.ble.base.communication.file.FileHandle.this.mTemperatureReceivedFinished) {
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceiver All Temperature data: " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData));
                                if (com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData.length > 2) {
                                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "mCallback: " + com.oudmon.ble.base.communication.file.FileHandle.this.mCallback + ", class: " + com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.getClass());
                                    com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onUpdateTemperature(com.oudmon.ble.base.communication.file.DataHelper.parseTemperature(com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if ((bArr[0] & 255) != 188 || bArr[1] != 38) {
                            if (!com.oudmon.ble.base.communication.file.FileHandle.this.mTemperatureOnceReceivedFinished) {
                                java.lang.System.arraycopy(bArr, 0, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount, bArr.length);
                                com.oudmon.ble.base.communication.file.FileHandle.access$212(com.oudmon.ble.base.communication.file.FileHandle.this, bArr.length);
                                com.oudmon.ble.base.communication.file.FileHandle fileHandle3 = com.oudmon.ble.base.communication.file.FileHandle.this;
                                fileHandle3.mTemperatureOnceReceivedFinished = fileHandle3.mReceivedCount >= com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount;
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceivedData.. mTotalCount: " + com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount + ", mReceivedCount: " + com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount + ", mTemperatureOnceReceivedFinished: " + com.oudmon.ble.base.communication.file.FileHandle.this.mTemperatureOnceReceivedFinished);
                                if (com.oudmon.ble.base.communication.file.FileHandle.this.mTemperatureOnceReceivedFinished) {
                                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceiver All Temperature once data: " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData));
                                    if (com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData.length > 2) {
                                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "mCallback: " + com.oudmon.ble.base.communication.file.FileHandle.this.mCallback + ", class: " + com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.getClass());
                                        com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onUpdateTemperatureList(com.oudmon.ble.base.communication.file.DataHelper.parseTemperatureOnce(com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            if ((bArr[0] & 255) != 188 || bArr[1] != 48) {
                                if (com.oudmon.ble.base.communication.file.FileHandle.this.mReceiving) {
                                    java.lang.System.arraycopy(bArr, 0, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount, bArr.length);
                                    com.oudmon.ble.base.communication.file.FileHandle.access$212(com.oudmon.ble.base.communication.file.FileHandle.this, bArr.length);
                                    com.oudmon.ble.base.communication.file.FileHandle fileHandle4 = com.oudmon.ble.base.communication.file.FileHandle.this;
                                    fileHandle4.mReceiving = fileHandle4.mReceivedCount < com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount;
                                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件：->3 mTotalCount: " + com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount + ", mReceivedCount: " + com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount + ", mReceiving: " + com.oudmon.ble.base.communication.file.FileHandle.this.mReceiving);
                                    if (com.oudmon.ble.base.communication.file.FileHandle.this.mReceiving) {
                                        return;
                                    }
                                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件：->4 ->" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData));
                                    com.oudmon.ble.base.communication.file.FileHandle fileHandle5 = com.oudmon.ble.base.communication.file.FileHandle.this;
                                    fileHandle5.parseFileInfo(fileHandle5.mReceivedData);
                                    com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onFileNames((java.util.ArrayList) com.oudmon.ble.base.communication.file.FileHandle.this.mFileNames);
                                    return;
                                }
                                if ((bArr[0] & 255) == 188 && bArr[1] == 49) {
                                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "初始化完成，开始向手环发送实际文件");
                                    com.oudmon.ble.base.communication.file.FileHandle.this.cmdSendPacket();
                                    return;
                                }
                                if ((bArr[0] & 255) == 188 && bArr[1] == 50) {
                                    if (com.oudmon.ble.base.communication.file.FileHandle.this.readNextBigPocket()) {
                                        int length = ((com.oudmon.ble.base.communication.file.FileHandle.this.mPocketIndex * 1024) * 100) / com.oudmon.ble.base.communication.file.FileHandle.this.mFileSend.length;
                                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "向手环发送数据进度: " + length + ", 包序: " + ((int) com.oudmon.ble.base.communication.file.FileHandle.this.mPocketIndex));
                                        com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onProgress(java.lang.Math.min(length, 100));
                                        return;
                                    }
                                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "向手环发送数据完毕, 包序: " + ((int) com.oudmon.ble.base.communication.file.FileHandle.this.mPocketIndex));
                                    com.oudmon.ble.base.communication.file.FileHandle.this.cmdCheck();
                                    return;
                                }
                                if ((bArr[0] & 255) == 188 && bArr[1] == 51) {
                                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "===============回调 onComplete");
                                    com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onComplete();
                                    return;
                                }
                                if ((bArr[0] & 255) == 188 && bArr[1] == 54) {
                                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "初始化完成，开始向手环发送实际文件");
                                    if (bArr.length <= 6 || bArr[6] <= 0) {
                                        com.oudmon.ble.base.communication.file.FileHandle.this.executeFileSend(55);
                                        return;
                                    } else {
                                        com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onUpdatePlateError(bArr[6]);
                                        return;
                                    }
                                }
                                if ((bArr[0] & 255) == 188 && bArr[1] == 55) {
                                    if (com.oudmon.ble.base.communication.file.FileHandle.this.executeNextSend(55)) {
                                        int length2 = ((com.oudmon.ble.base.communication.file.FileHandle.this.mPocketIndex * 1024) * 100) / com.oudmon.ble.base.communication.file.FileHandle.this.mFileSend.length;
                                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "向手环发送数据进度: " + length2 + ", 包序: " + ((int) com.oudmon.ble.base.communication.file.FileHandle.this.mPocketIndex));
                                        com.oudmon.ble.base.util.LogToFile.getInstance().wtf("向手环发送数据进度: " + length2 + ", 包序: " + ((int) com.oudmon.ble.base.communication.file.FileHandle.this.mPocketIndex));
                                        com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onProgress(java.lang.Math.min(length2, 100));
                                        return;
                                    }
                                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "向手环发送数据完毕, 包序: " + ((int) com.oudmon.ble.base.communication.file.FileHandle.this.mPocketIndex));
                                    com.oudmon.ble.base.communication.file.FileHandle.this.executeFileFinished(56);
                                    return;
                                }
                                if ((bArr[0] & 255) == 188 && bArr[1] == 56) {
                                    if (bArr[6] > 0) {
                                        com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onUpdatePlateError(666);
                                        return;
                                    } else {
                                        com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onComplete();
                                        return;
                                    }
                                }
                                if ((bArr[0] & 255) == 188 && bArr[1] == 57) {
                                    if (bArr.length <= 6 || bArr[6] <= 0) {
                                        com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onDeletePlate();
                                        return;
                                    } else {
                                        com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onDeletePlateError(bArr[6]);
                                        return;
                                    }
                                }
                                return;
                            }
                            com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, 2);
                            com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount = bArr.length - 6;
                            com.oudmon.ble.base.communication.file.FileHandle fileHandle6 = com.oudmon.ble.base.communication.file.FileHandle.this;
                            fileHandle6.mReceivedData = new byte[fileHandle6.mTotalCount];
                            java.lang.System.arraycopy(bArr, 6, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData, 0, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount);
                            com.oudmon.ble.base.communication.file.FileHandle fileHandle7 = com.oudmon.ble.base.communication.file.FileHandle.this;
                            fileHandle7.mReceiving = fileHandle7.mReceivedCount < com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount;
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件：-> 1mTotalCount: " + com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount + ", mReceivedCount: " + com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount + ", mReceiving: " + com.oudmon.ble.base.communication.file.FileHandle.this.mReceiving);
                            if (com.oudmon.ble.base.communication.file.FileHandle.this.mReceiving) {
                                return;
                            }
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "文件：->2->" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData));
                            com.oudmon.ble.base.communication.file.FileHandle fileHandle8 = com.oudmon.ble.base.communication.file.FileHandle.this;
                            fileHandle8.parseFileInfo(fileHandle8.mReceivedData);
                            com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onFileNames((java.util.ArrayList) com.oudmon.ble.base.communication.file.FileHandle.this.mFileNames);
                            return;
                        }
                        com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, 2);
                        if (com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount == 0) {
                            return;
                        }
                        com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount = bArr.length - 6;
                        com.oudmon.ble.base.communication.file.FileHandle fileHandle9 = com.oudmon.ble.base.communication.file.FileHandle.this;
                        fileHandle9.mReceivedData = new byte[fileHandle9.mTotalCount];
                        java.lang.System.arraycopy(bArr, 6, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData, 0, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount);
                        com.oudmon.ble.base.communication.file.FileHandle fileHandle10 = com.oudmon.ble.base.communication.file.FileHandle.this;
                        fileHandle10.mTemperatureOnceReceivedFinished = fileHandle10.mReceivedCount >= com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount;
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceivedData.. mTotalCount: " + com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount + ", mReceivedCount: " + com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount + ", mTemperatureOnceReceivedFinished: " + com.oudmon.ble.base.communication.file.FileHandle.this.mTemperatureOnceReceivedFinished);
                        if (com.oudmon.ble.base.communication.file.FileHandle.this.mTemperatureOnceReceivedFinished) {
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceiver All Temperature once data: " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData));
                            if (com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData.length <= 2) {
                                com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onUpdateTemperatureList(null);
                                return;
                            }
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "mCallback: " + com.oudmon.ble.base.communication.file.FileHandle.this.mCallback + ", class: " + com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.getClass());
                            com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onUpdateTemperatureList(com.oudmon.ble.base.communication.file.DataHelper.parseTemperatureOnce(com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData));
                            return;
                        }
                        return;
                    }
                    com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, 2);
                    if (com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount == 0) {
                        return;
                    }
                    com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount = bArr.length - 6;
                    com.oudmon.ble.base.communication.file.FileHandle fileHandle11 = com.oudmon.ble.base.communication.file.FileHandle.this;
                    fileHandle11.mReceivedData = new byte[fileHandle11.mTotalCount];
                    java.lang.System.arraycopy(bArr, 6, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData, 0, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount);
                    com.oudmon.ble.base.communication.file.FileHandle fileHandle12 = com.oudmon.ble.base.communication.file.FileHandle.this;
                    fileHandle12.mTemperatureReceivedFinished = fileHandle12.mReceivedCount >= com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount;
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceivedData.. mTotalCount: " + com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount + ", mReceivedCount: " + com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount + ", mTemperatureReceivedFinished: " + com.oudmon.ble.base.communication.file.FileHandle.this.mTemperatureReceivedFinished);
                    if (com.oudmon.ble.base.communication.file.FileHandle.this.mTemperatureReceivedFinished) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceiver All Temperature data: " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData));
                        if (com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData.length > 2) {
                            com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onUpdateTemperature(com.oudmon.ble.base.communication.file.DataHelper.parseTemperature(com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData));
                            return;
                        } else {
                            com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onUpdateTemperature(null);
                            return;
                        }
                    }
                    return;
                }
                com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, 2);
                if (com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount == 0) {
                    return;
                }
                com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount = bArr.length - 6;
                com.oudmon.ble.base.communication.file.FileHandle fileHandle13 = com.oudmon.ble.base.communication.file.FileHandle.this;
                fileHandle13.mReceivedData = new byte[fileHandle13.mTotalCount];
                java.lang.System.arraycopy(bArr, 6, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData, 0, com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount);
                com.oudmon.ble.base.communication.file.FileHandle fileHandle14 = com.oudmon.ble.base.communication.file.FileHandle.this;
                fileHandle14.mPlateReceivedFinished = fileHandle14.mReceivedCount >= com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount;
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceivedData.. mTotalCount: " + com.oudmon.ble.base.communication.file.FileHandle.this.mTotalCount + ", mReceivedCount: " + com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedCount + ", mPlateReceivedFinished: " + com.oudmon.ble.base.communication.file.FileHandle.this.mPlateReceivedFinished);
                if (com.oudmon.ble.base.communication.file.FileHandle.this.mPlateReceivedFinished) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceiver All Temperature data: " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData));
                    if (com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData.length > 2) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.oudmon.ble.base.communication.file.DataHelper.parsePlate(com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData));
                        com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onUpdatePlate(com.oudmon.ble.base.communication.file.DataHelper.parsePlate(com.oudmon.ble.base.communication.file.FileHandle.this.mReceivedData));
                    } else {
                        com.oudmon.ble.base.communication.file.FileHandle.this.mCallback.onUpdatePlate(new java.util.ArrayList());
                    }
                }
            }
        }
    };
    private int mPackageLength = com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength();

    static /* synthetic */ int access$212(com.oudmon.ble.base.communication.file.FileHandle fileHandle, int i) {
        int i2 = fileHandle.mReceivedCount + i;
        fileHandle.mReceivedCount = i2;
        return i2;
    }

    public int getCurrFileType() {
        return this.currFileType;
    }

    public void setCurrFileType(int i) {
        this.currFileType = i;
    }

    public static com.oudmon.ble.base.communication.file.FileHandle getInstance() {
        if (mInstance == null) {
            synchronized (com.oudmon.ble.base.communication.file.FileHandle.class) {
                if (mInstance == null) {
                    mInstance = new com.oudmon.ble.base.communication.file.FileHandle();
                }
            }
        }
        return mInstance;
    }

    private FileHandle() {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "create FileHandle.. mPackageLength: " + this.mPackageLength);
    }

    public void initRegister() {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setCallback(this.callback);
    }

    public void setBleOperateManagerCallback() {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setCallback(this.callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseFileInfo(byte[] bArr) {
        this.mFileNames.clear();
        try {
            if (bArr[0] > 0) {
                int i = 0;
                while (i < bArr.length - 1) {
                    int i2 = bArr[i + 1];
                    byte[] bArr2 = new byte[i2];
                    java.lang.System.arraycopy(bArr, i + 2, bArr2, 0, i2);
                    i += i2 + 1;
                    java.lang.String str = new java.lang.String(bArr2);
                    this.mFileNames.add(str);
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "fileLength: " + i2 + ", fileName: " + str);
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void registerCallback(com.oudmon.ble.base.communication.file.ICallback iCallback) {
        try {
            this.mCallbackArray.remove(iCallback);
            this.mCallbackArray.add(iCallback);
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

    public void startObtainTemperatureSeries(int i) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "startObtainSeries... ");
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(37, new byte[]{(byte) i}), this.mPackageLength));
    }

    public void startObtainTemperatureOnce(int i) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "startObtainOnce... ");
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(38, new byte[]{(byte) i}), this.mPackageLength));
    }

    public void startObtainPlate() {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "startObtainPlate... ");
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(53, null), this.mPackageLength));
    }

    public void start() {
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(48, null), this.mPackageLength));
    }

    @java.lang.Deprecated
    public void testSend() {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "testSend... ");
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().execute(getWriteRequest(addHeader(84, null)));
    }

    public boolean checkFile(java.lang.String str) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "准备发送的文件路径：" + str);
        if (!new java.io.File(str).exists()) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "准备发送的文件不存在！");
            return false;
        }
        try {
            this.mFileSend = fileToByteStr(str);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "准备发送的文件.. dataSize=" + this.mFileSend.length + "  readSize=" + this.mFileSend.length);
            return true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean checkData(byte[] bArr) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "checkData... dataSize: " + bArr.length);
        this.mFileSend = bArr;
        return true;
    }

    public static byte[] fileToByteStr(java.lang.String str) {
        byte[] bArr = null;
        try {
            java.io.File file = new java.io.File(str);
            if (file.exists() && file.isFile()) {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str);
                bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                return bArr;
            }
            return null;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return bArr;
        }
    }

    public boolean executeFilePrepare(java.lang.String str) {
        java.io.RandomAccessFile randomAccessFile;
        this.noDataCount = 0;
        if (!new java.io.File(str).exists()) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "准备发送的文件不存在！");
            return false;
        }
        java.io.RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new java.io.RandomAccessFile(str, "r");
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            this.mFileSend = bArr;
            int read = randomAccessFile.read(bArr, 0, bArr.length);
            com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "准备发送的文件.. dataSize = " + this.mFileSend.length + ", readSize = " + read);
            com.oudmon.ble.base.util.LogToFile logToFile = com.oudmon.ble.base.util.LogToFile.getInstance();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("文件本地路径:");
            sb.append(str);
            logToFile.wtf(sb.toString());
            com.oudmon.ble.base.util.LogToFile.getInstance().wtf("准备发送的文件.. dataSize = " + this.mFileSend.length + ", readSize = " + read);
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

    public void executeFileInit(java.lang.String str, int i) {
        try {
            setBleOperateManagerCallback();
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "executeFileInit.. 开始");
            byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
            byte[] bArr = new byte[bytes.length + 10];
            bArr[0] = 1;
            java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.intToBytes(this.mFileSend.length), 0, bArr, 1, 4);
            bArr[9] = (byte) bytes.length;
            java.lang.System.arraycopy(bytes, 0, bArr, 10, bytes.length);
            sendPocketToBle(addHeader(i, bArr));
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "executeFileInit.. 完成");
        } catch (java.lang.Exception e) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "executeFileInit.. Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeFileSend(int i) {
        setBleOperateManagerCallback();
        this.mPocketIndex = (short) 0;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "executeFileSend.. 开始发送数据，数据长度: " + this.mFileSend.length);
        executeNextSend(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean executeNextSend(int i) {
        try {
            setBleOperateManagerCallback();
            short s = this.mPocketIndex;
            int i2 = s * 1024;
            byte[] bArr = this.mFileSend;
            if (i2 < bArr.length) {
                int min = java.lang.Math.min(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2, bArr.length - (s * 1024));
                byte[] bArr2 = new byte[min];
                java.lang.System.arraycopy(this.mFileSend, this.mPocketIndex * 1024, bArr2, 0, min);
                byte[] compress = com.oudmon.ble.base.communication.CompressUtils.compress(bArr2);
                byte[] bArr3 = new byte[compress.length + 2];
                java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) (this.mPocketIndex + 1)), 0, bArr3, 0, 2);
                java.lang.System.arraycopy(compress, 0, bArr3, 2, compress.length);
                sendPocketToBle(addHeader(i, bArr3));
                this.mPocketIndex = (short) (this.mPocketIndex + 1);
                if (this.notDataString.equalsIgnoreCase(com.oudmon.ble.base.communication.utils.ByteUtil.byteArrayToString(bArr2)) && i == 55) {
                    this.noDataCount++;
                    com.oudmon.ble.base.util.LogToFile.getInstance().wtf("表盘下发异常，全为0的数据" + this.noDataCount);
                    if (this.noDataCount > 30) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "表盘下发异常，全为0的数据");
                        return false;
                    }
                } else {
                    this.noDataCount = 0;
                }
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

    /* JADX INFO: Access modifiers changed from: private */
    public void executeFileFinished(int i) {
        setBleOperateManagerCallback();
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(i, null), this.mPackageLength));
    }

    public void executeFileDelete(java.lang.String str) {
        setBleOperateManagerCallback();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "executeFileDelete.. name: " + str);
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "executeFileDelete.. fileNames: " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bytes));
        byte[] bArr = new byte[bytes.length + 1];
        bArr[0] = 1;
        java.lang.System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "executeFileDelete.. data: " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bArr));
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(57, bArr), this.mPackageLength));
    }

    public void executeMusicSend(boolean z, int i, int i2, java.lang.String str) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "executeMusicSend.. playing: " + z + ", progress: " + i + ", volume: " + i2 + ", name: " + str);
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("executeMusicSend.. nameBytes: ");
        sb.append(com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bytes));
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sb.toString());
        byte[] bArr = new byte[bytes.length + 3];
        bArr[0] = (byte) (!z ? 1 : 0);
        bArr[1] = (byte) i;
        bArr[2] = (byte) i2;
        java.lang.System.arraycopy(bytes, 0, bArr, 3, bytes.length);
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(6, bArr), this.mPackageLength));
    }

    public void cmdFileInit(java.lang.String str) {
        try {
            setBleOperateManagerCallback();
            byte[] bytes = str.getBytes("UTF-8");
            byte[] bArr = new byte[bytes.length + 10];
            bArr[0] = 1;
            java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.intToBytes(this.mFileSend.length), 0, bArr, 1, 4);
            bArr[9] = (byte) bytes.length;
            java.lang.System.arraycopy(bytes, 0, bArr, 10, bytes.length);
            sendPocketToBle(addHeader(49, bArr));
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "cmdFileInit.. 完成");
        } catch (java.lang.Exception e) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "cmdFileInit.. Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void startGpsOnline() {
        this.mPocketIndex = (short) 0;
        sendNextBigPocket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean sendNextBigPocket() {
        try {
            setBleOperateManagerCallback();
            short s = this.mPocketIndex;
            int i = s * 1024;
            byte[] bArr = this.mFileSend;
            if (i < bArr.length) {
                int min = java.lang.Math.min(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2, bArr.length - (s * 1024));
                byte[] bArr2 = new byte[min];
                java.lang.System.arraycopy(this.mFileSend, this.mPocketIndex * 1024, bArr2, 0, min);
                byte[] compress = com.oudmon.ble.base.communication.CompressUtils.compress(bArr2);
                byte[] bArr3 = new byte[compress.length + 2];
                java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) (this.mPocketIndex + 1)), 0, bArr3, 0, 2);
                java.lang.System.arraycopy(compress, 0, bArr3, 2, compress.length);
                sendPocketToBle(addHeader(50, bArr3));
                this.mPocketIndex = (short) (this.mPocketIndex + 1);
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

    public void cmdSendPacket() {
        setBleOperateManagerCallback();
        this.mPocketIndex = (short) 0;
        if (this.mFileSend == null) {
            return;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "cmdSendPacket.. 开始发送数据，数据长度: " + this.mFileSend.length);
        readNextBigPocket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean readNextBigPocket() {
        try {
            setBleOperateManagerCallback();
            short s = this.mPocketIndex;
            int i = s * 1024;
            byte[] bArr = this.mFileSend;
            if (i < bArr.length) {
                int min = java.lang.Math.min(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2, bArr.length - (s * 1024));
                byte[] bArr2 = new byte[min];
                java.lang.System.arraycopy(this.mFileSend, this.mPocketIndex * 1024, bArr2, 0, min);
                byte[] compress = com.oudmon.ble.base.communication.CompressUtils.compress(bArr2);
                byte[] bArr3 = new byte[compress.length + 2];
                java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) (this.mPocketIndex + 1)), 0, bArr3, 0, 2);
                java.lang.System.arraycopy(compress, 0, bArr3, 2, compress.length);
                sendPocketToBle(addHeader(50, bArr3));
                this.mPocketIndex = (short) (this.mPocketIndex + 1);
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

    public com.oudmon.ble.base.request.WriteRequest getWriteRequest(byte[] bArr) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "getWriteRequest: data=" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bArr));
        com.oudmon.ble.base.request.WriteRequest noRspInstance = com.oudmon.ble.base.request.WriteRequest.getNoRspInstance(SERIAL_PORT_SERVICE, SERIAL_PORT_CHARACTER_WRITE);
        noRspInstance.setValue(bArr);
        return noRspInstance;
    }

    public static java.lang.String getMD5Three(java.lang.String str) {
        java.math.BigInteger bigInteger;
        try {
            byte[] bArr = new byte[8192];
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(new java.io.File(str));
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            fileInputStream.close();
            bigInteger = new java.math.BigInteger(1, messageDigest.digest());
        } catch (java.io.IOException e) {
            e.printStackTrace();
            bigInteger = null;
            return bigInteger.toString(16);
        } catch (java.security.NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            bigInteger = null;
            return bigInteger.toString(16);
        }
        return bigInteger.toString(16);
    }
}
