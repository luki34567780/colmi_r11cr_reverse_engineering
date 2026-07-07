package coil.request;

/* compiled from: Disposable.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcoil/request/OneShotDisposable;", "Lcoil/request/Disposable;", "job", "Lkotlinx/coroutines/Deferred;", "Lcoil/request/ImageResult;", "(Lkotlinx/coroutines/Deferred;)V", "isDisposed", "", "()Z", "getJob", "()Lkotlinx/coroutines/Deferred;", "dispose", "", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OneShotDisposable implements coil.request.Disposable {
    private final kotlinx.coroutines.Deferred<coil.request.ImageResult> job;

    /* JADX WARN: Multi-variable type inference failed */
    public OneShotDisposable(kotlinx.coroutines.Deferred<? extends coil.request.ImageResult> deferred) {
        this.job = deferred;
    }

    @Override // coil.request.Disposable
    public kotlinx.coroutines.Deferred<coil.request.ImageResult> getJob() {
        return this.job;
    }

    @Override // coil.request.Disposable
    public boolean isDisposed() {
        return !getJob().isActive();
    }

    @Override // coil.request.Disposable
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) getJob(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }
}
