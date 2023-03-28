import net.abi.Boleta;
import net.abi.Cliente;
import net.abi.Pelicula;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Pelicula peli=new Pelicula("Accion","Peli de Accion","2023-10-23",120,"PG","AR","Es un ejemplo a");
        System.out.println(peli.toString());
        Cliente cliente1=new Cliente("Lautaro Burgos","2235963120","Sucasita 2399");
        System.out.println(cliente1.toString());
        Boleta ej=new Boleta("2023-04-05",cliente1,peli);

    }
}