package com.caparros.daniel.mascotas;

/**
 * Created by daniel on 06/12/2016.
 */

public class Mascota {

    private String nombre;
    private int puntuacion;
    private int foto;

    public Mascota(String nombre, int puntuacion, int foto ){

        this.nombre=nombre;
        this.puntuacion=puntuacion;
        this.foto=foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }


}
