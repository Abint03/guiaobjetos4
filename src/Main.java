import net.abi.Boleta;
import net.abi.Cliente;
import net.abi.Pelicula;
import net.abi.Stock;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Stock inventario=new Stock();
        Pelicula peli=new Pelicula("Accion","Peli de Accion1","2023-10-23",120,"PG","AR","Es un ejemplo a");
        inventario.genero(peli);
        Pelicula peli1=new Pelicula("Comedia","Peli de Comedia1","2021-09-09",127,"G","AR","Es un ejemplo a");
        inventario.genero(peli1);
        Pelicula peli2=new Pelicula("Comedia","Peli de Comedia2","2000-04-13",140,"R","AR","Es un ejemplo a");
        inventario.genero(peli2);
        Pelicula peli3=new Pelicula("Accion","Peli de Accion2","2020-10-02",200,"NC-17","AR","Es un ejemplo a");
        inventario.genero(peli3);
        Pelicula peli4=new Pelicula("Accion","Peli de Accion3","2018-11-26",105,"R","AR","Es un ejemplo a");
        inventario.genero(peli4);
        System.out.println(peli.toString());
        Cliente cliente1=new Cliente("Lautaro Burgos","2235963120","Sucasita 2399");
        System.out.println(cliente1.toString());
        Boleta ej=new Boleta("2023-04-05",cliente1,peli);

    }
}