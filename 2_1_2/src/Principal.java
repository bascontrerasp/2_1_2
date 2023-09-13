
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Bastian contreras
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    Canción cancion1 = new Canción("let it be", "the beatles", "4:03", false, false);
    Canción cancion2 = new Canción ("yesterday", "the beatles", "2:05", false, false);
    Canción cancion3 = new Canción ("here comes the sun", "the beatles", "3:05", false, false);
    Canción cancion4 = new Canción ("in the end", "linkin park", "3:36", false, false);
    Canción cancion5 = new Canción ("numb", "linkin park", "3:05", false, false);
    Canción cancion6 = new Canción ("one step closer", "linkin park", "2:37", false, false);
    
    Lista lista1 = new Lista();
    lista1.agregar(cancion1);
    lista1.agregar(cancion2);
    lista1.agregar(cancion3);
    
    Lista lista2 = new Lista();
    lista2.agregar(cancion4);
    lista2.agregar(cancion5);
    lista2.agregar(cancion6);
    
    int opcLista = 0;
        System.out.println("Bienvenido, que lista desea escuchar?\n1. lista los beatles\n2. lista linkin park");
        Scanner teclado = new Scanner(System.in);
        opcLista = teclado.nextInt();
        
        switch(opcLista) {
            case 1:
                System.out.println("ha seleccionado la lista de los betles que contiene las siguientes canciones:");
                System.out.println(cancion1.getTitulo());
                System.out.println(cancion2.getTitulo());
                System.out.println(cancion3.getTitulo());
                System.out.println("reproduciendo...");
                break;
            case 2:
                System.out.println("ha seleccionado la lista de linkin park que contiene las siguientes canciones:");
                System.out.println(cancion4.getTitulo());
                System.out.println(cancion5.getTitulo());
                System.out.println(cancion6.getTitulo());
                System.out.println("reproduciendo...");
                break;
        }
    }
    
    
}
