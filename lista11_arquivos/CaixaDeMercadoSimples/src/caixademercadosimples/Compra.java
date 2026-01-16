/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caixademercadosimples;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Coutinho
 */
public class Compra implements Serializable{
    private String descricao;
    private int quantidadeDeItensComprados;
    private double valorUnitario;

    public Compra(String descricao, int quantidadeDeItensComprados, double valorUnitario) {
        this.descricao = descricao;
        this.quantidadeDeItensComprados = quantidadeDeItensComprados;
        this.valorUnitario = valorUnitario;
    }
    
    public static Compra criaCompra(){
        String descricao = JOptionPane.showInputDialog(null, "Informe a descrição do item de compra", "Cadastrar Compra", JOptionPane.PLAIN_MESSAGE);
        
        int quantidadeDeItensComprados = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe a quantidade de itens comprados", "Cadastrar Compra", JOptionPane.PLAIN_MESSAGE));
        
        double valorUnitario = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Informe o valor unitário do item de compra", "Cadastrar Compra", JOptionPane.PLAIN_MESSAGE));
        
        return new Compra(descricao, quantidadeDeItensComprados, valorUnitario);
    }
    
    public double getValorTotal(){
        return valorUnitario * quantidadeDeItensComprados;
    }

    @Override
    public String toString() {
        return "Compra{" + "descricao=" + descricao + ", quantidadeDeItensComprados=" + quantidadeDeItensComprados + ", valorUnitario=" + valorUnitario + '}';
    }
    
    
}
