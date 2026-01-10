/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validacaodetelefonergcpf;

import javax.swing.JOptionPane;

/**
 *
 * @author Andressa
 */
public class Pessoa {
    private String nome;
    private String telefone;
    private String cpf;
    private String rg;

    public Pessoa(String nome, String telefone, String cpf, String rg) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", telefone=" + telefone + ", cpf=" + cpf + ", rg=" + rg + '}';
    }
    
}
