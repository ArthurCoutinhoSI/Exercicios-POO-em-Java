/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package contaatevintedecincoemcinco;

/**
 *
 * @author Andressa
 */
public class ContaAteVinteDeCincoEmCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        while(i <= 20){
            if (i % 5 == 0) {
                System.out.println(i);
            }else  
                System.out.print(i + ", ");
            i++;
        }
    }

}
