package net.abi;

import java.time.*;

public class Pelicula {
    private String titulo;
    private String lanzamiento;
    private String genero;
    private int duracion;
    private String clasificacion;
    private String siglasOrigen;
    private String descripcion;
    private Integer copias=0;
    private Integer nroAlquileres=0;

    public Pelicula() {
    }

    public Pelicula(String genero,String titulo, String lanzamiento, int duracion, String clasificacion, String siglasOrigen, String descripcion) {
        this.titulo = titulo;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.siglasOrigen = siglasOrigen;
        this.descripcion = descripcion;
        this.genero=genero;
        ++copias;
    }

    @Override
    public String toString() {
        return "Pelicula: "+"Título: "+titulo+", género: "+genero+", fecha de lanzamiento: "+lanzamiento+
                ", duracion: "+duracion+" min., clasificacion: "+clasificacion+", país origen: "+siglasOrigen+
                ", descripcion: "+descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(String lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getSiglasOrigen() {
        return siglasOrigen;
    }

    public void setSiglasOrigen(String siglasOrigen) {
        this.siglasOrigen = siglasOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCopias() {
        return copias;
    }

    public void setCopias(Integer copias) {
        this.copias = copias;
    }

    public Integer getNroAlquileres() {
        return nroAlquileres;
    }

    public void setNroAlquileres(Integer nroAlquileres) {
        this.nroAlquileres = nroAlquileres;
    }

    public void alquilerNuevo(){
        nroAlquileres++;
    }

}