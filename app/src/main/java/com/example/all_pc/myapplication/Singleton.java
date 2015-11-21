package com.example.all_pc.myapplication;

/**
 * Created by Randal on 2/11/15.
 */
public class Singleton {
    private static Singleton mInstance = null;
    private String mString;
    private User user;
    private Singleton(){
        mString = "Hello";
    }

    public static Singleton getInstance(){
        if(mInstance == null)
        {
            mInstance = new Singleton();
        }
        return mInstance;
    }

    public User getUser(){
        return this.user;
    }
    public void setUser(User user){
        this.user = user;
    }

    /*public void setString(String value){
        mString = value;
    }*/
}