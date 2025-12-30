/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package eletronicos;

/**
 *
 * @author Andressa
 */
public class Loja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Celular celular1 = Celular.recebeInformacoesDeCelular();
        Celular celular2 = Celular.recebeInformacoesDeCelular();
        int melhor;
        melhor = celular1.compareTo(celular2);
        
        if (melhor == 1) {
            System.out.println("O celular com maior qualidade eh:\n"
                    + celular1.toString());
            return;
        }
        if (melhor == -1) {
            System.out.println("O celular com maior qualidade eh:\n"
                    + celular2.toString());
        }
        if (melhor == 0) {
            System.out.println("Os celulares sao de qualidade equivalente");
        }
        
    }

}
