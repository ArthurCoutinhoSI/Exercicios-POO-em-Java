/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package somadoublesarray;

import javax.swing.JOptionPane;

/**
 *
 * @author Andressa
 */
public class SomaDoublesArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
//        Questão 3: []
        //Escreva um aplicativo que utiliza uma instrução for aprimorada para somar os valores do tipo double passados
        //pelos argumentos de linha de comando.
        double[] lista = new double[5];
        
        leVetor(lista);
        JOptionPane.showMessageDialog(null, "" + 
                String.valueOf(somaVetorComForEach(lista)));
    }
    
    public static void leVetor(double[] lista){
        for (int i = 0; i < lista.length; i++) {
            String numero = JOptionPane.showInputDialog("Informe um numero","3.1");
            lista[i] = Double.parseDouble(numero);
        }
//        esse for nao pode ser o for aprimorado pq ele só passa o vetor por copia msm
//        entao não é alterado    
    }
    
    public static double somaVetorComForEach(double[] lista){
        double soma = 0;
        for (double object : lista) {
            soma += object;
        }
        return soma;
    }

}
