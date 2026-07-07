package com.qcwireless.qcwatch.ui.base.repository.watchface;

/* compiled from: WatchFaceRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceState;", "", "Lcom/qcwireless/qcwatch/ui/base/bean/response/watchface/WatchFaceResp;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2", f = "WatchFaceRepository.kt", i = {1, 2}, l = {60, 64, 64, 95}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class WatchFaceRepository$getWatchFaceFromServer$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.util.List<? extends com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp>>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $hardwareVersion;
    final /* synthetic */ int $marketVersion;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WatchFaceRepository$getWatchFaceFromServer$2(java.lang.String str, int i, com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2> continuation) {
        super(2, continuation);
        this.$hardwareVersion = str;
        this.$marketVersion = i;
        this.this$0 = watchFaceRepository;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> watchFaceRepository$getWatchFaceFromServer$2 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2(this.$hardwareVersion, this.$marketVersion, this.this$0, continuation);
        watchFaceRepository$getWatchFaceFromServer$2.L$0 = obj;
        return watchFaceRepository$getWatchFaceFromServer$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp>>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L3a
            if (r1 == r5) goto L36
            if (r1 == r4) goto L2e
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Exception -> L1a
            goto Lb4
        L1a:
            r15 = move-exception
            goto Lb1
        L1d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L25:
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Exception -> L1a
            goto L9a
        L2e:
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Exception -> L1a
            goto L7a
        L36:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L5e
        L3a:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.L$0
            kotlinx.coroutines.flow.FlowCollector r15 = (kotlinx.coroutines.flow.FlowCollector) r15
            java.lang.String r1 = r14.$hardwareVersion
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 == 0) goto L61
            com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState r1 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState
            r2 = -10001(0xffffffffffffd8ef, float:NaN)
            r1.<init>(r6, r2, r5, r6)
            r2 = r14
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r14.label = r5
            java.lang.Object r15 = r15.emit(r1, r2)
            if (r15 != r0) goto L5e
            return r0
        L5e:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        L61:
            com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient r1 = com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient.INSTANCE     // Catch: java.lang.Exception -> L1a
            com.qcwireless.qcwatch.ui.base.api.QcService r1 = r1.service()     // Catch: java.lang.Exception -> L1a
            java.lang.String r5 = r14.$hardwareVersion     // Catch: java.lang.Exception -> L1a
            r7 = r14
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7     // Catch: java.lang.Exception -> L1a
            r14.L$0 = r15     // Catch: java.lang.Exception -> L1a
            r14.label = r4     // Catch: java.lang.Exception -> L1a
            java.lang.Object r1 = r1.getWatchFace(r5, r7)     // Catch: java.lang.Exception -> L1a
            if (r1 != r0) goto L77
            return r0
        L77:
            r13 = r1
            r1 = r15
            r15 = r13
        L7a:
            com.qcwireless.qcwatch.ui.base.api.QcResponse r15 = (com.qcwireless.qcwatch.ui.base.api.QcResponse) r15     // Catch: java.lang.Exception -> L1a
            com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2$1 r4 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2$1     // Catch: java.lang.Exception -> L1a
            int r8 = r14.$marketVersion     // Catch: java.lang.Exception -> L1a
            com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository r9 = r14.this$0     // Catch: java.lang.Exception -> L1a
            java.lang.String r10 = r14.$hardwareVersion     // Catch: java.lang.Exception -> L1a
            r12 = 0
            r7 = r4
            r11 = r1
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L1a
            kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4     // Catch: java.lang.Exception -> L1a
            r5 = r14
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch: java.lang.Exception -> L1a
            r14.L$0 = r1     // Catch: java.lang.Exception -> L1a
            r14.label = r3     // Catch: java.lang.Exception -> L1a
            java.lang.Object r15 = com.qcwireless.qcwatch.ui.base.api.QcResponseKt.success(r15, r4, r5)     // Catch: java.lang.Exception -> L1a
            if (r15 != r0) goto L9a
            return r0
        L9a:
            com.qcwireless.qcwatch.ui.base.api.QcResponse r15 = (com.qcwireless.qcwatch.ui.base.api.QcResponse) r15     // Catch: java.lang.Exception -> L1a
            com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2$2 r3 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2$2     // Catch: java.lang.Exception -> L1a
            r3.<init>(r1, r6)     // Catch: java.lang.Exception -> L1a
            kotlin.jvm.functions.Function3 r3 = (kotlin.jvm.functions.Function3) r3     // Catch: java.lang.Exception -> L1a
            r1 = r14
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1     // Catch: java.lang.Exception -> L1a
            r14.L$0 = r6     // Catch: java.lang.Exception -> L1a
            r14.label = r2     // Catch: java.lang.Exception -> L1a
            java.lang.Object r15 = com.qcwireless.qcwatch.ui.base.api.QcResponseKt.error(r15, r3, r1)     // Catch: java.lang.Exception -> L1a
            if (r15 != r0) goto Lb4
            return r0
        Lb1:
            r15.printStackTrace()
        Lb4:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: WatchFaceRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "watchFaceResp", "", "Lcom/qcwireless/qcwatch/ui/base/bean/response/watchface/WatchFaceResp;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2$1", f = "WatchFaceRepository.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.util.List<? extends com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp>>> $$this$flow;
        final /* synthetic */ java.lang.String $hardwareVersion;
        final /* synthetic */ int $marketVersion;
        /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(int i, com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository, java.lang.String str, kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp>>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2.AnonymousClass1> continuation) {
            super(3, continuation);
            this.$marketVersion = i;
            this.this$0 = watchFaceRepository;
            this.$hardwareVersion = str;
            this.$$this$flow = flowCollector;
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2.AnonymousClass1 anonymousClass1 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2.AnonymousClass1(this.$marketVersion, this.this$0, this.$hardwareVersion, this.$$this$flow, continuation);
            anonymousClass1.L$0 = list;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao qcWatchFaceDao;
            com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace;
            com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao qcWatchFaceDao2;
            com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao qcWatchFaceDao3;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.List list = (java.util.List) this.L$0;
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setServerMarketSize(list.size());
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp watchFaceResp = (com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp) it.next();
                    com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace2 = new com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace(watchFaceResp.getName(), watchFaceResp.getHardwareVersion(), watchFaceResp.getPreImageUrl(), watchFaceResp.getBinUrl(), watchFaceResp.getPrice(), 0, watchFaceResp.getWatchDesc(), "", "", this.$marketVersion, watchFaceResp.getTypeId());
                    qcWatchFaceDao = this.this$0.watchFaceDao;
                    com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace queryWatchFaceByNameAndHdVersion = qcWatchFaceDao.queryWatchFaceByNameAndHdVersion(watchFace2.getName(), this.$hardwareVersion);
                    if (queryWatchFaceByNameAndHdVersion != null) {
                        if (queryWatchFaceByNameAndHdVersion.getLocalImageUrl().length() > 0) {
                            if (queryWatchFaceByNameAndHdVersion.getLocalBinUrl().length() > 0) {
                                queryWatchFaceByNameAndHdVersion.setMarketVersion(this.$marketVersion);
                                qcWatchFaceDao3 = this.this$0.watchFaceDao;
                                qcWatchFaceDao3.insert(queryWatchFaceByNameAndHdVersion);
                            }
                        }
                    }
                    java.io.File watchFaceDirFile = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getWatchFaceDirFile();
                    if (com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.fileExists(watchFaceDirFile.getAbsolutePath() + '/' + watchFaceResp.getName())) {
                        watchFace = watchFace2;
                        watchFace.setLocalBinUrl(watchFaceDirFile.getAbsolutePath() + '/' + watchFaceResp.getName());
                    } else {
                        watchFace = watchFace2;
                    }
                    qcWatchFaceDao2 = this.this$0.watchFaceDao;
                    qcWatchFaceDao2.insert(watchFace);
                }
                this.label = 1;
                if (this.$$this$flow.emit(new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState(list, 0), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* compiled from: WatchFaceRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "errorCode", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2$2", f = "WatchFaceRepository.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp>>> $$this$flow;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.watchface.WatchFaceResp>>> flowCollector, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2.AnonymousClass2> continuation) {
            super(3, continuation);
            this.$$this$flow = flowCollector;
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return invoke((kotlinx.coroutines.CoroutineScope) obj, ((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) obj3);
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2.AnonymousClass2 anonymousClass2 = new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository$getWatchFaceFromServer$2.AnonymousClass2(this.$$this$flow, continuation);
            anonymousClass2.I$0 = i;
            return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                int i2 = this.I$0;
                this.label = 1;
                if (this.$$this$flow.emit(new com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceState(null, i2, 1, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }
}
