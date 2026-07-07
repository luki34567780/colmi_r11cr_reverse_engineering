package com.amap.api.col.p0003sl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.amap.api.col.p0003sl.kz;
import com.amap.api.col.p0003sl.ly;
import com.amap.api.maps.AMapException;
import java.util.Map;

/* compiled from: NetManger.java */
/* loaded from: classes.dex */
public final class ky extends ks {
    private static ky f;
    private lz g;
    private Handler h;

    public static ky b() {
        return a(true);
    }

    public static ky c() {
        return a(false);
    }

    private static synchronized ky a(boolean z) {
        ky kyVar;
        synchronized (ky.class) {
            try {
                ky kyVar2 = f;
                if (kyVar2 == null) {
                    f = new ky(z);
                } else if (z && kyVar2.g == null) {
                    kyVar2.g = lz.a(new ly.a().a("amap-netmanger-threadpool-%d").b());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            kyVar = f;
        }
        return kyVar;
    }

    private ky(boolean z) {
        if (z) {
            try {
                this.g = lz.a(new ly.a().a("amap-netmanger-threadpool-%d").b());
            } catch (Throwable th) {
                ju.c(th, "NetManger", "NetManger1");
                th.printStackTrace();
                return;
            }
        }
        if (Looper.myLooper() == null) {
            this.h = new a(Looper.getMainLooper(), (byte) 0);
        } else {
            this.h = new a();
        }
    }

    @Deprecated
    public static Map<String, String> d(kz kzVar, boolean z) throws id {
        d(kzVar);
        kzVar.setHttpProtocol(z ? kz.c.HTTPS : kz.c.HTTP);
        Map<String, String> map = null;
        long j = 0;
        boolean z2 = false;
        if (b(kzVar)) {
            boolean c = c(kzVar);
            try {
                j = SystemClock.elapsedRealtime();
                map = a(kzVar, a(kzVar, c), c(kzVar, c));
            } catch (id e) {
                if (!c) {
                    throw e;
                }
                z2 = true;
            }
        }
        if (map != null) {
            return map;
        }
        try {
            return a(kzVar, b(kzVar, z2), a(kzVar, j));
        } catch (id e2) {
            throw e2;
        }
    }

    private static Map<String, String> a(kz kzVar, kz.b bVar, int i) throws id {
        try {
            d(kzVar);
            kzVar.setDegradeType(bVar);
            kzVar.setReal_max_timeout(i);
            return new kw().a(kzVar);
        } catch (id e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new id(AMapException.ERROR_UNKNOWN);
        }
    }

    @Deprecated
    private static la e(kz kzVar, boolean z) throws id {
        d(kzVar);
        kzVar.setHttpProtocol(z ? kz.c.HTTPS : kz.c.HTTP);
        la laVar = null;
        long j = 0;
        boolean z2 = false;
        if (b(kzVar)) {
            boolean c = c(kzVar);
            try {
                j = SystemClock.elapsedRealtime();
                laVar = b(kzVar, a(kzVar, c), c(kzVar, c));
            } catch (id e) {
                if (e.f() == 21 && kzVar.getDegradeAbility() == kz.a.INTERRUPT_IO) {
                    throw e;
                }
                if (!c) {
                    throw e;
                }
                z2 = true;
            }
        }
        if (laVar != null && laVar.a != null && laVar.a.length > 0) {
            return laVar;
        }
        try {
            return b(kzVar, b(kzVar, z2), a(kzVar, j));
        } catch (id e2) {
            throw e2;
        }
    }

    public static la e(kz kzVar) throws id {
        return e(kzVar, kzVar.isHttps());
    }

    private static la b(kz kzVar, kz.b bVar, int i) throws id {
        try {
            d(kzVar);
            kzVar.setDegradeType(bVar);
            kzVar.setReal_max_timeout(i);
            return new kw().b(kzVar);
        } catch (id e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new id(AMapException.ERROR_UNKNOWN);
        }
    }

    /* compiled from: NetManger.java */
    static class a extends Handler {
        /* synthetic */ a(Looper looper, byte b) {
            this(looper);
        }

        private a(Looper looper) {
            super(looper);
        }

        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i == 0) {
                    Object obj = message.obj;
                } else {
                    if (i != 1) {
                        return;
                    }
                    Object obj2 = message.obj;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
