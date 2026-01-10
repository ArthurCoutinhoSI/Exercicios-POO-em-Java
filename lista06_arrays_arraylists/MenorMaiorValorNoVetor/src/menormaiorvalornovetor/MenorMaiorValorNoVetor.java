/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package menormaiorvalornovetor;

import javax.swing.JOptionPane;

/**
 *
 * @author Andressa
 */
public class MenorMaiorValorNoVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 4: []
//        Faça um programa que dado um vetor (de int ou double), apresente o maior e o menor valor encontrado no
//        vetor (o vetor pode ser inicializado com o inicializador de vetores).
    
        int[] vetor = {1,5,2,51,23,12,5346,134,234,34,234,0,4,90};
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        
        for (int i : vetor) {
            if(i > maior){
                maior = i;
            }
            if (i < menor) {
                menor = i;
            }
        }
        
        JOptionPane.showMessageDialog(null, ""
                + "Menor Valor: "
                + menor
                + "\n"
                + "Maior Valor: "
                + maior);
    }

}
