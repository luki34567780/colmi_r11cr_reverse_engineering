package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class CollectionUtils {

    public interface Closure<E> {
        void execute(int i, E e);
    }

    public interface Predicate<E> {
        boolean evaluate(E e);
    }

    public interface Transformer<E1, E2> {
        E2 transform(E1 e1);
    }

    private CollectionUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    @java.lang.SafeVarargs
    public static <E> java.util.List<E> newUnmodifiableList(E... eArr) {
        return java.util.Collections.unmodifiableList(newArrayList(eArr));
    }

    @java.lang.SafeVarargs
    public static <E> java.util.List<E> newUnmodifiableListNotNull(E... eArr) {
        return java.util.Collections.unmodifiableList(newArrayListNotNull(eArr));
    }

    @java.lang.SafeVarargs
    public static <E> java.util.ArrayList<E> newArrayList(E... eArr) {
        java.util.ArrayList<E> arrayList = new java.util.ArrayList<>();
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    @java.lang.SafeVarargs
    public static <E> java.util.ArrayList<E> newArrayListNotNull(E... eArr) {
        java.util.ArrayList<E> arrayList = new java.util.ArrayList<>();
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                if (e != null) {
                    arrayList.add(e);
                }
            }
        }
        return arrayList;
    }

    @java.lang.SafeVarargs
    public static <E> java.util.LinkedList<E> newLinkedList(E... eArr) {
        java.util.LinkedList<E> linkedList = new java.util.LinkedList<>();
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                linkedList.add(e);
            }
        }
        return linkedList;
    }

    @java.lang.SafeVarargs
    public static <E> java.util.LinkedList<E> newLinkedListNotNull(E... eArr) {
        java.util.LinkedList<E> linkedList = new java.util.LinkedList<>();
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                if (e != null) {
                    linkedList.add(e);
                }
            }
        }
        return linkedList;
    }

    @java.lang.SafeVarargs
    public static <E> java.util.HashSet<E> newHashSet(E... eArr) {
        java.util.HashSet<E> hashSet = new java.util.HashSet<>();
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                hashSet.add(e);
            }
        }
        return hashSet;
    }

    @java.lang.SafeVarargs
    public static <E> java.util.HashSet<E> newHashSetNotNull(E... eArr) {
        java.util.HashSet<E> hashSet = new java.util.HashSet<>();
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                if (e != null) {
                    hashSet.add(e);
                }
            }
        }
        return hashSet;
    }

    @java.lang.SafeVarargs
    public static <E> java.util.TreeSet<E> newTreeSet(java.util.Comparator<E> comparator, E... eArr) {
        java.util.TreeSet<E> treeSet = new java.util.TreeSet<>(comparator);
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                treeSet.add(e);
            }
        }
        return treeSet;
    }

    @java.lang.SafeVarargs
    public static <E> java.util.TreeSet<E> newTreeSetNotNull(java.util.Comparator<E> comparator, E... eArr) {
        java.util.TreeSet<E> treeSet = new java.util.TreeSet<>(comparator);
        if (eArr != null && eArr.length != 0) {
            for (E e : eArr) {
                if (e != null) {
                    treeSet.add(e);
                }
            }
        }
        return treeSet;
    }

    public static java.util.Collection newSynchronizedCollection(java.util.Collection collection) {
        return java.util.Collections.synchronizedCollection(collection);
    }

    public static java.util.Collection newUnmodifiableCollection(java.util.Collection collection) {
        return java.util.Collections.unmodifiableCollection(collection);
    }

    public static java.util.Collection union(java.util.Collection collection, java.util.Collection collection2) {
        if (collection == null && collection2 == null) {
            return new java.util.ArrayList();
        }
        if (collection == null) {
            return new java.util.ArrayList(collection2);
        }
        if (collection2 == null) {
            return new java.util.ArrayList(collection);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map<java.lang.Object, java.lang.Integer> cardinalityMap = getCardinalityMap(collection);
        java.util.Map<java.lang.Object, java.lang.Integer> cardinalityMap2 = getCardinalityMap(collection2);
        java.util.HashSet hashSet = new java.util.HashSet(collection);
        hashSet.addAll(collection2);
        for (java.lang.Object obj : hashSet) {
            int max = java.lang.Math.max(getFreq(obj, cardinalityMap), getFreq(obj, cardinalityMap2));
            for (int i = 0; i < max; i++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static java.util.Collection intersection(java.util.Collection collection, java.util.Collection collection2) {
        if (collection == null || collection2 == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map<java.lang.Object, java.lang.Integer> cardinalityMap = getCardinalityMap(collection);
        java.util.Map<java.lang.Object, java.lang.Integer> cardinalityMap2 = getCardinalityMap(collection2);
        java.util.HashSet hashSet = new java.util.HashSet(collection);
        hashSet.addAll(collection2);
        for (java.lang.Object obj : hashSet) {
            int min = java.lang.Math.min(getFreq(obj, cardinalityMap), getFreq(obj, cardinalityMap2));
            for (int i = 0; i < min; i++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static int getFreq(java.lang.Object obj, java.util.Map map) {
        java.lang.Integer num = (java.lang.Integer) map.get(obj);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static java.util.Collection disjunction(java.util.Collection collection, java.util.Collection collection2) {
        if (collection == null && collection2 == null) {
            return new java.util.ArrayList();
        }
        if (collection == null) {
            return new java.util.ArrayList(collection2);
        }
        if (collection2 == null) {
            return new java.util.ArrayList(collection);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map<java.lang.Object, java.lang.Integer> cardinalityMap = getCardinalityMap(collection);
        java.util.Map<java.lang.Object, java.lang.Integer> cardinalityMap2 = getCardinalityMap(collection2);
        java.util.HashSet hashSet = new java.util.HashSet(collection);
        hashSet.addAll(collection2);
        for (java.lang.Object obj : hashSet) {
            int max = java.lang.Math.max(getFreq(obj, cardinalityMap), getFreq(obj, cardinalityMap2)) - java.lang.Math.min(getFreq(obj, cardinalityMap), getFreq(obj, cardinalityMap2));
            for (int i = 0; i < max; i++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static java.util.Collection subtract(java.util.Collection collection, java.util.Collection collection2) {
        if (collection == null) {
            return new java.util.ArrayList();
        }
        if (collection2 == null) {
            return new java.util.ArrayList(collection);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        return arrayList;
    }

    public static boolean containsAny(java.util.Collection collection, java.util.Collection collection2) {
        if (collection != null && collection2 != null) {
            if (collection.size() < collection2.size()) {
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (collection2.contains(it.next())) {
                        return true;
                    }
                }
            } else {
                java.util.Iterator it2 = collection2.iterator();
                while (it2.hasNext()) {
                    if (collection.contains(it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static java.util.Map<java.lang.Object, java.lang.Integer> getCardinalityMap(java.util.Collection collection) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (collection == null) {
            return hashMap;
        }
        for (java.lang.Object obj : collection) {
            java.lang.Integer num = (java.lang.Integer) hashMap.get(obj);
            if (num == null) {
                hashMap.put(obj, 1);
            } else {
                hashMap.put(obj, java.lang.Integer.valueOf(num.intValue() + 1));
            }
        }
        return hashMap;
    }

    public static boolean isSubCollection(java.util.Collection collection, java.util.Collection collection2) {
        if (collection == null || collection2 == null) {
            return false;
        }
        java.util.Map<java.lang.Object, java.lang.Integer> cardinalityMap = getCardinalityMap(collection);
        java.util.Map<java.lang.Object, java.lang.Integer> cardinalityMap2 = getCardinalityMap(collection2);
        for (java.lang.Object obj : collection) {
            if (getFreq(obj, cardinalityMap) > getFreq(obj, cardinalityMap2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isProperSubCollection(java.util.Collection collection, java.util.Collection collection2) {
        return collection != null && collection2 != null && collection.size() < collection2.size() && isSubCollection(collection, collection2);
    }

    public static boolean isEqualCollection(java.util.Collection collection, java.util.Collection collection2) {
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        java.util.Map<java.lang.Object, java.lang.Integer> cardinalityMap = getCardinalityMap(collection);
        java.util.Map<java.lang.Object, java.lang.Integer> cardinalityMap2 = getCardinalityMap(collection2);
        if (cardinalityMap.size() != cardinalityMap2.size()) {
            return false;
        }
        for (java.lang.Object obj : cardinalityMap.keySet()) {
            if (getFreq(obj, cardinalityMap) != getFreq(obj, cardinalityMap2)) {
                return false;
            }
        }
        return true;
    }

    public static <E> int cardinality(E e, java.util.Collection<E> collection) {
        int i = 0;
        if (collection == null) {
            return 0;
        }
        if (collection instanceof java.util.Set) {
            return collection.contains(e) ? 1 : 0;
        }
        if (e == null) {
            java.util.Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    i++;
                }
            }
        } else {
            java.util.Iterator<E> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (e.equals(it2.next())) {
                    i++;
                }
            }
        }
        return i;
    }

    public static <E> E find(java.util.Collection<E> collection, com.blankj.utilcode.util.CollectionUtils.Predicate<E> predicate) {
        if (collection != null && predicate != null) {
            for (E e : collection) {
                if (predicate.evaluate(e)) {
                    return e;
                }
            }
        }
        return null;
    }

    public static <E> void forAllDo(java.util.Collection<E> collection, com.blankj.utilcode.util.CollectionUtils.Closure<E> closure) {
        if (collection == null || closure == null) {
            return;
        }
        int i = 0;
        java.util.Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            closure.execute(i, it.next());
            i++;
        }
    }

    public static <E> void filter(java.util.Collection<E> collection, com.blankj.utilcode.util.CollectionUtils.Predicate<E> predicate) {
        if (collection == null || predicate == null) {
            return;
        }
        java.util.Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            if (!predicate.evaluate(it.next())) {
                it.remove();
            }
        }
    }

    public static <E> java.util.Collection<E> select(java.util.Collection<E> collection, com.blankj.utilcode.util.CollectionUtils.Predicate<E> predicate) {
        if (collection == null || predicate == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        for (E e : collection) {
            if (predicate.evaluate(e)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    public static <E> java.util.Collection<E> selectRejected(java.util.Collection<E> collection, com.blankj.utilcode.util.CollectionUtils.Predicate<E> predicate) {
        if (collection == null || predicate == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        for (E e : collection) {
            if (!predicate.evaluate(e)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E1, E2> void transform(java.util.Collection<E1> collection, com.blankj.utilcode.util.CollectionUtils.Transformer<E1, E2> transformer) {
        if (collection == null || transformer == 0) {
            return;
        }
        if (collection instanceof java.util.List) {
            java.util.ListIterator listIterator = ((java.util.List) collection).listIterator();
            while (listIterator.hasNext()) {
                listIterator.set(transformer.transform(listIterator.next()));
            }
        } else {
            java.util.Collection<? extends E1> collect = collect(collection, transformer);
            collection.clear();
            collection.addAll(collect);
        }
    }

    public static <E1, E2> java.util.Collection<E2> collect(java.util.Collection<E1> collection, com.blankj.utilcode.util.CollectionUtils.Transformer<E1, E2> transformer) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (collection != null && transformer != null) {
            java.util.Iterator<E1> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(transformer.transform(it.next()));
            }
        }
        return arrayList;
    }

    public static <E> int countMatches(java.util.Collection<E> collection, com.blankj.utilcode.util.CollectionUtils.Predicate<E> predicate) {
        int i = 0;
        if (collection != null && predicate != null) {
            java.util.Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                if (predicate.evaluate(it.next())) {
                    i++;
                }
            }
        }
        return i;
    }

    public static <E> boolean exists(java.util.Collection<E> collection, com.blankj.utilcode.util.CollectionUtils.Predicate<E> predicate) {
        if (collection != null && predicate != null) {
            java.util.Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                if (predicate.evaluate(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <E> boolean addIgnoreNull(java.util.Collection<E> collection, E e) {
        return (collection == null || e == null || !collection.add(e)) ? false : true;
    }

    public static <E> void addAll(java.util.Collection<E> collection, java.util.Iterator<E> it) {
        if (collection == null || it == null) {
            return;
        }
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static <E> void addAll(java.util.Collection<E> collection, java.util.Enumeration<E> enumeration) {
        if (collection == null || enumeration == null) {
            return;
        }
        while (enumeration.hasMoreElements()) {
            collection.add(enumeration.nextElement());
        }
    }

    public static <E> void addAll(java.util.Collection<E> collection, E[] eArr) {
        if (collection == null || eArr == null || eArr.length == 0) {
            return;
        }
        collection.addAll(java.util.Arrays.asList(eArr));
    }

    public static java.lang.Object get(java.lang.Object obj, int i) {
        if (obj == null) {
            return null;
        }
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Index cannot be negative: " + i);
        }
        if (obj instanceof java.util.Map) {
            return get(((java.util.Map) obj).entrySet().iterator(), i);
        }
        if (obj instanceof java.util.List) {
            return ((java.util.List) obj).get(i);
        }
        if (obj instanceof java.lang.Object[]) {
            return ((java.lang.Object[]) obj)[i];
        }
        if (obj instanceof java.util.Iterator) {
            java.util.Iterator it = (java.util.Iterator) obj;
            while (it.hasNext()) {
                i--;
                if (i == -1) {
                    return it.next();
                }
                it.next();
            }
            throw new java.lang.IndexOutOfBoundsException("Entry does not exist: " + i);
        }
        if (obj instanceof java.util.Collection) {
            return get(((java.util.Collection) obj).iterator(), i);
        }
        if (obj instanceof java.util.Enumeration) {
            java.util.Enumeration enumeration = (java.util.Enumeration) obj;
            while (enumeration.hasMoreElements()) {
                i--;
                if (i == -1) {
                    return enumeration.nextElement();
                }
                enumeration.nextElement();
            }
            throw new java.lang.IndexOutOfBoundsException("Entry does not exist: " + i);
        }
        try {
            return java.lang.reflect.Array.get(obj, i);
        } catch (java.lang.IllegalArgumentException unused) {
            throw new java.lang.IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
        }
    }

    public static int size(java.lang.Object obj) {
        int i = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).size();
        }
        if (obj instanceof java.util.Collection) {
            return ((java.util.Collection) obj).size();
        }
        if (obj instanceof java.lang.Object[]) {
            return ((java.lang.Object[]) obj).length;
        }
        if (obj instanceof java.util.Iterator) {
            java.util.Iterator it = (java.util.Iterator) obj;
            while (it.hasNext()) {
                i++;
                it.next();
            }
        } else if (obj instanceof java.util.Enumeration) {
            java.util.Enumeration enumeration = (java.util.Enumeration) obj;
            while (enumeration.hasMoreElements()) {
                i++;
                enumeration.nextElement();
            }
        } else {
            try {
                return java.lang.reflect.Array.getLength(obj);
            } catch (java.lang.IllegalArgumentException unused) {
                throw new java.lang.IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
            }
        }
        return i;
    }

    public static boolean sizeIsEmpty(java.lang.Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof java.util.Collection) {
            return ((java.util.Collection) obj).isEmpty();
        }
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).isEmpty();
        }
        if (obj instanceof java.lang.Object[]) {
            return ((java.lang.Object[]) obj).length == 0;
        }
        if (obj instanceof java.util.Iterator) {
            return !((java.util.Iterator) obj).hasNext();
        }
        if (obj instanceof java.util.Enumeration) {
            return !((java.util.Enumeration) obj).hasMoreElements();
        }
        try {
            return java.lang.reflect.Array.getLength(obj) == 0;
        } catch (java.lang.IllegalArgumentException unused) {
            throw new java.lang.IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
        }
    }

    public static boolean isEmpty(java.util.Collection collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean isNotEmpty(java.util.Collection collection) {
        return !isEmpty(collection);
    }

    public static <E> java.util.Collection<E> retainAll(java.util.Collection<E> collection, java.util.Collection<E> collection2) {
        if (collection == null || collection2 == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (E e : collection) {
            if (collection2.contains(e)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    public static <E> java.util.Collection<E> removeAll(java.util.Collection<E> collection, java.util.Collection<E> collection2) {
        if (collection == null) {
            return new java.util.ArrayList();
        }
        if (collection2 == null) {
            return new java.util.ArrayList(collection);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (E e : collection) {
            if (!collection2.contains(e)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    public static <T> void shuffle(java.util.List<T> list) {
        java.util.Collections.shuffle(list);
    }

    public static java.lang.String toString(java.util.Collection collection) {
        return collection == null ? "null" : collection.toString();
    }
}
