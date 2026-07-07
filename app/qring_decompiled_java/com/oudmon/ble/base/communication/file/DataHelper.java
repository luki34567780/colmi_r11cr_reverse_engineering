package com.oudmon.ble.base.communication.file;

/* loaded from: /tmp/dex/classes2.dex */
public class DataHelper {
    private static final java.lang.String TAG = "DataHelper";
    private static com.oudmon.ble.base.communication.file.DataHelper mInstance;

    public static com.oudmon.ble.base.communication.file.DataHelper getInstance() {
        if (mInstance == null) {
            synchronized (com.oudmon.ble.base.communication.file.DataHelper.class) {
                if (mInstance == null) {
                    mInstance = new com.oudmon.ble.base.communication.file.DataHelper();
                }
            }
        }
        return mInstance;
    }

    static java.util.List<com.oudmon.ble.base.communication.file.PlateEntity> parsePlate(byte[] bArr) {
        android.util.Log.i(TAG, "=========================== Parse Plate Start ============================");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.Log.i(TAG, "length: " + ((int) bArr[0]));
        int i = 1;
        while (i < bArr.length) {
            try {
                int i2 = i + 1;
                int i3 = bArr[i] & 255;
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                byte[] bArr2 = new byte[i5];
                java.lang.System.arraycopy(bArr, i4, bArr2, 0, i5);
                int i6 = i5 + i4;
                arrayList.add(new com.oudmon.ble.base.communication.file.PlateEntity(i3 == 1, new java.lang.String(bArr2)));
                i = i6;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                android.util.Log.i(TAG, "=========================== Parse Plate Error ============================");
            }
        }
        android.util.Log.i(TAG, "=========================== Parse Plate End ============================" + arrayList.size());
        return arrayList;
    }

    static com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity parseTemperature(byte[] bArr) {
        android.util.Log.i(TAG, "=========================== ParseTemperature Start ============================");
        com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity temperatureEntity = new com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity();
        try {
            temperatureEntity.mIndex = bArr[0];
            int i = 1;
            temperatureEntity.mTimeSpan = bArr[1];
            if (bArr[1] != 0) {
                i = 1440 / temperatureEntity.mTimeSpan;
            }
            temperatureEntity.mValues = new float[i];
            int i2 = 0;
            for (int i3 = 2; i3 < bArr.length; i3++) {
                int i4 = bArr[i3] & 255;
                if (i4 > 128) {
                    int i5 = i4 - 128;
                    int i6 = 0;
                    while (i6 < i5) {
                        temperatureEntity.mValues[i2] = 0.0f;
                        i6++;
                        i2++;
                    }
                } else {
                    temperatureEntity.mValues[i2] = ((bArr[i3] * 1.0f) / 10.0f) + 32.0f;
                    i2++;
                }
            }
            android.util.Log.i(TAG, "temperature: " + temperatureEntity);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        android.util.Log.i(TAG, "=========================== ParseTemperature End ============================");
        return temperatureEntity;
    }

    static java.util.List<com.oudmon.ble.base.communication.dfu_temperature.TemperatureOnceEntity> parseTemperatureOnce(byte[] bArr) {
        android.util.Log.i(TAG, "=========================== ParseTemperatureOnce Start ============================");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
            dateUtil.addDay(-bArr[0]);
            int i = 1;
            while (i < bArr.length) {
                com.oudmon.ble.base.communication.dfu_temperature.TemperatureOnceEntity temperatureOnceEntity = new com.oudmon.ble.base.communication.dfu_temperature.TemperatureOnceEntity();
                temperatureOnceEntity.mTime = dateUtil.getZeroTime() + (com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, i) * 60);
                int i2 = i + 2 + 1;
                temperatureOnceEntity.mValue = ((bArr[r2] * 1.0f) / 10.0f) + 32.0f;
                arrayList.add(temperatureOnceEntity);
                i = i2;
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "=========================== ParseTemperatureOnce End ============================");
        return arrayList;
    }
}
