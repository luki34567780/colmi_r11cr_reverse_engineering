package com.qcwireless.qcwatch.ui.base.api;

/* loaded from: /tmp/dex/classes2.dex */
public class XDns implements okhttp3.Dns {
    private long timeout;

    public XDns(long timeout) {
        this.timeout = timeout;
    }

    public java.util.List<java.net.InetAddress> lookup(final java.lang.String hostname) throws java.net.UnknownHostException {
        if (hostname == null) {
            throw new java.net.UnknownHostException("hostname == null");
        }
        try {
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<java.util.List<java.net.InetAddress>>() { // from class: com.qcwireless.qcwatch.ui.base.api.XDns.1
                @Override // java.util.concurrent.Callable
                public java.util.List<java.net.InetAddress> call() throws java.lang.Exception {
                    return java.util.Arrays.asList(java.net.InetAddress.getAllByName(hostname));
                }
            });
            new java.lang.Thread(futureTask).start();
            return (java.util.List) futureTask.get(this.timeout, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.Exception e) {
            java.net.UnknownHostException unknownHostException = new java.net.UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
