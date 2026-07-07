package com.liulishuo.okdownload.kotlin;

/* compiled from: DownloadTaskExtension.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000ð\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a%\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0018\u0010\u000b\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u0006H\u0000\u001aÌ\u0007\u0010\u000e\u001a\u00020\t*\u00020\u00062+\b\u0002\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`\u00132R\b\u0002\u0010\u0014\u001aL\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2g\b\u0002\u0010\u001b\u001aa\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001e\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001` 2U\b\u0002\u0010!\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`&2@\b\u0002\u0010'\u001a:\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015j\u0004\u0018\u0001`(2g\b\u0002\u0010)\u001aa\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`+2|\b\u0002\u0010,\u001av\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001e\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`.2U\b\u0002\u0010/\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`22U\b\u0002\u00103\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`52U\b\u0002\u00106\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`72Q\u00108\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001109¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0015\u0012\u0013\u0018\u00010:¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\t0\u001cj\u0002`<\u001a¹\u0003\u0010=\u001a\u00020\t*\u00020\u00062@\b\u0002\u0010>\u001a:\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110?¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015j\u0004\u0018\u0001`A2@\b\u0002\u0010B\u001a:\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110$¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015j\u0004\u0018\u0001`C2j\b\u0002\u0010D\u001ad\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(E\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(F\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(G\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`H2U\b\u0002\u0010I\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(F\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(G\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`J2f\u0010K\u001ab\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001109¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0015\u0012\u0013\u0018\u00010:¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110?¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\t0-j\u0002`L\u001a\u0086\u0001\u0010M\u001a\u00020\t*\u00020\u00062'\b\u0002\u0010\u000f\u001a!\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t0\u0010j\u0002`\u00132Q\u00108\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001109¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0015\u0012\u0013\u0018\u00010:¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\t0\u001cj\u0002`<\u001a¨\u0004\u0010N\u001a\u00020\t*\u00020\u00062+\b\u0002\u0010O\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`P2j\b\u0002\u0010Q\u001ad\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(E\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(F\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(G\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`H2U\b\u0002\u0010R\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(F\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(G\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`J2+\b\u0002\u0010S\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`T2+\b\u0002\u0010U\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`V2+\b\u0002\u0010W\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`X2@\b\u0002\u0010Y\u001a:\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110$¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015j\u0004\u0018\u0001`C2S\b\u0002\u0010Z\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012&\u0012$0:j\u0011`[¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\\¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\\\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015j\u0004\u0018\u0001`]2\u000e\b\u0002\u0010^\u001a\b\u0012\u0004\u0012\u00020\t0\b\u001a÷\u0005\u0010_\u001a\u00020\t*\u00020\u00062+\b\u0002\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`\u00132g\b\u0002\u0010)\u001aa\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`+2|\b\u0002\u0010,\u001av\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001e\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`.2j\b\u0002\u0010`\u001ad\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110a¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(b\u0012\u0013\u0012\u00110c¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`d2U\b\u0002\u0010e\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(f\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`g2@\b\u0002\u0010h\u001a:\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(F\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015j\u0004\u0018\u0001`i2U\b\u0002\u0010j\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110k¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`l2{\u0010m\u001aw\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001109¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012*\u0012(\u0018\u00010:j\u0013\u0018\u0001`[¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110c¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\t0-j\u0002`n\u001a¶\u0006\u0010o\u001a\u00020\t*\u00020\u00062+\b\u0002\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`\u00132g\b\u0002\u0010)\u001aa\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`+2|\b\u0002\u0010,\u001av\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001e\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`.2j\b\u0002\u0010p\u001ad\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110a¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(b\u0012\u0013\u0012\u00110q¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`r2j\b\u0002\u0010s\u001ad\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(f\u0012\u0013\u0012\u00110t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(u\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`v2U\b\u0002\u0010w\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(x\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`y2j\b\u0002\u0010z\u001ad\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110k¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(u\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`{2{\u0010|\u001aw\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001109¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012*\u0012(\u0018\u00010:j\u0013\u0018\u0001`[¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(x\u0012\u0004\u0012\u00020\t0-j\u0002`}\u001aÌ\u0007\u0010~\u001a\u00020\t*\u00020\u00062+\b\u0002\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`\u00132R\b\u0002\u0010\u0014\u001aL\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2g\b\u0002\u0010\u001b\u001aa\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001e\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001` 2U\b\u0002\u0010!\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`&2@\b\u0002\u0010'\u001a:\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015j\u0004\u0018\u0001`(2g\b\u0002\u0010)\u001aa\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`+2|\b\u0002\u0010,\u001av\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001e\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`.2U\b\u0002\u0010/\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`22U\b\u0002\u00103\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`52U\b\u0002\u00106\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`72Q\u00108\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001109¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0015\u0012\u0013\u0018\u00010:¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\t0\u001cj\u0002`<\u001a¹\u0003\u0010\u007f\u001a\u00020\t*\u00020\u00062@\b\u0002\u0010>\u001a:\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110?¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015j\u0004\u0018\u0001`A2@\b\u0002\u0010B\u001a:\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110$¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015j\u0004\u0018\u0001`C2j\b\u0002\u0010D\u001ad\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(E\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(F\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(G\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`H2U\b\u0002\u0010I\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(F\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(G\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`J2f\u0010K\u001ab\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001109¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0015\u0012\u0013\u0018\u00010:¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110?¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\t0-j\u0002`L\u001a\u0087\u0001\u0010\u0080\u0001\u001a\u00020\t*\u00020\u00062'\b\u0002\u0010\u000f\u001a!\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t0\u0010j\u0002`\u00132Q\u00108\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001109¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0015\u0012\u0013\u0018\u00010:¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\t0\u001cj\u0002`<\u001a©\u0004\u0010\u0081\u0001\u001a\u00020\t*\u00020\u00062+\b\u0002\u0010O\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`P2j\b\u0002\u0010Q\u001ad\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(E\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(F\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(G\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`H2U\b\u0002\u0010R\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(F\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(G\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`J2+\b\u0002\u0010S\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`T2+\b\u0002\u0010U\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`V2+\b\u0002\u0010W\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`X2@\b\u0002\u0010Y\u001a:\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110$¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015j\u0004\u0018\u0001`C2S\b\u0002\u0010Z\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012&\u0012$0:j\u0011`[¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\\¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\\\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015j\u0004\u0018\u0001`]2\u000e\b\u0002\u0010^\u001a\b\u0012\u0004\u0012\u00020\t0\b\u001aø\u0005\u0010\u0082\u0001\u001a\u00020\t*\u00020\u00062+\b\u0002\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`\u00132g\b\u0002\u0010)\u001aa\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`+2|\b\u0002\u0010,\u001av\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001e\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`.2j\b\u0002\u0010`\u001ad\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110a¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(b\u0012\u0013\u0012\u00110c¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`d2U\b\u0002\u0010e\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(f\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`g2@\b\u0002\u0010h\u001a:\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(F\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015j\u0004\u0018\u0001`i2U\b\u0002\u0010j\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110k¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`l2{\u0010m\u001aw\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001109¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012*\u0012(\u0018\u00010:j\u0013\u0018\u0001`[¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110c¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\t0-j\u0002`n\u001a·\u0006\u0010\u0083\u0001\u001a\u00020\t*\u00020\u00062+\b\u0002\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`\u00132g\b\u0002\u0010)\u001aa\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`+2|\b\u0002\u0010,\u001av\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001e\u0012%\u0012#\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`.2j\b\u0002\u0010p\u001ad\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110a¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(b\u0012\u0013\u0012\u00110q¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`r2j\b\u0002\u0010s\u001ad\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(f\u0012\u0013\u0012\u00110t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(u\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`v2U\b\u0002\u0010w\u001aO\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001100¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(x\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cj\u0004\u0018\u0001`y2j\b\u0002\u0010z\u001ad\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110k¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(u\u0012\u0004\u0012\u00020\t\u0018\u00010-j\u0004\u0018\u0001`{2{\u0010|\u001aw\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0013\u0012\u001109¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012*\u0012(\u0018\u00010:j\u0013\u0018\u0001`[¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(x\u0012\u0004\u0012\u00020\t0-j\u0002`}\u001a\u0013\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u00030\u0086\u00010\u0085\u0001*\u00020\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0087\u0001"}, d2 = {"createReplaceListener", "Lcom/liulishuo/okdownload/DownloadListener;", "oldListener", "progressListener", "await", "Lcom/liulishuo/okdownload/kotlin/DownloadResult;", "Lcom/liulishuo/okdownload/DownloadTask;", "block", "Lkotlin/Function0;", "", "(Lcom/liulishuo/okdownload/DownloadTask;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelDownloadOnCancellation", "Lkotlinx/coroutines/CancellableContinuation;", "task", "enqueue", "onTaskStart", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lcom/liulishuo/okdownload/kotlin/listener/onTaskStart;", "onConnectTrialStart", "Lkotlin/Function2;", "", "", "", "requestHeaderFields", "Lcom/liulishuo/okdownload/kotlin/listener/onConnectTrialStart;", "onConnectTrialEnd", "Lkotlin/Function3;", "", "responseCode", "responseHeaderFields", "Lcom/liulishuo/okdownload/kotlin/listener/onConnectTrialEnd;", "onDownloadFromBeginning", "Lcom/liulishuo/okdownload/core/breakpoint/BreakpointInfo;", "info", "Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;", "cause", "Lcom/liulishuo/okdownload/kotlin/listener/onDownloadFromBeginning;", "onDownloadFromBreakpoint", "Lcom/liulishuo/okdownload/kotlin/listener/onDownloadFromBreakpoint;", "onConnectStart", "blockIndex", "Lcom/liulishuo/okdownload/kotlin/listener/onConnectStart;", "onConnectEnd", "Lkotlin/Function4;", "Lcom/liulishuo/okdownload/kotlin/listener/onConnectEnd;", "onFetchStart", "", "contentLength", "Lcom/liulishuo/okdownload/kotlin/listener/onFetchStart;", "onFetchProgress", "increaseBytes", "Lcom/liulishuo/okdownload/kotlin/listener/onFetchProgress;", "onFetchEnd", "Lcom/liulishuo/okdownload/kotlin/listener/onFetchEnd;", "onTaskEnd", "Lcom/liulishuo/okdownload/core/cause/EndCause;", "Ljava/lang/Exception;", "realCause", "Lcom/liulishuo/okdownload/kotlin/listener/onTaskEnd;", "enqueue1", "taskStart", "Lcom/liulishuo/okdownload/core/listener/assist/Listener1Assist$Listener1Model;", "model", "Lcom/liulishuo/okdownload/kotlin/listener/onTaskStartWithModel;", "retry", "Lcom/liulishuo/okdownload/kotlin/listener/onRetry;", "connected", "blockCount", "currentOffset", "totalLength", "Lcom/liulishuo/okdownload/kotlin/listener/onConnected;", "progress", "Lcom/liulishuo/okdownload/kotlin/listener/onProgress;", "taskEnd", "Lcom/liulishuo/okdownload/kotlin/listener/onTaskEndWithModel;", "enqueue2", "enqueue3", "onStarted", "Lcom/liulishuo/okdownload/kotlin/listener/onStarted;", "onConnected", "onProgress", "onCompleted", "Lcom/liulishuo/okdownload/kotlin/listener/onCompleted;", "onCanceled", "Lcom/liulishuo/okdownload/kotlin/listener/onCanceled;", "onWarn", "Lcom/liulishuo/okdownload/kotlin/listener/onWarn;", "onRetry", "onError", "Lkotlin/Exception;", "e", "Lcom/liulishuo/okdownload/kotlin/listener/onError;", "onTerminal", "enqueue4", "onInfoReady", "", "fromBreakpoint", "Lcom/liulishuo/okdownload/core/listener/assist/Listener4Assist$Listener4Model;", "Lcom/liulishuo/okdownload/kotlin/listener/onInfoReady;", "onProgressBlock", "currentBlockOffset", "Lcom/liulishuo/okdownload/kotlin/listener/onProgressBlock;", "onProgressWithoutTotalLength", "Lcom/liulishuo/okdownload/kotlin/listener/onProgressWithoutTotalLength;", "onBlockEnd", "Lcom/liulishuo/okdownload/core/breakpoint/BlockInfo;", "Lcom/liulishuo/okdownload/kotlin/listener/onBlockEnd;", "onTaskEndWithListener4Model", "Lcom/liulishuo/okdownload/kotlin/listener/onTaskEndWithListener4Model;", "enqueue4WithSpeed", "onInfoReadyWithSpeed", "Lcom/liulishuo/okdownload/core/listener/assist/Listener4SpeedAssistExtend$Listener4SpeedModel;", "Lcom/liulishuo/okdownload/kotlin/listener/onInfoReadyWithSpeed;", "onProgressBlockWithSpeed", "Lcom/liulishuo/okdownload/SpeedCalculator;", "blockSpeed", "Lcom/liulishuo/okdownload/kotlin/listener/onProgressBlockWithSpeed;", "onProgressWithSpeed", "taskSpeed", "Lcom/liulishuo/okdownload/kotlin/listener/onProgressWithSpeed;", "onBlockEndWithSpeed", "Lcom/liulishuo/okdownload/kotlin/listener/onBlockEndWithSpeed;", "onTaskEndWithSpeed", "Lcom/liulishuo/okdownload/kotlin/listener/onTaskEndWithSpeed;", "execute", "execute1", "execute2", "execute3", "execute4", "execute4WithSpeed", "spChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/liulishuo/okdownload/kotlin/DownloadProgress;", "kotlin_release"}, k = 2, mv = {1, 1, 15})
/* loaded from: /tmp/dex/classes2.dex */
public final class DownloadTaskExtensionKt {
    public static /* synthetic */ void execute$default(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function3 function32, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function3 function33, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function3 function34, kotlin.jvm.functions.Function3 function35, kotlin.jvm.functions.Function3 function36, kotlin.jvm.functions.Function3 function37, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.functions.Function2 function23;
        kotlin.jvm.functions.Function3 function38;
        kotlin.jvm.functions.Function3 function39;
        kotlin.jvm.functions.Function2 function24;
        kotlin.jvm.functions.Function3 function310;
        kotlin.jvm.functions.Function4 function42;
        kotlin.jvm.functions.Function3 function311;
        kotlin.jvm.functions.Function3 function312;
        kotlin.jvm.functions.Function3 function313;
        if ((i & 1) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if ((i & 2) != 0) {
            function23 = null;
        } else {
            function23 = function2;
        }
        if ((i & 4) != 0) {
            function38 = null;
        } else {
            function38 = function3;
        }
        if ((i & 8) != 0) {
            function39 = null;
        } else {
            function39 = function32;
        }
        if ((i & 16) != 0) {
            function24 = null;
        } else {
            function24 = function22;
        }
        if ((i & 32) != 0) {
            function310 = null;
        } else {
            function310 = function33;
        }
        if ((i & 64) != 0) {
            function42 = null;
        } else {
            function42 = function4;
        }
        if ((i & com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4) != 0) {
            function311 = null;
        } else {
            function311 = function34;
        }
        if ((i & 256) != 0) {
            function312 = null;
        } else {
            function312 = function35;
        }
        if ((i & 512) != 0) {
            function313 = null;
        } else {
            function313 = function36;
        }
        execute(downloadTask, function12, function23, function38, function39, function24, function310, function42, function311, function312, function313, function37);
    }

    public static final void execute(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function2, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function3, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, ? super com.liulishuo.okdownload.core.cause.ResumeFailedCause, kotlin.Unit> function32, kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, kotlin.Unit> function22, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function33, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function4, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function34, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function35, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function36, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.EndCause, ? super java.lang.Exception, kotlin.Unit> function37) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "$this$execute");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function37, "onTaskEnd");
        downloadTask.execute(com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt.createListener(function1, function2, function3, function32, function22, function33, function4, function34, function35, function36, function37));
    }

    public static /* synthetic */ void execute1$default(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function4 function42, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function2 function23;
        kotlin.jvm.functions.Function2 function24;
        kotlin.jvm.functions.Function4 function43;
        kotlin.jvm.functions.Function3 function32;
        if ((i & 1) != 0) {
            function23 = null;
        } else {
            function23 = function2;
        }
        if ((i & 2) != 0) {
            function24 = null;
        } else {
            function24 = function22;
        }
        if ((i & 4) != 0) {
            function43 = null;
        } else {
            function43 = function4;
        }
        if ((i & 8) != 0) {
            function32 = null;
        } else {
            function32 = function3;
        }
        execute1(downloadTask, function23, function24, function43, function32, function42);
    }

    public static final void execute1(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.ResumeFailedCause, kotlin.Unit> function22, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function4, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function3, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.EndCause, ? super java.lang.Exception, ? super com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model, kotlin.Unit> function42) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "$this$execute1");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function42, "taskEnd");
        downloadTask.execute(com.liulishuo.okdownload.kotlin.listener.DownloadListener1ExtensionKt.createListener1(function2, function22, function4, function3, function42));
    }

    public static /* synthetic */ void execute2$default(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<com.liulishuo.okdownload.DownloadTask, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$execute2$1
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj2);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask2) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask2, "it");
                }
            };
        }
        execute2(downloadTask, function1, function3);
    }

    public static final void execute2(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.EndCause, ? super java.lang.Exception, kotlin.Unit> function3) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "$this$execute2");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function1, "onTaskStart");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function3, "onTaskEnd");
        downloadTask.execute(com.liulishuo.okdownload.kotlin.listener.DownloadListener2ExtensionKt.createListener2(function1, function3));
    }

    public static /* synthetic */ void execute3$default(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function15;
        kotlin.jvm.functions.Function4 function42;
        kotlin.jvm.functions.Function3 function32;
        kotlin.jvm.functions.Function1 function16;
        kotlin.jvm.functions.Function1 function17;
        kotlin.jvm.functions.Function1 function18;
        kotlin.jvm.functions.Function2 function23;
        kotlin.jvm.functions.Function2 function24 = null;
        if ((i & 1) != 0) {
            function15 = null;
        } else {
            function15 = function1;
        }
        if ((i & 2) != 0) {
            function42 = null;
        } else {
            function42 = function4;
        }
        if ((i & 4) != 0) {
            function32 = null;
        } else {
            function32 = function3;
        }
        if ((i & 8) != 0) {
            function16 = null;
        } else {
            function16 = function12;
        }
        if ((i & 16) != 0) {
            function17 = null;
        } else {
            function17 = function13;
        }
        if ((i & 32) != 0) {
            function18 = null;
        } else {
            function18 = function14;
        }
        if ((i & 64) != 0) {
            function23 = null;
        } else {
            function23 = function2;
        }
        if ((i & com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4) != 0) {
        } else {
            function24 = function22;
        }
        execute3(downloadTask, function15, function42, function32, function16, function17, function18, function23, function24, (i & 256) != 0 ? new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$execute3$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                m96invoke();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m96invoke() {
            }
        } : function0);
    }

    public static final void execute3(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function1, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function4, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function3, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function14, kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.ResumeFailedCause, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Exception, kotlin.Unit> function22, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "$this$execute3");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function0, "onTerminal");
        downloadTask.execute(com.liulishuo.okdownload.kotlin.listener.DownloadListener3ExtensionKt.createListener3(function1, function4, function3, function12, function13, function14, function2, function22, function0));
    }

    public static /* synthetic */ void execute4$default(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function4 function42, kotlin.jvm.functions.Function3 function32, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function3 function33, kotlin.jvm.functions.Function4 function43, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.functions.Function3 function34;
        kotlin.jvm.functions.Function4 function44;
        kotlin.jvm.functions.Function4 function45;
        kotlin.jvm.functions.Function3 function35;
        kotlin.jvm.functions.Function2 function22;
        kotlin.jvm.functions.Function3 function36;
        if ((i & 1) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if ((i & 2) != 0) {
            function34 = null;
        } else {
            function34 = function3;
        }
        if ((i & 4) != 0) {
            function44 = null;
        } else {
            function44 = function4;
        }
        if ((i & 8) != 0) {
            function45 = null;
        } else {
            function45 = function42;
        }
        if ((i & 16) != 0) {
            function35 = null;
        } else {
            function35 = function32;
        }
        if ((i & 32) != 0) {
            function22 = null;
        } else {
            function22 = function2;
        }
        if ((i & 64) != 0) {
            function36 = null;
        } else {
            function36 = function33;
        }
        execute4(downloadTask, function12, function34, function44, function45, function35, function22, function36, function43);
    }

    public static final void execute4(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function3, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function4, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, ? super java.lang.Boolean, ? super com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model, kotlin.Unit> function42, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function32, kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Long, kotlin.Unit> function2, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super com.liulishuo.okdownload.core.breakpoint.BlockInfo, kotlin.Unit> function33, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.EndCause, ? super java.lang.Exception, ? super com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model, kotlin.Unit> function43) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "$this$execute4");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function43, "onTaskEndWithListener4Model");
        downloadTask.execute(com.liulishuo.okdownload.kotlin.listener.DownloadListener4ExtensionKt.createListener4(function1, function3, function4, function42, function32, function2, function33, function43));
    }

    public static /* synthetic */ void execute4WithSpeed$default(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function4 function42, kotlin.jvm.functions.Function4 function43, kotlin.jvm.functions.Function3 function32, kotlin.jvm.functions.Function4 function44, kotlin.jvm.functions.Function4 function45, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.functions.Function3 function33;
        kotlin.jvm.functions.Function4 function46;
        kotlin.jvm.functions.Function4 function47;
        kotlin.jvm.functions.Function4 function48;
        kotlin.jvm.functions.Function3 function34;
        kotlin.jvm.functions.Function4 function49;
        if ((i & 1) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if ((i & 2) != 0) {
            function33 = null;
        } else {
            function33 = function3;
        }
        if ((i & 4) != 0) {
            function46 = null;
        } else {
            function46 = function4;
        }
        if ((i & 8) != 0) {
            function47 = null;
        } else {
            function47 = function42;
        }
        if ((i & 16) != 0) {
            function48 = null;
        } else {
            function48 = function43;
        }
        if ((i & 32) != 0) {
            function34 = null;
        } else {
            function34 = function32;
        }
        if ((i & 64) != 0) {
            function49 = null;
        } else {
            function49 = function44;
        }
        execute4WithSpeed(downloadTask, function12, function33, function46, function47, function48, function34, function49, function45);
    }

    public static final void execute4WithSpeed(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function3, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function4, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, ? super java.lang.Boolean, ? super com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel, kotlin.Unit> function42, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, ? super com.liulishuo.okdownload.SpeedCalculator, kotlin.Unit> function43, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Long, ? super com.liulishuo.okdownload.SpeedCalculator, kotlin.Unit> function32, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super com.liulishuo.okdownload.core.breakpoint.BlockInfo, ? super com.liulishuo.okdownload.SpeedCalculator, kotlin.Unit> function44, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.EndCause, ? super java.lang.Exception, ? super com.liulishuo.okdownload.SpeedCalculator, kotlin.Unit> function45) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "$this$execute4WithSpeed");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function45, "onTaskEndWithSpeed");
        downloadTask.execute(com.liulishuo.okdownload.kotlin.listener.DownloadListener4WithSpeedExtensionKt.createListener4WithSpeed(function1, function3, function4, function42, function43, function32, function44, function45));
    }

    public static /* synthetic */ void enqueue$default(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function3 function32, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function3 function33, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function3 function34, kotlin.jvm.functions.Function3 function35, kotlin.jvm.functions.Function3 function36, kotlin.jvm.functions.Function3 function37, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.functions.Function2 function23;
        kotlin.jvm.functions.Function3 function38;
        kotlin.jvm.functions.Function3 function39;
        kotlin.jvm.functions.Function2 function24;
        kotlin.jvm.functions.Function3 function310;
        kotlin.jvm.functions.Function4 function42;
        kotlin.jvm.functions.Function3 function311;
        kotlin.jvm.functions.Function3 function312;
        kotlin.jvm.functions.Function3 function313;
        if ((i & 1) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if ((i & 2) != 0) {
            function23 = null;
        } else {
            function23 = function2;
        }
        if ((i & 4) != 0) {
            function38 = null;
        } else {
            function38 = function3;
        }
        if ((i & 8) != 0) {
            function39 = null;
        } else {
            function39 = function32;
        }
        if ((i & 16) != 0) {
            function24 = null;
        } else {
            function24 = function22;
        }
        if ((i & 32) != 0) {
            function310 = null;
        } else {
            function310 = function33;
        }
        if ((i & 64) != 0) {
            function42 = null;
        } else {
            function42 = function4;
        }
        if ((i & com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4) != 0) {
            function311 = null;
        } else {
            function311 = function34;
        }
        if ((i & 256) != 0) {
            function312 = null;
        } else {
            function312 = function35;
        }
        if ((i & 512) != 0) {
            function313 = null;
        } else {
            function313 = function36;
        }
        enqueue(downloadTask, function12, function23, function38, function39, function24, function310, function42, function311, function312, function313, function37);
    }

    public static final void enqueue(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function2, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function3, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, ? super com.liulishuo.okdownload.core.cause.ResumeFailedCause, kotlin.Unit> function32, kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, kotlin.Unit> function22, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function33, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function4, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function34, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function35, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function36, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.EndCause, ? super java.lang.Exception, kotlin.Unit> function37) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "$this$enqueue");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function37, "onTaskEnd");
        downloadTask.enqueue(com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt.createListener(function1, function2, function3, function32, function22, function33, function4, function34, function35, function36, function37));
    }

    public static /* synthetic */ void enqueue1$default(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function4 function42, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function2 function23;
        kotlin.jvm.functions.Function2 function24;
        kotlin.jvm.functions.Function4 function43;
        kotlin.jvm.functions.Function3 function32;
        if ((i & 1) != 0) {
            function23 = null;
        } else {
            function23 = function2;
        }
        if ((i & 2) != 0) {
            function24 = null;
        } else {
            function24 = function22;
        }
        if ((i & 4) != 0) {
            function43 = null;
        } else {
            function43 = function4;
        }
        if ((i & 8) != 0) {
            function32 = null;
        } else {
            function32 = function3;
        }
        enqueue1(downloadTask, function23, function24, function43, function32, function42);
    }

    public static final void enqueue1(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.ResumeFailedCause, kotlin.Unit> function22, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function4, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function3, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.EndCause, ? super java.lang.Exception, ? super com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model, kotlin.Unit> function42) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "$this$enqueue1");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function42, "taskEnd");
        downloadTask.enqueue(com.liulishuo.okdownload.kotlin.listener.DownloadListener1ExtensionKt.createListener1(function2, function22, function4, function3, function42));
    }

    public static /* synthetic */ void enqueue2$default(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<com.liulishuo.okdownload.DownloadTask, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$enqueue2$1
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj2);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask2) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask2, "it");
                }
            };
        }
        enqueue2(downloadTask, function1, function3);
    }

    public static final void enqueue2(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.EndCause, ? super java.lang.Exception, kotlin.Unit> function3) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "$this$enqueue2");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function1, "onTaskStart");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function3, "onTaskEnd");
        downloadTask.enqueue(com.liulishuo.okdownload.kotlin.listener.DownloadListener2ExtensionKt.createListener2(function1, function3));
    }

    public static /* synthetic */ void enqueue3$default(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function15;
        kotlin.jvm.functions.Function4 function42;
        kotlin.jvm.functions.Function3 function32;
        kotlin.jvm.functions.Function1 function16;
        kotlin.jvm.functions.Function1 function17;
        kotlin.jvm.functions.Function1 function18;
        kotlin.jvm.functions.Function2 function23;
        kotlin.jvm.functions.Function2 function24 = null;
        if ((i & 1) != 0) {
            function15 = null;
        } else {
            function15 = function1;
        }
        if ((i & 2) != 0) {
            function42 = null;
        } else {
            function42 = function4;
        }
        if ((i & 4) != 0) {
            function32 = null;
        } else {
            function32 = function3;
        }
        if ((i & 8) != 0) {
            function16 = null;
        } else {
            function16 = function12;
        }
        if ((i & 16) != 0) {
            function17 = null;
        } else {
            function17 = function13;
        }
        if ((i & 32) != 0) {
            function18 = null;
        } else {
            function18 = function14;
        }
        if ((i & 64) != 0) {
            function23 = null;
        } else {
            function23 = function2;
        }
        if ((i & com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4) != 0) {
        } else {
            function24 = function22;
        }
        enqueue3(downloadTask, function15, function42, function32, function16, function17, function18, function23, function24, (i & 256) != 0 ? new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$enqueue3$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                m95invoke();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m95invoke() {
            }
        } : function0);
    }

    public static final void enqueue3(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function1, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function4, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function3, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function14, kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.ResumeFailedCause, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Exception, kotlin.Unit> function22, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "$this$enqueue3");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function0, "onTerminal");
        downloadTask.enqueue(com.liulishuo.okdownload.kotlin.listener.DownloadListener3ExtensionKt.createListener3(function1, function4, function3, function12, function13, function14, function2, function22, function0));
    }

    public static /* synthetic */ void enqueue4$default(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function4 function42, kotlin.jvm.functions.Function3 function32, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function3 function33, kotlin.jvm.functions.Function4 function43, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.functions.Function3 function34;
        kotlin.jvm.functions.Function4 function44;
        kotlin.jvm.functions.Function4 function45;
        kotlin.jvm.functions.Function3 function35;
        kotlin.jvm.functions.Function2 function22;
        kotlin.jvm.functions.Function3 function36;
        if ((i & 1) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if ((i & 2) != 0) {
            function34 = null;
        } else {
            function34 = function3;
        }
        if ((i & 4) != 0) {
            function44 = null;
        } else {
            function44 = function4;
        }
        if ((i & 8) != 0) {
            function45 = null;
        } else {
            function45 = function42;
        }
        if ((i & 16) != 0) {
            function35 = null;
        } else {
            function35 = function32;
        }
        if ((i & 32) != 0) {
            function22 = null;
        } else {
            function22 = function2;
        }
        if ((i & 64) != 0) {
            function36 = null;
        } else {
            function36 = function33;
        }
        enqueue4(downloadTask, function12, function34, function44, function45, function35, function22, function36, function43);
    }

    public static final void enqueue4(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function3, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function4, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, ? super java.lang.Boolean, ? super com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model, kotlin.Unit> function42, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function32, kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Long, kotlin.Unit> function2, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super com.liulishuo.okdownload.core.breakpoint.BlockInfo, kotlin.Unit> function33, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.EndCause, ? super java.lang.Exception, ? super com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model, kotlin.Unit> function43) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "$this$enqueue4");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function43, "onTaskEndWithListener4Model");
        downloadTask.enqueue(com.liulishuo.okdownload.kotlin.listener.DownloadListener4ExtensionKt.createListener4(function1, function3, function4, function42, function32, function2, function33, function43));
    }

    public static /* synthetic */ void enqueue4WithSpeed$default(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function4 function42, kotlin.jvm.functions.Function4 function43, kotlin.jvm.functions.Function3 function32, kotlin.jvm.functions.Function4 function44, kotlin.jvm.functions.Function4 function45, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.functions.Function3 function33;
        kotlin.jvm.functions.Function4 function46;
        kotlin.jvm.functions.Function4 function47;
        kotlin.jvm.functions.Function4 function48;
        kotlin.jvm.functions.Function3 function34;
        kotlin.jvm.functions.Function4 function49;
        if ((i & 1) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if ((i & 2) != 0) {
            function33 = null;
        } else {
            function33 = function3;
        }
        if ((i & 4) != 0) {
            function46 = null;
        } else {
            function46 = function4;
        }
        if ((i & 8) != 0) {
            function47 = null;
        } else {
            function47 = function42;
        }
        if ((i & 16) != 0) {
            function48 = null;
        } else {
            function48 = function43;
        }
        if ((i & 32) != 0) {
            function34 = null;
        } else {
            function34 = function32;
        }
        if ((i & 64) != 0) {
            function49 = null;
        } else {
            function49 = function44;
        }
        enqueue4WithSpeed(downloadTask, function12, function33, function46, function47, function48, function34, function49, function45);
    }

    public static final void enqueue4WithSpeed(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function3, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function4, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, ? super java.lang.Boolean, ? super com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel, kotlin.Unit> function42, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, ? super com.liulishuo.okdownload.SpeedCalculator, kotlin.Unit> function43, kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Long, ? super com.liulishuo.okdownload.SpeedCalculator, kotlin.Unit> function32, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super com.liulishuo.okdownload.core.breakpoint.BlockInfo, ? super com.liulishuo.okdownload.SpeedCalculator, kotlin.Unit> function44, kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.EndCause, ? super java.lang.Exception, ? super com.liulishuo.okdownload.SpeedCalculator, kotlin.Unit> function45) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "$this$enqueue4WithSpeed");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function45, "onTaskEndWithSpeed");
        downloadTask.enqueue(com.liulishuo.okdownload.kotlin.listener.DownloadListener4WithSpeedExtensionKt.createListener4WithSpeed(function1, function3, function4, function42, function43, function32, function44, function45));
    }

    public static final kotlinx.coroutines.channels.Channel<com.liulishuo.okdownload.kotlin.DownloadProgress> spChannel(com.liulishuo.okdownload.DownloadTask downloadTask) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "$this$spChannel");
        final kotlinx.coroutines.channels.Channel<com.liulishuo.okdownload.kotlin.DownloadProgress> Channel = kotlinx.coroutines.channels.ChannelKt.Channel(-1);
        com.liulishuo.okdownload.DownloadListener listener = downloadTask.getListener();
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.liulishuo.okdownload.core.listener.DownloadListener1 createListener1$default = com.liulishuo.okdownload.kotlin.listener.DownloadListener1ExtensionKt.createListener1$default(null, null, null, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, java.lang.Long, java.lang.Long, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$spChannel$progressListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).longValue(), ((java.lang.Number) obj3).longValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask2, long j, long j2) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask2, "task");
                if (atomicBoolean.get()) {
                    return;
                }
                Channel.offer(new com.liulishuo.okdownload.kotlin.DownloadProgress(downloadTask2, j, j2));
            }
        }, new kotlin.jvm.functions.Function4<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.cause.EndCause, java.lang.Exception, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$spChannel$progressListener$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.cause.EndCause) obj2, (java.lang.Exception) obj3, (com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model) obj4);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask2, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model listener1Model) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask2, "<anonymous parameter 0>");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(endCause, "<anonymous parameter 1>");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(listener1Model, "<anonymous parameter 3>");
                atomicBoolean.set(true);
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(Channel, (java.lang.Throwable) null, 1, (java.lang.Object) null);
            }
        }, 7, null);
        createListener1$default.setAlwaysRecoverAssistModelIfNotSet(true);
        downloadTask.replaceListener(createReplaceListener(listener, createListener1$default));
        return Channel;
    }

    public static final com.liulishuo.okdownload.DownloadListener createReplaceListener(com.liulishuo.okdownload.DownloadListener downloadListener, final com.liulishuo.okdownload.DownloadListener downloadListener2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadListener2, "progressListener");
        if (downloadListener == null) {
            return downloadListener2;
        }
        final com.liulishuo.okdownload.DownloadListener switchToExceptProgressListener = com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt.switchToExceptProgressListener(downloadListener);
        return com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt.createListener(new kotlin.jvm.functions.Function1<com.liulishuo.okdownload.DownloadTask, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$createReplaceListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "it");
                com.liulishuo.okdownload.DownloadListener.this.taskStart(downloadTask);
                downloadListener2.taskStart(downloadTask);
            }
        }, new kotlin.jvm.functions.Function2<com.liulishuo.okdownload.DownloadTask, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$createReplaceListener$2
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, (java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) obj2);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(map, "requestFields");
                com.liulishuo.okdownload.DownloadListener.this.connectTrialStart(downloadTask, map);
            }
        }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$createReplaceListener$3
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), (java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) obj3);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(map, "responseHeaderFields");
                com.liulishuo.okdownload.DownloadListener.this.connectTrialEnd(downloadTask, i, map);
            }
        }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, com.liulishuo.okdownload.core.cause.ResumeFailedCause, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$createReplaceListener$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.breakpoint.BreakpointInfo) obj2, (com.liulishuo.okdownload.core.cause.ResumeFailedCause) obj3);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(breakpointInfo, "info");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(resumeFailedCause, "cause");
                com.liulishuo.okdownload.DownloadListener.this.downloadFromBeginning(downloadTask, breakpointInfo, resumeFailedCause);
                downloadListener2.downloadFromBeginning(downloadTask, breakpointInfo, resumeFailedCause);
            }
        }, new kotlin.jvm.functions.Function2<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$createReplaceListener$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.breakpoint.BreakpointInfo) obj2);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(breakpointInfo, "info");
                com.liulishuo.okdownload.DownloadListener.this.downloadFromBreakpoint(downloadTask, breakpointInfo);
                downloadListener2.downloadFromBreakpoint(downloadTask, breakpointInfo);
            }
        }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$createReplaceListener$6
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), (java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) obj3);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(map, "requestHeaderFields");
                com.liulishuo.okdownload.DownloadListener.this.connectStart(downloadTask, i, map);
            }
        }, new kotlin.jvm.functions.Function4<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.lang.Integer, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$createReplaceListener$7
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).intValue(), (java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) obj4);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, int i2, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(map, "responseHeaderFields");
                com.liulishuo.okdownload.DownloadListener.this.connectEnd(downloadTask, i, i2, map);
            }
        }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.lang.Long, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$createReplaceListener$8
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).longValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                com.liulishuo.okdownload.DownloadListener.this.fetchStart(downloadTask, i, j);
            }
        }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.lang.Long, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$createReplaceListener$10
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).longValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                com.liulishuo.okdownload.DownloadListener.this.fetchProgress(downloadTask, i, j);
            }
        }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.lang.Long, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$createReplaceListener$9
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).longValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                com.liulishuo.okdownload.DownloadListener.this.fetchEnd(downloadTask, i, j);
            }
        }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.cause.EndCause, java.lang.Exception, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$createReplaceListener$11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.cause.EndCause) obj2, (java.lang.Exception) obj3);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(endCause, "cause");
                com.liulishuo.okdownload.DownloadListener.this.taskEnd(downloadTask, endCause, exc);
                downloadListener2.taskEnd(downloadTask, endCause, exc);
            }
        });
    }

    public static final void cancelDownloadOnCancellation(kotlinx.coroutines.CancellableContinuation<?> cancellableContinuation, final com.liulishuo.okdownload.DownloadTask downloadTask) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cancellableContinuation, "$this$cancelDownloadOnCancellation");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
        cancellableContinuation.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$cancelDownloadOnCancellation$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((java.lang.Throwable) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(java.lang.Throwable th) {
                com.liulishuo.okdownload.DownloadTask.this.cancel();
            }
        });
    }

    public static /* synthetic */ java.lang.Object await$default(com.liulishuo.okdownload.DownloadTask downloadTask, kotlin.jvm.functions.Function0 function0, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$await$2
                public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    m94invoke();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m94invoke() {
                }
            };
        }
        return await(downloadTask, function0, continuation);
    }

    public static final java.lang.Object await(final com.liulishuo.okdownload.DownloadTask downloadTask, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.liulishuo.okdownload.kotlin.DownloadResult> continuation) {
        kotlinx.coroutines.CancellableContinuation cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        final kotlinx.coroutines.CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        downloadTask.enqueue(com.liulishuo.okdownload.kotlin.listener.DownloadListener2ExtensionKt.createListener2(new kotlin.jvm.functions.Function1<com.liulishuo.okdownload.DownloadTask, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$await$$inlined$suspendCancellableCoroutine$lambda$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask2) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask2, "it");
                com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt.cancelDownloadOnCancellation(cancellableContinuation, downloadTask);
            }
        }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.cause.EndCause, java.lang.Exception, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.DownloadTaskExtensionKt$await$3$listener2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.cause.EndCause) obj2, (java.lang.Exception) obj3);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask2, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask2, "<anonymous parameter 0>");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(endCause, "cause");
                if (exc != null) {
                    kotlin.coroutines.Continuation continuation2 = cancellableContinuation;
                    kotlin.Result.Companion companion = kotlin.Result.Companion;
                    continuation2.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(exc)));
                } else {
                    kotlin.coroutines.Continuation continuation3 = cancellableContinuation;
                    com.liulishuo.okdownload.kotlin.DownloadResult downloadResult = new com.liulishuo.okdownload.kotlin.DownloadResult(endCause);
                    kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                    continuation3.resumeWith(kotlin.Result.constructor-impl(downloadResult));
                }
            }
        }));
        function0.invoke();
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
