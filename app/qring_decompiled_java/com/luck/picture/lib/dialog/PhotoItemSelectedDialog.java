package com.luck.picture.lib.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class PhotoItemSelectedDialog extends androidx.fragment.app.DialogFragment implements android.view.View.OnClickListener {
    public static final int IMAGE_CAMERA = 0;
    public static final int VIDEO_CAMERA = 1;
    private boolean isCancel = true;
    private com.luck.picture.lib.dialog.PhotoItemSelectedDialog.OnDismissListener onDismissListener;
    private com.luck.picture.lib.interfaces.OnItemClickListener onItemClickListener;

    public interface OnDismissListener {
        void onDismiss(boolean z, android.content.DialogInterface dialogInterface);
    }

    public static com.luck.picture.lib.dialog.PhotoItemSelectedDialog newInstance() {
        return new com.luck.picture.lib.dialog.PhotoItemSelectedDialog();
    }

    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (getDialog() != null) {
            getDialog().requestWindowFeature(1);
            if (getDialog().getWindow() != null) {
                getDialog().getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        return layoutInflater.inflate(com.luck.picture.lib.R.layout.ps_dialog_camera_selected, viewGroup);
    }

    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.ps_tv_photo);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.ps_tv_video);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.ps_tv_cancel);
        textView2.setOnClickListener(this);
        textView.setOnClickListener(this);
        textView3.setOnClickListener(this);
    }

    public void onStart() {
        super.onStart();
        initDialogStyle();
    }

    private void initDialogStyle() {
        android.view.Window window;
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(com.luck.picture.lib.utils.DensityUtil.getRealScreenWidth(getContext()), -2);
        window.setGravity(80);
        window.setWindowAnimations(com.luck.picture.lib.R.style.PictureThemeDialogFragmentAnim);
    }

    public void setOnItemClickListener(com.luck.picture.lib.interfaces.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setOnDismissListener(com.luck.picture.lib.dialog.PhotoItemSelectedDialog.OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int id = view.getId();
        if (this.onItemClickListener != null) {
            if (id == com.luck.picture.lib.R.id.ps_tv_photo) {
                this.onItemClickListener.onItemClick(view, 0);
                this.isCancel = false;
            } else if (id == com.luck.picture.lib.R.id.ps_tv_video) {
                this.onItemClickListener.onItemClick(view, 1);
                this.isCancel = false;
            }
        }
        dismissAllowingStateLoss();
    }

    public void show(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        androidx.fragment.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add(this, str);
        beginTransaction.commitAllowingStateLoss();
    }

    public void onDismiss(android.content.DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.luck.picture.lib.dialog.PhotoItemSelectedDialog.OnDismissListener onDismissListener = this.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this.isCancel, dialogInterface);
        }
    }
}
