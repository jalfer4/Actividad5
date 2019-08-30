package com.programacionparadispositivosmoviles.actividad5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CambioAvion ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        this.ca=new CambioAvion();
        registerReceiver(this.ca,new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        super.onResume();    }
        @Override
            protected void onPause() {
        unregisterReceiver(ca);
        super.onPause();
    }
}
