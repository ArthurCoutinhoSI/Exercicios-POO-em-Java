/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventariodeempresa;

/**
 *
 * @author Arthur Coutinho
 */
public class Produto extends BemMaterial{
    private int qtdEmEstoque;
    private double valorUnitario;

    public Produto(int qtdEmEstoque, double valorUnitario, String descricao) {
        super(descricao);
        this.qtdEmEstoque = qtdEmEstoque;
        this.valorUnitario = valorUnitario;
    }
    
    public double calculaValorDoBem(){    
        return qtdEmEstoque * valorUnitario;
    }
}
