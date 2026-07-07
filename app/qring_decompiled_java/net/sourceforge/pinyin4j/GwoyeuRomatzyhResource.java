package net.sourceforge.pinyin4j;

/* loaded from: classes3.dex */
class GwoyeuRomatzyhResource {
    private com.hp.hpl.sparta.Document pinyinToGwoyeuMappingDoc;

    private void setPinyinToGwoyeuMappingDoc(com.hp.hpl.sparta.Document document) {
        this.pinyinToGwoyeuMappingDoc = document;
    }

    com.hp.hpl.sparta.Document getPinyinToGwoyeuMappingDoc() {
        return this.pinyinToGwoyeuMappingDoc;
    }

    private GwoyeuRomatzyhResource() {
        initializeResource();
    }

    private void initializeResource() {
        try {
            setPinyinToGwoyeuMappingDoc(com.hp.hpl.sparta.Parser.parse("", net.sourceforge.pinyin4j.ResourceHelper.getResourceInputStream("/pinyindb/pinyin_gwoyeu_mapping.xml")));
        } catch (com.hp.hpl.sparta.ParseException e) {
            e.printStackTrace();
        } catch (java.io.FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (java.io.IOException e3) {
            e3.printStackTrace();
        }
    }

    static net.sourceforge.pinyin4j.GwoyeuRomatzyhResource getInstance() {
        return net.sourceforge.pinyin4j.GwoyeuRomatzyhResource.GwoyeuRomatzyhSystemResourceHolder.theInstance;
    }

    private static class GwoyeuRomatzyhSystemResourceHolder {
        static final net.sourceforge.pinyin4j.GwoyeuRomatzyhResource theInstance = new net.sourceforge.pinyin4j.GwoyeuRomatzyhResource();

        private GwoyeuRomatzyhSystemResourceHolder() {
        }
    }
}
