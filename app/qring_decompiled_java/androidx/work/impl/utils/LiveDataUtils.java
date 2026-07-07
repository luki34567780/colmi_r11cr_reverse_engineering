package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class LiveDataUtils {
    public static <In, Out> androidx.lifecycle.LiveData<Out> dedupedMappedLiveDataFor(androidx.lifecycle.LiveData<In> inputLiveData, final androidx.arch.core.util.Function<In, Out> mappingMethod, final androidx.work.impl.utils.taskexecutor.TaskExecutor workTaskExecutor) {
        java.lang.Object obj = new java.lang.Object();
        androidx.lifecycle.MediatorLiveData mediatorLiveData = new androidx.lifecycle.MediatorLiveData();
        mediatorLiveData.addSource(inputLiveData, new androidx.work.impl.utils.LiveDataUtils.AnonymousClass1(workTaskExecutor, obj, mappingMethod, mediatorLiveData));
        return mediatorLiveData;
    }

    /* JADX INFO: Add missing generic type declarations: [In] */
    /* renamed from: androidx.work.impl.utils.LiveDataUtils$1, reason: invalid class name */
    class AnonymousClass1<In> implements androidx.lifecycle.Observer<In> {
        Out mCurrentOutput = null;
        final /* synthetic */ java.lang.Object val$lock;
        final /* synthetic */ androidx.arch.core.util.Function val$mappingMethod;
        final /* synthetic */ androidx.lifecycle.MediatorLiveData val$outputLiveData;
        final /* synthetic */ androidx.work.impl.utils.taskexecutor.TaskExecutor val$workTaskExecutor;

        AnonymousClass1(final androidx.work.impl.utils.taskexecutor.TaskExecutor val$workTaskExecutor, final java.lang.Object val$lock, final androidx.arch.core.util.Function val$mappingMethod, final androidx.lifecycle.MediatorLiveData val$outputLiveData) {
            this.val$workTaskExecutor = val$workTaskExecutor;
            this.val$lock = val$lock;
            this.val$mappingMethod = val$mappingMethod;
            this.val$outputLiveData = val$outputLiveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(final In input) {
            this.val$workTaskExecutor.executeOnBackgroundThread(new java.lang.Runnable() { // from class: androidx.work.impl.utils.LiveDataUtils.1.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [Out, java.lang.Object] */
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.val$lock) {
                        ?? apply = androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.val$mappingMethod.apply(input);
                        if (androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.mCurrentOutput == 0 && apply != 0) {
                            androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.mCurrentOutput = apply;
                            androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.val$outputLiveData.postValue(apply);
                        } else if (androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.mCurrentOutput != 0 && !androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.mCurrentOutput.equals(apply)) {
                            androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.mCurrentOutput = apply;
                            androidx.work.impl.utils.LiveDataUtils.AnonymousClass1.this.val$outputLiveData.postValue(apply);
                        }
                    }
                }
            });
        }
    }

    private LiveDataUtils() {
    }
}
