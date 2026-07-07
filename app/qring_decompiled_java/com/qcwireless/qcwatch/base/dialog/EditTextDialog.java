package com.qcwireless.qcwatch.base.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class EditTextDialog extends android.app.Dialog implements android.view.View.OnClickListener {
    private android.widget.TextView mBtnSave;
    private int mMaxLength;
    private android.widget.EditText mNameEdt;
    private java.lang.String mTextString;
    public android.view.Window mWindow;
    private com.qcwireless.qcwatch.base.dialog.EditTextDialog.OnTextConfirmListener onConfirmListener;
    private android.os.Handler uiHandler;

    public interface OnTextConfirmListener {
        void OnConfirm(java.lang.String text);
    }

    public boolean getDimEnabled() {
        return true;
    }

    public int getGravity() {
        return 81;
    }

    public int getHeight() {
        return -2;
    }

    public int getWidth() {
        return -1;
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_editview);
        android.view.Window window = getWindow();
        this.mWindow = window;
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.mWindow.setWindowAnimations(com.qcwireless.qcwatch.R.style.DialogAnimation);
        if (getDimEnabled()) {
            this.mWindow.addFlags(2);
        } else {
            this.mWindow.clearFlags(2);
        }
        android.view.WindowManager.LayoutParams attributes = this.mWindow.getAttributes();
        attributes.width = getWidth();
        attributes.height = getHeight();
        attributes.gravity = getGravity();
        onWindowAttributesChanged(attributes);
        initView();
    }

    private void initView() {
        this.mBtnSave = (android.widget.TextView) findViewById(com.qcwireless.qcwatch.R.id.btn_save);
        this.mNameEdt = (android.widget.EditText) findViewById(com.qcwireless.qcwatch.R.id.name_edt);
        this.mBtnSave.setOnClickListener(this);
        this.mNameEdt.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.mMaxLength)});
        this.mNameEdt.setText(this.mTextString);
        android.widget.EditText editText = this.mNameEdt;
        editText.setSelection(editText.length());
    }

    public EditTextDialog(android.content.Context context, java.lang.String text) {
        super(context);
        this.mMaxLength = 20;
        this.uiHandler = new android.os.Handler() { // from class: com.qcwireless.qcwatch.base.dialog.EditTextDialog.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.setFocusable(true);
                com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.setFocusableInTouchMode(true);
                com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.requestFocus();
                ((android.view.inputmethod.InputMethodManager) com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.getContext().getSystemService("input_method")).showSoftInput(com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt, 0);
            }
        };
        this.mTextString = (text == null || text.length() == 0) ? "hello" : text;
    }

    public EditTextDialog(android.content.Context context) {
        super(context);
        this.mMaxLength = 20;
        this.uiHandler = new android.os.Handler() { // from class: com.qcwireless.qcwatch.base.dialog.EditTextDialog.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.setFocusable(true);
                com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.setFocusableInTouchMode(true);
                com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.requestFocus();
                ((android.view.inputmethod.InputMethodManager) com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.getContext().getSystemService("input_method")).showSoftInput(com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt, 0);
            }
        };
    }

    public EditTextDialog(android.content.Context context, int themeResId) {
        super(context, themeResId);
        this.mMaxLength = 20;
        this.uiHandler = new android.os.Handler() { // from class: com.qcwireless.qcwatch.base.dialog.EditTextDialog.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.setFocusable(true);
                com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.setFocusableInTouchMode(true);
                com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.requestFocus();
                ((android.view.inputmethod.InputMethodManager) com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.getContext().getSystemService("input_method")).showSoftInput(com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt, 0);
            }
        };
    }

    protected EditTextDialog(android.content.Context context, boolean cancelable, android.content.DialogInterface.OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        this.mMaxLength = 20;
        this.uiHandler = new android.os.Handler() { // from class: com.qcwireless.qcwatch.base.dialog.EditTextDialog.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.setFocusable(true);
                com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.setFocusableInTouchMode(true);
                com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.requestFocus();
                ((android.view.inputmethod.InputMethodManager) com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt.getContext().getSystemService("input_method")).showSoftInput(com.qcwireless.qcwatch.base.dialog.EditTextDialog.this.mNameEdt, 0);
            }
        };
    }

    public void setOnTextConfirmListener(com.qcwireless.qcwatch.base.dialog.EditTextDialog.OnTextConfirmListener onConfirmListener) {
        this.onConfirmListener = onConfirmListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v) {
        if (v.getId() == 2131296443) {
            java.lang.String trim = this.mNameEdt.getText().toString().trim();
            this.mTextString = trim;
            java.lang.String replaceAll = trim.replaceAll("\n", "");
            this.mTextString = replaceAll;
            if (replaceAll.length() <= 0) {
                return;
            }
            com.qcwireless.qcwatch.base.dialog.EditTextDialog.OnTextConfirmListener onTextConfirmListener = this.onConfirmListener;
            if (onTextConfirmListener != null) {
                onTextConfirmListener.OnConfirm(this.mTextString);
            }
            dismiss();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        if (hasWindowFocus) {
            this.uiHandler.sendEmptyMessageDelayed(0, 500L);
        }
    }
}
