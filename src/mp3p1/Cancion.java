/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3p1;

/**
 *
 * @author Diego
 */
public class Cancion {
    private byte id; //sera un id para diferenciar cada cancion
    private String titulo;
    private String artista;
    private String album;
    private String anio;
    private String letra;//guarda la direccion de un archivo de texto con la letra de la cancion
    
    public Cancion(String titulo,String artista ,String album,String anio){
        this.titulo=titulo;
        this.artista=artista;
        this.album=album;
        this.anio=anio;
        this.letra="N";//el princio las canciones no tendar letra 
    }
     public Cancion(){
       
   }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
     
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    
    @Override
    public String toString() {
        return titulo;
    }
}
