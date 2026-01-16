/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package matematicamain;

import java.util.Scanner;

/**
 *
 * @author Arthur Coutinho
 */
public class MatematicaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int escolha;
        Double primeiroValor, segundoValor;
        System.out.println("Informe o tipo de operacao: \n"
                + "multiplicacao \t digite 1\n"
                + "exponenciacao \t digite 2\n"
                + "soma \t\t digite 3\n"
                + "maximo \t\t ditite 4\n"
                + "minimo \t\t digite 5\n");
        escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1:
                solicitaValor();
                primeiroValor = scanner.nextDouble();
                solicitaValor();
                segundoValor = scanner.nextDouble();
                System.out.println(Matematica.multiplica(primeiroValor.doubleValue(), segundoValor.doubleValue()));
                break;
            case 2:
                solicitaValor();
                primeiroValor = scanner.nextDouble();
                solicitaValor();
                segundoValor = scanner.nextDouble();
                System.out.println(Matematica.eleva(primeiroValor.doubleValue(), segundoValor.intValue()));
                break;
            case 3:
                solicitaValor();
                primeiroValor = scanner.nextDouble();
                solicitaValor();
                segundoValor = scanner.nextDouble();
                System.out.println(Matematica.soma(primeiroValor.doubleValue(), segundoValor.doubleValue()));
                break;
            case 4:
                solicitaValor();
                primeiroValor = scanner.nextDouble();
                solicitaValor();
                segundoValor = scanner.nextDouble();
                System.out.println(Matematica.maximo(primeiroValor.doubleValue(), segundoValor.doubleValue()));
                break;
            case 5:
                solicitaValor();
                primeiroValor = scanner.nextDouble();
                solicitaValor();
                segundoValor = scanner.nextDouble();
                System.out.println(Matematica.minimo(primeiroValor.doubleValue(), segundoValor.doubleValue()));
                break;
            default:
                System.err.println("Escolha nao suportada");
        }
    }
    
    public static void solicitaValor(){
        System.out.println("Informe um valor para a operacao");
    }

}
