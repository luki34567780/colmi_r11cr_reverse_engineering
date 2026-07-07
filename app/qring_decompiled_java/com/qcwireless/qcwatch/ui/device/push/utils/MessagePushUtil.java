package com.qcwireless.qcwatch.ui.device.push.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class MessagePushUtil {
    private static long lastSaveTime;
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, com.oudmon.ble.base.communication.entity.MessagePushBean> currMap = new java.util.concurrent.ConcurrentHashMap<>(20);
    private static java.lang.String callMsgPre = "110";
    private static long lastCallTime = 0;
    private static long lastInComing = 0;
    private static int inType = -1;
    private static java.lang.String inMessage = "";
    private static com.oudmon.ble.base.util.ThreadUtils.TimeTask task = new com.oudmon.ble.base.util.ThreadUtils.TimeTask() { // from class: com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.1
        @Override // com.oudmon.ble.base.util.ThreadUtils.TimeTask
        protected void task() {
            byte[] bArr;
            if (com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.inMessage.length() > 128) {
                java.lang.String unused = com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.inMessage = com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.inMessage.substring(0, com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4);
            }
            try {
                byte[] bytes = com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.inMessage.getBytes("UTF-8");
                int length = bytes.length / 11;
                if (length == 0) {
                    length = 1;
                } else if (bytes.length % 11 > 0) {
                    length++;
                }
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    if (i2 != length) {
                        int i3 = i * 11;
                        bArr = new byte[]{bytes[i3], bytes[i3 + 1], bytes[i3 + 2], bytes[i3 + 3], bytes[i3 + 4], bytes[i3 + 5], bytes[i3 + 6], bytes[i3 + 7], bytes[i3 + 8], bytes[i3 + 9], bytes[i3 + 10]};
                    } else {
                        int i4 = i * 11;
                        int length2 = bytes.length - i4;
                        byte[] bArr2 = new byte[11];
                        for (int i5 = 0; i5 < length2; i5++) {
                            bArr2[i5] = bytes[i4 + i5];
                        }
                        bArr = bArr2;
                    }
                    com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.PushMsgUintReq((byte) com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.inType, length, i2, bArr), new com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.SimpleStatusRsp>() { // from class: com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.1.1
                        @Override // com.oudmon.ble.base.communication.ICommandResponse
                        public void onDataResponse(com.oudmon.ble.base.communication.rsp.SimpleStatusRsp resultEntity) {
                            if (resultEntity.getStatus() == 0) {
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "send msg success");
                            }
                        }
                    });
                    i = i2;
                }
            } catch (java.io.UnsupportedEncodingException unused2) {
            }
        }
    };
    private static java.lang.String preMessage = "QwatchPro";
    private static java.lang.String preMessageFromTitle = "QwatchPro";

    public static void pushCallMsg(final int type, java.lang.String message) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, type + message);
        if (java.lang.System.currentTimeMillis() - lastCallTime >= com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL || type == 4) {
            inType = type;
            inMessage = message;
            if (type == 0) {
                lastInComing = java.lang.System.currentTimeMillis();
            }
            if (type == 4) {
                if (((int) (java.lang.System.currentTimeMillis() - lastInComing)) <= 600) {
                    com.oudmon.ble.base.util.ThreadUtils.cancel(task);
                    return;
                } else {
                    com.oudmon.ble.base.util.ThreadUtils.postDelay(task, 10L);
                    return;
                }
            }
            lastCallTime = java.lang.System.currentTimeMillis();
            com.oudmon.ble.base.util.ThreadUtils.postDelay(task, 600L);
        }
    }

    public static void pushMsg(final int type, java.lang.String message) {
        byte[] bArr;
        if (type != 0 && type != 1 && type != 4) {
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.oudmon.ble.base.communication.entity.MessagePushBean messagePushBean = currMap.get(type + "");
                if (messagePushBean != null) {
                    java.lang.String message2 = messagePushBean.getMessage();
                    if (currentTimeMillis <= messagePushBean.getTime() && message2.equalsIgnoreCase(message)) {
                        return;
                    }
                }
                lastSaveTime = java.lang.System.currentTimeMillis() + 600000;
                currMap.put(type + "", new com.oudmon.ble.base.communication.entity.MessagePushBean(message, lastSaveTime));
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        if (message != null) {
            try {
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
            if (message.length() != 0) {
                if (" ".equalsIgnoreCase(message)) {
                    return;
                }
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "pushMsg.. type: " + type + ", message: " + message);
                if (message.length() > 256) {
                    message = message.substring(0, 256);
                }
                try {
                    byte[] bytes = message.getBytes("UTF-8");
                    int length = bytes.length / 11;
                    if (length == 0) {
                        length = 1;
                    } else if (bytes.length % 11 > 0) {
                        length++;
                    }
                    int i = 0;
                    while (i < length) {
                        int i2 = i + 1;
                        if (i2 != length) {
                            int i3 = i * 11;
                            bArr = new byte[]{bytes[i3], bytes[i3 + 1], bytes[i3 + 2], bytes[i3 + 3], bytes[i3 + 4], bytes[i3 + 5], bytes[i3 + 6], bytes[i3 + 7], bytes[i3 + 8], bytes[i3 + 9], bytes[i3 + 10]};
                        } else {
                            int i4 = i * 11;
                            int length2 = bytes.length - i4;
                            byte[] bArr2 = new byte[11];
                            for (int i5 = 0; i5 < length2; i5++) {
                                bArr2[i5] = bytes[i4 + i5];
                            }
                            bArr = bArr2;
                        }
                        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.PushMsgUintReq((byte) type, length, i2, bArr), new com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.SimpleStatusRsp>() { // from class: com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.2
                            @Override // com.oudmon.ble.base.communication.ICommandResponse
                            public void onDataResponse(com.oudmon.ble.base.communication.rsp.SimpleStatusRsp resultEntity) {
                                if (resultEntity.getStatus() == 0) {
                                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "send msg success");
                                }
                            }
                        });
                        i = i2;
                    }
                } catch (java.io.UnsupportedEncodingException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public static synchronized void pushSmsMsg(final int type, java.lang.String message) {
        byte[] bArr;
        synchronized (com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.class) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, message);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, preMessage);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, preMessageFromTitle);
            try {
                int EditDistance = EditDistance(message, preMessage);
                int EditDistance2 = EditDistance(message, preMessageFromTitle);
                if (EditDistance <= 2 || EditDistance2 <= 2) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "消息一样");
                    return;
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            preMessage = message;
            if (message.length() > 256) {
                message = message.substring(0, 256);
            }
            try {
                byte[] bytes = message.getBytes("UTF-8");
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "短信内容:" + message);
                int length = bytes.length / 11;
                if (length == 0) {
                    length = 1;
                } else if (bytes.length % 11 > 0) {
                    length++;
                }
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    if (i2 != length) {
                        int i3 = i * 11;
                        bArr = new byte[]{bytes[i3], bytes[i3 + 1], bytes[i3 + 2], bytes[i3 + 3], bytes[i3 + 4], bytes[i3 + 5], bytes[i3 + 6], bytes[i3 + 7], bytes[i3 + 8], bytes[i3 + 9], bytes[i3 + 10]};
                    } else {
                        int i4 = i * 11;
                        int length2 = bytes.length - i4;
                        byte[] bArr2 = new byte[11];
                        for (int i5 = 0; i5 < length2; i5++) {
                            bArr2[i5] = bytes[i4 + i5];
                        }
                        bArr = bArr2;
                    }
                    com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.PushMsgUintReq((byte) type, length, i2, bArr), new com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.SimpleStatusRsp>() { // from class: com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.3
                        @Override // com.oudmon.ble.base.communication.ICommandResponse
                        public void onDataResponse(com.oudmon.ble.base.communication.rsp.SimpleStatusRsp resultEntity) {
                            if (resultEntity.getStatus() == 0) {
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "send msg success");
                            }
                        }
                    });
                    i = i2;
                }
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
    }

    public static synchronized void pushSmsMsgFromTitle(final int type, java.lang.String message) {
        byte[] bArr;
        synchronized (com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.class) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, message);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, preMessageFromTitle);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, preMessage);
            try {
                int EditDistance = EditDistance(message, preMessageFromTitle);
                int EditDistance2 = EditDistance(message, preMessage);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(EditDistance));
                if (EditDistance <= 2 || EditDistance2 <= 2) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "消息一样");
                    return;
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            preMessageFromTitle = message;
            if (message.length() > 256) {
                message = message.substring(0, 256);
            }
            try {
                byte[] bytes = message.getBytes("UTF-8");
                int length = bytes.length / 11;
                if (length == 0) {
                    length = 1;
                } else if (bytes.length % 11 > 0) {
                    length++;
                }
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    if (i2 != length) {
                        int i3 = i * 11;
                        bArr = new byte[]{bytes[i3], bytes[i3 + 1], bytes[i3 + 2], bytes[i3 + 3], bytes[i3 + 4], bytes[i3 + 5], bytes[i3 + 6], bytes[i3 + 7], bytes[i3 + 8], bytes[i3 + 9], bytes[i3 + 10]};
                    } else {
                        int i4 = i * 11;
                        int length2 = bytes.length - i4;
                        byte[] bArr2 = new byte[11];
                        for (int i5 = 0; i5 < length2; i5++) {
                            bArr2[i5] = bytes[i4 + i5];
                        }
                        bArr = bArr2;
                    }
                    com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.PushMsgUintReq((byte) type, length, i2, bArr), new com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.SimpleStatusRsp>() { // from class: com.qcwireless.qcwatch.ui.device.push.utils.MessagePushUtil.4
                        @Override // com.oudmon.ble.base.communication.ICommandResponse
                        public void onDataResponse(com.oudmon.ble.base.communication.rsp.SimpleStatusRsp resultEntity) {
                            if (resultEntity.getStatus() == 0) {
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "send msg success");
                            }
                        }
                    });
                    i = i2;
                }
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
    }

    public static int EditDistance(java.lang.String source, java.lang.String target) {
        try {
            java.lang.String replaceAll = source.replaceAll(" ", "");
            java.lang.String replaceAll2 = target.replaceAll(" ", "");
            char[] charArray = replaceAll.toCharArray();
            char[] charArray2 = replaceAll2.toCharArray();
            int length = charArray.length;
            int length2 = charArray2.length;
            int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) int.class, length + 1, length2 + 1);
            for (int i = 0; i <= length; i++) {
                iArr[i][0] = i;
            }
            for (int i2 = 0; i2 <= length2; i2++) {
                iArr[0][i2] = i2;
            }
            for (int i3 = 1; i3 <= length; i3++) {
                for (int i4 = 1; i4 <= length2; i4++) {
                    int i5 = i3 - 1;
                    int i6 = i4 - 1;
                    if (charArray[i5] == charArray2[i6]) {
                        iArr[i3][i4] = iArr[i5][i6];
                    } else {
                        int i7 = iArr[i3][i6] + 1;
                        int i8 = iArr[i5][i4] + 1;
                        int i9 = iArr[i5][i6] + 1;
                        iArr[i3][i4] = java.lang.Math.min(i7, i8) > java.lang.Math.min(i8, i9) ? java.lang.Math.min(i8, i9) : java.lang.Math.min(i7, i8);
                    }
                }
            }
            return iArr[length][length2];
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return 10;
        }
    }
}
