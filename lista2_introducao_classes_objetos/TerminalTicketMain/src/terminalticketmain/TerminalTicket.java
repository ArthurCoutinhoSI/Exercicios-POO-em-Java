/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terminalticketmain;

/**
 *
 * @author Andressa
 */
public class TerminalTicket {
    private double valor;
    private String nome;

    public TerminalTicket(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }
    
    public void inserirDinheiro(double dinheiro){
        if(dinheiro < getValor()){
            System.out.println("Ticket nao gerado devido a valor insuficiente");
            return;
        }
        
        System.out.println(toString()
                + "troco: "
                + (dinheiro - getValor()));
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "TerminalTicket{" + "valor=" + valor + ", nome=" + nome + '}';
    }
}
