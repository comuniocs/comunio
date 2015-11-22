package com.example.all_pc.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

/**
 * Created by Randal on 1/11/15.
 */
public class DataBaseManager {
    public static final String TABLE_NAME = "users";
    public static final String TABLE_NAME_PLAYERS = "players";
    public static final String CN_ID = "_id";
    public static final String CN_NAME = "nombre";
    public static final String CN_TEAM = "equipo";
    public static final String CN_USERNAME = "username";
    public static final String CN_PASSWORD = "password";
    private  DbHelper helper;
    private  SQLiteDatabase db;


    public  static final String CREATE_TABLE_USERS = "create table " +TABLE_NAME+ " ("
            + CN_ID + " integer primary key autoincrement,"
            + CN_NAME + " text not null,"
            + CN_USERNAME + " text not null unique,"
            + CN_PASSWORD + " text not null);";
    public  static final String CREATE_TABLE_PLAYERS = "create table " +TABLE_NAME_PLAYERS+ " ("
            + CN_ID + " integer primary key autoincrement,"
            + CN_NAME + " text not null,"
            + CN_TEAM + " text not null);";

    public DataBaseManager(Context context) {
        helper = new DbHelper(context);
        db  = helper.getWritableDatabase();
    }

    public ContentValues generarContentValues (String nombre, String username, String contraseña){
        ContentValues valores = new ContentValues();
        valores.put(CN_NAME, nombre);
        valores.put(CN_USERNAME, username);
        valores.put(CN_PASSWORD, contraseña);
        return valores;
    }

    public ContentValues generarContentJugador (String nombre, String club){
        ContentValues valores = new ContentValues();
        valores.put(CN_NAME, nombre);
        valores.put(CN_TEAM, club);
        return valores;
    }
    // podemos crear una clase usuario el cual tendra todos los datos incluido el id pero este se generara solo y no habra que ponerlo, por tanto se creara el objeto y se insertara ocmo tal.
    public long insertar (String nombre, String username, String contraseña){
       return db.insert(TABLE_NAME, null, generarContentValues(nombre, username, contraseña));//devuelve long, si es -1 es que hubo problemas.
    }

    public void generarJugadores(){
        RestClient cliente = new RestClient();
        List<Player> jugadores = cliente.cargarJugadores();

        for(int i=0; i < jugadores.size(); i++){
            insertarJugador(jugadores.get(i));
        }
    }

    public long insertarJugador(Player jugador){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.insert(TABLE_NAME_PLAYERS, null, generarContentJugador(jugador.getNick(), jugador.getTeam_name()));
    }

    public void insertar2 (String nombre, String username, String contraseña){
        db.execSQL("INSERT INTO " + TABLE_NAME + " values(null,'" + nombre + "','" + username + "','" + contraseña + "')");

    }

    public Cursor cargarCursorUsers(){//devuelve toda la base de datos()
        String[] columnas = new String[]{CN_ID, CN_NAME, CN_USERNAME, CN_PASSWORD};
        return db.query(TABLE_NAME,columnas, null, null, null,null, null);
    }

    public boolean Estaregistrado (String query){
        Cursor c = db.rawQuery(query, null);
        if (c.moveToFirst()) {
            do{
            User user = new User (c.getInt(0), c.getString(1), c.getString(2), c.getString(3));
                Singleton.getInstance().setUser(user);
                //System.out.println(Singleton.getInstance().getUser().getName());
            }while(c.moveToNext());
            return true;
        }else{
            return false;

        }
    }

}
