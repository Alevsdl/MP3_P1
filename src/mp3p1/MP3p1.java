/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3p1;

import forms.Buscador;
import forms.Principal;
import java.io.IOException;

/**
 *
 * @author ALEJANDRA
 */
public class MP3p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //System.out.println("pues hola");
       Archivo archivo = new Archivo();
        if (archivo.Existe()) {
            Principal ventada = new Principal();
             ventada.setVisible(true);
        } else {
            Buscador venta = new Buscador();
            venta.setVisible(true);
            byte reset=0;
            archivo.setId(reset);
        }
    }

}
