package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class ExprFactory {
    static com.hp.hpl.sparta.xpath.BooleanExpr createExpr(com.hp.hpl.sparta.xpath.XPath xPath, com.hp.hpl.sparta.xpath.SimpleStreamTokenizer simpleStreamTokenizer) throws com.hp.hpl.sparta.xpath.XPathException, java.io.IOException {
        int parseInt;
        int parseInt2;
        int i = simpleStreamTokenizer.ttype;
        if (i == -3) {
            if (!simpleStreamTokenizer.sval.equals("text")) {
                throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "at beginning of expression", simpleStreamTokenizer, "text()");
            }
            if (simpleStreamTokenizer.nextToken() != 40) {
                throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "after text", simpleStreamTokenizer, "(");
            }
            if (simpleStreamTokenizer.nextToken() != 41) {
                throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "after text(", simpleStreamTokenizer, ")");
            }
            int nextToken = simpleStreamTokenizer.nextToken();
            if (nextToken != 33) {
                if (nextToken == 61) {
                    simpleStreamTokenizer.nextToken();
                    if (simpleStreamTokenizer.ttype != 34 && simpleStreamTokenizer.ttype != 39) {
                        throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "right hand side of equals", simpleStreamTokenizer, "quoted string");
                    }
                    java.lang.String str = simpleStreamTokenizer.sval;
                    simpleStreamTokenizer.nextToken();
                    return new com.hp.hpl.sparta.xpath.TextEqualsExpr(str);
                }
                return com.hp.hpl.sparta.xpath.TextExistsExpr.INSTANCE;
            }
            simpleStreamTokenizer.nextToken();
            if (simpleStreamTokenizer.ttype != 61) {
                throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "after !", simpleStreamTokenizer, "=");
            }
            simpleStreamTokenizer.nextToken();
            if (simpleStreamTokenizer.ttype != 34 && simpleStreamTokenizer.ttype != 39) {
                throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "right hand side of !=", simpleStreamTokenizer, "quoted string");
            }
            java.lang.String str2 = simpleStreamTokenizer.sval;
            simpleStreamTokenizer.nextToken();
            return new com.hp.hpl.sparta.xpath.TextNotEqualsExpr(str2);
        }
        if (i == -2) {
            int i2 = simpleStreamTokenizer.nval;
            simpleStreamTokenizer.nextToken();
            return new com.hp.hpl.sparta.xpath.PositionEqualsExpr(i2);
        }
        if (i != 64) {
            throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "at beginning of expression", simpleStreamTokenizer, "@, number, or text()");
        }
        if (simpleStreamTokenizer.nextToken() != -3) {
            throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "after @", simpleStreamTokenizer, "name");
        }
        java.lang.String str3 = simpleStreamTokenizer.sval;
        int nextToken2 = simpleStreamTokenizer.nextToken();
        if (nextToken2 != 33) {
            switch (nextToken2) {
                case 60:
                    simpleStreamTokenizer.nextToken();
                    if (simpleStreamTokenizer.ttype == 34 || simpleStreamTokenizer.ttype == 39) {
                        parseInt = java.lang.Integer.parseInt(simpleStreamTokenizer.sval);
                    } else if (simpleStreamTokenizer.ttype == -2) {
                        parseInt = simpleStreamTokenizer.nval;
                    } else {
                        throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "right hand side of less-than", simpleStreamTokenizer, "quoted string or number");
                    }
                    simpleStreamTokenizer.nextToken();
                    return new com.hp.hpl.sparta.xpath.AttrLessExpr(str3, parseInt);
                case 61:
                    simpleStreamTokenizer.nextToken();
                    if (simpleStreamTokenizer.ttype != 34 && simpleStreamTokenizer.ttype != 39) {
                        throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "right hand side of equals", simpleStreamTokenizer, "quoted string");
                    }
                    java.lang.String str4 = simpleStreamTokenizer.sval;
                    simpleStreamTokenizer.nextToken();
                    return new com.hp.hpl.sparta.xpath.AttrEqualsExpr(str3, str4);
                case 62:
                    simpleStreamTokenizer.nextToken();
                    if (simpleStreamTokenizer.ttype == 34 || simpleStreamTokenizer.ttype == 39) {
                        parseInt2 = java.lang.Integer.parseInt(simpleStreamTokenizer.sval);
                    } else if (simpleStreamTokenizer.ttype == -2) {
                        parseInt2 = simpleStreamTokenizer.nval;
                    } else {
                        throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "right hand side of greater-than", simpleStreamTokenizer, "quoted string or number");
                    }
                    simpleStreamTokenizer.nextToken();
                    return new com.hp.hpl.sparta.xpath.AttrGreaterExpr(str3, parseInt2);
                default:
                    return new com.hp.hpl.sparta.xpath.AttrExistsExpr(str3);
            }
        }
        simpleStreamTokenizer.nextToken();
        if (simpleStreamTokenizer.ttype != 61) {
            throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "after !", simpleStreamTokenizer, "=");
        }
        simpleStreamTokenizer.nextToken();
        if (simpleStreamTokenizer.ttype != 34 && simpleStreamTokenizer.ttype != 39) {
            throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "right hand side of !=", simpleStreamTokenizer, "quoted string");
        }
        java.lang.String str5 = simpleStreamTokenizer.sval;
        simpleStreamTokenizer.nextToken();
        return new com.hp.hpl.sparta.xpath.AttrNotEqualsExpr(str3, str5);
    }
}
