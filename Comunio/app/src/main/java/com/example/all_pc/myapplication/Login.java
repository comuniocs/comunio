package com.example.all_pc.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by All-PC on 16/10/2015.
 */



public class Login extends Activity {

    protected EditText usuario;
    protected EditText pass;


    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_login);

        usuario = (EditText) findViewById(R.id.tUsuario);
        pass = (EditText) findViewById(R.id.tPass);

        entrarBot ();


    }

    private void entrarBot() {
        //if ((usuario.getText().equals("admin"))&& (pass.getText().equals("admin"))) {
            Button but = (Button) findViewById(R.id.bLogin);
            but.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Login.this, Inicio.class));
                }
            });
        //}
    }
}
