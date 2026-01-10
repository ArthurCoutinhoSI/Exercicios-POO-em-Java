/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package guardaultimosdeznumerosnoarray;

import javax.swing.JOptionPane;

/**
 *
 * @author Andressa
 */
public class GuardaUltimosDezNumerosNoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 11: []
//Faça um programa que leia números inteiros digitados pelo usuário até ler o valor -1. O programa sempre deve
//armazenar os 10 últimos números digitados pelo usuário. Após ler o valor -1, o programa deve exibir os últimos 10
//dígitos. Faça duas versões do programa para realizar tal tarefa. Uma utilizando array e outra utilizando ArrayList.
        int[] array = new int[10];
        
        pedeNumerosAteReceberMenosUm(array);
        mostraLista(array);

    }
    
    public static void pedeNumerosAteReceberMenosUm(int[] array){
        int entrada = Integer.parseInt(
                JOptionPane.showInputDialog("Informe um numero inteiro ou informe -1 para encerrar"));
        
        while (entrada != -1) {            
            insereNoFinal(array, entrada);
            entrada = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe um numero inteiro ou informe -1 para encerrar"));
        }
        
    }
    
    public static void insereNoFinal(int[] array, int entrada){
        int i;
        for (i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[i] = entrada;
    }
    
    public static void mostraLista(int[] array){
        String resp = "";
        for (int i : array) {
            resp += i + " ";
        }
        
        
        JOptionPane.showMessageDialog(null, resp);
    }

}
