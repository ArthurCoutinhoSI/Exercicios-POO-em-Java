/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package quadradodeasterisco;

import java.util.Scanner;

/**
 *
 * @author Arthur Coutinho
 */
public class QuadradoDeAsterisco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("informe o tamanho lado do quadrado");
        Quadrado quadrado = new Quadrado(scanner.nextInt());
        
        System.out.println(quadrado.toStringQuadradoFeito());
    }

}
