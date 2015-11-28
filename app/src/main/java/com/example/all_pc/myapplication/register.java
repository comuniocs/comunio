package com.example.all_pc.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity implements  View.OnClickListener{

    Button bRegister;
    EditText etname, etusername, etpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_register);
        etname =(EditText)findViewById(R.id.etname);
        etusername =(EditText)findViewById(R.id.etusername);
        etpassword =(EditText)findViewById(R.id.etpassword);
        bRegister = (Button) findViewById(R.id.bRegister);
        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bRegister:
                DataBaseManager manager = new DataBaseManager(this);
                long result = manager.insertar(etname.getText().toString(), etusername.getText().toString(), etpassword.getText().toString());
                     if (result == -1) {
                        showAlert("El usuario ya existe");}
                     else{
                         Toast.makeText(this, "Usuario creado correctamente", Toast.LENGTH_LONG).show();
                         startActivity(new Intent(this, Login.class));
                     }

                break;

        }
    }

    public void showAlert(String message){

        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage(message)
                .setPositiveButton("Continue..", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }

                })
                .setTitle("Message")
                .create();
        myAlert.show();
    }
}

