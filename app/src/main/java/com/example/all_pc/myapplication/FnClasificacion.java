package com.example.all_pc.myapplication;

import android.app.Fragment;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.List;

/**
 * Created by All-PC on 16/10/2015.
 */
public class FnClasificacion extends Fragment {
    private DataBaseManager manager;
    private ListView lista;
    private Cursor cursor;
    SimpleCursorAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lay_clasificacion, container, false);

        manager = new DataBaseManager(getActivity());
        lista = (ListView) rootView.findViewById(R.id.listClasificacion);

        List<Team> teams;
        teams = manager.getEquiposClasificacion();
        lista.setAdapter(new TeamAdapter(getActivity(),teams));




        /*String[] from = new String[]{manager.CN_USERNAME};
        int[] to = new int[] {android.R.id.text1};

        cursor = manager.cargarClasificacion();
        adapter = new SimpleCursorAdapter(getActivity(),android.R.layout.two_line_list_item,cursor,from,to);
        lista.setAdapter(adapter);*/

        return rootView;
    }
}
