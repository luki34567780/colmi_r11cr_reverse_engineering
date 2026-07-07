package com.oudmon.ble.base.communication.sport;

/* loaded from: /tmp/dex/classes2.dex */
public class SportPlusHandle {
    private static final java.lang.String TAG = "Jxr35";
    private com.oudmon.ble.base.communication.sport.SportPlusHandle.IOpResult iOpResult;
    private byte[] mDetails;
    private byte[] mSummary;
    private int mSportIndex = 0;
    private java.util.List<com.oudmon.ble.base.communication.sport.SportPlusEntity> mSportEntities = new java.util.ArrayList();
    private java.util.List<com.oudmon.ble.base.communication.sport.SportLocation> mLocations = new java.util.ArrayList();
    private int mTotalCount = 0;
    private int mReceivedCount = 0;
    private boolean mSummaryReceiving = false;
    private boolean mDetailsReceiving = false;
    private int mPackageCount = 0;
    private int mPackageIndex = 0;
    private int mSampleSecond = 0;
    private int mDataLength = 0;
    private android.util.SparseIntArray mDataTypeArray = new android.util.SparseIntArray();
    public com.oudmon.ble.base.bluetooth.OnGattEventCallback callback = new com.oudmon.ble.base.bluetooth.OnGattEventCallback() { // from class: com.oudmon.ble.base.communication.sport.SportPlusHandle.1
        @Override // com.oudmon.ble.base.bluetooth.OnGattEventCallback
        public void onReceivedData(java.lang.String str, byte[] bArr) {
            if (bArr != null) {
                try {
                    if ((bArr[0] & 255) != 188 || bArr[1] != 66) {
                        if (com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mSummaryReceiving) {
                            java.lang.System.arraycopy(bArr, 0, com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mSummary, com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mReceivedCount, bArr.length);
                            com.oudmon.ble.base.communication.sport.SportPlusHandle.access$112(com.oudmon.ble.base.communication.sport.SportPlusHandle.this, bArr.length);
                            com.oudmon.ble.base.communication.sport.SportPlusHandle sportPlusHandle = com.oudmon.ble.base.communication.sport.SportPlusHandle.this;
                            sportPlusHandle.mSummaryReceiving = sportPlusHandle.mReceivedCount < com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mTotalCount;
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceivedData.. mTotalCount: " + com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mTotalCount + ", mReceivedCount: " + com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mReceivedCount + ", mSummaryReceiving: " + com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mSummaryReceiving);
                            if (!com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mSummaryReceiving) {
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceiver All Summary data: " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mSummary));
                                com.oudmon.ble.base.communication.sport.SportPlusHandle sportPlusHandle2 = com.oudmon.ble.base.communication.sport.SportPlusHandle.this;
                                sportPlusHandle2.parseSummary(sportPlusHandle2.mSummary);
                                com.oudmon.ble.base.communication.sport.SportPlusHandle.this.iOpResult.onSummary(1, com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mSportEntities);
                                com.oudmon.ble.base.communication.sport.SportPlusHandle.this.executeRequest();
                            }
                        } else if ((bArr[0] & 255) == 188 && bArr[1] == 68) {
                            byte[] bArr2 = new byte[com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, 2)];
                            java.lang.System.arraycopy(bArr, 6, bArr2, 0, bArr.length - 6);
                            com.oudmon.ble.base.communication.sport.SportPlusHandle.this.parseRequest(bArr2);
                        } else if ((bArr[0] & 255) != 188 || bArr[1] != 69) {
                            if (com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mDetailsReceiving) {
                                java.lang.System.arraycopy(bArr, 0, com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mDetails, com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mReceivedCount, bArr.length);
                                com.oudmon.ble.base.communication.sport.SportPlusHandle.access$112(com.oudmon.ble.base.communication.sport.SportPlusHandle.this, bArr.length);
                                com.oudmon.ble.base.communication.sport.SportPlusHandle sportPlusHandle3 = com.oudmon.ble.base.communication.sport.SportPlusHandle.this;
                                sportPlusHandle3.mDetailsReceiving = sportPlusHandle3.mReceivedCount < com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mTotalCount;
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceivedData.. mTotalCount: " + com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mTotalCount + ", mReceivedCount: " + com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mReceivedCount + ", mDetailsReceiving: " + com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mDetailsReceiving);
                                if (!com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mDetailsReceiving) {
                                    com.oudmon.ble.base.communication.sport.SportPlusHandle sportPlusHandle4 = com.oudmon.ble.base.communication.sport.SportPlusHandle.this;
                                    sportPlusHandle4.parseDetails(sportPlusHandle4.mDetails);
                                }
                            }
                        } else {
                            com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mTotalCount = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, 2);
                            com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mReceivedCount = bArr.length - 6;
                            com.oudmon.ble.base.communication.sport.SportPlusHandle sportPlusHandle5 = com.oudmon.ble.base.communication.sport.SportPlusHandle.this;
                            sportPlusHandle5.mDetails = new byte[sportPlusHandle5.mTotalCount];
                            java.lang.System.arraycopy(bArr, 6, com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mDetails, 0, com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mReceivedCount);
                            com.oudmon.ble.base.communication.sport.SportPlusHandle sportPlusHandle6 = com.oudmon.ble.base.communication.sport.SportPlusHandle.this;
                            sportPlusHandle6.mDetailsReceiving = sportPlusHandle6.mReceivedCount < com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mTotalCount;
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceivedData.. mTotalCount: " + com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mTotalCount + ", mReceivedCount: " + com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mReceivedCount + ", mDetailsReceiving: " + com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mDetailsReceiving);
                            if (!com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mDetailsReceiving) {
                                com.oudmon.ble.base.communication.sport.SportPlusHandle sportPlusHandle7 = com.oudmon.ble.base.communication.sport.SportPlusHandle.this;
                                sportPlusHandle7.parseDetails(sportPlusHandle7.mDetails);
                            }
                        }
                    } else {
                        com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mTotalCount = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, 2);
                        com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mReceivedCount = bArr.length - 6;
                        com.oudmon.ble.base.communication.sport.SportPlusHandle sportPlusHandle8 = com.oudmon.ble.base.communication.sport.SportPlusHandle.this;
                        sportPlusHandle8.mSummary = new byte[sportPlusHandle8.mTotalCount];
                        java.lang.System.arraycopy(bArr, 6, com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mSummary, 0, com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mReceivedCount);
                        com.oudmon.ble.base.communication.sport.SportPlusHandle sportPlusHandle9 = com.oudmon.ble.base.communication.sport.SportPlusHandle.this;
                        sportPlusHandle9.mSummaryReceiving = sportPlusHandle9.mReceivedCount < com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mTotalCount;
                        if (!com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mSummaryReceiving) {
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onReceiver All Summary data: " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mSummary));
                            com.oudmon.ble.base.communication.sport.SportPlusHandle sportPlusHandle10 = com.oudmon.ble.base.communication.sport.SportPlusHandle.this;
                            sportPlusHandle10.parseSummary(sportPlusHandle10.mSummary);
                            com.oudmon.ble.base.communication.sport.SportPlusHandle.this.iOpResult.onSummary(1, com.oudmon.ble.base.communication.sport.SportPlusHandle.this.mSportEntities);
                            com.oudmon.ble.base.communication.sport.SportPlusHandle.this.executeRequest();
                        }
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        }
    };
    private long mTime = 0;

    public interface IOpResult {
        void onSummary(int i, java.util.List<com.oudmon.ble.base.communication.sport.SportPlusEntity> list);
    }

    static /* synthetic */ int access$112(com.oudmon.ble.base.communication.sport.SportPlusHandle sportPlusHandle, int i) {
        int i2 = sportPlusHandle.mReceivedCount + i;
        sportPlusHandle.mReceivedCount = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseSummary(byte[] bArr) {
        byte[] bArr2 = bArr;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "===========================解析Summary开始============================");
        this.mSportIndex = 0;
        this.mSportEntities.clear();
        try {
            int i = bArr2[0];
            char c = 1;
            int i2 = 1;
            while (i > 0) {
                int i3 = bArr2[i2];
                byte[] bArr3 = new byte[i3];
                java.lang.System.arraycopy(bArr2, i2, bArr3, 0, i3);
                com.oudmon.ble.base.communication.sport.SportPlusEntity sportPlusEntity = new com.oudmon.ble.base.communication.sport.SportPlusEntity();
                sportPlusEntity.mSportType = com.oudmon.ble.base.communication.utils.ByteUtil.byteToInt(bArr3[c]);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.oudmon.ble.base.communication.utils.ByteUtil.byteArrayToString(bArr3));
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "tempArray: " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bArr3) + ", sportType: " + sportPlusEntity.mSportType);
                int i4 = 2;
                int i5 = 0;
                while (i4 < i3) {
                    int i6 = bArr3[i5 + 2];
                    byte b = bArr3[i5 + 3];
                    int i7 = i6 - 2;
                    byte[] bArr4 = new byte[i7];
                    java.lang.System.arraycopy(bArr3, i5 + 4, bArr4, 0, i7);
                    setKeyValues(sportPlusEntity, b, bArr4);
                    i5 += i6;
                    i4 += i6;
                }
                this.mSportEntities.add(sportPlusEntity);
                i2 += i3;
                i--;
                bArr2 = bArr;
                c = 1;
            }
            android.util.Log.i(TAG, "===========================解析Summary结束============================");
        } catch (java.lang.Exception e) {
            android.util.Log.i(TAG, "===========================解析Summary异常============================");
            e.printStackTrace();
        }
    }

    private void setKeyValues(com.oudmon.ble.base.communication.sport.SportPlusEntity sportPlusEntity, int i, byte[] bArr) {
        if (i == 1) {
            sportPlusEntity.mStartTime = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
            return;
        }
        if (i == 2) {
            sportPlusEntity.mDuration = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
            return;
        }
        if (i == 3) {
            sportPlusEntity.mDistance = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
            return;
        }
        if (i == 4) {
            sportPlusEntity.mCalories = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
            return;
        }
        if (i == 5) {
            sportPlusEntity.mSpeedAvg = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
            return;
        }
        if (i == 6) {
            sportPlusEntity.mSpeedMax = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
            return;
        }
        if (i == 7) {
            sportPlusEntity.mRateAvg = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
            return;
        }
        if (i == 8) {
            sportPlusEntity.mRateMin = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
            return;
        }
        if (i == 9) {
            sportPlusEntity.mRateMax = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
            return;
        }
        if (i == 10) {
            sportPlusEntity.mElevation = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
            return;
        }
        if (i == 11) {
            sportPlusEntity.mUphill = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
            return;
        }
        if (i == 12) {
            sportPlusEntity.mDownhill = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
            return;
        }
        if (i == 13) {
            sportPlusEntity.mStepRate = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
        } else if (i == 14) {
            sportPlusEntity.mSportCount = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
        } else if (i == 19) {
            sportPlusEntity.steps = com.qcwireless.qc_utils.bytes.DataTransferUtils.arrays2Int(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeRequest() {
        android.util.Log.i(TAG, "executeRequest.. mSportIndex: " + this.mSportIndex + ", totalSize: " + this.mSportEntities.size());
        if (this.mSportIndex < this.mSportEntities.size()) {
            com.oudmon.ble.base.communication.sport.SportPlusEntity sportPlusEntity = this.mSportEntities.get(this.mSportIndex);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, new com.oudmon.ble.base.util.DateUtil(sportPlusEntity.mStartTime, true).getY_M_D_H_M_S() + "----" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(com.qcwireless.qc_utils.bytes.DataTransferUtils.intToBytes(sportPlusEntity.mStartTime)));
            cmdRequest(sportPlusEntity.mSportType, sportPlusEntity.mStartTime);
            return;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "获取所有详细数据结束 mSportEntities: " + this.mSportEntities);
        this.iOpResult.onSummary(2, this.mSportEntities);
        android.util.Log.i(TAG, "==================================onDetails cost time: " + (java.lang.System.currentTimeMillis() - this.mTime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseRequest(byte[] bArr) {
        this.mDataLength = 0;
        this.mLocations.clear();
        if (bArr[0] == 0) {
            this.mPackageCount = com.qcwireless.qc_utils.bytes.DataTransferUtils.byte2Int(bArr, 1);
            this.mSampleSecond = bArr[3];
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "parseRequest.. mPackageCount: " + this.mPackageCount + ", mSampleSecond: " + this.mSampleSecond);
            if (bArr.length == 4 || this.mPackageCount == 0) {
                this.mDataTypeArray.clear();
                this.mSportEntities.get(this.mSportIndex).mLocations.clear();
                this.mSportIndex++;
                executeRequest();
                return;
            }
            for (int i = 4; i < bArr.length; i += 2) {
                this.mDataTypeArray.put(bArr[i + 1], bArr[i]);
                this.mDataLength += bArr[i];
            }
            for (int i2 = 0; i2 < this.mDataTypeArray.size(); i2++) {
                int keyAt = this.mDataTypeArray.keyAt(i2);
                android.util.Log.i(TAG, "parseRequest.. key: " + keyAt + ", value: " + this.mDataTypeArray.get(keyAt));
            }
            return;
        }
        this.mSportIndex++;
        executeRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseDetails(byte[] bArr) {
        try {
            int byte2Int = com.qcwireless.qc_utils.bytes.DataTransferUtils.byte2Int(bArr, 0);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "parseDetails.. packageId: " + byte2Int + ", mPackageCount: " + this.mPackageCount);
            int i = 2;
            while (i < bArr.length) {
                int i2 = this.mDataLength;
                byte[] bArr2 = new byte[i2];
                java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
                com.oudmon.ble.base.communication.sport.SportLocation sportLocation = new com.oudmon.ble.base.communication.sport.SportLocation();
                int i3 = 0;
                for (int i4 = 0; i4 < this.mDataTypeArray.size(); i4++) {
                    int keyAt = this.mDataTypeArray.keyAt(i4);
                    int i5 = this.mDataTypeArray.get(keyAt);
                    if (keyAt != 15 && keyAt != 16 && keyAt == 17) {
                        sportLocation.mRateReal = bArr2[i3] & 255;
                    }
                    i3 += i5;
                }
                this.mLocations.add(sportLocation);
                i += this.mDataLength;
            }
            if (byte2Int >= this.mPackageCount) {
                this.mDataTypeArray.clear();
                this.mSportEntities.get(this.mSportIndex).mLocations.addAll(this.mLocations);
                this.mSportIndex++;
                executeRequest();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void init(com.oudmon.ble.base.communication.sport.SportPlusHandle.IOpResult iOpResult) {
        android.util.Log.i(TAG, "init... ");
        this.mTime = java.lang.System.currentTimeMillis();
        this.iOpResult = iOpResult;
        this.mLocations.clear();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setCallback(this.callback);
    }

    public void cmdSummary(int i) {
        byte[] bArr = new byte[4];
        java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.intToBytes(i), 0, bArr, 0, 4);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().execute(getWriteRequest(addHeader(65, bArr)));
    }

    public void cmdRequest(int i, int i2) {
        byte[] bArr = new byte[5];
        bArr[0] = (byte) i;
        java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.intToBytes(i2), 0, bArr, 1, 4);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().execute(getWriteRequest(addHeader(67, bArr)));
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

    private com.oudmon.ble.base.request.WriteRequest getWriteRequest(byte[] bArr) {
        com.oudmon.ble.base.request.WriteRequest noRspInstance = com.oudmon.ble.base.request.WriteRequest.getNoRspInstance(com.oudmon.ble.base.communication.Constants.SERIAL_PORT_SERVICE, com.oudmon.ble.base.communication.Constants.SERIAL_PORT_CHARACTER_WRITE);
        noRspInstance.setValue(bArr);
        return noRspInstance;
    }
}
