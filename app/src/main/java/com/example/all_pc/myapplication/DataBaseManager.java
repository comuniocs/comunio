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
            + CN_PLAYER_IMAGE + " text,"
            + CN_TEAM_IMAGE + " text, "
            + CN_VALUE + " double," //Precio del jugador
            + CN_TEAM_USER + " text);"; //Equipo al que pertenece

    public static final String DROP_TABLE_PLAYER = "drop table "+TABLE_NAME_PLAYERS +" IF EXIST;";

    public static final String INSERT_PLAYER_1 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('L. Messi','http://thumb.resfu.com/img_data/escudos/medium/429.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/23569.jpg?size=34x&ext=png&lossy=1&1','FCB');";
    public static final String INSERT_PLAYER_2 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('C. Ronaldo','http://thumb.resfu.com/img_data/escudos/medium/2107.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/28185.jpg?size=34x&ext=png&lossy=1&1','RMA');";
    public static final String INSERT_PLAYER_3 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('D. Alves','http://thumb.resfu.com/img_data/escudos/medium/429.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/23559.jpg?size=34x&ext=png&lossy=1&1','FCB');";
    public static final String INSERT_PLAYER_4 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('Marcelo','http://thumb.resfu.com/img_data/escudos/medium/2107.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/23343.jpg?size=34x&ext=png&lossy=1&1','RMA');";
    public static final String INSERT_PLAYER_5 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('M. Ozil','http://thumb.resfu.com/img_data/escudos/medium/263.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/2133.jpg?size=34x&ext=png&lossy=1&1','ARS');";
    public static final String INSERT_PLAYER_6 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('A. Di Maria','http://thumb.resfu.com/img_data/escudos/medium/1924.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/63294.jpg?size=34x&ext=png&lossy=1&1' ,'PSG');";
    public static final String INSERT_PLAYER_7 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('G. Bale','http://thumb.resfu.com/img_data/escudos/medium/2107.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/72.jpg?size=34x&ext=png&lossy=1&1','RMA');";
    public static final String INSERT_PLAYER_8 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('W. Rooney','http://thumb.resfu.com/img_data/escudos/medium/1635.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/588.jpg?size=34x&ext=png&lossy=1&1','MUD');";
    public static final String INSERT_PLAYER_9 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('J. Terry','http://thumb.resfu.com/img_data/escudos/medium/752.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/256.jpg?size=34x&ext=png&lossy=1&1','CHL');";
    public static final String INSERT_PLAYER_10 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('G. Higuain','http://thumb.resfu.com/img_data/escudos/medium/1777.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/23348.jpg?size=34x&ext=png&lossy=1&1','NAP');";
    public static final String INSERT_PLAYER_11 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('P. Lahm','http://thumb.resfu.com/img_data/escudos/medium/449.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/1925.jpg?size=34x&ext=png&lossy=1&1','BYM');";
    public static final String INSERT_PLAYER_12 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('Z. Ibrahimovic','http://thumb.resfu.com/img_data/escudos/medium/1924.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/1237.jpg?size=34x&ext=png&lossy=1&1','PSG');";
    public static final String INSERT_PLAYER_13 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('J. Mascherano','http://thumb.resfu.com/img_data/escudos/medium/429.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/396.jpg?size=34x&ext=png&lossy=1&1','FCB');";
    public static final String INSERT_PLAYER_14 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('K. Benzema','http://thumb.resfu.com/img_data/escudos/medium/2107.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/3318.jpg?size=34x&ext=png&lossy=1&1','RMA');";
    public static final String INSERT_PLAYER_15 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('Thiago Silva','http://thumb.resfu.com/img_data/escudos/medium/1924.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/15526.jpg?size=34x&ext=png&lossy=1&1','PSG');";
    public static final String INSERT_PLAYER_16 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('A. Robben','http://thumb.resfu.com/img_data/escudos/medium/449.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/5736.jpg?size=34x&ext=png&lossy=1&1','BYM');";
    public static final String INSERT_PLAYER_17 = "Insert into "+TABLE_NAME_PLAYERS+" ("+CN_NAME+","+CN_PLAYER_IMAGE+","+CN_TEAM_IMAGE+","+CN_TEAM+") values('M. Neuer','http://thumb.resfu.com/img_data/escudos/medium/449.jpg?size=40x&ext=png&lossy=1&1','http://thumb.resfu.com/img_data/players/medium/1819.jpg?size=34x&ext=png&lossy=1&1','BYM');";

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

    public int comprarjugador (String[] jug,String[] equipo){
        String[] col=new String[]{"valor"};
        Cursor c = db.query(TABLE_NAME,col,"equipo_user=?",equipo,null,null,null);
        double aux = c.getDouble(0);
        c = db.query(TABLE_NAME_PLAYERS, col, "nombre=?", jug, null, null, null);
        aux = aux - c.getDouble(0);
        if (aux>0){ //Compra el jugador
            // FALTA ACTUALIZAR JUGADOR Y RESTAR DINERO
            return 1;
        } else { // No puede comprar el jugador
            return 0;
        }
    }

    public void venderjugador(String[] jug, String[] equipo){
        String[] col=new String[]{"valor"};
        Cursor c = db.query(TABLE_NAME_PLAYERS, col, "nombre=?", jug, null, null, null);
        double aux = c.getDouble(0);
        c = db.query(TABLE_NAME,col,"equipo_user=?",equipo,null,null,null);
        aux = aux + c.getDouble(0);
        db.execSQL("UPDATE players SET equipo_user='NULL' WHERE nombre=? ",jug);
        // FALTA SUMAR DINERO AL EQUIPO

    }

    public Cursor cargarClasificacion(){
        String []col= new String[]{CN_ID,CN_USERNAME,CN_POINTS};
        return db.query(TABLE_NAME,col,null,null,null,null,null);
    }
}
