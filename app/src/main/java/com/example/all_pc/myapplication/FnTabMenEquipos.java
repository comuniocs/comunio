package com.example.all_pc.myapplication;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

public class FnTabMenEquipos extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lay_tabmenequipos, container, false);






        Resources res= getResources();
        TabHost tabs=(TabHost) rootView.findViewById(R.id.tabHost);
        tabs.setup();
        TabHost.TabSpec spec = tabs.newTabSpec("Pestaña 1");
        //Intent i1 = new Intent(getActivity(),FnTab1once.class);
        spec.setIndicator("Equipo", res.getDrawable(android.R.drawable.bottom_bar));
        spec.setContent(R.id.tab3);
        tabs.addTab(spec);

        tabs.setup();
        TabHost.TabSpec spec2 = tabs.newTabSpec("Pestaña 2");
        //Intent i2 = new Intent(getActivity(),FnTab2Plantilla.class);
        spec2.setIndicator("Plantilla", res.getDrawable(android.R.drawable.bottom_bar));
        spec2.setContent(R.id.tab3);
        tabs.addTab(spec2);

        tabs.setup();
        TabHost.TabSpec spec3 = tabs.newTabSpec("Pestaña 3");
        //Intent i3 = new Intent(getActivity(),FnTab3Venta.class);
        spec3.setIndicator("En venta", res.getDrawable(android.R.drawable.bottom_bar));
        spec3.setContent(R.id.tab3);
        tabs.addTab(spec3);








            /*lista = new ArrayList<String>();
        //titulo.setText("Mis Jugadores");


        list = (ListView) rootView.findViewById(R.id.listView);
        lista.add("Cristiano Ronaldo");
        lista.add("Leo Messi");
        lista.add("Luis Suarez");
        lista.add("Pedro Leon");
        lista.add("Fernando Torres");
        lista.add("Keylor Navas");
        adapter = new ArrayAdapter<String>(this.getActivity() ,android.R.layout.simple_list_item_1, android.R.id.text1, lista);
        list.setAdapter(adapter);
        //list.addHeaderView(titulo);*/

        return rootView;
    }



}
