package com.realsil.sdk.audioconnect.localplayback;

/* loaded from: /tmp/dex/classes2.dex */
public class LocalPlaybackModelClient extends com.realsil.sdk.bbpro.internal.ModelClient<com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback> {
    public static volatile com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient a;

    public LocalPlaybackModelClient(android.content.Context context) {
        super(context);
    }

    public static com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient getInstance() {
        if (a == null) {
            com.realsil.sdk.core.logger.ZLogger.w("please call setup(Context, BeeProManager) first");
        }
        return a;
    }

    public static void initialize(android.content.Context context) {
        if (a == null) {
            synchronized (com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient.class) {
                if (a == null) {
                    a = new com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelClient(context.getApplicationContext());
                }
            }
        }
    }

    public com.realsil.sdk.bbpro.core.BeeError addDeleteSongToPlaylist(int i, int i2, byte[] bArr) {
        if (bArr == null) {
            com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "song name cannot be empty");
            return new com.realsil.sdk.bbpro.core.BeeError(48);
        }
        if (bArr.length == 0) {
            com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "song name length cannot be 0");
            return new com.realsil.sdk.bbpro.core.BeeError(48);
        }
        byte[] bArr2 = new byte[bArr.length + 6];
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr2);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        wrap.putShort(0, (short) i);
        wrap.putShort(2, (short) i2);
        wrap.putShort(4, (short) bArr.length);
        java.lang.System.arraycopy(bArr, 0, bArr2, 6, bArr.length);
        return sendVendorData(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet((short) 1674, bArr2).eventId((short) 1673).build());
    }

    public com.realsil.sdk.bbpro.core.BeeError cancelTransfer() {
        return sendVendorData(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet((short) 1671, new byte[0]).eventId((short) 1670).build());
    }

    public com.realsil.sdk.bbpro.core.BeeError deleteAllSongFromDevice() {
        return sendVendorData(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet((short) 1676, new byte[0]).eventId((short) 1675).build());
    }

    public com.realsil.sdk.bbpro.core.BeeError deleteSingleSongFromDevice(int i, byte[] bArr) {
        if (bArr == null) {
            com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "song name cannot be empty");
            return new com.realsil.sdk.bbpro.core.BeeError(48);
        }
        if (bArr.length == 0) {
            com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "song name length cannot be 0");
            return new com.realsil.sdk.bbpro.core.BeeError(48);
        }
        byte[] bArr2 = new byte[bArr.length + 4];
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr2);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        wrap.putShort(0, (short) i);
        wrap.putShort(2, (short) bArr.length);
        java.lang.System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        return sendVendorData(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet((short) 1673, bArr2).eventId((short) 1672).build());
    }

    public com.realsil.sdk.bbpro.core.BeeError enterSongTransferMode(java.io.File file) {
        if (file == null) {
            com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "song file can not be null");
            return new com.realsil.sdk.bbpro.core.BeeError(48);
        }
        if (!file.exists()) {
            com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "song file not exists");
            return new com.realsil.sdk.bbpro.core.BeeError(48);
        }
        if (file.length() == 0) {
            com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "file content cannot be empty");
            return new com.realsil.sdk.bbpro.core.BeeError(48);
        }
        byte[] bytes = file.getName().getBytes(java.nio.charset.StandardCharsets.UTF_16LE);
        int length = bytes.length + 2;
        int length2 = (int) file.length();
        com.realsil.sdk.core.logger.ZLogger.w(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "enter transfer mode: [songNameLen: " + length + ", songLen: " + length2 + "]");
        int i = length + 2;
        byte[] bArr = new byte[i + 4];
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        wrap.putShort(0, (short) length);
        java.lang.System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        wrap.putInt(i, length2);
        return sendVendorData(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet((short) 1666, bArr).eventId((short) 1666).build());
    }

    public com.realsil.sdk.bbpro.core.BeeError exitSongTransferMode() {
        return sendVendorData(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet((short) 1672, new byte[0]).eventId((short) 1671).build());
    }

    public com.realsil.sdk.bbpro.core.BeeError getFileListData(byte b) {
        return sendVendorData(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(1).packet((short) 1665, new byte[]{b}).build());
    }

    @Override // com.realsil.sdk.bbpro.internal.ModelClient
    public int getVendorCmd() {
        return 0;
    }

    @Override // com.realsil.sdk.bbpro.internal.ModelClient
    public int getVendorEvent() {
        return 0;
    }

    @Override // com.realsil.sdk.bbpro.internal.ModelClient
    public boolean processAckPacket(com.realsil.sdk.bbpro.core.transportlayer.AckPacket ackPacket) {
        short toAckId = ackPacket.getToAckId();
        byte status = ackPacket.getStatus();
        switch (toAckId) {
            case 1664:
                if (status == 2 || status == 1) {
                    com.realsil.sdk.core.logger.ZLogger.w("CMD_QUERY_INFO not supported");
                }
                notifyOperationComplete(1, status);
                break;
            case 1666:
                if (status == 2 || status == 1) {
                    com.realsil.sdk.core.logger.ZLogger.w("CMD_TRANS_START not supported");
                }
                notifyOperationComplete(2, status);
                break;
            case 1667:
                if (status == 2 || status == 1) {
                    com.realsil.sdk.core.logger.ZLogger.w("CMD_TRANS_CONTINUE not supported");
                }
                notifyOperationComplete(3, status);
                break;
            case 1669:
                if (status == 2 || status == 1) {
                    com.realsil.sdk.core.logger.ZLogger.w("CMD_VALID_SONG not supported");
                }
                notifyOperationComplete(4, status);
                break;
            case 1671:
                if (status == 2 || status == 1) {
                    com.realsil.sdk.core.logger.ZLogger.w("CMD_TRANS_CANCEL not supported");
                }
                notifyOperationComplete(5, status);
                break;
            case 1672:
                if (status == 2 || status == 1) {
                    com.realsil.sdk.core.logger.ZLogger.w("CMD_TRANS_EXIT not supported");
                }
                notifyOperationComplete(6, status);
                break;
        }
        return true;
    }

    @Override // com.realsil.sdk.bbpro.internal.ModelClient
    public boolean processEventPacket(com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket transportLayerPacket) {
        short opcode = transportLayerPacket.getOpcode();
        byte[] parameters = transportLayerPacket.getParameters();
        transportLayerPacket.getPayload();
        switch (opcode) {
            case 1664:
                if (parameters == null || parameters.length < 32) {
                    com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "return parameter error");
                } else {
                    java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(parameters);
                    wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                    int i = wrap.getShort(0) & 65535;
                    int i2 = 65535 & wrap.getShort(2);
                    int i3 = wrap.get(4) & 255;
                    byte b = wrap.get(5);
                    int i4 = b & 1;
                    int i5 = (2 & b) >> 1;
                    wrap.get(6);
                    int i6 = wrap.get(7) & 255;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("com.realsil.android.extra.SEND_PACKET_SIZE", i);
                    bundle.putInt("com.realsil.android.extra.BUFFER_CHECK_SIZE", i2);
                    bundle.putInt("com.realsil.android.extra.PROTOCOL_VERSION", i3);
                    bundle.putInt("com.realsil.android.extra.RWS_STATUS", i4);
                    bundle.putInt("com.realsil.android.extra.BUD_ROLE", i5);
                    bundle.putInt("com.realsil.android.extra.SUPPORT_FORMATS", i6);
                    java.util.List<MCB> list = this.mCallbacks;
                    if (list == 0 || list.size() <= 0) {
                        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, "no callback registered");
                    } else {
                        java.util.Iterator it = this.mCallbacks.iterator();
                        while (it.hasNext()) {
                            ((com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback) it.next()).onGetDeviceInfoReport(bundle);
                        }
                    }
                }
                return true;
            case 1665:
                if (parameters == null || parameters.length <= 0) {
                    com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "return parameter error");
                } else {
                    byte b2 = parameters[0];
                    if (b2 == 0) {
                        java.nio.ByteBuffer wrap2 = java.nio.ByteBuffer.wrap(parameters);
                        wrap2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                        int i7 = wrap2.getShort(1) & 65535;
                        long j = wrap2.getInt(3) & 4294967295L;
                        com.realsil.sdk.core.logger.ZLogger.w(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, "current file crc: " + i7 + ", total length: " + j);
                        java.util.List<MCB> list2 = this.mCallbacks;
                        if (list2 != 0 && list2.size() > 0) {
                            java.util.Iterator it2 = this.mCallbacks.iterator();
                            while (it2.hasNext()) {
                                ((com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback) it2.next()).onGetFileHeaderReport(i7, j);
                            }
                        }
                    } else if (b2 == 1 || b2 == 2) {
                        java.nio.ByteBuffer wrap3 = java.nio.ByteBuffer.wrap(parameters);
                        wrap3.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                        int i8 = wrap3.getShort(1) & 65535;
                        com.realsil.sdk.core.logger.ZLogger.w(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, "current file length: " + i8);
                        byte[] bArr = new byte[i8];
                        java.lang.System.arraycopy(parameters, 3, bArr, 0, i8);
                        java.util.List<MCB> list3 = this.mCallbacks;
                        if (list3 != 0 && list3.size() > 0) {
                            for (MCB mcb : this.mCallbacks) {
                                if (b2 == 1) {
                                    mcb.onGetFileContentReport(i8, bArr);
                                } else {
                                    mcb.onGetFileFooterReport(i8, bArr);
                                }
                            }
                        }
                    }
                }
                return true;
            case 1666:
                if (parameters == null || parameters.length <= 0) {
                    com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "return parameter error");
                } else {
                    int i9 = parameters[0] & 255;
                    java.util.List<MCB> list4 = this.mCallbacks;
                    if (list4 == 0 || list4.size() <= 0) {
                        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, "no callback registered");
                    } else {
                        java.util.Iterator it3 = this.mCallbacks.iterator();
                        while (it3.hasNext()) {
                            ((com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback) it3.next()).onEnterSongTransferModeReport(i9 == 1);
                        }
                    }
                }
                return true;
            case 1667:
                if (parameters == null || parameters.length <= 0) {
                    com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "return parameter error");
                } else {
                    int i10 = parameters[0] & 255;
                    java.util.List<MCB> list5 = this.mCallbacks;
                    if (list5 == 0 || list5.size() <= 0) {
                        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, "no callback registered");
                    } else {
                        for (MCB mcb2 : this.mCallbacks) {
                            if (i10 == 241 || i10 == 242) {
                                mcb2.onWriteSuccessReport(i10);
                            } else {
                                mcb2.onWriteFailedReport();
                            }
                        }
                    }
                }
                return true;
            case 1668:
                if (parameters == null || parameters.length <= 0) {
                    com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "return parameter error");
                } else {
                    int i11 = parameters[0] & 255;
                    java.util.List<MCB> list6 = this.mCallbacks;
                    if (list6 == 0 || list6.size() <= 0) {
                        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, "no callback registered");
                    } else {
                        java.util.Iterator it4 = this.mCallbacks.iterator();
                        while (it4.hasNext()) {
                            ((com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback) it4.next()).onTransferWasValidReport(i11);
                        }
                    }
                }
                return true;
            case 1669:
            case 1674:
            default:
                return false;
            case 1670:
                if (parameters == null || parameters.length <= 0) {
                    com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "return parameter error");
                } else {
                    int i12 = parameters[0] & 255;
                    java.util.List<MCB> list7 = this.mCallbacks;
                    if (list7 == 0 || list7.size() <= 0) {
                        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, "no callback registered");
                    } else {
                        java.util.Iterator it5 = this.mCallbacks.iterator();
                        while (it5.hasNext()) {
                            ((com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback) it5.next()).onCancelTransferReport(i12 == 1);
                        }
                    }
                }
                return true;
            case 1671:
                if (parameters == null || parameters.length <= 0) {
                    com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "return parameter error");
                } else {
                    int i13 = parameters[0] & 255;
                    java.util.List<MCB> list8 = this.mCallbacks;
                    if (list8 == 0 || list8.size() <= 0) {
                        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, "no callback registered");
                    } else {
                        java.util.Iterator it6 = this.mCallbacks.iterator();
                        while (it6.hasNext()) {
                            ((com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback) it6.next()).onExitSongTransferModeReport(i13 == 1);
                        }
                    }
                }
                return true;
            case 1672:
                if (parameters == null || parameters.length <= 0) {
                    com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "return parameter error");
                } else {
                    int i14 = parameters[0] & 255;
                    java.util.List<MCB> list9 = this.mCallbacks;
                    if (list9 == 0 || list9.size() <= 0) {
                        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, "no callback registered");
                    } else {
                        java.util.Iterator it7 = this.mCallbacks.iterator();
                        while (it7.hasNext()) {
                            ((com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback) it7.next()).onDeleteSingleSongReport(i14);
                        }
                    }
                }
                return true;
            case 1673:
                if (parameters == null || parameters.length <= 0) {
                    com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "return parameter error");
                } else {
                    int i15 = parameters[0] & 255;
                    java.util.List<MCB> list10 = this.mCallbacks;
                    if (list10 == 0 || list10.size() <= 0) {
                        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, "no callback registered");
                    } else {
                        java.util.Iterator it8 = this.mCallbacks.iterator();
                        while (it8.hasNext()) {
                            ((com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback) it8.next()).onAddOrDeleteSongToPlaylistReport(i15);
                        }
                    }
                }
                return true;
            case 1675:
                if (parameters == null || parameters.length <= 0) {
                    com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "return parameter error");
                } else {
                    int i16 = parameters[0] & 255;
                    java.util.List<MCB> list11 = this.mCallbacks;
                    if (list11 == 0 || list11.size() <= 0) {
                        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, "no callback registered");
                    } else {
                        java.util.Iterator it9 = this.mCallbacks.iterator();
                        while (it9.hasNext()) {
                            ((com.realsil.sdk.audioconnect.localplayback.LocalPlaybackModelCallback) it9.next()).onDeleteAllSongReport(i16);
                        }
                    }
                }
                return true;
        }
    }

    public com.realsil.sdk.bbpro.core.BeeError queryDeviceInfo() {
        com.realsil.sdk.bbpro.core.transportlayer.Command build = new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet((short) 1664, new byte[0]).eventId((short) 1664).build();
        com.realsil.sdk.core.logger.ZLogger.i("send queryDeviceInfo..: " + com.realsil.sdk.core.utility.DataConverter.bytes2HexWithSeparate(build.encode(28)));
        return sendVendorData(build);
    }

    public com.realsil.sdk.bbpro.core.BeeError transfer(short s, short s2, int i, short s3, byte[] bArr) {
        if (s < 0) {
            com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "seq number is invalid");
            return new com.realsil.sdk.bbpro.core.BeeError(48);
        }
        if (s3 <= 0) {
            com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "data length is invalid");
            return new com.realsil.sdk.bbpro.core.BeeError(48);
        }
        if (bArr == null) {
            com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "song data can not be null");
            return new com.realsil.sdk.bbpro.core.BeeError(48);
        }
        if (bArr.length == 0) {
            com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "song data length can not be 0");
            return new com.realsil.sdk.bbpro.core.BeeError(48);
        }
        byte[] bArr2 = new byte[bArr.length + 10];
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr2);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        wrap.putShort(0, s);
        wrap.putShort(2, s2);
        wrap.putInt(4, i);
        wrap.putShort(8, s3);
        java.lang.System.arraycopy(bArr, 0, bArr2, 10, s3);
        return sendVendorData(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(1).packet((short) 1667, bArr2).build());
    }

    public com.realsil.sdk.bbpro.core.BeeError validTransfer(int i) {
        if (i <= 0) {
            com.realsil.sdk.core.logger.ZLogger.e(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "song length is invalid");
            return new com.realsil.sdk.bbpro.core.BeeError(48);
        }
        byte[] bArr = new byte[6];
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        wrap.putInt(0, i);
        wrap.putShort(4, (short) 4660);
        return sendVendorData(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet((short) 1669, bArr).eventId((short) 1668).build());
    }
}
