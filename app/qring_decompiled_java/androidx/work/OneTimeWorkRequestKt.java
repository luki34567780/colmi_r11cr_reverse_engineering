package androidx.work;

/* compiled from: OneTimeWorkRequest.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u0086\b\u001a\u001f\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0086\b¨\u0006\b"}, d2 = {"OneTimeWorkRequestBuilder", "Landroidx/work/OneTimeWorkRequest$Builder;", androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST, "Landroidx/work/ListenableWorker;", "setInputMerger", "inputMerger", "Lkotlin/reflect/KClass;", "Landroidx/work/InputMerger;", "work-runtime-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OneTimeWorkRequestKt {
    public static final /* synthetic */ <W extends androidx.work.ListenableWorker> androidx.work.OneTimeWorkRequest.Builder OneTimeWorkRequestBuilder() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST);
        return new androidx.work.OneTimeWorkRequest.Builder(androidx.work.ListenableWorker.class);
    }

    public static final androidx.work.OneTimeWorkRequest.Builder setInputMerger(androidx.work.OneTimeWorkRequest.Builder builder, kotlin.reflect.KClass<? extends androidx.work.InputMerger> inputMerger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputMerger, "inputMerger");
        androidx.work.OneTimeWorkRequest.Builder inputMerger2 = builder.setInputMerger(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) inputMerger));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputMerger2, "setInputMerger(inputMerger.java)");
        return inputMerger2;
    }
}
