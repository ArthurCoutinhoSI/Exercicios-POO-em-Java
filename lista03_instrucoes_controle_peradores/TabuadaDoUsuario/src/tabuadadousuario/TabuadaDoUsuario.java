/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tabuadadousuario;

import java.util.Scanner;

/**
 *
 * @author Arthur Coutinho
 */
public class TabuadaDoUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        String abc;
        int numeroDaTabuada;
        
        System.out.println("Informe a, b ou c");
        abc = scanner.next();
        System.out.println("Informe um numero para ser mostrada a tabuada");
        numeroDaTabuada = scanner.nextInt();
        
        System.out.println(toStringTabuadaEscolhida(abc, numeroDaTabuada));
    }
    
    public static String toStringTabuadaEscolhida (String abc, int numero){
        String resp = "Tabuada do " + numero + "!!\n";
        if ("c".equals(abc)) {
            resp = calcTabuadaComWhile(resp, numero) + "feito com loop Do While";
            return resp;
        }
        if ("b".equals(abc)) {
            resp = calcTabuadaComDoWhile(resp, numero) + "feito com loop While";
            return resp;
        }
        resp = calcTabuadaComFor(resp, numero) + "feito com loop For";//default é feito com for
        return resp;
    }
    
    public static String calcTabuadaComFor(String resp, int numero){
        for(int i = 1; i <= 10; i++){
            resp += i + " * " + numero + " = ";
            resp += i*numero + "\n";
        }
        return resp;
    }
    public static String calcTabuadaComWhile(String resp, int numero){
        int i = 1;
        while(i <= 10){
            resp += i + " * " + numero + " = ";
            resp += i*numero + "\n";
            i++;
        }
        return resp;
    }
    public static String calcTabuadaComDoWhile(String resp, int numero){
        int i = 0;
        do {            
            resp += i + " * " + numero + " = ";
            resp += i*numero + "\n";
            i++;
        } while (i<=10);        
        return resp;
    }

}
