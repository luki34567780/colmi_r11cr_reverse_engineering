package com.iwown.awlog.util;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class LogPattern {
    private static final java.util.Locale LOCALE = java.util.Locale.US;
    private final int count;
    private final int length;

    protected abstract java.lang.String doApply(java.lang.StackTraceElement stackTraceElement);

    protected boolean isCallerNeeded() {
        return false;
    }

    public static class PlainLogPattern extends com.iwown.awlog.util.LogPattern {
        private final java.lang.String string;

        public PlainLogPattern(int i, int i2, java.lang.String str) {
            super(i, i2);
            this.string = str;
        }

        @Override // com.iwown.awlog.util.LogPattern
        protected java.lang.String doApply(java.lang.StackTraceElement stackTraceElement) {
            return this.string;
        }
    }

    public static class DateLogPattern extends com.iwown.awlog.util.LogPattern {
        private final java.text.SimpleDateFormat dateFormat;

        public DateLogPattern(int i, int i2, java.lang.String str) {
            super(i, i2);
            if (str != null) {
                this.dateFormat = new java.text.SimpleDateFormat(str, com.iwown.awlog.util.LogPattern.LOCALE);
            } else {
                this.dateFormat = new java.text.SimpleDateFormat("HH:mm:ss.SSS", com.iwown.awlog.util.LogPattern.LOCALE);
            }
        }

        @Override // com.iwown.awlog.util.LogPattern
        protected java.lang.String doApply(java.lang.StackTraceElement stackTraceElement) {
            return this.dateFormat.format(new java.util.Date());
        }
    }

    public static class CallerLogPattern extends com.iwown.awlog.util.LogPattern {
        private int callerCount;
        private int callerLength;

        @Override // com.iwown.awlog.util.LogPattern
        protected boolean isCallerNeeded() {
            return true;
        }

        public CallerLogPattern(int i, int i2, int i3, int i4) {
            super(i, i2);
            this.callerCount = i3;
            this.callerLength = i4;
        }

        @Override // com.iwown.awlog.util.LogPattern
        protected java.lang.String doApply(java.lang.StackTraceElement stackTraceElement) {
            java.lang.String format;
            if (stackTraceElement == null) {
                throw new java.lang.IllegalArgumentException("Caller not found");
            }
            if (stackTraceElement.getLineNumber() < 0) {
                format = java.lang.String.format("%s#%s", stackTraceElement.getClassName(), stackTraceElement.getMethodName());
            } else {
                java.lang.String stackTraceElement2 = stackTraceElement.toString();
                format = java.lang.String.format("%s.%s%s", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement2.substring(stackTraceElement2.lastIndexOf(40), stackTraceElement2.length()));
            }
            try {
                return com.iwown.awlog.util.Utils.shortenClassName(format, this.callerCount, this.callerLength);
            } catch (java.lang.Exception e) {
                return e.getMessage();
            }
        }
    }

    public static class ConcatenateLogPattern extends com.iwown.awlog.util.LogPattern {
        private final java.util.List<com.iwown.awlog.util.LogPattern> patternList;

        public ConcatenateLogPattern(int i, int i2, java.util.List<com.iwown.awlog.util.LogPattern> list) {
            super(i, i2);
            this.patternList = new java.util.ArrayList(list);
        }

        public void addPattern(com.iwown.awlog.util.LogPattern logPattern) {
            this.patternList.add(logPattern);
        }

        @Override // com.iwown.awlog.util.LogPattern
        protected java.lang.String doApply(java.lang.StackTraceElement stackTraceElement) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator<com.iwown.awlog.util.LogPattern> it = this.patternList.iterator();
            while (it.hasNext()) {
                sb.append(it.next().apply(stackTraceElement));
            }
            return sb.toString();
        }

        @Override // com.iwown.awlog.util.LogPattern
        protected boolean isCallerNeeded() {
            java.util.Iterator<com.iwown.awlog.util.LogPattern> it = this.patternList.iterator();
            while (it.hasNext()) {
                if (it.next().isCallerNeeded()) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class ThreadNameLogPattern extends com.iwown.awlog.util.LogPattern {
        public ThreadNameLogPattern(int i, int i2) {
            super(i, i2);
        }

        @Override // com.iwown.awlog.util.LogPattern
        protected java.lang.String doApply(java.lang.StackTraceElement stackTraceElement) {
            return java.lang.Thread.currentThread().getName();
        }
    }

    private LogPattern(int i, int i2) {
        this.count = i;
        this.length = i2;
    }

    public final java.lang.String apply(java.lang.StackTraceElement stackTraceElement) {
        return com.iwown.awlog.util.Utils.shorten(doApply(stackTraceElement), this.count, this.length);
    }

    public static com.iwown.awlog.util.LogPattern compile(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return new com.iwown.awlog.util.LogPattern.Compiler().compile(str);
        } catch (java.lang.Exception unused) {
            return new com.iwown.awlog.util.LogPattern.PlainLogPattern(0, 0, str);
        }
    }

    public static class Compiler {
        private java.lang.String patternString;
        private int position;
        private java.util.List<com.iwown.awlog.util.LogPattern.ConcatenateLogPattern> queue;
        public static final java.util.regex.Pattern PERCENT_PATTERN = java.util.regex.Pattern.compile("%%");
        public static final java.util.regex.Pattern NEWLINE_PATTERN = java.util.regex.Pattern.compile("%n");
        public static final java.util.regex.Pattern CALLER_PATTERN = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?caller(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?");
        public static final java.util.regex.Pattern DATE_PATTERN = java.util.regex.Pattern.compile("%date(\\{(.*?)\\})?");
        public static final java.util.regex.Pattern CONCATENATE_PATTERN = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?\\(");
        public static final java.util.regex.Pattern DATE_PATTERN_SHORT = java.util.regex.Pattern.compile("%d(\\{(.*?)\\})?");
        public static final java.util.regex.Pattern CALLER_PATTERN_SHORT = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?c(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?");
        public static final java.util.regex.Pattern THREAD_NAME_PATTERN = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?thread");
        public static final java.util.regex.Pattern THREAD_NAME_PATTERN_SHORT = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?t");

        public com.iwown.awlog.util.LogPattern compile(java.lang.String str) {
            if (str == null) {
                return null;
            }
            this.position = 0;
            this.patternString = str;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.queue = arrayList;
            arrayList.add(new com.iwown.awlog.util.LogPattern.ConcatenateLogPattern(0, 0, new java.util.ArrayList()));
            while (true) {
                int length = str.length();
                int i = this.position;
                if (length <= i) {
                    break;
                }
                int indexOf = str.indexOf("%", i);
                int indexOf2 = str.indexOf(")", this.position);
                if (this.queue.size() > 1 && indexOf2 < indexOf) {
                    java.util.List<com.iwown.awlog.util.LogPattern.ConcatenateLogPattern> list = this.queue;
                    list.get(list.size() - 1).addPattern(new com.iwown.awlog.util.LogPattern.PlainLogPattern(0, 0, str.substring(this.position, indexOf2)));
                    com.iwown.awlog.util.LogPattern.ConcatenateLogPattern concatenateLogPattern = this.queue.get(r3.size() - 2);
                    java.util.List<com.iwown.awlog.util.LogPattern.ConcatenateLogPattern> list2 = this.queue;
                    concatenateLogPattern.addPattern(list2.remove(list2.size() - 1));
                    this.position = indexOf2 + 1;
                }
                if (indexOf == -1) {
                    java.util.List<com.iwown.awlog.util.LogPattern.ConcatenateLogPattern> list3 = this.queue;
                    list3.get(list3.size() - 1).addPattern(new com.iwown.awlog.util.LogPattern.PlainLogPattern(0, 0, str.substring(this.position)));
                    break;
                }
                java.util.List<com.iwown.awlog.util.LogPattern.ConcatenateLogPattern> list4 = this.queue;
                list4.get(list4.size() - 1).addPattern(new com.iwown.awlog.util.LogPattern.PlainLogPattern(0, 0, str.substring(this.position, indexOf)));
                this.position = indexOf;
                parse();
            }
            return this.queue.get(0);
        }

        private void parse() {
            java.util.regex.Matcher findPattern = findPattern(PERCENT_PATTERN);
            if (findPattern != null) {
                java.util.List<com.iwown.awlog.util.LogPattern.ConcatenateLogPattern> list = this.queue;
                list.get(list.size() - 1).addPattern(new com.iwown.awlog.util.LogPattern.PlainLogPattern(0, 0, "%"));
                this.position = findPattern.end();
                return;
            }
            java.util.regex.Matcher findPattern2 = findPattern(NEWLINE_PATTERN);
            if (findPattern2 != null) {
                java.util.List<com.iwown.awlog.util.LogPattern.ConcatenateLogPattern> list2 = this.queue;
                list2.get(list2.size() - 1).addPattern(new com.iwown.awlog.util.LogPattern.PlainLogPattern(0, 0, "\n"));
                this.position = findPattern2.end();
                return;
            }
            java.util.regex.Matcher findPattern3 = findPattern(CALLER_PATTERN);
            if (findPattern3 != null || (findPattern3 = findPattern(CALLER_PATTERN_SHORT)) != null) {
                int parseInt = java.lang.Integer.parseInt(findPattern3.group(1) == null ? "0" : findPattern3.group(1));
                int parseInt2 = java.lang.Integer.parseInt(findPattern3.group(3) == null ? "0" : findPattern3.group(3));
                int parseInt3 = java.lang.Integer.parseInt(findPattern3.group(5) == null ? "0" : findPattern3.group(5));
                int parseInt4 = java.lang.Integer.parseInt(findPattern3.group(7) != null ? findPattern3.group(7) : "0");
                java.util.List<com.iwown.awlog.util.LogPattern.ConcatenateLogPattern> list3 = this.queue;
                list3.get(list3.size() - 1).addPattern(new com.iwown.awlog.util.LogPattern.CallerLogPattern(parseInt, parseInt2, parseInt3, parseInt4));
                this.position = findPattern3.end();
                return;
            }
            java.util.regex.Matcher findPattern4 = findPattern(DATE_PATTERN);
            if (findPattern4 != null || (findPattern4 = findPattern(DATE_PATTERN_SHORT)) != null) {
                java.lang.String group = findPattern4.group(2);
                java.util.List<com.iwown.awlog.util.LogPattern.ConcatenateLogPattern> list4 = this.queue;
                list4.get(list4.size() - 1).addPattern(new com.iwown.awlog.util.LogPattern.DateLogPattern(0, 0, group));
                this.position = findPattern4.end();
                return;
            }
            java.util.regex.Matcher findPattern5 = findPattern(THREAD_NAME_PATTERN);
            if (findPattern5 != null || (findPattern5 = findPattern(THREAD_NAME_PATTERN_SHORT)) != null) {
                int parseInt5 = java.lang.Integer.parseInt(findPattern5.group(1) == null ? "0" : findPattern5.group(1));
                int parseInt6 = java.lang.Integer.parseInt(findPattern5.group(3) != null ? findPattern5.group(3) : "0");
                java.util.List<com.iwown.awlog.util.LogPattern.ConcatenateLogPattern> list5 = this.queue;
                list5.get(list5.size() - 1).addPattern(new com.iwown.awlog.util.LogPattern.ThreadNameLogPattern(parseInt5, parseInt6));
                this.position = findPattern5.end();
                return;
            }
            java.util.regex.Matcher findPattern6 = findPattern(CONCATENATE_PATTERN);
            if (findPattern6 != null) {
                this.queue.add(new com.iwown.awlog.util.LogPattern.ConcatenateLogPattern(java.lang.Integer.parseInt(findPattern6.group(1) == null ? "0" : findPattern6.group(1)), java.lang.Integer.parseInt(findPattern6.group(3) != null ? findPattern6.group(3) : "0"), new java.util.ArrayList()));
                this.position = findPattern6.end();
                return;
            }
            throw new java.lang.IllegalArgumentException();
        }

        private java.util.regex.Matcher findPattern(java.util.regex.Pattern pattern) {
            java.util.regex.Matcher matcher = pattern.matcher(this.patternString);
            if (matcher.find(this.position) && matcher.start() == this.position) {
                return matcher;
            }
            return null;
        }
    }

    public static class Log2FileNamePattern {
        private java.util.Date date = new java.util.Date();
        private java.lang.String patternString;

        public Log2FileNamePattern(java.lang.String str) {
            this.patternString = str;
        }

        public java.lang.String doApply() {
            java.lang.String str = this.patternString;
            if (str == null) {
                return null;
            }
            java.util.regex.Matcher matcher = com.iwown.awlog.util.LogPattern.Compiler.DATE_PATTERN_SHORT.matcher(this.patternString);
            while (matcher.find()) {
                str = str.replace(matcher.group(0), new java.text.SimpleDateFormat(matcher.group(2), com.iwown.awlog.util.LogPattern.LOCALE).format(this.date));
            }
            return str;
        }
    }
}
