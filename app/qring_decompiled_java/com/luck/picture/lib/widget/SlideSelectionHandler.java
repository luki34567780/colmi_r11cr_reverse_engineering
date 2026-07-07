package com.luck.picture.lib.widget;

/* loaded from: /tmp/dex/classes2.dex */
public class SlideSelectionHandler implements com.luck.picture.lib.widget.SlideSelectTouchListener.OnAdvancedSlideSelectListener {
    private java.util.HashSet<java.lang.Integer> mOriginalSelection;
    private final com.luck.picture.lib.widget.SlideSelectionHandler.ISelectionHandler mSelectionHandler;
    private com.luck.picture.lib.widget.SlideSelectionHandler.ISelectionStartFinishedListener mStartFinishedListener = null;

    public interface ISelectionHandler {
        void changeSelection(int i, int i2, boolean z, boolean z2);

        java.util.Set<java.lang.Integer> getSelection();
    }

    public interface ISelectionStartFinishedListener {
        void onSelectionFinished(int i);

        void onSelectionStarted(int i, boolean z);
    }

    public SlideSelectionHandler(com.luck.picture.lib.widget.SlideSelectionHandler.ISelectionHandler iSelectionHandler) {
        this.mSelectionHandler = iSelectionHandler;
    }

    public com.luck.picture.lib.widget.SlideSelectionHandler withStartFinishedListener(com.luck.picture.lib.widget.SlideSelectionHandler.ISelectionStartFinishedListener iSelectionStartFinishedListener) {
        this.mStartFinishedListener = iSelectionStartFinishedListener;
        return this;
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.OnAdvancedSlideSelectListener
    public void onSelectionStarted(int i) {
        this.mOriginalSelection = new java.util.HashSet<>();
        java.util.Set<java.lang.Integer> selection = this.mSelectionHandler.getSelection();
        if (selection != null) {
            this.mOriginalSelection.addAll(selection);
        }
        boolean contains = this.mOriginalSelection.contains(java.lang.Integer.valueOf(i));
        this.mSelectionHandler.changeSelection(i, i, !this.mOriginalSelection.contains(java.lang.Integer.valueOf(i)), true);
        com.luck.picture.lib.widget.SlideSelectionHandler.ISelectionStartFinishedListener iSelectionStartFinishedListener = this.mStartFinishedListener;
        if (iSelectionStartFinishedListener != null) {
            iSelectionStartFinishedListener.onSelectionStarted(i, contains);
        }
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.OnAdvancedSlideSelectListener
    public void onSelectionFinished(int i) {
        this.mOriginalSelection = null;
        com.luck.picture.lib.widget.SlideSelectionHandler.ISelectionStartFinishedListener iSelectionStartFinishedListener = this.mStartFinishedListener;
        if (iSelectionStartFinishedListener != null) {
            iSelectionStartFinishedListener.onSelectionFinished(i);
        }
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.OnSlideSelectListener
    public void onSelectChange(int i, int i2, boolean z) {
        while (i <= i2) {
            checkedChangeSelection(i, i, z != this.mOriginalSelection.contains(java.lang.Integer.valueOf(i)));
            i++;
        }
    }

    private void checkedChangeSelection(int i, int i2, boolean z) {
        this.mSelectionHandler.changeSelection(i, i2, z, false);
    }
}
