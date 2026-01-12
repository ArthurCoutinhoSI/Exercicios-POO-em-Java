/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Arthur Coutinho
 */
public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(Proprietario proprietario, double saldo, String tipo) {
        super(proprietario, saldo, tipo);
    }
        
    @Override
    public boolean sacar(double valor) {
        if (!opHabilatada || this.saldo < valor) {
            return false;
        }
        
        this.saldo -= valor;
        return true;
    }

    @Override
    public void atualizar(double taxa) {
        this.saldo *= 2*taxa; 
   }
    
}
