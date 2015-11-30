package com.example.all_pc.myapplication;

import java.io.Serializable;

/**
 * Created by Enrique on 29/11/2015.
 */
public class Player implements Serializable {

    private int id;
    private String nombre;
    private String equipo;
    private String imagen_equipo;
    private String imagen_jugador;
    private String posicion;
    private int precio;
    private String equipo_usuario;

    public Player() {
        super();
    }

    public Player(int id, String nombre, String equipo, String imagen_jugador, String imagen_equipo, String posicion, int precio, String equipo_usuario) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.imagen_equipo = imagen_equipo;
        this.imagen_jugador = imagen_jugador;
        this.posicion = posicion;
        this.precio = precio;
        this.equipo_usuario = equipo_usuario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getImagen_equipo() {
        return imagen_jugador;
    }

    public String getImagen_jugador() {
        return imagen_equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getPrecio() {
        return precio;
    }

    public String getEquipo_usuario() {
        return equipo_usuario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setImagen_equipo(String imagen_equipo) {
        this.imagen_jugador = imagen_equipo;
    }

    public void setImagen_jugador(String imagen_jugador) {
        this.imagen_equipo = imagen_jugador;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setEquipo_usuario(String equipo_usuario) {
        this.equipo_usuario = equipo_usuario;
    }
}
