package com.amap.api.col.p0003sl;

import com.amap.api.col.p0003sl.kp;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONObject;

/* compiled from: LogEngine.java */
/* loaded from: classes.dex */
public final class ld {
    public static void a(String str, byte[] bArr, lc lcVar) throws IOException, CertificateException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        kp kpVar;
        OutputStream outputStream = null;
        try {
            if (a(lcVar.a, str)) {
                return;
            }
            File file = new File(lcVar.a);
            if (!file.exists()) {
                file.mkdirs();
            }
            kpVar = kp.a(file, lcVar.b);
            try {
                kpVar.a(lcVar.d);
                byte[] b = lcVar.e.b(bArr);
                kp.a b2 = kpVar.b(str);
                outputStream = b2.a();
                outputStream.write(b);
                b2.b();
                kpVar.c();
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                try {
                    kpVar.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                }
                if (kpVar != null) {
                    try {
                        kpVar.close();
                        throw th;
                    } catch (Throwable th5) {
                        th5.printStackTrace();
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            kpVar = null;
        }
    }

    public static int a(lc lcVar) {
        kp kpVar = null;
        try {
            try {
                if (lcVar.f.d()) {
                    lcVar.f.a_(true);
                    kp a = kp.a(new File(lcVar.a), lcVar.b);
                    try {
                        ArrayList arrayList = new ArrayList();
                        byte[] a2 = a(a, lcVar, arrayList);
                        if (a2 != null && a2.length != 0) {
                            jt jtVar = new jt(a2, lcVar.c);
                            ks.a();
                            JSONObject jSONObject = new JSONObject(new String(ks.a(jtVar).a));
                            if (jSONObject.has("code") && jSONObject.getInt("code") == 1) {
                                if (lcVar.f != null && a2 != null) {
                                    lcVar.f.a_(a2.length);
                                }
                                if (lcVar.f.a() < Integer.MAX_VALUE) {
                                    a(a, arrayList);
                                } else {
                                    try {
                                        a.d();
                                    } catch (Throwable th) {
                                        ju.c(th, "ofm", "dlo");
                                    }
                                }
                                return a2.length;
                            }
                            kpVar = a;
                        }
                        try {
                            a.close();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                        return -1;
                    } catch (Throwable th3) {
                        th = th3;
                        kpVar = a;
                        try {
                            ju.c(th, "leg", "uts");
                            if (kpVar != null) {
                                kpVar.close();
                            }
                            return -1;
                        } catch (Throwable th4) {
                            if (kpVar != null) {
                                try {
                                    kpVar.close();
                                } catch (Throwable th5) {
                                    th5.printStackTrace();
                                }
                            }
                            throw th4;
                        }
                    }
                }
            } catch (Throwable th6) {
                th6.printStackTrace();
            }
        } catch (Throwable th7) {
            th = th7;
        }
        if (kpVar != null) {
            kpVar.close();
        }
        return -1;
    }

    private static byte[] a(kp kpVar, lc lcVar, List<String> list) {
        try {
            File b = kpVar.b();
            if (b != null && b.exists()) {
                int i = 0;
                for (String str : b.list()) {
                    if (str.contains(".0")) {
                        String str2 = str.split("\\.")[0];
                        byte[] a = lj.a(kpVar, str2);
                        i += a.length;
                        list.add(str2);
                        if (i > lcVar.f.a()) {
                            break;
                        }
                        lcVar.g.b(a);
                    }
                }
                if (i <= 0) {
                    return null;
                }
                return lcVar.g.a();
            }
        } catch (Throwable th) {
            ju.c(th, "leg", "gCo");
        }
        return new byte[0];
    }

    private static void a(kp kpVar, List<String> list) {
        if (kpVar != null) {
            try {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    kpVar.c(it.next());
                }
                kpVar.close();
            } catch (Throwable th) {
                ju.c(th, "ofm", "dlo");
            }
        }
    }

    private static boolean a(String str, String str2) {
        try {
            return new File(str, str2 + ".0").exists();
        } catch (Throwable th) {
            ju.c(th, "leg", "fet");
            return false;
        }
    }
}
