package com.example.dell.phonedemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

/**
 * Created by DELL on 2019/11/15.
 */

public class EngineReceiver extends BroadcastReceiver{
    private TextView tengine;

    public EngineReceiver(TextView tengine) {
        super();
        this.tengine=tengine;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        int current=intent.getExtras().getInt("level");
        int total=intent.getExtras().getInt("scale");
        int percent=current*100/total;
        tengine.setText(percent+"%");
    }
}
