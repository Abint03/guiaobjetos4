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

    public ArrayList<Boleta> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(ArrayList<Boleta> alquileres) {
        this.alquileres = alquileres;
    }

    public ArrayList<Pelicula> getStockTotal() {
        return stockTotal;
    }

    public void setStockTotal(ArrayList<Pelicula> stockTotal) {
        this.stockTotal = stockTotal;
    }

    public ArrayList<Pelicula> getAccion() {
        return accion;
    }

    public void setAccion(ArrayList<Pelicula> accion) {
        this.accion = accion;
    }

    public ArrayList<Pelicula> getComedia() {
        return comedia;
    }

    public void setComedia(ArrayList<Pelicula> comedia) {
        this.comedia = comedia;
    }

    public ArrayList<Pelicula> getAventura() {
        return aventura;
    }

    public void setAventura(ArrayList<Pelicula> aventura) {
        this.aventura = aventura;
    }

    public ArrayList<Pelicula> getDrama() {
        return drama;
    }

    public void setDrama(ArrayList<Pelicula> drama) {
        this.drama = drama;
    }

    public ArrayList<Pelicula> getHorror() {
        return horror;
    }

    public void setHorror(ArrayList<Pelicula> horror) {
        this.horror = horror;
    }

    public ArrayList<Pelicula> getDocumental() {
        return documental;
    }

    public void setDocumental(ArrayList<Pelicula> documental) {
        this.documental = documental;
    }

    public void genero(Pelicula peli){
        if(peli.getGenero()=="Accion"){
            accion.add(peli);
        }
        if(peli.getGenero()=="Comedia"){
            comedia.add(peli);
        }
        if(peli.getGenero()=="Aventura"){
            aventura.add(peli);
        }
        if(peli.getGenero()=="Drama"){
            drama.add(peli);
        }
        if(peli.getGenero()=="Horror"){
            horror.add(peli);
        }
        if(peli.getGenero()=="Documental"){
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
                ///eliminar ese elemento de la lista
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

    public void tituloMasAlquilado(ArrayList<Pelicula> lista){
        Pelicula mayorAlq=lista.get(0);
        for(int i=0; i<lista.size();i++){
            if(lista.get(i).getNroAlquileres()>mayorAlq.getNroAlquileres()){
                mayorAlq=lista.get(i);
            }
        }
        System.out.println("El título más alquilado fue: "+mayorAlq.toString());
    }

    public void buscarPeliPorGenero(String genre){
        if(genre=="Accion"){
            tituloMasAlquilado(accion);
        }
        if(genre=="Comedia"){
            tituloMasAlquilado(comedia);
        }
        if(genre=="Aventura"){
            tituloMasAlquilado(aventura);
        }
        if(genre=="Drama"){
            tituloMasAlquilado(drama);
        }
        if(genre=="Horror"){
            tituloMasAlquilado(horror);
        }
        if(genre=="Documental"){
            tituloMasAlquilado(documental);
        }
    }
}