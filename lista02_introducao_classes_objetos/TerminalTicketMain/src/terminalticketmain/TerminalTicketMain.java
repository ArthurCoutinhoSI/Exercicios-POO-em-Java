/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package terminalticketmain;

import java.util.Scanner;

/**
 *
 * @author Arthur Coutinho
 */
public class TerminalTicketMain {
    public static void main(String[] args) {
        TerminalTicket terminalTrem = new TerminalTicket(10, "Trem");
        TerminalTicket terminalOnibus = new TerminalTicket(5, "Obibus");
        int escolha;
        double dinheiro;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Terminais Disponiveis:\n"
                + terminalOnibus.toString()
                        + "\t digite 1" + "\n" 
                + terminalTrem.toString()
                        + "\t digite 2" + "\n"
                + "Escolha um terminal" + "\n");
        escolha = scanner.nextInt();
        
        
        if(escolha == 1){
            System.out.println("Informe o dinheiro à inserir na máquina de tickets");
            dinheiro = scanner.nextDouble();
            terminalOnibus.inserirDinheiro(dinheiro);
        }
        if(escolha == 2){
            System.out.println("Informe o dinheiro à inserir na máquina de tickets");
            dinheiro = scanner.nextDouble();
           terminalTrem.inserirDinheiro(dinheiro); 
        }
        if (escolha != 1 && escolha != 2)
            System.out.println("Numero informado eh inválido");
    }
}
