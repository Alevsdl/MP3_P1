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
       private String titulo;
    private String artista;
    private String album;
    private String anio;
    
    Cancion(String titulo,String artista ,String album,String anio){
        this.titulo=titulo;
        this.artista=artista;
        this.album=album;
        this.anio=anio;
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
}
