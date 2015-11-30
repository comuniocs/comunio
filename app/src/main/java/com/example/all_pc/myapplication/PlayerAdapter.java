package com.example.all_pc.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Enrique on 29/11/2015.
 */
public class PlayerAdapter extends BaseAdapter {

    private Context context;
    private List<Player> items;

    public PlayerAdapter(Context context, List<Player> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return this.items.size();
    }

    @Override
    public Object getItem(int position) {
        return this.items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if (convertView == null) {
            // Create a new view into the list.
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.lay_ficha_jugadores, parent, false);
        }

        // Set data into the view.
        ImageView ivItem = (ImageView) rowView.findViewById(R.id.ivItem);
        TextView tvTitle = (TextView) rowView.findViewById(R.id.tvTitle);
        TextView descripcion = (TextView) rowView.findViewById(R.id.descripcion);

        Player item = this.items.get(position);
        tvTitle.setText(item.getNombre());
        descripcion.setText(item.getEquipo()+ " - "+item.getPosicion() );
        Picasso.with(this.context).load(item.getImagen_jugador()).into(ivItem);

        return rowView;
    }
}
