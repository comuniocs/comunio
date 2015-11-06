package com.example.all_pc.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FnEquipos extends Fragment implements View.OnClickListener {
    //TextView titulo;
    ListView list;
    ArrayAdapter<String> adapter;
    ArrayList<String> lista;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lay_equipos, container, false);
        lista = new ArrayList<String>();
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
        //list.addHeaderView(titulo);

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
