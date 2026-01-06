/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamidia;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class ProgramaMidia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Musica musica = new Musica("album", "produtora", "produtor", 
                "compositores", "artistas", "genero", 2000);
        Filme filme = new Filme("estudio", "direcao", "artistas", "genero", 2001);
        
        JOptionPane.showMessageDialog(null, musica.toString());
        JOptionPane.showMessageDialog(null, filme.toString());
    }
    
}
