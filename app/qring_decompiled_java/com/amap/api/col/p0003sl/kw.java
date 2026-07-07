package com.amap.api.col.p0003sl;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.amap.api.col.p0003sl.Cif;
import com.amap.api.col.p0003sl.ks;
import com.amap.api.col.p0003sl.kz;
import com.amap.api.maps.AMapException;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import org.apache.http.conn.ConnectTimeoutException;

/* compiled from: HttpUrlUtil.java */
/* loaded from: classes.dex */
public final class kw {
    private static SoftReference<SSLContext> k;
    private static SoftReference<kx> t;
    private boolean a;
    private SSLContext b;
    private Proxy c;
    private String g;
    private ks.a h;
    private d i;
    private boolean l;
    private String m;
    private String n;
    private volatile boolean d = false;
    private long e = -1;
    private long f = 0;
    private String j = "";
    private boolean o = false;
    private boolean p = false;
    private String q = "";
    private String r = "";
    private String s = "";
    private f u = new f();

    public static void b() {
    }

    private void d(kz kzVar) throws id {
        this.i = new d((byte) 0);
        this.p = kzVar.isIPV6Request();
        this.c = kzVar.getProxy();
        this.h = kzVar.getUrlConnectionImpl();
        this.l = kzVar.isBinary();
        this.j = kzVar.parseSdkNameFromRequest();
        this.a = ik.a().b(kzVar.isHttps());
        String b2 = kzVar.getDegradeType().b() ? kzVar.b() : kzVar.a();
        this.m = b2;
        this.m = kv.a(b2, this.j);
        this.n = kzVar.getIPDNSName();
        if ("loc".equals(this.j)) {
            String a2 = kzVar.a();
            String b3 = kzVar.b();
            if (!TextUtils.isEmpty(a2)) {
                try {
                    this.r = new URL(a2).getHost();
                } catch (Exception unused) {
                }
            }
            if (TextUtils.isEmpty(b3)) {
                return;
            }
            try {
                if (!TextUtils.isEmpty(this.n)) {
                    this.q = this.n;
                } else {
                    this.q = new URL(b3).getHost();
                }
            } catch (Exception unused2) {
            }
        }
    }

    kw() {
        Cif.e();
        try {
            this.g = UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
        } catch (Throwable th) {
            jr.a(th, "ht", "ic");
        }
    }

    final void a() {
        this.d = true;
    }

    final void a(long j) {
        this.f = j;
    }

    final void b(long j) {
        this.e = j;
    }

    private static String a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (ks.e != null) {
            if (map != null) {
                map.putAll(ks.e);
            } else {
                map = ks.e;
            }
        }
        if (map == null || map.size() <= 0) {
            return str;
        }
        int indexOf = str.indexOf("?");
        if (indexOf >= 0) {
            HashMap hashMap = new HashMap();
            String substring = str.substring(indexOf);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                if (!substring.matches(".*[\\?\\&]" + URLEncoder.encode(key) + "=.*")) {
                    hashMap.put(key, value);
                }
            }
            map = hashMap;
        }
        if (map.size() == 0) {
            return str;
        }
        String a2 = a(map);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        if (indexOf >= 0) {
            if (!str.endsWith("?") && !str.endsWith("&")) {
                stringBuffer.append("&");
            }
        } else {
            stringBuffer.append("?");
        }
        if (a2 != null) {
            stringBuffer.append(a2);
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:6|7|8|(3:496|497|(15:499|11|13|14|(4:446|447|448|449)(1:16)|17|18|19|(1:21)(1:423)|22|(1:24)|25|(3:27|(2:38|39)|(2:30|31))(12:310|311|312|313|(6:320|321|(4:323|324|325|(1:327)(1:334))(1:394)|(2:329|330)(2:332|333)|331|314)|396|335|(1:337)(1:360)|338|(2:352|353)|(2:347|348)|(2:342|343))|36|37))|10|11|13|14|(0)(0)|17|18|19|(0)(0)|22|(0)|25|(0)(0)|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x02bc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x02bd, code lost:
    
        r5 = r0;
        r8 = null;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0316, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0317, code lost:
    
        r5 = r0;
        r8 = null;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x02f8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x02f9, code lost:
    
        r5 = r0;
        r8 = null;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x02da, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x02db, code lost:
    
        r5 = r0;
        r8 = null;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x02d0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x02d1, code lost:
    
        r5 = r0;
        r8 = null;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x02e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x02e5, code lost:
    
        r5 = r0;
        r8 = null;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x02ee, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x02ef, code lost:
    
        r5 = r0;
        r8 = null;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x030c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x030d, code lost:
    
        r5 = r0;
        r8 = null;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0302, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0303, code lost:
    
        r5 = r0;
        r8 = null;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x02c6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x02c7, code lost:
    
        r5 = r0;
        r8 = null;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x02b2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x02b3, code lost:
    
        r5 = r0;
        r8 = null;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0325, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0326, code lost:
    
        r7 = null;
        r5 = r0;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x035b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x035c, code lost:
    
        r7 = null;
        r5 = r0;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0349, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x034a, code lost:
    
        r7 = null;
        r5 = r0;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x033d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x033e, code lost:
    
        r7 = null;
        r5 = r0;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0337, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0338, code lost:
    
        r7 = null;
        r5 = r0;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0343, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0344, code lost:
    
        r7 = null;
        r5 = r0;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0355, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0356, code lost:
    
        r7 = null;
        r5 = r0;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x034f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0350, code lost:
    
        r7 = null;
        r5 = r0;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0331, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0332, code lost:
    
        r7 = null;
        r5 = r0;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x032b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x032c, code lost:
    
        r7 = null;
        r5 = r0;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0320, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0321, code lost:
    
        r7 = null;
        r5 = r0;
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0437 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x042c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x041b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x051e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0513 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0502 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0497 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0595 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0584 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x055f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0554 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0543 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0148 A[Catch: all -> 0x00cc, id -> 0x00cf, IOException -> 0x00d2, InterruptedIOException -> 0x00d5, SocketTimeoutException -> 0x00d8, SocketException -> 0x00db, UnknownHostException -> 0x00de, MalformedURLException -> 0x00e1, ConnectTimeoutException -> 0x00e4, SSLException -> 0x00e7, ConnectException -> 0x00ea, TRY_ENTER, TRY_LEAVE, TryCatch #55 {id -> 0x00cf, SocketTimeoutException -> 0x00d8, InterruptedIOException -> 0x00d5, ConnectException -> 0x00ea, MalformedURLException -> 0x00e1, SocketException -> 0x00db, UnknownHostException -> 0x00de, SSLException -> 0x00e7, ConnectTimeoutException -> 0x00e4, IOException -> 0x00d2, all -> 0x00cc, blocks: (B:449:0x00bc, B:27:0x0148), top: B:448:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x038e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0383 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0372 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0194 A[Catch: all -> 0x02b2, id -> 0x02bc, IOException -> 0x02c6, InterruptedIOException -> 0x02d0, SocketTimeoutException -> 0x02da, SocketException -> 0x02e4, UnknownHostException -> 0x02ee, MalformedURLException -> 0x02f8, ConnectTimeoutException -> 0x0302, SSLException -> 0x030c, ConnectException -> 0x0316, TRY_ENTER, TRY_LEAVE, TryCatch #53 {id -> 0x02bc, ConnectException -> 0x0316, MalformedURLException -> 0x02f8, SocketTimeoutException -> 0x02da, InterruptedIOException -> 0x02d0, SocketException -> 0x02e4, UnknownHostException -> 0x02ee, SSLException -> 0x030c, ConnectTimeoutException -> 0x0302, IOException -> 0x02c6, all -> 0x02b2, blocks: (B:18:0x0130, B:310:0x0194), top: B:17:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0475 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x046a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0459 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void a(com.amap.api.col.p0003sl.kz r20, com.amap.api.col.3sl.ku.a r21) {
        /*
            Method dump skipped, instructions count: 1558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.kw.a(com.amap.api.col.3sl.kz, com.amap.api.col.3sl.ku$a):void");
    }

    final Map<String, String> a(kz kzVar) throws id {
        int i;
        HttpURLConnection httpURLConnection;
        String headerFieldKey;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                d(kzVar);
                this.m = a(this.m, kzVar.getParams());
                httpURLConnection = a(kzVar, false, false).a;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Throwable th2) {
                        jr.a(th2, "hth", "mgr");
                    }
                }
                this.u.d();
                throw th;
            }
        } catch (id e2) {
            e = e2;
        } catch (ConnectException e3) {
            e = e3;
        } catch (SocketException e4) {
            e = e4;
        } catch (SocketTimeoutException e5) {
            e = e5;
        } catch (InterruptedIOException unused) {
        } catch (MalformedURLException unused2) {
        } catch (UnknownHostException unused3) {
        } catch (SSLException e6) {
            e = e6;
        } catch (ConnectTimeoutException e7) {
            e = e7;
        } catch (IOException unused4) {
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            this.u.b = SystemClock.elapsedRealtime();
            httpURLConnection.connect();
            this.u.a();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 400) {
                this.u.b(responseCode);
                this.u.a(10);
                id idVar = new id("http读取header失败");
                idVar.a(responseCode);
                throw idVar;
            }
            HashMap hashMap = new HashMap();
            for (i = 0; i < 50 && (headerFieldKey = httpURLConnection.getHeaderFieldKey(i)) != null; i++) {
                hashMap.put(headerFieldKey.toLowerCase(), httpURLConnection.getHeaderField(headerFieldKey));
            }
            this.u.a((la) null);
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable th4) {
                    jr.a(th4, "hth", "mgr");
                }
            }
            this.u.d();
            return hashMap;
        } catch (id e8) {
            e = e8;
            this.u.a(e.g());
            throw e;
        } catch (ConnectException e9) {
            e = e9;
            this.u.b(a(e));
            this.u.a(6);
            throw new id(AMapException.ERROR_CONNECTION);
        } catch (MalformedURLException unused5) {
            this.u.a(8);
            throw new id("url异常 - MalformedURLException");
        } catch (ConnectTimeoutException e10) {
            e = e10;
            e.printStackTrace();
            this.u.b(a(e));
            this.u.a(2);
            throw new id("IO 操作异常 - IOException");
        } catch (InterruptedIOException unused6) {
            this.u.b(7101);
            this.u.a(7);
            throw new id(AMapException.ERROR_UNKNOWN);
        } catch (SocketException e11) {
            e = e11;
            this.u.b(a(e));
            this.u.a(6);
            throw new id(AMapException.ERROR_SOCKET);
        } catch (SocketTimeoutException e12) {
            e = e12;
            this.u.b(a(e));
            this.u.a(2);
            throw new id("socket 连接超时 - SocketTimeoutException");
        } catch (UnknownHostException unused7) {
            this.u.a(9);
            throw new id("未知主机 - UnKnowHostException");
        } catch (SSLException e13) {
            e = e13;
            e.printStackTrace();
            this.u.b(a(e));
            this.u.a(4);
            throw new id("IO 操作异常 - IOException");
        } catch (IOException unused8) {
            this.u.a(7);
            throw new id("IO 操作异常 - IOException");
        } catch (Throwable th5) {
            th = th5;
            this.u.a(9);
            th.printStackTrace();
            throw new id(AMapException.ERROR_UNKNOWN);
        }
    }

    final la b(kz kzVar) throws id {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    d(kzVar);
                                    String a2 = a(this.m, kzVar.getParams());
                                    this.m = a2;
                                    la b2 = kv.b(a2, this.j);
                                    if (b2 == null) {
                                        b a3 = a(kzVar, false, true);
                                        httpURLConnection = a3.a;
                                        this.u.b = SystemClock.elapsedRealtime();
                                        httpURLConnection.connect();
                                        this.u.a();
                                        la a4 = a(a3, kzVar.isIgnoreGZip());
                                        this.u.a(a4);
                                        if (httpURLConnection != null) {
                                            try {
                                                httpURLConnection.disconnect();
                                            } catch (Throwable th) {
                                                jr.a(th, "ht", "mgr");
                                            }
                                        }
                                        this.u.d();
                                        return a4;
                                    }
                                    this.u.d();
                                    return b2;
                                } catch (ConnectException e2) {
                                    this.u.b(a(e2));
                                    this.u.a(6);
                                    throw new id(AMapException.ERROR_CONNECTION);
                                }
                            } catch (SSLException e3) {
                                e3.printStackTrace();
                                this.u.b(a(e3));
                                this.u.a(4);
                                throw new id("IO 操作异常 - IOException");
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                                this.u.a(9);
                                throw new id(AMapException.ERROR_UNKNOWN);
                            }
                        } catch (id e4) {
                            if (!e4.i() && e4.g() != 10) {
                                this.u.a(e4.f());
                            }
                            throw e4;
                        } catch (MalformedURLException unused) {
                            this.u.a(8);
                            throw new id("url异常 - MalformedURLException");
                        }
                    } catch (SocketTimeoutException e5) {
                        this.u.b(a(e5));
                        this.u.a(2);
                        throw new id("socket 连接超时 - SocketTimeoutException");
                    } catch (UnknownHostException unused2) {
                        this.u.a(9);
                        throw new id("未知主机 - UnKnowHostException");
                    }
                } catch (ConnectTimeoutException e6) {
                    e6.printStackTrace();
                    this.u.b(a(e6));
                    this.u.a(2);
                    throw new id("IO 操作异常 - IOException");
                } catch (IOException unused3) {
                    this.u.a(7);
                    throw new id("IO 操作异常 - IOException");
                }
            } catch (InterruptedIOException unused4) {
                this.u.b(7101);
                this.u.a(7);
                throw new id(AMapException.ERROR_UNKNOWN);
            } catch (SocketException e7) {
                this.u.b(a(e7));
                this.u.a(6);
                throw new id(AMapException.ERROR_SOCKET);
            }
        } catch (Throwable th3) {
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable th4) {
                    jr.a(th4, "ht", "mgr");
                }
            }
            this.u.d();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    final la c(kz kzVar) throws id {
        OutputStream outputStream;
        DataOutputStream dataOutputStream = 0;
        dataOutputStream = 0;
        try {
            try {
                d(kzVar);
                la b2 = kv.b(this.m, this.j);
                if (b2 == null) {
                    b a2 = a(kzVar, true, true);
                    HttpURLConnection httpURLConnection = a2.a;
                    try {
                        this.u.b = SystemClock.elapsedRealtime();
                        httpURLConnection.connect();
                        this.u.a();
                        byte[] entityBytes = kzVar.getEntityBytes();
                        if (entityBytes == null || entityBytes.length == 0) {
                            Map<String, String> params = kzVar.getParams();
                            if (ks.e != null) {
                                if (params != null) {
                                    params.putAll(ks.e);
                                } else {
                                    params = ks.e;
                                }
                            }
                            String a3 = a(params);
                            if (!TextUtils.isEmpty(a3)) {
                                entityBytes = ir.a(a3);
                            }
                        }
                        if (entityBytes != null && entityBytes.length > 0) {
                            try {
                                this.u.b = SystemClock.elapsedRealtime();
                                outputStream = httpURLConnection.getOutputStream();
                                try {
                                    DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                    try {
                                        dataOutputStream2.write(entityBytes);
                                        dataOutputStream2.close();
                                        if (outputStream != null) {
                                            outputStream.close();
                                        }
                                        this.u.b();
                                    } catch (Throwable th) {
                                        th = th;
                                        dataOutputStream = dataOutputStream2;
                                        if (dataOutputStream != 0) {
                                            dataOutputStream.close();
                                        }
                                        if (outputStream != null) {
                                            outputStream.close();
                                        }
                                        this.u.b();
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                outputStream = null;
                            }
                        }
                        la a4 = a(a2, kzVar.isIgnoreGZip());
                        this.u.a(a4);
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Throwable th4) {
                                jr.a(th4, "ht", "mPt");
                            }
                        }
                        this.u.d();
                        return a4;
                    } catch (id e2) {
                        e = e2;
                        if (!e.i() && e.g() != 10) {
                            this.u.a(e.g());
                        }
                        jr.a(e, "ht", "mPt");
                        throw e;
                    } catch (SocketTimeoutException e3) {
                        e = e3;
                        e.printStackTrace();
                        this.u.b(a(e));
                        this.u.a(2);
                        throw new id("socket 连接超时 - SocketTimeoutException");
                    } catch (UnknownHostException e4) {
                        e = e4;
                        e.printStackTrace();
                        this.u.a(5);
                        throw new id("未知主机 - UnKnowHostException");
                    } catch (ConnectTimeoutException e5) {
                        e = e5;
                        e.printStackTrace();
                        this.u.b(a(e));
                        this.u.a(2);
                        throw new id("IO 操作异常 - IOException");
                    } catch (InterruptedIOException unused) {
                        this.u.b(7101);
                        this.u.a(7);
                        throw new id(AMapException.ERROR_UNKNOWN);
                    } catch (ConnectException e6) {
                        e = e6;
                        e.printStackTrace();
                        this.u.b(a(e));
                        this.u.a(6);
                        throw new id(AMapException.ERROR_CONNECTION);
                    } catch (MalformedURLException e7) {
                        e = e7;
                        e.printStackTrace();
                        this.u.a(8);
                        throw new id("url异常 - MalformedURLException");
                    } catch (SocketException e8) {
                        e = e8;
                        e.printStackTrace();
                        this.u.b(a(e));
                        this.u.a(6);
                        throw new id(AMapException.ERROR_SOCKET);
                    } catch (SSLException e9) {
                        e = e9;
                        e.printStackTrace();
                        this.u.b(a(e));
                        this.u.a(4);
                        throw new id("IO 操作异常 - IOException");
                    } catch (IOException e10) {
                        e = e10;
                        e.printStackTrace();
                        this.u.a(7);
                        throw new id("IO 操作异常 - IOException");
                    } catch (Throwable th5) {
                        th = th5;
                        jr.a(th, "ht", "mPt");
                        this.u.a(9);
                        throw new id(AMapException.ERROR_UNKNOWN);
                    }
                }
                this.u.d();
                return b2;
            } catch (Throwable th6) {
                if (0 != 0) {
                    try {
                        dataOutputStream.disconnect();
                    } catch (Throwable th7) {
                        jr.a(th7, "ht", "mPt");
                    }
                }
                this.u.d();
                throw th6;
            }
        } catch (id e11) {
            e = e11;
        } catch (MalformedURLException e12) {
            e = e12;
        } catch (SocketTimeoutException e13) {
            e = e13;
        } catch (InterruptedIOException unused2) {
        } catch (ConnectException e14) {
            e = e14;
        } catch (SocketException e15) {
            e = e15;
        } catch (UnknownHostException e16) {
            e = e16;
        } catch (SSLException e17) {
            e = e17;
        } catch (ConnectTimeoutException e18) {
            e = e18;
        } catch (IOException e19) {
            e = e19;
        } catch (Throwable th8) {
            th = th8;
        }
    }

    /* compiled from: HttpUrlUtil.java */
    public static class b {
        public HttpURLConnection a;
        public int b = this.b;
        public int b = this.b;

        public b(HttpURLConnection httpURLConnection) {
            this.a = httpURLConnection;
        }
    }

    private kx c() {
        try {
            SoftReference<kx> softReference = t;
            if (softReference == null || softReference.get() == null) {
                t = new SoftReference<>(new kx(Cif.c, this.b));
            }
            kx kxVar = k != null ? t.get() : null;
            return kxVar == null ? new kx(Cif.c, this.b) : kxVar;
        } catch (Throwable th) {
            ju.c(th, "ht", "gsf");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014a A[Catch: all -> 0x01b8, TryCatch #1 {all -> 0x01b8, blocks: (B:33:0x00d3, B:36:0x00eb, B:38:0x00ee, B:40:0x00f2, B:42:0x00f8, B:45:0x0101, B:48:0x010d, B:50:0x0110, B:54:0x0116, B:55:0x0144, B:57:0x014a, B:59:0x0154, B:60:0x0165, B:62:0x018d, B:64:0x01ae, B:65:0x01b1, B:52:0x012c, B:70:0x0130, B:72:0x0133, B:76:0x0139, B:74:0x0140), top: B:32:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.amap.api.col.3sl.kw.b a(com.amap.api.col.p0003sl.kz r17, boolean r18, boolean r19) throws java.io.IOException, com.amap.api.col.p0003sl.id {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.kw.a(com.amap.api.col.3sl.kz, boolean, boolean):com.amap.api.col.3sl.kw$b");
    }

    private static String a(HttpURLConnection httpURLConnection) {
        List<String> list;
        if (httpURLConnection == null) {
            return "";
        }
        try {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null && (list = headerFields.get("gsid")) != null && list.size() > 0) {
                return list.get(0);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0220 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0215 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x017a A[Catch: all -> 0x01c7, IOException -> 0x01cd, SocketTimeoutException -> 0x01fb, ConnectTimeoutException -> 0x0200, TRY_ENTER, TryCatch #18 {SocketTimeoutException -> 0x01fb, ConnectTimeoutException -> 0x0200, IOException -> 0x01cd, all -> 0x01c7, blocks: (B:3:0x0009, B:5:0x001d, B:7:0x0027, B:9:0x002d, B:10:0x0034, B:32:0x00a8, B:148:0x017a, B:149:0x01c6), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8 A[Catch: all -> 0x01c7, IOException -> 0x01cd, SocketTimeoutException -> 0x01fb, ConnectTimeoutException -> 0x0200, TRY_ENTER, TRY_LEAVE, TryCatch #18 {SocketTimeoutException -> 0x01fb, ConnectTimeoutException -> 0x0200, IOException -> 0x01cd, all -> 0x01c7, blocks: (B:3:0x0009, B:5:0x001d, B:7:0x0027, B:9:0x002d, B:10:0x0034, B:32:0x00a8, B:148:0x017a, B:149:0x01c6), top: B:2:0x0009 }] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.amap.api.col.p0003sl.la a(com.amap.api.col.3sl.kw.b r17, boolean r18) throws com.amap.api.col.p0003sl.id, java.io.IOException {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.kw.a(com.amap.api.col.3sl.kw$b, boolean):com.amap.api.col.3sl.la");
    }

    private static String b(Map<String, List<String>> map) {
        try {
            List<String> list = map.get("sc");
            if (list == null || list.size() <= 0) {
                return "";
            }
            String str = list.get(0);
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (str.contains("#")) {
                String[] split = str.split("#");
                if (split.length <= 1) {
                    return "";
                }
                str = split[0];
            }
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "#"
            java.lang.String r1 = "lct"
            r2 = 1
            r3 = 0
            java.lang.String r4 = "sc"
            java.lang.Object r4 = r7.get(r4)     // Catch: java.lang.Throwable -> L62
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L62
            if (r4 == 0) goto L3c
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L62
            if (r5 <= 0) goto L3c
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L62
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L3c
            boolean r5 = r4.contains(r0)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L2a
        L28:
            r0 = 1
            goto L3d
        L2a:
            java.lang.String[] r0 = r4.split(r0)     // Catch: java.lang.Throwable -> L62
            int r4 = r0.length     // Catch: java.lang.Throwable -> L62
            if (r4 <= r2) goto L3c
            java.lang.String r4 = "1"
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L62
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L3c
            goto L28
        L3c:
            r0 = 0
        L3d:
            if (r0 != 0) goto L40
            return r3
        L40:
            if (r8 == 0) goto L63
            boolean r8 = r7.containsKey(r1)     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto L62
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Throwable -> L62
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L62
            int r8 = r7.size()     // Catch: java.lang.Throwable -> L62
            if (r8 <= 0) goto L62
            long r7 = com.amap.api.col.p0003sl.Cif.a(r7)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r6.j     // Catch: java.lang.Throwable -> L62
            boolean r7 = com.amap.api.col.p0003sl.Cif.a(r0, r7)     // Catch: java.lang.Throwable -> L62
            r2 = r7
            goto L63
        L62:
            r2 = 0
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.kw.a(java.util.Map, boolean):boolean");
    }

    private void a(Map<String, String> map, HttpURLConnection httpURLConnection, boolean z) {
        c g;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    httpURLConnection.addRequestProperty(str, map.get(str));
                }
            } catch (Throwable th) {
                jr.a(th, "ht", "adh");
                return;
            }
        }
        if (ks.d != null) {
            for (String str2 : ks.d.keySet()) {
                httpURLConnection.addRequestProperty(str2, ks.d.get(str2));
            }
        }
        String str3 = "";
        if (z && !this.m.contains("/v3/iasdkauth") && !TextUtils.isEmpty(this.j) && Cif.d(this.j)) {
            this.o = true;
            Cif.g f2 = Cif.f(this.j);
            httpURLConnection.addRequestProperty("lct", String.valueOf(f2.a));
            httpURLConnection.addRequestProperty("lct-info", f2.b);
            httpURLConnection.addRequestProperty("aks", Cif.c(Cif.a(this.j)));
            httpURLConnection.addRequestProperty("lct-args", a(Cif.b(this.j) != null ? Cif.b(this.j).b() : "", this.j));
        }
        httpURLConnection.addRequestProperty("csid", this.g);
        if (a(this.u.c.e)) {
            f fVar = this.u;
            if (!TextUtils.isEmpty(fVar.c.c)) {
                str3 = ij.b(ko.a(fVar.c.c.getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
                String str4 = fVar.c.c;
            }
            if (!TextUtils.isEmpty(str3)) {
                httpURLConnection.addRequestProperty("sip", str3);
            }
            if (Cif.j && (g = Cif.g()) != null) {
                httpURLConnection.addRequestProperty("nls", g.b());
                this.u.e = g;
            }
            a f3 = Cif.f();
            if (f3 != null) {
                httpURLConnection.addRequestProperty("nlf", f3.b());
                this.u.d = f3;
            }
        }
    }

    /* compiled from: HttpUrlUtil.java */
    private static class e implements HostnameVerifier {
        private String a;
        private String b;

        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            return true;
        }

        private e() {
        }

        /* synthetic */ e(byte b) {
            this();
        }

        public final void a(String str) {
            String[] split;
            if (!TextUtils.isEmpty(this.a) && str.contains(":") && (split = str.split(":")) != null && split.length > 0) {
                this.a = split[0];
            } else {
                this.a = str;
            }
        }

        public final void b(String str) {
            this.b = str;
        }

        public final String a() {
            return this.b;
        }
    }

    /* compiled from: HttpUrlUtil.java */
    private static class d {
        private Vector<e> a;
        private volatile e b;

        private d() {
            this.a = new Vector<>();
            this.b = new e((byte) 0);
        }

        /* synthetic */ d(byte b) {
            this();
        }

        public final e a(String str) {
            if (TextUtils.isEmpty(str)) {
                return this.b;
            }
            byte b = 0;
            for (int i = 0; i < this.a.size(); i++) {
                e eVar = this.a.get(i);
                if (eVar != null && eVar.a().equals(str)) {
                    return eVar;
                }
            }
            e eVar2 = new e(b);
            eVar2.b(str);
            this.a.add(eVar2);
            return eVar2;
        }
    }

    static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value == null) {
                value = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(URLEncoder.encode(key));
            sb.append("=");
            sb.append(URLEncoder.encode(value));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        if (this.l) {
            return true;
        }
        return (!TextUtils.isEmpty(this.n) && (this.n.contains("rest") || this.n.contains("apilocate"))) || b(str);
    }

    private static boolean b(String str) {
        return str.contains("rest") || str.contains("apilocate");
    }

    private static int a(Exception exc) {
        if (exc instanceof SSLHandshakeException) {
            return 4101;
        }
        if (exc instanceof SSLKeyException) {
            return 4102;
        }
        if (exc instanceof SSLProtocolException) {
            return 4103;
        }
        if (exc instanceof SSLPeerUnverifiedException) {
            return 4104;
        }
        if (exc instanceof ConnectException) {
            return 6101;
        }
        if (exc instanceof SocketException) {
            return 6102;
        }
        return exc instanceof ConnectTimeoutException ? com.amap.api.services.core.AMapException.CODE_AMAP_NEARBY_KEY_NOT_BIND : exc instanceof SocketTimeoutException ? 2102 : 0;
    }

    /* compiled from: HttpUrlUtil.java */
    class f {
        long a = 0;
        long b = 0;
        c c = new c();
        a d;
        c e;
        String f;
        URL g;

        f() {
        }

        public final void a(kz kzVar, URL url) {
            this.g = url;
            this.c.d = url.getPath();
            this.c.e = url.getHost();
            if (!TextUtils.isEmpty(kw.this.n) && kzVar.getDegradeType().b()) {
                c cVar = this.c;
                cVar.c = cVar.e.replace("[", "").replace("]", "");
                this.c.e = kw.this.n;
            }
            if (kzVar.getDegradeType().b()) {
                kzVar.setNon_degrade_final_Host(this.c.e);
            }
            if (kzVar.getDegradeType().d()) {
                this.f = kzVar.getNon_degrade_final_Host();
            }
        }

        public final void a() {
            this.c.h = SystemClock.elapsedRealtime() - this.b;
        }

        public final void b() {
            this.c.i = SystemClock.elapsedRealtime() - this.b;
        }

        public final void c() {
            this.c.j = SystemClock.elapsedRealtime() - this.b;
        }

        public final void a(la laVar) {
            c clone;
            try {
                this.c.f = SystemClock.elapsedRealtime() - this.a;
                if (laVar != null) {
                    laVar.f = this.c.b.c();
                }
                if (this.c.b.b() && this.c.f > WorkRequest.MIN_BACKOFF_MILLIS) {
                    Cif.a(false, this.c.e);
                }
                if (this.c.b.d()) {
                    Cif.a(false, this.f);
                }
                boolean a = kw.this.a(this.c.e);
                if (a) {
                    Cif.c(this.c);
                    Cif.a(true, this.d);
                    if (this.c.f > Cif.e && (clone = this.c.clone()) != null) {
                        clone.m = 1;
                        Cif.b(clone);
                        clone.toString();
                        kw.b();
                    }
                }
                Cif.a(this.g.toString(), this.c.b.c(), false, a);
                this.c.toString();
                kw.b();
            } catch (Throwable unused) {
            }
        }

        public final void a(int i) {
            "----errorcode-----".concat(String.valueOf(i));
            kw.b();
            try {
                this.c.f = SystemClock.elapsedRealtime() - this.a;
                this.c.m = i;
                if (this.c.b.e()) {
                    Cif.a(false, this.c.e);
                }
                boolean a = kw.this.a(this.c.e);
                if (a) {
                    if (kw.this.p && !TextUtils.isEmpty(kw.this.n) && this.c.b.b()) {
                        Cif.d();
                    }
                    if (this.c.b.c()) {
                        Cif.a(this.c.b.c(), this.c.e);
                    }
                    Cif.c(this.e);
                    Cif.a(false, this.d);
                    Cif.b(this.c);
                }
                Cif.a(this.g.toString(), this.c.b.c(), true, a);
                this.c.toString();
                kw.b();
            } catch (Throwable unused) {
            }
        }

        public final void b(int i) {
            this.c.n = i;
        }

        public final void a(long j) {
            this.c.l = new DecimalFormat("0.00").format(j / 1024.0f);
        }

        public final void d() {
            c clone = this.c.clone();
            if (this.c.f > Cif.e) {
                clone.m = 1;
            }
            Cif.a(clone);
        }
    }

    /* compiled from: HttpUrlUtil.java */
    public static class c implements Cloneable {
        public String a = "";
        public kz.b b = kz.b.FIRST_NONDEGRADE;
        public String c = "";
        public String d = "";
        public String e = "";
        public long f = 0;
        public long g = 0;
        public long h = 0;
        public long i = 0;
        public long j = 0;
        public String k = "-";
        public String l = "-";
        public int m = 0;
        public int n = 0;

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c clone() {
            try {
                return (c) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        protected final String b() {
            String str;
            String str2;
            if (TextUtils.isEmpty(this.c)) {
                str = "-#";
            } else {
                str = this.c + "#";
            }
            if (!TextUtils.isEmpty(this.d)) {
                str2 = str + this.d + "#";
            } else {
                str2 = str + "-#";
            }
            String b = ij.b(ko.a(((((str2 + this.b.a() + "#") + this.h + "#") + this.j + "#") + this.f).getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
            kw.b();
            return b;
        }

        public final String toString() {
            return "RequestInfo{csid='" + this.a + "', degradeType=" + this.b + ", serverIp='" + this.c + "', path='" + this.d + "', hostname='" + this.e + "', totalTime=" + this.f + ", DNSTime=" + this.g + ", connectionTime=" + this.h + ", writeTime=" + this.i + ", readTime=" + this.j + ", serverTime='" + this.k + "', datasize='" + this.l + "', errorcode=" + this.m + ", errorcodeSub=" + this.n + '}';
        }
    }

    /* compiled from: HttpUrlUtil.java */
    public static class a implements Cloneable, Comparable {
        public int a;
        public String b;
        public String c;
        public String d;
        public String e;
        public int f;
        public int g;
        public int h;
        public long i;
        public volatile AtomicInteger j = new AtomicInteger(1);

        public a(c cVar) {
            this.b = cVar.c;
            this.c = cVar.e;
            this.e = cVar.d;
            this.f = cVar.m;
            this.g = cVar.n;
            this.h = cVar.b.a();
            this.d = cVar.a;
            this.i = cVar.f;
            if (this.f == 10) {
                this.a = 0;
            }
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            try {
                return (a) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.a - ((a) obj).a;
        }

        public final String b() {
            String str;
            String str2;
            String str3;
            String str4;
            try {
                String str5 = this.f + "#";
                if (!TextUtils.isEmpty(this.e)) {
                    str = str5 + this.e + "#";
                } else {
                    str = str5 + "-#";
                }
                String str6 = (str + this.h + "#") + this.j + "#";
                if (!TextUtils.isEmpty(this.b)) {
                    str2 = str6 + this.b + "#";
                } else {
                    str2 = str6 + "-#";
                }
                if (this.f == 1) {
                    str3 = str2 + this.d + "#";
                } else {
                    str3 = str2 + "-#";
                }
                if (this.f == 1) {
                    str4 = str3 + this.i + "#";
                } else {
                    str4 = str3 + "-#";
                }
                String b = ij.b(ko.a(((str4 + this.c + "#") + this.g).getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
                kw.b();
                return b;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private static String a(String str, String str2) {
        return String.format("platform=Android&sdkversion=%s&product=%s&manufacture=%s&abitype=%s", str, str2, Build.MANUFACTURER, Cif.c != null ? ir.a(Cif.c) : "");
    }
}
