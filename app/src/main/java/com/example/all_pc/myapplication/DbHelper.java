package com.example.all_pc.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Randal on 1/11/15.
 */
public class DbHelper extends SQLiteOpenHelper{
    private static final  String DB_NAME = "comunio.sqlite";
    private static final int DB_SCHEME_VERSION = 1;

    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_SCHEME_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        System.out.println("CREANDO BBDD");
        db.execSQL(DataBaseManager.CREATE_TABLE_USERS);
        System.out.println(DataBaseManager.CREATE_TABLE_USERS);
        db.execSQL(DataBaseManager.CREATE_TABLE_PLAYERS);
        System.out.println(DataBaseManager.CREATE_TABLE_PLAYERS);
        db.execSQL(DataBaseManager.INSERT_PLAYER_1);
        db.execSQL(DataBaseManager.INSERT_PLAYER_2);
        db.execSQL(DataBaseManager.INSERT_PLAYER_3);
        db.execSQL(DataBaseManager.INSERT_PLAYER_4);
        db.execSQL(DataBaseManager.INSERT_PLAYER_5);
        db.execSQL(DataBaseManager.INSERT_PLAYER_6);
        db.execSQL(DataBaseManager.INSERT_PLAYER_7);
        db.execSQL(DataBaseManager.INSERT_PLAYER_8);
        db.execSQL(DataBaseManager.INSERT_PLAYER_9);
        db.execSQL(DataBaseManager.INSERT_PLAYER_10);
        db.execSQL(DataBaseManager.INSERT_PLAYER_11);
        db.execSQL(DataBaseManager.INSERT_PLAYER_12);
        db.execSQL(DataBaseManager.INSERT_PLAYER_13);
        db.execSQL(DataBaseManager.INSERT_PLAYER_14);
        db.execSQL(DataBaseManager.INSERT_PLAYER_15);
        db.execSQL(DataBaseManager.INSERT_PLAYER_16);
        db.execSQL(DataBaseManager.INSERT_PLAYER_17);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        System.out.println("ACTUALIZANDO BBDD");
        db.execSQL(DataBaseManager.DROP_TABLE_PLAYER);
        db.execSQL(DataBaseManager.DROP_TABLE_USERS);
        db.execSQL(DataBaseManager.CREATE_TABLE_USERS);
        System.out.println(DataBaseManager.CREATE_TABLE_USERS);
        db.execSQL(DataBaseManager.CREATE_TABLE_PLAYERS);
        System.out.println(DataBaseManager.CREATE_TABLE_PLAYERS);
        db.execSQL(DataBaseManager.INSERT_PLAYER_1);
        db.execSQL(DataBaseManager.INSERT_PLAYER_2);
        db.execSQL(DataBaseManager.INSERT_PLAYER_3);
        db.execSQL(DataBaseManager.INSERT_PLAYER_4);
        db.execSQL(DataBaseManager.INSERT_PLAYER_5);
        db.execSQL(DataBaseManager.INSERT_PLAYER_6);
        db.execSQL(DataBaseManager.INSERT_PLAYER_7);
        db.execSQL(DataBaseManager.INSERT_PLAYER_8);
        db.execSQL(DataBaseManager.INSERT_PLAYER_9);
        db.execSQL(DataBaseManager.INSERT_PLAYER_10);
        db.execSQL(DataBaseManager.INSERT_PLAYER_11);
        db.execSQL(DataBaseManager.INSERT_PLAYER_12);
        db.execSQL(DataBaseManager.INSERT_PLAYER_13);
        db.execSQL(DataBaseManager.INSERT_PLAYER_14);
        db.execSQL(DataBaseManager.INSERT_PLAYER_15);
        db.execSQL(DataBaseManager.INSERT_PLAYER_16);
        db.execSQL(DataBaseManager.INSERT_PLAYER_17);
    }
}

