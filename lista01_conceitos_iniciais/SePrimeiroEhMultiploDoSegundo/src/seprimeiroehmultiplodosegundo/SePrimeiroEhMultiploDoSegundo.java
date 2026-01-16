/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seprimeiroehmultiplodosegundo;

import java.util.Scanner;

/**
 *
 * @author Arthur Coutinho
 */
public class SePrimeiroEhMultiploDoSegundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var1, var2;
        int resto;
               
        System.out.println("Informe dois numeros");
        var1 = scanner.nextInt();
        var2 = scanner.nextInt();
        
        resto = var2 % var1;
        System.out.println("" + resto);
        
        if(resto == 0){
            System.out.println("numero " + var2 + " eh multiplo de " + var1);
            return;
        }
        System.out.println("numero " + var2 + " nao eh multiplo de " + var1);
    }
    
}
