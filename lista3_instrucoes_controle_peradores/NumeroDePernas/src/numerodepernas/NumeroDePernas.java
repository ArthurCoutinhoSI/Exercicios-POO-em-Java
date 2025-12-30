/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package numerodepernas;

import java.util.Scanner;

/**
 *
 * @author Andressa
 */
public class NumeroDePernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroDePernas;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de pernas de um animal");
        numeroDePernas = scanner.nextInt();
        
        switch (numeroDePernas) {
            case 1:
                System.out.println("Saci");
                break;
            case 2:
                System.out.println("Bípede");
                break;
            case 3:
                System.out.println("Tripé");
                break;
            case 4:
                System.out.println("Quadrúpede");
                break;
            case 8:
                System.out.println("Aranha");
                break;
            default:
                System.out.println("Nao sei");
                break;
        }
    }

}
