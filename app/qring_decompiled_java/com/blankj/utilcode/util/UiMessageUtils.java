package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class UiMessageUtils implements android.os.Handler.Callback {
    private static final boolean DEBUG = com.blankj.utilcode.util.UtilsBridge.isAppDebug();
    private static final java.lang.String TAG = "UiMessageUtils";
    private final java.util.List<com.blankj.utilcode.util.UiMessageUtils.UiMessageCallback> mDefensiveCopyList;
    private final android.os.Handler mHandler;
    private final android.util.SparseArray<java.util.List<com.blankj.utilcode.util.UiMessageUtils.UiMessageCallback>> mListenersSpecific;
    private final java.util.List<com.blankj.utilcode.util.UiMessageUtils.UiMessageCallback> mListenersUniversal;
    private final com.blankj.utilcode.util.UiMessageUtils.UiMessage mMessage;

    public interface UiMessageCallback {
        void handleMessage(com.blankj.utilcode.util.UiMessageUtils.UiMessage uiMessage);
    }

    public static com.blankj.utilcode.util.UiMessageUtils getInstance() {
        return com.blankj.utilcode.util.UiMessageUtils.LazyHolder.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private UiMessageUtils() {
        this.mHandler = new android.os.Handler(android.os.Looper.getMainLooper(), this);
        this.mMessage = new com.blankj.utilcode.util.UiMessageUtils.UiMessage(null);
        this.mListenersSpecific = new android.util.SparseArray<>();
        this.mListenersUniversal = new java.util.ArrayList();
        this.mDefensiveCopyList = new java.util.ArrayList();
    }

    public final void send(int i) {
        this.mHandler.sendEmptyMessage(i);
    }

    public final void send(int i, java.lang.Object obj) {
        java.util.Objects.requireNonNull(obj, "Argument 'obj' of type Object (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        android.os.Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(i, obj));
    }

    public void addListener(int i, com.blankj.utilcode.util.UiMessageUtils.UiMessageCallback uiMessageCallback) {
        java.util.Objects.requireNonNull(uiMessageCallback, "Argument 'listener' of type UiMessageCallback (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        synchronized (this.mListenersSpecific) {
            java.util.List<com.blankj.utilcode.util.UiMessageUtils.UiMessageCallback> list = this.mListenersSpecific.get(i);
            if (list == null) {
                list = new java.util.ArrayList<>();
                this.mListenersSpecific.put(i, list);
            }
            if (!list.contains(uiMessageCallback)) {
                list.add(uiMessageCallback);
            }
        }
    }

    public void addListener(com.blankj.utilcode.util.UiMessageUtils.UiMessageCallback uiMessageCallback) {
        java.util.Objects.requireNonNull(uiMessageCallback, "Argument 'listener' of type UiMessageCallback (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        synchronized (this.mListenersUniversal) {
            if (!this.mListenersUniversal.contains(uiMessageCallback)) {
                this.mListenersUniversal.add(uiMessageCallback);
            } else if (DEBUG) {
                android.util.Log.w(TAG, "Listener is already added. " + uiMessageCallback.toString());
            }
        }
    }

    public void removeListener(com.blankj.utilcode.util.UiMessageUtils.UiMessageCallback uiMessageCallback) {
        java.util.Objects.requireNonNull(uiMessageCallback, "Argument 'listener' of type UiMessageCallback (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        synchronized (this.mListenersUniversal) {
            if (DEBUG && !this.mListenersUniversal.contains(uiMessageCallback)) {
                android.util.Log.w(TAG, "Trying to remove a listener that is not registered. " + uiMessageCallback.toString());
            }
            this.mListenersUniversal.remove(uiMessageCallback);
        }
    }

    public void removeListeners(int i) {
        java.util.List<com.blankj.utilcode.util.UiMessageUtils.UiMessageCallback> list;
        if (DEBUG && ((list = this.mListenersSpecific.get(i)) == null || list.size() == 0)) {
            android.util.Log.w(TAG, "Trying to remove specific listeners that are not registered. ID " + i);
        }
        synchronized (this.mListenersSpecific) {
            this.mListenersSpecific.delete(i);
        }
    }

    public void removeListener(int i, com.blankj.utilcode.util.UiMessageUtils.UiMessageCallback uiMessageCallback) {
        java.util.Objects.requireNonNull(uiMessageCallback, "Argument 'listener' of type UiMessageCallback (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        synchronized (this.mListenersSpecific) {
            java.util.List<com.blankj.utilcode.util.UiMessageUtils.UiMessageCallback> list = this.mListenersSpecific.get(i);
            if (list != null && !list.isEmpty()) {
                if (DEBUG && !list.contains(uiMessageCallback)) {
                    android.util.Log.w(TAG, "Trying to remove specific listener that is not registered. ID " + i + ", " + uiMessageCallback);
                    return;
                }
                list.remove(uiMessageCallback);
            } else if (DEBUG) {
                android.util.Log.w(TAG, "Trying to remove specific listener that is not registered. ID " + i + ", " + uiMessageCallback);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        this.mMessage.setMessage(message);
        if (DEBUG) {
            logMessageHandling(this.mMessage);
        }
        synchronized (this.mListenersSpecific) {
            java.util.List<com.blankj.utilcode.util.UiMessageUtils.UiMessageCallback> list = this.mListenersSpecific.get(message.what);
            if (list != null) {
                if (list.size() == 0) {
                    this.mListenersSpecific.remove(message.what);
                } else {
                    this.mDefensiveCopyList.addAll(list);
                    java.util.Iterator<com.blankj.utilcode.util.UiMessageUtils.UiMessageCallback> it = this.mDefensiveCopyList.iterator();
                    while (it.hasNext()) {
                        it.next().handleMessage(this.mMessage);
                    }
                    this.mDefensiveCopyList.clear();
                }
            }
        }
        synchronized (this.mListenersUniversal) {
            if (this.mListenersUniversal.size() > 0) {
                this.mDefensiveCopyList.addAll(this.mListenersUniversal);
                java.util.Iterator<com.blankj.utilcode.util.UiMessageUtils.UiMessageCallback> it2 = this.mDefensiveCopyList.iterator();
                while (it2.hasNext()) {
                    it2.next().handleMessage(this.mMessage);
                }
                this.mDefensiveCopyList.clear();
            }
        }
        this.mMessage.setMessage(null);
        return true;
    }

    private void logMessageHandling(com.blankj.utilcode.util.UiMessageUtils.UiMessage uiMessage) {
        java.util.Objects.requireNonNull(uiMessage, "Argument 'msg' of type UiMessage (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.List<com.blankj.utilcode.util.UiMessageUtils.UiMessageCallback> list = this.mListenersSpecific.get(uiMessage.getId());
        if ((list == null || list.size() == 0) && this.mListenersUniversal.size() == 0) {
            android.util.Log.w(TAG, "Delivering FAILED for message ID " + uiMessage.getId() + ". No listeners. " + uiMessage.toString());
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Delivering message ID ");
        sb.append(uiMessage.getId());
        sb.append(", Specific listeners: ");
        if (list == null || list.size() == 0) {
            sb.append(0);
        } else {
            sb.append(list.size());
            sb.append(" [");
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i).getClass().getSimpleName());
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append("]");
        }
        sb.append(", Universal listeners: ");
        synchronized (this.mListenersUniversal) {
            if (this.mListenersUniversal.size() == 0) {
                sb.append(0);
            } else {
                sb.append(this.mListenersUniversal.size());
                sb.append(" [");
                for (int i2 = 0; i2 < this.mListenersUniversal.size(); i2++) {
                    sb.append(this.mListenersUniversal.get(i2).getClass().getSimpleName());
                    if (i2 < this.mListenersUniversal.size() - 1) {
                        sb.append(",");
                    }
                }
                sb.append("], Message: ");
            }
        }
        sb.append(uiMessage.toString());
        android.util.Log.v(TAG, sb.toString());
    }

    public static final class UiMessage {
        private android.os.Message mMessage;

        private UiMessage(android.os.Message message) {
            this.mMessage = message;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(android.os.Message message) {
            this.mMessage = message;
        }

        public int getId() {
            return this.mMessage.what;
        }

        public java.lang.Object getObject() {
            return this.mMessage.obj;
        }

        public java.lang.String toString() {
            return "{ id=" + getId() + ", obj=" + getObject() + " }";
        }
    }

    private static final class LazyHolder {
        private static final com.blankj.utilcode.util.UiMessageUtils INSTANCE = new com.blankj.utilcode.util.UiMessageUtils();

        private LazyHolder() {
        }
    }
}
