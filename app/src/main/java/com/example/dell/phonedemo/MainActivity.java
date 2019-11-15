package com.example.dell.phonedemo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    BroadcastReceiver receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1=findViewById(R.id.typemessage);
        TextView textView2=findViewById(R.id.enginemessage);
        textView1.setText(Build.MODEL+" ,"+Build.VERSION.RELEASE);
        IntentFilter filter=new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        receiver=new EngineReceiver(textView2);
        registerReceiver(receiver,filter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }
}
