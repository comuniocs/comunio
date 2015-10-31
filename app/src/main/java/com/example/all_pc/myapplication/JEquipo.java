package com.example.all_pc.myapplication;

import java.util.ArrayList;

/**
 * Created by xEV on 31/10/2015.
 */
public class JEquipo {
    String Nombre_Equipo;
    JUsuario user;
    int Punto_clasi;
    ArrayList <JJugador> Plantilla = new ArrayList<>();

    public JEquipo (String nombre,JUsuario usuario){
        this.user=usuario;
        this.Nombre_Equipo=nombre;
        this.Punto_clasi=0;
        this.generar_jug_basicos();
    }

    private void generar_jug_basicos(){
        this.Plantilla.add(new JJugador("Jugador A","Basico",this,"POR",0,4,true));
        this.Plantilla.add(new JJugador("Jugador B","Basico",this,"DF",0,4,true));
        this.Plantilla.add(new JJugador("Jugador C","Basico",this,"DF",0,4,true));
        this.Plantilla.add(new JJugador("Jugador D","Basico",this,"DF",0,4,true));
        this.Plantilla.add(new JJugador("Jugador E","Basico",this,"DF",0,4,true));
        this.Plantilla.add(new JJugador("Jugador F","Basico",this,"MC",0,4,true));
        this.Plantilla.add(new JJugador("Jugador G","Basico",this,"MC",0,4,true));
        this.Plantilla.add(new JJugador("Jugador H","Basico",this,"MC",0,4,true));
        this.Plantilla.add(new JJugador("Jugador I","Basico",this,"MC",0,4,true));
        this.Plantilla.add(new JJugador("Jugador J","Basico",this,"DC",0,4,true));
        this.Plantilla.add(new JJugador("Jugador K","Basico",this,"DC",0,4,true));
    }
}
