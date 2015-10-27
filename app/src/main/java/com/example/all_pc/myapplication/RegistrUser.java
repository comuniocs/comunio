package com.example.all_pc.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by xEV on 27/10/2015.
 */
public class RegistrUser extends Activity {
    private String rUser;
    private String rpass;


    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_registro_usuario);
        BotonCancelar();
        BotonAceptar();
    }

    private void BotonCancelar() {
        //Carga el boton
        Button but = (Button) findViewById(R.id.bCanRegistr);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrUser.this, Login.class));
            }
        });
    }

    private void BotonAceptar() {
        //Carga el boton
        Button but = (Button) findViewById(R.id.bLogin);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rUser = ((EditText) findViewById(R.id.tUsuario)).getText().toString();
                rpass = ((EditText) findViewById(R.id.tPass)).getText().toString();
                // Si cumple el if pasara a la siguiente pantalla si no, saldra una notificacion advirtiendo que hay algun dato incorrecto
                if (rUser.length()>0 && rpass.length()>0) {

                    // Falta añadir la base de datos //

                    startActivity(new Intent(RegistrUser.this, Login.class));
                    Toast.makeText(getApplicationContext(), "Usuario registrado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Datos incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
