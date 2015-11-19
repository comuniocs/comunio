package com.example.all_pc.myapplication;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

/**
 * Created by All-PC on 16/10/2015.
 */
public class FnTabs_Merc_Fichajes extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lay_tabsmerc_fichajes, container, false);

        Resources res= getResources();
        TabHost tabs = (TabHost) rootView.findViewById(R.id.tabHost);
        tabs.setup();
        TabHost.TabSpec spec = tabs.newTabSpec("Pestaña 1");
        spec.setContent(R.id.tabm1);
        spec.setIndicator("Merc. Fichajes", res.getDrawable(android.R.drawable.bottom_bar));
        tabs.addTab(spec);

        tabs.setup();
        TabHost.TabSpec spec2 = tabs.newTabSpec("Pestaña 2");
        spec2.setContent(R.id.tabm2);
        spec2.setIndicator("En Venta", res.getDrawable(android.R.drawable.bottom_bar));
        tabs.addTab(spec2);

        return rootView;
    }
}
