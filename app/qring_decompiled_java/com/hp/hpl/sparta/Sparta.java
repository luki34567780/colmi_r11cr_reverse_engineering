package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
public class Sparta {
    private static com.hp.hpl.sparta.Sparta.Internment internment_ = new com.hp.hpl.sparta.Sparta.Internment() { // from class: com.hp.hpl.sparta.Sparta.1
        private final java.util.Hashtable strings_ = new java.util.Hashtable();

        @Override // com.hp.hpl.sparta.Sparta.Internment
        public java.lang.String intern(java.lang.String str) {
            java.lang.String str2 = (java.lang.String) this.strings_.get(str);
            if (str2 != null) {
                return str2;
            }
            this.strings_.put(str, str);
            return str;
        }
    };
    private static com.hp.hpl.sparta.Sparta.CacheFactory cacheFactory_ = new com.hp.hpl.sparta.Sparta.CacheFactory() { // from class: com.hp.hpl.sparta.Sparta.2
        @Override // com.hp.hpl.sparta.Sparta.CacheFactory
        public com.hp.hpl.sparta.Sparta.Cache create() {
            return new com.hp.hpl.sparta.Sparta.HashtableCache();
        }
    };

    public interface Cache {
        java.lang.Object get(java.lang.Object obj);

        java.lang.Object put(java.lang.Object obj, java.lang.Object obj2);

        int size();
    }

    public interface CacheFactory {
        com.hp.hpl.sparta.Sparta.Cache create();
    }

    public interface Internment {
        java.lang.String intern(java.lang.String str);
    }

    public static java.lang.String intern(java.lang.String str) {
        return internment_.intern(str);
    }

    public static void setInternment(com.hp.hpl.sparta.Sparta.Internment internment) {
        internment_ = internment;
    }

    static com.hp.hpl.sparta.Sparta.Cache newCache() {
        return cacheFactory_.create();
    }

    public static void setCacheFactory(com.hp.hpl.sparta.Sparta.CacheFactory cacheFactory) {
        cacheFactory_ = cacheFactory;
    }

    private static class HashtableCache extends java.util.Hashtable implements com.hp.hpl.sparta.Sparta.Cache {
        private HashtableCache() {
        }
    }
}
