package net.sourceforge.pinyin4j;

/* loaded from: classes3.dex */
class PinyinRomanizationResource {
    private com.hp.hpl.sparta.Document pinyinMappingDoc;

    private void setPinyinMappingDoc(com.hp.hpl.sparta.Document document) {
        this.pinyinMappingDoc = document;
    }

    com.hp.hpl.sparta.Document getPinyinMappingDoc() {
        return this.pinyinMappingDoc;
    }

    private PinyinRomanizationResource() {
        initializeResource();
    }

    private void initializeResource() {
        try {
            setPinyinMappingDoc(com.hp.hpl.sparta.Parser.parse("", net.sourceforge.pinyin4j.ResourceHelper.getResourceInputStream("/pinyindb/pinyin_mapping.xml")));
        } catch (com.hp.hpl.sparta.ParseException e) {
            e.printStackTrace();
        } catch (java.io.FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (java.io.IOException e3) {
            e3.printStackTrace();
        }
    }

    static net.sourceforge.pinyin4j.PinyinRomanizationResource getInstance() {
        return net.sourceforge.pinyin4j.PinyinRomanizationResource.PinyinRomanizationSystemResourceHolder.theInstance;
    }

    private static class PinyinRomanizationSystemResourceHolder {
        static final net.sourceforge.pinyin4j.PinyinRomanizationResource theInstance = new net.sourceforge.pinyin4j.PinyinRomanizationResource();

        private PinyinRomanizationSystemResourceHolder() {
        }
    }
}
