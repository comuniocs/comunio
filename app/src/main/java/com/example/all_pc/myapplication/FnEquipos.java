package com.example.all_pc.myapplication;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v13.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

public class FnEquipos extends Fragment implements View.OnClickListener {
    //TextView titulo;
    ListView list;
    ArrayAdapter<String> adapter;
    ArrayList<String> lista;

    private FragmentTabHost mtabHost;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lay_equipos, container, false);

        Resources res= getResources();
        TabHost tabs=(TabHost) rootView.findViewById(R.id.tabHost);
        tabs.setup();
        TabHost.TabSpec spec = tabs.newTabSpec("Pestaña 1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Equipo", res.getDrawable(android.R.drawable.bottom_bar));
        tabs.addTab(spec);

        tabs.setup();
        TabHost.TabSpec spec2 = tabs.newTabSpec("Pestaña 1");
        spec2.setContent(R.id.tab2);
        spec2.setIndicator("Plantilla", res.getDrawable(android.R.drawable.bottom_bar));
        tabs.addTab(spec2);

        tabs.setup();
        TabHost.TabSpec spec3 = tabs.newTabSpec("Pestaña 1");
        spec3.setContent(R.id.tab3);
        spec3.setIndicator("En venta", res.getDrawable(android.R.drawable.bottom_bar));
        tabs.addTab(spec3);











        /*mtabHost=(FragmentTabHost)getView().findViewById(android.R.id.tabhost);
        mtabHost.setup(getActivity(),getFragmentManager(),android.R.id.tabcontent);

        //mtabHost.addTab(mtabHost.newTabSpec("tab1").setIndicator("Equipo"),FnJugadores.class,null);*/






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

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getActivity().getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            /*case R.id.bLogout:
                startActivity(new Intent(this, Login.class));
                break;*/}


    }



}
