package com.example.bcreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ContohBroadcast extends BroadcastReceiver {

    public ContohBroadcast(){}

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Action: "+intent.getAction(), Toast.LENGTH_LONG).show();
    }
}
