package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLParser {
    static boolean DEBUG;
    private boolean hasComment = false;
    private int lineNumber;
    private java.lang.String mContent;

    enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public static androidx.constraintlayout.core.parser.CLObject parse(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        return new androidx.constraintlayout.core.parser.CLParser(str).parse();
    }

    public CLParser(java.lang.String str) {
        this.mContent = str;
    }

    public androidx.constraintlayout.core.parser.CLObject parse() throws androidx.constraintlayout.core.parser.CLParsingException {
        char c;
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        int i = 1;
        this.lineNumber = 1;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            char c2 = charArray[i2];
            if (c2 == '{') {
                break;
            }
            if (c2 == '\n') {
                this.lineNumber++;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new androidx.constraintlayout.core.parser.CLParsingException("invalid json content", null);
        }
        androidx.constraintlayout.core.parser.CLObject allocate = androidx.constraintlayout.core.parser.CLObject.allocate(charArray);
        allocate.setLine(this.lineNumber);
        allocate.setStart(i2);
        int i3 = i2 + 1;
        androidx.constraintlayout.core.parser.CLElement cLElement = allocate;
        while (i3 < length) {
            char c3 = charArray[i3];
            if (c3 == '\n') {
                this.lineNumber += i;
            }
            if (this.hasComment) {
                if (c3 == '\n') {
                    this.hasComment = z;
                } else {
                    continue;
                    i3++;
                    i = 1;
                    z = false;
                }
            }
            if (cLElement == null) {
                break;
            }
            if (cLElement.isDone()) {
                cLElement = getNextJsonElement(i3, c3, cLElement, charArray);
            } else if (cLElement instanceof androidx.constraintlayout.core.parser.CLObject) {
                if (c3 == '}') {
                    cLElement.setEnd(i3 - 1);
                } else {
                    cLElement = getNextJsonElement(i3, c3, cLElement, charArray);
                }
            } else if (!(cLElement instanceof androidx.constraintlayout.core.parser.CLArray)) {
                boolean z2 = cLElement instanceof androidx.constraintlayout.core.parser.CLString;
                if (z2) {
                    if (charArray[(int) cLElement.start] == c3) {
                        cLElement.setStart(cLElement.start + 1);
                        cLElement.setEnd(i3 - 1);
                    }
                } else {
                    if (cLElement instanceof androidx.constraintlayout.core.parser.CLToken) {
                        androidx.constraintlayout.core.parser.CLToken cLToken = (androidx.constraintlayout.core.parser.CLToken) cLElement;
                        if (!cLToken.validate(c3, i3)) {
                            throw new androidx.constraintlayout.core.parser.CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.lineNumber, cLToken);
                        }
                    }
                    if (((cLElement instanceof androidx.constraintlayout.core.parser.CLKey) || z2) && (((c = charArray[(int) cLElement.start]) == '\'' || c == '\"') && c == c3)) {
                        cLElement.setStart(cLElement.start + 1);
                        cLElement.setEnd(i3 - 1);
                    }
                    if (!cLElement.isDone() && (c3 == '}' || c3 == ']' || c3 == ',' || c3 == ' ' || c3 == '\t' || c3 == '\r' || c3 == '\n' || c3 == ':')) {
                        long j = i3 - 1;
                        cLElement.setEnd(j);
                        if (c3 == '}' || c3 == ']') {
                            cLElement = cLElement.getContainer();
                            cLElement.setEnd(j);
                            if (cLElement instanceof androidx.constraintlayout.core.parser.CLKey) {
                                cLElement = cLElement.getContainer();
                                cLElement.setEnd(j);
                            }
                        }
                    }
                }
            } else if (c3 == ']') {
                cLElement.setEnd(i3 - 1);
            } else {
                cLElement = getNextJsonElement(i3, c3, cLElement, charArray);
            }
            if (cLElement.isDone() && (!(cLElement instanceof androidx.constraintlayout.core.parser.CLKey) || ((androidx.constraintlayout.core.parser.CLKey) cLElement).mElements.size() > 0)) {
                cLElement = cLElement.getContainer();
            }
            i3++;
            i = 1;
            z = false;
        }
        while (cLElement != null && !cLElement.isDone()) {
            if (cLElement instanceof androidx.constraintlayout.core.parser.CLString) {
                cLElement.setStart(((int) cLElement.start) + 1);
            }
            cLElement.setEnd(length - 1);
            cLElement = cLElement.getContainer();
        }
        if (DEBUG) {
            java.lang.System.out.println("Root: " + allocate.toJSON());
        }
        return allocate;
    }

    private androidx.constraintlayout.core.parser.CLElement getNextJsonElement(int i, char c, androidx.constraintlayout.core.parser.CLElement cLElement, char[] cArr) throws androidx.constraintlayout.core.parser.CLParsingException {
        if (c == '\t' || c == '\n' || c == '\r' || c == ' ') {
            return cLElement;
        }
        if (c == '\"' || c == '\'') {
            if (cLElement instanceof androidx.constraintlayout.core.parser.CLObject) {
                return createElement(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.KEY, true, cArr);
            }
            return createElement(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.STRING, true, cArr);
        }
        if (c == '[') {
            return createElement(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.ARRAY, true, cArr);
        }
        if (c != ']') {
            if (c == '{') {
                return createElement(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.OBJECT, true, cArr);
            }
            if (c != '}') {
                switch (c) {
                    case '+':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        return createElement(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.NUMBER, true, cArr);
                    case ',':
                    case ':':
                        return cLElement;
                    case '/':
                        int i2 = i + 1;
                        if (i2 >= cArr.length || cArr[i2] != '/') {
                            return cLElement;
                        }
                        this.hasComment = true;
                        return cLElement;
                    default:
                        if ((cLElement instanceof androidx.constraintlayout.core.parser.CLContainer) && !(cLElement instanceof androidx.constraintlayout.core.parser.CLObject)) {
                            androidx.constraintlayout.core.parser.CLElement createElement = createElement(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.TOKEN, true, cArr);
                            androidx.constraintlayout.core.parser.CLToken cLToken = (androidx.constraintlayout.core.parser.CLToken) createElement;
                            if (cLToken.validate(c, i)) {
                                return createElement;
                            }
                            throw new androidx.constraintlayout.core.parser.CLParsingException("incorrect token <" + c + "> at line " + this.lineNumber, cLToken);
                        }
                        return createElement(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.KEY, true, cArr);
                }
            }
        }
        cLElement.setEnd(i - 1);
        androidx.constraintlayout.core.parser.CLElement container = cLElement.getContainer();
        container.setEnd(i);
        return container;
    }

    private androidx.constraintlayout.core.parser.CLElement createElement(androidx.constraintlayout.core.parser.CLElement cLElement, int i, androidx.constraintlayout.core.parser.CLParser.TYPE type, boolean z, char[] cArr) {
        androidx.constraintlayout.core.parser.CLElement allocate;
        if (DEBUG) {
            java.lang.System.out.println("CREATE " + type + " at " + cArr[i]);
        }
        switch (androidx.constraintlayout.core.parser.CLParser.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[type.ordinal()]) {
            case 1:
                allocate = androidx.constraintlayout.core.parser.CLObject.allocate(cArr);
                i++;
                break;
            case 2:
                allocate = androidx.constraintlayout.core.parser.CLArray.allocate(cArr);
                i++;
                break;
            case 3:
                allocate = androidx.constraintlayout.core.parser.CLString.allocate(cArr);
                break;
            case 4:
                allocate = androidx.constraintlayout.core.parser.CLNumber.allocate(cArr);
                break;
            case 5:
                allocate = androidx.constraintlayout.core.parser.CLKey.allocate(cArr);
                break;
            case 6:
                allocate = androidx.constraintlayout.core.parser.CLToken.allocate(cArr);
                break;
            default:
                allocate = null;
                break;
        }
        if (allocate == null) {
            return null;
        }
        allocate.setLine(this.lineNumber);
        if (z) {
            allocate.setStart(i);
        }
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLContainer) {
            allocate.setContainer((androidx.constraintlayout.core.parser.CLContainer) cLElement);
        }
        return allocate;
    }

    /* renamed from: androidx.constraintlayout.core.parser.CLParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.parser.CLParser.TYPE.values().length];
            $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE = iArr;
            try {
                iArr[androidx.constraintlayout.core.parser.CLParser.TYPE.OBJECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[androidx.constraintlayout.core.parser.CLParser.TYPE.ARRAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[androidx.constraintlayout.core.parser.CLParser.TYPE.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[androidx.constraintlayout.core.parser.CLParser.TYPE.NUMBER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[androidx.constraintlayout.core.parser.CLParser.TYPE.KEY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[androidx.constraintlayout.core.parser.CLParser.TYPE.TOKEN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }
}
