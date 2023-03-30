package net.abi;

import java.time.LocalDate;

public class Boleta {
    private LocalDate fechaPrestamo;
    private String fechaDevolucion;
    private Cliente cliente;
    private Pelicula pelicula;

    public Boleta(String fechaDevolucion, Cliente cliente, Pelicula pelicula) {
        this.fechaPrestamo=LocalDate.now();
        this.fechaDevolucion = fechaDevolucion;
        this.cliente = cliente;
        this.pelicula = pelicula;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
}