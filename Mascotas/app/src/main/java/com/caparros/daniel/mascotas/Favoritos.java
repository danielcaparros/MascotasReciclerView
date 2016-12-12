package com.caparros.daniel.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Toolbar miActionBar=(Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas=(RecyclerView) findViewById(R.id.rvMascotasFavoritas);

        LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotasFavoritas();
        inicializarAdaptador();

    }


    public void inicializarListaMascotasFavoritas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Pablo",5,R.drawable.perro5));
        mascotas.add(new Mascota("Raul",3,R.drawable.perro3));
        mascotas.add(new Mascota("Daniel",1,R.drawable.perro1));
        mascotas.add(new Mascota("Ramon",2,R.drawable.perro2));
        mascotas.add(new Mascota("JC",4,R.drawable.perro4));


    }

    public void inicializarAdaptador(){

        MascotaAdaptador adaptador=new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);

    }
}
