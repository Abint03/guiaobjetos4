package net.abi;

import java.time.LocalDate;
import java.util.ArrayList;

public class Stock {
    private ArrayList<Boleta> alquileres=new ArrayList<>();
    private ArrayList<Pelicula> stockTotal=new ArrayList<>();
    private ArrayList<Pelicula>accion=new ArrayList<>();
    private ArrayList<Pelicula>comedia=new ArrayList<>();
    private ArrayList<Pelicula>aventura=new ArrayList<>();
    private ArrayList<Pelicula>drama=new ArrayList<>();
    private ArrayList<Pelicula>horror=new ArrayList<>();
    private ArrayList<Pelicula>documental=new ArrayList<>();

    public Stock() {
    }

    public void genero(String genre, Pelicula peli){
        if(genre=="Accion"){
            accion.add(peli);
        }
        if(genre=="Comedia"){
            comedia.add(peli);
        }
        if(genre=="Aventura"){
            aventura.add(peli);
        }
        if(genre=="Drama"){
            drama.add(peli);
        }
        if(genre=="Horror"){
            horror.add(peli);
        }
        if(genre=="Documental"){
            documental.add(peli);
        }
        stockTotal.add(peli);
    }
    public void nuevoAlquiler(Boleta boleta){
        alquileres.add(boleta);
    }
    public void peliculaDevuelta(Boleta boleta){
        for(int i=0;i<alquileres.size();i++){
            if(boleta==alquileres.get(i)){
                alquileres.clear();
            }
        }
    }

    public void devolucionesHoy(){
        for(int i=0;i<alquileres.size();i++){
            if(alquileres.get(i).getFechaDevolucion() == LocalDate.now().toString()){
                System.out.println(alquileres.get(i).toString());
            }
        }
    }
}