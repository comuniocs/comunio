package com.example.all_pc.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener{

    Button bLogin;
    EditText etusername, etpassword;
    TextView registerLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_login);

        etusername = (EditText)findViewById(R.id.etusername);
        etpassword = (EditText)findViewById(R.id.etpassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        registerLink = (TextView) findViewById(R.id.bRegisterLink);
        bLogin.setOnClickListener(this);
        registerLink.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.bLogin:
            String username = etusername.getText().toString();
            String password = etpassword.getText().toString();
            String query = "SELECT * FROM users where username = '"+username+"' And password = '"+password+"'";
            DataBaseManager db = new DataBaseManager(this);
            if (db.Estaregistrado(query)){
                Toast.makeText(this, "Cargando...", Toast.LENGTH_LONG).show();

                startActivity(new Intent(this, Act_Principal.class));
            }else{
                showAlert("El usuario o contraseña no son correctos");
            }
            break;

        case R.id.bRegisterLink:
            startActivity(new Intent(this, register.class));
            break;


    }


    }

    public void showAlert(String message){

        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage(message)
            .setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            })
            .setTitle("")
            .create();
        myAlert.show();
    }
}
