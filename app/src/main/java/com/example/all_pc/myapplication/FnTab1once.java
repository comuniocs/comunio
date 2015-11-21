package com.example.all_pc.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by xEV on 15/11/2015.
 */
public class FnTab1once extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lay_tab1once, container, false);
        LinearLayout linearl = (LinearLayout) rootView.findViewById(R.id.linearl1);
        registerForContextMenu(linearl);

        return rootView;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getActivity().getMenuInflater();
        inflater.inflate(R.menu.menu_tab1once, menu);
    }
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.etqFormacion1:
                Toast.makeText(getActivity(), "Etq1", Toast.LENGTH_LONG).show();
                return true;
            case R.id.etqFormacion2:
                Toast.makeText(getActivity(), "Etq2", Toast.LENGTH_LONG).show();
                return true;
            case R.id.etqFormacion3:
                Toast.makeText(getActivity(), "Etq1", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}



