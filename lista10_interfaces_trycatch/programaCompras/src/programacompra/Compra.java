/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacompra;

/**
 *
 * @author Arthur Coutinho
 */
public class Compra {
    private String descricao;
    private int quantidade;
    private double valorUnitario;

    public Compra(String descricao, int quantidade, double valorUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }
    
    public double valorCompra(){
        return quantidade * valorUnitario;                
    }
    
}
