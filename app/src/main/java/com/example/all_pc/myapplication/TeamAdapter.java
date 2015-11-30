package com.example.all_pc.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Enrique on 29/11/2015.
 */
public class TeamAdapter extends BaseAdapter {

    private Context context;
    private List<Team> items;

    public TeamAdapter(Context context, List<Team> items) {
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
            rowView = inflater.inflate(R.layout.lay_ficha_equipoclas, parent, false);
        }

        // Set data into the view.
        ImageView ivItem = (ImageView) rowView.findViewById(R.id.ivItem);
        TextView tvTitle = (TextView) rowView.findViewById(R.id.tvTitle);
        TextView tvtitle2= (TextView) rowView.findViewById(R.id.tvtext2);

        Team item = this.items.get(position);
        tvTitle.setText(item.getEquipo_usuario());
        tvtitle2.setText(String.valueOf(item.getPuntos()));



        return rowView;
    }
}
