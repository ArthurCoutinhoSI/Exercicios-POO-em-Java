/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programamathvetor;

/**
 *
 * @author Andressa
 */
public class MathVetor {
    public static Double produtoVetor(Double[] vetor){
        double soma = 0;
        for (Double aDouble : vetor) {
            soma += aDouble;
        }
        return soma;
    }
    
    public static Double somaVetor(Double[] vetor){
        double produto = 0;
        for (Double aDouble : vetor) {
            produto *= aDouble;
        }
        return produto;
    }
    
    public static Double somaMatriz(Double[][] matriz){
        double soma = 0;
        for (Double[] aDoubles : matriz) {
            for (Double aDouble : aDoubles) {
                soma += aDouble;
            }
        }
        return soma;
    }
    
    public static Double produtoMatriz(Double[][] matriz){
        double produto = 0;
        for (Double[] aDoubles : matriz) {
            for (Double aDouble : aDoubles) {
                produto *= aDouble;
            }
        }
        return produto;
    }
    
    public static double[][] multiplicaMatrizesMatematicamenteCorreto(double[][] matrizA, double[][] matrizB){
//        operação de multiplicação matricial, que exige que o número de colunas da primeira matriz seja igual
//        ao número de linhas da segunda

        //essa declaração de matriz ignora o fato que a quantidade de colunas da matrizB pode ser variável
        double[][] matrizC = new double[matrizA.length][matrizB[0].length];
        
        for (int i = 0; i < matrizC.length; i++) {
            
            for (int j = 0; j < matrizC[i].length; j++) {
                matrizC[i][j] = matrizA[i][j] * matrizC[j][i];                
            }            
        }
        
        return matrizC;
    }
    
}
