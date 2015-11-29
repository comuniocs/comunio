package com.example.all_pc.myapplication;

/**
 * Created by All-PC on 29/11/2015.
 */
public class Team {
    /*+ CN_ID + " integer primary key autoincrement,"
            + CN_NAME + " text not null,"
            + CN_USERNAME + " text not null unique,"
            + CN_PASSWORD + " text not null,"
            + CN_TEAM_USER + " text," //Su equipo
            + CN_POINTS + " integer," // Puntos del equipo
            + CN_MONEY + " integer );"; //Dinero del equipo*/
    private int id;
    private String usuario;
    private String contraseña;
    private String equipo_usuario;
    private int puntos;
    private int dinero;

    public Team(int id, String contraseña, String usuario, String equipo_usuario, int puntos, int dinero) {
        this.id = id;
        this.contraseña = contraseña;
        this.usuario = usuario;
        this.equipo_usuario = equipo_usuario;
        this.puntos = puntos;
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }

    public int getPuntos() {
        return puntos;
    }

    public String getEquipo_usuario() {
        return equipo_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getId() {
        return id;
    }
}
