package com.example.all_pc.myapplication;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

public class FnTabMiEquipo extends Fragment{
    //TextView titulo;
    ListView list;
    ArrayAdapter<String> adapter;
    ArrayList<String> lista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lay_tabmiequipo, container, false);

        Resources res= getResources();
        TabHost tabs = (TabHost) rootView.findViewById(R.id.tabHost);
        tabs.setup();
        TabHost.TabSpec spec = tabs.newTabSpec("Pestaña 1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Equipo", res.getDrawable(android.R.drawable.bottom_bar));
        tabs.addTab(spec);

        tabs.setup();
        TabHost.TabSpec spec2 = tabs.newTabSpec("Pestaña 2");
        spec2.setContent(R.id.tab2);
        spec2.setIndicator("Plantilla", res.getDrawable(android.R.drawable.bottom_bar));
        tabs.addTab(spec2);

        return rootView;
    }
}
