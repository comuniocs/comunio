package com.example.all_pc.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Enrique on 30/11/2015.
 */
public class FnInfoJugador extends Fragment {

    private Player player;
    private ImageView imgJugador;
    private TextView nomjugtext, textPosicion, textEquipo, textValor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lay_informacion_jugador, container, false);

        Bundle bundle = this.getArguments();
        int posicion =  bundle.getInt("Player");
        DataBaseManager manager = new DataBaseManager(getActivity());
        String aux= manager.getTeam_user(Login.id_user);
        List<Player> players = manager.getJugadoresDeEquipo(aux);

        this.player = players.get(posicion);

        // Set data into the view.
        ImageView imgJugador = (ImageView) rootView.findViewById(R.id.imgJugador);
        TextView nomjugtext = (TextView) rootView.findViewById(R.id.nomjugtext);
        TextView textPosicion = (TextView) rootView.findViewById(R.id.textPos);
        TextView textEquipo = (TextView) rootView.findViewById(R.id.textEquipo);
        TextView textValor = (TextView) rootView.findViewById(R.id.textvalor);


        nomjugtext.setText(this.player.getNombre());
        textPosicion.setText(this.player.getPosicion());
        textEquipo.setText(this.player.getEquipo());
        textValor.setText(String.valueOf(this.player.getPrecio()));
        Picasso.with(getActivity()).load(this.player.getImagen_jugador()).into(imgJugador);

        return rootView;
    }




}

