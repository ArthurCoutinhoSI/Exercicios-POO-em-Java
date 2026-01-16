/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaorganizamusica;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class Musica {
    String titulo;
    String artista;
    String genero;

    public Musica(String titulo, String artista, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }
    
//    fabric de musica
    public static Musica criaMusica(){
        String titulo = JOptionPane.showInputDialog("Informe o titulo da musica");
        String artista = JOptionPane.showInputDialog("Informe o artista, autor da musica");;
        String genero = JOptionPane.showInputDialog("Informe o genero da musica");;
        return new Musica(titulo, artista, genero);
    }
    
    public static int removeMusicas(ArrayList<Musica> musicas){
        int contadorDeRemocoes = 0;
        
        for (Iterator<Musica> iterator = musicas.iterator(); iterator.hasNext();) {
            iterator.remove();            
        }
        
        return contadorDeRemocoes;
    }
    
    public static String devolveStringDeTodasAsMusicas(ArrayList<Musica> musicas){
        String resp = "";
        for (Musica musica : musicas) {
            resp += musica.toString();
            resp += "\n";
        }
        return resp;
    }
    
    //    issue
    public static ArrayList<Musica> musicasFitradas(ArrayList<Musica> musicas, int filtro, String buscada){
        ArrayList<Musica> resp = new ArrayList<Musica>();
        for (Musica musica : musicas) {
            if (filtro == 1 && musica.getTitulo().contains(buscada)) {
                resp.add(musica);
            }
            if (filtro == 2 && musica.getArtista().contains(buscada)) {
                resp.add(musica);
            }
            if (filtro == 3 && musica.getGenero().contains(buscada)) {
                resp.add(musica);
            }
        }
        return resp;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Musica{" + "titulo=" + titulo + ", artista=" + artista + ", genero=" + genero + '}';
    }
        
}
