package com.example.all_pc.myapplication;

/**
 * Created by xEV on 31/10/2015.
 */
public class JUsuario {
    String user;
    String pass;
    String email;
    JEquipo equipo;

    public JUsuario (String user, String pass, String email, String nomEq) {
        this.user=user;
        this.pass=pass;
        this.email=email;
        this.equipo=new JEquipo(nomEq,this);
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public JEquipo getEquipo() {
        return equipo;
    }
}
