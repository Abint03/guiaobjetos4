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
}
