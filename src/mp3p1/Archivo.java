/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3p1;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Archivo {
    //escribir canciones
    // mandar lista de canciones(tadas, por artista o año)
    //si el archivo tiene algo o existe

    public boolean Existe() {
        File archivo = new File("canciones.data");
        return archivo.exists();
    }
    
    public void escribir( ArrayList<Cancion> canciones) throws FileNotFoundException, IOException{
        if (Existe()) {
            //tengo que saber donde escribir para no sobre escribir datos
                 RandomAccessFile archivo = new RandomAccessFile("canciones.data", "rw");
                 int seek=(int)archivo.length();
                 archivo.seek(seek);
                  int registro;
             int tamanioTitulo,tamanioArtista,tamanioAlbum,tamanioAnio;
             for (Cancion song:canciones) {
                tamanioTitulo=song.getTitulo().length();
                tamanioArtista=song.getArtista().length();
                tamanioAlbum=song.getAlbum().length();
                tamanioAnio=song.getAnio().length();
                registro= 2 +(4+tamanioTitulo) + (4+tamanioArtista)+ (4+tamanioAlbum)+(4+tamanioAnio);
                archivo.writeShort((short)registro);
                archivo.writeInt(tamanioTitulo);
                archivo.write(song.getTitulo().getBytes());
                archivo.writeInt(tamanioArtista);
                archivo.write(song.getArtista().getBytes());
                archivo.writeInt(tamanioAlbum);
                archivo.write(song.getAlbum().getBytes());
                archivo.writeInt(tamanioAnio);
                archivo.write(song.getAnio().getBytes());
             }
             archivo.close();
               
        }else{
            //crea el archivo y esta en blanco
             RandomAccessFile archivo = new RandomAccessFile("canciones.data", "rw");
             int registro;
             int tamanioTitulo,tamanioArtista,tamanioAlbum,tamanioAnio;
            
             for (Cancion song:canciones) {
                tamanioTitulo=song.getTitulo().length();
                tamanioArtista=song.getArtista().length();
                tamanioAlbum=song.getAlbum().length();
                tamanioAnio=song.getAnio().length();
                registro= 2 +(4+tamanioTitulo) + (4+tamanioArtista)+ (4+tamanioAlbum)+(4+tamanioAnio);
                archivo.writeShort((short)registro);
                archivo.writeInt(tamanioTitulo);
                archivo.write(song.getTitulo().getBytes());
                archivo.writeInt(tamanioArtista);
                archivo.write(song.getArtista().getBytes());
                archivo.writeInt(tamanioAlbum);
                archivo.write(song.getAlbum().getBytes());
                archivo.writeInt(tamanioAnio);
                archivo.write(song.getAnio().getBytes());
                
             }   
             archivo.close();
             
        }
    }
    
    public ArrayList<Cancion> leerTodas() throws FileNotFoundException, IOException{
        //si la suma de los datos de la cancion es mas grande de lo que aguanta un short el programa se traba(camcbiar short por int tal vez)
        ArrayList<Cancion>  canciones=new ArrayList<Cancion> ();
       FileInputStream archivo = new FileInputStream("canciones.data");
        DataInputStream lector = new DataInputStream(archivo);
        int tamanio=(int)lector.available();
        short registro;
        int longitud;
        String titulo,artista,album,anio;
        while(tamanio>0 || lector.available()>0){
            registro=lector.readShort();
            longitud=lector.readInt();
            titulo=new String(lector.readNBytes(longitud), StandardCharsets.UTF_8);
            longitud=lector.readInt();
            artista=new String(lector.readNBytes(longitud), StandardCharsets.UTF_8);
            longitud=lector.readInt();
            album=new String(lector.readNBytes(longitud), StandardCharsets.UTF_8);
            longitud=lector.readInt();
            anio=new String(lector.readNBytes(longitud), StandardCharsets.UTF_8);
            Cancion aux=new Cancion(titulo,artista,album,anio);
            canciones.add(aux);
            tamanio-=(int)registro;
        }  
        archivo.close();
        return canciones;
    }
    
}
