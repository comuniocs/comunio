package com.example.all_pc.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by All-PC on 16/10/2015.
 */
public class FnJugadores extends Fragment implements AdapterView.OnItemClickListener {

    private ListView listView;
    private DataBaseManager manager;
    private List<Player> players;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lay_jugadores, container, false);
        manager = new DataBaseManager(getActivity());

        listView = (ListView) rootView.findViewById(R.id.listView);

        final DataBaseManager manager = new DataBaseManager(getActivity());
        players = manager.getJugadoresSinEquipo();

        listView.setAdapter(new PlayerAdapter(getActivity(), players));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                String aux = players.get(position).getNombre();
                int i = manager.comprarjugador(manager.getTeam_user(Login.id_user), aux);
                if (i == 1) {
                    Toast.makeText(getActivity(), aux + " comprado.", Toast.LENGTH_SHORT ).show();
                } else {
                    Toast.makeText(getActivity(), "No tiene suficiente dinero", Toast.LENGTH_SHORT ).show();
                }
            }
        });

        return rootView;
    }
    public void onItemClick(AdapterView<?> l, View v, int position, long id) {
        String aux = players.get(position).getEquipo_usuario();
        int i = manager.comprarjugador(manager.getTeam_user(Login.id_user),aux);
        if (i==1){
            Toast.makeText(getActivity(), aux+" comprado.", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getActivity(), "No tiene suficiente dinero", Toast.LENGTH_LONG).show();
        }
    }



}