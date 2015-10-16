package com.example.all_pc.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by All-PC on 16/10/2015.
 */
public class Inicio extends Activity {
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_menu);
        ActivarBot();


    }

    private void ActivarBot() {
        Button butEq = (Button) findViewById(R.id.bEquipo);
        Button butJu = (Button) findViewById(R.id.bJugadores);
        butEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Inicio.this, equipos.class));
            }
        });
        butJu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Inicio.this, jugadores.class));
            }
        });
        }

}

