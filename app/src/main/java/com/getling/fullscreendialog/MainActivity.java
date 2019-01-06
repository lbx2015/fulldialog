package com.getling.fullscreendialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_show).setOnClickListener(this);
        findViewById(R.id.btn_show2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_show:
                DialogUtil.showDialog(this);
                break;
            case R.id.btn_show2:
                FullScreenDialog dialog = new FullScreenDialog(this);
                dialog.show();
                break;
            default:
                break;
        }
    }
}
