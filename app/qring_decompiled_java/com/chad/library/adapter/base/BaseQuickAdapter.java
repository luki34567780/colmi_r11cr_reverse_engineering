package com.chad.library.adapter.base;

/* compiled from: BaseQuickAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 ï\u0001*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0004î\u0001ï\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020qH\u0002J\u0014\u0010r\u001a\u00020o2\f\b\u0001\u0010s\u001a\u00020t\"\u00020\u0006J\u0014\u0010u\u001a\u00020o2\f\b\u0001\u0010s\u001a\u00020t\"\u00020\u0006J\u0017\u0010v\u001a\u00020o2\b\b\u0001\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010wJ\u001f\u0010v\u001a\u00020o2\b\b\u0001\u0010x\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010yJ \u0010v\u001a\u00020o2\b\b\u0001\u0010x\u001a\u00020\u00062\f\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000{H\u0016J\u0018\u0010v\u001a\u00020o2\u000e\b\u0001\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000{H\u0016J%\u0010|\u001a\u00020\u00062\u0006\u0010}\u001a\u00020~2\b\b\u0002\u0010\u007f\u001a\u00020\u00062\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0006H\u0007J&\u0010\u0081\u0001\u001a\u00020\u00062\u0006\u0010}\u001a\u00020~2\b\b\u0002\u0010\u007f\u001a\u00020\u00062\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0006H\u0007J!\u0010\u0082\u0001\u001a\u00020o2\u0007\u0010\u0083\u0001\u001a\u00028\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0003\u0010\u0085\u0001J\t\u0010\u0086\u0001\u001a\u00020oH\u0002J\u0012\u0010\u0087\u0001\u001a\u00020o2\u0007\u0010\u0088\u0001\u001a\u00020\u0006H\u0004J \u0010\u0089\u0001\u001a\u00020o2\u0006\u0010p\u001a\u00028\u00012\u0007\u0010\u008a\u0001\u001a\u00028\u0000H$¢\u0006\u0003\u0010\u008b\u0001J1\u0010\u0089\u0001\u001a\u00020o2\u0006\u0010p\u001a\u00028\u00012\u0007\u0010\u008a\u0001\u001a\u00028\u00002\u000f\u0010\u008c\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u008d\u0001H\u0014¢\u0006\u0003\u0010\u008f\u0001J'\u0010\u0090\u0001\u001a\u0004\u0018\u00018\u00012\f\u0010\u0091\u0001\u001a\u0007\u0012\u0002\b\u00030\u0092\u00012\u0006\u0010}\u001a\u00020~H\u0002¢\u0006\u0003\u0010\u0093\u0001J\u0017\u0010\u0094\u0001\u001a\u00028\u00012\u0006\u0010}\u001a\u00020~H\u0014¢\u0006\u0003\u0010\u0095\u0001J#\u0010\u0094\u0001\u001a\u00028\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0014¢\u0006\u0003\u0010\u0098\u0001J\r\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018J\r\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018J\t\u0010\u009b\u0001\u001a\u00020\u0006H\u0014J\u0011\u0010\u009c\u0001\u001a\u00020\u00062\u0006\u0010x\u001a\u00020\u0006H\u0014J\u000f\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000OH\u0007J\r\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000OJ\u001e\u0010\u009f\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0092\u00012\f\u0010\u0091\u0001\u001a\u0007\u0012\u0002\b\u00030\u0092\u0001H\u0002J\u0019\u0010 \u0001\u001a\u00028\u00002\b\b\u0001\u0010x\u001a\u00020\u0006H\u0016¢\u0006\u0003\u0010¡\u0001J\t\u0010¢\u0001\u001a\u00020\u0006H\u0016J\u0012\u0010£\u0001\u001a\u00030¤\u00012\u0006\u0010x\u001a\u00020\u0006H\u0016J\u001b\u0010¥\u0001\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010x\u001a\u00020\u0006H\u0016¢\u0006\u0003\u0010¡\u0001J\u001a\u0010¦\u0001\u001a\u00020\u00062\t\u0010\u008a\u0001\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0003\u0010§\u0001J\u0011\u0010¨\u0001\u001a\u00020\u00062\u0006\u0010x\u001a\u00020\u0006H\u0016J\t\u0010©\u0001\u001a\u0004\u0018\u00010ZJ\t\u0010ª\u0001\u001a\u0004\u0018\u00010\\J\t\u0010«\u0001\u001a\u0004\u0018\u00010^J\t\u0010¬\u0001\u001a\u0004\u0018\u00010`J\u001c\u0010\u00ad\u0001\u001a\u0004\u0018\u00010~2\u0006\u0010x\u001a\u00020\u00062\t\b\u0001\u0010®\u0001\u001a\u00020\u0006J\u0007\u0010¯\u0001\u001a\u00020\u0012J\u0007\u0010°\u0001\u001a\u00020\u0012J\u0007\u0010±\u0001\u001a\u00020\u0012J\u0012\u0010²\u0001\u001a\u00020\u00122\u0007\u0010³\u0001\u001a\u00020\u0006H\u0014J\u0011\u0010´\u0001\u001a\u00020o2\u0006\u0010e\u001a\u00020fH\u0016J\u001f\u0010µ\u0001\u001a\u00020o2\u0006\u0010p\u001a\u00028\u00012\u0006\u0010x\u001a\u00020\u0006H\u0016¢\u0006\u0003\u0010\u0085\u0001J/\u0010µ\u0001\u001a\u00020o2\u0006\u0010p\u001a\u00028\u00012\u0006\u0010x\u001a\u00020\u00062\u000e\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010\bH\u0016¢\u0006\u0003\u0010¶\u0001J\"\u0010·\u0001\u001a\u00028\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0003\u0010\u0098\u0001J\"\u0010¸\u0001\u001a\u00028\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u0006H\u0016¢\u0006\u0003\u0010\u0098\u0001J\u0011\u0010¹\u0001\u001a\u00020o2\u0006\u0010e\u001a\u00020fH\u0016J!\u0010º\u0001\u001a\u00020o2\u0007\u0010\u0083\u0001\u001a\u00028\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0003\u0010\u0085\u0001J\u0017\u0010»\u0001\u001a\u00020o2\u0006\u0010p\u001a\u00028\u0001H\u0016¢\u0006\u0003\u0010¼\u0001J\u0016\u0010½\u0001\u001a\u00020o2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010wJ\u0013\u0010½\u0001\u001a\u00020o2\b\b\u0001\u0010x\u001a\u00020\u0006H\u0017J\u0007\u0010¾\u0001\u001a\u00020oJ\u0007\u0010¿\u0001\u001a\u00020oJ\u0013\u0010À\u0001\u001a\u00020o2\b\b\u0001\u0010x\u001a\u00020\u0006H\u0016J\u0007\u0010Á\u0001\u001a\u00020oJ\u0010\u0010Â\u0001\u001a\u00020o2\u0007\u0010Ã\u0001\u001a\u00020~J\u0010\u0010Ä\u0001\u001a\u00020o2\u0007\u0010Å\u0001\u001a\u00020~J\u0017\u0010Æ\u0001\u001a\u00020o2\f\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000{H\u0017J\u0011\u0010Ç\u0001\u001a\u00020o2\b\u0010È\u0001\u001a\u00030É\u0001J \u0010Ê\u0001\u001a\u00020o2\b\b\u0001\u0010\u007f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010yJ\u0017\u0010Ë\u0001\u001a\u00020o2\u000e\u0010Ì\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Í\u0001J\u0017\u0010Î\u0001\u001a\u00020o2\u000e\u0010Ï\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Ð\u0001J$\u0010Ñ\u0001\u001a\u00020o2\n\b\u0001\u0010Ò\u0001\u001a\u00030Ó\u00012\r\u0010Ô\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J(\u0010Ñ\u0001\u001a\u00020o2\u000f\u0010Ô\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\f\b\u0002\u0010Õ\u0001\u001a\u0005\u0018\u00010Ö\u0001H\u0017J\u0010\u0010×\u0001\u001a\u00020o2\u0007\u0010Ø\u0001\u001a\u00020~J\u000f\u0010×\u0001\u001a\u00020o2\u0006\u0010\u0005\u001a\u00020\u0006J&\u0010Ù\u0001\u001a\u00020\u00062\u0006\u0010}\u001a\u00020~2\b\b\u0002\u0010\u007f\u001a\u00020\u00062\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0006H\u0007J\u0011\u0010Ú\u0001\u001a\u00020o2\u0006\u0010p\u001a\u00020qH\u0014J\u0012\u0010Û\u0001\u001a\u00020o2\t\u0010Ü\u0001\u001a\u0004\u0018\u00010bJ&\u0010Ý\u0001\u001a\u00020\u00062\u0006\u0010}\u001a\u00020~2\b\b\u0002\u0010\u007f\u001a\u00020\u00062\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0006H\u0007J\u001a\u0010Þ\u0001\u001a\u00020o2\u000f\u0010Ô\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010{H\u0016J\u0019\u0010ß\u0001\u001a\u00020o2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0017J\u001a\u0010à\u0001\u001a\u00020o2\u000f\u0010Ô\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0016J\u001a\u0010á\u0001\u001a\u00020o2\u0007\u0010â\u0001\u001a\u00020~2\u0006\u0010x\u001a\u00020\u0006H\u0014J\u0012\u0010ã\u0001\u001a\u00020o2\t\u0010ä\u0001\u001a\u0004\u0018\u00010ZJ\u001a\u0010å\u0001\u001a\u00020\u00122\u0007\u0010â\u0001\u001a\u00020~2\u0006\u0010x\u001a\u00020\u0006H\u0014J\u0012\u0010æ\u0001\u001a\u00020o2\t\u0010ä\u0001\u001a\u0004\u0018\u00010\\J\u001a\u0010ç\u0001\u001a\u00020o2\u0007\u0010â\u0001\u001a\u00020~2\u0006\u0010x\u001a\u00020\u0006H\u0014J\u0012\u0010è\u0001\u001a\u00020o2\t\u0010ä\u0001\u001a\u0004\u0018\u00010^J\u001a\u0010é\u0001\u001a\u00020\u00122\u0007\u0010â\u0001\u001a\u00020~2\u0006\u0010x\u001a\u00020\u0006H\u0014J\u0012\u0010ê\u0001\u001a\u00020o2\t\u0010ä\u0001\u001a\u0004\u0018\u00010`J\u001b\u0010ë\u0001\u001a\u00020o2\b\u0010ì\u0001\u001a\u00030í\u00012\u0006\u0010\u007f\u001a\u00020\u0006H\u0014R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R\u0011\u00105\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b6\u00101R\u001a\u00107\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016R\u0013\u0010:\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b;\u0010.R\u0011\u0010<\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b=\u00101R\u001a\u0010>\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0014\"\u0004\b@\u0010\u0016R\u0011\u0010A\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bB\u00101R\u001a\u0010C\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0014\"\u0004\bE\u0010\u0016R\u001a\u0010F\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0014\"\u0004\bG\u0010\u0016R\u001a\u0010H\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0014\"\u0004\bI\u0010\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010J\u001a\u00020K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010N\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010OX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010P\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010U\u001a\u0004\u0018\u00010KX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010M\"\u0004\bW\u0010XR\u0010\u0010Y\u001a\u0004\u0018\u00010ZX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u0004\u0018\u00010\\X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010]\u001a\u0004\u0018\u00010^X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010_\u001a\u0004\u0018\u00010`X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010a\u001a\u0004\u0018\u00010bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010c\u001a\u0004\u0018\u00010dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010e\u001a\u00020f8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\"\u0010i\u001a\u0004\u0018\u00010f2\b\u0010\u001e\u001a\u0004\u0018\u00010f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bj\u0010hR\u0011\u0010k\u001a\u00020d8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006ð\u0001"}, d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter;", "T", "VH", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "layoutResId", "", "data", "", "(ILjava/util/List;)V", "value", "Lcom/chad/library/adapter/base/animation/BaseAnimation;", "adapterAnimation", "getAdapterAnimation", "()Lcom/chad/library/adapter/base/animation/BaseAnimation;", "setAdapterAnimation", "(Lcom/chad/library/adapter/base/animation/BaseAnimation;)V", "animationEnable", "", "getAnimationEnable", "()Z", "setAnimationEnable", "(Z)V", "childClickViewIds", "Ljava/util/LinkedHashSet;", "childLongClickViewIds", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<set-?>", "getData", "()Ljava/util/List;", "setData$com_github_CymChad_brvah", "(Ljava/util/List;)V", "draggableModule", "Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "getDraggableModule", "()Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "emptyLayout", "Landroid/widget/FrameLayout;", "getEmptyLayout", "()Landroid/widget/FrameLayout;", "footerLayout", "Landroid/widget/LinearLayout;", "getFooterLayout", "()Landroid/widget/LinearLayout;", "footerLayoutCount", "getFooterLayoutCount", "()I", "footerViewAsFlow", "getFooterViewAsFlow", "setFooterViewAsFlow", "footerViewPosition", "getFooterViewPosition", "footerWithEmptyEnable", "getFooterWithEmptyEnable", "setFooterWithEmptyEnable", "headerLayout", "getHeaderLayout", "headerLayoutCount", "getHeaderLayoutCount", "headerViewAsFlow", "getHeaderViewAsFlow", "setHeaderViewAsFlow", "headerViewPosition", "getHeaderViewPosition", "headerWithEmptyEnable", "getHeaderWithEmptyEnable", "setHeaderWithEmptyEnable", "isAnimationFirstOnly", "setAnimationFirstOnly", "isUseEmpty", "setUseEmpty", "loadMoreModule", "Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "getLoadMoreModule", "()Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "mDiffHelper", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "mDraggableModule", "mEmptyLayout", "mFooterLayout", "mHeaderLayout", "mLastPosition", "mLoadMoreModule", "getMLoadMoreModule$com_github_CymChad_brvah", "setMLoadMoreModule$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;)V", "mOnItemChildClickListener", "Lcom/chad/library/adapter/base/listener/OnItemChildClickListener;", "mOnItemChildLongClickListener", "Lcom/chad/library/adapter/base/listener/OnItemChildLongClickListener;", "mOnItemClickListener", "Lcom/chad/library/adapter/base/listener/OnItemClickListener;", "mOnItemLongClickListener", "Lcom/chad/library/adapter/base/listener/OnItemLongClickListener;", "mSpanSizeLookup", "Lcom/chad/library/adapter/base/listener/GridSpanSizeLookup;", "mUpFetchModule", "Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerViewOrNull", "getRecyclerViewOrNull", "upFetchModule", "getUpFetchModule", "()Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "addAnimation", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "addChildClickViewIds", "viewIds", "", "addChildLongClickViewIds", "addData", "(Ljava/lang/Object;)V", "position", "(ILjava/lang/Object;)V", "newData", "", "addFooterView", "view", "Landroid/view/View;", "index", "orientation", "addHeaderView", "bindViewClickListener", "viewHolder", "viewType", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "checkModule", "compatibilityDataSizeChanged", "size", "convert", "item", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "payloads", "", "", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "createBaseGenericKInstance", "z", "Ljava/lang/Class;", "(Ljava/lang/Class;Landroid/view/View;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "createBaseViewHolder", "(Landroid/view/View;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "getChildClickViewIds", "getChildLongClickViewIds", "getDefItemCount", "getDefItemViewType", "getDiffHelper", "getDiffer", "getInstancedGenericKClass", "getItem", "(I)Ljava/lang/Object;", "getItemCount", "getItemId", "", "getItemOrNull", "getItemPosition", "(Ljava/lang/Object;)I", "getItemViewType", "getOnItemChildClickListener", "getOnItemChildLongClickListener", "getOnItemClickListener", "getOnItemLongClickListener", "getViewByPosition", "viewId", "hasEmptyView", "hasFooterLayout", "hasHeaderLayout", "isFixedViewType", "type", "onAttachedToRecyclerView", "onBindViewHolder", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;ILjava/util/List;)V", "onCreateDefViewHolder", "onCreateViewHolder", "onDetachedFromRecyclerView", "onItemViewHolderCreated", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "remove", "removeAllFooterView", "removeAllHeaderView", "removeAt", "removeEmptyView", "removeFooterView", "footer", "removeHeaderView", "header", "replaceData", "setAnimationWithDefault", "animationType", "Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;", "setData", "setDiffCallback", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "setDiffConfig", "config", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "setDiffNewData", "diffResult", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "list", "commitCallback", "Ljava/lang/Runnable;", "setEmptyView", "emptyView", "setFooterView", "setFullSpan", "setGridSpanSizeLookup", "spanSizeLookup", "setHeaderView", "setList", "setNewData", "setNewInstance", "setOnItemChildClick", "v", "setOnItemChildClickListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemChildLongClick", "setOnItemChildLongClickListener", "setOnItemClick", "setOnItemClickListener", "setOnItemLongClick", "setOnItemLongClickListener", "startAnim", "anim", "Landroid/animation/Animator;", "AnimationType", "Companion", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public abstract class BaseQuickAdapter<T, VH extends com.chad.library.adapter.base.viewholder.BaseViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {
    public static final int EMPTY_VIEW = 268436821;
    public static final int FOOTER_VIEW = 268436275;
    public static final int HEADER_VIEW = 268435729;
    public static final int LOAD_MORE_VIEW = 268436002;
    private com.chad.library.adapter.base.animation.BaseAnimation adapterAnimation;
    private boolean animationEnable;
    private final java.util.LinkedHashSet<java.lang.Integer> childClickViewIds;
    private final java.util.LinkedHashSet<java.lang.Integer> childLongClickViewIds;
    private java.util.List<T> data;
    private boolean footerViewAsFlow;
    private boolean footerWithEmptyEnable;
    private boolean headerViewAsFlow;
    private boolean headerWithEmptyEnable;
    private boolean isAnimationFirstOnly;
    private boolean isUseEmpty;
    private final int layoutResId;
    private com.chad.library.adapter.base.diff.BrvahAsyncDiffer<T> mDiffHelper;
    private com.chad.library.adapter.base.module.BaseDraggableModule mDraggableModule;
    private android.widget.FrameLayout mEmptyLayout;
    private android.widget.LinearLayout mFooterLayout;
    private android.widget.LinearLayout mHeaderLayout;
    private int mLastPosition;
    private com.chad.library.adapter.base.module.BaseLoadMoreModule mLoadMoreModule;
    private com.chad.library.adapter.base.listener.OnItemChildClickListener mOnItemChildClickListener;
    private com.chad.library.adapter.base.listener.OnItemChildLongClickListener mOnItemChildLongClickListener;
    private com.chad.library.adapter.base.listener.OnItemClickListener mOnItemClickListener;
    private com.chad.library.adapter.base.listener.OnItemLongClickListener mOnItemLongClickListener;
    private com.chad.library.adapter.base.listener.GridSpanSizeLookup mSpanSizeLookup;
    private com.chad.library.adapter.base.module.BaseUpFetchModule mUpFetchModule;
    private androidx.recyclerview.widget.RecyclerView recyclerViewOrNull;

    /* compiled from: BaseQuickAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;", "", "(Ljava/lang/String;I)V", "AlphaIn", "ScaleIn", "SlideInBottom", "SlideInLeft", "SlideInRight", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum AnimationType {
        AlphaIn,
        ScaleIn,
        SlideInBottom,
        SlideInLeft,
        SlideInRight
    }

    /* compiled from: BaseQuickAdapter.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.chad.library.adapter.base.BaseQuickAdapter.AnimationType.values().length];
            iArr[com.chad.library.adapter.base.BaseQuickAdapter.AnimationType.AlphaIn.ordinal()] = 1;
            iArr[com.chad.library.adapter.base.BaseQuickAdapter.AnimationType.ScaleIn.ordinal()] = 2;
            iArr[com.chad.library.adapter.base.BaseQuickAdapter.AnimationType.SlideInBottom.ordinal()] = 3;
            iArr[com.chad.library.adapter.base.BaseQuickAdapter.AnimationType.SlideInLeft.ordinal()] = 4;
            iArr[com.chad.library.adapter.base.BaseQuickAdapter.AnimationType.SlideInRight.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseQuickAdapter(int r3) {
        /*
            r2 = this;
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chad.library.adapter.base.BaseQuickAdapter.<init>(int):void");
    }

    public final int addFooterView(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        return addFooterView$default(this, view, 0, 0, 6, null);
    }

    public final int addFooterView(android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        return addFooterView$default(this, view, i, 0, 4, null);
    }

    public final int addHeaderView(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        return addHeaderView$default(this, view, 0, 0, 6, null);
    }

    public final int addHeaderView(android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        return addHeaderView$default(this, view, i, 0, 4, null);
    }

    protected abstract void convert(VH holder, T item);

    protected void convert(VH holder, T item, java.util.List<? extends java.lang.Object> payloads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloads, "payloads");
    }

    public long getItemId(int position) {
        return position;
    }

    protected boolean isFixedViewType(int type) {
        return type == 268436821 || type == 268435729 || type == 268436275 || type == 268436002;
    }

    protected void onItemViewHolderCreated(VH viewHolder, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }

    public final void setDiffNewData(java.util.List<T> list) {
        setDiffNewData$default(this, list, null, 2, null);
    }

    public final int setFooterView(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        return setFooterView$default(this, view, 0, 0, 6, null);
    }

    public final int setFooterView(android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        return setFooterView$default(this, view, i, 0, 4, null);
    }

    public final int setHeaderView(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        return setHeaderView$default(this, view, 0, 0, 6, null);
    }

    public final int setHeaderView(android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        return setHeaderView$default(this, view, i, 0, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, java.util.List list) {
        onBindViewHolder((com.chad.library.adapter.base.BaseQuickAdapter<T, VH>) viewHolder, i, (java.util.List<java.lang.Object>) list);
    }

    public /* synthetic */ BaseQuickAdapter(int i, java.util.List list, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : list);
    }

    public BaseQuickAdapter(int i, java.util.ArrayList arrayList) {
        this.layoutResId = i;
        this.data = arrayList == null ? new java.util.ArrayList() : arrayList;
        this.isUseEmpty = true;
        this.isAnimationFirstOnly = true;
        this.mLastPosition = -1;
        checkModule();
        this.childClickViewIds = new java.util.LinkedHashSet<>();
        this.childLongClickViewIds = new java.util.LinkedHashSet<>();
    }

    public final java.util.List<T> getData() {
        return this.data;
    }

    public final void setData$com_github_CymChad_brvah(java.util.List<T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final boolean getHeaderWithEmptyEnable() {
        return this.headerWithEmptyEnable;
    }

    public final void setHeaderWithEmptyEnable(boolean z) {
        this.headerWithEmptyEnable = z;
    }

    public final boolean getFooterWithEmptyEnable() {
        return this.footerWithEmptyEnable;
    }

    public final void setFooterWithEmptyEnable(boolean z) {
        this.footerWithEmptyEnable = z;
    }

    /* renamed from: isUseEmpty, reason: from getter */
    public final boolean getIsUseEmpty() {
        return this.isUseEmpty;
    }

    public final void setUseEmpty(boolean z) {
        this.isUseEmpty = z;
    }

    public final boolean getHeaderViewAsFlow() {
        return this.headerViewAsFlow;
    }

    public final void setHeaderViewAsFlow(boolean z) {
        this.headerViewAsFlow = z;
    }

    public final boolean getFooterViewAsFlow() {
        return this.footerViewAsFlow;
    }

    public final void setFooterViewAsFlow(boolean z) {
        this.footerViewAsFlow = z;
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    public final void setAnimationEnable(boolean z) {
        this.animationEnable = z;
    }

    /* renamed from: isAnimationFirstOnly, reason: from getter */
    public final boolean getIsAnimationFirstOnly() {
        return this.isAnimationFirstOnly;
    }

    public final void setAnimationFirstOnly(boolean z) {
        this.isAnimationFirstOnly = z;
    }

    public final com.chad.library.adapter.base.animation.BaseAnimation getAdapterAnimation() {
        return this.adapterAnimation;
    }

    public final void setAdapterAnimation(com.chad.library.adapter.base.animation.BaseAnimation baseAnimation) {
        this.animationEnable = true;
        this.adapterAnimation = baseAnimation;
    }

    public final com.chad.library.adapter.base.module.BaseLoadMoreModule getLoadMoreModule() {
        com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule == null) {
            throw new java.lang.IllegalStateException("Please first implements LoadMoreModule".toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(baseLoadMoreModule);
        return baseLoadMoreModule;
    }

    public final com.chad.library.adapter.base.module.BaseUpFetchModule getUpFetchModule() {
        com.chad.library.adapter.base.module.BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule == null) {
            throw new java.lang.IllegalStateException("Please first implements UpFetchModule".toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(baseUpFetchModule);
        return baseUpFetchModule;
    }

    public final com.chad.library.adapter.base.module.BaseDraggableModule getDraggableModule() {
        com.chad.library.adapter.base.module.BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule == null) {
            throw new java.lang.IllegalStateException("Please first implements DraggableModule".toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(baseDraggableModule);
        return baseDraggableModule;
    }

    /* renamed from: getMLoadMoreModule$com_github_CymChad_brvah, reason: from getter */
    public final com.chad.library.adapter.base.module.BaseLoadMoreModule getMLoadMoreModule() {
        return this.mLoadMoreModule;
    }

    public final void setMLoadMoreModule$com_github_CymChad_brvah(com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule) {
        this.mLoadMoreModule = baseLoadMoreModule;
    }

    public final androidx.recyclerview.widget.RecyclerView getRecyclerViewOrNull() {
        return this.recyclerViewOrNull;
    }

    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView == null) {
            throw new java.lang.IllegalStateException("Please get it after onAttachedToRecyclerView()".toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(recyclerView);
        return recyclerView;
    }

    public final android.content.Context getContext() {
        android.content.Context context = getRecyclerView().getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "recyclerView.context");
        return context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkModule() {
        if (this instanceof com.chad.library.adapter.base.module.LoadMoreModule) {
            this.mLoadMoreModule = ((com.chad.library.adapter.base.module.LoadMoreModule) this).addLoadMoreModule(this);
        }
        if (this instanceof com.chad.library.adapter.base.module.UpFetchModule) {
            this.mUpFetchModule = ((com.chad.library.adapter.base.module.UpFetchModule) this).addUpFetchModule(this);
        }
        if (this instanceof com.chad.library.adapter.base.module.DraggableModule) {
            this.mDraggableModule = ((com.chad.library.adapter.base.module.DraggableModule) this).addDraggableModule(this);
        }
    }

    public VH onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        android.view.KeyEvent.Callback callback = null;
        switch (viewType) {
            case HEADER_VIEW /* 268435729 */:
                android.widget.LinearLayout linearLayout = this.mHeaderLayout;
                if (linearLayout == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                    linearLayout = null;
                }
                android.view.ViewParent parent2 = linearLayout.getParent();
                if (parent2 instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent2;
                    android.widget.LinearLayout linearLayout2 = this.mHeaderLayout;
                    if (linearLayout2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                        linearLayout2 = null;
                    }
                    viewGroup.removeView(linearLayout2);
                }
                android.view.KeyEvent.Callback callback2 = this.mHeaderLayout;
                if (callback2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                } else {
                    callback = callback2;
                }
                return createBaseViewHolder((android.view.View) callback);
            case LOAD_MORE_VIEW /* 268436002 */:
                com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
                kotlin.jvm.internal.Intrinsics.checkNotNull(baseLoadMoreModule);
                VH createBaseViewHolder = createBaseViewHolder(baseLoadMoreModule.getLoadMoreView().getRootView(parent));
                com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                kotlin.jvm.internal.Intrinsics.checkNotNull(baseLoadMoreModule2);
                baseLoadMoreModule2.setupViewHolder$com_github_CymChad_brvah(createBaseViewHolder);
                return createBaseViewHolder;
            case FOOTER_VIEW /* 268436275 */:
                android.widget.LinearLayout linearLayout3 = this.mFooterLayout;
                if (linearLayout3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                    linearLayout3 = null;
                }
                android.view.ViewParent parent3 = linearLayout3.getParent();
                if (parent3 instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) parent3;
                    android.widget.LinearLayout linearLayout4 = this.mFooterLayout;
                    if (linearLayout4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                        linearLayout4 = null;
                    }
                    viewGroup2.removeView(linearLayout4);
                }
                android.view.KeyEvent.Callback callback3 = this.mFooterLayout;
                if (callback3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                } else {
                    callback = callback3;
                }
                return createBaseViewHolder((android.view.View) callback);
            case EMPTY_VIEW /* 268436821 */:
                android.widget.FrameLayout frameLayout = this.mEmptyLayout;
                if (frameLayout == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                    frameLayout = null;
                }
                android.view.ViewParent parent4 = frameLayout.getParent();
                if (parent4 instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) parent4;
                    android.widget.FrameLayout frameLayout2 = this.mEmptyLayout;
                    if (frameLayout2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                        frameLayout2 = null;
                    }
                    viewGroup3.removeView(frameLayout2);
                }
                android.view.KeyEvent.Callback callback4 = this.mEmptyLayout;
                if (callback4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                } else {
                    callback = callback4;
                }
                return createBaseViewHolder((android.view.View) callback);
            default:
                VH onCreateDefViewHolder = onCreateDefViewHolder(parent, viewType);
                bindViewClickListener(onCreateDefViewHolder, viewType);
                com.chad.library.adapter.base.module.BaseDraggableModule baseDraggableModule = this.mDraggableModule;
                if (baseDraggableModule != null) {
                    baseDraggableModule.initView$com_github_CymChad_brvah(onCreateDefViewHolder);
                }
                onItemViewHolderCreated(onCreateDefViewHolder, viewType);
                return onCreateDefViewHolder;
        }
    }

    public int getItemCount() {
        if (hasEmptyView()) {
            if (this.headerWithEmptyEnable && hasHeaderLayout()) {
                r1 = 2;
            }
            return (this.footerWithEmptyEnable && hasFooterLayout()) ? r1 + 1 : r1;
        }
        com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        return getHeaderLayoutCount() + getDefItemCount() + getFooterLayoutCount() + ((baseLoadMoreModule == null || !baseLoadMoreModule.hasLoadMoreView()) ? 0 : 1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public int getItemViewType(int position) {
        if (hasEmptyView()) {
            boolean z = this.headerWithEmptyEnable && hasHeaderLayout();
            if (position != 0) {
                return position != 1 ? FOOTER_VIEW : FOOTER_VIEW;
            }
            if (z) {
                return HEADER_VIEW;
            }
            return EMPTY_VIEW;
        }
        boolean hasHeaderLayout = hasHeaderLayout();
        if (hasHeaderLayout && position == 0) {
            return HEADER_VIEW;
        }
        if (hasHeaderLayout) {
            position--;
        }
        int size = this.data.size();
        if (position < size) {
            return getDefItemViewType(position);
        }
        return position - size < hasFooterLayout() ? FOOTER_VIEW : LOAD_MORE_VIEW;
    }

    @Override // 
    public void onBindViewHolder(VH holder, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        com.chad.library.adapter.base.module.BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule != null) {
            baseUpFetchModule.autoUpFetch$com_github_CymChad_brvah(position);
        }
        com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.autoLoadMore$com_github_CymChad_brvah(position);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            case LOAD_MORE_VIEW /* 268436002 */:
                com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 != null) {
                    baseLoadMoreModule2.getLoadMoreView().convert(holder, position, baseLoadMoreModule2.getLoadMoreStatus());
                    break;
                }
                break;
            default:
                convert(holder, getItem(position - getHeaderLayoutCount()));
                break;
        }
    }

    public void onBindViewHolder(VH holder, int position, java.util.List<java.lang.Object> payloads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder((com.chad.library.adapter.base.BaseQuickAdapter<T, VH>) holder, position);
        }
        com.chad.library.adapter.base.module.BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule != null) {
            baseUpFetchModule.autoUpFetch$com_github_CymChad_brvah(position);
        }
        com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.autoLoadMore$com_github_CymChad_brvah(position);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            case LOAD_MORE_VIEW /* 268436002 */:
                com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 != null) {
                    baseLoadMoreModule2.getLoadMoreView().convert(holder, position, baseLoadMoreModule2.getLoadMoreStatus());
                    break;
                }
                break;
            default:
                convert(holder, getItem(position - getHeaderLayoutCount()), payloads);
                break;
        }
    }

    @Override // 
    public void onViewAttachedToWindow(VH holder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        VH vh = holder;
        super.onViewAttachedToWindow(vh);
        if (isFixedViewType(holder.getItemViewType())) {
            setFullSpan(vh);
        } else {
            addAnimation(vh);
        }
    }

    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerViewOrNull = recyclerView;
        com.chad.library.adapter.base.module.BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.attachToRecyclerView(recyclerView);
        }
        final androidx.recyclerview.widget.GridLayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager) {
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager;
            final androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
            gridLayoutManager.setSpanSizeLookup(new androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup(this) { // from class: com.chad.library.adapter.base.BaseQuickAdapter$onAttachedToRecyclerView$1
                final /* synthetic */ com.chad.library.adapter.base.BaseQuickAdapter<T, VH> this$0;

                {
                    this.this$0 = this;
                }

                public int getSpanSize(int position) {
                    com.chad.library.adapter.base.listener.GridSpanSizeLookup gridSpanSizeLookup;
                    com.chad.library.adapter.base.listener.GridSpanSizeLookup gridSpanSizeLookup2;
                    int itemViewType = this.this$0.getItemViewType(position);
                    if (itemViewType == 268435729 && this.this$0.getHeaderViewAsFlow()) {
                        return 1;
                    }
                    if (itemViewType == 268436275 && this.this$0.getFooterViewAsFlow()) {
                        return 1;
                    }
                    gridSpanSizeLookup = ((com.chad.library.adapter.base.BaseQuickAdapter) this.this$0).mSpanSizeLookup;
                    if (gridSpanSizeLookup == null) {
                        return this.this$0.isFixedViewType(itemViewType) ? layoutManager.getSpanCount() : spanSizeLookup.getSpanSize(position);
                    }
                    if (!this.this$0.isFixedViewType(itemViewType)) {
                        gridSpanSizeLookup2 = ((com.chad.library.adapter.base.BaseQuickAdapter) this.this$0).mSpanSizeLookup;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(gridSpanSizeLookup2);
                        return gridSpanSizeLookup2.getSpanSize((androidx.recyclerview.widget.GridLayoutManager) layoutManager, itemViewType, position - this.this$0.getHeaderLayoutCount());
                    }
                    return layoutManager.getSpanCount();
                }
            });
        }
    }

    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerViewOrNull = null;
    }

    public T getItem(int position) {
        return this.data.get(position);
    }

    public T getItemOrNull(int position) {
        return (T) kotlin.collections.CollectionsKt.getOrNull(this.data, position);
    }

    public int getItemPosition(T item) {
        if (item == null || !(!this.data.isEmpty())) {
            return -1;
        }
        return this.data.indexOf(item);
    }

    public final java.util.LinkedHashSet<java.lang.Integer> getChildClickViewIds() {
        return this.childClickViewIds;
    }

    public final void addChildClickViewIds(int... viewIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        for (int i : viewIds) {
            this.childClickViewIds.add(java.lang.Integer.valueOf(i));
        }
    }

    public final java.util.LinkedHashSet<java.lang.Integer> getChildLongClickViewIds() {
        return this.childLongClickViewIds;
    }

    public final void addChildLongClickViewIds(int... viewIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        for (int i : viewIds) {
            this.childLongClickViewIds.add(java.lang.Integer.valueOf(i));
        }
    }

    protected void bindViewClickListener(final VH viewHolder, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (this.mOnItemClickListener != null) {
            ((com.chad.library.adapter.base.viewholder.BaseViewHolder) viewHolder).itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseQuickAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.chad.library.adapter.base.BaseQuickAdapter.m23bindViewClickListener$lambda7$lambda6(com.chad.library.adapter.base.viewholder.BaseViewHolder.this, this, view);
                }
            });
        }
        if (this.mOnItemLongClickListener != null) {
            ((com.chad.library.adapter.base.viewholder.BaseViewHolder) viewHolder).itemView.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseQuickAdapter$$ExternalSyntheticLambda2
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    boolean m24bindViewClickListener$lambda9$lambda8;
                    m24bindViewClickListener$lambda9$lambda8 = com.chad.library.adapter.base.BaseQuickAdapter.m24bindViewClickListener$lambda9$lambda8(com.chad.library.adapter.base.viewholder.BaseViewHolder.this, this, view);
                    return m24bindViewClickListener$lambda9$lambda8;
                }
            });
        }
        if (this.mOnItemChildClickListener != null) {
            java.util.Iterator<java.lang.Integer> it = getChildClickViewIds().iterator();
            while (it.hasNext()) {
                java.lang.Integer next = it.next();
                android.view.View view = ((com.chad.library.adapter.base.viewholder.BaseViewHolder) viewHolder).itemView;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID);
                android.view.View findViewById = view.findViewById(next.intValue());
                if (findViewById != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<View>(id)");
                    if (!findViewById.isClickable()) {
                        findViewById.setClickable(true);
                    }
                    findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseQuickAdapter$$ExternalSyntheticLambda1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view2) {
                            com.chad.library.adapter.base.BaseQuickAdapter.m21bindViewClickListener$lambda12$lambda11$lambda10(com.chad.library.adapter.base.viewholder.BaseViewHolder.this, this, view2);
                        }
                    });
                }
            }
        }
        if (this.mOnItemChildLongClickListener != null) {
            java.util.Iterator<java.lang.Integer> it2 = getChildLongClickViewIds().iterator();
            while (it2.hasNext()) {
                java.lang.Integer next2 = it2.next();
                android.view.View view2 = ((com.chad.library.adapter.base.viewholder.BaseViewHolder) viewHolder).itemView;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next2, com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID);
                android.view.View findViewById2 = view2.findViewById(next2.intValue());
                if (findViewById2 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById<View>(id)");
                    if (!findViewById2.isLongClickable()) {
                        findViewById2.setLongClickable(true);
                    }
                    findViewById2.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseQuickAdapter$$ExternalSyntheticLambda3
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(android.view.View view3) {
                            boolean m22bindViewClickListener$lambda15$lambda14$lambda13;
                            m22bindViewClickListener$lambda15$lambda14$lambda13 = com.chad.library.adapter.base.BaseQuickAdapter.m22bindViewClickListener$lambda15$lambda14$lambda13(com.chad.library.adapter.base.viewholder.BaseViewHolder.this, this, view3);
                            return m22bindViewClickListener$lambda15$lambda14$lambda13;
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindViewClickListener$lambda-7$lambda-6, reason: not valid java name */
    public static final void m23bindViewClickListener$lambda7$lambda6(com.chad.library.adapter.base.viewholder.BaseViewHolder baseViewHolder, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseViewHolder, "$viewHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "this$0");
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - baseQuickAdapter.getHeaderLayoutCount();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "v");
        baseQuickAdapter.setOnItemClick(view, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindViewClickListener$lambda-9$lambda-8, reason: not valid java name */
    public static final boolean m24bindViewClickListener$lambda9$lambda8(com.chad.library.adapter.base.viewholder.BaseViewHolder baseViewHolder, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseViewHolder, "$viewHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "this$0");
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - baseQuickAdapter.getHeaderLayoutCount();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "v");
        return baseQuickAdapter.setOnItemLongClick(view, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindViewClickListener$lambda-12$lambda-11$lambda-10, reason: not valid java name */
    public static final void m21bindViewClickListener$lambda12$lambda11$lambda10(com.chad.library.adapter.base.viewholder.BaseViewHolder baseViewHolder, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseViewHolder, "$viewHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "this$0");
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - baseQuickAdapter.getHeaderLayoutCount();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "v");
        baseQuickAdapter.setOnItemChildClick(view, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindViewClickListener$lambda-15$lambda-14$lambda-13, reason: not valid java name */
    public static final boolean m22bindViewClickListener$lambda15$lambda14$lambda13(com.chad.library.adapter.base.viewholder.BaseViewHolder baseViewHolder, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseViewHolder, "$viewHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "this$0");
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - baseQuickAdapter.getHeaderLayoutCount();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "v");
        return baseQuickAdapter.setOnItemChildLongClick(view, headerLayoutCount);
    }

    protected void setOnItemClick(android.view.View v, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "v");
        com.chad.library.adapter.base.listener.OnItemClickListener onItemClickListener = this.mOnItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(this, v, position);
        }
    }

    protected boolean setOnItemLongClick(android.view.View v, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "v");
        com.chad.library.adapter.base.listener.OnItemLongClickListener onItemLongClickListener = this.mOnItemLongClickListener;
        if (onItemLongClickListener != null) {
            return onItemLongClickListener.onItemLongClick(this, v, position);
        }
        return false;
    }

    protected void setOnItemChildClick(android.view.View v, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "v");
        com.chad.library.adapter.base.listener.OnItemChildClickListener onItemChildClickListener = this.mOnItemChildClickListener;
        if (onItemChildClickListener != null) {
            onItemChildClickListener.onItemChildClick(this, v, position);
        }
    }

    protected boolean setOnItemChildLongClick(android.view.View v, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "v");
        com.chad.library.adapter.base.listener.OnItemChildLongClickListener onItemChildLongClickListener = this.mOnItemChildLongClickListener;
        if (onItemChildLongClickListener != null) {
            return onItemChildLongClickListener.onItemChildLongClick(this, v, position);
        }
        return false;
    }

    protected int getDefItemCount() {
        return this.data.size();
    }

    protected int getDefItemViewType(int position) {
        return super.getItemViewType(position);
    }

    protected VH onCreateDefViewHolder(android.view.ViewGroup parent, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        return createBaseViewHolder(parent, this.layoutResId);
    }

    protected VH createBaseViewHolder(android.view.ViewGroup parent, int layoutResId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        return createBaseViewHolder(com.chad.library.adapter.base.util.AdapterUtilsKt.getItemView(parent, layoutResId));
    }

    protected VH createBaseViewHolder(android.view.View view) {
        VH createBaseGenericKInstance;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        java.lang.Class<?> cls = null;
        for (java.lang.Class<?> cls2 = getClass(); cls == null && cls2 != null; cls2 = cls2.getSuperclass()) {
            cls = getInstancedGenericKClass(cls2);
        }
        if (cls == null) {
            createBaseGenericKInstance = (VH) new com.chad.library.adapter.base.viewholder.BaseViewHolder(view);
        } else {
            createBaseGenericKInstance = createBaseGenericKInstance(cls, view);
        }
        return createBaseGenericKInstance == null ? (VH) new com.chad.library.adapter.base.viewholder.BaseViewHolder(view) : createBaseGenericKInstance;
    }

    private final java.lang.Class<?> getInstancedGenericKClass(java.lang.Class<?> z) {
        try {
            java.lang.reflect.Type genericSuperclass = z.getGenericSuperclass();
            if (!(genericSuperclass instanceof java.lang.reflect.ParameterizedType)) {
                return null;
            }
            java.lang.reflect.Type[] actualTypeArguments = ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "types");
            for (java.lang.reflect.Type type : actualTypeArguments) {
                if (type instanceof java.lang.Class) {
                    if (com.chad.library.adapter.base.viewholder.BaseViewHolder.class.isAssignableFrom((java.lang.Class) type)) {
                        return (java.lang.Class) type;
                    }
                } else if (type instanceof java.lang.reflect.ParameterizedType) {
                    java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) type).getRawType();
                    if ((rawType instanceof java.lang.Class) && com.chad.library.adapter.base.viewholder.BaseViewHolder.class.isAssignableFrom((java.lang.Class) rawType)) {
                        return (java.lang.Class) rawType;
                    }
                } else {
                    continue;
                }
            }
            return null;
        } catch (java.lang.TypeNotPresentException e) {
            e.printStackTrace();
            return null;
        } catch (java.lang.reflect.GenericSignatureFormatError e2) {
            e2.printStackTrace();
            return null;
        } catch (java.lang.reflect.MalformedParameterizedTypeException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    private final VH createBaseGenericKInstance(java.lang.Class<?> z, android.view.View view) {
        try {
            if (z.isMemberClass() && !java.lang.reflect.Modifier.isStatic(z.getModifiers())) {
                java.lang.reflect.Constructor<?> declaredConstructor = z.getDeclaredConstructor(getClass(), android.view.View.class);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredConstructor, "z.getDeclaredConstructor…aClass, View::class.java)");
                declaredConstructor.setAccessible(true);
                java.lang.Object newInstance = declaredConstructor.newInstance(this, view);
                if (newInstance != null) {
                    return (VH) newInstance;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
            }
            java.lang.reflect.Constructor<?> declaredConstructor2 = z.getDeclaredConstructor(android.view.View.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredConstructor2, "z.getDeclaredConstructor(View::class.java)");
            declaredConstructor2.setAccessible(true);
            java.lang.Object newInstance2 = declaredConstructor2.newInstance(view);
            if (newInstance2 != null) {
                return (VH) newInstance2;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
        } catch (java.lang.IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (java.lang.InstantiationException e2) {
            e2.printStackTrace();
            return null;
        } catch (java.lang.NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (java.lang.reflect.InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    protected void setFullSpan(androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            layoutParams.setFullSpan(true);
        }
    }

    public final android.view.View getViewByPosition(int position, int viewId) {
        com.chad.library.adapter.base.viewholder.BaseViewHolder baseViewHolder;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView == null || (baseViewHolder = (com.chad.library.adapter.base.viewholder.BaseViewHolder) recyclerView.findViewHolderForLayoutPosition(position)) == null) {
            return null;
        }
        return baseViewHolder.getViewOrNull(viewId);
    }

    public static /* synthetic */ int addHeaderView$default(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeaderView");
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.addHeaderView(view, i, i2);
    }

    public final int addHeaderView(android.view.View view, int index, int orientation) {
        int headerViewPosition;
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        android.widget.LinearLayout linearLayout = null;
        if (this.mHeaderLayout == null) {
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(view.getContext());
            this.mHeaderLayout = linearLayout2;
            linearLayout2.setOrientation(orientation);
            android.widget.LinearLayout linearLayout3 = this.mHeaderLayout;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                linearLayout3 = null;
            }
            if (orientation == 1) {
                layoutParams = (android.view.ViewGroup.LayoutParams) new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = (android.view.ViewGroup.LayoutParams) new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout3.setLayoutParams(layoutParams);
        }
        android.widget.LinearLayout linearLayout4 = this.mHeaderLayout;
        if (linearLayout4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            linearLayout4 = null;
        }
        int childCount = linearLayout4.getChildCount();
        if (index < 0 || index > childCount) {
            index = childCount;
        }
        android.widget.LinearLayout linearLayout5 = this.mHeaderLayout;
        if (linearLayout5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            linearLayout5 = null;
        }
        linearLayout5.addView(view, index);
        android.widget.LinearLayout linearLayout6 = this.mHeaderLayout;
        if (linearLayout6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        } else {
            linearLayout = linearLayout6;
        }
        if (linearLayout.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return index;
    }

    public static /* synthetic */ int setHeaderView$default(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeaderView");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.setHeaderView(view, i, i2);
    }

    public final int setHeaderView(android.view.View view, int index, int orientation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        android.widget.LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null) {
            android.widget.LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                linearLayout = null;
            }
            if (linearLayout.getChildCount() > index) {
                android.widget.LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                    linearLayout3 = null;
                }
                linearLayout3.removeViewAt(index);
                android.widget.LinearLayout linearLayout4 = this.mHeaderLayout;
                if (linearLayout4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                } else {
                    linearLayout2 = linearLayout4;
                }
                linearLayout2.addView(view, index);
                return index;
            }
        }
        return addHeaderView(view, index, orientation);
    }

    public final boolean hasHeaderLayout() {
        android.widget.LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            linearLayout = null;
        }
        return linearLayout.getChildCount() > 0;
    }

    public final void removeHeaderView(android.view.View header) {
        int headerViewPosition;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "header");
        if (hasHeaderLayout()) {
            android.widget.LinearLayout linearLayout = this.mHeaderLayout;
            android.widget.LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                linearLayout = null;
            }
            linearLayout.removeView(header);
            android.widget.LinearLayout linearLayout3 = this.mHeaderLayout;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            } else {
                linearLayout2 = linearLayout3;
            }
            if (linearLayout2.getChildCount() != 0 || (headerViewPosition = getHeaderViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(headerViewPosition);
        }
    }

    public final void removeAllHeaderView() {
        if (hasHeaderLayout()) {
            android.widget.LinearLayout linearLayout = this.mHeaderLayout;
            if (linearLayout == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                linearLayout = null;
            }
            linearLayout.removeAllViews();
            int headerViewPosition = getHeaderViewPosition();
            if (headerViewPosition != -1) {
                notifyItemRemoved(headerViewPosition);
            }
        }
    }

    public final int getHeaderViewPosition() {
        return (!hasEmptyView() || this.headerWithEmptyEnable) ? 0 : -1;
    }

    public final int getHeaderLayoutCount() {
        return hasHeaderLayout() ? 1 : 0;
    }

    public final android.widget.LinearLayout getHeaderLayout() {
        android.widget.LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
        } else {
            if (linearLayout != null) {
                return linearLayout;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        return null;
    }

    public static /* synthetic */ int addFooterView$default(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooterView");
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.addFooterView(view, i, i2);
    }

    public final int addFooterView(android.view.View view, int index, int orientation) {
        int footerViewPosition;
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        android.widget.LinearLayout linearLayout = null;
        if (this.mFooterLayout == null) {
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(view.getContext());
            this.mFooterLayout = linearLayout2;
            linearLayout2.setOrientation(orientation);
            android.widget.LinearLayout linearLayout3 = this.mFooterLayout;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                linearLayout3 = null;
            }
            if (orientation == 1) {
                layoutParams = (android.view.ViewGroup.LayoutParams) new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = (android.view.ViewGroup.LayoutParams) new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout3.setLayoutParams(layoutParams);
        }
        android.widget.LinearLayout linearLayout4 = this.mFooterLayout;
        if (linearLayout4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            linearLayout4 = null;
        }
        int childCount = linearLayout4.getChildCount();
        if (index < 0 || index > childCount) {
            index = childCount;
        }
        android.widget.LinearLayout linearLayout5 = this.mFooterLayout;
        if (linearLayout5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            linearLayout5 = null;
        }
        linearLayout5.addView(view, index);
        android.widget.LinearLayout linearLayout6 = this.mFooterLayout;
        if (linearLayout6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        } else {
            linearLayout = linearLayout6;
        }
        if (linearLayout.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return index;
    }

    public static /* synthetic */ int setFooterView$default(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFooterView");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.setFooterView(view, i, i2);
    }

    public final int setFooterView(android.view.View view, int index, int orientation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        android.widget.LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null) {
            android.widget.LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                linearLayout = null;
            }
            if (linearLayout.getChildCount() > index) {
                android.widget.LinearLayout linearLayout3 = this.mFooterLayout;
                if (linearLayout3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                    linearLayout3 = null;
                }
                linearLayout3.removeViewAt(index);
                android.widget.LinearLayout linearLayout4 = this.mFooterLayout;
                if (linearLayout4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                } else {
                    linearLayout2 = linearLayout4;
                }
                linearLayout2.addView(view, index);
                return index;
            }
        }
        return addFooterView(view, index, orientation);
    }

    public final void removeFooterView(android.view.View footer) {
        int footerViewPosition;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(footer, "footer");
        if (hasFooterLayout()) {
            android.widget.LinearLayout linearLayout = this.mFooterLayout;
            android.widget.LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                linearLayout = null;
            }
            linearLayout.removeView(footer);
            android.widget.LinearLayout linearLayout3 = this.mFooterLayout;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            } else {
                linearLayout2 = linearLayout3;
            }
            if (linearLayout2.getChildCount() != 0 || (footerViewPosition = getFooterViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(footerViewPosition);
        }
    }

    public final void removeAllFooterView() {
        if (hasFooterLayout()) {
            android.widget.LinearLayout linearLayout = this.mFooterLayout;
            if (linearLayout == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                linearLayout = null;
            }
            linearLayout.removeAllViews();
            int footerViewPosition = getFooterViewPosition();
            if (footerViewPosition != -1) {
                notifyItemRemoved(footerViewPosition);
            }
        }
    }

    public final boolean hasFooterLayout() {
        android.widget.LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            linearLayout = null;
        }
        return linearLayout.getChildCount() > 0;
    }

    public final int getFooterViewPosition() {
        if (hasEmptyView()) {
            int i = 1;
            if (this.headerWithEmptyEnable && hasHeaderLayout()) {
                i = 2;
            }
            if (this.footerWithEmptyEnable) {
                return i;
            }
            return -1;
        }
        return getHeaderLayoutCount() + this.data.size();
    }

    public final int getFooterLayoutCount() {
        return hasFooterLayout() ? 1 : 0;
    }

    public final android.widget.LinearLayout getFooterLayout() {
        android.widget.LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
        } else {
            if (linearLayout != null) {
                return linearLayout;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        return null;
    }

    public final void setEmptyView(android.view.View emptyView) {
        boolean z;
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emptyView, "emptyView");
        int itemCount = getItemCount();
        int i = 0;
        android.widget.FrameLayout frameLayout = null;
        if (this.mEmptyLayout == null) {
            android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(emptyView.getContext());
            this.mEmptyLayout = frameLayout2;
            android.view.ViewGroup.LayoutParams layoutParams2 = emptyView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams = new android.view.ViewGroup.LayoutParams(layoutParams2.width, layoutParams2.height);
            } else {
                layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
            }
            frameLayout2.setLayoutParams(layoutParams);
            z = true;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams3 = emptyView.getLayoutParams();
            if (layoutParams3 != null) {
                android.widget.FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                    frameLayout3 = null;
                }
                android.view.ViewGroup.LayoutParams layoutParams4 = frameLayout3.getLayoutParams();
                layoutParams4.width = layoutParams3.width;
                layoutParams4.height = layoutParams3.height;
                android.widget.FrameLayout frameLayout4 = this.mEmptyLayout;
                if (frameLayout4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                    frameLayout4 = null;
                }
                frameLayout4.setLayoutParams(layoutParams4);
            }
            z = false;
        }
        android.widget.FrameLayout frameLayout5 = this.mEmptyLayout;
        if (frameLayout5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
            frameLayout5 = null;
        }
        frameLayout5.removeAllViews();
        android.widget.FrameLayout frameLayout6 = this.mEmptyLayout;
        if (frameLayout6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
        } else {
            frameLayout = frameLayout6;
        }
        frameLayout.addView(emptyView);
        this.isUseEmpty = true;
        if (z && hasEmptyView()) {
            if (this.headerWithEmptyEnable && hasHeaderLayout()) {
                i = 1;
            }
            if (getItemCount() > itemCount) {
                notifyItemInserted(i);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    public final void setEmptyView(int layoutResId) {
        android.view.ViewGroup viewGroup = this.recyclerViewOrNull;
        if (viewGroup != null) {
            android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(layoutResId, viewGroup, false);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "view");
            setEmptyView(inflate);
        }
    }

    public final void removeEmptyView() {
        android.widget.FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                frameLayout = null;
            }
            frameLayout.removeAllViews();
        }
    }

    public final boolean hasEmptyView() {
        android.widget.FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                frameLayout = null;
            }
            if (frameLayout.getChildCount() != 0 && this.isUseEmpty) {
                return this.data.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final android.widget.FrameLayout getEmptyLayout() {
        android.widget.FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout == null) {
        } else {
            if (frameLayout != null) {
                return frameLayout;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
        }
        return null;
    }

    private final void addAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
        if (this.animationEnable) {
            if (!this.isAnimationFirstOnly || holder.getLayoutPosition() > this.mLastPosition) {
                com.chad.library.adapter.base.animation.AlphaInAnimation alphaInAnimation = this.adapterAnimation;
                if (alphaInAnimation == null) {
                    alphaInAnimation = new com.chad.library.adapter.base.animation.AlphaInAnimation(0.0f, 1, null);
                }
                android.view.View view = holder.itemView;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
                android.animation.Animator[] animators = alphaInAnimation.animators(view);
                for (android.animation.Animator animator : animators) {
                    startAnim(animator, holder.getLayoutPosition());
                }
                this.mLastPosition = holder.getLayoutPosition();
            }
        }
    }

    protected void startAnim(android.animation.Animator anim, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anim, "anim");
        anim.start();
    }

    public final void setAnimationWithDefault(com.chad.library.adapter.base.BaseQuickAdapter.AnimationType animationType) {
        com.chad.library.adapter.base.animation.AlphaInAnimation alphaInAnimation;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationType, "animationType");
        int i = com.chad.library.adapter.base.BaseQuickAdapter.WhenMappings.$EnumSwitchMapping$0[animationType.ordinal()];
        if (i == 1) {
            alphaInAnimation = new com.chad.library.adapter.base.animation.AlphaInAnimation(0.0f, 1, null);
        } else if (i == 2) {
            alphaInAnimation = new com.chad.library.adapter.base.animation.ScaleInAnimation(0.0f, 1, null);
        } else if (i == 3) {
            alphaInAnimation = new com.chad.library.adapter.base.animation.SlideInBottomAnimation();
        } else if (i == 4) {
            alphaInAnimation = new com.chad.library.adapter.base.animation.SlideInLeftAnimation();
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            alphaInAnimation = new com.chad.library.adapter.base.animation.SlideInRightAnimation();
        }
        setAdapterAnimation(alphaInAnimation);
    }

    @kotlin.Deprecated(message = "Please use setNewInstance(), This method will be removed in the next version", replaceWith = @kotlin.ReplaceWith(expression = "setNewInstance(data)", imports = {}))
    public void setNewData(java.util.List<T> data) {
        setNewInstance(data);
    }

    public void setNewInstance(java.util.List<T> list) {
        if (list == this.data) {
            return;
        }
        if (list == null) {
            list = new java.util.ArrayList();
        }
        this.data = list;
        com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.reset$com_github_CymChad_brvah();
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
        if (baseLoadMoreModule2 != null) {
            baseLoadMoreModule2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    @kotlin.Deprecated(message = "Please use setData()", replaceWith = @kotlin.ReplaceWith(expression = "setList(newData)", imports = {}))
    public void replaceData(java.util.Collection<? extends T> newData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newData, "newData");
        setList(newData);
    }

    public void setList(java.util.Collection<? extends T> list) {
        java.util.List<T> list2 = this.data;
        if (list != list2) {
            list2.clear();
            if (!(list == null || list.isEmpty())) {
                this.data.addAll(list);
            }
        } else {
            if (!(list == null || list.isEmpty())) {
                java.util.ArrayList arrayList = new java.util.ArrayList(list);
                this.data.clear();
                this.data.addAll(arrayList);
            } else {
                this.data.clear();
            }
        }
        com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.reset$com_github_CymChad_brvah();
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        com.chad.library.adapter.base.module.BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
        if (baseLoadMoreModule2 != null) {
            baseLoadMoreModule2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    public void setData(int index, T data) {
        if (index >= this.data.size()) {
            return;
        }
        this.data.set(index, data);
        notifyItemChanged(index + getHeaderLayoutCount());
    }

    public void addData(int position, T data) {
        this.data.add(position, data);
        notifyItemInserted(position + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public void addData(T data) {
        this.data.add(data);
        notifyItemInserted(this.data.size() + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public void addData(int position, java.util.Collection<? extends T> newData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newData, "newData");
        this.data.addAll(position, newData);
        notifyItemRangeInserted(position + getHeaderLayoutCount(), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public void addData(java.util.Collection<? extends T> newData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newData, "newData");
        this.data.addAll(newData);
        notifyItemRangeInserted((this.data.size() - newData.size()) + getHeaderLayoutCount(), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    @kotlin.Deprecated(message = "Please use removeAt()", replaceWith = @kotlin.ReplaceWith(expression = "removeAt(position)", imports = {}))
    public void remove(int position) {
        removeAt(position);
    }

    public void removeAt(int position) {
        if (position >= this.data.size()) {
            return;
        }
        this.data.remove(position);
        int headerLayoutCount = position + getHeaderLayoutCount();
        notifyItemRemoved(headerLayoutCount);
        compatibilityDataSizeChanged(0);
        notifyItemRangeChanged(headerLayoutCount, this.data.size() - headerLayoutCount);
    }

    public void remove(T data) {
        int indexOf = this.data.indexOf(data);
        if (indexOf == -1) {
            return;
        }
        removeAt(indexOf);
    }

    protected final void compatibilityDataSizeChanged(int size) {
        if (this.data.size() == size) {
            notifyDataSetChanged();
        }
    }

    public final void setDiffCallback(androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        setDiffConfig(new com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig.Builder(diffCallback).build());
    }

    public final void setDiffConfig(com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig<T> config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.mDiffHelper = new com.chad.library.adapter.base.diff.BrvahAsyncDiffer<>(this, config);
    }

    @kotlin.Deprecated(message = "User getDiffer()", replaceWith = @kotlin.ReplaceWith(expression = "getDiffer()", imports = {}))
    public final com.chad.library.adapter.base.diff.BrvahAsyncDiffer<T> getDiffHelper() {
        return getDiffer();
    }

    public final com.chad.library.adapter.base.diff.BrvahAsyncDiffer<T> getDiffer() {
        com.chad.library.adapter.base.diff.BrvahAsyncDiffer<T> brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer == null) {
            throw new java.lang.IllegalStateException("Please use setDiffCallback() or setDiffConfig() first!".toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(brvahAsyncDiffer);
        return brvahAsyncDiffer;
    }

    public static /* synthetic */ void setDiffNewData$default(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, java.util.List list, java.lang.Runnable runnable, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDiffNewData");
        }
        if ((i & 2) != 0) {
            runnable = null;
        }
        baseQuickAdapter.setDiffNewData(list, runnable);
    }

    public void setDiffNewData(java.util.List<T> list, java.lang.Runnable commitCallback) {
        if (hasEmptyView()) {
            setNewInstance(list);
            if (commitCallback != null) {
                commitCallback.run();
                return;
            }
            return;
        }
        com.chad.library.adapter.base.diff.BrvahAsyncDiffer<T> brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer != null) {
            brvahAsyncDiffer.submitList(list, commitCallback);
        }
    }

    public void setDiffNewData(androidx.recyclerview.widget.DiffUtil.DiffResult diffResult, java.util.List<T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            diffResult.dispatchUpdatesTo(new com.chad.library.adapter.base.diff.BrvahListUpdateCallback(this));
            this.data = list;
        }
    }

    public final void setGridSpanSizeLookup(com.chad.library.adapter.base.listener.GridSpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    public final void setOnItemClickListener(com.chad.library.adapter.base.listener.OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    public final void setOnItemLongClickListener(com.chad.library.adapter.base.listener.OnItemLongClickListener listener) {
        this.mOnItemLongClickListener = listener;
    }

    public final void setOnItemChildClickListener(com.chad.library.adapter.base.listener.OnItemChildClickListener listener) {
        this.mOnItemChildClickListener = listener;
    }

    public final void setOnItemChildLongClickListener(com.chad.library.adapter.base.listener.OnItemChildLongClickListener listener) {
        this.mOnItemChildLongClickListener = listener;
    }

    /* renamed from: getOnItemClickListener, reason: from getter */
    public final com.chad.library.adapter.base.listener.OnItemClickListener getMOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    /* renamed from: getOnItemLongClickListener, reason: from getter */
    public final com.chad.library.adapter.base.listener.OnItemLongClickListener getMOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    /* renamed from: getOnItemChildClickListener, reason: from getter */
    public final com.chad.library.adapter.base.listener.OnItemChildClickListener getMOnItemChildClickListener() {
        return this.mOnItemChildClickListener;
    }

    /* renamed from: getOnItemChildLongClickListener, reason: from getter */
    public final com.chad.library.adapter.base.listener.OnItemChildLongClickListener getMOnItemChildLongClickListener() {
        return this.mOnItemChildLongClickListener;
    }
}
