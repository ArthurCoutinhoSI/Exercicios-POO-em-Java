/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package avalianotasdealuno;

import java.util.Scanner;

/**
 *
 * @author Arthur Coutinho
 */
public class AvaliaNotasDeAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3;
        
        System.out.println("Informe as 3 notas do Aluno");
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();
        
        System.out.println(avaliaMedia(mediaDeTresNotas(nota1, nota2, nota3)));
    }
    
    public static double mediaDeTresNotas(double nota1, double nota2, double nota3){
        return (nota1+nota2+nota3)/3;
    }
    
    public static String avaliaMedia(double media){
        String resp = "";
        if(media < 3){
            resp += "beeeem ruim";
            return resp;
        }if(media < 5){
            resp += "Ainda insuficiente";
            return resp;
        }
        if(media < 6){
            resp += "Na traaaave!";
            return resp;
        }else{//despadronizado pq o exercicio pediu pra usar if else if
            if(media < 8){
                resp += "Eh...";
            }else{
                resp += "Boa!!!";
            }
        }
        
        return resp;
    }

}
