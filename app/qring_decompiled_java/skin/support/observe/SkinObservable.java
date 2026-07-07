package skin.support.observe;

/* loaded from: classes3.dex */
public class SkinObservable {
    private final java.util.ArrayList<skin.support.observe.SkinObserver> observers = new java.util.ArrayList<>();

    public synchronized void addObserver(skin.support.observe.SkinObserver skinObserver) {
        if (skinObserver == null) {
            throw new java.lang.NullPointerException();
        }
        if (!this.observers.contains(skinObserver)) {
            this.observers.add(skinObserver);
        }
    }

    public synchronized void deleteObserver(skin.support.observe.SkinObserver skinObserver) {
        this.observers.remove(skinObserver);
    }

    public void notifyUpdateSkin() {
        notifyUpdateSkin(null);
    }

    public void notifyUpdateSkin(java.lang.Object obj) {
        skin.support.observe.SkinObserver[] skinObserverArr;
        synchronized (this) {
            java.util.ArrayList<skin.support.observe.SkinObserver> arrayList = this.observers;
            skinObserverArr = (skin.support.observe.SkinObserver[]) arrayList.toArray(new skin.support.observe.SkinObserver[arrayList.size()]);
        }
        for (int length = skinObserverArr.length - 1; length >= 0; length--) {
            skinObserverArr[length].updateSkin(this, obj);
        }
    }

    public synchronized void deleteObservers() {
        this.observers.clear();
    }

    public synchronized int countObservers() {
        return this.observers.size();
    }
}
