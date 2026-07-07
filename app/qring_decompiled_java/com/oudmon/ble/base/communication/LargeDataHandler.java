package com.oudmon.ble.base.communication;

/* loaded from: /tmp/dex/classes2.dex */
public class LargeDataHandler {
    public static final byte ACTION_AVATAR_Device = 74;
    public static final byte ACTION_Alarm = 44;
    public static final byte ACTION_BT_MAC_Protocol = 46;
    public static final byte ACTION_Blood_Oxygen = 42;
    public static final byte ACTION_Blood_Sugar = 71;
    public static final byte ACTION_Contact = 45;
    public static final byte ACTION_Contacts_New = 41;
    public static final byte ACTION_Custom_WatchFace = 58;
    public static final byte ACTION_E_CARD_Protocol = 47;
    public static final byte ACTION_GPS_Navigation = 72;
    public static final byte ACTION_Location_Protocol = 32;
    public static final byte ACTION_ManualHeartRate_Protocol = 40;
    public static final byte ACTION_New_Sleep_Protocol = 39;
    private static com.oudmon.ble.base.communication.LargeDataHandler mInstance;
    private static final java.util.UUID SERIAL_PORT_SERVICE = java.util.UUID.fromString("de5bf728-d711-4e47-af26-65e3012a5dc7");
    private static final java.util.UUID SERIAL_PORT_CHARACTER_NOTIFY = java.util.UUID.fromString("de5bf729-d711-4e47-af26-65e3012a5dc7");
    private static final java.util.UUID SERIAL_PORT_CHARACTER_WRITE = java.util.UUID.fromString("de5bf72a-d711-4e47-af26-65e3012a5dc7");
    private com.oudmon.ble.base.request.EnableNotifyRequest enableNotifyRequest = new com.oudmon.ble.base.request.EnableNotifyRequest(SERIAL_PORT_SERVICE, SERIAL_PORT_CHARACTER_NOTIFY, new com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback() { // from class: com.oudmon.ble.base.communication.LargeDataHandler.1
        @Override // com.oudmon.ble.base.request.EnableNotifyRequest.ListenerCallback
        public void enable(boolean z) {
            if (z) {
                return;
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "enable:" + z);
            com.oudmon.ble.base.communication.LargeDataHandler.this.initEnable();
        }
    });
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.oudmon.ble.base.communication.ILargeDataResponse> respMap = new java.util.concurrent.ConcurrentHashMap<>();
    private int mPackageLength = com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength();

    private LargeDataHandler() {
    }

    public static com.oudmon.ble.base.communication.LargeDataHandler getInstance() {
        if (mInstance == null) {
            synchronized (com.oudmon.ble.base.communication.LargeDataHandler.class) {
                if (mInstance == null) {
                    mInstance = new com.oudmon.ble.base.communication.LargeDataHandler();
                }
            }
        }
        return mInstance;
    }

    public void initEnable() {
        this.enableNotifyRequest.setEnable(true);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().execute(this.enableNotifyRequest);
    }

    public void disEnable() {
        this.enableNotifyRequest.setEnable(false);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().execute(this.enableNotifyRequest);
    }

    public void syncBloodOxygen(int i, com.oudmon.ble.base.communication.ILargeDataResponse iLargeDataResponse) {
        this.respMap.put(42, iLargeDataResponse);
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(42, new byte[]{(byte) i}), com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength()));
    }

    public void syncBloodSugar(int i, com.oudmon.ble.base.communication.ILargeDataResponse iLargeDataResponse) {
        this.respMap.put(71, iLargeDataResponse);
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(71, new byte[]{(byte) i}), com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength()));
    }

    public void readCustomWatch(com.oudmon.ble.base.communication.ILargeDataResponse iLargeDataResponse) {
        this.respMap.put(58, iLargeDataResponse);
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(58, new byte[]{1}), com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength()));
    }

    public void syncContact(byte[] bArr) {
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(45, bArr), com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength()));
    }

    public void setDeviceNickName(java.lang.String str) {
        if (str.isEmpty()) {
            com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(74, new byte[]{1, 1, 0}), com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength()));
            return;
        }
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
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(74, com.oudmon.ble.base.communication.utils.ByteUtil.concat(new byte[]{1, 1, 0}, bytes)), com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength()));
    }

    public void gpsNavigationRunning(int i, int i2, java.lang.String str) {
        byte[] bytes = str.getBytes(java.nio.charset.Charset.forName("unicode"));
        if (!com.oudmon.ble.base.communication.utils.ByteUtil.byteArrayToString(bytes).startsWith("fffe")) {
            int i3 = 0;
            while (i3 < bytes.length) {
                int i4 = i3 + 2;
                int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bytes, i3, i4));
                bytes[i3] = (byte) com.oudmon.ble.base.communication.utils.ByteUtil.hiword(bytesToInt);
                bytes[i3 + 1] = (byte) com.oudmon.ble.base.communication.utils.ByteUtil.loword(bytesToInt);
                i3 = i4;
            }
        }
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(72, com.oudmon.ble.base.communication.utils.ByteUtil.concat(new byte[]{1, (byte) (bytes.length + 2), (byte) i, (byte) i2}, bytes)), com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength()));
    }

    public void gpsNavigationStatus(int i) {
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(72, new byte[]{(byte) i, 0}), com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength()));
    }

    public void syncContactMore(java.util.List<com.oudmon.ble.base.communication.bigData.bean.ContactBean> list, final com.oudmon.ble.base.communication.bigData.resp.ILargeDataBaseResponse iLargeDataBaseResponse) {
        int size = list.size();
        byte[] bArr = new byte[0];
        final java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i = 0; i < list.size(); i++) {
            com.oudmon.ble.base.communication.bigData.bean.ContactBean contactBean = list.get(i);
            java.lang.String contactName = contactBean.getContactName();
            if (contactName.getBytes().length > 32) {
                contactName = getWholeText(contactName, 32);
            }
            byte[] bytes = contactName.getBytes();
            byte[] concat = com.oudmon.ble.base.communication.utils.ByteUtil.concat(bArr, com.oudmon.ble.base.communication.utils.ByteUtil.concat(com.oudmon.ble.base.communication.utils.ByteUtil.intToByte((byte) bytes.length, 1), bytes));
            java.lang.String phoneNumber = contactBean.getPhoneNumber();
            if (phoneNumber.getBytes().length > 18) {
                phoneNumber = getWholeText(phoneNumber, 18);
            }
            byte[] bytes2 = phoneNumber.getBytes();
            bArr = com.oudmon.ble.base.communication.utils.ByteUtil.concat(concat, com.oudmon.ble.base.communication.utils.ByteUtil.concat(com.oudmon.ble.base.communication.utils.ByteUtil.intToByte(bytes2.length, 1), bytes2));
            if (bArr.length > 950) {
                linkedList.add(bArr);
                bArr = new byte[0];
            }
        }
        linkedList.add(bArr);
        final int size2 = linkedList.size();
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(41, new byte[]{(byte) (size2 + 1), 0, (byte) com.oudmon.ble.base.communication.utils.ByteUtil.loword(size), (byte) com.oudmon.ble.base.communication.utils.ByteUtil.hiword(size)}), com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength()));
        final int[] iArr = {0};
        this.respMap.put(41, new com.oudmon.ble.base.communication.ILargeDataResponse() { // from class: com.oudmon.ble.base.communication.LargeDataHandler.2
            @Override // com.oudmon.ble.base.communication.ILargeDataResponse
            public void parseData(int i2, byte[] bArr2) {
                if (i2 == 41 && com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr2, 6, 7)) == 0) {
                    if (linkedList.size() == 0) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "下发完了联系人");
                        iLargeDataBaseResponse.resp(new com.oudmon.ble.base.communication.bigData.bean.BaseBean(0));
                        return;
                    }
                    int[] iArr2 = iArr;
                    iArr2[0] = iArr2[0] + 1;
                    byte[] addHeader = com.oudmon.ble.base.communication.LargeDataHandler.this.addHeader(41, com.oudmon.ble.base.communication.utils.ByteUtil.concat(new byte[]{(byte) (size2 + 1), (byte) iArr2[0]}, (byte[]) linkedList.removeFirst()));
                    for (int i3 = 0; i3 < addHeader.length; i3 += com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength()) {
                        int min = java.lang.Math.min(com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength(), addHeader.length - i3);
                        byte[] bArr3 = new byte[min];
                        java.lang.System.arraycopy(addHeader, i3, bArr3, 0, min);
                        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(bArr3, com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength()));
                    }
                }
            }
        });
    }

    public void packageLength() {
        this.mPackageLength = com.oudmon.ble.base.communication.JPackageManager.getInstance().getLength();
    }

    public void syncSleepList(int i, final com.oudmon.ble.base.communication.ILargeDataSleepResponse iLargeDataSleepResponse) {
        this.respMap.put(39, new com.oudmon.ble.base.communication.ILargeDataResponse() { // from class: com.oudmon.ble.base.communication.LargeDataHandler.3
            @Override // com.oudmon.ble.base.communication.ILargeDataResponse
            public void parseData(int i2, byte[] bArr) {
                if (i2 == 39) {
                    if (com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 6, 7)) > 0) {
                        int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 2, 4));
                        com.oudmon.ble.base.communication.LargeDataHandler.this.parseDaySleep(com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 7, 8)), bArr, 7, com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 8, 9)) + 2, bytesToInt, iLargeDataSleepResponse);
                        return;
                    }
                    com.oudmon.ble.base.communication.ILargeDataSleepResponse iLargeDataSleepResponse2 = iLargeDataSleepResponse;
                    if (iLargeDataSleepResponse2 != null) {
                        iLargeDataSleepResponse2.sleepData(null);
                    }
                }
            }
        });
        byte[] bArr = new byte[1];
        if (i == 0) {
            bArr[0] = 0;
        } else {
            bArr[0] = -1;
        }
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(39, bArr), this.mPackageLength));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseDaySleep(int i, byte[] bArr, int i2, int i3, int i4, com.oudmon.ble.base.communication.ILargeDataSleepResponse iLargeDataSleepResponse) {
        try {
            com.oudmon.ble.base.communication.rsp.SleepNewProtoResp sleepNewProtoResp = new com.oudmon.ble.base.communication.rsp.SleepNewProtoResp();
            com.oudmon.ble.base.util.DateUtil dateUtil = new com.oudmon.ble.base.util.DateUtil();
            dateUtil.addDay(-i);
            byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, i2, i2 + i3);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.oudmon.ble.base.communication.utils.ByteUtil.byteArrayToString(copyOfRange));
            int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(copyOfRange, 2, 4));
            sleepNewProtoResp.setEt((int) (dateUtil.getZeroTime() + (com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(copyOfRange, 4, 6)) * 60)));
            if (bytesToInt >= 1080) {
                dateUtil.addDay(-1);
            }
            sleepNewProtoResp.setSt((int) (dateUtil.getZeroTime() + (bytesToInt * 60)));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            byte[] copyOfRange2 = java.util.Arrays.copyOfRange(copyOfRange, 6, copyOfRange.length);
            for (int i5 = 0; i5 < copyOfRange2.length; i5++) {
                if (i5 % 2 == 1) {
                    com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean detailBean = new com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean();
                    detailBean.setT(copyOfRange2[i5 - 1]);
                    if (copyOfRange2[i5] < 0) {
                        detailBean.setD(com.oudmon.ble.base.communication.utils.ByteUtil.byteToInt(copyOfRange2[i5]));
                    } else {
                        detailBean.setD(copyOfRange2[i5]);
                    }
                    arrayList.add(detailBean);
                }
            }
            sleepNewProtoResp.setList(arrayList);
            if (iLargeDataSleepResponse != null) {
                iLargeDataSleepResponse.sleepData(sleepNewProtoResp);
            }
            if (copyOfRange.length + i2 < i4) {
                try {
                    parseDaySleep(com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, copyOfRange.length + i2, copyOfRange.length + i2 + 1)), bArr, i2 + copyOfRange.length, com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, copyOfRange.length + i2 + 1, copyOfRange.length + i2 + 2)) + 2, i4, iLargeDataSleepResponse);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
    }

    public void syncManualHeartRateList(int i, final com.oudmon.ble.base.communication.bigData.resp.ILargeDataManualHeartRateResponse iLargeDataManualHeartRateResponse) {
        this.respMap.put(40, new com.oudmon.ble.base.communication.ILargeDataResponse() { // from class: com.oudmon.ble.base.communication.LargeDataHandler.4
            @Override // com.oudmon.ble.base.communication.ILargeDataResponse
            public void parseData(int i2, byte[] bArr) {
                if (i2 == 40) {
                    com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate manualHeartRate = new com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate();
                    manualHeartRate.setIndex(com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 6, 7)));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, 7, bArr.length);
                    for (int i3 = 0; i3 < copyOfRange.length / 3; i3++) {
                        com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean detailBean = new com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean();
                        int i4 = i3 * 3;
                        int i5 = i4 + 2;
                        detailBean.setM(com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(copyOfRange, i4, i5)));
                        detailBean.setV(com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(copyOfRange, i5, i4 + 3)));
                        arrayList.add(detailBean);
                    }
                    manualHeartRate.setData(arrayList);
                    com.oudmon.ble.base.communication.bigData.resp.ILargeDataManualHeartRateResponse iLargeDataManualHeartRateResponse2 = iLargeDataManualHeartRateResponse;
                    if (iLargeDataManualHeartRateResponse2 != null) {
                        iLargeDataManualHeartRateResponse2.manualHeart(manualHeartRate);
                    }
                }
            }
        });
        byte[] bArr = new byte[1];
        if (i != 0) {
            bArr[0] = -1;
        }
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(40, bArr), this.mPackageLength));
    }

    public void syncClassicBluetooth(final com.oudmon.ble.base.communication.bigData.resp.ILargeDataClassicBluetoothResponse iLargeDataClassicBluetoothResponse) {
        this.respMap.put(46, new com.oudmon.ble.base.communication.ILargeDataResponse() { // from class: com.oudmon.ble.base.communication.LargeDataHandler.5
            @Override // com.oudmon.ble.base.communication.ILargeDataResponse
            public void parseData(int i, byte[] bArr) {
                if (i == 46) {
                    com.oudmon.ble.base.communication.bigData.bean.ClassicBluetooth classicBluetooth = new com.oudmon.ble.base.communication.bigData.bean.ClassicBluetooth();
                    classicBluetooth.setDeviceMac(com.oudmon.ble.base.communication.LargeDataHandler.this.bytesToMac(java.util.Arrays.copyOfRange(bArr, 6, 12)));
                    classicBluetooth.setDeviceName(new java.lang.String(java.util.Arrays.copyOfRange(bArr, 13, bArr[12] + 13), java.nio.charset.StandardCharsets.UTF_8));
                    com.oudmon.ble.base.communication.bigData.resp.ILargeDataClassicBluetoothResponse iLargeDataClassicBluetoothResponse2 = iLargeDataClassicBluetoothResponse;
                    if (iLargeDataClassicBluetoothResponse2 != null) {
                        iLargeDataClassicBluetoothResponse2.classicBluetooth(classicBluetooth);
                    }
                }
            }
        });
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(46, new byte[1]), this.mPackageLength));
    }

    public void writeCustomWatch(com.oudmon.ble.base.communication.bigData.CustomWatchFaceEntity customWatchFaceEntity) {
        byte[] bArr = {2};
        for (int i = 0; i < customWatchFaceEntity.getData().size(); i++) {
            com.oudmon.ble.base.communication.bigData.CustomWatchFaceEntity.CustomElement customElement = customWatchFaceEntity.getData().get(i);
            bArr = com.oudmon.ble.base.communication.utils.ByteUtil.concat(bArr, new byte[]{(byte) customElement.getType(), (byte) com.oudmon.ble.base.communication.utils.ByteUtil.loword(customElement.getX()), (byte) com.oudmon.ble.base.communication.utils.ByteUtil.hiword(customElement.getX()), (byte) com.oudmon.ble.base.communication.utils.ByteUtil.loword(customElement.getY()), (byte) com.oudmon.ble.base.communication.utils.ByteUtil.hiword(customElement.getY()), (byte) customElement.getR(), (byte) customElement.getG(), (byte) customElement.getB()});
        }
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(58, bArr), this.mPackageLength));
    }

    public void writeAlarm(com.oudmon.ble.base.communication.bigData.AlarmNewEntity alarmNewEntity) {
        try {
            byte[] bArr = {2, (byte) alarmNewEntity.getTotal()};
            for (com.oudmon.ble.base.communication.bigData.AlarmNewEntity.AlarmBean alarmBean : alarmNewEntity.getData()) {
                bArr = com.oudmon.ble.base.communication.utils.ByteUtil.concat(bArr, com.oudmon.ble.base.communication.utils.ByteUtil.concat(new byte[]{(byte) alarmBean.getAlarmLength(), (byte) alarmBean.getRepeatAndEnable(), (byte) com.oudmon.ble.base.communication.utils.ByteUtil.loword(alarmBean.getMin()), (byte) com.oudmon.ble.base.communication.utils.ByteUtil.hiword(alarmBean.getMin())}, alarmBean.getContent().getBytes("UTF-8")));
            }
            com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(44, bArr), this.mPackageLength));
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public void readAlarm(com.oudmon.ble.base.communication.ILargeDataResponse iLargeDataResponse) {
        this.respMap.put(44, iLargeDataResponse);
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(44, new byte[]{1}), this.mPackageLength));
    }

    public void writeQrCode(com.oudmon.ble.base.communication.bigData.bean.ECardEntity eCardEntity) {
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(47, com.oudmon.ble.base.communication.utils.ByteUtil.concat(new byte[]{2, (byte) eCardEntity.getType(), (byte) eCardEntity.getUrl().getBytes(java.nio.charset.StandardCharsets.UTF_8).length}, eCardEntity.getUrl().getBytes(java.nio.charset.StandardCharsets.UTF_8))), this.mPackageLength));
    }

    public void writeQrCodeWithType() {
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(47, com.oudmon.ble.base.communication.utils.ByteUtil.concat(new byte[]{2, -1, 0}, "".getBytes(java.nio.charset.StandardCharsets.UTF_8))), this.mPackageLength));
    }

    public void deviceRequestLocation(final com.oudmon.ble.base.communication.ILargeDataResponse iLargeDataResponse) {
        this.respMap.put(32, new com.oudmon.ble.base.communication.ILargeDataResponse() { // from class: com.oudmon.ble.base.communication.LargeDataHandler.6
            @Override // com.oudmon.ble.base.communication.ILargeDataResponse
            public void parseData(int i, byte[] bArr) {
                com.oudmon.ble.base.communication.ILargeDataResponse iLargeDataResponse2;
                if (i == 32 && com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 6, 7)) == 1 && (iLargeDataResponse2 = iLargeDataResponse) != null) {
                    iLargeDataResponse2.parseData(32, bArr);
                }
            }
        });
    }

    public void writeLocation(double d, double d2, java.lang.String str) {
        int i = (int) d2;
        double d3 = (d2 - i) * 60.0d;
        int i2 = (int) d3;
        int i3 = (int) d;
        double d4 = (d - i3) * 60.0d;
        int i4 = (int) d4;
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(32, com.oudmon.ble.base.communication.utils.ByteUtil.concat(new byte[]{2, (byte) com.oudmon.ble.base.communication.utils.ByteUtil.loword(i), (byte) com.oudmon.ble.base.communication.utils.ByteUtil.hiword(i), (byte) java.lang.Math.abs(i2), (byte) ((int) ((float) java.lang.Math.abs((d3 - i2) * 60.0d))), (byte) (((r12 - r13) * 10000.0f) / 100.0f), (byte) com.oudmon.ble.base.communication.utils.ByteUtil.loword(i3), (byte) com.oudmon.ble.base.communication.utils.ByteUtil.hiword(i3), (byte) java.lang.Math.abs(i4), (byte) ((int) ((float) java.lang.Math.abs((d4 - i4) * 60.0d))), (byte) (((r10 - r11) * 10000.0f) / 100.0f)}, str.getBytes(java.nio.charset.StandardCharsets.UTF_8))), this.mPackageLength));
    }

    public void readQrCode(final int i, final com.oudmon.ble.base.communication.bigData.resp.ILargeDataQrCodeResponse iLargeDataQrCodeResponse) {
        this.respMap.put(47, new com.oudmon.ble.base.communication.ILargeDataResponse() { // from class: com.oudmon.ble.base.communication.LargeDataHandler.7
            @Override // com.oudmon.ble.base.communication.ILargeDataResponse
            public void parseData(int i2, byte[] bArr) {
                if (i2 == 47) {
                    try {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.oudmon.ble.base.communication.utils.ByteUtil.byteArrayToString(bArr));
                        int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 6, 7));
                        if (bytesToInt == 1) {
                            com.oudmon.ble.base.communication.bigData.bean.ECardEntity eCardEntity = new com.oudmon.ble.base.communication.bigData.bean.ECardEntity();
                            eCardEntity.setType(i);
                            eCardEntity.setDeviceError(2);
                            eCardEntity.setReadOrWrite(bytesToInt);
                            eCardEntity.setUrl(new java.lang.String(java.util.Arrays.copyOfRange(bArr, 9, bArr[8] + 9), java.nio.charset.StandardCharsets.UTF_8));
                            com.oudmon.ble.base.communication.bigData.resp.ILargeDataQrCodeResponse iLargeDataQrCodeResponse2 = iLargeDataQrCodeResponse;
                            if (iLargeDataQrCodeResponse2 != null) {
                                iLargeDataQrCodeResponse2.qrCode(eCardEntity);
                            }
                        } else if (bytesToInt == 2) {
                            int bytesToInt2 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 7, 8));
                            if (bytesToInt2 == 255) {
                                if (iLargeDataQrCodeResponse != null) {
                                    com.oudmon.ble.base.communication.bigData.bean.ECardEntity eCardEntity2 = new com.oudmon.ble.base.communication.bigData.bean.ECardEntity();
                                    eCardEntity2.setReadOrWrite(bytesToInt);
                                    if (com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 8, 9)) == 0) {
                                        eCardEntity2.setType(255);
                                        eCardEntity2.setSupport(true);
                                        eCardEntity2.setDeviceError(2);
                                        eCardEntity2.setReadOrWrite(bytesToInt);
                                        iLargeDataQrCodeResponse.qrCode(eCardEntity2);
                                    } else {
                                        eCardEntity2.setType(255);
                                        eCardEntity2.setSupport(false);
                                        eCardEntity2.setDeviceError(2);
                                        eCardEntity2.setReadOrWrite(bytesToInt);
                                        iLargeDataQrCodeResponse.qrCode(eCardEntity2);
                                    }
                                }
                            } else if (com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 8, 9)) == 1) {
                                if (iLargeDataQrCodeResponse != null) {
                                    com.oudmon.ble.base.communication.bigData.bean.ECardEntity eCardEntity3 = new com.oudmon.ble.base.communication.bigData.bean.ECardEntity();
                                    eCardEntity3.setType(bytesToInt2);
                                    eCardEntity3.setDeviceError(1);
                                    eCardEntity3.setReadOrWrite(bytesToInt);
                                    iLargeDataQrCodeResponse.qrCode(eCardEntity3);
                                }
                            } else if (iLargeDataQrCodeResponse != null) {
                                com.oudmon.ble.base.communication.bigData.bean.ECardEntity eCardEntity4 = new com.oudmon.ble.base.communication.bigData.bean.ECardEntity();
                                eCardEntity4.setType(bytesToInt2);
                                eCardEntity4.setReadOrWrite(bytesToInt);
                                eCardEntity4.setDeviceError(0);
                                iLargeDataQrCodeResponse.qrCode(eCardEntity4);
                            }
                        }
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        if (i != 255) {
            com.oudmon.ble.base.bluetooth.queue.BleThreadManager.getInstance().addData(new com.oudmon.ble.base.bluetooth.queue.BleDataBean(addHeader(47, new byte[]{1, (byte) i}), this.mPackageLength));
        }
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.oudmon.ble.base.communication.ILargeDataResponse> getRespMap() {
        return this.respMap;
    }

    public void cleanMap() {
        this.respMap.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] addHeader(int i, byte[] bArr) {
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
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "getWriteRequest: data=" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bArr));
        com.oudmon.ble.base.request.WriteRequest noRspInstance = com.oudmon.ble.base.request.WriteRequest.getNoRspInstance(SERIAL_PORT_SERVICE, SERIAL_PORT_CHARACTER_WRITE);
        noRspInstance.setValue(bArr);
        return noRspInstance;
    }

    public java.lang.String bytesToMac(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : bArr) {
            java.lang.String upperCase = java.lang.Integer.toHexString(b & 255).toUpperCase();
            if (upperCase.length() == 1) {
                upperCase = "0" + upperCase;
            }
            sb.append(upperCase);
            sb.append(":");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public java.lang.String getWholeText(java.lang.String str, int i) {
        if (str == null) {
            return str;
        }
        try {
            if (str.getBytes("utf-8").length <= i) {
                return str;
            }
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = 0;
                    break;
                }
                char c = charArray[i2];
                i3 = (c < 0 || c > 127) ? (c < 128 || c > 2047) ? i3 + 3 : i3 + 2 : i3 + 1;
                if (i3 > i) {
                    break;
                }
                i2++;
            }
            return java.lang.String.valueOf(charArray, 0, i2);
        } catch (java.io.UnsupportedEncodingException unused) {
            return str;
        }
    }
}
