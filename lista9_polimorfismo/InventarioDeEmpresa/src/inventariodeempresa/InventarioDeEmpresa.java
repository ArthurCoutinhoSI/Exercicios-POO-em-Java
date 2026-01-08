/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventariodeempresa;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class InventarioDeEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Questão 7: []
//Faça um programa para armazenar os bens de uma empresa e calcular o valor total dos bens. Há dois tipos de
//bens: produtos e imóveis. Um produto conterá uma descrição, uma quantidade em estoque e valor unitário. O
//valor total de um produto para fins de cálculo do total de bens é a quantidade em estoque multiplicado pelo
//valor unitário. Já o imóvel tem uma descrição, valor inicial, um ano de construção e uma taxa de depreciação. O
//valor total de um imóvel para fins de cálculo de total de bens é o valor inicial – (valor inicial (ano atual – ano de
//construção) * taxa de depreciação). Formule como devem ser as classes. Faça um programa para armazenar os
//produtos e imóveis e, posteriormente, para apresentar o valor total dos bens. Priorize o uso de polimorfismo se
//possível.
        
        ArrayList<BemMaterial> bens = new ArrayList<BemMaterial>();
        

        String desejaContinuar = "sim";
        while(desejaContinuar.matches("((s|S)im|s|S|1|true|é|É|eh|e|(Y|y)es)")){
            bens.add(solicitaDadosBemMaterial());
            mostraValorTotalDoInventario(bens);
            desejaContinuar = JOptionPane.showInputDialog("Deseja adicionar mais Bens?");            
        }
    }
    
    public static BemMaterial solicitaDadosBemMaterial(){
        String descricao = JOptionPane.showInputDialog("Informe a descrição do bem", "descricao qualquer");
        String bemConfirmTipo = JOptionPane.showInputDialog("O bem é um imóvel?", "sim");
        
        if (bemConfirmTipo.matches("((s|S)im|s|S|1|true|é|É|eh|e|(Y|y)es)")) {
            String valorInicialString = JOptionPane.showInputDialog("informe o valor inicial do imóvel", "200000");
            String anoDeConstrucaoString = JOptionPane.showInputDialog("informe o ano em que foi construido o imóvel", "" + (
                    LocalDate.now().getYear() - 1));
            String taxaDeDepeciacaoString = JOptionPane.showInputDialog("informe a taxa de depreciacao do imóvel", "0.04");
            
            double valorInicial = Double.parseDouble(valorInicialString);
            LocalDate anoDeConstrucao = LocalDate.of(
                    Integer.parseInt(anoDeConstrucaoString), 1, 1);
            double taxaDeDepreciacao = Double.parseDouble(taxaDeDepeciacaoString);
            
            return new Imovel(valorInicial, anoDeConstrucao, taxaDeDepreciacao, descricao);
            
        }else{
            JOptionPane.showMessageDialog(null, "entao é um produto.");
        }
        
        String qtdEmEstoqueString = JOptionPane.showInputDialog("informe a quantidade em estoque do produto", "50");
        String valorUnitarioString = JOptionPane.showInputDialog("informe o valor unitario do produto", "15");
        int qtdEmEstoque = Integer.parseInt(qtdEmEstoqueString);
        double valorUnitario = Double.parseDouble(valorUnitarioString);
        
        return new Produto(qtdEmEstoque, valorUnitario, descricao);
    }
    
    public static void mostraValorTotalDoInventario(ArrayList<BemMaterial> bens){
        double inventario = 0;
        for (BemMaterial bem : bens) {
            inventario += bem.calculaValorDoBem();
        }
        JOptionPane.showMessageDialog(null, "Valor total de Bens:\n"
                + inventario);
    }
}
