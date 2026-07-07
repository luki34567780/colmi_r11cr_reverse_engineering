package androidx.work.impl.utils;

/* loaded from: classes.dex */
public final class RawQueries {
    private RawQueries() {
    }

    public static androidx.sqlite.db.SupportSQLiteQuery workQueryToRawQuery(androidx.work.WorkQuery querySpec) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SELECT * FROM workspec");
        java.util.List<androidx.work.WorkInfo.State> states = querySpec.getStates();
        java.lang.String str = " AND";
        java.lang.String str2 = " WHERE";
        if (!states.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(states.size());
            java.util.Iterator<androidx.work.WorkInfo.State> it = states.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.Integer.valueOf(androidx.work.impl.model.WorkTypeConverters.stateToInt(it.next())));
            }
            sb.append(" WHERE");
            sb.append(" state IN (");
            bindings(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        java.util.List<java.util.UUID> ids = querySpec.getIds();
        if (!ids.isEmpty()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(ids.size());
            java.util.Iterator<java.util.UUID> it2 = ids.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().toString());
            }
            sb.append(str2);
            sb.append(" id IN (");
            bindings(sb, ids.size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        java.util.List<java.lang.String> tags = querySpec.getTags();
        if (tags.isEmpty()) {
            str = str2;
        } else {
            sb.append(str2);
            sb.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            bindings(sb, tags.size());
            sb.append("))");
            arrayList.addAll(tags);
        }
        java.util.List<java.lang.String> uniqueWorkNames = querySpec.getUniqueWorkNames();
        if (!uniqueWorkNames.isEmpty()) {
            sb.append(str);
            sb.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            bindings(sb, uniqueWorkNames.size());
            sb.append("))");
            arrayList.addAll(uniqueWorkNames);
        }
        sb.append(";");
        return new androidx.sqlite.db.SimpleSQLiteQuery(sb.toString(), arrayList.toArray());
    }

    private static void bindings(java.lang.StringBuilder builder, int count) {
        if (count <= 0) {
            return;
        }
        builder.append("?");
        for (int i = 1; i < count; i++) {
            builder.append(",");
            builder.append("?");
        }
    }
}
