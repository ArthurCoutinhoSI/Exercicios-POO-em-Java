/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package retiraartigosdafrase;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class RetiraArtigosDaFrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 5: []
//Faça um aplicativo que peça para o usuário digitar uma frase e exiba a frase digitada pelo usuário sem artigos
//(o, a, os, as, um, uma, uns, umas). Faça uma versão utilizando o método split e uma versão utilizando o método
//replace ou replaceAll.

        String frase = JOptionPane.showInputDialog("Informe uma frase", "O menino e a menina viram os livros e as flores perto de um banco, uma árvore, uns pássaros e umas pedras.");
        
        String[] arrayFraseSemArtigo = retiraArtigosUsandoSplit(frase);
        
        JOptionPane.showMessageDialog(null, arrayFraseSemArtigo);
        
        String fraseSemArtigo = retiraArtigosUsandoReplace(frase);
        
        JOptionPane.showMessageDialog(null, fraseSemArtigo);
    }

    public static String[] retiraArtigosUsandoSplit(String frase){
        String[] fraseSemArtigo;
        
        fraseSemArtigo = frase.split("( o | a | os | as | um | uma | uns | umas )");            
        
        return fraseSemArtigo;
    }
    
    public static String retiraArtigosUsandoReplace(String frase){
        String fraseSemArtigo;
        
        fraseSemArtigo = frase.replaceAll("( o | a | os | as | um | uma | uns | umas )", " ");            
        
        return fraseSemArtigo;
    }
}
