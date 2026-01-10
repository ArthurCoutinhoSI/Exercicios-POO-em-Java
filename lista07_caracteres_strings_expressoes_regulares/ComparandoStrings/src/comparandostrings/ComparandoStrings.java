/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package comparandostrings;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class ComparandoStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 3: []
//Escreva um aplicativo que peça para o usuário digitar duas strings. Após isso, informe se as strings são iguais ou
//diferentes, qual string é menor considerando a ordem lexicográfica, qual string é menor considerando o número de
//caracteres e ainda se uma string está contida em outra.
        
        String s1 = new String();
        String s2;
        
        s1 = JOptionPane.showInputDialog("informe uma frase qualquer");
        s2 = JOptionPane.showInputDialog("informe uma outra frase qualquer");
        
        if(s1.equals(s2)){
            JOptionPane.showMessageDialog(null, "As duas frases são iguais");
        }
        
        menorLexicograficamente(s1, s2);
        
        maiorQtdCaracteres(s1, s2);
        
        estaContida(s1, s2);
    }
    
    public static void menorLexicograficamente(String s1, String s2){
        if(s1.compareTo(s2) < 0){
            JOptionPane.showMessageDialog(null, "A frase \""
                    + s1
                    + "\" é menor lexicograficamente");
        }else if(s1.compareTo(s2) > 0){
            JOptionPane.showMessageDialog(null, "A frase \""
                    + s2
                    + "\" é menor lexicograficamente");
        }else
            JOptionPane.showMessageDialog(null, "Ambas as frases tem o mesmo valor lexicografico");
    }
    
    public static void maiorQtdCaracteres(String s1, String s2){
        if(s1.length() > s2.length()){
            JOptionPane.showMessageDialog(null, "A frase \""
                    + s1
                    + "\" é maior em quantidade de caracteres");
        }else if(s1.length() < s2.length()){
            JOptionPane.showMessageDialog(null, "A frase \""
                    + s2
                    + "\" é maior em quantidade de caracteres");
        }else{
            JOptionPane.showMessageDialog(null, "Ambas as frases tem a mesma "
                    + "quantidade de caracteres");
        }
    }
    
    public static void estaContida(String s1, String s2){
        if(s1.contains(s2)){
            JOptionPane.showMessageDialog(null, "\""
                    + s2
                    + "\" está contida em \""
                    + s1
                    + "\"");            
        }else if(s2.contains(s1)){
            JOptionPane.showMessageDialog(null, "\""
                    + s1
                    + "\" está contida em \""
                    + s2
                    + "\"");      
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma das duas frases está contida na outra");
        }
    }
    
}
