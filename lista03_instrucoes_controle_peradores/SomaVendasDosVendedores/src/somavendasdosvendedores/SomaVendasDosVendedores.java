/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package somavendasdosvendedores;

import java.util.Scanner;

/**
 *
 * @author Arthur Coutinho
 */
public class SomaVendasDosVendedores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Vendedor vendedor = new Vendedor("");
        
        resetaVendedor(vendedor);
        while (!"sair".equals(vendedor.getNome())) {
            recebeTotalVendido(vendedor);
            System.out.println(vendedor.toString());
            
            resetaVendedor(vendedor);
        }
    }
    
    public static void resetaVendedor(Vendedor vendedor){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome do vendedor "
                + "ou informe \"sair\" para sair");        
        vendedor.setNome(scanner.next());
        vendedor.setValorTotalVendido(0);
    }
    public static void recebeTotalVendido(Vendedor vendedor){
        Scanner scanner = new Scanner(System.in);
        int valorNovo = 0;
        do {
            vendedor.adicionaVenda(valorNovo);
            System.out.println("Informe o valor do produto vendido "
                    + "ou informe -1 para encerrar a soma de produtos vendidos");
            valorNovo = scanner.nextInt();
        } while (valorNovo != -1);
    }
}
