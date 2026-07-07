package com.airbnb.lottie.parser.moshi;

/* loaded from: classes.dex */
final class LinkedHashTreeMap<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.util.Comparator<java.lang.Comparable> NATURAL_ORDER = new java.util.Comparator<java.lang.Comparable>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.1
        @Override // java.util.Comparator
        public int compare(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    java.util.Comparator<? super K> comparator;
    private com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.EntrySet entrySet;
    final com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> header;
    private com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.KeySet keySet;
    int modCount;
    int size;
    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V>[] table;
    int threshold;

    private static int secondaryHash(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    LinkedHashTreeMap() {
        this(null);
    }

    LinkedHashTreeMap(java.util.Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.header = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<>();
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V>[] nodeArr = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node[16];
        this.table = nodeArr;
        this.threshold = (nodeArr.length / 2) + (nodeArr.length / 4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.value;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return findByObject(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        java.util.Objects.requireNonNull(k, "key == null");
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> find = find(k, true);
        V v2 = find.value;
        find.value = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        java.util.Arrays.fill(this.table, (java.lang.Object) null);
        this.size = 0;
        this.modCount++;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node = this.header;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.next;
        while (node2 != node) {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node2.next;
            node2.prev = null;
            node2.next = null;
            node2 = node3;
        }
        node.prev = node;
        node.next = node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.value;
        }
        return null;
    }

    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> find(K k, boolean z) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node;
        int i;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2;
        int compare;
        java.util.Comparator<? super K> comparator = this.comparator;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V>[] nodeArr = this.table;
        int secondaryHash = secondaryHash(k.hashCode());
        int length = (nodeArr.length - 1) & secondaryHash;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = nodeArr[length];
        if (node3 != null) {
            java.lang.Comparable comparable = comparator == NATURAL_ORDER ? (java.lang.Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    compare = comparable.compareTo(node3.key);
                } else {
                    compare = comparator.compare(k, node3.key);
                }
                if (compare == 0) {
                    return node3;
                }
                com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node4 = compare < 0 ? node3.left : node3.right;
                if (node4 == null) {
                    node = node3;
                    i = compare;
                    break;
                }
                node3 = node4;
            }
        } else {
            node = node3;
            i = 0;
        }
        if (!z) {
            return null;
        }
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node5 = this.header;
        if (node == null) {
            if (comparator == NATURAL_ORDER && !(k instanceof java.lang.Comparable)) {
                throw new java.lang.ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            node2 = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<>(node, k, secondaryHash, node5, node5.prev);
            nodeArr[length] = node2;
        } else {
            node2 = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<>(node, k, secondaryHash, node5, node5.prev);
            if (i < 0) {
                node.left = node2;
            } else {
                node.right = node2;
            }
            rebalance(node, true);
        }
        int i2 = this.size;
        this.size = i2 + 1;
        if (i2 > this.threshold) {
            doubleCapacity();
        }
        this.modCount++;
        return node2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> findByObject(java.lang.Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> findByEntry(java.util.Map.Entry<?, ?> entry) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject != null && equal(findByObject.value, entry.getValue())) {
            return findByObject;
        }
        return null;
    }

    private boolean equal(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    void removeInternal(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node, boolean z) {
        int i;
        if (z) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.prev = null;
            node.next = null;
        }
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.left;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.right;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node4 = node.parent;
        int i2 = 0;
        if (node2 != null && node3 != null) {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> last = node2.height > node3.height ? node2.last() : node3.first();
            removeInternal(last, false);
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node5 = node.left;
            if (node5 != null) {
                i = node5.height;
                last.left = node5;
                node5.parent = last;
                node.left = null;
            } else {
                i = 0;
            }
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node6 = node.right;
            if (node6 != null) {
                i2 = node6.height;
                last.right = node6;
                node6.parent = last;
                node.right = null;
            }
            last.height = java.lang.Math.max(i, i2) + 1;
            replaceInParent(node, last);
            return;
        }
        if (node2 != null) {
            replaceInParent(node, node2);
            node.left = null;
        } else if (node3 != null) {
            replaceInParent(node, node3);
            node.right = null;
        } else {
            replaceInParent(node, null);
        }
        rebalance(node4, false);
        this.size--;
        this.modCount++;
    }

    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> removeInternalByKey(java.lang.Object obj) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    private void replaceInParent(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node, com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.parent;
        node.parent = null;
        if (node2 != null) {
            node2.parent = node3;
        }
        if (node3 != null) {
            if (node3.left == node) {
                node3.left = node2;
                return;
            } else {
                node3.right = node2;
                return;
            }
        }
        int i = node.hash;
        this.table[i & (r0.length - 1)] = node2;
    }

    private void rebalance(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node, boolean z) {
        while (node != null) {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.left;
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.right;
            int i = node2 != null ? node2.height : 0;
            int i2 = node3 != null ? node3.height : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node4 = node3.left;
                com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node5 = node3.right;
                int i4 = (node4 != null ? node4.height : 0) - (node5 != null ? node5.height : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    rotateLeft(node);
                } else {
                    rotateRight(node3);
                    rotateLeft(node);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node6 = node2.left;
                com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node7 = node2.right;
                int i5 = (node6 != null ? node6.height : 0) - (node7 != null ? node7.height : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    rotateRight(node);
                } else {
                    rotateLeft(node2);
                    rotateRight(node);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                node.height = i + 1;
                if (z) {
                    return;
                }
            } else {
                node.height = java.lang.Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.parent;
        }
    }

    private void rotateLeft(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.left;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.right;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node4 = node3.left;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node5 = node3.right;
        node.right = node4;
        if (node4 != null) {
            node4.parent = node;
        }
        replaceInParent(node, node3);
        node3.left = node;
        node.parent = node3;
        node.height = java.lang.Math.max(node2 != null ? node2.height : 0, node4 != null ? node4.height : 0) + 1;
        node3.height = java.lang.Math.max(node.height, node5 != null ? node5.height : 0) + 1;
    }

    private void rotateRight(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.left;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.right;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node4 = node2.left;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node5 = node2.right;
        node.left = node5;
        if (node5 != null) {
            node5.parent = node;
        }
        replaceInParent(node, node2);
        node2.right = node;
        node.parent = node2;
        node.height = java.lang.Math.max(node3 != null ? node3.height : 0, node5 != null ? node5.height : 0) + 1;
        node2.height = java.lang.Math.max(node.height, node4 != null ? node4.height : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.EntrySet entrySet = this.entrySet;
        if (entrySet != null) {
            return entrySet;
        }
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.EntrySet entrySet2 = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.EntrySet();
        this.entrySet = entrySet2;
        return entrySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.KeySet keySet = this.keySet;
        if (keySet != null) {
            return keySet;
        }
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.KeySet keySet2 = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.KeySet();
        this.keySet = keySet2;
        return keySet2;
    }

    static final class Node<K, V> implements java.util.Map.Entry<K, V> {
        final int hash;
        int height;
        final K key;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> left;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> next;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> parent;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> prev;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> right;
        V value;

        Node() {
            this.key = null;
            this.hash = -1;
            this.prev = this;
            this.next = this;
        }

        Node(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node, K k, int i, com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2, com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3) {
            this.parent = node;
            this.key = k;
            this.hash = i;
            this.height = 1;
            this.next = node2;
            this.prev = node3;
            node3.next = this;
            node2.prev = this;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.value;
            this.value = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            K k = this.key;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.value;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.key;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.value;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        public java.lang.String toString() {
            return this.key + "=" + this.value;
        }

        public com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> first() {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node = this;
            for (com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = this.left; node2 != null; node2 = node2.left) {
                node = node2;
            }
            return node;
        }

        public com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> last() {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node = this;
            for (com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = this.right; node2 != null; node2 = node2.right) {
                node = node2;
            }
            return node;
        }
    }

    private void doubleCapacity() {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V>[] doubleCapacity = doubleCapacity(this.table);
        this.table = doubleCapacity;
        this.threshold = (doubleCapacity.length / 2) + (doubleCapacity.length / 4);
    }

    static <K, V> com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V>[] doubleCapacity(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V>[] nodeArr) {
        int length = nodeArr.length;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V>[] nodeArr2 = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node[length * 2];
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.AvlIterator avlIterator = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.AvlIterator();
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.AvlBuilder avlBuilder = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.AvlBuilder();
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.AvlBuilder avlBuilder2 = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.AvlBuilder();
        for (int i = 0; i < length; i++) {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node = nodeArr[i];
            if (node != null) {
                avlIterator.reset(node);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> next = avlIterator.next();
                    if (next == null) {
                        break;
                    }
                    if ((next.hash & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                avlBuilder.reset(i2);
                avlBuilder2.reset(i3);
                avlIterator.reset(node);
                while (true) {
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> next2 = avlIterator.next();
                    if (next2 == null) {
                        break;
                    }
                    if ((next2.hash & length) == 0) {
                        avlBuilder.add(next2);
                    } else {
                        avlBuilder2.add(next2);
                    }
                }
                nodeArr2[i] = i2 > 0 ? avlBuilder.root() : null;
                nodeArr2[i + length] = i3 > 0 ? avlBuilder2.root() : null;
            }
        }
        return nodeArr2;
    }

    static class AvlIterator<K, V> {
        private com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> stackTop;

        AvlIterator() {
        }

        void reset(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node) {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = null;
            while (node != null) {
                node.parent = node2;
                node2 = node;
                node = node.left;
            }
            this.stackTop = node2;
        }

        public com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> next() {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node = this.stackTop;
            if (node == null) {
                return null;
            }
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.parent;
            node.parent = null;
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.right;
            while (true) {
                com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node4 = node2;
                node2 = node3;
                if (node2 != null) {
                    node2.parent = node4;
                    node3 = node2.left;
                } else {
                    this.stackTop = node4;
                    return node;
                }
            }
        }
    }

    static final class AvlBuilder<K, V> {
        private int leavesSkipped;
        private int leavesToSkip;
        private int size;
        private com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> stack;

        AvlBuilder() {
        }

        void reset(int i) {
            this.leavesToSkip = ((java.lang.Integer.highestOneBit(i) * 2) - 1) - i;
            this.size = 0;
            this.leavesSkipped = 0;
            this.stack = null;
        }

        void add(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node) {
            node.right = null;
            node.parent = null;
            node.left = null;
            node.height = 1;
            int i = this.leavesToSkip;
            if (i > 0) {
                int i2 = this.size;
                if ((i2 & 1) == 0) {
                    this.size = i2 + 1;
                    this.leavesToSkip = i - 1;
                    this.leavesSkipped++;
                }
            }
            node.parent = this.stack;
            this.stack = node;
            int i3 = this.size + 1;
            this.size = i3;
            int i4 = this.leavesToSkip;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.size = i3 + 1;
                this.leavesToSkip = i4 - 1;
                this.leavesSkipped++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.size & i6) != i6) {
                    return;
                }
                int i7 = this.leavesSkipped;
                if (i7 == 0) {
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = this.stack;
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node2.parent;
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node4 = node3.parent;
                    node3.parent = node4.parent;
                    this.stack = node3;
                    node3.left = node4;
                    node3.right = node2;
                    node3.height = node2.height + 1;
                    node4.parent = node3;
                    node2.parent = node3;
                } else if (i7 == 1) {
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node5 = this.stack;
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node6 = node5.parent;
                    this.stack = node6;
                    node6.right = node5;
                    node6.height = node5.height + 1;
                    node5.parent = node6;
                    this.leavesSkipped = 0;
                } else if (i7 == 2) {
                    this.leavesSkipped = 0;
                }
                i5 *= 2;
            }
        }

        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> root() {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node = this.stack;
            if (node.parent == null) {
                return node;
            }
            throw new java.lang.IllegalStateException();
        }
    }

    abstract class LinkedTreeMapIterator<T> implements java.util.Iterator<T> {
        int expectedModCount;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> lastReturned = null;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> next;

        LinkedTreeMapIterator() {
            this.next = com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.header.next;
            this.expectedModCount = com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.modCount;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.next != com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.header;
        }

        final com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> nextNode() {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node = this.next;
            if (node == com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.header) {
                throw new java.util.NoSuchElementException();
            }
            if (com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.modCount != this.expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
            this.next = node.next;
            this.lastReturned = node;
            return node;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node = this.lastReturned;
            if (node == null) {
                throw new java.lang.IllegalStateException();
            }
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.removeInternal(node, true);
            this.lastReturned = null;
            this.expectedModCount = com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.modCount;
        }
    }

    final class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<java.util.Map.Entry<K, V>>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.EntrySet.1
                {
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap linkedHashTreeMap = com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public java.util.Map.Entry<K, V> next() {
                    return nextNode();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            return (obj instanceof java.util.Map.Entry) && com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.findByEntry((java.util.Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> findByEntry;
            if (!(obj instanceof java.util.Map.Entry) || (findByEntry = com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.findByEntry((java.util.Map.Entry) obj)) == null) {
                return false;
            }
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.clear();
        }
    }

    final class KeySet extends java.util.AbstractSet<K> {
        KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
            return new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<K>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.KeySet.1
                {
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap linkedHashTreeMap = com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return nextNode().key;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            return com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            return com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.removeInternalByKey(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.clear();
        }
    }

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
        return new java.util.LinkedHashMap(this);
    }
}
