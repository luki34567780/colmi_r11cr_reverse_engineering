package kotlin.text;

/* compiled from: Regex.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class Regex$findAll$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.text.MatchResult, kotlin.text.MatchResult> {
    public static final kotlin.text.Regex$findAll$2 INSTANCE = new kotlin.text.Regex$findAll$2();

    Regex$findAll$2() {
        super(1, kotlin.text.MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final kotlin.text.MatchResult invoke(kotlin.text.MatchResult p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.next();
    }
}
