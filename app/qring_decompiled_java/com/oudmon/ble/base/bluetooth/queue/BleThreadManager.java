package com.oudmon.ble.base.bluetooth.queue;

/* loaded from: /tmp/dex/classes2.dex */
public class BleThreadManager {
    private static com.oudmon.ble.base.bluetooth.queue.BleThreadManager instance;
    private com.oudmon.ble.base.bluetooth.queue.BleConsumer bleConsumer;
    private java.util.concurrent.BlockingDeque<com.oudmon.ble.base.bluetooth.queue.BleDataBean> queue = new java.util.concurrent.LinkedBlockingDeque(20);

    private BleThreadManager() {
        if (this.bleConsumer == null) {
            com.oudmon.ble.base.bluetooth.queue.BleConsumer bleConsumer = new com.oudmon.ble.base.bluetooth.queue.BleConsumer("bleConsumer-" + new java.util.Random().nextInt(), this.queue);
            this.bleConsumer = bleConsumer;
            bleConsumer.start();
        }
    }

    public static com.oudmon.ble.base.bluetooth.queue.BleThreadManager getInstance() {
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager bleThreadManager;
        com.oudmon.ble.base.bluetooth.queue.BleThreadManager bleThreadManager2 = instance;
        if (bleThreadManager2 != null) {
            return bleThreadManager2;
        }
        synchronized (com.oudmon.ble.base.bluetooth.queue.BleThreadManager.class) {
            if (instance == null) {
                instance = new com.oudmon.ble.base.bluetooth.queue.BleThreadManager();
            }
            bleThreadManager = instance;
        }
        return bleThreadManager;
    }

    public void addData(com.oudmon.ble.base.bluetooth.queue.BleDataBean bleDataBean) {
        try {
            if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "设备断开");
            } else {
                this.queue.putLast(bleDataBean);
            }
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clean() {
        this.queue.clear();
    }
}
