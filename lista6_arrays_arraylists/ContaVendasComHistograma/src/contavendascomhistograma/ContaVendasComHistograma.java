/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package contavendascomhistograma;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class ContaVendasComHistograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 6: []
//        Faça um programa que receba o valor dos produtos vendidos por um determinado vendedor. O programa deve ler
//        valores até que o valor -1 seja digitado. Os valores podem variar de R$0,00 a R$1499,99. Após ler o valor -1, o
//        programa deve exibir um histograma dos valores vendidos parecido com o apresentado abaixo:
//        [0-300[: **
//        [300-600[: ****
//        [600-900[: *******
//        [900-1200[: **********
//        [1200-1500[: ********
//        O número de “*” corresponde ao número de produtos vendidos em uma determinada faixa de valores.

        Histograma histograma = new Histograma();
        
        histograma.recebeVariasVendas();
        
        JOptionPane.showMessageDialog(null, histograma.toString());

    }
    
    
    public static void mostraHistograma(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
    public static String fazHistograma(ArrayList<Double> vendas){
        return vendas.toString();
    }

}
