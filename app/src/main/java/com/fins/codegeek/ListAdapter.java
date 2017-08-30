package com.fins.codegeek;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by arifinofficial on 8/26/17.
 */

public class ListAdapter extends ArrayAdapter<Menu> {
    Context context;
    int     resourceId;
    ArrayList<Menu> data = null;

    public ListAdapter(@NonNull Context context, @LayoutRes int resource, ArrayList<Menu> data) {
        super(context, resource, data);
        this.context    = context;
        this.resourceId      = resource;
        this.data       = data;
    }

    static class MenuHolder{
        ImageView   MenuImg;
        TextView    MenuTv;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row    = convertView;
        MenuHolder holder   = null;

        if (row==null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(resourceId, parent, false);

            holder  = new MenuHolder();
            holder.MenuImg  = (ImageView) row.findViewById(R.id.MenuImg);
            holder.MenuTv   = (TextView) row.findViewById(R.id.MenuTv);

            row.setTag(holder);
        }else {
            holder  = (MenuHolder)row.getTag();
        }
            Menu menu = data.get(position);
            holder.MenuImg.setImageResource(menu.icon);
            holder.MenuTv.setText(menu.namaBahasa);

            return row;

    }
}
