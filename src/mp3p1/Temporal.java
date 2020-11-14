/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3p1;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Temporal {
    public static Cancion song;
    public static ArrayList<Cancion> lista=new ArrayList<Cancion>();

    public static ArrayList<Cancion> getLista() {
        return lista;
    }

    public static void setLista(ArrayList<Cancion> lista) {
        Temporal.lista = lista;
    }
    
    public static Cancion getSong() {
        return song;
    }

    public static void setSong(Cancion song) {
        Temporal.song = song;
    }
    
    
}
