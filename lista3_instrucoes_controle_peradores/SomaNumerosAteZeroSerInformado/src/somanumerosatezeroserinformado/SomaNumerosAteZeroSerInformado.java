/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package somanumerosatezeroserinformado;

import java.util.Scanner;

/**
 *
 * @author Andressa
 */
public class SomaNumerosAteZeroSerInformado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int entrada = 0;
        
        do {            
            soma += entrada;
            entrada = scanner.nextInt();
            System.out.println(soma);
        } while (entrada != 0);
        
    }

}
