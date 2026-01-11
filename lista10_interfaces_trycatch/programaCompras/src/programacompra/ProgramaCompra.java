/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacompra;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class ProgramaCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Compra> compras = new ArrayList<Compra>();
        compras.add(new Compra("aaba5", 2, 30.1));
        compras.add(new Compra("aaba4", 3, 10.9));
        compras.add(new Compra("aaba3", 4, 5.99));
        compras.add(new Compra("aaba2", 1, 50.1));
        compras.add(new Compra("aaba1", 1, 40.5));
        
        exibeValorTotalDaCompra(compras);
    }
    
    public static void exibeValorTotalDaCompra(ArrayList<Compra> compras){
        double soma = 0;
        for (Compra compra : compras) {
            soma += compra.valorCompra();
        }
        JOptionPane.showMessageDialog(null, "Valor total das compras: " + soma);
    }
}
