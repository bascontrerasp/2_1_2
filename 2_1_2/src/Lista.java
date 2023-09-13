
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Lista {
    private ArrayList<Canción> listaCanciones;
    
    public Lista() {
        listaCanciones = new ArrayList<Canción>();
    }
    
    public boolean agregar(Canción cancion) {
        return listaCanciones.add(cancion);
    }
}
