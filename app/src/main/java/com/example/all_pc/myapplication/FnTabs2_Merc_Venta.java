package com.example.all_pc.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by xEV on 15/11/2015.
 */
public class FnTabs2_Merc_Venta extends Fragment implements View.OnClickListener {
    ListView list;
    ArrayAdapter<String> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lay_tabs2_merc_venta, container, false);

        //titulo.setText("Mis Jugadores");

        list = (ListView) rootView.findViewById(R.id.listjug_propiosventa);
        adapter = new ArrayAdapter<String>(this.getActivity() ,android.R.layout.simple_list_item_1, android.R.id.text1, Act_Principal.getJug_venta());
        list.setAdapter(adapter);
        //list.addHeaderView(titulo);

        return rootView;
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
