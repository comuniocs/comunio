package com.example.all_pc.myapplication;

import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Enrique on 21/11/2015.
 */
public class RestClient {

    private EditText inputPlayer;

    private ImageView playerImg;
    private TextView playerTeam, playerName;

    private List<Player> jugadores;

    public List<Player> cargarJugadores() {
        String titulo = inputPlayer.getText().toString();
        if (!TextUtils.isEmpty(titulo)) {
            String url = String.format("http://www.resultados-futbol.com/scripts/api/api.php?tz=Europe/Madrid&format=json&req=get_players&key=3bca11c645b3af7a901069ecb26252ce&filter=otros", titulo);
            new LoadFilmTask().execute(url);
        }
        return getJugadores();
    }

    private Team getPlayers(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<Team>(){}.getType();
        return gson.fromJson(json, type);
    }

    public static final String TAG = "com.amatellanes.rest";

    private class LoadFilmTask extends AsyncTask<String, Long, String> {
        protected String doInBackground(String... urls) {
            try {
                return HttpRequest.get(urls[0]).accept("application/json").body();
            } catch (HttpRequest.HttpRequestException exception) {
                return null;
            }
        }


        protected void onPostExecute(String response) {
            Team team = getPlayers(response);
            setJugadores(team.getPlayers());
        }
    }

    public void setJugadores(List<Player> jugadores){
        this.jugadores = jugadores;
    }

    public List<Player> getJugadores(){
        return this.jugadores;
    }

    private String prettyfyJSON(String json) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(json);
        return gson.toJson(element);
    }


}
