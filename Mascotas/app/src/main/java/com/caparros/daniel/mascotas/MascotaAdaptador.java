package com.caparros.daniel.mascotas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;

import java.util.ArrayList;

/**
 * Created by daniel on 12/12/2016.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas=mascotas;
        this.activity=activity;
    }


    //Va a inflar el layout y lo pasara al viewholder para que el obtenga cada view
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent,false);
        return new MascotaViewHolder(v);
    }

    //Asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota=mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombre.setText(mascota.getNombre());
        mascotaViewHolder.tvPuntuacion.setText(String.valueOf(mascota.getPuntuacion()));

        mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mascotaViewHolder.tvPuntuacion.setText(String.valueOf(mascota.getPuntuacion()+1));

        }
        });
    }

    //Cantidad de elementos que contiene mi lista de mascotas
    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private TextView tvNombre, tvPuntuacion;
        private ImageView imgFoto;
        private ImageButton btnLike;


        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto=(ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombre=(TextView) itemView.findViewById(R.id.tvNombre);
            tvPuntuacion=(TextView) itemView.findViewById(R.id.tvPuntuacion);
            btnLike=(ImageButton) itemView.findViewById(R.id.btnLike);
        }
    }
}
