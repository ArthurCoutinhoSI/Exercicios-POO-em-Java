/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package somavendasdosvendedores;

/**
 *
 * @author Andressa
 */
public class Vendedor {
    private String nome;
    private double valorTotalVendido = 0;

    public void adicionaVenda(double valor){
        this.valorTotalVendido += valor;
    }
    
    public Vendedor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorTotalVendido() {
        return valorTotalVendido;
    }

    public void setValorTotalVendido(double valorTotalVendido) {
        this.valorTotalVendido = valorTotalVendido;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nome=" + nome + ", valorTotalVendido=" + valorTotalVendido + '}';
    }
    
    
}
