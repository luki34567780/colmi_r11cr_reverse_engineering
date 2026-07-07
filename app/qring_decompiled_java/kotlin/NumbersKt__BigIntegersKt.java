package kotlin;

/* compiled from: BigIntegers.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0087\f\u001a\u0015\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0087\f\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0010\u001a\u00020\u0011*\u00020\u0001H\u0087\b\u001a!\u0010\u0010\u001a\u00020\u0011*\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\rH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\u0016H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f¨\u0006\u0019"}, d2 = {"and", "Ljava/math/BigInteger;", com.google.android.gms.fitness.FitnessActivities.OTHER, "dec", "div", "inc", "inv", "minus", "or", "plus", "rem", "shl", "n", "", "shr", com.app.watch.keeping.Cactus.CACTUS_TIMES, "toBigDecimal", "Ljava/math/BigDecimal;", "scale", "mathContext", "Ljava/math/MathContext;", "toBigInteger", "", "unaryMinus", "xor", "kotlin-stdlib"}, k = 5, mv = {1, 6, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes3.dex */
class NumbersKt__BigIntegersKt extends kotlin.NumbersKt__BigDecimalsKt {
    private static final java.math.BigInteger plus(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger add = bigInteger.add(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(add, "this.add(other)");
        return add;
    }

    private static final java.math.BigInteger minus(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger subtract = bigInteger.subtract(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtract, "this.subtract(other)");
        return subtract;
    }

    private static final java.math.BigInteger times(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger multiply = bigInteger.multiply(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(multiply, "this.multiply(other)");
        return multiply;
    }

    private static final java.math.BigInteger div(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger divide = bigInteger.divide(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(divide, "this.divide(other)");
        return divide;
    }

    private static final java.math.BigInteger rem(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger remainder = bigInteger.remainder(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(remainder, "this.remainder(other)");
        return remainder;
    }

    private static final java.math.BigInteger unaryMinus(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger negate = bigInteger.negate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(negate, "this.negate()");
        return negate;
    }

    private static final java.math.BigInteger inc(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger add = bigInteger.add(java.math.BigInteger.ONE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(add, "this.add(BigInteger.ONE)");
        return add;
    }

    private static final java.math.BigInteger dec(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger subtract = bigInteger.subtract(java.math.BigInteger.ONE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtract, "this.subtract(BigInteger.ONE)");
        return subtract;
    }

    private static final java.math.BigInteger inv(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger not = bigInteger.not();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(not, "this.not()");
        return not;
    }

    private static final java.math.BigInteger and(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger and = bigInteger.and(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(and, "this.and(other)");
        return and;
    }

    private static final java.math.BigInteger or(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger or = bigInteger.or(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(or, "this.or(other)");
        return or;
    }

    private static final java.math.BigInteger xor(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger xor = bigInteger.xor(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(xor, "this.xor(other)");
        return xor;
    }

    private static final java.math.BigInteger shl(java.math.BigInteger bigInteger, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger shiftLeft = bigInteger.shiftLeft(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(shiftLeft, "this.shiftLeft(n)");
        return shiftLeft;
    }

    private static final java.math.BigInteger shr(java.math.BigInteger bigInteger, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger shiftRight = bigInteger.shiftRight(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(shiftRight, "this.shiftRight(n)");
        return shiftRight;
    }

    private static final java.math.BigInteger toBigInteger(int i) {
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    private static final java.math.BigInteger toBigInteger(long j) {
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }

    private static final java.math.BigDecimal toBigDecimal(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        return new java.math.BigDecimal(bigInteger);
    }

    static /* synthetic */ java.math.BigDecimal toBigDecimal$default(java.math.BigInteger bigInteger, int i, java.math.MathContext mathContext, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = java.math.MathContext.UNLIMITED;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mathContext, "UNLIMITED");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new java.math.BigDecimal(bigInteger, i, mathContext);
    }

    private static final java.math.BigDecimal toBigDecimal(java.math.BigInteger bigInteger, int i, java.math.MathContext mathContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new java.math.BigDecimal(bigInteger, i, mathContext);
    }
}
