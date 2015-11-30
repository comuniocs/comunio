package com.example.all_pc.myapplication;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by All-PC on 16/10/2015.
 */
public class FnInfoJugador extends Fragment {

    private Player player;
    private ImageView imgJugador;
    private TextView nomjugtext, textPosicion, textEquipo, textValor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lay_informacion_jugador, container, false);

        System.out.println("HOLA");
        Bundle bundle = this.getArguments();
        System.out.println("HOLA");
        this.player = (Player) bundle.getSerializable("Player");
        System.out.println("HOLA");

        // Set data into the view.
        ImageView imgJugador = (ImageView) rootView.findViewById(R.id.imgJugador);
        TextView nomjugtext = (TextView) rootView.findViewById(R.id.nomjugtext);
        TextView textPosicion = (TextView) rootView.findViewById(R.id.textPosicion);
        TextView textEquipo = (TextView) rootView.findViewById(R.id.textEquipo);
        TextView textValor = (TextView) rootView.findViewById(R.id.textValor);


        nomjugtext.setText(this.player.getNombre());
        textPosicion.setText(this.player.getPosicion());
        textEquipo.setText(this.player.getEquipo());
        textValor.setText(this.player.getPrecio());
        Picasso.with(getActivity()).load(this.player.getImagen_jugador()).into(imgJugador);

        return rootView;
    }




}