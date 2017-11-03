package com.fukaimei.notification;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_notify_simple).setOnClickListener(this);
        findViewById(R.id.btn_notify_counter).setOnClickListener(this);
        findViewById(R.id.btn_notify_progress).setOnClickListener(this);
        findViewById(R.id.btn_notify_custom).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_notify_simple) {
            Intent intent = new Intent(this, NotifySimpleActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_notify_counter) {
            Intent intent = new Intent(this, NotifyCounterActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_notify_progress) {
            Intent intent = new Intent(this, NotifyProgressActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_notify_custom) {
            Intent intent = new Intent(this, NotifyCustomActivity.class);
            startActivity(intent);
        }
    }

}

