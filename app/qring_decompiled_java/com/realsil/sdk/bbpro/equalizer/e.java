package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public class e extends com.realsil.sdk.bbpro.internal.ModelClient<com.realsil.sdk.bbpro.equalizer.EqModelCallback> {
    public static final int FS_441K = 44100;
    public static final int FS_48K = 48000;
    public static final int FS_96K = 96000;
    public static final java.util.UUID UUID_EQ_QUERY_BASIC_INFO = com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.fromShortValue(769);
    public static final java.util.UUID UUID_EQ_QUERY_MIC_BASIC_INFO = com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.fromShortValue(770);
    public static final java.util.UUID UUID_SET_EQ_INDEX_PARAMETER = com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.fromShortValue(771);
    public com.realsil.sdk.bbpro.DspConfig g;
    public com.realsil.sdk.bbpro.equalizer.EqInfo h;
    public byte i;
    public byte[] j;
    public int k;
    public int l;
    public int m;
    public int n;

    public e(android.content.Context context) {
        super(context);
        this.i = (byte) 0;
        this.k = 0;
        this.l = 1;
        this.m = 2;
        this.n = 0;
        getDspConfig();
    }

    public final int a(double d) {
        int i = (int) d;
        if (i < -12) {
            i = -12;
        }
        if (i > 12) {
            return 12;
        }
        return i;
    }

    public final boolean a(com.realsil.sdk.bbpro.core.transportlayer.AckPacket ackPacket) {
        short toAckId = ackPacket.getToAckId();
        byte status = ackPacket.getStatus();
        if (toAckId == 532) {
            a(status);
            return true;
        }
        switch (toAckId) {
            case 516:
                if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                    com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("onSetAudioEqIndexParamsResponse: 0x%02X", java.lang.Byte.valueOf(status)));
                }
                updateUserTasks(UUID_SET_EQ_INDEX_PARAMETER, status);
                return true;
            case 517:
                if (status != 0) {
                    if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("onGetAudioEqResponse: 0x%02X", java.lang.Byte.valueOf(status)));
                    }
                    a(status, (byte) 0, (byte[]) null);
                }
                return true;
            case 518:
                if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                    com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("onClearAudioEqResponse: 0x%02X", java.lang.Byte.valueOf(status)));
                }
                java.util.List<MCB> list = this.mCallbacks;
                if (list != 0 && list.size() > 0) {
                    java.util.Iterator it = this.mCallbacks.iterator();
                    while (it.hasNext()) {
                        ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it.next()).onClearAudioEqResponse(status);
                    }
                } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                    com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
                }
                return true;
            case 519:
                if (status != 0) {
                    java.util.List<MCB> list2 = this.mCallbacks;
                    if (list2 == 0 || list2.size() <= 0) {
                        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, "no callback registered");
                    } else {
                        if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                            com.realsil.sdk.core.logger.ZLogger.v("not support eq index for old framework, just use realtime eq as default");
                        }
                        java.util.Iterator it2 = this.mCallbacks.iterator();
                        while (it2.hasNext()) {
                            ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it2.next()).onAudioEqIndexReport((byte) 0, 512, 512);
                        }
                    }
                }
                return true;
            case 520:
                a(status, 0);
                return true;
            default:
                return false;
        }
    }

    public final boolean b(com.realsil.sdk.bbpro.core.transportlayer.AckPacket ackPacket) {
        short toAckId = ackPacket.getToAckId();
        byte status = ackPacket.getStatus();
        if (toAckId != 523) {
            if (toAckId == 524) {
                if (status != 0) {
                    updateUserTasks(UUID_EQ_QUERY_MIC_BASIC_INFO, status);
                    a(status, new com.realsil.sdk.bbpro.equalizer.EqEntryIndex(1, 0, 0, 3));
                }
                return true;
            }
            if (toAckId == 528) {
                if (status != 0) {
                    if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("queryEqBasicInfo failed: 0x%02X", java.lang.Byte.valueOf(status)));
                    }
                    updateUserTasks(UUID_EQ_QUERY_BASIC_INFO, status);
                }
                return true;
            }
            if (toAckId != 3587) {
                switch (toAckId) {
                    case 512:
                        if (status != 0) {
                            int i = this.n;
                            int i2 = this.l;
                            if ((i & i2) == i2) {
                                updateUserTasks(UUID_EQ_QUERY_BASIC_INFO, status);
                                a(status, this.i);
                            }
                            int i3 = this.n;
                            int i4 = this.m;
                            if ((i3 & i4) == i4) {
                                updateUserTasks(UUID_EQ_QUERY_BASIC_INFO, status);
                                updateUserTasks(UUID_EQ_QUERY_MIC_BASIC_INFO, status);
                                a(status, 0, 0);
                            }
                        }
                        this.n = this.k;
                        return true;
                    case 513:
                        if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("onEnableAudioEqResponse: 0x%02X", java.lang.Byte.valueOf(status)));
                        }
                        if (status == 0) {
                            if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                                com.realsil.sdk.core.logger.ZLogger.v("automate to query eq state after enable eq");
                            }
                            queryEqState();
                        } else {
                            a(status, this.i);
                        }
                        return true;
                    case 514:
                        if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("onDisableAudioEqResponse: 0x%02X", java.lang.Byte.valueOf(status)));
                        }
                        if (status == 0) {
                            if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                                com.realsil.sdk.core.logger.ZLogger.v("automate to query eq state after disable eq");
                            }
                            queryEqState();
                        } else {
                            a(status, this.i);
                        }
                        return true;
                    case 515:
                        if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("onSetAudioEqIndexParamsResponse: 0x%02X", java.lang.Byte.valueOf(status)));
                        }
                        updateUserTasks(UUID_SET_EQ_INDEX_PARAMETER, status);
                        return true;
                    case 516:
                        if (status != 0) {
                            a(status, (com.realsil.sdk.bbpro.equalizer.EqIndex) null);
                        }
                        return true;
                    case 517:
                        a(status, 0);
                        return true;
                    case 518:
                        if (status != 0) {
                            if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                                com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("onGetAudioEqIndexResponse: 0x%02X", java.lang.Byte.valueOf(status)));
                            }
                            updateUserTasks(UUID_EQ_QUERY_BASIC_INFO, status);
                            a(status, new com.realsil.sdk.bbpro.equalizer.EqEntryIndex(0, 0, 0, 3));
                        }
                        return true;
                    default:
                        return false;
                }
            }
            if (getEqSpecVersion() <= 3) {
                if (status != 0) {
                    updateUserTasks(UUID_EQ_QUERY_BASIC_INFO, status);
                    a(status, new com.realsil.sdk.bbpro.equalizer.EqEntryIndex(0, 1, 0, 3));
                }
                return true;
            }
        }
        a(status, 1);
        return true;
    }

    public byte[] calculateEq(com.realsil.sdk.bbpro.equalizer.AudioEq audioEq) {
        return calculateEq(audioEq.getGlobalGain(), audioEq.getStageNum(), audioEq.getGains(), audioEq.getFreq(), audioEq.getQ(), audioEq.getBiquadType());
    }

    public java.util.List<com.realsil.sdk.bbpro.equalizer.EqWrapper> calculateEqWrapper(com.realsil.sdk.bbpro.equalizer.AudioEq audioEq) {
        return calculateEqWrapper(audioEq.getGlobalGain(), audioEq.getStageNum(), audioEq.getGains(), audioEq.getFreq(), audioEq.getQ(), audioEq.getBiquadType());
    }

    public com.realsil.sdk.bbpro.equalizer.AudioEq decodeAudioEq(byte[] bArr) {
        return decodeAudioEq((byte) 3, bArr, bArr.length);
    }

    public com.realsil.sdk.bbpro.DspConfig getDspConfig() {
        if (this.g == null) {
            this.g = new com.realsil.sdk.bbpro.DspConfig();
        }
        return this.g;
    }

    public com.realsil.sdk.bbpro.equalizer.EqInfo getEqInfo() {
        if (this.h == null) {
            this.h = new com.realsil.sdk.bbpro.equalizer.EqInfo();
        }
        return this.h;
    }

    public int getEqMechanism() {
        int eqSpecVersion = getEqSpecVersion();
        if (eqSpecVersion >= 4) {
            return 2;
        }
        return eqSpecVersion >= 1 ? 1 : 0;
    }

    public int getEqSpecVersion() {
        com.realsil.sdk.bbpro.model.DeviceInfo vendorDeviceInfo = getVendorDeviceInfo();
        if (vendorDeviceInfo == null) {
            return 0;
        }
        return vendorDeviceInfo.getEqSpecVersion();
    }

    @Override // com.realsil.sdk.bbpro.internal.ModelClient
    public int getVendorCmd() {
        return 0;
    }

    @Override // com.realsil.sdk.bbpro.internal.ModelClient
    public int getVendorEvent() {
        return 0;
    }

    public boolean isAncEnabled() {
        com.realsil.sdk.bbpro.model.DeviceInfo vendorDeviceInfo = getVendorDeviceInfo();
        if (vendorDeviceInfo == null) {
            return false;
        }
        return vendorDeviceInfo.isAncEnabled();
    }

    public boolean isAncEqSupported() {
        com.realsil.sdk.bbpro.model.DeviceInfo vendorDeviceInfo = getVendorDeviceInfo();
        if (vendorDeviceInfo == null) {
            return false;
        }
        return vendorDeviceInfo.isAncEqConfigureSupported();
    }

    public boolean isEqEnabled() {
        return this.i == 1;
    }

    public boolean isEqIndexFeatureSupported() {
        return true;
    }

    public boolean isEqOnOffSupported() {
        return getEqSpecVersion() < 4;
    }

    public boolean isGamingModeEnabled() {
        com.realsil.sdk.bbpro.model.DeviceInfo vendorDeviceInfo = getVendorDeviceInfo();
        if (vendorDeviceInfo == null) {
            return false;
        }
        return vendorDeviceInfo.isGamingModeEnabled();
    }

    public boolean isGamingModeEqFeatureSupported() {
        com.realsil.sdk.bbpro.model.DeviceInfo vendorDeviceInfo = getVendorDeviceInfo();
        if (vendorDeviceInfo == null) {
            return false;
        }
        return vendorDeviceInfo.isGamingModeEqSupported();
    }

    public boolean isGamingModeSupported() {
        com.realsil.sdk.bbpro.model.DeviceInfo vendorDeviceInfo = getVendorDeviceInfo();
        if (vendorDeviceInfo == null) {
            return false;
        }
        return vendorDeviceInfo.isGamingModeSupported();
    }

    @Override // com.realsil.sdk.bbpro.internal.ModelClient
    public boolean processAckPacket(com.realsil.sdk.bbpro.core.transportlayer.AckPacket ackPacket) {
        int eqSpecVersion = getEqSpecVersion();
        return eqSpecVersion == 0 ? a(ackPacket) : eqSpecVersion >= 1 ? b(ackPacket) : a(ackPacket);
    }

    @Override // com.realsil.sdk.bbpro.internal.ModelClient
    public void processDeviceInfoChanged(com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo, int i) {
        super.processDeviceInfoChanged(deviceInfo, i);
        if (i == 21) {
            boolean z = getEqInfo().gamingModeEnabled != deviceInfo.isGamingModeEnabled();
            getEqInfo().setGamingModeEnabled(deviceInfo.isGamingModeEnabled());
            updateUserTasks(UUID_EQ_QUERY_BASIC_INFO, (byte) 0);
            if (z) {
                a(deviceInfo.isGamingModeEnabled());
            }
        }
    }

    @Override // com.realsil.sdk.bbpro.internal.ModelClient
    public boolean processEventPacket(com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket transportLayerPacket) {
        int eqSpecVersion = getEqSpecVersion();
        return eqSpecVersion == 0 ? a(transportLayerPacket) : eqSpecVersion >= 1 ? b(transportLayerPacket) : a(transportLayerPacket);
    }

    public com.realsil.sdk.bbpro.core.BeeError queryEqState() {
        this.n |= this.l;
        return sendAppReq(new com.realsil.sdk.bbpro.equalizer.GetEqInfoReq.Builder((byte) 0).build());
    }

    public com.realsil.sdk.bbpro.equalizer.EqWrapper wrapperAudioEq(com.realsil.sdk.bbpro.equalizer.AudioEq audioEq) {
        java.util.List<com.realsil.sdk.bbpro.equalizer.EqWrapper> calculateEqWrapper = calculateEqWrapper(audioEq.getGlobalGain(), audioEq.getStageNum(), audioEq.getGains(), audioEq.getFreq(), audioEq.getQ(), audioEq.getBiquadType());
        if (calculateEqWrapper != null && calculateEqWrapper.size() > 0) {
            for (com.realsil.sdk.bbpro.equalizer.EqWrapper eqWrapper : calculateEqWrapper) {
                if (eqWrapper.sampleRate == audioEq.getSampleRate()) {
                    return eqWrapper;
                }
            }
        }
        return null;
    }

    public byte[] calculateEq(int i, double[] dArr, double[] dArr2, double[] dArr3) {
        return calculateEq(0.0d, i, dArr, dArr2, dArr3, com.realsil.sdk.bbpro.equalizer.AudioEq.BIQUAD_TYPE);
    }

    public java.util.List<com.realsil.sdk.bbpro.equalizer.EqWrapper> calculateEqWrapper(double d, int i, double[] dArr, double[] dArr2, double[] dArr3) {
        return calculateEqWrapper(d, i, dArr, dArr2, dArr3, com.realsil.sdk.bbpro.equalizer.AudioEq.BIQUAD_TYPE);
    }

    public com.realsil.sdk.bbpro.equalizer.AudioEq decodeAudioEq(byte b, byte[] bArr) {
        return decodeAudioEq(b, bArr, bArr.length);
    }

    public byte[] calculateEq(double d, int i, double[] dArr, double[] dArr2, double[] dArr3) {
        return calculateEq(d, i, dArr, dArr2, dArr3, com.realsil.sdk.bbpro.equalizer.AudioEq.BIQUAD_TYPE);
    }

    public java.util.List<com.realsil.sdk.bbpro.equalizer.EqWrapper> calculateEqWrapper(double d, int i, double[] dArr, double[] dArr2, double[] dArr3, int[] iArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte[] calculateEq = calculateEq(d, i, dArr, dArr2, dArr3, iArr);
        if (calculateEq != null && calculateEq.length > 0) {
            int length = (calculateEq.length / 3) - 12;
            if (length <= 0) {
                com.realsil.sdk.core.logger.ZLogger.d("invalid eqDataLength: " + length);
                return arrayList;
            }
            byte[] bArr = new byte[length];
            byte[] bArr2 = new byte[length];
            byte[] bArr3 = new byte[length];
            java.lang.System.arraycopy(calculateEq, 12, bArr, 0, length);
            int i2 = length + 12 + 12;
            java.lang.System.arraycopy(calculateEq, i2, bArr2, 0, length);
            java.lang.System.arraycopy(calculateEq, i2 + length + 12, bArr3, 0, length);
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqWrapper((byte) 3, bArr));
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqWrapper((byte) 4, bArr2));
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqWrapper((byte) 6, bArr3));
            return arrayList;
        }
        com.realsil.sdk.core.logger.ZLogger.d("calculateEq failed");
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:18:0x0057, B:19:0x005f, B:21:0x0063, B:23:0x006d, B:25:0x0071, B:28:0x0074), top: B:17:0x0057 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.realsil.sdk.bbpro.equalizer.AudioEq decodeAudioEq(byte r16, byte[] r17, int r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r12 = r17
            r2 = r18
            com.realsil.sdk.bbpro.internal.BaseBeeProManager r3 = r1.a
            r13 = 0
            if (r3 != 0) goto L12
            java.lang.String r0 = "please call setup(BaseBeeProManager) method first"
            com.realsil.sdk.core.logger.ZLogger.w(r0)
            return r13
        L12:
            r3 = 2
            r4 = 1
            r5 = 0
            if (r12 == 0) goto L9b
            int r6 = r12.length
            if (r6 >= r2) goto L1c
            goto L9b
        L1c:
            r6 = 6
            r7 = 3
            r8 = 4
            if (r0 != r7) goto L22
            goto L2e
        L22:
            if (r0 != r8) goto L28
            r9 = 48000(0xbb80, float:6.7262E-41)
            goto L31
        L28:
            if (r0 != r6) goto L2e
            r9 = 96000(0x17700, float:1.34525E-40)
            goto L31
        L2e:
            r9 = 44100(0xac44, float:6.1797E-41)
        L31:
            int r10 = r2 + 8
            byte[] r10 = new byte[r10]
            r10[r5] = r5
            r10[r4] = r5
            int r4 = r2 + 4
            r11 = r4 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            r10[r3] = r11
            r3 = 8
            int r4 = r4 >> r3
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r10[r7] = r4
            r10[r8] = r5
            r4 = 5
            r10[r4] = r5
            r10[r6] = r5
            r4 = 7
            r10[r4] = r5
            if (r2 <= 0) goto L57
            java.lang.System.arraycopy(r12, r5, r10, r3, r2)
        L57:
            com.realsil.sdk.bbpro.DspConfig r2 = r15.getDspConfig()     // Catch: java.lang.Exception -> L92
            com.realsil.sdk.bbpro.DspConfig$SigProcEQ_T r2 = r2.parseEq(r10, r9)     // Catch: java.lang.Exception -> L92
        L5f:
            int r3 = r2.StageNum     // Catch: java.lang.Exception -> L92
            if (r5 >= r3) goto L74
            double[] r3 = r2.Q     // Catch: java.lang.Exception -> L92
            r6 = r3[r5]     // Catch: java.lang.Exception -> L92
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 > 0) goto L71
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3[r5] = r6     // Catch: java.lang.Exception -> L92
        L71:
            int r5 = r5 + 1
            goto L5f
        L74:
            com.realsil.sdk.bbpro.equalizer.AudioEq r14 = new com.realsil.sdk.bbpro.equalizer.AudioEq     // Catch: java.lang.Exception -> L92
            int r3 = r2.StageNum     // Catch: java.lang.Exception -> L92
            double r4 = r2.GlobalGain     // Catch: java.lang.Exception -> L92
            int r4 = r15.a(r4)     // Catch: java.lang.Exception -> L92
            double r4 = (double) r4     // Catch: java.lang.Exception -> L92
            int r7 = r2.Accuracy     // Catch: java.lang.Exception -> L92
            double[] r8 = r2.Freq     // Catch: java.lang.Exception -> L92
            double[] r9 = r2.Q     // Catch: java.lang.Exception -> L92
            double[] r10 = r2.Gain     // Catch: java.lang.Exception -> L92
            int[] r11 = r2.BiquadType     // Catch: java.lang.Exception -> L92
            r2 = r14
            r6 = r16
            r12 = r17
            r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L92
            return r14
        L92:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            com.realsil.sdk.core.logger.ZLogger.w(r0)
            return r13
        L9b:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r16)
            r3[r5] = r0
            java.lang.String r0 = com.realsil.sdk.core.utility.DataConverter.bytes2Hex(r17)
            r3[r4] = r0
            java.lang.String r0 = "invalid eqSampleRate=0x%02x, eqData=%s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            com.realsil.sdk.core.logger.ZLogger.w(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.bbpro.equalizer.e.decodeAudioEq(byte, byte[], int):com.realsil.sdk.bbpro.equalizer.AudioEq");
    }

    public byte[] calculateEq(double d, int i, double[] dArr, double[] dArr2, double[] dArr3, int[] iArr) {
        if (this.a == null) {
            com.realsil.sdk.core.logger.ZLogger.w("please call setup(BaseBeeProManager) method first");
            return null;
        }
        if (i > 0 && dArr != null && dArr2 != null && dArr3 != null) {
            if (dArr.length < i || dArr2.length < i || dArr3.length < i) {
                com.realsil.sdk.core.logger.ZLogger.w("invalid params length");
                return null;
            }
            if (d <= 12.0d && d >= -12.0d) {
                for (int i2 = 0; i2 < i; i2++) {
                    double d2 = dArr[i2];
                    double d3 = dArr3[i2];
                    double d4 = dArr2[i2];
                    if (d2 > 12.0d || d2 < -12.0d) {
                        com.realsil.sdk.core.logger.ZLogger.w(java.lang.String.format(java.util.Locale.US, "gain should between:[%d~%d]", -12, 12));
                        return null;
                    }
                    if (d3 <= 0.0d) {
                        com.realsil.sdk.core.logger.ZLogger.w("q should between:(0, INF]");
                        return null;
                    }
                    if (d4 <= 0.0d) {
                        com.realsil.sdk.core.logger.ZLogger.w("freq should between:(0, Fs/2]");
                        return null;
                    }
                }
                return getDspConfig().calculateEq(d, i, dArr, dArr2, dArr3, iArr);
            }
            com.realsil.sdk.core.logger.ZLogger.w(java.lang.String.format(java.util.Locale.US, "globalGain should between:[%d~%d]", -12, 12));
            return null;
        }
        com.realsil.sdk.core.logger.ZLogger.w("invalid params");
        return null;
    }

    public final boolean a(com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket transportLayerPacket) {
        short opcode = transportLayerPacket.getOpcode();
        byte[] parameters = transportLayerPacket.getParameters();
        byte[] payload = transportLayerPacket.getPayload();
        switch (opcode) {
            case 513:
                if (parameters != null && parameters.length > 0) {
                    if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                        com.realsil.sdk.core.logger.ZLogger.v(">> EVENT_DSP_STATUS");
                    }
                    java.util.List<MCB> list = this.mCallbacks;
                    if (list != 0 && list.size() > 0) {
                        java.util.Iterator it = this.mCallbacks.iterator();
                        while (it.hasNext()) {
                            ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it.next()).onDspStatusChanged(parameters[0]);
                        }
                    } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                        com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
                    }
                }
                return true;
            case 514:
            default:
                return false;
            case 515:
                if (parameters != null && parameters.length > 18) {
                    if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                        com.realsil.sdk.core.logger.ZLogger.d(">> EVENT_DSP_REPORT_PARAM");
                    }
                    com.realsil.sdk.bbpro.model.DspParams dspParams = new com.realsil.sdk.bbpro.model.DspParams(parameters);
                    java.util.List<MCB> list2 = this.mCallbacks;
                    if (list2 != 0 && list2.size() > 0) {
                        java.util.Iterator it2 = this.mCallbacks.iterator();
                        while (it2.hasNext()) {
                            ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it2.next()).onDspParamsChanged(dspParams);
                        }
                    } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                        com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
                    }
                }
                return true;
            case 516:
                if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                    com.realsil.sdk.core.logger.ZLogger.v(">> EVENT_DSP_REPORT_AUDIO_EQ");
                }
                a(parameters);
                return true;
            case 517:
                com.realsil.sdk.bbpro.c.b a = com.realsil.sdk.bbpro.c.b.a(payload);
                if (a != null) {
                    com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, a.toString());
                    java.util.List<MCB> list3 = this.mCallbacks;
                    if (list3 != 0 && list3.size() > 0) {
                        java.util.Iterator it3 = this.mCallbacks.iterator();
                        while (it3.hasNext()) {
                            ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it3.next()).onAudioEqIndexReport((byte) 0, a.a, a.b);
                        }
                    } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
                        com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
                    }
                }
                return true;
        }
    }

    public final boolean b(com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket transportLayerPacket) {
        com.realsil.sdk.bbpro.equalizer.EqWrapper wrapperAudioEq;
        transportLayerPacket.getPayload();
        short opcode = transportLayerPacket.getOpcode();
        byte[] parameters = transportLayerPacket.getParameters();
        if (opcode != 518) {
            if (opcode != 520) {
                if (opcode == 3585) {
                    int eqSpecVersion = getEqSpecVersion();
                    com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, java.lang.String.format("eqSpecVersion=0x%04X", java.lang.Integer.valueOf(eqSpecVersion)));
                    if (eqSpecVersion <= 3) {
                        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, "process EVENT_GAMING_MODE_EQ_INDEX");
                        if (parameters != null && parameters.length >= 1) {
                            getEqInfo().setEqActiveIndex(0, 1, parameters[0]);
                            updateUserTasks(UUID_EQ_QUERY_BASIC_INFO, (byte) 0);
                            a((byte) 0, new com.realsil.sdk.bbpro.equalizer.EqEntryIndex(0, 1, parameters[0], 2));
                        }
                        return true;
                    }
                    com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, "ignore EVENT_GAMING_MODE_EQ_INDEX");
                } else {
                    switch (opcode) {
                        case 512:
                            if (parameters != null && parameters.length >= 1) {
                                byte b = parameters[0];
                                if (b == 0) {
                                    if (parameters.length >= 2) {
                                        this.i = parameters[1];
                                        getEqInfo().setEqEnabled(parameters[1] == 1);
                                        com.realsil.sdk.core.logger.ZLogger.v(getEqInfo().toString());
                                        updateUserTasks(UUID_EQ_QUERY_BASIC_INFO, (byte) 0);
                                    }
                                    a((byte) 0, this.i);
                                } else if (b == 1) {
                                    getEqInfo().updateEqConfigure1(parameters);
                                    updateUserTasks(UUID_EQ_QUERY_BASIC_INFO, (byte) 0);
                                    updateUserTasks(UUID_EQ_QUERY_MIC_BASIC_INFO, (byte) 0);
                                    a((byte) 0, getEqInfo().normalModeEntryNumber, getEqInfo().gamingModeEntryNumber);
                                } else {
                                    com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, java.lang.String.format(java.util.Locale.US, "Unknown query type: 0x%02X", java.lang.Byte.valueOf(b)));
                                }
                            }
                            return true;
                        case 513:
                            int eqSpecVersion2 = getEqSpecVersion();
                            com.realsil.sdk.bbpro.equalizer.EqIndex parse = com.realsil.sdk.bbpro.equalizer.EqIndex.parse(eqSpecVersion2, parameters);
                            if (parse != null) {
                                if (eqSpecVersion2 == 2 || eqSpecVersion2 == 3) {
                                    parse.audioEq = decodeAudioEq(parse.sampleRate, parse.eqData);
                                } else if (eqSpecVersion2 == 4 || eqSpecVersion2 == 5) {
                                    parse.audioEq = decodeAudioEq(parse.sampleRate, parse.eqData);
                                } else if ((eqSpecVersion2 == 256 || eqSpecVersion2 == 257 || eqSpecVersion2 >= 258) && (wrapperAudioEq = wrapperAudioEq(parse.audioEq)) != null) {
                                    parse.eqData = wrapperAudioEq.eqData;
                                }
                            }
                            a((byte) 0, parse);
                            return true;
                        case 514:
                            com.realsil.sdk.bbpro.equalizer.d b2 = com.realsil.sdk.bbpro.equalizer.d.b(parameters);
                            if (b2 != null) {
                                getEqInfo().setEqActiveIndex(b2.a, b2.b, b2.c);
                                com.realsil.sdk.core.logger.ZLogger.v(getEqInfo().toString());
                                updateUserTasks(UUID_EQ_QUERY_BASIC_INFO, (byte) 0);
                                a((byte) 0, b2.a());
                            }
                            return true;
                        default:
                            return false;
                    }
                }
            }
            com.realsil.sdk.bbpro.equalizer.c a = com.realsil.sdk.bbpro.equalizer.c.a(getEqSpecVersion(), parameters);
            if (a != null) {
                getEqInfo().setEqBasicInfo(getEqSpecVersion(), a);
                updateUserTasks(UUID_EQ_QUERY_BASIC_INFO, (byte) 0);
                updateUserTasks(UUID_EQ_QUERY_MIC_BASIC_INFO, (byte) 0);
            }
            return true;
        }
        com.realsil.sdk.bbpro.equalizer.d a2 = com.realsil.sdk.bbpro.equalizer.d.a(parameters);
        if (a2 != null) {
            getEqInfo().setEqActiveIndex(a2.a, a2.b, a2.c);
            updateUserTasks(UUID_EQ_QUERY_MIC_BASIC_INFO, (byte) 0);
            a((byte) 0, a2.a());
        }
        return true;
    }

    public final void a(byte[] bArr) {
        com.realsil.sdk.bbpro.c.a a = com.realsil.sdk.bbpro.c.a.a(bArr);
        if (a == null) {
            this.j = null;
            return;
        }
        byte b = a.b();
        if (b == -1) {
            this.j = null;
            a((byte) 0, a.a(), a.c());
        } else {
            if (b == 1) {
                this.j = a.c();
                return;
            }
            if (b == 2) {
                this.j = a.c(this.j);
            } else {
                if (b != 3) {
                    return;
                }
                a((byte) 0, a.a(), a.c(this.j));
                this.j = null;
            }
        }
    }

    public final void a(byte b, byte b2) {
        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, java.lang.String.format("dispatchAudioEqStateChanged: 0x%02X, state=0x%02X", java.lang.Byte.valueOf(b), java.lang.Byte.valueOf(b2)));
        java.util.List<MCB> list = this.mCallbacks;
        if (list != 0 && list.size() > 0) {
            java.util.Iterator it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it.next()).onAudioEqStateReport(b, b2);
            }
        } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
        }
    }

    public final void a(boolean z) {
        com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.VDBG, java.lang.String.format("dispatchGamingModeStateChanged:%b", java.lang.Boolean.valueOf(z)));
        java.util.List<MCB> list = this.mCallbacks;
        if (list != 0 && list.size() > 0) {
            java.util.Iterator it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it.next()).onGamingModeStatusChanged(z);
            }
        } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
        }
    }

    public final void a(byte b, int i, int i2) {
        java.util.List<MCB> list = this.mCallbacks;
        if (list != 0 && list.size() > 0) {
            java.util.Iterator it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it.next()).onAudioEqEntryNumberReport((byte) 0, i, i2);
            }
        } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
        }
    }

    public void a(byte b, int i, com.realsil.sdk.bbpro.equalizer.EqInfo eqInfo) {
        if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "dispatchAudioEqBasicInfoReport: 0x%02X, mode=%d, eqInfo=%s", java.lang.Byte.valueOf(b), java.lang.Integer.valueOf(i), eqInfo.toString()));
        }
        java.util.List<MCB> list = this.mCallbacks;
        if (list != 0 && list.size() > 0) {
            java.util.Iterator it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it.next()).onAudioEqBasicInfoReport(b, i, eqInfo);
            }
        } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
        }
    }

    public void a(byte b, int i) {
        if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "dispatchSetAudioEqIndexResponse: 0x%02X, eqType=%02X", java.lang.Byte.valueOf(b), java.lang.Integer.valueOf(i)));
        }
        java.util.List<MCB> list = this.mCallbacks;
        if (list != 0 && list.size() > 0) {
            java.util.Iterator it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it.next()).onSetAudioEqIndexResponse(b, i);
            }
        } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
        }
    }

    public void a(byte b) {
        if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "dispatchResetAudioEqIndexResponse: 0x%02X", java.lang.Byte.valueOf(b)));
        }
        java.util.List<MCB> list = this.mCallbacks;
        if (list != 0 && list.size() > 0) {
            java.util.Iterator it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it.next()).onResetAudioEqIndexResponse(b);
            }
        } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
        }
    }

    public void a(byte b, com.realsil.sdk.bbpro.equalizer.EqEntryIndex eqEntryIndex) {
        if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "dispatchAudioEqEntryIndexChanged: 0x%02X, %s", java.lang.Byte.valueOf(b), eqEntryIndex.toString()));
        }
        java.util.List<MCB> list = this.mCallbacks;
        if (list != 0 && list.size() > 0) {
            java.util.Iterator it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it.next()).onAudioEqEntryIndexReport(b, eqEntryIndex);
            }
        } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
        }
    }

    public void a(byte b, com.realsil.sdk.bbpro.equalizer.EqIndex eqIndex) {
        if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Byte.valueOf(b);
            objArr[1] = eqIndex != null ? eqIndex.toString() : "";
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("dispatchAudioEqIndexParamsReport: 0x%02X, %s", objArr));
        }
        java.util.List<MCB> list = this.mCallbacks;
        if (list != 0 && list.size() > 0) {
            java.util.Iterator it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it.next()).onAudioEqIndexParamsReport(b, eqIndex);
            }
        } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
        }
    }

    public void a(byte b, int i, int i2, int i3) {
        if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "dispatchSetAudioEqIndexParamsResponse: 0x%02X, eqType=%d,eqMode=%d,eqIndex=%d", java.lang.Byte.valueOf(b), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
        }
        java.util.List<MCB> list = this.mCallbacks;
        if (list != 0 && list.size() > 0) {
            java.util.Iterator it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it.next()).onSetAudioEqIndexParamsResponse(b, i, i2, i3);
            }
        } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
        }
    }

    public final void a(byte b, byte b2, byte[] bArr) {
        java.util.List<MCB> list = this.mCallbacks;
        if (list != 0 && list.size() > 0) {
            java.util.Iterator it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it.next()).onDspAudioEqReport(b, b2, bArr);
            }
        } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
        }
    }

    public void b(byte b, int i, com.realsil.sdk.bbpro.equalizer.EqInfo eqInfo) {
        if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "dispatchMicAudioEqBasicInfoReport: 0x%02X, mode=%d, eqInfo=%s", java.lang.Byte.valueOf(b), java.lang.Integer.valueOf(i), eqInfo.toString()));
        }
        java.util.List<MCB> list = this.mCallbacks;
        if (list != 0 && list.size() > 0) {
            java.util.Iterator it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                ((com.realsil.sdk.bbpro.equalizer.EqModelCallback) it.next()).onMicAudioEqBasicInfoReport(b, i, eqInfo);
            }
        } else if (com.realsil.sdk.bbpro.internal.ModelClient.VDBG) {
            com.realsil.sdk.core.logger.ZLogger.v("no callback registered");
        }
    }
}
