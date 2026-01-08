/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package loja;

import loja.automotivo.Pneu;
import loja.automotivo.ProdutoLimpeza;
import loja.bijouteria.Anel;
import loja.bijouteria.Brinco;
import loja.eletronicos.Celular;
import loja.eletronicos.TV;

/**
 *
 * @author Andressa
 */
public class Loja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pneu pneu = new Pneu("a1",19);
        ProdutoLimpeza produtoLimpeza = new ProdutoLimpeza("tipo1", "marca1", 500);
        Anel anel = new Anel("tipoMaterial", 12, 12);
        Brinco brinco = new Brinco("Descricao", "marca2", 600);
        Celular celular = new Celular("marca3", "modelo", 200, 150);
        TV tv = new TV("marca5", "modelo5", 32);
        
        System.out.println(pneu.toString());
        System.out.println(produtoLimpeza.toString());
        System.out.println(anel.toString());
        System.out.println(brinco.toString());
        System.out.println(celular.toString());
        System.out.println(tv.toString());
    }

}
