/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacomvariavelinteirainterna;

import java.util.Scanner;

/**
 *
 * @author Andressa
 */
public class ComparaComVariavelInteiraInterna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int variavelInterna = 7;
        System.out.println("Informe um número inteiro:");
        int variavelExterna = scanner.nextInt();
        
        if (variavelExterna < variavelInterna) {
            System.out.println("número menor do que o número predefinido");
            return;
        }
        if (variavelExterna == variavelInterna) {
            System.out.println("número igual ao número predefinido");
            return;
        }
        System.out.println("número maior do que o número predefinido");
    }
}
