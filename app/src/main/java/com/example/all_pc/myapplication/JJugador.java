package com.example.all_pc.myapplication;

/**
 * Created by xEV on 31/10/2015.
 */
public class JJugador {
    String Jnombre;
    String Equipo_Or;
    JEquipo equipo;
    String Posicion;
    Double precio;
    int stat;
    boolean estado;

    public JJugador (String nombre,String nombreEq, JEquipo equip,String Pos, double prec, int stat,boolean estado ){
        this.Jnombre = nombre;
        this.Equipo_Or = nombreEq;
        this.equipo = equip;
        this.precio = prec;
        this.stat = stat;
        this.estado= estado;
        this.Posicion=Pos;
    }

    public int generar_puntos(){
        int valor = (int) Math.floor(Math.random()*(stat+4)-Math.random()*(stat+4));
        return valor;
    }
    // Get y Set
    public String getJnombre() {
        return Jnombre;
    }

    public String getEquipo_Or() {
        return Equipo_Or;
    }

    public void setEquipo_Or(String equipo_Or) {
        Equipo_Or = equipo_Or;
    }

    public JEquipo getEquipo() {
        return equipo;
    }

    public void setEquipo(JEquipo equipo) {
        this.equipo = equipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStat() {
        return stat;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
