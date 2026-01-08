/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package palindromo;

import java.util.Scanner;

/**
 *
 * @author Andressa
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String supostoPalindromo;
        
        System.out.println("Informe um palindromo");
        supostoPalindromo = in.next();
        
        if(verificaSePalindromo(supostoPalindromo)){
            System.out.println("EH PALINDROMO!!!!");
        }else{
            System.out.println("nao eh palindromo (AFF)");
        }
    }
    
    public static boolean verificaSePalindromo(String supostoPalindromo){
        int comprimentoDaPalavra = supostoPalindromo.length();
        int i = 0;
//        System.out.println(comprimentoDaPalavra);
        while(i < comprimentoDaPalavra/2
                && supostoPalindromo.charAt(i)
                == supostoPalindromo.charAt((comprimentoDaPalavra-1) - i)){
            i++;
        }
//        System.out.println(i);;
        if(i == comprimentoDaPalavra/2)
            return true;
        return false;
    }
    
}
