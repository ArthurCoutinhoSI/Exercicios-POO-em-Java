/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trycatchsimplescomarrayindexoutofboundsexception;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class TryCatchSimplesComArrayIndexOutOfBoundsException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 12: []
//Faça um programa que gere um vetor de inteiros de números aleatórios. O tamanho do vetor de inteiros deve ser
//gerado aleatoriamente, mas deve variar entre 1 e 100. Peça repetidamente para o usuário digitar um índice. O
//programa deve então retornar o conteúdo do vetor na posição referente ao índice digitado. Deve-se realizar um
//tratamento de exceção caso o usuário digite um índice fora dos limites do vetor.
        int[] vetor = new int[15];
        preencheVetorAleatoriamenteDeUmACem(vetor);
        
        try{
            mostraPosicaoNoIndiceAteDizerChega(vetor);
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Posicao informada deve ser entre 1 e " + vetor.length);
            mostraPosicaoNoIndiceAteDizerChega(vetor);
        }
    }
    
    public static void preencheVetorAleatoriamenteDeUmACem(int[] vetor){
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(0, 100);
        }
    }
    
    public static void mostraPosicaoNoIndiceAteDizerChega(int[] vetor) throws ArrayIndexOutOfBoundsException{
        String desejaContinuar = "sim";
        while(desejaContinuar.matches("((s|S)im|s|S|ss|SS)")){
            String index = JOptionPane.showInputDialog("informe um local para buscar no vetor alaetorio", "7");
            int i = Integer.parseInt(index) - 1;
            
            if (i < 0 || i > vetor.length - 1) {
                throw new ArrayIndexOutOfBoundsException();
            }
            
            JOptionPane.showMessageDialog(null, "o valor aleatorio presente na posicao " + (i + 1) + " do vetor é: " + vetor[i]);
            
            desejaContinuar = JOptionPane.showInputDialog("Deseja Continuar?", "sim");
        }
    }
    
}
