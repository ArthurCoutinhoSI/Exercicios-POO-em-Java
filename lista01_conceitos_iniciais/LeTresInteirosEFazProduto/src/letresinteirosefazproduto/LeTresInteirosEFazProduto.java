/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package letresinteirosefazproduto;

import java.util.Scanner;

/**
 *
 * @author Arthur Coutinho
 */
public class LeTresInteirosEFazProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int resultado;
        
        resultado = a*b*c;
        
        System.out.println("" + resultado);   
    }
}
