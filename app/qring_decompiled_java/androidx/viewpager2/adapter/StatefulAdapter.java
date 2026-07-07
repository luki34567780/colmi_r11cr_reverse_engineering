package androidx.viewpager2.adapter;

/* loaded from: classes.dex */
public interface StatefulAdapter {
    void restoreState(android.os.Parcelable parcelable);

    android.os.Parcelable saveState();
}
