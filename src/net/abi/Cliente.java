package net.abi;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String nroTel;
    private String direccion;
    private ArrayList<Boleta> ult10Alquileres=new ArrayList<>();

    public Cliente(String nombre, String nroTel, String direccion) {
        this.nombre = nombre;
        this.nroTel = nroTel;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroTel() {
        return nroTel;
    }

    public void setNroTel(String nroTel) {
        this.nroTel = nroTel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "nombre: " + nombre +", nroTel: " + nroTel +
                ", direccion: " + direccion;
    }

    public void alquileres(String){
        ult10Alquileres.add();
    }
}
