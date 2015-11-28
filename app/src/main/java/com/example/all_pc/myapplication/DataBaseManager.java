package com.example.all_pc.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Randal on 1/11/15.
 */
public class DataBaseManager {
    public static final String TABLE_NAME = "users";
    public static final String TABLE_NAME_PLAYERS = "players";
    public static final String CN_ID = "_id";
    public static final String CN_NAME = "nombre";
    public static final String CN_TEAM = "equipo";
    public static final String CN_PLAYER_IMAGE = "imagen_jugador";
    public static final String CN_TEAM_IMAGE = "imagen_equipo";
    public static final String CN_USERNAME = "username";
    public static final String CN_PASSWORD = "password";
    public static final String CN_POINTS = "puntos";
    public static final String CN_VALUE = "valor";
    public static final String CN_MONEY = "dinero";
    public static final String CN_TEAM_USER = "equipo_usuario";
    private  DbHelper helper;
    private  SQLiteDatabase db;


    public  static final String CREATE_TABLE_USERS = "create table " +TABLE_NAME+ " ("
            + CN_ID + " integer primary key autoincrement,"
            + CN_NAME + " text not null,"
            + CN_USERNAME + " text not null unique,"
            + CN_PASSWORD + " text not null);"
            + CN_TEAM_USER + "text" //Su equipo
            + CN_POINTS + "integer" // Puntos del equipo
            + CN_MONEY + "double"; //Dinero del equipo
    public  static final String CREATE_TABLE_PLAYERS = "create table " +TABLE_NAME_PLAYERS+ " ("
            + CN_ID + " integer primary key autoincrement,"
            + CN_NAME + " text not null,"
            + CN_TEAM + " text not null,"
            + CN_PLAYER_IMAGE + "text not null"
            + CN_TEAM_IMAGE + "text not null);"
            + CN_VALUE + "double" //Precio del jugador
            + CN_TEAM_USER + "text"; //Equipo al que pertenece

    public static final String INSERT_PLAYERS = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('23569','L. Messi'              ,'http://thumb.resfu.com/img_data/escudos/medium/429.jpg?size=40x&ext=png&lossy=1&1' ,'http://thumb.resfu.com/img_data/players/medium/23569.jpg?size=34x&ext=png&lossy=1&1' ,'FCB');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('28185', 'C. Ronaldo'           ,'http://thumb.resfu.com/img_data/escudos/medium/2107.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/28185.jpg?size=34x&ext=png&lossy=1&1' ,'RMA');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('23559', 'D. Alves'             ,'http://thumb.resfu.com/img_data/escudos/medium/429.jpg?size=40x&ext=png&lossy=1&1' ,'http://thumb.resfu.com/img_data/players/medium/23559.jpg?size=34x&ext=png&lossy=1&1' ,'FCB');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('23343', 'Marcelo'              ,'http://thumb.resfu.com/img_data/escudos/medium/2107.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/23343.jpg?size=34x&ext=png&lossy=1&1' ,'RMA');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('2133' , 'M. \u00d6zil'         ,'http://thumb.resfu.com/img_data/escudos/medium/263.jpg?size=40x&ext=png&lossy=1&1' ,'http://thumb.resfu.com/img_data/players/medium/2133.jpg?size=34x&ext=png&lossy=1&1'  ,'ARS');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('27010','2107'                  ,'http://thumb.resfu.com/img_data/escudos/medium/2107.jpg?size=40x&ext=png&lossy=1&1',:'http://thumb.resfu.com/img_data/players/medium/27010.jpg?size=34x&ext=png&lossy=1&1','RMA');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('63294', '\u00c1. Di Mar\u00eda','http://thumb.resfu.com/img_data/escudos/medium/1924.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/63294.jpg?size=34x&ext=png&lossy=1&1' ,'PSG');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('72'   , 'G. Bale'              ,'http://thumb.resfu.com/img_data/escudos/medium/2107.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/72.jpg?size=34x&ext=png&lossy=1&1'    ,'RMA');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('588'  , 'W. Rooney'            ,'http://thumb.resfu.com/img_data/escudos/medium/1635.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/588.jpg?size=34x&ext=png&lossy=1&1'   ,'MUD');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('21065','2176'                  ,'http://thumb.resfu.com/img_data/escudos/medium/2176.jpg?size=40x&ext=png&lossy=1&1',:'http://thumb.resfu.com/img_data/players/medium/21065.jpg?size=34x&ext=png&lossy=1&1','ROM');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('256'  , 'J. Terry'             ,'http://thumb.resfu.com/img_data/escudos/medium/752.jpg?size=40x&ext=png&lossy=1&1' ,'http://thumb.resfu.com/img_data/players/medium/256.jpg?size=34x&ext=png&lossy=1&1'   ,'CHL');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('23348', 'G. Higua\u00edn'      ,'http://thumb.resfu.com/img_data/escudos/medium/1777.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/23348.jpg?size=34x&ext=png&lossy=1&1' ,'NAP');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('1925' , 'P. Lahm'              ,'http://thumb.resfu.com/img_data/escudos/medium/449.jpg?size=40x&ext=png&lossy=1&1' ,'http://thumb.resfu.com/img_data/players/medium/1925.jpg?size=34x&ext=png&lossy=1&1'  ,'BYM');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('1237' , 'Z. Ibrahimovic'       ,'http://thumb.resfu.com/img_data/escudos/medium/1924.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/1237.jpg?size=34x&ext=png&lossy=1&1'  ,'PSG');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('396'  , 'J. Mascherano'        ,'http://thumb.resfu.com/img_data/escudos/medium/429.jpg?size=40x&ext=png&lossy=1&1' ,'http://thumb.resfu.com/img_data/players/medium/396.jpg?size=34x&ext=png&lossy=1&1'   ,'FCB');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('3318' , 'K. Benzema'           ,'http://thumb.resfu.com/img_data/escudos/medium/2107.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/3318.jpg?size=34x&ext=png&lossy=1&1'  ,'RMA');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('15526', 'Thiago Silva'         ,'http://thumb.resfu.com/img_data/escudos/medium/1924.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/15526.jpg?size=34x&ext=png&lossy=1&1' ,'PSG');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('5736' , 'A. Robben'            ,'http://thumb.resfu.com/img_data/escudos/medium/449.jpg?size=40x&ext=png&lossy=1&1' ,'http://thumb.resfu.com/img_data/players/medium/5736.jpg?size=34x&ext=png&lossy=1&1'  ,'BYM');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('1819' , 'M. Neuer'             ,'http://thumb.resfu.com/img_data/escudos/medium/449.jpg?size=40x&ext=png&lossy=1&1' ,'http://thumb.resfu.com/img_data/players/medium/1819.jpg?size=34x&ext=png&lossy=1&1'  ,'BYM');"+
            "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_ID+","+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('64511','429'                   ,'http://thumb.resfu.com/img_data/escudos/medium/429.jpg?size=40x&ext=png&lossy=1&1' ,:'http://thumb.resfu.com/img_data/players/medium/64511.jpg?size=34x&ext=png&lossy=1&1','FCB');";


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
    // podemos crear una clase usuario el cual tendra todos los datos incluido el id pero este se generara solo y no habra que ponerlo, por tanto se creara el objeto y se insertara ocmo tal.
    public long insertar (String nombre, String username, String contraseña){
       return db.insert(TABLE_NAME, null, generarContentValues(nombre, username, contraseña));//devuelve long, si es -1 es que hubo problemas.
    }

    /*public void generarjugadores(){
        db.execSQL("INSERT INTO "+TABLE_NAME_PLAYERS+" VALUES ('L. Messi','FCB');");
        db.execSQL("INSERT INTO "+TABLE_NAME_PLAYERS+" VALUES ('Ronaldo','RMA');");
        db.execSQL("INSERT INTO "+TABLE_NAME_PLAYERS+" VALUES ('Marcelo','RMA');");
        db.execSQL("INSERT INTO "+TABLE_NAME_PLAYERS+" VALUES ('Benzema','RMA');");
        db.execSQL("INSERT INTO "+TABLE_NAME_PLAYERS+" VALUES ('Neymar','FCB');");

    }*/

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

    public void venderjugador(String[] jug, String[] username){
        String[] col=new String[]{"valor"};
        Cursor c = db.query(TABLE_NAME_PLAYERS, col, "nombre=?", jug, null, null, null);
        double aux = c.getDouble(0);
        c = db.query(TABLE_NAME,col,"equipo_user=?",username,null,null,null);
        aux = aux + c.getDouble(0);
        db.execSQL("UPDATE players SET equipo_user='NULL' WHERE nombre=? ",jug);
        // FALTA SUMAR DINERO AL EQUIPO

    }

    public Cursor cargarClasificacion(){
        String []col= new String[]{CN_ID,CN_USERNAME,CN_POINTS};
        return db.query(TABLE_NAME,col,null,null,null,null,null);
    }
}
