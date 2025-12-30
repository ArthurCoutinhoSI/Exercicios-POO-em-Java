/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package quadradodeasterisco;

import java.util.Scanner;

/**
 *
 * @author Andressa
 */
public class QuadradoDeAsterisco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ladoQuadrado;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("informe o tamanho lado do quadrado");
        ladoQuadrado = scanner.nextInt();
        
        System.out.println(toStringQuadradoFeito(ladoQuadrado));
    }
    public static String toStringQuadradoFeito(int tamanhoDoLado){
        String resp = "";
        for (int i = 0; i < tamanhoDoLado; i++) {
            for (int j = 0; j < tamanhoDoLado; j++) {
                if (i == tamanhoDoLado - 1  || i == 0 || j == tamanhoDoLado - 1 || j == 0) {
                    resp += "*";
                }else{
                    resp += " ";
                }
            }
            resp += "\n";
        }
        return resp;
    }
}
