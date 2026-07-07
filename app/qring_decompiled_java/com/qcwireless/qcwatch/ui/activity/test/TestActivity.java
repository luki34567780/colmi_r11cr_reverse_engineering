package com.qcwireless.qcwatch.ui.activity.test;

/* loaded from: /tmp/dex/classes2.dex */
public class TestActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.Button btn1;
    private android.widget.Button btn2;

    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.qcwireless.qcwatch.R.layout.activity_test);
        initView();
    }

    private void initView() {
        this.btn1 = (android.widget.Button) findViewById(com.qcwireless.qcwatch.R.id.btn_1);
        this.btn2 = (android.widget.Button) findViewById(com.qcwireless.qcwatch.R.id.btn_2);
        this.btn1.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.activity.test.TestActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "====");
            }
        });
        this.btn2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.activity.test.TestActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
            }
        });
    }

    protected void onResume() {
        super.onResume();
    }
}
