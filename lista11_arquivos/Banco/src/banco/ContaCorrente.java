/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Arthur Coutinho
 */
public class ContaCorrente extends ContaBancaria{

    protected double limite;
    protected double mensalidade;

    public ContaCorrente(double limite, double mensalidade, Proprietario proprietario, double saldo, String tipo) {
        super(proprietario, saldo, tipo);
        this.limite = limite;
        this.mensalidade = mensalidade;
    }

    @Override
    public boolean sacar(double valor) {
        if (!opHabilatada || this.saldo + this.limite < valor) {
            return false;
        }
        
        this.saldo -= valor;
        return true;
    }

    @Override
    public void atualizar(double taxa) {
        this.saldo *= taxa - mensalidade;
    }
    
    public void transferencia(double valor, ContaBancaria recebedor){//pode estar errado
        this.sacar(valor);
        recebedor.depositar(valor);
    }
}
