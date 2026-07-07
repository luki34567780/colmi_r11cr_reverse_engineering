package com.qcwireless.qcwatch.ui.base.repository.mine;

/* compiled from: FeedbackRepository.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eJ3\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/mine/FeedbackRepository;", "", "()V", "feedbackDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcFeedbackDao;", "downFeedbackFromServer", "Lkotlinx/coroutines/flow/Flow;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "", "Lcom/qcwireless/qcwatch/ui/base/bean/response/mine/feedback/FeedbackResp;", "language", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAllFeedbackList", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/FeedbackEntity;", "saveEntity", "", "entity", "upFeedbackImages", "", "params", "Lcom/qcwireless/qcwatch/ui/base/bean/request/user/FeedbackRequest;", "files", "", "Ljava/io/File;", "(Lcom/qcwireless/qcwatch/ui/base/bean/request/user/FeedbackRequest;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class FeedbackRepository {
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcFeedbackDao feedbackDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcFeedbackDao();

    public final java.lang.Object downFeedbackFromServer(java.lang.String str, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.mine.feedback.FeedbackResp>>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$downFeedbackFromServer$2(str, null)), new com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$downFeedbackFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$downFeedbackFromServer$4(null));
    }

    public final void saveEntity(com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        this.feedbackDao.insert(entity);
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity> queryAllFeedbackList() {
        return this.feedbackDao.queryFeedbackList();
    }

    public final java.lang.Object upFeedbackImages(com.qcwireless.qcwatch.ui.base.bean.request.user.FeedbackRequest feedbackRequest, java.util.List<java.io.File> list, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$2(list, feedbackRequest, null)), new com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository$upFeedbackImages$4(null));
    }
}
