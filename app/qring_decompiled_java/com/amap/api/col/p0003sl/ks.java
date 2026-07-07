package com.amap.api.col.p0003sl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.kz;
import com.amap.api.maps.AMapException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

/* compiled from: BaseNetManager.java */
/* loaded from: classes.dex */
public class ks {
    public static int a = 0;
    public static String b = "";
    public static HashMap<String, String> c;
    public static HashMap<String, String> d;
    public static HashMap<String, String> e;
    private static ks f;

    /* compiled from: BaseNetManager.java */
    public interface a {
        URLConnection a();
    }

    public ks() {
        Cif.e();
    }

    public static ks a() {
        if (f == null) {
            f = new ks();
        }
        return f;
    }

    @Deprecated
    private static la d(kz kzVar, boolean z) throws id {
        d(kzVar);
        kzVar.setHttpProtocol(z ? kz.c.HTTPS : kz.c.HTTP);
        la laVar = null;
        long j = 0;
        boolean z2 = false;
        if (b(kzVar)) {
            boolean c2 = c(kzVar);
            try {
                j = SystemClock.elapsedRealtime();
                laVar = a(kzVar, a(kzVar, c2), c(kzVar, c2));
            } catch (id e2) {
                if (e2.f() == 21 && kzVar.getDegradeAbility() == kz.a.INTERRUPT_IO) {
                    throw e2;
                }
                if (!c2) {
                    throw e2;
                }
                z2 = true;
            }
        }
        if (laVar != null && laVar.a != null && laVar.a.length > 0) {
            return laVar;
        }
        try {
            return a(kzVar, b(kzVar, z2), a(kzVar, j));
        } catch (id e3) {
            throw e3;
        }
    }

    public static la a(kz kzVar) throws id {
        return d(kzVar, kzVar.isHttps());
    }

    private static la a(kz kzVar, kz.b bVar, int i) throws id {
        try {
            d(kzVar);
            kzVar.setDegradeType(bVar);
            kzVar.setReal_max_timeout(i);
            return new kw().c(kzVar);
        } catch (id e2) {
            throw e2;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new id(AMapException.ERROR_UNKNOWN);
        }
    }

    protected static kz.b a(kz kzVar, boolean z) {
        if (kzVar.getDegradeAbility() == kz.a.FIX) {
            return kz.b.FIX_NONDEGRADE;
        }
        if (kzVar.getDegradeAbility() == kz.a.SINGLE) {
            return kz.b.NEVER_GRADE;
        }
        return z ? kz.b.FIRST_NONDEGRADE : kz.b.NEVER_GRADE;
    }

    protected static kz.b b(kz kzVar, boolean z) {
        return kzVar.getDegradeAbility() == kz.a.FIX ? z ? kz.b.FIX_DEGRADE_BYERROR : kz.b.FIX_DEGRADE_ONLY : z ? kz.b.DEGRADE_BYERROR : kz.b.DEGRADE_ONLY;
    }

    protected static boolean b(kz kzVar) throws id {
        d(kzVar);
        try {
            String ipv6url = kzVar.getIPV6URL();
            if (TextUtils.isEmpty(ipv6url)) {
                return false;
            }
            String host = new URL(ipv6url).getHost();
            if (!TextUtils.isEmpty(kzVar.getIPDNSName())) {
                host = kzVar.getIPDNSName();
            }
            return Cif.g(host);
        } catch (Throwable unused) {
            return true;
        }
    }

    protected static boolean c(kz kzVar) throws id {
        d(kzVar);
        if (!b(kzVar)) {
            return true;
        }
        if (kzVar.getURL().equals(kzVar.getIPV6URL()) || kzVar.getDegradeAbility() == kz.a.SINGLE) {
            return false;
        }
        return Cif.h;
    }

    protected static int c(kz kzVar, boolean z) {
        try {
            d(kzVar);
            int conntectionTimeout = kzVar.getConntectionTimeout();
            int i = Cif.e;
            if (kzVar.getDegradeAbility() != kz.a.FIX) {
                if (kzVar.getDegradeAbility() != kz.a.SINGLE && conntectionTimeout >= i && z) {
                    return i;
                }
            }
            return conntectionTimeout;
        } catch (Throwable unused) {
            return 5000;
        }
    }

    protected static int a(kz kzVar, long j) {
        try {
            d(kzVar);
            long j2 = 0;
            if (j != 0) {
                j2 = SystemClock.elapsedRealtime() - j;
            }
            int conntectionTimeout = kzVar.getConntectionTimeout();
            if (kzVar.getDegradeAbility() != kz.a.FIX && kzVar.getDegradeAbility() != kz.a.SINGLE) {
                long j3 = conntectionTimeout;
                if (j2 < j3) {
                    long j4 = j3 - j2;
                    if (j4 >= 1000) {
                        return (int) j4;
                    }
                }
                return Math.min(1000, kzVar.getConntectionTimeout());
            }
            return conntectionTimeout;
        } catch (Throwable unused) {
            return 5000;
        }
    }

    protected static void d(kz kzVar) throws id {
        if (kzVar == null) {
            throw new id("requeust is null");
        }
        if (kzVar.getURL() == null || "".equals(kzVar.getURL())) {
            throw new id("request url is empty");
        }
    }
}
