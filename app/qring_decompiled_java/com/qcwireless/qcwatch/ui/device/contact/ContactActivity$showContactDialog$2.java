package com.qcwireless.qcwatch.ui.device.contact;

/* compiled from: ContactActivity.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.device.contact.ContactActivity$showContactDialog$2", f = "ContactActivity.kt", i = {}, l = {368, 369}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class ContactActivity$showContactDialog$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.widget.ImageView $image;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.device.contact.ContactActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactActivity$showContactDialog$2(com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity, android.widget.ImageView imageView, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.device.contact.ContactActivity$showContactDialog$2> continuation) {
        super(2, continuation);
        this.this$0 = contactActivity;
        this.$image = imageView;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.device.contact.ContactActivity$showContactDialog$2(this.this$0, this.$image, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().getDeviceDisplay(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), (kotlin.coroutines.Continuation) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        final com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity = this.this$0;
        final android.widget.ImageView imageView = this.$image;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactActivity$showContactDialog$2.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((java.lang.Integer) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(final java.lang.Integer num, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.String str;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                str = com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this.baseGuideUrl;
                sb.append(str);
                sb.append(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion());
                sb.append(com.luck.picture.lib.config.PictureMimeType.GIF);
                com.bumptech.glide.RequestBuilder diskCacheStrategy = com.bumptech.glide.Glide.with(com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this).asGif().load(sb.toString()).fitCenter().diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.AUTOMATIC);
                final android.widget.ImageView imageView2 = imageView;
                final com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity2 = com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this;
                com.bumptech.glide.request.target.Target into = diskCacheStrategy.into(new com.bumptech.glide.request.target.CustomTarget<com.bumptech.glide.load.resource.gif.GifDrawable>() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactActivity.showContactDialog.2.1.1
                    @Override // com.bumptech.glide.request.target.Target
                    public void onLoadCleared(android.graphics.drawable.Drawable placeholder) {
                    }

                    @Override // com.bumptech.glide.request.target.Target
                    public /* bridge */ /* synthetic */ void onResourceReady(java.lang.Object obj2, com.bumptech.glide.request.transition.Transition transition) {
                        onResourceReady((com.bumptech.glide.load.resource.gif.GifDrawable) obj2, (com.bumptech.glide.request.transition.Transition<? super com.bumptech.glide.load.resource.gif.GifDrawable>) transition);
                    }

                    public void onResourceReady(com.bumptech.glide.load.resource.gif.GifDrawable resource, com.bumptech.glide.request.transition.Transition<? super com.bumptech.glide.load.resource.gif.GifDrawable> transition) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "resource");
                        resource.start();
                        imageView2.setImageDrawable(resource);
                    }

                    @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                    public void onLoadFailed(android.graphics.drawable.Drawable errorDrawable) {
                        super.onLoadFailed(errorDrawable);
                        java.lang.Integer num2 = num;
                        if (num2 != null && num2.intValue() == 1) {
                            final com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity3 = contactActivity2;
                            final android.widget.ImageView imageView3 = imageView2;
                            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.contact.ContactActivity$showContactDialog$2.AnonymousClass1.C00051, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactActivity$showContactDialog$2$1$1$onLoadFailed$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                                    invoke((com.qcwireless.qcwatch.ui.device.contact.ContactActivity$showContactDialog$2.AnonymousClass1.C00051) obj2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(com.qcwireless.qcwatch.ui.device.contact.ContactActivity$showContactDialog$2.AnonymousClass1.C00051 c00051) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c00051, "$this$ktxRunOnUi");
                                    com.bumptech.glide.Glide.with(com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this).asGif().load(java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.drawable.contact_guide)).diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.RESOURCE).into(imageView3);
                                }
                            });
                        } else {
                            final com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity4 = contactActivity2;
                            final android.widget.ImageView imageView4 = imageView2;
                            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.contact.ContactActivity$showContactDialog$2.AnonymousClass1.C00051, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactActivity$showContactDialog$2$1$1$onLoadFailed$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                                    invoke((com.qcwireless.qcwatch.ui.device.contact.ContactActivity$showContactDialog$2.AnonymousClass1.C00051) obj2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(com.qcwireless.qcwatch.ui.device.contact.ContactActivity$showContactDialog$2.AnonymousClass1.C00051 c00051) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c00051, "$this$ktxRunOnUi");
                                    com.bumptech.glide.Glide.with(com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this).asGif().load(java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.drawable.contact_guide_y)).diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.RESOURCE).into(imageView4);
                                }
                            });
                        }
                    }
                });
                return into == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? into : kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
