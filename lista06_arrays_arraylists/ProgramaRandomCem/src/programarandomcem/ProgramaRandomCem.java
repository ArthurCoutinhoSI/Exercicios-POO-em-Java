/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package programarandomcem;

import javax.swing.JOptionPane;

/**
 *
 * @author Andressa
 */
public class ProgramaRandomCem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 10: []
//Faça um programa que gere números inteiros aleatórios entre 0 e 100. Preencha um vetor de inteiros de 50 posições
//com esses número. Após isso, exiba o vetor na tela e peça para o usuário digitar um número inteiro. Verifique se
//esse número inteiro está no vetor. Se sim, informe o usuário que o número que ele digitou está no vetor e qual a
//posição dele no vetor. Se não estiver, exiba uma mensagem informando que o número digitado não se encontra no
//vetor.
        int[] vetor = new int[50];
        
        encheVetorDeNumerosAleatoriosEntreZeroECem(vetor);
        int entrada = Integer.parseInt(recebeNumeroDoUsuario());
        informaUsuarioSeNumeroPresenteNoVetor(vetor, entrada);
        
    }
    
    public static void encheVetorDeNumerosAleatoriosEntreZeroECem(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * 100);
        }
    }
    
    public static String recebeNumeroDoUsuario(){
        return JOptionPane.showInputDialog("Informe um numero inteiro qualquer", "31");
    }
    
    public static void informaUsuarioSeNumeroPresenteNoVetor(int[] vetor, int n){
        int i = buscaNumeroNoVetor(vetor, n);
        if(i == -1){
            JOptionPane.showMessageDialog(null, "numero não existe na lista de 50 numeros aleatórios");
        }else{
            JOptionPane.showMessageDialog(null, "numero presente na lista de 50 numeros aleatórios na posição "
                    + i);
        }
    }
    
    public static int buscaNumeroNoVetor(int[] vetor, int n){
        int i = 0;
        while (vetor[i] != n && i < vetor.length) {            
            i++;
        }
        if(i == vetor.length)
            i = -1;
        return i;
    }

}
