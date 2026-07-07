package androidx.core.view;

/* loaded from: classes.dex */
public interface MenuProvider {
    void onCreateMenu(android.view.Menu menu, android.view.MenuInflater menuInflater);

    boolean onMenuItemSelected(android.view.MenuItem menuItem);
}
