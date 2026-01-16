/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionariosalariototal;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class Funcionario {
    private String nome;
    private double totalVendas;
    private double taxaComissao;//porcentagem

    public Funcionario(String nome, double totalVendas, double taxaComissao) {
        this.nome = nome;
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    public void imprimeSalarioTotal(){
        DecimalFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(2);
        format.setMinimumFractionDigits(2);
        double salarioTotal = (this.totalVendas * (1 + this.taxaComissao));
        
        JOptionPane.showMessageDialog(null, ""
                + format.format(salarioTotal));
    }
    
    public String getNome() {
        return nome;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }
    
    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", totalVendas=" + totalVendas + ", taxaComissao=" + taxaComissao + '}';
    }
    
}
