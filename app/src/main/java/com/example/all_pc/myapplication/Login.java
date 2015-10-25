package com.example.all_pc.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by All-PC on 16/10/2015.
 */



public class Login extends Activity {

    protected String usuario;
    protected String pass;


    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_login);
        BotonLogin();


    }

    private void BotonLogin() {
        //Carga el boton
            Button but = (Button) findViewById(R.id.bLogin);
            but.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    usuario = ((EditText) findViewById(R.id.tUsuario)).getText().toString();
                    pass = ((EditText) findViewById(R.id.tPass)).getText().toString();
                    // Si cumple el if pasara a la siguiente pantalla si no, saldra una notificacion advirtiendo que hay algun dato incorrecto
                    if (usuario.equals("admin") && pass.equals("admin")) {
                        startActivity(new Intent(Login.this, Act_Principal.class));
                    } else {
                        Toast.makeText(getApplicationContext(), "Usuario/Contraseña incorrectos", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        //}
    }
}
