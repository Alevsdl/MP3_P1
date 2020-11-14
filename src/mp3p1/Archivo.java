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
    private static ArrayList<Slot> indice = new ArrayList<Slot>();//el indice que guarda el id y pocicion de las canciones
    private static byte id;//identificador de las canciones 
    private static long puntero;

    public void incrementar() {
        id++;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        Archivo.id = id;
    }

    public boolean Existe() {
        File archivo = new File("canciones.data");
        return archivo.exists();
    }

    public void datosAuxiliares() {
        /*
        esta reservara los bytes al inicio del programa para saber donde esta el 
        indice, en que numero va el id y de que tamaño es el indice
         */
    }

    public void escribir(ArrayList<Cancion> canciones) throws FileNotFoundException, IOException {
        if (Existe()) {
            //tengo que saber donde escribir para no sobre escribir datos
            RandomAccessFile archivo = new RandomAccessFile("canciones.data", "rw");
            archivo.seek(puntero);
            int registro;
            int tamanioTitulo, tamanioArtista, tamanioAlbum, tamanioAnio, tamanioLetra;
            for (Cancion song : canciones) {
                tamanioTitulo = song.getTitulo().length();
                tamanioArtista = song.getArtista().length();
                tamanioAlbum = song.getAlbum().length();
                tamanioAnio = song.getAnio().length();
                tamanioLetra = song.getLetra().length();
                //tamaño registro-> id->legTitulo+titulo->legArtista+artista->legAlbum+album->legAnio+anio->legLetra+letra
                registro = 2 + 1 + (4 + tamanioTitulo) + (4 + tamanioArtista) + (4 + tamanioAlbum) + (4 + tamanioAnio) + (4 + tamanioLetra);
                Slot elemento = new Slot(song.getId(), (short) archivo.getFilePointer());
                indice.add(elemento);
                archivo.writeShort((short) registro);
                archivo.writeByte(song.getId());
                archivo.writeInt(tamanioTitulo);
                archivo.write(song.getTitulo().getBytes());
                archivo.writeInt(tamanioArtista);
                archivo.write(song.getArtista().getBytes());
                archivo.writeInt(tamanioAlbum);
                archivo.write(song.getAlbum().getBytes());
                archivo.writeInt(tamanioAnio);
                archivo.write(song.getAnio().getBytes());
                archivo.writeInt(tamanioLetra);
                archivo.write(song.getLetra().getBytes());
            }
            puntero = archivo.getFilePointer();
            archivo.close();

        } else {
            //crea el archivo y esta en blanco
            RandomAccessFile archivo = new RandomAccessFile("canciones.data", "rw");
            int registro;
            int tamanioTitulo, tamanioArtista, tamanioAlbum, tamanioAnio, tamanioLetra;
            /*
             esta reservara los bytes al inicio del programa para saber donde esta el 
            indice, en que numero va el id y de que tamaño es el indice
             */
            archivo.writeByte(id);
            archivo.writeShort(10);
            archivo.writeShort(10);
            for (Cancion song : canciones) {
                tamanioTitulo = song.getTitulo().length();
                tamanioArtista = song.getArtista().length();
                tamanioAlbum = song.getAlbum().length();
                tamanioAnio = song.getAnio().length();
                tamanioLetra = song.getLetra().length();
                registro = 2 + 1 + (4 + tamanioTitulo) + (4 + tamanioArtista) + (4 + tamanioAlbum) + (4 + tamanioAnio) + (4 + tamanioLetra);
                Slot elemento = new Slot(song.getId(), (short) archivo.getFilePointer());
                indice.add(elemento);
                archivo.writeShort((short) registro);
                archivo.writeByte(song.getId());
                archivo.writeInt(tamanioTitulo);
                archivo.write(song.getTitulo().getBytes());//utf y deveria solucioner el problema de los cuadros 
                archivo.writeInt(tamanioArtista);
                archivo.write(song.getArtista().getBytes());
                archivo.writeInt(tamanioAlbum);
                archivo.write(song.getAlbum().getBytes());
                archivo.writeInt(tamanioAnio);
                archivo.write(song.getAnio().getBytes());
                archivo.writeInt(tamanioLetra);
                archivo.write(song.getLetra().getBytes());
            }
            puntero = archivo.getFilePointer();
            archivo.close();

        }
        guardarIndice();
    }

    public ArrayList<Cancion> leerTodas() throws FileNotFoundException, IOException {
        //si la suma de los datos de la cancion es mas grande de lo que aguanta un short el programa se traba(camcbiar short por int tal vez)
        ArrayList<Cancion> canciones = new ArrayList<Cancion>();
        FileInputStream archivo = new FileInputStream("canciones.data");
        DataInputStream lector = new DataInputStream(archivo);
        int tamanio = (int) lector.available();
        short registro;
        int longitud;
        byte id;
        this.indice = leerIndice();
        String titulo, artista, album, anio, letra;
        this.id = lector.readByte();
        short tamanioIndice = lector.readShort();
        short posindice = lector.readShort();
        this.puntero = posindice;
        tamanio -= 5;
        tamanio -= tamanioIndice;
        while (tamanio != 0) {
            registro = lector.readShort();
            id = lector.readByte();
            longitud = lector.readInt();
            titulo = new String(lector.readNBytes(longitud), StandardCharsets.UTF_8);
            longitud = lector.readInt();
            artista = new String(lector.readNBytes(longitud), StandardCharsets.UTF_8);
            longitud = lector.readInt();
            album = new String(lector.readNBytes(longitud), StandardCharsets.UTF_8);
            longitud = lector.readInt();
            anio = new String(lector.readNBytes(longitud), StandardCharsets.UTF_8);
            longitud = lector.readInt();
            letra = new String(lector.readNBytes(longitud), StandardCharsets.UTF_8);
            Cancion aux = new Cancion(titulo, artista, album, anio);
            aux.setLetra(letra);
            aux.setId(id);
            canciones.add(aux);
            tamanio -= (int) registro;
        }
        archivo.close();
        return canciones;
    }

    public void guardarIndice() throws FileNotFoundException, IOException {
        RandomAccessFile archivo = new RandomAccessFile("canciones.data", "rw");

        archivo.seek(puntero);
        for (Slot elemento : indice) {

            archivo.writeByte(elemento.getId());
            archivo.writeShort(elemento.getPost());
        }
        short tamanioIndice = (short) (3 * indice.size());
        short posindice = (short) puntero;
        archivo.seek(0);
        archivo.writeByte(id);
        archivo.writeShort(tamanioIndice);
        archivo.writeShort(posindice);
        long tamanioArchivo=posindice+(indice.size()*3);
        if (tamanioArchivo<archivo.length()) {
            archivo.setLength(tamanioArchivo);
        }
        
    }

    public ArrayList<Slot> leerIndice() throws FileNotFoundException, IOException {
        ArrayList<Slot> indice = new ArrayList<Slot>();
        RandomAccessFile archivo = new RandomAccessFile("canciones.data", "rw");
        archivo.seek(0);
        this.id = archivo.readByte();
        short tamanio = archivo.readShort();
        short post = archivo.readShort();
        archivo.seek(post);
        while (tamanio > 0) {
            byte id = archivo.readByte();
            short posicion = archivo.readShort();
            Slot elemento = new Slot(id, posicion);
            indice.add(elemento);
            tamanio -= 3;
        }
        return indice;
    }

    public void modificiar(Cancion cancion) throws FileNotFoundException, IOException {
        
        Slot aux = new Slot();
        ArrayList<Cancion> canciones = new ArrayList<Cancion>();
        canciones.add(cancion);
        for (Slot e : indice) {
        System.out.println(e.getId());
        System.out.println(e.getPost());
            if (e.getId() == cancion.getId()) {
                System.out.println("encontrado");
                aux.setId(e.getId());
                aux.setPost(e.getPost());
            }
        }
        
        System.out.println(aux.getId());
        System.out.println(aux.getPost());
        
        //modificar el registro
        String titulo, artista, album, anio, letra;
        int longitud;
        short registro;
        byte iD;
        int tamanio = 0;
        Cancion temporal = new Cancion();
        FileInputStream archivo = new FileInputStream("canciones.data");
        DataInputStream lector = new DataInputStream(archivo);
        tamanio = lector.available();
        lector.skip(aux.getPost());
        short corre = lector.readShort();
        lector.skip(corre - 2);
        tamanio -= (corre + aux.getPost() + (3 * indice.size()));
        while (tamanio != 0) {

            registro = lector.readShort();
            iD = lector.readByte();
            longitud = lector.readInt();
            titulo = new String(lector.readNBytes(longitud), StandardCharsets.UTF_8);
            longitud = lector.readInt();
            artista = new String(lector.readNBytes(longitud), StandardCharsets.UTF_8);
            longitud = lector.readInt();
            album = new String(lector.readNBytes(longitud), StandardCharsets.UTF_8);
            longitud = lector.readInt();
            anio = new String(lector.readNBytes(longitud), StandardCharsets.UTF_8);
            longitud = lector.readInt();
            letra = new String(lector.readNBytes(longitud), StandardCharsets.UTF_8);

            Cancion e = new Cancion(titulo, artista, album, anio);
            e.setLetra(letra);
            e.setId(iD);
            canciones.add(e);

            tamanio -= (int) registro;
        }

        restructurar(aux.getPost(), canciones);
    }

    public void restructurar(short pos, ArrayList<Cancion> lista) throws FileNotFoundException, IOException {
        RandomAccessFile archivo = new RandomAccessFile("canciones.data", "rw");
        int registro;
        int tamanioTitulo, tamanioArtista, tamanioAlbum, tamanioAnio, tamanioLetra;
        archivo.seek(pos);
        for (Cancion song : lista) {

            tamanioTitulo = song.getTitulo().length();
            tamanioArtista = song.getArtista().length();
            tamanioAlbum = song.getAlbum().length();
            tamanioAnio = song.getAnio().length();
            tamanioLetra = song.getLetra().length();
            registro = 2 + 1 + (4 + tamanioTitulo) + (4 + tamanioArtista) + (4 + tamanioAlbum) + (4 + tamanioAnio) + (4 + tamanioLetra);
            Slot elemento = new Slot(song.getId(), (short) archivo.getFilePointer());
            indice.add(elemento);
            archivo.writeShort((short) registro);
            archivo.writeByte(song.getId());
            archivo.writeInt(tamanioTitulo);
            archivo.write(song.getTitulo().getBytes());//utf y deveria solucioner el problema de los cuadros 
            archivo.writeInt(tamanioArtista);
            archivo.write(song.getArtista().getBytes());
            archivo.writeInt(tamanioAlbum);
            archivo.write(song.getAlbum().getBytes());
            archivo.writeInt(tamanioAnio);
            archivo.write(song.getAnio().getBytes());
            archivo.writeInt(tamanioLetra);
            archivo.write(song.getLetra().getBytes());
        }
        puntero = archivo.getFilePointer();
        archivo.close();
        guardarIndice();
    }

    public void Eliminar() throws IOException {
        
        ArrayList<Cancion> canciones = this.leerTodas();
         ArrayList<Cancion> remplazar=new ArrayList<Cancion>(); 
        for (int i = 0; i < indice.size(); i++) {
            if (Temporal.getSong().getId()==indice.get(i).getId()) {
              puntero=indice.get(i).getPost();
                break;
            }
        }
        
       int indexEliminar=-1;
        for (int i = 0; i < canciones.size(); i++) {
             if (Temporal.getSong().getId()==canciones.get(i).getId()) {
                indexEliminar=i;
                break;
            }
        }
        
       
         RandomAccessFile archivo = new RandomAccessFile("canciones.data", "rw");
        int registro;
        int tamanioTitulo, tamanioArtista, tamanioAlbum, tamanioAnio, tamanioLetra;
        archivo.seek(puntero);
        for (int i = indexEliminar+1; i < canciones.size(); i++) {
             tamanioTitulo = canciones.get(i).getTitulo().length();
            tamanioArtista = canciones.get(i).getArtista().length();
            tamanioAlbum = canciones.get(i).getAlbum().length();
            tamanioAnio = canciones.get(i).getAnio().length();
            tamanioLetra = canciones.get(i).getLetra().length();
            registro = 2 + 1 + (4 + tamanioTitulo) + (4 + tamanioArtista) + (4 + tamanioAlbum) + (4 + tamanioAnio) + (4 + tamanioLetra);
            indice.get(i).setId(canciones.get(i).getId());
            indice.get(i).setPost((short)archivo.getFilePointer());
            archivo.writeShort((short) registro);
            archivo.writeByte(canciones.get(i).getId());
            archivo.writeInt(tamanioTitulo);
            archivo.write(canciones.get(i).getTitulo().getBytes());//utf y deveria solucioner el problema de los cuadros 
            archivo.writeInt(tamanioArtista);
            archivo.write(canciones.get(i).getArtista().getBytes());
            archivo.writeInt(tamanioAlbum);
            archivo.write(canciones.get(i).getAlbum().getBytes());
            archivo.writeInt(tamanioAnio);
            archivo.write(canciones.get(i).getAnio().getBytes());
            archivo.writeInt(tamanioLetra);
            archivo.write(canciones.get(i).getLetra().getBytes());
            
        }
       
        puntero=archivo.getFilePointer();
        indice.remove(indexEliminar);
         archivo.close();
        guardarIndice();
        
    }

    public void quitarEliminado(ArrayList<Cancion> canciones) throws FileNotFoundException, IOException {
        
       
    }

}
