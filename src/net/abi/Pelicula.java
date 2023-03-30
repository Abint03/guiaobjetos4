package net.abi;

import java.time.*;

public class Pelicula {
    private String titulo;
    private String lanzamiento;
    private int duracion;
    private String clasificacion;
    private String siglasOrigen;
    private String descripcion;
    private Integer copias=0;
    private Integer nroAlquileres;

    public Pelicula() {
        super();
    }

    public Pelicula(String genero,String titulo, String lanzamiento, int duracion, String clasificacion, String siglasOrigen, String descripcion) {
        this.titulo = titulo;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.siglasOrigen = siglasOrigen;
        this.descripcion = descripcion;
        ++copias;
    }

    @Override
    public String toString() {
        return "Pelicula: "+super.toString()+"Título: "+titulo+", fecha de lanzamiento: "+lanzamiento+
                ", duracion: "+duracion+" min., clasificacion: "+clasificacion+", país origen: "+siglasOrigen+
                ", descripcion: "+descripcion;
    }

    public void alquilerNuevo(){
        nroAlquileres++;
    }
}