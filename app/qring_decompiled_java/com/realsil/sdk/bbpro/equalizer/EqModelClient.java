package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public final class EqModelClient extends com.realsil.sdk.bbpro.equalizer.e {
    public static volatile com.realsil.sdk.bbpro.equalizer.EqModelClient o;

    public class a extends com.realsil.sdk.bbpro.internal.UserTask {
        public a(int i, java.util.UUID uuid) {
            super(i, uuid);
        }

        @Override // com.realsil.sdk.bbpro.internal.UserTask, java.lang.Runnable
        public void run() {
            super.run();
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "queryEqEntryNumber ...");
            startSubTask(false);
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.queryEqEntryNumber().code != 0) {
                stopSubTask();
                com.realsil.sdk.core.logger.ZLogger.w("queryEqEntryNumber failed");
                return;
            }
            waitTaskComplete();
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, java.lang.String.format(java.util.Locale.US, "getMicEqEntryIndex(eqMode=%d) ...", 0));
            startSubTask(false);
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.getEqEntryIndex(new com.realsil.sdk.bbpro.equalizer.GetEqEntryIndexReq.Builder(1, 0).build()).code != 0) {
                stopSubTask();
                com.realsil.sdk.core.logger.ZLogger.w("getMicEqEntryIndex failed");
            } else {
                waitTaskComplete();
                com.realsil.sdk.bbpro.equalizer.EqModelClient eqModelClient = com.realsil.sdk.bbpro.equalizer.EqModelClient.this;
                eqModelClient.b((byte) 0, 0, eqModelClient.getEqInfo());
                com.realsil.sdk.bbpro.equalizer.EqModelClient.this.removeTask(this);
            }
        }
    }

    public class b extends com.realsil.sdk.bbpro.internal.UserTask {
        public b(int i, java.util.UUID uuid) {
            super(i, uuid);
        }

        @Override // com.realsil.sdk.bbpro.internal.UserTask, java.lang.Runnable
        public void run() {
            super.run();
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "queryEqBasicInfo ...");
            startSubTask(false);
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.sendAppReq(new com.realsil.sdk.bbpro.equalizer.f.b().a()).code != 0) {
                stopSubTask();
                com.realsil.sdk.core.logger.ZLogger.w("queryEqBasicInfo failed");
            } else {
                waitTaskComplete();
                com.realsil.sdk.bbpro.equalizer.EqModelClient eqModelClient = com.realsil.sdk.bbpro.equalizer.EqModelClient.this;
                eqModelClient.b((byte) 0, 0, eqModelClient.getEqInfo());
                com.realsil.sdk.bbpro.equalizer.EqModelClient.this.removeTask(this);
            }
        }
    }

    public class c extends com.realsil.sdk.bbpro.internal.UserTask {
        public c(int i, java.util.UUID uuid) {
            super(i, uuid);
        }

        @Override // com.realsil.sdk.bbpro.internal.UserTask, java.lang.Runnable
        public void run() {
            super.run();
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.isGamingModeSupported()) {
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "queryGamingModeState ...");
                startSubTask(false);
                if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.getGamingModeState().code != 0) {
                    stopSubTask();
                    com.realsil.sdk.core.logger.ZLogger.w("queryGamingModeState failed");
                    return;
                }
                waitTaskComplete();
            } else {
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "gaming mode not supported");
            }
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "queryEqEntryNumber and  ...");
            startSubTask(false);
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.getAudioEqSettingIndex().code != 0) {
                stopSubTask();
                com.realsil.sdk.core.logger.ZLogger.w("queryEqEntryNumber failed");
                return;
            }
            waitTaskComplete();
            int i = (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.isGamingModeEqFeatureSupported() && com.realsil.sdk.bbpro.equalizer.EqModelClient.this.isGamingModeEnabled()) ? 1 : 0;
            com.realsil.sdk.bbpro.equalizer.EqModelClient eqModelClient = com.realsil.sdk.bbpro.equalizer.EqModelClient.this;
            eqModelClient.a((byte) 0, i, eqModelClient.getEqInfo());
            com.realsil.sdk.bbpro.equalizer.EqModelClient.this.removeTask(this);
        }
    }

    public class d extends com.realsil.sdk.bbpro.internal.UserTask {
        public d(int i, java.util.UUID uuid) {
            super(i, uuid);
        }

        @Override // com.realsil.sdk.bbpro.internal.UserTask, java.lang.Runnable
        public void run() {
            super.run();
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.isGamingModeSupported()) {
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "queryGamingModeState ...");
                startSubTask(false);
                if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.getGamingModeState().code != 0) {
                    stopSubTask();
                    com.realsil.sdk.core.logger.ZLogger.w("queryGamingModeState failed");
                    return;
                }
                waitTaskComplete();
            } else {
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "gaming mode not supported");
            }
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "queryEqState ...");
            startSubTask(false);
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.queryEqState().code != 0) {
                stopSubTask();
                com.realsil.sdk.core.logger.ZLogger.w("queryEqState failed");
                return;
            }
            waitTaskComplete();
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "queryEqEntryNumber ...");
            startSubTask(false);
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.queryEqEntryNumber().code != 0) {
                stopSubTask();
                com.realsil.sdk.core.logger.ZLogger.w("queryEqEntryNumber failed");
                return;
            }
            waitTaskComplete();
            boolean z = com.realsil.sdk.bbpro.internal.ModelClient.DBG;
            java.util.Locale locale = java.util.Locale.US;
            com.realsil.sdk.core.logger.ZLogger.v(z, java.lang.String.format(locale, "getEqEntryIndex(eqMode=%d) ...", 0));
            startSubTask(false);
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.getEqEntryIndex(new com.realsil.sdk.bbpro.equalizer.GetEqEntryIndexReq.Builder(0, 0).build()).code != 0) {
                stopSubTask();
                com.realsil.sdk.core.logger.ZLogger.w("getEqEntryIndex failed");
                return;
            }
            waitTaskComplete();
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, java.lang.String.format(locale, "getEqEntryIndex(eqMode=%d) ...", 1));
            startSubTask(false);
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.getEqEntryIndex(new com.realsil.sdk.bbpro.equalizer.GetEqEntryIndexReq.Builder(0, 1).build()).code != 0) {
                stopSubTask();
                com.realsil.sdk.core.logger.ZLogger.w("getEqEntryIndex failed");
                return;
            }
            waitTaskComplete();
            int i = (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.isGamingModeEqFeatureSupported() && com.realsil.sdk.bbpro.equalizer.EqModelClient.this.isGamingModeEnabled()) ? 1 : 0;
            com.realsil.sdk.bbpro.equalizer.EqModelClient eqModelClient = com.realsil.sdk.bbpro.equalizer.EqModelClient.this;
            eqModelClient.a((byte) 0, i, eqModelClient.getEqInfo());
            com.realsil.sdk.bbpro.equalizer.EqModelClient.this.removeTask(this);
        }
    }

    public class e extends com.realsil.sdk.bbpro.internal.UserTask {
        public e(int i, java.util.UUID uuid) {
            super(i, uuid);
        }

        @Override // com.realsil.sdk.bbpro.internal.UserTask, java.lang.Runnable
        public void run() {
            super.run();
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.isGamingModeSupported()) {
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "queryGamingModeState ...");
                startSubTask(false);
                if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.getGamingModeState().code != 0) {
                    stopSubTask();
                    com.realsil.sdk.core.logger.ZLogger.w("queryGamingModeState failed");
                    return;
                }
                waitTaskComplete();
            }
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "queryEqEntryNumber ...");
            startSubTask(false);
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.queryEqEntryNumber().code != 0) {
                stopSubTask();
                com.realsil.sdk.core.logger.ZLogger.w("queryEqEntryNumber failed");
                return;
            }
            waitTaskComplete();
            boolean z = com.realsil.sdk.bbpro.internal.ModelClient.DBG;
            java.util.Locale locale = java.util.Locale.US;
            com.realsil.sdk.core.logger.ZLogger.v(z, java.lang.String.format(locale, "getSpkEqEntryIndex(eqMode=%d) ...", 0));
            startSubTask(false);
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.getEqEntryIndex(new com.realsil.sdk.bbpro.equalizer.GetEqEntryIndexReq.Builder(0, 0).build()).code != 0) {
                stopSubTask();
                com.realsil.sdk.core.logger.ZLogger.w("getEqEntryIndex failed");
                return;
            }
            waitTaskComplete();
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.isGamingModeEqFeatureSupported()) {
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, java.lang.String.format(locale, "getSpkEqEntryIndex(eqMode=%d) ...", 1));
                startSubTask(false);
                if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.getEqEntryIndex(new com.realsil.sdk.bbpro.equalizer.GetEqEntryIndexReq.Builder(0, 1).build()).code != 0) {
                    stopSubTask();
                    com.realsil.sdk.core.logger.ZLogger.w("getEqEntryIndex failed");
                    return;
                }
                waitTaskComplete();
            }
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.isAncEqSupported()) {
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, java.lang.String.format(locale, "getSpkEqEntryIndex(eqMode=%d) ...", 2));
                startSubTask(false);
                if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.getEqEntryIndex(new com.realsil.sdk.bbpro.equalizer.GetEqEntryIndexReq.Builder(0, 2).build()).code != 0) {
                    stopSubTask();
                    com.realsil.sdk.core.logger.ZLogger.w("getEqEntryIndex failed");
                    return;
                }
                waitTaskComplete();
            }
            int b = com.realsil.sdk.bbpro.equalizer.EqModelClient.this.b();
            com.realsil.sdk.bbpro.equalizer.EqModelClient eqModelClient = com.realsil.sdk.bbpro.equalizer.EqModelClient.this;
            eqModelClient.a((byte) 0, b, eqModelClient.getEqInfo());
            com.realsil.sdk.bbpro.equalizer.EqModelClient.this.removeTask(this);
        }
    }

    public class f extends com.realsil.sdk.bbpro.internal.UserTask {
        public f(int i, java.util.UUID uuid) {
            super(i, uuid);
        }

        @Override // com.realsil.sdk.bbpro.internal.UserTask, java.lang.Runnable
        public void run() {
            super.run();
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.isGamingModeSupported()) {
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "queryGamingModeState ...");
                startSubTask(false);
                if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.getGamingModeState().code != 0) {
                    stopSubTask();
                    com.realsil.sdk.core.logger.ZLogger.w("queryGamingModeState failed");
                    return;
                }
                waitTaskComplete();
            }
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "queryEqBasicInfo ...");
            startSubTask(false);
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.sendAppReq(new com.realsil.sdk.bbpro.equalizer.f.b().a()).code != 0) {
                stopSubTask();
                com.realsil.sdk.core.logger.ZLogger.w("queryEqBasicInfo failed");
                return;
            }
            waitTaskComplete();
            int b = com.realsil.sdk.bbpro.equalizer.EqModelClient.this.b();
            com.realsil.sdk.bbpro.equalizer.EqModelClient eqModelClient = com.realsil.sdk.bbpro.equalizer.EqModelClient.this;
            eqModelClient.a((byte) 0, b, eqModelClient.getEqInfo());
            com.realsil.sdk.bbpro.equalizer.EqModelClient.this.removeTask(this);
        }
    }

    public class g extends com.realsil.sdk.bbpro.internal.UserTask {
        public g(int i, java.util.UUID uuid) {
            super(i, uuid);
        }

        @Override // com.realsil.sdk.bbpro.internal.UserTask, java.lang.Runnable
        public void run() {
            super.run();
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.isGamingModeSupported()) {
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, "queryGamingModeState ...");
                startSubTask(false);
                if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.getGamingModeState().code != 0) {
                    stopSubTask();
                    com.realsil.sdk.core.logger.ZLogger.w("queryGamingModeState failed");
                    return;
                }
                waitTaskComplete();
            }
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.isGamingModeEqFeatureSupported()) {
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, java.lang.String.format(java.util.Locale.US, "querySpkEqBasicInfo(eqMode=%d, state, number, active index) ...", 1));
                startSubTask(false);
                if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.sendVendorData(new com.realsil.sdk.bbpro.equalizer.f.b().a(1).a().encode()).code != 0) {
                    stopSubTask();
                    com.realsil.sdk.core.logger.ZLogger.w("queryEqBasicInfo failed");
                    return;
                }
                waitTaskComplete();
            }
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.isAncEqSupported()) {
                com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, java.lang.String.format(java.util.Locale.US, "querySpkEqBasicInfo(eqMode=%d, state, number, active index) ...", 2));
                startSubTask(false);
                if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.sendVendorData(new com.realsil.sdk.bbpro.equalizer.f.b().a(2).a().encode()).code != 0) {
                    stopSubTask();
                    com.realsil.sdk.core.logger.ZLogger.w("queryEqBasicInfo failed");
                    return;
                }
                waitTaskComplete();
            }
            com.realsil.sdk.core.logger.ZLogger.v(com.realsil.sdk.bbpro.internal.ModelClient.DBG, java.lang.String.format(java.util.Locale.US, "querySpkEqBasicInfo(eqMode=%d, state, number, active index) ...", 0));
            startSubTask(false);
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.sendVendorData(new com.realsil.sdk.bbpro.equalizer.f.b().a(0).a().encode()).code != 0) {
                stopSubTask();
                com.realsil.sdk.core.logger.ZLogger.w("queryEqBasicInfo failed");
                return;
            }
            waitTaskComplete();
            int b = com.realsil.sdk.bbpro.equalizer.EqModelClient.this.b();
            com.realsil.sdk.bbpro.equalizer.EqModelClient eqModelClient = com.realsil.sdk.bbpro.equalizer.EqModelClient.this;
            eqModelClient.a((byte) 0, b, eqModelClient.getEqInfo());
            com.realsil.sdk.bbpro.equalizer.EqModelClient.this.removeTask(this);
        }
    }

    public class h extends com.realsil.sdk.bbpro.internal.UserTask {
        public final /* synthetic */ com.realsil.sdk.bbpro.equalizer.SetEqIndexParameterReq i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i, java.util.UUID uuid, com.realsil.sdk.bbpro.equalizer.SetEqIndexParameterReq setEqIndexParameterReq) {
            super(i, uuid);
            this.i = setEqIndexParameterReq;
        }

        @Override // com.realsil.sdk.bbpro.internal.UserTask, java.lang.Runnable
        public void run() {
            super.run();
            startSubTask(true);
            if (com.realsil.sdk.bbpro.equalizer.EqModelClient.this.sendVendorData(this.i.encode(com.realsil.sdk.bbpro.equalizer.EqModelClient.this.getEqSpecVersion())).code != 0) {
                com.realsil.sdk.core.logger.ZLogger.w("setEqIndexParameter failed");
                stopSubTask();
                com.realsil.sdk.bbpro.equalizer.EqModelClient.this.a((byte) 5, this.i.getEqType(), this.i.getEqMode(), this.i.getEqIndex());
            } else {
                waitTaskComplete();
                com.realsil.sdk.bbpro.equalizer.EqModelClient.this.a(getTaskStatus(), this.i.getEqType(), this.i.getEqMode(), this.i.getEqIndex());
            }
            com.realsil.sdk.bbpro.equalizer.EqModelClient.this.removeTask(this);
        }
    }

    public EqModelClient(android.content.Context context) {
        super(context);
    }

    public static com.realsil.sdk.bbpro.equalizer.EqModelClient getInstance() {
        if (o == null) {
            com.realsil.sdk.core.logger.ZLogger.w("please call setup(Context, BeeProManager) first");
        }
        return o;
    }

    public static void initialize(android.content.Context context) {
        if (o == null) {
            synchronized (com.realsil.sdk.bbpro.equalizer.EqModelClient.class) {
                if (o == null) {
                    o = new com.realsil.sdk.bbpro.equalizer.EqModelClient(context.getApplicationContext());
                }
            }
        }
    }

    public final int b() {
        if (isGamingModeEqFeatureSupported() && isGamingModeEnabled()) {
            return 1;
        }
        return (isAncEqSupported() && isAncEnabled()) ? 2 : 0;
    }

    public final com.realsil.sdk.bbpro.core.BeeError c() {
        return execute(new com.realsil.sdk.bbpro.equalizer.EqModelClient.c(0, com.realsil.sdk.bbpro.equalizer.e.UUID_EQ_QUERY_BASIC_INFO));
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ byte[] calculateEq(double d2, int i, double[] dArr, double[] dArr2, double[] dArr3) {
        return super.calculateEq(d2, i, dArr, dArr2, dArr3);
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ java.util.List calculateEqWrapper(double d2, int i, double[] dArr, double[] dArr2, double[] dArr3) {
        return super.calculateEqWrapper(d2, i, dArr, dArr2, dArr3);
    }

    public com.realsil.sdk.bbpro.core.BeeError clearDspAudioEQ() {
        return sendVendorData(com.realsil.sdk.bbpro.core.protocol.CommandContract.buildPacket((short) 518));
    }

    public final com.realsil.sdk.bbpro.core.BeeError d() {
        return execute(new com.realsil.sdk.bbpro.equalizer.EqModelClient.d(0, com.realsil.sdk.bbpro.equalizer.e.UUID_EQ_QUERY_BASIC_INFO));
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ com.realsil.sdk.bbpro.equalizer.AudioEq decodeAudioEq(byte b2, byte[] bArr) {
        return super.decodeAudioEq(b2, bArr);
    }

    public com.realsil.sdk.bbpro.core.BeeError disableEq() {
        return sendAppReq(new com.realsil.sdk.bbpro.equalizer.a.b().a());
    }

    public final com.realsil.sdk.bbpro.core.BeeError e() {
        return execute(new com.realsil.sdk.bbpro.equalizer.EqModelClient.e(0, com.realsil.sdk.bbpro.equalizer.e.UUID_EQ_QUERY_BASIC_INFO));
    }

    public com.realsil.sdk.bbpro.core.BeeError enableEq() {
        return sendAppReq(new com.realsil.sdk.bbpro.equalizer.b.C0037b().a());
    }

    public final com.realsil.sdk.bbpro.core.BeeError f() {
        return execute(new com.realsil.sdk.bbpro.equalizer.EqModelClient.f(0, com.realsil.sdk.bbpro.equalizer.e.UUID_EQ_QUERY_BASIC_INFO));
    }

    public final com.realsil.sdk.bbpro.core.BeeError g() {
        return execute(new com.realsil.sdk.bbpro.equalizer.EqModelClient.g(0, com.realsil.sdk.bbpro.equalizer.e.UUID_EQ_QUERY_BASIC_INFO));
    }

    public com.realsil.sdk.bbpro.core.BeeError getAudioEqSettingIndex() {
        return sendVendorData(com.realsil.sdk.bbpro.core.protocol.CommandContract.buildPacket((short) 519));
    }

    public com.realsil.sdk.bbpro.core.BeeError getDspAudioEQ() {
        return sendVendorData(com.realsil.sdk.bbpro.core.protocol.CommandContract.buildPacket((short) 517));
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ com.realsil.sdk.bbpro.DspConfig getDspConfig() {
        return super.getDspConfig();
    }

    public com.realsil.sdk.bbpro.core.BeeError getDspParams() {
        return sendVendorData(com.realsil.sdk.bbpro.core.protocol.CommandContract.buildPacket(com.realsil.sdk.bbpro.core.protocol.CommandContract.CMD_DSP_GET_PARAM));
    }

    public com.realsil.sdk.bbpro.core.BeeError getEqEntryIndex(com.realsil.sdk.bbpro.equalizer.GetEqEntryIndexReq getEqEntryIndexReq) {
        return sendVendorData(getEqEntryIndexReq.encode(getEqSpecVersion()));
    }

    public com.realsil.sdk.bbpro.core.BeeError getEqIndexParameter(byte b2) {
        return getEqIndexParameter(new com.realsil.sdk.bbpro.equalizer.GetEqIndexParameterReq.Builder(0, 0, b2).build());
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ com.realsil.sdk.bbpro.equalizer.EqInfo getEqInfo() {
        return super.getEqInfo();
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ int getEqMechanism() {
        return super.getEqMechanism();
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ int getEqSpecVersion() {
        return super.getEqSpecVersion();
    }

    public com.realsil.sdk.bbpro.core.BeeError getGamingModeState() {
        return sendAppReq(new com.realsil.sdk.bbpro.i.d.b().a());
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e, com.realsil.sdk.bbpro.internal.ModelClient
    public /* bridge */ /* synthetic */ int getVendorCmd() {
        return super.getVendorCmd();
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e, com.realsil.sdk.bbpro.internal.ModelClient
    public /* bridge */ /* synthetic */ int getVendorEvent() {
        return super.getVendorEvent();
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ boolean isAncEnabled() {
        return super.isAncEnabled();
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ boolean isAncEqSupported() {
        return super.isAncEqSupported();
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ boolean isEqEnabled() {
        return super.isEqEnabled();
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ boolean isEqIndexFeatureSupported() {
        return super.isEqIndexFeatureSupported();
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ boolean isEqOnOffSupported() {
        return super.isEqOnOffSupported();
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ boolean isGamingModeEnabled() {
        return super.isGamingModeEnabled();
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ boolean isGamingModeEqFeatureSupported() {
        return super.isGamingModeEqFeatureSupported();
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ boolean isGamingModeSupported() {
        return super.isGamingModeSupported();
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e, com.realsil.sdk.bbpro.internal.ModelClient
    public /* bridge */ /* synthetic */ boolean processAckPacket(com.realsil.sdk.bbpro.core.transportlayer.AckPacket ackPacket) {
        return super.processAckPacket(ackPacket);
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e, com.realsil.sdk.bbpro.internal.ModelClient
    public /* bridge */ /* synthetic */ void processDeviceInfoChanged(com.realsil.sdk.bbpro.model.DeviceInfo deviceInfo, int i) {
        super.processDeviceInfoChanged(deviceInfo, i);
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e, com.realsil.sdk.bbpro.internal.ModelClient
    public /* bridge */ /* synthetic */ boolean processEventPacket(com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket transportLayerPacket) {
        return super.processEventPacket(transportLayerPacket);
    }

    public com.realsil.sdk.bbpro.core.BeeError queryBasicInfo() {
        return queryBasicInfo(0);
    }

    public com.realsil.sdk.bbpro.core.BeeError queryEqEntryNumber() {
        this.n |= this.m;
        return sendAppReq(new com.realsil.sdk.bbpro.equalizer.GetEqInfoReq.Builder((byte) 1).build());
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ com.realsil.sdk.bbpro.core.BeeError queryEqState() {
        return super.queryEqState();
    }

    public com.realsil.sdk.bbpro.core.BeeError queryMicBasicInfo() {
        return getVendorDeviceInfo() == null ? new com.realsil.sdk.bbpro.core.BeeError(16) : getEqSpecVersion() >= 512 ? queryMicBasicInfoV20() : queryMicBasicInfoV0();
    }

    public com.realsil.sdk.bbpro.core.BeeError queryMicBasicInfoV0() {
        com.realsil.sdk.bbpro.model.DeviceInfo vendorDeviceInfo = getVendorDeviceInfo();
        return vendorDeviceInfo == null ? new com.realsil.sdk.bbpro.core.BeeError(16) : !vendorDeviceInfo.isAptEqSupported() ? new com.realsil.sdk.bbpro.core.BeeError(49) : execute(new com.realsil.sdk.bbpro.equalizer.EqModelClient.a(0, com.realsil.sdk.bbpro.equalizer.e.UUID_EQ_QUERY_MIC_BASIC_INFO));
    }

    public com.realsil.sdk.bbpro.core.BeeError queryMicBasicInfoV20() {
        com.realsil.sdk.bbpro.model.DeviceInfo vendorDeviceInfo = getVendorDeviceInfo();
        return vendorDeviceInfo == null ? new com.realsil.sdk.bbpro.core.BeeError(16) : !vendorDeviceInfo.isAptEqSupported() ? new com.realsil.sdk.bbpro.core.BeeError(49) : execute(new com.realsil.sdk.bbpro.equalizer.EqModelClient.b(0, com.realsil.sdk.bbpro.equalizer.e.UUID_EQ_QUERY_MIC_BASIC_INFO));
    }

    public com.realsil.sdk.bbpro.core.BeeError querySpkBasicInfo() {
        if (getVendorDeviceInfo() == null) {
            return new com.realsil.sdk.bbpro.core.BeeError(16);
        }
        int eqSpecVersion = getEqSpecVersion();
        return (eqSpecVersion == 1 || eqSpecVersion == 2 || eqSpecVersion == 3) ? d() : (eqSpecVersion == 4 || eqSpecVersion == 256 || eqSpecVersion == 257 || eqSpecVersion == 258) ? e() : eqSpecVersion == 5 ? g() : eqSpecVersion >= 512 ? f() : c();
    }

    public com.realsil.sdk.bbpro.core.BeeError resetEqIndex(int i, int i2, int i3) {
        int eqSpecVersion = getEqSpecVersion();
        if (eqSpecVersion >= 512) {
            return sendAppReq(new com.realsil.sdk.bbpro.equalizer.ResetEqDataReq.Builder(i, i2, i3).build());
        }
        if (i == 1) {
            return getInstance().setEqEntryIndex(new com.realsil.sdk.bbpro.equalizer.SetEqEntryIndexReq.Builder(i, i2, i3).build());
        }
        if (eqSpecVersion < 4) {
            return new com.realsil.sdk.bbpro.core.BeeError(49);
        }
        return getInstance().setEqEntryIndex(new com.realsil.sdk.bbpro.equalizer.SetEqEntryIndexReq.Builder(i, i2, i3).build());
    }

    public com.realsil.sdk.bbpro.core.BeeError setEqEntryIndex(com.realsil.sdk.bbpro.equalizer.SetEqEntryIndexReq setEqEntryIndexReq) {
        return sendVendorData(setEqEntryIndexReq.encode(getEqSpecVersion()));
    }

    public com.realsil.sdk.bbpro.core.BeeError setEqIndexParameter(com.realsil.sdk.bbpro.equalizer.SetEqIndexParameterReq setEqIndexParameterReq) {
        return execute(new com.realsil.sdk.bbpro.equalizer.EqModelClient.h(0, com.realsil.sdk.bbpro.equalizer.e.UUID_SET_EQ_INDEX_PARAMETER, setEqIndexParameterReq));
    }

    public com.realsil.sdk.bbpro.core.BeeError toggleGamingMode() {
        return com.realsil.sdk.bbpro.vendor.VendorModelClient.getInstance() == null ? new com.realsil.sdk.bbpro.core.BeeError(48) : com.realsil.sdk.bbpro.vendor.VendorModelClient.getInstance().toggleGamingMode();
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ com.realsil.sdk.bbpro.equalizer.EqWrapper wrapperAudioEq(com.realsil.sdk.bbpro.equalizer.AudioEq audioEq) {
        return super.wrapperAudioEq(audioEq);
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ byte[] calculateEq(double d2, int i, double[] dArr, double[] dArr2, double[] dArr3, int[] iArr) {
        return super.calculateEq(d2, i, dArr, dArr2, dArr3, iArr);
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ java.util.List calculateEqWrapper(double d2, int i, double[] dArr, double[] dArr2, double[] dArr3, int[] iArr) {
        return super.calculateEqWrapper(d2, i, dArr, dArr2, dArr3, iArr);
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ com.realsil.sdk.bbpro.equalizer.AudioEq decodeAudioEq(byte b2, byte[] bArr, int i) {
        return super.decodeAudioEq(b2, bArr, i);
    }

    public com.realsil.sdk.bbpro.core.BeeError queryBasicInfo(int i) {
        return i == 0 ? querySpkBasicInfo() : i == 1 ? queryMicBasicInfo() : new com.realsil.sdk.bbpro.core.BeeError(48);
    }

    public com.realsil.sdk.bbpro.core.BeeError setEqIndexParameter(int i, int i2, byte b2, byte[] bArr) {
        return setEqIndexParameter(new com.realsil.sdk.bbpro.equalizer.SetEqIndexParameterReq.Builder(0, i2, b2).mode(i).eqData(bArr).build());
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ byte[] calculateEq(int i, double[] dArr, double[] dArr2, double[] dArr3) {
        return super.calculateEq(i, dArr, dArr2, dArr3);
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ java.util.List calculateEqWrapper(com.realsil.sdk.bbpro.equalizer.AudioEq audioEq) {
        return super.calculateEqWrapper(audioEq);
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ com.realsil.sdk.bbpro.equalizer.AudioEq decodeAudioEq(byte[] bArr) {
        return super.decodeAudioEq(bArr);
    }

    @Override // com.realsil.sdk.bbpro.equalizer.e
    public /* bridge */ /* synthetic */ byte[] calculateEq(com.realsil.sdk.bbpro.equalizer.AudioEq audioEq) {
        return super.calculateEq(audioEq);
    }

    public com.realsil.sdk.bbpro.core.BeeError getEqIndexParameter(int i, byte b2) {
        return getEqIndexParameter(new com.realsil.sdk.bbpro.equalizer.GetEqIndexParameterReq.Builder(0, i, b2).build());
    }

    public com.realsil.sdk.bbpro.core.BeeError setLowLatencyLevel(int i) {
        return sendVendorData(new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet((short) 3588, new byte[]{(byte) (i & 255)}).eventId((short) 3586).build());
    }

    public com.realsil.sdk.bbpro.core.BeeError getEqIndexParameter(com.realsil.sdk.bbpro.equalizer.GetEqIndexParameterReq getEqIndexParameterReq) {
        return sendVendorData(getEqIndexParameterReq.encode(getEqSpecVersion()));
    }
}
