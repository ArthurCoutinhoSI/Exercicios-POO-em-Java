/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package fatorial;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Arthur Coutinho
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um numero para saber o seu fatorial");
        BigInteger fatorial = new BigInteger(scanner.next());
        fatorial = calculaFatorial(fatorial);
        System.out.println(fatorial.toString());
        
    }
    
    public static BigInteger calculaFatorial(BigInteger numero){
        BigInteger fatorial = new BigInteger("1");
        BigInteger i = new BigInteger(numero.toString());
        
        while (i.intValue() > 0) {            
            fatorial = fatorial.multiply(i);
            i = i.subtract(BigInteger.ONE);
        }
        
        return fatorial;
    }

}
