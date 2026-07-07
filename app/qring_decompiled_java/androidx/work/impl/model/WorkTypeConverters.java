package androidx.work.impl.model;

/* loaded from: classes.dex */
public class WorkTypeConverters {

    public interface BackoffPolicyIds {
        public static final int EXPONENTIAL = 0;
        public static final int LINEAR = 1;
    }

    public interface NetworkTypeIds {
        public static final int CONNECTED = 1;
        public static final int METERED = 4;
        public static final int NOT_REQUIRED = 0;
        public static final int NOT_ROAMING = 3;
        public static final int TEMPORARILY_UNMETERED = 5;
        public static final int UNMETERED = 2;
    }

    public interface OutOfPolicyIds {
        public static final int DROP_WORK_REQUEST = 1;
        public static final int RUN_AS_NON_EXPEDITED_WORK_REQUEST = 0;
    }

    public interface StateIds {
        public static final int BLOCKED = 4;
        public static final int CANCELLED = 5;
        public static final java.lang.String COMPLETED_STATES = "(2, 3, 5)";
        public static final int ENQUEUED = 0;
        public static final int FAILED = 3;
        public static final int RUNNING = 1;
        public static final int SUCCEEDED = 2;
    }

    public static int stateToInt(androidx.work.WorkInfo.State state) {
        switch (androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$WorkInfo$State[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new java.lang.IllegalArgumentException("Could not convert " + state + " to int");
        }
    }

    public static androidx.work.WorkInfo.State intToState(int value) {
        if (value == 0) {
            return androidx.work.WorkInfo.State.ENQUEUED;
        }
        if (value == 1) {
            return androidx.work.WorkInfo.State.RUNNING;
        }
        if (value == 2) {
            return androidx.work.WorkInfo.State.SUCCEEDED;
        }
        if (value == 3) {
            return androidx.work.WorkInfo.State.FAILED;
        }
        if (value == 4) {
            return androidx.work.WorkInfo.State.BLOCKED;
        }
        if (value == 5) {
            return androidx.work.WorkInfo.State.CANCELLED;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + value + " to State");
    }

    public static int backoffPolicyToInt(androidx.work.BackoffPolicy backoffPolicy) {
        int i = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$BackoffPolicy[backoffPolicy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + backoffPolicy + " to int");
    }

    public static androidx.work.BackoffPolicy intToBackoffPolicy(int value) {
        if (value == 0) {
            return androidx.work.BackoffPolicy.EXPONENTIAL;
        }
        if (value == 1) {
            return androidx.work.BackoffPolicy.LINEAR;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + value + " to BackoffPolicy");
    }

    public static int networkTypeToInt(androidx.work.NetworkType networkType) {
        int i = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$NetworkType[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && networkType == androidx.work.NetworkType.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    public static androidx.work.NetworkType intToNetworkType(int value) {
        if (value == 0) {
            return androidx.work.NetworkType.NOT_REQUIRED;
        }
        if (value == 1) {
            return androidx.work.NetworkType.CONNECTED;
        }
        if (value == 2) {
            return androidx.work.NetworkType.UNMETERED;
        }
        if (value == 3) {
            return androidx.work.NetworkType.NOT_ROAMING;
        }
        if (value == 4) {
            return androidx.work.NetworkType.METERED;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && value == 5) {
            return androidx.work.NetworkType.TEMPORARILY_UNMETERED;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + value + " to NetworkType");
    }

    /* renamed from: androidx.work.impl.model.WorkTypeConverters$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$work$BackoffPolicy;
        static final /* synthetic */ int[] $SwitchMap$androidx$work$NetworkType;
        static final /* synthetic */ int[] $SwitchMap$androidx$work$OutOfQuotaPolicy;
        static final /* synthetic */ int[] $SwitchMap$androidx$work$WorkInfo$State;

        static {
            int[] iArr = new int[androidx.work.OutOfQuotaPolicy.values().length];
            $SwitchMap$androidx$work$OutOfQuotaPolicy = iArr;
            try {
                iArr[androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$work$OutOfQuotaPolicy[androidx.work.OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[androidx.work.NetworkType.values().length];
            $SwitchMap$androidx$work$NetworkType = iArr2;
            try {
                iArr2[androidx.work.NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[androidx.work.NetworkType.CONNECTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[androidx.work.NetworkType.UNMETERED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[androidx.work.NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[androidx.work.NetworkType.METERED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[androidx.work.BackoffPolicy.values().length];
            $SwitchMap$androidx$work$BackoffPolicy = iArr3;
            try {
                iArr3[androidx.work.BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$work$BackoffPolicy[androidx.work.BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[androidx.work.WorkInfo.State.values().length];
            $SwitchMap$androidx$work$WorkInfo$State = iArr4;
            try {
                iArr4[androidx.work.WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[androidx.work.WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
        }
    }

    public static int outOfQuotaPolicyToInt(androidx.work.OutOfQuotaPolicy policy) {
        int i = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$OutOfQuotaPolicy[policy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + policy + " to int");
    }

    public static androidx.work.OutOfQuotaPolicy intToOutOfQuotaPolicy(int value) {
        if (value == 0) {
            return androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return androidx.work.OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + value + " to OutOfQuotaPolicy");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0067 -> B:18:0x006a). Please report as a decompilation issue!!! */
    public static byte[] contentUriTriggersToByteArray(androidx.work.ContentUriTriggers contentUriTriggers) {
        java.io.ObjectOutputStream objectOutputStream;
        boolean hasNext;
        java.io.ObjectOutputStream objectOutputStream2 = null;
        java.io.ObjectOutputStream objectOutputStream3 = null;
        objectOutputStream2 = null;
        if (contentUriTriggers.size() == 0) {
            return null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            try {
                try {
                    objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
                } catch (java.lang.Throwable th) {
                    th = th;
                }
            } catch (java.io.IOException e) {
                e = e;
            }
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
            objectOutputStream2 = objectOutputStream2;
        }
        try {
            objectOutputStream.writeInt(contentUriTriggers.size());
            java.util.Iterator<androidx.work.ContentUriTriggers.Trigger> it = contentUriTriggers.getTriggers().iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext != 0) {
                    androidx.work.ContentUriTriggers.Trigger next = it.next();
                    objectOutputStream.writeUTF(next.getUri().toString());
                    objectOutputStream.writeBoolean(next.shouldTriggerForDescendants());
                } else {
                    try {
                        break;
                    } catch (java.io.IOException e3) {
                        e3.printStackTrace();
                    }
                }
            }
            objectOutputStream.close();
            byteArrayOutputStream.close();
            objectOutputStream2 = hasNext;
        } catch (java.io.IOException e4) {
            e = e4;
            objectOutputStream3 = objectOutputStream;
            e.printStackTrace();
            if (objectOutputStream3 != null) {
                try {
                    objectOutputStream3.close();
                } catch (java.io.IOException e5) {
                    e5.printStackTrace();
                }
            }
            byteArrayOutputStream.close();
            objectOutputStream2 = objectOutputStream3;
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (java.io.IOException e6) {
                    e6.printStackTrace();
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (java.io.IOException e7) {
                e7.printStackTrace();
                throw th;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.work.ContentUriTriggers byteArrayToContentUriTriggers(byte[] r6) {
        /*
            androidx.work.ContentUriTriggers r0 = new androidx.work.ContentUriTriggers
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            int r6 = r2.readInt()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
        L17:
            if (r6 <= 0) goto L2b
            java.lang.String r3 = r2.readUTF()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            boolean r4 = r2.readBoolean()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            r0.add(r3, r4)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r2.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r6 = move-exception
            r6.printStackTrace()
        L33:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L37:
            r6 = move-exception
            goto L41
        L39:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L58
        L3d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L41:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r6 = move-exception
            r6.printStackTrace()
        L4e:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r6 = move-exception
            r6.printStackTrace()
        L56:
            return r0
        L57:
            r6 = move-exception
        L58:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r0.printStackTrace()
        L62:
            r1.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(byte[]):androidx.work.ContentUriTriggers");
    }

    private WorkTypeConverters() {
    }
}
