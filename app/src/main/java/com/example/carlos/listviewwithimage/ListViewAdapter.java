package com.example.carlos.listviewwithimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Carlos on 23/09/2015.
 */
public class ListViewAdapter extends BaseAdapter{
    //declaro variables
    Context contexto;
    String[] titulo;
    int[] imagenes;
    LayoutInflater inflater;

    public ListViewAdapter(Context contexto, String[] titulo, int[] imagenes){
        this.contexto=contexto;
        this.titulo=titulo;
        this.imagenes=imagenes;
    }

    @Override
    public int getCount() {
        return titulo.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //declaro variables
        TextView txtText;
        ImageView imgImg;

        inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.list_row, parent, false);

        txtText = (TextView) itemView.findViewById(R.id.list_row_text);
        imgImg = (ImageView) itemView.findViewById(R.id.list_row_image);

        txtText.setText(titulo[position] );
        imgImg.setImageResource(imagenes[position]);
        return itemView;
    }
}
