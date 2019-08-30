package com.programacionparadispositivosmoviles.actividad5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CambioAvion extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Usted Activado el Modo Avión.", Toast.LENGTH_SHORT).show();
    }
}
