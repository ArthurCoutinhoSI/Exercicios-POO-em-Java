/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package guardaultimosdeznumerosnoarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class GuardaUltimosDezNumerosNoArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
//        Questão 11: []
//Faça um programa que leia números inteiros digitados pelo usuário até ler o valor -1. O programa sempre deve
//armazenar os 10 últimos números digitados pelo usuário. Após ler o valor -1, o programa deve exibir os últimos 10
//dígitos. Faça duas versões do programa para realizar tal tarefa. Uma utilizando array e outra utilizando ArrayList.
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        pedeNumerosAteReceberMenosUm(arrayList);
        mostraLista(arrayList);

    }
    
    public static void pedeNumerosAteReceberMenosUm(ArrayList<Integer> arrayList){
        int entrada = Integer.parseInt(
                JOptionPane.showInputDialog("Informe um numero inteiro ou informe -1 para encerrar"));
        
        while (entrada != -1) {            
            arrayList.addLast(entrada);
            removePrimeiroSeArrayListSizeMaiorQueDez(arrayList);
            entrada = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe um numero inteiro ou informe -1 para encerrar"));
        }
        
    }
    
    public static void removePrimeiroSeArrayListSizeMaiorQueDez(ArrayList<Integer> arrayList){
        if (arrayList.size() > 10 ) {
            arrayList.remove(0);
        }
    }
    
    public static void mostraLista(ArrayList<Integer> arrayList){
        String resp = "";
        
        for (Iterator<Integer> iterator = arrayList.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            resp += next.intValue() + " ";
        }
        
        JOptionPane.showMessageDialog(null, resp);
    }

}
