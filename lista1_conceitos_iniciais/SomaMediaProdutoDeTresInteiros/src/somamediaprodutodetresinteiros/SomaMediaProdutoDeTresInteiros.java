/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somamediaprodutodetresinteiros;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class SomaMediaProdutoDeTresInteiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c, soma, produto;
        double media;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("informe 3 inteiros");
        
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        
        soma = a+b+c;
        media = soma/3;
        produto = a*b*c;
        
        System.out.println("soma dos 3 inteiros:" + soma);
        System.out.println("media dos 3 inteiros:" + media);
        System.out.println("produto dos 3 inteiros:" + produto);
    }
}
