package com.example.bcreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ContohBroadcast contohBroadcast;
    private IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contohBroadcast = new ContohBroadcast();
        intentFilter = new IntentFilter("android.intent.action.BATTERY_LOW");

    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(contohBroadcast,intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(contohBroadcast);
    }
}
