package com.example.all_pc.myapplication;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by xEV on 15/11/2015.
 */
public class FnTab1once extends Fragment {
    private DataBaseManager manager;
    private  List<Player> players,portero,defensas,medios,delanteros;
    private ImageView p,d1,d2,d3,d4,m1,m2,m3,m4,dl1,dl2;
    private int TipoPosicion=0,Aux_Posicion=0;
    private Player p1,p2;
    private final int FRAGMENT_GROUPID = 40;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.lay_tab1once, container, false);
        LinearLayout linearl = (LinearLayout) rootView.findViewById(R.id.linearl1);
        manager = new DataBaseManager(getActivity());
        //Asignamos a cada View su variable
        p = (ImageView) rootView.findViewById(R.id.imPor);
        d1 = (ImageView) rootView.findViewById(R.id.imDef1);
        d2 = (ImageView) rootView.findViewById(R.id.imDef2);
        d3 = (ImageView) rootView.findViewById(R.id.imDef3);
        d4 = (ImageView) rootView.findViewById(R.id.imDef4);
        m1 = (ImageView) rootView.findViewById(R.id.imMed1);
        m2 = (ImageView) rootView.findViewById(R.id.imMed2);
        m3 = (ImageView) rootView.findViewById(R.id.imMed3);
        m4 = (ImageView) rootView.findViewById(R.id.imMed4);
        dl1 = (ImageView) rootView.findViewById(R.id.imDel1);
        dl2 = (ImageView) rootView.findViewById(R.id.imDel2);

        String aux = manager.getTeam_user(Login.id_user);
        portero = manager.getJugadoresTitulares(aux,"Portero");
        if (portero.size()>0) {
            Picasso.with(getActivity()).load(portero.get(0).getImagen_jugador()).into(p);
        }
        defensas = manager.getJugadoresTitulares(aux,"Defensa");
        int i = 0;
        if (i <= defensas.size() - 1) {
            Picasso.with(getActivity()).load(defensas.get(0).getImagen_jugador()).into(d1);
         } i++;
        if(i<=defensas.size()-1) {
            Picasso.with(getActivity()).load(defensas.get(1).getImagen_jugador()).into(d2);
        } i++;
        if(i<=defensas.size()-1) {
                Picasso.with(getActivity()).load(defensas.get(2).getImagen_jugador()).into(d3);
        }i++;
        if(i<=defensas.size()-1) {
            Picasso.with(getActivity()).load(defensas.get(3).getImagen_jugador()).into(d4);
        }
        medios = manager.getJugadoresTitulares(aux,"Medio"); i=0;
        if (i <= medios.size() - 1) {
            Picasso.with(getActivity()).load(medios.get(0).getImagen_jugador()).into(m1);
        } i++;
        if(i<=medios.size()-1) {
            Picasso.with(getActivity()).load(medios.get(1).getImagen_jugador()).into(m2);
        } i++;
        if(i<=medios.size()-1) {
            Picasso.with(getActivity()).load(medios.get(2).getImagen_jugador()).into(m3);
        }i++;
        if(i<=medios.size()-1) {
            Picasso.with(getActivity()).load(medios.get(3).getImagen_jugador()).into(m4);
        }
        delanteros = manager.getJugadoresTitulares(aux,"Delantero"); i=0;
        if (i <= delanteros.size() - 1) {
            Picasso.with(getActivity()).load(delanteros.get(0).getImagen_jugador()).into(dl1);
        } i++;
        if(i<=delanteros.size()-1) {
            Picasso.with(getActivity()).load(delanteros.get(1).getImagen_jugador()).into(dl2);
        }

        //Asignamos menu contextual a cada imgView
        registerForContextMenu(rootView.findViewById(R.id.imPor));
        registerForContextMenu(rootView.findViewById(R.id.imDef1));
        registerForContextMenu(rootView.findViewById(R.id.imDef2));
        registerForContextMenu(rootView.findViewById(R.id.imDef3));
        registerForContextMenu(rootView.findViewById(R.id.imDef4));
        registerForContextMenu(rootView.findViewById(R.id.imMed1));
        registerForContextMenu(rootView.findViewById(R.id.imMed2));
        registerForContextMenu(rootView.findViewById(R.id.imMed3));
        registerForContextMenu(rootView.findViewById(R.id.imMed4));
        registerForContextMenu(rootView.findViewById(R.id.imDel1));
        registerForContextMenu(rootView.findViewById(R.id.imDel2));


        return rootView;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        String aux= manager.getTeam_user(Login.id_user);
        switch (v.getId()){
            case R.id.imPor: Aux_Posicion=0; break;
            case R.id.imDef1: Aux_Posicion=0; break;
            case R.id.imDef2: Aux_Posicion=1; break;
            case R.id.imDef3: Aux_Posicion=2; break;
            case R.id.imDef4: Aux_Posicion=3; break;
            case R.id.imMed1: Aux_Posicion=0; break;
            case R.id.imMed2: Aux_Posicion=1; break;
            case R.id.imMed3: Aux_Posicion=2; break;
            case R.id.imMed4: Aux_Posicion=3; break;
            case R.id.imDel1: Aux_Posicion=0; break;
            case R.id.imDel2: Aux_Posicion=1; break;
        }
        if (v.getId() == R.id.imPor){
            players = manager.getPorteros(aux);
            for(Player pl:players){
                menu.add(FRAGMENT_GROUPID,v.getId(),0,pl.getNombre());
            }
            this.TipoPosicion=0;
        } else if (v.getId() == R.id.imDef1 || v.getId() == R.id.imDef2 ||v.getId() == R.id.imDef3 || v.getId() == R.id.imDef4){
            players = manager.getDefensas(aux);
            for(Player pl:players){
                menu.add(FRAGMENT_GROUPID,v.getId(),0,pl.getNombre());
            }
            this.TipoPosicion=1;
        } else if(v.getId() == R.id.imMed1 || v.getId() == R.id.imMed2 || v.getId() == R.id.imMed3 || v.getId() == R.id.imMed4){
            players = manager.getMedios(aux);
            for(Player pl:players){
                menu.add(FRAGMENT_GROUPID,v.getId(),0,pl.getNombre());
            }
            this.TipoPosicion=2;
        } else if(v.getId() == R.id.imDel1 || v.getId() == R.id.imDel2){
            players = manager.getDelanteros(aux);
            for(Player pl:players){
                menu.add(FRAGMENT_GROUPID,v.getId(),0,pl.getNombre());
            }
            this.TipoPosicion=3;
        }

    }
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getGroupId()==FRAGMENT_GROUPID) {
            AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
            String aux = item.getTitle().toString();
            int posicion = this.getPosition(aux);
            //Toast.makeText(getActivity(), aux+" p:"+posicion, Toast.LENGTH_LONG).show();
            //return true;
            //Llamada a la base de datos para cambiar el valor de la columna Jugar a Si
            switch (this.TipoPosicion) {
                case 0:
                    p1 = players.get(posicion); //Jugador suplente
                    if (Aux_Posicion <= portero.size() - 1) {
                        p2 = portero.get(Aux_Posicion); //Jugador titular
                        manager.CambiarState_titular_suplente(p1.getNombre(), p2.getNombre());
                        Toast.makeText(getActivity(), p2.getNombre() + " cambiado por " + p1.getNombre(), Toast.LENGTH_SHORT).show();
                    } else {
                        manager.CambiarState_suplente(p1.getNombre());
                        Toast.makeText(getActivity(), p1.getNombre() + " es titular.", Toast.LENGTH_SHORT).show();
                    }
                    return true;
                case 1:
                    p1 = players.get(posicion); //Jugador suplente
                    if (Aux_Posicion <= defensas.size() - 1) {
                        p2 = defensas.get(Aux_Posicion); //Jugador titular
                        manager.CambiarState_titular_suplente(p1.getNombre(), p2.getNombre());
                        Toast.makeText(getActivity(), p2.getNombre() + " cambiado por " + p1.getNombre(), Toast.LENGTH_SHORT).show();

                    } else {
                        manager.CambiarState_suplente(p1.getNombre());
                        Toast.makeText(getActivity(), p1.getNombre() + " es titular.", Toast.LENGTH_SHORT).show();

                    }
                    //Toast.makeText(getActivity(),p1.getNombre(), Toast.LENGTH_SHORT).show();
                    return true;
                case 2:
                    p1 = players.get(posicion); //Jugador suplente
                    if (Aux_Posicion <= medios.size() - 1) {
                        p2 = medios.get(Aux_Posicion); //Jugador titular
                        manager.CambiarState_titular_suplente(p1.getNombre(), p2.getNombre());
                        Toast.makeText(getActivity(), p2.getNombre() + " cambiado por " + p1.getNombre(), Toast.LENGTH_SHORT).show();

                    } else {
                        manager.CambiarState_suplente(p1.getNombre());
                        Toast.makeText(getActivity(), p1.getNombre() + " es titular.", Toast.LENGTH_SHORT).show();

                    }

                    return true;
                case 3:
                    p1 = players.get(posicion); //Jugador suplente
                    if (Aux_Posicion <= delanteros.size() - 1) {
                        p2 = delanteros.get(Aux_Posicion); //Jugador titular
                        manager.CambiarState_titular_suplente(p1.getNombre(), p2.getNombre());
                        Toast.makeText(getActivity(), p2.getNombre() + " cambiado por " + p1.getNombre(), Toast.LENGTH_SHORT).show();
                    } else {
                        manager.CambiarState_suplente(p1.getNombre());
                        Toast.makeText(getActivity(), p1.getNombre() + " es titular.", Toast.LENGTH_SHORT).show();
                    }

                    return true;
                default:
                    return super.onContextItemSelected(item);
            }
        } else {
            AdapterView.AdapterContextMenuInfo info =
                    (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
            String aux2= manager.getTeam_user(Login.id_user);
            players = manager.getJugadoresDeEquipo(aux2);
            switch (item.getItemId()) {
                case R.id.etq1Informacion:
                    //players.get(info.position);
                    Fragment fragment = new FnInfoJugador();
                    Bundle bundle = new Bundle();
                    bundle.putInt("Player", info.position);
                    fragment.setArguments(bundle);
                    Toast.makeText(getActivity(), "Informacion", Toast.LENGTH_LONG).show();
                    FragmentManager fragmentManager = getFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();


                    return true;
                case R.id.etq2Venta:
                    String aux= manager.getTeam_user(Login.id_user);
                    manager.venderjugador(manager.getTeam_user(Login.id_user),aux);
                    Toast.makeText(getActivity(), players.get(info.position).getNombre()+" ha sido vendido.", Toast.LENGTH_SHORT).show();
                    return true;
                default:
                    return super.onContextItemSelected(item);
            }
        }
    }
    
    private int getPosition(String nombre){
        int i=0;
        int aux=0;
        for (Player pl:players){
            if(pl.getNombre().equals(nombre)){
                aux=i;
            }
            i++;
        }
        return aux;
    }
}



