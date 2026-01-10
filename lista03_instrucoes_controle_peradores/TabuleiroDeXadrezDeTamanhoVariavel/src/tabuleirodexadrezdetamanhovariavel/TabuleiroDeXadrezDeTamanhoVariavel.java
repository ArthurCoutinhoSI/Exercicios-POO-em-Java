/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tabuleirodexadrezdetamanhovariavel;

import java.util.Scanner;

/**
 *
 * @author Andressa
 */
public class TabuleiroDeXadrezDeTamanhoVariavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o tamanho do tabuleiro");
        TabuleiroXadrez tabuleiro = new TabuleiroXadrez(scanner.nextInt());
        
        System.out.println(tabuleiro.toStringLiteral());
    }

}
